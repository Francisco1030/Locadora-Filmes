package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert {

    public static Date convertBySQL(String d) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(d);
        java.sql.Date novaData = new java.sql.Date(data.getTime());
        return novaData;
    }
}
