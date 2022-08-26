package tarc.edu.blooddonation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class DeleteDonor : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delete_donor, container, false)
    }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            setHasOptionsMenu(true)
        }

        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
            super.onCreateOptionsMenu(menu, inflater)
            menu.findItem(R.id.action_save).isVisible = false
        }
}