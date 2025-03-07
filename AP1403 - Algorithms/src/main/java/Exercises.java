public class Exercises {

    /*
        there is an array of positive integers as input of function and another integer for the target value
        all the algorithm should do is to find those two integers in array which their multiplication is the target
        then it should return an array of their indices
        e.g. {1, 2, 3, 4} with target of 8 -> {1, 3}

        note: you should return the indices in ascending order and every array's solution is unique
    */
    public int[] productIndices(int[] values, int target) {
        int[] indices = new int[2];
        for(int i =0;i<values.length;i++){
            for(int j =i;j<values.length;j++){
                if(values[i] * values[j] == target){
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            } 
        }
        return indices;
    }

    /*
        given a matrix of random integers, you should do spiral traversal in it
        e.g. if the matrix is as shown below:
        1 2 3
        4 5 6
        7 8 9
        then the spiral traversal of that is:
        {1, 2, 3, 6, 9, 8, 7, 4, 5}

        so you should walk in that matrix in a curl and then add the numbers in order you've seen them in a 1D array
    */
    public int[] spiralTraversal(int[][] matrix, int rows, int cols) {

        int[] result = new int[rows * cols];
        boolean[][] visited = new boolean[rows][cols]; 
        int[] rowDirection = {0, 1, 0, -1};
        int[] colDirection = {1, 0, -1, 0}; 
        int row = 0, col = 0, direction = 0; 
        for (int i = 0; i < rows * cols; i++) {
            result[i] = matrix[row][col];
            visited[row][col] = true;
            int nextRow = row + rowDirection[direction];
            int nextCol = col + colDirection[direction];
            if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols && !visited[nextRow][nextCol]) {
                row = nextRow;
                col = nextCol;
            } else { 
                direction = (direction + 1) % 4;
                row += rowDirection[direction];
                col += colDirection[direction];
            }
        }
        return result;
    }    
    /*
        integer partitioning is a combinatorics problem in discreet maths
        the problem is to generate sum numbers which their summation is the input number

        e.g. 1 -> all partitions of integer 3 are:
        3
        2, 1
        1, 1, 1

        e.g. 2 -> for number 4 goes as:
        4
        3, 1
        2, 2
        2, 1, 1
        1, 1, 1, 1

        note: as you can see in examples, we want to generate distinct summations, which means 1, 2 and 2, 1 are no different
        you should generate all partitions of the input number and

        hint: you can measure the size and order of arrays by finding the pattern of partitions and their number
        trust me, that one's fun and easy :)

        if you're familiar with lists and arraylists, you can also edit method's body to use them instead of array
    */
    public int[][] intPartitions(int n) {
        // todo
        return null;
    }

    public static void main(String[] args) {
        // you can test your code here
    }
}
