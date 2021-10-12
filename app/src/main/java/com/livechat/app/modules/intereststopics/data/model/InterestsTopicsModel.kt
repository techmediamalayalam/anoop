package com.livechat.app.modules.intereststopics.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtsEntertai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_arts_entertai)

)
