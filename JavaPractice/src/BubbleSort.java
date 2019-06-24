public class BubbleSort {
    public static void main(String[] args) {
    int [] datas = { 2, 4, 3, 5, 7, 9, 6, 1, 8};
    for (int data : datas) {
        System.out.print(data);
    }
    
    for (int i = 0; i < datas.length-1 ; i++) {             //要走datas.length-1 次，因為每次比較大的往後排，而最大的數字跟任何比一定是往後排
                                                            //所以最後面的一定是最大數字。
        for (int j = 0 ; j < datas.length-1 ; j++) {
            if (datas[j] > datas[j+1]) {
                int bignum = datas[j+1];
                datas[j+1] = datas[j];
                datas[j] = bignum;
            }
        }
    }
        System.out.println("");
    for ( int data : datas ) {
        System.out.print(data);
    }
}
}
