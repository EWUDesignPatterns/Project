<?php include 'layout/header.php'; ?>

<h2>Factory</h2>
<p>Simple Factory used for players characters, monster, and item generation.</p>


<div class='half left'>
  <img src='images/factory.jpg' class='rounded' />
</div>


<div class='half right'>
  
  <div class='list'>
    <h3>Players Factory</h3>
    <ul>
      <li>Creates a player based on the name, race, and class.</li>
    </ul>
  </div>

  <div class='list'>
    <h3>Monster Factory</h3>
    <ul>
      <li>Creates a random monster, adds a class and then equips the monster.</li>
    </ul>
  </div>
  
  <div class='list'>
    <h3>Item Factory</h3>
    <ul>
      <li>Creates a random item or random potions, weapons, and armor.</li>
    </ul>
  </div>
    
</div>

<?php include 'layout/footer.php'; ?>