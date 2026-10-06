package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class creardisposotrasbarcadotras extends GXProcedure
{
   public creardisposotrasbarcadotras( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( creardisposotrasbarcadotras.class ), "" );
   }

   public creardisposotrasbarcadotras( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV61Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      creardisposotrasbarcadotras.this.GXt_char1 = GXv_char2[0] ;
      AV61Station = GXt_char1 ;
      GXv_char2[0] = AV55EmprCod ;
      GXv_char3[0] = AV56EmprNom ;
      GXv_char4[0] = AV62UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV61Station, GXv_char2, GXv_char3, GXv_char4) ;
      creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char2[0] ;
      creardisposotrasbarcadotras.this.AV56EmprNom = GXv_char3[0] ;
      creardisposotrasbarcadotras.this.AV62UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV75Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV55EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      creardisposotrasbarcadotras.this.GXt_int5 = GXv_int6[0] ;
      AV75Carvitin = GXt_int5 ;
      AV52Contexto = "CapturaDatosPedidosCliente" ;
      AV53DatosPedidoJSON = AV51WebSession.getValue(AV52Contexto) ;
      AV60SdtEnCabezadoPedido.fromJSonString(AV53DatosPedidoJSON, null);
      AV59SdtArticuloPedidos = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Articulopedido() ;
      AV80x = (short)(1) ;
      AV71CodMac = 0 ;
      if ( AV59SdtArticuloPedidos.size() > 1 )
      {
         GXv_int7[0] = AV71CodMac ;
         new app.pnumdoc(remoteHandle, context).execute( AV55EmprCod, "444444", GXv_int7) ;
         creardisposotrasbarcadotras.this.AV71CodMac = GXv_int7[0] ;
      }
      if ( AV59SdtArticuloPedidos.size() > 0 )
      {
         AV83GXV1 = 1 ;
         while ( AV83GXV1 <= AV59SdtArticuloPedidos.size() )
         {
            AV58SdtArticuloPedido = (app.SdtSdtArticuloPedido)((app.SdtSdtArticuloPedido)AV59SdtArticuloPedidos.elementAt(-1+AV83GXV1));
            GXt_int8 = AV54DisCod ;
            GXv_int7[0] = GXt_int8 ;
            new app.pnumdoc(remoteHandle, context).execute( AV55EmprCod, "021200", GXv_int7) ;
            creardisposotrasbarcadotras.this.GXt_int8 = GXv_int7[0] ;
            AV54DisCod = GXt_int8 ;
            GXv_char4[0] = AV16DisArtDsc ;
            GXv_char3[0] = AV19DisArtMat ;
            GXv_char2[0] = AV47DisPle2 ;
            GXv_char9[0] = AV18DisArtLar ;
            GXv_char10[0] = AV29DisArtSua ;
            GXv_char11[0] = AV12DisArtAca ;
            GXv_char12[0] = AV21DisArtPle ;
            GXv_int13[0] = AV30DisArtTip ;
            GXv_char14[0] = AV17DisArtEnc ;
            GXv_char15[0] = AV15DisArtCor ;
            GXv_char16[0] = AV31DisArtTr1 ;
            GXv_char17[0] = AV32DisArtTr2 ;
            GXv_char18[0] = AV33DisArtTr3 ;
            GXv_int19[0] = AV22DisArtPt1 ;
            GXv_int20[0] = AV23DisArtPt2 ;
            GXv_int21[0] = AV24DisArtPt3 ;
            GXv_decimal22[0] = AV28DisArtRdt ;
            GXv_int6[0] = AV37DisArtUrg ;
            GXv_char23[0] = AV34DisArtUr1 ;
            GXv_char24[0] = AV35DisArtUr2 ;
            GXv_char25[0] = AV36DisArtUr3 ;
            GXv_int26[0] = AV25DisArtPu1 ;
            GXv_int27[0] = AV26DisArtPu2 ;
            GXv_int28[0] = AV27DisArtPu3 ;
            GXv_int29[0] = AV20DisArtPes ;
            GXv_int30[0] = AV41DisGraCru ;
            GXv_int31[0] = (short)(0) ;
            GXv_int32[0] = AV14DisArtAn1 ;
            GXv_int33[0] = AV13DisArtAcb ;
            GXv_int34[0] = AV11DisArtAc2 ;
            GXv_int35[0] = (short)(DecimalUtil.decToDouble(AV39DisEncCom)) ;
            GXv_int36[0] = (short)(DecimalUtil.decToDouble(AV38DisEncAnh)) ;
            GXv_int37[0] = AV44DisNumCor ;
            GXv_int38[0] = AV8DisAncSal1 ;
            GXv_int39[0] = AV9DisAncSal2 ;
            GXv_int40[0] = AV10DisAncSal3 ;
            GXv_int41[0] = AV40DisGraAca2 ;
            GXv_int42[0] = AV42DisGraCru2 ;
            GXv_int43[0] = (short)(0) ;
            GXv_decimal44[0] = AV48DisRdoA ;
            GXv_decimal45[0] = AV49DisRdoN ;
            GXv_char46[0] = AV46DisObsGrm ;
            GXv_char47[0] = AV45DisObsAnc ;
            GXv_char48[0] = AV43DisItem5 ;
            GXv_char49[0] = AV50DisUniMed ;
            GXv_decimal50[0] = DecimalUtil.doubleToDec(0) ;
            GXv_int51[0] = (byte)(AV63ExisteArticulo) ;
            new app.partdis3(remoteHandle, context).execute( AV55EmprCod, AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod(), AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartcod(), GXv_char4, GXv_char3, GXv_char2, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_int21, GXv_decimal22, GXv_int6, GXv_char23, GXv_char24, GXv_char25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30, GXv_int31, GXv_int32, GXv_int33, GXv_int34, GXv_int35, GXv_int36, GXv_int37, GXv_int38, GXv_int39, GXv_int40, GXv_int41, GXv_int42, GXv_int43, GXv_decimal44, GXv_decimal45, GXv_char46, GXv_char47, GXv_char48, GXv_char49, GXv_decimal50, GXv_int51) ;
            creardisposotrasbarcadotras.this.AV16DisArtDsc = GXv_char4[0] ;
            creardisposotrasbarcadotras.this.AV19DisArtMat = GXv_char3[0] ;
            creardisposotrasbarcadotras.this.AV47DisPle2 = GXv_char2[0] ;
            creardisposotrasbarcadotras.this.AV18DisArtLar = GXv_char9[0] ;
            creardisposotrasbarcadotras.this.AV29DisArtSua = GXv_char10[0] ;
            creardisposotrasbarcadotras.this.AV12DisArtAca = GXv_char11[0] ;
            creardisposotrasbarcadotras.this.AV21DisArtPle = GXv_char12[0] ;
            creardisposotrasbarcadotras.this.AV30DisArtTip = GXv_int13[0] ;
            creardisposotrasbarcadotras.this.AV17DisArtEnc = GXv_char14[0] ;
            creardisposotrasbarcadotras.this.AV15DisArtCor = GXv_char15[0] ;
            creardisposotrasbarcadotras.this.AV31DisArtTr1 = GXv_char16[0] ;
            creardisposotrasbarcadotras.this.AV32DisArtTr2 = GXv_char17[0] ;
            creardisposotrasbarcadotras.this.AV33DisArtTr3 = GXv_char18[0] ;
            creardisposotrasbarcadotras.this.AV22DisArtPt1 = GXv_int19[0] ;
            creardisposotrasbarcadotras.this.AV23DisArtPt2 = GXv_int20[0] ;
            creardisposotrasbarcadotras.this.AV24DisArtPt3 = GXv_int21[0] ;
            creardisposotrasbarcadotras.this.AV28DisArtRdt = GXv_decimal22[0] ;
            creardisposotrasbarcadotras.this.AV37DisArtUrg = GXv_int6[0] ;
            creardisposotrasbarcadotras.this.AV34DisArtUr1 = GXv_char23[0] ;
            creardisposotrasbarcadotras.this.AV35DisArtUr2 = GXv_char24[0] ;
            creardisposotrasbarcadotras.this.AV36DisArtUr3 = GXv_char25[0] ;
            creardisposotrasbarcadotras.this.AV25DisArtPu1 = GXv_int26[0] ;
            creardisposotrasbarcadotras.this.AV26DisArtPu2 = GXv_int27[0] ;
            creardisposotrasbarcadotras.this.AV27DisArtPu3 = GXv_int28[0] ;
            creardisposotrasbarcadotras.this.AV20DisArtPes = GXv_int29[0] ;
            creardisposotrasbarcadotras.this.AV41DisGraCru = GXv_int30[0] ;
            creardisposotrasbarcadotras.this.AV14DisArtAn1 = GXv_int32[0] ;
            creardisposotrasbarcadotras.this.AV13DisArtAcb = GXv_int33[0] ;
            creardisposotrasbarcadotras.this.AV11DisArtAc2 = GXv_int34[0] ;
            creardisposotrasbarcadotras.this.AV39DisEncCom = DecimalUtil.doubleToDec(GXv_int35[0]) ;
            creardisposotrasbarcadotras.this.AV38DisEncAnh = DecimalUtil.doubleToDec(GXv_int36[0]) ;
            creardisposotrasbarcadotras.this.AV44DisNumCor = GXv_int37[0] ;
            creardisposotrasbarcadotras.this.AV8DisAncSal1 = GXv_int38[0] ;
            creardisposotrasbarcadotras.this.AV9DisAncSal2 = GXv_int39[0] ;
            creardisposotrasbarcadotras.this.AV10DisAncSal3 = GXv_int40[0] ;
            creardisposotrasbarcadotras.this.AV40DisGraAca2 = GXv_int41[0] ;
            creardisposotrasbarcadotras.this.AV42DisGraCru2 = GXv_int42[0] ;
            creardisposotrasbarcadotras.this.AV48DisRdoA = GXv_decimal44[0] ;
            creardisposotrasbarcadotras.this.AV49DisRdoN = GXv_decimal45[0] ;
            creardisposotrasbarcadotras.this.AV46DisObsGrm = GXv_char46[0] ;
            creardisposotrasbarcadotras.this.AV45DisObsAnc = GXv_char47[0] ;
            creardisposotrasbarcadotras.this.AV43DisItem5 = GXv_char48[0] ;
            creardisposotrasbarcadotras.this.AV50DisUniMed = GXv_char49[0] ;
            creardisposotrasbarcadotras.this.AV63ExisteArticulo = GXv_int51[0] ;
            /*
               INSERT RECORD ON TABLE TXPDISPOS

            */
            A396EmprCod = AV55EmprCod ;
            A361DisCod = AV54DisCod ;
            A252CliCod = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
            A2310DisCliDes = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
            A365DisDes = httpContext.getMessage( "N", "") ;
            A335DisArtCod = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartcod() ;
            A337DisArtDsc = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Artdsc() ;
            A338DisArtEnc = AV17DisArtEnc ;
            A336DisArtCor = AV15DisArtCor ;
            A333DisArtAca = AV12DisArtAca ;
            A334DisArtAnh = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartanh() ;
            A1906DisGraAca = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disgraaca() ;
            A350DisArtRdt = AV28DisArtRdt ;
            A374DisNumPie = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disnumpie() ;
            A375DisNumUni = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Kilos() ;
            A392DisUniMed = httpContext.getMessage( "K", "") ;
            A4813DisEncCli = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disenccli() ;
            A4014DisTin = httpContext.getMessage( "S", "") ;
            A757PriCod = "1" ;
            A369DisFec = GXutil.today( ) ;
            A371DisFecEnt = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfecent() ;
            A370DisFecCli = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disfeccli() ;
            A362DisColNom = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnom() ;
            n362DisColNom = false ;
            A363DisColNum = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Discolnum() ;
            n363DisColNum = false ;
            A390DisTipCol = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Distipcol() ;
            n390DisTipCol = false ;
            A1195DisNomCli = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnomcli() ;
            A1196DisNumCli = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnumcli() ;
            A1502DisPart = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Dispart() ;
            A351DisArtSua = AV29DisArtSua ;
            A352DisArtTip = AV30DisArtTip ;
            A338DisArtEnc = AV17DisArtEnc ;
            A336DisArtCor = AV15DisArtCor ;
            A353DisArtTr1 = AV31DisArtTr1 ;
            A354DisArtTr2 = AV32DisArtTr2 ;
            A355DisArtTr3 = AV33DisArtTr3 ;
            A344DisArtPt1 = AV22DisArtPt1 ;
            A345DisArtPt2 = AV23DisArtPt2 ;
            A346DisArtPt3 = AV24DisArtPt3 ;
            A350DisArtRdt = AV28DisArtRdt ;
            A359DisArtUrg = AV37DisArtUrg ;
            A356DisArtUr1 = AV34DisArtUr1 ;
            A357DisArtUr2 = AV35DisArtUr2 ;
            A358DisArtUr3 = AV36DisArtUr3 ;
            A347DisArtPu1 = AV25DisArtPu1 ;
            A348DisArtPu2 = AV26DisArtPu2 ;
            A349DisArtPu3 = AV27DisArtPu3 ;
            n349DisArtPu3 = false ;
            A340DisArtMat = AV19DisArtMat ;
            A4348DisUsrCod = AV62UsurCod ;
            A2009DisTipDis = " " ;
            n2009DisTipDis = false ;
            A343DisArtPle = AV21DisArtPle ;
            A5350DisObsAnc = AV45DisObsAnc ;
            A5349DisObsGrm = AV46DisObsGrm ;
            A1198DisEncAnh = AV38DisEncAnh ;
            A1197DisEncCom = AV39DisEncCom ;
            A1908DisRdoA = AV48DisRdoA ;
            A1122MaqCodDis = " " ;
            n1122MaqCodDis = false ;
            A1052DisObs = " " ;
            A1430DisLoc = "" ;
            A359DisArtUrg = AV37DisArtUrg ;
            A367DisEst = (byte)(1) ;
            A342DisArtPes = AV20DisArtPes ;
            A388DisPreKgm = DecimalUtil.doubleToDec(0) ;
            A389DisPreMtr = DecimalUtil.doubleToDec(0) ;
            A383DisPieLan = (short)(0) ;
            A372DisKgmLan = (short)(0) ;
            A373DisMtrLan = (short)(0) ;
            A998DisNMtr = " " ;
            A999DisNMez = " " ;
            A1002DisNumTen = " " ;
            n1002DisNumTen = false ;
            A1225DisGraCru = AV41DisGraCru ;
            A1231DisArtAn1 = AV14DisArtAn1 ;
            A1232DisArtAcb = AV13DisArtAcb ;
            A1233DisArtAc2 = AV11DisArtAc2 ;
            A1907DisRdoN = AV49DisRdoN ;
            A1908DisRdoA = AV48DisRdoA ;
            A1968DisRes = " " ;
            n1968DisRes = false ;
            A2402DisManCod = (short)(0) ;
            A2403DisOpeAnt = 0 ;
            n2403DisOpeAnt = false ;
            A2742DisCodTex = " " ;
            n2742DisCodTex = false ;
            A2743DisNumTex1 = (byte)(0) ;
            A2744DisNumTex2 = (short)(0) ;
            n2744DisNumTex2 = false ;
            A2831DisNumLot = 0 ;
            A2832DisKgsLot = DecimalUtil.doubleToDec(0) ;
            A2833DisMtrLot = DecimalUtil.doubleToDec(0) ;
            A2926DisPla = "" ;
            A2835DisPle2 = " " ;
            A3127DisNumCor = AV44DisNumCor ;
            A3128DisAncSal1 = AV8DisAncSal1 ;
            A3129DisAncSal2 = AV9DisAncSal2 ;
            A3130DisAncSal3 = AV10DisAncSal3 ;
            A3132DisGraCru2 = AV42DisGraCru2 ;
            A3306DisFac = "" ;
            A3309DisNumTon = " " ;
            A3627DisFecLan = GXutil.nullDate() ;
            n3627DisFecLan = false ;
            A3694DisParCod = 0 ;
            n3694DisParCod = false ;
            A3695DisParReo = (byte)(0) ;
            n3695DisParReo = false ;
            A3696DisParPar = "" ;
            n3696DisParPar = false ;
            A3826RetCod = "" ;
            n3826RetCod = false ;
            A3841DisArtMer = DecimalUtil.doubleToDec(0) ;
            A1031EmpesCod = " " ;
            n1031EmpesCod = false ;
            A1051DisNumCol = (short)(0) ;
            n1051DisNumCol = false ;
            A1052DisObs = " " ;
            A4013DisEnv = (byte)(0) ;
            n4013DisEnv = false ;
            A4293DisNPzas = 0 ;
            n4293DisNPzas = false ;
            A4294DisNPzasL = 0 ;
            n4294DisNPzasL = false ;
            A4348DisUsrCod = AV62UsurCod ;
            A4355DisFecPed = GXutil.nullDate() ;
            n4355DisFecPed = false ;
            A4468DisPelAnh = (short)(0) ;
            A4469DisCruMts = DecimalUtil.doubleToDec(0) ;
            A4470DisCruKgs = DecimalUtil.doubleToDec(0) ;
            A4471DisCruEnr = " " ;
            A4472DisLotPza = (short)(0) ;
            n4472DisLotPza = false ;
            A4473DisLotMts = DecimalUtil.doubleToDec(0) ;
            A4474DisLotKgs = DecimalUtil.doubleToDec(0) ;
            A4475DisLotMaq = " " ;
            n4475DisLotMaq = false ;
            A4476DisAcaFor = 0 ;
            n4476DisAcaFor = false ;
            A4477DisAcaBak = " " ;
            A4478DisAcaAnh = (short)(0) ;
            A4479DisAcaMar = " " ;
            A4614DisMdlCod = " " ;
            A4615DisTam = " " ;
            A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
            n4616DisHorEnt = false ;
            A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
            n4617DisHorReg = false ;
            A4720DisDishCod = " " ;
            A4785DisNroCor = 0 ;
            A4876DibColDib = " " ;
            n4876DibColDib = false ;
            A4877DibColCol = " " ;
            n4877DibColCol = false ;
            A4918DisDibCoDN = 0 ;
            n4918DisDibCoDN = false ;
            A4919DisDibCoCN = 0 ;
            n4919DisDibCoCN = false ;
            A4879DibColColN = 0 ;
            n4879DibColColN = false ;
            A5024DisTipEst = (byte)(0) ;
            A5031DisCom = " " ;
            n5031DisCom = false ;
            A5032DisEstTip = " " ;
            A5252DisAcc = " " ;
            A5290DisTipCor = " " ;
            A5366DisAntp = " " ;
            A5405DisAntpT = " " ;
            A6547DisVolMaq = 0 ;
            A6548DisRbMaq = DecimalUtil.doubleToDec(0) ;
            A7067DisUltNot = (byte)(0) ;
            n7067DisUltNot = false ;
            A7515DisDesCol = (byte)(0) ;
            n7515DisDesCol = false ;
            A7510DisDto = DecimalUtil.doubleToDec(0) ;
            n7510DisDto = false ;
            A8887DisFchT = GXutil.nullDate() ;
            n8887DisFchT = false ;
            A8886DisDest = " " ;
            A8885DisFEnt = " " ;
            n8885DisFEnt = false ;
            A9771DisItem1 = " " ;
            A9772DisItem2 = "" ;
            A9773DisItem3 = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disitem3() ;
            A9774DisItem4 = " " ;
            A9786DisItem5 = " " ;
            A9787DisItem6 = " " ;
            A10887Cod_Idtx = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Cod_idtx() ;
            n10887Cod_Idtx = false ;
            A11661DisOrdComp = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disordcomp() ;
            A7739DisExp = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disexp() ;
            A11864Nxt_artcli = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_artcli() ;
            A8886DisDest = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disdest() ;
            A11859Nxt_modelo = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_modelo() ;
            A11861Nxt_statio = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Nxt_statio() ;
            A2926DisPla = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Displa() ;
            A4014DisTin = httpContext.getMessage( "S", "") ;
            AV65Nlin = (short)(GXutil.gxmlines( GXutil.trim( AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones()), (short)(60))) ;
            AV66i = (short)(1) ;
            AV67t = (short)(1) ;
            while ( AV66i <= AV65Nlin )
            {
               if ( AV66i > 9 )
               {
                  if (true) break;
               }
               AV68DisObsTxt = GXutil.gxgetmli( GXutil.trim( AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Observaciones()), AV66i, (short)(60)) ;
               if ( GXutil.strcmp(GXutil.trim( AV68DisObsTxt), " ") != 0 )
               {
                  /*
                     INSERT RECORD ON TABLE TXPOBSERV

                  */
                  W396EmprCod = A396EmprCod ;
                  W361DisCod = A361DisCod ;
                  A396EmprCod = AV55EmprCod ;
                  A361DisCod = AV54DisCod ;
                  A376DisObsLin = (byte)(AV67t) ;
                  A377DisObsTxt = AV68DisObsTxt ;
                  /* Using cursor P088B2 */
                  pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                  if ( (pr_default.getStatus(0) == 1) )
                  {
                     Gx_err = (short)(1) ;
                     Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  }
                  else
                  {
                     Gx_err = (short)(0) ;
                     Gx_emsg = "" ;
                  }
                  A396EmprCod = W396EmprCod ;
                  A361DisCod = W361DisCod ;
                  /* End Insert */
                  AV67t = (short)(AV67t+1) ;
               }
               AV66i = (short)(AV66i+1) ;
            }
            A378DisObsULin = (byte)(AV67t) ;
            /* Using cursor P088B3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, Short.valueOf(A374DisNumPie), A375DisNumUni, A392DisUniMed, Short.valueOf(A342DisArtPes), A757PriCod, A370DisFecCli, A369DisFec, A371DisFecEnt, Boolean.valueOf(n362DisColNom), A362DisColNom, Boolean.valueOf(n363DisColNum), Integer.valueOf(A363DisColNum), Boolean.valueOf(n390DisTipCol), Byte.valueOf(A390DisTipCol), A337DisArtDsc, Byte.valueOf(A378DisObsULin), A340DisArtMat, A351DisArtSua, A333DisArtAca, A343DisArtPle, Short.valueOf(A352DisArtTip), A338DisArtEnc, A336DisArtCor, A353DisArtTr1, Short.valueOf(A344DisArtPt1), A354DisArtTr2, Short.valueOf(A345DisArtPt2), A355DisArtTr3, Short.valueOf(A346DisArtPt3), A350DisArtRdt, Byte.valueOf(A359DisArtUrg), A356DisArtUr1, Short.valueOf(A347DisArtPu1), A357DisArtUr2, Short.valueOf(A348DisArtPu2), A358DisArtUr3, Boolean.valueOf(n349DisArtPu3), Short.valueOf(A349DisArtPu3), Short.valueOf(A334DisArtAnh), Byte.valueOf(A367DisEst), A388DisPreKgm, A389DisPreMtr, Short.valueOf(A383DisPieLan), Short.valueOf(A372DisKgmLan), Short.valueOf(A373DisMtrLan), A998DisNMtr, A999DisNMez, Boolean.valueOf(n1002DisNumTen), A1002DisNumTen, Boolean.valueOf(n1122MaqCodDis), A1122MaqCodDis, Integer.valueOf(A252CliCod), A1195DisNomCli, Integer.valueOf(A1196DisNumCli), A1197DisEncCom, A1198DisEncAnh, Short.valueOf(A1225DisGraCru), Short.valueOf(A1231DisArtAn1), Short.valueOf(A1232DisArtAcb), Short.valueOf(A1233DisArtAc2), A1430DisLoc, Short.valueOf(A1502DisPart), Short.valueOf(A1906DisGraAca), A1907DisRdoN, A1908DisRdoA, Boolean.valueOf(n1968DisRes), A1968DisRes, Boolean.valueOf(n2009DisTipDis), A2009DisTipDis, Integer.valueOf(A2310DisCliDes), Short.valueOf(A2402DisManCod), Boolean.valueOf(n2403DisOpeAnt), Integer.valueOf(A2403DisOpeAnt), Boolean.valueOf(n2742DisCodTex), A2742DisCodTex, Byte.valueOf(A2743DisNumTex1), Boolean.valueOf(n2744DisNumTex2), Short.valueOf(A2744DisNumTex2), Integer.valueOf(A2831DisNumLot), A2832DisKgsLot, A2833DisMtrLot, A2926DisPla, A2835DisPle2, Short.valueOf(A3127DisNumCor), Short.valueOf(A3128DisAncSal1), Short.valueOf(A3129DisAncSal2), Short.valueOf(A3130DisAncSal3), Short.valueOf(A3132DisGraCru2), A3306DisFac, A3309DisNumTon, Boolean.valueOf(n3627DisFecLan), A3627DisFecLan, Boolean.valueOf(n3826RetCod), A3826RetCod, A3841DisArtMer, Boolean.valueOf(n1031EmpesCod), A1031EmpesCod, Boolean.valueOf(n1051DisNumCol), Short.valueOf(A1051DisNumCol), A1052DisObs, Boolean.valueOf(n4013DisEnv), Byte.valueOf(A4013DisEnv), A4014DisTin, Boolean.valueOf(n4293DisNPzas), Integer.valueOf(A4293DisNPzas), Boolean.valueOf(n4294DisNPzasL), Integer.valueOf(A4294DisNPzasL), A4348DisUsrCod, Short.valueOf(A4468DisPelAnh), A4469DisCruMts, A4470DisCruKgs, A4471DisCruEnr, A4473DisLotMts, A4474DisLotKgs, A4477DisAcaBak, Short.valueOf(A4478DisAcaAnh), A4479DisAcaMar, A4614DisMdlCod,
            A4615DisTam, Boolean.valueOf(n4616DisHorEnt), A4616DisHorEnt, Boolean.valueOf(n4617DisHorReg), A4617DisHorReg, A4720DisDishCod, Integer.valueOf(A4785DisNroCor), A4813DisEncCli, Boolean.valueOf(n4876DibColDib), A4876DibColDib, Byte.valueOf(A5024DisTipEst), Boolean.valueOf(n5031DisCom), A5031DisCom, A5032DisEstTip, A5252DisAcc, A5290DisTipCor, A5349DisObsGrm, A5350DisObsAnc, A5366DisAntp, A5405DisAntpT, Integer.valueOf(A6547DisVolMaq), A6548DisRbMaq, Boolean.valueOf(n7510DisDto), A7510DisDto, Boolean.valueOf(n7515DisDesCol), Byte.valueOf(A7515DisDesCol), A7739DisExp, Boolean.valueOf(n8885DisFEnt), A8885DisFEnt, A8886DisDest, Boolean.valueOf(n8887DisFchT), A8887DisFchT, A9771DisItem1, A9772DisItem2, A9773DisItem3, A9774DisItem4, A9786DisItem5, A9787DisItem6, Boolean.valueOf(n10887Cod_Idtx), A10887Cod_Idtx, Boolean.valueOf(n4355DisFecPed), A4355DisFecPed, Boolean.valueOf(n4472DisLotPza), Short.valueOf(A4472DisLotPza), Boolean.valueOf(n4475DisLotMaq), A4475DisLotMaq, Boolean.valueOf(n4476DisAcaFor), Integer.valueOf(A4476DisAcaFor), Boolean.valueOf(n4877DibColCol), A4877DibColCol, Boolean.valueOf(n4919DisDibCoCN), Integer.valueOf(A4919DisDibCoCN), Boolean.valueOf(n4879DibColColN), Integer.valueOf(A4879DibColColN), Boolean.valueOf(n4918DisDibCoDN), Integer.valueOf(A4918DisDibCoDN), Boolean.valueOf(n7067DisUltNot), Byte.valueOf(A7067DisUltNot), Boolean.valueOf(n3694DisParCod), Integer.valueOf(A3694DisParCod), Boolean.valueOf(n3695DisParReo), Byte.valueOf(A3695DisParReo), Boolean.valueOf(n3696DisParPar), A3696DisParPar, A11661DisOrdComp, A11859Nxt_modelo, A11861Nxt_statio, A11864Nxt_artcli});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /* Using cursor P088B4 */
            pr_default.execute(2);
            while ( (pr_default.getStatus(2) != 101) )
            {
               A13217NormaID = P088B4_A13217NormaID[0] ;
               A396EmprCod = P088B4_A396EmprCod[0] ;
               /*
                  INSERT RECORD ON TABLE TXPDISNOR

               */
               W396EmprCod = A396EmprCod ;
               A396EmprCod = AV55EmprCod ;
               A361DisCod = AV54DisCod ;
               A13213DisNormID = A13217NormaID ;
               A13214DisNormSt = ((GXutil.strcmp(A13217NormaID, httpContext.getMessage( "GOTS", ""))==0) ? AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst01() : ((GXutil.strcmp(A13217NormaID, httpContext.getMessage( "GRS", ""))==0) ? AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst02() : ((GXutil.strcmp(A13217NormaID, httpContext.getMessage( "OCS", ""))==0) ? AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst03() : ((GXutil.strcmp(A13217NormaID, httpContext.getMessage( "RCS", ""))==0) ? AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst04() : AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Disnormst05())))) ;
               A13215DisNormNC = httpContext.getMessage( "N", "") ;
               /* Using cursor P088B5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID, A13214DisNormSt, A13215DisNormNC});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
               if ( (pr_default.getStatus(3) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               /* End Insert */
               pr_default.readNext(2);
            }
            pr_default.close(2);
            GXt_int8 = AV64Albreccod ;
            GXv_int7[0] = GXt_int8 ;
            new app.pnumdoc(remoteHandle, context).execute( AV55EmprCod, "020100", GXv_int7) ;
            creardisposotrasbarcadotras.this.GXt_int8 = GXv_int7[0] ;
            AV64Albreccod = GXt_int8 ;
            /*
               INSERT RECORD ON TABLE TXPALBREC

            */
            A396EmprCod = AV55EmprCod ;
            A44AlbRecCod = AV64Albreccod ;
            A252CliCod = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Clicod() ;
            A45AlbRef = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disartcod() ;
            A52AlbRPieEnt = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disnumpie() ;
            A56AlbRUni = httpContext.getMessage( "K", "") ;
            A58AlbRUniEnt = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Kilos() ;
            A60AlbRUniUti = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Kilos() ;
            A48AlbRFecUlt = GXutil.today( ) ;
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            A49AlbRFen = GXutil.today( ) ;
            A54AlbRPieUti = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disnumpie() ;
            A47AlbREst = (byte)(1) ;
            A3613AlbRefDsc = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Artdsc() ;
            A970ProceCod = AV60SdtEnCabezadoPedido.getgxTv_SdtSdtEncabezadoPedido_Procecod() ;
            n970ProceCod = false ;
            A50AlbRLoc = " " ;
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            A3360AlbRImp = httpContext.getMessage( "N", "") ;
            A6463AlbRLote = httpContext.getMessage( "Neotex", "") ;
            /* Using cursor P088B6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A45AlbRef, Integer.valueOf(A52AlbRPieEnt), A56AlbRUni, A50AlbRLoc, A49AlbRFen, A58AlbRUniEnt, A55AlbRReo, Integer.valueOf(A54AlbRPieUti), A60AlbRUniUti, A48AlbRFecUlt, Byte.valueOf(A47AlbREst), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A3360AlbRImp, A3613AlbRefDsc, A6463AlbRLote});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPDISALB

            */
            A396EmprCod = AV55EmprCod ;
            A361DisCod = AV54DisCod ;
            A44AlbRecCod = AV64Albreccod ;
            A595Kilos = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Kilos() ;
            A631Metros = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Metros() ;
            A673Piezas = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Disnumpie() ;
            /* Using cursor P088B7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A673Piezas), A595Kilos, A631Metros});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            if ( ! (GXutil.strcmp("", AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Procod())==0) )
            {
               AV70DisFasLin = (short)(0) ;
               if ( AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().size() > 0 )
               {
                  AV85GXV2 = 1 ;
                  while ( AV85GXV2 <= AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().size() )
                  {
                     AV69SdtFasePedido = (app.SdtSdtFasePedido)((app.SdtSdtFasePedido)AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Fases().elementAt(-1+AV85GXV2));
                     AV70DisFasLin = (short)(AV70DisFasLin+100) ;
                     /*
                        INSERT RECORD ON TABLE TXPDISFAS

                     */
                     A396EmprCod = AV55EmprCod ;
                     A361DisCod = AV54DisCod ;
                     A758ProCod = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Procod() ;
                     A368DisFasLin = AV70DisFasLin ;
                     A457FasCod = AV69SdtFasePedido.getgxTv_SdtSdtFasePedido_Fascod() ;
                     A7740DisFasPre = DecimalUtil.doubleToDec(0) ;
                     n7740DisFasPre = false ;
                     A7742DisFasDto = DecimalUtil.doubleToDec(0) ;
                     n7742DisFasDto = false ;
                     A7741DisFasUni = "" ;
                     n7741DisFasUni = false ;
                     A7747DisFasAut = (byte)(0) ;
                     n7747DisFasAut = false ;
                     /* Using cursor P088B8 */
                     pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A457FasCod, Boolean.valueOf(n7740DisFasPre), A7740DisFasPre, Boolean.valueOf(n7741DisFasUni), A7741DisFasUni, Boolean.valueOf(n7742DisFasDto), A7742DisFasDto, Boolean.valueOf(n7747DisFasAut), Byte.valueOf(A7747DisFasAut)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(6) == 1) )
                     {
                        Gx_err = (short)(1) ;
                        Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                     }
                     else
                     {
                        Gx_err = (short)(0) ;
                        Gx_emsg = "" ;
                     }
                     /* End Insert */
                     AV85GXV2 = (int)(AV85GXV2+1) ;
                  }
               }
               /*
                  INSERT RECORD ON TABLE TXPDISLIN

               */
               A396EmprCod = AV55EmprCod ;
               A361DisCod = AV54DisCod ;
               A758ProCod = AV58SdtArticuloPedido.getgxTv_SdtSdtArticuloPedido_Procod() ;
               A846UltFasLin = AV70DisFasLin ;
               /* Using cursor P088B9 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A846UltFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
               if ( (pr_default.getStatus(7) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
            if ( AV59SdtArticuloPedidos.size() > 1 )
            {
               new app.pgenmac(remoteHandle, context).execute( AV55EmprCod, AV54DisCod, AV71CodMac) ;
            }
            GXv_int7[0] = AV73BarCodP ;
            new app.pgenbarm(remoteHandle, context).execute( AV55EmprCod, AV54DisCod, AV72MaqCod, GXv_int7) ;
            creardisposotrasbarcadotras.this.AV73BarCodP = GXv_int7[0] ;
            if ( ! (0==AV71CodMac) )
            {
               GXv_char49[0] = AV55EmprCod ;
               GXv_int7[0] = AV54DisCod ;
               GXv_int52[0] = AV73BarCodP ;
               new app.pmodmac(remoteHandle, context).execute( GXv_char49, GXv_int7, GXv_int52) ;
               creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
               creardisposotrasbarcadotras.this.AV54DisCod = GXv_int7[0] ;
               creardisposotrasbarcadotras.this.AV73BarCodP = GXv_int52[0] ;
            }
            AV74TabHdr[AV80x-1] = GXutil.str( AV73BarCodP, 8, 0) + "0" + " " ;
            AV80x = (short)(AV80x+1) ;
            AV83GXV1 = (int)(AV83GXV1+1) ;
         }
      }
      if ( AV75Carvitin == 1 )
      {
         GXv_char49[0] = AV55EmprCod ;
         new app.pinslot4(remoteHandle, context).execute( GXv_char49) ;
         creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
         AV80x = (short)(1) ;
         while ( AV80x <= 1000 )
         {
            if ( GXutil.strcmp(AV74TabHdr[AV80x-1], " ") == 0 )
            {
               if (true) break;
            }
            AV76BarCod = (int)(GXutil.lval( GXutil.substring( AV74TabHdr[AV80x-1], 1, 8))) ;
            AV77BarCodreo = (byte)(GXutil.lval( GXutil.substring( AV74TabHdr[AV80x-1], 9, 1))) ;
            AV78BarCodpar = GXutil.substring( AV74TabHdr[AV80x-1], 10, 1) ;
            GXv_char49[0] = AV55EmprCod ;
            GXv_int52[0] = AV76BarCod ;
            GXv_int51[0] = AV77BarCodreo ;
            GXv_char48[0] = AV78BarCodpar ;
            new app.pinslot3(remoteHandle, context).execute( GXv_char49, GXv_int52, GXv_int51, GXv_char48) ;
            creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
            creardisposotrasbarcadotras.this.AV76BarCod = GXv_int52[0] ;
            creardisposotrasbarcadotras.this.AV77BarCodreo = GXv_int51[0] ;
            creardisposotrasbarcadotras.this.AV78BarCodpar = GXv_char48[0] ;
            AV80x = (short)(AV80x+1) ;
         }
         GXv_char49[0] = AV55EmprCod ;
         new app.pinslot5(remoteHandle, context).execute( GXv_char49) ;
         creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
         GXv_char49[0] = AV55EmprCod ;
         new app.pinslot4(remoteHandle, context).execute( GXv_char49) ;
         creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
      }
      if ( ! (0==AV71CodMac) )
      {
         GXv_char49[0] = AV55EmprCod ;
         GXv_int52[0] = AV71CodMac ;
         new app.pagrmac(remoteHandle, context).execute( GXv_char49, GXv_int52) ;
         creardisposotrasbarcadotras.this.AV55EmprCod = GXv_char49[0] ;
         creardisposotrasbarcadotras.this.AV71CodMac = GXv_int52[0] ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "creardisposotrasbarcadotras");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV61Station = "" ;
      GXt_char1 = "" ;
      AV55EmprCod = "" ;
      AV56EmprNom = "" ;
      AV62UsurCod = "" ;
      AV52Contexto = "" ;
      AV53DatosPedidoJSON = "" ;
      AV51WebSession = httpContext.getWebSession();
      AV60SdtEnCabezadoPedido = new app.SdtSdtEncabezadoPedido(remoteHandle, context);
      AV59SdtArticuloPedidos = new GXBaseCollection<app.SdtSdtArticuloPedido>(app.SdtSdtArticuloPedido.class, "SdtArticuloPedido", "TexplusNET", remoteHandle);
      AV58SdtArticuloPedido = new app.SdtSdtArticuloPedido(remoteHandle, context);
      AV16DisArtDsc = "" ;
      GXv_char4 = new String[1] ;
      AV19DisArtMat = "" ;
      GXv_char3 = new String[1] ;
      AV47DisPle2 = "" ;
      GXv_char2 = new String[1] ;
      AV18DisArtLar = "" ;
      GXv_char9 = new String[1] ;
      AV29DisArtSua = "" ;
      GXv_char10 = new String[1] ;
      AV12DisArtAca = "" ;
      GXv_char11 = new String[1] ;
      AV21DisArtPle = "" ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new short[1] ;
      AV17DisArtEnc = "" ;
      GXv_char14 = new String[1] ;
      AV15DisArtCor = "" ;
      GXv_char15 = new String[1] ;
      AV31DisArtTr1 = "" ;
      GXv_char16 = new String[1] ;
      AV32DisArtTr2 = "" ;
      GXv_char17 = new String[1] ;
      AV33DisArtTr3 = "" ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_int21 = new short[1] ;
      AV28DisArtRdt = DecimalUtil.ZERO ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      AV34DisArtUr1 = "" ;
      GXv_char23 = new String[1] ;
      AV35DisArtUr2 = "" ;
      GXv_char24 = new String[1] ;
      AV36DisArtUr3 = "" ;
      GXv_char25 = new String[1] ;
      GXv_int26 = new short[1] ;
      GXv_int27 = new short[1] ;
      GXv_int28 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_int30 = new short[1] ;
      GXv_int31 = new short[1] ;
      GXv_int32 = new short[1] ;
      GXv_int33 = new short[1] ;
      GXv_int34 = new short[1] ;
      AV39DisEncCom = DecimalUtil.ZERO ;
      GXv_int35 = new short[1] ;
      AV38DisEncAnh = DecimalUtil.ZERO ;
      GXv_int36 = new short[1] ;
      GXv_int37 = new short[1] ;
      GXv_int38 = new short[1] ;
      GXv_int39 = new short[1] ;
      GXv_int40 = new short[1] ;
      GXv_int41 = new short[1] ;
      GXv_int42 = new short[1] ;
      GXv_int43 = new short[1] ;
      AV48DisRdoA = DecimalUtil.ZERO ;
      GXv_decimal44 = new java.math.BigDecimal[1] ;
      AV49DisRdoN = DecimalUtil.ZERO ;
      GXv_decimal45 = new java.math.BigDecimal[1] ;
      AV46DisObsGrm = "" ;
      GXv_char46 = new String[1] ;
      AV45DisObsAnc = "" ;
      GXv_char47 = new String[1] ;
      AV43DisItem5 = "" ;
      AV50DisUniMed = "" ;
      GXv_decimal50 = new java.math.BigDecimal[1] ;
      A396EmprCod = "" ;
      A365DisDes = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A338DisArtEnc = "" ;
      A336DisArtCor = "" ;
      A333DisArtAca = "" ;
      A350DisArtRdt = DecimalUtil.ZERO ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A4813DisEncCli = "" ;
      A4014DisTin = "" ;
      A757PriCod = "" ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A370DisFecCli = GXutil.nullDate() ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A351DisArtSua = "" ;
      A353DisArtTr1 = "" ;
      A354DisArtTr2 = "" ;
      A355DisArtTr3 = "" ;
      A356DisArtUr1 = "" ;
      A357DisArtUr2 = "" ;
      A358DisArtUr3 = "" ;
      A340DisArtMat = "" ;
      A4348DisUsrCod = "" ;
      A2009DisTipDis = "" ;
      A343DisArtPle = "" ;
      A5350DisObsAnc = "" ;
      A5349DisObsGrm = "" ;
      A1198DisEncAnh = DecimalUtil.ZERO ;
      A1197DisEncCom = DecimalUtil.ZERO ;
      A1908DisRdoA = DecimalUtil.ZERO ;
      A1122MaqCodDis = "" ;
      A1052DisObs = "" ;
      A1430DisLoc = "" ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A998DisNMtr = "" ;
      A999DisNMez = "" ;
      A1002DisNumTen = "" ;
      A1907DisRdoN = DecimalUtil.ZERO ;
      A1968DisRes = "" ;
      A2742DisCodTex = "" ;
      A2832DisKgsLot = DecimalUtil.ZERO ;
      A2833DisMtrLot = DecimalUtil.ZERO ;
      A2926DisPla = "" ;
      A2835DisPle2 = "" ;
      A3306DisFac = "" ;
      A3309DisNumTon = "" ;
      A3627DisFecLan = GXutil.nullDate() ;
      A3696DisParPar = "" ;
      A3826RetCod = "" ;
      A3841DisArtMer = DecimalUtil.ZERO ;
      A1031EmpesCod = "" ;
      A4355DisFecPed = GXutil.nullDate() ;
      A4469DisCruMts = DecimalUtil.ZERO ;
      A4470DisCruKgs = DecimalUtil.ZERO ;
      A4471DisCruEnr = "" ;
      A4473DisLotMts = DecimalUtil.ZERO ;
      A4474DisLotKgs = DecimalUtil.ZERO ;
      A4475DisLotMaq = "" ;
      A4477DisAcaBak = "" ;
      A4479DisAcaMar = "" ;
      A4614DisMdlCod = "" ;
      A4615DisTam = "" ;
      A4616DisHorEnt = GXutil.resetTime( GXutil.nullDate() );
      A4617DisHorReg = GXutil.resetTime( GXutil.nullDate() );
      A4720DisDishCod = "" ;
      A4876DibColDib = "" ;
      A4877DibColCol = "" ;
      A5031DisCom = "" ;
      A5032DisEstTip = "" ;
      A5252DisAcc = "" ;
      A5290DisTipCor = "" ;
      A5366DisAntp = "" ;
      A5405DisAntpT = "" ;
      A6548DisRbMaq = DecimalUtil.ZERO ;
      A7510DisDto = DecimalUtil.ZERO ;
      A8887DisFchT = GXutil.nullDate() ;
      A8886DisDest = "" ;
      A8885DisFEnt = "" ;
      A9771DisItem1 = "" ;
      A9772DisItem2 = "" ;
      A9773DisItem3 = "" ;
      A9774DisItem4 = "" ;
      A9786DisItem5 = "" ;
      A9787DisItem6 = "" ;
      A10887Cod_Idtx = "" ;
      A11661DisOrdComp = "" ;
      A7739DisExp = "" ;
      A11864Nxt_artcli = "" ;
      A11859Nxt_modelo = "" ;
      A11861Nxt_statio = "" ;
      AV68DisObsTxt = "" ;
      W396EmprCod = "" ;
      A377DisObsTxt = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P088B4_A13217NormaID = new String[] {""} ;
      P088B4_A396EmprCod = new String[] {""} ;
      A13217NormaID = "" ;
      A13213DisNormID = "" ;
      A13214DisNormSt = "" ;
      A13215DisNormNC = "" ;
      A45AlbRef = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A3613AlbRefDsc = "" ;
      A50AlbRLoc = "" ;
      A3360AlbRImp = "" ;
      A6463AlbRLote = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      AV69SdtFasePedido = new app.SdtSdtFasePedido(remoteHandle, context);
      A758ProCod = "" ;
      A457FasCod = "" ;
      A7740DisFasPre = DecimalUtil.ZERO ;
      A7742DisFasDto = DecimalUtil.ZERO ;
      A7741DisFasUni = "" ;
      AV72MaqCod = "" ;
      GXv_int7 = new int[1] ;
      AV74TabHdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV74TabHdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV78BarCodpar = "" ;
      GXv_int51 = new byte[1] ;
      GXv_char48 = new String[1] ;
      GXv_char49 = new String[1] ;
      GXv_int52 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.creardisposotrasbarcadotras__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P088B4_A13217NormaID, P088B4_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte AV37DisArtUrg ;
   private byte GXv_int6[] ;
   private byte A390DisTipCol ;
   private byte A359DisArtUrg ;
   private byte A367DisEst ;
   private byte A2743DisNumTex1 ;
   private byte A3695DisParReo ;
   private byte A4013DisEnv ;
   private byte A5024DisTipEst ;
   private byte A7067DisUltNot ;
   private byte A7515DisDesCol ;
   private byte A376DisObsLin ;
   private byte A378DisObsULin ;
   private byte A47AlbREst ;
   private byte A7747DisFasAut ;
   private byte AV77BarCodreo ;
   private byte GXv_int51[] ;
   private short AV75Carvitin ;
   private short AV80x ;
   private short AV30DisArtTip ;
   private short GXv_int13[] ;
   private short AV22DisArtPt1 ;
   private short GXv_int19[] ;
   private short AV23DisArtPt2 ;
   private short GXv_int20[] ;
   private short AV24DisArtPt3 ;
   private short GXv_int21[] ;
   private short AV25DisArtPu1 ;
   private short GXv_int26[] ;
   private short AV26DisArtPu2 ;
   private short GXv_int27[] ;
   private short AV27DisArtPu3 ;
   private short GXv_int28[] ;
   private short AV20DisArtPes ;
   private short GXv_int29[] ;
   private short AV41DisGraCru ;
   private short GXv_int30[] ;
   private short GXv_int31[] ;
   private short AV14DisArtAn1 ;
   private short GXv_int32[] ;
   private short AV13DisArtAcb ;
   private short GXv_int33[] ;
   private short AV11DisArtAc2 ;
   private short GXv_int34[] ;
   private short GXv_int35[] ;
   private short GXv_int36[] ;
   private short AV44DisNumCor ;
   private short GXv_int37[] ;
   private short AV8DisAncSal1 ;
   private short GXv_int38[] ;
   private short AV9DisAncSal2 ;
   private short GXv_int39[] ;
   private short AV10DisAncSal3 ;
   private short GXv_int40[] ;
   private short AV40DisGraAca2 ;
   private short GXv_int41[] ;
   private short AV42DisGraCru2 ;
   private short GXv_int42[] ;
   private short GXv_int43[] ;
   private short AV63ExisteArticulo ;
   private short A334DisArtAnh ;
   private short A1906DisGraAca ;
   private short A374DisNumPie ;
   private short A1502DisPart ;
   private short A352DisArtTip ;
   private short A344DisArtPt1 ;
   private short A345DisArtPt2 ;
   private short A346DisArtPt3 ;
   private short A347DisArtPu1 ;
   private short A348DisArtPu2 ;
   private short A349DisArtPu3 ;
   private short A342DisArtPes ;
   private short A383DisPieLan ;
   private short A372DisKgmLan ;
   private short A373DisMtrLan ;
   private short A1225DisGraCru ;
   private short A1231DisArtAn1 ;
   private short A1232DisArtAcb ;
   private short A1233DisArtAc2 ;
   private short A2402DisManCod ;
   private short A2744DisNumTex2 ;
   private short A3127DisNumCor ;
   private short A3128DisAncSal1 ;
   private short A3129DisAncSal2 ;
   private short A3130DisAncSal3 ;
   private short A3132DisGraCru2 ;
   private short A1051DisNumCol ;
   private short A4468DisPelAnh ;
   private short A4472DisLotPza ;
   private short A4478DisAcaAnh ;
   private short AV65Nlin ;
   private short AV66i ;
   private short AV67t ;
   private short Gx_err ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short AV70DisFasLin ;
   private short A368DisFasLin ;
   private short A846UltFasLin ;
   private int AV71CodMac ;
   private int AV83GXV1 ;
   private int AV54DisCod ;
   private int GX_INS34 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A2310DisCliDes ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int A2403DisOpeAnt ;
   private int A2831DisNumLot ;
   private int A3694DisParCod ;
   private int A4293DisNPzas ;
   private int A4294DisNPzasL ;
   private int A4476DisAcaFor ;
   private int A4785DisNroCor ;
   private int A4918DisDibCoDN ;
   private int A4919DisDibCoCN ;
   private int A4879DibColColN ;
   private int A6547DisVolMaq ;
   private int GX_INS40 ;
   private int W361DisCod ;
   private int GX_INS1812 ;
   private int AV64Albreccod ;
   private int GXt_int8 ;
   private int GX_INS7 ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int GX_INS35 ;
   private int A673Piezas ;
   private int AV85GXV2 ;
   private int GX_INS39 ;
   private int GX_INS38 ;
   private int AV73BarCodP ;
   private int GXv_int7[] ;
   private int AV76BarCod ;
   private int GXv_int52[] ;
   private int GX_I ;
   private java.math.BigDecimal AV28DisArtRdt ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal AV39DisEncCom ;
   private java.math.BigDecimal AV38DisEncAnh ;
   private java.math.BigDecimal AV48DisRdoA ;
   private java.math.BigDecimal GXv_decimal44[] ;
   private java.math.BigDecimal AV49DisRdoN ;
   private java.math.BigDecimal GXv_decimal45[] ;
   private java.math.BigDecimal GXv_decimal50[] ;
   private java.math.BigDecimal A350DisArtRdt ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal A1198DisEncAnh ;
   private java.math.BigDecimal A1197DisEncCom ;
   private java.math.BigDecimal A1908DisRdoA ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A1907DisRdoN ;
   private java.math.BigDecimal A2832DisKgsLot ;
   private java.math.BigDecimal A2833DisMtrLot ;
   private java.math.BigDecimal A3841DisArtMer ;
   private java.math.BigDecimal A4469DisCruMts ;
   private java.math.BigDecimal A4470DisCruKgs ;
   private java.math.BigDecimal A4473DisLotMts ;
   private java.math.BigDecimal A4474DisLotKgs ;
   private java.math.BigDecimal A6548DisRbMaq ;
   private java.math.BigDecimal A7510DisDto ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A7740DisFasPre ;
   private java.math.BigDecimal A7742DisFasDto ;
   private String AV61Station ;
   private String GXt_char1 ;
   private String AV55EmprCod ;
   private String AV56EmprNom ;
   private String AV62UsurCod ;
   private String AV16DisArtDsc ;
   private String GXv_char4[] ;
   private String AV19DisArtMat ;
   private String GXv_char3[] ;
   private String AV47DisPle2 ;
   private String GXv_char2[] ;
   private String AV18DisArtLar ;
   private String GXv_char9[] ;
   private String AV29DisArtSua ;
   private String GXv_char10[] ;
   private String AV12DisArtAca ;
   private String GXv_char11[] ;
   private String AV21DisArtPle ;
   private String GXv_char12[] ;
   private String AV17DisArtEnc ;
   private String GXv_char14[] ;
   private String AV15DisArtCor ;
   private String GXv_char15[] ;
   private String AV31DisArtTr1 ;
   private String GXv_char16[] ;
   private String AV32DisArtTr2 ;
   private String GXv_char17[] ;
   private String AV33DisArtTr3 ;
   private String GXv_char18[] ;
   private String AV34DisArtUr1 ;
   private String GXv_char23[] ;
   private String AV35DisArtUr2 ;
   private String GXv_char24[] ;
   private String AV36DisArtUr3 ;
   private String GXv_char25[] ;
   private String AV46DisObsGrm ;
   private String GXv_char46[] ;
   private String AV45DisObsAnc ;
   private String GXv_char47[] ;
   private String AV43DisItem5 ;
   private String AV50DisUniMed ;
   private String A396EmprCod ;
   private String A365DisDes ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A338DisArtEnc ;
   private String A336DisArtCor ;
   private String A333DisArtAca ;
   private String A392DisUniMed ;
   private String A4813DisEncCli ;
   private String A4014DisTin ;
   private String A757PriCod ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A351DisArtSua ;
   private String A353DisArtTr1 ;
   private String A354DisArtTr2 ;
   private String A355DisArtTr3 ;
   private String A356DisArtUr1 ;
   private String A357DisArtUr2 ;
   private String A358DisArtUr3 ;
   private String A340DisArtMat ;
   private String A4348DisUsrCod ;
   private String A2009DisTipDis ;
   private String A343DisArtPle ;
   private String A5350DisObsAnc ;
   private String A5349DisObsGrm ;
   private String A1122MaqCodDis ;
   private String A1052DisObs ;
   private String A1430DisLoc ;
   private String A998DisNMtr ;
   private String A999DisNMez ;
   private String A1002DisNumTen ;
   private String A1968DisRes ;
   private String A2742DisCodTex ;
   private String A2926DisPla ;
   private String A2835DisPle2 ;
   private String A3306DisFac ;
   private String A3309DisNumTon ;
   private String A3696DisParPar ;
   private String A3826RetCod ;
   private String A1031EmpesCod ;
   private String A4471DisCruEnr ;
   private String A4475DisLotMaq ;
   private String A4477DisAcaBak ;
   private String A4479DisAcaMar ;
   private String A4614DisMdlCod ;
   private String A4615DisTam ;
   private String A4720DisDishCod ;
   private String A4876DibColDib ;
   private String A4877DibColCol ;
   private String A5031DisCom ;
   private String A5032DisEstTip ;
   private String A5252DisAcc ;
   private String A5290DisTipCor ;
   private String A5366DisAntp ;
   private String A5405DisAntpT ;
   private String A8886DisDest ;
   private String A8885DisFEnt ;
   private String A9771DisItem1 ;
   private String A9772DisItem2 ;
   private String A9773DisItem3 ;
   private String A9774DisItem4 ;
   private String A9786DisItem5 ;
   private String A9787DisItem6 ;
   private String A10887Cod_Idtx ;
   private String A7739DisExp ;
   private String A11864Nxt_artcli ;
   private String A11859Nxt_modelo ;
   private String A11861Nxt_statio ;
   private String AV68DisObsTxt ;
   private String W396EmprCod ;
   private String A377DisObsTxt ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A13217NormaID ;
   private String A13213DisNormID ;
   private String A13214DisNormSt ;
   private String A13215DisNormNC ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A3613AlbRefDsc ;
   private String A50AlbRLoc ;
   private String A3360AlbRImp ;
   private String A6463AlbRLote ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A7741DisFasUni ;
   private String AV72MaqCod ;
   private String AV74TabHdr[] ;
   private String AV78BarCodpar ;
   private String GXv_char48[] ;
   private String GXv_char49[] ;
   private java.util.Date A4616DisHorEnt ;
   private java.util.Date A4617DisHorReg ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A3627DisFecLan ;
   private java.util.Date A4355DisFecPed ;
   private java.util.Date A8887DisFchT ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n349DisArtPu3 ;
   private boolean n2009DisTipDis ;
   private boolean n1122MaqCodDis ;
   private boolean n1002DisNumTen ;
   private boolean n1968DisRes ;
   private boolean n2403DisOpeAnt ;
   private boolean n2742DisCodTex ;
   private boolean n2744DisNumTex2 ;
   private boolean n3627DisFecLan ;
   private boolean n3694DisParCod ;
   private boolean n3695DisParReo ;
   private boolean n3696DisParPar ;
   private boolean n3826RetCod ;
   private boolean n1031EmpesCod ;
   private boolean n1051DisNumCol ;
   private boolean n4013DisEnv ;
   private boolean n4293DisNPzas ;
   private boolean n4294DisNPzasL ;
   private boolean n4355DisFecPed ;
   private boolean n4472DisLotPza ;
   private boolean n4475DisLotMaq ;
   private boolean n4476DisAcaFor ;
   private boolean n4616DisHorEnt ;
   private boolean n4617DisHorReg ;
   private boolean n4876DibColDib ;
   private boolean n4877DibColCol ;
   private boolean n4918DisDibCoDN ;
   private boolean n4919DisDibCoCN ;
   private boolean n4879DibColColN ;
   private boolean n5031DisCom ;
   private boolean n7067DisUltNot ;
   private boolean n7515DisDesCol ;
   private boolean n7510DisDto ;
   private boolean n8887DisFchT ;
   private boolean n8885DisFEnt ;
   private boolean n10887Cod_Idtx ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean n7740DisFasPre ;
   private boolean n7742DisFasDto ;
   private boolean n7741DisFasUni ;
   private boolean n7747DisFasAut ;
   private String AV52Contexto ;
   private String AV53DatosPedidoJSON ;
   private String A11661DisOrdComp ;
   private com.genexus.webpanels.WebSession AV51WebSession ;
   private IDataStoreProvider pr_default ;
   private String[] P088B4_A13217NormaID ;
   private String[] P088B4_A396EmprCod ;
   private GXBaseCollection<app.SdtSdtArticuloPedido> AV59SdtArticuloPedidos ;
   private app.SdtSdtArticuloPedido AV58SdtArticuloPedido ;
   private app.SdtSdtFasePedido AV69SdtFasePedido ;
   private app.SdtSdtEncabezadoPedido AV60SdtEnCabezadoPedido ;
}

final  class creardisposotrasbarcadotras__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P088B2", "INSERT INTO TXPOBSERV(EmprCod, DisCod, DisObsLin, DisObsTxt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPOBSERV")
         ,new UpdateCursor("P088B3", "INSERT INTO TXPDISPOS(EmprCod, DisCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisObsULin, DisArtMat, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, CliCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraCru2, DisFac, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DisNumCol, DisObs, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisDesCol, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisOrdComp, Nxt_modelo, Nxt_statio, Nxt_artcli, DisCliNum, DisEnt, DisArtLar, DisArtOpe, PartCod, TipConCod, DisNumBas, DisGraAca2, DisManCod1, DisManCod2, DibCli, DibInt, DisComULin, DisGraCob, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisGraTam, DisRec, DisMaqEst, DisMemo1, DisMemo2, MarcaId, DisCnoEncO, CpteId, DesaID, DptoID, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P088B4", "SELECT NormaID, EmprCod FROM TXPNORMAS ORDER BY EmprCod, NormaID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P088B5", "INSERT INTO TXPDISNOR(EmprCod, DisCod, DisNormID, DisNormSt, DisNormNC) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
         ,new UpdateCursor("P088B6", "INSERT INTO TXPALBREC(EmprCod, AlbRecCod, CliCod, AlbRef, AlbRPieEnt, AlbRUni, AlbRLoc, AlbRFen, AlbRUniEnt, AlbRReo, AlbRPieUti, AlbRUniUti, AlbRFecUlt, AlbREst, TipEntCod, ProceCod, AlbRImp, AlbRefDsc, AlbRLote, TrnCod, AlbREnt, AlbRPieReb, AlbRUniReb, AlbNumEti, AlbRDes, AlbRUlin, HisEmpULin, AlbRDisCli, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P088B7", "INSERT INTO TXPDISALB(EmprCod, DisCod, AlbRecCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALB")
         ,new UpdateCursor("P088B8", "INSERT INTO TXPDISFAS(EmprCod, DisCod, ProCod, DisFasLin, FasCod, DisFasPre, DisFasUni, DisFasDto, DisFasAut, FasApr, DisMaqPru, DisQuiUl, DisFasRec, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisFasObs, DisPreSal, DisPrePie, DisVelPro, DisNumPas, FasPreObl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISFAS")
         ,new UpdateCursor("P088B9", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, ?, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 60);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[17]).byteValue());
               }
               stmt.setString(16, (String)parms[18], 26);
               stmt.setByte(17, ((Number) parms[19]).byteValue());
               stmt.setString(18, (String)parms[20], 16);
               stmt.setString(19, (String)parms[21], 6);
               stmt.setString(20, (String)parms[22], 6);
               stmt.setString(21, (String)parms[23], 10);
               stmt.setShort(22, ((Number) parms[24]).shortValue());
               stmt.setString(23, (String)parms[25], 1);
               stmt.setString(24, (String)parms[26], 1);
               stmt.setString(25, (String)parms[27], 4);
               stmt.setShort(26, ((Number) parms[28]).shortValue());
               stmt.setString(27, (String)parms[29], 4);
               stmt.setShort(28, ((Number) parms[30]).shortValue());
               stmt.setString(29, (String)parms[31], 4);
               stmt.setShort(30, ((Number) parms[32]).shortValue());
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[33], 2);
               stmt.setByte(32, ((Number) parms[34]).byteValue());
               stmt.setString(33, (String)parms[35], 4);
               stmt.setShort(34, ((Number) parms[36]).shortValue());
               stmt.setString(35, (String)parms[37], 4);
               stmt.setShort(36, ((Number) parms[38]).shortValue());
               stmt.setString(37, (String)parms[39], 4);
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[41]).shortValue());
               }
               stmt.setShort(39, ((Number) parms[42]).shortValue());
               stmt.setByte(40, ((Number) parms[43]).byteValue());
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[44], 2);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[45], 2);
               stmt.setShort(43, ((Number) parms[46]).shortValue());
               stmt.setShort(44, ((Number) parms[47]).shortValue());
               stmt.setShort(45, ((Number) parms[48]).shortValue());
               stmt.setString(46, (String)parms[49], 10);
               stmt.setString(47, (String)parms[50], 10);
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[52], 10);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(49, (String)parms[54], 6);
               }
               stmt.setInt(50, ((Number) parms[55]).intValue());
               stmt.setString(51, (String)parms[56], 13);
               stmt.setInt(52, ((Number) parms[57]).intValue());
               stmt.setBigDecimal(53, (java.math.BigDecimal)parms[58], 2);
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[59], 2);
               stmt.setShort(55, ((Number) parms[60]).shortValue());
               stmt.setShort(56, ((Number) parms[61]).shortValue());
               stmt.setShort(57, ((Number) parms[62]).shortValue());
               stmt.setShort(58, ((Number) parms[63]).shortValue());
               stmt.setString(59, (String)parms[64], 10);
               stmt.setShort(60, ((Number) parms[65]).shortValue());
               stmt.setShort(61, ((Number) parms[66]).shortValue());
               stmt.setBigDecimal(62, (java.math.BigDecimal)parms[67], 2);
               stmt.setBigDecimal(63, (java.math.BigDecimal)parms[68], 2);
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[70], 1);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[72], 1);
               }
               stmt.setInt(66, ((Number) parms[73]).intValue());
               stmt.setShort(67, ((Number) parms[74]).shortValue());
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 68 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(68, ((Number) parms[76]).intValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 69 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(69, (String)parms[78], 4);
               }
               stmt.setByte(70, ((Number) parms[79]).byteValue());
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 71 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(71, ((Number) parms[81]).shortValue());
               }
               stmt.setInt(72, ((Number) parms[82]).intValue());
               stmt.setBigDecimal(73, (java.math.BigDecimal)parms[83], 2);
               stmt.setBigDecimal(74, (java.math.BigDecimal)parms[84], 2);
               stmt.setString(75, (String)parms[85], 1);
               stmt.setString(76, (String)parms[86], 30);
               stmt.setShort(77, ((Number) parms[87]).shortValue());
               stmt.setShort(78, ((Number) parms[88]).shortValue());
               stmt.setShort(79, ((Number) parms[89]).shortValue());
               stmt.setShort(80, ((Number) parms[90]).shortValue());
               stmt.setShort(81, ((Number) parms[91]).shortValue());
               stmt.setString(82, (String)parms[92], 1);
               stmt.setString(83, (String)parms[93], 10);
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 84 , Types.DATE );
               }
               else
               {
                  stmt.setDate(84, (java.util.Date)parms[95]);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 85 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(85, (String)parms[97], 4);
               }
               stmt.setBigDecimal(86, (java.math.BigDecimal)parms[98], 2);
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[100], 16);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(88, ((Number) parms[102]).shortValue());
               }
               stmt.setString(89, (String)parms[103], 30);
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(90, ((Number) parms[105]).byteValue());
               }
               stmt.setString(91, (String)parms[106], 1);
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(92, ((Number) parms[108]).intValue());
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(93, ((Number) parms[110]).intValue());
               }
               stmt.setString(94, (String)parms[111], 8);
               stmt.setShort(95, ((Number) parms[112]).shortValue());
               stmt.setBigDecimal(96, (java.math.BigDecimal)parms[113], 2);
               stmt.setBigDecimal(97, (java.math.BigDecimal)parms[114], 2);
               stmt.setString(98, (String)parms[115], 1);
               stmt.setBigDecimal(99, (java.math.BigDecimal)parms[116], 2);
               stmt.setBigDecimal(100, (java.math.BigDecimal)parms[117], 2);
               stmt.setString(101, (String)parms[118], 1);
               stmt.setShort(102, ((Number) parms[119]).shortValue());
               stmt.setString(103, (String)parms[120], 1);
               stmt.setString(104, (String)parms[121], 13);
               stmt.setString(105, (String)parms[122], 4);
               if ( ((Boolean) parms[123]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(106, (java.util.Date)parms[124], true);
               }
               if ( ((Boolean) parms[125]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(107, (java.util.Date)parms[126], true);
               }
               stmt.setString(108, (String)parms[127], 12);
               stmt.setInt(109, ((Number) parms[128]).intValue());
               stmt.setString(110, (String)parms[129], 20);
               if ( ((Boolean) parms[130]).booleanValue() )
               {
                  stmt.setNull( 111 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(111, (String)parms[131], 30);
               }
               stmt.setByte(112, ((Number) parms[132]).byteValue());
               if ( ((Boolean) parms[133]).booleanValue() )
               {
                  stmt.setNull( 113 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(113, (String)parms[134], 12);
               }
               stmt.setString(114, (String)parms[135], 1);
               stmt.setString(115, (String)parms[136], 1);
               stmt.setString(116, (String)parms[137], 2);
               stmt.setString(117, (String)parms[138], 20);
               stmt.setString(118, (String)parms[139], 20);
               stmt.setString(119, (String)parms[140], 1);
               stmt.setString(120, (String)parms[141], 1);
               stmt.setInt(121, ((Number) parms[142]).intValue());
               stmt.setBigDecimal(122, (java.math.BigDecimal)parms[143], 2);
               if ( ((Boolean) parms[144]).booleanValue() )
               {
                  stmt.setNull( 123 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(123, (java.math.BigDecimal)parms[145], 2);
               }
               if ( ((Boolean) parms[146]).booleanValue() )
               {
                  stmt.setNull( 124 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(124, ((Number) parms[147]).byteValue());
               }
               stmt.setString(125, (String)parms[148], 1);
               if ( ((Boolean) parms[149]).booleanValue() )
               {
                  stmt.setNull( 126 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(126, (String)parms[150], 30);
               }
               stmt.setString(127, (String)parms[151], 30);
               if ( ((Boolean) parms[152]).booleanValue() )
               {
                  stmt.setNull( 128 , Types.DATE );
               }
               else
               {
                  stmt.setDate(128, (java.util.Date)parms[153]);
               }
               stmt.setString(129, (String)parms[154], 20);
               stmt.setString(130, (String)parms[155], 20);
               stmt.setString(131, (String)parms[156], 20);
               stmt.setString(132, (String)parms[157], 20);
               stmt.setString(133, (String)parms[158], 20);
               stmt.setString(134, (String)parms[159], 20);
               if ( ((Boolean) parms[160]).booleanValue() )
               {
                  stmt.setNull( 135 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(135, (String)parms[161], 4);
               }
               if ( ((Boolean) parms[162]).booleanValue() )
               {
                  stmt.setNull( 136 , Types.DATE );
               }
               else
               {
                  stmt.setDate(136, (java.util.Date)parms[163]);
               }
               if ( ((Boolean) parms[164]).booleanValue() )
               {
                  stmt.setNull( 137 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(137, ((Number) parms[165]).shortValue());
               }
               if ( ((Boolean) parms[166]).booleanValue() )
               {
                  stmt.setNull( 138 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(138, (String)parms[167], 6);
               }
               if ( ((Boolean) parms[168]).booleanValue() )
               {
                  stmt.setNull( 139 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(139, ((Number) parms[169]).intValue());
               }
               if ( ((Boolean) parms[170]).booleanValue() )
               {
                  stmt.setNull( 140 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(140, (String)parms[171], 12);
               }
               if ( ((Boolean) parms[172]).booleanValue() )
               {
                  stmt.setNull( 141 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(141, ((Number) parms[173]).intValue());
               }
               if ( ((Boolean) parms[174]).booleanValue() )
               {
                  stmt.setNull( 142 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(142, ((Number) parms[175]).intValue());
               }
               if ( ((Boolean) parms[176]).booleanValue() )
               {
                  stmt.setNull( 143 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(143, ((Number) parms[177]).intValue());
               }
               if ( ((Boolean) parms[178]).booleanValue() )
               {
                  stmt.setNull( 144 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(144, ((Number) parms[179]).byteValue());
               }
               if ( ((Boolean) parms[180]).booleanValue() )
               {
                  stmt.setNull( 145 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(145, ((Number) parms[181]).intValue());
               }
               if ( ((Boolean) parms[182]).booleanValue() )
               {
                  stmt.setNull( 146 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(146, ((Number) parms[183]).byteValue());
               }
               if ( ((Boolean) parms[184]).booleanValue() )
               {
                  stmt.setNull( 147 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(147, (String)parms[185], 1);
               }
               stmt.setVarchar(148, (String)parms[186], 200, false);
               stmt.setString(149, (String)parms[187], 30);
               stmt.setString(150, (String)parms[188], 4);
               stmt.setString(151, (String)parms[189], 30);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 2);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[17]).shortValue());
               }
               stmt.setString(17, (String)parms[18], 1);
               stmt.setString(18, (String)parms[19], 26);
               stmt.setString(19, (String)parms[20], 20);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[12]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

