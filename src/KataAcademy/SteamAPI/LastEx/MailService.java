package KataAcademy.SteamAPI.LastEx;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
//            if (this.containsKey(key)) {
//                return super.get(key);
//            } else {
//                return Collections.emptyList();
//            }
            return this.containsKey(key) ? super.get(key) : Collections.emptyList();
        }
    };

    @Override
    public void accept(Sendable<T> sendable) {
//        List<T> list = mailBox.get(sendable.getTo());
//        if (list.size() == 0) {
//            list = new ArrayList<>();
//        }
//        list.add(sendable.getContent());
        // Õ≈ œŒÕ»Ã¿ﬁ
        List<T> list = mailBox.getOrDefault(sendable.getTo(), new ArrayList<>());
        list.add(sendable.getContent());
        mailBox.put(sendable.getTo(), list);
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
