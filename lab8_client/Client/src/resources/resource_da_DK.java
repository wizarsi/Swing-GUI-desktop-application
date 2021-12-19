package resources;

import java.text.DateFormat;
import java.util.ListResourceBundle;
import java.util.Locale;

public class resource_da_DK extends ListResourceBundle {
        private static final Object[][] contents = {
                {"login", "Log på:"},
                {"password", "Adgangskode:"},
                {"auth", "Bemyndigelse"},
                {"reg", "Registrer nu"},
                {"message1","Du er ikke autoriseret!"},
                {"message2","En bruger med dette login er allerede oprettet!"},
                {"hi","Hej:"},
                {"tableButton","Bord"},
                {"visualButton","Visualisering"},
                {"commandButton","Udførelse af kommandoer"},
                {"changeUser","Skift bruger"},
                {"back","Tilbage til"},
                {"executeCommand","Udfør kommando"},
                {"sort","Sortere"},
                {"add","Tilføj til"},
                {"remove","Slet"},
                {"update","Opdater"},
                {"updateTable","Opdater bord"},
                {"confirm","Bekræfte"},
                {"cancel","Afbestille"},
                {"execute","Udfør"},
                {"newValue","Ny værdi:"},
                {"insMessage1","Navnet kan ikke være en tom streng."},
                {"insMessage2","Løn skal være et heltal"},
                {"insMessage3","Feltværdien skal være større end -716"},
                {"insMessage4","Maksimal feltværdi: 943"},
                {"insMessage7","Strenglængden er ikke mere end 44, strengen er ikke tom, værdien er unik"},
                {"insMessage8","Kontroller formatet: MMMM d',' yyyy hh':'mm AM/PM"},
                {"insMessage9","Højden kan ikke være lig med 0."},
                {"insMessage10","Du skal indtaste et heltal."},
                {"numbMessage1","Du skal indtaste et heltal."},
                {"numbMessage2","Du skal indtaste et heltal."},
                {"date", DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM
                        , new Locale("es","CR"))},
        };

        @Override
        protected Object[][] getContents() {
            return contents;
        }
}
