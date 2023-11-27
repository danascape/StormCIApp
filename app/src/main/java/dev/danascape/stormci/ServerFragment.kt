package dev.danascape.stormci

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dev.danascape.stormci.databinding.FragmentServerBinding

class ServerFragment : Fragment() {
    private var _binding: FragmentServerBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServerBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
}