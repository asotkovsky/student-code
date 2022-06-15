-- 21. For every person in the person table with the first name of "George", list the number of movies they've been in--include all Georges, even those that have not appeared in any movies. Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'

SELECT COUNT(m.movie_id) AS num_of_movies, person_name
FROM person
LEFT JOIN movie_actor ma ON person_id = ma.actor_id
LEFT JOIN movie m ON ma.movie_id = m.movie_id
WHERE person_name LIKE 'George %'
GROUP BY person_id
ORDER BY person_name;