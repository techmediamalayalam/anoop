package com.livechat.app.modules.intereststopics.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsTopics1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)

)
