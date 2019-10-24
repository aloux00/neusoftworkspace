package orz.doublexi.myself;

public interface Filter {
void doFilter(Request req, Response res,FilterChain chain);
}
