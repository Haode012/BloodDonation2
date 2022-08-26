package tarc.edu.blooddonation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Use the [UpdateDonor.newInstance] factory method to
 * create an instance of this fragment.
 */
class UpdateDonor : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update_donor, container, false)
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.findItem(R.id.action_save).isVisible = false
    }

}