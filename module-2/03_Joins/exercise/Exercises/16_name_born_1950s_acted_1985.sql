-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)

SELECT DISTINCT person.person_name, person.birthday
FROM person
JOIN movie_actor ma ON person.person_id = ma.actor_id
JOIN movie m ON ma.movie_id = m.movie_id
WHERE person.birthday BETWEEN '1950-01-01' AND '1959-12-31'
AND EXTRACT(YEAR FROM release_date) = 1985;
