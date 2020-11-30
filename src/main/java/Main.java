/*
2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
3. Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */
import java.util.Arrays;

public class Main {

    public int[] afterNumberArray (int[] arr, int number){         //новый массив, который получен путем вытаскивания из исходного массива элементов,
        if (!notNumber(arr, number)){                            //идущих после последнего заданного числа
            throw new NumberNotFoundException("Number: " + number + " not found in array: " + Arrays.toString(arr), number, arr);
        }
        int[] afterNumberArray = Arrays.copyOfRange(arr, findLastNumber(arr, number) + 1, arr.length);
        return afterNumberArray;
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
        int NUMBER_POINT = 4; //число дл я создания новго массива
        int[] arr1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr2 = {1, 2, 5, 7, 2, 3, 1, 1, 7};
        Main main1 = new Main();
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(notFour(arr1));
//        System.out.println(notFour(arr2));
//        System.out.println(findLastFour(arr1));
//        System.out.println(findLastFour(arr2));
//        int[] copyArr
        try {
            System.out.println(Arrays.toString(main1.afterNumberArray(arr1, NUMBER_POINT)));
//            System.out.println(Arrays.toString(afterNumberArray(arr2, NUMBER_POINT)));
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

