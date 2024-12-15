# Write your MySQL query statement below

select today.id
from weather yesterday
cross join weather today

where datediff(today.recorddate, yesterday.recorddate) = 1
and today.temperature > yesterday.temperature;