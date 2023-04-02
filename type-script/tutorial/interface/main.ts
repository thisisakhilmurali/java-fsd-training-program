interface User {

    readonly databaseId: number,

    email: string,
    userId: string,
    googleLoginId?: string,

    startTrail(): string

}

const userOne: User = {
    databaseId: 22410,
    email: "user@h.com",
    userId: "WED343",
    startTrail: () => {
        return "Your Trail Started";
    }
}