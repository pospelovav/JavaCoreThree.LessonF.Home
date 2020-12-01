public class NumberNotFoundException extends RuntimeException{      //исключения, если в массиве нет заданного числа
    private int number;
    private int[] arr;
    public NumberNotFoundException(String message, int num, int[] arr){
        super(message);
        number=num;
        this.arr = arr;
    }
}
