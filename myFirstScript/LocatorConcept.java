package myFirstScript;

import com.microsoft.playwright.*;

public class LocatorConcept {
  public static void main(String[] args) {
    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

    //locators
    BrowserContext br1 = browser.newContext();
    Page p1 = br1.newPage();
    p1.navigate("https://phptravels.com/demo/");
    //  Locator loc =p1.locator("role=button").first();
    Locator loc = p1.locator("text=Demo");
    //   int num = loc.count(); to check no of counts for that locator
    //  System.out.println(num);
    for (int i = 0; i < loc.count(); i++) {
      String text = loc.nth(i).textContent();
      if (text.contains("PHPTRAVELS Demo")) {
        System.out.println("header is present");
      }
    }
    String text = p1.locator("'TRAVEL TECHNOLOGY PARTNER'").first().textContent();
    System.out.println(text);
  }
}