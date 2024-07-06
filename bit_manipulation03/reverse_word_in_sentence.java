package bit_manipulation03;

import java.lang.reflect.Array;

public class reverse_word_in_sentence {
    public static String reverseSentence(String str) {
        // space between  some words are more then one space like ( hello     sharpenerians)
        str = str.replaceAll("\\s+", " ");
        String res = "";
        String temp[] = str.split(" ");
       
        for (int i = temp.length-1; i >= 0; i--) {
            res = res + temp[i] + " ";
        }
        return res.trim();
    }

    public static void main(String[] args) {
        String str = "Simran is pure soul and i am a good boy";
        System.out.println(reverseSentence(str));
    }
}
