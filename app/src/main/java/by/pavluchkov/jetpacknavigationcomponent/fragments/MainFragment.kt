package by.pavluchkov.jetpacknavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import by.pavluchkov.jetpacknavigationcomponent.R

class MainFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.button_first).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_second).setOnClickListener(this)
        view.findViewById<Button>(R.id.button_third).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button_first -> navController.navigate(R.id.action_mainFragment_to_firstFragment)
            R.id.button_second -> navController.navigate(R.id.action_mainFragment_to_secondFragment)
            R.id.button_third -> navController.navigate(R.id.action_mainFragment_to_thirdFragment)

        }
    }

}
