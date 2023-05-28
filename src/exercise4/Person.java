package exercise4;

import java.util.Set;

// CODE SMELL: DATA CLASS
// public class Person {

// 	private Set courses;

// 	public Set getCourses() {
// 		return courses;
// 	}

// 	public void setCourses(Set arg) {
// 		courses = arg;
// 	}
// }

// Refactoring: Encapsulate Collection
public class Person {

	private Set courses;

	public Set getCourses() {
		return courses;
	}

	public void addCourse(Course course) {
		courses.add(course);
	}

	public void removeCourse(Course course) {
		courses.remove(course);
	}

	public Iterator getCourseIterator() {
		return courses.iterator();
	}
}