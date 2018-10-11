
import java.util.*;public class third
{
	public static void main(String[] args){
		int i,j;
		int n;
		Scanner br=new Scanner(System.in);
		n=br.nextInt();
		int a[]=new int[n];
		try{
		for(i=0;i<a.length;i++){
			a[i]=br.nextInt();
		}
		int k;
		for(i=0;i<a.length;i++){
			k=a[i];
			for(j=i+1;j<a.length;j++){
				if(k+a[j]==0){
					System.out.println(k+" "+a[j]);
				}
				else{
					continue;
				}
			}
		}
	}
	catch(Exception e){
		System.out.println("invalid input");
	}
	}
}
