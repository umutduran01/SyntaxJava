package class25.Class25Homework;

public interface WebDriver {

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver implements WebDriver {

    public void openBrowser() {
        System.out.println("Chrome opens...");
    }

    ;

    public void closeBrowser() {
        System.out.println("Chrome closes...");
    }

    ;

    public void maximizeWindow() {
        System.out.println("Chrome to maximize...");
    }

    ;

    public void findElement() {
        System.out.println("Chrome searches...");
    }

    ;


}

class FirefoxDriver implements WebDriver {

    public void openBrowser() {
        System.out.println("Firefox opens...");
    }

    ;

    public void closeBrowser() {
        System.out.println("Firefox closes...");
    }

    ;

    public void maximizeWindow() {
        System.out.println("Firefox to maximize...");
    }

    ;

    public void findElement() {
        System.out.println("Firefox searches...");
    }

    ;

}
