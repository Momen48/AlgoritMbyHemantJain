public class Ex_1_5 {
    private static class MyInt
{
    int value;
};
    public static void increment(MyInt value)
    {
        (value.value)++;
    }
    public static void main(String[] args)
    {
        MyInt x = new MyInt();
        x.value = 10;
        System.out.println("Value of i before increment is: "+ x.value);
        increment(x);
        System.out.println("Value of i after increment is: "+ x.value);
    }

}
