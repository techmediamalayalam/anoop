package com.livechat.app.modules.interestspeople.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.livechat.app.modules.interestspeople.`data`.model.InterestsPeopleModel

public class InterestsPeopleVM : ViewModel() {
  public val interestsPeopleModel: MutableLiveData<InterestsPeopleModel> =
      MutableLiveData(InterestsPeopleModel())
}
