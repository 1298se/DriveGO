package tang.song.edu.drivego.ui.tasks

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import tang.song.edu.drivego.R

class CompletedTaskFragment : Fragment() {

    companion object {
        fun newInstance() = CompletedTaskFragment()
    }

    private lateinit var viewModel: CompletedTaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.completed_task_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CompletedTaskViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
