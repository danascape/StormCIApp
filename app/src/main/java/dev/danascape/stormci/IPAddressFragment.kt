package dev.danascape.stormci

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dev.danascape.stormci.databinding.FragmentIpAddressBinding

class IPAddressFragment : Fragment() {
    private var _binding: FragmentIpAddressBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIpAddressBinding.inflate(inflater, container, false)

        binding.btnDone.setOnClickListener {
            val action = IPAddressFragmentDirections.actionIpFragmentToServerFragment()
            findNavController().navigate(action)
        }

        // Inflate the layout for this fragment
        return binding.root
    }
}