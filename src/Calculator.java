public class Calculator {
    public static String calcExp(String[] mathExpArr) throws Exception {
        int num1 = Converter.convInt(mathExpArr[0]);
        int num2 = Converter.convInt(mathExpArr[2]);
        int result = switch (mathExpArr[1]) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Exception("Введен неверный знак");
        };
        return "Ответ: " + result;
    }
    public static String calcRim(String[] mathExpArr) throws Exception {
        String s1 = Converter.convRimToAr(mathExpArr[0]);
        String s2 = Converter.convRimToAr(mathExpArr[2]);
        int num1 = Converter.convInt(s1);
        int num2 = Converter.convInt(s2);
        int result = switch (mathExpArr[1]) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Exception("Введен неверный знак");
        };
        if(result > 0){
            return "Ответ: " + Converter.convArToRim(result);
        }
        else{
            throw new Exception("В римской системе нет отрицательных чисел!");
        }
    }
}
