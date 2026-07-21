package ExtraTask.Task2;

public class ConnectFriends {

  public String name;
  public int friendLimit;
  public String[] friendRequests;
  public int count;

  public ConnectFriends(String name) {
    this.name = name;
    this.friendLimit = 2;
    this.friendRequests = new String[this.friendLimit];

    System.out.println("Welcome to ConnectFriends, " + this.name);
  }

  public ConnectFriends(String name, int friendLimit) {
    this.name = name;
    this.friendLimit = friendLimit;
    this.friendRequests = new String[this.friendLimit];

    System.out.println("Welcome to ConnectFriends, " + this.name);
  }

  public void sendFriendRequest(ConnectFriends friend) {
    if(this.count < this.friendLimit) {
      this.friendRequests[this.count++] = friend.name;

      System.out.println(
        this.name + " sent a friend request to " + friend.name + "."
      );
    }
    else {
      System.out.println(
        this.name + " has reached the friend request limit!"
      );
    }
  }

  public void sendFriendRequest(
    ConnectFriends friend1,
    ConnectFriends friend2
  ) {
    sendFriendRequest(friend1);
    sendFriendRequest(friend2);
  }

  public void removeRequest(String friendName) {
    for(int i = 0; i < this.count; i++) {

      if(this.friendRequests[i].equals(friendName)) {

        for(int j = i; j < this.count - 1; j++) {
          this.friendRequests[j] = this.friendRequests[j + 1];
        }

        this.friendRequests[this.count - 1] = null;
        this.count--;

        System.out.println(
          "Reuqest to add " + friendName +
          " is removed for " + this.name + "."
        );

        return;
      }
    }

    System.out.println(
      friendName + " is not in " +
      this.name + "'s sent request list."
    );
  }

  public void showDetails() {
    System.out.println("User Name: " + this.name);

    System.out.println(
      "Maximum number of Sent Friend Request: " +
      this.friendLimit
    );

    System.out.println(
      "Total Friends Request: " + this.count
    );

    System.out.print("Sent Friends Request: ");

    for(int i = 0; i < this.count; i++) {
      System.out.print(this.friendRequests[i]);

      if(i < this.count - 1) {
        System.out.print(" ");
      }
    }

    System.out.println();
  }
}