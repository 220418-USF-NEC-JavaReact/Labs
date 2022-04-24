public class reverse implements GenericInterface<String> {
    
    public String func (String str) {
        StringBuilder reString = new StringBuilder();

        for (int i = str.length(); i >= 0; i--) {
            reString.append(str.charAt(i));
        }

        return reString.toString();
    }
}
