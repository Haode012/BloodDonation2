package tarc.edu.blooddonation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import tarc.edu.blooddonation.databinding.FragmentHomeBinding


class Home : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!! //getter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root //pass value to MainActivity

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRequest.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_requestFragment)
        }
        binding.btnDonor.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_donorFragment)
        }
    }
}