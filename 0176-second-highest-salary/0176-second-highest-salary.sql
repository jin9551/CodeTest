/* Write your PL/SQL query statement below */
select MAX(salary) as "SecondHighestSalary"
from employee
where salary < (select max(salary) from employee);