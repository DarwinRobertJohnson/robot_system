


class limb{

//Sets the direction of the motor spin

const int digiPinOne=0;
const int digiPinTwo=1;


//constructor
limb(){
	digiPinOne=0;
	digiPinTwo=1;
}


//sets the spin direction with maximum speed
void setSpin(bool forward=true){
	digitalWrite(digiPinOne,!forward);
    digitalWrite(digiPinTwo,forward);
}




//sets the speed level and runs direction
void setSpeed(int speed,bool direction=true){
	
  analogWrite(8,speed);
  setSpin(direction);
  
	
}



//turns off the motor
void turnOff(bool onOff=true){
	digitalWrite(digiPinOne,onOff);
  	digitalWrite(digiPinTwo,onOff);
}



//runs the motor shaft to a certainAngle
void setAngle(int angle){
	double timeTaken=((angle+0.0)/(9893*360))*1000;
  setSpin(true);
  Serial.println(timeTaken);
  	delay(timeTaken);
  turnOff();
  
}

};
