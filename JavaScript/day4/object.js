//traditional method according to key value pairs.

const student={
    name:"Ashutosh",
    department:"CSE General",
    Emp_Id: 4743,
    speciality:"AI-ML",
    isAvail:true,
    address:undefined,
    account:{
        accountno: 78689,
        type:function(typen){ if(typen="saving"){ console.log("Enter the account type: ")}
        else{ console.log("Current account")}},
        amount:100000,
        deposite:function(amt){
            return this.amount+=amt;
        },
        withdraw:function(amt){
            return this.amount-=amt;
        }
      }
    }



console.log(student.account.type("saving"));
console.log(student.account.deposite(10000));

