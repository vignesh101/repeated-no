
import java.util.*;
public class string
{
	public static void main(String[] args){
	    Scanner br=new Scanner(System.in);
		String str=br.nextLine();
		String str1[]=str.split("\\s+");
		int i,j;
		for(i=0;i<str1.length;i++){
			char[] c=str1[i].toCharArray();
			for(j=c.length-1;j>=0;j--){
				System.out.print(c[j]);
			}
			System.out.print(" ");
		}
	}
}
