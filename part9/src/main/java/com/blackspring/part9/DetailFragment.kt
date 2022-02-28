package com.blackspring.part9

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    // MENDAPATKAN ID STAR SIGN
    private val starSign: TextView?
    get() = view?.findViewById(R.id.star_sign)

    // MENDAPATKAN IS SYMBOL
    private val symbol: TextView?
    get() = view?.findViewById(R.id.symbol)

    // MENDAPATKAN ID DATE RANGE
    private val date_range: TextView?
    get() = view?.findViewById(R.id.date_range)

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
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    fun setStarSignData(starSignId: Int){

        // MENGECEK ID YANG DI KLIK, DAN MENAMPILKAN SESUAI YANG DI KLIK
        when(starSignId){
            R.id.aquarius_sign -> {
                starSign?.text = getString(R.string.aquarius)
                symbol?.text = getString(R.string.symbol, "Water Carrier")
                date_range?.text = getString(R.string.date_range, "January 20 - February 18")
            }
            R.id.pisces_sign -> {
                starSign?.text = getString(R.string.pisces)
                symbol?.text = getString(R.string.symbol, "Fish")
                date_range?.text = getString(R.string.date_range, "February 19 - March 20")
            }
            R.id.aries_sign -> {
                starSign?.text = getString(R.string.aries)
                symbol?.text = getString(R.string.symbol, "Ram")
                date_range?.text = getString(R.string.date_range, "March 21 - April 19")
            }
            R.id.taurus_sign -> {
                starSign?.text = getString(R.string.taurus)
                symbol?.text = getString(R.string.symbol, "Bull")
                date_range?.text = getString(R.string.date_range, "April 20 - May 20")
            }
            R.id.gemini_sign -> {
                starSign?.text = getString(R.string.gemini)
                symbol?.text = getString(R.string.symbol, "Twins")
                date_range?.text = getString(R.string.date_range, "May 21 - June 20")
            }
            R.id.cancer_sign -> {
                starSign?.text = getString(R.string.cancer)
                symbol?.text = getString(R.string.symbol, "Crab")
                date_range?.text = getString(R.string.date_range, "June 21 - July 22")
            }
            R.id.leo_signs -> {
                starSign?.text = getString(R.string.leo)
                symbol?.text = getString(R.string.symbol, "Lion")
                date_range?.text = getString(R.string.date_range, "July 23 - August 22")
            }
            R.id.virgo_sign -> {
                starSign?.text = getString(R.string.virgo)
                symbol?.text = getString(R.string.symbol, "Virgin")
                date_range?.text = getString(R.string.date_range, "August 23 - September 22")
            }
            R.id.libra_sign -> {
                starSign?.text = getString(R.string.libra)
                symbol?.text = getString(R.string.symbol, "Scales")
                date_range?.text = getString(R.string.date_range, "September 23 - October 22")
            }
            R.id.scorpio_sign -> {
                starSign?.text = getString(R.string.scorpio)
                symbol?.text = getString(R.string.symbol, "Scorpion")
                date_range?.text = getString(R.string.date_range, "October 23 - November 21")
            }
            R.id.sagitarius_sign -> {
                starSign?.text = getString(R.string.sagittarius)
                symbol?.text = getString(R.string.symbol, "Archer")
                date_range?.text = getString(R.string.date_range, "November 22 - December 21")
            }
            R.id.capricorn_sign -> {
                starSign?.text = getString(R.string.capricorn)
                symbol?.text = getString(R.string.symbol, "Mountain Goat")
                date_range?.text = getString(R.string.date_range, "December 22 - January 19")
            } else -> {
                Toast.makeText(context, getString(R.string.unknown_star_sign), Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}