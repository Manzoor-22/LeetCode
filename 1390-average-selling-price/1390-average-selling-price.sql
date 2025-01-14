# Write your MySQL query statement below

select p.product_id, ifnull(round(sum(u.units*p.price)/sum(u.units), 2), 0) as average_price
from unitssold u
right join prices p on p.product_id = u.product_id and u.purchase_date <= p.end_date and u.purchase_date >= start_date
group by p.product_id;