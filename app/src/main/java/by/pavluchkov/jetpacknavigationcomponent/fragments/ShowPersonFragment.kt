package by.pavluchkov.jetpacknavigationcomponent.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import by.pavluchkov.jetpacknavigationcomponent.Person
import by.pavluchkov.jetpacknavigationcomponent.R

class ShowPersonFragment : Fragment() {

    var person: Person? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_person, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text_showPerson_fragment).text = person.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        person = arguments?.getParcelable("myPerson")
    }
}
