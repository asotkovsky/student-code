-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)

SELECT title, release_date
FROM movie
JOIN movie_actor ma ON movie.movie_id = ma.movie_id
JOIN person p on ma.actor_id = p.person_id
WHERE person_name = 'Tom Hanks';
