package com.zeinabmallaki.pareparvaz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zeinabmallaki.pareparvaz.databinding.RegisterBinding

class RegisterFragment: Fragment() {
private lateinit var binding: RegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= RegisterBinding.inflate(inflater)

        return binding.root
    }
}