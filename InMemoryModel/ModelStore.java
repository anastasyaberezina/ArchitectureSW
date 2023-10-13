package progectarch1.InMemoryModel;

import progectarch1.ModelElements.Camera;
import progectarch1.ModelElements.Flash;
import progectarch1.ModelElements.PoligonalModel;
import progectarch1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChenger {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    public List<IModelChengedObserver> changedObserver;

    public ModelStore(List<IModelChengedObserver> changedObserver) 
    throws Exception{
        this.changedObserver = changedObserver;
                            
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
}

public Scene GetScene(int id){
    for (int i =0; i < Scenes.size(); i++){
        if (Scenes.get(i).id == id) {
            return Scenes.get(i);
        }
    }
    return null;
}
@Override
public void NotifyCange(IModelChenger sender){

}
}
