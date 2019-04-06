# Sample Android App ( AndroidManifest.xml, Activity, Intent, RecyclerView )

This project is a university project for learning basis of android development.

### Important
```
Username: admin
Password: password
```

### Features

```
Set screenOrientation
Custom Widget Design
Starting New Activities
Passing Data To Other Activity Using Intent
Selecting  Pictures From The Gallery
Calling With Intents
Sending Email With Intents
Custom RecyclerView and Custom ViewHolder
ViewHolder Click Event
Starting New Activities From Custom Class
```

#### Important Codes
** Set screenOriantation **
```Android
//At AndroidManifest.xml
<activity android:name=".coursedetail_activity" android:screenOrientation="portrait"></activity>
```
**  Passing Data To Other Activity Using Intent **
```Android
  Contact a = new Contact(...); // a serializable class
  //new Intent(this.class.object, another.class)
  Intent intent = new Intent(newcontact_activity.this, showcontact_activity.class);
  intent.putExtra("contact", a); // put serializable object
  startActivity(intent);
```
** Starting New Activities From Custom Class **
```Android
	//set this.context from activity (anotherobject.context = getApplicationContext();)
  Intent intent  = new Intent(this.context, coursedetail_activity.class);
  intent.putExtra("course", course);
  intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); //important
  context.startActivity(intent);
```
## Gifs
** Select Image **
![selectimage](https://user-images.githubusercontent.com/19158321/55673090-a9a00800-58ab-11e9-8abc-cd6ef33e053a.gif)
** Call And Send Mail **
![callandmail](https://user-images.githubusercontent.com/19158321/55673091-a9a00800-58ab-11e9-845e-8725193ae140.gif)



## Some Screenshots
**Login Screen**

![loginscreen](https://user-images.githubusercontent.com/19158321/55672743-2d0b2a80-58a7-11e9-8bb0-a51d8dd958ac.png)

** Show Contact Info **
![showscreen](https://user-images.githubusercontent.com/19158321/55672739-2c729400-58a7-11e9-95a7-e95df1149881.png)

** Course List (ReCyclerView) **
![courselist](https://user-images.githubusercontent.com/19158321/55672741-2d0b2a80-58a7-11e9-9014-dc5a96b466fd.png)

** Course Detail **
![coursedetail](https://user-images.githubusercontent.com/19158321/55672740-2d0b2a80-58a7-11e9-889f-66bde83e8657.png)




