import java.util.* ; 
public class Main {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in) ; 
       int t = sc.nextInt() ; 
       while( t --> 0){
           int n = sc.nextInt() ; 
           int arr[] = new int[n] ; 
           for(int i = 0 ;i < n ; i++){
               arr[i] =sc.nextInt() ; 
           }
           int ans = 0 ; 
           int max = 0 ; 
           for(int i = 0 ; i < n ; i++){
               max = Math.max(max , arr[i]) ; 
               if(i % 2 == 1)arr[i] = max  ; 
           }
           for(int i = 1 ; i < n ; i += 2){
               int prev = arr[i-1] ; 
               int next = i + 1 < n ? arr[i+1] : 0; 
               if(prev >= arr[i]) ans += prev - arr[i] + 1; 
               if(next >= arr[i]) ans += next - arr[i] + 1; 
               if(i + 1 < n) arr[i+1] -= next - arr[i] + 1 ; 
           }
           System.out.println(ans) ; 
       }
    }
}
