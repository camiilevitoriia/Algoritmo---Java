import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Listas {
    public static void listas(String[] args) {
        // 1️⃣ Criar a lista
        ArrayList<String> cars = new ArrayList<>();
        System.out.println("Lista inicial: " + cars); 
        // Saída: Lista inicial: []

        // 2️⃣ Adicionar elementos
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Após add(): " + cars); 
        // Saída: Após add(): [Volvo, BMW, Ford]

        cars.add(1, "Audi"); // adiciona no índice 1
        System.out.println("Após add(1, 'Audi'): " + cars);
        // Saída: Após add(1, 'Audi'): [Volvo, Audi, BMW, Ford]

        // 3️⃣ Obter elementos
        System.out.println("Elemento no índice 0: " + cars.get(0));
        // Saída: Elemento no índice 0: Volvo

        System.out.println("Último elemento: " + cars.get(cars.size()-1));
        // Saída: Último elemento: Ford

        // 4️⃣ Alterar elementos
        cars.set(0, "Honda");
        System.out.println("Após set(0, 'Honda'): " + cars);
        // Saída: Após set(0, 'Honda'): [Honda, Audi, BMW, Ford]

        // 5️⃣ Remover elementos
        cars.remove(2); // remove índice 2
        System.out.println("Após remove(2): " + cars);
        // Saída: Após remove(2): [Honda, Audi, Ford]

        cars.remove("Audi"); // remove pelo valor
        System.out.println("Após remove('Audi'): " + cars);
        // Saída: Após remove('Audi'): [Honda, Ford]

        // 6️⃣ Tamanho da lista
        System.out.println("Tamanho da lista: " + cars.size());
        // Saída: Tamanho da lista: 2

        // 7️⃣ Iterar sobre a lista (for clássico)
        System.out.println("Iteração com for clássico:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // Saída:
        // Iteração com for clássico:
        // Honda
        // Ford

        // 7️⃣ Iterar sobre a lista (for-each)
        System.out.println("Iteração com for-each:");
        for (String car : cars) {
            System.out.println(car);
        }
        // Saída:
        // Iteração com for-each:
        // Honda
        // Ford

        // 7️⃣ Iterar com Iterator
        System.out.println("Iteração com Iterator:");
        Iterator<String> it = cars.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        // Saída:
        // Iteração com Iterator:
        // Honda
        // Ford

        // 8️⃣ Ordenação
        cars.add("Mazda");
        cars.add("BMW");
        System.out.println("Antes da ordenação: " + cars);
        // Saída: Antes da ordenação: [Honda, Ford, Mazda, BMW]

        Collections.sort(cars);
        System.out.println("Após sort(): " + cars);
        // Saída: Após sort(): [BMW, Ford, Honda, Mazda]

        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Após sort() decrescente: " + cars);
        // Saída: Após sort() decrescente: [Mazda, Honda, Ford, BMW]

        // 9️⃣ Busca
        System.out.println("Contém 'Ford'? " + cars.contains("Ford"));
        // Saída: Contém 'Ford'? true

        System.out.println("Índice de 'BMW': " + cars.indexOf("BMW"));
        // Saída: Índice de 'BMW': 3

        System.out.println("Índice de 'Audi': " + cars.indexOf("Audi"));
        // Saída: Índice de 'Audi': -1
    }
}
