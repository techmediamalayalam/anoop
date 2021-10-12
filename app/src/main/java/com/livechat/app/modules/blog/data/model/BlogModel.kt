package com.livechat.app.modules.blog.`data`.model

import com.livechat.app.R
import com.livechat.app.appcomponents.di.MyApp
import kotlin.String

public data class BlogModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJohnDoeInLor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_john_doe_in_lor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29July: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_july)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol8: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol9: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtImageCreditL: String? =
      MyApp.getInstance().resources.getString(R.string.msg_image_credit_l)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDuisAuteIrure: String? =
      MyApp.getInstance().resources.getString(R.string.msg_duis_aute_irure)

)
