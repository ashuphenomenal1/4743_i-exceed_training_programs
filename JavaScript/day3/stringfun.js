function String1(x,y){
    a=x.trim()
    b=a.toUpperCase()
    c=y.trim()
    d=c.toUpperCase()
    return b+d; 
}
console.log(String1("  Karthik is my friend  ","  Karthik is from bglore  "))
//arrow function.
let str2=(a,b)=> a.trim().toUpperCase() + b.trim().toUpperCase();
console.log(str2("  Karthik is my friend  ","  Karthik is from mysuru  "))
