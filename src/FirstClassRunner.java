public class FirstClassRunner 
{
    public static void main(String[] args)
    {
        FirstClass fc = new FirstClass(12, 5);
        int sum = fc.add();
        System.out.println(sum);
        int product = fc.multiply();
        System.out.println(product);
    }
    
}