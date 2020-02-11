package model.excepions;

public class DomainException extends RuntimeException{
	/* PODE SE USAR A CLASSE EXCEPTION OU A CLASSE RUMTIME
	  # RUMTIMEEXCEPTION - NÃO É OBRIGADO CHAMADA DA CLASSE (TROWS) DomainException NO MÉTODO DA CLASSE;
	  # EXCEPTION - É OBRIGATÓRIO A CHAMADA DA CLASSE UTILIZANDO O TROWS DO DomainException NO MÉTODO DA CLASSE.   
	*/

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}

}
