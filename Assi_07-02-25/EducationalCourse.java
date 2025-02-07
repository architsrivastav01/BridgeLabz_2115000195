class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 30);
        System.out.println(course.getCourseDetails());

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 45, "Udemy", true);
        System.out.println(onlineCourse.getCourseDetails());

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Spring Boot", 60, "Coursera", true, 199.99, 20);
        System.out.println(paidCourse.getCourseDetails());
    }
}

class Course {
    String courseName;
    int duration;
    
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    
    String getCourseDetails() {
        return "Course: " + courseName + ", Duration: " + duration + " days";
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;
    
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    
    @Override
    String getCourseDetails() {
        return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    
    @Override
    String getCourseDetails() {
        return super.getCourseDetails() + ", Fee: $" + fee + ", Discount: " + discount + "%";
    }
}

