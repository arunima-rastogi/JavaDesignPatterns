## Adapter design pattern

Adapter design pattern is a "Structural design pattern", which helps interaction between two incompatible interfaces without changing their existing code.

Such interfaces may be incompatible, but the inner functionality need to perform same functionality.

Adapter pattern is often used to make existing classes work with others without modifying their source code

There are the following specifications for the adapter pattern:

### Target Interface: 
This is the desired interface class which will be used by the clients.
### Adapter class: 
This class is a wrapper class which implements the desired target interface and modifies the specific request available from the Adaptee class.
### Adaptee class: 
This is the class which is used by the Adapter class to reuse the existing functionality and modify them for desired use.
### Client: 
This class will interact with the Adapter class.