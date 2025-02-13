import org.testng.annotations.Test;

public class AddProjectTest extends Main {
    private AddProject addProject;

    @Test(priority = 2, dependsOnMethods = "LoginTest.testLogin")
    public void testAddProject() throws InterruptedException {
        addProject = new AddProject(driver);  // Initialize it here
        Thread.sleep(1000);
        addProject.projecttab();
        addProject.addproject();
        addProject.enterProjectName("Sky Towers");
        addProject.enterLicenseNumber("12345");
        addProject.enterProjectNumber("PR-5678");
        addProject.enterStartingPrice("500000");
    }
}
