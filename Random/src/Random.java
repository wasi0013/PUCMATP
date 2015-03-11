
public class Random {

      static void random(){
		int[] nums = new int[10];
		for(int i=0; i<nums.length;i++){
			int random= (int) (Math.random()*10);
			boolean found=true;
			
			while(found){
				random= (int) (Math.random()*10);
				found=false;
			
				for (int num : nums) {
					if (random==num) {
						found=true;
						break;
					}
				}
			}			
			nums[i]=random;
			}
			
		//print the random number arrays
		for(int num:nums){
			System.out.print(num+" ");
			
		}
		
		
	}
	public static void main(String[] args) {
		
		int counter=1;
		while(counter<6){
		System.out.print("Random array of unique numbers Test ("+counter+"): ");
			random();
		System.out.println();
		counter++;
		}
		

	}

}
