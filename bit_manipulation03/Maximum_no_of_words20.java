public class Maximum_no_of_words20 {
    public static void count_words(String[] arr) {
        int maxWords =0;
        for (int i = 0; i < arr.length; i++) {
            int senWord =0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) ==' ') {
                    senWord++;
                }
            }
            if (senWord >maxWords) {
                    maxWords = senWord;
            }
        }
        System.out.println(maxWords+1);
    }
    public static void main(String[] args) {
        String[] arr= {"please wait", "continue to fight", "continue to win"};
        count_words(arr);
    }
}
