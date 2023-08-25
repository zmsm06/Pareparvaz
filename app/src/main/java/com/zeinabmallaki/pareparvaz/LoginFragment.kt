package com.zeinabmallaki.pareparvaz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeinabmallaki.pareparvaz.databinding.LoginBinding

class LoginFragment: Fragment() {

    private lateinit var binding : LoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = LoginBinding.inflate(inflater)
        return binding.root }


}