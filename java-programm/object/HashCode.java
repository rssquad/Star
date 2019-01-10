import java.util.*;

public class HashCode
{
	public static void main(String[] args)
	{
		HashCode hm = new HashCode();
		hm.test();
		hm.getKeyCount();
	}

	public void test()
	{
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1,"Radhika");
		m.put(2,"Surani");
		m.put(3,"Software Engineer");

		System.out.println("This is hashmap iteration ::" + m);

		for(Map.Entry<Integer, String> entry : m.entrySet())
		{
			System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
		}
	}

	public void getKeyCount()
	{
		 Integer[] num = new Integer[]{1,2,3,2,1,3,4,1,1,7};

		 HashMap<Integer, Integer> mCount = new HashMap<>();

		for(Integer a : num){

			if(mCount.containsKey(a))
			{
				mCount.put(a, mCount.get(a) + 1);
			}
			else
			{
				mCount.put(a, 1);
			}

		}

		System.out.println("FILAN COUNT IS " + mCount);

}
}