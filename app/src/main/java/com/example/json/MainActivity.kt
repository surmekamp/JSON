package com.example.json

import android.annotation.TargetApi
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.io.InputStream
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.util.*


class MainActivity : AppCompatActivity() {

    var arr = arrayListOf<String>()

    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun mondayOfWeek():Int {
            val today = Calendar.getInstance()

            val monday = today

            while (monday.get(Calendar.DAY_OF_WEEK) != 1) {
                monday.add(Calendar.DAY_OF_YEAR, -1)
            }

            val test: Int = 8
            val sdf = SimpleDateFormat.getDateInstance(DateFormat.MEDIUM)

            val actualMonday = monday.get(Calendar.DAY_OF_MONTH)
            return actualMonday

            }
        }
    }

//database.events += database.createEvent(MissionID,actualdate.get(Calendar.YEAR),actualdate.get(Calendar.MONTH),mondayOfWeek()+weekday, hour, minute, 1, dur/60 )

/*  button2.setOnClickListener {

      val ToastDuration = Toast.LENGTH_SHORT
      val toast = Toast.makeText(
          applicationContext,
          "Montag $actualMonday ",

          ToastDuration
      )                               //Anzeigen der Meldung (Toast)
      toast.show()

 */

  /*  fun read_json()
    {
        try {
            // Ihr Verzeichnis hieß "Assets" statt "assets". Deswegen konnte
            // die Datei nicht geöffnet werden und der untere Catch-Block wurde
            // ausgeführt. Leider war der Block leer, so dass keine
            // Fehlermeldung ausgegeben wurde.
            val inputStream: InputStream = assets.open("roadmap.json")
            // Der String wurde vorher nicht ausgelesen, sondern nur eine
            // String-Repräsentation des Buffered-Reader-Objektes weitergegeben.
            // Die konnte aber nicht zu einem JSON-Objekt konvertiert werden.
            val json = inputStream.bufferedReader().use { it.readText() }
            val jObject = JSONObject(json);
            val jsonarr: JSONArray = jObject.getJSONArray("roaddates");

            for (i in 0 until jsonarr.length())
            {
                try {
                    val jsonobj = jsonarr.getJSONObject(i)
                    val weekday = jsonobj.getInt("weekday")
                    val hour=jsonobj.getInt("hour")
                    val minute=jsonobj.getInt("min")
                    val dur=jsonobj.getInt("duration")
                    val coord=jsonobj.getString("vertex")
                    // Nutzen Sie möglichst viele Debug-Ausgaben, um Fehler
                    // schnell eingrenzen zu können.
                    Log.d("JSON-Test", "Gelesener Wochentag: " + jsonarr.toString())
                    arr.add(weekday.toString())
                    arr.add(hour.toString())
                    arr.add(minute.toString())
                    arr.add(dur.toString())
                    arr.add(coord.toString())
                } catch (e: JSONException) {
                    Log.d("TEST", "JSON-Datei konnte nicht umgewandelt werden.")
                }
            }

            val adpt = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
            val json_listview = findViewById<ListView>(R.id.json_listview)
            json_listview.adapter = adpt
        }
        catch (e:IOException)
        {
            // Achten Sie immer darauf, dass Exceptions aufgefangen werden und
            // eine passende Fehlermeldung ausgegeben wird!
            Log.d("TEST", "JSON-Datei konnte nicht geöffnet werden.")
        }


    }
}

   */
