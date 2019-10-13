package tang.song.edu.drivego.ui.shift

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import tang.song.edu.drivego.R

class ShiftScheduleFragment : Fragment() {

    companion object {
        fun newInstance() = ShiftScheduleFragment()
    }

    private lateinit var viewModel: ShiftScheduleViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.shift_schedule_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ShiftScheduleViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
