package com.rehman.oops.other;

//  1

interface CourseInterFace {

    public void buyCourse();

}

//  2

class Java_Course implements CourseInterFace {

    public void buyCourse() {
        System.out.println("Buy the Java Course");
    }
}

//  3

class Hibernate_Course implements CourseInterFace {

    public void buyCourse() {
        System.out.println("Buy the Hibernate Course");
    }
}

//  4

class RehmanInstitute {

    CourseInterFace course;

    public void setCourse(CourseInterFace course) {
        // reference101
        // CourseInterFace course = new Java_Course();
        this.course = course;
    }

    public void buyCourse() {
        course.buyCourse();
    }
}

//  5

public class SpringProblem {

    public static void main(String[] args) {

        RehmanInstitute rk = new RehmanInstitute();

        rk.setCourse(new Java_Course());    // reference101

        rk.buyCourse();
    }
}


/*


STACK                           HEAP

┌────────────────┐              ┌─────────────────────────┐
│ main()         │              │ RehmanInstitute object  │
│                │              │                         │
│ rk ────────────│────────────> │ CourseInterFace course  │
│                │              │                     │   │
└────────────────┘              └─────────────────────│───┘
                                                      │
                                                      ↓
                                            ┌─────────────────────────┐
                                            │ Java_Course object      │
                                            └─────────────────────────┘


course.buyCourse(); // do this the course has address of java-class-object

 */
