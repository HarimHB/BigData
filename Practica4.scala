def fibo (n: Int, a: BigInt=0, b: BigInt=1, c: List[BigInt]=Nil): List[BigInt] =
  {
  if (n == 0)
  (a :: c).reverse
  else
  fibo (n - 1, b, a + b, a :: c)
}
