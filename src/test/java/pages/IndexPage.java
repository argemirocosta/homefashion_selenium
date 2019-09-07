package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.TesteUtil;

import static elements.IndexElements.*;


public class IndexPage {

    private final WebDriver driver;


    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarLogin(String login, String senha) {

        WebElement campoLogin = TesteUtil.buscarComponentePorNome(INDEX_INPUT_LOGIN_USUARIO, driver);
        WebElement campoSenha = TesteUtil.buscarComponentePorNome(INDEX_INPUT_LOGIN_SENHA, driver);
        WebElement botaoLogin = TesteUtil.buscarComponentePorNome(INDEX_BOTAO_LOGIN, driver);

        campoLogin.sendKeys(login);
        campoSenha.sendKeys(senha);

        botaoLogin.click();

    }

    public void abrirDialogCadastro(){
        WebElement botaoCadastro = TesteUtil.buscarComponentePorNome(INDEX_BOTAO_ABRIR_DIALOG_CADASTRO_USUARIO, driver);
        botaoCadastro.click();
    }

    public void fecharDialogCadastro(){
        WebElement botaoFecharDialogCadastro = TesteUtil.buscarComponentePorNome(INDEX_BOTAO_FECHAR_DIALOG_CADASTRO_USUARIO, driver);
        botaoFecharDialogCadastro.click();
    }

    public void realizarCadastro(String nome, String login, String senha){
        WebElement campoNome = TesteUtil.buscarComponentePorNome(INDEX_INPUT_CADASTRO_USUARIO_NOME, driver);
        WebElement campoLogin = TesteUtil.buscarComponentePorNome(INDEX_INPUT_CADASTRO_USUARIO_LOGIN, driver);
        WebElement campoSenha = TesteUtil.buscarComponentePorNome(INDEX_INPUT_CADASTRO_USUARIO_SENHA, driver);
        WebElement botaoCadastrar = TesteUtil.buscarComponentePorNome(INDEX_BOTAO_CADASTRAR_USUARIO, driver);

        campoNome.sendKeys(nome);
        campoLogin.sendKeys(login);
        campoSenha.sendKeys(senha);

        botaoCadastrar.click();

    }

}
