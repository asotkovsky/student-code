-- 3. For all actors with the last name of "Jones", display the actor's name and movie titles they appeared in. Order the results by the actor names (A-Z). (48 rows)

SELECT  person_name, m.title
FROM person 
JOIN movie_actor ma ON person_id = ma.actor_id
JOIN movie m ON ma.movie_id = m.movie_id
WHERE person_name LIKE '% Jones'
ORDER BY person_name;

