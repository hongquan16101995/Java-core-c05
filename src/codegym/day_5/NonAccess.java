package codegym.day_5;

public class NonAccess {
    //non-access:

    public final int number = 100;
    public final int[] numbers = {1,2,3};

    public static void main(String[] args) {
        NonAccess nonAccess = new NonAccess();
        System.out.println(nonAccess.number);
        System.out.println(nonAccess.numbers[0]);

//        nonAccess.number = 1000;
        nonAccess.numbers[0] = 1000;
        System.out.println(nonAccess.numbers[0]);
//        nonAccess.numbers = new int[]{4,5,6};
    }
}
