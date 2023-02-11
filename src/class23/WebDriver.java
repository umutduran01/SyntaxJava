package class23;

public class WebDriver {

    //Dynamic Polymorphism - With method overriding

    public void startBrowser() {
        System.out.println("Starting the browser");
    }

    public void openURL() {
        System.out.println("Opening an URL");
    }

    public void testLoginPage() {
        System.out.println("Checking if login page works");
    }

    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver {

    @Override
    public void startBrowser() {
        System.out.println("Starting Google Chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Google Chrome");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari");
    }
}

class Firefox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL on Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page in Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox");
    }
}