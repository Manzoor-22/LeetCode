# Write your MySQL query statement below

select distinct a.id
from weather a
cross join weather b
where datediff(a.recordDate ,b.recordDate) = 1 And a.temperature > b.temperature;