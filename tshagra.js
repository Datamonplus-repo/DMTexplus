gx.evt.autoSkip = false;
gx.define('tshagra', false, function () {
   this.ServerClass =  "tshagra" ;
   this.PackageName =  "app" ;
   this.ServerFullClass =  "app.tshagra" ;
   this.setObjectType("trn");
   this.setOnAjaxSessionTimeout("Warn");
   this.anyGridBaseTable = true;
   this.hasEnterEvent = true;
   this.skipOnEnter = false;
   this.fullAjax = true;
   this.supportAjaxEvents =  true ;
   this.ajaxSecurityToken =  true ;
   this.DSO =  "WorkWithPlusThemeDS" ;
   this.SetStandaloneVars=function()
   {
      this.A361DisCod=gx.fn.getIntegerValue("DISCOD",gx.thousandSeparator) ;
      this.A7041ShaDibCli=gx.fn.getControlValue("SHADIBCLI") ;
      this.A7042ShaDibInt=gx.fn.getIntegerValue("SHADIBINT",gx.thousandSeparator) ;
      this.AV33OGSCod=gx.fn.getIntegerValue("vOGSCOD",gx.thousandSeparator) ;
      this.Gx_mode=gx.fn.getControlValue("vMODE") ;
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
   this.Valid_Ogscod=function()
   {
      return this.validCliEvt("Valid_Ogscod", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("OGSCOD");
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
   this.Valid_Clicod=function()
   {
      return this.validCliEvt("Valid_Clicod", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("CLICOD");
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
   this.Valid_Dibcli=function()
   {
      return this.validCliEvt("Valid_Dibcli", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("DIBCLI");
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
   this.Valid_Dibint=function()
   {
      return this.validCliEvt("Valid_Dibint", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("DIBINT");
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
   this.Valid_Shacod=function()
   {
      var currentRow = gx.fn.currentGridRowImpl(164);
      if(  gx.fn.currentGridRowImpl(164) ===0) {
         return true;
      }
      var gxballoon = gx.util.balloon.getNew("SHACOD", gx.fn.currentGridRowImpl(164));
      if ( gx.fn.gridDuplicateKey(166) )
      {
         gxballoon.setError(gx.text.format( gx.getMessage( "GXM_1004"), gx.getMessage( "Level1"), "", "", "", "", "", "", "", ""));
         this.AnyError = gx.num.trunc( 1 ,0) ;
         return gxballoon.show();
      }
      return this.validSrvEvt("valid_Shacod", 164).then((function (ret) {
      try {
         this.sMode997 =  this.Gx_mode  ;
         this.Gx_mode =  gx.fn.getGridRowMode(997,164)  ;
         this.standaloneModalXL997( );
         this.standaloneNotModalXL997( );
      } finally {
         this.Gx_mode =  this.sMode997  ;
      }
      return ret;
      }).closure(this));
   }
   this.standaloneModalXL997=function()
   {
      try {
         if ( gx.text.compare( this.Gx_mode , "INS" ) != 0 )
         {
            gx.fn.setCtrlProperty("SHACOD","Enabled", 0 );
         }
         else
         {
            gx.fn.setCtrlProperty("SHACOD","Enabled", 1 );
         }
      }
      catch(e){}
   }
   this.standaloneNotModalXL997=function()
   {
   }
   this.e11xl996_client=function()
   {
      return this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e12xl996_client=function()
   {
      return this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,5,6,7,8,9,15,18,20,23,25,28,30,31,35,38,40,43,45,48,50,53,55,58,60,63,65,68,70,73,75,78,80,83,85,88,90,93,95,98,100,103,105,108,110,113,115,118,120,123,125,128,130,133,135,138,140,143,145,148,150,153,155,158,160,165,166,167,168,169,170,171,172,175,176,177,178,179];
   this.GXLastCtrlId =179;
   this.Grid1Container = new gx.grid.grid(this, 997,"Level1",164,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"tshagra",[7031],false,1,false,true,5,false,false,false,"",0,"px",0,"px",gx.getMessage( "GXM_newrow"),true,false,false,null,null,false,"",false,[1,1,1,1],false,0,false,false);
   var Grid1Container = this.Grid1Container;
   Grid1Container.addSingleLineEdit("nRcdDeleted_997",165,"vNRCDDELETED_997","","","nRcdDeleted_997","int",0,"px",4,1,"right",null,[],"nRcdDeleted_997","nRcdDeleted_997",true,0,false,false,"Attribute",0,"");
   Grid1Container.addSingleLineEdit(7031,166,"SHACOD",gx.getMessage( "Nro de Shablon"),"","ShaCod","char",0,"px",10,10,"left",null,[],7031,"ShaCod",true,0,false,false,"Attribute",0,"");
   Grid1Container.addSingleLineEdit(7056,167,"SHAOGSORD",gx.getMessage( "Orden del Shablon en el dibujo"),"","ShaOGSOrd","int",0,"px",2,2,"right",null,[],7056,"ShaOGSOrd",true,0,false,false,"Attribute",0,"");
   Grid1Container.addCheckBox(7036,168,"SHAGRB",gx.getMessage( "Grabado"),gx.getMessage( "Grabado"),"ShaGrb","char","S","N",null,true,false,0,"px","");
   Grid1Container.addComboBox(7037,169,"SHATIPMAQ",gx.getMessage( "Tipo de Máquina"),"ShaTipMaq","char",null,0,true,false,0,"px","");
   Grid1Container.addSingleLineEdit(7032,170,"SHAMAL",gx.getMessage( "Tipo de Malla"),"","ShaMal","char",0,"px",10,10,"left",null,[],7032,"ShaMal",true,0,false,false,"Attribute",0,"");
   Grid1Container.addSingleLineEdit(7033,171,"SHAANC",gx.getMessage( "Ancho"),"","ShaAnc","char",0,"px",10,10,"left",null,[],7033,"ShaAnc",true,0,false,false,"Attribute",0,"");
   Grid1Container.addSingleLineEdit(7035,172,"SHAUBI",gx.getMessage( "Ubicación"),"","ShaUbi","char",0,"px",10,10,"left",null,[],7035,"ShaUbi",true,0,false,false,"Attribute",0,"");
   this.Grid1Container.emptyText = gx.getMessage( "");
   this.setGrid(Grid1Container);
   GXValidFnc[2]={ id: 2, fld:"TABLE1",grid:0};
   GXValidFnc[5]={ id: 5, fld:"BTN_FIRST",grid:0,evt:"e13xl996_client",std:"FIRST"};
   GXValidFnc[6]={ id: 6, fld:"BTN_PREVIOUS",grid:0,evt:"e14xl996_client",std:"PREVIOUS"};
   GXValidFnc[7]={ id: 7, fld:"BTN_NEXT",grid:0,evt:"e15xl996_client",std:"NEXT"};
   GXValidFnc[8]={ id: 8, fld:"BTN_LAST",grid:0,evt:"e16xl996_client",std:"LAST"};
   GXValidFnc[9]={ id: 9, fld:"BTN_SELECT",grid:0,evt:"e17xl996_client",std:"SELECT"};
   GXValidFnc[15]={ id: 15, fld:"TABLE2",grid:0};
   GXValidFnc[18]={ id: 18, fld:"TEXTBLOCK1", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[20]={ id:20 ,lvl:0,type:"char",len:3,dec:0,sign:false,pic:"@!",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Emprcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"EMPRCOD",fmt:0,gxz:"Z396EmprCod",gxold:"O396EmprCod",gxvar:"A396EmprCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A396EmprCod=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z396EmprCod=Value},v2c:function(){gx.fn.setControlValue("EMPRCOD",gx.O.A396EmprCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A396EmprCod=this.val()},val:function(){return gx.fn.getControlValue("EMPRCOD")},nac:gx.falseFn};
   GXValidFnc[23]={ id: 23, fld:"TEXTBLOCK2", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[25]={ id:25 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"EMPRNOM",fmt:0,gxz:"Z407EmprNom",gxold:"O407EmprNom",gxvar:"A407EmprNom",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A407EmprNom=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z407EmprNom=Value},v2c:function(){gx.fn.setControlValue("EMPRNOM",gx.O.A407EmprNom,0)},c2v:function(){if(this.val()!==undefined)gx.O.A407EmprNom=this.val()},val:function(){return gx.fn.getControlValue("EMPRNOM")},nac:gx.falseFn};
   GXValidFnc[28]={ id: 28, fld:"TEXTBLOCK3", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[30]={ id:30 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Ogscod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Grid1Container],fld:"OGSCOD",fmt:0,gxz:"Z7049OGSCod",gxold:"O7049OGSCod",gxvar:"A7049OGSCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7049OGSCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7049OGSCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("OGSCOD",gx.O.A7049OGSCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7049OGSCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("OGSCOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[31]={ id: 31, fld:"BTN_GET",grid:0,evt:"e18xl996_client",std:"GET"};
   GXValidFnc[35]={ id:35 ,lvl:0,type:"char",len:1,dec:0,sign:false,pic:"'C' 'R'",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSEST",fmt:0,gxz:"Z7050OGSEst",gxold:"O7050OGSEst",gxvar:"A7050OGSEst",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"checkbox",v2v:function(Value){if(Value!==undefined)gx.O.A7050OGSEst=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7050OGSEst=Value},v2c:function(){gx.fn.setCheckBoxValue("OGSEST",gx.O.A7050OGSEst,"S")},c2v:function(){if(this.val()!==undefined)gx.O.A7050OGSEst=this.val()},val:function(){return gx.fn.getControlValue("OGSEST")},nac:gx.falseFn,values:['S','N']};
   GXValidFnc[38]={ id: 38, fld:"TEXTBLOCK4", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[40]={ id:40 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCOD",fmt:0,gxz:"Z129BarCod",gxold:"O129BarCod",gxvar:"A129BarCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A129BarCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z129BarCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCOD",gx.O.A129BarCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A129BarCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[43]={ id: 43, fld:"TEXTBLOCK5", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[45]={ id:45 ,lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodreo,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODREO",fmt:0,gxz:"Z132BarCodReo",gxold:"O132BarCodReo",gxvar:"A132BarCodReo",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A132BarCodReo=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z132BarCodReo=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCODREO",gx.O.A132BarCodReo,0)},c2v:function(){if(this.val()!==undefined)gx.O.A132BarCodReo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCODREO",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[48]={ id: 48, fld:"TEXTBLOCK6", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[50]={ id:50 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodpar,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODPAR",fmt:0,gxz:"Z130BarCodPar",gxold:"O130BarCodPar",gxvar:"A130BarCodPar",ucs:[],op:[85,80,75,60,70,65,55],ip:[85,80,75,60,70,65,55,50,45,40,20],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A130BarCodPar=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z130BarCodPar=Value},v2c:function(){gx.fn.setControlValue("BARCODPAR",gx.O.A130BarCodPar,0)},c2v:function(){if(this.val()!==undefined)gx.O.A130BarCodPar=this.val()},val:function(){return gx.fn.getControlValue("BARCODPAR")},nac:gx.falseFn};
   GXValidFnc[53]={ id: 53, fld:"TEXTBLOCK7", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[55]={ id:55 ,lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Clicod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CLICOD",fmt:0,gxz:"Z252CliCod",gxold:"O252CliCod",gxvar:"A252CliCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A252CliCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z252CliCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("CLICOD",gx.O.A252CliCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A252CliCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CLICOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[58]={ id: 58, fld:"TEXTBLOCK8", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[60]={ id:60 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CLINOM",fmt:0,gxz:"Z279CliNom",gxold:"O279CliNom",gxvar:"A279CliNom",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A279CliNom=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z279CliNom=Value},v2c:function(){gx.fn.setControlValue("CLINOM",gx.O.A279CliNom,0)},c2v:function(){if(this.val()!==undefined)gx.O.A279CliNom=this.val()},val:function(){return gx.fn.getControlValue("CLINOM")},nac:gx.falseFn};
   GXValidFnc[63]={ id: 63, fld:"TEXTBLOCK9", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[65]={ id:65 ,lvl:0,type:"char",len:16,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Dibcli,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBCLI",fmt:0,gxz:"Z1013DibCli",gxold:"O1013DibCli",gxvar:"A1013DibCli",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1013DibCli=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z1013DibCli=Value},v2c:function(){gx.fn.setControlValue("DIBCLI",gx.O.A1013DibCli,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1013DibCli=this.val()},val:function(){return gx.fn.getControlValue("DIBCLI")},nac:gx.falseFn};
   GXValidFnc[68]={ id: 68, fld:"TEXTBLOCK10", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[70]={ id:70 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Dibint,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBINT",fmt:0,gxz:"Z1014DibInt",gxold:"O1014DibInt",gxvar:"A1014DibInt",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1014DibInt=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z1014DibInt=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBINT",gx.O.A1014DibInt,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1014DibInt=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBINT",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[73]={ id: 73, fld:"TEXTBLOCK11", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[75]={ id:75 ,lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBMOLCI2",fmt:0,gxz:"Z2090DibMolCi2",gxold:"O2090DibMolCi2",gxvar:"A2090DibMolCi2",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A2090DibMolCi2=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z2090DibMolCi2=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBMOLCI2",gx.O.A2090DibMolCi2,0)},c2v:function(){if(this.val()!==undefined)gx.O.A2090DibMolCi2=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBMOLCI2",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[78]={ id: 78, fld:"TEXTBLOCK12", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[80]={ id:80 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:1,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBTIPMAQ",fmt:0,gxz:"Z1823DibTipMaq",gxold:"O1823DibTipMaq",gxvar:"A1823DibTipMaq",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"listbx",v2v:function(Value){if(Value!==undefined)gx.O.A1823DibTipMaq=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z1823DibTipMaq=Value},v2c:function(){gx.fn.setComboBoxValue("DIBTIPMAQ",gx.O.A1823DibTipMaq)},c2v:function(){if(this.val()!==undefined)gx.O.A1823DibTipMaq=this.val()},val:function(){return gx.fn.getControlValue("DIBTIPMAQ")},nac:gx.falseFn};
   GXValidFnc[83]={ id: 83, fld:"TEXTBLOCK13", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[85]={ id:85 ,lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBMOLCIL",fmt:0,gxz:"Z1019DibMolCil",gxold:"O1019DibMolCil",gxvar:"A1019DibMolCil",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1019DibMolCil=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z1019DibMolCil=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBMOLCIL",gx.O.A1019DibMolCil,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1019DibMolCil=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBMOLCIL",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[88]={ id: 88, fld:"TEXTBLOCK14", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[90]={ id:90 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSUSUCRE",fmt:0,gxz:"Z7051OGSUsuCre",gxold:"O7051OGSUsuCre",gxvar:"A7051OGSUsuCre",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7051OGSUsuCre=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7051OGSUsuCre=Value},v2c:function(){gx.fn.setControlValue("OGSUSUCRE",gx.O.A7051OGSUsuCre,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7051OGSUsuCre=this.val()},val:function(){return gx.fn.getControlValue("OGSUSUCRE")},nac:gx.falseFn};
   GXValidFnc[93]={ id: 93, fld:"TEXTBLOCK15", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[95]={ id:95 ,lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSFCHCRE",fmt:0,gxz:"Z7052OGSFchCre",gxold:"O7052OGSFchCre",gxvar:"A7052OGSFchCre",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7052OGSFchCre=gx.fn.toDatetimeValue(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7052OGSFchCre=gx.fn.toDatetimeValue(Value)},v2c:function(){gx.fn.setControlValue("OGSFCHCRE",gx.O.A7052OGSFchCre,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7052OGSFchCre=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("OGSFCHCRE")},nac:gx.falseFn};
   GXValidFnc[98]={ id: 98, fld:"TEXTBLOCK16", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[100]={ id:100 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSUSUREA",fmt:0,gxz:"Z7053OGSUsuRea",gxold:"O7053OGSUsuRea",gxvar:"A7053OGSUsuRea",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7053OGSUsuRea=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7053OGSUsuRea=Value},v2c:function(){gx.fn.setControlValue("OGSUSUREA",gx.O.A7053OGSUsuRea,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7053OGSUsuRea=this.val()},val:function(){return gx.fn.getControlValue("OGSUSUREA")},nac:gx.falseFn};
   GXValidFnc[103]={ id: 103, fld:"TEXTBLOCK17", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[105]={ id:105 ,lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSFCHREA",fmt:0,gxz:"Z7054OGSFchRea",gxold:"O7054OGSFchRea",gxvar:"A7054OGSFchRea",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7054OGSFchRea=gx.fn.toDatetimeValue(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7054OGSFchRea=gx.fn.toDatetimeValue(Value)},v2c:function(){gx.fn.setControlValue("OGSFCHREA",gx.O.A7054OGSFchRea,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7054OGSFchRea=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("OGSFCHREA")},nac:gx.falseFn};
   GXValidFnc[108]={ id: 108, fld:"TEXTBLOCK18", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[110]={ id:110 ,lvl:0,type:"decimal",len:5,dec:2,sign:false,pic:"Z9.99",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSANC",fmt:0,gxz:"Z7141OGSAnc",gxold:"O7141OGSAnc",gxvar:"A7141OGSAnc",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7141OGSAnc=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){if(Value!==undefined)gx.O.Z7141OGSAnc=gx.fn.toDecimalValue(Value,gx.thousandSeparator,gx.decimalPoint)},v2c:function(){gx.fn.setDecimalValue("OGSANC",gx.O.A7141OGSAnc,2,gx.decimalPoint)},c2v:function(){if(this.val()!==undefined)gx.O.A7141OGSAnc=this.val()},val:function(){return gx.fn.getDecimalValue("OGSANC",gx.thousandSeparator,gx.decimalPoint)},nac:gx.falseFn};
   GXValidFnc[113]={ id: 113, fld:"TEXTBLOCK19", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[115]={ id:115 ,lvl:0,type:"decimal",len:6,dec:3,sign:false,pic:"Z9.999",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSGAL",fmt:0,gxz:"Z7142OGSGal",gxold:"O7142OGSGal",gxvar:"A7142OGSGal",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7142OGSGal=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){if(Value!==undefined)gx.O.Z7142OGSGal=gx.fn.toDecimalValue(Value,gx.thousandSeparator,gx.decimalPoint)},v2c:function(){gx.fn.setDecimalValue("OGSGAL",gx.O.A7142OGSGal,3,gx.decimalPoint)},c2v:function(){if(this.val()!==undefined)gx.O.A7142OGSGal=this.val()},val:function(){return gx.fn.getDecimalValue("OGSGAL",gx.thousandSeparator,gx.decimalPoint)},nac:gx.falseFn};
   GXValidFnc[118]={ id: 118, fld:"TEXTBLOCK20", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[120]={ id:120 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSUBI",fmt:0,gxz:"Z7143OGSUbi",gxold:"O7143OGSUbi",gxvar:"A7143OGSUbi",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7143OGSUbi=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7143OGSUbi=Value},v2c:function(){gx.fn.setControlValue("OGSUBI",gx.O.A7143OGSUbi,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7143OGSUbi=this.val()},val:function(){return gx.fn.getControlValue("OGSUBI")},nac:gx.falseFn};
   GXValidFnc[123]={ id: 123, fld:"TEXTBLOCK21", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[125]={ id:125 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSTPO",fmt:0,gxz:"Z7144OGSTpo",gxold:"O7144OGSTpo",gxvar:"A7144OGSTpo",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7144OGSTpo=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7144OGSTpo=Value},v2c:function(){gx.fn.setControlValue("OGSTPO",gx.O.A7144OGSTpo,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7144OGSTpo=this.val()},val:function(){return gx.fn.getControlValue("OGSTPO")},nac:gx.falseFn};
   GXValidFnc[128]={ id: 128, fld:"TEXTBLOCK22", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[130]={ id:130 ,lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSMAQ",fmt:0,gxz:"Z7519OGSMaq",gxold:"O7519OGSMaq",gxvar:"A7519OGSMaq",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7519OGSMaq=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7519OGSMaq=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("OGSMAQ",gx.O.A7519OGSMaq,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7519OGSMaq=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("OGSMAQ",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[133]={ id: 133, fld:"TEXTBLOCK23", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[135]={ id:135 ,lvl:0,type:"char",len:15,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSSEG",fmt:0,gxz:"Z7520OGSSeg",gxold:"O7520OGSSeg",gxvar:"A7520OGSSeg",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7520OGSSeg=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7520OGSSeg=Value},v2c:function(){gx.fn.setControlValue("OGSSEG",gx.O.A7520OGSSeg,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7520OGSSeg=this.val()},val:function(){return gx.fn.getControlValue("OGSSEG")},nac:gx.falseFn};
   GXValidFnc[138]={ id: 138, fld:"TEXTBLOCK24", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[140]={ id:140 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSDSC",fmt:0,gxz:"Z7521OGSDsc",gxold:"O7521OGSDsc",gxvar:"A7521OGSDsc",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7521OGSDsc=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7521OGSDsc=Value},v2c:function(){gx.fn.setControlValue("OGSDSC",gx.O.A7521OGSDsc,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7521OGSDsc=this.val()},val:function(){return gx.fn.getControlValue("OGSDSC")},nac:gx.falseFn};
   GXValidFnc[143]={ id: 143, fld:"TEXTBLOCK25", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[145]={ id:145 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSTAM",fmt:0,gxz:"Z7522OGSTam",gxold:"O7522OGSTam",gxvar:"A7522OGSTam",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"combo",v2v:function(Value){if(Value!==undefined)gx.O.A7522OGSTam=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7522OGSTam=Value},v2c:function(){gx.fn.setComboBoxValue("OGSTAM",gx.O.A7522OGSTam)},c2v:function(){if(this.val()!==undefined)gx.O.A7522OGSTam=this.val()},val:function(){return gx.fn.getControlValue("OGSTAM")},nac:gx.falseFn};
   GXValidFnc[148]={ id: 148, fld:"TEXTBLOCK26", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[150]={ id:150 ,lvl:0,type:"vchar",len:10240,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSOBS",fmt:0,gxz:"Z7055OGSObs",gxold:"O7055OGSObs",gxvar:"A7055OGSObs",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7055OGSObs=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7055OGSObs=Value},v2c:function(){gx.fn.setControlValue("OGSOBS",gx.O.A7055OGSObs,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7055OGSObs=this.val()},val:function(){return gx.fn.getControlValue("OGSOBS")},nac:gx.falseFn};
   GXValidFnc[153]={ id: 153, fld:"TEXTBLOCK27", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[155]={ id:155 ,lvl:0,type:"char",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSDIBC",fmt:0,gxz:"Z10885OGSDibC",gxold:"O10885OGSDibC",gxvar:"A10885OGSDibC",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A10885OGSDibC=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z10885OGSDibC=Value},v2c:function(){gx.fn.setControlValue("OGSDIBC",gx.O.A10885OGSDibC,0)},c2v:function(){if(this.val()!==undefined)gx.O.A10885OGSDibC=this.val()},val:function(){return gx.fn.getControlValue("OGSDIBC")},nac:gx.falseFn};
   GXValidFnc[158]={ id: 158, fld:"TEXTBLOCK28", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[160]={ id:160 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OGSDIBI",fmt:0,gxz:"Z10886OGSDibI",gxold:"O10886OGSDibI",gxvar:"A10886OGSDibI",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A10886OGSDibI=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z10886OGSDibI=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("OGSDIBI",gx.O.A10886OGSDibI,0)},c2v:function(){if(this.val()!==undefined)gx.O.A10886OGSDibI=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("OGSDIBI",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[165]={ id:165 ,lvl:997,type:"int",len:4,dec:0,sign:false,pic:"9999",ro:0,isacc:0,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"vNRCDDELETED_997",fmt:0,gxz:"ZnRcdDeleted_997",gxold:"OnRcdDeleted_997",gxvar:"nRcdDeleted_997",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.nRcdDeleted_997=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.ZnRcdDeleted_997=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("vNRCDDELETED_997",row || gx.fn.currentGridRowImpl(164),gx.O.nRcdDeleted_997,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.nRcdDeleted_997=gx.num.intval(this.val(row))},val:function(row){return gx.fn.getGridIntegerValue("vNRCDDELETED_997",row || gx.fn.currentGridRowImpl(164),gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[166]={ id:166 ,lvl:997,type:"char",len:10,dec:0,sign:false,ro:0,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:this.Valid_Shacod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHACOD",fmt:0,gxz:"Z7031ShaCod",gxold:"O7031ShaCod",gxvar:"A7031ShaCod",ucs:[],op:[172,171,170,169,168],ip:[172,171,170,169,168,166,20],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){if(Value!==undefined)gx.O.A7031ShaCod=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7031ShaCod=Value},v2c:function(row){gx.fn.setGridControlValue("SHACOD",row || gx.fn.currentGridRowImpl(164),gx.O.A7031ShaCod,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7031ShaCod=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHACOD",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn};
   GXValidFnc[167]={ id:167 ,lvl:997,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHAOGSORD",fmt:0,gxz:"Z7056ShaOGSOrd",gxold:"O7056ShaOGSOrd",gxvar:"A7056ShaOGSOrd",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.A7056ShaOGSOrd=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7056ShaOGSOrd=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("SHAOGSORD",row || gx.fn.currentGridRowImpl(164),gx.O.A7056ShaOGSOrd,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7056ShaOGSOrd=gx.num.intval(this.val(row))},val:function(row){return gx.fn.getGridIntegerValue("SHAOGSORD",row || gx.fn.currentGridRowImpl(164),gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[168]={ id:168 ,lvl:997,type:"char",len:1,dec:0,sign:false,ro:1,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHAGRB",fmt:0,gxz:"Z7036ShaGrb",gxold:"O7036ShaGrb",gxvar:"A7036ShaGrb",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.A7036ShaGrb=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7036ShaGrb=Value},v2c:function(row){gx.fn.setGridCheckBoxValue("SHAGRB",row || gx.fn.currentGridRowImpl(164),gx.O.A7036ShaGrb,"S")},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7036ShaGrb=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHAGRB",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn,values:['S','N']};
   GXValidFnc[169]={ id:169 ,lvl:997,type:"char",len:1,dec:0,sign:false,ro:1,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHATIPMAQ",fmt:0,gxz:"Z7037ShaTipMaq",gxold:"O7037ShaTipMaq",gxvar:"A7037ShaTipMaq",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.A7037ShaTipMaq=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7037ShaTipMaq=Value},v2c:function(row){gx.fn.setGridComboBoxValue("SHATIPMAQ",row || gx.fn.currentGridRowImpl(164),gx.O.A7037ShaTipMaq)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7037ShaTipMaq=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHATIPMAQ",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn};
   GXValidFnc[170]={ id:170 ,lvl:997,type:"char",len:10,dec:0,sign:false,ro:1,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHAMAL",fmt:0,gxz:"Z7032ShaMal",gxold:"O7032ShaMal",gxvar:"A7032ShaMal",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){if(Value!==undefined)gx.O.A7032ShaMal=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7032ShaMal=Value},v2c:function(row){gx.fn.setGridControlValue("SHAMAL",row || gx.fn.currentGridRowImpl(164),gx.O.A7032ShaMal,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7032ShaMal=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHAMAL",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn};
   GXValidFnc[171]={ id:171 ,lvl:997,type:"char",len:10,dec:0,sign:false,ro:1,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHAANC",fmt:0,gxz:"Z7033ShaAnc",gxold:"O7033ShaAnc",gxvar:"A7033ShaAnc",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){if(Value!==undefined)gx.O.A7033ShaAnc=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7033ShaAnc=Value},v2c:function(row){gx.fn.setGridControlValue("SHAANC",row || gx.fn.currentGridRowImpl(164),gx.O.A7033ShaAnc,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7033ShaAnc=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHAANC",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn};
   GXValidFnc[172]={ id:172 ,lvl:997,type:"char",len:10,dec:0,sign:false,ro:1,isacc:1,grid:164,gxgrid:this.Grid1Container,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SHAUBI",fmt:0,gxz:"Z7035ShaUbi",gxold:"O7035ShaUbi",gxvar:"A7035ShaUbi",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){if(Value!==undefined)gx.O.A7035ShaUbi=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7035ShaUbi=Value},v2c:function(row){gx.fn.setGridControlValue("SHAUBI",row || gx.fn.currentGridRowImpl(164),gx.O.A7035ShaUbi,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7035ShaUbi=this.val(row)},val:function(row){return gx.fn.getGridControlValue("SHAUBI",row || gx.fn.currentGridRowImpl(164))},nac:gx.falseFn};
   GXValidFnc[175]={ id: 175, fld:"BTN_ENTER",grid:0,evt:"e11xl996_client",std:"ENTER"};
   GXValidFnc[176]={ id: 176, fld:"BTN_CHECK",grid:0,evt:"e19xl996_client",std:"CHECK"};
   GXValidFnc[177]={ id: 177, fld:"BTN_CANCEL",grid:0,evt:"e12xl996_client"};
   GXValidFnc[178]={ id: 178, fld:"BTN_DELETE",grid:0,evt:"e20xl996_client",std:"DELETE"};
   GXValidFnc[179]={ id: 179, fld:"BTN_HELP",grid:0,evt:"e21xl996_client"};
   this.A396EmprCod = "" ;
   this.Z396EmprCod = "" ;
   this.O396EmprCod = "" ;
   this.A407EmprNom = "" ;
   this.Z407EmprNom = "" ;
   this.O407EmprNom = "" ;
   this.A7049OGSCod = 0 ;
   this.Z7049OGSCod = 0 ;
   this.O7049OGSCod = 0 ;
   this.A7050OGSEst = "" ;
   this.Z7050OGSEst = "" ;
   this.O7050OGSEst = "" ;
   this.A129BarCod = 0 ;
   this.Z129BarCod = 0 ;
   this.O129BarCod = 0 ;
   this.A132BarCodReo = 0 ;
   this.Z132BarCodReo = 0 ;
   this.O132BarCodReo = 0 ;
   this.A130BarCodPar = "" ;
   this.Z130BarCodPar = "" ;
   this.O130BarCodPar = "" ;
   this.A252CliCod = 0 ;
   this.Z252CliCod = 0 ;
   this.O252CliCod = 0 ;
   this.A279CliNom = "" ;
   this.Z279CliNom = "" ;
   this.O279CliNom = "" ;
   this.A1013DibCli = "" ;
   this.Z1013DibCli = "" ;
   this.O1013DibCli = "" ;
   this.A1014DibInt = 0 ;
   this.Z1014DibInt = 0 ;
   this.O1014DibInt = 0 ;
   this.A2090DibMolCi2 = 0 ;
   this.Z2090DibMolCi2 = 0 ;
   this.O2090DibMolCi2 = 0 ;
   this.A1823DibTipMaq = "" ;
   this.Z1823DibTipMaq = "" ;
   this.O1823DibTipMaq = "" ;
   this.A1019DibMolCil = 0 ;
   this.Z1019DibMolCil = 0 ;
   this.O1019DibMolCil = 0 ;
   this.A7051OGSUsuCre = "" ;
   this.Z7051OGSUsuCre = "" ;
   this.O7051OGSUsuCre = "" ;
   this.A7052OGSFchCre = gx.date.nullDate() ;
   this.Z7052OGSFchCre = gx.date.nullDate() ;
   this.O7052OGSFchCre = gx.date.nullDate() ;
   this.A7053OGSUsuRea = "" ;
   this.Z7053OGSUsuRea = "" ;
   this.O7053OGSUsuRea = "" ;
   this.A7054OGSFchRea = gx.date.nullDate() ;
   this.Z7054OGSFchRea = gx.date.nullDate() ;
   this.O7054OGSFchRea = gx.date.nullDate() ;
   this.A7141OGSAnc = 0 ;
   this.Z7141OGSAnc = 0 ;
   this.O7141OGSAnc = 0 ;
   this.A7142OGSGal = 0 ;
   this.Z7142OGSGal = 0 ;
   this.O7142OGSGal = 0 ;
   this.A7143OGSUbi = "" ;
   this.Z7143OGSUbi = "" ;
   this.O7143OGSUbi = "" ;
   this.A7144OGSTpo = "" ;
   this.Z7144OGSTpo = "" ;
   this.O7144OGSTpo = "" ;
   this.A7519OGSMaq = 0 ;
   this.Z7519OGSMaq = 0 ;
   this.O7519OGSMaq = 0 ;
   this.A7520OGSSeg = "" ;
   this.Z7520OGSSeg = "" ;
   this.O7520OGSSeg = "" ;
   this.A7521OGSDsc = "" ;
   this.Z7521OGSDsc = "" ;
   this.O7521OGSDsc = "" ;
   this.A7522OGSTam = "" ;
   this.Z7522OGSTam = "" ;
   this.O7522OGSTam = "" ;
   this.A7055OGSObs = "" ;
   this.Z7055OGSObs = "" ;
   this.O7055OGSObs = "" ;
   this.A10885OGSDibC = "" ;
   this.Z10885OGSDibC = "" ;
   this.O10885OGSDibC = "" ;
   this.A10886OGSDibI = 0 ;
   this.Z10886OGSDibI = 0 ;
   this.O10886OGSDibI = 0 ;
   this.ZnRcdDeleted_997 = 0 ;
   this.OnRcdDeleted_997 = 0 ;
   this.Z7031ShaCod = "" ;
   this.O7031ShaCod = "" ;
   this.Z7056ShaOGSOrd = 0 ;
   this.O7056ShaOGSOrd = 0 ;
   this.Z7036ShaGrb = "" ;
   this.O7036ShaGrb = "" ;
   this.Z7037ShaTipMaq = "" ;
   this.O7037ShaTipMaq = "" ;
   this.Z7032ShaMal = "" ;
   this.O7032ShaMal = "" ;
   this.Z7033ShaAnc = "" ;
   this.O7033ShaAnc = "" ;
   this.Z7035ShaUbi = "" ;
   this.O7035ShaUbi = "" ;
   this.A7031ShaCod = "" ;
   this.A7041ShaDibCli = "" ;
   this.A7042ShaDibInt = 0 ;
   this.A7056ShaOGSOrd = 0 ;
   this.A7036ShaGrb = "" ;
   this.A7037ShaTipMaq = "" ;
   this.A7032ShaMal = "" ;
   this.A7033ShaAnc = "" ;
   this.A7035ShaUbi = "" ;
   this.A361DisCod = 0 ;
   this.A396EmprCod = "" ;
   this.AV33OGSCod = 0 ;
   this.A7049OGSCod = 0 ;
   this.A407EmprNom = "" ;
   this.A7050OGSEst = "" ;
   this.A129BarCod = 0 ;
   this.A132BarCodReo = 0 ;
   this.A130BarCodPar = "" ;
   this.A252CliCod = 0 ;
   this.A279CliNom = "" ;
   this.A1013DibCli = "" ;
   this.A1014DibInt = 0 ;
   this.A2090DibMolCi2 = 0 ;
   this.A1823DibTipMaq = "" ;
   this.A1019DibMolCil = 0 ;
   this.A7051OGSUsuCre = "" ;
   this.A7052OGSFchCre = gx.date.nullDate() ;
   this.A7053OGSUsuRea = "" ;
   this.A7054OGSFchRea = gx.date.nullDate() ;
   this.A7141OGSAnc = 0 ;
   this.A7142OGSGal = 0 ;
   this.A7143OGSUbi = "" ;
   this.A7144OGSTpo = "" ;
   this.A7519OGSMaq = 0 ;
   this.A7520OGSSeg = "" ;
   this.A7521OGSDsc = "" ;
   this.A7522OGSTam = "" ;
   this.A7055OGSObs = "" ;
   this.A10885OGSDibC = "" ;
   this.A10886OGSDibI = 0 ;
   this.Gx_mode = "" ;
   this.Events = {"e11xl996_client": ["ENTER", true] ,"e12xl996_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33OGSCod',fld:'vOGSCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["REFRESH"] = [[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_EMPRCOD"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_OGSCOD"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_BARCOD"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_BARCODREO"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_BARCODPAR"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_CLICOD"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_DIBCLI"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_DIBINT"] = [[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EvtParms["VALID_SHACOD"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7031ShaCod',fld:'SHACOD',pic:''},{av:'A7041ShaDibCli',fld:'SHADIBCLI',pic:''},{av:'A7042ShaDibInt',fld:'SHADIBINT',pic:'ZZZZZZZ9'},{av:'A7036ShaGrb',fld:'SHAGRB',pic:''},{ctrl:'SHATIPMAQ'},{av:'A7037ShaTipMaq',fld:'SHATIPMAQ',pic:''},{av:'A7032ShaMal',fld:'SHAMAL',pic:''},{av:'A7033ShaAnc',fld:'SHAANC',pic:''},{av:'A7035ShaUbi',fld:'SHAUBI',pic:''},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}],[{av:'A7041ShaDibCli',fld:'SHADIBCLI',pic:''},{av:'A7042ShaDibInt',fld:'SHADIBINT',pic:'ZZZZZZZ9'},{av:'A7036ShaGrb',fld:'SHAGRB',pic:''},{ctrl:'SHATIPMAQ'},{av:'A7037ShaTipMaq',fld:'SHATIPMAQ',pic:''},{av:'A7032ShaMal',fld:'SHAMAL',pic:''},{av:'A7033ShaAnc',fld:'SHAANC',pic:''},{av:'A7035ShaUbi',fld:'SHAUBI',pic:''},{av:'A7050OGSEst',fld:'OGSEST',pic:''C' 'R''}]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.CheckCtrl = ["BTN_CHECK"];
   this.setVCMap("A361DisCod", "DISCOD", 0, "int", 8, 0);
   this.setVCMap("A7041ShaDibCli", "SHADIBCLI", 0, "char", 16, 0);
   this.setVCMap("A7042ShaDibInt", "SHADIBINT", 0, "int", 8, 0);
   this.setVCMap("AV33OGSCod", "vOGSCOD", 0, "int", 8, 0);
   this.setVCMap("Gx_mode", "vMODE", 0, "char", 3, 0);
   Grid1Container.addPostingVar({rfrVar:"Gx_mode"});
   this.Initialize( );
});
gx.wi( function() { gx.createParentObj(this.tshagra);});
