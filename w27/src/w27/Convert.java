package w27;

public class Convert<E> {
    private E[] arr;

    public Convert(E[] arr) {
        this.arr = arr;
    }

    public E[] getArr() {
        return arr;
    }

    public E getElem(int index){
        if (index>arr.length && index<0) {
            throw new ArrayIndexOutOfBoundsException("invalid");
        }
        return arr[index];
    }
}
