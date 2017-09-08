package com.example.maraj.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)


        //crating an arraylist to store users using the data class user
        val users = ArrayList<UserData>()

        //adding some dummy data to the list
        users.add(UserData("Item 1","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 2","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 3","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 4","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 5","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 6","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 7","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 8","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 9","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 10","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 11","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 12","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 13","Maraj Hussain", "Shahjahanpur UP"))
        users.add(UserData("Item 14","Maraj Hussain", "Shahjahanpur UP"))

        //creating our adapter
        val adapter = CustomAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}