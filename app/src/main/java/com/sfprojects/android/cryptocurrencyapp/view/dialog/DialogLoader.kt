package com.sfprojects.android.cryptocurrencyapp.view.dialog

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import androidx.appcompat.app.AlertDialog
import com.sfprojects.android.cryptocurrencyapp.R

/**
 * Created by SFDevelop on 10/29/20.
 */
/**
 * DialogLoader will be used to show and hide Dialog with ProgressBar
 **/
class DialogLoader {
    private var context: Context? = null
    private var alertDialog: AlertDialog? = null
    private var dialog: AlertDialog.Builder? = null
    private var layoutInflater: LayoutInflater? = null


    fun DialogLoader(context: Context?) {
        this.context = context
        layoutInflater = LayoutInflater.from(context)
        initDialog()
    }


    private fun initDialog() {
        dialog = AlertDialog.Builder(context!!)
        val dialogView: View = layoutInflater!!.inflate(R.layout.layout_progress_dialog, null)
        dialog!!.setView(dialogView)
        dialog!!.setCancelable(false)
        alertDialog = dialog!!.create()
        alertDialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        alertDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }


    fun showProgressDialog() {
        alertDialog!!.show()
    }


    fun hideProgressDialog() {
        alertDialog!!.dismiss()
    }


}