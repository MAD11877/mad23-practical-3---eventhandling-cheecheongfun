<<<<<<< HEAD
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/LFiEPPgW)
# MAD Practical 2 - Activity
You will be creating your first Android app! Your app will have a profile page on its main Activity.<br/>
Follow the instructions below to complete your app.

1. Create a new project with the following configuration,
    * Empty Activity
    * Language: Java
    * Minimum API level: API 21: Android 5.0 (Lollipop)
2. Create a User class based on the class diagram below.

![User Class Diagram](/images/user_cd.png)

3. Create the layout of your main activity according to the figure shown below.

![Screen Mockup](/images/screen_mock.png)

4. In your onCreate method, the name and description are loaded from the User object. The button on the left will show “Follow” if the variable followed is false, and vice versa.

5.	When the left button is clicked, it will toggle the text between Follow and Unfollow. The variable followed is also updated to reflect this.

# CHALLENGE
6.	When the app is rotated, some of the UI components disappeared as shown in the figure below. Resolve this UI bug such that all components are visible regardless of the screen orientation.<br/><br/>Hint: ScrollView

![Horizontal Rotation](/images/Screenshot_1617792845.png)
=======
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/jXypHc6I)
# MAD Practical 3 - Event-Handler
Continuing from last week, you will be adding interactivity to your app. <br/>
Follow the instructions below to complete your app.

1. Modify the onClickListener of left button to show a Toast message. The toast message will show `Followed` if the user click on the `Follow` button, and vice versa.

![Toast Message](/images/p2_toast.png)

2. Create a new Empty Activity with the following configuration,
    * Activity Name: ListActivity
    * Generate a Layout File: Checked
    * Layout Name: activity_list
    * Launcher Activity: Checked
    * Source Language: Java

3. In the `activity_list` layout file, create an `ImageView`, position it in the middle of the screen.

![ImageView in middle of Activity](/images/p2_img.png)

4. Create an `onClickListener` for the image created in previous step. Upon clicking the image, an `AlertDialog` will appear as shown in the figure below.

![AlertDialog](/images/p2_alert.png)

5.	Upon clicking the `View` button, a random integer will be generated. The `MainActivity` (created in previous practical) will be launched, and the random integer is sent over.

6.	Modify the `MainActivity` to display the random integer together with the name. 

![Updated Profile page](/images/p2_final.png)

# CHALLENGE
7. Create a new Empty Activity with the following configuration,
    * Activity Name: MessageGroup
    * Generate a Layout File: Checked
    * Layout Name: activity_message_group
    * Launcher Activity: Unchecked
    * Source Language: Java

8. Create an event listener for the `Message` button. Upon clicking on the button, `MessageGroup` created in previous step will be launched.

<img src="/images/q8.PNG" width="216px"/>

9. Modify the layout of `MessageGroup` to as shown in the image below.

<img src="/images/q9.PNG" width="512px"/>

10. Fragments are commonly used in Android applications. They are an extension to Activities. <br/>Research and discover how to implement loading of fragment within an activity. <br/><br/>Implement `MessageGroup` as illustrated in the image below.<br/><br/>[https://guides.codepath.com/android/creating-and-using-fragments#embedding-a-fragment-in-an-activity]

<img src="/images/q10.PNG" width="512px"/>
>>>>>>> e1f1513a3be49be4f376966c49e4d086a560a67a

To submit your practical, remember to commit the changes and push to remote repository.
