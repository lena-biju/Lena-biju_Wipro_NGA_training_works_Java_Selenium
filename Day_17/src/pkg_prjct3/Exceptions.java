package pkg_prjct3;

public class Exceptions {
	class CourseAlreadyRegisteredException extends Exception{
		public CourseAlreadyRegisteredException(String message) {
			super(message);
		}
	}
	
	class CourseNotFoundException extends Exception{
		public CourseNotFoundException(String message) {
			super(message);
		}
	}

}
