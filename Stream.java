package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnChangeAscii());
		returnChangelower(returnChangeAscii());
		printMemberCountGroupByHobby();
		printLikeCount();
	}
	public static Stream<String> returnChangelower(String s) {
		String result1 ="";
		Stream<String> stream = Arrays.asList(s).stream();
		Stream<String> result = stream.map(name -> {
			return name.toLowerCase();
		});
		System.out.println(result.collect(Collectors.toList()).get(0));
		return result;
	}
	public static String returnChangeAscii() {
		String result ="";
		for(int i = 65; i < 91; i++) {
			result += (char)i;
		}
		
		return result;
	}
	
	public static void printMemberCountGroupByHobby() { 
		List<String> l1 = new ArrayList<String>(Arrays.asList("김프로", "축구:농구:야구", "구기종목 좋아요"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("정프로", "개발:당구:족구", "개발하는데 뛰긴 싫어"));
		List<String> l3 = new ArrayList<String>(Arrays.asList("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"));
		List<String> l4 = new ArrayList<String>(Arrays.asList("죠르디", "스포츠댄스:개발", "개발하는 죠르디"));
		List<List<String>> persons = new ArrayList<List<String>>();
		persons.add(l1);
		persons.add(l2);
		persons.add(l3);
		persons.add(l4);
		//persons.remove(0); 
		Map<String, Integer> result = new HashMap<>(); 
		persons.stream().flatMap(member -> Arrays.stream(member.get(1).split(":"))).forEach(hobby -> result.merge(hobby, 1, (oldValue, newValue)->++oldValue)); 
		result.entrySet().forEach(entry-> System.out.println(entry.getKey() + " " + entry.getValue())); 

	}
	
	public static void printLikeCount() {
		List<String> l1 = new ArrayList<String>(Arrays.asList("김프로", "축구:농구:야구", "구기종목 좋아요"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("정프로", "개발:당구:족구", "개발하는데 뛰긴 싫어"));
		List<String> l3 = new ArrayList<String>(Arrays.asList("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"));
		List<String> l4 = new ArrayList<String>(Arrays.asList("죠르디", "스포츠댄스:개발", "개발하는 죠르디"));
		List<List<String>> lines = new ArrayList<List<String>>();
		lines.add(l1);
		lines.add(l2);
		lines.add(l3);
		lines.add(l4); 
		
		final String word = "좋아"; 
		int result = lines.stream().map(member -> countFindString(member.get(2), word)).reduce(0, Integer::sum);
		System.out.println(word+" "+result); 
	} 
	private static int countFindString(String source, String target){ 
		int idx = source.indexOf(target); 
		if(idx == -1){ 
			return 0; 
		}else{ 
			return 1 + countFindString(source.substring(idx + 2), target);
		} 
	}	

}
