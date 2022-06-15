-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result around 110-120)

SELECT AVG(length_minutes) AS average_length
FROM movie
JOIN movie_genre mg ON movie.movie_id = mg.movie_id
JOIN genre g ON mg.genre_id = g.genre_id
WHERE g.genre_name LIKE 'Science Fiction';