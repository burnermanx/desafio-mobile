package io.github.burnermanx.starwarsstore.model;

/**
 * Created by Burner on 29/05/2017.
 */

public class Purchase {
    private String cardNumber;
    private long value;
    private int cvv;
    private String cardHolderName;
    private String expDate;

    private Purchase(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.value = builder.value;
        this.cvv = builder.cvv;
        this.cardHolderName = builder.cardHolderName;
        this.expDate = builder.expDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public long getValue() {
        return value;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpDate() {
        return expDate;
    }

    public static class Builder {
        private String cardNumber;
        private long value;
        private int cvv;
        private String cardHolderName;
        private String expDate;

        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder value(long value) {
            this.value = value;
            return this;
        }

        public Builder cvv(int cvv) {
            this.cvv = cvv;
            return this;
        }

        public Builder cardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public Builder expDate(String expDate) {
            this.expDate = expDate;
            return this;
        }

        public Purchase build() {
            return new Purchase(this);
        }
    }
}
