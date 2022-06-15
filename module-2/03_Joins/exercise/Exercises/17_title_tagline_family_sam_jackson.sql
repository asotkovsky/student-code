-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)

SELECT title, tagline
FROM movie 
JOIN movie_genre mg ON movie.movie_id = mg.movie_id
JOIN genre g ON mg.genre_id = g.genre_id
JOIN movie_actor ma ON movie.movie_id = ma.movie_id
JOIN person p ON ma.actor_id = p.person_id
WHERE g.genre_name = 'Family'AND p.person_name LIKE 'Samuel L. Jackson';
