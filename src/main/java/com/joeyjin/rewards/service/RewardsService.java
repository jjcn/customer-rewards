package com.joeyjin.rewards.service;

import com.joeyjin.rewards.entity.PurchaseEntity;
import com.joeyjin.rewards.entity.RewardEntity;

import java.time.YearMonth;
import java.util.List;

public interface RewardsService {
    /**
     * Find all purchases that happen within three months.
     * @param start is the starting yearMonth of the period.
     * @return a List of all purchases within a 3-month period.
     */
    List<PurchaseEntity> findAllPurchasesIn3Months(YearMonth start);

    /**
     * Find all purchases that happen within in 1 month.
     * @param targetYearMonth is the target yearMonth.
     * @return a List of all purchases within a month.
     */
    List<PurchaseEntity> findAllPurchasesInAMonth(YearMonth targetYearMonth);

    /**
     * Get the rewards earned by every customer for a certain month.
     * @param targetYearMonth the yearMonth to calculate points.
     * @return a List of rewards per customer in this month.
     */
    List<RewardEntity> getMonthlyRewards(YearMonth targetYearMonth);

    /**
     * Get the rewards earned by every customer in total.
     * @param start is the starting yearMonth of a 3-month period.
     * @return a List of rewards per customer in 3 months.
     */
    List<RewardEntity> get3MonthsRewards(YearMonth start);
}
