package Phone.models;

public class Genuine extends  Phone{
    private String warrantyPeriod; // thời gian bảo hành
    private String warrantyCoverage; // phạm vi bảo hành

    public Genuine() {
    }

    public Genuine(String warrantyPeriod, String warrantyCoverage) {
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public Genuine(String id, String name, String price, String amount, String producer, String warrantyPeriod, String warrantyCoverage) {
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
        return "Genuine{" +
                super.toString() +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
