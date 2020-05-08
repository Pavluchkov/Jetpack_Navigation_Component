package by.pavluchkov.jetpacknavigationcomponent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(val name: String, val age: Int) : Parcelable {
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}