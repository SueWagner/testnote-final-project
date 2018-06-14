package bugtestcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import cadastros.CadastroBug;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class InvalidaBug {
	@Test
	@FileParameters(value = "src/test/resources/dadosBugInvalidos.csv", 
					mapper = CsvWithHeaderMapper.class)
	public void invalidaBug(String title, String id, String abstrato, String description, String testPlan, String testCase, String steps, String state, String frequency, String gravity, String priority, String responsible, String image, String resultado) {
		assertEquals(resultado, CadastroBug.ValidaInvalida(title, id, abstrato, description, testPlan, testCase, steps, state, frequency, gravity, priority, responsible, image));
	}
}
