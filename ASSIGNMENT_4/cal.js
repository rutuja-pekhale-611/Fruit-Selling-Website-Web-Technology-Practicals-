document.getElementById('orderForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const fruit = document.getElementById('fruit').value;
    const quantity = document.getElementById('quantity').value;
  
    // Simple validation
    if (!fruit || !quantity) {
      alert('Please select a fruit and enter quantity.');
      return;
    }
  
    // Validate quantity
    if (isNaN(quantity) || quantity <= 0) {
      alert('Please enter a valid quantity.');
      return;
    }
  
    // Process order
    const totalPrice = calculatePrice(fruit, quantity);
    document.getElementById('message').innerHTML = `Order placed: ${quantity} ${fruit}(s). Total price: $${totalPrice.toFixed(2)}.`;
  });
  
  function calculatePrice(fruit, quantity) {
    const prices = {
      apple: 0.5,
      banana: 0.3,
      orange: 0.4,
      grape: 0.6,
      strawberry: 0.8
    };
  
    return (prices[fruit] || 0) * quantity;
  }
  