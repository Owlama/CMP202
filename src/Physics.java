public class Physics {
    float calculateVelocity (float distance, int time){
        return distance/time;
    }
    float calculatevelocity (float initialVelocity, float acceleration, int time){
        return  initialVelocity + (acceleration * time);
    }
}
