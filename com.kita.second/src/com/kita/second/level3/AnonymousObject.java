package com.kita.second.level3;

public class AnonymousObject {
	public static void main(String[] args) {
		ParentAO p = new ChildAO();
		ChildAO c = (ChildAO)p;
		c.childMethod(
				new ParentAO() {
					int childField;

					@Override
					void parentMethod() {}

					void childMethod() {}
				}
				);
		p.parentMethod();

		ParentAO p2 = new ParentAO() {
			int childField=5;

			@Override
			void parentMethod() {
				childMethod();
			}

			void childMethod() {
				System.out.println(childField + 5);
			}
		};
	}
}

class ParentAO {
	int parentField;

	void parentMethod() {}
}

class ChildAO extends ParentAO {
	int childField;
	ParentAO pao = new ParentAO() {
		int childField;

		@Override
		void parentMethod() {}

		void childMethod() {}
	};

	@Override
	void parentMethod() {}

	void childMethod(ParentAO p) {}
}