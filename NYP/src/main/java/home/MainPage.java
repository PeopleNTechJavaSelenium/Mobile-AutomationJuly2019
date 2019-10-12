package home;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open menu']")
    public WebElement btnBurger;
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtPageHeading;
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button")
    List<WebElement> alertTendingNews = new ArrayList<>();
    //hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]
    @FindBy(xpath = "//android.view.ViewGroup[2]")
    public WebElement news;
    @FindBy(xpath = "//android.view.ViewGroup[3]")
    public WebElement metro;
    @FindBy(xpath = "//android.view.ViewGroup[6]")
    public WebElement business;
    @FindBy(xpath = "//android.view.ViewGroup[7]")
    public WebElement opinion;
    @FindBy(xpath = "//android.view.ViewGroup[8]")
    public WebElement entertainment;
    @FindBy(xpath = "//android.view.ViewGroup[9]")
    public WebElement fashion;
    @FindBy(xpath = "//android.view.ViewGroup[10]")
    public WebElement living;
    @FindBy(xpath = "//android.view.ViewGroup[11]")
    public WebElement media;
    @FindBy(xpath = "//android.view.ViewGroup[12]")
    public WebElement tech;
    String mainMenuArr[] = {"LATEST STORIES","NEWS","METRO","PAGE SIX","SPORTS","BUSINESS","OPINION","ENTERTAINMENT","FASHION","LIVING","MEDIA","TECH","REAL ESTATE","PHOTOS","VIDEO","ABOUT"};

    public void setAlertTendingNews(String condition) {
        if (alertTendingNews.get(0).isDisplayed()) {
            switch (condition) {
                case "yes":
                    alertTendingNews.get(0).click();
                    break;
                case "no":
                    alertTendingNews.get(1).click();
                    break;
            }
        }
    }

    public void getMenu(){
        btnBurger.click();
    }

    public void getTopStories(){
        getMenu();
        scrollAndClickByName(mainMenuArr[0]);
    }
    public void getSavedArticles(){
        getMenu();
        scrollAndClickByName(mainMenuArr[1]);
    }
    public void getNews(){
        getMenu();
        clickByXpathWebElement(news);
    }
    public void getMetro(){
        getMenu();
        clickByXpathWebElement(metro);
    }
    public void getPageSix(){
        getMenu();
        scrollAndClickByName(mainMenuArr[4]);
    }
    public void getSports(){
        getMenu();
        scrollAndClickByName(mainMenuArr[5]);
    }
    public void getBusiness(){
        getMenu();
        clickByXpathWebElement(business);
    }
    public void getOpinion(){
        getMenu();
        clickByXpathWebElement(opinion);
    }
    public void getEntertainment(){
        getMenu();
        clickByXpathWebElement(entertainment);
    }
    public void getFashion(){
        getMenu();
        clickByXpathWebElement(fashion);
    }
    public void getLiving(){
        getMenu();
        clickByXpathWebElement(living);
    }
    public void getMedia(){
        getMenu();
        clickByXpathWebElement(media);
    }
    public void getTech(){
        getMenu();
        clickByXpathWebElement(tech);
    }
    public void getRealEstate(){
        getMenu();
        scrollAndClickByName(mainMenuArr[13]);
        Assert.assertTrue(txtPageHeading.getText().contains("REAL ESTATE"));
    }
    public void getPhotots(){
        getMenu();
        scrollAndClickByName(mainMenuArr[14]);
        Assert.assertTrue(txtPageHeading.getText().contains("PHOTOS"));
    }
    public void getVideo(){
        getMenu();
        scrollAndClickByName(mainMenuArr[15]);
        Assert.assertTrue(txtPageHeading.getText().contains("VIDEO"));
    }
    public void getAbout() {
        getMenu();
        scrollAndClickByName(mainMenuArr[16]);
    }

    public void goToArticles(){
        getBusiness();
        getEntertainment();
        getFashion();
        getMetro();
        getNews();
        getOpinion();
        getTech();
        getMedia();
    }
}

