import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SandSort {
    // Function to configure the grid
    static ArrayList<String> configureGrid(String[] stacks, int numberOfStacks) {
        ArrayList<String> grid = new ArrayList<>();
        for (int i = 0; i < numberOfStacks; i++)
            grid.add(stacks[i]);
        return grid;
    }

    // Function to find the max
    static int getStackHeight(ArrayList<String> grid) {
        int max = 0;
        for (String stack : grid)
            if (max < stack.length())
                max = stack.length();
        return max;
    }

    // Convert ArrayList of strings to canonicalRepresentation of strings
    static String canonicalStringConversion(ArrayList<String> grid) {
        Collections.sort(grid);
        StringBuilder finalString = new StringBuilder();
        for (String stack : grid) {
            finalString.append(stack).append(";");
        }
        return finalString.toString();
    }

    // Function to check if it is solved or not
    static boolean isSolved(ArrayList<String> grid, int stackHeight) {
        for (String stack : grid) {
            if (stack.length() == 0)
                continue;
            else if (stack.length() < stackHeight)
                return false;
            else if (Collections.frequency(Arrays.asList(stack.split("")),
                    String.valueOf(stack.charAt(0))) != stackHeight)
                return false;
        }
        return true;
    }

    // Check if the move is valid
    static boolean isValidMove(String sourceStack, String destinationStack, int height) {
        // Can't move from an empty stack or to a FULL STACK
        if (sourceStack.length() == 0 || destinationStack.length() == height)
            return false;

        int colorFreqs = Collections.frequency(Arrays.asList(sourceStack.split("")),
                String.valueOf(sourceStack.charAt(0)));

        // If the source stack is same colored, don't touch it
        if (colorFreqs == height)
            return false;

        if (destinationStack.length() == 0) {
            // If source stack has only same colored balls, don't touch it
            if (colorFreqs == sourceStack.length())
                return false;
            return true;
        }
        return (sourceStack.charAt(sourceStack.length() - 1) == destinationStack
                .charAt(destinationStack.length() - 1));
    }

    // Function to solve the puzzle
    static boolean solvePuzzle(ArrayList<String> grid, int stackHeight, HashSet<String> visited,
            ArrayList<ArrayList<Integer>> answerMod) {
        if (stackHeight == -1) {
            stackHeight = getStackHeight(grid);
        }
        visited.add(canonicalStringConversion(grid));

        for (int i = 0; i < grid.size(); i++) {
            // Iterate over all the stacks
            String sourceStack = grid.get(i);
            if (sourceStack.isEmpty())
                continue;

            for (int j = 0; j < grid.size(); j++) {
                if (i == j)
                    continue;
                String destinationStack = grid.get(j);
                if (isValidMove(sourceStack, destinationStack, stackHeight)) {
                    // Creating a new Grid with the valid move
                    ArrayList<String> newGrid = new ArrayList<>(grid);

                    // Adding the ball
                    newGrid.set(j, newGrid.get(j) + newGrid.get(i).charAt(newGrid.get(i).length() - 1));

                    // Removing the ball
                    newGrid.set(i, newGrid.get(i).substring(0, newGrid.get(i).length() - 1));
                    if (isSolved(newGrid, stackHeight)) {
                        answerMod.add(new ArrayList<>(Arrays.asList(i, j, 1)));
                        return true;
                    }
                    if (!visited.contains(canonicalStringConversion(newGrid))) {
                        boolean solveForTheRest = solvePuzzle(newGrid, stackHeight, visited, answerMod);
                        if (solveForTheRest) {
                            ArrayList<Integer> lastMove = answerMod.get(answerMod.size() - 1);

                            // Optimisation - Concatenating consecutive moves of the same ball
                            if (lastMove.get(0) == i && lastMove.get(1) == j)
                                answerMod.get(answerMod.size() - 1).set(2,
                                        answerMod.get(answerMod.size() - 1).get(2) + 1);
                            else
                                answerMod.add(new ArrayList<>(Arrays.asList(i, j, 1)));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // Checks whether the grid is valid or not
    static boolean checkGrid(ArrayList<String> grid) {
        int numberOfStacks = grid.size();
        int stackHeight = getStackHeight(grid);
        int numBallsExpected = ((numberOfStacks - 2) * stackHeight); // Cause 2 empty stacks
        int numBalls = 0;

        for (String i : grid)
            numBalls += i.length();
        if (numBalls != numBallsExpected) {
            System.out.println("Grid has incorrect # of balls");
            return false;
        }
        HashMap<Character, Integer> ballColorFrequency = new HashMap<>();
        for (String stack : grid)
            for (char ball : stack.toCharArray())
                ballColorFrequency.put(ball, ballColorFrequency.getOrDefault(ball, 0) + 1);
        for (Map.Entry<Character, Integer> ballColor : ballColorFrequency.entrySet()) {
            if (ballColor.getValue() != getStackHeight(grid)) {
                System.out.println("Color " + ballColor.getKey() + " is not " + getStackHeight(grid));
                return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String[] args) {
        // Including 2 empty stacks
        int numberOfStacks = 6;
        String[] stacks = { "gbbb", "ybry", "yggy", "rrrg", "", "" };

        ArrayList<String> grid = configureGrid(stacks, numberOfStacks);
        if (!checkGrid(grid)) {
            System.out.println("Invalid Grid");
            return;
        }
        if (isSolved(grid, getStackHeight(grid))) {
            System.out.println("Problem is already solved");
            return;
        }
        HashSet<String> visited = new HashSet<>();
        ArrayList<ArrayList<Integer>> answerMod = new ArrayList<>();

        // Solve the puzzle instance
        solvePuzzle(grid, getStackHeight(grid), visited, answerMod);

        // Since the values of Answers are appended when the problem was completely
        // solved and backwards from there
        Collections.reverse(answerMod);

        for (ArrayList<Integer> v : answerMod) {
            System.out.println("Move " + (v.get(0) + 1) + " to " + (v.get(1) + 1) + " " + v.get(2) + " times");
        }
    }
}
