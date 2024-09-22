package TV;

public class Tv {
    int channel, volume;
    boolean status;

    public Tv(){
        this.channel = 1;
        this.volume = 0;
        this.status = false;
    }
    int tempChannel, tempVolume;
    public void turnOn(){
        if(this.status == false){
        this.status = true;
        tempChannel = this.channel;
        tempVolume = this.volume;
    }else{
            System.out.println("TV is already on.");
        }
}

    public void turnOff(){
        if(this.status == true){
            this.status = false;
            this.channel = tempChannel;
            this.volume = tempVolume;
        }else{
            System.out.println("TV is already off.");
        }
    }

    public void setChannel(int channel){
        if(this.status == true){
            if(channel >= 1 && channel <= 120){
                this.channel = channel;
            } else{
                System.out.println("Invalid channel number.");
            }
        } else{
            System.out.println("TV is off, cannot change channel.");
        }
    }

    public void channelUp(){
        if(this.status == true){
            this.channel++;
            if(this.channel > 120){
                this.channel = 1;
            }
        } else{
            System.out.println("TV is off, cannot change channel.");
        }
    }

    public void channelDown(){
        if(this.status == true){
            this.channel--;
            if(this.channel < 1){
                this.channel = 120;
            }
        } else{
            System.out.println("TV is off, cannot change channel.");
        }
    }

    public void volumeUp(){
        if(this.status == true){
            this.volume++;
            if(this.volume > 7){
                this.volume = 7;
                System.out.println("Error: Reached [Maximum Volume: " + this.volume+" ]");
            }
        } else{
            System.out.println("TV is off, cannot change volume.");
        }
    }

    public void volumeDown(){
        if(this.status == true){
            this.volume--;
            if(this.volume < 0){
                this.volume = 0;
                System.out.println("Error: Reached [Minimum Volume: " + this.volume+" ]");
            }
        } else{
            System.out.println("TV is off, cannot change volume.");
        }
    }

    public void displayStatus(){
        if(this.status == true){
            System.out.println("TV is turned on, Channel: " + this.channel + ", Volume: " + this.volume);
        } else{
            System.out.println("TV is turned off.");
        }
    }

    public void mute(){
        if(this.status == true){
            if(this.volume == 0){
                System.out.println("Volume is already muted.");
            } else{
                tempVolume = this.volume;
                this.volume = 0;
                System.out.println("Muted");
            }
        } else{
            System.out.println("TV is off, cannot mute.");
        }
    }

    public void unmute(){
        if(this.status == true){
            if(this.volume == 0){
                this.volume = tempVolume;
                System.out.println("Unmuted");
            } else{
                System.out.println("Volume is already unmuted.");
            }
        } else{
            System.out.println("TV is off, cannot unmute.");
        }
    }
}
