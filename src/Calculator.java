


 class Calculator {

    public static int calculate(int number1, int number2, char operation) {
        int result ;
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
                System.out.println(result);
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
    public static Romm calculate2(int number3, int number4, char operation) {
        int resultrom;
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
                //System.out.println(resultrom);
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
         return Romm.values()[resultrom-1];
    }
}