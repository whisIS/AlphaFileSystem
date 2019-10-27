
import interfaces.Id;

public class StringId implements Id {
    private String id;

    StringId(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
    @Override
    public boolean equals(Object k){
        if(this == k)
            return true;
        if(k instanceof StringId){
            return id.equals(((StringId)k).getId());
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    }
}
