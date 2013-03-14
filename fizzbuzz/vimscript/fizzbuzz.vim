function! FizzBuzz()
  for i in range(1,100)
    if i % 15 == 0
      let l:s = "FizzBuzz"
    elseif i % 3 == 0
      let l:s = "Fizz"
    elseif i % 5 == 0
      let l:s = "Buzz"
    else
      let l:s = i
    endif

    call append(line('$'), l:s)
  endfor
endfunction

command! FizzBuzz call FizzBuzz()
