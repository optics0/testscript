package com.mf;

import static org.junit.Assert.*;

import junit.framework.AssertionFailedError;
import org.junit.*;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.report.*;


import com.hp.lft.report.Reporter.*;
import com.hp.lft.verifications.*;

import unittesting.*;

import java.util.concurrent.TimeUnit;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor


    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {


    }


    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void test() throws Exception {

        Browser browser;
        browser = BrowserFactory.launch(BrowserType.CHROME);

        try {

        browser.navigate("http://nimbusserver.aos.com:8000/#/");

        browser.sync();

        browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS Shop Now ")
                .tagName("DIV").build()).click();

        browser.sync();

        browser.describe(Image.class, new ImageDescription.Builder()
                .alt("")
                .tagName("IMG")
                .type(com.hp.lft.sdk.web.ImageType.NORMAL)
                .index(3).build()).click();

        browser.sync();

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("productColor ng-scope")
                .innerText("")
                .tagName("SPAN")
                .index(1).build()).click();

        browser.sync();

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("plus")
                .innerText("")
                .tagName("DIV").build()).click();

        browser.sync();

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build()).click();

        browser.sync();

        browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("2 ")
                .role("link")
                .tagName("A")
                .index(1).build()).click();

        browser.sync();

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("CHECKOUT ($89.98)")
                .tagName("BUTTON").build()).click();

        browser.sync();

            browser.describe(Button.class, new ButtonDescription.Builder()
                    .buttonType("button")
                    .name("REGISTRATION")
                    .tagName("BUTTON").build()).click();

            browser.sync();

        browser.describe(Link.class, new LinkDescription.Builder()
                    .accessibilityName("")
                    .innerText("2 ")
                    .role("link")
                    .tagName("A")
                    .index(1).build()).click();

            browser.sync();

            browser.describe(WebElement.class, new WebElementDescription.Builder()
                    .accessibilityName("")
                    .className("removeProduct iconCss iconX")
                    .innerText("")
                    .tagName("DIV")
                    .index(0).build()).click();

            browser.sync();



         String display_text = browser.describe(WebElement.class, new WebElementDescription.Builder()
                    .className("roboto-bold ng-scope")
                    .tagName("LABEL")
                    .xpath("//DIV[@id=\"shoppingCart\"]/DIV[1]/LABEL[1]").build()).getOuterText();;


        System.out.println("Displayed text is  " + display_text);

            //if (!display_text.contains("CREATE ACCOUNT")) {
              if (!display_text.contains("Your AOS shopping cart is empty")) {

             Assert.fail("Your AOS shopping cart is empty is not displayed the displayed text is " + display_text);
        }

        browser.sync();


        browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("dvantage DEMO ")
                .tagName("A").build()).click();

    }
            catch (AssertionError e)
        {
            // Adds a step to the results report on failure.
            Reporter.reportEvent("Shopping_Cart", "Validation Failed Your AOS shopping cart is empty is not displayed", Status.Failed, e);
            throw e;
        }
 finally
        {
            browser.sync();

            browser.close();
        }

        //  Reporter.reportEvent("Verify_SearchSuggestionsAreOpenUponUserInput", "Failed during validation", Status.Failed);


        }


}




