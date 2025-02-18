// SORT COLORS

LINK :- https://leetcode.com/problems/sort-colors/description/

//JAVA
public void sortColors(int[] nums) {
  int n =nums.length;
  for(int i=0; i<n-1; i++){
      int min=i;
      for(int j=i+1; j<n; j++){
          if(nums[j]<nums[min]){
              min=j;
          }
      }
      int temp=nums[i];
      nums[i]=nums[min];
      nums[min]=temp;
  }
}





Optimal solution ::
public void sortColors(int[] nums) {
       int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
