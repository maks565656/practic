package com.example.ppactic.adapter

import android.content.Context
import android.icu.text.Transliterator.Position
import android.os.Parcel
import android.os.UserManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ppactic.Home_page
import com.example.ppactic.R
import com.example.ppactic.State

class StateAdapter (private var context: Context,
                    private var State: ArrayList<State>
): RecyclerView.Adapter<StateAdapter.MyViewHolder>()
{
    constructor(parcel: Parcel) : this(
        TODO("context"),
        TODO("State")
    ) {
    }
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.imageView4)
        var TextView: TextView = itemView.findViewById(R.id.textView7)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_page, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user = State[position]
     holder.TextView.text = user.text
        holder.imageView.setImageResource(user.image)
    }

    override fun getItemCount(): Int {
        return State.size
    }
}


