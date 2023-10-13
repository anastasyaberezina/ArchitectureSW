package progectarch1.ModelElements;

import progectarch1.Stuff.Angle3D;
import progectarch1.Stuff.Point3D;

public class Camera {
    public Point3D Location;
    public Angle3D Angle;

    public void Rotate(Angle3D Angle){};
    public void Move(Point3D Location){};
}
