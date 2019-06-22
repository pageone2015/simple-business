package com.page.simplebusiness.utils;

import java.sql.Timestamp;
import java.util.Date;

public class DateUtils {

    public static Timestamp getCurrentTimestamp()
    {
        return new Timestamp(new Date().getTime());
    }
}
