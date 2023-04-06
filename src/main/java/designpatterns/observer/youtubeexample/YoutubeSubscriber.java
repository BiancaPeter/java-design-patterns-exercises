package designpatterns.observer.youtubeexample;

public class YoutubeSubscriber implements Observer{
    public void update(){
        System.out.println("New video on channel");
    }
}
