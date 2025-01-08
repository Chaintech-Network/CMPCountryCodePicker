package network.chaintech.cmpcountrycodepicker.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.Res
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ad
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ae
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.af
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ag
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ai
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.al
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.am
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.american_samoa
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ao
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.aq
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ar
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.at
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.au
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.aw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ax
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.az
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ba
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bb
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bd
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.be
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bh
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bi
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bj
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bo
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.br
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bs
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.by
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.bz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ca
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cd
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ch
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ci
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ck
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.co
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cv
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cx
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cy
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.cz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.de
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.dj
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.dk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.dm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.dz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ec
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ee
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.eg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.er
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.es
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.et
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fi
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fj
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fo
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.fr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ga
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gb
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gd
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ge
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gh
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gi
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gp
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gq
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.gy
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.hk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.hn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.hr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ht
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.hu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ic_do
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.iceland
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.id
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ie
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.il
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.im
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.india
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.io
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.iq
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ir
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.it
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.je
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.jm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.jo
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.jp
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ke
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kh
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ki
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.km
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kp
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ky
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.kz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.la
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lb
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.li
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ls
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.lv
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ly
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ma
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.md
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.me
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mh
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ml
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mo
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mp
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mq
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ms
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mv
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mx
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.my
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.mz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.na
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ne
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ng
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ni
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.no
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.np
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.nz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.om
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pa
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pe
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ph
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ps
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.pw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.py
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.qa
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.re
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ro
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.rs
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ru
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.rw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sa
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sb
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sd
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.se
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sh
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.si
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.so
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ss
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.st
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sv
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sx
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sy
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.sz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.td
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.th
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tj
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tl
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.to
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tr
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tv
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tw
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.tz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ua
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ug
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.us
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.uy
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.uz
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.va
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.vc
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ve
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.vg
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.vi
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.vn
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.vu
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.wf
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ws
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.xk
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.ye
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.yt
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.za
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.zm
import cmpcountrycodepickerdemo.cmpcountrycodepicker.generated.resources.zw
import network.chaintech.cmpcountrycodepicker.model.CountryDetails

internal object Utils {

    fun searchCountry(
        searchStr: String,
        countriesList: List<CountryDetails>,
    ): List<CountryDetails> {
        return countriesList.filter {
            it.countryName.contains(searchStr, ignoreCase = true)
                    || it.countryPhoneNumberCode.contains(searchStr, ignoreCase = true)
                    || it.countryCode.contains(searchStr, ignoreCase = true)
        }
    }

    fun getCountryFromCountryCode(
        countryCode: String,
        countriesList: List<CountryDetails>
    ): CountryDetails {
        return countriesList.single { it.countryCode == countryCode }
    }

    fun getCountryList(): List<CountryDetails> = listOf(
        CountryDetails(
            countryCode = "ad",
            "+376",
            "Andorra",
            Res.drawable.ad,
        ),
        CountryDetails(
            countryCode = "ae",
            "+971",
            "United Arab Emirates (UAE)",
            Res.drawable.ae,
        ),
        CountryDetails(
            countryCode = "af",
            "+93",
            "Afghanistan",
            Res.drawable.af,
        ),
        CountryDetails(
            countryCode = "ag",
            "+1",
            "Antigua and Barbuda",
            Res.drawable.ag,
        ),
        CountryDetails(
            "ai",
            "+1",
            "Anguilla",
            Res.drawable.ai,
        ),
        CountryDetails(
            "al",
            "+355",
            "Albania",
            Res.drawable.al,
        ),
        CountryDetails(
            "am",
            "+374",
            "Armenia",
            Res.drawable.am,
        ),
        CountryDetails(
            "ao",
            "+244",
            "Angola",
            Res.drawable.ao,
        ),
        CountryDetails(
            "aq",
            "+672",
            "Antarctica",
            Res.drawable.aq,
        ),
        CountryDetails(
            "ar",
            "+54",
            "Argentina",
            Res.drawable.ar,
        ),
        CountryDetails(
            "as",
            "+1",
            "American Samoa",
            Res.drawable.american_samoa
        ),
        CountryDetails(
            "at",
            "+43",
            "Austria",
            Res.drawable.at,
        ),
        CountryDetails(
            "au",
            "+61",
            "Australia",
            Res.drawable.au,
        ),
        CountryDetails(
            "aw",
            "+297",
            "Aruba",
            Res.drawable.aw,
        ),
        CountryDetails(
            "ax",
            "+358",
            "Åland Islands",
            Res.drawable.ax
        ),
        CountryDetails(
            "az",
            "+994",
            "Azerbaijan",
            Res.drawable.az
        ),
        CountryDetails(
            "ba",
            "+387",
            "Bosnia And Herzegovina",
            Res.drawable.ba
        ),
        CountryDetails(
            "bb",
            "+1",
            "Barbados",
            Res.drawable.bb
        ),
        CountryDetails(
            "bd",
            "+880",
            "Bangladesh",
            Res.drawable.bd
        ),
        CountryDetails(
            "be",
            "+32",
            "Belgium",
            Res.drawable.be
        ),
        CountryDetails(
            "bf",
            "+226",
            "Burkina Faso",
            Res.drawable.bf
        ),
        CountryDetails(
            "bg",
            "+359",
            "Bulgaria",
            Res.drawable.bg
        ),
        CountryDetails(
            "bh",
            "+973",
            "Bahrain",
            Res.drawable.bh
        ),
        CountryDetails(
            "bi",
            "+257",
            "Burundi",
            Res.drawable.bi
        ),
        CountryDetails(
            "bj",
            "+229",
            "Benin",
            Res.drawable.bj
        ),
        CountryDetails(
            "bl",
            "+590",
            "Saint Barthélemy",
            Res.drawable.bl
        ),
        CountryDetails(
            "bm",
            "+1",
            "Bermuda",
            Res.drawable.bm
        ),
        CountryDetails(
            "bn",
            "+673",
            "Brunei Darussalam",
            Res.drawable.bn
        ),
        CountryDetails(
            "bo",
            "+591",
            "Bolivia, Plurinational State Of",
            Res.drawable.bo
        ),
        CountryDetails(
            "br",
            "+55",
            "Brazil",
            Res.drawable.br
        ),
        CountryDetails(
            "bs",
            "+1",
            "Bahamas",
            Res.drawable.bs
        ),
        CountryDetails(
            "bt",
            "+975",
            "Bhutan",
            Res.drawable.bt
        ),
        CountryDetails(
            "bw",
            "+267",
            "Botswana",
            Res.drawable.bw
        ),
        CountryDetails(
            "by",
            "+375",
            "Belarus",
            Res.drawable.by
        ),
        CountryDetails(
            "bz",
            "+501",
            "Belize",
            Res.drawable.bz
        ),
        CountryDetails(
            "ca",
            "+1",
            "Canada",
            Res.drawable.ca
        ),
        CountryDetails(
            "cc",
            "+61",
            "Cocos (keeling) Islands",
            Res.drawable.cc
        ),
        CountryDetails(
            "cd",
            "+243",
            "Congo, The Democratic Republic Of The",
            Res.drawable.cd
        ),
        CountryDetails(
            "cf",
            "+236",
            "Central African Republic",
            Res.drawable.cf
        ),
        CountryDetails(
            "cg",
            "+242",
            "Congo",
            Res.drawable.cg
        ),
        CountryDetails(
            "ch",
            "+41",
            "Switzerland",
            Res.drawable.ch
        ),
        CountryDetails(
            "ci",
            "+225",
            "Côte D'ivoire",
            Res.drawable.ci
        ),
        CountryDetails(
            "ck",
            "+682",
            "Cook Islands",
            Res.drawable.ck
        ),
        CountryDetails(
            "cl",
            "+56",
            "Chile",
            Res.drawable.cl
        ),
        CountryDetails(
            "cm",
            "+237",
            "Cameroon",
            Res.drawable.cm
        ),
        CountryDetails(
            "cn",
            "+86",
            "China",
            Res.drawable.cn
        ),
        CountryDetails(
            "co",
            "+57",
            "Colombia",
            Res.drawable.co
        ),
        CountryDetails(
            "cr",
            "+506",
            "Costa Rica",
            Res.drawable.cr
        ),
        CountryDetails(
            "cu",
            "+53",
            "Cuba",
            Res.drawable.cu
        ),
        CountryDetails(
            "cv",
            "+238",
            "Cape Verde",
            Res.drawable.cv
        ),
        CountryDetails(
            "cw",
            "+599",
            "Curaçao",
            Res.drawable.cw
        ),
        CountryDetails(
            "cx",
            "+61",
            "Christmas Island",
            Res.drawable.cx
        ),
        CountryDetails(
            "cy",
            "+357",
            "Cyprus",
            Res.drawable.cy
        ),
        CountryDetails(
            "cz",
            "+420",
            "Czech Republic",
            Res.drawable.cz
        ),
        CountryDetails(
            "de",
            "+49",
            "Germany",
            Res.drawable.de
        ),
        CountryDetails(
            "dj",
            "+253",
            "Djibouti",
            Res.drawable.dj
        ),
        CountryDetails(
            "dk",
            "+45",
            "Denmark",
            Res.drawable.dk
        ),
        CountryDetails(
            "dm",
            "+1",
            "Dominica",
            Res.drawable.dm
        ),
        CountryDetails(
            "do",
            "+1",
            "Dominican Republic",
            Res.drawable.ic_do
        ),
        CountryDetails(
            "dz",
            "+213",
            "Algeria",
            Res.drawable.dz
        ),
        CountryDetails(
            "ec",
            "+593",
            "Ecuador",
            Res.drawable.ec
        ),
        CountryDetails(
            "ee",
            "+372",
            "Estonia",
            Res.drawable.ee
        ),
        CountryDetails(
            "eg",
            "+20",
            "Egypt",
            Res.drawable.eg
        ),
        CountryDetails(
            "er",
            "+291",
            "Eritrea",
            Res.drawable.er
        ),
        CountryDetails(
            "es",
            "+34",
            "Spain",
            Res.drawable.es
        ),
        CountryDetails(
            "et",
            "+251",
            "Ethiopia",
            Res.drawable.et
        ),
        CountryDetails(
            "fi",
            "+358",
            "Finland",
            Res.drawable.fi
        ),
        CountryDetails(
            "fj",
            "+679",
            "Fiji",
            Res.drawable.fj
        ),
        CountryDetails(
            "fk",
            "+500",
            "Falkland Islands (Malvinas)",
            Res.drawable.fk
        ),
        CountryDetails(
            "fm",
            "+691",
            "Micronesia, Federated States Of",
            Res.drawable.fm
        ),
        CountryDetails(
            "fo",
            "+298",
            "Faroe Islands",
            Res.drawable.fo
        ),
        CountryDetails(
            "fr",
            "+33",
            "France",
            Res.drawable.fr
        ),
        CountryDetails(
            "ga",
            "+241",
            "Gabon",
            Res.drawable.ga
        ),
        CountryDetails(
            "gb",
            "+44",
            "United Kingdom",
            Res.drawable.gb
        ),
        CountryDetails(
            "gd",
            "+1",
            "Grenada",
            Res.drawable.gd
        ),
        CountryDetails(
            "ge",
            "+995",
            "Georgia",
            Res.drawable.ge
        ),
        CountryDetails(
            "gf",
            "+594",
            "French Guyana",
            Res.drawable.gf
        ),
        CountryDetails(
            "gh",
            "+233",
            "Ghana",
            Res.drawable.gh
        ),
        CountryDetails(
            "gi",
            "+350",
            "Gibraltar",
            Res.drawable.gi
        ),
        CountryDetails(
            "gl",
            "+299",
            "Greenland",
            Res.drawable.gl
        ),
        CountryDetails(
            "gm",
            "+220",
            "Gambia",
            Res.drawable.gm
        ),
        CountryDetails(
            "gn",
            "+224",
            "Guinea",
            Res.drawable.gn
        ),
        CountryDetails(
            "gp",
            "+450",
            "Guadeloupe",
            Res.drawable.gp
        ),
        CountryDetails(
            "gq",
            "+240",
            "Equatorial Guinea",
            Res.drawable.gq
        ),
        CountryDetails(
            "gr",
            "+30",
            "Greece",
            Res.drawable.gr
        ),
        CountryDetails(
            "gt",
            "+502",
            "Guatemala",
            Res.drawable.gt
        ),
        CountryDetails(
            "gu",
            "+1",
            "Guam",
            Res.drawable.gu
        ),
        CountryDetails(
            "gw",
            "+245",
            "Guinea-Bissau",
            Res.drawable.gw
        ),
        CountryDetails(
            "gy",
            "+592",
            "Guyana",
            Res.drawable.gy
        ),
        CountryDetails(
            "hk",
            "+852",
            "Hong Kong",
            Res.drawable.hk
        ),
        CountryDetails(
            "hn",
            "+504",
            "Honduras",
            Res.drawable.hn
        ),
        CountryDetails(
            "hr",
            "+385",
            "Croatia",
            Res.drawable.hr
        ),
        CountryDetails(
            "ht",
            "+509",
            "Haiti",
            Res.drawable.ht
        ),
        CountryDetails(
            "hu",
            "+36",
            "Hungary",
            Res.drawable.hu
        ),
        CountryDetails(
            "id",
            "+62",
            "Indonesia",
            Res.drawable.id
        ),
        CountryDetails(
            "ie",
            "+353",
            "Ireland",
            Res.drawable.ie
        ),
        CountryDetails(
            "il",
            "+972",
            "Israel",
            Res.drawable.il
        ),
        CountryDetails(
            "im",
            "+44",
            "Isle Of Man",
            Res.drawable.im
        ),
        CountryDetails(
            "is",
            "+354",
            "Iceland",
            Res.drawable.iceland
        ),
        CountryDetails(
            "in",
            "+91",
            "India",
            Res.drawable.india
        ),
        CountryDetails(
            "io",
            "+246",
            "British Indian Ocean Territory",
            Res.drawable.io
        ),
        CountryDetails(
            "iq",
            "+964",
            "Iraq",
            Res.drawable.iq
        ),
        CountryDetails(
            "ir",
            "+98",
            "Iran, Islamic Republic Of",
            Res.drawable.ir
        ),
        CountryDetails(
            "it",
            "+39",
            "Italy",
            Res.drawable.it
        ),
        CountryDetails(
            "je",
            "+44",
            "Jersey",
            Res.drawable.je
        ),
        CountryDetails(
            "jm",
            "+1",
            "Jamaica",
            Res.drawable.jm
        ),
        CountryDetails(
            "jo",
            "+962",
            "Jordan",
            Res.drawable.jo
        ),
        CountryDetails(
            "jp",
            "+81",
            "Japan",
            Res.drawable.jp
        ),
        CountryDetails(
            "ke",
            "+254",
            "Kenya",
            Res.drawable.ke
        ),
        CountryDetails(
            "kg",
            "+996",
            "Kyrgyzstan",
            Res.drawable.kg
        ),
        CountryDetails(
            "kh",
            "+855",
            "Cambodia",
            Res.drawable.kh
        ),
        CountryDetails(
            "ki",
            "+686",
            "Kiribati",
            Res.drawable.ki
        ),
        CountryDetails(
            "km",
            "+269",
            "Comoros",
            Res.drawable.km
        ),
        CountryDetails(
            "kn",
            "+1",
            "Saint Kitts and Nevis",
            Res.drawable.kn
        ),
        CountryDetails(
            "kp",
            "+850",
            "North Korea",
            Res.drawable.kp
        ),
        CountryDetails(
            "kr",
            "+82",
            "South Korea",
            Res.drawable.kr
        ),
        CountryDetails(
            "kw",
            "+965",
            "Kuwait",
            Res.drawable.kw
        ),
        CountryDetails(
            "ky",
            "+1",
            "Cayman Islands",
            Res.drawable.ky
        ),
        CountryDetails(
            "kz",
            "+7",
            "Kazakhstan",
            Res.drawable.kz
        ),
        CountryDetails(
            "la",
            "+856",
            "Lao People's Democratic Republic",
            Res.drawable.la
        ),
        CountryDetails(
            "lb",
            "+961",
            "Lebanon",
            Res.drawable.lb
        ),
        CountryDetails(
            "lc",
            "+1",
            "Saint Lucia",
            Res.drawable.lc
        ),
        CountryDetails(
            "li",
            "+423",
            "Liechtenstein",
            Res.drawable.li
        ),
        CountryDetails(
            "lk",
            "+94",
            "Sri Lanka",
            Res.drawable.lk
        ),
        CountryDetails(
            "lr",
            "+231",
            "Liberia",
            Res.drawable.lr
        ),
        CountryDetails(
            "ls",
            "+266",
            "Lesotho",
            Res.drawable.ls
        ),
        CountryDetails(
            "lt",
            "+370",
            "Lithuania",
            Res.drawable.lt
        ),
        CountryDetails(
            "lu",
            "+352",
            "Luxembourg",
            Res.drawable.lu
        ),
        CountryDetails(
            "lv",
            "+371",
            "Latvia",
            Res.drawable.lv
        ),
        CountryDetails(
            "ly",
            "+218",
            "Libya",
            Res.drawable.ly
        ),
        CountryDetails(
            "ma",
            "+212",
            "Morocco",
            Res.drawable.ma
        ),
        CountryDetails(
            "mc",
            "+377",
            "Monaco",
            Res.drawable.mc
        ),
        CountryDetails(
            "md",
            "+373",
            "Moldova, Republic Of",
            Res.drawable.md
        ),
        CountryDetails(
            "me",
            "+382",
            "Montenegro",
            Res.drawable.me
        ),
        CountryDetails(
            "mf",
            "+590",
            "Saint Martin",
            Res.drawable.mf
        ),
        CountryDetails(
            "mg",
            "+261",
            "Madagascar",
            Res.drawable.mg
        ),
        CountryDetails(
            "mh",
            "+692",
            "Marshall Islands",
            Res.drawable.mh
        ),
        CountryDetails(
            "mk",
            "+389",
            "Macedonia (FYROM)",
            Res.drawable.mk
        ),
        CountryDetails(
            "ml",
            "+223",
            "Mali",
            Res.drawable.ml
        ),
        CountryDetails(
            "mm",
            "+95",
            "Myanmar",
            Res.drawable.mm
        ),
        CountryDetails(
            "mn",
            "+976",
            "Mongolia",
            Res.drawable.mn
        ),
        CountryDetails(
            "mo",
            "+853",
            "Macau",
            Res.drawable.mo
        ),
        CountryDetails(
            "mp",
            "+1",
            "Northern Mariana Islands",
            Res.drawable.mp
        ),
        CountryDetails(
            "mq",
            "+596",
            "Martinique",
            Res.drawable.mq
        ),
        CountryDetails(
            "mr",
            "+222",
            "Mauritania",
            Res.drawable.mr
        ),
        CountryDetails(
            "ms",
            "+1",
            "Montserrat",
            Res.drawable.ms
        ),
        CountryDetails(
            "mt",
            "+356",
            "Malta",
            Res.drawable.mt
        ),
        CountryDetails(
            "mu",
            "+230",
            "Mauritius",
            Res.drawable.mu
        ),
        CountryDetails(
            "mv",
            "+960",
            "Maldives",
            Res.drawable.mv
        ),
        CountryDetails(
            "mw",
            "+265",
            "Malawi",
            Res.drawable.mw
        ),
        CountryDetails(
            "mx",
            "+52",
            "Mexico",
            Res.drawable.mx
        ),
        CountryDetails(
            "my",
            "+60",
            "Malaysia",
            Res.drawable.my
        ),
        CountryDetails(
            "mz",
            "+258",
            "Mozambique",
            Res.drawable.mz
        ),
        CountryDetails(
            "na",
            "+264",
            "Namibia",
            Res.drawable.na
        ),
        CountryDetails(
            "nc",
            "+687",
            "New Caledonia",
            Res.drawable.nc
        ),
        CountryDetails(
            "ne",
            "+227",
            "Niger",
            Res.drawable.ne
        ),
        CountryDetails(
            "nf",
            "+672",
            "Norfolk Islands",
            Res.drawable.nf
        ),
        CountryDetails(
            "ng",
            "+234",
            "Nigeria",
            Res.drawable.ng
        ),
        CountryDetails(
            "ni",
            "+505",
            "Nicaragua",
            Res.drawable.ni
        ),
        CountryDetails(
            "nl",
            "+31",
            "Netherlands",
            Res.drawable.nl
        ),
        CountryDetails(
            "no",
            "+47",
            "Norway",
            Res.drawable.no
        ),
        CountryDetails(
            "np",
            "+977",
            "Nepal",
            Res.drawable.np
        ),
        CountryDetails(
            "nr",
            "+674",
            "Nauru",
            Res.drawable.nr
        ),
        CountryDetails(
            "nu",
            "+683",
            "Niue",
            Res.drawable.nu
        ),
        CountryDetails(
            "nz",
            "+64",
            "New Zealand",
            Res.drawable.nz
        ),
        CountryDetails(
            "om",
            "+968",
            "Oman",
            Res.drawable.om
        ),
        CountryDetails(
            "pa",
            "+507",
            "Panama",
            Res.drawable.pa
        ),
        CountryDetails(
            "pe",
            "+51",
            "Peru",
            Res.drawable.pe
        ),
        CountryDetails(
            "pf",
            "+689",
            "French Polynesia",
            Res.drawable.pf
        ),
        CountryDetails(
            "pg",
            "+675",
            "Papua New Guinea",
            Res.drawable.pg
        ),
        CountryDetails(
            "ph",
            "+63",
            "Philippines",
            Res.drawable.ph
        ),
        CountryDetails(
            "pk",
            "+92",
            "Pakistan",
            Res.drawable.pk
        ),
        CountryDetails(
            "pl",
            "+48",
            "Poland",
            Res.drawable.pl
        ),
        CountryDetails(
            "pm",
            "+508",
            "Saint Pierre And Miquelon",
            Res.drawable.pm
        ),
        CountryDetails(
            "pn",
            "+870",
            "Pitcairn Islands",
            Res.drawable.pn
        ),
        CountryDetails(
            "pr",
            "+1",
            "Puerto Rico",
            Res.drawable.pr
        ),
        CountryDetails(
            "ps",
            "+970",
            "Palestine",
            Res.drawable.ps
        ),
        CountryDetails(
            "pt",
            "+351",
            "Portugal",
            Res.drawable.pt
        ),
        CountryDetails(
            "pw",
            "+680",
            "Palau",
            Res.drawable.pw
        ),
        CountryDetails(
            "py",
            "+595",
            "Paraguay",
            Res.drawable.py
        ),
        CountryDetails(
            "qa",
            "+974",
            "Qatar",
            Res.drawable.qa
        ),
        CountryDetails(
            "re",
            "+262",
            "Réunion",
            Res.drawable.re
        ),
        CountryDetails(
            "ro",
            "+40",
            "Romania",
            Res.drawable.ro
        ),
        CountryDetails(
            "rs",
            "+381",
            "Serbia",
            Res.drawable.rs
        ),
        CountryDetails(
            "ru",
            "+7",
            "Russian Federation",
            Res.drawable.ru
        ),
        CountryDetails(
            "rw",
            "+250",
            "Rwanda",
            Res.drawable.rw
        ),
        CountryDetails(
            "sa",
            "+966",
            "Saudi Arabia",
            Res.drawable.sa
        ),
        CountryDetails(
            "sb",
            "+677",
            "Solomon Islands",
            Res.drawable.sb
        ),
        CountryDetails(
            "sc",
            "+248",
            "Seychelles",
            Res.drawable.sc
        ),
        CountryDetails(
            "sd",
            "+249",
            "Sudan",
            Res.drawable.sd
        ),
        CountryDetails(
            "se",
            "+46",
            "Sweden",
            Res.drawable.se
        ),
        CountryDetails(
            "sg",
            "+65",
            "Singapore",
            Res.drawable.sg
        ),
        CountryDetails(
            "sh",
            "+290",
            "Saint Helena, Ascension And Tristan Da Cunha",
            Res.drawable.sh
        ),
        CountryDetails(
            "si",
            "+386",
            "Slovenia",
            Res.drawable.si
        ),
        CountryDetails(
            "sk",
            "+421",
            "Slovakia",
            Res.drawable.sk
        ),
        CountryDetails(
            "sl",
            "+232",
            "Sierra Leone",
            Res.drawable.sl
        ),
        CountryDetails(
            "sm",
            "+378",
            "San Marino",
            Res.drawable.sm
        ),
        CountryDetails(
            "sn",
            "+221",
            "Senegal",
            Res.drawable.sn
        ),
        CountryDetails(
            "so",
            "+252",
            "Somalia",
            Res.drawable.so
        ),
        CountryDetails(
            "sr",
            "+597",
            "Suriname",
            Res.drawable.sr
        ),
        CountryDetails(
            "ss",
            "+211",
            "South Sudan",
            Res.drawable.ss
        ),
        CountryDetails(
            "st",
            "+239",
            "Sao Tome And Principe",
            Res.drawable.st
        ),
        CountryDetails(
            "sv",
            "+503",
            "El Salvador",
            Res.drawable.sv
        ),
        CountryDetails(
            "sx",
            "+1",
            "Sint Maarten",
            Res.drawable.sx
        ),
        CountryDetails(
            "sy",
            "+963",
            "Syrian Arab Republic",
            Res.drawable.sy
        ),
        CountryDetails(
            "sz",
            "+268",
            "Swaziland",
            Res.drawable.sz
        ),
        CountryDetails(
            "tc",
            "+1",
            "Turks and Caicos Islands",
            Res.drawable.tc
        ),
        CountryDetails(
            "td",
            "+235",
            "Chad",
            Res.drawable.td
        ),
        CountryDetails(
            "tg",
            "+228",
            "Togo",
            Res.drawable.tg
        ),
        CountryDetails(
            "th",
            "+66",
            "Thailand",
            Res.drawable.th
        ),
        CountryDetails(
            "tj",
            "+992",
            "Tajikistan",
            Res.drawable.tj
        ),
        CountryDetails(
            "tk",
            "+690",
            "Tokelau",
            Res.drawable.tk
        ),
        CountryDetails(
            "tl",
            "+670",
            "Timor-leste",
            Res.drawable.tl
        ),
        CountryDetails(
            "tm",
            "+993",
            "Turkmenistan",
            Res.drawable.tm
        ),
        CountryDetails(
            "tn",
            "+216",
            "Tunisia",
            Res.drawable.tn
        ),
        CountryDetails(
            "to",
            "+676",
            "Tonga",
            Res.drawable.to
        ),
        CountryDetails(
            "tr",
            "+90",
            "Turkey",
            Res.drawable.tr
        ),
        CountryDetails(
            "tt",
            "+1",
            "Trinidad &amp; Tobago",
            Res.drawable.tt
        ),
        CountryDetails(
            "tv",
            "+688",
            "Tuvalu",
            Res.drawable.tv
        ),
        CountryDetails(
            "tw",
            "+886",
            "Taiwan",
            Res.drawable.tw
        ),
        CountryDetails(
            "tz",
            "+255",
            "Tanzania, United Republic Of",
            Res.drawable.tz
        ),
        CountryDetails(
            "ua",
            "+380",
            "Ukraine",
            Res.drawable.ua
        ),
        CountryDetails(
            "ug",
            "+256",
            "Uganda",
            Res.drawable.ug
        ),
        CountryDetails(
            "us",
            "+1",
            "United States",
            Res.drawable.us
        ),
        CountryDetails(
            "uy",
            "+598",
            "Uruguay",
            Res.drawable.uy
        ),
        CountryDetails(
            "uz",
            "+998",
            "Uzbekistan",
            Res.drawable.uz
        ),
        CountryDetails(
            "va",
            "+379",
            "Holy See (vatican City State)",
            Res.drawable.va
        ),
        CountryDetails(
            "vc",
            "+1",
            "Saint Vincent &amp; The Grenadines",
            Res.drawable.vc
        ),
        CountryDetails(
            "ve",
            "+58",
            "Venezuela, Bolivarian Republic Of",
            Res.drawable.ve
        ),
        CountryDetails(
            "vg",
            "+1",
            "British Virgin Islands",
            Res.drawable.vg
        ),
        CountryDetails(
            "vi",
            "+1",
            "US Virgin Islands",
            Res.drawable.vi
        ),
        CountryDetails(
            "vn",
            "+84",
            "Vietnam",
            Res.drawable.vn
        ),
        CountryDetails(
            "vu",
            "+678",
            "Vanuatu",
            Res.drawable.vu
        ),
        CountryDetails(
            "wf",
            "+681",
            "Wallis And Futuna",
            Res.drawable.wf
        ),
        CountryDetails(
            "ws",
            "4685",
            "Samoa",
            Res.drawable.ws
        ),
        CountryDetails(
            "xk",
            "+383",
            "Kosovo",
            Res.drawable.xk
        ),
        CountryDetails(
            "ye",
            "+967",
            "Yemen",
            Res.drawable.ye
        ),
        CountryDetails(
            "yt",
            "+262",
            "Mayotte",
            Res.drawable.yt
        ),
        CountryDetails(
            "za",
            "+27",
            "South Africa",
            Res.drawable.za
        ),
        CountryDetails(
            "zm",
            "+260",
            "Zambia",
            Res.drawable.zm
        ),
        CountryDetails(
            "zw",
            "+263",
            "Zimbabwe",
            Res.drawable.zw
        ),
    ).sortedBy { it.countryName }

    fun Modifier.noRippleClickable(
        onClick: () -> Unit
    ) = composed {
        this.clickable(
            indication = null,
            interactionSource = remember { MutableInteractionSource() }
        ) {
            onClick()
        }
    }
}