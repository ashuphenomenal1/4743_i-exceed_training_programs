let user={name:"Dharshan",
    age:22,
    isEng:true,
    course:["java","dart","flutter"],
   
};
// console.log(user.name);
 
let jsonuser=JSON.stringify(user);
console.log(jsonuser);
console.log(typeof jsonuser);
 
userobject=JSON.parse(jsonuser);
console.log(typeof userobject);
 