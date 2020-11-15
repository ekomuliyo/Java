public class Main {
    public static void main(String[] args) {
        
        var category = new Category();
        category.setId("ID");
        category.setId(null);

        System.out.println(category.getId());
    }
}


class Category {
    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
    
}