class Solution {
    
    public boolean ss(int [] arr, int low)
    {
        if(low >= arr.length-1) return true;
        int len = (arr.length-1) - low +1;

        // if(arr.length <=1) return true;
        
        if(arr[low] > arr[low + 1]) return false;
     
        return ss(arr, low+1);
    }
    
    boolean ss1(int [] arr, int n){
        if(n<=1) return true;
        if(arr[n] < arr[n-1]) return false;
        
        return ss1(arr,n-1);
    }
    
    public boolean isSorted(int[] arr) {
        return ss(arr,0);
        
        // int n = arr.length;
        // return ss1(arr,n-1);
    }
}