/*
3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 */
public class FindNumbers {

    public boolean findNumbersInArray(int[] arr, int numberOne, int numberTwo){
        int countNumberOne = 0;
        int countNumberTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == numberOne){
                countNumberOne++;
            } else if (arr[i] == numberTwo){
                countNumberTwo++;
            }
        }
        return (countNumberOne > 0 && countNumberTwo > 0);
    }

    public static void main(String[] args) {
        int NUMBER_FIND_ONE = 1;  //числа для поиска в массиве
        int NUMBER_FIND_TWO = 4;
        int[] arr1 = {1, 1, 4, 4, 1, 1, 4, 1, 4};
        int[] arr2 = {1, 1, 4, 1, 1, 4, 1, 4, 1};
        int[] arr3 = {4, 4, 4, 4};
        int[] arr4 = {1, 1, 1, 1};
        FindNumbers findNumbers = new FindNumbers();
        System.out.println(findNumbers.findNumbersInArray(arr1, NUMBER_FIND_ONE, NUMBER_FIND_TWO));
        System.out.println(findNumbers.findNumbersInArray(arr2, NUMBER_FIND_ONE, NUMBER_FIND_TWO));
        System.out.println(findNumbers.findNumbersInArray(arr3, NUMBER_FIND_ONE, NUMBER_FIND_TWO));
        System.out.println(findNumbers.findNumbersInArray(arr4, NUMBER_FIND_ONE, NUMBER_FIND_TWO));


    }
}
