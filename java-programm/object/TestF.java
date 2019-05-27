import java.util.*;
class TestF
{
    public static void main(String[] args)
    {
        List<KaiPan> list = new ArrayList<>();
        list.add(new KaiPan("abc",101));
        list.add(new KaiPan("xyz",105));
        list.add(new KaiPan("pqr",104));
        list.add(new KaiPan("asd",108));
        list.add(new KaiPan("ghj",102));

        Collections.sort(list);
        for(KaiPan kp : list)
        {
            System.out.println(kp.getStr() + " : " + kp.getNum());
        }
    }
}

class KaiPan implements Comparable<KaiPan>
{
    String str;
    int num;

    KaiPan(String str, int num)
    {
        this.str = str;
        this.num = num;
    }

    public String getStr()
    {
        return this.str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

    public int getNum()
    {
        return this.num;
    }

    public void setNum(int num)
    {
        this.num  = num;
    }

    public int compareTo(KaiPan kp)
    {
        return this.num - kp.num;
    }
}