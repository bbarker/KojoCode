// A string of beads
// By: Vibha
// Category: Art

clear
setAnimationDelay(5)
right
def circle(){
    repeat(180){
        forward(1)
        left(2)
    }
}

def semi(){
repeat(6){
    setPenColor(color(random(256), random(256), random(256)))
    setFillColor(color(random(256), random(256), random(256)))
penUp
forward(100)
penDown
circle()
penUp
back(100)
left(30)}
}
repeat(5){
semi()
penUp
forward(200)
semi()
penUp
back(200)}
