# Street Writer

## Story

A new player, Ryu, appears from nowhere on the scene of the real estate market!
At first, no one suspects that he will change the whole game, but one by one he
crushes his opponents and becomes the monarch of the whole spectrum from cabins
to skyscrapers!

Is it a scary situation? Not for you! As a junior dev of an emerging startup,
you and your team hired by Ryu to develop the software to handle his enormous
fortune!

## What are you going to learn?

- "has a" relationship between classes/objects
- difference between a static class diagram and runtime instances created from classes
- debugging in the IDE
- objects in the heap memory and how to check them in IDE
- IDE built-in class diagram
- variable-length argument

## Tasks

1. Extend the skeleton code with the missing methods!
We got the following software requirements from the customer. The job of our software is to store streets with their houses, residents and owners. When a street is registered in the system they have a name originally and optionally some house pre-built on them. Street's name can contain only letters! They can be renamed in the future, also, new houses can be built on them. A house has an address number (it is mandatory!), can have one owner and several residents. When a person buys the house (s)he becomes the owner. Residents can move into the house anytime. A person can be an owner of several houses but can be a resident just in one of them. Every person has a name and also, they know about the properties they bought.
Fortunately, our senior software architect made the UML class diagram based on the requirements above, you can find it in the project root folder as `street.drawio` (it can be opened by the app on https://app.diagrams.net/).
    - The code is extended with the missing methods.
    - The application can be compiled successfully.
    - The application runtime log contains the following string: "Great! Rename validation is working! :) "

2. When you run your application it results in dynamic memory content that has been changing continuously with every code line run by the `virtual machine`. Comment each line with "// Object creation" where `object creation` is happenning and comment each line with "// <class> instance has a <class>" where different objects are connected with a `has a` relationship. Also, write an explanatory comment in the `Person` class at the line of `this` reference usage about the meaning of it at runtime.
    - Every line where `object creation` is happening (`constructor` calls) is commented with
"// Object creation"
comments!
    - Every line where different objects are connected with `has a` relation is commented with
"// <class> instance has a <class>"
comments!
Example:
"// Street instance has a House"
    - An explanatory comment is written in `Person` class at the line of `this` reference usage about the meaning of it at runtime.

3. Draw an object relationship diagram about the objects' state at the last line of the main method. The drawio diagram has a second page, named: `Street object relationships`. This diagram should be completed to contain all the object relationships at the end of the main method.
    - The second page of the `street.drawio` diagram contains an object relationship diagram about the last line of the main method.

## General requirements

None

## Hints

- In draw.io, take special attention for "has a" relationships between the classes of the UML class diagram
- To find missing methods, you can use the IDE built-in Class diagram editor to compare recent class hierarchy to the planned UML class diagram (draw.io)
- UML class diagram is a static diagram about the connections between the classes. These connections will or will not exist between the **real object** instantiated from these classes during runtime.
In this case, static means "without running the application".
- Variable length argument (vararg) can be used when the number of the parameters of the method from the same type is not known in advance (can be 0 .. *). In the actual exercise: Street constructor
- Debug!! For example, put a debug point on the last line of the main method and check connections between objects (take care of cyclic references between owner and property)
- Example of a simple object reference hierarchy:
  ![Object reference hierarchy](https://docs.oracle.com/javase/tutorial/figures/java/objects-multipleRefs.gif)

  ([example from this page](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html))
- "street_object_relationships.drawio" can be used to understand the requirements as it shows a partial solution until the line 15th of the main method
- Check the memory tab during debugging to see how many objects you have: <https://www.jetbrains.com/help/idea/analyze-objects-in-the-jvm-heap.html>


## Background materials

- <i class="far fa-exclamation"></i> [What is Object Diagram - read until the paragraph "Basic Object Diagram Symbols and Notations" - don't be confused, we'll use a bit different notations](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-object-diagram/)
- <i class="far fa-exclamation"></i> [Open project in IntelliJ IDEA](project/curriculum/materials/pages/tools/open-project-in-intellij-idea.md)
- <i class="far fa-exclamation"></i> [Creating objects](project/curriculum/materials/pages/java/creating-objects.md)
- <i class="far fa-exclamation"></i> [Variable length argument](http://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html#varargs)
- <i class="far fa-exclamation"></i> [UML diagrams in IntelliJ IDEA ](https://www.jetbrains.com/help/idea/class-diagram.html#analyze_class)
- <i class="far fa-book-open"></i> [How to compile and run Java](project/curriculum/materials/pages/java/how-to-compile-and-run-java.md)

