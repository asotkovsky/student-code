-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

INSERT INTO collection 
VALUES (DEFAULT, 'Bill Murray Collection');

UPDATE movie
SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
FROM movie m
JOIN movie_actor ma ON m.movie_id = ma.movie_id
JOIN person p ON ma.actor_id = p.person_id AND p.person_name = 'Bill Murray'
WHERE movie.movie_id = m.movie_id;


