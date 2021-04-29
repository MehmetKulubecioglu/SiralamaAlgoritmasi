import java.util.Random
fun main()
{
    val numbers= Array <Int>(10){0}
    var i=0
    var j=0
    var z=0
    var s=0
    var temp=0

    while (i < 10)
    {
        numbers[i]=Random().nextInt(100)
        i++
    }

    for(number in numbers)
    {
        print("$number ")
    }
    println()

    while(j<10)
    {
        z=0;
        while(z<9)
        {
            if(numbers[z]>numbers[z+1])
            {
                temp=numbers[z]
                numbers[z]=numbers[z+1]
                numbers[z+1]=temp
            }
            z++
        }
        j++
    }

    for(number in numbers)
    {
        print("$number ")
    }

}