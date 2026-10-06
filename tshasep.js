gx.evt.autoSkip = false;
gx.define('tshasep', false, function () {
   this.ServerClass =  "tshasep" ;
   this.PackageName =  "app" ;
   this.ServerFullClass =  "app.tshasep" ;
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
   };
   this.Valid_Emprcod=function()
   {
      return this.validSrvEvt("valid_Emprcod", 0).then((function (ret) {
      return ret;
      }).closure(this));
   }
   this.Valid_Osscod=function()
   {
      return this.validSrvEvt("valid_Osscod", 0).then((function (ret) {
      return ret;
      }).closure(this));
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
   this.Valid_Ossfac=function()
   {
      return this.validCliEvt("Valid_Ossfac", 0, function () {
      try {
         var gxballoon = gx.util.balloon.getNew("OSSFAC");
         this.AnyError  = 0;
         if ( ! ( gx.text.compare( this.A7152OSSFac , "S" ) == 0 || gx.text.compare( this.A7152OSSFac , "N" ) == 0 ) )
         {
            try {
               gxballoon.setError(gx.text.format( gx.getMessage( "GXSPC_OutOfRange"), gx.getMessage( "Facturable"), "", "", "", "", "", "", "", ""));
               this.AnyError = gx.num.trunc( 1 ,0) ;
            }
            catch(e){}
         }

      }
      catch(e){}
      try {
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.Valid_Ossshaord=function()
   {
      var currentRow = gx.fn.currentGridRowImpl(173);
      return this.validCliEvt("Valid_Ossshaord", 173, function () {
      try {
         if(  gx.fn.currentGridRowImpl(173) ===0) {
            return true;
         }
         var gxballoon = gx.util.balloon.getNew("OSSSHAORD", gx.fn.currentGridRowImpl(173));
         this.AnyError  = 0;
         this.sMode1015 =  this.Gx_mode  ;
         this.Gx_mode =  gx.fn.getGridRowMode(1015,173)  ;
         this.standaloneModalYB1015( );
         this.standaloneNotModalYB1015( );
         if ( gx.fn.gridDuplicateKey(174) )
         {
            gxballoon.setError(gx.text.format( gx.getMessage( "GXM_1004"), gx.getMessage( "Level1"), "", "", "", "", "", "", "", ""));
            this.AnyError = gx.num.trunc( 1 ,0) ;
         }

      }
      catch(e){}
      try {
          this.Gx_mode =  this.sMode1015  ;
          if (gxballoon == null) return true; return gxballoon.show();
      }
      catch(e){}
      return true ;
      });
   }
   this.standaloneModalYB1015=function()
   {
      try {
         if ( gx.text.compare( this.Gx_mode , "INS" ) != 0 )
         {
            gx.fn.setCtrlProperty("OSSSHAORD","Enabled", 0 );
         }
         else
         {
            gx.fn.setCtrlProperty("OSSSHAORD","Enabled", 1 );
         }
      }
      catch(e){}
   }
   this.standaloneNotModalYB1015=function()
   {
   }
   this.e11yb1014_client=function()
   {
      return this.executeServerEvent("ENTER", true, null, false, false);
   };
   this.e12yb1014_client=function()
   {
      return this.executeServerEvent("CANCEL", true, null, false, false);
   };
   this.GXValidFnc = [];
   var GXValidFnc = this.GXValidFnc ;
   this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,174,175,176,177,178,179,180,181,182,183,184,185];
   this.GXLastCtrlId =185;
   this.Gridtshasep_level1itemContainer = new gx.grid.grid(this, 1015,"Level1",173,"Gridtshasep_level1item","Gridtshasep_level1item","Gridtshasep_level1itemContainer",this.CmpContext,this.IsMasterPage,"tshasep",[7159],false,1,false,true,5,false,false,false,"",0,"px",0,"px",gx.getMessage( "GXM_newrow"),true,false,false,null,null,false,"",false,[1,1,1,1],false,0,true,false);
   var Gridtshasep_level1itemContainer = this.Gridtshasep_level1itemContainer;
   Gridtshasep_level1itemContainer.addSingleLineEdit(7159,174,"OSSSHAORD",gx.getMessage( "Orden del Shablon en el dibujo"),"","OSSShaOrd","int",0,"px",2,2,"right",null,[],7159,"OSSShaOrd",true,0,false,false,"Attribute",0,"");
   Gridtshasep_level1itemContainer.addSingleLineEdit(7160,175,"OSSSHACOB",gx.getMessage( "Cobertura"),"","OSSShaCob","decimal",0,"px",5,5,"right",null,[],7160,"OSSShaCob",true,2,false,false,"Attribute",0,"");
   Gridtshasep_level1itemContainer.addSingleLineEdit(7161,176,"OSSSHACOL",gx.getMessage( "Color"),"","OSSShaCol","char",0,"px",20,20,"left",null,[],7161,"OSSShaCol",true,0,false,false,"Attribute",0,"");
   this.Gridtshasep_level1itemContainer.emptyText = gx.getMessage( "");
   this.setGrid(Gridtshasep_level1itemContainer);
   GXValidFnc[2]={ id: 2, fld:"",grid:0};
   GXValidFnc[3]={ id: 3, fld:"MAINTABLE",grid:0};
   GXValidFnc[4]={ id: 4, fld:"",grid:0};
   GXValidFnc[5]={ id: 5, fld:"",grid:0};
   GXValidFnc[6]={ id: 6, fld:"TITLECONTAINER",grid:0};
   GXValidFnc[7]={ id: 7, fld:"",grid:0};
   GXValidFnc[8]={ id: 8, fld:"",grid:0};
   GXValidFnc[9]={ id: 9, fld:"TITLE", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[10]={ id: 10, fld:"",grid:0};
   GXValidFnc[11]={ id: 11, fld:"",grid:0};
   GXValidFnc[13]={ id: 13, fld:"",grid:0};
   GXValidFnc[14]={ id: 14, fld:"",grid:0};
   GXValidFnc[15]={ id: 15, fld:"FORMCONTAINER",grid:0};
   GXValidFnc[16]={ id: 16, fld:"",grid:0};
   GXValidFnc[17]={ id: 17, fld:"TOOLBARCELL",grid:0};
   GXValidFnc[18]={ id: 18, fld:"",grid:0};
   GXValidFnc[19]={ id: 19, fld:"",grid:0};
   GXValidFnc[20]={ id: 20, fld:"",grid:0};
   GXValidFnc[21]={ id: 21, fld:"BTN_FIRST",grid:0,evt:"e13yb1014_client",std:"FIRST"};
   GXValidFnc[22]={ id: 22, fld:"",grid:0};
   GXValidFnc[23]={ id: 23, fld:"BTN_PREVIOUS",grid:0,evt:"e14yb1014_client",std:"PREVIOUS"};
   GXValidFnc[24]={ id: 24, fld:"",grid:0};
   GXValidFnc[25]={ id: 25, fld:"BTN_NEXT",grid:0,evt:"e15yb1014_client",std:"NEXT"};
   GXValidFnc[26]={ id: 26, fld:"",grid:0};
   GXValidFnc[27]={ id: 27, fld:"BTN_LAST",grid:0,evt:"e16yb1014_client",std:"LAST"};
   GXValidFnc[28]={ id: 28, fld:"",grid:0};
   GXValidFnc[29]={ id: 29, fld:"BTN_SELECT",grid:0,evt:"e17yb1014_client",std:"SELECT"};
   GXValidFnc[30]={ id: 30, fld:"",grid:0};
   GXValidFnc[31]={ id: 31, fld:"",grid:0};
   GXValidFnc[32]={ id: 32, fld:"",grid:0};
   GXValidFnc[33]={ id: 33, fld:"",grid:0};
   GXValidFnc[34]={ id:34 ,lvl:0,type:"char",len:3,dec:0,sign:false,pic:"@!",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Emprcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Gridtshasep_level1itemContainer],fld:"EMPRCOD",fmt:0,gxz:"Z396EmprCod",gxold:"O396EmprCod",gxvar:"A396EmprCod",ucs:[],op:[39],ip:[39,34],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A396EmprCod=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z396EmprCod=Value},v2c:function(){gx.fn.setControlValue("EMPRCOD",gx.O.A396EmprCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A396EmprCod=this.val()},val:function(){return gx.fn.getControlValue("EMPRCOD")},nac:gx.falseFn};
   GXValidFnc[35]={ id: 35, fld:"",grid:0};
   GXValidFnc[36]={ id: 36, fld:"",grid:0};
   GXValidFnc[37]={ id: 37, fld:"",grid:0};
   GXValidFnc[38]={ id: 38, fld:"",grid:0};
   GXValidFnc[39]={ id:39 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"EMPRNOM",fmt:0,gxz:"Z407EmprNom",gxold:"O407EmprNom",gxvar:"A407EmprNom",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A407EmprNom=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z407EmprNom=Value},v2c:function(){gx.fn.setControlValue("EMPRNOM",gx.O.A407EmprNom,0)},c2v:function(){if(this.val()!==undefined)gx.O.A407EmprNom=this.val()},val:function(){return gx.fn.getControlValue("EMPRNOM")},nac:gx.falseFn};
   GXValidFnc[40]={ id: 40, fld:"",grid:0};
   GXValidFnc[41]={ id: 41, fld:"",grid:0};
   GXValidFnc[42]={ id: 42, fld:"",grid:0};
   GXValidFnc[43]={ id: 43, fld:"",grid:0};
   GXValidFnc[44]={ id:44 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Osscod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[this.Gridtshasep_level1itemContainer],fld:"OSSCOD",fmt:0,gxz:"Z7145OSSCod",gxold:"O7145OSSCod",gxvar:"A7145OSSCod",ucs:[],op:[64,59,54,164,159,154,149,144,139,134,129,124,119,114,109,49],ip:[64,59,54,164,159,154,149,144,139,134,129,124,119,114,109,49,44,34],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7145OSSCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7145OSSCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("OSSCOD",gx.O.A7145OSSCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7145OSSCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("OSSCOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[45]={ id: 45, fld:"",grid:0};
   GXValidFnc[46]={ id: 46, fld:"",grid:0};
   GXValidFnc[47]={ id: 47, fld:"",grid:0};
   GXValidFnc[48]={ id: 48, fld:"",grid:0};
   GXValidFnc[49]={ id:49 ,lvl:0,type:"char",len:1,dec:0,sign:false,pic:"'C' 'R'",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSEST",fmt:0,gxz:"Z7146OSSEst",gxold:"O7146OSSEst",gxvar:"A7146OSSEst",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"checkbox",v2v:function(Value){if(Value!==undefined)gx.O.A7146OSSEst=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7146OSSEst=Value},v2c:function(){gx.fn.setCheckBoxValue("OSSEST",gx.O.A7146OSSEst,"S")},c2v:function(){if(this.val()!==undefined)gx.O.A7146OSSEst=this.val()},val:function(){return gx.fn.getControlValue("OSSEST")},nac:gx.falseFn,values:['S','N']};
   GXValidFnc[50]={ id: 50, fld:"",grid:0};
   GXValidFnc[51]={ id: 51, fld:"",grid:0};
   GXValidFnc[52]={ id: 52, fld:"",grid:0};
   GXValidFnc[53]={ id: 53, fld:"",grid:0};
   GXValidFnc[54]={ id:54 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCOD",fmt:0,gxz:"Z129BarCod",gxold:"O129BarCod",gxvar:"A129BarCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A129BarCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z129BarCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCOD",gx.O.A129BarCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A129BarCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[55]={ id: 55, fld:"",grid:0};
   GXValidFnc[56]={ id: 56, fld:"",grid:0};
   GXValidFnc[57]={ id: 57, fld:"",grid:0};
   GXValidFnc[58]={ id: 58, fld:"",grid:0};
   GXValidFnc[59]={ id:59 ,lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodreo,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODREO",fmt:0,gxz:"Z132BarCodReo",gxold:"O132BarCodReo",gxvar:"A132BarCodReo",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A132BarCodReo=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z132BarCodReo=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("BARCODREO",gx.O.A132BarCodReo,0)},c2v:function(){if(this.val()!==undefined)gx.O.A132BarCodReo=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("BARCODREO",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[60]={ id: 60, fld:"",grid:0};
   GXValidFnc[61]={ id: 61, fld:"",grid:0};
   GXValidFnc[62]={ id: 62, fld:"",grid:0};
   GXValidFnc[63]={ id: 63, fld:"",grid:0};
   GXValidFnc[64]={ id:64 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Barcodpar,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"BARCODPAR",fmt:0,gxz:"Z130BarCodPar",gxold:"O130BarCodPar",gxvar:"A130BarCodPar",ucs:[],op:[104,99,94,89,74,84,79,69],ip:[104,99,94,89,74,84,79,69,64,59,54,34],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A130BarCodPar=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z130BarCodPar=Value},v2c:function(){gx.fn.setControlValue("BARCODPAR",gx.O.A130BarCodPar,0)},c2v:function(){if(this.val()!==undefined)gx.O.A130BarCodPar=this.val()},val:function(){return gx.fn.getControlValue("BARCODPAR")},nac:gx.falseFn};
   GXValidFnc[65]={ id: 65, fld:"",grid:0};
   GXValidFnc[66]={ id: 66, fld:"",grid:0};
   GXValidFnc[67]={ id: 67, fld:"",grid:0};
   GXValidFnc[68]={ id: 68, fld:"",grid:0};
   GXValidFnc[69]={ id:69 ,lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Clicod,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CLICOD",fmt:0,gxz:"Z252CliCod",gxold:"O252CliCod",gxvar:"A252CliCod",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A252CliCod=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z252CliCod=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("CLICOD",gx.O.A252CliCod,0)},c2v:function(){if(this.val()!==undefined)gx.O.A252CliCod=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CLICOD",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[70]={ id: 70, fld:"",grid:0};
   GXValidFnc[71]={ id: 71, fld:"",grid:0};
   GXValidFnc[72]={ id: 72, fld:"",grid:0};
   GXValidFnc[73]={ id: 73, fld:"",grid:0};
   GXValidFnc[74]={ id:74 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"CLINOM",fmt:0,gxz:"Z279CliNom",gxold:"O279CliNom",gxvar:"A279CliNom",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A279CliNom=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z279CliNom=Value},v2c:function(){gx.fn.setControlValue("CLINOM",gx.O.A279CliNom,0)},c2v:function(){if(this.val()!==undefined)gx.O.A279CliNom=this.val()},val:function(){return gx.fn.getControlValue("CLINOM")},nac:gx.falseFn};
   GXValidFnc[75]={ id: 75, fld:"",grid:0};
   GXValidFnc[76]={ id: 76, fld:"",grid:0};
   GXValidFnc[77]={ id: 77, fld:"",grid:0};
   GXValidFnc[78]={ id: 78, fld:"",grid:0};
   GXValidFnc[79]={ id:79 ,lvl:0,type:"char",len:16,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Dibcli,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBCLI",fmt:0,gxz:"Z1013DibCli",gxold:"O1013DibCli",gxvar:"A1013DibCli",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1013DibCli=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z1013DibCli=Value},v2c:function(){gx.fn.setControlValue("DIBCLI",gx.O.A1013DibCli,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1013DibCli=this.val()},val:function(){return gx.fn.getControlValue("DIBCLI")},nac:gx.falseFn};
   GXValidFnc[80]={ id: 80, fld:"",grid:0};
   GXValidFnc[81]={ id: 81, fld:"",grid:0};
   GXValidFnc[82]={ id: 82, fld:"",grid:0};
   GXValidFnc[83]={ id: 83, fld:"",grid:0};
   GXValidFnc[84]={ id:84 ,lvl:0,type:"int",len:8,dec:0,sign:false,pic:"ZZZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Dibint,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBINT",fmt:0,gxz:"Z1014DibInt",gxold:"O1014DibInt",gxvar:"A1014DibInt",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1014DibInt=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z1014DibInt=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBINT",gx.O.A1014DibInt,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1014DibInt=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBINT",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[85]={ id: 85, fld:"",grid:0};
   GXValidFnc[86]={ id: 86, fld:"",grid:0};
   GXValidFnc[87]={ id: 87, fld:"",grid:0};
   GXValidFnc[88]={ id: 88, fld:"",grid:0};
   GXValidFnc[89]={ id:89 ,lvl:0,type:"char",len:30,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBDSC",fmt:0,gxz:"Z6841DibDsc",gxold:"O6841DibDsc",gxvar:"A6841DibDsc",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A6841DibDsc=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z6841DibDsc=Value},v2c:function(){gx.fn.setControlValue("DIBDSC",gx.O.A6841DibDsc,0)},c2v:function(){if(this.val()!==undefined)gx.O.A6841DibDsc=this.val()},val:function(){return gx.fn.getControlValue("DIBDSC")},nac:gx.falseFn};
   GXValidFnc[90]={ id: 90, fld:"",grid:0};
   GXValidFnc[91]={ id: 91, fld:"",grid:0};
   GXValidFnc[92]={ id: 92, fld:"",grid:0};
   GXValidFnc[93]={ id: 93, fld:"",grid:0};
   GXValidFnc[94]={ id:94 ,lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBMOLCI2",fmt:0,gxz:"Z2090DibMolCi2",gxold:"O2090DibMolCi2",gxvar:"A2090DibMolCi2",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A2090DibMolCi2=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z2090DibMolCi2=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBMOLCI2",gx.O.A2090DibMolCi2,0)},c2v:function(){if(this.val()!==undefined)gx.O.A2090DibMolCi2=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBMOLCI2",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[95]={ id: 95, fld:"",grid:0};
   GXValidFnc[96]={ id: 96, fld:"",grid:0};
   GXValidFnc[97]={ id: 97, fld:"",grid:0};
   GXValidFnc[98]={ id: 98, fld:"",grid:0};
   GXValidFnc[99]={ id:99 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:1,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBTIPMAQ",fmt:0,gxz:"Z1823DibTipMaq",gxold:"O1823DibTipMaq",gxvar:"A1823DibTipMaq",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"listbx",v2v:function(Value){if(Value!==undefined)gx.O.A1823DibTipMaq=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z1823DibTipMaq=Value},v2c:function(){gx.fn.setComboBoxValue("DIBTIPMAQ",gx.O.A1823DibTipMaq)},c2v:function(){if(this.val()!==undefined)gx.O.A1823DibTipMaq=this.val()},val:function(){return gx.fn.getControlValue("DIBTIPMAQ")},nac:gx.falseFn};
   GXValidFnc[100]={ id: 100, fld:"",grid:0};
   GXValidFnc[101]={ id: 101, fld:"",grid:0};
   GXValidFnc[102]={ id: 102, fld:"",grid:0};
   GXValidFnc[103]={ id: 103, fld:"",grid:0};
   GXValidFnc[104]={ id:104 ,lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"DIBMOLCIL",fmt:0,gxz:"Z1019DibMolCil",gxold:"O1019DibMolCil",gxvar:"A1019DibMolCil",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A1019DibMolCil=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z1019DibMolCil=gx.num.intval(Value)},v2c:function(){gx.fn.setControlValue("DIBMOLCIL",gx.O.A1019DibMolCil,0)},c2v:function(){if(this.val()!==undefined)gx.O.A1019DibMolCil=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("DIBMOLCIL",gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[105]={ id: 105, fld:"",grid:0};
   GXValidFnc[106]={ id: 106, fld:"",grid:0};
   GXValidFnc[107]={ id: 107, fld:"",grid:0};
   GXValidFnc[108]={ id: 108, fld:"",grid:0};
   GXValidFnc[109]={ id:109 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSUSUCRE",fmt:0,gxz:"Z7147OSSUsuCre",gxold:"O7147OSSUsuCre",gxvar:"A7147OSSUsuCre",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7147OSSUsuCre=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7147OSSUsuCre=Value},v2c:function(){gx.fn.setControlValue("OSSUSUCRE",gx.O.A7147OSSUsuCre,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7147OSSUsuCre=this.val()},val:function(){return gx.fn.getControlValue("OSSUSUCRE")},nac:gx.falseFn};
   GXValidFnc[110]={ id: 110, fld:"",grid:0};
   GXValidFnc[111]={ id: 111, fld:"",grid:0};
   GXValidFnc[112]={ id: 112, fld:"",grid:0};
   GXValidFnc[113]={ id: 113, fld:"",grid:0};
   GXValidFnc[114]={ id:114 ,lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSFCHCRE",fmt:0,gxz:"Z7148OSSFchCre",gxold:"O7148OSSFchCre",gxvar:"A7148OSSFchCre",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7148OSSFchCre=gx.fn.toDatetimeValue(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7148OSSFchCre=gx.fn.toDatetimeValue(Value)},v2c:function(){gx.fn.setControlValue("OSSFCHCRE",gx.O.A7148OSSFchCre,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7148OSSFchCre=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("OSSFCHCRE")},nac:gx.falseFn};
   GXValidFnc[115]={ id: 115, fld:"",grid:0};
   GXValidFnc[116]={ id: 116, fld:"",grid:0};
   GXValidFnc[117]={ id: 117, fld:"",grid:0};
   GXValidFnc[118]={ id: 118, fld:"",grid:0};
   GXValidFnc[119]={ id:119 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSUSUREA",fmt:0,gxz:"Z7149OSSUsuRea",gxold:"O7149OSSUsuRea",gxvar:"A7149OSSUsuRea",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7149OSSUsuRea=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7149OSSUsuRea=Value},v2c:function(){gx.fn.setControlValue("OSSUSUREA",gx.O.A7149OSSUsuRea,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7149OSSUsuRea=this.val()},val:function(){return gx.fn.getControlValue("OSSUSUREA")},nac:gx.falseFn};
   GXValidFnc[120]={ id: 120, fld:"",grid:0};
   GXValidFnc[121]={ id: 121, fld:"",grid:0};
   GXValidFnc[122]={ id: 122, fld:"",grid:0};
   GXValidFnc[123]={ id: 123, fld:"",grid:0};
   GXValidFnc[124]={ id:124 ,lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSFCHREA",fmt:0,gxz:"Z7150OSSFchRea",gxold:"O7150OSSFchRea",gxvar:"A7150OSSFchRea",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7150OSSFchRea=gx.fn.toDatetimeValue(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7150OSSFchRea=gx.fn.toDatetimeValue(Value)},v2c:function(){gx.fn.setControlValue("OSSFCHREA",gx.O.A7150OSSFchRea,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7150OSSFchRea=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("OSSFCHREA")},nac:gx.falseFn};
   GXValidFnc[125]={ id: 125, fld:"",grid:0};
   GXValidFnc[126]={ id: 126, fld:"",grid:0};
   GXValidFnc[127]={ id: 127, fld:"",grid:0};
   GXValidFnc[128]={ id: 128, fld:"",grid:0};
   GXValidFnc[129]={ id:129 ,lvl:0,type:"decimal",len:5,dec:2,sign:false,pic:"Z9.99",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSANC",fmt:0,gxz:"Z7151OSSAnc",gxold:"O7151OSSAnc",gxvar:"A7151OSSAnc",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7151OSSAnc=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){if(Value!==undefined)gx.O.Z7151OSSAnc=gx.fn.toDecimalValue(Value,gx.thousandSeparator,gx.decimalPoint)},v2c:function(){gx.fn.setDecimalValue("OSSANC",gx.O.A7151OSSAnc,2,gx.decimalPoint)},c2v:function(){if(this.val()!==undefined)gx.O.A7151OSSAnc=this.val()},val:function(){return gx.fn.getDecimalValue("OSSANC",gx.thousandSeparator,gx.decimalPoint)},nac:gx.falseFn};
   GXValidFnc[130]={ id: 130, fld:"",grid:0};
   GXValidFnc[131]={ id: 131, fld:"",grid:0};
   GXValidFnc[132]={ id: 132, fld:"",grid:0};
   GXValidFnc[133]={ id: 133, fld:"",grid:0};
   GXValidFnc[134]={ id:134 ,lvl:0,type:"char",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Ossfac,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSFAC",fmt:0,gxz:"Z7152OSSFac",gxold:"O7152OSSFac",gxvar:"A7152OSSFac",ucs:[],op:[134],ip:[134],
						nacdep:[],ctrltype:"checkbox",v2v:function(Value){if(Value!==undefined)gx.O.A7152OSSFac=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7152OSSFac=Value},v2c:function(){gx.fn.setCheckBoxValue("OSSFAC",gx.O.A7152OSSFac,"S")},c2v:function(){if(this.val()!==undefined)gx.O.A7152OSSFac=this.val()},val:function(){return gx.fn.getControlValue("OSSFAC")},nac:gx.falseFn,values:['S','N']};
   GXValidFnc[135]={ id: 135, fld:"",grid:0};
   GXValidFnc[136]={ id: 136, fld:"",grid:0};
   GXValidFnc[137]={ id: 137, fld:"",grid:0};
   GXValidFnc[138]={ id: 138, fld:"",grid:0};
   GXValidFnc[139]={ id:139 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSTPO",fmt:0,gxz:"Z7153OSSTpo",gxold:"O7153OSSTpo",gxvar:"A7153OSSTpo",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7153OSSTpo=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7153OSSTpo=Value},v2c:function(){gx.fn.setControlValue("OSSTPO",gx.O.A7153OSSTpo,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7153OSSTpo=this.val()},val:function(){return gx.fn.getControlValue("OSSTPO")},nac:gx.falseFn};
   GXValidFnc[140]={ id: 140, fld:"",grid:0};
   GXValidFnc[141]={ id: 141, fld:"",grid:0};
   GXValidFnc[142]={ id: 142, fld:"",grid:0};
   GXValidFnc[143]={ id: 143, fld:"",grid:0};
   GXValidFnc[144]={ id:144 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSMUE",fmt:0,gxz:"Z7154OSSMue",gxold:"O7154OSSMue",gxvar:"A7154OSSMue",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7154OSSMue=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7154OSSMue=Value},v2c:function(){gx.fn.setControlValue("OSSMUE",gx.O.A7154OSSMue,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7154OSSMue=this.val()},val:function(){return gx.fn.getControlValue("OSSMUE")},nac:gx.falseFn};
   GXValidFnc[145]={ id: 145, fld:"",grid:0};
   GXValidFnc[146]={ id: 146, fld:"",grid:0};
   GXValidFnc[147]={ id: 147, fld:"",grid:0};
   GXValidFnc[148]={ id: 148, fld:"",grid:0};
   GXValidFnc[149]={ id:149 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSDIB",fmt:0,gxz:"Z7155OSSDib",gxold:"O7155OSSDib",gxvar:"A7155OSSDib",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7155OSSDib=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7155OSSDib=Value},v2c:function(){gx.fn.setControlValue("OSSDIB",gx.O.A7155OSSDib,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7155OSSDib=this.val()},val:function(){return gx.fn.getControlValue("OSSDIB")},nac:gx.falseFn};
   GXValidFnc[150]={ id: 150, fld:"",grid:0};
   GXValidFnc[151]={ id: 151, fld:"",grid:0};
   GXValidFnc[152]={ id: 152, fld:"",grid:0};
   GXValidFnc[153]={ id: 153, fld:"",grid:0};
   GXValidFnc[154]={ id:154 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSIMP",fmt:0,gxz:"Z7156OSSImp",gxold:"O7156OSSImp",gxvar:"A7156OSSImp",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7156OSSImp=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7156OSSImp=Value},v2c:function(){gx.fn.setControlValue("OSSIMP",gx.O.A7156OSSImp,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7156OSSImp=this.val()},val:function(){return gx.fn.getControlValue("OSSIMP")},nac:gx.falseFn};
   GXValidFnc[155]={ id: 155, fld:"",grid:0};
   GXValidFnc[156]={ id: 156, fld:"",grid:0};
   GXValidFnc[157]={ id: 157, fld:"",grid:0};
   GXValidFnc[158]={ id: 158, fld:"",grid:0};
   GXValidFnc[159]={ id:159 ,lvl:0,type:"char",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSPRD",fmt:0,gxz:"Z7157OSSPrd",gxold:"O7157OSSPrd",gxvar:"A7157OSSPrd",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7157OSSPrd=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7157OSSPrd=Value},v2c:function(){gx.fn.setControlValue("OSSPRD",gx.O.A7157OSSPrd,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7157OSSPrd=this.val()},val:function(){return gx.fn.getControlValue("OSSPRD")},nac:gx.falseFn};
   GXValidFnc[160]={ id: 160, fld:"",grid:0};
   GXValidFnc[161]={ id: 161, fld:"",grid:0};
   GXValidFnc[162]={ id: 162, fld:"",grid:0};
   GXValidFnc[163]={ id: 163, fld:"",grid:0};
   GXValidFnc[164]={ id:164 ,lvl:0,type:"vchar",len:10240,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSOBS",fmt:0,gxz:"Z7158OSSObs",gxold:"O7158OSSObs",gxvar:"A7158OSSObs",ucs:[],op:[],ip:[],
						nacdep:[],ctrltype:"edit",v2v:function(Value){if(Value!==undefined)gx.O.A7158OSSObs=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7158OSSObs=Value},v2c:function(){gx.fn.setControlValue("OSSOBS",gx.O.A7158OSSObs,0)},c2v:function(){if(this.val()!==undefined)gx.O.A7158OSSObs=this.val()},val:function(){return gx.fn.getControlValue("OSSOBS")},nac:gx.falseFn};
   GXValidFnc[165]={ id: 165, fld:"",grid:0};
   GXValidFnc[166]={ id: 166, fld:"",grid:0};
   GXValidFnc[167]={ id: 167, fld:"LEVEL1TABLE",grid:0};
   GXValidFnc[168]={ id: 168, fld:"",grid:0};
   GXValidFnc[169]={ id: 169, fld:"",grid:0};
   GXValidFnc[170]={ id: 170, fld:"TITLELEVEL1", format:0,grid:0, ctrltype: "textblock"};
   GXValidFnc[171]={ id: 171, fld:"",grid:0};
   GXValidFnc[172]={ id: 172, fld:"",grid:0};
   GXValidFnc[174]={ id:174 ,lvl:1015,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,isacc:1,grid:173,gxgrid:this.Gridtshasep_level1itemContainer,fnc:this.Valid_Ossshaord,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSSHAORD",fmt:0,gxz:"Z7159OSSShaOrd",gxold:"O7159OSSShaOrd",gxvar:"A7159OSSShaOrd",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.A7159OSSShaOrd=gx.num.intval(Value)},v2z:function(Value){if(Value!==undefined)gx.O.Z7159OSSShaOrd=gx.num.intval(Value)},v2c:function(row){gx.fn.setGridControlValue("OSSSHAORD",row || gx.fn.currentGridRowImpl(173),gx.O.A7159OSSShaOrd,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7159OSSShaOrd=gx.num.intval(this.val(row))},val:function(row){return gx.fn.getGridIntegerValue("OSSSHAORD",row || gx.fn.currentGridRowImpl(173),gx.thousandSeparator)},nac:gx.falseFn};
   GXValidFnc[175]={ id:175 ,lvl:1015,type:"decimal",len:5,dec:2,sign:false,pic:"Z9.99",ro:0,isacc:1,grid:173,gxgrid:this.Gridtshasep_level1itemContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSSHACOB",fmt:0,gxz:"Z7160OSSShaCob",gxold:"O7160OSSShaCob",gxvar:"A7160OSSShaCob",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',v2v:function(Value){if(Value!==undefined)gx.O.A7160OSSShaCob=gx.fn.toDecimalValue(Value,',','.')},v2z:function(Value){if(Value!==undefined)gx.O.Z7160OSSShaCob=gx.fn.toDecimalValue(Value,gx.thousandSeparator,gx.decimalPoint)},v2c:function(row){gx.fn.setGridDecimalValue("OSSSHACOB",row || gx.fn.currentGridRowImpl(173),gx.O.A7160OSSShaCob,2,gx.decimalPoint)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7160OSSShaCob=this.val(row)},val:function(row){return gx.fn.getGridDecimalValue("OSSSHACOB",row || gx.fn.currentGridRowImpl(173),gx.thousandSeparator,gx.decimalPoint)},nac:gx.falseFn};
   GXValidFnc[176]={ id:176 ,lvl:1015,type:"char",len:20,dec:0,sign:false,ro:0,isacc:1,grid:173,gxgrid:this.Gridtshasep_level1itemContainer,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"OSSSHACOL",fmt:0,gxz:"Z7161OSSShaCol",gxold:"O7161OSSShaCol",gxvar:"A7161OSSShaCol",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:'text',autoCorrect:"1",v2v:function(Value){if(Value!==undefined)gx.O.A7161OSSShaCol=Value},v2z:function(Value){if(Value!==undefined)gx.O.Z7161OSSShaCol=Value},v2c:function(row){gx.fn.setGridControlValue("OSSSHACOL",row || gx.fn.currentGridRowImpl(173),gx.O.A7161OSSShaCol,0)},c2v:function(row){if(this.val(row)!==undefined)gx.O.A7161OSSShaCol=this.val(row)},val:function(row){return gx.fn.getGridControlValue("OSSSHACOL",row || gx.fn.currentGridRowImpl(173))},nac:gx.falseFn};
   GXValidFnc[177]={ id: 177, fld:"",grid:0};
   GXValidFnc[178]={ id: 178, fld:"",grid:0};
   GXValidFnc[179]={ id: 179, fld:"",grid:0};
   GXValidFnc[180]={ id: 180, fld:"",grid:0};
   GXValidFnc[181]={ id: 181, fld:"BTN_ENTER",grid:0,evt:"e11yb1014_client",std:"ENTER"};
   GXValidFnc[182]={ id: 182, fld:"",grid:0};
   GXValidFnc[183]={ id: 183, fld:"BTN_CANCEL",grid:0,evt:"e12yb1014_client"};
   GXValidFnc[184]={ id: 184, fld:"",grid:0};
   GXValidFnc[185]={ id: 185, fld:"BTN_DELETE",grid:0,evt:"e18yb1014_client",std:"DELETE"};
   this.A396EmprCod = "" ;
   this.Z396EmprCod = "" ;
   this.O396EmprCod = "" ;
   this.A407EmprNom = "" ;
   this.Z407EmprNom = "" ;
   this.O407EmprNom = "" ;
   this.A7145OSSCod = 0 ;
   this.Z7145OSSCod = 0 ;
   this.O7145OSSCod = 0 ;
   this.A7146OSSEst = "" ;
   this.Z7146OSSEst = "" ;
   this.O7146OSSEst = "" ;
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
   this.A6841DibDsc = "" ;
   this.Z6841DibDsc = "" ;
   this.O6841DibDsc = "" ;
   this.A2090DibMolCi2 = 0 ;
   this.Z2090DibMolCi2 = 0 ;
   this.O2090DibMolCi2 = 0 ;
   this.A1823DibTipMaq = "" ;
   this.Z1823DibTipMaq = "" ;
   this.O1823DibTipMaq = "" ;
   this.A1019DibMolCil = 0 ;
   this.Z1019DibMolCil = 0 ;
   this.O1019DibMolCil = 0 ;
   this.A7147OSSUsuCre = "" ;
   this.Z7147OSSUsuCre = "" ;
   this.O7147OSSUsuCre = "" ;
   this.A7148OSSFchCre = gx.date.nullDate() ;
   this.Z7148OSSFchCre = gx.date.nullDate() ;
   this.O7148OSSFchCre = gx.date.nullDate() ;
   this.A7149OSSUsuRea = "" ;
   this.Z7149OSSUsuRea = "" ;
   this.O7149OSSUsuRea = "" ;
   this.A7150OSSFchRea = gx.date.nullDate() ;
   this.Z7150OSSFchRea = gx.date.nullDate() ;
   this.O7150OSSFchRea = gx.date.nullDate() ;
   this.A7151OSSAnc = 0 ;
   this.Z7151OSSAnc = 0 ;
   this.O7151OSSAnc = 0 ;
   this.A7152OSSFac = "" ;
   this.Z7152OSSFac = "" ;
   this.O7152OSSFac = "" ;
   this.A7153OSSTpo = "" ;
   this.Z7153OSSTpo = "" ;
   this.O7153OSSTpo = "" ;
   this.A7154OSSMue = "" ;
   this.Z7154OSSMue = "" ;
   this.O7154OSSMue = "" ;
   this.A7155OSSDib = "" ;
   this.Z7155OSSDib = "" ;
   this.O7155OSSDib = "" ;
   this.A7156OSSImp = "" ;
   this.Z7156OSSImp = "" ;
   this.O7156OSSImp = "" ;
   this.A7157OSSPrd = "" ;
   this.Z7157OSSPrd = "" ;
   this.O7157OSSPrd = "" ;
   this.A7158OSSObs = "" ;
   this.Z7158OSSObs = "" ;
   this.O7158OSSObs = "" ;
   this.Z7159OSSShaOrd = 0 ;
   this.O7159OSSShaOrd = 0 ;
   this.Z7160OSSShaCob = 0 ;
   this.O7160OSSShaCob = 0 ;
   this.Z7161OSSShaCol = "" ;
   this.O7161OSSShaCol = "" ;
   this.A7159OSSShaOrd = 0 ;
   this.A7160OSSShaCob = 0 ;
   this.A7161OSSShaCol = "" ;
   this.A361DisCod = 0 ;
   this.A396EmprCod = "" ;
   this.A7145OSSCod = 0 ;
   this.A407EmprNom = "" ;
   this.A7146OSSEst = "" ;
   this.A129BarCod = 0 ;
   this.A132BarCodReo = 0 ;
   this.A130BarCodPar = "" ;
   this.A252CliCod = 0 ;
   this.A279CliNom = "" ;
   this.A1013DibCli = "" ;
   this.A1014DibInt = 0 ;
   this.A6841DibDsc = "" ;
   this.A2090DibMolCi2 = 0 ;
   this.A1823DibTipMaq = "" ;
   this.A1019DibMolCil = 0 ;
   this.A7147OSSUsuCre = "" ;
   this.A7148OSSFchCre = gx.date.nullDate() ;
   this.A7149OSSUsuRea = "" ;
   this.A7150OSSFchRea = gx.date.nullDate() ;
   this.A7151OSSAnc = 0 ;
   this.A7152OSSFac = "" ;
   this.A7153OSSTpo = "" ;
   this.A7154OSSMue = "" ;
   this.A7155OSSDib = "" ;
   this.A7156OSSImp = "" ;
   this.A7157OSSPrd = "" ;
   this.A7158OSSObs = "" ;
   this.Events = {"e11yb1014_client": ["ENTER", true] ,"e12yb1014_client": ["CANCEL", true]};
   this.EvtParms["ENTER"] = [[{postForm:true},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["REFRESH"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_EMPRCOD"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_OSSCOD"] = [[{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7145OSSCod',fld:'OSSCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A7147OSSUsuCre',fld:'OSSUSUCRE',pic:''},{av:'A7148OSSFchCre',fld:'OSSFCHCRE',pic:'99/99/99 99:99'},{av:'A7149OSSUsuRea',fld:'OSSUSUREA',pic:''},{av:'A7150OSSFchRea',fld:'OSSFCHREA',pic:'99/99/99 99:99'},{av:'A7151OSSAnc',fld:'OSSANC',pic:'Z9.99'},{av:'A7153OSSTpo',fld:'OSSTPO',pic:''},{av:'A7154OSSMue',fld:'OSSMUE',pic:''},{av:'A7155OSSDib',fld:'OSSDIB',pic:''},{av:'A7156OSSImp',fld:'OSSIMP',pic:''},{av:'A7157OSSPrd',fld:'OSSPRD',pic:''},{av:'A7158OSSObs',fld:'OSSOBS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z7145OSSCod'},{av:'Z7146OSSEst'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z7147OSSUsuCre'},{av:'Z7148OSSFchCre'},{av:'Z7149OSSUsuRea'},{av:'Z7150OSSFchRea'},{av:'Z7151OSSAnc'},{av:'Z7152OSSFac'},{av:'Z7153OSSTpo'},{av:'Z7154OSSMue'},{av:'Z7155OSSDib'},{av:'Z7156OSSImp'},{av:'Z7157OSSPrd'},{av:'Z7158OSSObs'},{av:'Z407EmprNom'},{av:'Z361DisCod'},{av:'Z252CliCod'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z279CliNom'},{av:'Z6841DibDsc'},{av:'Z2090DibMolCi2'},{av:'Z1823DibTipMaq'},{av:'Z1019DibMolCil'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_BARCOD"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_BARCODREO"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_BARCODPAR"] = [[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{ctrl:'DIBTIPMAQ'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_CLICOD"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_DIBCLI"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_DIBINT"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_OSSFAC"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EvtParms["VALID_OSSSHAORD"] = [[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}],[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]];
   this.EnterCtrl = ["BTN_ENTER"];
   this.setVCMap("A361DisCod", "DISCOD", 0, "int", 8, 0);
   Gridtshasep_level1itemContainer.addPostingVar({rfrVar:"Gx_mode"});
   this.Initialize( );
});
gx.wi( function() { gx.createParentObj(this.tshasep);});
