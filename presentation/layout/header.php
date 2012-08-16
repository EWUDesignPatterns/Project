<!DOCTYPE html>
<html>
<head>
  <title>Dungeons and Dragons</title>

  <link rel='stylesheet' type='text/css' href='stylesheets/normalize.css' />  
  <link rel='stylesheet' type='text/css' href='stylesheets/styles.css' />
  <link rel='stylesheet' type='text/css' href='http://fonts.googleapis.com/css?family=Rokkitt' />
</head>

<body>

  
<div id='container' class='width'>
  <div id='header'>
    <h1>Design Patterns Summer 2012</h1>
  </div>
  
  <div id='content'>
    <div id='menu'>
      <a href='index.php'>0</a>
      <?php for ($i = 1; $i < 11; $i++) { ?>
        <a href='<?php echo $i; ?>.php'><?php echo $i; ?></a>
      <?php } ?>

    </div>