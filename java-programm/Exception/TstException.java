class TstException 
{
    public static void main(String[] args)
    {
        
        try{
        Y y = new Y();
                y.add();
        }catch(Exception e)
        {
            System.out.println("ERROR :: " + e);
        }
        System.out.println("YEAHH CATCHED >>");
    }
}

class X
{
    public void add() throws ArithmeticException
    {
        System.out.println("ARITHMATIC>>>");
    }
}

class Y extends X
{
    public void add() throws NullPointerException
    {
        // int x = 5;
        // int y = x/0;
        String a = null;
        int x = a.length();
        System.out.println("NULL POINTER EXCEPTION >>");

    }
}