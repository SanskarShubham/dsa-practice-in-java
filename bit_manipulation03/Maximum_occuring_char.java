package bit_manipulation03;

public class Maximum_occuring_char {

    public static char maxOccurringChar(String str) {
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[(int) str.charAt(i) - 97]++;
        }
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return (char) (maxIndex + 97);
    }

    

    public static void main(String[] args) {
        String str = "aabcdeeee";
        System.out.println(maxOccurringChar(str));
    }
}
