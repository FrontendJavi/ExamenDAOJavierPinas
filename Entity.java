import java.lang.reflect.Field;
import java.util.UUID;

public abstract class Entity{

	public UUID id = UUID.randomUUID();

	public void generateID(UUID id){
        this.id = id;
    }


	public UUID getId(){
		return id;
	}

    public boolean validate(UUID id){
        try {
            UUID.fromString(id.toString());
            return true;
         } catch (Exception ex) {
            return false;
         }
    }

    @Override

	public boolean equals(Object obj) {

		if (!(obj instanceof Entity)) {

		     return false;

		} 
		Entity tmp = (Entity) obj;
		return tmp.getId().equals(this.getId());
	}

	public String getInsert(){
	  String name = this.getClass().getName();
	  this.getClass().getFields();
      return "insert into " + name + "("+ "fields" +")"+"values"+"";
	}

	@Override
	public int hashCode(){
		return this.getId().hashCode();
	}

	

	
}






    