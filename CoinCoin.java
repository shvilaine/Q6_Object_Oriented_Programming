public class CoinCoin {
        private String name;
        private int age;
        private boolean swimming;

        public CoinCoin(String name) {
            this.name = name;
            this.age = 0;
            this.swimming = false;
        }

        public CoinCoin(String name, int age) {
            this.name = name;
            this.age = age;
            this.swimming = false;
        }

        public static String quack() {
            return "Quack!";
        }

        public String nameAndAge() {
            return "My name is " + this.getName() + " and I'm " + String.valueOf(this.getAge());
        }

        // getters
        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public boolean isSwimming() {
            return this.swimming;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSwimming(boolean swimming) {
            this.swimming = swimming;
        }
    }
