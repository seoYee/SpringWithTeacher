package aop_proxy;

public class PersonProxy implements Person {
	private Before before;
	private After after;
	private AfterReturning returning;
	private AfterThrowing throwing;
	private Person p;

	public void setBefore(Before before) {
		this.before = before;
	}

	public void setAfter(After after) {
		this.after = after;
	}

	public void setReturning(AfterReturning returning) {
		this.returning = returning;
	}

	public void setThrowing(AfterThrowing throwing) {
		this.throwing = throwing;
	}

	public void setPerson(Person p){
		this.p = p;
	}
	@Override
	public String makeFood(int arg) throws Exception {
		String result = null;
		if (before != null) {
			before.doBefore();
		}
		try {
			if (p != null) {
				result = p.makeFood(arg);
			}
			if (returning != null) {
				returning.doAfterReturning();
			}
		} catch (Exception ex) {
			if (throwing != null) {
				throwing.doAfterThrowing();
				throw ex;
			}
		} finally {
			if (after != null) {
				after.doAfter();
			}
		}
		return result;
	}

}