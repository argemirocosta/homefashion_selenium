package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static elements.ClienteElements.*;


public class ClientePage {

    @FindBy(name = CLIENTE_BOTAO_ABRIR_DIALOG_CADASTRO_CLIENTE)
    private WebElement botaoCadastro;

    public void abrirDialogNovoCliente() {
        botaoCadastro.click();
    }

    @FindBy(name = CLIENTE_INPUT_NOME)
    private WebElement campoNome;

    @FindBy(name = CLIENTE_INPUT_TELEFONE1)
    private WebElement campoTelefone1;

    @FindBy(name = CLIENTE_INPUT_TELEFONE2)
    private WebElement campoTelefone2;

    @FindBy(name = CLIENTE_BOTAO_CADASTRAR_CLIENTE)
    private WebElement botaoCadastrar;

    public void realizarCadastroCliente(String nome, Integer telefone1, Integer telefone2) {
        campoNome.sendKeys(nome);
        campoTelefone1.sendKeys(String.valueOf(telefone1));
        campoTelefone2.sendKeys(String.valueOf(telefone2));

        botaoCadastrar.click();

    }
}
