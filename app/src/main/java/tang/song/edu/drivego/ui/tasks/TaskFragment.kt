package tang.song.edu.drivego.ui.tasks


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_task.*

import tang.song.edu.drivego.R
import tang.song.edu.drivego.ui.adapters.SectionsPagerAdapter

/**
 * A simple [Fragment] subclass.
 */
class TaskFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view_pager.adapter = SectionsPagerAdapter(context!!, childFragmentManager)
        task_tab_layout.setupWithViewPager(view_pager)
    }
}
