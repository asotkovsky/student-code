-- Part one: Inner joins

---- Joining pizza and size tables

SELECT pizza_id, size.size_id, size_description, diameter, crust, sauce
FROM pizza
JOIN size ON pizza.size_id = size.size_id;



---- Joining sale and customer tables

SELECT sale_id, customer.customer_id, total, first_name || ' ' || last_name AS full_name
FROM sale
JOIN customer on sale.customer_id = customer.customer_id;



---- Joining pizza, pizza_topping, and topping tables






-- Part two: Outer joins

---- LEFT



---- RIGHT



