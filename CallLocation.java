/**
 *
 * @author noah.miller
 */
public class CallLocation {


    public static float priceEarningsRatio1(float price, float eps) {
        float pE;
        pE = price / eps;

        return pE;
    }

    public static float estimatedEarnings2(float projE, float projNPM) {

        float estEarn;

        estEarn = projE * projNPM;

        return estEarn;
    }

    public static float dividendsPerShare3(float shares, float div) {
        float dps;
        dps = shares / div;
        return dps;
    }

    public static float bookValueperShare4(float sEquity, float sharesOuts) {
        float bvps;
        bvps = sEquity / sharesOuts;
        return bvps;
    }

    public static float dividendPayoutRatio5(float div, float nIncome) {
        float dpr;
        dpr = div / nIncome;
        return dpr;
    }

    public static float capitalGainsYield6(float p0, float p1) {
        float cgy;
        cgy = (p1 - p0) / p0;
        return cgy;
    }

    public static float netAssetValue7(float fAssets, float fLiabilities, float shares) {
        float nav;
        nav = (fAssets - fLiabilities) / shares;
        return nav;
    }

    public static float pricetoSalesRatio8(float price, float salesPS) {

        float psRatio;
        psRatio = price / salesPS;
        return psRatio;

    }

    public static float riskPremium9(float assetReturn, float riskFree) {

        float riskP;
        riskP = assetReturn - riskFree;
        return riskP;

    }

    public static float preferredStock10(float div, float discount) {

        float psv;
        psv = div / discount;
        return psv;

    }

    public static float totalStockReturn11(float p0, float p1, float div) {

        float tsr;
        tsr = (p1 - p0) + div / p0;
        return tsr;
    }

    
}
