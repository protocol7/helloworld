fn main() {
  for i in range(1, 101) {
    println!("{}",
      match (i % 3, i % 5) {
        (0, 0) => "FizzBuzz".to_owned(),
        (0, _) => "Fizz".to_owned(),
        (_, 0) => "Buzz".to_owned(),
        _ => i.to_str()
      }
    )
  }
}
