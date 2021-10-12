package com.livechat.app.modules.splash.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
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
  public var txtTopStories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_stories)

)
