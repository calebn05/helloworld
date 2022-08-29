public class CalculatorRunner 
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.add(8);
        calc.multiply(20);
        calc.subtract(100);
        calc.divide(40);
        int total = calc.getTotal();
        System.out.println(total);
    }    
}
