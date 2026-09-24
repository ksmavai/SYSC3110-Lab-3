public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo(){
        this("Default Name", "Default Address", "000-000-0000");
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Kshitij", "Carleton Avenue", "676-767-6767");
        System.out.println("Hello " + buddy.getName());
    }
}