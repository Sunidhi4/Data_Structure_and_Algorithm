import java.util.*;
public class PriorityQueue01
{
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        public Student(String name, int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank; 
        }
    }
     public static void main ( String args[]) 
{
     PriorityQueue<Integer> pq = new PriorityQueue<>(); // priorityQueue(Comparator.reverseOrder())

     pq.add(3); //O(logn)
     pq.add(4);
     pq.add(1);
     pq.add(7);

     while(!pq.isEmpty())
     {
        System.out.println(pq.peek());  //O(1)
        pq.remove(); //O(logn)
     }

     PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
     pq1.add(new Student("A", 4));
     pq1.add(new Student("B", 5));
     pq1.add(new Student("C", 2));
     pq1.add(new Student("D", 12));

     while(!pq1.isEmpty())
     {
        System.out.println(pq1.peek().name+" -> "+pq1.peek().rank);
        pq1.remove();
     }
} 
 } 