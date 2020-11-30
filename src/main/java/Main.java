import java.util.Arrays;

public class Main {

    public static final int NUMBER_POINT = 4;

    public static int[] afterFour (int[] arr){
        if (!notFour(arr)){
            throw new NumberNotFoundException("Number: " + NUMBER_POINT + " not found in array: " + Arrays.toString(arr), NUMBER_POINT, arr);
        }
        int[] arrAfterFour = Arrays.copyOfRange(arr, findLastFour(arr) + 1, arr.length);
        return arrAfterFour;
    }

    public static boolean notFour (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == NUMBER_POINT){
                return true;
            }
        }
        return false;
    }

    public static int findLastFour (int[] arr){
        int indexLastFour = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == NUMBER_POINT){
                indexLastFour = i;
            }
        }
        return indexLastFour;
    }

    public static void main (String[] args){
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 2, 5, 7, 2, 3, 1, 1, 7};
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(notFour(arr1));
//        System.out.println(notFour(arr2));
//        System.out.println(findLastFour(arr1));
//        System.out.println(findLastFour(arr2));
//        int[] copyArr
        try {
            System.out.println(Arrays.toString(afterFour(arr1)));
        } catch (NumberNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    static class NumberNotFoundException extends RuntimeException{

        private int number;
        private int[] arr;

        public NumberNotFoundException(String message, int num, int[] arr){
            super(message);
            number=num;
            this.arr = arr;
        }
    }
}

