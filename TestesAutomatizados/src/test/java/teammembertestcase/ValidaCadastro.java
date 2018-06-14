package teammembertestcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import cadastros.CadastroTeamMember;
import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class ValidaCadastro {
	@Test
	@FileParameters(value = "src/test/resources/dadosTeamMemberValidos.csv", 
					mapper = CsvWithHeaderMapper.class)
	public void validaCadastro(String name, String initials, String role, String place, String resultado) {
		assertEquals(resultado, CadastroTeamMember.ValidaInvalida(name, initials, role, place));
	}	
}
