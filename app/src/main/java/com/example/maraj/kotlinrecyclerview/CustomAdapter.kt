package com.example.maraj.kotlinrecyclerview

/**
 * Created by maraj on 08-09-2017.
 */
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Belal on 6/19/2017.
 */

class CustomAdapter(val userList: ArrayList<UserData>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: UserData) {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            val textViewItem  = itemView.findViewById(R.id.tv_item) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
            textViewItem.text = user.item

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, textViewItem.text.toString()+" Click", Toast.LENGTH_SHORT).show()
            }
        }

    }
}