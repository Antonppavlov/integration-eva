package ru.bcs.integration.eva.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter

public class HomePage {
    private SelenideElement fieldCcHome;
    private SelenideElement fieldCcQuik;
    private SelenideElement fieldCcDirectory;

    public HomePage(){
        this.fieldCcHome = Selenide.$( "");
        this.fieldCcQuik = Selenide.$("");
        this.fieldCcDirectory = Selenide.$("");
    }
}
