package cs.mad.week3lab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FlashcardAdapter(): RecyclerView.Adapter<FlashcardAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.flashcard_item, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // connect data to view
    }

    override fun getItemCount(): Int {
        // how many items in list
        return -1
    }
}