package com.accenture.desafio.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleDataPage {
    WebDriver driver;

    private final String MAKE_VALUE = "BMW";
    private final String ENGINE_PERFORMANCE_VALUE = "10";
    private final String DATE_OF_MANUFACTURE_VALUE = "10/01/2024";
    private final String NUMBER_OF_SEATS_VALUE = "3";
    private final String LIST_PRICE_VALUE = "500";
    private final String LICENSE_PLATE_NUMBER_VALUE = "1";
    private final String ANNUAL_MILEAGE_VALUE = "100";

    @FindBy(id = "make") WebElement makeDropdown;
    @FindBy(id = "engineperformance") WebElement enginePerformance;
    @FindBy(id = "dateofmanufacture") WebElement dateOfManufacture;
    @FindBy(id = "numberofseats") WebElement numberOfSeats;
    @FindBy(id = "listprice") WebElement listPrice;
    @FindBy(id = "licenseplatenumber") WebElement licensePlateNumber;
    @FindBy(id = "annualmileage") WebElement annualMileage;
    @FindBy(id = "nextenterinsurantdata") WebElement nextButton;

    public VehicleDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencherDadosVeiculo() {
        makeDropdown.sendKeys(MAKE_VALUE);
        enginePerformance.sendKeys(ENGINE_PERFORMANCE_VALUE);
        dateOfManufacture.sendKeys(DATE_OF_MANUFACTURE_VALUE);
        numberOfSeats.sendKeys(NUMBER_OF_SEATS_VALUE);
        listPrice.sendKeys(LIST_PRICE_VALUE);
        licensePlateNumber.sendKeys(LICENSE_PLATE_NUMBER_VALUE);
        annualMileage.sendKeys(ANNUAL_MILEAGE_VALUE);
        nextButton.click();
    }
}
