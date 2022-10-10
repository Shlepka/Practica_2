fun main(args: Array<String>) {
    //1
    val age1: Int = 42
    val age2: Int = 21
    //2-3
    val avg1: Double
    avg1 = (age1.toDouble()+age2.toDouble())/2
    println(avg1)
    //4
    val firstName: String = "Stepan"
    val lastName : String = "Lavinsky"
    //5
    val fullName: String
    fullName = firstName+" "+lastName
    println(fullName)
    //6
    val myDetails: String = "Мой заклятый враг $fullName"
    println(myDetails)
    //7
    val data = Triple(10,10,2022)
    println(data)
    //8
    val day: Int = data.first
    val month: Int = data.second
    val year: Int = data.third
    println(day)
    println(month)
    println(year)
    //9
    val bigString = """
        | $month
        | 
        | $year
        """.trimMargin()
    println(bigString)
    //10
    var x: Int = data.first
    var y: Int = data.second
    var z: Int = data.third
    y=8
    z=23
    val reData = Pair(y,data.third)
    println(reData)
}