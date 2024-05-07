package sg.edu.np.mad.madpractical4;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    //this is for Prac4
    public void setName(String username) {this.name = username; }

    public void setDescription(String description) {this.description = description; }

    public void setId(int id) {this.id = id; }

    public void setFollowed(boolean followed) { this.followed = followed; }

    public String getName() {return name;}

    public String getDescription() {return description;}

    public boolean getFollowed() {return followed;}

    //new stuff added for prac4

    public User(String name, String description, int id, boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    // Method to toggle the follow status
    public void toggleFollowed() {
        followed = !followed; // Toggle the value
    }

    // Method to check if the user is followed
    public boolean isFollowed() {
        return followed;
    }
}
