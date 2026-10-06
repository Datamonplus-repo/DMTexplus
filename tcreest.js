gx.evt.autoSkip = false;
gx.define('tcreest', false, function () {
   this.ServerClass =  "tcreest" ;
   this.PackageName =  "app" ;
   this.ServerFullClass =  "app.tcreest" ;
   this.setObjectType("trn");
   this.setOnAjaxSessionTimeout("Warn");
   this.hasEnterEvent = true;
   this.skipOnEnter = false;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.DSO =  "WorkWithPlusThemeDS" ;
   this.SetStandaloneVars=function()
   {
      this.AV32Pgmname=gx.fn.getControlValue("vPGMNAME") ;
   };
   this.Valid_Emprcod=function()
   {
      return this.validCliEvt("Valid_Emprcod", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("EMPRCOD");
         this.AnyError  = 0;

      }
      catch(e){}
      try {
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.Valid_Barcod=function()
   {
      return this.validCliEvt("Valid_Barcod", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("BARCOD");
         this.AnyError  = 0;

      }
      catch(e){}
      try {
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.Valid_Barcodreo=function()
   {
      return this.validCliEvt("Valid_Barcodreo", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("BARCODREO");
         this.AnyError  = 0;

      }
      catch(e){}
      try {
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.Valid_Barcodpar=function()
   {
      return this.validSrvEvt("valid_Barcodpar", 0).then((function (ret) {
      return ret;
      }).closure(this));
   }
   this.Valid_Recestncol=function()
   {
      return this.validCliEvt("Valid_Recestncol", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("RECESTNCOL");
         this.AnyError  = 0;

      }
      catch(e){}
      try {
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.Valid_Recestnpro=function()
   {
      return this.validSrvEvt("valid_Recestnpro", 0).then((function (ret) {
      return ret;
      }).closure(this));
   }
   this.Valid_Proforcod=function()
   {
      return this.validSrvEvt("valid_Proforcod", 0).then((function (ret) {
      return ret;
      }).closure(this));
   }
   this.e121g11593_client=function()
   {
      return this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e131g11593_client=function()
   {
      return this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,5,6,7,8,9,15,18,20,23,25,28,30,33,35,38,40,43,45,46,49,51,54,56,59,61,64,65,66,67,68];
   this.GXLastCtrlId =68;
   GXValidFnc[2]={ id: 2, fld:"TABLE1",grid:0};
   GXValidFnc[5]={ id: 5, fld:"BTN_FIRST",grid:0,evt:"e141g11593_client",std:"FIRST"};
   GXValidFnc[6]={ id: 6, fld:"BTN_PREVIOUS",grid:0,evt:"e151g11593_client",std:"PREVIOUS"};
   GXValidFnc[7]={ id: 7, fld:"BTN_NEXT",grid:0,evt:"e161g11593_client",std:"NEXT"};
   GXValidFnc[8]={ id: 8, fld:"BTN_LAST",grid:0,evt:"e171g11593_client",std:"LAST"};
   GXValidFnc[9]={ id: 9, fld:"BTN_SELECT",grid:0,evt:"e181g11593_client",std:"SELECT"};
   GXValidFnc[15]={ id: 15, fld:"TABLE2",grid:0};
   GXValidFnc[18]={ id: 18, fld:"TEXTBLOCK1", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[20]={ id:20 ,lvl:0,type:"char",len:3,dec:0,sign:false,pic:"@!",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Emprcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"EMPRCOD",fmt:0,gxz:"Z396EmprCod",gxold:"O396EmprCod",gxvar:"A396EmprCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A396EmprCod=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z396EmprCod=Value},v2c:function(){gx.fn.setControlValue("EMPRCOD",gx.O.A396EmprCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A396EmprCod=this.val()},val:function(){return gx.fn.getControlValue("EMPRCOD")},nac:gx.falseFn};
   GXValidFnc[23]={ id: 23, fld:"TEXTBLOCK2", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[25]={ id:25 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCOD",fmt:0,gxz:"Z129BarCod",gxold:"O129BarCod",gxvar:"A129BarCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A129BarCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z129BarCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCOD",gx.O.A129BarCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A129BarCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[28]={ id: 28, fld:"TEXTBLOCK3", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[30]={ id:30 ,lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodreo,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODREO",fmt:0,gxz:"Z132BarCodReo",gxold:"O132BarCodReo",gxvar:"A132BarCodReo",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A132BarCodReo=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z132BarCodReo=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCODREO",gx.O.A132BarCodReo,0)},c2v:function(){if(this.val()!==undefined)gx.O.A132BarCodReo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCODREO",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[33]={ id: 33, fld:"TEXTBLOCK4", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[35]={ id:35 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodpar,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODPAR",fmt:0,gxz:"Z130BarCodPar",gxold:"O130BarCodPar",gxvar:"A130BarCodPar",ucs:[],op:[],ip:[35,30,25,20],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A130BarCodPar=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z130BarCodPar=Value},v2c:function(){gx.fn.setControlValue("BARCODPAR",gx.O.A130BarCodPar,0)},c2v:function(){if(this.val()!==undefined)gx.O.A130BarCodPar=this.val()},val:function(){return gx.fn.getControlValue("BARCODPAR")},nac:gx.falseFn};
   GXValidFnc[38]={ id: 38, fld:"TEXTBLOCK5", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[40]={ id:40 ,lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Recestncol,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RECESTNCOL",fmt:0,gxz:"Z4075recestncol",gxold:"O4075recestncol",gxvar:"A4075recestncol",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A4075recestncol=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z4075recestncol=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("RECESTNCOL",gx.O.A4075recestncol,0)},c2v:function(){if(this.val()!==undefined)gx.O.A4075recestncol=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("RECESTNCOL",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[43]={ id: 43, fld:"TEXTBLOCK6", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[45]={ id:45 ,lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Recestnpro,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RECESTNPRO",fmt:0,gxz:"Z4076recestnpro",gxold:"O4076recestnpro",gxvar:"A4076recestnpro",ucs:[],op:[56,51],ip:[56,51,45,40,35,30,25,20],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A4076recestnpro=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z4076recestnpro=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("RECESTNPRO",gx.O.A4076recestnpro,0)},c2v:function(){if(this.val()!==undefined)gx.O.A4076recestnpro=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("RECESTNPRO",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[46]={ id: 46, fld:"BTN_GET",grid:0,evt:"e191g11593_client",std:"GET"};
   GXValidFnc[49]={ id: 49, fld:"TEXTBLOCK7", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[51]={ id:51 ,lvl:0,type:"char",len:1,dec:0,sign:false,pic:"'E' 'T'",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"RECESTTIP",fmt:0,gxz:"Z4077recesttip",gxold:"O4077recesttip",gxvar:"A4077recesttip",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A4077recesttip=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z4077recesttip=Value},v2c:function(){gx.fn.setControlValue("RECESTTIP",gx.O.A4077recesttip,0)},c2v:function(){if(this.val()!==undefined)gx.O.A4077recesttip=this.val()},val:function(){return gx.fn.getControlValue("RECESTTIP")},nac:gx.falseFn};
   GXValidFnc[54]={ id: 54, fld:"TEXTBLOCK8", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[56]={ id:56 ,lvl:0,type:"char",len:6,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Proforcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"PROFORCOD",fmt:0,gxz:"Z764ProForCod",gxold:"O764ProForCod",gxvar:"A764ProForCod",ucs:[],op:[],ip:[56,20],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A764ProForCod=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z764ProForCod=Value},v2c:function(){gx.fn.setControlValue("PROFORCOD",gx.O.A764ProForCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A764ProForCod=this.val()},val:function(){return gx.fn.getControlValue("PROFORCOD")},nac:gx.falseFn};
   GXValidFnc[59]={ id: 59, fld:"TEXTBLOCK9", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[61]={ id:61 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"EMPRNOM",fmt:0,gxz:"Z407EmprNom",gxold:"O407EmprNom",gxvar:"A407EmprNom",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A407EmprNom=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z407EmprNom=Value},v2c:function(){gx.fn.setControlValue("EMPRNOM",gx.O.A407EmprNom,0)},c2v:function(){if(this.val()!==undefined)gx.O.A407EmprNom=this.val()},val:function(){return gx.fn.getControlValue("EMPRNOM")},nac:gx.falseFn};
   GXValidFnc[64]={ id: 64, fld:"BTN_ENTER",grid:0,evt:"e121g11593_client",std:"ENTER"};
   GXValidFnc[65]={ id: 65, fld:"BTN_CHECK",grid:0,evt:"e201g11593_client",std:"CHECK"};
   GXValidFnc[66]={ id: 66, fld:"BTN_CANCEL",grid:0,evt:"e131g11593_client"};
   GXValidFnc[67]={ id: 67, fld:"BTN_DELETE",grid:0,evt:"e211g11593_client",std:"DELETE"};
   GXValidFnc[68]={ id: 68, fld:"BTN_HELP",grid:0,evt:"e221g11593_client"};
   this.A396EmprCod = "" ;
   this.Z396EmprCod = "" ;
   this.O396EmprCod = "" ;
   this.A129BarCod = 0 ;
   this.Z129BarCod = 0 ;
   this.O129BarCod = 0 ;
   this.A132BarCodReo = 0 ;
   this.Z132BarCodReo = 0 ;
   this.O132BarCodReo = 0 ;
   this.A130BarCodPar = "" ;
   this.Z130BarCodPar = "" ;
   this.O130BarCodPar = "" ;
   this.A4075recestncol = 0 ;
   this.Z4075recestncol = 0 ;
   this.O4075recestncol = 0 ;
   this.A4076recestnpro = 0 ;
   this.Z4076recestnpro = 0 ;
   this.O4076recestnpro = 0 ;
   this.A4077recesttip = "" ;
   this.Z4077recesttip = "" ;
   this.O4077recesttip = "" ;
   this.A764ProForCod = "" ;
   this.Z764ProForCod = "" ;
   this.O764ProForCod = "" ;
   this.A407EmprNom = "" ;
   this.Z407EmprNom = "" ;
   this.O407EmprNom = "" ;
   this.AV7Lit0 = "" ;
   this.AV10Lit1 = "" ;
   this.AV9LitFe = "" ;
   this.AV12Station = "" ;
   this.A396EmprCod = "" ;
   this.AV11EmprNom = "" ;
   this.AV8UsurCod = "" ;
   this.A129BarCod = 0 ;
   this.A132BarCodReo = 0 ;
   this.A130BarCodPar = "" ;
   this.A4075recestncol = 0 ;
   this.A4076recestnpro = 0 ;
   this.AV32Pgmname = "" ;
   this.A4077recesttip = "" ;
   this.A764ProForCod = "" ;
   this.A407EmprNom = "" ;
   this.Events = {"e121g11593_client": ["ENTER", true] ,"e131g11593_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true}],[]];
   this.EvtParms["REFRESH"] = [[],[]];
   this.EvtParms["VALID_EMPRCOD"] = [[],[]];
   this.EvtParms["VALID_BARCOD"] = [[],[]];
   this.EvtParms["VALID_BARCODREO"] = [[],[]];
   this.EvtParms["VALID_BARCODPAR"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}],[]];
   this.EvtParms["VALID_RECESTNCOL"] = [[],[]];
   this.EvtParms["VALID_RECESTNPRO"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A4075recestncol',fld:'RECESTNCOL',pic:'Z9'},{av:'A4076recestnpro',fld:'RECESTNPRO',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}],[{av:'A4077recesttip',fld:'RECESTTIP',pic:''E' 'T''},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z4075recestncol'},{av:'Z4076recestnpro'},{av:'Z4077recesttip'},{av:'Z764ProForCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]];
   this.EvtParms["VALID_PROFORCOD"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''}],[]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.CheckCtrl = ["BTN_CHECK"];
   this.setVCMap("AV32Pgmname", "vPGMNAME", 0, "char", 129, 0);
   this.Initialize( );
});
gx.wi( function() { gx.createParentObj(this.tcreest);});
