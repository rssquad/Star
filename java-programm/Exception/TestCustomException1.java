class TestCustomException1{  
  
    static void validate(int age)throws InvalidAgeException{  
      if(age<18)  
       throw new InvalidAgeException("not valid");  
      else  
       System.out.println("welcome to vote");  
    }  
      
    public static void main(String args[]){  
       try{  
       validate(13);  
       }catch(Exception m){System.out.println("Exception occured: "+m.getMessage());}  
      //  validate(13);  
   
       System.out.println("rest of the code...");  
   }  

 }  


class InvalidAgeException extends Exception
{
 public static int serialVersionUID = 878798;
  InvalidAgeException(String msg)
  {
    System.out.println(msg);
  }
}