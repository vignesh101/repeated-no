import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		int n;
		List<Integer> ar=new ArrayList<>();
		Scanner br=new Scanner(System.in);
		try{
		n=br.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=br.nextInt();
		}
		for(int i=1;i<a.length;i++){
				if(a[i]==a[i-1]){
					ar.add(a[i]);
				}
			}
		if(ar.isEmpty()){
			System.out.println("unique");
		}
		else{
		Collections.sort(ar);
	        Iterator it=ar.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
			}
			
		}
		
		catch(Exception e){
			System.out.println("Invalid input");
		}
	}
}
