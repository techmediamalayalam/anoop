package com.livechat.app.modules.intereststopics.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseFragment
import com.livechat.app.databinding.FragmentInterestsTopicsBinding
import com.livechat.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import com.livechat.app.modules.intereststopics.`data`.viewmodel.InterestsTopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class InterestsTopicsFragment :
    BaseFragment<FragmentInterestsTopicsBinding>(R.layout.fragment_interests_topics) {
  private val viewModel: InterestsTopicsVM by viewModels<InterestsTopicsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: InterestsTopics1RowModel
  ): Unit {
    when(view.id) {
    R.id.btnFollow ->  {
      requireActivity().onBackPressed()
    }


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                    RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : InterestsTopics1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    viewModel.recyclerViewList.observe(requireActivity()) {
                recyclerViewAdapter.updateData(it)
            }
    binding.interestsTopicsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "INTERESTS_TOPICS_FRAGMENT"
  }
}
