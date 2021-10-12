package com.livechat.app.modules.explore.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.livechat.app.modules.explore.`data`.model.Explore1RowModel
import com.livechat.app.modules.explore.`data`.model.ExploreModel
import kotlin.collections.MutableList

public class ExploreVM : ViewModel() {
  public val exploreModel: MutableLiveData<ExploreModel> = MutableLiveData(ExploreModel())

  public val recyclerViewList: MutableLiveData<MutableList<Explore1RowModel>> =
      MutableLiveData(mutableListOf())
}
