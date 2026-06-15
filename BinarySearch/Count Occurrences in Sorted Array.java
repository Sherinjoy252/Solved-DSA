public class Solution {
    public static int firstOccurence(int arr[], int n, int x){
        int l=0, r=n-1;
        
        int start = -1;

        while(l<=r){
            int mid = l+(r-l)/2;
            //first occurence
            if(arr[mid] == x){
                start = mid;
                r = mid-1;
            }
            else if(arr[mid] < x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }

        }

        return start;
    }

    public static int lastOccurence(int arr[], int n, int x){
        int l=0, r=n-1;
        int end = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            //last occurance
            if(arr[mid] == x){
                end = mid;
                l = mid+1;
            }
            else if(arr[mid] < x){
                l = mid+1;
            }
            else{
                r = mid-1;
            }

        }

        return end;
    }

    public static int count(int arr[], int n, int x) {
        //Your code goes here
        
        int start = firstOccurence(arr,n,x);
        if(start == -1){
            return 0;
        }
        
        int end = lastOccurence(arr,n,x);

        return end-start+1;
    }
}