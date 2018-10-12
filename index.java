
import java.util.*;
public class index
{
	public static void main(String[] args){
		Scanner br=new Scanner(System.in);
		try
		{
		int n=br.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<a.length;i++){
			a[i]=br.nextInt();
		}
		
		List<Integer> l=new ArrayList<>();
		for(i=0;i<a.length;i++){
			if(a[i]==i){
	           l.add(a[i]);
			}
		}
		if(l.isEmpty()){
			System.out.println("-1");
		}
		else{
		Collections.sort(l, new Comparator<Integer>(){
				@Override
				public int compare(Integer p1, Integer p2)
				{
					return p1.compareTo(p2);
				}
		});
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		}
		}
		catch(Exception e){
			System.out.println("invalid input");
		}
	}
}
