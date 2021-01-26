package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.RealizarCompraPageObjects;

public class RealizarCompraSteps
{
    RealizarCompraPageObjects pageObjects = new RealizarCompraPageObjects(Hooks.driver, new WebDriverWait(Hooks.driver, 10));
    @Dado("que seleciono a opção Debito")
    public void queSelecionoAOpcaoDebito()
    {
        pageObjects.selecionarOpcaoDebito();
    }

    @Dado("^informo os dados do cartao (\\d+), (\\d+), (\\d+), (\\d+)$")
    public void informoOsDadosDoCartao(int numeroCartao, String nomeTitular, String dataVencimento, int codSeguranca)
    {
        pageObjects.preencherNumero(numeroCartao);
        pageObjects.preencherNomeTitular(nomeTitular);
        pageObjects.preencherDataVencimento(dataVencimento);
        pageObjects.preencherCodSeguranca(codSeguranca);
    }

    @Quando("^clicar em Finalizar Compra$")
    public void clicarEmFinalizarCompra()
    {
        pageObjects.clicarEmFinalizarCompra();
    }

    @Entao("^o sistema informa mensagem “Seu pedido foi realizado com sucesso”$")
    public void oSistemaInformaMensagemSucesso()
    {
        String mensagemSucesso = pageObjects.validarMensagemDeSucesso();
        Assert.assertEquals("Seu pedido foi realizado com sucesso", mensagemSucesso);
    }
}
