package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradadeproductosalmacen_trn_bc extends GXWebPanel implements IGxSilentTrn
{
   public entradadeproductosalmacen_trn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradadeproductosalmacen_trn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradadeproductosalmacen_trn_bc.class ));
   }

   public entradadeproductosalmacen_trn_bc( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1R542( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1R542( ) ;
      standaloneModal( ) ;
      addRow1R542( ) ;
      Gx_mode = "INS" ;
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         /* Execute user event: After Trn */
         e111R52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z719PrdNum = A719PrdNum ;
            Z597LinEnt = A597LinEnt ;
            SetMode( "UPD") ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_1R50( )
   {
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1R542( ) ;
         }
         else
         {
            checkExtendedTable1R542( ) ;
            if ( AnyError == 0 )
            {
               zm1R542( 85) ;
               zm1R542( 86) ;
               zm1R542( 87) ;
            }
            closeExtendedTableCursors1R542( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121R52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradadeproductosalmacen_trn_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char2[0] ;
      entradadeproductosalmacen_trn_bc.this.AV8EmprNom = GXv_char3[0] ;
      entradadeproductosalmacen_trn_bc.this.AV9UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV11F_endutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV11F_endutex = GXt_int5 ;
      GXt_int5 = (byte)(AV12St0018) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ST0018", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV12St0018 = GXt_int5 ;
      GXt_int5 = (byte)(AV13Proprv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV13Proprv = GXt_int5 ;
      GXt_int5 = (byte)(AV14verCont) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CONTEV", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV14verCont = GXt_int5 ;
      GXt_int5 = (byte)(AV15tintutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV15tintutex = GXt_int5 ;
      GXt_int5 = (byte)(AV16SinCompras) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SINCOP", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV16SinCompras = GXt_int5 ;
      GXt_int5 = (byte)(AV17vincolor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VINCOL", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV17vincolor = GXt_int5 ;
      GXt_int5 = (byte)(AV18BCTexplus) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BCTXP", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV18BCTexplus = GXt_int5 ;
      GXt_int5 = (byte)(AV19AudEntradas) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ADINST", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV19AudEntradas = GXt_int5 ;
      GXt_int5 = (byte)(AV20NoUpd) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOUPPR", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV20NoUpd = GXt_int5 ;
      GXt_int5 = (byte)(AV21Rontaltex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV21Rontaltex = GXt_int5 ;
      GXt_int5 = (byte)(AV22Nalbaran20) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBA20", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV22Nalbaran20 = GXt_int5 ;
      GXt_int5 = (byte)(AV23Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV23Carvitin = GXt_int5 ;
      GXt_int5 = (byte)(AV10ExiLoteID) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV10ExiLoteID = GXt_int5 ;
      GXt_int5 = (byte)(AV24uel041) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UEL041", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV24uel041 = GXt_int5 ;
      GXt_int5 = (byte)(AV25Er) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV25Er = GXt_int5 ;
      GXt_int5 = (byte)(AV26Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV26Artextil = GXt_int5 ;
      GXt_int5 = (byte)(AV27Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV27Intexco = GXt_int5 ;
      GXt_int7 = AV28Consumos ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "011100", GXv_int8) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int7 = GXv_int8[0] ;
      AV28Consumos = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV29FlagPre) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENTPRE", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV29FlagPre = GXt_int5 ;
      GXt_int5 = (byte)(AV30PreTot) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRETOT", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV30PreTot = GXt_int5 ;
      GXt_int5 = (byte)(AV34FlagCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV34FlagCcs = GXt_int5 ;
      GXt_int5 = (byte)(AV33FlagEti) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETIPRX", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV33FlagEti = GXt_int5 ;
      GXt_int5 = (byte)(AV32FlagFecCcs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FECCCS", ""), GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV32FlagFecCcs = GXt_int5 ;
      GXt_int5 = (byte)(AV31FlagEst) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "100009", GXv_int6) ;
      entradadeproductosalmacen_trn_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31FlagEst = GXt_int5 ;
   }

   public void e111R52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") != 0 ) && ! (0==A658PedCod) )
      {
         httpContext.popup(formatLink("app.cerrarordendecompra", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A658PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV65PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PedCod","PrdNum","PedCum"}) , new Object[] {"A396EmprCod","A658PedCod","AV65PrdNum","AV73PedCum"});
      }
      /*  Sending Event outputs  */
   }

   public void e131R52( )
   {
      /* 'DoLpedidPrompt' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1R542( int GX_JID )
   {
      if ( ( GX_JID == 84 ) || ( GX_JID == 0 ) )
      {
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z418EntUniEnt = A418EntUniEnt ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z6156EntPrvNum = A6156EntPrvNum ;
         Z5686EntLotN = A5686EntLotN ;
         Z5685EntFVal = A5685EntFVal ;
         Z10783EntObs = A10783EntObs ;
         Z416EntNumCon = A416EntNumCon ;
         Z414EntEti = A414EntEti ;
         Z411EntCon = A411EntCon ;
         Z413EntConIni = A413EntConIni ;
         Z412EntConFin = A412EntConFin ;
         Z5469EntNro = A5469EntNro ;
         Z10782EntUniAlb = A10782EntUniAlb ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z5691EntBnc = A5691EntBnc ;
         Z7695EntCC = A7695EntCC ;
         Z7696EntCCoCod = A7696EntCCoCod ;
         Z10187EntRemNro = A10187EntRemNro ;
         Z10186EntRemFch = A10186EntRemFch ;
         Z10185EntRemSuc = A10185EntRemSuc ;
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z12716EntFabId = A12716EntFabId ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z14035EntNEmb = A14035EntNEmb ;
         Z658PedCod = A658PedCod ;
         Z664PedNumLin = A664PedNumLin ;
         Z13833CantPdte = A13833CantPdte ;
      }
      if ( ( GX_JID == 85 ) || ( GX_JID == 0 ) )
      {
         Z726PrdPreMed = A726PrdPreMed ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z718PrdNom = A718PrdNom ;
         Z727PrdRec = A727PrdRec ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z664PedNumLin = A664PedNumLin ;
         Z13833CantPdte = A13833CantPdte ;
      }
      if ( ( GX_JID == 86 ) || ( GX_JID == 0 ) )
      {
         Z661PedFec = A661PedFec ;
         Z666PedPri = A666PedPri ;
         Z667PedSit = A667PedSit ;
         Z664PedNumLin = A664PedNumLin ;
         Z13833CantPdte = A13833CantPdte ;
      }
      if ( ( GX_JID == 87 ) || ( GX_JID == 0 ) )
      {
         Z659PedCum = A659PedCum ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z669PedUni = A669PedUni ;
         Z665PedPre = A665PedPre ;
         Z660PedDto = A660PedDto ;
         Z664PedNumLin = A664PedNumLin ;
         Z13833CantPdte = A13833CantPdte ;
      }
      if ( GX_JID == -84 )
      {
         Z597LinEnt = A597LinEnt ;
         Z419EntUniRem = A419EntUniRem ;
         Z417EntPre = A417EntPre ;
         Z418EntUniEnt = A418EntUniEnt ;
         Z13235EntLoteID = A13235EntLoteID ;
         Z415EntFecEnt = A415EntFecEnt ;
         Z11Albaran = A11Albaran ;
         Z12857EntNAlbar = A12857EntNAlbar ;
         Z6156EntPrvNum = A6156EntPrvNum ;
         Z5686EntLotN = A5686EntLotN ;
         Z5685EntFVal = A5685EntFVal ;
         Z10783EntObs = A10783EntObs ;
         Z416EntNumCon = A416EntNumCon ;
         Z414EntEti = A414EntEti ;
         Z411EntCon = A411EntCon ;
         Z413EntConIni = A413EntConIni ;
         Z412EntConFin = A412EntConFin ;
         Z5469EntNro = A5469EntNro ;
         Z10782EntUniAlb = A10782EntUniAlb ;
         Z3404EntPedCum = A3404EntPedCum ;
         Z5691EntBnc = A5691EntBnc ;
         Z7695EntCC = A7695EntCC ;
         Z7696EntCCoCod = A7696EntCCoCod ;
         Z10187EntRemNro = A10187EntRemNro ;
         Z10186EntRemFch = A10186EntRemFch ;
         Z10185EntRemSuc = A10185EntRemSuc ;
         Z10184EntRemTpo = A10184EntRemTpo ;
         Z12716EntFabId = A12716EntFabId ;
         Z13456EntUbicaci = A13456EntUbicaci ;
         Z14035EntNEmb = A14035EntNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z750PrdValStk = A750PrdValStk ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z718PrdNom = A718PrdNom ;
         Z727PrdRec = A727PrdRec ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z661PedFec = A661PedFec ;
         Z666PedPri = A666PedPri ;
         Z667PedSit = A667PedSit ;
         Z659PedCum = A659PedCum ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z669PedUni = A669PedUni ;
         Z665PedPre = A665PedPre ;
         Z660PedDto = A660PedDto ;
      }
   }

   public void standaloneNotModal( )
   {
      AV75Pgmname = "StocksQuimicos.EntradadeProductosAlmacen_TRN_BC" ;
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A10184EntRemTpo)==0) && ( Gx_BScreen == 0 ) )
      {
         A10184EntRemTpo = " " ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( Gx_BScreen == 0 ) )
      {
         A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
         AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
         AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         AV37oldEntFecent = O415EntFecEnt ;
         AV52FecAnt = O415EntFecEnt ;
         AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      }
   }

   public void load1R542( )
   {
      /* Using cursor BC01R58 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A704PrdExiAlm = BC01R58_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R58_A684PrdCanPen[0] ;
         A419EntUniRem = BC01R58_A419EntUniRem[0] ;
         A750PrdValStk = BC01R58_A750PrdValStk[0] ;
         A417EntPre = BC01R58_A417EntPre[0] ;
         A726PrdPreMed = BC01R58_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R58_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R58_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R58_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R58_A724PrdPreAct[0] ;
         A418EntUniEnt = BC01R58_A418EntUniEnt[0] ;
         A13235EntLoteID = BC01R58_A13235EntLoteID[0] ;
         A415EntFecEnt = BC01R58_A415EntFecEnt[0] ;
         A11Albaran = BC01R58_A11Albaran[0] ;
         A12857EntNAlbar = BC01R58_A12857EntNAlbar[0] ;
         A6156EntPrvNum = BC01R58_A6156EntPrvNum[0] ;
         n6156EntPrvNum = BC01R58_n6156EntPrvNum[0] ;
         A5686EntLotN = BC01R58_A5686EntLotN[0] ;
         A5685EntFVal = BC01R58_A5685EntFVal[0] ;
         A10783EntObs = BC01R58_A10783EntObs[0] ;
         A416EntNumCon = BC01R58_A416EntNumCon[0] ;
         A414EntEti = BC01R58_A414EntEti[0] ;
         A411EntCon = BC01R58_A411EntCon[0] ;
         A413EntConIni = BC01R58_A413EntConIni[0] ;
         A412EntConFin = BC01R58_A412EntConFin[0] ;
         A5469EntNro = BC01R58_A5469EntNro[0] ;
         A10782EntUniAlb = BC01R58_A10782EntUniAlb[0] ;
         A3404EntPedCum = BC01R58_A3404EntPedCum[0] ;
         A5691EntBnc = BC01R58_A5691EntBnc[0] ;
         A661PedFec = BC01R58_A661PedFec[0] ;
         A666PedPri = BC01R58_A666PedPri[0] ;
         A667PedSit = BC01R58_A667PedSit[0] ;
         A659PedCum = BC01R58_A659PedCum[0] ;
         A663PedFulEnt = BC01R58_A663PedFulEnt[0] ;
         A657PedCanEnt = BC01R58_A657PedCanEnt[0] ;
         A669PedUni = BC01R58_A669PedUni[0] ;
         A665PedPre = BC01R58_A665PedPre[0] ;
         A7695EntCC = BC01R58_A7695EntCC[0] ;
         A7696EntCCoCod = BC01R58_A7696EntCCoCod[0] ;
         A10187EntRemNro = BC01R58_A10187EntRemNro[0] ;
         A10186EntRemFch = BC01R58_A10186EntRemFch[0] ;
         A10185EntRemSuc = BC01R58_A10185EntRemSuc[0] ;
         A10184EntRemTpo = BC01R58_A10184EntRemTpo[0] ;
         A12716EntFabId = BC01R58_A12716EntFabId[0] ;
         A13456EntUbicaci = BC01R58_A13456EntUbicaci[0] ;
         A660PedDto = BC01R58_A660PedDto[0] ;
         A705PrdExiCC = BC01R58_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R58_A698PrdDetPar[0] ;
         A718PrdNom = BC01R58_A718PrdNom[0] ;
         A727PrdRec = BC01R58_A727PrdRec[0] ;
         A14035EntNEmb = BC01R58_A14035EntNEmb[0] ;
         A658PedCod = BC01R58_A658PedCod[0] ;
         n658PedCod = BC01R58_n658PedCod[0] ;
         A795PrvNum = BC01R58_A795PrvNum[0] ;
         A856ValCod = BC01R58_A856ValCod[0] ;
         zm1R542( -84) ;
      }
      pr_default.close(6);
      onLoadActions1R542( ) ;
   }

   public void onLoadActions1R542( )
   {
      O724PrdPreAct = A724PrdPreAct ;
      O750PrdValStk = A750PrdValStk ;
      O684PrdCanPen = A684PrdCanPen ;
      O704PrdExiAlm = A704PrdExiAlm ;
      if ( (0==A658PedCod) )
      {
         AV43PedPri = "1" ;
      }
      else
      {
         if ( ! (0==A658PedCod) )
         {
            AV43PedPri = A666PedPri ;
         }
      }
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      if ( isIns( )  && (0==A658PedCod) )
      {
         A417EntPre = A724PrdPreAct ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  )
         {
            A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         }
      }
      AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
      AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      AV37oldEntFecent = O415EntFecEnt ;
      AV52FecAnt = O415EntFecEnt ;
      AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      if ( true /* After */ && ! (0==A658PedCod) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) && isIns( )  )
      {
         A418EntUniEnt = A13833CantPdte ;
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
               }
               else
               {
                  if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                  {
                     A684PrdCanPen = DecimalUtil.ZERO ;
                  }
               }
            }
         }
      }
      AV38OldEntUni = O418EntUniEnt ;
      AV46UniOld = O418EntUniEnt ;
      if ( isDlt( )  )
      {
         A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
         }
      }
      AV42OldExiAlm = O704PrdExiAlm ;
      if ( isIns( )  && true /* After */ )
      {
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) >= 0 ) && ( ! (0==A658PedCod) ) && true /* After */ )
         {
            A3404EntPedCum = httpContext.getMessage( "S", "") ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) < 0 ) && ( ! (0==A658PedCod) && true /* After */ ) )
            {
               A3404EntPedCum = httpContext.getMessage( "N", "") ;
            }
         }
      }
      AV36OldEntPre = O417EntPre ;
      AV51PrecAnt = O417EntPre ;
      if ( isIns( )  && true /* Level */ )
      {
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
            {
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
               {
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      AV40OldRemanente = O419EntUniRem ;
      AV39oldlote = O5686EntLotN ;
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         A12716EntFabId = A6156EntPrvNum ;
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_bc.this.GXt_char1 = GXv_char3[0] ;
         AV59PrdNomX = GXt_char1 ;
      }
   }

   public void checkExtendedTable1R542( )
   {
      nIsDirty_42 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01R59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
            AnyError = (short)(1) ;
         }
      }
      A661PedFec = BC01R59_A661PedFec[0] ;
      A666PedPri = BC01R59_A666PedPri[0] ;
      A667PedSit = BC01R59_A667PedSit[0] ;
      pr_default.close(7);
      if ( (0==A658PedCod) )
      {
         AV43PedPri = "1" ;
      }
      else
      {
         if ( ! (0==A658PedCod) )
         {
            AV43PedPri = A666PedPri ;
         }
      }
      nIsDirty_42 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      /* Using cursor BC01R510 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      A704PrdExiAlm = BC01R510_A704PrdExiAlm[0] ;
      A684PrdCanPen = BC01R510_A684PrdCanPen[0] ;
      A750PrdValStk = BC01R510_A750PrdValStk[0] ;
      A726PrdPreMed = BC01R510_A726PrdPreMed[0] ;
      A713PrdFulEnt = BC01R510_A713PrdFulEnt[0] ;
      A709PrdFecPre = BC01R510_A709PrdFecPre[0] ;
      A725PrdPreAnt = BC01R510_A725PrdPreAnt[0] ;
      A724PrdPreAct = BC01R510_A724PrdPreAct[0] ;
      A705PrdExiCC = BC01R510_A705PrdExiCC[0] ;
      A698PrdDetPar = BC01R510_A698PrdDetPar[0] ;
      A718PrdNom = BC01R510_A718PrdNom[0] ;
      A727PrdRec = BC01R510_A727PrdRec[0] ;
      A795PrvNum = BC01R510_A795PrvNum[0] ;
      A856ValCod = BC01R510_A856ValCod[0] ;
      nIsDirty_42 = (short)(1) ;
      O724PrdPreAct = A724PrdPreAct ;
      nIsDirty_42 = (short)(1) ;
      O750PrdValStk = A750PrdValStk ;
      nIsDirty_42 = (short)(1) ;
      O684PrdCanPen = A684PrdCanPen ;
      nIsDirty_42 = (short)(1) ;
      O704PrdExiAlm = A704PrdExiAlm ;
      pr_default.close(8);
      if ( GXutil.strcmp(A727PrdRec, "S") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto en recuento", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A856ValCod == 3 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto SUPRIMIDO", ""), 0, "");
      }
      if ( A856ValCod == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto a SUPRIMIR", ""), 0, "");
      }
      /* Using cursor BC01R511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A658PedCod) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "LPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
         }
      }
      A659PedCum = BC01R511_A659PedCum[0] ;
      A663PedFulEnt = BC01R511_A663PedFulEnt[0] ;
      A657PedCanEnt = BC01R511_A657PedCanEnt[0] ;
      A669PedUni = BC01R511_A669PedUni[0] ;
      A665PedPre = BC01R511_A665PedPre[0] ;
      A660PedDto = BC01R511_A660PedDto[0] ;
      pr_default.close(9);
      nIsDirty_42 = (short)(1) ;
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      if ( ( ( DecimalUtil.compareTo(A657PedCanEnt, A669PedUni) > 0 ) ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad entregada superior a la pedida", ""), 0, "");
      }
      if ( isIns( )  && (0==A658PedCod) )
      {
         nIsDirty_42 = (short)(1) ;
         A417EntPre = A724PrdPreAct ;
      }
      else
      {
         if ( ! (0==A658PedCod) && isIns( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A417EntPre = GXutil.roundDecimal( A665PedPre.multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         }
      }
      if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto Compuesto", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
      AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
      AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
      AV37oldEntFecent = O415EntFecEnt ;
      AV52FecAnt = O415EntFecEnt ;
      AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
      AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
      AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && (0==AV32FlagFecCcs) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( AV32FlagFecCcs == 1 ) && ( isIns( )  || isUpd( )  ) )
      {
         httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 0, "");
      }
      if ( (GXutil.strcmp("", A11Albaran)==0) && true /* After */ && ( AV15tintutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Documento Fornecedor", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ && ! (0==A658PedCod) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A418EntUniEnt)==0) && isIns( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A418EntUniEnt = A13833CantPdte ;
      }
      if ( isDlt( )  && ( ! (0==A658PedCod) ) )
      {
         nIsDirty_42 = (short)(1) ;
         A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
         {
            nIsDirty_42 = (short)(1) ;
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         }
         else
         {
            if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
            {
               nIsDirty_42 = (short)(1) ;
               A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
               }
               else
               {
                  if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                  {
                     nIsDirty_42 = (short)(1) ;
                     nIsDirty_42 = (short)(1) ;
                     A684PrdCanPen = DecimalUtil.ZERO ;
                  }
               }
            }
         }
      }
      if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "¡ATENCION! Cantidad Entregada superior a la Pendiente", ""), 0, "");
      }
      AV38OldEntUni = O418EntUniEnt ;
      AV46UniOld = O418EntUniEnt ;
      if ( isDlt( )  )
      {
         nIsDirty_42 = (short)(1) ;
         A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_42 = (short)(1) ;
            A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
         }
      }
      AV42OldExiAlm = O704PrdExiAlm ;
      if ( DecimalUtil.compareTo(A704PrdExiAlm, DecimalUtil.stringToDec("999999.9998")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad excesiva en  almacen", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && true /* After */ )
      {
         nIsDirty_42 = (short)(1) ;
         A419EntUniRem = O419EntUniRem.add(A418EntUniEnt) ;
      }
      else
      {
         if ( isUpd( )  && true /* After */ )
         {
            nIsDirty_42 = (short)(1) ;
            A419EntUniRem = (O419EntUniRem.add(A418EntUniEnt).subtract(O418EntUniEnt)) ;
         }
         else
         {
            if ( isDlt( )  && true /* After */ )
            {
               nIsDirty_42 = (short)(1) ;
               A419EntUniRem = (O419EntUniRem.subtract(A418EntUniEnt)) ;
            }
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A3404EntPedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A3404EntPedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      else
      {
         if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) >= 0 ) && ( ! (0==A658PedCod) ) && true /* After */ )
         {
            nIsDirty_42 = (short)(1) ;
            A3404EntPedCum = httpContext.getMessage( "S", "") ;
         }
         else
         {
            if ( ( DecimalUtil.compareTo((A657PedCanEnt.add(A418EntUniEnt).subtract(AV38OldEntUni)), A669PedUni) < 0 ) && ( ! (0==A658PedCod) && true /* After */ ) )
            {
               nIsDirty_42 = (short)(1) ;
               A3404EntPedCum = httpContext.getMessage( "N", "") ;
            }
         }
      }
      AV36OldEntPre = O417EntPre ;
      AV51PrecAnt = O417EntPre ;
      if ( isIns( )  && true /* Level */ )
      {
         nIsDirty_42 = (short)(1) ;
         A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            nIsDirty_42 = (short)(1) ;
            A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               nIsDirty_42 = (short)(1) ;
               A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
            }
         }
      }
      if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
      }
      else
      {
         if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
         {
            nIsDirty_42 = (short)(1) ;
            A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
            {
               nIsDirty_42 = (short)(1) ;
               A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
            }
            else
            {
               if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
               {
                  nIsDirty_42 = (short)(1) ;
                  A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
               }
            }
         }
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && (0==AV29FlagPre) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Precio con valor CERO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* Level */ && true /* After */ && (DecimalUtil.compareTo(DecimalUtil.ZERO, A417EntPre)==0) && ( AV29FlagPre == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "MENSAJE.Precio con valor CERO", ""), 0, "");
      }
      AV40OldRemanente = O419EntUniRem ;
      if ( DecimalUtil.compareTo(A419EntUniRem, DecimalUtil.stringToDec("999999.98")) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad Remanente excesiva", ""), 1, "");
         AnyError = (short)(1) ;
      }
      AV39oldlote = O5686EntLotN ;
      if ( ( isDlt( )  || isUpd( )  ) && ( GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "Disolucion Producto", "")) == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Producto DILUIDO", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A5686EntLotN)==0) && true /* After */ && ( AV15tintutex == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Lote", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A3404EntPedCum, "S") == 0 ) || ( GXutil.strcmp(A3404EntPedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cerrar?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  && (0==A6156EntPrvNum) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A6156EntPrvNum = A795PrvNum ;
         n6156EntPrvNum = false ;
      }
      if ( isIns( )  && (0==A12716EntFabId) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_42 = (short)(1) ;
         A12716EntFabId = A6156EntPrvNum ;
      }
      if ( (IsModified == 1) && true /* Level */ && ( DecimalUtil.compareTo(O419EntUniRem, O418EntUniEnt) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Remanente ya modificado", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* After */ )
      {
         GXt_char1 = AV59PrdNomX ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_bc.this.GXt_char1 = GXv_char3[0] ;
         AV59PrdNomX = GXt_char1 ;
      }
      if ( ( GXutil.strcmp(GXutil.trim( AV59PrdNomX), httpContext.getMessage( "Inexistente", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedore Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1R542( )
   {
      pr_default.close(7);
      pr_default.close(2);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void getKey1R542( )
   {
      /* Using cursor BC01R512 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01R513 */
      pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(BC01R513_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1R542( 84) ;
         RcdFound42 = (short)(1) ;
         A597LinEnt = BC01R513_A597LinEnt[0] ;
         A419EntUniRem = BC01R513_A419EntUniRem[0] ;
         A417EntPre = BC01R513_A417EntPre[0] ;
         A418EntUniEnt = BC01R513_A418EntUniEnt[0] ;
         A13235EntLoteID = BC01R513_A13235EntLoteID[0] ;
         A415EntFecEnt = BC01R513_A415EntFecEnt[0] ;
         A11Albaran = BC01R513_A11Albaran[0] ;
         A12857EntNAlbar = BC01R513_A12857EntNAlbar[0] ;
         A6156EntPrvNum = BC01R513_A6156EntPrvNum[0] ;
         n6156EntPrvNum = BC01R513_n6156EntPrvNum[0] ;
         A5686EntLotN = BC01R513_A5686EntLotN[0] ;
         A5685EntFVal = BC01R513_A5685EntFVal[0] ;
         A10783EntObs = BC01R513_A10783EntObs[0] ;
         A416EntNumCon = BC01R513_A416EntNumCon[0] ;
         A414EntEti = BC01R513_A414EntEti[0] ;
         A411EntCon = BC01R513_A411EntCon[0] ;
         A413EntConIni = BC01R513_A413EntConIni[0] ;
         A412EntConFin = BC01R513_A412EntConFin[0] ;
         A5469EntNro = BC01R513_A5469EntNro[0] ;
         A10782EntUniAlb = BC01R513_A10782EntUniAlb[0] ;
         A3404EntPedCum = BC01R513_A3404EntPedCum[0] ;
         A5691EntBnc = BC01R513_A5691EntBnc[0] ;
         A7695EntCC = BC01R513_A7695EntCC[0] ;
         A7696EntCCoCod = BC01R513_A7696EntCCoCod[0] ;
         A10187EntRemNro = BC01R513_A10187EntRemNro[0] ;
         A10186EntRemFch = BC01R513_A10186EntRemFch[0] ;
         A10185EntRemSuc = BC01R513_A10185EntRemSuc[0] ;
         A10184EntRemTpo = BC01R513_A10184EntRemTpo[0] ;
         A12716EntFabId = BC01R513_A12716EntFabId[0] ;
         A13456EntUbicaci = BC01R513_A13456EntUbicaci[0] ;
         A14035EntNEmb = BC01R513_A14035EntNEmb[0] ;
         A719PrdNum = BC01R513_A719PrdNum[0] ;
         A658PedCod = BC01R513_A658PedCod[0] ;
         n658PedCod = BC01R513_n658PedCod[0] ;
         O419EntUniRem = A419EntUniRem ;
         O418EntUniEnt = A418EntUniEnt ;
         O415EntFecEnt = A415EntFecEnt ;
         O417EntPre = A417EntPre ;
         O5686EntLotN = A5686EntLotN ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1R542( ) ;
         if ( AnyError == 1 )
         {
            RcdFound42 = (short)(0) ;
            initializeNonKey1R542( ) ;
         }
         Gx_mode = sMode42 ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1R542( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKey1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_1R50( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency1R542( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01R514 */
         pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
         if ( (pr_default.getStatus(12) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(12) == 101) || ( DecimalUtil.compareTo(Z419EntUniRem, BC01R514_A419EntUniRem[0]) != 0 ) || ( DecimalUtil.compareTo(Z417EntPre, BC01R514_A417EntPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z418EntUniEnt, BC01R514_A418EntUniEnt[0]) != 0 ) || ( Z13235EntLoteID != BC01R514_A13235EntLoteID[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z415EntFecEnt), GXutil.resetTime(BC01R514_A415EntFecEnt[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11Albaran, BC01R514_A11Albaran[0]) != 0 ) || ( GXutil.strcmp(Z12857EntNAlbar, BC01R514_A12857EntNAlbar[0]) != 0 ) || ( Z6156EntPrvNum != BC01R514_A6156EntPrvNum[0] ) || ( GXutil.strcmp(Z5686EntLotN, BC01R514_A5686EntLotN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5685EntFVal), GXutil.resetTime(BC01R514_A5685EntFVal[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10783EntObs, BC01R514_A10783EntObs[0]) != 0 ) || ( Z416EntNumCon != BC01R514_A416EntNumCon[0] ) || ( Z414EntEti != BC01R514_A414EntEti[0] ) || ( Z411EntCon != BC01R514_A411EntCon[0] ) || ( Z413EntConIni != BC01R514_A413EntConIni[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z412EntConFin != BC01R514_A412EntConFin[0] ) || ( Z5469EntNro != BC01R514_A5469EntNro[0] ) || ( DecimalUtil.compareTo(Z10782EntUniAlb, BC01R514_A10782EntUniAlb[0]) != 0 ) || ( GXutil.strcmp(Z3404EntPedCum, BC01R514_A3404EntPedCum[0]) != 0 ) || ( GXutil.strcmp(Z5691EntBnc, BC01R514_A5691EntBnc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7695EntCC, BC01R514_A7695EntCC[0]) != 0 ) || ( Z7696EntCCoCod != BC01R514_A7696EntCCoCod[0] ) || ( GXutil.strcmp(Z10187EntRemNro, BC01R514_A10187EntRemNro[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10186EntRemFch), GXutil.resetTime(BC01R514_A10186EntRemFch[0])) ) || ( GXutil.strcmp(Z10185EntRemSuc, BC01R514_A10185EntRemSuc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10184EntRemTpo, BC01R514_A10184EntRemTpo[0]) != 0 ) || ( Z12716EntFabId != BC01R514_A12716EntFabId[0] ) || ( GXutil.strcmp(Z13456EntUbicaci, BC01R514_A13456EntUbicaci[0]) != 0 ) || ( Z14035EntNEmb != BC01R514_A14035EntNEmb[0] ) || ( Z658PedCod != BC01R514_A658PedCod[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENTALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01R515 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z726PrdPreMed, BC01R515_A726PrdPreMed[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(BC01R515_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(BC01R515_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, BC01R515_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, BC01R515_A724PrdPreAct[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z705PrdExiCC, BC01R515_A705PrdExiCC[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, BC01R515_A698PrdDetPar[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, BC01R515_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, BC01R515_A727PrdRec[0]) != 0 ) || ( Z795PrvNum != BC01R515_A795PrvNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z856ValCod != BC01R515_A856ValCod[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1R542( )
   {
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1R542( 0) ;
         checkOptimisticConcurrency1R542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R542( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1R542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01R516 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A597LinEnt), A419EntUniRem, A417EntPre, A418EntUniEnt, Long.valueOf(A13235EntLoteID), A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), A13456EntUbicaci, Byte.valueOf(A14035EntNEmb), A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11R542( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                     }
                     if ( ( AV20NoUpd == 0 ) && ( true /* After */ || true /* After */ ) )
                     {
                        A724PrdPreAct = A417EntPre ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A713PrdFulEnt = A415EntFecEnt ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A709PrdFecPre = A415EntFecEnt ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal9[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9) ;
                        entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
                        entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
                        entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal9[0] ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV38OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV39oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A725PrdPreAnt = O724PrdPreAct ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load1R542( ) ;
         }
         endLevel1R542( ) ;
      }
      closeExtendedTableCursors1R542( ) ;
   }

   public void update1R542( )
   {
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R542( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1R542( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1R542( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01R517 */
                  pr_default.execute(15, new Object[] {A419EntUniRem, A417EntPre, A418EntUniEnt, Long.valueOf(A13235EntLoteID), A415EntFecEnt, A11Albaran, A12857EntNAlbar, Boolean.valueOf(n6156EntPrvNum), Integer.valueOf(A6156EntPrvNum), A5686EntLotN, A5685EntFVal, A10783EntObs, Short.valueOf(A416EntNumCon), Byte.valueOf(A414EntEti), Byte.valueOf(A411EntCon), Integer.valueOf(A413EntConIni), Integer.valueOf(A412EntConFin), Integer.valueOf(A5469EntNro), A10782EntUniAlb, A3404EntPedCum, A5691EntBnc, A7695EntCC, Short.valueOf(A7696EntCCoCod), A10187EntRemNro, A10186EntRemFch, A10185EntRemSuc, A10184EntRemTpo, Integer.valueOf(A12716EntFabId), A13456EntUbicaci, Byte.valueOf(A14035EntNEmb), Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENTALM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1R542( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11R542( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                     }
                     if ( ( AV20NoUpd == 0 ) && ( true /* After */ || true /* After */ ) )
                     {
                        A724PrdPreAct = A417EntPre ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A713PrdFulEnt = A415EntFecEnt ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A709PrdFecPre = A415EntFecEnt ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A719PrdNum ;
                        GXv_int8[0] = A6156EntPrvNum ;
                        GXv_decimal9[0] = A417EntPre ;
                        new app.pprenp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_decimal9) ;
                        entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
                        entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
                        entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
                        entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal9[0] ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( AV37oldEntFecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + "/" + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.str( AV38OldEntUni, 9, 2) + "/" + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + "/" + GXutil.trim( GXutil.str( A419EntUniRem, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( AV39oldlote) + "/" + GXutil.trim( A5686EntLotN) ;
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                     }
                     if ( ( true /* After */ || true /* After */ ) && (0==AV20NoUpd) )
                     {
                        A725PrdPreAnt = O724PrdPreAct ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel1R542( ) ;
      }
      closeExtendedTableCursors1R542( ) ;
   }

   public void deferredUpdate1R542( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1R542( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1R542( ) ;
         afterConfirm1R542( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1R542( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01R518 */
               pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTALM");
               if ( AnyError == 0 )
               {
                  updateTablesN11R542( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     new app.core.actpedidodesdeentradaproductoalmacen(remoteHandle, context).execute( ) ;
                  }
                  if ( true /* After */ )
                  {
                     AV35Inc_obs = Gx_mode + " " + GXutil.trim( A719PrdNum) + ",# " + GXutil.trim( GXutil.str( A597LinEnt, 4, 0)) + httpContext.getMessage( httpContext.getMessage( ",Fecha ", ""), "") + GXutil.trim( localUtil.dtoc( A415EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) + httpContext.getMessage( httpContext.getMessage( ",Ped ", ""), "") + GXutil.trim( GXutil.str( A658PedCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( ",Cant ", ""), "") + GXutil.trim( GXutil.str( A418EntUniEnt, 9, 2)) + httpContext.getMessage( httpContext.getMessage( ",Prec ", ""), "") + GXutil.str( AV36OldEntPre, 14, 5) + "/" + GXutil.trim( GXutil.str( A417EntPre, 14, 5)) + httpContext.getMessage( httpContext.getMessage( ",Rema ", ""), "") + GXutil.trim( GXutil.str( AV40OldRemanente, 11, 4)) + httpContext.getMessage( httpContext.getMessage( ",Lote ", ""), "") + GXutil.trim( A5686EntLotN) ;
                  }
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV75Pgmname, 1, 10), AV9UsurCod, AV7Station, AV35Inc_obs, 99999999, (byte)(0), " ") ;
                  }
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1R542( ) ;
      Gx_mode = sMode42 ;
   }

   public void onDeleteControls1R542( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && (0==AV32FlagFecCcs) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* Level */ && true /* After */ && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53LastFec)) && GXutil.resetTime(AV53LastFec).after( GXutil.resetTime( A415EntFecEnt )) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A415EntFecEnt)) && ( AV32FlagFecCcs == 1 ) && ( isIns( )  || isUpd( )  ) )
         {
            httpContext.GX_msglist.addItem(AV62msg_ctrl_fecha, 0, "");
         }
         if ( ( isDlt( )  || isUpd( )  ) && ( GXutil.strcmp(A5686EntLotN, httpContext.getMessage( "Disolucion Producto", "")) == 0 ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Producto DILUIDO", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor BC01R519 */
         pr_default.execute(17, new Object[] {A396EmprCod, A719PrdNum});
         zm1R542( 85) ;
         A704PrdExiAlm = BC01R519_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R519_A684PrdCanPen[0] ;
         A750PrdValStk = BC01R519_A750PrdValStk[0] ;
         A726PrdPreMed = BC01R519_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R519_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R519_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R519_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R519_A724PrdPreAct[0] ;
         A705PrdExiCC = BC01R519_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R519_A698PrdDetPar[0] ;
         A718PrdNom = BC01R519_A718PrdNom[0] ;
         A727PrdRec = BC01R519_A727PrdRec[0] ;
         A795PrvNum = BC01R519_A795PrvNum[0] ;
         A856ValCod = BC01R519_A856ValCod[0] ;
         O750PrdValStk = A750PrdValStk ;
         O684PrdCanPen = A684PrdCanPen ;
         O704PrdExiAlm = A704PrdExiAlm ;
         pr_default.close(17);
         AV47Year = (short)(GXutil.year( A415EntFecEnt)) ;
         AV63Fecha = localUtil.ymdtod( AV47Year, 12, 1) ;
         AV48Mes = (byte)(GXutil.month( A415EntFecEnt)) ;
         AV37oldEntFecent = O415EntFecEnt ;
         AV52FecAnt = O415EntFecEnt ;
         AV49AnyAnt = (short)(GXutil.year( O415EntFecEnt)) ;
         AV50MesAnt = (byte)(GXutil.month( O415EntFecEnt)) ;
         AV72DiasFin = (short)(GXutil.ddiff(GXutil.eomdate( AV63Fecha),A415EntFecEnt)) ;
         /* Using cursor BC01R520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = BC01R520_A661PedFec[0] ;
         A666PedPri = BC01R520_A666PedPri[0] ;
         A667PedSit = BC01R520_A667PedSit[0] ;
         pr_default.close(18);
         /* Using cursor BC01R521 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         A659PedCum = BC01R521_A659PedCum[0] ;
         A663PedFulEnt = BC01R521_A663PedFulEnt[0] ;
         A657PedCanEnt = BC01R521_A657PedCanEnt[0] ;
         A669PedUni = BC01R521_A669PedUni[0] ;
         A665PedPre = BC01R521_A665PedPre[0] ;
         A660PedDto = BC01R521_A660PedDto[0] ;
         pr_default.close(19);
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         if ( (0==A658PedCod) )
         {
            AV43PedPri = "1" ;
         }
         else
         {
            if ( ! (0==A658PedCod) )
            {
               AV43PedPri = A666PedPri ;
            }
         }
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         if ( true /* After */ )
         {
            GXt_char1 = AV59PrdNomX ;
            GXv_char4[0] = A396EmprCod ;
            GXv_int8[0] = A6156EntPrvNum ;
            GXv_char3[0] = GXt_char1 ;
            new app.pctrprv(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
            entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
            entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
            entradadeproductosalmacen_trn_bc.this.GXt_char1 = GXv_char3[0] ;
            AV59PrdNomX = GXt_char1 ;
         }
         AV38OldEntUni = O418EntUniEnt ;
         AV46UniOld = O418EntUniEnt ;
         if ( isDlt( )  )
         {
            A704PrdExiAlm = O704PrdExiAlm.subtract(O418EntUniEnt) ;
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A704PrdExiAlm = O704PrdExiAlm.add(A418EntUniEnt).subtract(O418EntUniEnt) ;
            }
         }
         AV42OldExiAlm = O704PrdExiAlm ;
         if ( isDlt( )  && ( ! (0==A658PedCod) ) )
         {
            A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ! (0==A658PedCod) ) && ( ! (0==A658PedCod) ) )
            {
               A684PrdCanPen = O684PrdCanPen.add(O418EntUniEnt) ;
            }
            else
            {
               if ( isUpd( )  && ( ! (0==A658PedCod) ) && ! ( ! (0==A658PedCod) ) )
               {
                  A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ! (0==A658PedCod) ) )
                  {
                     A684PrdCanPen = O684PrdCanPen.subtract(A418EntUniEnt).add(O418EntUniEnt) ;
                  }
                  else
                  {
                     if ( ( A684PrdCanPen.doubleValue() < 0 ) && ! (0==A658PedCod) )
                     {
                        A684PrdCanPen = DecimalUtil.ZERO ;
                     }
                  }
               }
            }
         }
         AV36OldEntPre = O417EntPre ;
         AV51PrecAnt = O417EntPre ;
         if ( isIns( )  && true /* Level */ )
         {
            A750PrdValStk = O750PrdValStk.add(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
         }
         else
         {
            if ( isUpd( )  && true /* Level */ )
            {
               A750PrdValStk = O750PrdValStk.add((GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2).subtract(GXutil.roundDecimal( AV36OldEntPre.multiply(AV38OldEntUni), 2)))) ;
            }
            else
            {
               if ( isDlt( )  && true /* Level */ )
               {
                  A750PrdValStk = O750PrdValStk.subtract(GXutil.roundDecimal( A417EntPre.multiply(A418EntUniEnt), 2)) ;
               }
            }
         }
         if ( ( A704PrdExiAlm.doubleValue() != 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() > 0 ) )
         {
            A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide(A704PrdExiAlm, 18, java.math.RoundingMode.DOWN), 3) ;
         }
         else
         {
            if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( AV28Consumos == 1 ) && ( A750PrdValStk.doubleValue() == 0 ) )
            {
               A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               if ( ( ( A704PrdExiAlm.doubleValue() != 0 ) || ( A705PrdExiCC.doubleValue() != 0 ) ) && ( AV28Consumos == 0 ) )
               {
                  A726PrdPreMed = GXutil.roundDecimal( A750PrdValStk.divide((A704PrdExiAlm.add(A705PrdExiCC)), 18, java.math.RoundingMode.DOWN), 3) ;
               }
               else
               {
                  if ( ( A704PrdExiAlm.doubleValue() == 0 ) && ( A705PrdExiCC.doubleValue() == 0 ) && ( AV28Consumos == 0 ) )
                  {
                     A726PrdPreMed = DecimalUtil.doubleToDec(0) ;
                  }
               }
            }
         }
         AV40OldRemanente = O419EntUniRem ;
         AV39oldlote = O5686EntLotN ;
      }
   }

   public void updateTablesN11R542( )
   {
      /* Using cursor BC01R522 */
      pr_default.execute(20, new Object[] {A704PrdExiAlm, A684PrdCanPen, A750PrdValStk, A726PrdPreMed, A713PrdFulEnt, A709PrdFecPre, A725PrdPreAnt, A724PrdPreAct, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1R542( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(12);
      }
      pr_default.close(13);
      if ( AnyError == 0 )
      {
         beforeComplete1R542( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1R542( )
   {
      /* Scan By routine */
      /* Using cursor BC01R523 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A597LinEnt)});
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A597LinEnt = BC01R523_A597LinEnt[0] ;
         A704PrdExiAlm = BC01R523_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R523_A684PrdCanPen[0] ;
         A419EntUniRem = BC01R523_A419EntUniRem[0] ;
         A750PrdValStk = BC01R523_A750PrdValStk[0] ;
         A417EntPre = BC01R523_A417EntPre[0] ;
         A726PrdPreMed = BC01R523_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R523_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R523_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R523_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R523_A724PrdPreAct[0] ;
         A418EntUniEnt = BC01R523_A418EntUniEnt[0] ;
         A13235EntLoteID = BC01R523_A13235EntLoteID[0] ;
         A415EntFecEnt = BC01R523_A415EntFecEnt[0] ;
         A11Albaran = BC01R523_A11Albaran[0] ;
         A12857EntNAlbar = BC01R523_A12857EntNAlbar[0] ;
         A6156EntPrvNum = BC01R523_A6156EntPrvNum[0] ;
         n6156EntPrvNum = BC01R523_n6156EntPrvNum[0] ;
         A5686EntLotN = BC01R523_A5686EntLotN[0] ;
         A5685EntFVal = BC01R523_A5685EntFVal[0] ;
         A10783EntObs = BC01R523_A10783EntObs[0] ;
         A416EntNumCon = BC01R523_A416EntNumCon[0] ;
         A414EntEti = BC01R523_A414EntEti[0] ;
         A411EntCon = BC01R523_A411EntCon[0] ;
         A413EntConIni = BC01R523_A413EntConIni[0] ;
         A412EntConFin = BC01R523_A412EntConFin[0] ;
         A5469EntNro = BC01R523_A5469EntNro[0] ;
         A10782EntUniAlb = BC01R523_A10782EntUniAlb[0] ;
         A3404EntPedCum = BC01R523_A3404EntPedCum[0] ;
         A5691EntBnc = BC01R523_A5691EntBnc[0] ;
         A661PedFec = BC01R523_A661PedFec[0] ;
         A666PedPri = BC01R523_A666PedPri[0] ;
         A667PedSit = BC01R523_A667PedSit[0] ;
         A659PedCum = BC01R523_A659PedCum[0] ;
         A663PedFulEnt = BC01R523_A663PedFulEnt[0] ;
         A657PedCanEnt = BC01R523_A657PedCanEnt[0] ;
         A669PedUni = BC01R523_A669PedUni[0] ;
         A665PedPre = BC01R523_A665PedPre[0] ;
         A7695EntCC = BC01R523_A7695EntCC[0] ;
         A7696EntCCoCod = BC01R523_A7696EntCCoCod[0] ;
         A10187EntRemNro = BC01R523_A10187EntRemNro[0] ;
         A10186EntRemFch = BC01R523_A10186EntRemFch[0] ;
         A10185EntRemSuc = BC01R523_A10185EntRemSuc[0] ;
         A10184EntRemTpo = BC01R523_A10184EntRemTpo[0] ;
         A12716EntFabId = BC01R523_A12716EntFabId[0] ;
         A13456EntUbicaci = BC01R523_A13456EntUbicaci[0] ;
         A660PedDto = BC01R523_A660PedDto[0] ;
         A705PrdExiCC = BC01R523_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R523_A698PrdDetPar[0] ;
         A718PrdNom = BC01R523_A718PrdNom[0] ;
         A727PrdRec = BC01R523_A727PrdRec[0] ;
         A14035EntNEmb = BC01R523_A14035EntNEmb[0] ;
         A719PrdNum = BC01R523_A719PrdNum[0] ;
         A658PedCod = BC01R523_A658PedCod[0] ;
         n658PedCod = BC01R523_n658PedCod[0] ;
         A795PrvNum = BC01R523_A795PrvNum[0] ;
         A856ValCod = BC01R523_A856ValCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1R542( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound42 = (short)(0) ;
      scanKeyLoad1R542( ) ;
   }

   public void scanKeyLoad1R542( )
   {
      sMode42 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A597LinEnt = BC01R523_A597LinEnt[0] ;
         A704PrdExiAlm = BC01R523_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R523_A684PrdCanPen[0] ;
         A419EntUniRem = BC01R523_A419EntUniRem[0] ;
         A750PrdValStk = BC01R523_A750PrdValStk[0] ;
         A417EntPre = BC01R523_A417EntPre[0] ;
         A726PrdPreMed = BC01R523_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R523_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R523_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R523_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R523_A724PrdPreAct[0] ;
         A418EntUniEnt = BC01R523_A418EntUniEnt[0] ;
         A13235EntLoteID = BC01R523_A13235EntLoteID[0] ;
         A415EntFecEnt = BC01R523_A415EntFecEnt[0] ;
         A11Albaran = BC01R523_A11Albaran[0] ;
         A12857EntNAlbar = BC01R523_A12857EntNAlbar[0] ;
         A6156EntPrvNum = BC01R523_A6156EntPrvNum[0] ;
         n6156EntPrvNum = BC01R523_n6156EntPrvNum[0] ;
         A5686EntLotN = BC01R523_A5686EntLotN[0] ;
         A5685EntFVal = BC01R523_A5685EntFVal[0] ;
         A10783EntObs = BC01R523_A10783EntObs[0] ;
         A416EntNumCon = BC01R523_A416EntNumCon[0] ;
         A414EntEti = BC01R523_A414EntEti[0] ;
         A411EntCon = BC01R523_A411EntCon[0] ;
         A413EntConIni = BC01R523_A413EntConIni[0] ;
         A412EntConFin = BC01R523_A412EntConFin[0] ;
         A5469EntNro = BC01R523_A5469EntNro[0] ;
         A10782EntUniAlb = BC01R523_A10782EntUniAlb[0] ;
         A3404EntPedCum = BC01R523_A3404EntPedCum[0] ;
         A5691EntBnc = BC01R523_A5691EntBnc[0] ;
         A661PedFec = BC01R523_A661PedFec[0] ;
         A666PedPri = BC01R523_A666PedPri[0] ;
         A667PedSit = BC01R523_A667PedSit[0] ;
         A659PedCum = BC01R523_A659PedCum[0] ;
         A663PedFulEnt = BC01R523_A663PedFulEnt[0] ;
         A657PedCanEnt = BC01R523_A657PedCanEnt[0] ;
         A669PedUni = BC01R523_A669PedUni[0] ;
         A665PedPre = BC01R523_A665PedPre[0] ;
         A7695EntCC = BC01R523_A7695EntCC[0] ;
         A7696EntCCoCod = BC01R523_A7696EntCCoCod[0] ;
         A10187EntRemNro = BC01R523_A10187EntRemNro[0] ;
         A10186EntRemFch = BC01R523_A10186EntRemFch[0] ;
         A10185EntRemSuc = BC01R523_A10185EntRemSuc[0] ;
         A10184EntRemTpo = BC01R523_A10184EntRemTpo[0] ;
         A12716EntFabId = BC01R523_A12716EntFabId[0] ;
         A13456EntUbicaci = BC01R523_A13456EntUbicaci[0] ;
         A660PedDto = BC01R523_A660PedDto[0] ;
         A705PrdExiCC = BC01R523_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R523_A698PrdDetPar[0] ;
         A718PrdNom = BC01R523_A718PrdNom[0] ;
         A727PrdRec = BC01R523_A727PrdRec[0] ;
         A14035EntNEmb = BC01R523_A14035EntNEmb[0] ;
         A719PrdNum = BC01R523_A719PrdNum[0] ;
         A658PedCod = BC01R523_A658PedCod[0] ;
         n658PedCod = BC01R523_n658PedCod[0] ;
         A795PrvNum = BC01R523_A795PrvNum[0] ;
         A856ValCod = BC01R523_A856ValCod[0] ;
      }
      Gx_mode = sMode42 ;
   }

   public void scanKeyEnd1R542( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1R542( )
   {
      /* After Confirm Rules */
      if ( ( AV10ExiLoteID == 1 ) && isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = (int)(A13235EntLoteID) ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IDLOTE", ""), GXv_int8) ;
         entradadeproductosalmacen_trn_bc.this.A13235EntLoteID = GXv_int8[0] ;
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = A597LinEnt ;
         new app.plinent(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.A597LinEnt = GXv_int10[0] ;
      }
      if ( true /* Level */ && true /* After */ && ! (GXutil.strcmp("", A719PrdNum)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.AV53LastFec = GXv_date11[0] ;
      }
      if ( true /* Level */ && isDlt( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = A597LinEnt ;
         new app.peliccs(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.A597LinEnt = GXv_int10[0] ;
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_decimal9[0] = A418EntUniEnt ;
         GXv_decimal12[0] = A417EntPre ;
         new app.pacespd(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date11, GXv_decimal9, GXv_decimal12) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal12[0] ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int10[0] = AV47Year ;
         GXv_int6[0] = AV48Mes ;
         GXv_decimal12[0] = A418EntUniEnt ;
         GXv_decimal9[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int15[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int17[0] = AV50MesAnt ;
         GXv_decimal18[0] = AV51PrecAnt ;
         GXv_date11[0] = A415EntFecEnt ;
         GXv_date19[0] = AV52FecAnt ;
         GXv_char2[0] = AV43PedPri ;
         GXv_char20[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10, GXv_int6, GXv_decimal12, GXv_decimal9, GXv_decimal13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_decimal18, GXv_date11, GXv_date19, GXv_char2, GXv_char20) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char2[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char20[0] ;
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = AV43PedPri ;
         GXv_char2[0] = Gx_mode ;
         new app.pprden2(remoteHandle, context).execute( GXv_char20, GXv_char4, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3, GXv_char2) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char3[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char2[0] ;
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         new app.pacespr(remoteHandle, context).execute( GXv_char20, GXv_int8, GXv_date19, GXv_int21, GXv_decimal18, GXv_decimal13, GXv_char4) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char4[0] ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_char4, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int21[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char3[0] ;
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_int21[0] = A6156EntPrvNum ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = AV46UniOld ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_char4[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal9[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char3[0] = Gx_mode ;
         new app.pprdes2(remoteHandle, context).execute( GXv_char20, GXv_int21, GXv_int15, GXv_int17, GXv_decimal18, GXv_decimal13, GXv_decimal12, GXv_char4, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal9, GXv_date19, GXv_date11, GXv_char3) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int21[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char3[0] ;
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 1 ) )
      {
         GXv_char20[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_decimal18[0] = A418EntUniEnt ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char3[0] = httpContext.getMessage( "EN", "") ;
         GXv_char2[0] = AV43PedPri ;
         GXv_decimal12[0] = A417EntPre ;
         GXv_int21[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char22[0] = " " ;
         GXv_int8[0] = A658PedCod ;
         GXv_char23[0] = A11Albaran ;
         GXv_char24[0] = AV9UsurCod ;
         GXv_char25[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal9[0] = AV46UniOld ;
         GXv_decimal26[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A5686EntLotN ;
         GXv_char29[0] = A12857EntNAlbar ;
         new app.pccstk20(remoteHandle, context).execute( GXv_char20, GXv_char4, GXv_decimal18, GXv_decimal13, GXv_char3, GXv_char2, GXv_decimal12, GXv_int21, GXv_int17, GXv_char22, GXv_int8, GXv_char23, GXv_char24, GXv_char25, GXv_int15, GXv_decimal9, GXv_decimal26, GXv_date19, GXv_int27, GXv_char28, GXv_char29) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char4[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char2[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.A658PedCod = GXv_int8[0] ;
         entradadeproductosalmacen_trn_bc.this.A11Albaran = GXv_char23[0] ;
         entradadeproductosalmacen_trn_bc.this.AV9UsurCod = GXv_char24[0] ;
         entradadeproductosalmacen_trn_bc.this.A597LinEnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal9[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_bc.this.A5686EntLotN = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.A12857EntNAlbar = GXv_char29[0] ;
      }
      if ( ! (0==A658PedCod) && true /* After */ )
      {
         AV73PedCum = A3404EntPedCum ;
      }
      if ( isDlt( )  && true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int21[0] = A658PedCod ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         new app.pacesprx(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_date19, GXv_int21, GXv_decimal26, GXv_decimal18, GXv_char24) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char24[0] ;
      }
      if ( isIns( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char23[0] ;
      }
      if ( ( ( ( DecimalUtil.compareTo(A418EntUniEnt, AV46UniOld) != 0 ) ) || ( !( GXutil.dateCompare(GXutil.resetTime(A415EntFecEnt), GXutil.resetTime(AV52FecAnt)) ) ) || ( ( DecimalUtil.compareTo(A417EntPre, AV51PrecAnt) != 0 ) ) ) && isUpd( )  && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_int27[0] = A6156EntPrvNum ;
         GXv_char28[0] = A719PrdNum ;
         GXv_char25[0] = A718PrdNom ;
         GXv_int15[0] = AV47Year ;
         GXv_int17[0] = AV48Mes ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = AV46UniOld ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_char24[0] = AV43PedPri ;
         GXv_int14[0] = AV47Year ;
         GXv_int10[0] = AV49AnyAnt ;
         GXv_int16[0] = AV48Mes ;
         GXv_int6[0] = AV50MesAnt ;
         GXv_decimal12[0] = AV51PrecAnt ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_date11[0] = AV52FecAnt ;
         GXv_char23[0] = Gx_mode ;
         new app.pprdes3(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char28, GXv_char25, GXv_int15, GXv_int17, GXv_decimal26, GXv_decimal18, GXv_decimal13, GXv_char24, GXv_int14, GXv_int10, GXv_int16, GXv_int6, GXv_decimal12, GXv_date19, GXv_date11, GXv_char23) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int27[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.A718PrdNom = GXv_char25[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int17[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal18[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_bc.this.AV47Year = GXv_int14[0] ;
         entradadeproductosalmacen_trn_bc.this.AV49AnyAnt = GXv_int10[0] ;
         entradadeproductosalmacen_trn_bc.this.AV48Mes = GXv_int16[0] ;
         entradadeproductosalmacen_trn_bc.this.AV50MesAnt = GXv_int6[0] ;
         entradadeproductosalmacen_trn_bc.this.AV51PrecAnt = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.AV52FecAnt = GXv_date11[0] ;
         entradadeproductosalmacen_trn_bc.this.Gx_mode = GXv_char23[0] ;
      }
      if ( ( isIns( )  || isUpd( )  ) && true /* After */ && ( AV34FlagCcs == 1 ) && ( AV26Artextil == 0 ) && ( AV22Nalbaran20 == 0 ) )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_decimal26[0] = A418EntUniEnt ;
         GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
         GXv_char25[0] = httpContext.getMessage( "EN", "") ;
         GXv_char24[0] = AV43PedPri ;
         GXv_decimal13[0] = A417EntPre ;
         GXv_int27[0] = 0 ;
         GXv_int17[0] = (byte)(0) ;
         GXv_char23[0] = " " ;
         GXv_int21[0] = A658PedCod ;
         GXv_char22[0] = A11Albaran ;
         GXv_char20[0] = AV9UsurCod ;
         GXv_char4[0] = httpContext.getMessage( "Entrada por Pedido", "") ;
         GXv_int15[0] = A597LinEnt ;
         GXv_decimal12[0] = AV46UniOld ;
         GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
         GXv_date19[0] = A415EntFecEnt ;
         GXv_int8[0] = A6156EntPrvNum ;
         GXv_char3[0] = A5686EntLotN ;
         new app.pnewcc9(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_decimal26, GXv_decimal18, GXv_char25, GXv_char24, GXv_decimal13, GXv_int27, GXv_int17, GXv_char23, GXv_int21, GXv_char22, GXv_char20, GXv_char4, GXv_int15, GXv_decimal12, GXv_decimal9, GXv_date19, GXv_int8, GXv_char3) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.A418EntUniEnt = GXv_decimal26[0] ;
         entradadeproductosalmacen_trn_bc.this.AV43PedPri = GXv_char24[0] ;
         entradadeproductosalmacen_trn_bc.this.A417EntPre = GXv_decimal13[0] ;
         entradadeproductosalmacen_trn_bc.this.A658PedCod = GXv_int21[0] ;
         entradadeproductosalmacen_trn_bc.this.A11Albaran = GXv_char22[0] ;
         entradadeproductosalmacen_trn_bc.this.AV9UsurCod = GXv_char20[0] ;
         entradadeproductosalmacen_trn_bc.this.A597LinEnt = GXv_int15[0] ;
         entradadeproductosalmacen_trn_bc.this.AV46UniOld = GXv_decimal12[0] ;
         entradadeproductosalmacen_trn_bc.this.A415EntFecEnt = GXv_date19[0] ;
         entradadeproductosalmacen_trn_bc.this.A6156EntPrvNum = GXv_int8[0] ;
         entradadeproductosalmacen_trn_bc.this.A5686EntLotN = GXv_char3[0] ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char29[0] = A396EmprCod ;
         GXv_char28[0] = A719PrdNum ;
         GXv_date19[0] = AV53LastFec ;
         new app.pstm005(remoteHandle, context).execute( GXv_char29, GXv_char28, GXv_date19) ;
         entradadeproductosalmacen_trn_bc.this.A396EmprCod = GXv_char29[0] ;
         entradadeproductosalmacen_trn_bc.this.A719PrdNum = GXv_char28[0] ;
         entradadeproductosalmacen_trn_bc.this.AV53LastFec = GXv_date19[0] ;
      }
   }

   public void beforeInsert1R542( )
   {
      /* Before Insert Rules */
      if ( true /* Level */ && true /* After */ && GXutil.resetTime(A415EntFecEnt).after( GXutil.resetTime( GXutil.serverDate( context, remoteHandle, pr_default) )) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Fecha Entrada mayor a la Fecha del Dia", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A6156EntPrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A658PedCod) )
      {
         A658PedCod = 0 ;
         n658PedCod = false ;
         n658PedCod = false ;
      }
   }

   public void beforeUpdate1R542( )
   {
      /* Before Update Rules */
      if ( (0==A6156EntPrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proveedor Inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A658PedCod) )
      {
         A658PedCod = 0 ;
         n658PedCod = false ;
         n658PedCod = false ;
      }
   }

   public void beforeDelete1R542( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1R542( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1R542( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1R542( )
   {
   }

   public void send_integrity_lvl_hashes1R542( )
   {
   }

   public void addRow1R542( )
   {
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
   }

   public void readRow1R542( )
   {
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
   }

   public void initializeNonKey1R542( )
   {
      AV47Year = (short)(0) ;
      AV48Mes = (byte)(0) ;
      AV42OldExiAlm = DecimalUtil.ZERO ;
      AV36OldEntPre = DecimalUtil.ZERO ;
      AV38OldEntUni = DecimalUtil.ZERO ;
      AV40OldRemanente = DecimalUtil.ZERO ;
      AV37oldEntFecent = GXutil.nullDate() ;
      AV39oldlote = "" ;
      AV46UniOld = DecimalUtil.ZERO ;
      AV52FecAnt = GXutil.nullDate() ;
      AV51PrecAnt = DecimalUtil.ZERO ;
      AV49AnyAnt = (short)(0) ;
      AV50MesAnt = (byte)(0) ;
      AV59PrdNomX = "" ;
      AV43PedPri = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV73PedCum = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      AV53LastFec = GXutil.nullDate() ;
      A13235EntLoteID = 0 ;
      A13833CantPdte = DecimalUtil.ZERO ;
      A664PedNumLin = (short)(0) ;
      AV62msg_ctrl_fecha = "" ;
      A11Albaran = "" ;
      A12857EntNAlbar = "" ;
      A658PedCod = 0 ;
      n658PedCod = false ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A10783EntObs = "" ;
      A416EntNumCon = (short)(0) ;
      A414EntEti = (byte)(0) ;
      A411EntCon = (byte)(0) ;
      A413EntConIni = 0 ;
      A412EntConFin = 0 ;
      A5469EntNro = 0 ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      A5691EntBnc = "" ;
      A661PedFec = GXutil.nullDate() ;
      A666PedPri = "" ;
      A667PedSit = "" ;
      A659PedCum = "" ;
      A663PedFulEnt = GXutil.nullDate() ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A7695EntCC = "" ;
      A7696EntCCoCod = (short)(0) ;
      A10187EntRemNro = "" ;
      A10186EntRemFch = GXutil.nullDate() ;
      A10185EntRemSuc = "" ;
      A13456EntUbicaci = "" ;
      A795PrvNum = 0 ;
      A660PedDto = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A718PrdNom = "" ;
      A727PrdRec = "" ;
      A856ValCod = (byte)(0) ;
      A14035EntNEmb = (byte)(0) ;
      AV63Fecha = GXutil.nullDate() ;
      AV35Inc_obs = "" ;
      AV72DiasFin = (short)(0) ;
      A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      A10184EntRemTpo = " " ;
      A12716EntFabId = 0 ;
      O724PrdPreAct = A724PrdPreAct ;
      O750PrdValStk = A750PrdValStk ;
      O419EntUniRem = A419EntUniRem ;
      O418EntUniEnt = A418EntUniEnt ;
      O684PrdCanPen = A684PrdCanPen ;
      O704PrdExiAlm = A704PrdExiAlm ;
      O415EntFecEnt = A415EntFecEnt ;
      O417EntPre = A417EntPre ;
      O5686EntLotN = A5686EntLotN ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      Z13235EntLoteID = 0 ;
      Z415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      Z6156EntPrvNum = 0 ;
      Z5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      Z416EntNumCon = (short)(0) ;
      Z414EntEti = (byte)(0) ;
      Z411EntCon = (byte)(0) ;
      Z413EntConIni = 0 ;
      Z412EntConFin = 0 ;
      Z5469EntNro = 0 ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      Z7695EntCC = "" ;
      Z7696EntCCoCod = (short)(0) ;
      Z10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      Z12716EntFabId = 0 ;
      Z13456EntUbicaci = "" ;
      Z14035EntNEmb = (byte)(0) ;
      Z658PedCod = 0 ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z718PrdNom = "" ;
      Z727PrdRec = "" ;
      Z795PrvNum = 0 ;
      Z856ValCod = (byte)(0) ;
   }

   public void initAll1R542( )
   {
      A719PrdNum = "" ;
      A597LinEnt = (short)(0) ;
      initializeNonKey1R542( ) ;
   }

   public void standaloneModalInsert( )
   {
      A10184EntRemTpo = i10184EntRemTpo ;
      A415EntFecEnt = i415EntFecEnt ;
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void VarsToRow42( app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN obj42 )
   {
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( Gx_mode );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod( A396EmprCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm( A704PrdExiAlm );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen( A684PrdCanPen );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem( A419EntUniRem );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk( A750PrdValStk );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre( A417EntPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed( A726PrdPreMed );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent( A713PrdFulEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre( A709PrdFecPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant( A725PrdPreAnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact( A724PrdPreAct );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient( A418EntUniEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid( A13235EntLoteID );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte( A13833CantPdte );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin( A664PedNumLin );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran( A11Albaran );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar( A12857EntNAlbar );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod( A658PedCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn( A5686EntLotN );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval( A5685EntFVal );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs( A10783EntObs );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon( A416EntNumCon );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti( A414EntEti );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon( A411EntCon );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini( A413EntConIni );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin( A412EntConFin );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro( A5469EntNro );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb( A10782EntUniAlb );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc( A5691EntBnc );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec( A661PedFec );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri( A666PedPri );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit( A667PedSit );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum( A659PedCum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent( A663PedFulEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent( A657PedCanEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni( A669PedUni );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre( A665PedPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc( A7695EntCC );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod( A7696EntCCoCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro( A10187EntRemNro );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch( A10186EntRemFch );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc( A10185EntRemSuc );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion( A13456EntUbicaci );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum( A795PrvNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto( A660PedDto );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc( A705PrdExiCC );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar( A698PrdDetPar );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom( A718PrdNom );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec( A727PrdRec );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod( A856ValCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb( A14035EntNEmb );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent( A415EntFecEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum( A6156EntPrvNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum( A3404EntPedCum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo( A10184EntRemTpo );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid( A12716EntFabId );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod( A396EmprCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum( A719PrdNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent( A597LinEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z( Z396EmprCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z( Z719PrdNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z( Z597LinEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z( Z415EntFecEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z( Z11Albaran );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z( Z12857EntNAlbar );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z( Z658PedCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z( Z6156EntPrvNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z( Z418EntUniEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z( Z417EntPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z( Z419EntUniRem );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z( Z5686EntLotN );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z( Z5685EntFVal );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z( Z10783EntObs );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z( Z416EntNumCon );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z( Z414EntEti );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z( Z411EntCon );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z( Z413EntConIni );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z( Z412EntConFin );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z( Z5469EntNro );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z( Z10782EntUniAlb );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z( Z3404EntPedCum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z( Z5691EntBnc );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z( Z661PedFec );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z( Z664PedNumLin );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z( Z666PedPri );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z( Z667PedSit );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z( Z659PedCum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z( Z663PedFulEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z( Z657PedCanEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z( Z669PedUni );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z( Z665PedPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z( Z13833CantPdte );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z( Z7695EntCC );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z( Z7696EntCCoCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z( Z10187EntRemNro );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z( Z10186EntRemFch );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z( Z10185EntRemSuc );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z( Z10184EntRemTpo );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z( Z12716EntFabId );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z( Z13235EntLoteID );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z( Z13456EntUbicaci );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z( Z795PrvNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z( Z704PrdExiAlm );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z( Z684PrdCanPen );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z( Z713PrdFulEnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z( Z709PrdFecPre );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z( Z725PrdPreAnt );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z( Z724PrdPreAct );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z( Z750PrdValStk );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z( Z660PedDto );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z( Z705PrdExiCC );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z( Z698PrdDetPar );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z( Z718PrdNom );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z( Z727PrdRec );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z( Z856ValCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z( Z726PrdPreMed );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z( Z14035EntNEmb );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N( (byte)((byte)((n658PedCod)?1:0)) );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N( (byte)((byte)((n6156EntPrvNum)?1:0)) );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( Gx_mode );
   }

   public void KeyVarsToRow42( app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN obj42 )
   {
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod( A396EmprCod );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum( A719PrdNum );
      obj42.setgxTv_SdtEntradadeProductosAlmacen_TRN_Linent( A597LinEnt );
   }

   public void RowToVars42( app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN obj42 ,
                            int forceLoad )
   {
      Gx_mode = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode() ;
      A396EmprCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod() ;
      if ( forceLoad == 1 )
      {
         A704PrdExiAlm = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm() ;
      }
      if ( forceLoad == 1 )
      {
         A684PrdCanPen = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen() ;
      }
      A419EntUniRem = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem() ;
      A750PrdValStk = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk() ;
      A417EntPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre() ;
      A726PrdPreMed = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed() ;
      A713PrdFulEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent() ;
      A709PrdFecPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre() ;
      A725PrdPreAnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant() ;
      A724PrdPreAct = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact() ;
      A418EntUniEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient() ;
      A13235EntLoteID = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid() ;
      A13833CantPdte = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte() ;
      A664PedNumLin = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin() ;
      A11Albaran = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran() ;
      A12857EntNAlbar = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar() ;
      A658PedCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod() ;
      n658PedCod = false ;
      A5686EntLotN = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn() ;
      A5685EntFVal = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval() ;
      A10783EntObs = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs() ;
      A416EntNumCon = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon() ;
      A414EntEti = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti() ;
      A411EntCon = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon() ;
      A413EntConIni = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini() ;
      A412EntConFin = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin() ;
      A5469EntNro = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro() ;
      A10782EntUniAlb = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb() ;
      A5691EntBnc = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc() ;
      A661PedFec = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec() ;
      A666PedPri = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri() ;
      A667PedSit = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit() ;
      A659PedCum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum() ;
      A663PedFulEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent() ;
      A657PedCanEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent() ;
      A669PedUni = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni() ;
      A665PedPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre() ;
      A7695EntCC = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc() ;
      A7696EntCCoCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod() ;
      A10187EntRemNro = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro() ;
      A10186EntRemFch = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch() ;
      A10185EntRemSuc = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc() ;
      A13456EntUbicaci = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion() ;
      A795PrvNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum() ;
      A660PedDto = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto() ;
      A705PrdExiCC = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc() ;
      A698PrdDetPar = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar() ;
      A718PrdNom = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom() ;
      A727PrdRec = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec() ;
      A856ValCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod() ;
      A14035EntNEmb = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb() ;
      A415EntFecEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent() ;
      A6156EntPrvNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum() ;
      n6156EntPrvNum = false ;
      A3404EntPedCum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum() ;
      A10184EntRemTpo = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo() ;
      A12716EntFabId = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid() ;
      A396EmprCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod() ;
      A719PrdNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum() ;
      A597LinEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent() ;
      Z396EmprCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Emprcod_Z() ;
      Z719PrdNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnum_Z() ;
      Z597LinEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Linent_Z() ;
      Z415EntFecEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z() ;
      O415EntFecEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfecent_Z() ;
      Z11Albaran = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Albaran_Z() ;
      Z12857EntNAlbar = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnalbar_Z() ;
      Z658PedCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_Z() ;
      Z6156EntPrvNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_Z() ;
      Z418EntUniEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z() ;
      O418EntUniEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunient_Z() ;
      Z417EntPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z() ;
      O417EntPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpre_Z() ;
      Z419EntUniRem = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z() ;
      O419EntUniRem = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunirem_Z() ;
      Z5686EntLotN = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z() ;
      O5686EntLotN = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entlotn_Z() ;
      Z5685EntFVal = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfval_Z() ;
      Z10783EntObs = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entobs_Z() ;
      Z416EntNumCon = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnumcon_Z() ;
      Z414EntEti = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Enteti_Z() ;
      Z411EntCon = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcon_Z() ;
      Z413EntConIni = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconini_Z() ;
      Z412EntConFin = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entconfin_Z() ;
      Z5469EntNro = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnro_Z() ;
      Z10782EntUniAlb = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entunialb_Z() ;
      Z3404EntPedCum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entpedcum_Z() ;
      Z5691EntBnc = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entbnc_Z() ;
      Z661PedFec = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfec_Z() ;
      Z664PedNumLin = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pednumlin_Z() ;
      Z666PedPri = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpri_Z() ;
      Z667PedSit = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedsit_Z() ;
      Z659PedCum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcum_Z() ;
      Z663PedFulEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedfulent_Z() ;
      Z657PedCanEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcanent_Z() ;
      Z669PedUni = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peduni_Z() ;
      Z665PedPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedpre_Z() ;
      Z13833CantPdte = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Cantpdte_Z() ;
      Z7695EntCC = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entcc_Z() ;
      Z7696EntCCoCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entccocod_Z() ;
      Z10187EntRemNro = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremnro_Z() ;
      Z10186EntRemFch = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremfch_Z() ;
      Z10185EntRemSuc = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremsuc_Z() ;
      Z10184EntRemTpo = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entremtpo_Z() ;
      Z12716EntFabId = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entfabid_Z() ;
      Z13235EntLoteID = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entloteid_Z() ;
      Z13456EntUbicaci = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entubicacion_Z() ;
      Z795PrvNum = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prvnum_Z() ;
      Z704PrdExiAlm = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z() ;
      O704PrdExiAlm = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexialm_Z() ;
      Z684PrdCanPen = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z() ;
      O684PrdCanPen = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdcanpen_Z() ;
      Z713PrdFulEnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfulent_Z() ;
      Z709PrdFecPre = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdfecpre_Z() ;
      Z725PrdPreAnt = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreant_Z() ;
      Z724PrdPreAct = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z() ;
      O724PrdPreAct = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpreact_Z() ;
      Z750PrdValStk = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z() ;
      O750PrdValStk = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdvalstk_Z() ;
      Z660PedDto = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Peddto_Z() ;
      Z705PrdExiCC = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdexicc_Z() ;
      Z698PrdDetPar = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prddetpar_Z() ;
      Z718PrdNom = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdnom_Z() ;
      Z727PrdRec = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdrec_Z() ;
      Z856ValCod = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Valcod_Z() ;
      Z726PrdPreMed = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Prdpremed_Z() ;
      Z14035EntNEmb = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entnemb_Z() ;
      n658PedCod = (boolean)((obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Pedcod_N()==0)?false:true) ;
      n6156EntPrvNum = (boolean)((obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Entprvnum_N()==0)?false:true) ;
      Gx_mode = obj42.getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A719PrdNum = (String)getParm(obj,1) ;
      A597LinEnt = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1R542( ) ;
      scanKeyStart1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01R524 */
         pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(22) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
         }
         A704PrdExiAlm = BC01R524_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R524_A684PrdCanPen[0] ;
         A750PrdValStk = BC01R524_A750PrdValStk[0] ;
         A726PrdPreMed = BC01R524_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R524_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R524_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R524_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R524_A724PrdPreAct[0] ;
         A705PrdExiCC = BC01R524_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R524_A698PrdDetPar[0] ;
         A718PrdNom = BC01R524_A718PrdNom[0] ;
         A727PrdRec = BC01R524_A727PrdRec[0] ;
         A795PrvNum = BC01R524_A795PrvNum[0] ;
         A856ValCod = BC01R524_A856ValCod[0] ;
         pr_default.close(22);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         O724PrdPreAct = A724PrdPreAct ;
         O750PrdValStk = A750PrdValStk ;
         O419EntUniRem = A419EntUniRem ;
         O418EntUniEnt = A418EntUniEnt ;
         O684PrdCanPen = A684PrdCanPen ;
         O704PrdExiAlm = A704PrdExiAlm ;
         O415EntFecEnt = A415EntFecEnt ;
         O417EntPre = A417EntPre ;
         O5686EntLotN = A5686EntLotN ;
      }
      zm1R542( -84) ;
      onLoadActions1R542( ) ;
      addRow1R542( ) ;
      scanKeyEnd1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Load( )
   {
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 0) ;
      scanKeyStart1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01R525 */
         pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(23) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
         }
         A704PrdExiAlm = BC01R525_A704PrdExiAlm[0] ;
         A684PrdCanPen = BC01R525_A684PrdCanPen[0] ;
         A750PrdValStk = BC01R525_A750PrdValStk[0] ;
         A726PrdPreMed = BC01R525_A726PrdPreMed[0] ;
         A713PrdFulEnt = BC01R525_A713PrdFulEnt[0] ;
         A709PrdFecPre = BC01R525_A709PrdFecPre[0] ;
         A725PrdPreAnt = BC01R525_A725PrdPreAnt[0] ;
         A724PrdPreAct = BC01R525_A724PrdPreAct[0] ;
         A705PrdExiCC = BC01R525_A705PrdExiCC[0] ;
         A698PrdDetPar = BC01R525_A698PrdDetPar[0] ;
         A718PrdNom = BC01R525_A718PrdNom[0] ;
         A727PrdRec = BC01R525_A727PrdRec[0] ;
         A795PrvNum = BC01R525_A795PrvNum[0] ;
         A856ValCod = BC01R525_A856ValCod[0] ;
         pr_default.close(23);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z597LinEnt = A597LinEnt ;
         O724PrdPreAct = A724PrdPreAct ;
         O750PrdValStk = A750PrdValStk ;
         O419EntUniRem = A419EntUniRem ;
         O418EntUniEnt = A418EntUniEnt ;
         O684PrdCanPen = A684PrdCanPen ;
         O704PrdExiAlm = A704PrdExiAlm ;
         O415EntFecEnt = A415EntFecEnt ;
         O417EntPre = A417EntPre ;
         O5686EntLotN = A5686EntLotN ;
      }
      zm1R542( -84) ;
      onLoadActions1R542( ) ;
      addRow1R542( ) ;
      scanKeyEnd1R542( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1R542( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1R542( ) ;
      }
      else
      {
         if ( RcdFound42 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
            {
               A719PrdNum = Z719PrdNum ;
               A597LinEnt = Z597LinEnt ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               update1R542( ) ;
            }
         }
         else
         {
            if ( isDlt( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
               {
                  if ( isUpd( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1R542( ) ;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
                  else
                  {
                     Gx_mode = "INS" ;
                     /* Insert record */
                     insert1R542( ) ;
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
      saveImpl( ) ;
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1R542( ) ;
      afterTrn( ) ;
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void updateImpl( )
   {
      if ( isUpd( ) )
      {
         saveImpl( ) ;
      }
      else
      {
         app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN auxBC = new app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A719PrdNum, A597LinEnt);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcstocksquimicos_EntradadeProductosAlmacen_TRN);
            auxBC.Save();
         }
         LclMsgLst = auxTrn.GetMessages() ;
         AnyError = (short)(auxTrn.Errors()) ;
         httpContext.GX_msglist = LclMsgLst ;
         if ( auxTrn.Errors() == 0 )
         {
            Gx_mode = auxTrn.GetMode() ;
            afterTrn( ) ;
         }
      }
   }

   public boolean Update( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
      updateImpl( ) ;
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public boolean InsertOrUpdate( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1R542( ) ;
      if ( AnyError == 1 )
      {
         if ( GXutil.strcmp(httpContext.GX_msglist.getItemValue((short)(1)), "DuplicatePrimaryKey") == 0 )
         {
            AnyError = (short)(0) ;
            httpContext.GX_msglist.removeAllItems();
            updateImpl( ) ;
         }
      }
      else
      {
         afterTrn( ) ;
      }
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1R542( ) ;
      if ( RcdFound42 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
         {
            A719PrdNum = Z719PrdNum ;
            A597LinEnt = Z597LinEnt ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( A597LinEnt != Z597LinEnt ) )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.entradadeproductosalmacen_trn_bc");
      VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcstocksquimicos_EntradadeProductosAlmacen_TRN.getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcstocksquimicos_EntradadeProductosAlmacen_TRN.setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( Gx_mode );
   }

   public void SetSDT( app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcstocksquimicos_EntradadeProductosAlmacen_TRN )
      {
         bcstocksquimicos_EntradadeProductosAlmacen_TRN = sdt ;
         if ( GXutil.strcmp(bcstocksquimicos_EntradadeProductosAlmacen_TRN.getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode(), "") == 0 )
         {
            bcstocksquimicos_EntradadeProductosAlmacen_TRN.setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow42( bcstocksquimicos_EntradadeProductosAlmacen_TRN) ;
         }
         else
         {
            RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcstocksquimicos_EntradadeProductosAlmacen_TRN.getgxTv_SdtEntradadeProductosAlmacen_TRN_Mode(), "") == 0 )
         {
            bcstocksquimicos_EntradadeProductosAlmacen_TRN.setgxTv_SdtEntradadeProductosAlmacen_TRN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars42( bcstocksquimicos_EntradadeProductosAlmacen_TRN, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtEntradadeProductosAlmacen_TRN getEntradadeProductosAlmacen_TRN_BC( )
   {
      return bcstocksquimicos_EntradadeProductosAlmacen_TRN ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor BC01R526 */
      pr_default.execute(24, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(24) != 101) )
      {
         if ( ( ( GXutil.strcmp(BC01R526_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
         {
            if ( Gx_first )
            {
               Gx_cnt = 1 ;
               Gx_first = false ;
            }
            else
            {
               Gx_cnt = (int)(Gx_cnt+1) ;
            }
         }
         pr_default.readNext(24);
      }
      pr_default.close(24);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z719PrdNum = "" ;
      A719PrdNum = "" ;
      AV7Station = "" ;
      AV8EmprNom = "" ;
      AV9UsurCod = "" ;
      AV65PrdNum = "" ;
      Z419EntUniRem = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      Z417EntPre = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      Z418EntUniEnt = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      Z415EntFecEnt = GXutil.nullDate() ;
      A415EntFecEnt = GXutil.nullDate() ;
      Z11Albaran = "" ;
      A11Albaran = "" ;
      Z12857EntNAlbar = "" ;
      A12857EntNAlbar = "" ;
      Z5686EntLotN = "" ;
      A5686EntLotN = "" ;
      Z5685EntFVal = GXutil.nullDate() ;
      A5685EntFVal = GXutil.nullDate() ;
      Z10783EntObs = "" ;
      A10783EntObs = "" ;
      Z10782EntUniAlb = DecimalUtil.ZERO ;
      A10782EntUniAlb = DecimalUtil.ZERO ;
      Z3404EntPedCum = "" ;
      A3404EntPedCum = "" ;
      Z5691EntBnc = "" ;
      A5691EntBnc = "" ;
      Z7695EntCC = "" ;
      A7695EntCC = "" ;
      Z10187EntRemNro = "" ;
      A10187EntRemNro = "" ;
      Z10186EntRemFch = GXutil.nullDate() ;
      A10186EntRemFch = GXutil.nullDate() ;
      Z10185EntRemSuc = "" ;
      A10185EntRemSuc = "" ;
      Z10184EntRemTpo = "" ;
      A10184EntRemTpo = "" ;
      Z13456EntUbicaci = "" ;
      A13456EntUbicaci = "" ;
      Z13833CantPdte = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      A713PrdFulEnt = GXutil.nullDate() ;
      Z709PrdFecPre = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      A698PrdDetPar = "" ;
      Z718PrdNom = "" ;
      A718PrdNom = "" ;
      Z727PrdRec = "" ;
      A727PrdRec = "" ;
      Z661PedFec = GXutil.nullDate() ;
      A661PedFec = GXutil.nullDate() ;
      Z666PedPri = "" ;
      A666PedPri = "" ;
      Z667PedSit = "" ;
      A667PedSit = "" ;
      Z659PedCum = "" ;
      A659PedCum = "" ;
      Z663PedFulEnt = GXutil.nullDate() ;
      A663PedFulEnt = GXutil.nullDate() ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      A669PedUni = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      AV75Pgmname = "" ;
      AV63Fecha = GXutil.nullDate() ;
      AV37oldEntFecent = GXutil.nullDate() ;
      O415EntFecEnt = GXutil.nullDate() ;
      AV52FecAnt = GXutil.nullDate() ;
      BC01R58_A597LinEnt = new short[1] ;
      BC01R58_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A13235EntLoteID = new long[1] ;
      BC01R58_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A11Albaran = new String[] {""} ;
      BC01R58_A12857EntNAlbar = new String[] {""} ;
      BC01R58_A6156EntPrvNum = new int[1] ;
      BC01R58_n6156EntPrvNum = new boolean[] {false} ;
      BC01R58_A5686EntLotN = new String[] {""} ;
      BC01R58_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A10783EntObs = new String[] {""} ;
      BC01R58_A416EntNumCon = new short[1] ;
      BC01R58_A414EntEti = new byte[1] ;
      BC01R58_A411EntCon = new byte[1] ;
      BC01R58_A413EntConIni = new int[1] ;
      BC01R58_A412EntConFin = new int[1] ;
      BC01R58_A5469EntNro = new int[1] ;
      BC01R58_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A3404EntPedCum = new String[] {""} ;
      BC01R58_A5691EntBnc = new String[] {""} ;
      BC01R58_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A666PedPri = new String[] {""} ;
      BC01R58_A667PedSit = new String[] {""} ;
      BC01R58_A659PedCum = new String[] {""} ;
      BC01R58_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A7695EntCC = new String[] {""} ;
      BC01R58_A7696EntCCoCod = new short[1] ;
      BC01R58_A10187EntRemNro = new String[] {""} ;
      BC01R58_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R58_A10185EntRemSuc = new String[] {""} ;
      BC01R58_A10184EntRemTpo = new String[] {""} ;
      BC01R58_A12716EntFabId = new int[1] ;
      BC01R58_A13456EntUbicaci = new String[] {""} ;
      BC01R58_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R58_A698PrdDetPar = new String[] {""} ;
      BC01R58_A718PrdNom = new String[] {""} ;
      BC01R58_A727PrdRec = new String[] {""} ;
      BC01R58_A14035EntNEmb = new byte[1] ;
      BC01R58_A396EmprCod = new String[] {""} ;
      BC01R58_A719PrdNum = new String[] {""} ;
      BC01R58_A658PedCod = new int[1] ;
      BC01R58_n658PedCod = new boolean[] {false} ;
      BC01R58_A795PrvNum = new int[1] ;
      BC01R58_A856ValCod = new byte[1] ;
      O724PrdPreAct = DecimalUtil.ZERO ;
      O750PrdValStk = DecimalUtil.ZERO ;
      O684PrdCanPen = DecimalUtil.ZERO ;
      O704PrdExiAlm = DecimalUtil.ZERO ;
      AV43PedPri = "" ;
      O418EntUniEnt = DecimalUtil.ZERO ;
      AV38OldEntUni = DecimalUtil.ZERO ;
      AV46UniOld = DecimalUtil.ZERO ;
      AV42OldExiAlm = DecimalUtil.ZERO ;
      O419EntUniRem = DecimalUtil.ZERO ;
      AV36OldEntPre = DecimalUtil.ZERO ;
      O417EntPre = DecimalUtil.ZERO ;
      AV51PrecAnt = DecimalUtil.ZERO ;
      AV40OldRemanente = DecimalUtil.ZERO ;
      AV39oldlote = "" ;
      O5686EntLotN = "" ;
      AV59PrdNomX = "" ;
      BC01R59_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R59_A666PedPri = new String[] {""} ;
      BC01R59_A667PedSit = new String[] {""} ;
      BC01R510_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R510_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R510_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R510_A698PrdDetPar = new String[] {""} ;
      BC01R510_A718PrdNom = new String[] {""} ;
      BC01R510_A727PrdRec = new String[] {""} ;
      BC01R510_A795PrvNum = new int[1] ;
      BC01R510_A856ValCod = new byte[1] ;
      BC01R511_A659PedCum = new String[] {""} ;
      BC01R511_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R511_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R511_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R511_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R511_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV53LastFec = GXutil.nullDate() ;
      AV62msg_ctrl_fecha = "" ;
      BC01R512_A396EmprCod = new String[] {""} ;
      BC01R512_A719PrdNum = new String[] {""} ;
      BC01R512_A597LinEnt = new short[1] ;
      BC01R513_A597LinEnt = new short[1] ;
      BC01R513_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R513_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R513_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R513_A13235EntLoteID = new long[1] ;
      BC01R513_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R513_A11Albaran = new String[] {""} ;
      BC01R513_A12857EntNAlbar = new String[] {""} ;
      BC01R513_A6156EntPrvNum = new int[1] ;
      BC01R513_n6156EntPrvNum = new boolean[] {false} ;
      BC01R513_A5686EntLotN = new String[] {""} ;
      BC01R513_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R513_A10783EntObs = new String[] {""} ;
      BC01R513_A416EntNumCon = new short[1] ;
      BC01R513_A414EntEti = new byte[1] ;
      BC01R513_A411EntCon = new byte[1] ;
      BC01R513_A413EntConIni = new int[1] ;
      BC01R513_A412EntConFin = new int[1] ;
      BC01R513_A5469EntNro = new int[1] ;
      BC01R513_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R513_A3404EntPedCum = new String[] {""} ;
      BC01R513_A5691EntBnc = new String[] {""} ;
      BC01R513_A7695EntCC = new String[] {""} ;
      BC01R513_A7696EntCCoCod = new short[1] ;
      BC01R513_A10187EntRemNro = new String[] {""} ;
      BC01R513_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R513_A10185EntRemSuc = new String[] {""} ;
      BC01R513_A10184EntRemTpo = new String[] {""} ;
      BC01R513_A12716EntFabId = new int[1] ;
      BC01R513_A13456EntUbicaci = new String[] {""} ;
      BC01R513_A14035EntNEmb = new byte[1] ;
      BC01R513_A396EmprCod = new String[] {""} ;
      BC01R513_A719PrdNum = new String[] {""} ;
      BC01R513_A658PedCod = new int[1] ;
      BC01R513_n658PedCod = new boolean[] {false} ;
      sMode42 = "" ;
      BC01R514_A597LinEnt = new short[1] ;
      BC01R514_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R514_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R514_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R514_A13235EntLoteID = new long[1] ;
      BC01R514_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R514_A11Albaran = new String[] {""} ;
      BC01R514_A12857EntNAlbar = new String[] {""} ;
      BC01R514_A6156EntPrvNum = new int[1] ;
      BC01R514_n6156EntPrvNum = new boolean[] {false} ;
      BC01R514_A5686EntLotN = new String[] {""} ;
      BC01R514_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R514_A10783EntObs = new String[] {""} ;
      BC01R514_A416EntNumCon = new short[1] ;
      BC01R514_A414EntEti = new byte[1] ;
      BC01R514_A411EntCon = new byte[1] ;
      BC01R514_A413EntConIni = new int[1] ;
      BC01R514_A412EntConFin = new int[1] ;
      BC01R514_A5469EntNro = new int[1] ;
      BC01R514_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R514_A3404EntPedCum = new String[] {""} ;
      BC01R514_A5691EntBnc = new String[] {""} ;
      BC01R514_A7695EntCC = new String[] {""} ;
      BC01R514_A7696EntCCoCod = new short[1] ;
      BC01R514_A10187EntRemNro = new String[] {""} ;
      BC01R514_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R514_A10185EntRemSuc = new String[] {""} ;
      BC01R514_A10184EntRemTpo = new String[] {""} ;
      BC01R514_A12716EntFabId = new int[1] ;
      BC01R514_A13456EntUbicaci = new String[] {""} ;
      BC01R514_A14035EntNEmb = new byte[1] ;
      BC01R514_A396EmprCod = new String[] {""} ;
      BC01R514_A719PrdNum = new String[] {""} ;
      BC01R514_A658PedCod = new int[1] ;
      BC01R514_n658PedCod = new boolean[] {false} ;
      BC01R515_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R515_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R515_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R515_A698PrdDetPar = new String[] {""} ;
      BC01R515_A718PrdNom = new String[] {""} ;
      BC01R515_A727PrdRec = new String[] {""} ;
      BC01R515_A795PrvNum = new int[1] ;
      BC01R515_A856ValCod = new byte[1] ;
      AV35Inc_obs = "" ;
      BC01R519_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R519_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R519_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R519_A698PrdDetPar = new String[] {""} ;
      BC01R519_A718PrdNom = new String[] {""} ;
      BC01R519_A727PrdRec = new String[] {""} ;
      BC01R519_A795PrvNum = new int[1] ;
      BC01R519_A856ValCod = new byte[1] ;
      BC01R520_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R520_A666PedPri = new String[] {""} ;
      BC01R520_A667PedSit = new String[] {""} ;
      BC01R521_A659PedCum = new String[] {""} ;
      BC01R521_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R521_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R521_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R521_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R521_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_char1 = "" ;
      BC01R523_A597LinEnt = new short[1] ;
      BC01R523_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A13235EntLoteID = new long[1] ;
      BC01R523_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A11Albaran = new String[] {""} ;
      BC01R523_A12857EntNAlbar = new String[] {""} ;
      BC01R523_A6156EntPrvNum = new int[1] ;
      BC01R523_n6156EntPrvNum = new boolean[] {false} ;
      BC01R523_A5686EntLotN = new String[] {""} ;
      BC01R523_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A10783EntObs = new String[] {""} ;
      BC01R523_A416EntNumCon = new short[1] ;
      BC01R523_A414EntEti = new byte[1] ;
      BC01R523_A411EntCon = new byte[1] ;
      BC01R523_A413EntConIni = new int[1] ;
      BC01R523_A412EntConFin = new int[1] ;
      BC01R523_A5469EntNro = new int[1] ;
      BC01R523_A10782EntUniAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A3404EntPedCum = new String[] {""} ;
      BC01R523_A5691EntBnc = new String[] {""} ;
      BC01R523_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A666PedPri = new String[] {""} ;
      BC01R523_A667PedSit = new String[] {""} ;
      BC01R523_A659PedCum = new String[] {""} ;
      BC01R523_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A7695EntCC = new String[] {""} ;
      BC01R523_A7696EntCCoCod = new short[1] ;
      BC01R523_A10187EntRemNro = new String[] {""} ;
      BC01R523_A10186EntRemFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R523_A10185EntRemSuc = new String[] {""} ;
      BC01R523_A10184EntRemTpo = new String[] {""} ;
      BC01R523_A12716EntFabId = new int[1] ;
      BC01R523_A13456EntUbicaci = new String[] {""} ;
      BC01R523_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R523_A698PrdDetPar = new String[] {""} ;
      BC01R523_A718PrdNom = new String[] {""} ;
      BC01R523_A727PrdRec = new String[] {""} ;
      BC01R523_A14035EntNEmb = new byte[1] ;
      BC01R523_A396EmprCod = new String[] {""} ;
      BC01R523_A719PrdNum = new String[] {""} ;
      BC01R523_A658PedCod = new int[1] ;
      BC01R523_n658PedCod = new boolean[] {false} ;
      BC01R523_A795PrvNum = new int[1] ;
      BC01R523_A856ValCod = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV73PedCum = "" ;
      GXv_int14 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_char25 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int27 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_int21 = new int[1] ;
      GXv_char22 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int15 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_date19 = new java.util.Date[1] ;
      i10184EntRemTpo = "" ;
      i415EntFecEnt = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01R524_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R524_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R524_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R524_A698PrdDetPar = new String[] {""} ;
      BC01R524_A718PrdNom = new String[] {""} ;
      BC01R524_A727PrdRec = new String[] {""} ;
      BC01R524_A795PrvNum = new int[1] ;
      BC01R524_A856ValCod = new byte[1] ;
      BC01R525_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R525_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01R525_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01R525_A698PrdDetPar = new String[] {""} ;
      BC01R525_A718PrdNom = new String[] {""} ;
      BC01R525_A727PrdRec = new String[] {""} ;
      BC01R525_A795PrvNum = new int[1] ;
      BC01R525_A856ValCod = new byte[1] ;
      E396EmprCod = "" ;
      BC01R526_A396EmprCod = new String[] {""} ;
      BC01R526_A658PedCod = new int[1] ;
      BC01R526_n658PedCod = new boolean[] {false} ;
      BC01R526_A719PrdNum = new String[] {""} ;
      BC01R526_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradadeproductosalmacen_trn_bc__default(),
         new Object[] {
             new Object[] {
            BC01R52_A597LinEnt, BC01R52_A419EntUniRem, BC01R52_A417EntPre, BC01R52_A418EntUniEnt, BC01R52_A13235EntLoteID, BC01R52_A415EntFecEnt, BC01R52_A11Albaran, BC01R52_A12857EntNAlbar, BC01R52_A6156EntPrvNum, BC01R52_n6156EntPrvNum,
            BC01R52_A5686EntLotN, BC01R52_A5685EntFVal, BC01R52_A10783EntObs, BC01R52_A416EntNumCon, BC01R52_A414EntEti, BC01R52_A411EntCon, BC01R52_A413EntConIni, BC01R52_A412EntConFin, BC01R52_A5469EntNro, BC01R52_A10782EntUniAlb,
            BC01R52_A3404EntPedCum, BC01R52_A5691EntBnc, BC01R52_A7695EntCC, BC01R52_A7696EntCCoCod, BC01R52_A10187EntRemNro, BC01R52_A10186EntRemFch, BC01R52_A10185EntRemSuc, BC01R52_A10184EntRemTpo, BC01R52_A12716EntFabId, BC01R52_A13456EntUbicaci,
            BC01R52_A14035EntNEmb, BC01R52_A396EmprCod, BC01R52_A719PrdNum, BC01R52_A658PedCod, BC01R52_n658PedCod
            }
            , new Object[] {
            BC01R53_A597LinEnt, BC01R53_A419EntUniRem, BC01R53_A417EntPre, BC01R53_A418EntUniEnt, BC01R53_A13235EntLoteID, BC01R53_A415EntFecEnt, BC01R53_A11Albaran, BC01R53_A12857EntNAlbar, BC01R53_A6156EntPrvNum, BC01R53_n6156EntPrvNum,
            BC01R53_A5686EntLotN, BC01R53_A5685EntFVal, BC01R53_A10783EntObs, BC01R53_A416EntNumCon, BC01R53_A414EntEti, BC01R53_A411EntCon, BC01R53_A413EntConIni, BC01R53_A412EntConFin, BC01R53_A5469EntNro, BC01R53_A10782EntUniAlb,
            BC01R53_A3404EntPedCum, BC01R53_A5691EntBnc, BC01R53_A7695EntCC, BC01R53_A7696EntCCoCod, BC01R53_A10187EntRemNro, BC01R53_A10186EntRemFch, BC01R53_A10185EntRemSuc, BC01R53_A10184EntRemTpo, BC01R53_A12716EntFabId, BC01R53_A13456EntUbicaci,
            BC01R53_A14035EntNEmb, BC01R53_A396EmprCod, BC01R53_A719PrdNum, BC01R53_A658PedCod, BC01R53_n658PedCod
            }
            , new Object[] {
            BC01R54_A704PrdExiAlm, BC01R54_A684PrdCanPen, BC01R54_A750PrdValStk, BC01R54_A726PrdPreMed, BC01R54_A713PrdFulEnt, BC01R54_A709PrdFecPre, BC01R54_A725PrdPreAnt, BC01R54_A724PrdPreAct, BC01R54_A705PrdExiCC, BC01R54_A698PrdDetPar,
            BC01R54_A718PrdNom, BC01R54_A727PrdRec, BC01R54_A795PrvNum, BC01R54_A856ValCod
            }
            , new Object[] {
            BC01R55_A704PrdExiAlm, BC01R55_A684PrdCanPen, BC01R55_A750PrdValStk, BC01R55_A726PrdPreMed, BC01R55_A713PrdFulEnt, BC01R55_A709PrdFecPre, BC01R55_A725PrdPreAnt, BC01R55_A724PrdPreAct, BC01R55_A705PrdExiCC, BC01R55_A698PrdDetPar,
            BC01R55_A718PrdNom, BC01R55_A727PrdRec, BC01R55_A795PrvNum, BC01R55_A856ValCod
            }
            , new Object[] {
            BC01R56_A661PedFec, BC01R56_A666PedPri, BC01R56_A667PedSit
            }
            , new Object[] {
            BC01R57_A659PedCum, BC01R57_A663PedFulEnt, BC01R57_A657PedCanEnt, BC01R57_A669PedUni, BC01R57_A665PedPre, BC01R57_A660PedDto
            }
            , new Object[] {
            BC01R58_A597LinEnt, BC01R58_A704PrdExiAlm, BC01R58_A684PrdCanPen, BC01R58_A419EntUniRem, BC01R58_A750PrdValStk, BC01R58_A417EntPre, BC01R58_A726PrdPreMed, BC01R58_A713PrdFulEnt, BC01R58_A709PrdFecPre, BC01R58_A725PrdPreAnt,
            BC01R58_A724PrdPreAct, BC01R58_A418EntUniEnt, BC01R58_A13235EntLoteID, BC01R58_A415EntFecEnt, BC01R58_A11Albaran, BC01R58_A12857EntNAlbar, BC01R58_A6156EntPrvNum, BC01R58_n6156EntPrvNum, BC01R58_A5686EntLotN, BC01R58_A5685EntFVal,
            BC01R58_A10783EntObs, BC01R58_A416EntNumCon, BC01R58_A414EntEti, BC01R58_A411EntCon, BC01R58_A413EntConIni, BC01R58_A412EntConFin, BC01R58_A5469EntNro, BC01R58_A10782EntUniAlb, BC01R58_A3404EntPedCum, BC01R58_A5691EntBnc,
            BC01R58_A661PedFec, BC01R58_A666PedPri, BC01R58_A667PedSit, BC01R58_A659PedCum, BC01R58_A663PedFulEnt, BC01R58_A657PedCanEnt, BC01R58_A669PedUni, BC01R58_A665PedPre, BC01R58_A7695EntCC, BC01R58_A7696EntCCoCod,
            BC01R58_A10187EntRemNro, BC01R58_A10186EntRemFch, BC01R58_A10185EntRemSuc, BC01R58_A10184EntRemTpo, BC01R58_A12716EntFabId, BC01R58_A13456EntUbicaci, BC01R58_A660PedDto, BC01R58_A705PrdExiCC, BC01R58_A698PrdDetPar, BC01R58_A718PrdNom,
            BC01R58_A727PrdRec, BC01R58_A14035EntNEmb, BC01R58_A396EmprCod, BC01R58_A719PrdNum, BC01R58_A658PedCod, BC01R58_n658PedCod, BC01R58_A795PrvNum, BC01R58_A856ValCod
            }
            , new Object[] {
            BC01R59_A661PedFec, BC01R59_A666PedPri, BC01R59_A667PedSit
            }
            , new Object[] {
            BC01R510_A704PrdExiAlm, BC01R510_A684PrdCanPen, BC01R510_A750PrdValStk, BC01R510_A726PrdPreMed, BC01R510_A713PrdFulEnt, BC01R510_A709PrdFecPre, BC01R510_A725PrdPreAnt, BC01R510_A724PrdPreAct, BC01R510_A705PrdExiCC, BC01R510_A698PrdDetPar,
            BC01R510_A718PrdNom, BC01R510_A727PrdRec, BC01R510_A795PrvNum, BC01R510_A856ValCod
            }
            , new Object[] {
            BC01R511_A659PedCum, BC01R511_A663PedFulEnt, BC01R511_A657PedCanEnt, BC01R511_A669PedUni, BC01R511_A665PedPre, BC01R511_A660PedDto
            }
            , new Object[] {
            BC01R512_A396EmprCod, BC01R512_A719PrdNum, BC01R512_A597LinEnt
            }
            , new Object[] {
            BC01R513_A597LinEnt, BC01R513_A419EntUniRem, BC01R513_A417EntPre, BC01R513_A418EntUniEnt, BC01R513_A13235EntLoteID, BC01R513_A415EntFecEnt, BC01R513_A11Albaran, BC01R513_A12857EntNAlbar, BC01R513_A6156EntPrvNum, BC01R513_n6156EntPrvNum,
            BC01R513_A5686EntLotN, BC01R513_A5685EntFVal, BC01R513_A10783EntObs, BC01R513_A416EntNumCon, BC01R513_A414EntEti, BC01R513_A411EntCon, BC01R513_A413EntConIni, BC01R513_A412EntConFin, BC01R513_A5469EntNro, BC01R513_A10782EntUniAlb,
            BC01R513_A3404EntPedCum, BC01R513_A5691EntBnc, BC01R513_A7695EntCC, BC01R513_A7696EntCCoCod, BC01R513_A10187EntRemNro, BC01R513_A10186EntRemFch, BC01R513_A10185EntRemSuc, BC01R513_A10184EntRemTpo, BC01R513_A12716EntFabId, BC01R513_A13456EntUbicaci,
            BC01R513_A14035EntNEmb, BC01R513_A396EmprCod, BC01R513_A719PrdNum, BC01R513_A658PedCod, BC01R513_n658PedCod
            }
            , new Object[] {
            BC01R514_A597LinEnt, BC01R514_A419EntUniRem, BC01R514_A417EntPre, BC01R514_A418EntUniEnt, BC01R514_A13235EntLoteID, BC01R514_A415EntFecEnt, BC01R514_A11Albaran, BC01R514_A12857EntNAlbar, BC01R514_A6156EntPrvNum, BC01R514_n6156EntPrvNum,
            BC01R514_A5686EntLotN, BC01R514_A5685EntFVal, BC01R514_A10783EntObs, BC01R514_A416EntNumCon, BC01R514_A414EntEti, BC01R514_A411EntCon, BC01R514_A413EntConIni, BC01R514_A412EntConFin, BC01R514_A5469EntNro, BC01R514_A10782EntUniAlb,
            BC01R514_A3404EntPedCum, BC01R514_A5691EntBnc, BC01R514_A7695EntCC, BC01R514_A7696EntCCoCod, BC01R514_A10187EntRemNro, BC01R514_A10186EntRemFch, BC01R514_A10185EntRemSuc, BC01R514_A10184EntRemTpo, BC01R514_A12716EntFabId, BC01R514_A13456EntUbicaci,
            BC01R514_A14035EntNEmb, BC01R514_A396EmprCod, BC01R514_A719PrdNum, BC01R514_A658PedCod, BC01R514_n658PedCod
            }
            , new Object[] {
            BC01R515_A704PrdExiAlm, BC01R515_A684PrdCanPen, BC01R515_A750PrdValStk, BC01R515_A726PrdPreMed, BC01R515_A713PrdFulEnt, BC01R515_A709PrdFecPre, BC01R515_A725PrdPreAnt, BC01R515_A724PrdPreAct, BC01R515_A705PrdExiCC, BC01R515_A698PrdDetPar,
            BC01R515_A718PrdNom, BC01R515_A727PrdRec, BC01R515_A795PrvNum, BC01R515_A856ValCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01R519_A704PrdExiAlm, BC01R519_A684PrdCanPen, BC01R519_A750PrdValStk, BC01R519_A726PrdPreMed, BC01R519_A713PrdFulEnt, BC01R519_A709PrdFecPre, BC01R519_A725PrdPreAnt, BC01R519_A724PrdPreAct, BC01R519_A705PrdExiCC, BC01R519_A698PrdDetPar,
            BC01R519_A718PrdNom, BC01R519_A727PrdRec, BC01R519_A795PrvNum, BC01R519_A856ValCod
            }
            , new Object[] {
            BC01R520_A661PedFec, BC01R520_A666PedPri, BC01R520_A667PedSit
            }
            , new Object[] {
            BC01R521_A659PedCum, BC01R521_A663PedFulEnt, BC01R521_A657PedCanEnt, BC01R521_A669PedUni, BC01R521_A665PedPre, BC01R521_A660PedDto
            }
            , new Object[] {
            }
            , new Object[] {
            BC01R523_A597LinEnt, BC01R523_A704PrdExiAlm, BC01R523_A684PrdCanPen, BC01R523_A419EntUniRem, BC01R523_A750PrdValStk, BC01R523_A417EntPre, BC01R523_A726PrdPreMed, BC01R523_A713PrdFulEnt, BC01R523_A709PrdFecPre, BC01R523_A725PrdPreAnt,
            BC01R523_A724PrdPreAct, BC01R523_A418EntUniEnt, BC01R523_A13235EntLoteID, BC01R523_A415EntFecEnt, BC01R523_A11Albaran, BC01R523_A12857EntNAlbar, BC01R523_A6156EntPrvNum, BC01R523_n6156EntPrvNum, BC01R523_A5686EntLotN, BC01R523_A5685EntFVal,
            BC01R523_A10783EntObs, BC01R523_A416EntNumCon, BC01R523_A414EntEti, BC01R523_A411EntCon, BC01R523_A413EntConIni, BC01R523_A412EntConFin, BC01R523_A5469EntNro, BC01R523_A10782EntUniAlb, BC01R523_A3404EntPedCum, BC01R523_A5691EntBnc,
            BC01R523_A661PedFec, BC01R523_A666PedPri, BC01R523_A667PedSit, BC01R523_A659PedCum, BC01R523_A663PedFulEnt, BC01R523_A657PedCanEnt, BC01R523_A669PedUni, BC01R523_A665PedPre, BC01R523_A7695EntCC, BC01R523_A7696EntCCoCod,
            BC01R523_A10187EntRemNro, BC01R523_A10186EntRemFch, BC01R523_A10185EntRemSuc, BC01R523_A10184EntRemTpo, BC01R523_A12716EntFabId, BC01R523_A13456EntUbicaci, BC01R523_A660PedDto, BC01R523_A705PrdExiCC, BC01R523_A698PrdDetPar, BC01R523_A718PrdNom,
            BC01R523_A727PrdRec, BC01R523_A14035EntNEmb, BC01R523_A396EmprCod, BC01R523_A719PrdNum, BC01R523_A658PedCod, BC01R523_n658PedCod, BC01R523_A795PrvNum, BC01R523_A856ValCod
            }
            , new Object[] {
            BC01R524_A704PrdExiAlm, BC01R524_A684PrdCanPen, BC01R524_A750PrdValStk, BC01R524_A726PrdPreMed, BC01R524_A713PrdFulEnt, BC01R524_A709PrdFecPre, BC01R524_A725PrdPreAnt, BC01R524_A724PrdPreAct, BC01R524_A705PrdExiCC, BC01R524_A698PrdDetPar,
            BC01R524_A718PrdNom, BC01R524_A727PrdRec, BC01R524_A795PrvNum, BC01R524_A856ValCod
            }
            , new Object[] {
            BC01R525_A704PrdExiAlm, BC01R525_A684PrdCanPen, BC01R525_A750PrdValStk, BC01R525_A726PrdPreMed, BC01R525_A713PrdFulEnt, BC01R525_A709PrdFecPre, BC01R525_A725PrdPreAnt, BC01R525_A724PrdPreAct, BC01R525_A705PrdExiCC, BC01R525_A698PrdDetPar,
            BC01R525_A718PrdNom, BC01R525_A727PrdRec, BC01R525_A795PrvNum, BC01R525_A856ValCod
            }
            , new Object[] {
            BC01R526_A396EmprCod, BC01R526_A658PedCod, BC01R526_A719PrdNum, BC01R526_A659PedCum
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      E396EmprCod = "" ;
      AV75Pgmname = "StocksQuimicos.EntradadeProductosAlmacen_TRN_BC" ;
      Z415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      O415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i415EntFecEnt = GXutil.serverDate( context, remoteHandle, pr_default) ;
      Z6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      A6156EntPrvNum = 0 ;
      n6156EntPrvNum = false ;
      Z12716EntFabId = 0 ;
      A12716EntFabId = 0 ;
      Z3404EntPedCum = httpContext.getMessage( "N", "") ;
      A3404EntPedCum = httpContext.getMessage( "N", "") ;
      Z10184EntRemTpo = " " ;
      A10184EntRemTpo = " " ;
      i10184EntRemTpo = " " ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121R52 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte Z414EntEti ;
   private byte A414EntEti ;
   private byte Z411EntCon ;
   private byte A411EntCon ;
   private byte Z14035EntNEmb ;
   private byte A14035EntNEmb ;
   private byte Z856ValCod ;
   private byte A856ValCod ;
   private byte Gx_BScreen ;
   private byte AV48Mes ;
   private byte AV50MesAnt ;
   private byte GXv_int16[] ;
   private byte GXv_int6[] ;
   private byte GXv_int17[] ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z597LinEnt ;
   private short A597LinEnt ;
   private short AV11F_endutex ;
   private short AV12St0018 ;
   private short AV13Proprv ;
   private short AV14verCont ;
   private short AV15tintutex ;
   private short AV16SinCompras ;
   private short AV17vincolor ;
   private short AV18BCTexplus ;
   private short AV19AudEntradas ;
   private short AV20NoUpd ;
   private short AV21Rontaltex ;
   private short AV22Nalbaran20 ;
   private short AV23Carvitin ;
   private short AV10ExiLoteID ;
   private short AV24uel041 ;
   private short AV25Er ;
   private short AV26Artextil ;
   private short AV27Intexco ;
   private short AV28Consumos ;
   private short AV29FlagPre ;
   private short AV30PreTot ;
   private short AV34FlagCcs ;
   private short AV33FlagEti ;
   private short AV32FlagFecCcs ;
   private short AV31FlagEst ;
   private short Z416EntNumCon ;
   private short A416EntNumCon ;
   private short Z7696EntCCoCod ;
   private short A7696EntCCoCod ;
   private short Z664PedNumLin ;
   private short A664PedNumLin ;
   private short AV47Year ;
   private short AV49AnyAnt ;
   private short AV72DiasFin ;
   private short RcdFound42 ;
   private short nIsDirty_42 ;
   private short GXv_int14[] ;
   private short GXv_int10[] ;
   private short GXv_int15[] ;
   private int trnEnded ;
   private int GXt_int7 ;
   private int A658PedCod ;
   private int GX_JID ;
   private int Z6156EntPrvNum ;
   private int A6156EntPrvNum ;
   private int Z413EntConIni ;
   private int A413EntConIni ;
   private int Z412EntConFin ;
   private int A412EntConFin ;
   private int Z5469EntNro ;
   private int A5469EntNro ;
   private int Z12716EntFabId ;
   private int A12716EntFabId ;
   private int Z658PedCod ;
   private int Z795PrvNum ;
   private int A795PrvNum ;
   private int GXv_int27[] ;
   private int GXv_int21[] ;
   private int GXv_int8[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long Z13235EntLoteID ;
   private long A13235EntLoteID ;
   private java.math.BigDecimal Z419EntUniRem ;
   private java.math.BigDecimal A419EntUniRem ;
   private java.math.BigDecimal Z417EntPre ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal Z418EntUniEnt ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal Z10782EntUniAlb ;
   private java.math.BigDecimal A10782EntUniAlb ;
   private java.math.BigDecimal Z13833CantPdte ;
   private java.math.BigDecimal A13833CantPdte ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal O724PrdPreAct ;
   private java.math.BigDecimal O750PrdValStk ;
   private java.math.BigDecimal O684PrdCanPen ;
   private java.math.BigDecimal O704PrdExiAlm ;
   private java.math.BigDecimal O418EntUniEnt ;
   private java.math.BigDecimal AV38OldEntUni ;
   private java.math.BigDecimal AV46UniOld ;
   private java.math.BigDecimal AV42OldExiAlm ;
   private java.math.BigDecimal O419EntUniRem ;
   private java.math.BigDecimal AV36OldEntPre ;
   private java.math.BigDecimal O417EntPre ;
   private java.math.BigDecimal AV51PrecAnt ;
   private java.math.BigDecimal AV40OldRemanente ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z719PrdNum ;
   private String A719PrdNum ;
   private String AV7Station ;
   private String AV8EmprNom ;
   private String AV9UsurCod ;
   private String AV65PrdNum ;
   private String Z11Albaran ;
   private String A11Albaran ;
   private String Z12857EntNAlbar ;
   private String A12857EntNAlbar ;
   private String Z5686EntLotN ;
   private String A5686EntLotN ;
   private String Z10783EntObs ;
   private String A10783EntObs ;
   private String Z3404EntPedCum ;
   private String A3404EntPedCum ;
   private String Z5691EntBnc ;
   private String A5691EntBnc ;
   private String Z7695EntCC ;
   private String A7695EntCC ;
   private String Z10187EntRemNro ;
   private String A10187EntRemNro ;
   private String Z10185EntRemSuc ;
   private String A10185EntRemSuc ;
   private String Z10184EntRemTpo ;
   private String A10184EntRemTpo ;
   private String Z13456EntUbicaci ;
   private String A13456EntUbicaci ;
   private String Z698PrdDetPar ;
   private String A698PrdDetPar ;
   private String Z718PrdNom ;
   private String A718PrdNom ;
   private String Z727PrdRec ;
   private String A727PrdRec ;
   private String Z666PedPri ;
   private String A666PedPri ;
   private String Z667PedSit ;
   private String A667PedSit ;
   private String Z659PedCum ;
   private String A659PedCum ;
   private String AV75Pgmname ;
   private String AV43PedPri ;
   private String AV39oldlote ;
   private String O5686EntLotN ;
   private String AV59PrdNomX ;
   private String sMode42 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV73PedCum ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char23[] ;
   private String GXv_char22[] ;
   private String GXv_char20[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char29[] ;
   private String GXv_char28[] ;
   private String i10184EntRemTpo ;
   private String E396EmprCod ;
   private java.util.Date Z415EntFecEnt ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date Z5685EntFVal ;
   private java.util.Date A5685EntFVal ;
   private java.util.Date Z10186EntRemFch ;
   private java.util.Date A10186EntRemFch ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date Z661PedFec ;
   private java.util.Date A661PedFec ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date AV63Fecha ;
   private java.util.Date AV37oldEntFecent ;
   private java.util.Date O415EntFecEnt ;
   private java.util.Date AV52FecAnt ;
   private java.util.Date AV53LastFec ;
   private java.util.Date GXv_date11[] ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date i415EntFecEnt ;
   private boolean returnInSub ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String AV62msg_ctrl_fecha ;
   private String AV35Inc_obs ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.stocksquimicos.SdtEntradadeProductosAlmacen_TRN bcstocksquimicos_EntradadeProductosAlmacen_TRN ;
   private IDataStoreProvider pr_default ;
   private short[] BC01R58_A597LinEnt ;
   private java.math.BigDecimal[] BC01R58_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R58_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R58_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R58_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R58_A417EntPre ;
   private java.math.BigDecimal[] BC01R58_A726PrdPreMed ;
   private java.util.Date[] BC01R58_A713PrdFulEnt ;
   private java.util.Date[] BC01R58_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R58_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R58_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R58_A418EntUniEnt ;
   private long[] BC01R58_A13235EntLoteID ;
   private java.util.Date[] BC01R58_A415EntFecEnt ;
   private String[] BC01R58_A11Albaran ;
   private String[] BC01R58_A12857EntNAlbar ;
   private int[] BC01R58_A6156EntPrvNum ;
   private boolean[] BC01R58_n6156EntPrvNum ;
   private String[] BC01R58_A5686EntLotN ;
   private java.util.Date[] BC01R58_A5685EntFVal ;
   private String[] BC01R58_A10783EntObs ;
   private short[] BC01R58_A416EntNumCon ;
   private byte[] BC01R58_A414EntEti ;
   private byte[] BC01R58_A411EntCon ;
   private int[] BC01R58_A413EntConIni ;
   private int[] BC01R58_A412EntConFin ;
   private int[] BC01R58_A5469EntNro ;
   private java.math.BigDecimal[] BC01R58_A10782EntUniAlb ;
   private String[] BC01R58_A3404EntPedCum ;
   private String[] BC01R58_A5691EntBnc ;
   private java.util.Date[] BC01R58_A661PedFec ;
   private String[] BC01R58_A666PedPri ;
   private String[] BC01R58_A667PedSit ;
   private String[] BC01R58_A659PedCum ;
   private java.util.Date[] BC01R58_A663PedFulEnt ;
   private java.math.BigDecimal[] BC01R58_A657PedCanEnt ;
   private java.math.BigDecimal[] BC01R58_A669PedUni ;
   private java.math.BigDecimal[] BC01R58_A665PedPre ;
   private String[] BC01R58_A7695EntCC ;
   private short[] BC01R58_A7696EntCCoCod ;
   private String[] BC01R58_A10187EntRemNro ;
   private java.util.Date[] BC01R58_A10186EntRemFch ;
   private String[] BC01R58_A10185EntRemSuc ;
   private String[] BC01R58_A10184EntRemTpo ;
   private int[] BC01R58_A12716EntFabId ;
   private String[] BC01R58_A13456EntUbicaci ;
   private java.math.BigDecimal[] BC01R58_A660PedDto ;
   private java.math.BigDecimal[] BC01R58_A705PrdExiCC ;
   private String[] BC01R58_A698PrdDetPar ;
   private String[] BC01R58_A718PrdNom ;
   private String[] BC01R58_A727PrdRec ;
   private byte[] BC01R58_A14035EntNEmb ;
   private String[] BC01R58_A396EmprCod ;
   private String[] BC01R58_A719PrdNum ;
   private int[] BC01R58_A658PedCod ;
   private boolean[] BC01R58_n658PedCod ;
   private int[] BC01R58_A795PrvNum ;
   private byte[] BC01R58_A856ValCod ;
   private java.util.Date[] BC01R59_A661PedFec ;
   private String[] BC01R59_A666PedPri ;
   private String[] BC01R59_A667PedSit ;
   private java.math.BigDecimal[] BC01R510_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R510_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R510_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R510_A726PrdPreMed ;
   private java.util.Date[] BC01R510_A713PrdFulEnt ;
   private java.util.Date[] BC01R510_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R510_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R510_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R510_A705PrdExiCC ;
   private String[] BC01R510_A698PrdDetPar ;
   private String[] BC01R510_A718PrdNom ;
   private String[] BC01R510_A727PrdRec ;
   private int[] BC01R510_A795PrvNum ;
   private byte[] BC01R510_A856ValCod ;
   private String[] BC01R511_A659PedCum ;
   private java.util.Date[] BC01R511_A663PedFulEnt ;
   private java.math.BigDecimal[] BC01R511_A657PedCanEnt ;
   private java.math.BigDecimal[] BC01R511_A669PedUni ;
   private java.math.BigDecimal[] BC01R511_A665PedPre ;
   private java.math.BigDecimal[] BC01R511_A660PedDto ;
   private String[] BC01R512_A396EmprCod ;
   private String[] BC01R512_A719PrdNum ;
   private short[] BC01R512_A597LinEnt ;
   private short[] BC01R513_A597LinEnt ;
   private java.math.BigDecimal[] BC01R513_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R513_A417EntPre ;
   private java.math.BigDecimal[] BC01R513_A418EntUniEnt ;
   private long[] BC01R513_A13235EntLoteID ;
   private java.util.Date[] BC01R513_A415EntFecEnt ;
   private String[] BC01R513_A11Albaran ;
   private String[] BC01R513_A12857EntNAlbar ;
   private int[] BC01R513_A6156EntPrvNum ;
   private boolean[] BC01R513_n6156EntPrvNum ;
   private String[] BC01R513_A5686EntLotN ;
   private java.util.Date[] BC01R513_A5685EntFVal ;
   private String[] BC01R513_A10783EntObs ;
   private short[] BC01R513_A416EntNumCon ;
   private byte[] BC01R513_A414EntEti ;
   private byte[] BC01R513_A411EntCon ;
   private int[] BC01R513_A413EntConIni ;
   private int[] BC01R513_A412EntConFin ;
   private int[] BC01R513_A5469EntNro ;
   private java.math.BigDecimal[] BC01R513_A10782EntUniAlb ;
   private String[] BC01R513_A3404EntPedCum ;
   private String[] BC01R513_A5691EntBnc ;
   private String[] BC01R513_A7695EntCC ;
   private short[] BC01R513_A7696EntCCoCod ;
   private String[] BC01R513_A10187EntRemNro ;
   private java.util.Date[] BC01R513_A10186EntRemFch ;
   private String[] BC01R513_A10185EntRemSuc ;
   private String[] BC01R513_A10184EntRemTpo ;
   private int[] BC01R513_A12716EntFabId ;
   private String[] BC01R513_A13456EntUbicaci ;
   private byte[] BC01R513_A14035EntNEmb ;
   private String[] BC01R513_A396EmprCod ;
   private String[] BC01R513_A719PrdNum ;
   private int[] BC01R513_A658PedCod ;
   private boolean[] BC01R513_n658PedCod ;
   private short[] BC01R514_A597LinEnt ;
   private java.math.BigDecimal[] BC01R514_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R514_A417EntPre ;
   private java.math.BigDecimal[] BC01R514_A418EntUniEnt ;
   private long[] BC01R514_A13235EntLoteID ;
   private java.util.Date[] BC01R514_A415EntFecEnt ;
   private String[] BC01R514_A11Albaran ;
   private String[] BC01R514_A12857EntNAlbar ;
   private int[] BC01R514_A6156EntPrvNum ;
   private boolean[] BC01R514_n6156EntPrvNum ;
   private String[] BC01R514_A5686EntLotN ;
   private java.util.Date[] BC01R514_A5685EntFVal ;
   private String[] BC01R514_A10783EntObs ;
   private short[] BC01R514_A416EntNumCon ;
   private byte[] BC01R514_A414EntEti ;
   private byte[] BC01R514_A411EntCon ;
   private int[] BC01R514_A413EntConIni ;
   private int[] BC01R514_A412EntConFin ;
   private int[] BC01R514_A5469EntNro ;
   private java.math.BigDecimal[] BC01R514_A10782EntUniAlb ;
   private String[] BC01R514_A3404EntPedCum ;
   private String[] BC01R514_A5691EntBnc ;
   private String[] BC01R514_A7695EntCC ;
   private short[] BC01R514_A7696EntCCoCod ;
   private String[] BC01R514_A10187EntRemNro ;
   private java.util.Date[] BC01R514_A10186EntRemFch ;
   private String[] BC01R514_A10185EntRemSuc ;
   private String[] BC01R514_A10184EntRemTpo ;
   private int[] BC01R514_A12716EntFabId ;
   private String[] BC01R514_A13456EntUbicaci ;
   private byte[] BC01R514_A14035EntNEmb ;
   private String[] BC01R514_A396EmprCod ;
   private String[] BC01R514_A719PrdNum ;
   private int[] BC01R514_A658PedCod ;
   private boolean[] BC01R514_n658PedCod ;
   private java.math.BigDecimal[] BC01R515_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R515_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R515_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R515_A726PrdPreMed ;
   private java.util.Date[] BC01R515_A713PrdFulEnt ;
   private java.util.Date[] BC01R515_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R515_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R515_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R515_A705PrdExiCC ;
   private String[] BC01R515_A698PrdDetPar ;
   private String[] BC01R515_A718PrdNom ;
   private String[] BC01R515_A727PrdRec ;
   private int[] BC01R515_A795PrvNum ;
   private byte[] BC01R515_A856ValCod ;
   private java.math.BigDecimal[] BC01R519_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R519_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R519_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R519_A726PrdPreMed ;
   private java.util.Date[] BC01R519_A713PrdFulEnt ;
   private java.util.Date[] BC01R519_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R519_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R519_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R519_A705PrdExiCC ;
   private String[] BC01R519_A698PrdDetPar ;
   private String[] BC01R519_A718PrdNom ;
   private String[] BC01R519_A727PrdRec ;
   private int[] BC01R519_A795PrvNum ;
   private byte[] BC01R519_A856ValCod ;
   private java.util.Date[] BC01R520_A661PedFec ;
   private String[] BC01R520_A666PedPri ;
   private String[] BC01R520_A667PedSit ;
   private String[] BC01R521_A659PedCum ;
   private java.util.Date[] BC01R521_A663PedFulEnt ;
   private java.math.BigDecimal[] BC01R521_A657PedCanEnt ;
   private java.math.BigDecimal[] BC01R521_A669PedUni ;
   private java.math.BigDecimal[] BC01R521_A665PedPre ;
   private java.math.BigDecimal[] BC01R521_A660PedDto ;
   private short[] BC01R523_A597LinEnt ;
   private java.math.BigDecimal[] BC01R523_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R523_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R523_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R523_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R523_A417EntPre ;
   private java.math.BigDecimal[] BC01R523_A726PrdPreMed ;
   private java.util.Date[] BC01R523_A713PrdFulEnt ;
   private java.util.Date[] BC01R523_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R523_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R523_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R523_A418EntUniEnt ;
   private long[] BC01R523_A13235EntLoteID ;
   private java.util.Date[] BC01R523_A415EntFecEnt ;
   private String[] BC01R523_A11Albaran ;
   private String[] BC01R523_A12857EntNAlbar ;
   private int[] BC01R523_A6156EntPrvNum ;
   private boolean[] BC01R523_n6156EntPrvNum ;
   private String[] BC01R523_A5686EntLotN ;
   private java.util.Date[] BC01R523_A5685EntFVal ;
   private String[] BC01R523_A10783EntObs ;
   private short[] BC01R523_A416EntNumCon ;
   private byte[] BC01R523_A414EntEti ;
   private byte[] BC01R523_A411EntCon ;
   private int[] BC01R523_A413EntConIni ;
   private int[] BC01R523_A412EntConFin ;
   private int[] BC01R523_A5469EntNro ;
   private java.math.BigDecimal[] BC01R523_A10782EntUniAlb ;
   private String[] BC01R523_A3404EntPedCum ;
   private String[] BC01R523_A5691EntBnc ;
   private java.util.Date[] BC01R523_A661PedFec ;
   private String[] BC01R523_A666PedPri ;
   private String[] BC01R523_A667PedSit ;
   private String[] BC01R523_A659PedCum ;
   private java.util.Date[] BC01R523_A663PedFulEnt ;
   private java.math.BigDecimal[] BC01R523_A657PedCanEnt ;
   private java.math.BigDecimal[] BC01R523_A669PedUni ;
   private java.math.BigDecimal[] BC01R523_A665PedPre ;
   private String[] BC01R523_A7695EntCC ;
   private short[] BC01R523_A7696EntCCoCod ;
   private String[] BC01R523_A10187EntRemNro ;
   private java.util.Date[] BC01R523_A10186EntRemFch ;
   private String[] BC01R523_A10185EntRemSuc ;
   private String[] BC01R523_A10184EntRemTpo ;
   private int[] BC01R523_A12716EntFabId ;
   private String[] BC01R523_A13456EntUbicaci ;
   private java.math.BigDecimal[] BC01R523_A660PedDto ;
   private java.math.BigDecimal[] BC01R523_A705PrdExiCC ;
   private String[] BC01R523_A698PrdDetPar ;
   private String[] BC01R523_A718PrdNom ;
   private String[] BC01R523_A727PrdRec ;
   private byte[] BC01R523_A14035EntNEmb ;
   private String[] BC01R523_A396EmprCod ;
   private String[] BC01R523_A719PrdNum ;
   private int[] BC01R523_A658PedCod ;
   private boolean[] BC01R523_n658PedCod ;
   private int[] BC01R523_A795PrvNum ;
   private byte[] BC01R523_A856ValCod ;
   private java.math.BigDecimal[] BC01R524_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R524_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R524_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R524_A726PrdPreMed ;
   private java.util.Date[] BC01R524_A713PrdFulEnt ;
   private java.util.Date[] BC01R524_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R524_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R524_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R524_A705PrdExiCC ;
   private String[] BC01R524_A698PrdDetPar ;
   private String[] BC01R524_A718PrdNom ;
   private String[] BC01R524_A727PrdRec ;
   private int[] BC01R524_A795PrvNum ;
   private byte[] BC01R524_A856ValCod ;
   private java.math.BigDecimal[] BC01R525_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R525_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R525_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R525_A726PrdPreMed ;
   private java.util.Date[] BC01R525_A713PrdFulEnt ;
   private java.util.Date[] BC01R525_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R525_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R525_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R525_A705PrdExiCC ;
   private String[] BC01R525_A698PrdDetPar ;
   private String[] BC01R525_A718PrdNom ;
   private String[] BC01R525_A727PrdRec ;
   private int[] BC01R525_A795PrvNum ;
   private byte[] BC01R525_A856ValCod ;
   private String[] BC01R526_A396EmprCod ;
   private int[] BC01R526_A658PedCod ;
   private boolean[] BC01R526_n658PedCod ;
   private String[] BC01R526_A719PrdNum ;
   private String[] BC01R526_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] BC01R52_A597LinEnt ;
   private java.math.BigDecimal[] BC01R52_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R52_A417EntPre ;
   private java.math.BigDecimal[] BC01R52_A418EntUniEnt ;
   private long[] BC01R52_A13235EntLoteID ;
   private java.util.Date[] BC01R52_A415EntFecEnt ;
   private String[] BC01R52_A11Albaran ;
   private String[] BC01R52_A12857EntNAlbar ;
   private int[] BC01R52_A6156EntPrvNum ;
   private String[] BC01R52_A5686EntLotN ;
   private java.util.Date[] BC01R52_A5685EntFVal ;
   private String[] BC01R52_A10783EntObs ;
   private short[] BC01R52_A416EntNumCon ;
   private byte[] BC01R52_A414EntEti ;
   private byte[] BC01R52_A411EntCon ;
   private int[] BC01R52_A413EntConIni ;
   private int[] BC01R52_A412EntConFin ;
   private int[] BC01R52_A5469EntNro ;
   private java.math.BigDecimal[] BC01R52_A10782EntUniAlb ;
   private String[] BC01R52_A3404EntPedCum ;
   private String[] BC01R52_A5691EntBnc ;
   private String[] BC01R52_A7695EntCC ;
   private short[] BC01R52_A7696EntCCoCod ;
   private String[] BC01R52_A10187EntRemNro ;
   private java.util.Date[] BC01R52_A10186EntRemFch ;
   private String[] BC01R52_A10185EntRemSuc ;
   private String[] BC01R52_A10184EntRemTpo ;
   private int[] BC01R52_A12716EntFabId ;
   private String[] BC01R52_A13456EntUbicaci ;
   private byte[] BC01R52_A14035EntNEmb ;
   private String[] BC01R52_A396EmprCod ;
   private String[] BC01R52_A719PrdNum ;
   private int[] BC01R52_A658PedCod ;
   private short[] BC01R53_A597LinEnt ;
   private java.math.BigDecimal[] BC01R53_A419EntUniRem ;
   private java.math.BigDecimal[] BC01R53_A417EntPre ;
   private java.math.BigDecimal[] BC01R53_A418EntUniEnt ;
   private long[] BC01R53_A13235EntLoteID ;
   private java.util.Date[] BC01R53_A415EntFecEnt ;
   private String[] BC01R53_A11Albaran ;
   private String[] BC01R53_A12857EntNAlbar ;
   private int[] BC01R53_A6156EntPrvNum ;
   private String[] BC01R53_A5686EntLotN ;
   private java.util.Date[] BC01R53_A5685EntFVal ;
   private String[] BC01R53_A10783EntObs ;
   private short[] BC01R53_A416EntNumCon ;
   private byte[] BC01R53_A414EntEti ;
   private byte[] BC01R53_A411EntCon ;
   private int[] BC01R53_A413EntConIni ;
   private int[] BC01R53_A412EntConFin ;
   private int[] BC01R53_A5469EntNro ;
   private java.math.BigDecimal[] BC01R53_A10782EntUniAlb ;
   private String[] BC01R53_A3404EntPedCum ;
   private String[] BC01R53_A5691EntBnc ;
   private String[] BC01R53_A7695EntCC ;
   private short[] BC01R53_A7696EntCCoCod ;
   private String[] BC01R53_A10187EntRemNro ;
   private java.util.Date[] BC01R53_A10186EntRemFch ;
   private String[] BC01R53_A10185EntRemSuc ;
   private String[] BC01R53_A10184EntRemTpo ;
   private int[] BC01R53_A12716EntFabId ;
   private String[] BC01R53_A13456EntUbicaci ;
   private byte[] BC01R53_A14035EntNEmb ;
   private String[] BC01R53_A396EmprCod ;
   private String[] BC01R53_A719PrdNum ;
   private int[] BC01R53_A658PedCod ;
   private java.math.BigDecimal[] BC01R54_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R54_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R54_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R54_A726PrdPreMed ;
   private java.util.Date[] BC01R54_A713PrdFulEnt ;
   private java.util.Date[] BC01R54_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R54_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R54_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R54_A705PrdExiCC ;
   private String[] BC01R54_A698PrdDetPar ;
   private String[] BC01R54_A718PrdNom ;
   private String[] BC01R54_A727PrdRec ;
   private int[] BC01R54_A795PrvNum ;
   private byte[] BC01R54_A856ValCod ;
   private java.math.BigDecimal[] BC01R55_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01R55_A684PrdCanPen ;
   private java.math.BigDecimal[] BC01R55_A750PrdValStk ;
   private java.math.BigDecimal[] BC01R55_A726PrdPreMed ;
   private java.util.Date[] BC01R55_A713PrdFulEnt ;
   private java.util.Date[] BC01R55_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01R55_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01R55_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01R55_A705PrdExiCC ;
   private String[] BC01R55_A698PrdDetPar ;
   private String[] BC01R55_A718PrdNom ;
   private String[] BC01R55_A727PrdRec ;
   private int[] BC01R55_A795PrvNum ;
   private byte[] BC01R55_A856ValCod ;
   private java.util.Date[] BC01R56_A661PedFec ;
   private String[] BC01R56_A666PedPri ;
   private String[] BC01R56_A667PedSit ;
   private String[] BC01R57_A659PedCum ;
   private java.util.Date[] BC01R57_A663PedFulEnt ;
   private java.math.BigDecimal[] BC01R57_A657PedCanEnt ;
   private java.math.BigDecimal[] BC01R57_A669PedUni ;
   private java.math.BigDecimal[] BC01R57_A665PedPre ;
   private java.math.BigDecimal[] BC01R57_A660PedDto ;
   private boolean[] BC01R52_n6156EntPrvNum ;
   private boolean[] BC01R52_n658PedCod ;
   private boolean[] BC01R53_n6156EntPrvNum ;
   private boolean[] BC01R53_n658PedCod ;
}

final  class entradadeproductosalmacen_trn_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class entradadeproductosalmacen_trn_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class entradadeproductosalmacen_trn_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class entradadeproductosalmacen_trn_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class entradadeproductosalmacen_trn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01R52", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R53", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R54", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R55", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R56", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R57", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R58", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, T2.PrdExiAlm, T2.PrdCanPen, TM1.EntUniRem, T2.PrdValStk, TM1.EntPre, T2.PrdPreMed, T2.PrdFulEnt, T2.PrdFecPre, T2.PrdPreAnt, T2.PrdPreAct, TM1.EntUniEnt, TM1.EntLoteID, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, TM1.EntLotN, TM1.EntFVal, TM1.EntObs, TM1.EntNumCon, TM1.EntEti, TM1.EntCon, TM1.EntConIni, TM1.EntConFin, TM1.EntNro, TM1.EntUniAlb, TM1.EntPedCum, TM1.EntBnc, T3.PedFec, T3.PedPri, T3.PedSit, T4.PedCum, T4.PedFulEnt, T4.PedCanEnt, T4.PedUni, T4.PedPre, TM1.EntCC, TM1.EntCCoCod, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, TM1.EntFabId, TM1.EntUbicaci, T4.PedDto, T2.PrdExiCC, T2.PrdDetPar, T2.PrdNom, T2.PrdRec, TM1.EntNEmb, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T2.PrvNum, T2.ValCod FROM (((TXPENTALM TM1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum) LEFT JOIN TXPCPEDID T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T4 ON T4.EmprCod = TM1.EmprCod AND T4.PedCod = TM1.PedCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R59", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R510", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R511", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R512", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R513", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R514", "SELECT LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod FROM TXPENTALM WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?  FOR UPDATE OF EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, PedCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R515", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01R516", "INSERT INTO TXPENTALM(LinEnt, EntUniRem, EntPre, EntUniEnt, EntLoteID, EntFecEnt, Albaran, EntNAlbar, EntPrvNum, EntLotN, EntFVal, EntObs, EntNumCon, EntEti, EntCon, EntConIni, EntConFin, EntNro, EntUniAlb, EntPedCum, EntBnc, EntCC, EntCCoCod, EntRemNro, EntRemFch, EntRemSuc, EntRemTpo, EntFabId, EntUbicaci, EntNEmb, EmprCod, PrdNum, PedCod, EntHfCon, EntFfCon, EntHiCon, EntFiCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("BC01R517", "UPDATE TXPENTALM SET EntUniRem=?, EntPre=?, EntUniEnt=?, EntLoteID=?, EntFecEnt=?, Albaran=?, EntNAlbar=?, EntPrvNum=?, EntLotN=?, EntFVal=?, EntObs=?, EntNumCon=?, EntEti=?, EntCon=?, EntConIni=?, EntConFin=?, EntNro=?, EntUniAlb=?, EntPedCum=?, EntBnc=?, EntCC=?, EntCCoCod=?, EntRemNro=?, EntRemFch=?, EntRemSuc=?, EntRemTpo=?, EntFabId=?, EntUbicaci=?, EntNEmb=?, PedCod=?  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new UpdateCursor("BC01R518", "DELETE FROM TXPENTALM  WHERE EmprCod = ? AND PrdNum = ? AND LinEnt = ?", GX_NOMASK, "TXPENTALM")
         ,new ForEachCursor("BC01R519", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R520", "SELECT PedFec, PedPri, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R521", "SELECT PedCum, PedFulEnt, PedCanEnt, PedUni, PedPre, PedDto FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01R522", "UPDATE TXPPRODUC SET PrdExiAlm=?, PrdCanPen=?, PrdValStk=?, PrdPreMed=?, PrdFulEnt=?, PrdFecPre=?, PrdPreAnt=?, PrdPreAct=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("BC01R523", "SELECT /*+ FIRST_ROWS(100) */ TM1.LinEnt, T2.PrdExiAlm, T2.PrdCanPen, TM1.EntUniRem, T2.PrdValStk, TM1.EntPre, T2.PrdPreMed, T2.PrdFulEnt, T2.PrdFecPre, T2.PrdPreAnt, T2.PrdPreAct, TM1.EntUniEnt, TM1.EntLoteID, TM1.EntFecEnt, TM1.Albaran, TM1.EntNAlbar, TM1.EntPrvNum, TM1.EntLotN, TM1.EntFVal, TM1.EntObs, TM1.EntNumCon, TM1.EntEti, TM1.EntCon, TM1.EntConIni, TM1.EntConFin, TM1.EntNro, TM1.EntUniAlb, TM1.EntPedCum, TM1.EntBnc, T3.PedFec, T3.PedPri, T3.PedSit, T4.PedCum, T4.PedFulEnt, T4.PedCanEnt, T4.PedUni, T4.PedPre, TM1.EntCC, TM1.EntCCoCod, TM1.EntRemNro, TM1.EntRemFch, TM1.EntRemSuc, TM1.EntRemTpo, TM1.EntFabId, TM1.EntUbicaci, T4.PedDto, T2.PrdExiCC, T2.PrdDetPar, T2.PrdNom, T2.PrdRec, TM1.EntNEmb, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T2.PrvNum, T2.ValCod FROM (((TXPENTALM TM1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum) LEFT JOIN TXPCPEDID T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod) LEFT JOIN TXPLPEDID T4 ON T4.EmprCod = TM1.EmprCod AND T4.PedCod = TM1.PedCod AND T4.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LinEnt = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LinEnt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R524", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R525", "SELECT PrdExiAlm, PrdCanPen, PrdValStk, PrdPreMed, PrdFulEnt, PrdFecPre, PrdPreAnt, PrdPreAct, PrdExiCC, PrdDetPar, PrdNom, PrdRec, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01R526", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 100);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((int[]) buf[26])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[28])[0] = rslt.getString(28, 1);
               ((String[]) buf[29])[0] = rslt.getString(29, 10);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 1);
               ((String[]) buf[32])[0] = rslt.getString(32, 1);
               ((String[]) buf[33])[0] = rslt.getString(33, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(34);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,5);
               ((String[]) buf[38])[0] = rslt.getString(38, 1);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((String[]) buf[40])[0] = rslt.getString(40, 12);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(41);
               ((String[]) buf[42])[0] = rslt.getString(42, 4);
               ((String[]) buf[43])[0] = rslt.getString(43, 4);
               ((int[]) buf[44])[0] = rslt.getInt(44);
               ((String[]) buf[45])[0] = rslt.getString(45, 20);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(47,4);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((String[]) buf[49])[0] = rslt.getString(49, 26);
               ((String[]) buf[50])[0] = rslt.getString(50, 1);
               ((byte[]) buf[51])[0] = rslt.getByte(51);
               ((String[]) buf[52])[0] = rslt.getString(52, 3);
               ((String[]) buf[53])[0] = rslt.getString(53, 6);
               ((int[]) buf[54])[0] = rslt.getInt(54);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(55);
               ((byte[]) buf[57])[0] = rslt.getByte(56);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 100);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,4);
               ((String[]) buf[20])[0] = rslt.getString(20, 1);
               ((String[]) buf[21])[0] = rslt.getString(21, 10);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((String[]) buf[24])[0] = rslt.getString(24, 12);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 4);
               ((String[]) buf[27])[0] = rslt.getString(27, 4);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 20);
               ((byte[]) buf[30])[0] = rslt.getByte(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 3);
               ((String[]) buf[32])[0] = rslt.getString(32, 6);
               ((int[]) buf[33])[0] = rslt.getInt(33);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 18 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 21 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((long[]) buf[12])[0] = rslt.getLong(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 26);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 100);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((byte[]) buf[22])[0] = rslt.getByte(22);
               ((byte[]) buf[23])[0] = rslt.getByte(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((int[]) buf[26])[0] = rslt.getInt(26);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[28])[0] = rslt.getString(28, 1);
               ((String[]) buf[29])[0] = rslt.getString(29, 10);
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(30);
               ((String[]) buf[31])[0] = rslt.getString(31, 1);
               ((String[]) buf[32])[0] = rslt.getString(32, 1);
               ((String[]) buf[33])[0] = rslt.getString(33, 1);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(34);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,5);
               ((String[]) buf[38])[0] = rslt.getString(38, 1);
               ((short[]) buf[39])[0] = rslt.getShort(39);
               ((String[]) buf[40])[0] = rslt.getString(40, 12);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(41);
               ((String[]) buf[42])[0] = rslt.getString(42, 4);
               ((String[]) buf[43])[0] = rslt.getString(43, 4);
               ((int[]) buf[44])[0] = rslt.getInt(44);
               ((String[]) buf[45])[0] = rslt.getString(45, 20);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(46,2);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(47,4);
               ((String[]) buf[48])[0] = rslt.getString(48, 1);
               ((String[]) buf[49])[0] = rslt.getString(49, 26);
               ((String[]) buf[50])[0] = rslt.getString(50, 1);
               ((byte[]) buf[51])[0] = rslt.getByte(51);
               ((String[]) buf[52])[0] = rslt.getString(52, 3);
               ((String[]) buf[53])[0] = rslt.getString(53, 6);
               ((int[]) buf[54])[0] = rslt.getInt(54);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((int[]) buf[56])[0] = rslt.getInt(55);
               ((byte[]) buf[57])[0] = rslt.getByte(56);
               return;
            case 22 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setString(8, (String)parms[7], 20);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[9]).intValue());
               }
               stmt.setString(10, (String)parms[10], 26);
               stmt.setDate(11, (java.util.Date)parms[11]);
               stmt.setString(12, (String)parms[12], 100);
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setInt(18, ((Number) parms[18]).intValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 4);
               stmt.setString(20, (String)parms[20], 1);
               stmt.setString(21, (String)parms[21], 10);
               stmt.setString(22, (String)parms[22], 1);
               stmt.setShort(23, ((Number) parms[23]).shortValue());
               stmt.setString(24, (String)parms[24], 12);
               stmt.setDate(25, (java.util.Date)parms[25]);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setString(27, (String)parms[27], 4);
               stmt.setInt(28, ((Number) parms[28]).intValue());
               stmt.setString(29, (String)parms[29], 20);
               stmt.setByte(30, ((Number) parms[30]).byteValue());
               stmt.setString(31, (String)parms[31], 3);
               stmt.setString(32, (String)parms[32], 6);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[34]).intValue());
               }
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 20);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               stmt.setString(9, (String)parms[9], 26);
               stmt.setDate(10, (java.util.Date)parms[10]);
               stmt.setString(11, (String)parms[11], 100);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setByte(13, ((Number) parms[13]).byteValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               stmt.setInt(15, ((Number) parms[15]).intValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setInt(17, ((Number) parms[17]).intValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 4);
               stmt.setString(19, (String)parms[19], 1);
               stmt.setString(20, (String)parms[20], 10);
               stmt.setString(21, (String)parms[21], 1);
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setString(23, (String)parms[23], 12);
               stmt.setDate(24, (java.util.Date)parms[24]);
               stmt.setString(25, (String)parms[25], 4);
               stmt.setString(26, (String)parms[26], 4);
               stmt.setInt(27, ((Number) parms[27]).intValue());
               stmt.setString(28, (String)parms[28], 20);
               stmt.setByte(29, ((Number) parms[29]).byteValue());
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[31]).intValue());
               }
               stmt.setString(31, (String)parms[32], 3);
               stmt.setString(32, (String)parms[33], 6);
               stmt.setShort(33, ((Number) parms[34]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 20 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

