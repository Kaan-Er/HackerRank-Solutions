#!/bin/ruby

#
# Complete the pageCount function below.
#
def pageCount(n, p)
  if n.even?
      number_control(n,p)
  else
      number_control(n-1,p)       
  end
end

def number_control(n,p)
  if p == (n/2) || p < (n/2)
          if p.odd?
              (p-1)/2
          else
              p/2
          end
  else
      if n.even? && p.odd?
          (n-p+1)/2
      elsif n.even? && p.even?
          (n-p)/2
      elsif n.odd? && p.odd?
          (n-p)/2
      else
          (n-p-1)/2
      end
  end
end

fptr = File.open(ENV['OUTPUT_PATH'], 'w')

n = gets.to_i

p = gets.to_i

result = pageCount n, p

fptr.write result
fptr.write "\n"

fptr.close()