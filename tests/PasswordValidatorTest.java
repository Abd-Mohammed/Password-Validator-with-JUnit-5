/*
 * Author: Abd Al-Rahman Odeh.
 * Id:2036664
 * */

import static org.junit.Assert.*;
import org.junit.*;

public class PasswordValidatorTest {

    @Before
    public void setUp(){
        System.out.println("This is a setup method");
    }
    @After
    public void tearDown(){
        System.out.println("This is a tear-down method");
    }

    @Test
    public void testPasswordLength(){
        assertEquals(true , PasswordValidator.isValidLength("abd1234"));
    }
    @Test
    public void testFirstCharacter(){
        assertEquals(true , PasswordValidator.isFirstCharactetAlpha("abd1234"));
    }
}
