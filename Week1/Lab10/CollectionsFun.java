
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionsFun {

	public List<String> nameList(List<Person> pList){
		List<String> rList = new ArrayList<String>();
		for(int i = 0; i < pList.size(); i++){
			rList.add(pList.get(i).getFirst());
		}
		return rList;
	}

	public Map<String,Person> personMap(List<Person> pList){
		Map<String,Person> rMap = new HashMap<String,Person>();
		for(int i = 0; i < pList.size(); i++){
			String temp = pList.get(i).getFirst() + pList.get(i).getLast();
			rMap.put(temp, pList.get(i));
		}
		return rMap;
	}

	public Person iteratorFun(List<Person> pList){
		Iterator<Person> it = pList.iterator();
		int index = 0;
		int oldAge = pList.get(0).getAge();
		Person oldest = pList.get(0);
		while (it.hasNext()){
			if(pList.get(index).getAge() > oldAge){
				oldAge = pList.get(index).getAge();
				oldest = it.next();
			}else{
				it.next();
			}
			index++;
		}
		return oldest;
	}

	// Fill out the class with the logic

}
