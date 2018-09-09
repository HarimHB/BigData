def Fibon (n: Int)
  {
    var n = 7
    var primero = 0
    var segundo = 1
    var siguiente = 0
    var i = 0

    for(i <- 0 to 10)
    {
      if(i <= 1)
      siguiente = i

      else
      {
        siguiente = primero + segundo
        primero = segundo
        segundo = siguiente

      }
      println(siguiente + "\t")

    }

  }
