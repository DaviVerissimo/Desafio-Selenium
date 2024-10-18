package com.accenture.desafio.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurantDataPage {
    WebDriver driver;

    private final String FIRST_NAME_VALUE = "John";
    private final String LAST_NAME_VALUE = "Doe";
    private final String BIRTHDATE_VALUE = "01/01/1990";
    private final String GENDER_VALUE = "Male"; 
    private final String STREET_ADDRESS_VALUE = "123 Main St";
    private final String ZIP_CODE_VALUE = "12345";
    private final String CITY_VALUE = "New York";
    private final String COUNTRY_VALUE = "United States";
    private final String OCCUPATION_VALUE = "Employee";
    private final String WEBSITE_VALUE = "www.site.com";
    private final String PICTURE_VALUE = "file.png";
    private final String HOBBIES_VALUE = "Other"; 

    @FindBy(id = "firstname") WebElement firstName;
    @FindBy(id = "lastname") WebElement lastName;
    @FindBy(id = "birthdate") WebElement birthdate;
    @FindBy(id = "gender") WebElement gender;
    @FindBy(id = "streetaddress") WebElement streetAddress;
    @FindBy(id = "zipcode") WebElement zipCode;
    @FindBy(id = "city") WebElement city;
    @FindBy(id = "country") WebElement country;
    @FindBy(id = "occupation") WebElement occupation;
    @FindBy(id = "website") WebElement website;
    @FindBy(id = "picture") WebElement picture;
    @FindBy(id = "Hobbies") WebElement hobies;
    @FindBy(id = "nextenterproductdata") WebElement nextEnterProductData;

    public InsurantDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void preencherDadosSegurado() {
        firstName.sendKeys(FIRST_NAME_VALUE);
        lastName.sendKeys(LAST_NAME_VALUE);
        birthdate.sendKeys(BIRTHDATE_VALUE);
        gender.sendKeys(GENDER_VALUE);
        streetAddress.sendKeys(STREET_ADDRESS_VALUE);
        zipCode.sendKeys(ZIP_CODE_VALUE);
        city.sendKeys(CITY_VALUE);
        country.sendKeys(COUNTRY_VALUE);
        occupation.sendKeys(OCCUPATION_VALUE);
        website.sendKeys(WEBSITE_VALUE);
        picture.sendKeys(PICTURE_VALUE);
        hobies.sendKeys(HOBBIES_VALUE);
        nextEnterProductData.click();;
    }
}
