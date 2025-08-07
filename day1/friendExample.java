class friend{
    String name;
    int phone,batch;
    friendData fd;
    friend(String name,int phone,int batch,friendData fd){
        this.name=name;
        this.phone=phone;
        this.batch=batch;
        this.fd=fd;
    }

    public void displayFriendDetail(){
        System.out.println("Name "+name);
        System.out.println("Phone no.= "+phone);
        System.out.println("Batch Year= "+batch);
        fd.displayFriendData();
    }
}

public class friendExample {
    public static void main(String[] args) {
    
    friendData fd=new friendData("Golden","Upper", 51);
    friend f1=new friend("Anuj",899675678,2026,fd);
    f1.displayFriendDetail();
}
}
