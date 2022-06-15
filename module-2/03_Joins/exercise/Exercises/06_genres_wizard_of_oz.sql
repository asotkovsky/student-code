-- 6. The genres of "The Wizard of Oz" (3 rows)

SELECT genre_name
FROM genre
JOIN movie_genre mg ON genre.genre_id = mg.genre_id
JOIN movie m ON mg.movie_id = m.movie_id
WHERE m.title = 'The Wizard of Oz';
