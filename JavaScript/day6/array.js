const students=["Ashutosh","Rao Sahab","Aman","Anuj",{ rank:2, division:1, status:"passed" },{rank:1, division:1 , status:"passed"},{rank:3 , division:1 , status:"passed"},{rank:50, division:null , status:"failed"}]
console.log(students)
console.log(Object.keys(students[5])[2] + " "+Object.values(students[5])[2]);
console.log(students[4]);
