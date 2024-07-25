package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoPage;

public class DemoTest {
    @Test(groups = {"regression"})
    public void regressionTest() {
        boolean isEven = DemoPage.isEvenNumber(2);
        Assert.assertTrue(isEven);
        System.out.println(2 + " is even number");
    }

    @Test(groups = {"smoke"})
    public void smokeTest() {
        boolean isEven = DemoPage.isEvenNumber(5);
        Assert.assertFalse(isEven);
        System.out.println(5 + " is odd number");
    }
}