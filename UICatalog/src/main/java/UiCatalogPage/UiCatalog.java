package UiCatalogPage;

import AlertsPage.Alerts;
import ButtonsPage.Buttons;
import ControlsPage.Controls;
import ImgesPage.Images;
import PickersPage.Picker;
import SearchBarPage.SearchBar;
import SegmentsPage.Segments;
import TextFieldsPage.TextFields;
import TextViewPage.TextView;
import ToolbarPage.Toolbar;
import TransitionsPage.Transitions;
import WebPage.Web;
import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class UiCatalog extends MobileAPI {

    List<WebElement> elements = new ArrayList<WebElement>();

    public void page() {
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//XCUIElementTypeApplication/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell"));
    }

    public Buttons getButtonPage(){
        page();
        elements.get(0).click();
        return new Buttons();
    }
    public Controls getControls(){
        page();
        elements.get(1).click();
        return new Controls();
    }
    public TextFields getTextFields(){
        page();
        elements.get(2).click();
        return new TextFields();
    }
    public SearchBar getSearchBar(){
        page();
        elements.get(3).click();
        return new SearchBar();
    }
    public TextView getTextView(){
        page();
        elements.get(4).click();
        return new TextView();
    }
    public Picker getPickers(){
        page();
        elements.get(5).click();
        return new Picker();
    }
    public Images getImages(){
        page();
        elements.get(6).click();
        return new Images();
    }
    public Web getWeb(){
        page();
        elements.get(7).click();
        return new Web();
    }
    public Segments getSegments(){
        page();
        elements.get(8).click();
        return new Segments();
    }
    public Toolbar getToolbar(){
        page();
        elements.get(9).click();
        return new Toolbar();
    }
    public Alerts getAlerts(){
        page();
        elements.get(10).click();
        return new Alerts();
    }
    public Transitions getTransitions(){
        page();
        elements.get(11).click();
        return new Transitions();
    }

}
