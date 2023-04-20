package myFirstScript;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
          .setHeadless(false));
      BrowserContext context = browser.newContext();

      //context tracing helps to get the screenshots at every step, it should be before page method and after browser is opened
      context.tracing().start(new Tracing.StartOptions()
          .setScreenshots(true)
          .setSnapshots(true));


      Page page = context.newPage();
      page.navigate("https://playwright.dev/java/docs/codegen");
      page.getByRole(AriaRole.NAVIGATION, new Page.GetByRoleOptions().setName("Breadcrumbs")).getByText("Test Generator").click();
      page.getByRole(AriaRole.NAVIGATION, new Page.GetByRoleOptions().setName("Breadcrumbs")).getByText("Test Generator").click();
      page.getByRole(AriaRole.NAVIGATION, new Page.GetByRoleOptions().setName("Breadcrumbs")).getByText("Guides").click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Installation")).click();
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Actions")).click();
      page.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Getting StartedInstallationWriting TestsRunning TestsTest GeneratorTrace ViewerT")).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Test Generator")).click();

      //below code will create a zip file after pom.xml with can be open via command
      // Go to project folder in cmd and paste mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="show-trace trace.zip"
      context.tracing().stop(new Tracing.StopOptions()
          .setPath(Paths.get("trace.zip")));
    }
  }
}
