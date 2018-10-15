package es.liguillasdepadel.app

import android.content.Context
import android.support.v4.app.Fragment
import java.lang.Exception

open class BaseFragment : Fragment() {

    lateinit var fragmentNavigation: FragmentNavigation

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is FragmentNavigation) {
            fragmentNavigation = context
        } else {
            throw Exception("$TAG: Attach not is FragmentNavigation")
        }
    }

    interface FragmentNavigation

    companion object {
        val TAG = BaseFragment::class.java.simpleName
    }
}