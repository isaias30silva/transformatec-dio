import React, { useState, useEffect } from "react";

const ContactList = () => {

    const [contactList, setContactList] = useState([]);
    const [contactId, setContactId] = useState('');

    let url = 'http://localhost:8080/api/users/1/contacts';

    useEffect(() => {
        fetch(url)
        .then(
            (result) => console.log(result),
            (result) => result.json()
        ).then(
            (data) => console.log(data)
        )
    })

    return(
        <div>

        </div>
    )
}

export default ContactList;