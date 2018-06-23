package exepciones;

public class InvalidUsernameException extends Exception{
    String msje;
    public InvalidUsernameException(String msje){
        super();
        this.msje=msje;
    }

    public String getMsje() {
        return msje;
    }

    public String informa(){
        return "El nombre de usuario es invalido "+getMessage();
    }

}
