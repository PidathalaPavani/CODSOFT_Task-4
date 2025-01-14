import java.util.Map;
import java.util.Scanner;
//import java.util.spi.CurrencyNameProvider;
import java.util.HashMap;

  public class currencyconvertorMain {
   
   private Map<String,Double> exchangeRates;
   
   public currencyconvertorMain() {
    
      exchangeRates= new HashMap<>();

      exchangeRates.put("USD",1.0);
      exchangeRates.put("EUR",0.86);
      exchangeRates.put("GBP",0.74);
      exchangeRates.put("JPY",109.78);
      exchangeRates.put("CAD",1.26);
      exchangeRates.put("AUD",1.35);
      exchangeRates.put("INR",73.92);
      exchangeRates.put("CNY",6.44);
   }
   
   public double convertCurrency(double amount,String fromCurrency,String toCurrency)
   {
    
     if(exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency))
     {
 
         double fromRate=exchangeRates.get(fromCurrency);

         double toRate=exchangeRates.get(toCurrency);

         return amount*(toRate/fromRate);
      }
     
      else
      {
       
         System.out.println("Invalid currency codes.");
         return -1.0;
       }
    }
  
   public static void main(String[] args)
   {
     currencyconvertorMain convertor=new currencyconvertorMain();
     Scanner sc=new Scanner(System.in);

     System.out.println("Currency Convertor");
     System.out.println("Enter the amount");
     double amount =sc.nextDouble();

     System.out.println("Enter the source currency code(e.g. USD,CAD):");
     String fromCurrency= sc.next().toUpperCase();
    
     System.out.println("Enter the target currency code (e.g. EUR,AUD):");
     String toCurrency=sc.next().toUpperCase();

     double convertedAmount= convertor.convertCurrency(amount,fromCurrency,toCurrency);

     if(convertedAmount!= -1.0)
    {
         System.out.println(amount +" "+ fromCurrency + " is equal to " + convertedAmount +" "+ toCurrency);
     }
     }
  }    