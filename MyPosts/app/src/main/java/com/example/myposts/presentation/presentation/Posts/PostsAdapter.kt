package com.example.myposts.presentation.presentation.Posts

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import com.example.myposts.R
import com.example.myposts.data.model.Posts
import kotlinx.android.synthetic.main.item_posts.view.*


class PostsAdapter(
    private val posts: List<Posts>,
    val onItemClickListener: ((posts: Posts) -> Unit)
) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, view: Int): PostsViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_posts, parent, false)
        return PostsViewHolder(itemView, onItemClickListener)
    }

    override fun getItemCount() = posts.count()

    override fun onBindViewHolder(viewHolder: PostsViewHolder, position: Int) {
        viewHolder.bindView(posts[position])
    }

    class PostsViewHolder(
        itemView: View,
        private val onItemClickListener: ((posts: Posts) -> Unit)
    ) : RecyclerView.ViewHolder(itemView) {

        private val title = itemView.textTitle
        private val body = itemView.textTitle

        fun bindView(posts: Posts) {
            title.text = posts.title
            body.text = posts.body

            itemView.setOnClickListener {
                onItemClickListener.invoke(posts)
            }
        }
    }

}