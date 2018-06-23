package exepciones;

public class InicioSesionException extends Exception{

    String msg;

    public InicioSesionException(String msg){
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public String informa(){
        return "Hubo una anomalia al iniciar sesion "+this.getMsg();
    }
}
