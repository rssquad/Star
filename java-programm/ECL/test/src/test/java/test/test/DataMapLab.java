package test.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataMapLab dataMapped = new  DataMapLab();
		
		dataMapped.getMappedData(dataMapped.DataMap());

	}
	
	public HashMap<String, Double> DataMap() {
		
		HashMap<String, Double> mappedData = new HashMap<>();
		
		mappedData.put("Data1",23.145);
		mappedData.put("Data2",78.345);
		mappedData.put("Data3",09.445);
		mappedData.put("Data4",49.545);
		mappedData.put("Data5",240.645);
		mappedData.put("Data6",262.745);
		mappedData.put("Data7",229.845);
		mappedData.put("Data8",2656.345);
		
		return mappedData;
	}
	
	public void getMappedData(HashMap<String, Double> mappedData)
	{
		List<Double> values = new ArrayList<>();
		for(Map.Entry<String, Double> data : mappedData.entrySet())
		{
			values.add(data.getValue());
			
		}
		
		System.out.println(values);
	}
	

}
