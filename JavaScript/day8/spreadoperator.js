let addition=function(...args){
    let sum=0;

     for(i of args){
        sum+=i;
        
     }

     return sum;
};

console.log(addition(1,2,3,4,5,6));

let x=[1,2,3,4,5,6,7];

console.log(typeof(x));

let max=Math.max(...x);
console.log(max);