# design-patterns

An Eclipse project used as reference code for a bootcamp on Design Patterns.

There are two examples here:

1. Mario: a representation of Nintendo's famous character, with powerups added through different kinds of solutions:
   1. God Object: one object with a nested switch/case based on type
   2. Hierarchy: A BaseMario class is extended by the superpowered classes
   3. State: BaseMario behaves differently depending on the state it holds
   4. Decorator: the different behaviors can be added and combined at runtime
2. MVC: an experiment on the Model-View-Controller pattern and its interaction with the Observer pattern.

Every example is purposedly non-commented and solely documented through unit tests.
