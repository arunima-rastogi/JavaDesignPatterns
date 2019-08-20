## Command design pattern
Command design pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time. 

Four terms always associated with the command pattern are 
#### command, receiver, invoker and client.

##### command:
A command object knows about receiver and invokes a method of the receiver.

##### Invoker:
An invoker object knows how to execute a command, and optionally does bookkeeping about the command execution.

##### Client:
The client decides which commands to execute at which points. 

##### Receiver:
The receiver do the work when the execute() method in command is called.