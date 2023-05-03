package mad.project.gogoapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.widget.Button


class AddVacancy : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_add_vacancy, container, false)
        val button = view.findViewById<Button>(R.id.add_new_vacancy)
        val button1 = view.findViewById<Button>(R.id.updateVacancy)
        val button2 = view.findViewById<Button>(R.id.deleteVacancy)
        button.setOnClickListener{
            val intent = Intent(activity, AddNewVacancyActivity::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener {
            val intent = Intent(activity, UpdateVacancyActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(activity, DeleteVacancyActivity::class.java)
            startActivity(intent)
        }
        return view
    }
}