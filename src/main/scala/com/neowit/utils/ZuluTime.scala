package com.neowit.utils

import java.util.{Calendar, TimeZone}
import com.sforce.ws.bind.CalendarCodec

object ZuluTime {
    val dateFormatGmt = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
    dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"))

    val codec = new CalendarCodec()

    def formatDateGMT(cal: Calendar):String = {
        dateFormatGmt.format(cal.getTime) + ".000Z"
    }
    def deserialize(dateStr: String): Calendar = codec.deserialize(dateStr)

}
