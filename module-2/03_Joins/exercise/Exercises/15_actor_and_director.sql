-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

SELECT title, p.person_name
FROM movie 
JOIN movie_actor ma ON movie.movie_id = ma.movie_id
JOIN person p ON ma.actor_id = p.person_id
WHERE movie.director_id = ma.actor_id;