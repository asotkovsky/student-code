-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)

SELECT DISTINCT p.person_name
FROM movie 
JOIN person p ON movie.director_id = p.person_id
JOIN collection c ON movie.collection_id = c.collection_id
WHERE collection_name = 'Harry Potter Collection';