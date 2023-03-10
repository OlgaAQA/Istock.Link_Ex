package helpers;

import io.qameta.allure.Attachment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllureAttachments {
    public static final Logger LOGGER = LoggerFactory.getLogger(AllureAttachments.class);

    @Attachment(value = "{attachName}", type = "text/plain")
    private static String addMessage(String attachName, String text) {
        return text;
    }

    public static void addBrowserConsoleLogs() {
        addMessage("Browser console logs", DriverUtils.getConsoleLogs());
    }

    @Attachment(value = "{attachName}", type = "image/png")
    public static byte[] addScreenshotAs(String attachName) {
        return DriverUtils.getScreenshotAsBytes();
    }

    @Attachment(value = "Page source", type = "text/html")
    public static byte[] addPageSource() {
        return DriverUtils.getPageSourceAsBytes();
    }





//    @Attachment(value = "Video", type = "text/html", fileExtension = ".html")
//    public static String addVideo() {
//        return "<html><body><video width='100%' height='100%' controls autoplay><source src='"
//                + getVideoUrl()
//                + "' type='video/mp4'></video></body></html>";
//    }
//
//    public static URL getVideoUrl() {
//        String videoUrl = "http://62.113.110.235:8080/video/" + getSessionId() + ".mp4";
//        System.out.println("!!!!!!!!! "+videoUrl);
//        try {
//            return new URL(videoUrl);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static String getSessionId() {
//        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
//    }



}
