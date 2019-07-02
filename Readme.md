# Design Patterns

In software engineering, a design pattern is a general reusable solution to common problems observed during software design development.

A design pattern is not a finished design that can be transformed directly into code.

It is a description or template for how to solve a problem in efficient manner, without having to re-invent the cycle again.

They can be classified under following heads:

1. Creational 
2. Structural
3. Behavioral

# Proxy Design pattern

Creational design patterns deals with object creation - where object creation is simplified for better access, polymorphic behavior, logging, caching

Proxy design pattern is creational as it helps:

1. create a proxy to original object - by extending it's logic
2. create a kind of wrapper around original object to control it's processing logic


# Chain of Responsibility Design Pattern

Chain of Responsibility is behavioral design pattern that allows passing request along the chain of potential handlers until one of them handles request.

The pattern allows multiple objects to handle the request without coupling sender class to the concrete classes of the receivers. The chain can be composed dynamically at runtime with any handler that follows a standard handler interface.

Chain of responsibilities implementation maintains a chain of all objects which are capable of handling requests. This chain is created an maintained by client. If the request is passed to a handler and it does not know how to handle it, then it is passed along the chain by some way. 


