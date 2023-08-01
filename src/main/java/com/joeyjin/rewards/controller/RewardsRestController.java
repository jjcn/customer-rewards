package com.joeyjin.rewards.controller;

import com.joeyjin.rewards.entity.RewardEntity;
import com.joeyjin.rewards.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.YearMonth;
import java.util.List;

@RestController
@RequestMapping("/api/rewards")
public class RewardsRestController {

    private RewardsService rewardsService;

    @Autowired
    public RewardsRestController(RewardsService rewardsService) {
        this.rewardsService = rewardsService;
    }

    @GetMapping(value = "/")
    public ResponseEntity<String> getRootpage()  {
        String rootpageMsg = "This is the Customer Rewards program API root.";
        return new ResponseEntity<>(rootpageMsg, HttpStatus.OK);
    }

    /**
     * Get the one-month rewards list per customer.
     * @param yearMonth is the year-month to calculate rewards
     * @return a JSON representation of monthly rewards.
     */
    @GetMapping(value = "/{yearMonth}")
    public ResponseEntity<?> getMonthlyRewards(@PathVariable("yearMonth") YearMonth yearMonth) {
        List<RewardEntity> rewards = rewardsService.getMonthlyRewards(yearMonth);
        return new ResponseEntity<List<RewardEntity>>(rewards, HttpStatus.OK);
    }

    /**
     * Get the 3-months rewards list per customer.
     * @param start is the year-month this period starts
     * @return a JSON representation of 3 months' rewards.
     */
    @GetMapping(value = "/{start}/3-months-period")
    public ResponseEntity<?> get3MonthRewards(@PathVariable("start") YearMonth start) {
        return new ResponseEntity<List<RewardEntity>>(rewardsService.get3MonthsRewards(start),
                HttpStatus.OK);
    }

}
