package com.livechat.app.modules.blog.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseActivity
import com.livechat.app.databinding.ActivityBlogBinding
import com.livechat.app.modules.blog.`data`.viewmodel.BlogVM
import kotlin.String
import kotlin.Unit

public class BlogActivity : BaseActivity<ActivityBlogBinding>(R.layout.activity_blog) {
  private val viewModel: BlogVM by viewModels<BlogVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.blogVM = viewModel
  }

  public companion object {
    public const val TAG: String = "BLOG_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BlogActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
