package test.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class DataIntLab {

	public static void main(String[] args) {
		
		DataIntLab dataLab = new DataIntLab();
		
		System.out.println("Average");
		dataLab.getHeighestScoreByDepartment(dataLab.getDataInt());
		System.out.println("Heighest");
		dataLab.getSecondHeighestScoreByDepartment(dataLab.getDataInt());
		System.out.println("Lowest");
		dataLab.getLowestScorePerDepartment(dataLab.getDataInt());
		System.out.println("Second Heighest Elements");
		dataLab.getAverageScoreByDepartment(dataLab.getDataInt());
		System.out.println("Second Last Elements");
		dataLab.getSecondLowestPerDepartment(dataLab.getDataInt());
		
		

	}
	
	public List<DataInt> getDataInt() {
		
		List<DataInt> dataInt = new ArrayList<DataInt>();
		
		dataInt.add(new DataInt("abc", 56, "HR"));
		dataInt.add(new DataInt("def", 76, "Admin"));
		dataInt.add(new DataInt("abc", 79, "Admin"));
		dataInt.add(new DataInt("klm", 90, "Finance"));
		dataInt.add(new DataInt("nop", 98, "Finance"));
		dataInt.add(new DataInt("qrs", 80, "Admin"));
		dataInt.add(new DataInt("tuv", 65, "HR"));
		dataInt.add(new DataInt("xyz", 44, "HR"));	
		dataInt.add(new DataInt("xyz1", 54, "Admin"));	
		dataInt.add(new DataInt("xyz2", 464, "HR"));	
		dataInt.add(new DataInt("xyz4", 4, "Finance"));	
		dataInt.add(new DataInt("xyz5", 563, "HR"));	
		dataInt.add(new DataInt("xyz6", 48, "Finance"));	
		dataInt.add(new DataInt("xyz7", 12, "Admin"));	
		
		return dataInt;
		
	}
			
	
	public List<DataInt> getAverageScoreByDepartment(List<DataInt> dataList){
		
		List<DataInt> getAverage = new ArrayList<>();
		
		Map<String, List<DataInt>> mappedDataSortAsc = new HashMap<>();
		
		mappedDataSortAsc  =   dataList.stream().sorted().collect(Collectors.groupingBy(DataInt::getDept, Collectors.toList()));

//		mappedDataSortAsc.forEach((String key, List<DataInt> dataSet) ->  System.out.println(key +" -> "+dataSet.stream().sorted(Comparator.comparing(DataInt::getScore)).collect(Collectors.toList())));
		
		mappedDataSortAsc.forEach((String key, List<DataInt> dataSet) ->  System.out.println(key +" -> "+dataSet.stream().sorted(Comparator.comparing(DataInt::getScore)).collect(Collectors.toList()).get(1)));

		return getAverage;
	}
	
	public List<DataInt>  getHeighestScoreByDepartment(List<DataInt> dataList) {
		
		Map<String, Double> getHeighestByDepartment = new HashMap<>();
			
		getHeighestByDepartment = dataList.stream().collect(Collectors.groupingBy(DataInt::getDept,Collectors.averagingInt(DataInt::getScore)));
										
		List<DataInt> mnpDataList = new ArrayList<>();
		
		System.out.println(getHeighestByDepartment);
		
		return mnpDataList;
		
	}
	
	public List<DataInt> getSecondHeighestScoreByDepartment(List<DataInt> dataList) {
		
		List<DataInt> getSecondHeighestByDEpartment = new ArrayList<>();
		
		Map<String, Object> getSecondHeighestByDEpartments = new HashMap<>();
		
		getSecondHeighestByDEpartments = dataList.stream().collect(Collectors.groupingBy(DataInt::getDept, Collectors.mapping(DataInt::getScore, Collectors.collectingAndThen(Collectors.maxBy(Integer::compare), Optional::get))));
		
		System.out.println(getSecondHeighestByDEpartments);
		
		return getSecondHeighestByDEpartment;
		
	}
	public List<DataInt> getLowestScorePerDepartment(List<DataInt> dataList) {
		
		List<DataInt> getLowestByDEpartment = new ArrayList<>();
		
		Map<String, Object> getLowestScorePerDEpartments = dataList.stream().collect(Collectors.groupingBy(DataInt::getDept, Collectors.mapping(DataInt::getScore, Collectors.collectingAndThen(Collectors.minBy(Integer::compare), Optional::get))));
		
		System.out.println(getLowestScorePerDEpartments);
		
		return getLowestByDEpartment;
		
	}
	
	public List<DataInt> getSecondLowestPerDepartment(List<DataInt> dataList){
		
		List<DataInt> secondLowest= new ArrayList<>();
		
		Map<String, List<DataInt>> mappedDataSortDsc = new HashMap<>();
	
		mappedDataSortDsc  =   dataList.stream().sorted().collect(Collectors.groupingBy(DataInt::getDept, Collectors.toList()));

		System.out.println("Group by in descending oreder..!!");
		mappedDataSortDsc.forEach((String key, List<DataInt> dataSet) ->  System.out.println(key +" -> "+dataSet.stream().sorted().collect(Collectors.toList())));
		System.out.println("Last Second by each group!!" );
		mappedDataSortDsc.forEach((String key, List<DataInt> dataSet) ->  System.out.println(key +" -> "+dataSet.stream().sorted().collect(Collectors.toList()).get(1)));

		return secondLowest;
 		
	}
	
	public void dataTag() {
		
		Map<String, Integer> data = new HashMap<>();
		
	}

	

}
