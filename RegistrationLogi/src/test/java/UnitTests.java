import com.mycompany.registrationlogi.Login;
import com.mycompany.registrationlogi.Registration;
import static org.junit.Assert.*;
import org.junit.Test;

public class UnitTests {
    
    Registration registration = new Registration();
    Login login = new Login();
    
    
    public void testCheckUserName() {
        assertTrue(registration.checkUserName("kyl_1"));
        assertFalse(registration.checkUserName("kyle!!!!!!!"));
    }
    
    
    public void testCheckPasswordComplexity() {
        assertTrue(registration.checkPasswordComplexity("Ch&&sec@ke99!"));
        assertFalse(registration.checkPasswordComplexity("password"));
    }
    
    
    public void testRegisterUser() {
        assertEquals("User registered successfully.", registration.registerUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe"));
        assertEquals("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters in length.", registration.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!", "John", "Doe"));
        assertEquals("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.", registration.registerUser("kyl_1", "password", "John", "Doe"));
    }
    
    
    public void testLoginUser() {
        assertTrue(login.loginUser("test_user", "Test@123"));
        assertFalse(login.loginUser("invalid_user", "InvalidPassword"));
    }
}
