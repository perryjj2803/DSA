import java.util.*;

class iterativeFactorial 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Factorial number");
        int userInt = input.nextInt();
        long facNumber = iterativeCalcNFactorial(userInt);
        System.out.println("The number is " + facNumber);
    }
    public static long iterativeCalcNFactorial(int n)
    {   
        long nFactorial = 1;
        for(int ii = n; ii >= 2; ii--)
        {
            nFactorial *= ii;
        }
        return nFactorial;
    }
}
