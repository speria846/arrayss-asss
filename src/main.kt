fun main(){
    var s =productelements(arrayOf(23,31,12,23,34))
    println(s)
    var wa=returnsum(arrayOf("sper",34,446,"man",55,23.4,34.5,"der"))
      println(wa)
    var q = noofvowels(arrayOf('a', 'c', 'd', 'e', 'r'))
        println(q)
    }


fun productelements(sap:Array<Int>):Int{
    var product =2
    sap.forEach { d->
        product*=d
    }
    return product
}

fun returnsum(mixd:Array<Any>): Double {
    var sum =0.0
    mixd.forEach { b->
        if(b is Int || b is Double){
       sum+=b.toString().toDouble()
    }
         }
        return sum
    }

fun noofvowels(mak:Array<Char>):Int{
    var dod =0
    mak.forEach { s->
        if(s=='a'|| s=='e'||s=='i'||s=='o'||s=='u'){
    dod++

    }
    }
    return dod


}



