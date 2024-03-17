public class Sorting_in_java {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 3, 7, 2, 9 };
        // Bubble Sort in asc order
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length-i-1; j++) {
        // if (arr[j] > arr[j+1]) {
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1] = temp;
        // }
        // }
        // }

        // Bubble Sort in Dsc order
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length-1-i; j++) {
        // if (arr[j] < arr[j+1]) {
        // int temp = arr[j];
        // arr[j] = arr[j+1];
        // arr[j+1] = temp;
        // }

        // }

        // }

        // Selection Sort in asc order
        // for (int i = 0; i < arr.length; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[j] < arr[smallest]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[smallest];
        //     arr[smallest] = temp;
        // }
        
        // Insertion Sort in java
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j= i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
