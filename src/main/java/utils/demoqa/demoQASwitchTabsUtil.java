package utils.demoqa;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class demoQASwitchTabsUtil {
    /*
     * This method gets all window handles then switches the window tab by index number
     */
        public  List<String> TABS;
        public void openNewWindow(){
            Selenide.switchTo().newWindow(WindowType.WINDOW);
        }

        public void switchTab(int TAB_INDEX_NUMBER){
            Set<String> handles = getWebDriver().getWindowHandles();
            TABS = new ArrayList<>(handles);
            switchTo().window(TABS.get(TAB_INDEX_NUMBER));
        }

        public void switchWindow(int WINDOW_INDEX_NUMBER){
            switchTo().window(WINDOW_INDEX_NUMBER);
        }
}
