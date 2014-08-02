package spec;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import sitedo.ph.contacta.services.UsuarioService;

@RunWith(ConcordionRunner.class)
public class SpecTest {
	
	private UsuarioService service = new UsuarioService();
	
	public String insereUsuario(String usuario, String senha) {
		return service.cadastrar(usuario, senha);
	}
}