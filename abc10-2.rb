STDIN.gets
num_array = STDIN.gets.split.map(&:to_i) 

count = 0
num_array.each do |num|
  count+=1 if num%6==2
  count+=1 if num%6==4
  count+=2 if num%6==5
  count+=3 if num%6==0
end
puts count