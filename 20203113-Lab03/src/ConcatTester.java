public class ConcatTester { 
	public static void main(String[] args) 
	{ 
		String animal1 = "quick brown fox"; 
		String animal2 = "lazy dog"; 
		String article = "the"; 
		String action = "jumps over"; 
		/* ��ɹ� �߰��� �� �Ʒ��� �ϼ��� */ 
		String message = "";
		System.out.println(message.concat(article).concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2));
	} 
}