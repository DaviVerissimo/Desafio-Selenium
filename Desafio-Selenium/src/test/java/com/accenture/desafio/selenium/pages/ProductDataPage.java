package com.accenture.desafio.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDataPage {
    WebDriver driver;

    private final String START_DATE_VALUE = "01/01/2024";
    private final String INSURANCE_SUM_VALUE = "500000";
    private final String MERIT_RATING_VALUE = "5";
    private final String DAMAGE_INSURANCE_VALUE = "Yes";
    private final String OPTIONAL_PRODUCTS_VALUE = "Euro Protection";
    private final String COURTESY_CAR_VALUE = "yes";

    @FindBy(id = "startdate") WebElement startDate;
    @FindBy(id = "insurancesum") WebElement insuranceSum;
    @FindBy(id = "meritrating") WebElement meritRating;
    @FindBy(id = "damageinsurance") WebElement damageInsurance;
    @FindBy(id = "optionalproducts") WebElement optionalProducts;
    @FindBy(id = "courtesycar") WebElement courtesycar;
    @FindBy(id = "nextselectpriceoption") WebElement nextSelectPriceOption;

    public ProductDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencherDadosProduto() {
        startDate.sendKeys(START_DATE_VALUE);
        insuranceSum.sendKeys(INSURANCE_SUM_VALUE);
        meritRating.sendKeys(MERIT_RATING_VALUE);
        damageInsurance.sendKeys(DAMAGE_INSURANCE_VALUE);
        optionalProducts.sendKeys(OPTIONAL_PRODUCTS_VALUE);
        courtesycar.sendKeys(COURTESY_CAR_VALUE);
        nextSelectPriceOption.click();
    }
}
