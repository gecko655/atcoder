def distance(ltx,lty,tx,ty)
  return Math.sqrt((ltx-tx)**2 + (lty-ty)**2)
end
takahashi = STDIN.gets.split.map(&:to_i) 
tx =takahashi[0]
ty =takahashi[1]
txb =takahashi[2]
tyb =takahashi[3]
t =takahashi[4]
v =takahashi[5]
x = v * t
n = STDIN.gets.to_i
for i in 1..n do
  lady = STDIN.gets.split.map(&:to_i) 
  ltx = lady[0]
  lty = lady[1]
  if (distance(ltx,lty,tx,ty)+distance(ltx,lty,txb,tyb)<=x)
    puts "YES"
    Kernel.exit 0
  end
end
puts "NO"
