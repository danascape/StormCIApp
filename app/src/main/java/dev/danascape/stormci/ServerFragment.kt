package dev.danascape.stormci

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import dev.danascape.stormci.databinding.FragmentServerBinding

class ServerFragment : Fragment() {
    private var _binding: FragmentServerBinding? = null
    private val binding
        get() = _binding!!

    private val args: ServerFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentServerBinding.inflate(inflater, container, false)

        val data = args.ipAddress
        binding.tvIPAddress.text = "IP Address: $data"

        // Inflate the layout for this fragment
        return binding.root
    }
}