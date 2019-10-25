# gaal-api
### _GAAL's another abstraction layer._
A minecraft abstraction layer, primarily intended for a dead simple version-agnostic Minecraft API. 
The aim of the API is to be as implementable in as many Minecraft versions as possible.

API Design principles:
* Cut features that don't appear in majority of Minecraft versions, no specific version features allowed unless the benefit largely outweighs the cost.

Features:
* Network wrapper. (**TODO**)
* Basic event framework. (**TODO**)
* GUI framework. (**TODO**)
* Math wrapper. (**TODO**)
* Rendering wrapper for LWJGL. (**TODO**)
* Mod loader wrapper. (**TODO**)
* Mod loader agnosticism.

# FAQ
> ## How does GAAL work?
> 
>  GAAL consists of the two parts
>* **The API** - A set of header like interfaces and classes meant to be as barebones as possible. 
> * **The Implementation**. A per minecraft version (any modloader) implementation of the GAAL API.
> ## Do GAAL implementations act as another mod library?
> Absolutely not, the end user should never have to download GAAL as an additional file, GAAL is packaged alongside any mod that uses it, not separately downloaded.
> * GAAL API can be easily forked and modified for specific mod requirements.  
> * End user doesn't have to worry about downloading any additional files, plug and play.
