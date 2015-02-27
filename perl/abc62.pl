#!/usr/bin/perl

my $a=0;
my $b=0;
my $c=1;
my $d=0;
chomp($_=<STDIN>);
if($_==1){
print $a."\n";
}elsif($_==2){
print $b."\n";
}elsif($_==3){
print $c."\n";
}else{
for(my $i=0;$i<$_-3;$i++){
  $d=($a+$b+$c)%10007;
  $a=$b;
  $b=$c;
  $c=$d;
}
print $d%10007;
print "\n";
}

