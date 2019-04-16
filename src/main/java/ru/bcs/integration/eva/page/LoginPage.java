package ru.bcs.integration.eva.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter
public class LoginPage {
    private SelenideElement inputLogin;
    private SelenideElement inputPassword;
    private SelenideElement buttonEnter;

    public LoginPage() {
        this.inputLogin =
                Selenide.$("[class=\"ui-form-control ui-placeholder__input _big js-control-label js-dadata-name suggestions-input\"]");
        this.inputPassword =
                Selenide.$("[class=\"become-demo__form form js-demo-quik-form\"] [type=\"email\"]");
        this.buttonEnter =
                Selenide.$("[class=\"become-demo__form form js-demo-quik-form\"] [class=\"btn btn-primary\"]");
    }

}