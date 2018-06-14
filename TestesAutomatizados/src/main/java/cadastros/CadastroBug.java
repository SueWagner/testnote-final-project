package cadastros;

public class CadastroBug {
	public static String ValidaInvalida (String title, String id, String abstrato, String description, String testPlan, String testCase, String steps, String state, String frequency, String gravity, String priority, String responsible, String image) {
			
	  String retorno = null;
			
		if (title.length() <= 1 || title.length() >= 31) {
			retorno = "Cadastro não efetuado";
		} else
			retorno = "Cadastro efetuado com sucesso";
		
	    return retorno;
	}
}
