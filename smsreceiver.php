<?php

$base = mysql_connect ('127.0.0.1', 'root', 'passer@1');

mysql_select_db ('message', $base) ;  

 $from=$_GET['from'];
 $body =$_GET['body'];

//int i;
 
  $tab=explode(" ", $body);
echo $tab[0];
echo $tab[1];
echo $tab[2];


//$prenom=$tab[1];

if( $tab[0]== "inscr")
{
	
	$sql1 = 'insert into users(numero, nom) values("'.$from.'", "'.$tab[1].' '.$tab[2].' '.$tab[3].' '.$tab[4].'")';
	   $req1 = mysql_query($sql1) or die ("erreur lors de l'insertion");
	
	$sql1 = 'insert into messages(frome, bodye) values("'.$from.'", "'.$tab[1].' '.$tab[2].' '.$tab[3].' '.$tab[4].'")';
	   $req1 = mysql_query($sql1) or die ("erreur lors de l'insertion");
	 
 
 
$sql2 = 'SELECT * FROM messages ';
	   
	  $req2 = mysql_query($sql2);
     echo"liste des messages";
      if ($data = mysql_fetch_array($req2)) 
	  {
	 
	  
	  //tableau de retour
	echo"<table border=3 bgcolor='green'>
            
            <tr>
                <th>from</th>
				<th>body</th>       
			</tr>";
			
			while ($row = mysql_fetch_row($req2)){
		  $from=$row[1];
		  $body=$row[2];
		  echo"<tr>
                        <td>$from</td> 
						<td>$body</td>
			</tr>
		";}
		echo"</table>
			";
	  
	  }
	  
	  $sql3 = 'SELECT * FROM users ';
	   
	  $req3 = mysql_query($sql3);
     
	 echo"liste des utilisateurs";
      if ($data = mysql_fetch_array($req3)) 
	  {
	 
	  
	  //tableau de retour
	echo"<table border=3 bgcolor='yellow'>
            
            <tr>
                <th>Nom</th>
				<th>Numero</th>       
			</tr>";
			
			while ($row = mysql_fetch_row($req3)){
		  $nom=$row[1];
		  $numero=$row[2];
		  echo"<tr>
                        <td>$nom</td> 
						<td>$numero</td>
			</tr>
		";}
		echo"</table>
			";
	  
	  }
	  
	  else  
	  {
		echo"il y a aucun message dans votre base de données";
	  }
	
}	
else if( $tab[0]== "desinscr"){
	$sql1 = 'delete from messages where frome='.$from.'';
	$req2 = mysql_query($sql1);
	
	$sql2 = 'SELECT * FROM messages ';
	   
	  $req3 = mysql_query($sql2);
	  
	  echo"<table border=3 bgcolor='blue'>
            
            <tr>
                <th>from</th>
				<th>body</th>       
			</tr>";
			
			while ($row = mysql_fetch_row($req3)){
		  $from=$row[1];
		  $body=$row[2];
		  echo"<tr>
                        <td>$from</td> 
						<td>$body</td>
			</tr>
		";}
		echo"</table>
			";
}

else if( $tab[0]== "cmd")
{
	
	$sql2 = 'SELECT iduser FROM users where numero='.$from.'';
	   
	  $req3 = mysql_query($sql2);
	  
	 
			while ($row = mysql_fetch_row($req3)){
		  $iduser=$row[0];
		  
		  echo"<tr>
                        <td>$iduser</td> 		
			</tr>
		";}
		echo"</table>
			";
	
    $codeplat= $tab[1];
    $quantite= $tab[2];
	$sql1 = 'insert into commande(iduser, codeplat,quantite) values("'.$iduser.'","'.$codeplat.'","'.$quantite.'")';
	   $req1 = mysql_query($sql1) or die ("erreur lors de l'insertion");
	
	$sql2 = 'SELECT iduser,codeplat,quantite FROM commande ';
	   
	  $req3 = mysql_query($sql2);
	  
	  echo"<table border=3 bgcolor='red'>
            
            <tr>
                <th>id user</th>
				<th>code plat</th>  
				<th>quantité</th>
			</tr>";
			
			while ($row = mysql_fetch_row($req3)){
		  $iduser=$row[0];
		  $code_plat=$row[1];
		  $quantite=$row[2];
		  echo"<tr>
                        <td>$iduser</td> 
						<td>$code_plat</td>
						<td>$quantite</td>
			</tr>
		";}
		echo"</table>
			";
	
	
	
}

 
 
 

 
	 
	
	
	
	
	
    // echo $result;
	//echo $id_user.'#';
	
	
	
 
  //mysql_free_result ($req1); 

  
  mysql_close ();
?>  