class ExceptionTest
{
    public static void main(String args[]){

        try {
            ExceptionTest2 e = new ExceptionTest2();
            e.abc();
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}

class ExceptionTest1{
    public void abc() throws RuntimeException
    {
        String a = null;
        
        System.out.println("EXception");
        a.length();
    }
}

class ExceptionTest2 extends ExceptionTest1
{
    public void abc() throws Exception
    {
        
        System.out.println("Runtime Exception");
        int a = 10/0;
    }
}

