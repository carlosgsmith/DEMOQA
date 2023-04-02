import org.testng.annotations.DataProvider;

public class demoQADataProvider {

    @DataProvider(name = "demoQADataProvider")
    public Object[][] demoQAHomePageLinksData() {
        return new Object[][]{
                {0, "Elements"},
                {1, "Forms"},
                {2, "Alerts, Frame & Windows"},
                {3, "Widgets"},
                {4, "Interactions"},
                {5, "Book Store Application"},
        };
    }

    @DataProvider(name = "demoQAElementsPageTextBox")
    public Object[][] demoQAElementsPageTextBoxData(){
        return new Object[][]{
                {"sam i am", "samiam@sam.com", "123 Street", "456 Street"},
                {"john doe", "johndoe@john.com", "123 Road", "456 Road"},
                {"larry holmes", "larryholmes@holmes.com", "123 Boulevard", "456 Boulevard"},
                {"sam i am", "samiam@sam.com", "123 Street", "456 Street"},
                {"john doe", "johndoe@john.com", "123 Road", "456 Road"},
                {"larry holmes", "larryholmes@holmes.com", "123 Boulevard", "456 Boulevard"},
                {"sam i am", "samiam@sam.com", "123 Street", "456 Street"},
                {"john doe", "johndoe@john.com", "123 Road", "456 Road"},
                {"larry holmes", "larryholmes@holmes.com", "123 Boulevard", "456 Boulevard"},                {"sam i am", "samiam@sam.com", "123 Street", "456 Street"},
                {"john doe", "johndoe@john.com", "123 Road", "456 Road"},
                {"larry holmes", "larryholmes@holmes.com", "123 Boulevard", "456 Boulevard"},
        };
    }

    @DataProvider(name = "demoqaElementsPageTextBoxInvalidEmails")
    public Object[][] demoQAElementsPageTextBoxInvalidEmailsData(){
        return new Object[][]{
                {"samatsam.com"}, {"sam+at+sam.com"}, {"sam(o)sam.com"}, {"sam(at)sam.com"}, {"sam(?)sam.com"},
                {"sam@@sam.com"}, {"sam@sam--.com"}, {"sam@sam/.com"}, {"sam@sam/\\.com"}, {"sam@sam\\.com"},
                {"sam@sam.com*"}, {"sam@sam.com^"}, {"sam@sam.com!"}, {"$am@sam.com"}, {"#am@sam.com"},
                {"\n"+"%am@sam.com"}, {"sam@sam:com"}, {"\n"+"sam@sam;com"}, {"sam:sam.com"}, {"sam;sam.com"},
                {"\n"+"\"sam@sam.com\""}, {"'sam@sam.com'"}, {"\n"+"ooo@@ooo.com"}, {"#$%@^.com"}, {"\n"+"//\\&@.com"},
                {"[]<>@.com"}, {"\\\\/@.com"}, {"+=*@yyx.com"}, {"ienv#!!@.co.jp"}, {"$?_^@ff.com"},
        };
    }
}
