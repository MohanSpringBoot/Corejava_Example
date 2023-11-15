import java.util.HashMap;
import java.util.Map;

public class StringFrequency {
	
	public static char getFrequency(String st,int num){
		Map<Character,Integer>map=new HashMap<>();
		char sc = 0;
		for(int i=0;i<st.length()-1;i++){
			 sc = st.charAt(i);
			if(map.containsKey(sc) ){
				
				map.put(sc, map.get(sc)+1);
				
			}else{
				map.put(sc, 1);
			}
			System.out.println(map);
		}
		
		return sc;
		
	}

	public static void main(String[] args) {

		
	}

}
