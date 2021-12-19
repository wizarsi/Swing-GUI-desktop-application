package resources;

import java.text.DateFormat;
import java.util.ListResourceBundle;
import java.util.Locale;

public class resource_mk_MK extends ListResourceBundle {

    private static final Object[][] contents = {
            {"login", "Логирај Се:"},
            {"password", "Лозинка:"},
            {"auth", "Овластување"},
            {"reg", "Регистрирај се сега"},
            {"message1","Вие не сте овластени!"},
            {"message2","Корисник со ова најавување е веќе создаден!"},
            {"hi","Здраво:"},
            {"tableButton","Табела"},
            {"visualButton","Визуелизација"},
            {"commandButton","Извршување команди"},
            {"changeUser","Променете го корисникот"},
            {"back","Назад кон"},
            {"executeCommand","Изврши команда"},
            {"sort","Сортирај"},
            {"add","Додај во"},
            {"remove","Избриши"},
            {"update","Освежи"},
            {"updateTable","Освежете ја табелата"},
            {"confirm","Потврди"},
            {"cancel","Откажи"},
            {"execute","Изврши"},
            {"newValue","Нова вредност:"},
            {"insMessage1","Името не може да биде празна низа."},
            {"insMessage2","Плата мора да биде цел број"},
            {"insMessage3","Вредноста на полето мора да биде поголема од -716"},
            {"insMessage4","Максимална вредност на полето: 943"},
            {"insMessage7","Должината на низата не е поголема од 44, низата не е празна, вредноста е единствена"},
            {"insMessage8","Проверете го форматот: MMMM d',' yyyy hh':'mm AM/PM"},
            {"insMessage9","Висината не може да биде еднаква на 0."},
            {"insMessage10","Мора да внесете цел број."},
            {"numbMessage1","Мора да внесете цел број."},
            {"numbMessage2","Мора да внесете број на подвижна точка."},
            {"date", DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM
                    , new Locale("mk","MK"))},

    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
