package ch06;

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last; // ����Ʈ�� ������ ���(�׸�)�� ����Ų��.
	private int size; // ����Ʈ�� �׸�(���) ��

	public CList() { // ����Ʈ ������
		last = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(E newItem) { // last�� ����Ű�� ����� ������ ����� ����
		Node newNode = new Node(newItem, null); // �� ��� ����
		if (last == null) { // ����Ʈ�� empty�϶�
			newNode.setNext(newNode);
			last = newNode;
		} else {
			newNode.setNext(last.getNext()); // newNode�� ���� ��尡
// last�� ����Ű�� ����� ������尡 �ǵ���
			last.setNext(newNode); // last�� ����Ű�� ����� ���� ��尡 newNode�� �ǵ���
		}
		size++;
	}

	public Node delete() { // last�� ����Ű�� ����� ���� ��带 ����
		if (isEmpty())
			throw new NoSuchElementException();
		Node x = last.getNext(); // x�� ����Ʈ�� ù ��带 ����Ŵ
		if (x == last)
			last = null; // ����Ʈ�� 1���� ��常 �ִ� ���
		else {
			last.setNext(x.getNext()); // last�� ����Ű�� ����� ���� ��尡 x�� ���� ��尡 �ǵ���
			x.setNext(null); // x�� next�� null�� �����.
		}
		size--;
		return x;
	}

	public void print() { // ���� ����Ʈ ������ �׸���� ���ʷ� ���
		if (size > 0) {
			int i = 0;
			for (Node p = last.getNext(); i < size; p = p.getNext(), i++)
				System.out.print(p.getItem() + "\t ");
		} else
			System.out.println("����Ʈ �������.");
	}
}
