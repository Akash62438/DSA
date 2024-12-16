
import java.util.Scanner;

class Node {

    int coefficient;
    int exponent;
    Node next;

    public Node(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = null;
    }
}

class Polynomial {

    Node head;

    public Polynomial() {
        head = null;
    }

    // Insert a term in descending order of exponents
    public void insertTerm(int coefficient, int exponent) {
        Node newNode = new Node(coefficient, exponent);
        if (head == null || head.exponent < exponent) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            Node prev = null;
            while (current != null && current.exponent >= exponent) {
                prev = current;
                current = current.next;
            }
            if (prev.exponent == exponent) {
                prev.coefficient += coefficient;  // Combine terms with the same exponent
            } else {
                newNode.next = current;
                prev.next = newNode;
            }
        }
    }

    // Display polynomial
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

    // Add two polynomials and return the result as a new polynomial
    public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();
        Node t1 = p1.head, t2 = p2.head;

        while (t1 != null && t2 != null) {
            if (t1.exponent == t2.exponent) {
                result.insertTerm(t1.coefficient + t2.coefficient, t1.exponent);
                t1 = t1.next;
                t2 = t2.next;
            } else if (t1.exponent > t2.exponent) {
                result.insertTerm(t1.coefficient, t1.exponent);
                t1 = t1.next;
            } else {
                result.insertTerm(t2.coefficient, t2.exponent);
                t2 = t2.next;
            }
        }

        // Add remaining terms
        while (t1 != null) {
            result.insertTerm(t1.coefficient, t1.exponent);
            t1 = t1.next;
        }
        while (t2 != null) {
            result.insertTerm(t2.coefficient, t2.exponent);
            t2 = t2.next;
        }

        return result;
    }
}

public class addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        System.out.println("Enter the number of terms in the first polynomial:");
        int n1 = scanner.nextInt();
        System.out.println("Enter terms for first polynomial (coefficient and exponent):");
        for (int i = 0; i < n1; i++) {
            int coeff = scanner.nextInt();
            int exp = scanner.nextInt();
            poly1.insertTerm(coeff, exp);
        }

        System.out.println("Enter the number of terms in the second polynomial:");
        int n2 = scanner.nextInt();
        System.out.println("Enter terms for second polynomial (coefficient and exponent):");
        for (int i = 0; i < n2; i++) {
            int coeff = scanner.nextInt();
            int exp = scanner.nextInt();
            poly2.insertTerm(coeff, exp);
        }

        System.out.println("First Polynomial:");
        poly1.display();
        System.out.println("Second Polynomial:");
        poly2.display();

        Polynomial result = Polynomial.addPolynomials(poly1, poly2);

        System.out.println("Result of addition:");
        result.display();
    }
}
