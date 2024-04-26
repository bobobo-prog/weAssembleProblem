# WeAssemble Problem Statement

Problem: You need to design a Vending Machine which
Accepts coins of 1,5,10,25, 50, 100
Accepts an inventory of products along with a unit price for each one, e.g. 10xCoke each 25p, 15xPepsi each 35p, 12xSprite each 45p
Accepts an initial float of coins
Allow users to buy 1 or more products in one transaction given a set of coins provided by the user. This should return the selected product(s) and remaining change if any.
Allow the vending machine supplier to request a full inventory of the machine
Allows the vending machine supplier to update the stock and/or the float of coins


Design Summary :
I've used the State Design Pattern to create this command line application because the State Pattern allows an object to alter its behavior when its state changes. This pattern is especially useful when an object's behavior needs to change its behavior at runtime based on its state.

Instructions on using :
Pretty Straight forward application , User will be prompted with the following choices and has to pick and choose what they have to do:


Products to choose from: 
Coke Product{  quantity=10, eachPrice=40 Rs totalPrice=400 Rs}
Pepsi Product{  quantity=10, eachPrice=40 Rs totalPrice=400 Rs}
Red Bull Product{  quantity=10, eachPrice=40 Rs totalPrice=400 Rs}

Select an option:
1. Insert coin
2. Select product
3. Stock Inventory
4. Show Inventory
9. Exit










