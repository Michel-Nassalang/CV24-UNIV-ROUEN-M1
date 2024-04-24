package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.LangueVivanteEntity;
import fr.univrouen.cv24v2.model.LangueVivante;

public class LangueVivanteMapper {

    public static LangueVivanteEntity convertToEntity(LangueVivante source) {
        LangueVivanteEntity target = new LangueVivanteEntity();
        target.setLang(source.getLang());
        target.setCert(source.getCert());
        target.setNivs(source.getNivs());
        target.setNivi(source.getNivi());
        return target;
    }

    public static LangueVivante convertToXml(LangueVivanteEntity source) {
        LangueVivante target = new LangueVivante();
        target.setLang(source.getLang());
        target.setCert(source.getCert());
        target.setNivs(source.getNivs());
        target.setNivi(source.getNivi());
        return target;
    }

}
