package com.pratice.spring.circulardependency;

public class CircularDependency {

	// disabling cyclic dependency resolution with AbstractRefreshableApplicationContext#setAllowCircularReferences(false)
	/*
	 * Using @Autowired on fields (instead of setters) in CircularDependencyA and
	 * CircularDependencyB classes will work as well. So there is one more solution:
	 * field injection.
	 */
	/*
	 * when having a circular dependency, Spring cannot decide which of the beans
	 * should be created first, since they depend on one another. In these cases,
	 * Spring will raise a BeanCurrentlyInCreationException while loading context.
	 * 
	 * It can happen in Spring when using constructor injection; if you use other
	 * types of injections you should not find this problem since the dependencies
	 * will be injected when they are needed and not on the context loading.
	 */

	// 1. Using @Autowired on fields
	// 2. Use @Lazy
	// 3. Use Setter/Field Injection
	// 4. Use @PostConstruct
	// 5. Implement ApplicationContextAware and InitializingBean

	/*
	 * If one of the beans implements ApplicationContextAware, the bean has access
	 * to Spring context and can extract the other bean from there. Implementing
	 * InitializingBean we indicate that this bean has to do some actions after all
	 * its properties have been set; in this case, we want to manually set our
	 * dependency.
	 */
}
