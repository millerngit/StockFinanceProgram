/**
 *
 * @author noah.miller
 */
public class CallLocationOverload {
////////////////////////////////////////////////////////////////////////////////
//priceEarningsRatio1
////////////////////////////////////////////////////////////////////////////////

    public static float priceEarningsRatio1(float price, float eps) {
        float pE;
        pE = price / eps;

        return pE;
    }

    public static float priceEarningsRatio1(String sprice, String sEps) {
        // Define the programmer-defined local variables
        float pE;
        float price;
        float eps;
        price = Float.parseFloat(sprice);
        eps = Float.parseFloat(sEps);

        pE = price / eps;

        return pE;
    }
////////////////////////////////////////////////////////////////////////////////
//estimatedEarnings2 
////////////////////////////////////////////////////////////////////////////////

    public static float estimatedEarnings2(float projE, float projNPM) {

        float estEarn;

        estEarn = projE * projNPM;

        return estEarn;
    }

    public static float estimatedEarnings2(String sProjE, String sProjNPM) {

        float estEarn;
        float projE;
        float projNPM;

        projE = Float.parseFloat(sProjE);
        projNPM = Float.parseFloat(sProjNPM);
        estEarn = projE * projNPM;

        return estEarn;
    }
////////////////////////////////////////////////////////////////////////////////
//dividendsPerShare3
////////////////////////////////////////////////////////////////////////////////

    public static float dividendsPerShare3(float shares, float div) {
        float dps;
        dps = shares / div;
        return dps;
    }

    public static float dividendsPerShare3(String sShares, String sDiv) {

        float dps;
        float shares;
        float div;

        shares = Float.parseFloat(sShares);
        div = Float.parseFloat(sDiv);
        dps = shares / div;

        return dps;
    }
////////////////////////////////////////////////////////////////////////////////
// bookValueperShare4
////////////////////////////////////////////////////////////////////////////////

    public static float bookValueperShare4(float sEquity, float sharesOuts) {
        float bvps;
        bvps = sEquity / sharesOuts;
        return bvps;
    }

    public static float bookValueperShare4(String sSEquity, String sSharesOuts) {
        float bvps;
        float sharesOuts;
        float sEquity;
        sEquity = Float.parseFloat(sSEquity);
        sharesOuts = Float.parseFloat(sSharesOuts);
        bvps = sEquity / sharesOuts;

        return bvps;
    }
////////////////////////////////////////////////////////////////////////////////
//dividendPayoutRatio5
////////////////////////////////////////////////////////////////////////////////

    public static float dividendPayoutRatio5(float div, float nIncome) {
        float dpr;
        dpr = div / nIncome;
        return dpr;
    }

    public static float dividendPayoutRatio5(String sdiv, String snIncome) {
        float dpr;
        float div;
        float nIncome;
        div = Float.parseFloat(sdiv);
        nIncome = Float.parseFloat(snIncome);
        dpr = div / nIncome;

        return dpr;
    }
////////////////////////////////////////////////////////////////////////////////
//capitalGainsYield6
////////////////////////////////////////////////////////////////////////////////

    public static float capitalGainsYield6(float p0, float p1) {
        float cgy;
        cgy = (p1 - p0) / p0;
        return cgy;
    }

    public static float capitalGainsYield6(String sp0, String sp1) {
        float cgy;
        float p0;
        float p1;
        p0 = Float.parseFloat(sp0);
        p1 = Float.parseFloat(sp1);
        cgy = (p1 - p0) / p0;
        return cgy;
    }
////////////////////////////////////////////////////////////////////////////////
//netAssetValue7
////////////////////////////////////////////////////////////////////////////////

    public static float netAssetValue7(float fAssets, float fLiabilities, float shares) {
        float nav;
        nav = (fAssets - fLiabilities) / shares;
        return nav;
    }

    public static float netAssetValue7(String sfAssets, String sfLiabilities, String sShares) {
        float nav;
        float fAssets;
        float fLiabilities;
        float shares;
        fAssets = Float.parseFloat(sfAssets);
        fLiabilities = Float.parseFloat(sfLiabilities);
        shares = Float.parseFloat(sShares);
        nav = (fAssets - fLiabilities) / shares;
        return nav;

    }
////////////////////////////////////////////////////////////////////////////////
//pricetoSalesRatio8
////////////////////////////////////////////////////////////////////////////////

    public static float pricetoSalesRatio8(float price, float salesPS) {

        float psRatio;
        psRatio = price / salesPS;
        return psRatio;

    }

    public static float pricetoSalesRatio8(String sPrice, String sSalesPS) {

        float psRatio;
        float price;
        float salesPS;
        price = Float.parseFloat(sPrice);
        salesPS = Float.parseFloat(sSalesPS);
        psRatio = price / salesPS;
        return psRatio;

    }
////////////////////////////////////////////////////////////////////////////////
//riskPremium9
////////////////////////////////////////////////////////////////////////////////

    public static float riskPremium9(float assetReturn, float riskFree) {

        float riskP;
        riskP = assetReturn - riskFree;
        return riskP;

    }

    public static float riskPremium9(String sAssetReturn, String sRiskFree) {

        float riskP;
        float assetReturn;
        float riskFree;
        assetReturn = Float.parseFloat(sAssetReturn);
        riskFree = Float.parseFloat(sRiskFree);
        riskP = assetReturn - riskFree;
        return riskP;

    }
////////////////////////////////////////////////////////////////////////////////
//preferredStock10
////////////////////////////////////////////////////////////////////////////////

    public static float preferredStock10(float div, float discount) {

        float psv;
        psv = div / discount;
        return psv;

    }

    public static float preferredStock10(String sDiv, String sDiscount) {

        float psv;
        float div;
        float discount;
        discount = Float.parseFloat(sDiscount);
        div = Float.parseFloat(sDiv);
        psv = div / discount;
        return psv;

    }
////////////////////////////////////////////////////////////////////////////////
//totalStockReturn11
////////////////////////////////////////////////////////////////////////////////

    public static float totalStockReturn11(float p0, float p1, float div) {

        float tsr;
        tsr = (p1 - p0) + div / p0;
        return tsr;
    }

    public static float totalStockReturn11(String sp0, String sp1, String sDiv) {

        float tsr;
        float p0;
        float p1;
        float div;
        p0 = Float.parseFloat(sp0);
        p1 = Float.parseFloat(sp1);
        div = Float.parseFloat(sDiv);
        tsr = (p1 - p0) + div / p0;
        return tsr;
    }

}
////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
