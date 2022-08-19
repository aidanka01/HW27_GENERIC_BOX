
    /*     Box деген generic класс тузунуз.
        Ичинде Box деген объектти кайтарган статический generic метод болсун.*/
    public class Box <T> {
        private int weight;
        private String color;

        public Box(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public static <T> Box<T> boxMethod(Integer weight, String color) {
            return new Box<>(weight, color);
        }

        @Override
        public String toString() {
            return "Box{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }

    }