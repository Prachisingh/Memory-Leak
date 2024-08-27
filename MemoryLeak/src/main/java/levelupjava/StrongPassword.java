package levelupjava;

public class StrongPassword {

    public static void main(String[] args) {

        System.out.println(isPwdStrong("12aBcs"));
    }

    private static boolean isPwdStrong(String password) {
//        if (password.length() < 6) {
//            return false;
//        }
//        boolean upperCase = false;
//        boolean loweCase = false;
//        boolean isNumber = false;
//
//        for (int i = 0; i < password.length() && (!upperCase || !loweCase || !isNumber) ; i++) {
//
//            Character character = password.charAt(i);
//            if(Character.isUpperCase(character)){
//                upperCase = true;
//            }
//            if(Character.isLowerCase(character)){
//                loweCase = true;
//            }
//            if(Character.isDigit(character)){
//                isNumber = true;
//            }
//        }
//        return upperCase && loweCase && isNumber;

        return password.length() >= 6 && password.matches(".*\\d.*")
                                 && password.matches(".*[a-z].*")
                                 && password.matches(".*[A-Z].*");


    }
}
