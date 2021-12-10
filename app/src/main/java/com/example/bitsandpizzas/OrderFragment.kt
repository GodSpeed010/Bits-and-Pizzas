package com.example.bitsandpizzas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.chip.ChipGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton

class OrderFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        (activity as AppCompatActivity).setSupportActionBar(toolbar)


        val pizzaGroup = view.findViewById<RadioGroup>(R.id.pizza_group)
        val pizzaType = pizzaGroup.checkedRadioButtonId

        if (pizzaType == -1) {
            //no item selected
        } else {
            val radio = view.findViewById<RadioButton>(pizzaType)
            //Do something with radio button
        }


        return view
    }

}