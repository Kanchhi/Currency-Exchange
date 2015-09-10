public class parser{
	public static void main(String[] args){
	String input = "22,33,44,55,66,77,88";
	String[] tokens = input.split(",");

	for (String t :tokens){
		System.out.println(t);
	}
	 System.out.println(args[0]);
	}
}