
# IsSoft Final Task
<h2>Algoritm:</h2>
First of all we have class Building, that has PeopleGeneratingThread<br>
in it's constructor. This thread generates people on random floor with random<br>
mass and random target floor in random time, that differs from 1 to 5 secs.<br> 
Than when we are sure that current floor differs than target floor we can <br>
add person to the queue on his spawnable floor.<hr>
All floors starts there own thread called FloorButtonClickedThread that checking<br>
is there any person in the queue and if someone spawned calls Button function clicked()<br>
This function will call nearest or empty elevator<hr>
