-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)

INSERT INTO person
VALUES (DEFAULT, 'Alex Sotkovsky', '1994-07-25', null, 'A Java developer student at Tech Elevator', 'https://www.linkedin.com/asotkovsky', null);

UPDATE movie
SET director_id = (SELECT person_id FROM person WHERE person_name = 'Alex Sotkovsky')
WHERE title = 'The Blob';

