package baseball.common;

public class Validator {

    public static void isValidation(String input) throws IllegalAccessException {
        if(input.length() > 3 || input.length() < 3) throw new IllegalAccessException(Const.LIST_SIZE_ERROR_MSG);
        if(input == null || input.trim().equals("")) throw new IllegalAccessException(Const.VALUE_NULL_MSG);
    }
}
