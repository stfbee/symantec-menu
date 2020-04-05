package ru.ovm.svip_like_menu

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context !is Foldable) {
            throw IllegalArgumentException("Host activity must implement Foldable")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}