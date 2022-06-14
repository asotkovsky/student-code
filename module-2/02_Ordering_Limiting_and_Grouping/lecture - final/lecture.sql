-- ORDERING RESULTS

SELECT *
FROM state
ORDER BY  census_region DESC, state_name DESC;

-- Populations of all states from largest to smallest.
SELECT *
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT *
FROM state
ORDER BY  census_region DESC, state_name;

-- The biggest park by area
SELECT *
FROM park
ORDER BY area DESC;


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT *
FROM city
ORDER BY population DESC
LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT ((CURRENT_DATE - date_established) / 365) AS age, park_name
FROM park
ORDER BY age DESC, park_name
LIMIT 20;

-- NUMERIC OPERATIONS
SELECT * FROM state;
SELECT round(area/sales_tax, 2)
FROM state
WHERE sales_tax > 0;

SELECT area/CAST(population AS numeric)
FROM state;

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
-- city_name (state_abbreviation)  Columbus (OH)
SELECT (city_name || ' (' || state_abbreviation || ')') AS city_state_abbreviation
FROM city
ORDER BY city_name ASC;

-- The all parks by name and date established.
-- Name: park_name Area: area Date Established: date_established
SELECT 'Name: ' || park_name || ' Area: ' || area || ' Date Established: ' || date_established 
FROM park
ORDER BY has_camping DESC, date_established;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
-- census_region : state_name  in a column called region_and_state
SELECT (census_region || ' : ' || state_name) AS region_and_state
FROM state
WHERE census_region ILIKE '%west%'
ORDER BY census_region DESC, state_name DESC;
-- WHERE census_region IN ('West', 'Midwest')
-- WHERE census_region = 'West' OR census_region = 'Midwest';

SELECT * 
FROM state
WHERE population::varchar LIKE '7%';


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS avg_state_population
FROM state;

-- Total population in the West and South census regions
SELECT SUM(population) AS total_population_in_south_and_west
FROM state
WHERE census_region IN ('West', 'South');

-- The number of cities with populations greater than 1 million
SELECT COUNT(population) AS number_of_large_cities
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(state_nickname) AS number_of_states_with_a_nickname, COUNT(*) AS number_of_states
FROM state;

-- The area of the smallest and largest parks.
SELECT MAX(area) AS largest_park_are, MIN(area) AS smallest_park_area 
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) AS count_of_cities, state_abbreviation
FROM city
GROUP BY state_abbreviation;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, AVG(area) AS avg_park_area
FROM park
GROUP BY has_camping
ORDER BY has_camping DESC;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) AS city_population_for_state
FROM city
GROUP BY state_abbreviation
ORDER BY city_population_for_state DESC;

SELECT * FROM city
-- Add city_name - breaks the query because every city becomes a group
SELECT state_abbreviation, SUM(population) AS city_population_for_state, city_name
FROM city
GROUP BY  state_abbreviation, city_name
ORDER BY city_population_for_state DESC;

-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) AS smallest_population
FROM city
GROUP BY state_abbreviation
ORDER BY smallest_population;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, population
FROM city
ORDER BY city_name
OFFSET 30 LIMIT 10;

-- Rounding the result of an aggregate function
SELECT round(avg(population), 0)
FROM state;


-- SUBQUERIES (optional)
SELECT * FROM state;
-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT(city_name) AS cities, city.state_abbreviation, (
	SELECT state_name
	FROM state
	WHERE state.state_abbreviation = city.state_abbreviation
)
FROM city
GROUP BY state_abbreviation

-- Include the names of the smallest and largest parks
SELECT park_name, area
FROM park p,
	(
		SELECT MIN(area) as smallest, MAX(area) as largest
		FROM park
		WHERE area > 0 
	) as sl
WHERE p.area = sl.smallest OR p.area = sl.largest;


SELECT * FROM park;
-- List the capital cities for the states in the Northeast census region.

SELECT city_name, state_abbreviation 
FROM city
WHERE city_id IN (SELECT capital FROM state WHERE census_region = 'Northeast');
