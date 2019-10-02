package com.YWHY.tools;

import java.util.Date;

public class DateConver {
    public  String formatDate1(String dateStr) {
String[] aStrings = dateStr.split(" ");
if (aStrings[1].equals("Jan")) {
     aStrings[1] = "01";
 }
if (aStrings[1].equals("Feb")) {
aStrings[1] = "02";
aStrings[1] = "03";
}
if (aStrings[1].equals("Apr")) {
aStrings[1] = "04";
}
if (aStrings[1].equals("May")) {
aStrings[1] = "05";
}
if (aStrings[1].equals("Jun")) {
aStrings[1] = "06";
}
 if (aStrings[1].equals("Jul")) {
aStrings[1] = "07";
 }
if (aStrings[1].equals("Aug")) {
aStrings[1] = "08";
}
if (aStrings[1].equals("Sep")) {
aStrings[1] = "09";
}
if (aStrings[1].equals("Oct")) {
aStrings[1] = "10";
}
if (aStrings[1].equals("Nov")) {
aStrings[1] = "11";
}
if (aStrings[1].equals("Dec")) {
 aStrings[1] = "12";
}
return aStrings[5] + "-" + aStrings[1] + "-" + aStrings[2] + " " + aStrings[3];
}

public  String getDatePoor(Date endDate, Date nowDate) {

        long nd = 1000 * 24 * 60 * 60;
        long nh = 1000 * 60 * 60;
        long nm = 1000 * 60;
        // long ns = 1000;
        // 获得两个时间的毫秒时间差异
        long diff = endDate.getTime() - nowDate.getTime();
        // 计算差多少天
        long day = diff / nd;
        // 计算差多少小时
        long hour = diff % nd / nh;
        // 计算差多少分钟
        long min = diff % nd % nh / nm;
        // 计算差多少秒//输出结果
        // long sec = diff % nd % nh % nm / ns;
        return day + "天" + hour + "小时" + min + "分钟";
    }
}
