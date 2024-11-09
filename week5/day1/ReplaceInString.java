package week5.day1;

public class ReplaceInString {

	
	public static void main(String[] args) {
		
		String input = "Qeagle (15879)";
		String replaceso = input.replace('Q', 'q');
		System.out.println(replaceso);
		String replace = input.replace("Qeagle", "TestLeaf");
		System.out.println(replace);
		String replace2 = replace.replace('e','E');
		System.out.println(replace2);
		
		String replaceAll = input.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
	}
	
}
