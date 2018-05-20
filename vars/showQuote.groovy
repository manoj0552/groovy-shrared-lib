
def call(){
 def quotes = ['make it','enage'] 
  println quotes.get(new Random().nextInt(quotes.size()))
}
