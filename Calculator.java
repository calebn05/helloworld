public class Calculator 
{
    //This is an instance variable - They always go at the top of a class
    private int total;

    //This is a constructor
    public Calculator()
    {
        this.total = 0;
    }
    //This is also a constructor
    public Calculator(int total)
    {
        this.total = total;
    }
    //These are methods
    public void add(int num)
    {
        this.total += num;
    }
    public int getTotal()
    {
        return this.total;
    }
    public void multiply(int num)
    {
        this.total *= num;
    }
    public void subtract(int num)
    {
        this.total -= num;
    }
    public void divide(int num)
    {
        this.total /= num;
    }
}
