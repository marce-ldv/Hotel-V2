package exepciones;

public class InvalidUsernameAndPasswordException extends Exception{

    String msje;
    public InvalidUsernameAndPasswordException(String msje){
        super();
        this.msje=msje;
    }

    public String getMsje() {
        return msje;
    }

    public String informa(){
        return "El nombre de usuario y/o password es invalido "+getMsje();
    }
}
