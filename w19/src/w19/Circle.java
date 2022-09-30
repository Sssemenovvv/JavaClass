package w19;

public class Circle {
        private int radius;
        private int coordX = 0;
        private int coordY = 0;
        private String Color = "Red";

        public Circle(int radius) {
            this.radius = Math.abs(radius);
        }

        public Circle(int radius, int coordX) {
            this.radius = radius;
            this.coordX = coordX;
        }

        public Circle(int radius, int coordX, int coordY) {
            this.radius = radius;
            this.coordX = coordX;
            this.coordY = coordY;
        }

        public Circle(int radius, int coordX, int coordY, String Color) {
            this.radius = radius;
            this.coordX = coordX;
            this.coordY = coordY;
            this.Color = Color;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getCoordX() {
            return coordX;
        }

        public void setCoordX(int coordX) {
            this.coordX = coordX;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }

        public int getCoordY() {
            return coordY;
        }

        public void setCoordY(int coordY) {
            this.coordY = coordY;
        }

        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    ", coordX=" + coordX +
                    ", coordY='" + coordY + '\'' +
                    ", Color='" + Color + '\'' +
                    '}';
        }
}
