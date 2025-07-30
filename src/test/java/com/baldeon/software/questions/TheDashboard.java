package com.baldeon.software.questions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheDashboard {

    // Define un Target para un elemento que sea único en el dashboard.
    // ¡Es CRÍTICO que este selector (By.xpath, By.id, By.cssSelector) coincida con el HTML real de tu aplicación
    // después de un inicio de sesión exitoso!
    // Para la demo de Serenity, un buen selector podría ser el título del panel.
    public static final Target DASHBOARD_TITLE = Target.the("dashboard title")
            .located(By.xpath("//*[@id=\"s-DashboardPage\"]/main/section/section/h1"));  // Ejemplo: busca un H1 que contenga el texto 'Dashboard'

    // Puedes añadir más preguntas si necesitas verificar otros elementos, por ejemplo, un mensaje de bienvenida.
    // public static final Target WELCOME_MESSAGE = Target.the("welcome message")
    //         .located(By.id("WelcomeMessage")); // Ejemplo de un ID de un mensaje de bienvenida

    /**
     * Pregunta el texto del título del dashboard.
     * @return Una Question que devuelve el texto del título.
     */
    public static Question<String> title() {
        return Text.of(DASHBOARD_TITLE).asString();
    }

    /**
     * Pregunta si un mensaje de bienvenida específico es visible.
     * @return Una Question que devuelve true si el mensaje es visible, false en caso contrario.
     * // Si usas esta, asegúrate de descomentar WELCOME_MESSAGE arriba.
     */
    // public static Question<Boolean> isWelcomeMessageVisible() {
    //     return Question.about("whether the welcome message is visible")
    //             .answeredBy(actor -> WELCOME_MESSAGE.resolveFor(actor).isVisible());
    // }
}
