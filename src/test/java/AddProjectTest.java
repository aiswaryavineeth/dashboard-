import org.testng.annotations.Test;

public class AddProjectTest extends Main {
    private AddProject addProject;

    @Test(priority = 2, dependsOnMethods = "LoginTest.testLogin")
    public void testAddProject() throws InterruptedException {
        addProject = new AddProject(driver);  // Initialize it here
        Thread.sleep(1000);
        addProject.openProjectsTab();
        addProject.clickAddProject();
        addProject.enterProjectName("Sky Towers");
        addProject.enterLicenseNumber("12345");
        addProject.enterProjectNumber("PR-5678");
        addProject.enterStartingPrice("500000");
        //Thread.sleep(1000);

        addProject.devopercompany("OMNIYAT");
        addProject.selectcountry("United Arab Emirates");
        addProject.selectstate("Abu Dhabi");
        addProject.selectcity("Abu Dhabi");
        addProject.selectcommunity("Abu Dhabi Gate City");
        addProject.selectsubcommunity("Seashore");

    }
}
