# MONTE CARLO METHODS
A **Monte Carlo Simulation** is a way of approximating the value of a function where calculating the actual value is difficult or impossible. It uses random sampling to define constraints on the value and then makes a sort of "best guess".  
Monte Carlo algorithms work based on the **Law of Large Numbers** which states that if you generate a large number of samples, eventually, you will get the approximate desired distribution.  
Monte Carlo methods have three characteristics:  
1. Random sample generation
2. The input distribution is unknown.
3. Numerical experiments  

Finding areas, or integrating functions, is a very important tool in Physics and engineering and it was area under a curve that was holding up the Atomic bomb project. Think of firing a gun randomly at a target. The number of times you actually hit the target is going to be proportional to the target's size or area.  

For example, suppose you want to calculate the area of a circle. All you have to do is to generate random (x, y) points and count the number that hit the circle and the number that don't. If you do this enough times then the ratio slowly settles down to the ratio of the area of the circle to the background area.
