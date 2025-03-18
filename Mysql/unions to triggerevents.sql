DROP DATABASE IF EXISTS `Parks_and_Recreation`; #unions to trigger and events
CREATE DATABASE `Parks_and_Recreation`;
USE `Parks_and_Recreation`;






CREATE TABLE employee_demographics (
  employee_id INT NOT NULL,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  age INT,
  gender VARCHAR(10),
  birth_date DATE,
  PRIMARY KEY (employee_id)
);

CREATE TABLE employee_salary (
  employee_id INT NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  occupation VARCHAR(50),
  salary INT,
  dept_id INT
);


INSERT INTO employee_demographics (employee_id, first_name, last_name, age, gender, birth_date)
VALUES
(1,'Leslie', 'Knope', 44, 'Female','1979-09-25'),
(3,'Tom', 'Haverford', 36, 'Male', '1987-03-04'),
(4, 'April', 'Ludgate', 29, 'Female', '1994-03-27'),
(5, 'Jerry', 'Gergich', 61, 'Male', '1962-08-28'),
(6, 'Donna', 'Meagle', 46, 'Female', '1977-07-30'),
(7, 'Ann', 'Perkins', 35, 'Female', '1988-12-01'),
(8, 'Chris', 'Traeger', 43, 'Male', '1980-11-11'),
(9, 'Ben', 'Wyatt', 38, 'Male', '1985-07-26'),
(10, 'Andy', 'Dwyer', 34, 'Male', '1989-03-25'),
(11, 'Mark', 'Brendanawicz', 40, 'Male', '1983-06-14'),
(12, 'Craig', 'Middlebrooks', 37, 'Male', '1986-07-27');


INSERT INTO employee_salary (employee_id, first_name, last_name, occupation, salary, dept_id)
VALUES
(1, 'Leslie', 'Knope', 'Deputy Director of Parks and Recreation', 75000,1),
(2, 'Ron', 'Swanson', 'Director of Parks and Recreation', 70000,1),
(3, 'Tom', 'Haverford', 'Entrepreneur', 50000,1),
(4, 'April', 'Ludgate', 'Assistant to the Director of Parks and Recreation', 25000,1),
(5, 'Jerry', 'Gergich', 'Office Manager', 50000,1),
(6, 'Donna', 'Meagle', 'Office Manager', 60000,1),
(7, 'Ann', 'Perkins', 'Nurse', 55000,4),
(8, 'Chris', 'Traeger', 'City Manager', 90000,3),
(9, 'Ben', 'Wyatt', 'State Auditor', 70000,6),
(10, 'Andy', 'Dwyer', 'Shoe Shiner and Musician', 20000, NULL),
(11, 'Mark', 'Brendanawicz', 'City Planner', 57000, 3),
(12, 'Craig', 'Middlebrooks', 'Parks Director', 65000,1);



CREATE TABLE parks_departments (
  department_id INT NOT NULL AUTO_INCREMENT,
  department_name varchar(50) NOT NULL,
  PRIMARY KEY (department_id)
);

INSERT INTO parks_departments (department_name)
VALUES
('Parks and Recreation'),
('Animal Control'),
('Public Works'),
('Healthcare'),
('Library'),
('Finance');


# unions(allows u to combine rows ) 

select age, gender 
from employee_demographics
UNION
select * 
from employee_salary
;

select age, gender 
from employee_demographics
UNION
select first_name, last_name # wrong way do this
from employee_salary
;

#right way 
select first_name, last_name
from employee_demographics
UNION
select  first_name, last_name
from employee_salary
;

select first_name, last_name
from employee_demographics
UNION distinct #(remove all the duplicates)
select  first_name, last_name
from employee_salary
;

select first_name, last_name
from employee_demographics
UNION all #have duplicates 
select  first_name, last_name
from employee_salary
;

select first_name, last_name , 'old' as label
from employee_demographics
where age>50
;

select first_name, last_name , 'old' as label
from employee_demographics
where age>50
UNION
select  first_name, last_name , 'highly paid employee' as label
from employee_salary
where salary>70000
;


select first_name, last_name , 'old man ' as label
from employee_demographics
where age > 40 and gender = 'Male'
UNION
select first_name, last_name ,  'old lady '  as label
from employee_demographics 
where age > 40 and  gender = 'Female'
union 
select  first_name, last_name , 'highly paid employee' as label
from employee_salary
where salary>70000 
; # thoda dhyan se dekh k 


select first_name, last_name , 'old man ' as label
from employee_demographics
where age > 40 and gender = 'Male'
UNION
select first_name, last_name ,  'old lady '  as label
from employee_demographics 
where age > 40 and  gender = 'Female'
union 
select  first_name, last_name , 'highly paid employee' as label
from employee_salary
where salary>70000 
order by first_name, last_name
;

## string functions (are built in function )
select length('skyfall')   ;# length of string ; 

SELECT first_name, length(first_name) #(close and open is important)
FROM employee_demographics
;

SELECT first_name, length(first_name) #(close and open is important)
FROM employee_demographics
order by 2 ; # increasing order  # used most in phone numbers 

select upper('sky');
select lower('sky');

select first_name , upper (first_name)
from employee_demographics;

select trim('   sky        ');
select ('   sky        ');

select rtrim ('                 sky        ');
select ltrim('   sky                 ');

select first_name, 
left(first_name,4),
right(first_name,4),
substring(first_name,3,2) , -- 3 position and after 2  and comma imp h
birth_date, 
substring(birth_date,6,2) as birth_month
from employee_demographics;

select  first_name, replace(first_name,'a','z') as modifyed
from employee_demographics;


select locate ('n', 'nitin');
select locate ('t', 'nitin'); # give position of number 

select first_name,locate('an',first_name)
from employee_demographics;

select first_name ,last_name,
concat(first_name,last_name)
from employee_demographics;

select first_name ,last_name,
concat(first_name,' ',last_name)  as full_name # mostly used 
# gives space 
from employee_demographics;

# case statement (like if else statments)
select first_name, last_name,
case
	when age <= 30 then 'young'
	end
from employee_demographics;

select first_name, last_name,age,
case
	when age <= 30 then 'young'
    when age  between 31 and 50 then 'old' 
    when age >50 then 'on death door '
end as age_brackets 
from employee_demographics;

# pay increase and bonus 
# <50000 = 5%
# finance = 10%
# >50000 =7%
select  first_name,last_name,salary,
case 
	when salary < 50000 then salary + (salary *0.05)
    when salary > 50000 then salary + (salary *0.07)
end as new_salary,
case
	when dept_id = 6 then salary*.10
end as bonus
from employee_salary;

select *
from employee_salary;
select *
from parks_departments;

-- subqueries
select *
from employee_demographics
where employee_id in 
					(select employee_id 
						from employee_salary
						where dept_id = 1)
;


select  first_name,salary ,
			(select avg(salary) 
			from employee_salary) 
from employee_salary
group by first_name, salary
;

select gender, avg(age),max(age),min(age),count(age)
from employee_demographics
 group by gender ;

select  gender , avg(`max(age)`)
from (select gender, avg(age),max(age),min(age),count(age)
from employee_demographics
 group by gender) as agg_table
 group by gender ; # ' not equal to ` (both are different )


select   avg(max_age)
from (select gender,
 avg(age) as avg_age,
 max(age) as max_age ,
 min(age) as min_age ,
 count(age) 
from employee_demographics
 group by gender) as agg_table
 ; # ' not equal to ` (both are different )

# window function  
select gender ,avg(salary) as avg_salary 
from employee_demographics dem
join employee_salary sal 
	on dem.employee_id = sal.employee_id
group by gender;



select gender, avg(salary) over()
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id;

select gender, avg(salary) over(partition by  gender) 
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id;

select dem.first_name , dem.last_name, gender, avg(salary) over(partition by  gender) 
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id;

select dem.first_name , dem.last_name, gender, avg(salary) as avg_salary
from employee_demographics dem
join employee_salary sal 
	on dem.employee_id = sal.employee_id
group by dem.first_name , dem.last_name, gender;

select dem.first_name,dem.last_name,gender,
sum(salary) over (partition by gender )
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;

# rolling total  # its like cummulative frequency 
select dem.first_name,dem.last_name,gender, salary,
sum(salary) over (partition by gender order by dem.employee_id) as rolling_total
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;

# row number 
select dem.employee_id ,dem.first_name,dem.last_name,gender, salary,
row_number() over()
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;

select dem.employee_id ,dem.first_name,dem.last_name,gender, salary,
row_number() over(partition by gender)
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;

select dem.employee_id ,dem.first_name,dem.last_name,gender, salary,
row_number() over(partition by gender order by salary desc)
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;
    
    
select dem.employee_id ,dem.first_name,dem.last_name,gender, salary,
row_number() over(partition by gender order by salary desc) as row_num,
rank() over(partition by gender order by salary desc) as rank_num
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;



select dem.employee_id ,dem.first_name,dem.last_name,gender, salary,
row_number() over(partition by gender order by salary desc) as row_num,
rank() over(partition by gender order by salary desc) as rank_num,
dense_rank() over(partition by gender order by salary desc) as dense_rank_num

from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id ;


# advance 
# ctes common table expression (allow to define sub query block within main query)
with cte_example as (
select gender, avg(salary), max(salary), min(salary), count(salary)
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select * 
from cte_example ;

# chatgpt 
show tables;
select database();
desc employee_demographics;

# create missing table
-- create table 
-- employee_demographics(
-- employee_id int primary key, 
-- gender varchar (10));
 
# list all schemas
show databases

# use the correct schema
-- use parks_and_recreation ;
-- show tables;
-- show databases  # use the correct schema use parks_and_recreation-- 

-- verify current schema
-- select database(); 

-- redo from scratch to use parks and recreation one- 
-- create database
-- parks_and_recreation;

# check if it existing  already 
-- SHOW DATABASES ; i dont need to create because its already exists

-- use parks_and_recreation ;
-- select database(); # checking current database

SELECT VERSION ();
SHOW databases
USE parks_and_recreation ;
show grants for current_user();
USE `parks_and_recreation` ; # ` means backticks
show databases ;

# redo cte
with cte_example as (
select gender, avg(salary), max(salary), min(salary), count(salary)
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select * 
from cte_example ; # haassss hogya bc 


with cte_example as (
select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select * 
from cte_example ;

with cte_example as (
select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select avg_sal
from cte_example ;

with cte_example as (
select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select avg(avg_sal)
from cte_example ;

select avg(avg_sal) # another way to giv out put (professionalism k lia uper wala use kro )
from  (select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender) example_subquery;

select avg(avg_sal) #( jb cte query ko permanent save nhi kroge to this will give and how to do it ,wll learn in next lecture)
from cte_example;


# multiple ctes (complex)
with cte_example as
 (
select employee_id , gender, birth_date
from employee_demographics
where birth_date > '1985-01-01'
),
cte_example2 as # second one 
(
select * 
from employee_id, salary
where salary > 5000
)
select *
from cte_example
join cte_example2
	on cte_example.employee_id = cte_example2.employee_id
;
# fir se nautanki start 
show databases;
use parks_and_recreation ;
use `parks_and_recreation` ;
select database(); # to confirm parks and recreation selected 
show tables;

# redo multiple ctes 
use parks_and_recreation;
select database();
show tables;
with cte_example as (
select employee_id, gender, birth_date
from employee_demographics
where birth_date> '1985-01-01'
),
cte_example2 as (
select employee_id ,salary 
from employee_salary
where salary>50000
)
select *
from cte_example
join cte_example2
on cte_example.employee_id = cte_example2.employee_id;

with cte_example as (
select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select *
from cte_example ;

# without using 'as' name the coloumn
with cte_example (gender, avg_sal, max_sal ,min_sal ,count_sal ) as ( 
select gender, avg(salary) avg_sal , max(salary) max_sal , min(salary) min_sal , count(salary) count_sal
from employee_demographics dem
join employee_salary sal
	on dem.employee_id = sal.employee_id
group by gender)

select *
from cte_example ;

# temporary tables only seen to the session  that we created    we have to create again if close the sql file 
# most use case (store intermediate results for complex queries )
# 2 ways to create temp table 
--  first one --
create temporary table temp_table
(first_name varchar(50),
last_name varchar(50), 
favorite_movie varchar(100)
);
 # for seen 
 select * 
 from temp_table; # u can insert data into it 
 # insert data 
 insert into temp_table
 values ('nitin','kp', '3 idiots');
 
 
select * 
from temp_table;

# second way 
select *
from employee_salary ;

create temporary table salary_over_50k ;
select *
from employee_salary
where salary >= 50000
;


select  *   -- # iss code run nhi hor h but uper wale se hora h output 
from salary_over_50k ;
# chatgpt 
show tables ; 
# recreate 
create temporary table salary_over_50k
as select *
from employee_salary where salary > 50000
;
show tables ;

-- redo hass chal gya 
select  *   -- # iss code run nhi hor h but uper wale se hora h output 
from salary_over_50k ;

# stored procedures  (way to save your code that can use over an again )
select *
from employee_salary
where salary >= 50000;

create procedure large_salaries() # calling k lia 
select *
from employee_salary
where salary >= 50000;  ####thoda dhyan se dekho parks and recreation mai h 

call large_salaries() ;

# multiple queries
create procedure large_salaries2() # calling k lia 
select *
from employee_salary
where salary >= 50000;  # use delimiter wrna uper wala procedure work krega nbut niche wala nhi 
select *
from employee_salary
where salary >= 10000;

#USING DELIMITER
DELIMITER $$
create procedure large_salaries3() # calling k lia 
begin
	select *
	from employee_salary
	where salary >= 50000;  # use delimiter wrna uper wala procedure work krega nbut niche wala nhi 
	select *
	from employee_salary
	where salary >= 1000;
end$$
delimiter ;

call large_salaries3(); # 3 nhi krega to only one reslut will show 


-- parameter (variables that passed as an input into stored procedures to accept and place it )
DELIMITER $$
create procedure large_salaries4(nitin int ) # calling k lia  # nitin here is parameter
begin
	select  salary
	from employee_salary
	where employee_id = nitin ;  # use delimiter wrna uper wala procedure work krega nbut niche wala nhi 
	
end$$
delimiter ;

call large_salaries4(1);


###--triggers and events (trigger is a block of code that executes automatically when an events take place on specific table  )
 # basically ek jagah update krre to bakki tables mai b update hojae automatically , so need to update every time for each table
delimiter $$
create trigger  employee_insert    # employee_insert (name what u want)
	after insert on employee_salary
    for each row  
begin
	insert into employee_demographics (employee_id, first_name,last_name)
	values (new.employee_id,new.first_name,new.last_name);
end $$
delimiter ;

insert into employee_salary(employee_id,first_name,last_name, occupation,salary,dept_id)
values(13,'nitinkp','kp','data_analyst',100000, null)
;


select * 
from employee_salary;

-- events (trigger happens when events take place scheduled)
select *
from employee_demographics;

delimiter $$
create event delete_retirees
on schedule every 30 second
do 
BEGIN
	DELETE
    FROM employee_demographics
    where age>=60;
end $$
delimiter ;

select * 
from employee_demographics;

# chatgpt 
DROP EVENT IF EXISTS delete_retirees; # stop existing event 
delimiter $$
create event delete_retirees
on schedule every 30 second
do 
BEGIN
	DELETE
    FROM employee_demographics
    where age>=60;
end $$
delimiter ; # done here (jerry gergic delete )


# if event not create
show variables like 'event%';## ()

# if u dont have permission to delete then (uncheck this box)
# finally wrna 4 hr ki mehnat waste hoti bc









