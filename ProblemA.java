import java.util.* ; 
public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in) ; 
       int t = sc.nextInt() ; 
       while( t --> 0){
           int n = sc.nextInt() ; 
           int k = sc.nextInt() ; 
           String s = sc.next() ; 
           int count = 0 ; 
           for(int i = 0 ; i < n ; i++){
               if(s.charAt(i) == '1'){
                   count++ ; 
                   int end =i + k ; 
                   while(i < n && i < end){
                       if(s.charAt(i) == '1') end = i + k ;
                       i++ ; 
                   }
                   i-- ; 
               }
           }
           System.out.println(count) ; 
       }
    }
}
