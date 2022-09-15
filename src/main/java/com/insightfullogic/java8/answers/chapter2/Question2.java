package com.insightfullogic.java8.answers.chapter2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import static java.lang.ThreadLocal.withInitial;

public class Question2 {

     public final static ThreadLocal<DateFormat> formatter = withInitial(() -> {
          // 月份表达特殊，所以设定为英语环境
          return new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
     });

}
