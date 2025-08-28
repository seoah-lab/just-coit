package coding;

class FindMaxOccurredAlphabet1 {
    public static char findMaxOccurredAlphabet(String string) {
        String[] alphabetArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                                  "t", "u", "v", "x", "y", "z"};
        int maxOccurrence = 0;
        String maxAlphabet = alphabetArray[0]; // a

        for (String alphabet : alphabetArray) {
            int occurrence = 0;

            for (char ch : string.toCharArray()) {
                if (String.valueOf(ch).equals(alphabet)) {
                    occurrence += 1;
                }
            }

            if (occurrence > maxOccurrence) {
                maxAlphabet = alphabet;
                maxOccurrence = occurrence;
            }
        }

        return maxAlphabet.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 = " + findMaxOccurredAlphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 = " + findMaxOccurredAlphabet("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 = " + findMaxOccurredAlphabet("best of best youtube"));
    }
}
