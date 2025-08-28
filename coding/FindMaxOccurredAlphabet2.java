package coding;

class FindMaxOccurredAlphabet2 {

    private static String findMaxOccurredAlphabet(String input) {
        int[] ascii = new int[26];
        char[] preProcessingInput = input.replaceAll(" ", "").toCharArray();

        // System.out.println("preProcessingInput" + Arrays.toString(preProcessingInput));
        int maxOccurred = 0;
        int maxIndex = 0;
        for (char chr : preProcessingInput) {
            // System.out.println(chr -'a');
            ascii[chr - 'a']++;
            if(ascii[chr - 'a'] > maxOccurred) {
                maxOccurred = ascii[chr - 'a'];
                maxIndex = chr - 'a';
            };
        }

        // System.out.println(maxOccurred);

        return Character.toString((char) maxIndex + 'a');
        
        
    }

    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 = " + findMaxOccurredAlphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 = " + findMaxOccurredAlphabet("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 = " + findMaxOccurredAlphabet("best of best youtube"));
    }
}