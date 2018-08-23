package heron_formula;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class TriangleAreaTeat {

	@RunWith(Enclosed.class)
	public static class 正常系{

		@RunWith(Enclosed.class)
		public static class _3つの引数からヘロンの公式を用いて三角形の面積を計算し返す {

			public static class 整数を渡すと三角形の面積を返す {
				private TriangleArea tri;

				@Before
				public void setUp() {
					tri = new TriangleArea();
				}

				@Test
				public void 引数として2_5_4が入力された場合() throws Exception {
					double actual = tri.heron(2, 5, 4);
					double expected = 3.799;

					assertThat(actual, is(expected));
				}
			}

			public static class 小数を渡すと三角形の面積を返す {
				private TriangleArea tri;

				@Before
				public void setUp() {
					tri = new TriangleArea();
				}

				@Test
				public void 引数として8_5__9_25__11_5が入力された場合() throws Exception {
					double actual = tri.heron(8.5, 9.25, 11.5);
					double expected = 38.789;

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8_5__9__11が入力された場合() throws Exception {
					double actual = tri.heron(8.5, 9, 11);
					double expected = 37.390;

					assertThat(actual, is(expected));
				}


				@Test
				public void 引数として8_5__9_25__11が入力された場合() throws Exception {
					double actual = tri.heron(8.5, 9.25, 11);
					double expected = 38.220;

					assertThat(actual, is(expected));
				}


				@Test
				public void 引数として8_5__9__11_5が入力された場合() throws Exception {
					double actual = tri.heron(8.5, 9, 11.5);
					double expected = 37.887;

					assertThat(actual, is(expected));
				}


				@Test
				public void 引数として8__9_25__11が入力された場合() throws Exception {
					double actual = tri.heron(8, 9.25, 11);
					double expected = 36.304;

					assertThat(actual, is(expected));
				}


				@Test
				public void 引数として8__9_25__11_5が入力された場合() throws Exception {
					double actual = tri.heron(8, 9.25, 11.5);
					double expected = 36.745;

					assertThat(actual, is(expected));
				}

			}
		}

		@RunWith(Enclosed.class)
		public static class _3つの引数をメソッドheronに渡して結果を出力する {

			public static class 整数を渡すと三角形の面積を表示する {
				private TriangleArea tri;
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					tri = new TriangleArea();
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 整数を渡すと三角形の面積を出力する() {
					tri.printTri(2, 5, 4);
					String actual = out.toString();
					String expected = "3.799" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}

			public static class 小数を渡すと三角形の面積を表示する {
				private TriangleArea tri;
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					tri = new TriangleArea();
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数として8_5__9_25__11_5が入力された場合(){
					tri.printTri(8.5, 9.25, 11.5);
					String actual = out.toString();
					String expected = "38.789" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				public void 引数として8_5__9__11が入力された場合(){
					tri.printTri(8.5, 9, 11);
					String actual = out.toString();
					String expected = "37.390" + System.lineSeparator();

					assertThat(actual, is(expected));
				}


				public void 引数として8_5__9_25__11が入力された場合(){
					tri.printTri(8.5, 9.25, 11);
					String actual = out.toString();
					String expected = "38.220" + System.lineSeparator();

					assertThat(actual, is(expected));
				}


				public void 引数として8_5__9__11_5が入力された場合(){
					tri.printTri(8.5, 9, 11.5);
					String actual = out.toString();
					String expected = "37.887" + System.lineSeparator();

					assertThat(actual, is(expected));
				}


				public void 引数として8__9_25__11が入力された場合(){
					tri.printTri(8, 9.25, 11);
					String actual = out.toString();
					String expected = "36.304" + System.lineSeparator();

					assertThat(actual, is(expected));
				}


				public void 引数として8__9_25__11_5が入力された場合(){
					tri.printTri(8, 9.25, 11.5);
					String actual = out.toString();
					String expected = "36.745" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

			}
		}

		@RunWith(Enclosed.class)
		public static class 三つの引数をprintTriメソッドに渡して実行する {

			public static class 整数を渡すと三角形の面積を出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数として2_5_4が入力された場合() throws Exception {
					String[] input = {"2", "5", "4"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "3.799" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}

			public static class 小数を渡すと三角形の面積を出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数として8_5__9_25__11_5が入力された場合() throws Exception {
					String[] input = {"8.5", "9.25", "11.5"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "38.789" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8_5__9__11が入力された場合() throws Exception {
					String[] input = {"8.5", "9", "11"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "37.39" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8_5__9_25__11が入力された場合() throws Exception {
					String[] input = {"8.5", "9.25", "11"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "38.22" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8_5__9__11_5が入力された場合() throws Exception {
					String[] input = {"8.5", "9", "11.5"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "37.887" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8__9_25__11が入力された場合() throws Exception {
					String[] input = {"8", "9.25", "11"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "36.304" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として8__9_25__11_5が入力された場合() throws Exception {
					String[] input = {"8", "9.25", "11.5"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "36.745" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}
		}
	}

	@RunWith(Enclosed.class)
	public static class 異常系 {

		@RunWith(Enclosed.class)
		public static class 入力に誤りがあった場合エラー文を出力する {

			public static class 数字以外が入力された場合_数字を入力してください_と出力する {

				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数としてa_b_cが入力された場合() throws Exception {
					String[] input = {"a", "b", "c"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数としてa_b_1が入力された場合() throws Exception {
					String[] input = {"a", "b", "1"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数としてa_1_2が入力された場合() throws Exception {
					String[] input = {"a", "1", "2"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1_a_bが入力された場合() throws Exception {
					String[] input = {"1", "a", "b"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1_a_2が入力された場合() throws Exception {
					String[] input = {"1", "a", "2"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1_2_aが入力された場合() throws Exception {
					String[] input = {"1", "2", "a"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}


			}

			public static class 引数が一つも入力されなかった場合_数字を3つ入力してください_と出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数が入力されなかった場合() throws Exception {
					String[] input = {};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を3つ入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}

			public static class 引数の数が多い場合_数字を3つ入力してください_と出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数として1_2_3_4が入力された場合() throws Exception {
					String[] input = {"1", "2", "3", "4"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を3つ入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}

			public static class 引数の数が少ない場合_数字を3つ入力してください_と出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数がとして1_2が入力された場合() throws Exception {
					String[] input = {"1", "2"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を3つ入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1が入力された場合() throws Exception {
					String[] input = {"1"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "数字を3つ入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}

			public static class _0以下の数字が入力された場合_0以上の数字を入力してください_と出力する {
				private ByteArrayOutputStream out;

				@Before
				public void setUp() {
					out = new ByteArrayOutputStream();
					System.setOut(new PrintStream(out));
				}

				@Test
				public void 引数として0_0_0が入力された場合() throws Exception {
					String[] input = {"0", "0", "0"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として0_1_2が入力された場合() throws Exception {
					String[] input = {"0", "1", "2"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として0_0_1が入力された場合() throws Exception {
					String[] input = {"0", "0", "1"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として0_1_0が入力された場合() throws Exception {
					String[] input = {"0", "1", "0"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1_0_2が入力された場合() throws Exception {
					String[] input = {"1", "0", "2"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}

				@Test
				public void 引数として1_0_0が入力された場合() throws Exception {
					String[] input = {"1", "0", "0"};
					TriangleArea.main(input);
					String actual = out.toString();
					String expected = "0以上の数字を入力してください" + System.lineSeparator();

					assertThat(actual, is(expected));
				}
			}
		}

		public static class 三角形の成立条件を満たさなかった場合エラー文を出力する {
			private ByteArrayOutputStream out;

			@Before
			public void setUp() {
				out = new ByteArrayOutputStream();
				System.setOut(new PrintStream(out));
			}

			@Test
			public void _2辺の長さの和が残る1辺の長さより小さい場合_三角形の成立条件を満たしていません_と出力する() throws Exception {
				String[] input = {"1", "2", "4"};
				TriangleArea.main(input);
				String actual = out.toString();
				String expected = "三角形の成立条件を満たしていません" + System.lineSeparator();

				assertThat(actual, is(expected));
			}

			@Test
			public void _2辺の長さの差の絶対値が残る1辺の長さより大きい場合_三角形の成立条件を満たしていません_と出力する() throws Exception {
				String[] input = {"10", "2", "4"};
				TriangleArea.main(input);
				String actual = out.toString();
				String expected = "三角形の成立条件を満たしていません" + System.lineSeparator();

				assertThat(actual, is(expected));
			}

		}
	}
}
