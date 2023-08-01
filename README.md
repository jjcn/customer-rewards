# customer-rewards-program
A reward program backend, built with Spring Boot + Java 8, access with RESTful API.

## Reward Point Calculation
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every
dollar spent over $50 in each transaction.
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points)

## Dataset
The H2 database is pre-populated with data:
customer ID | YearMonth | Amount of Purchase | Reward Points Earned
:---: | :---: | :---:  | :---: 
1 | 202212 | 1 | 0
1 | 202212 | 50 | 0
1 | 202212 | 75  | 25
1 | 202301 | 100 | 50
2 | 202301 | 101 | 52
2 | 202301 | 0 | 0
1 | 202302 | 100 | 50
2 | 202302 | 100 | 50
1 | 202303 | 100 | 50
3 | 202303 | 100 | 50

## RESTful API
Service runs on `http://localhost:8080/`
The root URL is `/api/rewards`
### Get a month's aggregated rewards
GET `/api/rewards/{yearMonth}`
where `yearMonth` is the year and month to add up reward points.
### Get 3 months' aggregated rewards
GET `/api/rewards/{yearMonth}/3-months-period`
where `yearMonth` is the year and month with which the 3-month period starts.
### NOTE
`yearMonth` in both URLs should be formatted as `YYYY-MM`, for example:
`/api/rewards/2021-12`, `/api/rewards/2021-10/3-months-period`
