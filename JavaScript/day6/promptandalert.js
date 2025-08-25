/*Write a JavaScript program that:
Uses prompt() to ask the user to enter a number.
Checks whether the entered value is a valid number.
If it’s not a number, show an alert() saying "Invalid input, please enter a number."
If it is a valid number:
Check if it is prime or not.
Show an alert() saying:
"The number [n] is a prime number."
OR
"The number [n] is not a prime number."*/
// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

let message = prompt("Enter a number: ");
let isnum = Number(message); // convert to number
if(!isnum ||isNaN(isnum)){
    alert("Invalid input,Please enter a number.")
}
for(var i=2;i<Math.sqrt(isnum);i++)
{
 if(isnum%i != 0) {
    alert("Not a prime number.")
    break;
 }
 else{
    alert("Prime number.")
 }

}

