import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FibonacciCalculator 
{
    public static void main(String args[])
    {
        System.out.println("Fibonacci..!!!");
        FibonacciCalculator fc = new FibonacciCalculator();
        // System.out.println(fc.fibonacci2(10) + ", ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        for(int i=1; i<=number; i++){
            System.out.print(fc.fibonacci2(i) +" ");
        }

        fc.readFileByScanner();
    }

    
public int fibonacci(int n)
{
    if(n == 1 || n== 2)
    {
        return 1;
    }
    return fibonacci(n-1) + fibonacci(n - 2);
}


public int fibonacci2(int n)
{
    if(n == 1 || n== 2)
    {
        return 1;
    }
    int n1 = 1, n2 =1, sum = 1;

    for(int i = 3; i<=n; i++)
    {
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
    }

    return sum;
}

public void readFileByScanner()
{
    try {
        File f = new File("E:/Repository/Task1/Star/Pattern/radhika.txt");
        Scanner sc = new Scanner(f);
    while(sc.hasNext())
    {
        System.out.println(sc.next());
    }

    } catch (Exception e) {
        //TODO: handle exception
    }
    

    
}

}