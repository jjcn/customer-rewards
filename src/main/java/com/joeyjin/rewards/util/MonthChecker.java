package com.joeyjin.rewards.util;

import java.time.YearMonth;

public class MonthChecker {
    /**
     * Check if a purchase happens within an 3-month period.
     * CAUTION: cross year cases not considered. e.g: DEC, JAN, FEB...
     * @param start is the yearMonth the period begins with
     * @param yearMonthToCheck is the yearMonth to check if it is in this n-month period
     * @return true, if the yearMonth to check is within this n-month period;
     *         false, if not.
     */
    public static boolean isWithin3Months(YearMonth start, YearMonth yearMonthToCheck) {
        YearMonth end = start.plusMonths(2); // the starting month is included in the period
        System.out.println(end);
        return  (start.equals(yearMonthToCheck) | start.isBefore(yearMonthToCheck)) &
                (end.equals(yearMonthToCheck) | end.isAfter(yearMonthToCheck));
    }
}
