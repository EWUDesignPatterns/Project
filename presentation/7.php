<?php include 'layout/header.php'; ?>

<h2>Factory</h2>
<p>Simple Factory used for players characters, monster, and item generation.</p>

<div class='half left'>
  <img src='images/factory.jpg' class='rounded' />
  
  <div class='list'>
    <p>
      In future iterations, we could use an Abstract Factory to customize all characters, monsters, and items to specific maps types such as Underwater, Lovecraft, Humorous, etc.  
    </p>
  </div>
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
    
  <div class='full' style='padding: 20px 0'>
    <img src='images/factory_diagram.gif' class='rounded full' />
</div>

<?php include 'layout/footer.php'; ?>