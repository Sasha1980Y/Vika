package com.example.alexanderyakovenko.vika

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.main.*
import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.content.Context.INPUT_METHOD_SERVICE
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.LinearLayout
import android.widget.EditText
import android.view.MotionEvent
import android.support.annotation.NonNull
import java.security.AccessController.getContext


// 1080 x 1920

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)



        buttonSumm.setOnClickListener {




            try {
                // get string from count of coupure
                val count500: String = editText500.text.toString()
                val count200: String = editText200.text.toString()
                val count100: String = editText100.text.toString()
                val count50: String = editText50.text.toString()
                val count20: String = editText20.text.toString()
                val count10: String = editText10.text.toString()
                val count5: String = editText5.text.toString()
                val count2: String = editText2.text.toString()
                val count1: String = editText1.text.toString()

                // get int from count of coupure 500
                if (count500 == "") {
                    textView500Summ.text = "0"
                } else {
                    val intCount500: Int? = count500.toInt()
                    if (intCount500 != null) {
                        val summ500 = (intCount500 * 500).toString()
                        textView500Summ.text = summ500
                    }
                }

                // get int from count of coupure 200
                if (count200 == "") {
                    textView200Summ.text = "0"
                } else {
                    val intCount200: Int? = count200.toInt()
                    if (intCount200 != null) {
                        val summ200 = (intCount200 * 200).toString()
                        textView200Summ.text = summ200
                    }
                }

                // get int from count of coupure 100
                if (count100 == "") {
                    textView100Summ.text = "0"
                } else {
                    val intCount100: Int? = count100.toInt()
                    if (intCount100 != null) {
                        val summ100 = (intCount100 * 100).toString()
                        textView100Summ.text = summ100
                    }
                }

                // get int from count of coupure 50
                if (count50 == "") {
                    textView50Summ.text = "0"
                } else {
                    val intCount50: Int? = count50.toInt()
                    if (intCount50 != null) {
                        val summ50 = (intCount50 * 50).toString()
                        textView50Summ.text = summ50
                    }
                }

                // get int from count of coupure 20
                if (count20 == "") {
                    textView20Summ.text = "0"
                } else {
                    val intCount20: Int? = count20.toInt()
                    if (intCount20 != null) {
                        val summ20 = (intCount20 * 20).toString()
                        textView20Summ.text = summ20
                    }
                }

                // get int from count of coupure 10
                if (count10 == "") {
                    textView10Summ.text = "0"
                } else {
                    val intCount10: Int? = count10.toInt()
                    if (intCount10 != null) {
                        val summ10 = (intCount10 * 10).toString()
                        textView10Summ.text = summ10
                    }
                }

                // get int from count of coupure 5
                if (count5 == "") {
                    textView5Summ.text = "0"
                } else {
                    val intCount5: Int? = count5.toInt()
                    if (intCount5 != null) {
                        val summ5 = (intCount5 * 5).toString()
                        textView5Summ.text = summ5
                    }
                }

                // get int from count of coupure 2
                if (count2 == "") {
                    textView2Summ.text = "0"
                } else {
                    val intCount2: Int? = count2.toInt()
                    if (intCount2 != null) {
                        val summ2 = (intCount2 * 2).toString()
                        textView2Summ.text = summ2
                    }
                }

                // get int from count of coupure 1
                if (count1 == "") {
                    textView1Summ.text = "0"
                } else {
                    val intCount1: Int? = count1.toInt()
                    if (intCount1 != null) {
                        val summ1 = (intCount1 * 1).toString()
                        textView1Summ.text = summ1
                    }
                }

                var countCoupureS: Int = 0
                var productSumm: Int = 0

                val count500int: Int? = count500.toIntOrNull()
                val count200int: Int? = count200.toIntOrNull()
                val count100int: Int? = count100.toIntOrNull()
                val count50int: Int? = count50.toIntOrNull()
                val count20int: Int? = count20.toIntOrNull()
                val count10int: Int? = count10.toIntOrNull()
                val count5int: Int? = count5.toIntOrNull()
                val count2int: Int? = count2.toIntOrNull()
                val count1int: Int? = count1.toIntOrNull()

                if (count500int != null) {
                    countCoupureS += count500int
                    productSumm += 500 * count500int
                }
                if (count200int != null) {
                    countCoupureS += count200int
                    productSumm += 200 * count200int
                }
                if (count100int != null) {
                    countCoupureS += count100int
                    productSumm += 100 * count100int
                }
                if (count50int != null) {
                    countCoupureS += count50int
                    productSumm += 50 * count50int
                }
                if (count20int != null) {
                    countCoupureS += count20int
                    productSumm += 20 * count20int
                }
                if (count10int != null) {
                    countCoupureS += count10int
                    productSumm += 10 * count10int
                }
                if (count5int != null) {
                    countCoupureS += count5int
                    productSumm += 5 * count5int
                }
                if (count2int != null) {
                    countCoupureS += count2int
                    productSumm += 2 * count2int
                }
                if (count1int != null) {
                    countCoupureS += count1int
                    productSumm += 1 * count1int
                }

                val sCoup: String = countCoupureS.toString()


                countCoupure.text = sCoup
                allSumm.text = productSumm.toString()

            } catch (e: NumberFormatException) {
                println("string is not number")
            }
        }




    }



}
