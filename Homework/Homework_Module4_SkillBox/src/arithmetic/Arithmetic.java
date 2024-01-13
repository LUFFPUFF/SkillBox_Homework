package arithmetic;

public class Arithmetic {

    private final int number1;
    private final int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {
        return number1 + number2;
    }

    public int multiplication() {
        return number1 * number2;
    }

    //Я бы использовать Math.max()
    public int max() {
        if (number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    //Я бы использовал Math.min()
    public int min() {
        if (number1 <= number2) {
            return number1;
        } else {
            return number2;
        }
    }
}
