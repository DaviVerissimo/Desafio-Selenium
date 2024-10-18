package com.accenture.desafio.selenium.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.accenture.desafio.selenium.pages.InsurantDataPage;
import com.accenture.desafio.selenium.pages.PriceOptionPage;
import com.accenture.desafio.selenium.pages.ProductDataPage;
import com.accenture.desafio.selenium.pages.SendQuotePage;
import com.accenture.desafio.selenium.pages.VehicleDataPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*; // Importação para português

public class InsuranceSteps {

    WebDriver driver;
    VehicleDataPage vehiclePage;
    InsurantDataPage insurantPage;
    ProductDataPage productPage;
    PriceOptionPage pricePage;
    SendQuotePage quotePage;
	
	@Before
	public void before() {
		// chromedriver definido em /usr/local/bin
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void after() {
		driver.quit();
	}


    @Dado("que eu navego para {string}")
    public void queEuNavegoPara(String url) {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
    }
    
    @Quando("eu preencho os dados do veículo e avanço para a próxima etapa")
    public void eu_preencho_os_dados_do_veículo_e_avanço_para_a_próxima_etapa() {
    	vehiclePage = new VehicleDataPage(driver);
    	vehiclePage.preencherDadosVeiculo();
    }

    @Quando("eu preencho os dados do segurado e avanço para a próxima etapa")
    public void eu_preencho_os_dados_do_segurado_e_avanço_para_a_próxima_etapa() {
    	insurantPage = new InsurantDataPage(driver);
        insurantPage.preencherDadosSegurado();
    }

    @Quando("eu preencho os dados do produto e avanço para a próxima etapa")
    public void eu_preencho_os_dados_do_produto_e_avanço_para_a_próxima_etapa() {
    	productPage = new ProductDataPage(driver);
        productPage.preencherDadosProduto();
    }

    @Quando("eu seleciono uma opção de preço e avanço para a próxima etapa")
    public void eu_seleciono_uma_opção_de_preço_e_avanço_para_a_próxima_etapa() {
    	pricePage = new PriceOptionPage(driver);
    	pricePage.selecionarOpcaoPreco();
    }
    
    @Quando("eu envio a cotação")
    public void euEnvioACotacao() {
        quotePage = new SendQuotePage(driver);
        quotePage.preencherFormulario();
        quotePage.enviarFormulario();
    }


    @Então("eu devo ver a mensagem {string}")
    public void eu_devo_ver_a_mensagem(String mensagemEsperada) {
        boolean isModalVisivel = quotePage.verificarModalSucesso();

        if (isModalVisivel) {
            System.out.println("Mensagem exibida: " + mensagemEsperada);
            quotePage.confirmarModal();
        } else {
            System.out.println("A mensagem de sucesso não foi exibida.");
        }
    }


}

