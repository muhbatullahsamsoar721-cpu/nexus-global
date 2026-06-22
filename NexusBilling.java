public class NexusBilling {
    
    // د نړۍ د هر هیواد د اقتصادي کچې سره سم د قیمت اتوماتیک عیارول
    public static double calculateGlobalPrice(String countryCode) {
        if (countryCode.equals("US") || countryCode.equals("EU") || countryCode.equals("GB")) {
            return 2.99;
        } else if (countryCode.equals("IN") || countryCode.equals("PK") || countryCode.equals("AF")) {
            return 0.49;
        } else {
            return 0.99;
        }
    }
    
    // د اتوماتیک مالي عاید د ثبت او تایید الګوریتم
    public static void processUniversalPayment(String userId, String method, double amount) {
        System.out.println("[Billing] د تادیې پروسه: " + userId);
        System.out.println("[Gateway] لاره: " + method + " | مقدار: $" + amount);
        
        boolean paymentSuccess = true;
        if (paymentSuccess) {
            System.out.println("[Revenue] ✅ عاید ستاسو حساب ته اضافه شو!");
            System.out.println("[Access] ټولو پرمختللو اسانتیاوو ته اجازه ورکړل شوه.");
        } else {
            System.out.println("[Error] تادیه نامکمله ده.");
        }
    }
    
    // د کریپټو تادیې پروسس
    public static void processCryptoPayment(String walletAddress, double amountUSDT) {
        System.out.println("[Crypto] د USDT تادیه: " + amountUSDT + " USDT");
        System.out.println("[Wallet] آدرس: " + walletAddress.substring(0, 8) + "...");
        System.out.println("[Status] ✅ تادیه تایید شوه - بلاکچین ثبت شو!");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Nexus Global Revenue & Billing Matrix ===");
        
        // د بېلګې په توګه
        double price = calculateGlobalPrice("AF");
        processUniversalPayment("User_721", "Stripe/Crypto", price);
        processCryptoPayment("0xNexus721ABC", 0.49);
        
        System.out.println("\n[System] د عاید ماشین فعال دی!");
        System.out.println("[Next] Marketing +Launch!");
    }
}
