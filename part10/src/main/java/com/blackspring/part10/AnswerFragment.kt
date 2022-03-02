package com.blackspring.part10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnswerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnswerFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var questionId: Int = NO_QUESTION_SET

    private val headerText: TextView?
    get() = view?.findViewById(R.id.question)

    private val answer: TextView?
    get() = view?.findViewById(R.id.answer)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_answer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val planets = listOf<View>(
            view.findViewById(R.id.mercury),
            view.findViewById(R.id.venus),
            view.findViewById(R.id.earth),
            view.findViewById(R.id.mars),
            view.findViewById(R.id.jupiter),
            view.findViewById(R.id.saturn),
            view.findViewById(R.id.uranus),
            view.findViewById(R.id.neptune)
        )

        planets.forEach {
            it.setOnClickListener(this)
        }

        questionId = arguments?.getInt(QUESTION_ID) ?: NO_QUESTION_SET

        // set header text
        when(questionId){
            R.id.largest_planet -> {
                headerText?.text = getString(R.string.largest_planet)
            }
            R.id.most_moons -> {
                headerText?.text = getString(R.string.most_moons)
            }
            R.id.side_spinning -> {
                headerText?.text = getString(R.id.side_spinning)
            }
        }
    }

    companion object {

        // MENAMBAHKAN CONSTANT
        private const val QUESTION_ID = "QUESTION_ID"
        private const val NO_QUESTION_SET = 0
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AnswerFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(questionId: Int) =
            AnswerFragment().apply {
                arguments = Bundle().apply {
                    putInt(QUESTION_ID, questionId)
                }
            }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}