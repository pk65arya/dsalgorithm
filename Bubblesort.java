package algorithm;

public class Bubblesort {
    public int[] bubblesort(int[] arr){
        for (int i=0;i< arr.length;i++){
            int temp=0;
            //n*n
            for (int j=i+1;j< arr.length-1;j++){
               if (arr[i]>arr[j]){
                    temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;

                }
            }

        }
        return arr;
    }



}

class Implementation{
    public static void main(String[] args) {
        Bubblesort bs = new Bubblesort();
        int [] arr= {4,5,2,3,9,10};
        int[] ans=bs.bubblesort(arr);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
