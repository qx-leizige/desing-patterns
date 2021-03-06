package qx.leizige.filter;

/**
 * @author leizige
 */
public class FilterManager {

	private FilterChain filterChain;

	public FilterManager(Target target){
		this.filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void setFilter(Filter filter){
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request){
		filterChain.execute(request);
	}
}
