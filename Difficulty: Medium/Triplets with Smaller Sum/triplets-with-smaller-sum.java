class Solution {
    int countTriplets(int sum, int arr[]) {
        
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
             int triplet_sum=arr[i]+arr[left]+arr[right];
                if(triplet_sum>=sum){
                    right--;
                }
                else{//sum<target
                   count=count+(right-left);
                   left++;
                }
            }
        }
            return count;
        
    }
}