


 class Calculator {

    public static int calculate(int number1, int number2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
    public static Romm calculate2(int number3, int number4, char operation) {
        int resultrom = 0;
        switch (operation) {
            case '+':
                resultrom = number3 + number4;
                break;
            case '-':
                resultrom = number3 - number4;
                break;
            case '*':
                resultrom = number3 * number4;
                break;
            case '/':
                resultrom = number3 / number4;
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
         return Romm.values()[resultrom-1];
    }
}