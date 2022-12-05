package Junit.RenaTest;

import UserStories_String.comboString;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ComboStringTest {

    private String str1;
    private String str2;
    private String expectedResult;
    ComboString cs;

    @BeforeAll
    public void setUp() {
        cs = new ComboString();
        System.out.println("Here we should pre-req for out test");
    }

    public ComboStringTest(String str1, String str2, String expectedResult) {
        this.str1 = str1;
        this.str2 = str2;
        this.expectedResult = expectedResult;
    }

    @Test
    public void comboStringMethodFunctionality() {
        String actualResult = cs.comboString(str1, str2);
        String message = "expected=" + expectedResult + "actual=" + actualResult;
        Assert.assertEquals(message, expectedResult, actualResult);
    }

    @Parameterized.Parameters()
    public static String[][] supplyData() {
        return new String[][]{
                {"Hello", "hi", "hiHellohi"},
                {"hi", "Hello", "hiHellohi"},
                {"aaa", "b", "baaab"}
        };
    }

    @AfterAll
    public void cleanUp() {
        System.out.println("Here we are cleaning up after our test");
    }
}
