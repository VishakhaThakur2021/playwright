package myFirstScript;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

//we need to generate binary for chromium,firefox and webkit browser
//either it can generate automatically in first test run or we can install binary via->
//mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="install"
/*command for autogenerate test scripts
1. right click on project folder path copy it and paste it in cmd cd C:\Users\abhay\Desktop\Playwright
2.check mvn -version
3.paste to cmd line -->mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen demo.playwright.dev/todomvc"
* */
public class PlaywrightBasics {

  public static void main(String[] args) {
    Playwright playwright = Playwright.create();
    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();
    page.navigate("http://playwright.dev");
    System.out.println(page.title());
  }
}