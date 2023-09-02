class abc {
int x,y,z;
public abc(int a, int b, int c) {
x = a;
y = b;
z = c;
System.out.println(x + " " + y + " " + z);
}
}
class print {
public static void main(String[] args) {
abc n = new abc(10, 20, 30);
}
}
