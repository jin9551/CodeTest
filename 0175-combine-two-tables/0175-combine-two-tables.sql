/* Write your PL/SQL query statement below */
Select a.firstName, a.lastName, b.city, b.state
from person a, address b
where a.personId = b.personId (+)