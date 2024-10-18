package com.accenture.desafio.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceOptionPage {
    WebDriver driver;

    @FindBy(id = "priceOption")
    WebElement priceOption;
    
    private final String VALUE = "500000";

    public PriceOptionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selecionarOpcaoPreco() {
        // componnete não visivel
        priceOption.sendKeys(VALUE); 
    }
}

