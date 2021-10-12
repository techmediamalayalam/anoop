package com.livechat.app.modules.interests.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class InterestsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhatAreYouIn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_are_you_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddOrEditTop: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_or_edit_top)

)
