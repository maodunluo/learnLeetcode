-- 1412. Find the Quiet Students in All Exams

use learning;

CREATE TABLE IF NOT EXISTS Student (student_id int, student_name varchar(30));
CREATE TABLE IF NOT EXISTS Exam (exam_id int, student_id int, score int);
TRUNCATE TABLE Student;
INSERT INTO Student (student_id, student_name) VALUES ('1', 'Daniel');
INSERT INTO Student (student_id, student_name) VALUES ('2', 'Jade');
INSERT INTO Student (student_id, student_name) VALUES ('3', 'Stella');
INSERT INTO Student (student_id, student_name) VALUES ('4', 'Jonathan');
INSERT INTO Student (student_id, student_name) VALUES ('5', 'Will');
TRUNCATE TABLE Exam;
INSERT INTO Exam (exam_id, student_id, score) VALUES ('10', '1', '70');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('10', '2', '80');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('10', '3', '90');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('20', '1', '80');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('30', '1', '70');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('30', '3', '80');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('30', '4', '90');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('40', '1', '60');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('40', '2', '70');
INSERT INTO Exam (exam_id, student_id, score) VALUES ('40', '4', '80');

SELECT
	*
FROM
	Student
WHERE
	student_id IN (
	SELECT DISTINCT
		( E3.student_id )
	FROM
		Exam AS E3
	WHERE
		E3.student_id NOT IN (
		SELECT DISTINCT
			( student_id )
		FROM
			Exam
			RIGHT JOIN ( SELECT exam_id, max( score ) AS score FROM Exam GROUP BY exam_id UNION ALL SELECT exam_id, min( score ) AS score FROM Exam GROUP BY exam_id ) AS E2 ON Exam.exam_id = E2.exam_id
			AND Exam.score = E2.score
		)
	)