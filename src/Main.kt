fun main(args: Array<String>){
    var name1: String
    name1 = "VG"
    var name2: String = "VG"
    var a: Int = 1
    var b: Int = 2
    println("Hello " + name1 + ". Try Kotlin!")
    println("Hello \$name2 $name2! It's my first program in Kotlin.")
    println("A + B = ${a + b}")

    // val - unmutable/immutable
    // var - mutable
    val userJava = UserJava("VG_Java@gmail.com");
    println(userJava.getEmail());
    println(userJava.email);
    println("Java example ${userJava.getEmail()}")
    println("Java example ${userJava.email}")

    val userKotlin = UserKotlin("VG_Kotlin@gmail.com", "VG_Kotlin2@gmail.com")
    println("Kotlin example ${userKotlin.email1}, ${userKotlin.email2}")
    userKotlin.email2 = "new_email";
    println("Kotlin example ${userKotlin.email1}, ${userKotlin.email2}")

    var nameVar:String = "sadfasdf"
    val nameVal:String = "dfaskjhf"


}