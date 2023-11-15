import java.util.HashMap;

public class FrequencyString {
	public static void main(String[] args) {
	String str="mohankumar";
	
	HashMap<Character,Long> map= new HashMap();
	
	for(int i=0;i<str.length()-1;i++){
	char c=	str.charAt(i);
	if (map.containsKey(c)){
	     Long count= map.get(c);
	     map.put(c, count+1);
	     
	}else{
		map.put(c, 1L);
	}
	
	}
	System.out.println("map:::::::::::"+map);



		
		
		
		
	}

}
