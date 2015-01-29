SELECT course.course_name as Course, CONCAT(last_name,',',first_name) as Teacher,
CONCAT(student_last_name,',',student_first_name) as Student
FROM ((teacher INNER JOIN course ON teacher.teacher_id=course.Teacher_id) INNER JOIN student_assist_course 
ON course.course_name=student_assist_course.Course_name) 
INNER JOIN student ON student_assist_course.Student_registration_number=student.registration_number
WHERE course.course_name= 'algebra'
ORDER BY course.course_name ASC, student_last_name ASC;

SELECT CONCAT(student_last_name,',',student_first_name) as Student, course.course_name as Course, final 
FROM (course INNER JOIN student_assist_course ON course.course_name=student_assist_course.Course_name) 
INNER JOIN student ON student_assist_course.Student_registration_number=student.registration_number
WHERE student_last_name= 'Abaca'
ORDER BY course.course_name ASC, final ASC;

SELECT CONCAT(student_last_name,',',student_first_name) as Student, course.course_name as Course, final 
FROM (course INNER JOIN student_assist_course ON course.course_name=student_assist_course.Course_name) 
INNER JOIN student ON student_assist_course.Student_registration_number=student.registration_number
WHERE student_registration_number= 9
ORDER BY course.course_name ASC, final ASC;


