public class ArrayResizer{
    private int[][] array2;
    public static boolean isNonZeroRow(int[][] array2D, int r){
        for(int col = 0; col<array2D[0].length;col++){
            if(array2D[r][col] == 0) return false;
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int num = 0;
        for(int i = 0; i<array2D.length;i++){
            if(isNonZeroRow(array2D, i) == true){
                num++;
            }
        }
        return num;
    }
    
    public static int[][] resize(int[][] array2D) {
        int rowNum = 0;
        int[][] array2 = new int[numNonZeroRows(array2D)][array2D[0].length];        
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                for (int j = 0; j < array2D[i].length; j++) {
                    array2[rowNum][j] = array2D[i][j];
                }
                rowNum++;
            }
        }
        return array2;
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                s += array2[i][j] + " ";  
            }
            s += "\n";  
        }
        return s;
    }
}