package ajayautomation;

import java.util.HashMap;
import java.util.Map;

public class ajayrohi {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String x="mynameisajay";
		    Map<Character,Integer>G=new HashMap<Character,Integer>();
		    for(int i=0;i<x.length();i++) {
		    	Character c=x.charAt(i);
		    if(G.containsKey(c))	{
		    	int count =G.get(c);
		    	G.put(c,count+1);
		    }else {
		    G.put(c,1);
		    }
		    }
		    for(Map.Entry<Character,Integer>hm:G.entrySet()) {
			      
	        	 System.out.println(hm.getKey() + " "+ hm.getValue());
		   }
	}
}
	
	

	