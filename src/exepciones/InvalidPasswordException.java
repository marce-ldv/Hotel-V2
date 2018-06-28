package exepciones;

public class InvalidPasswordException extends Exception{
	
	public InvalidPasswordException() {
		super();
	}

	@Override
	public String getMessage() {
		return "La contrasena ingresada es incorrecta";
	}
}
