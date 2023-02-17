/*
* Author: Abd Al-Rahman Odeh.
* Id:2036664
* */
public class PasswordValidator {
    public static  boolean isValidLength(String password){
        return password.length() >= 5 && password.length() <= 10;
    }
    public static boolean isFirstCharactetAlpha(String password){
        char firstCharacter = password.charAt(0);
        return (firstCharacter >= 'a' && firstCharacter <= 'z') ||
               (firstCharacter >= 'A' && firstCharacter <= 'Z');
    }
}
