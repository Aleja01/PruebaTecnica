package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("(//a[@class='btn btn-info btn-sm text-white'][contains(.,'Ingresar')])[1]"));
    public static final Target INPUT_USER = Target.the("Where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("Where do we the password")
            .located(By.xpath("//button[@type='submit'][contains(.,'Acceder')]"));


}
