package ru.bcs.integration.eva.page.navigation;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

@Getter

public class Navigation {

    private SelenideElement fieldCcHomeFoundFL;
    private SelenideElement fieldCcHomeFoundUL;
    private SelenideElement fieldCcHomeOperation;
    private SelenideElement fieldCcHomeServices;
    private SelenideElement fieldCcQuikAllByDate;
    private SelenideElement fieldCcQuikOnOffQuik;
    private SelenideElement fieldCcQuikFromPortal;
    private SelenideElement fieldCcDirectoryBanks;
    private SelenideElement fieldCcDirectoryForeignBanks;

    public Navigation() {
        this.fieldCcHomeFoundFL = Selenide.$("");
        this.fieldCcHomeFoundUL = Selenide.$("");
        this.fieldCcHomeOperation = Selenide.$("");
        this.fieldCcHomeServices = Selenide.$("");
        this.fieldCcQuikAllByDate = Selenide.$("");
        this.fieldCcQuikOnOffQuik = Selenide.$("");
        this.fieldCcQuikFromPortal = Selenide.$("");
        this.fieldCcDirectoryBanks = Selenide.$("");
        this.fieldCcDirectoryForeignBanks = Selenide.$("");
    }



}
