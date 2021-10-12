package com.livechat.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseActivity
import com.livechat.app.databinding.ActivityAppNavigationBinding
import com.livechat.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.livechat.app.modules.blog.ui.BlogActivity
import com.livechat.app.modules.explore.ui.ExploreActivity
import com.livechat.app.modules.interests.ui.InterestsActivity
import com.livechat.app.modules.intereststopics2.ui.InterestsTopics2Activity
import com.livechat.app.modules.searchtopics.ui.SearchTopicsActivity
import com.livechat.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear7.setOnClickListener {

      val destIntent = SearchTopicsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = InterestsTopics2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = BlogActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = InterestsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
