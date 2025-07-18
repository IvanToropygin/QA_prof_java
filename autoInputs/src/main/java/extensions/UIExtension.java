package extensions;

import com.google.inject.Guice;
import com.google.inject.Injector;
import modules.PageGuiceModule;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIExtension implements BeforeEachCallback, AfterEachCallback {

    private Injector injector;
    @Override
    public void afterEach(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        WebDriver driver = new ChromeDriver();
        injector = Guice.createInjector(new PageGuiceModule(driver));
        injector.injectMembers(context.getTestInstance().get());
    }
}
