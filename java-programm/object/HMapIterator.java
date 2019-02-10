import java.util.*;

public class HMapIterator
{
	public static void main(String[] args)
	{
		HMapIterator hm = new HMapIterator();
		hm.test();
		hm.getKeyCount();
	}

	public void test()
	{
		HashMap<Integer, String> m = new HashMap<>();
		m.put(1,"Radhika");
		m.put(2,"Surani");
		m.put(3,"Software Engineer");

		// System.out.println("This is hashmap iteration ::" + m);

		// System.out.println(m.keySet());

		// m.forEach((k,v) -> System.out.println(" KEY IS: " + k + " AND VALUE OF IT IS : "+ v));

		Set<Integer> set = m.keySet();
		for(int a : set)
		{
			System.out.println(m.get(a));
		}

		for(Map.Entry<Integer, String> entry : m.entrySet())
		{
			// System.out.println("Key is : " + entry.getKey() + " Value is : " + entry.getValue());
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

		System.out.println("FINAL COUNT IS " + mCount);

	}
}