
import java.util.*;public class hello
{
	public static void main(String[] args){
		Vector<String> v;
		v=new Vector<String>();
		v.add("199");
		v.add("20");
		v.add("3");
		Collections.sort(v, new Comparator<String>(){
			
				@Override
				public int compare(String p1, String p2)
				{
					System.out.println(p1+" "+p2);
					String xy=p1+p2;
					String yx=p2+p1;
					return xy.compareTo(yx)>0?-1:1;
				}
		});
		Iterator it=v.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	
	}
}
