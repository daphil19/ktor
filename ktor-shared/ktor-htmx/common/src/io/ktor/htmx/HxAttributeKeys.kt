/*
 * Copyright 2014-2024 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */
@file:Suppress("ConstPropertyName")

package io.ktor.htmx

/**
 * Attribute constants that are used with HTMX.
 *
 * @see [Official documentation](https://htmx.org/reference/#attributes-additional)
 */
public object HxAttributeKeys {
    /**
     * Issues a GET to the specified URL.
     */
    public const val Get: String = "hx-get"

    /**
     * Issues a POST to the specified URL.
     */
    public const val Post: String = "hx-post"

    /**
     * Handles events with inline scripts on elements.
     */
    public const val On: String = "hx-on"

    /**
     * Pushes a URL into the browser location bar to create history.
     */
    public const val PushUrl: String = "hx-push-url"

    /**
     * Selects content to swap in from a response.
     */
    public const val Select: String = "hx-select"

    /**
     * Selects content to swap in from a response, somewhere other than the target (out of band).
     */
    public const val SelectOob: String = "hx-select-oob"

    /**
     * Controls how content will swap in (outerHTML, beforeend, afterend, …).
     */
    public const val Swap: String = "hx-swap"

    /**
     * Marks element to swap in from a response (out of band).
     */
    public const val SwapOob: String = "hx-swap-oob"

    /**
     * Specifies the target element to be swapped.
     */
    public const val Target: String = "hx-target"

    /**
     * Specifies the event that triggers the request.
     */
    public const val Trigger: String = "hx-trigger"

    /**
     * Adds values to submit with the request (JSON format).
     */
    public const val Vals: String = "hx-vals"

    /**
     * Adds progressive enhancement for links and forms.
     */
    public const val Boost: String = "hx-boost"

    /**
     * Shows a confirm() dialog before issuing a request.
     */
    public const val Confirm: String = "hx-confirm"

    /**
     * Issues a DELETE to the specified URL.
     */
    public const val Delete: String = "hx-delete"

    /**
     * Disables htmx processing for the given node and any children nodes.
     */
    public const val Disable: String = "hx-disable"

    /**
     * Adds the disabled attribute to the specified elements while a request is in flight.
     */
    public const val DisabledElt: String = "hx-disabled-elt"

    /**
     * Controls and disables automatic attribute inheritance for child nodes.
     */
    public const val Disinherit: String = "hx-disinherit"

    /**
     * Changes the request encoding type.
     */
    public const val Encoding: String = "hx-encoding"

    /**
     * Extensions to use for this element.
     */
    public const val Ext: String = "hx-ext"

    /**
     * Adds to the headers that will be submitted with the request.
     */
    public const val Headers: String = "hx-headers"

    /**
     * Prevents sensitive data from being saved to the history cache.
     */
    public const val History: String = "hx-history"

    /**
     * Specifies the element to snapshot and restore during history navigation.
     */
    public const val HistoryElt: String = "hx-history-elt"

    /**
     * Includes additional data in requests.
     */
    public const val Include: String = "hx-include"

    /**
     * Specifies the element to put the htmx-request class on during the request.
     */
    public const val Indicator: String = "hx-indicator"

    /**
     * Controls and enables automatic attribute inheritance for child nodes if it has been disabled by default.
     */
    public const val Inherit: String = "hx-inherit"

    /**
     * Filters the parameters that will be submitted with a request.
     */
    public const val Params: String = "hx-params"

    /**
     * Issues a PATCH to the specified URL.
     */
    public const val Patch: String = "hx-patch"

    /**
     * Specifies elements to keep unchanged between requests.
     */
    public const val Preserve: String = "hx-preserve"

    /**
     * Shows a prompt() before submitting a request.
     */
    public const val Prompt: String = "hx-prompt"

    /**
     * Issues a PUT to the specified URL.
     */
    public const val Put: String = "hx-put"

    /**
     * Replaces the URL in the browser location bar.
     */
    public const val ReplaceUrl: String = "hx-replace-url"

    /**
     * Configures various aspects of the request.
     */
    public const val Request: String = "hx-request"

    /**
     * Controls how requests made by different elements are synchronized.
     */
    public const val Sync: String = "hx-sync"

    /**
     * Forces elements to validate themselves before a request.
     */
    public const val Validate: String = "hx-validate"

    /**
     * Adds values dynamically to the parameters to submit with the request (deprecated, please use hx-vals).
     */
    public const val Vars: String = "hx-vars"
}
