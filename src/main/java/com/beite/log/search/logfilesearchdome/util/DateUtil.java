package com.beite.log.search.logfilesearchdome.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author beite_he[beite_he@insightfo.cn]
 * @author <a href="mailto:beite_he@insightfo.cn">Beite</a>
 * @version 1.0
 * @date 2022年05月23日 10:13 AM
 */
public class DateUtil {
    private static final String REGS[] = {"\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{1}时\\d{2}分",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}时\\d{2}分",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}时",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{1}时",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}时",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{1}时",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}时", "\\d{4}年\\d{2}月\\d{2}日",
            "\\d{4}年\\d{2}月\\d{1}日", "\\d{4}年\\d{1}月\\d{2}日",
            "\\d{4}年\\d{1}月\\d{1}日",
            "\\d{4}-\\d{2}-\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}:\\d{1}:\\d{2}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}:\\d{1}:\\d{2}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{1}:\\d{2}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}:\\d{2}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{1}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}:\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{2}",
            "\\d{4}年\\d{2}月\\d{2}日\\s\\d{1}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{2}",
            "\\d{4}年\\d{1}月\\d{2}日\\s\\d{1}",
            "\\d{4}年\\d{2}月\\d{2}日\\d{2}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}", "\\d{4}-\\d{2}-\\d{2}",
            "\\d{4}-\\d{2}-\\d{1}", "\\d{4}-\\d{1}-\\d{2}",
            "\\d{4}-\\d{1}-\\d{1}",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}-\\d{1}-\\d{1}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{2}时",
            "\\d{4}-\\d{2}-\\d{2}\\s\\d{1}时",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{2}时",
            "\\d{4}-\\d{1}-\\d{2}\\s\\d{1}时", "\\d{4}.\\d{2}.\\d{2}",
            "\\d{4}.\\d{2}.\\d{1}", "\\d{4}.\\d{1}.\\d{2}",
            "\\d{4}.\\d{1}.\\d{1}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}.\\d{1}.\\d{1}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{2}",
            "\\d{4}.\\d{2}.\\d{2}\\s\\d{1}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{2}",
            "\\d{4}.\\d{1}.\\d{2}\\s\\d{1}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}时",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}时",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}时",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}时",
            "\\d{4}/\\d{2}/\\d{2}",
            "\\d{4}/\\d{2}/\\d{1}",
            "\\d{4}/\\d{1}/\\d{2}",
            "\\d{4}/\\d{1}/\\d{1}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{2}",
            "\\d{4}/\\d{2}/\\d{2}\\s\\d{1}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{2}",
            "\\d{4}/\\d{1}/\\d{2}\\s\\d{1}",
            "\\d{2}月\\d{2}日\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{2}月\\d{2}日\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{1}月\\d{2}日\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{2}月\\d{2}日\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{2}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{1}月\\d{2}日\\s\\d{1}时\\d{2}分",
            "\\d{1}月\\d{2}日\\s\\d{2}时\\d{2}分",
            "\\d{2}月\\d{2}日\\d{2}时\\d{2}分",
            "\\d{2}月\\d{2}日\\s\\d{2}时",
            "\\d{2}月\\d{2}日\\s\\d{1}时",
            "\\d{1}月\\d{2}日\\s\\d{2}时",
            "\\d{1}月\\d{2}日\\s\\d{1}时",
            "\\d{2}月\\d{2}日\\d{2}时", "\\d{4}年\\d{2}月\\d{2}日",
            "\\d{2}月\\d{1}日", "\\d{4}年\\d{1}月\\d{2}日",
            "\\d{1}月\\d{1}日",
            "\\d{2}月\\d{2}日\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}月\\d{2}日\\s\\d{2}:\\d{1}:\\d{2}",
            "\\d{1}月\\d{2}日\\s\\d{2}:\\d{1}:\\d{2}",
            "\\d{1}月\\d{2}日\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}月\\d{2}日\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}月\\d{2}日\\s\\d{2}:\\d{2}",
            "\\d{2}月\\d{2}日\\s\\d{1}:\\d{2}",
            "\\d{1}月\\d{2}日\\s\\d{2}:\\d{2}",
            "\\d{1}月\\d{2}日\\s\\d{1}:\\d{2}",
            "\\d{2}月\\d{2}日\\d{2}:\\d{2}",
            "\\d{2}月\\d{2}日\\s\\d{2}",
            "\\d{2}月\\d{2}日\\s\\d{1}",
            "\\d{1}月\\d{2}日\\s\\d{2}",
            "\\d{1}月\\d{2}日\\s\\d{1}",
            "\\d{2}月\\d{2}日\\d{2}",
            "\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}-\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{1}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{1}-\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{2}-\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{2}-\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{2}-\\d{2}\\s\\d{2}", "\\d{4}-\\d{2}-\\d{2}",
            "\\d{2}-\\d{1}", "\\d{4}-\\d{1}-\\d{2}",
            "\\d{1}-\\d{1}",
            "\\d{2}-\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{2}-\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{1}-\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{1}-\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{1}-\\d{1}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{2}-\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{2}-\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{1}-\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{1}-\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{2}-\\d{2}\\s\\d{2}时",
            "\\d{2}-\\d{2}\\s\\d{1}时",
            "\\d{1}-\\d{2}\\s\\d{2}时",
            "\\d{1}-\\d{2}\\s\\d{1}时", "\\d{4}.\\d{2}.\\d{2}",
            "\\d{2}.\\d{1}", "\\d{4}.\\d{1}.\\d{2}",
            "\\d{1}.\\d{1}",
            "\\d{2}.\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}.\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{1}.\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{1}.\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{1}.\\d{1}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{2}.\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{2}.\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{1}.\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{1}.\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{2}.\\d{2}\\s\\d{2}",
            "\\d{2}.\\d{2}\\s\\d{1}",
            "\\d{1}.\\d{2}\\s\\d{2}",
            "\\d{1}.\\d{2}\\s\\d{1}",
            "\\d{2}/\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{2}/\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{1}/\\d{2}\\s\\d{2}时\\d{2}分\\d{2}秒",
            "\\d{1}/\\d{2}\\s\\d{1}时\\d{2}分\\d{2}秒",
            "\\d{2}/\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{2}/\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{1}/\\d{2}\\s\\d{2}时\\d{2}分",
            "\\d{1}/\\d{2}\\s\\d{1}时\\d{2}分",
            "\\d{2}/\\d{2}\\s\\d{2}时",
            "\\d{2}/\\d{2}\\s\\d{1}时",
            "\\d{1}/\\d{2}\\s\\d{2}时",
            "\\d{1}/\\d{2}\\s\\d{1}时",
            "\\d{2}/\\d{2}",
            "\\d{2}/\\d{1}",
            "\\d{1}/\\d{2}",
            "\\d{1}/\\d{1}",
            "\\d{2}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{2}/\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{1}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2}",
            "\\d{1}/\\d{2}\\s\\d{1}:\\d{2}:\\d{2}",
            "\\d{2}/\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{2}/\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{1}/\\d{2}\\s\\d{2}:\\d{2}",
            "\\d{1}/\\d{2}\\s\\d{1}:\\d{2}",
            "\\d{2}/\\d{2}\\s\\d{2}",
            "\\d{2}/\\d{2}\\s\\d{1}",
            "\\d{1}/\\d{2}\\s\\d{2}",
            "\\d{1}/\\d{2}\\s\\d{1}",
    };

    public static final String[] PATTERN = new String[]{"yyyy-MM-dd HH:mm:ss",
            "yyyy年MM月dd日 HH时mm分ss秒", "yyyy年MM月dd日HH时mm分",
            "yyyy年MM月dd日 HH时mm分", "yyyy年MM月dd日 HH时", "yyyy年MM月dd日HH时",
            "yyyy年MM月dd日", "yyyy年MM月dd日HH:mm:ss",
            "yyyy年MM月dd日 HH:mm:ss", "yyyy年MM月dd日HH:mm",
            "yyyy年MM月dd日 HH:mm", "yyyy年MM月dd日 HH", "yyyy年MM月dd日HH",
            "yyyy-MM-dd HH时mm分ss秒", "yyyy-MM-dd HH时mm分",
            "yyyy-MM-dd HH时", "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss",
            "yyyy-MM-dd HH:mm", "yyyy-MM-dd HH",
            "yyyy/MM/dd HH时mm分ss秒", "yyyy/MM/dd HH时mm分",
            "yyyy/MM/dd HH时", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss",
            "yyyy/MM/dd HH:mm", "yyyy/MM/dd HH", "yyyy.MM.dd HH:mm:ss",
            "yyyy.MM.dd HH:mm", "yyyy.MM.dd HH", "yyyy.MM.dd",
            "yyyyMMdd",};

    /**
     * @param stringTime
     * @throws
     * @Description: 从字符串中截取出正确的时间
     * @return:
     */
    public static Date cutDate(String stringTime) {

        String str = "";
        Date date = null;
        for (String reg : REGS) {
            String temp = match(reg, stringTime);
            if (temp.length() > str.length()) {
                str = temp;
                if (!"".equals(str)) {
                    date = transString2Date(str, PATTERN[0]);
                }
            }
        }
        return date;
    }

    /**
     * 将日期按指定格式转换为字符串
     *
     * @param time        日期
     * @param datePattern 指定日期格式
     * @return string 日期字符串
     */
    public static String convertTime2String(Date time, String datePattern) {
        String str = "";
        if (time == null || datePattern == null) {
            return str;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
            str = sdf.format(time);
        } catch (Exception e) {

        }
        return str;
    }

    /**
     * Description: 将指定定日期格式字符串转换为日期
     *
     * <p>
     *
     * @param dateStr     日期字符串
     * @param datePattern 日期格式
     * @return Date 日期
     */
    public static Date transString2Date(String dateStr, String datePattern) {
        Date date = null;
        try {
            if (dateStr != null && datePattern != null && dateStr.length() == datePattern.length()) {
                SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
                date = sdf.parse(dateStr);
            }
        } catch (ParseException e) {

        }

        return date;
    }

    public static String match(String reg, String stringTime) {
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(stringTime);
        String s = "";
        if (m.find()) {
            s += m.group();
        }
        return s;
    }
}
