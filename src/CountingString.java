import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountingString {
	
	    public void count(String str){
		char[] charary = str.toCharArray();
		HashMap<Character, Integer>map =new HashMap();
		
		
		
		for(Character c:charary){
		if(map.containsKey(c)){
			int count=map.get(c);
			map.put(c, ++count);
			
		}else{
			map.put(c, 1);
		}
		}
		for( Entry<Character, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey() +"::"+entry.getValue());
		
	}
}
	    public static void main(String[] args) {
		
		String str="mohankumar";
		CountingString cs= new CountingString();
		cs.count(str);
		
		Map<Character,Long>st=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("st:::::::::::::::"+st);
	
	}

}
