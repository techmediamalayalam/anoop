package com.livechat.app.modules.splash.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.livechat.app.R
import com.livechat.app.databinding.RowSplash2Binding
import com.livechat.app.modules.splash.`data`.model.Splash2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Splash2RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowSplash2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Splash2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSplash2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_splash2,parent,false)
    return RowSplash2VH(view)
  }

  public override fun onBindViewHolder(holder: RowSplash2VH, position: Int): Unit {
    val splash2RowModel = Splash2RowModel()
    // TODO uncomment following line after integration with data source
    // val splash2RowModel = list[position]
    holder.binding.splash2RowModel = splash2RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Splash2RowModel
    ): Unit {
    }
  }

  public inner class RowSplash2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSplash2Binding = RowSplash2Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Splash2RowModel())
      }
    }
  }
}
