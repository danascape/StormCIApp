package dev.danascape.stormci.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import dev.danascape.stormci.databinding.FragmentIpAddressBinding
import dev.danascape.stormci.models.IPAddress

class IPAddressFragment : Fragment() {
    private var _binding: FragmentIpAddressBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentIpAddressBinding.inflate(inflater, container, false)

        binding.btnDone.setOnClickListener {
            val ipAddress = binding.etIPAddress.text.toString()
            val portName = binding.etPortName.text.toString()
            val secureConnection: Boolean = binding.rdnHttps.isChecked

            if (ipAddress == "") {
                Toast.makeText(requireContext(), "Enter IP Address", Toast.LENGTH_SHORT).show()
            } else if (portName == "") {
                Toast.makeText(requireContext(), "Enter Port Number", Toast.LENGTH_SHORT).show()
            } else {
                val serverInfo = IPAddress(ipAddress, portName, secureConnection)
                val action =
                    IPAddressFragmentDirections.actionIpFragmentToServerFragment(
                        serverInfo
                    )
                findNavController().navigate(action)
            }
        }

        // Inflate the layout for this fragment
        return binding.root
    }
}