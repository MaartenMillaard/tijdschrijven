function getDateOfISOWeek(w, y) {
    var datevar = new Date(y, 0, 1 + (w - 1) * 7);
    var dow = datevar.getDay();
    var ISOweekStart = datevar;
    if (dow <= 4)
        ISOweekStart.setDate(datevar.getDate() - datevar.getDay() + 1);
    else
        ISOweekStart.setDate(datevar.getDate() + 8 - datevar.getDay());
    return ISOweekStart;
}

