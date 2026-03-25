package edu.sdsu.cs160l.datastructure.queue;

import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // TODO - Create a queue of students 5 students
        // TODO - initialise 5 students and add them to the queue
        // TODO - remove the first two students and add 1 student
        // TODO - print the final queue

        Student john = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student jane = new Student(2L, "Jane", 3.9, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        Student abdul = new Student(3L, "Abdul", 3.5, StudentLevel.JUNIOR, StudentMajor.MATH);
        Student meeta = new Student(4L, "Meeta", 3.7, StudentLevel.SENIOR, StudentMajor.BIOLOGY);
        Student aditi = new Student(5L, "Aditi", 3.8, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student tron = new Student(6L, "Tron", 3.6, StudentLevel.JUNIOR, StudentMajor.PHYSICS);

        Queue<Student> studentQueue = new LinkedList<>();
        studentQueue.add(john);
        studentQueue.add(jane);
        studentQueue.add(abdul);
        studentQueue.add(meeta);
        studentQueue.add(aditi);

        studentQueue.poll();
        studentQueue.poll();
        studentQueue.add(tron);

        System.out.println("Final student queue:");
        for (Student s : studentQueue) {
            System.out.println(s);
        }
    }
}
