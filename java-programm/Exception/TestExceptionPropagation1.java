class TestExceptionPropagation1{  
  /*   void m(){  
      int data=50/0;  
    }  
    void n(){  
      m();  
    }  
    void p(){  
     try{  
      n();  
     }catch(Exception e){System.out.println("exception handled");}  
    } */ 
    
    void m() throws RuntimeException{  
      int data=50/0;  
    }  
    void n(){  
      try{
        m();  
       }catch(Exception e)
       {
          System.out.println("IN EXCEPTION M:: ");
       }  
    }  
    void p(){  
     try{
      n();  
     }catch(Exception e)
     {
        System.out.println("IN EXCEPTION :: ");
     }
     
     
    } 
    public static void main(String args[]){  
     TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
     obj.p();  
     System.out.println("normal flow...");  
    }  
  }  