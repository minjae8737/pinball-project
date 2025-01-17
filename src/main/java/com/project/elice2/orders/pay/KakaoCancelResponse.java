package com.project.elice2.orders.pay;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class KakaoCancelResponse {
    private String aid;
    private String tid;
    private String cid;
    private String status;
    private String partner_order_id;
    private String partner_user_id;
    private String payment_method_type;
    private Amount amount;
    private ApprovedCancelAmount approved_cancel_amount;
    private CanceledAmount canceled_amount;
    private CancelAvailableAmount cancel_available_amount;
    private String item_name;
    private String item_code;
    private int quantity;
    private String created_at;
    private String approved_at;
    private String canceled_at;
    private String payload;

    @Getter
    @Setter
    @ToString
    public static class ApprovedCancelAmount{
        private int total;
        private int tax_free;
        private int vat;
        private int point;
        private int discount;
        private int green_deposit;
    }

    @Getter
    @Setter
    @ToString
    public static class CanceledAmount{
        private int total;
        private int tax_free;
        private int vat;
        private int discount;
        private int green_deposit;
    }

    @Getter
    @Setter
    @ToString
    public static class CancelAvailableAmount{
        private int total;
        private int tax_free;
        private int vat;
        private int point;
        private int discount;
        private int green_deposit;
    }
}
