public class FirstClass 
{
    //These are instance variables
    //They are where the data in a class is stored
    //They area always private
    private int firstNum;
    private int secondNum;
    //This is a constructor
    //The role of a constructor is to intialize instance variables
    //There should be on parameter for each instance variable
    public FirstClass(int firstNum, int secondNum)
    {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public int add()
    {
        return firstNum + secondNum;
    }      
    public int multiply()
    {
        return firstNum * secondNum;
    }

}