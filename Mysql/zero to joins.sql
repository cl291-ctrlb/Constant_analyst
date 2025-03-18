SELECT * ###zero tojoins 
FROM parks_and_recreation.employee_demographics;

SELECT first_name
FROM parks_and_recreation.employee_demographics;

SELECT first_name ,
last_name,
age,
(age+10)*10+10
# PEMDAS(parenthesis expoent multiplication division addition subtraction) is order of operations for arithmetic operations or math in mysql (bodmas hi h) 
FROM parks_and_recreation.employee_demographics;

SELECT  DISTINCT first_name ,gender
FROM parks_and_recreation.employee_demographics;

SELECT *
FROM employee_salary
WHERE first_name = 'leslie';

SELECT *
FROM employee_salary
WHERE salary >= 50000;

SELECT *
FROM employee_demographics
WHERE gender != 'Female' ;

SELECT *
FROM employee_demographics
WHERE birth_date > '1985-01-01';

SELECT *
FROM employee_salary
WHERE first_name = 'leslie';

-- AND  OR NOT -- Logical operators
SELECT *
FROM employee_demographics
WHERE birth_date > '1985-01-01'
AND gender = 'male' #yha space matter krta h 
;
SELECT *
FROM employee_demographics
WHERE birth_date > '1985-01-01'
OR NOT gender = 'male' #yha space matter krta h 
;

SELECT  * 
FROM employee_demographics
WHERE (first_name = 'leslie' AND age = 44) OR age > 55
;

-- % (means anything ) and _(underscore mean specifc value )
SELECT  * 
FROM employee_demographics
WHERE birth_date like '1989%' # -- means only 2 characters after a 
;

SELECT gender , AVG(age)
FROM employee_demographics
group by gender
;
SELECT  occupation ,salary
FROM employee_salary
GROUP BY occupation ,salary
;

SELECT gender , AVG(age) , MAX(age), MIN(age) ,count(age)
FROM employee_demographics
group by gender
;

-- --order by---- 
SELECT *
FROM employee_demographics 
ORDER BY gender ,age
;
SELECT gender, AVG(age)
FROM employee_demographics
GROUP BY gender
HAVING  AVG(age) > 40
;
SELECT occupation , AVG(salary)
FROM employee_salary 
WHERE occupation LIKE '%manager%'
GROUP BY  occupation
having AVG (salary) > 75000;

SELECT *
FROM employee_demographics 
ORDER BY age DESC
limit 2 ,1
;

-- --ALIASINF--  
SELECT gender ,AVG(age) as avg_age
FROM employee_demographics
GROUP by gender
HAVING avg_age >40 ;

select *  #uper niche matter a lot
from employee_demographics;
SELECT *
from employee_salary;
    
SELECT  dem.employee_id , age, occupation
from employee_demographics AS dem
join employee_salary AS sal
	on dem.employee_id = sal.employee_id
    ;
SELECT *
from employee_demographics AS dem
right outer join employee_salary AS sal
	on dem.employee_id  = sal.employee_id
;
select emp1.employee_id as emp_santa,
emp1.first_name as first_name_santa,
emp1.last_name as last_name_santa,
emp2.employee_id as emp_name,
emp2.first_name as first_name_emp,
emp2.last_name as last_name_emp
from employee_salary emp1
join employee_salary emp2
	on  emp1.employee_id + 1 = emp2.employee_id;
    
select *
from employee_demographics as dem
inner join employee_salary as sal
		on dem.employee_id = sal.employee_id
inner join  parks_departments pd
	on sal.dept_id = pd.department_id
;
select * 
from parks_departments;


###### full project after wasting a day 
select *,
row_number() over(
partition by company,industry, total_laid_off, percentage_laid_off, `date`) as row_num
from layoffs_staging; 


with duplicate_cte as 
(
select *,
row_number() over(
partition by company,location, industry, total_laid_off, percentage_laid_off, `date`, 
stage, country, funds_raised_millions) as row_num
from layoffs_staging 
)
select * 
from duplicate_cte
where row_num > 1;
    
# confirming duplicates (checking is imp)
select *
from layoffs_staging
where company = 'oda' ;

-- ----  with duplicate_cte as #(yha work nhi kr rha )
-- -- -- (
-- -- -- select *,
-- -- -- row_number() over(
-- -- -- partition by company,location,industry, total_laid_off, percentage_laid_off,
-- -- --  `date`,stage,country,funds_raised_millions) as row_num
-- -- -- )
-- -- -- select *
-- -- -- from duplicate_cte
-- -- -- where row_num> 1;
--     
select *
from layoffs_staging
where company = 'Casper' ; # two rows are duplicate
    

with duplicate_cte as 
(
select *,
row_number() over(
partition by company,location, industry, total_laid_off, percentage_laid_off, `date`, 
stage, country, funds_raised_millions) as row_num
from layoffs_staging 
) ####cursor mattter alottttttttttttttt
delete  #(it is like update statment)
from duplicate_cte
where row_num > 1;


CREATE TABLE `layoffs_staging2` (
  `company` text, #text is datatype
  `location` text,
  `industry` text,
  `total_laid_off` int DEFAULT NULL,
  `percentage_laid_off` text,
  `date` text,
  `stage` text,
  `country` text,
  `funds_raised_millions` int DEFAULT NULL,
  `row_num` int 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

    
select *
from layoffs_staging2 # we need 2 insert data
where row_num>1; 

insert into layoffs_staging2 
select *,
row_number() over(
partition by company,location, industry, total_laid_off, percentage_laid_off, `date`, 
stage, country, funds_raised_millions) as row_num
from layoffs_staging ;

delete #(agar preference mai jake sql editor ma box tick h to nhi chalega delete so you have to go and decheck this and got query tab and reconnect the  server the run again this code)
from layoffs_staging2
where row_num>1;

select *
from layoffs_staging2;
# where row_num >1; # remove duplicates complete here

-- standardising the data
select company, (trim(company) ) # trim means remove spaces
from layoffs_staging2 ;

update layoffs_staging2
set company = trim(company);

select distinct  industry 
from layoffs_staging2
order by 1 ;

select *
from layoffs_staging2
where industry like 'Crypto%';

update layoffs_staging2
set industry = 'Crypto'
where industry like 'Crypto%';

select *
from layoffs_staging2;

select distinct industry
from layoffs_staging2
;

select *
from layoffs_staging2
order by 1;

select distinct location 
from layoffs_staging2
order by 1;

select *
from layoffs_staging2
order by 1;

select distinct country
from layoffs_staging2
order by 1;

select *
from layoffs_staging2
where country like 'United States%'
order by 1 ;

select distinct country, trim(country)
from layoffs_staging2
order by 1 ;

select distinct country, trim(trailing '.' from (country))  # trailing meansa coming atend 
from layoffs_staging2
order by 1 ;

update layoffs_staging2 # yha recording start kia h 
set country = trim(trailing '.' from (country))
where country like 'United States%' ;

select `date`,
str_to_date(`date`, '%m/%d/%Y')
from layoffs_staging2;


update layoffs_staging2
set `date` = str_to_date(`date`, '%m/%d/%Y');


select `date`
from layoffs_staging2; 

alter table layoffs_staging2
modify column `date` date ;

select  *
from layoffs_staging2;


-- step 3

select  *
from layoffs_staging2
where total_laid_off is null 
and percentage_laid_off is null ;


update layoffs_staging2
set inustry = null
where inudstry = '' ;



select   *
from layoffs_staging2
where industry is null
or industry = '' ;

select *
from layoffs_staging2
where company like 'Bally%' ; # alex me data km show hora h 

select t1.industry, t2.industry
from layoffs_staging2 t1
join layoffs_staging2 t2
	on t1.company = t2.company
where (t1.industry is null or t1.industry = '')
and t2.industry is not null;


update layoffs_staging2 t1
join layoffs_staging2 t2
	on t1.company = t2.company
set t1.industry = t2.industry
where t1.industry is null 
and t2.industry is not null; # isko run krne k baad 3 rows affected aanachahiye 

select *
from layoffs_staging2;

delete
from layoffs_staging2
where total_laid_off is null 
and percentage_laid_off is null ;


select *
from layoffs_staging2
where total_laid_off is null 
and percentage_laid_off is null ;

select *
from layoffs_staging2 ;

alter table layoffs_staging2 # delete row_num
drop column row_num;


##### exploratory data analysis ()
select *
from layoffs_staging2; #(saarri command dubara se )
 show tables ;
# chatgpt
SELECT COUNT(*) FROM layoffs_staging;
USE kp;
SHOW DATABASES;
SELECT COUNT(*) FROM layoffs;
SELECT COUNT(*) FROM layoffs_staging2;
SELECT * FROM layoffs_staging2 LIMIT 10;

### importing redo bhai for college pc 
SELECT * 
FROM kp.layoffs; # alex ne world_layoffs naming kai h 
create table kp.layoffs_staging
like kp.layoffs;

select * from kp.layoffs;
insert layoffs_staging
select * 
from kp.layoffs
;
SELECT *
FROM kp.layoffs_staging
;

SELECT company, industry, total_laid_off,`date`,
		ROW_NUMBER() OVER (
			PARTITION BY company, industry, total_laid_off,`date`) AS row_num
	FROM 
		kp.layoffs_staging;

SELECT *
FROM (
	SELECT company, industry, total_laid_off,`date`,
		ROW_NUMBER() OVER (
			PARTITION BY company, industry, total_laid_off,`date`
			) AS row_num
	FROM 
		kp.layoffs_staging
) duplicates
WHERE 
	row_num > 1;
    
# continue eda after so much taam jhaam
select *
from layoffs_staging2;

select max(total_laid_off) , max(percentage_laid_off) # spelling error mt kr 
from layoffs_staging2;
# 1 means 100%

select *
from layoffs_staging2
where percentage_laid_off = 1
order by total_laid_off desc ;

select *
from layoffs_staging2
where percentage_laid_off = 1
order by funds_raised_millions desc ;

select company , sum(total_laid_off)
from layoffs_staging2
group by company ;

select company , sum(total_laid_off)
from layoffs_staging2
group by company 
order by 2 desc ; # alex  aur merer mai thoda alag data ara h bakki process shi data cleaning mai zyda dhyan dena hoga (although alex mai b amzon hi sbse uper h but numer is 18150) order by mai 2 ka mtlb coloumns

select min(`date`), max(`date`)
from layoffs_staging2;

select industry, sum(total_laid_off)
from layoffs_staging2
group by industry  # yha company likha hua the islia errror
order by 2 desc ;


select company , sum(total_laid_off)
from layoffs_staging2
group by company 
order by 2 desc ; # data thoda different h but last mai manufacturing hi h 20 (40 mai re mai h)

select *
from layoffs_staging2;

select country , sum(total_laid_off)
from layoffs_staging2
group by country 
order by 2 desc ; # df(data different)

select year(`date`) , sum(total_laid_off)
from layoffs_staging2
group by year(`date`) 
order by 1 desc ; #df #df


select stage , sum(total_laid_off)
from layoffs_staging2
group by stage 
order by 2 desc ; # order 3 krne pe error (not in alex i tried to explore something other )

select company , sum(percentage_laid_off)
from layoffs_staging2
group by company  
order by 2 desc ; # df 

select stage  , sum(percentage_laid_off) # se (self explore)
from layoffs_staging2
group by stage   
order by 2 desc ;

select company , avg (percentage_laid_off)
from layoffs_staging2
group by company  
order by 2 desc ; # df 

# rolling total layoff
select substring(`date`,6 ,2)  as `month`      # 2 is position
from layoffs_staging2;

select substring(`date`,6 ,2)  as `month`  , sum(total_laid_off)
from layoffs_staging2
group by substring(`date`,6 ,2) ; # month is same as alex but sum is different

select substring(`date`,6 ,2)  as `month`  , sum(total_laid_off)
from layoffs_staging2
group by `month` ; #df

select substring(`date`,1 ,7)  as `month`  , sum(total_laid_off)
from layoffs_staging2
where substring(`date`,1 ,7)is not null 
group by `month`
order by 1 asc ; # df

with rolling_total as 
(
select substring(`date`,1 ,7)  as `month`  , sum(total_laid_off) as total_off
from layoffs_staging2
where substring(`date`,1 ,7)is not null 
group by `month`
order by 1 asc 
)
select `month`, total_off ,sum(total_off)
over (order by  `month`) as Rolling_total      # alex ne rolling_total lia h

from rolling_total ;#df

select company ,sum(total_laid_off)
from layoffs_staging2
group by company
order by 2 desc ;

select company ,`date`,sum(total_laid_off)
from layoffs_staging2
group by company,`date`;


select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)
order by 3 desc ; #df

with company_year as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

)
select *
from company_year ;


with company_year(company,year , total_laid_off) as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

)
select *
from company_year ;

with company_year(company,year , total_laid_off) as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

)
select * ,dense_rank() over (partition by year order by total_laid_off desc) # alex mai years pe b run hogya mere mai sirf year pe run hoga 
from company_year ;

with company_year(company,year , total_laid_off) as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

)
select * ,dense_rank() over (partition by year order by total_laid_off desc)
from company_year 
where year is not null ;

with company_year(company,year , total_laid_off) as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

)
select * ,dense_rank() over (partition by year order by total_laid_off desc) as ranking 
from company_year 
where year is not null
order by ranking  asc ;

with company_year(company,year , total_laid_off) as 
(
select company ,year(`date`), sum(total_laid_off)
from layoffs_staging2
group by company, year(`date`)

), Company_year_rank as
(select * , 
dense_rank() over (partition by year order by total_laid_off desc) as ranking 
from company_year 
where year is not null)
select *
from  Company_year_rank
where ranking <= 5
; #df












