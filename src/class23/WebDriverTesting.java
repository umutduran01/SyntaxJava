package class23;

public class WebDriverTesting {
    public static void main(String[] args) {

        Chrome googleChrome = new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        Safari safari = new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        Firefox firefox = new Firefox();
        firefox.startBrowser();
        firefox.openURL();
        firefox.testLoginPage();
        firefox.closeBrowser();

        //This is too much work to handle.

        WebDriver webDriver1 = new Chrome(); //We only changed the object. We can change the browser again.
        webDriver1.startBrowser();
        webDriver1.openURL();
        webDriver1.testLoginPage();
        webDriver1.closeBrowser();

        //Here we still get the result from Chrome class because the object is from Chrome class.
        //We store the child class object to parent class variable. - Polymorphism

        WebDriver webDriver2 = new Safari(); //We changed the object here. - Up Casting
        webDriver2.startBrowser();
        webDriver2.openURL();
        webDriver2.testLoginPage();
        webDriver2.closeBrowser();

        //To automize objects, we can create a parent class array and store the object there.

        //Parent class variable can hold child class object. - Down casting

        WebDriver[] browsers = {new Chrome(), new Safari(), new Firefox()};

        //Array of parent class can hold the object of all child classes.

        for (WebDriver browser : browsers
        ) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }


    }
}
