package myGameEngine.input.action;

import graphicslib3D.Matrix3D;
import graphicslib3D.Vector3D;
import sage.input.action.AbstractInputAction;
import sage.scene.SceneNode;

public class TurnLeft extends AbstractInputAction {
	private SceneNode p; 
	private float speed = 0.01f;
	
	public TurnLeft(SceneNode p) { 
		this.p = p; 
	} 
 
	public void performAction(float time, net.java.games.input.Event e) {
		Matrix3D rot = p.getLocalRotation(); 
		Vector3D dir = new Vector3D(1,0,0);
		dir = dir.mult(rot); 
		dir.scale(-(double)(speed * time)); 
		p.translate((float)dir.getX(),(float)dir.getY(),(float)dir.getZ());
	}
}
