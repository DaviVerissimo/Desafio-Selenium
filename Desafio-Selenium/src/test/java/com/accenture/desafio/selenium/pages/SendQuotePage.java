package com.accenture.desafio.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {
    WebDriver driver;

    // Variáveis finais com valores definidos
    private static final String EMAIL = "is.soft@gmail.com";
    private static final String PHONE = "83996635398";
    private static final String USERNAME = "davi";
    private static final String PASSWORD = "senha123";
    private static final String COMMENTS = "tese";

    @FindBy(id = "email") 
    WebElement emailField;

    @FindBy(id = "phone") 
    WebElement phoneField;

    @FindBy(id = "username") 
    WebElement usernameField;

    @FindBy(id = "password") 
    WebElement passwordField;

    @FindBy(id = "confirmpassword") 
    WebElement confirmPasswordField;

    @FindBy(id = "Comments") 
    WebElement commentsField;

    @FindBy(id = "sendemail") 
    WebElement sendEmailButton;

    @FindBy(xpath = "//div[contains(text(),'Sending e-mail success!')]") 
    WebElement successModal;

    @FindBy(xpath = "//button[text()='OK']") 
    WebElement okButton;

    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Método que preenche o formulário usando as variáveis finais
    public void preencherFormulario() {
        emailField.sendKeys(EMAIL);
        phoneField.sendKeys(PHONE);
        usernameField.sendKeys(USERNAME);
        passwordField.sendKeys(PASSWORD);
        confirmPasswordField.sendKeys(PASSWORD);
        commentsField.sendKeys(COMMENTS);
    }

    public void enviarFormulario() {
        sendEmailButton.click();
    }

    public boolean verificarModalSucesso() {
        return successModal.isDisplayed();
    }

    public void confirmarModal() {
        okButton.click();
    }
}
