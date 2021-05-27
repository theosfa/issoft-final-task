import com.theos.building.Building;
import com.theos.threads.AllFloorsSpectatingThread;
import com.theos.threads.PeopleGeneratingThread;


import java.sql.Array;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.theos.building.elevator.Elevator.generateElevator;
import static com.theos.building.floor.Floor.generateFloor;
import static java.lang.Thread.sleep;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

//        Building building = new Building(3, 1);
//        System.out.println(building);
//        AllFloorsSpectatingThread allFloorsSpectatingThread = new AllFloorsSpectatingThread(building);

//        Queue<Integer> testQueue = new LinkedList<>();
//        testQueue.add(3);
//        testQueue.add(2);
//        testQueue.add(5);
//        testQueue.add(1);
//        testQueue.add(4);
//        for (int i = 0; i < 5; i++){
//            System.out.println(testQueue.poll());
//        }
//        System.out.println("-------------------------");
//        testQueue.add(3);
//        testQueue.add(2);
//        testQueue.add(5);
//        testQueue.add(1);
//        testQueue.add(4);
//        sortQueue(testQueue);
//        for (int i = 0; i < 5; i++){
//            System.out.println(testQueue.poll());
//        }
//        System.out.println("-------------------------");
//        testQueue.add(3);
//        testQueue.add(2);
//        testQueue.add(5);
//        testQueue.add(1);
//        testQueue.add(4);
//        sortQueue(testQueue);
//        for (int i = 0; i < 5; i++){
//            System.out.println(testQueue.poll());
//        }
    }

//    public static int minIndex(Queue<Integer> list,
//                               int sortIndex)
//    {
//        int min_index = -1;
//        int min_value = Integer.MAX_VALUE;
//        int s = list.size();
//        for (int i = 0; i < s; i++)
//        {
//            int current = list.peek();
//
//            // This is dequeue() in Java STL
//            list.poll();
//
//            // we add the condition i <= sortIndex
//            // because we don't want to traverse
//            // on the sorted part of the queue,
//            // which is the right part.
//            if (current <= min_value && i <= sortIndex)
//            {
//                min_index = i;
//                min_value = current;
//            }
//            list.add(current);
//        }
//        return min_index;
//    }
//
//    // Moves given minimum element
//    // to rear of queue
//    public static void insertMinToRear(Queue<Integer> list,
//                                       int min_index)
//    {
//        int min_value = 0;
//        int s = list.size();
//        for (int i = 0; i < s; i++)
//        {
//            int current = list.peek();
//            list.poll();
//            if (i != min_index)
//                list.add(current);
//            else
//                min_value = current;
//        }
//        list.add(min_value);
//    }
//
//    public static void sortQueueUp(Queue<Integer> list)
//    {
//        for(int i = 1; i <= list.size(); i++)
//        {
//            int min_index = minIndex(list,list.size() - i);
//            insertMinToRear(list, min_index);
//        }
//    }
//
//    public static void sortQueueDown(Queue<Integer> list)
//    {
//        for(int i = 1; i <= list.size(); i++)
//        {
//            int min_index = minIndex(list,list.size() - i);
//            insertMinToRear(list, min_index);
//        }
//    }
}
