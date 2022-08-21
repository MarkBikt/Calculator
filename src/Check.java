public class Check {
    public static boolean isInt(String mathExpArr){
        try {

            return Integer.parseInt(mathExpArr) > 0 && Integer.parseInt(mathExpArr) < 11;
        }
        catch (NumberFormatException e){
            return  false;
        }
    }
    public  static  boolean isRim(String mathExpArr){

        return switch (mathExpArr) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> true;
            default -> false;
        };
    }
}
