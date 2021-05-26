import com.theos.building.Building;
import com.theos.threads.AllFloorsSpectatingThread;
import com.theos.threads.PeopleGeneratingThread;


import static com.theos.building.elevator.Elevator.generateElevator;
import static com.theos.building.floor.Floor.generateFloor;
import static java.lang.Thread.sleep;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        Building building = new Building(3, 1);


//        int mass = building.getFloors()[0].getQueueUp().element().getMass();
//        int tfloor = building.getFloors()[0].getQueueUp().element().getTargetFloor();
//        System.out.println(mass + " " + tfloor);
        System.out.println(building);
        AllFloorsSpectatingThread allFloorsSpectatingThread = new AllFloorsSpectatingThread(building);

    }
}
