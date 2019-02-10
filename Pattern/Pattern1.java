class Pattern1
{
    public static void main(String args[]) {
        
        System.out.println("YES :: I AM HERE FOR PATTERN");
        Pattern1 p = new Pattern1();
        p.center3(4);
    }


    //////////////////////////////   *
   //                               *  *
    //                            *  *   * 

    public void center(int n)
    {
        // System.out.print("YES IN CENTER");
        for(int i=0; i<n; i++)
        {
            for(int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    //////////////////////////////   * * *
   //                                 * *
    //                                 * 

    public void center1(int n)
    {
        // System.out.print("YES IN CENTER");
        for(int i=0; i<n; i++)
        {
           
            for(int k=0; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j=n; j>i; j--)
            {  
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

        //////////////////////////////   *
   //                                    * *
    //                                   * * * 

    public void center2(int n)
    {
        // System.out.print("YES IN CENTER");
        for(int i=0; i<n; i++)
        {
           
           for(int j=0; j<=i; j++)
           {
               System.out.print("* ");
           }
            System.out.println();
        }
    }

            //////////////////////////////   * * *
   //                                          * *
    //                                           * 

    public void center3(int n)
    {
        // System.out.print("YES IN CENTER");
        for(int i=0; i<n; i++)
        {
           
         for(int j=n; j>i; j--)
         {
             System.out.print(" * ");
         }
            System.out.println();
        }
    }
}

