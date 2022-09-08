import java.io.PrintStream;

public class FizzBuzz {

    private final int num;

    /** print data to output */
    private final PrintStream printStream;

    public FizzBuzz(int num, PrintStream printStream) {
        this.num = num;
        this.printStream = printStream;
    }

    private boolean isDivideBy(int dividend, int divisor){
        return dividend % divisor == 0;
    }

    public String getFizzBuzz(int input){
        if(isDivideBy(input, 3) && isDivideBy(input,5)){
            return "FizzBuzz";
        }
        if (isDivideBy(input, 3)) {
            return "Fizz";
        }
        if (isDivideBy(input, 5)) {
            return "Buzz";
        }
        return "" + input;
    }

    public void printAll(){
        for(int i = 1; i <= num; i++){
            printStream.println(getFizzBuzz(i));
        }
    }
}
