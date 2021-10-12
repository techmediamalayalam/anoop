package com.livechat.app.modules.splash.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.livechat.app.modules.splash.`data`.model.Splash1RowModel
import com.livechat.app.modules.splash.`data`.model.Splash2RowModel
import com.livechat.app.modules.splash.`data`.model.SplashModel
import kotlin.collections.MutableList

public class SplashVM : ViewModel() {
  public val splashModel: MutableLiveData<SplashModel> = MutableLiveData(SplashModel())

  public val recyclerViewList: MutableLiveData<MutableList<Splash1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Splash2RowModel>> =
      MutableLiveData(mutableListOf())
}
