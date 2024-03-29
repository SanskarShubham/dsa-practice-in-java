package pro_test1;

class Test_question1{

    public static void count_5(int[][] arr) {
            int count =0; 
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] ==5) {
                        count++;
                    }
                }
            }
            System.out.println(count);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{3,5,5}};
        count_5(arr);

    }
}