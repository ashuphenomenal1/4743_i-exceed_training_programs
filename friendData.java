class friendData {
    String club,colony;
    int sector;
    friendData(String club,String colony,int sector){
        this.club=club;
        this.colony=colony;
        this.sector=sector;
    }

    public void displayFriendData(){
        System.out.println("Club = "+club);
        System.out.println("Colony name= "+colony);
        System.out.println("Sector no.= "+sector);
    }
}
