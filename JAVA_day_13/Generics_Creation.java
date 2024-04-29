public class Generics_Creation <T>{
        private T value;
        public void setValue(T value){
            this.value = value;
        }
        public T getValue() {
            return value;
        }


    public static void main(String[] args){
        Generics_Creation<Integer> intValue = new Generics_Creation<>();
        intValue.setValue(9);
        System.out.println("Integer value = "+ intValue.getValue());

        Generics_Creation<String> stringValue = new Generics_Creation<>();
        stringValue.setValue("My self Jai very warm welcome to my file. Let's learn together grow together.");
        System.out.println("This is string value = "+stringValue.getValue());
    }
}
