package ipad;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 9/5/15.
 */
public class HomePage extends MobileAPI {

    @Test
    public void testName() throws Exception {

    }

    @Test
    public void home()throws InterruptedException{

        List<WebElement> elements = new ArrayList<WebElement>();
        sleep(1);
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]"));
        sleep(1);

        for(int i=1; i<elements.size(); i++){
            clickByXpathWebElement(elements.get(i));
            sleep(2);
            clickByXpath(" //UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+i+"]");
    }
    }
}
