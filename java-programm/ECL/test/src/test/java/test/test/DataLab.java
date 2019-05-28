package test.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DataLab {
	
	
	public static void main(String args[]) {
		
		DataLab dl = new DataLab();
		//dl.getGoodScore(dl.getData());
		dl.getGoodScoreDataStream(dl.getData());
		
		//dl.getAverageDstaScore(dl.getData());
		//System.out.println("Stream below..!!");
		dl.getAverageDataScoreStream(dl.getData());
	

	}
	
	
	public List<Data> getData()
	{
		List<Data> dataList = new ArrayList<Data>();
		
		dataList.add(new Data("abc", 67));
		dataList.add(new Data("def", 99));
		dataList.add(new Data("efg", 45));
		dataList.add(new Data("hij", 77));
		dataList.add(new Data("mno", 89));
		dataList.add(new Data("pqr", 34));
		dataList.add(new Data("stu", 65));
		dataList.add(new Data("xyz", 87));
		
		return dataList;

	}
	
	public void getGoodScore(List<Data> dataList){
		
		List<Data> goodScoreList = this.getData();
		List<Data> getGoodScoreList = new ArrayList<Data>();
				
		
		for(Data data : goodScoreList)
		{
			if(data.getScore() > 70)
			{
				getGoodScoreList.add(data);
			}
		}
		
		for(Data getDataList : getGoodScoreList)
		{
			System.out.println(getDataList);
		}
	}
	
	public void getGoodScoreDataStream(List<Data> dataList)  // using Stream API..
	{
//		List<Data> getGoodScoreList = dataList.stream().filter(d -> d.getScore() >= 70).collect(Collectors.toList());
//		
//					getGoodScoreList.stream().forEach(System.out::println);
					
		List<Data> getTop3 = dataList.stream().filter(d -> d.getScore() >= 70).sorted().limit(3).collect(Collectors.toList());
		 
					getTop3.stream().forEach(System.out::println);
	}
	
	public void getAverageDstaScore(List<Data> dataList)
	{
		double dataAvg = 0.0;
		int sum = 0;

		for(Data data : dataList)
		{
			sum = sum + data.getScore();
		}
		
		dataAvg = sum/dataList.size();
		
		System.out.println("Average Score : " + dataAvg);
		
	}
	
	public void getAverageDataScoreStream(List<Data> dataList) // using Stream API..
	{
		double dataAvg = dataList.stream().mapToInt(d -> d.getScore()).average().getAsDouble();
		
		System.out.println(dataAvg);
	}
	
	
	

}
