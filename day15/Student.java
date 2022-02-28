package day15;

public class Student {

			private String name;
			private String idNo;
			
			Student(String name, String idNo){
				this.name = name;
				this.idNo = idNo;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIdNo() {
				return idNo;
			}

			public void setIdNo(String idNo) {
				this.idNo = idNo;
			}
			
			public void showInfo() {
				System.out.println("이름:"+name);
				System.out.println("학번:"+idNo);
			}
		}