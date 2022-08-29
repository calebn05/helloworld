import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String greeting = "Hello sir";
        System.out.println("Who is you");
        String name = input.next();
        String str = greeting + " " + name;
        System.out.println(str); 
        input.close();
        int length = str.length();
        System.out.println(str + " has " + length + " characters ");
    }
}