//{ Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        
      {
        ArrayList<Character> l1=new ArrayList<>();
          ArrayList<Character> l2=new ArrayList<>();
          
          for(Character ans: s.toCharArray()){
              l1.add(ans);
          }
          for(Character ans:s1.toCharArray()){
              l2.add(ans);
          }
          
          ArrayList<Character> l3=new ArrayList<>(l1);
          l3.addAll(l2);
          
          for(Character K:l3){
              if(l1.contains(K) && l2.contains(K)){
                  l1.remove(K);
                  l2.remove(K);
                  
              }
          }
           return l1.size()+l2.size();       
      }
        
        
    
}


