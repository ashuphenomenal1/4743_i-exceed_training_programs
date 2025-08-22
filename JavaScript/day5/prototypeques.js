/*Question:
Create a constructor function Shape with a method area() that just returns 0.
Then, create two constructor functions Rectangle and Circle that inherit from Shape using prototype inheritance.
Override the area() method in both Rectangle and Circle to return the actual area.
Rectangle → width * height
Circle → π * radius²

Add a common method describe() in Shape.prototype that returns "This is a shape", and make sure Rectangle and Circle can also use it.
Finally, create one rectangle (5 x 10) and one circle (radius 7) and display both their areas and description.*/

// Parent constructor
function Shape() {}

// Method in Shape prototype
Shape.prototype.area = function () {
  return 0;
};

Shape.prototype.describe = function () {
  return "This is a shape";
};

// Rectangle constructor
function Rectangle(width, height) {
  this.width = width;
  this.height = height;
}

// Inherit from Shape
Rectangle.prototype = Object.create(Shape.prototype);
Rectangle.prototype.constructor = Rectangle;

// Override area method
Rectangle.prototype.area = function () {
  return this.width * this.height;
};

// Circle constructor
function Circle(radius) {
  this.radius = radius;
}

// Inherit from Shape
Circle.prototype = Object.create(Shape.prototype);
Circle.prototype.constructor = Circle;

// Override area method
Circle.prototype.area = function () {
  return Math.PI * this.radius * this.radius;
};

// Create objects
let rect = new Rectangle(5, 10);
let circ = new Circle(7);

console.log(rect.describe()); // "This is a shape"
console.log("Rectangle Area:", rect.area()); // 50

console.log(circ.describe()); // "This is a shape"
console.log("Circle Area:", circ.area()); // ~153.94
