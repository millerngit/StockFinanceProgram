import java.util.Scanner;
import javax.swing.JOptionPane;

//noah miller
public class MillerFinanceStock4 {

    public static void main(String[] args) {
        //Define the programmer-defined variables

        float price;
        float eps;
        float pE;
        float projE;
        float projNPM;
        float estEarn;
        float dps;
        float div;
        float shares;
        float bvps;
        float sEquity;
        float sharesOuts;
        float nIncome;
        float dpr;
        float cgy;
        float p0;
        float p1;
        float nav;
        float fAssets;
        float fLiabilities;
        float psRatio;
        float salesPS;
        float riskP;
        float assetReturn;
        float riskFree;
        float psv;
        float discount;
        float tsr;
        int optionVar;
        int countNumber = 0;

        // Prompt the user to select an option
        String optResponse = JOptionPane.showInputDialog(null, "\nType an option to perform the operation\n"
                + "   Option 1:  Calculate Price Earnings Ratio (given the price per share and earnings per\n"
                + "   Option 2:  Calculate Estimated Earnings (given the forecasted sales and forecasted \n"
                + "		expenses)\n"
                + "   Option 3:  Calculate Dividends per Share (given the dividends and number of \n"
                + "		shares)\n"
                + "   Option 4:  Calculate Book Value per Share (given the total common stockholderâ€™s \n"
                + "		equity and number of common shares)\n"
                + "   Option 5:  Calculate Dividend Payout Ratio (given the dividends and the net income)\n"
                + "   Option 6: Calculate Capital Gains Yield (given the initial stock price and the stock \n"
                + "		price after the first period)\n"
                + "   Option 7:  Calculate Net Asset Value (given the fund assets, fund liabilities, and \n"
                + "		outstanding shares)\n"
                + "   Option 8:  Calculate Price to Sales Ratio (given the share price and the sales per \n"
                + "		share)\n"
                + "   Option 9:  Calculate the Risk Premium (given the investment return and risk free\n"
                + "   Option 10:  Calculate Preferred Stock(given the dividend and discount rate)  \n"
                + "   Option 11:  Calculate Total Stock Return (given the initial stock price, ending stock\n"
                + "price, as well as the dividends) \n"
                + "   Option 12: End the Program\n"
                +"\n Times Used This Session: "
                + countNumber);

        optionVar = Integer.parseInt(optResponse);
        while (optionVar != 12) {
            switch (optionVar) {

                case 1:
                    String responsePrice = JOptionPane.showInputDialog(null, "\nPlease enter the market Price:");
                    price = Float.parseFloat(responsePrice);
                    String responseEps = JOptionPane.showInputDialog(null, "\nPlease enter the earnings per share:");
                    eps = Float.parseFloat(responseEps);
                    pE = CallLocation.priceEarningsRatio1(price, eps);
                    JOptionPane.showMessageDialog(null, "\nThe P/E ratio is" + pE);
                    countNumber++;
                    break;
                    
                //Option 1:	Calculate Price Earnings Ratio (given the price per share and earnings per
                //Share)

                case 2:
                    String responseprojE = JOptionPane.showInputDialog(null, "\nPlease enter Projected earnings: ");
                    projE = Float.parseFloat(responseprojE);
                    String responseprojNPM = JOptionPane.showInputDialog(null, "\nPlease enter projected net profit margin: ");
                    projNPM = Float.parseFloat(responseprojNPM);
                    estEarn = CallLocation.estimatedEarnings2(projE, projNPM);
                    JOptionPane.showMessageDialog(null, "\nEstimated Earnings " + estEarn);
                    countNumber++;
                    break;
                //Option 2:	Calculate Estimated Earnings (given the forecasted sales and forecasted 
                //expenses)proj sales proje net profit margin

                case 3:
                    String responseshares = JOptionPane.showInputDialog(null, "\nPlease enter number of shares: ");
                    shares = Float.parseFloat(responseshares);
                    String responsediv = JOptionPane.showInputDialog(null, "\nPlease enter dividend: ");
                    div = Float.parseFloat(responsediv);
                    dps = CallLocation.dividendsPerShare3(shares, div);
                    JOptionPane.showMessageDialog(null, "\nDividends per Share " + dps);
                    countNumber++;
                    break;
                //Option 3	Calculate Dividends per Share (given the dividends and number of 
                //shares)

                case 4:
                    String responsesEquity = JOptionPane.showInputDialog(null, "\nPlease enter the first test score: ");
                    sEquity = Float.parseFloat(responsesEquity);
                    String responsesharesOuts = JOptionPane.showInputDialog(null, "\nPlease enter the second test score: ");
                    sharesOuts = Float.parseFloat(responsesharesOuts);
                    bvps = CallLocation.bookValueperShare4(sEquity, sharesOuts);
                    JOptionPane.showMessageDialog(null, "\nBook Value per Share "
                            + bvps);
                    countNumber++;
                    break;
                //Option 4:	Calculate Book Value per Share (given the total common stockholderâ€™s 
                // equity and number of common shares)

                case 5:
                    String responsedivpayout = JOptionPane.showInputDialog(null, "\nPlease enter the dividend: ");
                    div = Float.parseFloat(responsedivpayout);
                    String responsenIncome = JOptionPane.showInputDialog(null, "\nPlease enter the net income: ");
                    nIncome = Float.parseFloat(responsenIncome);
                    dpr = CallLocation.dividendPayoutRatio5(div, nIncome);
                    JOptionPane.showMessageDialog(null, "\nDividend Payout Ratio "
                            + dpr);
                    countNumber++;
                    break;
                //Option 5:	Calculate Dividend Payout Ratio (given the dividends and the net income)
                case 6:
                    String responsep0 = JOptionPane.showInputDialog(null, "\nPlease enter initial stock price:  ");
                    p0 = Float.parseFloat(responsep0);
                    String responsep1 = JOptionPane.showInputDialog(null, "\nPlease enter stock price after 1st period: ");
                    p1 = Float.parseFloat(responsep1);
                    cgy = CallLocation.capitalGainsYield6(p0, p1);

                    JOptionPane.showMessageDialog(null, "\nCapital Gains Yield "
                            + cgy);
                    countNumber++;
                    break;
                //Option 6:	Calculate Capital Gains Yield (given the initial stock price and the stock 
                //price after the first period)
                case 7:
                    String responsefAssets = JOptionPane.showInputDialog(null, "\nPlease enter assets:  ");
                    fAssets = Float.parseFloat(responsefAssets);
                    String responsefLiabilities = JOptionPane.showInputDialog(null, "\nPlease enter liabilities : ");
                    fLiabilities = Float.parseFloat(responsefLiabilities);
                    String responsesharesNav = JOptionPane.showInputDialog(null, "\nPlease enter shares :  ");
                    shares = Float.parseFloat(responsesharesNav);

                    nav = CallLocation.netAssetValue7(fAssets, fLiabilities, shares);

                    JOptionPane.showMessageDialog(null, "\nNet Asset Value " + nav);
                    countNumber++;
                    break;
                //Option 7:	Calculate Net Asset Value (given the fund assets, fund liabilities, and 
                //outstanding shares)

                case 8:
                    String responsepricePS = JOptionPane.showInputDialog(null, "\nPlease enter the shares price: ");
                    price = Float.parseFloat(responsepricePS);
                    String responsesalesPS = JOptionPane.showInputDialog(null, "\nPlease enter sales per share: ");
                    salesPS = Float.parseFloat(responsesalesPS);
                    ;

                    psRatio = CallLocation.pricetoSalesRatio8(price, salesPS);

                    JOptionPane.showMessageDialog(null, "\nPrice to Sales Ratio "
                            + psRatio);
                    countNumber++;

                    break;
                //Option 8:	Calculate Price to Sales Ratio (given the share price and the sales per 
                //share)

                case 9:
                    String responseassetReturn = JOptionPane.showInputDialog(null, "\nPlease enter asset return: ");
                    assetReturn = Float.parseFloat(responseassetReturn);
                    String responseriskFree = JOptionPane.showInputDialog(null, "\nPlease enter asset return: ");
                    riskFree = Float.parseFloat(responseriskFree);

                    riskP = CallLocation.riskPremium9(assetReturn, riskFree);

                    JOptionPane.showMessageDialog(null, "\nRisk Premium "
                            + riskP);
                    countNumber++;
                    break;
                //Option 9:	Calculate the Risk Premium (given the investment return and risk free
                //return)
                case 10:
                    String responsedivpsv = JOptionPane.showInputDialog(null, "\nPlease enter dividend: ");
                    div = Float.parseFloat(responsedivpsv);
                    String responsediscount = JOptionPane.showInputDialog(null, "\nPlease enter discount: ");
                    discount = Float.parseFloat(responsediscount);

                    psv = CallLocation.preferredStock10(div, discount);

                    JOptionPane.showMessageDialog(null, "\nPreferred Stock  "
                            + psv);
                    countNumber++;
                    break;
                //Option 10:	Calculate Preferred Stock (given the dividend and discount rate)
                case 11:
                    String responsep0tsr = JOptionPane.showInputDialog(null, "\nPlease enter intitial stock price: ");
                    p0 = Float.parseFloat(responsep0tsr);
                    String responsep1tsr = JOptionPane.showInputDialog(null, "\nPlease enter ending price: ");
                    p1 = Float.parseFloat(responsep1tsr);
                    String responsedivtsr = JOptionPane.showInputDialog(null, "\nPlease enter the dividend");
                    div = Float.parseFloat(responsedivtsr);

                    tsr = CallLocation.totalStockReturn11(p0,p1,div);

                    JOptionPane.showMessageDialog(null, "\n total stock return "
                            + tsr);
                    countNumber++;
                    break;
                //Option 11:	Calculate Total Stock Return (given the initial stock price, ending stock
                //price, as well as the dividends)

                case 12:

                    break;
                //Option 12:	End the Program
                default:
                    System.out.println("Enter a number from 1 to 12 only ");

            } // End of the switch statement

            optResponse = JOptionPane.showInputDialog(null, "\nType an option to perform the operation\n"
                    + "   Option 1:  Calculate Price Earnings Ratio (given the price per share and earnings per\n"
                    + "   Option 2:  Calculate Estimated Earnings (given the forecasted sales and forecasted \n"
                    + "		expenses)\n"
                    + "   Option 3:  Calculate Dividends per Share (given the dividends and number of \n"
                    + "		shares)\n"
                    + "   Option 4:  Calculate Book Value per Share (given the total common stockholderâ€™s \n"
                    + "		equity and number of common shares)\n"
                    + "   Option 5:  Calculate Dividend Payout Ratio (given the dividends and the net income)\n"
                    + "   Option 6: Calculate Capital Gains Yield (given the initial stock price and the stock \n"
                    + "		price after the first period)\n"
                    + "   Option 7:  Calculate Net Asset Value (given the fund assets, fund liabilities, and \n"
                    + "		outstanding shares)\n"
                    + "   Option 8:  Calculate Price to Sales Ratio (given the share price and the sales per \n"
                    + "		share)\n"
                    + "   Option 9:  Calculate the Risk Premium (given the investment return and risk free\n"
                    + "   Option 10:  Calculate Preferred Stock(given the dividend and discount rate)  \n"
                    + "   Option 11:  Calculate Total Stock Return (given the initial stock price, ending stock\n"
                    + "price, as well as the dividends) \n"
                    + "   Option 12: End the Program\n"
                    +"\n Times Used This Session: "
                    + countNumber);

            optionVar = Integer.parseInt(optResponse);
            

        } // End of the while statement
    }

    
}
