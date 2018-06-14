package testcasetestcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import cadastros.CadastroTestCase;
import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class InvalidaTestCase {
	@Test
	@FileParameters(value = "src/test/resources/dadosTestCaseInvalidos.csv", 
					mapper = CsvWithHeaderMapper.class)
	public void invalidaCadastro(String testCaseId, String title, String testPlan, String responsible, String description, String status, String importance, String executionType, String document, String observations, String action1, String expectedResult1, String resultado) {
		assertEquals(resultado, CadastroTestCase.ValidaInvalida(testCaseId, title, testPlan, responsible, description, status, importance, executionType, document, observations, action1, expectedResult1));
	}
}
