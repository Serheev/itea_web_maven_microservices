import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationService {

    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    private static final String CELLPHONE_REGEX = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";

    private static Pattern pattern;
    private Matcher matcher;

    public boolean isValidCellPhone(String phoneNumber) {
        pattern = Pattern.compile(CELLPHONE_REGEX);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean isValidEmail(String email) {
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
