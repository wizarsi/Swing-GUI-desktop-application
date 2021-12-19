package resources;

import java.text.DateFormat;
import java.util.ListResourceBundle;
import java.util.Locale;

public class resource_es_CR extends ListResourceBundle {

    private static final Object[][] contents = {
            {"login", "Acceso:"},
            {"password", "Contraseña:"},
            {"auth", "Autorización"},
            {"reg", "Regístrate ahora"},
            {"message1","¡Usted no está autorizado!"},
            {"message2","¡Ya se ha creado un usuario con este inicio de sesión!"},
            {"hi","Hola:"},
            {"tableButton","Mesa"},
            {"visualButton","Visualización"},
            {"commandButton","Ejecutando comandos"},
            {"changeUser","Cambiar usuario"},
            {"back","De regreso"},
            {"executeCommand","Ejecutar comando"},
            {"sort","Clasificar"},
            {"add","añadir"},
            {"remove","Borrar"},
            {"update","Actualizar"},
            {"updateTable","Actualizar tabla"},
            {"confirm","Confirmar"},
            {"cancel","Cancelar"},
            {"execute","Ejecutar"},
            {"newValue","Nuevo valor:"},
            {"insMessage1","El nombre no puede ser una cadena vacía."},
            {"insMessage2","El salario debe ser un número entero"},
            {"insMessage3","El valor del campo debe ser mayor que -716"},
            {"insMessage4","Valor máximo de campo: 943"},
            {"insMessage7","La longitud de la cadena no es más de 44, la cadena no está vacía, el valor es único"},
            {"insMessage8","Comprueba el formato: MMMM d',' yyyy hh':'mm AM/PM"},
            {"insMessage9","La altura no puede ser igual a 0."},
            {"insMessage10","Debes ingresar un número entero."},
            {"numbMessage1","Debes ingresar un número entero."},
            {"numbMessage2","Debes ingresar un número de coma flotante."},
            {"date", DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM
                    , new Locale("es","CR"))},
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
