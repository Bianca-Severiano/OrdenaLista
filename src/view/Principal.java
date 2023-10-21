package view;

import bilbioteca.fila.dinamica.generica.model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> l = new Lista<Integer>();
		Lista<Integer> l2 = new Lista<Integer>();
		l.addFirst(10);
		l.addLast(5);
		l.addLast(8);
		l.addLast(1);
		l.addLast(9);
		l.addLast(2);
		l.addLast(4);
		l.addLast(7);
		l.addLast(3);
		l.addLast(6);

		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + ", ");
		}
		System.out.println("");

		int tamanho = l.size();
		int i = 0;
		int w = 0;
		int v = 0;

		while (!l.isEmpty()) {
			if (l.size() > 1) {
				tamanho = l.size();
				int a = l.get(i);
				int menor = a;

				// define menor valor
				while (w != l.size()) {
					int b = l.get(w);
					if (menor > b) {
						menor = b;
					}
					w++;
				}

				// Adiciona menor na fila 2
				if (l2.isEmpty()) {
					l2.addFirst(menor);
				} else {
					l2.addLast(menor);
				}

				// Remove menor da lista
				do {
					if (menor == l.get(l.size() - 1)) {
						l.removeLast();
					} else if (menor == l.get(0)) {
						l.removeFirst();
					} else {
						if (l.get(v) == menor) {
							l.remove(v);
						}

					}
					v++;
				} while (v != l.size());

				i = 0;
				w = 0;
				v = 0;

			} else {
				int ultimo = (l.get(l.size() - 1));
				l2.addLast(ultimo);
				l.removeFirst();
			}

		}
		
		System.out.println();
		for (int f = 0; f < l2.size(); f++) {
			System.out.print(l2.get(f) + ", ");
		}

	}

}
