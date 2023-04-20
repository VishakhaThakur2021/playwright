package myFirstScript;

import com.microsoft.playwright.*;

public class BrowserContextConcept {

  public static void main(String[] args) {
    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

    BrowserContext br1 = browser.newContext();
    Page page1 = br1.newPage();
    page1.navigate("https://www.orangehrm.com/");
    System.out.println(page1.title());

    BrowserContext br2 = browser.newContext();
    Page page2 = br2.newPage();
    page2.navigate("https://phptravels.com/demo/");
    System.out.println(page2.title());

    page1.close(); //for closing page
    br1.close();//for closing browser


    page2.close();
    br2.close();


  }
}