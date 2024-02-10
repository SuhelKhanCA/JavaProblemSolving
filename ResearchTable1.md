# Paired T-test With Python

## When you want to check how different samples from the same group are, you can go for a paired T-test

### Checking the Difference between Price/Earnings(P/E) vs Industry average of stock price
       =>>Null-Hypothesis: There is no difference 
       =>>Alternate Hypothesis: There is a difference


```python
import scipy.stats as stats
import seaborn as sns
import pandas as pd
import numpy as np
```


```python
price_earning=[815, 29, 831, 312, 508, 90, 35] # 815x...
industry_avg=[24, 24, 20, 24, 12, 30, 2] # 24x
```


```python
print(price_earning)
print(industry_avg)
```

    [815, 29, 831, 312, 508, 90, 35]
    [24, 24, 20, 24, 12, 30, 2]
    


```python
Stock_df=pd.DataFrame({"Price/Earnings":np.array(price_earning),
                         "Industry Avg.":np.array(industry_avg),
                       "st_change":np.array(industry_avg)-np.array(price_earning)})
```


```python
Stock_df
```




<div>
<style scoped>
    .dataframe tbody tr th:only-of-type {
        vertical-align: middle;
    }

    .dataframe tbody tr th {
        vertical-align: top;
    }

    .dataframe thead th {
        text-align: right;
    }
</style>
<table border="1" class="dataframe">
  <thead>
    <tr style="text-align: right;">
      <th></th>
      <th>Price/Earnings</th>
      <th>Industry Avg.</th>
      <th>st_change</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th>0</th>
      <td>815</td>
      <td>24</td>
      <td>-791</td>
    </tr>
    <tr>
      <th>1</th>
      <td>29</td>
      <td>24</td>
      <td>-5</td>
    </tr>
    <tr>
      <th>2</th>
      <td>831</td>
      <td>20</td>
      <td>-811</td>
    </tr>
    <tr>
      <th>3</th>
      <td>312</td>
      <td>24</td>
      <td>-288</td>
    </tr>
    <tr>
      <th>4</th>
      <td>508</td>
      <td>12</td>
      <td>-496</td>
    </tr>
    <tr>
      <th>5</th>
      <td>90</td>
      <td>30</td>
      <td>-60</td>
    </tr>
    <tr>
      <th>6</th>
      <td>35</td>
      <td>2</td>
      <td>-33</td>
    </tr>
  </tbody>
</table>
</div>




```python
_,p_value=stats.ttest_rel(a=price_earning,b=industry_avg)
```


```python
print(p_value)
```

    0.03647029583343439
    


```python
if p_value < 0.05:    # alpha value is 0.05 or 5%
    print(" we are rejecting null hypothesis")
else:
    print("we are accepting null hypothesis")
```

     we are rejecting null hypothesis
    
