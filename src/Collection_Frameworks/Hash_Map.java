package Collection_Frameworks;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Hash_Map  {
	public static void main(String[] args) {
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			hm.put("Rohith",1);
			hm.put("Virat",18);
			hm.put("Dhoni",7);
			hm.put("Balaya",111);
			System.out.println(hm);
			//below part is to get data as per requirement
			Set<Entry<String,Integer>>set=hm.entrySet();
			Iterator iterator =set.iterator();
			while(iterator.hasNext())
			{
				Map.Entry<String,Integer> next=(Entry<String,Integer>) iterator.next();
				System.out.println(next.getKey()+"--------"+next.getValue());
			}
	}
}