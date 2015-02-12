package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

		// Fetch all students whose notes in a specific course were greater than
		// 4
		// for example: finalNote>4
		BasicDBObject fields = new BasicDBObject();
		fields.put("course", "algebra");
		fields.put("finalNote", new BasicDBObject("$gt", 4));
		DBCollection assists = mongoOperation.getCollection("assists");
		DBCursor cursor = assists.find(fields);
		DBCollection students = mongoOperation.getCollection("students");
		BasicDBObject filter = new BasicDBObject();
		System.out.println("--Fetch all students whose notes in a specific course were greater than 4---");
		while (cursor.hasNext()) {
			filter.put("_id", cursor.next().get("student"));
			DBObject studentCursor = students.findOne(filter);
			System.out.println(studentCursor);
		}

		// Fetch all courses ordered by name for a given teacher
		// for example ordered asc
		System.out.println();
		DBCollection courses = mongoOperation.getCollection("courses");
		BasicDBObject filter2 = new BasicDBObject();
		filter2.put("teacher", "t1");
		DBCursor cursor2 = courses.find(filter2).sort(new BasicDBObject("_id", 1));// order
																					// asc
		System.out.println("---Fetch all courses ordered by name for a given teacher---");
		while (cursor2.hasNext()) {
			System.out.println(cursor2.next());
		}
		
		
		// Add a new field to “courses” collection to identify which courses are
		// finished
		// for example add finished to algebra
		System.out.println();
		BasicDBObject newDocument = new BasicDBObject();
		newDocument.append("$set", new BasicDBObject().append("finished", 1));
		BasicDBObject searchQuery = new BasicDBObject().append("_id", "algebra");
		courses.update(searchQuery, newDocument);

		

		/*Other: using Query and Criteria
		 * Query searchQuery = new
		 * Query(Criteria.where("course").is("algebra").andOperator
		 * (Criteria.where("finalNote").gt(4))); List<StudentAssistCourse>
		 * listAssists=
		 * mongoOperation.find(searchQuery,StudentAssistCourse.class); for(int
		 * i=0; i< listAssists.size(); i++){ searchQuery = new
		 * Query(Criteria.where("_id").is(listAssists.get(i).getIdStudent()));
		 * Student student=mongoOperation.findOne(searchQuery,Student.class);
		 * System.out.println(student); }
		 * 
		 * searchQuery=new Query(Criteria.where("teacher").is("t1"));
		 */

	}
}
