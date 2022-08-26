package tarc.edu.blooddonation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import tarc.edu.blooddonation.databinding.FragmentRequestBinding

class Request : Fragment(){
    private var _binding: FragmentRequestBinding? = null
    private val binding get() = _binding!! //getter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRequestBinding.inflate(inflater, container, false)
        return binding.root //pass value to MainActivity

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddRequest.setOnClickListener{
            findNavController().navigate(R.id.action_requestFragment_to_addRequestFragment)
        }
        binding.btnDeleteRequest.setOnClickListener{
            findNavController().navigate(R.id.action_requestFragment_to_deleteRequestFragment)
        }
        binding.btnSearchToViewRequest.setOnClickListener {
            findNavController().navigate(R.id.action_requestFragment_to_searchToViewRequestFragment)
        }
    }
}