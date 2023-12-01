package co.com.choucair.certificacion.serenityis.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
//@DefaultUrl("https://www.google.com")
public class LoginPage extends  PageObject{

   //Data entrada- credenciales
    public static final Target CLIENTE_EMPRESARIAL = Target.the("input the user")
            .located(By.id("tbGrupoEmpresarial"));
    public static final Target TIPO_DE_IDENTIFICACION = Target.the("input the password")
            .located(By.id("ddlTipoID"));
    public static final Target NUMERO_DE_IDENTIFICACION = Target.the("button to submit")
            .located(By.name("tbNumeroID"));
    public static final Target CLAVE_PERSONAL = Target.the("input the user")
            .located(By.name("tbClavePersonal"));
    public static final Target CLAVE_TOKEN = Target.the("input the password")
            .located(By.name("tbToken"));
    //boton para Enviar fomrlario
    public static final Target BTN_SIGIN = Target.the("button to submit")
            .located(By.name("btInrgesar"));
    //etiqueta error
    public static final Target LABEL_ERROR = Target.the("button to submit")
            .located(By.id("lbErro"));
    //Etiqueta home page
    public static final Target HOME_NAME = Target.the("button to submit")
            .located(By.id("lbNombreUsuario"));



}
