package C_9;

interface Parent {}

interface FirstSon extends Parent {}

interface SecondSon extends Parent {}

interface Grandson extends FirstSon, SecondSon {}

public class Ex_13 {
}
