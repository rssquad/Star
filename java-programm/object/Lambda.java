class Lambda
{
    // EX. 1
    public void m1()
    {
        System.out.println("HELLOW");
    } // This function implementation using Lambda expression below

    () -> { System.out.println("Hellloww.. !! Using Lambda"); }


    // Ex. 2

    public void m1(int a , int b)
    {
        System.out.println(a + b);
    }// This function implementation using Lambda expression below

    (int a, int b) -> {System.out.println(a+b);}

    // Ex. 3
    public int squareIt(int n)
    {
       return n*n;
    }// This function implementation using Lambda expression below

    (n) -> {return n*n;}  OR IT Could be (n) -> n*n;

    // EX. 4

    public int m1(String s)
    {
        return s.length();
    }// This function implementation using Lambda expression below

    (String s) - > s.length();
}