package de.kherud.llama.foreign;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class llama_beams_state extends Structure {
	public de.kherud.llama.foreign.llama_beam_view.ByReference beam_views;
	public de.kherud.llama.foreign.llama_beam_view.ByReference getBeam_views() {
		return beam_views;
	}
	public void setBeam_views(de.kherud.llama.foreign.llama_beam_view.ByReference beam_views) {
		this.beam_views = beam_views;
	}
	/** Number of elements in beam_views[]. */
	public NativeSize n_beams;
	public NativeSize getN_beams() {
		return n_beams;
	}
	public void setN_beams(NativeSize n_beams) {
		this.n_beams = n_beams;
	}
	/** Current max length of prefix tokens shared by all beams. */
	public NativeSize common_prefix_length;
	public NativeSize getCommon_prefix_length() {
		return common_prefix_length;
	}
	public void setCommon_prefix_length(NativeSize common_prefix_length) {
		this.common_prefix_length = common_prefix_length;
	}
	/** True iff this is the last callback invocation. */
	public byte last_call;
	public byte getLast_call() {
		return last_call;
	}
	public void setLast_call(byte last_call) {
		this.last_call = last_call;
	}
	public llama_beams_state() {
		super();
	}
	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("beam_views", "n_beams", "common_prefix_length", "last_call");
	}
	public llama_beams_state(de.kherud.llama.foreign.llama_beam_view.ByReference beam_views, NativeSize n_beams, NativeSize common_prefix_length, byte last_call) {
		super();
		this.beam_views = beam_views;
		this.n_beams = n_beams;
		this.common_prefix_length = common_prefix_length;
		this.last_call = last_call;
	}
	public llama_beams_state(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends llama_beams_state implements Structure.ByReference {
		
	};
	public static class ByValue extends llama_beams_state implements Structure.ByValue {
		
	};
}