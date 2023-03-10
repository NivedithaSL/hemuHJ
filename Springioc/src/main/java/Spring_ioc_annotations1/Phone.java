package Spring_ioc_annotations1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Phone {
@Autowired
MusicPlayer musicPlayer;
void Start() {
	musicPlayer.music();
}
	
}
