package hello;
import java.util.*;

public class a
{
   public static void main(String... args){
	   Scanner br=new Scanner(System.in);
	   int n;
	   int i;
	   int flag=0;
	   try{
	   n=br.nextInt();
	   int a[]=new int[n];
	   for(i=0;i<a.length;i++){
		   a[i]=br.nextInt();
	   }
	   Map<Integer,Integer> m=new HashMap<>();
	   for(int x:a){
		   if(m.containsKey(x)){
			   m.put(x,m.get(x)+1);
		   }
		   else{
			   m.put(x,1);
		   }
	   }
	   for(Map.Entry<Integer,Integer> m1:m.entrySet()){
		   if(m1.getValue()==1){
			   System.out.println(m1.getKey());
		   }
		   else 
			   if(m1.getValue()>1){
				   flag=1;
			   }
	   }
	   if(flag==1){
		   System.out.println("values are repeated");
	   }
	   }
	   catch(Exception e){
		   System.out.println("invalid input");
	   }
   }
}
