package gg.packetloss.bukkittext;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

class TextClickActionOpenURL extends TextClickAction {
    protected final String URL;

    protected TextClickActionOpenURL(String URL) {
        this.URL = URL;
    }

    @Override
    void apply(TextComponent component) {
        component.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, this.URL));
    }
}
