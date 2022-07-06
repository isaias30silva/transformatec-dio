import React, {useMemo, useCallback} from 'react';

export default function useCallbackMemo(){

    const callbackExample = useCallback(
        () => {
            console.log("Chamada do CallBack")
        }, []
    )

    const memoExample = useMemo(
        () => {
            console.log("Chamada do Memo")
        }, []
    )

    return(
        <div>
            <button
                onClick={() => callbackExample()}
            >
                Executar o Callback
            </button>
        </div>
    )

}