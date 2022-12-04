package Junit.RenaTest;

import Junit.MarynasTest.BaseTestForComboStringTest;
import UserStories_String.comboString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class comboStringTest extends BaseTestForComboStringTest {
    comboString cs;

    @Before
    public void setUp() {
        cs = new comboString();
        System.out.println("Here we should pre-req for out test");
    }

    @After
    public void cleanUp() {
        System.out.println("Here we are cleaning up after our test");
    }

    private final String str1;
    private final String str2;
    private final String expectedResult;

    public comboStringTest(String str1, String str2, String expectedResult) {
        this.str1 = str1;
        this.str2 = str2;
        this.expectedResult = expectedResult;

        @Test
        public void comboStringMethodFunctionality() {
            String actualResult = cs.comboString(str1, str2);
            String message = "expected=" + expectedResult + "actual=" + actualResult;
            Assert.assertEquals(message, expectedResult, actualResult);
        }

        @Parameterized.Parameters(name = "Running with {str1} and {str2} data and expecting {expectedResult}")
        public static String[][] supplyData() {
            return new String[][]{
                    {"Hello", "hi", "hiHellohi"},
                    {"hi", "Hello", "hiHellohi"},
                    {"aaa", "b", "baaab" }
            };
        }
    }
}


