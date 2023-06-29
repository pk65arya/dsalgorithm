package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBinarySerach {


    public static void main(String[] args) {
        String str="this is a file which has many words";
        String[] arr= str.split(" ");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans=binaryserach(arr,"has");
        System.out.println(ans);
    }
   public static int binaryserach(String[] arr,String target){
       int start=0;
       int end=arr.length-1;
       while (start<=end){
           int mid= start+(end-start)/2;
           int res = target.compareTo(arr[mid]);
           if(res==0){
               return mid;
           }else if(res>0){
             start=mid+1;
           }else
               end=mid;
       }
       return -1;
   }

}
