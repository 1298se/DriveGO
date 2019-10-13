package tang.song.edu.drivego.ui.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import tang.song.edu.drivego.R
import tang.song.edu.drivego.ui.tasks.CompletedTaskFragment
import tang.song.edu.drivego.ui.tasks.ScheduledTaskFragment

private val TAB_TITLES = arrayOf(
    R.string.task_scheduled,
    R.string.task_completed
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ScheduledTaskFragment()
            1 -> CompletedTaskFragment()
            else -> ScheduledTaskFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}