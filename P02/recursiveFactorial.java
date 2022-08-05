public long recursiveCalcNFactorial(int n)
{
    long Factorial;
    if (n == 0)
    {
        Factorial = 1;
    }
    else
    {
        Factorial = n * calcNFactorialRecursive(n-1);
    }
    return Factorial;
}