
//using var keyword in list of numbers.
var max= Math.max(1,2,5,7,8,9,11,16);
console.log(max);

var min=Math.min(1,2,5,7,8,9,11,16);
console.log(min);

//using const keyword in Arrays.

const numbers= [1,2,5,7,8,9,11,16];
console.log(Math.min.apply(Math,numbers));
console.log(Math.min.apply(Math,numbers));

//direct method.

console.log(Math.min(...numbers));
console.log(Math.max(...numbers));

//rounding the numbers

console.log(Math.round(1.3));
console.log(Math.round(1.7))
console.log(Math.round(1.5))

//ceiling and floor method to round up nearest to them.

console.log(Math.ceil(2.7));
console.log(Math.floor(2.7));

//for absolute value
console.log(Math.abs(-9));

console.log(Math.acos(1)) //inverse cosine

console.log(Math.acosh(2)) //The inverse hyperbolic cosine of x. If x is less than 1, returns NaN.
console.log(Math.asin(0)) //returns the inverse sine (in radians) of a number. 

console.log(Math.asinh(1)) 

console.log(Math.atan(0))
console.log(Math.atanh(0))
console.log(Math.atan2(0)) //returns the angle in the plane (in radians) between the positive x-axis and the ray from (0, 0) to the point (x, y),

console.log(Math.cbrt(4)) //Returns the cube root of the input.

console.log(Math.clz32(16)) //Returns the number of leading zero bits of the 32-bit integer input.

console.log(Math.cos(1))
console.log(Math.cosh(0))

console.log(Math.exp(4)) //Returns ex, where x is the argument, and e is Euler's number (2.718…, the base of the natural logarithm).

console.log(Math.expm1(4)) //Returns subtracting 1 from exp(x)

//console.log("f16" +Math.f16round(8.089)) //Returns the nearest half precision float representation of the input
console.log(Math.fround(8))

console.log(Math.hypot(4))

console.log(Math.imul(4))

console.log(Math.log(4))

console.log(Math.log10(4))

console.log(Math.log1p(4))

console.log(Math.log2(4))

console.log(Math.pow(2,4))

console.log(Math.random())

console.log(Math.sign(-5))

console.log(Math.sin(1))
console.log(Math.sinh(1))

console.log(Math.sqrt(2))

//console.log(Math.sumPrecise(1.54,-4.76))

console.log(Math.tan(1))
console.log(Math.tanh(1))
//console.log(Math.tanc(0.3))

//static properties of Math lib;

console.log(Math.E); //Euler's number and the base of natural logarithms; approximately 2.718.

console.log(Math.LN10); //Natural logarithm of 10; approximately 2.303.

console.log(Math.LN2); //Natural logarithm of 2; approximately 0.693.

console.log(Math.LOG10E); //Base-10 logarithm of E; approximately 0.434.

console.log(Math.LOG2E); //Base-2 logarithm of E; approximately 1.443.

console.log(Math.PI); //Ratio of a circle's circumference to its diameter; approximately 3.14159

console.log(Math.SQRT1_2); //Square root of ½; approximately 0.707.

console.log(Math.SQRT2); //Square root of 2; approximately 1.414.



