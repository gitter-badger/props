package com.outr.props

/**
  * Channel is the most simplistic representation of an `Observable` providing simple methods to set a value to be fired
  * on attached listeners without retaining state.
  *
  * @tparam T the type of value this channel receives
  */
class Channel[T] extends Observable[T] {
  /**
    * Convenience method to send a value to `set` similarly to an assignment operator.
    *
    * @param value the value to apply
    */
  def :=(value: => T): Unit = set(value)

  /**
    * Fires the value to all attached listeners.
    *
    * @param value the value to apply
    */
  def set(value: => T): Unit = fire(value)

  /**
    * Casts this instance as a Channel[T]. This is useful for representing sub-classes explicitly as a Channel.
    *
    * @return Channel[T]
    */
  def asChannel: Channel[T] = this
}

object Channel {
  /**
    * Creates a new Channel.
    */
  def apply[T](): Channel[T] = new Channel[T]
}