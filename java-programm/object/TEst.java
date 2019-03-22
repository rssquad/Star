import java.io.*; 
import java.util.*;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler; 
class TEst
{
    public static void main(String[] args)
    {
       Map<Integer,String> m = new HashMap<>();
        m.put(101,"test");
        m.put(102,"hsgfh");
        m.put(103,"nnn");

        for(Map.Entry<Integer,String> h : m.entrySet())
        {
            System.out.println("K : " + h.getKey() + " V : " + h.getValue());
        }

        m.forEach((k,v)->{
            System.out.println("K: " + k + " V: " + v);
        });

        for(int a : m.keySet())
        {
            System.out.println("K : " + a + " V :" + m.get(a));
        }

        List<Ddemo> l = new ArrayList<>();
        Ddemo d = new Ddemo();
        l.add(new Ddemo("kaic", 101, 193));
        l.add(new Ddemo("kaip", 102, 65));
        l.add(new Ddemo("kain", 103, 96));

        Collections.sort(l,d);
        for(Ddemo a : l)
        {
            System.out.println("List : " + a.getName() + " " + a.getEId() + " " + a.getId());
        }


        hashCodeEx hc = new hashCodeEx();
        hc.HashCodeANdEuals();



    }
      
}


class Ddemo implements Comparator<Ddemo>
{
    String name;
    int id;
    int eId;
    public Ddemo()
    {
        
    }

    public Ddemo(String name, int eId, int id)
    {
        this.name = name;
        this.eId = eId;
        this.id = id;
    }
    public void set(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setId(int id)
    {
        this.id  =id;
    }

    public int getId()
    {
        return this.id;
    }
    public void setEId(int eId)
    {
        this.eId = eId;
    }
    public int getEId()
    {
        return this.eId;
    }

    public int compare(Ddemo d1, Ddemo d2)
    {
        return d1.getName().compareTo(d2.getName());
    }

}

class hashCodeEx{

   String name;
   int testId;
   public void setName(String name)
   {
       this.name = name;
   }
   public String getName()
   {
       return this.name;
   }
   public void setTestId(int testId)
   {
       this.testId = testId;
   }
   public int getTestId()
   {
       return this.testId;
   }
    
   public hashCodeEx(int testId, String name)
   {
        this.name = name;
        this.testId = testId;
   }
   public hashCodeEx()
   {
        
   }
    public void HashCodeANdEuals()
    {
        
        Map<hashCodeEx, String> m =new HashMap<>();
        hashCodeEx h1  =  new hashCodeEx(101,"radhika");
        hashCodeEx h2 =  new hashCodeEx(101,"radhika");
        hashCodeEx h3 = new hashCodeEx(104,"raaaadhika");
        hashCodeEx h4= new hashCodeEx(1018,"raadhika");

        m.put(h1,"radhika");
        m.put(h2,"surani");
        m.put(h3,"Software Engineer");
        m.put(h4,"BusinessWoman");

        m.forEach((k,v)->{
            System.out.println("k " + k.getName()  +  " v " +v);
        });


    }

    public int hashCode()
    {
        return this.testId;
    }
     
    // public boolean equals(Object obj)
    // {
    //     if(this == obj)
    //     {
    //         return true;
    //     }else if(obj == null || obj.getClass() != this.getClass())
    //     {
    //         return false;
    //     }

    //     hashCodeEx hs = (hashCodeEx)obj;
    //     return this.name.equals(hs.name) && this.testId == hs.testId;
    // }
        



}