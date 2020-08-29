import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean firstName = UserRegistration.validInputName("Palvi");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        boolean firstName =UserRegistration.validInputName("Ab");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean lastName = UserRegistration.validInputName("Sawant");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenLastName_WhenImproper_ShouldReturnFalse() {
        boolean lastName =UserRegistration.validInputName("Sawant9");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abc@gail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_WhenImproper_ShouldReturnFalse() {
        boolean emailId = UserRegistration.validateEmailId("abcgail.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 8605863744");
        Assert.assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_WhenImproper_ShouldReturnFalse() {
        boolean mobileNumber = UserRegistration.validateMobileNumber("91 18605863744");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void givenEightCharacterLongPassword_WhenProper_ShouldReturnTrue() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validateEightCharacterLongPassword("palvisawant");
        Assert.assertTrue(passwordAtLeastEightCharacterLong);
    }

    @Test
    public void givenEightCharacterLongPassword_WhenImProper_ShouldReturnFalse() {
        boolean passwordAtLeastEightCharacterLong = UserRegistration.validateEightCharacterLongPassword("root");
        Assert.assertFalse(passwordAtLeastEightCharacterLong);
    }

}
