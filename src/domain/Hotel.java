package domain;

import exepciones.CampoVacioException;
import exepciones.InicioSesionException;
import exepciones.InvalidUsernameAndPasswordException;
import exepciones.InvalidUsernameException;
import files.JsonUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import swing.LoginGUI;

public class Hotel
{

    public String leerDatosUsuario(String tipoUsuario) throws JSONException{
        JsonUtiles jsonUt = new JsonUtiles();
        return jsonUt.leer(tipoUsuario);
    }

    /**
     * Devuelve un usuario logueado
     * @param user
     * @param pass
     * @return
     * @throws InvalidUsernameAndPasswordException
     * @throws InvalidUsernameException
     * @throws CampoVacioException
     * @throws InicioSesionException
     * @throws JSONException
     */
    public Usuario loguearse(String user, String pass) throws InvalidUsernameAndPasswordException, 
    CampoVacioException, InicioSesionException, JSONException, InvalidUsernameException {
    	
        LoginGUI loginGUI = new LoginGUI();
        Usuario usu = null;
        String objUsuarios="";

        String urlUsuario = loginGUI.getTipoDeUsuario();

            objUsuarios = leerDatosUsuario(urlUsuario);
            JSONArray jsonArray = new JSONArray(objUsuarios);
            for (int i=0; i<jsonArray.length();i++)
            {
            	if(user.equals("") || pass.equals("")) {
            		throw new CampoVacioException("Uno de los campos se encuentra vacio ");
            	}
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (jsonObject.getString("usernane").equals(user))
                {
                    if (jsonObject.getString("password").equals(pass))
                    {
                        usu = new Usuario();
                        usu.setPassword(pass);
                        usu.setUsuario(user);
                    }
                    else
                    {
                    	//invalid pasword exception
                    }
                }else {
                	throw new InvalidUsernameException("Nombre de usuario incorrecto");
                }
            }
            if (usu==null)
            {
                throw new InvalidUsernameAndPasswordException("El usuario o la contrasenia son incorreectos ");
            }
        return usu;
    }


}
