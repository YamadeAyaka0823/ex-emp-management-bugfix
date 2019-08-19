package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {
	/** メールアドレス */
	@Email(message="メールアドレスを入れてください")
	@Size(min=1, max=127, message="Eメールは1文字以上127文字以下で記載してください")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードを入れてください")
	@Size(min=1, max=10, message="パスワードは1文字以上10文字以下で記載してください")
	private String password;

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

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
