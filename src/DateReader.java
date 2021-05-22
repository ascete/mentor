import java.util.Scanner;

class DataReader {

    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private char operation;
    private boolean exitFlag;
    private char exitCharacter;


    public DataReader(char exitCharacter) {
        this.exitCharacter = exitCharacter;

    }


    public void read() {
        String arab = "1 2 3 4 5 6 7 8 9 10";
        String roman = "I II III IV V VI VII VIII IX X";
        System.out.println("Введите выражение, состоящее из двух целых чисел от 0 до 10");
        Scanner scanner = new Scanner(System.in);
        //StringBuilder builder = new StringBuilder();
        String text = scanner.nextLine();
        if (text.indexOf(exitCharacter) != -1) {
            exitFlag = true;
            return;
        }

        try {

            String text2 = text.replaceAll("\\s+","");// убераем лишние знаки
            String[] blocks = text2.split("[+-/*]");//выделяем цифры


            // проверяем, входит ли строка blocks в массив строк массива "roman"

            if(roman.contains(blocks[0]) & roman.contains(blocks[1])){
                    number3 = romanToNumber(blocks[0]);
                    number4 = romanToNumber(blocks[1]);

            }
            else if(arab.contains(blocks[0]) & arab.contains(blocks[1])){
                    number1 = Integer.parseInt(blocks[0]);
                    number2 = Integer.parseInt(blocks[1]);
                }
            else {
                System.exit(0);
            }
            operation = text2.charAt(blocks[0].length());
            if ((number1 > 10 || number1 < 0) || (number2 > 10 || number2 < 0)) {
                throw new IllegalArgumentException();
            }
        }
        catch (RuntimeException e) {
            throw new IllegalArgumentException("Неверный формат данных");

        }
    }
    //переводим римские цифры в арабские
    private static int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        } else {
            return -1;
        }
    }

    public int getVar1() {
        return number1;
    }

    public int getVar2() {
        return number2;
    }
    public int getVar3() {
        return number3;
    }

    public int getVar4() {
        return number4;
    }
    public char getOper() {
        return operation;
    }

    public boolean isExitFlag() {
        return exitFlag;
    }
}
