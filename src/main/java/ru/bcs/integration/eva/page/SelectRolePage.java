package ru.bcs.integration.eva.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter

public class SelectRolePage {
    private SelenideElement fieldRole;

    public SelectRolePage() {
        this.fieldRole =
                Selenide.$("");
    }

}


