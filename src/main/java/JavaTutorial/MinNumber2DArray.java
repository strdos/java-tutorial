package JavaTutorial;

public class MinNumber2DArray {
    public static void main(String[] args) {
        int[][] array = {{2,4,-5},{-4,6,9}, {3,5,10}};
        System.out.println(getMinValue(array));
        System.out.println(getMaxValueOfColumnWithMinNumber(array));
    }
    public static int getMinValue (int[][] array) {
        int minValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (minValue > array[i][j]) {
                    minValue = array[i][j];
                }
            }
        }
        return minValue;
    }
    public static int getMaxValueOfColumnWithMinNumber(int[][] array) {
        // find min number
        // find column with min number
        // find max number in column with min number

        int minValue = array[0][0];
        int minValueColumn = 0;
        int maxValueOfColumnWithMinNumber = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (minValue > array[i][j]) {
                    minValue = array[i][j];
                    minValueColumn = j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxValueOfColumnWithMinNumber < array[i][minValueColumn]) {
                maxValueOfColumnWithMinNumber = array[i][minValueColumn];
            }
        }
        return maxValueOfColumnWithMinNumber;
    }
}
