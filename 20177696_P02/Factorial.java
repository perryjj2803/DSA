import java.util.*;

class Factorial 
{
    public static void main(String[] args)
    {
        int min = 1;
        int max = 2;
        long facNumber = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please select which formula to use");
        System.out.println("1 - Iterative formula");
        System.out.println("2 - Recursive formula");
        int formulaToUse = input.nextInt();
        if (formulaToUse > max || formulaToUse < min)
        {
            throw new IllegalArgumentException("Must_select_either_1_or_2");
        }

        System.out.println("Please enter Factorial number");
        int userInt = input.nextInt();
        if(userInt < 0)
        {
            throw new IllegalArgumentException("Number_cannot_be_negative");
        }

        switch (formulaToUse)
        {
            case 1: facNumber = iterativeCalcNFactorial(userInt);
            break;

            case 2: facNumber = recursiveCalcNFactorial(userInt);
            break;
        } 

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

    public static long recursiveCalcNFactorial(int n)
    {
        long Factorial;
        if (n == 0)
        {
            Factorial = 1;
        }
        else
        {
            Factorial = n * recursiveCalcNFactorial(n-1);
        }
        return Factorial;
    }
}
