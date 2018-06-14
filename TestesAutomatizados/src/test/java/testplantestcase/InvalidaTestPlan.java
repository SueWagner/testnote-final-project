package testplantestcase;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import cadastros.CadastroTestPlan;
import junitparams.JUnitParamsRunner;
import junitparams.FileParameters;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class InvalidaTestPlan {
	@Test
	@FileParameters(value = "src/test/resources/dadosTestPlanInvalidos.csv", 
					mapper = CsvWithHeaderMapper.class)
	public void invalidaCadastro(String idNumber, String name, String sdate, String fdate, String goal, String features, String link, String environment, String equipments, String observations, String document, String status, String teammember, String resultado) {
		assertEquals(resultado, CadastroTestPlan.ValidaInvalida(idNumber, name, sdate, fdate, goal, features, link, environment, equipments, observations, document, status, teammember));
	}
}
