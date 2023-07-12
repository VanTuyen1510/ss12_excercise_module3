package Phone.models;

public abstract class Phone {
    private String id;
    private String name;
    private String price;
    private String amount;
    private String producer;

    public Phone() {
    }

    public Phone(String id, String name, String price, String amount, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    public static class Handed extends Phone {
        private String warrantyPeriod;
        private String warrantyCoverage;

        public Handed() {
        }

        public Handed(String warrantyPeriod, String warrantyCoverage) {
            this.warrantyPeriod = warrantyPeriod;
            this.warrantyCoverage = warrantyCoverage;
        }

        public Handed(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
            super(id, name, price, amount, producer);
            this.warrantyPeriod = warrantyPeriod;
            this.warrantyCoverage = warrantyCoverage;
        }

        public String getWarrantyPeriod() {
            return warrantyPeriod;
        }

        public void setWarrantyPeriod(String warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        public String getWarrantyCoverage() {
            return warrantyCoverage;
        }

        public void setWarrantyCoverage(String warrantyCoverage) {
            this.warrantyCoverage = warrantyCoverage;
        }

        @Override
        public String toString() {
            return "Handed{" +
                    super.toString() +
                    "warrantyPeriod='" + warrantyPeriod + '\'' +
                    ", warrantyCoverage='" + warrantyCoverage + '\'' +
                    '}';
        }
    }
}
