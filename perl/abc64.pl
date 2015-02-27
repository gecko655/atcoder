#!/usr/bin/perl

my @a;
my $n;
my @score;
my $inf = 100000;

chomp($n=<STDIN>);
for($i=0;$i<$n;$i++){
  chomp($a[$i]=<STDIN>);
  $score[$i]=$inf;
}
$score[$n]=$inf;

$score[0]=$a[0];
$len=1;
for($i=1;$i<$n;$i++){
  my $small = 0;
  my $big=$len;
  my $mid;
  while($small<$big){
    $mid=int(($small+$big)/2);
    if($score[$mid]<$a[$i]){
      $small=$mid+1;
    }else{
      $big=$mid-1;
    }
  }
  if($score[$small]<$a[$i]){
    $small++;
  }
  $score[$small]=$a[$i];
  if($len==$small){
    $len++;
  }

}


print ($n-$len);
print "\n";
