import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.io.PrintStream;

@ExtendWith(MockitoExtension.class)
public class FizzBuzzTest {

    @Test
    void test_multiple_of_three(){
        FizzBuzz fizzBuzz = new FizzBuzz(3, System.out);
        Assertions.assertThat(fizzBuzz.getFizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    void test_multiple_of_five() {
        FizzBuzz fizzbuzz = new FizzBuzz(5, System.out);
        Assertions.assertThat(fizzbuzz.getFizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    void test_for_no_multiple() {
        FizzBuzz fizzbuzz = new FizzBuzz(7, System.out);
        Assertions.assertThat(fizzbuzz.getFizzBuzz(7)).isEqualTo("7");
    }

    @Mock
    PrintStream printStream;
    @Test
    void test_print_all() {
        FizzBuzz fizzBuzz = new FizzBuzz(15, printStream);
        fizzBuzz.printAll();
        verify(printStream, times(1)).println("FizzBuzz");
        verify(printStream, times(4)).println("Fizz");
        verify(printStream, times(2)).println("Buzz");
    }

}
