import java.util.Arrays;

public class AfterNumberArray {
    public int[] afterNumberArray (int[] arr, int number){         //новый массив, который получен путем вытаскивания из исходного массива элементов,
        if (!notNumber(arr, number)){                            //идущих после последнего заданного числа
            throw new NumberNotFoundException("Number: " + number + " not found in array: " + Arrays.toString(arr), number, arr);
        }
        return Arrays.copyOfRange(arr, findLastNumber(arr, number) + 1, arr.length);
    }

    public static boolean notNumber (int[] arr, int number){          //поиск заданного числа в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }

    public static int findLastNumber (int[] arr, int number){         //поиск индекса последнего заданного числа в массиве
        int indexLastNumber = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                indexLastNumber = i;
            }
        }
        return indexLastNumber;
    }

    public static void main (String[] args){
        int NUMBER_POINT = 4; //число для создания новго массива
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 2, 5, 7, 2, 3, 1, 1, 7};
        AfterNumberArray arrAfter = new AfterNumberArray();

        try {
            System.out.println(Arrays.toString(arrAfter.afterNumberArray(arr1, NUMBER_POINT)));
//            System.out.println(Arrays.toString(arrAfter.afterNumberArray(arr2, NUMBER_POINT)));
        } catch (NumberNotFoundException e){
            System.out.println(e.getMessage());
        }

    }

    class NumberNotFoundException extends RuntimeException{      //исключения, если в массиве нет заданного числа
        private int number;
        private int[] arr;
        public NumberNotFoundException(String message, int num, int[] arr){
            super(message);
            number=num;
            this.arr = arr;
        }
    }
}
