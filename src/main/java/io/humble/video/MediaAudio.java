/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Raw audio data.  
 * <p>  
 * The data described by the sample format is always in native-endian 
 * order.  
 * </p><p>  
 * The floating-point formats are based on full volume being in the 
 * range  
 * [-1.0, 1.0]. Any values outside this range are beyond full volume 
 * level.  
 * </p><p>  
 * The data layout is as follows:  
 * </p><p>  
 * For planar sample formats, each audio channel is in a separate data 
 * plane,  
 * and {@link MediaAudio#getDataLineSize(int)} is the buffer size, in 
 * bytes, for a single plane. All data  
 * planes must be the same size. For packed sample formats, only the 
 * first data  
 * plane is used, and samples for each channel are interleaved. In this 
 * case,  
 * {@link MediaAudio#getDataLineSize(int)} is the buffer size, in bytes, 
 * for the 1 plane.  
 * </p>  
 */
public class MediaAudio extends MediaRaw {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaAudio(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGMediaAudioUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaAudio(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGMediaAudioUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaAudio obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaAudio object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaAudio copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaAudio(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaAudio)
      equal = (((MediaAudio)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Create a MediaAudio and the underlying data. Will allocate a buffer 
 * to back this data.  
 * @param	numSamples The number of samples of audio that will be placed 
 *		 in this {@link MediaAudio} object.  
 * @param	sampleRate The sample rate (per second) of this audio.  
 * @param	channels The number of channels of audio that will be placed 
 *		 in this {@link MediaAudio} object.  
 * channelLayout The channel layout of audio that will be placed in 
 * this {@link MediaAudio} object.  
 * @param	format The format of the audio placed in this {@link MediaAudio} 
 *		 object.  
 * @return	A {@link MediaAudio} object, or null on failure.  
 */
  public static MediaAudio make(int numSamples, int sampleRate, int channels, AudioChannel.Layout channelLayout, AudioFormat.Type format) {
    long cPtr = VideoJNI.MediaAudio_make__SWIG_0(numSamples, sampleRate, channels, channelLayout.swigValue(), format.swigValue());
    return (cPtr == 0) ? null : new MediaAudio(cPtr, false);
  }

/**
 * Create a MediaAudio using the given buffer.  
 * Note: that the {@link Buffer.getBufferSize()} constraints the max 
 * number  
 * of samples we can place in here, and HumbleVideo needs to reserve 
 * some  
 * of the buffer for, um, stuff (assume at least 64 bytes). So {@link 
 * #getMaxNumSamples()}  
 * may not return as many as you think you can fit in here.  
 * @param	buffer A buffer to back the audio with. If not large enough 
 *		 to hold all the samples (with alignment on 32-bit 
 *		 boundaries if planar),  
 * then an error results.  
 * @param	numSamples The number of samples of audio that will be placed 
 *		 in this {@link MediaAudio} object.  
 * @param	sampleRate The sample rate (per second) of this audio.  
 * @param	channels The number of channels of audio that will be placed 
 *		 in this {@link MediaAudio} object.  
 * channelLayout The channel layout of audio that will be placed in 
 * this {@link MediaAudio} object.  
 * @param	format The format of the audio placed in this {@link MediaAudio} 
 *		 object.  
 * @return	A {@link MediaAudio} object, or null on failure.  
 */
  public static MediaAudio make(Buffer buffer, int numSamples, int sampleRate, int channels, AudioChannel.Layout channelLayout, AudioFormat.Type format) {
    long cPtr = VideoJNI.MediaAudio_make__SWIG_1(Buffer.getCPtr(buffer), buffer, numSamples, sampleRate, channels, channelLayout.swigValue(), format.swigValue());
    return (cPtr == 0) ? null : new MediaAudio(cPtr, false);
  }

/**
 * Create a MediaAudio by either referencing or copying another MediaAudio. 
 *  
 * <p>  
 * This method is very useful when you want to change some meta-data 
 * about MediaAudio (such as  
 * changing a timestamp) without effecting other users of the same underlying 
 * data.  
 * </p>  
 * <p>  
 * It can also be useful to create a copy of the raw audio data in the 
 * buffers in the  
 * event you are doing audio manipulation and do not want to effect 
 * other people  
 * using the audio.  
 * </p>  
 * @param	src MediaAudio to reference  
 * @param	copy true if we should copy all data. false if we should just 
 *		 gain a reference to the same underlying data in 
 *		 src.  
 * @return	a {@link MediaAudio} object, or null on failure.  
 */
  public static MediaAudio make(MediaAudio src, boolean copy) {
    long cPtr = VideoJNI.MediaAudio_make__SWIG_2(MediaAudio.getCPtr(src), src, copy);
    return (cPtr == 0) ? null : new MediaAudio(cPtr, false);
  }

/**
 * Get any underlying raw data available for this object.  
 * @param	plane The plane number if {@link getFormat()} is Planar (rather 
 *		 
 * @return	The raw data, or null if not accessible.  
 */
  public Buffer getData(int plane) {
    long cPtr = VideoJNI.MediaAudio_getData(swigCPtr, this, plane);
    return (cPtr == 0) ? null : new Buffer(cPtr, false);
  }

/**
 * The total number of bytes in {@link #getData()} that represent valid 
 * audio data.  
 * If {@link #isComplete()} returns true, this returns the total number 
 * of bytes  
 * returned by {@link #getData(int)} that are readable from. Otherwise 
 * it will  
 * return the total number of bytes that are writable to.  
 * @return	The size in bytes of that plane of audio data.  
 */
  public int getDataPlaneSize(int plane) {
    return VideoJNI.MediaAudio_getDataPlaneSize(swigCPtr, this, plane);
  }

/**
 * Returns the number of data planes in this object.  
 */
  public int getNumDataPlanes() {
    return VideoJNI.MediaAudio_getNumDataPlanes(swigCPtr, this);
  }

/**
 * @return	maximum of samples of {@link #getChannels()} {@link #getFormat()} 
 *		 audio that can be put in this {@link MediaAudio} 
 *		 object.  
 */
  public int getMaxNumSamples() {
    return VideoJNI.MediaAudio_getMaxNumSamples(swigCPtr, this);
  }

/**
 * @return	the actual number of samples in this object  
 */
  public int getNumSamples() {
    return VideoJNI.MediaAudio_getNumSamples(swigCPtr, this);
  }

/**
 * Set the number of samples in the buffer. Must not be more than  
 * {@link #getMaxNumSamples()}. Caller is responsible for making  
 * sure buffer actually matches this.  
 */
  public void setNumSamples(int numSamples) {
    VideoJNI.MediaAudio_setNumSamples(swigCPtr, this, numSamples);
  }

/**
 * Number of bytes in one sample of one channel of audio in this object. 
 *  
 */
  public int getBytesPerSample() {
    return VideoJNI.MediaAudio_getBytesPerSample(swigCPtr, this);
  }

/**
 * Call this if you modify the samples and are now done. This  
 * updates the pertinent information in the structure.  
 * @param	complete true if complete; false if not.  
 */
  public void setComplete(boolean complete) {
    VideoJNI.MediaAudio_setComplete(swigCPtr, this, complete);
  }

/**
 * Sample rate of audio, or 0 if unknown.  
 */
  public int getSampleRate() {
    return VideoJNI.MediaAudio_getSampleRate(swigCPtr, this);
  }

/**
 * Number of channels of audio in this object.  
 */
  public int getChannels() {
    return VideoJNI.MediaAudio_getChannels(swigCPtr, this);
  }

/**
 * Format of audio in this object.  
 */
  public AudioFormat.Type getFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.MediaAudio_getFormat(swigCPtr, this));
  }

/**
 * Does this object have complete data? If not, other methods may return 
 * unknown.  
 */
  public boolean isComplete() {
    return VideoJNI.MediaAudio_isComplete(swigCPtr, this);
  }

/**
 * Was this audio decoded from a key packet?  
 */
  public boolean isKey() {
    return VideoJNI.MediaAudio_isKey(swigCPtr, this);
  }

/**
 * Is audio laid out in a planar format?  
 */
  public boolean isPlanar() {
    return VideoJNI.MediaAudio_isPlanar(swigCPtr, this);
  }

/**
 * What is the channel layout of the audio in this buffer?  
 */
  public AudioChannel.Layout getChannelLayout() {
    return AudioChannel.Layout.swigToEnum(VideoJNI.MediaAudio_getChannelLayout(swigCPtr, this));
  }

}
