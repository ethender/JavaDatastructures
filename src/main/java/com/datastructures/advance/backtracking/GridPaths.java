package com.datastructures.advance.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridPaths {

    public List<List<int[]>> findAllPaths(int rows, int cols) {
        List<List<int[]>> allPaths = new ArrayList<>();
        List<int[]> currentPath = new ArrayList<>();

        currentPath.add(new int[]{0,0});
        backTrack(0,0,rows,cols,currentPath,allPaths);
        return allPaths;
    }


    private void backTrack(int row, int col, int rows, int cols, List<int[]> currentPath, List<List<int[]>> allPaths) {
        // Base case
        if (row == rows-1 && col == cols-1) {
            List<int[]> pathCopy = new ArrayList<>();
            for(int[] path: currentPath) {
                pathCopy.add(new int[]{path[0], path[1]});
            }
            allPaths.add(pathCopy);
            return;
        }

        int[][] directions = {{1,0},{0,1}};
        for(int[] direction: directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if(newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) {
                continue;
            }

            // choose
            currentPath.add(new int[]{newRow, newCol});
            //backtrack
            backTrack(newRow, newCol, rows, cols, currentPath, allPaths);
            // undo
            currentPath.remove(currentPath.size()-1);
        }
    }


    public static void main(String[] args) {
        GridPaths gridPaths = new GridPaths();

        List<List<int[]>> allPaths = gridPaths.findAllPaths(2 ,2);
        for(List<int[]> path: allPaths) {
            for(int[] pathArray: path) {
                System.out.println("X: "+pathArray[0]+", Y: "+pathArray[1]);
            }
        }
    }

}
