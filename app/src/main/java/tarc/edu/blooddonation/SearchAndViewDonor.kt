package tarc.edu.blooddonation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

/**
 * A simple [Fragment] subclass.
 * Use the [search_and_view_donor.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchAndViewDonor : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_to_view_request, container, false)
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