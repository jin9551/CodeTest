/* Write your PL/SQL query statement below */
select MAX(salary) as "SecondHighestSalary"
from employee
where salary not in (select max(salary) from employee);