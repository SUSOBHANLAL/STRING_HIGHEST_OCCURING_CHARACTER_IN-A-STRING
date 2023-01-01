
public class susobhan {
	public static void main (String [] args) {

	String str = "abcaacccccc";
	int n = str.length();
	char arr[] = new char[n];
	// copied all the member in the  new array
	
	for(int i=0;i<n ;i++) {
		arr[i]=str.charAt(i);
		
	}
	
	// all the string  word are copied to the arr[];
	
	
	int maxcount = 1;
	char ans=arr[0];
	int count =0;
	
	for(int i=0;i<n;i++) {
		count =0;
		for(int j=i+1;j<n;j++){
			
			if(arr[i]==arr[j]) {
				
				count = count +1;
				if(count>maxcount) {
					maxcount = count;
					ans = arr[i];
					// if i print here the for each satisfaction of condition it will show the alphabet 
					
					
				}
			}
			
		}
	}
	System.out.print("This is the output:"+ans);
	
	

	
}
}

