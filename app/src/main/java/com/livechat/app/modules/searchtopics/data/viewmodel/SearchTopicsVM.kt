package com.livechat.app.modules.searchtopics.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.livechat.app.modules.searchtopics.`data`.model.SearchTopicsModel

public class SearchTopicsVM : ViewModel() {
  public val searchTopicsModel: MutableLiveData<SearchTopicsModel> =
      MutableLiveData(SearchTopicsModel())
}
