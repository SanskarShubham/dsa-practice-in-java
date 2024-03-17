public class count_a_in_string {

    public static int count_a(String[] sent) {
        int maxA = 0;
        int maxI = 0;

        for (int i = 0; i < sent.length; i++) {
            int countA = 0;
            for (int j = 0; j < sent[i].length(); j++) {
                        if (sent[i].charAt(j)=='a' || sent[i].charAt(j)=='A') {
                            countA++;                                            
                        }
                        if (countA > maxA) {
                            maxA =countA;
                            maxI =i;
                        }
            }
        }
        return maxI;
    }

    public static void main(String[] args) {

        String[] sent = { "My name is shubham ojha aaa", "My name is shubham ojha " };

        int res = count_a(sent);
        System.out.println(res);
    }
}
