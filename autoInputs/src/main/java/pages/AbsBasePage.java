package pages;

import annotations.Path;
import commons.AbsCommon;
import exceptions.PathPageNotFoundException;
import org.openqa.selenium.WebDriver;

public abstract class AbsBasePage<T> extends AbsCommon {

    private String baseUrl = System.getProperty("base.url");

    public AbsBasePage(WebDriver driver) {
        super(driver);
    }

    private String getPath() {
        Class clazz = this.getClass();
        if (clazz.isAnnotationPresent(Path.class)) {
            Path path = (Path) clazz.getDeclaredAnnotation(Path.class);
            return path.value();
        }

        throw new PathPageNotFoundException(clazz);
    }

    public T open() {
        driver.get(baseUrl + getPath());

        return (T)this;
    }
}
