package com.livechat.app.modules.explore.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTechnology: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_technology)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRecommendedFor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etSearchValue: String? = null
)
