package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private static final BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", config.userName());
        caps.setCapability("browserstack.key", config.accessKey());
        caps.setCapability("device", config.androidDevice());
        caps.setCapability("os_version", config.androidVersion());
        caps.setCapability("app", config.app());
        caps.setCapability("project", "Wikipedia Project");
        caps.setCapability("build", "browserstack-build");
        caps.setCapability("name", "Wikipedia Tests");

        try {
            return new RemoteWebDriver(new URL(config.url()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
