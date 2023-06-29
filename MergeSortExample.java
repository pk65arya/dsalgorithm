package algorithm;

import java.util.Scanner;

public class MergeSortExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements you want to sort");

        int num = scanner.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the array elements");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        mSort(arr, 0, arr.length - 1);
        for (int values : arr) {

            System.out.println(values);
        }

    }

    private static void mSort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            mSort(arr, i, mid);
            mSort(arr, mid + 1, j);
            mergeMethod(arr, i, mid, j);
        }
    }

    private static void mergeMethod(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] b = new int[arr.length];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {
            b[k] = arr[j];
            j++;
            k++;
        }
        for (i = low; i <= high; i++) {
            arr[i] = b[i];
        }
    }
}
