package me.espercroft.util;

import java.util.List;

/**
 * Represents a named object with potentially a set of parents and children.
 * <br><br>
 * Based on the Instances in Roblox's object model.
 */
public class HierarchialInstance{
	private volatile HierarchialInstance parent;
	private volatile List<HierarchialInstance> children;
	private volatile String name = "Instance";
	
	
	public synchronized HierarchialInstance getParent() {
		return parent;
	}
	public synchronized void setParent(HierarchialInstance parent) {
		this.parent = parent;
		parent.children.add(this);
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
}
