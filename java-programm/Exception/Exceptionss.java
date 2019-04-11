import java.io.IOException;
import java.lang.*;
class Exceptionss
{
    public static void main(String args[])
    {
        Exceptionss e = new Exceptionss();
        e.checkedExceptionTestForNullPoint();
    }

    public void checkedExceptionTestForNullPoint()
    {
            try{
                String s = null;
                s.length();

                // int m = 30/0;  Arithmatic exception; 

                /* String t="abc";  
                int i=Integer.parseInt(t);//NumberFormatException */  

            }
           catch(ArithmeticException ie){ // for multi catch first write sub class and then super class
                System.out.println("IT's ArithMAtic EXCEPTION");
            } catch(NullPointerException ne){ // for multi catch first write sub class and then super class
                System.out.println("IT's NULL POINTER EXCEPTION");
            }
            catch(RuntimeException re)
            {
                System.out.println("IT's RUN TIME EXCEPTION");

            }
            catch(Exception e)
            {
                System.out.println("IT's EXCEPTION");

            }
            
           /*  catch(Exception e)     if I write first exception block and then nullpointer exception than it's throw compile time error saying .. Exception in thread "main" java.lang.Error: Unresolved compilation problem: Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
            {
                System.out.println("IT's EXCEPTION");
            }catch(NullPointerException ne)
            {
                System.out.println("IT's NULL POINTER EXCEPTION");
            } */
    }

    public void checkedExceptionTestFor()
    {
            try{
                String s = null;
                int a = s.length();

            }catch(NullPointerException ne){ // for multi catch first write sub class and then super class
                System.out.println("IT's NULL POINTER EXCEPTION");
            }
            catch(Exception e)
            {
                System.out.println("IT's EXCEPTION");

            }
           /*  catch(Exception e)     if I write first exception block and then nullpointer exception than it's throw compile time error saying .. Exception in thread "main" java.lang.Error: Unresolved compilation problem: Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
            {
                System.out.println("IT's EXCEPTION");
            }catch(NullPointerException ne)
            {
                System.out.println("IT's NULL POINTER EXCEPTION");
            } */
    }
}