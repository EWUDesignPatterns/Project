<?php include 'layout/header.php'; ?>

<h2>Model View Controller</h2>
<p>This pattern was applied partially and can be improved in future iterations</p>


<div class='half right'>
  <img src='http://placehold.it/450x400' class='rounded' />
</div>


<div class='half left'>
  
  <div class='list'>
    <h3>Models</h3>
    <ul>
      <li>Character, Party, Room, Ability, and Item objects</li>
    </ul>
  </div>

  <div class='list'>
    <h3>Views</h3>
    <ul>
      <li>The various states such as Explore, Rest, Use Item.</li>
    </ul>
  </div>
  
  <div class='list'>
    <h3>Controllers</h3>
    <ul>
      <li>DungeonsAndDragonGame class</li>
    </ul>
  </div>
    
</div>

<div class='full clear'>
  Note: We wanted the game object to have a simple attack() method so that attacking could be implemented regardless of view. This will need to be abstracted out using the Strategy pattern to implement the different attacking behaviors such as ConsoleAttackBehavior.
</div>




<?php include 'layout/footer.php'; ?>