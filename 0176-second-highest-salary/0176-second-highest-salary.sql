/* Write your PL/SQL query statement below */
select MAX(salary) SecondHighestSalary
from employee
where salary < (select max(salary) from employee);