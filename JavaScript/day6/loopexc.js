const cars="Apple Wapple"
var obj={
    harry:98,
    rohan:43,
    akash:23
}
//we are using for in loop.
for(a in obj){
    console.log("Marks of "+ a + " are " +obj[a])
}

//Using general for loop.
//Object.keys(obj)-gives the value of the keys inside an object.
//obj[that_vale_key]-gives the value of that key.
for(var i=0;i<Object.keys(obj).length;i++){
    console.log("The marks of "+ Object.keys(obj)[i]+" is "+obj[Object.keys(obj)[i]])
}
/*
let input=prompt("Enter the number: ");
while(input!=Number.parseInt(input)){
    alert("Try  again.")
    break;
}
    console.log("You have entered a wright number. ");
    */

let mean=(a,b,c,d,e)=>{ return (a+b+c+d+e/5);}
console.log(mean(1,2,3,4,5));
