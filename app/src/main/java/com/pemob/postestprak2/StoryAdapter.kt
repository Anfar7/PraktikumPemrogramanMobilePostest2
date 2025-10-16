package com.pemob.postestprak2

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(private val storyList: List<Story>) :
    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val storyImage: ImageView = itemView.findViewById(R.id.iv_story_image)
        val storyTitle: TextView = itemView.findViewById(R.id.tv_story_title)
        val storyDescription: TextView = itemView.findViewById(R.id.tv_story_description)
        val storyCategory: TextView = itemView.findViewById(R.id.tv_story_category)
        val descriptionScrollView: ScrollView = itemView.findViewById(R.id.sv_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_story, parent, false)
        return StoryViewHolder(view)
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val currentStory = storyList[position]

        holder.storyImage.setImageResource(currentStory.imageResId)
        holder.storyTitle.text = currentStory.title
        holder.storyDescription.text = currentStory.description
        holder.storyCategory.text = currentStory.category

        holder.descriptionScrollView.setOnTouchListener { _, motionEvent ->
            holder.itemView.parent.requestDisallowInterceptTouchEvent(true)
            if (motionEvent.action == MotionEvent.ACTION_UP) {
                holder.itemView.parent.requestDisallowInterceptTouchEvent(false)
            }
            false
        }
    }

    override fun getItemCount(): Int {
        return storyList.size
    }
}