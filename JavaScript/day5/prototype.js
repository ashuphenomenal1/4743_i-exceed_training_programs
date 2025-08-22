//through object creation.

const bankaccount={
        balance:10000,
        //key : with creating a function inside it.
        deposite:function(amt){
            this.balance+=amt;
        },

        withdraw:function(amt){
            this.balance -= amt;
        },
        display:function(amt){
            return this.balance;
        }
    }


    let savingaccount=Object.create(bankaccount);
    savingaccount.acno=6578;
    savingaccount.acname="Ashutosh Kumar";
    savingaccount.type="Saving";


    savingaccount.deposite(2000);
    savingaccount.withdraw(500);
    console.log(savingaccount.balance);
    console.log(savingaccount.acno);
