import java.util.*;

class GCN
{
    public static void main(String[] args)   
    {  
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int numOne = input.nextInt();
        System.out.println("Please enter second number: ");
        int numTwo = input.nextInt();

        int HCD = greatestCommonDenominator(numOne, numTwo);
        System.out.println("Greatest common denominator is " + HCD);
    }
    public static int greatestCommonDenominator(int numOne, int numTwo)
    {
        int result;
        if(numTwo != 0)
        {
            result = greatestCommonDenominator(numTwo, numOne % numTwo);    
        }
        else
        {
            result = numOne;
        }
        return result;
    }
}


    