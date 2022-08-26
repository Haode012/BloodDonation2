package tarc.edu.blooddonation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import tarc.edu.blooddonation.databinding.FragmentDonorBinding

class Donor : Fragment(){
    private var _binding: FragmentDonorBinding? = null
    private val binding get() = _binding!! //getter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDonorBinding.inflate(inflater, container, false)
        return binding.root //pass value to MainActivity

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddDonor.setOnClickListener{
            findNavController().navigate(R.id.action_donorFragment_to_addDonorFragment)
        }
        binding.btnDeleteDonor.setOnClickListener{
            findNavController().navigate(R.id.action_donorFragment_to_deleteDonorFragment)
        }
        binding.btnUpdateDonor.setOnClickListener{
            findNavController().navigate(R.id.action_donorFragment_to_updateDonorFragment)
        }
        binding.btnSearchToViewDonor.setOnClickListener {
            findNavController().navigate(R.id.action_donorFragment_to_searchToViewDonorFragment)
        }
    }
}