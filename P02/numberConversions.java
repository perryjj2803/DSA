import java.util.*;

class numberConversions
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base 10 number to convert ");
        int num = input.nextInt();
        System.out.println("What base system converting to? enter number between 2 and 12 inclusive ");
        int conversionBase = input.nextInt();
        String result = baseConversion(num, conversionBase);
        System.out.println("Result is " + result );
    }

    public static String baseConversion(int num, int conversionBase)
    {
        int result = num / conversionBase;
        int remainder = num % conversionBase;
        String conversionResult;

        if(result == 0)
        {
            conversionResult = Integer.toString(remainder);
        }
        else
        {
            conversionResult = baseConversion(result, conversionBase) + Integer.toString(remainder);
        }
        return conversionResult;
    }
        
}