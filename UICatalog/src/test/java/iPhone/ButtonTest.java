package iPhone;

import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by mrahman on 9/5/15.
 */
public class ButtonTest extends NavigateUi {

    //@Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getButtonPage();

    }

}
