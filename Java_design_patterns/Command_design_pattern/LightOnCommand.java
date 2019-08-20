package Command_design_pattern;

class LightOnCommand implements Command {
	Light light;

	// The constructor is passed the light it
	// is going to control.
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}