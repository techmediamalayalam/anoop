package com.livechat.app.modules.interests.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.livechat.app.modules.interests.`data`.model.InterestsModel

public class InterestsVM : ViewModel() {
  public val interestsModel: MutableLiveData<InterestsModel> = MutableLiveData(InterestsModel())
}
