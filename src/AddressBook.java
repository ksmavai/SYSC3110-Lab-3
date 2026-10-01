import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> allBuddies;

    public AddressBook(){
        this.allBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy){
        if (aBuddy != null){
            allBuddies.add(aBuddy);
        }
    }

    public BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < allBuddies.size()){
            return allBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        //comment
    }
}






