package com.livechat.app.modules.explore.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogo: String? = MyApp.getInstance().resources.getString(R.string.lbl_logo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol5: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt16DaysAgo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_16_days_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt3MinRead: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_min_read)

)
