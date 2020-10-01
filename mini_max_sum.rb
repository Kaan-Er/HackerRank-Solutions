require 'json'
require 'stringio'

# Complete the miniMaxSum function below.
def miniMaxSum(arr)
    arr.sort!
    sum = 0
    arr.each {|item| sum+=item}
    puts "#{sum-arr[-1]} #{sum-arr[0]}"
end

arr = gets.rstrip.split(' ').map(&:to_i)

miniMaxSum arr