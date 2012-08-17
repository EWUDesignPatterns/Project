<?php include 'layout/header.php'; ?>

<h2>State and Mediator</h2>
<p>Used to handle the different player states such as exploring, resting, and fighting.</p>


<div class='full'>
  <img src='images/state_diagram.png' class='rounded full' />
</div>


<div class='half left'>
  
  <div class='list'>
    <h3>Begin</h3>
    <p>Creates party of characters.</p>
  </div>
  
  <div class='list'>
    <h3>Home Screen</h3>
    <p>Allows the user to: move, use, rest, or exit the game.</p>
  </div>
  
  
  <div class='list'>
    <h3>Fight</h3>
    <p>Allows the user to: run or attack.</p>
  </div>

</div>

<div class='half right'>
  
  <div class='list'>
    <h3>Move</h3>
    <p>Allows the user to move: north, south, east, or west.</p>
  </div>
    
  <div class='list'>
    <h3>Rest</h3>
    <p>Allows the user to rest and regain hitpoints.</p>
  </div>
  
  <div class='list'>
    <h3>Use Item</h3>
    <p>Allows the user to select an item and use it.</p>
  </div>
  
  <div class='list'>
    <h3>Exit</h3>
    <p>Quits the game.</p>
  </div>

  
  
    
  
</div>




<?php include 'layout/footer.php'; ?>