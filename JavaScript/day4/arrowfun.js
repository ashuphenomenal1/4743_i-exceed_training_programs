function functionname(parameters)
 {
    //body of the function
 }
 //structure 
 function add1(x,y){
    return x+y;
 }
 console.log(add1(31,64))

 //2nd method
 
 let add2=function(x,y) {
    return (x+y)
}

    console.log(add2(10,13))

//arrow function.
 let add=(x,y)=>(x+y)

 console.log(add(33,66))


 let gmail=(x,y)=> x + y +"@" +"gmail.com";
 const y=Math.random() * 10000
 console.log(gmail("ashutosh",y))