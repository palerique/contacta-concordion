package sitedo.ph.contacta.steps;

import static org.fest.assertions.Assertions.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import sitedo.ph.contacta.services.UsuarioService;

public class CadastroDeUsuarioSteps {

	private String	mensagemExibida;

	@Given("o eleitor José da Silva deseja acompanhar seu representante no governo")
	public void givenOEleitorJoseDaSilvaDesejaAcompanharSeuRepresentanteNoGoverno() {

	}

	@When("ele preencher o formulário de cadastro com o nome de usuário $usuario e a senha $senha e submetê-lo")
	public void whenElePreencherOFormularioDeCadastroComONomeDeUsuariojoseEASenhadasilvaESubmetelo(String usuario, String senha) {

		UsuarioService usuarioService = new UsuarioService();
		mensagemExibida = usuarioService.cadastrar(usuario, senha);
	}

	@Then("o sistema deve exibir a seguinte mensagem: $mensagem")
	public void thenOSistemaDeveExibirASeguinteMensagemOUsuariojoseComASenhadasilvaFoiCadastradoComSucesso(String mensagem) {

		assertThat(mensagemExibida).isEqualTo(mensagem);
	}
}
