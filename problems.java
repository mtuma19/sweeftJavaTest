
public class Main
{
	public static void main(String[] args) {
	    int[] nums= {1, 2, 1, 3, 2};
		System.out.println(singleNumber(nums));
		String a ="1010";
		String b= "101";
		System.out.println(sum(a, b));
	}
	public static String sum(String a, String b){
	    String sum="";
	    int len;
	    char c = '0';
	    if(a.length()<b.length()){
	        len=a.length();
	    } else {
	        len=b.length();
	    }
	    for(int i=1; i<=len; i++){
	           if(a.charAt(a.length()-i)=='1'&&b.charAt(b.length()-i)=='1'){
	               if(c=='1'){
	                   sum = "1"+sum;
	               } else {
	                   sum = "0"+sum;
	                   c='1';
	               }
	            } else if(a.charAt(a.length()-i)=='0'&&b.charAt(b.length()-i)=='0'){
	                sum = c + sum;
	                c = '0';
	            } else {
	                if(c=='1'){
	                    sum = "0"+sum;
	                } else {
	                    sum = "1"+sum;
	                }
	            }
	  }
	  if(a.length()<b.length()){
	        for(int i = b.length() - a.length() -1 ; i>=0; i--){
	            if(b.charAt(i)=='1'&&c == '1'){
	                sum= "0"+sum;
	            } else if(b.charAt(i)== '0'&&c == '0') {
	                sum =  "0" + sum;
	            } else {
	                 sum =  "1" + sum;
	                 c = '0';
	            }
	        }
	    } else {
	        for(int i = a.length() - b.length() -1 ; i>=0; i--){
	            if(a.charAt(i)=='1'&&c == '1'){
	                sum= "0"+sum;
	            } else if(a.charAt(i)== '0'&&c == '0') {
	                sum =  "0" + sum;
	            } else {
	                 sum =  "1" + sum;
	                 c = '0';
	            }
	        }
	    }
	    if(c=='1'){
	        sum = '1' + sum;
	    }
	  
	    
	    
	    return sum;
	}
	
	
    public static int singleNumber(int[] nums){
        int result=0;
        int[] arr= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]+=1;
        }
        for(int i=0; i<arr.length; i++){
           if( arr[i]==1){
               result= i;
           }
        }
        return result;
    }
        public static int minSplit(int amount) {
           int[] arr= {1, 5, 10, 20, 50};
            int n=0;
            int am = amount;
            while(am>0){
                int i=4;
                while(i>0){
                    if(arr[i]<=am){
                        am=am-arr[i];
                        n++;
                        break;
                    }
                    i--;
                }
                 
            }
            return n;
        }
        
        
        public static int notContains(int[] array){
            int n =1;
            while (true){
                int i=0;
                 while(true){
                    if(n==array[i]){
                       n++;
                       break;
                    }
                    if( i==array.length-1){
                        return n;
                    }
                    i++;
                }
                
            }
        }
        
        
       
    public static  int countVariants(int stearsCount){
           int n= stearsCount;
            if(n==1 || n ==0) {
                return 1;
            } else {
                return countVariants(n-2)+countVariants(n-1);
            }
        }
}

