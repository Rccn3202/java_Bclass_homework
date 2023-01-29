package homework_ch6_20;
	
class Account{   //계좌 객체 생성
	//필드
	String account; //계좌
	String name; //계좌주
	int first; //초기 입금금액
	
	//생성자
	Account(String account, String name, int first) {
		this.account=account;
		this.name=name;
		this.first=first;
	}

	
	//메소드
	public String getAccount() { return account; }
	public void setAccount(String account) { this.account = account; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getFirst() { return first; }
	public void setFirst(int first) { this.first = first; }
	
	
		}

