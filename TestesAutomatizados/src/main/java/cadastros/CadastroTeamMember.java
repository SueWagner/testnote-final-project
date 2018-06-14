package cadastros;

public class CadastroTeamMember {
	
	public static String ValidaInvalida (String name, String initials, String role, String place) {
		String retorno = null;
		
		if (name.length() <= 2) {
			retorno = "Cadastro não efetuado";
		} else 
			 if (name.length() >= 3 && initials.length() <=1) {
			    retorno = "Cadastro não efetuado";
			 } else
				  if (role.length() >= 0 || place.length() >= 0) {
			         retorno = "Cadastro efetuado com sucesso";
				  }
		          else
		              retorno = "Cadastro efetuado com sucesso";
		 
		return retorno;
    }
}
