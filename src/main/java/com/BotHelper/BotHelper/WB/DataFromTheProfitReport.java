package com.BotHelper.BotHelper.WB;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class DataFromTheProfitReport {
    private long realizationreport_id;
    private String date_from;
    private String date_to;
    private String create_dt;
    private Object suppliercontract_code;
    private long rrd_id;
    private long gi_id;
    private String subject_name;

    private long nm_id;

    private String brand_name;
    private String sa_name;
    private String ts_name;
    private String barcode;
    private String doc_type_name;
    private long quantity;
    private Number retail_price;

    private Number retail_amount;

    private long sale_percent;
    private Number commission_percent;
    private String office_name;
    private String supplier_oper_name;
    private String order_dt;
    private String sale_dt;
    private String rr_dt;
    private long shk_id;
    public void setRetail_amount(Number retail_amount) {
        this.retail_amount = retail_amount;
    }

    private Number retail_price_withdisc_rub;
    private long delivery_amount;
    private long return_amount;
    private Number delivery_rub;
    private String gi_box_type_name;
    private Number product_discount_for_report;
    private Number supplier_promo;
    private long rid;
    private Number ppvz_spp_prc;
    private Number ppvz_kvw_prc_base;
    private Number ppvz_kvw_prc;
    private Number ppvz_sales_commission;
    private Number ppvz_for_pay;
    private Number ppvz_reward;
    private Number acquiring_fee;
    private String acquiring_bank;
    private Number ppvz_vw;
    private Number ppvz_vw_nds;
    private long ppvz_office_id;
    private String ppvz_office_name;
    private long ppvz_supplier_id;
    private String ppvz_supplier_name;
    private String ppvz_inn;
    private String declaration_number;
    private String bonus_type_name;
    private String sticker_id;
    private String site_country;
    private Number penalty;
    private Number additional_payment;
    private String kiz;
    private String srid;

//    @JsonCreator
//    public DataFromTheProfitReport(@JsonProperty("subject_name") String subject_name,
//                                   @JsonProperty("nm_id") long nm_id) {
//        this.subject_name = subject_name;
//        this.nm_id = nm_id;
//    }

    @JsonCreator
    public DataFromTheProfitReport(
            @JsonProperty("retail_amount") Number retail_amount,
            @JsonProperty("realizationreport_id") long realizationreport_id,
            @JsonProperty("date_from") String date_from,
            @JsonProperty("date_to") String date_to,
            @JsonProperty("create_dt") String create_dt,
            @JsonProperty("suppliercontract_code") Object suppliercontract_code,
            @JsonProperty("rrd_id") long rrd_id,
            @JsonProperty("gi_id") long gi_id,
            @JsonProperty("subject_name") String subject_name,
            @JsonProperty("nm_id") long nm_id,
            @JsonProperty("brand_name") String brand_name,
            @JsonProperty("sa_name") String sa_name,
            @JsonProperty("ts_name") String ts_name,
            @JsonProperty("barcode") String barcode,
            @JsonProperty("doc_type_name") String doc_type_name,
            @JsonProperty("quantity") long quantity,
            @JsonProperty("retail_price") Number retail_price,
            @JsonProperty("sale_percent") long sale_percent,
            @JsonProperty("commission_percent") Number commission_percent,
            @JsonProperty("office_name") String office_name,
            @JsonProperty("supplier_oper_name") String supplier_oper_name,
            @JsonProperty("order_dt") String order_dt,
            @JsonProperty("sale_dt") String sale_dt,
            @JsonProperty("rr_dt") String rr_dt,
            @JsonProperty("shk_id") long shk_id,
            @JsonProperty("retail_price_withdisc_rub") Number retail_price_withdisc_rub,
            @JsonProperty("delivery_amount") long delivery_amount,
            @JsonProperty("return_amount") long return_amount,
            @JsonProperty("delivery_rub") Number delivery_rub,
            @JsonProperty("gi_box_type_name") String gi_box_type_name,
            @JsonProperty("product_discount_for_report") Number product_discount_for_report,
            @JsonProperty("supplier_promo") Number supplier_promo,
            @JsonProperty("rid") long rid,
            @JsonProperty("ppvz_spp_prc") long ppvz_spp_prc,
            @JsonProperty("ppvz_kvw_prc_base") Number ppvz_kvw_prc_base,
            @JsonProperty("ppvz_kvw_prc") Number ppvz_kvw_prc,
            @JsonProperty("ppvz_sales_commission") Number ppvz_sales_commission,
            @JsonProperty("ppvz_for_pay") Number ppvz_for_pay,
            @JsonProperty("ppvz_reward") Number ppvz_reward,
            @JsonProperty("acquiring_fee") Number acquiring_fee,
            @JsonProperty("acquiring_bank") String acquiring_bank,
            @JsonProperty("ppvz_vw") Number ppvz_vw,
            @JsonProperty("ppvz_vw_nds") Number ppvz_vw_nds,
            @JsonProperty("ppvz_office_id") long ppvz_office_id,
            @JsonProperty("ppvz_office_name") String ppvz_office_name,
            @JsonProperty("ppvz_supplier_id") long ppvz_supplier_id,
            @JsonProperty("ppvz_supplier_name") String ppvz_supplier_name,
            @JsonProperty("ppvz_inn") String ppvz_inn,
            @JsonProperty("declaration_number") String declaration_number,
            @JsonProperty("bonus_type_name") String bonus_type_name,
            @JsonProperty("sticker_id") String sticker_id,
            @JsonProperty("site_country") String site_country,
            @JsonProperty("penalty") Number penalty,
            @JsonProperty("additional_payment") Number additional_payment,
            @JsonProperty("kiz") String kiz,
            @JsonProperty("srid") String srid) {
        this.retail_amount = retail_amount;
        this.realizationreport_id = realizationreport_id;
        this.date_from = date_from;
        this.date_to = date_to;
        this.create_dt = create_dt;
        this.suppliercontract_code = suppliercontract_code;
        this.rrd_id = rrd_id;
        this.gi_id = gi_id;
        this.subject_name = subject_name;
        this.nm_id = nm_id;
        this.brand_name = brand_name;
        this.sa_name = sa_name;
        this.ts_name = ts_name;
        this.barcode = barcode;
        this.doc_type_name = doc_type_name;
        this.quantity = quantity;
        this.retail_price = retail_price;
        this.sale_percent = sale_percent;
        this.commission_percent = commission_percent;
        this.office_name = office_name;
        this.supplier_oper_name = supplier_oper_name;
        this.order_dt = order_dt;
        this.sale_dt = sale_dt;
        this.rr_dt = rr_dt;
        this.shk_id = shk_id;
        this.retail_price_withdisc_rub = retail_price_withdisc_rub;
        this.delivery_amount = delivery_amount;
        this.return_amount = return_amount;
        this.delivery_rub = delivery_rub;
        this.gi_box_type_name = gi_box_type_name;
        this.product_discount_for_report = product_discount_for_report;
        this.supplier_promo = supplier_promo;
        this.rid = rid;
        this.ppvz_spp_prc = ppvz_spp_prc;
        this.ppvz_kvw_prc_base = ppvz_kvw_prc_base;
        this.ppvz_kvw_prc = ppvz_kvw_prc;
        this.ppvz_sales_commission = ppvz_sales_commission;
        this.ppvz_for_pay = ppvz_for_pay;
        this.ppvz_reward = ppvz_reward;
        this.acquiring_fee = acquiring_fee;
        this.acquiring_bank = acquiring_bank;
        this.ppvz_vw = ppvz_vw;
        this.ppvz_vw_nds = ppvz_vw_nds;
        this.ppvz_office_id = ppvz_office_id;
        this.ppvz_office_name = ppvz_office_name;
        this.ppvz_supplier_id = ppvz_supplier_id;
        this.ppvz_supplier_name = ppvz_supplier_name;
        this.ppvz_inn = ppvz_inn;
        this.declaration_number = declaration_number;
        this.bonus_type_name = bonus_type_name;
        this.sticker_id = sticker_id;
        this.site_country = site_country;
        this.penalty = penalty;
        this.additional_payment = additional_payment;
        this.kiz = kiz;
        this.srid = srid;
    }

    public long getRealizationreport_id() {
        return realizationreport_id;
    }

    public void setRealizationreport_id(long realizationreport_id) {
        this.realizationreport_id = realizationreport_id;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public String getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(String create_dt) {
        this.create_dt = create_dt;
    }

    public Object getSuppliercontract_code() {
        return suppliercontract_code;
    }

    public void setSuppliercontract_code(Object suppliercontract_code) {
        this.suppliercontract_code = suppliercontract_code;
    }

    public long getRrd_id() {
        return rrd_id;
    }

    public void setRrd_id(long rrd_id) {
        this.rrd_id = rrd_id;
    }

    public long getGi_id() {
        return gi_id;
    }

    public void setGi_id(long gi_id) {
        this.gi_id = gi_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public Number getRetail_amount() {
        return retail_amount;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public long getNm_id() {
        return nm_id;
    }

    public void setNm_id(long nm_id) {
        this.nm_id = nm_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getSa_name() {
        return sa_name;
    }

    public void setSa_name(String sa_name) {
        this.sa_name = sa_name;
    }

    public String getTs_name() {
        return ts_name;
    }

    public void setTs_name(String ts_name) {
        this.ts_name = ts_name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getDoc_type_name() {
        return doc_type_name;
    }

    public void setDoc_type_name(String doc_type_name) {
        this.doc_type_name = doc_type_name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Number getRetail_price() {
        return retail_price;
    }

    public void setRetail_price(Number retail_price) {
        this.retail_price = retail_price;
    }

    public long getSale_percent() {
        return sale_percent;
    }

    public void setSale_percent(long sale_percent) {
        this.sale_percent = sale_percent;
    }

    public Number getCommission_percent() {
        return commission_percent;
    }

    public void setCommission_percent(Number commission_percent) {
        this.commission_percent = commission_percent;
    }

    public String getOffice_name() {
        return office_name;
    }

    public void setOffice_name(String office_name) {
        this.office_name = office_name;
    }

    public String getSupplier_oper_name() {
        return supplier_oper_name;
    }

    public void setSupplier_oper_name(String supplier_oper_name) {
        this.supplier_oper_name = supplier_oper_name;
    }

    public String getOrder_dt() {
        return order_dt;
    }

    public void setOrder_dt(String order_dt) {
        this.order_dt = order_dt;
    }

    public String getSale_dt() {
        return sale_dt;
    }

    public void setSale_dt(String sale_dt) {
        this.sale_dt = sale_dt;
    }

    public String getRr_dt() {
        return rr_dt;
    }

    public void setRr_dt(String rr_dt) {
        this.rr_dt = rr_dt;
    }

    public long getShk_id() {
        return shk_id;
    }

    public void setShk_id(long shk_id) {
        this.shk_id = shk_id;
    }

    public Number getRetail_price_withdisc_rub() {
        return retail_price_withdisc_rub;
    }

    public void setRetail_price_withdisc_rub(Number retail_price_withdisc_rub) {
        this.retail_price_withdisc_rub = retail_price_withdisc_rub;
    }

    public long getDelivery_amount() {
        return delivery_amount;
    }

    public void setDelivery_amount(long delivery_amount) {
        this.delivery_amount = delivery_amount;
    }

    public long getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(long return_amount) {
        this.return_amount = return_amount;
    }

    public Number getDelivery_rub() {
        return delivery_rub;
    }

    public void setDelivery_rub(Number delivery_rub) {
        this.delivery_rub = delivery_rub;
    }

    public String getGi_box_type_name() {
        return gi_box_type_name;
    }

    public void setGi_box_type_name(String gi_box_type_name) {
        this.gi_box_type_name = gi_box_type_name;
    }

    public Number getProduct_discount_for_report() {
        return product_discount_for_report;
    }

    public void setProduct_discount_for_report(Number product_discount_for_report) {
        this.product_discount_for_report = product_discount_for_report;
    }

    public Number getSupplier_promo() {
        return supplier_promo;
    }

    public void setSupplier_promo(Number supplier_promo) {
        this.supplier_promo = supplier_promo;
    }

    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public Number getPpvz_spp_prc() {
        return ppvz_spp_prc;
    }

    public void setPpvz_spp_prc(Number ppvz_spp_prc) {
        this.ppvz_spp_prc = ppvz_spp_prc;
    }

    public Number getPpvz_kvw_prc_base() {
        return ppvz_kvw_prc_base;
    }

    public void setPpvz_kvw_prc_base(Number ppvz_kvw_prc_base) {
        this.ppvz_kvw_prc_base = ppvz_kvw_prc_base;
    }

    public Number getPpvz_kvw_prc() {
        return ppvz_kvw_prc;
    }

    public void setPpvz_kvw_prc(Number ppvz_kvw_prc) {
        this.ppvz_kvw_prc = ppvz_kvw_prc;
    }

    public Number getPpvz_sales_commission() {
        return ppvz_sales_commission;
    }

    public void setPpvz_sales_commission(Number ppvz_sales_commission) {
        this.ppvz_sales_commission = ppvz_sales_commission;
    }

    public Number getPpvz_for_pay() {
        return ppvz_for_pay;
    }

    public void setPpvz_for_pay(Number ppvz_for_pay) {
        this.ppvz_for_pay = ppvz_for_pay;
    }

    public Number getPpvz_reward() {
        return ppvz_reward;
    }

    public void setPpvz_reward(Number ppvz_reward) {
        this.ppvz_reward = ppvz_reward;
    }

    public Number getAcquiring_fee() {
        return acquiring_fee;
    }

    public void setAcquiring_fee(Number acquiring_fee) {
        this.acquiring_fee = acquiring_fee;
    }

    public String getAcquiring_bank() {
        return acquiring_bank;
    }

    public void setAcquiring_bank(String acquiring_bank) {
        this.acquiring_bank = acquiring_bank;
    }

    public Number getPpvz_vw() {
        return ppvz_vw;
    }

    public void setPpvz_vw(Number ppvz_vw) {
        this.ppvz_vw = ppvz_vw;
    }

    public Number getPpvz_vw_nds() {
        return ppvz_vw_nds;
    }

    public void setPpvz_vw_nds(Number ppvz_vw_nds) {
        this.ppvz_vw_nds = ppvz_vw_nds;
    }

    public long getPpvz_office_id() {
        return ppvz_office_id;
    }

    public void setPpvz_office_id(long ppvz_office_id) {
        this.ppvz_office_id = ppvz_office_id;
    }


    public String getPpvz_office_name() {
        return ppvz_office_name;
    }

    public void setPpvz_office_name(String ppvz_office_name) {
        this.ppvz_office_name = ppvz_office_name;
    }

    public long getPpvz_supplier_id() {
        return ppvz_supplier_id;
    }

    public void setPpvz_supplier_id(long ppvz_supplier_id) {
        this.ppvz_supplier_id = ppvz_supplier_id;
    }

    public String getPpvz_supplier_name() {
        return ppvz_supplier_name;
    }

    public void setPpvz_supplier_name(String ppvz_supplier_name) {
        this.ppvz_supplier_name = ppvz_supplier_name;
    }

    public String getPpvz_inn() {
        return ppvz_inn;
    }

    public void setPpvz_inn(String ppvz_inn) {
        this.ppvz_inn = ppvz_inn;
    }

    public String getDeclaration_number() {
        return declaration_number;
    }

    public void setDeclaration_number(String declaration_number) {
        this.declaration_number = declaration_number;
    }

    public String getBonus_type_name() {
        return bonus_type_name;
    }

    public void setBonus_type_name(String bonus_type_name) {
        this.bonus_type_name = bonus_type_name;
    }

    public String getSticker_id() {
        return sticker_id;
    }

    public void setSticker_id(String sticker_id) {
        this.sticker_id = sticker_id;
    }

    public String getSite_country() {
        return site_country;
    }

    public void setSite_country(String site_country) {
        this.site_country = site_country;
    }

    public Number getPenalty() {
        return penalty;
    }

    public void setPenalty(Number penalty) {
        this.penalty = penalty;
    }

    public Number getAdditional_payment() {
        return additional_payment;
    }

    public void setAdditional_payment(Number additional_payment) {
        this.additional_payment = additional_payment;
    }

    public String getKiz() {
        return kiz;
    }

    public void setKiz(String kiz) {
        this.kiz = kiz;
    }

    public String getSrid() {
        return srid;
    }

    public void setSrid(String srid) {
        this.srid = srid;
    }
}

