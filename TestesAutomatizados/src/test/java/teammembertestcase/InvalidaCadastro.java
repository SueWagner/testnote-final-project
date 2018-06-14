package teammembertestcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import cadastros.CadastroTeamMember;
import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class InvalidaCadastro {
	@Test
	@FileParameters(value = "src/test/resources/dadosTeamMemberInvalidos.csv", 
					mapper = CsvWithHeaderMapper.class)
	public void invalidaCadastro(String name, String initials, String role, String place, String resultado) {
		assertEquals(resultado, CadastroTeamMember.ValidaInvalida(name,initials, role, place));		   
	}
}
