package com.livechat.app.modules.interests.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseActivity
import com.livechat.app.databinding.ActivityInterestsBinding
import com.livechat.app.modules.interests.`data`.viewmodel.InterestsVM
import kotlin.String
import kotlin.Unit

public class InterestsActivity : BaseActivity<ActivityInterestsBinding>(R.layout.activity_interests)
    {
  private val viewModel: InterestsVM by viewModels<InterestsVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.interestsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "INTERESTS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
