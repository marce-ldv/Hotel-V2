package exepciones;

public class CampoVacioException extends Exception{
    String msg;

    public CampoVacioException(String msg){
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public String informa(){
        return "Debe completar todos los campos "+this.getMsg();
    }

}
