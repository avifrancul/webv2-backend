package com.webv2.backend.webv2backend;

public class TravelClaims {

    long id;
    String claim_number;
    String insurer_name;

    public TravelClaims(long id, String claim_number, String insurer_name) {
        this.id = id;
        this.claim_number = claim_number;
        this.insurer_name = insurer_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClaim_number() {
        return claim_number;
    }

    public void setClaim_number(String claim_number) {
        this.claim_number = claim_number;
    }

    public String getInsurer_name() {
        return insurer_name;
    }

    public void setInsurer_name(String insurer_name) {
        this.insurer_name = insurer_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelClaims that = (TravelClaims) o;

        if (id != that.id) return false;
        if (claim_number != null ? !claim_number.equals(that.claim_number) : that.claim_number != null) return false;
        return insurer_name != null ? insurer_name.equals(that.insurer_name) : that.insurer_name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (claim_number != null ? claim_number.hashCode() : 0);
        result = 31 * result + (insurer_name != null ? insurer_name.hashCode() : 0);
        return result;
    }
}
