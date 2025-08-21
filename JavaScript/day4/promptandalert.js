

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
