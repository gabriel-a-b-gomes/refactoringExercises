package exercise4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;


public class App {

	public static void main(String[] args) {
		// Client code
		Person kent = new Person();
		// Set s = new HashSet();
		// s.add(new Course("MC426", false));
		// s.add(new Course("MC646", true));
		// kent.setCourses(s);
		kent.addCourse(new Course("MC426", false));
		kent.addCourse(new Course("MC646", true));
		Assert.assertEquals(2, kent.getCourses().size());
		Course machinelearning = new Course("MC886", true);
		// kent.getCourses().add(machinelearning);
		// kent.getCourses().add(new Course("MC536", false));
		kent.addCourse(machinelearning);
		kent.addCourse(new Course("MC536", false));
		Assert.assertEquals(4, kent.getCourses().size());
		// kent.getCourses().remove(machinelearning);
		kent.removeCourse(machinelearning);
		Assert.assertEquals(3, kent.getCourses().size());

		// Iterator iter = kent.getCourses().iterator();
		Iterator iter = kent.getCourseIterator();
		int count = 0;
		while (iter.hasNext()) {
			Course each = (Course) iter.next();
			if (each.isAdvanced()) {
				count++;
			}
		}
		System.out.print("Advanced courses: " + count);
	}

}