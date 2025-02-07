package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 管理者情報登録時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class InsertAdministratorForm {
	/** 名前 */
	@NotBlank(message="名前は必須です")
	private String name;
	
	/** メールアドレス */
	@Email(message="メールアドレスを入れてください")
	@Size(min=1, max=127, message="Eメールは1文字以上127文字以下で記載してください")
	private String mailAddress;
	
	/** パスワード */
	@NotBlank(message="パスワードを入れてください")
	@Size(min=1, max=10, message="パスワードは1文字以上10文字以下で記載してください")
	private String password;
	
	/** 確認用パスワード */
	@NotBlank(message="パスワードを入れてください")
	@Size(min=1, max=10, message="パスワードは1文字以上10文字以下で記載してください")
	private String passwordConfirm;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Override
	public String toString() {
		return "InsertAdministratorForm [name=" + name + ", mailAddress=" + mailAddress + ", password=" + password
				+ ", passwordConfirm=" + passwordConfirm + "]";
	}
	
	
    
	
}
