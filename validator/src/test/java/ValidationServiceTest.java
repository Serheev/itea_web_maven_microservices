import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ValidationServiceTest {
    private String[] strings;

    @Test
    public void eachPhoneNumbersShouldBeTrue() {
        strings = new String[]{"0637662314", "(063)7662314", "063-766-2314", "(063)7662314"};
        Arrays.asList(strings).stream().forEach(n -> assertEquals(true, new ValidationService().isValidCellPhone(n)));
    }

    @Test
    public void eachEmailShouldBeTrue() {
        strings = new String[]{"name@domain.com", "n@domain.com", "n@d.co", "n@d.co.uk"};
        Arrays.asList(strings).stream().forEach(n -> assertEquals(true, new ValidationService().isValidEmail(n)));
    }
}