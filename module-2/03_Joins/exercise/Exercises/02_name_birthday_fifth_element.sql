-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)

SELECT person_name, birthday
FROM person
JOIN movie_actor ma ON person_id = ma.actor_id
JOIN movie m ON ma.movie_id = m.movie_id
WHERE title LIKE 'The Fifth Element';

