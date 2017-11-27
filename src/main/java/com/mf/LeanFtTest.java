package com.mf;

import static org.junit.Assert.*;

import org.junit.*;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.report.*;


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
    public void test() throws GeneralLeanFtException, InterruptedException {

        Browser browser;
        browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.navigate("http://nimbusserver.aos.com:8000/#/");

        browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS Shop Now ")
                .tagName("DIV").build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Image.class, new ImageDescription.Builder()
                .alt("")
                .tagName("IMG")
                .type(com.hp.lft.sdk.web.ImageType.NORMAL)
                .index(3).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("productColor ng-scope")
                .innerText("")
                .tagName("SPAN")
                .index(1).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("plus")
                .innerText("")
                .tagName("DIV").build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("2 ")
                .role("link")
                .tagName("A")
                .index(1).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("CHECKOUT ($89.98)")
                .tagName("BUTTON").build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("button")
                .name("REGISTRATION")
                .tagName("BUTTON").build()).click();

        TimeUnit.SECONDS.sleep(2);

        String display_text=browser.describe(WebElement.class, new WebElementDescription.Builder()
                .tagName("H3")
                .xpath("//SECTION[@id=\"registerPage\"]/ARTICLE[1]/H3[1]").build()).getOuterText();


        System.out.println("Displayed text is  "  + display_text);

        if (!display_text.contains("CREATE ACCOUNT")) {
            //System.out.println("Displayed text is"  + display_text);
            Assert.fail("MSN page is not displayed Displayed text is  "  + display_text);
        }

        TimeUnit.SECONDS.sleep(2);

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("")
                .innerText("")
                .tagName("DIV")
                .index(6).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("")
                .innerText("2 ")
                .role("link")
                .tagName("A")
                .index(1).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(WebElement.class, new WebElementDescription.Builder()
                .accessibilityName("")
                .className("removeProduct iconCss iconX")
                .innerText("")
                .tagName("DIV")
                .index(0).build()).click();

        TimeUnit.SECONDS.sleep(2);

        browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("dvantage DEMO ")
                .tagName("A").build()).click();



        browser.close();
    }



}