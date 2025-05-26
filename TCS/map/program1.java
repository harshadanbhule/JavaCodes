import java.util.*;

class Demo{

	static boolean answer(String str1,String str2){
		
		HashMap<Character,Integer> map=new HashMap<>();
		if(str1.length()!=str2.length()){
			return false;
		}
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);

			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
			
				map.put(ch,1);
			}		
		}

		for(int i=0;i<str2.length();i++){
			char ch=str2.charAt(i);

			 if(map.containsKey(ch)){
                                map.put(ch,map.get(ch)-1);
                        }else{

                                return false;
                        }

			if(map.get(ch)<0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args){
		String str1="hello";
		String str2="ollhe";

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		boolean result=answer(str1,str2);

		if(result==true){
			System.out.println("is anagram");
		}else{
			System.out.println("is not anagram");
		}
	}
}
