package com.livechat.app.modules.intereststopics2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseActivity
import com.livechat.app.appcomponents.di.MyApp
import com.livechat.app.databinding.ActivityInterestsTopics2Binding
import com.livechat.app.modules.intereststopics2.`data`.viewmodel.InterestsTopics2VM
import kotlin.String
import kotlin.Unit

public class InterestsTopics2Activity :
    BaseActivity<ActivityInterestsTopics2Binding>(R.layout.activity_interests_topics2) {
  private val viewModel: InterestsTopics2VM by viewModels<InterestsTopics2VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.interestsTopics2VM = viewModel
    val adapter = InterestsTopics2ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPager.adapter = adapter
    TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
                tab.text = InterestsTopics2ActivityPagerAdapter.title[position]
                }.attach()
    Toast.makeText(this@InterestsTopics2Activity,MyApp.getInstance().getString(R.string.msg_user_id_not_re),Toast.LENGTH_LONG).show()
  }

  public companion object {
    public const val TAG: String = "INTERESTS_TOPICS2ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestsTopics2Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
