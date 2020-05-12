# Factory Design pattern

We use this pattern when we want to instantiate the sub-class of another class/interface but don't know which one.
In this pattern, objects are created without exposing the creation logic to the client, and refers to the newly created object using a common interface called a Product
We define an interface called Creator for creating an object
This pattern encapsulates the instantiation of concrete types

Advantages:
Decouples creation logic from the actual logic
We can add additional implementers and make changes with minimal impact
Client is not tightly coupled to the concrete implementation of the class to be used i.e. sub-classes of Product interface(or abstract class)
COde is more robust and easy to extend
Promotes coding to interface than implementation
Connects parallel class hierarchies

Dis-advantages:

