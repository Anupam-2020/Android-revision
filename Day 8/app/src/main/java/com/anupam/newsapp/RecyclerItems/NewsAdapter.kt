package com.anupam.newsapp.RecyclerItems

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anupam.newsapp.R
import com.anupam.newsapp.dto.Articles
import com.bumptech.glide.Glide


class NewsAdapter(
    val context: Context,
    val articles: List<Articles>
): RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val inflater = LayoutInflater.from(context).inflate(
            R.layout.item_view,
            parent,
            false
        )
        return ArticleViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.newsTitle.text = articles[position].title
        holder.newsDescription.text = articles[position].description
        Glide.with(context).load(articles[position].urlToImage).into(holder.newsImage)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

}

class ArticleViewHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {

    var newsImage = itemView.findViewById<ImageView>(R.id.imageView)
    var newsTitle = itemView.findViewById<TextView>(R.id.txtTitle)
    var newsDescription = itemView.findViewById<TextView>(R.id.txtDescription)
}