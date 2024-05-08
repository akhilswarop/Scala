@main def SpaceAge() = {
  val esec = 31557600 
  
  def onEarth(age: Double): Double = age / esec  

  def onVenus(age: Double): Double = (age / esec) * 0.61519726

  def onMercury(age: Double): Long = (age / esec) * 0.2408467 

  def onMars(age: Double): Double = (age / esec) * 1.8808158

  def onJupiter(age: Double): Double = (age / esec) * 11.862615

  def onSaturn(age: Double): Double = (age / esec) *29.447498

  def onUranus(age: Double): Double = (age / esec) * 84.016846

  def onNeptune(age: Double): Double = (age / esec) *164.79132 

  print(onMercury(2134835688))
}