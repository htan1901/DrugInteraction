package com.example.myapplication.utils;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Utils {
    public static String formatDate(Date date) {
        Locale timeLocale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, timeLocale);
        return dateFormat.format(date).toString();
    }
}
