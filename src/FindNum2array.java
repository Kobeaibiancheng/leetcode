public class FindNum2array {
    public static boolean find(int[][] array,int rows,int cols,int number) {
        Boolean found = false;

        if (array != null && rows > 0 && cols > 0) {
            int row = 0;
            int col = cols-1;
            while (row < rows && col >= 0) {
                if (array[row][col] == number) {
                    found = true;
                    break;
                }else if (array[row][col] > number) {
                    col--;
                }else if (array[row][col] < number){
                    row++;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(array, 4, 4,7));
    }
}
