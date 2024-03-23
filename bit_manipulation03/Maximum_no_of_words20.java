package bit_manipulation03;

public class Maximum_no_of_words20 {
    public static void count_words(String[] arr) {
        int maxWords = 0;

        for (int i = 0; i < arr.length; i++) {
            String[] wordsArr = arr[i].trim().split(" ");
            int length = wordsArr.length;
            if(length > maxWords){
                maxWords = length;
            }
        }
        System.out.println(maxWords);


        // int maxWords =0;
        // for (int i = 0; i < arr.length; i++) {
        // int senWord =0;
        // for (int j = 0; j < arr[i].length(); j++) {
        // if (arr[i].charAt(j) ==' ') {
        // senWord++;
        // }
        // }
        // if (senWord >maxWords) {
        // maxWords = senWord;
        // }
        // }
        // System.out.println(maxWords+1);
    }

    public static void main(String[] args) {
        String[] arr = { "please wait", "continue to fight", "continue to win ok" };
        count_words(arr);
    }
}
