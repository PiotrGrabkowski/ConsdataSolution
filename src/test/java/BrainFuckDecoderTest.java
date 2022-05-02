
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrainFuckDecoderTest {

    @Test
    void shouldReturnHelloWorld(){
        //given
        String input ="++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.";
        String expectedOutput = "Hello World!";
        BrainFuckDecoder brainFuckDecoder = new BrainFuckDecoder();

        //when
        String output = brainFuckDecoder.decode(input, 10000);
        //then
        assertEquals(expectedOutput, output);

    }
}
