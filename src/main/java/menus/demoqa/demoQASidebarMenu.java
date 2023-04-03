package menus.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$$;

public class demoQASidebarMenu {

    public ElementsCollection sidebarMain =  $$("#app > div.body-height > div.container.playgound-body > " +
            "div.row > div.col-12.mt-4.col-md-3 > div.left-pannel > div.accordion");

    public ElementsCollection sidebarSub = $$("#app > div.body-height > div.container.playgound-body > " +
            "div.row > div.col-12.mt-4.col-md-3 > div.left-pannel > div.accordion > div.element-group > " +
            "div.element-list.collapse.show > ul.menu-list > li");

    public void setSidebarMain(String sidebarMainMenuItem){
        sidebarMain.findBy(Condition.exactText(sidebarMainMenuItem)).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }

    public void setSidebarSub(String sidebarSubMenuItem){
            sidebarSub.findBy(Condition.exactText(sidebarSubMenuItem)).shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }
}
