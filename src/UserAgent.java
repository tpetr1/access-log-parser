public class UserAgent {
    final String os;
    final String browser;

    public UserAgent(String str) {
        String browser1 = null;
        String os1 = null;
        int indexFirefox = str.indexOf("Firefox/");
        int indexChrome = str.indexOf("(KHTML, like Gecko)");
        int indexOpera = str.indexOf("OPR/");
        int indexOperaPresto = str.indexOf("Presto/");
        int indexEdge = str.indexOf("Edge/");
        int indexSafari = str.indexOf("Safari/");
        int indexMobile = str.indexOf("Mobile/");
        int indexMac = str.indexOf("Mac OS");
        int indexWin = str.indexOf("(Windows");
        int indexLinux = str.indexOf("Linux");
        if (indexFirefox != -1) browser1 = "Firefox";
        if (indexChrome != -1 && indexSafari != -1 && indexEdge == -1 && indexMobile == -1) browser1 = "Chrome";
        if (indexOpera != -1 || indexOperaPresto != -1) browser1 = "Opera";
        if (indexChrome != -1 && indexEdge != -1) browser1 = "Edge";
        if (indexChrome != -1 && indexSafari != -1 && indexMobile != -1) browser1 = "Safari";
        browser = browser1;
        if (indexWin != -1) os1 = "Windows";
        if (indexLinux != -1) os1 = "Linux";
        if (indexMac != -1) os1 = "Mac OS";
        os = os1;
    }

    public String getOs() {
        return os;
    }

    public String getBrowser() {
        return browser;
    }
}
