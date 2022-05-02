public class Main {


    public static void main(String[] args) {
        String input = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.";
        BrainFuckDecoder brainFuckDecoder = new BrainFuckDecoder();
        String output = brainFuckDecoder.decode(input, 10000);
        System.out.println(output);

    }
}
