package Solution1;

public class Change {
    public int GetNumberOfK(int [] array , int k) {
        int count=0;
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==k){
                for(int m=mid;m>=left;m--){
                    if(array[m]==k){
                        count++;
                    }else{
                        break;
                    }
                }
                for(int m=mid+1;m<=right;m++){
                    if(array[m]==k){
                        count++;
                    }else {
                        break;
                    }
                }
                return count;
            }else if(array[mid]<k){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return count;
    }
}
