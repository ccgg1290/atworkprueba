package co.com.choucair.certificacion.serenityis.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.serenityis.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Login implements Task {
    private final List<Map<String, String>> data;

    public Login(List<Map<String, String>> data) {
        this.data = data;
    }

    public static Login intoPage(List<Map<String, String>> data) {
        return Tasks.instrumented(Login.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.get(0).get("NameUser")).into(CLIENTE_EMPRESARIAL),
                //Enter.theValue(newdata.get(0).get("pass")).into(TIPO_DE_IDENTIFICACION),
                Enter.theValue(data.get(0).get("NameUser")).into(NUMERO_DE_IDENTIFICACION),
                Enter.theValue(data.get(0).get("NameUser")).into(CLAVE_PERSONAL),
                Enter.theValue(data.get(0).get("NameUser")).into(CLAVE_TOKEN),
                Click.on(BTN_SIGIN)
        );
    }
}
