package libray.toast.uma.com.toastlibrary

import android.content.Context
import android.widget.Toast

/**
 * Created by Kavinraj on 16/10/18.
 * Copyright Indyzen Inc, @2018
 */
class UmaToaster {

    fun uma(ctx: Context,msg:String ){
        Toast.makeText(ctx,msg,Toast.LENGTH_LONG).show()
    }
}