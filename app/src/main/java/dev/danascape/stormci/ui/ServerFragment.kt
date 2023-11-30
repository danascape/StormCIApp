package dev.danascape.stormci.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import dev.danascape.stormci.ApiInterface
import dev.danascape.stormci.databinding.FragmentServerBinding
import dev.danascape.stormci.models.SystemInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val data = args.serverDetails
        binding.tvIPAddress.text = "IP Address: ${data.iPAddress}"

        fetchSystemInfo(data.secureConnection.toString(), data.iPAddress, data.portName)

        binding.srLayout.setOnRefreshListener {
            fetchSystemInfo(data.secureConnection.toString(), data.iPAddress, data.portName)
            binding.srLayout.isRefreshing = false
        }

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun fetchSystemInfo(connection: String, ipAddress: String, port: String) {
        val serverString = "http://${ipAddress}:$port"
        val retrofit = ApiInterface.create(serverString).getSystemInfo()

        retrofit.enqueue(object: Callback<SystemInfo> {
            override fun onResponse(call: Call<SystemInfo>, response: Response<SystemInfo>) {
                Log.d("App", response.body().toString())
            }

            override fun onFailure(call: Call<SystemInfo>, t: Throwable) {
                Log.e("App","Error: ${t.message}")
            }
        })
    }
}