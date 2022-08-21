import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        if(in.hasNextLine()) {
            System.out.println(calc(in.nextLine()));
        }
        else {
            throw new Exception("Введены некорректные данные!");
        }
        in.close();
    }
    public static String calc(String input) throws Exception {
        String[] mathExpArr  = input.split(" ");
        if(mathExpArr.length != 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию!");
        }
        else if(Check.isRim(mathExpArr[0]) && Check.isRim(mathExpArr[2])){
            return Calculator.calcRim(mathExpArr);
        }
        else if(Check.isRim(mathExpArr[0]) && !Check.isRim(mathExpArr[2])){
            throw new Exception("Используются одновременно разные системы счисления");
        }
        else if(!Check.isRim(mathExpArr[0]) && Check.isRim(mathExpArr[2])){
            throw new Exception("Используются одновременно разные системы счисления");
        }
        else if(Check.isInt(mathExpArr[0]) && Check.isInt(mathExpArr[2])) {
            return Calculator.calcExp(mathExpArr);
        }
        else if(Check.isInt(mathExpArr[0]) && !Check.isInt(mathExpArr[2])) {
            throw new Exception("Число должно быть больше 0 и меньше 11");
        }
        else if(!Check.isInt(mathExpArr[0]) && Check.isInt(mathExpArr[2])) {
            throw new Exception("Число должно быть больше 0 и меньше 11");
        }
        else {
            throw new Exception("Введено неверное выражение!");
        }
    }
}