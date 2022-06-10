## Module 1 Review

You're developing an application for the Java Blue Store!

### Application requirements

1. Our store sells books, clothing, food, and pets.
   - Each item has/is:
        name
        price
        sku
        description
        taxable/non-taxable
    -Each item can report its total price based on item price and tax

``
2. The inventory should be pulled from an input file when the application starts.
3. The inventory is automatically restocked each time the application runs.
4. Customers are presented with a list of all items in the store
        - Show the list of products available and allow the customer to enter
        a code to select an item.
        - If the product code doesn't exist, the application informs the customer and returns them
        to the Purchase menu.
        - If a customer selects a valid product, it added to the customer's cart and updates the value of the total for shopping cart.
        -after adding to the card return the customer to the Purchase menu.

    5. Allow the customer to complete the transaction and receive a total sales report.

6. Create as many of your classes as possible to be "testable" classes. Limit console
input and output to as few classes as possible.

7. Provide unit tests demonstrating that your code works correctly.
___
### Store inventory data file
The input file that stocks the store with products is a pipe `|` delimited file. Each line is a separate product in the file and follows this format:

| Column Name           | Description |
----------------        |-------------|
| SKU                  | The product unique identifier.   
| Product Name          | The display name of the product.                   
| Product Description   | The description of the product.                   
| Taxable               | Displays Y if product is taxable.  
| Price                 | The purchase price for the product.                 
| Type                  | The product type for this row.                                     

For example:

```
001|Cake|A chocolate cake|N|10.00|F
002|Flip Flop Sandals|Protect your feet, but only the bottoms|Y|7.00
cat01|Cat|Covered in fur|Y|10.00

```

**An input file is in your repository: `inventory.csv`.**

