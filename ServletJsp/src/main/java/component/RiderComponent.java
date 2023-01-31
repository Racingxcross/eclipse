package component;

import org.springframework.stereotype.Component;

@Component
public class RiderComponent {
	public RiderComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
