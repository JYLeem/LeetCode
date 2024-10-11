int maxProfit(int* prices, int pricesSize) {
    int ans = 0;
    int temp = prices[0];

    for (int i = 0; i < pricesSize; i++){
        temp = prices[i] > temp ? temp : prices[i];
        if (temp < prices[i]){
            ans = ans > prices[i] - temp ? ans : prices[i] - temp;
        }
    }
    
    return ans;
}