import com.theos.building.Building;
import com.theos.person.Person;
import com.theos.threads.PeopleGeneratingThread;


import static com.theos.building.Elevator.generateElevator;
import static com.theos.building.Floor.generateFloor;
import static com.theos.person.Person.createPerson;
import static java.lang.Thread.sleep;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Building building = new Building(3, 1);
        for (int i = 1; i < building.getNumberOfFloors()+1; i++){
            building.addFloor(generateFloor(i));
        }
        for (int i = 1; i < building.getNumberOfElevators()+1; i++){
            building.addElevator(generateElevator(i));
        }
        PeopleGeneratingThread peopleGeneratingThread = new PeopleGeneratingThread(building);
        peopleGeneratingThread.start();
//        int mass = building.getFloors()[0].getQueueUp().element().getMass();
//        int tfloor = building.getFloors()[0].getQueueUp().element().getTargetFloor();
//        System.out.println(mass + " " + tfloor);
        System.out.println(building);
        for (int i = 1; i < 10; i++) {
            System.out.println("Floor 1");
            if (!building.getFloors()[0].getQueueUp().isEmpty()){
                System.out.println("Queue up : " + building.getFloors()[0].getQueueUp().get(0).getMass());
            }
            if (!building.getFloors()[0].getQueueDown().isEmpty()) {
                System.out.println("Queue down : " + building.getFloors()[2].getQueueDown().get(0).getMass());
            }
            System.out.println("Floor 2");
            if (!building.getFloors()[1].getQueueUp().isEmpty()){
                System.out.println("Queue up : " + building.getFloors()[1].getQueueUp().get(0).getMass());
            }
            if (!building.getFloors()[1].getQueueDown().isEmpty()) {
                System.out.println("Queue down : " + building.getFloors()[2].getQueueDown().get(0).getMass());
            }
            System.out.println("Floor 3");
            if (!building.getFloors()[2].getQueueUp().isEmpty()){
                System.out.println("Queue up : " + building.getFloors()[2].getQueueUp().get(0).getMass());
            }
            if (!building.getFloors()[2].getQueueDown().isEmpty()) {
                System.out.println("Queue down : " + building.getFloors()[2].getQueueDown().get(0).getMass());
            }
            sleep(1000);
        }

    }
}
