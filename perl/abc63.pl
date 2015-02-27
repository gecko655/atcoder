#!/usr/bin/perl

my @a;
my $b;
my $c;
my $d;
chomp(my $line=<STDIN>);
@a=split(/ /,$line);

if($a[1]==1){
  print "-1 -1 -1\n";
  exit;
}
if($a[1]%2==1){
  $a[1]-=3;
  $a[0]-=1;
  $c=1;
}else{
  $c=0;
}
$d=($a[1]/2-$a[0]);
$b=$a[0]-$d;
if($d<0||$b<0){
  print "-1 -1 -1\n";
  exit;
}
print $b." ".$c." ".$d."\n";


