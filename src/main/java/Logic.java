public class Logic {
    public int sum(int input, int input2) {
        return input + input2;
    }

    public int subtract(int input, int input2) {
        return input - input2;
    }

    public int multiply(int input, int input2) {
        return input * input2;
    }

    public int divide(int input, int input2) {
        return input / input2;
    }

    public int square(int input) {
        return input * input;
    }

    public int factorial(int input) {
        int num = 1;
        for (int i = 2; i <= input; i++) {
            num = num * i;
        }
        return num;
    }
}