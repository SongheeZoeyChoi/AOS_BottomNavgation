package com.example.aacbottomnavigationviewwithnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aacbottomnavigationviewwithnavigation.databinding.FragmentFriendsBinding
import com.example.aacbottomnavigationviewwithnavigation.databinding.FragmentHomeBinding
import com.example.aacbottomnavigationviewwithnavigation.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {

    private var mBinding : FragmentMusicBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentMusicBinding.inflate(inflater, container, false)

        mBinding = binding

        return mBinding?.root

    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }

}//----