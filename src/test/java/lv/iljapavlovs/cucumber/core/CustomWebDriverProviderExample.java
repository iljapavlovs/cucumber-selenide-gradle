//package lv.iljapavlovs.core;
//
//
//import com.codeborne.selenide.WebDriverProvider;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import static DriverType.FIREFOX;
//
//public class CustomWebDriverProviderExample implements WebDriverProvider {
//
//    private WebDriver webdriver;
//    private DriverType selectedDriverType;
//
//    private final DriverType defaultDriverType = FIREFOX;
//    private final String browser = System.getProperty("browserType", defaultDriverType.toString()).toUpperCase();
//    private final boolean useRemoteWebDriver = Boolean.getBoolean("remoteDriver");
//    private final String operatingSystem = System.getProperty("os.name").toUpperCase();
//    private final String systemArchitecture = System.getProperty("os.arch");
//
//    @Override
//    public WebDriver createDriver(DesiredCapabilities capabilities) {
//        determineEffectiveDriverType();
//        DesiredCapabilities desiredCapabilities = selectedDriverType.getDesiredCapabilities(proxy);
//        return instantiateDriverObject(desiredCapabilities);
//
//    }
//
//    private void determineEffectiveDriverType() {
//        DriverType driverType = defaultDriverType;
//        try {
//            driverType = DriverType.valueOf(browser);
//        } catch (IllegalArgumentException ignored) {
//            System.err.println("Unknown driver specified, defaulting to '" + driverType + "'...");
//        } catch (NullPointerException ignored) {
//            System.err.println("No driver specified, defaulting to '" + driverType + "'...");
//        }
//        selectedDriverType = driverType;
//    }
//
//
//    private WebDriver instantiateDriverObject(DesiredCapabilities desiredCapabilities) {
//        System.out.println(" ");
//        System.out.println("Current Operating System: " + operatingSystem);
//        System.out.println("Current Architecture: " + systemArchitecture);
//        System.out.println("Current Browser Selection: " + selectedDriverType);
//        System.out.println(" ");
//
//        if (useRemoteWebDriver) {
//            URL seleniumGridURL = null;
//            try {
//                seleniumGridURL = new URL(System.getProperty("gridURL"));
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//            String desiredBrowserVersion = System.getProperty("desiredBrowserVersion");
//            String desiredPlatform = System.getProperty("desiredPlatform");
//
//            if (null != desiredPlatform && !desiredPlatform.isEmpty()) {
//                desiredCapabilities.setPlatform(Platform.valueOf(desiredPlatform.toUpperCase()));
//            }
//
//            if (null != desiredBrowserVersion && !desiredBrowserVersion.isEmpty()) {
//                desiredCapabilities.setVersion(desiredBrowserVersion);
//            }
//
//            return new RemoteWebDriver(seleniumGridURL, desiredCapabilities, desiredCapabilities);
//        } else {
//            return selectedDriverType.getWebDriverObject(desiredCapabilities);
//        }
//    }
//
//
//}
