package Examples;

class MyGenericClass<T extends Comparable<T>> {
    private T data;
 
    public MyGenericClass(T data) {
        this.data = data;
	}
 
    public T getData() {
        return data;
	}
 
    public static void main(String[] args) {
        MyGenericClass<Integer> myObj = new MyGenericClass<>(10);
        System.out.println(myObj.getData().compareTo(5));
	}
}
