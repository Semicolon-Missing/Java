package pkg1;
class Tools2{
	String s1="";
	String s2="";
	int len1=0;
	public String reverse(String s1) {
		len1=s1.length();
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
		return s2;
	}
}
public class k124 {

	public static void main(String[] args) {
		Tools2 t1=new Tools2();
		System.out.println(t1.reverse("Koenigsegg"));
		

	}

}