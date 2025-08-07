package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:emulation.properties"
})

public interface EmulationConfig extends Config {

    @Key("emulation.url")
    String url();

    @Key("emulation.platformName")
    String platformName();

    @Key("emulation.deviceName")
    String device();

    @Key("emulation.version")
    String version();

    @Key("emulation.appPackage")
    String appPackage();

    @Key("emulation.appActivity")
    String appActivity();

    @Key("emulation.automationName")
    String automationName();

    @Key("emulation.app.path")
    String appPath();
}
