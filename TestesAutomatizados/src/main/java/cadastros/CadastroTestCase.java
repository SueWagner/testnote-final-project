package cadastros;

public class CadastroTestCase {
	
	public static String ValidaInvalida (String testCaseId, String title, String testPlan, 
										 String responsible, String description, String status, 
										 String importance, String executionType, String document, 
										 String observations, String action1, String expectedResult1) {
		String retorno = null;
		
		if (testCaseId.length() <= 1) {
			retorno = "Cadastro não efetuado";
		} else 
			 if (testCaseId.length() >= 2 && title.length() <=2) {
			    retorno = "Cadastro não efetuado";
			 } else
				 if(action1.length() <= 0 && expectedResult1.length() <= 0) {
					retorno = "Cadastro não efetuado"; 
				 } else
					 if(action1.length() <= 0 || expectedResult1.length() <= 0) {
						retorno = "Cadastro não efetuado"; 
					 } else
		                   retorno = "Cadastro efetuado com sucesso";
	
		return retorno;
    }
}
