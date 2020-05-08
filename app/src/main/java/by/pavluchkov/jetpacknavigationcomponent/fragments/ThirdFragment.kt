package by.pavluchkov.jetpacknavigationcomponent.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import by.pavluchkov.jetpacknavigationcomponent.Person
import by.pavluchkov.jetpacknavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment(), View.OnClickListener {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btn_confirm).setOnClickListener(this)
        view.findViewById<Button>(R.id.btn_show_person).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_confirm,
            R.id.btn_show_person -> {
                if (!TextUtils.isEmpty(et_personName_thirdFragment.text.toString())) {
                    val person = Person(
                        et_personName_thirdFragment.text.toString(),
                        et_personAge_thirdFragment.text.toString().toInt()
                    )
                    val bundle = bundleOf("myPerson" to person)
                    navController.navigate(R.id.action_thirdFragment_to_showPersonFragment, bundle)
                }
            }
        }

    }
}
