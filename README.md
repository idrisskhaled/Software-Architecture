# Architecture logicielle : SOLID
************
## SRP
<b>Explanation</b>: (Single-Responsibility Principle)
 a class should only have one job.

<b>Problem of the design </b>: the CarManager class have more then one job (fetching the data from db, calculating the best car)

<b>Solution</b> : separate the jobs done by the class each in a class, create a CarRepository class that handles the transactions with the db.
***********
## OCP
<b>Explanation</b>: Open-closed Principle states: Objects or entities should be open for extension but closed for modification.
This means that a class should be extendable without modifying the class itself.

<b>Problem of the design </b>: if we add another resource type, we would have to change the internal code of the methods of the class by adding another case in the switch blocs. That would violate the open-closed principle.

<b>Solution</b> : create a class for each type of slots that extends an abstract base class Resource. Implement the parent class methods. Pass the parent class as a parameter to the allocation methods and call its methods. That will avoid changing the code in the future (Scalability ++).  
***********

## LSP
<b>Explanation</b>: Liskov Substitution Principle states: Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
This means that every subclass or derived class should be substitutable for their base or parent class.

<b>Problem of the design </b>: The electronic duck is inheriting the swim and quack methods but it can't neither swim nor quack when it's off.

<b>Solution</b> : Turn the electronic duck on before quacking and swimming 
***********

## ISP
<b>Explanation</b>: Interface segregation principle states: A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.

<b>Problem of the design </b>: 
* The TimedDoor is implementing proximityCallback method and it's useless.
* The SensingDoor is implementing timeOutCallback method and it's useless.

<b>Solution</b> : add a Timing and Sensing interfaces that inherit the Door interface. put proximityCallback in the sensing interface and timeOutCallback in the timing interface. Sensing Door should implement sensing interface (contains only the needed methods). Same for TimedDoor.
***********

## DIP

<b>Explanation</b>: Dependency inversion principle states: Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

<b>Problem of the design </b>: the MyDatabase isn't injected. It's instantiated in the depending class.

<b>Solution</b> : create a IMyDatabase dependency interface and inject it in its dependents. The MyDatabase should implement IMyDatabase.

*********
# Thank you  