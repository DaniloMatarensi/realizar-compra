package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RealizarCompraPageObjects
{
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "debito")
    protected WebElement opcaoDebito;

    @FindBy(xpath = "//input[@name=’numero’]")
    protected WebElement campoNumero;

    @FindBy(xpath = "//input[@name=’titular’]")
    protected WebElement campoTitular;

    @FindBy(xpath = "//input[@name=’dataVencimento’]")
    protected WebElement campoDataVencimento;

    @FindBy(xpath = "//input[@name=’codSeguranca’]")
    protected WebElement campoCodSeguranca;

    @FindBy(xpath = "//a[@class = ‘Finalizar compra’]/button")
    protected WebElement botaoFinalizarCompra;

    @FindBy(xpath = "//span[contains(text(),'Seu pedido foi realizado com sucesso')]")
    protected WebElement mensagemSucesso;

    public RealizarCompraPageObjects(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void selecionarOpcaoDebito()
    {
        opcaoDebito.click();
    }

    public void preencherNumero(int numero)
    {
        campoNumero.sendKeys(String.valueOf(numero));
    }

    public void preencherNomeTitular(String nomeTitular)
    {
        campoTitular.sendKeys(nomeTitular);
    }

    public void preencherDataVencimento(String dataVencimento)
    {
        campoDataVencimento.sendKeys(dataVencimento);
    }

    public void preencherCodSeguranca(int codSeguranca)
    {
        campoCodSeguranca.sendKeys(String.valueOf(codSeguranca));
    }

    public void clicarEmFinalizarCompra()
    {
        botaoFinalizarCompra.click();
    }

    public String validarMensagemDeSucesso()
    {
        return wait.until(ExpectedConditions.visibilityOf(mensagemSucesso)).getText();
    }
}
