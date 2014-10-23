# PCA level 1

This is the specification of the first level of PCA.

## extern functions
Extern functions are used by the user to create/kill/interact with the PCA. PCA is not aware of these functions.

- create-agent : [] -> an agent handle
  Create a new agent. The handle will be used by other extern functions.
  The agent will stay alive until it is killed by the 'kill-agent' extern function.
  Actually :
   repeatedly choose-action / do-action.

- kill-agent : [an agent handle] -> (or (vector-of action) false nil)
  Kill the PCA associated with the agent handle.
  Returns agent life (same as PCA-life ) if agent was found and killed, false if found but not killed, nil if not found.

- user-life : [] -> (vector-of action)
  list the user actions ordered by date ascending.

- PCA-life : [an agent handle] -> (or (vector-of action) nil)
  list the agent actions ordered by date ascending if found (this means still alive) else nil.


## intern functions
Intern functions are used by the PCA implementation.

- choose-action : [] -> an action
  Returns the best action to do now from the PCA perspective.
  Actually :
   always returns the action "wait 1 hour"

- do-action : [an action] -> a boolean
  Returns true if the action has been completed with success, false if completed with failure.










