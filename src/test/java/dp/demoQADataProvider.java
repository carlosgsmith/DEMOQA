package dp;

import org.testng.annotations.DataProvider;

public class demoQADataProvider {

    @DataProvider(name = "dp.demoQADataProvider")
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

    @DataProvider(name = "demoQAElementsPageTextBoxInvalidEmails")
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

    @DataProvider(name = "demoQAElementsPageWebTableAdd")
    public Object[][] demoQAElementsPageWebTableAddData(){
        return new Object[][]{
                {"Mia", "Taylor", "mia.taylor@example.com", 27, 55000, "Sales"},
                {"William", "Hernandez", "william.hernandez@example.com", 32, 75000, "Marketing"},
                {"Ava", "Thompson", "ava.thompson@example.com", 24, 45000, "IT"},
                {"Oliver", "Gonzalez", "oliver.gonzalez@example.com", 29, 60000, "Customer Service"},
                {"Emma", "Lee", "emma.lee@example.com", 31, 85000, "Finance"},
                {"Noah", "Turner", "noah.turner@example.com", 28, 70000, "Sales"},
                {"Sophia", "Miller", "sophia.miller@example.com", 26, 55000, "Marketing"},
                {"Ethan", "Scott", "ethan.scott@example.com", 30, 65000, "HR"},
                {"Isabella", "Hall", "isabella.hall@example.com", 33, 80000, "IT"},
                {"James", "Perez", "james.perez@example.com", 35, 90000, "Customer Service"},
                {"Charlotte", "Garcia", "charlotte.garcia@example.com", 31, 70000, "Finance"},
                {"Daniel", "Martinez", "daniel.martinez@example.com", 27, 60000, "Marketing"},
                {"Sophia", "Nelson", "sophia.nelson@example.com", 29, 65000, "Sales"},
                {"Benjamin", "Clark", "benjamin.clark@example.com", 26, 55000, "IT"},
                {"Amelia", "Anderson", "amelia.anderson@example.com", 32, 75000, "HR"},
                {"Mason", "Roberts", "mason.roberts@example.com", 34, 80000, "IT"},
                {"Avery", "Williams", "avery.williams@example.com", 28, 65000, "Customer Service"},
                {"Grace", "Brown", "grace.brown@example.com", 30, 70000, "Finance"},
                {"Liam", "King", "liam.king@example.com", 27, 60000, "Marketing"},
                {"Evelyn", "Turner", "evelyn.turner@example.com", 29, 65000, "Sales"},
                {"Michael", "Jones", "michael.jones@example.com", 31, 75000, "HR"},
                {"Mia", "Davis", "mia.davis@example.com", 25, 50000, "IT"},
                {"David", "Rodriguez", "david.rodriguez@example.com", 33, 80000, "Customer Service"},
                {"Alexander", "Wilson", "alexander.wilson@example.com", 28, 65000, "Finance"},
                {"Emma", "Green", "emma.green@example.com", 30, 70000, "Marketing"},

        };
    }

}

