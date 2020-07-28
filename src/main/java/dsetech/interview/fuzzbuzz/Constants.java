package dsetech.interview.fuzzbuzz;

public interface Constants {

    enum FIZZBUZZ {
        FIZZ("Fizz"),
        BUZZ("Buzz");

        private final String valueToCompare;

        FIZZBUZZ(final String valueToCompare) {
            this.valueToCompare = valueToCompare;
        }

        @Override
        public String toString() {
            return valueToCompare;
        }
    }
}