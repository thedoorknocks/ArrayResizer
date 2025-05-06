public class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 1, 0},
            {1, 3, 2},
            {0, 0, 0},
            {4, 5, 6}
        };

        System.out.println(ArrayResizer.isNonZeroRow(arr, 0)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 1)); // true
        System.out.println(ArrayResizer.isNonZeroRow(arr, 2)); // false
        System.out.println(ArrayResizer.isNonZeroRow(arr, 3)); // true

        System.out.println(ArrayResizer.numNonZeroRows(arr)); // 2

        int[][] resizedArray = ArrayResizer.resize(arr);
        for (int i = 0; i < resizedArray.length; i++) {
            for (int j = 0; j < resizedArray[i].length; j++) {
                System.out.print(resizedArray[i][j] + " "); 
            }
            System.out.println();  
        }
    }
}
