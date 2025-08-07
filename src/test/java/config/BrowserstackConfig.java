package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config {

    @Key("browserstack.url")
    String url();

    @Key("browserstack.userName")
    String userName();

    @Key("browserstack.accessKey")
    String accessKey();

    @Key("browserstack.app")
    String app();

    @Key("android.device")
    String androidDevice();

    @Key("android.version")
    String androidVersion();
}
