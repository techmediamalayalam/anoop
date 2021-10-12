package com.livechat.app.modules.interestspeople.ui

import androidx.fragment.app.viewModels
import com.livechat.app.R
import com.livechat.app.appcomponents.base.BaseFragment
import com.livechat.app.databinding.FragmentInterestsPeopleBinding
import com.livechat.app.modules.interestspeople.`data`.viewmodel.InterestsPeopleVM
import kotlin.String
import kotlin.Unit

public class InterestsPeopleFragment :
    BaseFragment<FragmentInterestsPeopleBinding>(R.layout.fragment_interests_people) {
  private val viewModel: InterestsPeopleVM by viewModels<InterestsPeopleVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.interestsPeopleVM = viewModel
  }

  public companion object {
    public const val TAG: String = "INTERESTS_PEOPLE_FRAGMENT"
  }
}
