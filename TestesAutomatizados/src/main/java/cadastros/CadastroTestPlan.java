package cadastros;

public class CadastroTestPlan {
	public static String ValidaInvalida (String idNumber, String name, String sdate, 
			 String fdate, String goal, String features, 
			 String link, String environment, String equipments, 
			 String observations, String document, String status, 
			 String teammember) {
		
		String retorno = null;

		if (idNumber.length() <= 1) {
			retorno = "Cadastro não efetuado";
		} else 
			if (idNumber.length() >= 2 && name.length() <=2 /*&& sdate.length() <= 0*/) {
				retorno = "Cadastro não efetuado";
			} else
				if (idNumber.length() <= 30 &&  name.length() <= 30) {
					retorno = "Cadastro efetuado com sucesso";
				} else
					retorno = "Cadastro efetuado com sucesso";

		return retorno;
		}
}
