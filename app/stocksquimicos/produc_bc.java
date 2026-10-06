package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class produc_bc extends GXWebPanel implements IGxSilentTrn
{
   public produc_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public produc_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( produc_bc.class ));
   }

   public produc_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1PJ29( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1PJ29( ) ;
      standaloneModal( ) ;
      addRow1PJ29( ) ;
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
         e111PJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z719PrdNum = A719PrdNum ;
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

   public void confirm_1PJ0( )
   {
      beforeValidate1PJ29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PJ29( ) ;
         }
         else
         {
            checkExtendedTable1PJ29( ) ;
            if ( AnyError == 0 )
            {
               zm1PJ29( 68) ;
               zm1PJ29( 69) ;
               zm1PJ29( 70) ;
               zm1PJ29( 71) ;
               zm1PJ29( 72) ;
               zm1PJ29( 73) ;
               zm1PJ29( 74) ;
               zm1PJ29( 75) ;
               zm1PJ29( 76) ;
               zm1PJ29( 77) ;
               zm1PJ29( 78) ;
               zm1PJ29( 79) ;
               zm1PJ29( 80) ;
            }
            closeExtendedTableCursors1PJ29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121PJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      produc_bc.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV47EmprNom ;
      GXv_char4[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      produc_bc.this.A396EmprCod = GXv_char2[0] ;
      produc_bc.this.AV47EmprNom = GXv_char3[0] ;
      produc_bc.this.AV8Usurcod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV12gavim) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "GAVIM", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV12gavim = GXt_int5 ;
      GXt_int5 = (byte)(AV13Eliot) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV13Eliot = GXt_int5 ;
      AV14FlagCcs = (short)(0) ;
      GXv_int6[0] = (byte)(AV14FlagCcs) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      produc_bc.this.AV14FlagCcs = GXv_int6[0] ;
      if ( AV14FlagCcs == 1 )
      {
         AV15ContVal = 0 ;
         GXv_int7[0] = AV15ContVal ;
         new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSPWD", ""), GXv_int7) ;
         produc_bc.this.AV15ContVal = GXv_int7[0] ;
      }
      GXv_int6[0] = (byte)(AV16FlagStm) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "STM004", ""), GXv_int6) ;
      produc_bc.this.AV16FlagStm = GXv_int6[0] ;
      GXv_int6[0] = (byte)(AV17F_preci2) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int6) ;
      produc_bc.this.AV17F_preci2 = GXv_int6[0] ;
      GXv_int6[0] = (byte)(AV18F_moda21) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      produc_bc.this.AV18F_moda21 = GXv_int6[0] ;
      GXt_int5 = (byte)(AV19ProPrv) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV19ProPrv = GXt_int5 ;
      GXv_int6[0] = (byte)(AV20FlagCen) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CENTRA", ""), GXv_int6) ;
      produc_bc.this.AV20FlagCen = GXv_int6[0] ;
      GXt_int5 = (byte)(AV21NoVisible) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOVISC", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV21NoVisible = GXt_int5 ;
      GXt_int5 = (byte)(AV22Suprema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV22Suprema = GXt_int5 ;
      GXt_int5 = (byte)(AV23HorasM) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HORMAD", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV23HorasM = GXt_int5 ;
      GXt_int5 = (byte)(AV24PesColNE) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PECONE", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV24PesColNE = GXt_int5 ;
      GXt_int5 = (byte)(AV25PesColGX) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PECOGX", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV25PesColGX = GXt_int5 ;
      GXt_int5 = (byte)(AV26Nalmcc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV26Nalmcc = GXt_int5 ;
      GXt_int5 = (byte)(AV27Premed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV27Premed = GXt_int5 ;
      GXt_int5 = (byte)(AV28Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV28Carvema = GXt_int5 ;
      GXt_int5 = (byte)(AV29Prdtb2) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PRDTB2", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV29Prdtb2 = GXt_int5 ;
      GXt_int5 = (byte)(AV30Lotes) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "00LOTE", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV30Lotes = GXt_int5 ;
      GXt_int5 = (byte)(AV31Erfoc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31Erfoc = GXt_int5 ;
      GXv_int6[0] = (byte)(AV32FlagCColor) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      produc_bc.this.AV32FlagCColor = GXv_int6[0] ;
      GXt_int5 = (byte)(AV33EliotLavanderia) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LELIOT", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV33EliotLavanderia = GXt_int5 ;
      GXt_int5 = (byte)(AV34TexplusAcatex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TELIOT", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV34TexplusAcatex = GXt_int5 ;
      GXt_int5 = (byte)(AV35Ubicacion) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV35Ubicacion = GXt_int5 ;
      GXt_int5 = (byte)(AV36SiRGB) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPRGB", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV36SiRGB = GXt_int5 ;
      GXt_int5 = (byte)(AV37Hm) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HMNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV37Hm = GXt_int5 ;
      GXt_int5 = AV38Prdlist ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PDNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV38Prdlist = GXt_int5 ;
      GXt_int5 = AV39Thelist ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "THNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV39Thelist = GXt_int5 ;
      GXt_int5 = (byte)(AV40Reach) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RHNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV40Reach = GXt_int5 ;
      GXt_int5 = (byte)(AV41Aox) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AXNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV41Aox = GXt_int5 ;
      GXt_int5 = (byte)(AV42Incid) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV42Incid = GXt_int5 ;
      GXt_int5 = (byte)(AV43Complej) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CPNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV43Complej = GXt_int5 ;
      GXt_int5 = (byte)(AV44Rtm) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RTNO00", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV44Rtm = GXt_int5 ;
      GXt_int5 = (byte)(AV45sustancias) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "THESUS", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV45sustancias = GXt_int5 ;
      GXt_int5 = (byte)(AV46BCTexplus) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BCTXP", ""), GXv_int6) ;
      produc_bc.this.GXt_int5 = GXv_int6[0] ;
      AV46BCTexplus = GXt_int5 ;
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      produc_bc.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV51EmprCod ;
      GXv_char3[0] = AV47EmprNom ;
      GXv_char2[0] = AV8Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      produc_bc.this.AV51EmprCod = GXv_char4[0] ;
      produc_bc.this.AV47EmprNom = GXv_char3[0] ;
      produc_bc.this.AV8Usurcod = GXv_char2[0] ;
      GXv_SdtWWPContext8[0] = AV53WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV53WWPContext = GXv_SdtWWPContext8[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(14);
         pr_default.close(13);
         pr_default.close(12);
         pr_default.close(11);
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV54TrnContext.fromxml(AV55WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV54TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV82Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV83GXV1 = 1 ;
         while ( AV83GXV1 <= AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV65TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV54TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV83GXV1));
            if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvNum") == 0 )
            {
               AV56Insert_PrvNum = (int)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdUniCom") == 0 )
            {
               AV57Insert_PrdUniCom = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdUniCon") == 0 )
            {
               AV58Insert_PrdUniCon = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ValCod") == 0 )
            {
               AV59Insert_ValCod = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipDtoCod") == 0 )
            {
               AV60Insert_TipDtoCod = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "MetCod") == 0 )
            {
               AV61Insert_MetCod = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TipPrdCod") == 0 )
            {
               AV62Insert_TipPrdCod = (short)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "SubFamCod") == 0 )
            {
               AV63Insert_SubFamCod = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdFabId") == 0 )
            {
               AV64Insert_PrdFabId = (int)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdGruFamId") == 0 )
            {
               AV80Insert_PrdGruFamId = (byte)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlmPrdID") == 0 )
            {
               AV74Insert_AlmPrdID = (short)(GXutil.lval( AV65TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            AV83GXV1 = (int)(AV83GXV1+1) ;
         }
      }
   }

   public void e111PJ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         httpContext.popup(formatLink("app.stocksquimicos.tprdfrr", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrdNum"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", A13302PrdTHELIST)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A13302PrdTHELIST ;
         new app.core.inscatsus(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         produc_bc.this.A396EmprCod = GXv_char4[0] ;
         produc_bc.this.A719PrdNum = GXv_char3[0] ;
         produc_bc.this.A13302PrdTHELIST = GXv_char2[0] ;
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) && ( GXutil.strcmp(A13302PrdTHELIST, AV11OldPrdTHELIST) != 0 ) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = A718PrdNom ;
         GXv_char9[0] = "" ;
         GXv_char10[0] = AV11OldPrdTHELIST ;
         GXv_char11[0] = AV8Usurcod ;
         GXv_char12[0] = AV9Station ;
         new app.pdltthelist(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char9, GXv_char10, GXv_char11, GXv_char12) ;
         produc_bc.this.A396EmprCod = GXv_char4[0] ;
         produc_bc.this.A719PrdNum = GXv_char3[0] ;
         produc_bc.this.A718PrdNom = GXv_char2[0] ;
         produc_bc.this.AV11OldPrdTHELIST = GXv_char10[0] ;
         produc_bc.this.AV8Usurcod = GXv_char11[0] ;
         produc_bc.this.AV9Station = GXv_char12[0] ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_char10[0] = A13302PrdTHELIST ;
         new app.core.inscatsus(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10) ;
         produc_bc.this.A396EmprCod = GXv_char12[0] ;
         produc_bc.this.A719PrdNum = GXv_char11[0] ;
         produc_bc.this.A13302PrdTHELIST = GXv_char10[0] ;
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e131PJ2( )
   {
      /* 'DoSustancias' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         if ( GXutil.strcmp(A13302PrdTHELIST, AV11OldPrdTHELIST) != 0 )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_char11[0] = A719PrdNum ;
            GXv_char10[0] = A718PrdNom ;
            GXv_char9[0] = "" ;
            GXv_char4[0] = AV11OldPrdTHELIST ;
            GXv_char3[0] = AV8Usurcod ;
            GXv_char2[0] = AV9Station ;
            new app.pdltthelist(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_char4, GXv_char3, GXv_char2) ;
            produc_bc.this.A396EmprCod = GXv_char12[0] ;
            produc_bc.this.A719PrdNum = GXv_char11[0] ;
            produc_bc.this.A718PrdNom = GXv_char10[0] ;
            produc_bc.this.AV11OldPrdTHELIST = GXv_char4[0] ;
            produc_bc.this.AV8Usurcod = GXv_char3[0] ;
            produc_bc.this.AV9Station = GXv_char2[0] ;
         }
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_char10[0] = A13302PrdTHELIST ;
         new app.core.inscatsus(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10) ;
         produc_bc.this.A396EmprCod = GXv_char12[0] ;
         produc_bc.this.A719PrdNum = GXv_char11[0] ;
         produc_bc.this.A13302PrdTHELIST = GXv_char10[0] ;
         httpContext.popup(formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A13302PrdTHELIST))}, new String[] {"Mode","EmprCod","PrdNum","TheList"}) , new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm1PJ29( int GX_JID )
   {
      if ( ( GX_JID == 67 ) || ( GX_JID == 0 ) )
      {
         Z709PrdFecPre = A709PrdFecPre ;
         Z5590PrdSolub = A5590PrdSolub ;
         Z8897PrdPesTerm = A8897PrdPesTerm ;
         Z718PrdNom = A718PrdNom ;
         Z728PrdRefPrv = A728PrdRefPrv ;
         Z703PrdDscTec = A703PrdDscTec ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z727PrdRec = A727PrdRec ;
         Z682PrdCalNec = A682PrdCalNec ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z730PrdSit = A730PrdSit ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z696PrdConDia = A696PrdConDia ;
         Z731PrdStkMinD = A731PrdStkMinD ;
         Z732PrdStkMinU = A732PrdStkMinU ;
         Z699PrdDiaRot = A699PrdDiaRot ;
         Z722PrdPlaEnt = A722PrdPlaEnt ;
         Z716PrdLotMin = A716PrdLotMin ;
         Z721PrdNumUco = A721PrdNumUco ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z714PrdFulPed = A714PrdFulPed ;
         Z712PrdFulCC = A712PrdFulCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z740PrdUltECC = A740PrdUltECC ;
         Z738PrdUltCCC = A738PrdUltCCC ;
         Z739PrdUltDCC = A739PrdUltDCC ;
         Z700PrdDifCC = A700PrdDifCC ;
         Z695PrdConCC = A695PrdConCC ;
         Z750PrdValStk = A750PrdValStk ;
         Z332DifValStk = A332DifValStk ;
         Z708PrdFecEnt = A708PrdFecEnt ;
         Z1193PrdPosX = A1193PrdPosX ;
         Z1194PrdPosY = A1194PrdPosY ;
         Z1643PrdTip = A1643PrdTip ;
         Z1644PrdDqo = A1644PrdDqo ;
         Z3004PrdRev = A3004PrdRev ;
         Z3273PrdTnq = A3273PrdTnq ;
         Z4692PrdNom2 = A4692PrdNom2 ;
         Z4693PrdNum2 = A4693PrdNum2 ;
         Z4694PrdObs = A4694PrdObs ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z5416PrdDensS = A5416PrdDensS ;
         Z5417PrdConcS = A5417PrdConcS ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z6191PrdNumCent = A6191PrdNumCent ;
         Z7226PrdNumct1 = A7226PrdNumct1 ;
         Z7227PrdNumct2 = A7227PrdNumct2 ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z8659PrdExiAlmc = A8659PrdExiAlmc ;
         Z8936PrdSal = A8936PrdSal ;
         Z9731PrdInc = A9731PrdInc ;
         Z9732PrdComp = A9732PrdComp ;
         Z9733PrdAox = A9733PrdAox ;
         Z9734PrdNCAS = A9734PrdNCAS ;
         Z9739PrdFT = A9739PrdFT ;
         Z9740PrdFFT = A9740PrdFFT ;
         Z9741PrdHS = A9741PrdHS ;
         Z9742PrdFHS = A9742PrdFHS ;
         Z10119PrdColIdx = A10119PrdColIdx ;
         Z5888PrdOkotex = A5888PrdOkotex ;
         Z5887PrdReach = A5887PrdReach ;
         Z10881PrdLote = A10881PrdLote ;
         Z10935PrdRTM = A10935PrdRTM ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z11196PrdNroCAS = A11196PrdNroCAS ;
         Z11363PrdGots = A11363PrdGots ;
         Z11364PrdHm = A11364PrdHm ;
         Z11470PrdConct = A11470PrdConct ;
         Z11614PrdEINECS = A11614PrdEINECS ;
         Z11615PrdFuncion = A11615PrdFuncion ;
         Z11616PrdNmQu = A11616PrdNmQu ;
         Z11687PrdList = A11687PrdList ;
         Z12957PrdLoteOb = A12957PrdLoteOb ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z13301PrdZDHC = A13301PrdZDHC ;
         Z13302PrdTHELIST = A13302PrdTHELIST ;
         Z13457PrdUbicaci = A13457PrdUbicaci ;
         Z3936PrdEqLP = A3936PrdEqLP ;
         Z8896PrdPesCon = A8896PrdPesCon ;
         Z13968PrdCantAtM = A13968PrdCantAtM ;
         Z13970PrdMatSeca = A13970PrdMatSeca ;
         Z13971PrdLoteFch = A13971PrdLoteFch ;
         Z13972PrdFTdoc = A13972PrdFTdoc ;
         Z13973PrdFSdoc = A13973PrdFSdoc ;
         Z13974PrdGRS = A13974PrdGRS ;
         Z13969PrdGruFamI = A13969PrdGruFamI ;
         Z629MetCod = A629MetCod ;
         Z795PrvNum = A795PrvNum ;
         Z835TipDtoCod = A835TipDtoCod ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z743PrdUniCon = A743PrdUniCon ;
         Z856ValCod = A856ValCod ;
         Z6301TipPrdCod = A6301TipPrdCod ;
         Z9609SubFamCod = A9609SubFamCod ;
         Z12714PrdFabId = A12714PrdFabId ;
         Z13927AlmPrdID = A13927AlmPrdID ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 68 ) || ( GX_JID == 0 ) )
      {
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 69 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 70 ) || ( GX_JID == 0 ) )
      {
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 71 ) || ( GX_JID == 0 ) )
      {
         Z630MetDsc = A630MetDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 72 ) || ( GX_JID == 0 ) )
      {
         Z794PrvNom = A794PrvNom ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 73 ) || ( GX_JID == 0 ) )
      {
         Z837TipDtoDto = A837TipDtoDto ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 74 ) || ( GX_JID == 0 ) )
      {
         Z737PrdUcpDsc = A737PrdUcpDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 75 ) || ( GX_JID == 0 ) )
      {
         Z736PrdUcoDsc = A736PrdUcoDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 76 ) || ( GX_JID == 0 ) )
      {
         Z857ValDsc = A857ValDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 77 ) || ( GX_JID == 0 ) )
      {
         Z6302TipPrdDsc = A6302TipPrdDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 78 ) || ( GX_JID == 0 ) )
      {
         Z9610SubFamDsc = A9610SubFamDsc ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 79 ) || ( GX_JID == 0 ) )
      {
         Z12715PrdFabNm = A12715PrdFabNm ;
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( ( GX_JID == 80 ) || ( GX_JID == 0 ) )
      {
         Z13747PrdCDsc = A13747PrdCDsc ;
         Z13831PrdDisponi = A13831PrdDisponi ;
         Z13871PrdDiasIna = A13871PrdDiasIna ;
         Z13873PrdUltMovC = A13873PrdUltMovC ;
         Z13872PrdFecUltM = A13872PrdFecUltM ;
         Z13874PrdTipMovU = A13874PrdTipMovU ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z13876PrdLastFec = A13876PrdLastFec ;
         Z13877PrdLastTip = A13877PrdLastTip ;
         Z13881PrdEsCompu = A13881PrdEsCompu ;
         Z14006PrdDiaSinM = A14006PrdDiaSinM ;
      }
      if ( GX_JID == -67 )
      {
         Z8896PrdPesCon = A8896PrdPesCon ;
         Z13968PrdCantAtM = A13968PrdCantAtM ;
         Z13970PrdMatSeca = A13970PrdMatSeca ;
         Z13971PrdLoteFch = A13971PrdLoteFch ;
         Z13972PrdFTdoc = A13972PrdFTdoc ;
         Z13973PrdFSdoc = A13973PrdFSdoc ;
         Z13974PrdGRS = A13974PrdGRS ;
         Z396EmprCod = A396EmprCod ;
         Z13969PrdGruFamI = A13969PrdGruFamI ;
         Z629MetCod = A629MetCod ;
         Z795PrvNum = A795PrvNum ;
         Z835TipDtoCod = A835TipDtoCod ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z743PrdUniCon = A743PrdUniCon ;
         Z856ValCod = A856ValCod ;
         Z6301TipPrdCod = A6301TipPrdCod ;
         Z9609SubFamCod = A9609SubFamCod ;
         Z12714PrdFabId = A12714PrdFabId ;
         Z13927AlmPrdID = A13927AlmPrdID ;
         Z719PrdNum = A719PrdNum ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z5590PrdSolub = A5590PrdSolub ;
         Z8897PrdPesTerm = A8897PrdPesTerm ;
         Z718PrdNom = A718PrdNom ;
         Z728PrdRefPrv = A728PrdRefPrv ;
         Z703PrdDscTec = A703PrdDscTec ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z727PrdRec = A727PrdRec ;
         Z682PrdCalNec = A682PrdCalNec ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z730PrdSit = A730PrdSit ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z696PrdConDia = A696PrdConDia ;
         Z731PrdStkMinD = A731PrdStkMinD ;
         Z732PrdStkMinU = A732PrdStkMinU ;
         Z699PrdDiaRot = A699PrdDiaRot ;
         Z722PrdPlaEnt = A722PrdPlaEnt ;
         Z716PrdLotMin = A716PrdLotMin ;
         Z721PrdNumUco = A721PrdNumUco ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z714PrdFulPed = A714PrdFulPed ;
         Z712PrdFulCC = A712PrdFulCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z740PrdUltECC = A740PrdUltECC ;
         Z738PrdUltCCC = A738PrdUltCCC ;
         Z739PrdUltDCC = A739PrdUltDCC ;
         Z700PrdDifCC = A700PrdDifCC ;
         Z695PrdConCC = A695PrdConCC ;
         Z750PrdValStk = A750PrdValStk ;
         Z332DifValStk = A332DifValStk ;
         Z708PrdFecEnt = A708PrdFecEnt ;
         Z1193PrdPosX = A1193PrdPosX ;
         Z1194PrdPosY = A1194PrdPosY ;
         Z1643PrdTip = A1643PrdTip ;
         Z1644PrdDqo = A1644PrdDqo ;
         Z3004PrdRev = A3004PrdRev ;
         Z3273PrdTnq = A3273PrdTnq ;
         Z4692PrdNom2 = A4692PrdNom2 ;
         Z4693PrdNum2 = A4693PrdNum2 ;
         Z4694PrdObs = A4694PrdObs ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z5416PrdDensS = A5416PrdDensS ;
         Z5417PrdConcS = A5417PrdConcS ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z6191PrdNumCent = A6191PrdNumCent ;
         Z7226PrdNumct1 = A7226PrdNumct1 ;
         Z7227PrdNumct2 = A7227PrdNumct2 ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z8659PrdExiAlmc = A8659PrdExiAlmc ;
         Z8936PrdSal = A8936PrdSal ;
         Z9731PrdInc = A9731PrdInc ;
         Z9732PrdComp = A9732PrdComp ;
         Z9733PrdAox = A9733PrdAox ;
         Z9734PrdNCAS = A9734PrdNCAS ;
         Z9739PrdFT = A9739PrdFT ;
         Z9740PrdFFT = A9740PrdFFT ;
         Z9741PrdHS = A9741PrdHS ;
         Z9742PrdFHS = A9742PrdFHS ;
         Z10119PrdColIdx = A10119PrdColIdx ;
         Z5888PrdOkotex = A5888PrdOkotex ;
         Z5887PrdReach = A5887PrdReach ;
         Z10881PrdLote = A10881PrdLote ;
         Z10935PrdRTM = A10935PrdRTM ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z11196PrdNroCAS = A11196PrdNroCAS ;
         Z11363PrdGots = A11363PrdGots ;
         Z11364PrdHm = A11364PrdHm ;
         Z11470PrdConct = A11470PrdConct ;
         Z11614PrdEINECS = A11614PrdEINECS ;
         Z11615PrdFuncion = A11615PrdFuncion ;
         Z11616PrdNmQu = A11616PrdNmQu ;
         Z11687PrdList = A11687PrdList ;
         Z12957PrdLoteOb = A12957PrdLoteOb ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z13301PrdZDHC = A13301PrdZDHC ;
         Z13302PrdTHELIST = A13302PrdTHELIST ;
         Z13457PrdUbicaci = A13457PrdUbicaci ;
         Z3936PrdEqLP = A3936PrdEqLP ;
         Z407EmprNom = A407EmprNom ;
         Z13875PrdLastLin = A13875PrdLastLin ;
         Z794PrvNom = A794PrvNom ;
         Z737PrdUcpDsc = A737PrdUcpDsc ;
         Z736PrdUcoDsc = A736PrdUcoDsc ;
         Z857ValDsc = A857ValDsc ;
         Z837TipDtoDto = A837TipDtoDto ;
         Z630MetDsc = A630MetDsc ;
         Z6302TipPrdDsc = A6302TipPrdDsc ;
         Z9610SubFamDsc = A9610SubFamDsc ;
         Z12715PrdFabNm = A12715PrdFabNm ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor BC01PJ19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13875PrdLastLin = BC01PJ19_A13875PrdLastLin[0] ;
         n13875PrdLastLin = BC01PJ19_n13875PrdLastLin[0] ;
      }
      else
      {
         A13875PrdLastLin = 0 ;
         n13875PrdLastLin = false ;
      }
      pr_default.close(15);
      AV82Pgmname = "StocksQuimicos.PRODUC_BC" ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01PJ20 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01PJ20_A407EmprNom[0] ;
      n407EmprNom = BC01PJ20_n407EmprNom[0] ;
      pr_default.close(16);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         A709PrdFecPre = GXutil.today( ) ;
      }
      if ( isIns( )  )
      {
         A5590PrdSolub = DecimalUtil.doubleToDec(10) ;
      }
      if ( isIns( )  && (0==A742PrdUniCom) && ( Gx_BScreen == 0 ) )
      {
         A742PrdUniCom = (byte)(1) ;
      }
      if ( isIns( )  && (0==A743PrdUniCon) && ( Gx_BScreen == 0 ) )
      {
         A743PrdUniCon = (byte)(1) ;
      }
      if ( isIns( )  && (0==A856ValCod) && ( Gx_BScreen == 0 ) )
      {
         A856ValCod = (byte)(1) ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A707PrdFacCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A707PrdFacCon = DecimalUtil.doubleToDec(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A698PrdDetPar)==0) && ( Gx_BScreen == 0 ) )
      {
         A698PrdDetPar = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A682PrdCalNec)==0) && ( Gx_BScreen == 0 ) )
      {
         A682PrdCalNec = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A727PrdRec)==0) && ( Gx_BScreen == 0 ) )
      {
         A727PrdRec = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A696PrdConDia)==0) && ( Gx_BScreen == 0 ) )
      {
         A696PrdConDia = DecimalUtil.doubleToDec(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A1643PrdTip)==0) && ( Gx_BScreen == 0 ) )
      {
         A1643PrdTip = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3004PrdRev)==0) && ( Gx_BScreen == 0 ) )
      {
         A3004PrdRev = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (0==A4338PrdUMeFo) && ( Gx_BScreen == 0 ) )
      {
         A4338PrdUMeFo = (byte)(1) ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A5418PrdSalM)==0) && ( Gx_BScreen == 0 ) )
      {
         A5418PrdSalM = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A9739PrdFT)==0) && ( Gx_BScreen == 0 ) )
      {
         A9739PrdFT = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A9741PrdHS)==0) && ( Gx_BScreen == 0 ) )
      {
         A9741PrdHS = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A5887PrdReach)==0) && ( Gx_BScreen == 0 ) )
      {
         A5887PrdReach = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A5888PrdOkotex)==0) && ( Gx_BScreen == 0 ) )
      {
         A5888PrdOkotex = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A11363PrdGots)==0) && ( Gx_BScreen == 0 ) )
      {
         A11363PrdGots = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A11364PrdHm)==0) && ( Gx_BScreen == 0 ) )
      {
         A11364PrdHm = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A11687PrdList)==0) && ( Gx_BScreen == 0 ) )
      {
         A11687PrdList = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A12957PrdLoteOb)==0) && ( Gx_BScreen == 0 ) )
      {
         A12957PrdLoteOb = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13301PrdZDHC)==0) && ( Gx_BScreen == 0 ) )
      {
         A13301PrdZDHC = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A3936PrdEqLP)==0) && ( Gx_BScreen == 0 ) )
      {
         A3936PrdEqLP = " " ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A13974PrdGRS)==0) && ( Gx_BScreen == 0 ) )
      {
         A13974PrdGRS = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n13974PrdGRS = false ;
      }
      if ( isIns( )  && (0==A8896PrdPesCon) && ( Gx_BScreen == 0 ) )
      {
         A8896PrdPesCon = (byte)(1) ;
      }
      if ( isIns( )  && (0==A13968PrdCantAtM) && ( Gx_BScreen == 0 ) )
      {
         A13968PrdCantAtM = (short)(0) ;
         n13968PrdCantAtM = false ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( A8896PrdPesCon == 0 )
         {
            A8897PrdPesTerm = httpContext.getMessage( httpContext.getMessage( "NOCONTROL", ""), "") ;
         }
         /* Using cursor BC01PJ21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
         A737PrdUcpDsc = BC01PJ21_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = BC01PJ21_n737PrdUcpDsc[0] ;
         pr_default.close(17);
         /* Using cursor BC01PJ22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
         A736PrdUcoDsc = BC01PJ22_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = BC01PJ22_n736PrdUcoDsc[0] ;
         pr_default.close(18);
         /* Using cursor BC01PJ23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
         A857ValDsc = BC01PJ23_A857ValDsc[0] ;
         n857ValDsc = BC01PJ23_n857ValDsc[0] ;
         pr_default.close(19);
      }
   }

   public void load1PJ29( )
   {
      /* Using cursor BC01PJ25 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A8896PrdPesCon = BC01PJ25_A8896PrdPesCon[0] ;
         A13968PrdCantAtM = BC01PJ25_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = BC01PJ25_n13968PrdCantAtM[0] ;
         A13970PrdMatSeca = BC01PJ25_A13970PrdMatSeca[0] ;
         n13970PrdMatSeca = BC01PJ25_n13970PrdMatSeca[0] ;
         A13971PrdLoteFch = BC01PJ25_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = BC01PJ25_n13971PrdLoteFch[0] ;
         A13972PrdFTdoc = BC01PJ25_A13972PrdFTdoc[0] ;
         n13972PrdFTdoc = BC01PJ25_n13972PrdFTdoc[0] ;
         A13973PrdFSdoc = BC01PJ25_A13973PrdFSdoc[0] ;
         n13973PrdFSdoc = BC01PJ25_n13973PrdFSdoc[0] ;
         A13974PrdGRS = BC01PJ25_A13974PrdGRS[0] ;
         n13974PrdGRS = BC01PJ25_n13974PrdGRS[0] ;
         A13969PrdGruFamI = BC01PJ25_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = BC01PJ25_n13969PrdGruFamI[0] ;
         A629MetCod = BC01PJ25_A629MetCod[0] ;
         n629MetCod = BC01PJ25_n629MetCod[0] ;
         A795PrvNum = BC01PJ25_A795PrvNum[0] ;
         A835TipDtoCod = BC01PJ25_A835TipDtoCod[0] ;
         n835TipDtoCod = BC01PJ25_n835TipDtoCod[0] ;
         A742PrdUniCom = BC01PJ25_A742PrdUniCom[0] ;
         A743PrdUniCon = BC01PJ25_A743PrdUniCon[0] ;
         A856ValCod = BC01PJ25_A856ValCod[0] ;
         A6301TipPrdCod = BC01PJ25_A6301TipPrdCod[0] ;
         n6301TipPrdCod = BC01PJ25_n6301TipPrdCod[0] ;
         A9609SubFamCod = BC01PJ25_A9609SubFamCod[0] ;
         n9609SubFamCod = BC01PJ25_n9609SubFamCod[0] ;
         A12714PrdFabId = BC01PJ25_A12714PrdFabId[0] ;
         n12714PrdFabId = BC01PJ25_n12714PrdFabId[0] ;
         A13927AlmPrdID = BC01PJ25_A13927AlmPrdID[0] ;
         n13927AlmPrdID = BC01PJ25_n13927AlmPrdID[0] ;
         A13875PrdLastLin = BC01PJ25_A13875PrdLastLin[0] ;
         n13875PrdLastLin = BC01PJ25_n13875PrdLastLin[0] ;
         A709PrdFecPre = BC01PJ25_A709PrdFecPre[0] ;
         A5590PrdSolub = BC01PJ25_A5590PrdSolub[0] ;
         A8897PrdPesTerm = BC01PJ25_A8897PrdPesTerm[0] ;
         A407EmprNom = BC01PJ25_A407EmprNom[0] ;
         n407EmprNom = BC01PJ25_n407EmprNom[0] ;
         A718PrdNom = BC01PJ25_A718PrdNom[0] ;
         A794PrvNom = BC01PJ25_A794PrvNom[0] ;
         n794PrvNom = BC01PJ25_n794PrvNom[0] ;
         A728PrdRefPrv = BC01PJ25_A728PrdRefPrv[0] ;
         A703PrdDscTec = BC01PJ25_A703PrdDscTec[0] ;
         A737PrdUcpDsc = BC01PJ25_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = BC01PJ25_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = BC01PJ25_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = BC01PJ25_n736PrdUcoDsc[0] ;
         A707PrdFacCon = BC01PJ25_A707PrdFacCon[0] ;
         A857ValDsc = BC01PJ25_A857ValDsc[0] ;
         n857ValDsc = BC01PJ25_n857ValDsc[0] ;
         A727PrdRec = BC01PJ25_A727PrdRec[0] ;
         A682PrdCalNec = BC01PJ25_A682PrdCalNec[0] ;
         A698PrdDetPar = BC01PJ25_A698PrdDetPar[0] ;
         A730PrdSit = BC01PJ25_A730PrdSit[0] ;
         A729PrdRotRea = BC01PJ25_A729PrdRotRea[0] ;
         A837TipDtoDto = BC01PJ25_A837TipDtoDto[0] ;
         n837TipDtoDto = BC01PJ25_n837TipDtoDto[0] ;
         A724PrdPreAct = BC01PJ25_A724PrdPreAct[0] ;
         A725PrdPreAnt = BC01PJ25_A725PrdPreAnt[0] ;
         A726PrdPreMed = BC01PJ25_A726PrdPreMed[0] ;
         A696PrdConDia = BC01PJ25_A696PrdConDia[0] ;
         A731PrdStkMinD = BC01PJ25_A731PrdStkMinD[0] ;
         A732PrdStkMinU = BC01PJ25_A732PrdStkMinU[0] ;
         A699PrdDiaRot = BC01PJ25_A699PrdDiaRot[0] ;
         A722PrdPlaEnt = BC01PJ25_A722PrdPlaEnt[0] ;
         A630MetDsc = BC01PJ25_A630MetDsc[0] ;
         n630MetDsc = BC01PJ25_n630MetDsc[0] ;
         A716PrdLotMin = BC01PJ25_A716PrdLotMin[0] ;
         A721PrdNumUco = BC01PJ25_A721PrdNumUco[0] ;
         A704PrdExiAlm = BC01PJ25_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01PJ25_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01PJ25_A685PrdCanRes[0] ;
         A684PrdCanPen = BC01PJ25_A684PrdCanPen[0] ;
         A713PrdFulEnt = BC01PJ25_A713PrdFulEnt[0] ;
         A714PrdFulPed = BC01PJ25_A714PrdFulPed[0] ;
         A712PrdFulCC = BC01PJ25_A712PrdFulCC[0] ;
         A706PrdExiCCP = BC01PJ25_A706PrdExiCCP[0] ;
         A740PrdUltECC = BC01PJ25_A740PrdUltECC[0] ;
         A738PrdUltCCC = BC01PJ25_A738PrdUltCCC[0] ;
         A739PrdUltDCC = BC01PJ25_A739PrdUltDCC[0] ;
         A700PrdDifCC = BC01PJ25_A700PrdDifCC[0] ;
         A695PrdConCC = BC01PJ25_A695PrdConCC[0] ;
         A750PrdValStk = BC01PJ25_A750PrdValStk[0] ;
         A332DifValStk = BC01PJ25_A332DifValStk[0] ;
         A708PrdFecEnt = BC01PJ25_A708PrdFecEnt[0] ;
         A1193PrdPosX = BC01PJ25_A1193PrdPosX[0] ;
         A1194PrdPosY = BC01PJ25_A1194PrdPosY[0] ;
         A1643PrdTip = BC01PJ25_A1643PrdTip[0] ;
         A1644PrdDqo = BC01PJ25_A1644PrdDqo[0] ;
         A3004PrdRev = BC01PJ25_A3004PrdRev[0] ;
         A3273PrdTnq = BC01PJ25_A3273PrdTnq[0] ;
         A4692PrdNom2 = BC01PJ25_A4692PrdNom2[0] ;
         A4693PrdNum2 = BC01PJ25_A4693PrdNum2[0] ;
         A4694PrdObs = BC01PJ25_A4694PrdObs[0] ;
         A4338PrdUMeFo = BC01PJ25_A4338PrdUMeFo[0] ;
         A5255PrdPreAc2 = BC01PJ25_A5255PrdPreAc2[0] ;
         A5416PrdDensS = BC01PJ25_A5416PrdDensS[0] ;
         A5417PrdConcS = BC01PJ25_A5417PrdConcS[0] ;
         A5418PrdSalM = BC01PJ25_A5418PrdSalM[0] ;
         A6302TipPrdDsc = BC01PJ25_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = BC01PJ25_n6302TipPrdDsc[0] ;
         A6191PrdNumCent = BC01PJ25_A6191PrdNumCent[0] ;
         A7226PrdNumct1 = BC01PJ25_A7226PrdNumct1[0] ;
         A7227PrdNumct2 = BC01PJ25_A7227PrdNumct2[0] ;
         A7260PrdHorMad = BC01PJ25_A7260PrdHorMad[0] ;
         A8659PrdExiAlmc = BC01PJ25_A8659PrdExiAlmc[0] ;
         A8936PrdSal = BC01PJ25_A8936PrdSal[0] ;
         A9610SubFamDsc = BC01PJ25_A9610SubFamDsc[0] ;
         n9610SubFamDsc = BC01PJ25_n9610SubFamDsc[0] ;
         A9731PrdInc = BC01PJ25_A9731PrdInc[0] ;
         A9732PrdComp = BC01PJ25_A9732PrdComp[0] ;
         A9733PrdAox = BC01PJ25_A9733PrdAox[0] ;
         A9734PrdNCAS = BC01PJ25_A9734PrdNCAS[0] ;
         A9739PrdFT = BC01PJ25_A9739PrdFT[0] ;
         A9740PrdFFT = BC01PJ25_A9740PrdFFT[0] ;
         A9741PrdHS = BC01PJ25_A9741PrdHS[0] ;
         A9742PrdFHS = BC01PJ25_A9742PrdFHS[0] ;
         A10119PrdColIdx = BC01PJ25_A10119PrdColIdx[0] ;
         A5888PrdOkotex = BC01PJ25_A5888PrdOkotex[0] ;
         A5887PrdReach = BC01PJ25_A5887PrdReach[0] ;
         A10881PrdLote = BC01PJ25_A10881PrdLote[0] ;
         A10935PrdRTM = BC01PJ25_A10935PrdRTM[0] ;
         A10936PrdCtw1 = BC01PJ25_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = BC01PJ25_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = BC01PJ25_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = BC01PJ25_A11663PrdCtw4[0] ;
         A11196PrdNroCAS = BC01PJ25_A11196PrdNroCAS[0] ;
         A11363PrdGots = BC01PJ25_A11363PrdGots[0] ;
         A11364PrdHm = BC01PJ25_A11364PrdHm[0] ;
         A11470PrdConct = BC01PJ25_A11470PrdConct[0] ;
         A11614PrdEINECS = BC01PJ25_A11614PrdEINECS[0] ;
         A11615PrdFuncion = BC01PJ25_A11615PrdFuncion[0] ;
         A11616PrdNmQu = BC01PJ25_A11616PrdNmQu[0] ;
         A11687PrdList = BC01PJ25_A11687PrdList[0] ;
         A12715PrdFabNm = BC01PJ25_A12715PrdFabNm[0] ;
         n12715PrdFabNm = BC01PJ25_n12715PrdFabNm[0] ;
         A12957PrdLoteOb = BC01PJ25_A12957PrdLoteOb[0] ;
         A13232PrdRGB = BC01PJ25_A13232PrdRGB[0] ;
         A13301PrdZDHC = BC01PJ25_A13301PrdZDHC[0] ;
         A13302PrdTHELIST = BC01PJ25_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = BC01PJ25_n13302PrdTHELIST[0] ;
         A13457PrdUbicaci = BC01PJ25_A13457PrdUbicaci[0] ;
         A3936PrdEqLP = BC01PJ25_A3936PrdEqLP[0] ;
         zm1PJ29( -67) ;
      }
      pr_default.close(20);
      onLoadActions1PJ29( ) ;
   }

   public void onLoadActions1PJ29( )
   {
      GXt_int13 = A14006PrdDiaSinM ;
      GXv_int14[0] = GXt_int13 ;
      new app.pget_diasprodsinmovimiento(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_int14) ;
      produc_bc.this.GXt_int13 = GXv_int14[0] ;
      A14006PrdDiaSinM = GXt_int13 ;
      GXt_int15 = A13873PrdUltMovC ;
      GXv_int16[0] = GXt_int15 ;
      new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int16) ;
      produc_bc.this.GXt_int15 = GXv_int16[0] ;
      A13873PrdUltMovC = GXt_int15 ;
      GXt_date17 = A13872PrdFecUltM ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A719PrdNum ;
      GXv_date18[0] = GXt_date17 ;
      new app.core.ultimafechamovcc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_date18) ;
      produc_bc.this.A396EmprCod = GXv_char12[0] ;
      produc_bc.this.A719PrdNum = GXv_char11[0] ;
      produc_bc.this.GXt_date17 = GXv_date18[0] ;
      A13872PrdFecUltM = GXt_date17 ;
      GXt_int13 = A13871PrdDiasIna ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A719PrdNum ;
      GXv_int14[0] = GXt_int13 ;
      new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int14) ;
      produc_bc.this.A396EmprCod = GXv_char12[0] ;
      produc_bc.this.A719PrdNum = GXv_char11[0] ;
      produc_bc.this.GXt_int13 = GXv_int14[0] ;
      A13871PrdDiasIna = GXt_int13 ;
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         A13881PrdEsCompu = true ;
      }
      else
      {
         A13881PrdEsCompu = false ;
      }
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      A13874PrdTipMovU = getPrdTipMovU0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      AV7Prdpreact = O724PrdPreAct ;
      AV10oldPrdStkMinU = O732PrdStkMinU ;
      if ( DecimalUtil.compareTo(A724PrdPreAct, AV7Prdpreact) != 0 )
      {
         AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Precio Producto, Precio Old =", ""), "") + GXutil.str( AV7Prdpreact, 14, 5) + httpContext.getMessage( httpContext.getMessage( " New Precio = ", ""), "") + GXutil.str( A724PrdPreAct, 14, 5) ;
      }
      else
      {
         if ( GXutil.strcmp(A718PrdNom, O718PrdNom) != 0 )
         {
            AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Nombre Producto, Nombre Old =", ""), "") + O718PrdNom + httpContext.getMessage( httpContext.getMessage( " Nombre New = ", ""), "") + A718PrdNom ;
         }
         else
         {
            if ( DecimalUtil.compareTo(A732PrdStkMinU, O732PrdStkMinU) != 0 )
            {
               AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Stock Seguridad,Stock Old =", ""), "") + GXutil.str( AV10oldPrdStkMinU, 8, 2) + httpContext.getMessage( httpContext.getMessage( " Stock New = ", ""), "") + GXutil.str( A732PrdStkMinU, 8, 2) ;
            }
            else
            {
               if ( GXutil.strcmp(A10881PrdLote, O10881PrdLote) != 0 )
               {
                  AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Lote Actual, Anterior =", ""), "") + O10881PrdLote + httpContext.getMessage( httpContext.getMessage( " Nuevo = ", ""), "") + A10881PrdLote ;
               }
            }
         }
      }
      A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
      AV11OldPrdTHELIST = O13302PrdTHELIST ;
      if ( A8896PrdPesCon == 0 )
      {
         A8897PrdPesTerm = httpContext.getMessage( httpContext.getMessage( "NOCONTROL", ""), "") ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5255PrdPreAc2)==0) && ( Gx_BScreen == 0 ) )
      {
         A5255PrdPreAc2 = A724PrdPreAct ;
      }
   }

   public void checkExtendedTable1PJ29( )
   {
      nIsDirty_29 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01PJ26 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n13969PrdGruFamI), Byte.valueOf(A13969PrdGruFamI)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13969PrdGruFamI) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Familia Productos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDGRUFAMI");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(21);
      /* Using cursor BC01PJ27 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
         }
      }
      A630MetDsc = BC01PJ27_A630MetDsc[0] ;
      n630MetDsc = BC01PJ27_n630MetDsc[0] ;
      pr_default.close(22);
      /* Using cursor BC01PJ28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = BC01PJ28_A794PrvNom[0] ;
      n794PrvNom = BC01PJ28_n794PrvNom[0] ;
      pr_default.close(23);
      /* Using cursor BC01PJ29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
         }
      }
      A837TipDtoDto = BC01PJ29_A837TipDtoDto[0] ;
      n837TipDtoDto = BC01PJ29_n837TipDtoDto[0] ;
      pr_default.close(24);
      /* Using cursor BC01PJ30 */
      pr_default.execute(25, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
      }
      A737PrdUcpDsc = BC01PJ30_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = BC01PJ30_n737PrdUcpDsc[0] ;
      pr_default.close(25);
      /* Using cursor BC01PJ31 */
      pr_default.execute(26, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
      }
      A736PrdUcoDsc = BC01PJ31_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = BC01PJ31_n736PrdUcoDsc[0] ;
      pr_default.close(26);
      /* Using cursor BC01PJ32 */
      pr_default.execute(27, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
      }
      A857ValDsc = BC01PJ32_A857ValDsc[0] ;
      n857ValDsc = BC01PJ32_n857ValDsc[0] ;
      pr_default.close(27);
      /* Using cursor BC01PJ33 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6301TipPrdCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPPRDCOD");
            AnyError = (short)(1) ;
         }
      }
      A6302TipPrdDsc = BC01PJ33_A6302TipPrdDsc[0] ;
      n6302TipPrdDsc = BC01PJ33_n6302TipPrdDsc[0] ;
      pr_default.close(28);
      /* Using cursor BC01PJ34 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9609SubFamCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUBFSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SUBFAMCOD");
            AnyError = (short)(1) ;
         }
      }
      A9610SubFamDsc = BC01PJ34_A9610SubFamDsc[0] ;
      n9610SubFamDsc = BC01PJ34_n9610SubFamDsc[0] ;
      pr_default.close(29);
      /* Using cursor BC01PJ35 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n12714PrdFabId), Integer.valueOf(A12714PrdFabId)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12714PrdFabId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Fabricantes Productos Quimicos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDFABID");
            AnyError = (short)(1) ;
         }
      }
      A12715PrdFabNm = BC01PJ35_A12715PrdFabNm[0] ;
      n12715PrdFabNm = BC01PJ35_n12715PrdFabNm[0] ;
      pr_default.close(30);
      /* Using cursor BC01PJ36 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n13927AlmPrdID), Short.valueOf(A13927AlmPrdID)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13927AlmPrdID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacenes en productos", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALMPRDID");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(31);
      nIsDirty_29 = (short)(1) ;
      GXt_int13 = A14006PrdDiaSinM ;
      GXv_int14[0] = GXt_int13 ;
      new app.pget_diasprodsinmovimiento(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_int14) ;
      produc_bc.this.GXt_int13 = GXv_int14[0] ;
      A14006PrdDiaSinM = GXt_int13 ;
      nIsDirty_29 = (short)(1) ;
      GXt_int15 = A13873PrdUltMovC ;
      GXv_int16[0] = GXt_int15 ;
      new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int16) ;
      produc_bc.this.GXt_int15 = GXv_int16[0] ;
      A13873PrdUltMovC = GXt_int15 ;
      nIsDirty_29 = (short)(1) ;
      GXt_date17 = A13872PrdFecUltM ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A719PrdNum ;
      GXv_date18[0] = GXt_date17 ;
      new app.core.ultimafechamovcc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_date18) ;
      produc_bc.this.A396EmprCod = GXv_char12[0] ;
      produc_bc.this.A719PrdNum = GXv_char11[0] ;
      produc_bc.this.GXt_date17 = GXv_date18[0] ;
      A13872PrdFecUltM = GXt_date17 ;
      nIsDirty_29 = (short)(1) ;
      GXt_int13 = A13871PrdDiasIna ;
      GXv_char12[0] = A396EmprCod ;
      GXv_char11[0] = A719PrdNum ;
      GXv_int14[0] = GXt_int13 ;
      new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int14) ;
      produc_bc.this.A396EmprCod = GXv_char12[0] ;
      produc_bc.this.A719PrdNum = GXv_char11[0] ;
      produc_bc.this.GXt_int13 = GXv_int14[0] ;
      A13871PrdDiasIna = GXt_int13 ;
      if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
      {
         nIsDirty_29 = (short)(1) ;
         A13881PrdEsCompu = true ;
      }
      else
      {
         nIsDirty_29 = (short)(1) ;
         A13881PrdEsCompu = false ;
      }
      nIsDirty_29 = (short)(1) ;
      A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
      nIsDirty_29 = (short)(1) ;
      A13874PrdTipMovU = getPrdTipMovU0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      nIsDirty_29 = (short)(1) ;
      A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      nIsDirty_29 = (short)(1) ;
      A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
      if ( (0==A795PrvNum) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Proveedor es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A742PrdUniCom) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidad de Compra es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A743PrdUniCon) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidad de Consumo es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A707PrdFacCon)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factor de Conversion es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A856ValCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Validez es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A727PrdRec, "S") == 0 ) || ( GXutil.strcmp(A727PrdRec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control en Recuento", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A682PrdCalNec, "S") == 0 ) || ( GXutil.strcmp(A682PrdCalNec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Calculo Necesidades", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A698PrdDetPar, "S") == 0 ) || ( GXutil.strcmp(A698PrdDetPar, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Detalle Partidas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV7Prdpreact = O724PrdPreAct ;
      AV10oldPrdStkMinU = O732PrdStkMinU ;
      if ( DecimalUtil.compareTo(A724PrdPreAct, AV7Prdpreact) != 0 )
      {
         AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Precio Producto, Precio Old =", ""), "") + GXutil.str( AV7Prdpreact, 14, 5) + httpContext.getMessage( httpContext.getMessage( " New Precio = ", ""), "") + GXutil.str( A724PrdPreAct, 14, 5) ;
      }
      else
      {
         if ( GXutil.strcmp(A718PrdNom, O718PrdNom) != 0 )
         {
            AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Nombre Producto, Nombre Old =", ""), "") + O718PrdNom + httpContext.getMessage( httpContext.getMessage( " Nombre New = ", ""), "") + A718PrdNom ;
         }
         else
         {
            if ( DecimalUtil.compareTo(A732PrdStkMinU, O732PrdStkMinU) != 0 )
            {
               AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Stock Seguridad,Stock Old =", ""), "") + GXutil.str( AV10oldPrdStkMinU, 8, 2) + httpContext.getMessage( httpContext.getMessage( " Stock New = ", ""), "") + GXutil.str( A732PrdStkMinU, 8, 2) ;
            }
            else
            {
               if ( GXutil.strcmp(A10881PrdLote, O10881PrdLote) != 0 )
               {
                  AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Lote Actual, Anterior =", ""), "") + O10881PrdLote + httpContext.getMessage( httpContext.getMessage( " Nuevo = ", ""), "") + A10881PrdLote ;
               }
            }
         }
      }
      nIsDirty_29 = (short)(1) ;
      A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
      if ( ! ( ( GXutil.strcmp(A1643PrdTip, "A") == 0 ) || ( GXutil.strcmp(A1643PrdTip, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( ( GXutil.strcmp(A3004PrdRev, "S") == 0 ) || ( GXutil.strcmp(A3004PrdRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      AV11OldPrdTHELIST = O13302PrdTHELIST ;
      if ( ( AV45sustancias == 1 ) && isUpd( )  && ( GXutil.strcmp(A13302PrdTHELIST, AV11OldPrdTHELIST) != 0 ) )
      {
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_char10[0] = A718PrdNom ;
         GXv_char9[0] = A13302PrdTHELIST ;
         GXv_char4[0] = AV11OldPrdTHELIST ;
         GXv_char3[0] = AV8Usurcod ;
         GXv_char2[0] = AV9Station ;
         new app.pdltthelist(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_char4, GXv_char3, GXv_char2) ;
         produc_bc.this.A396EmprCod = GXv_char12[0] ;
         produc_bc.this.A719PrdNum = GXv_char11[0] ;
         produc_bc.this.A718PrdNom = GXv_char10[0] ;
         produc_bc.this.A13302PrdTHELIST = GXv_char9[0] ;
         produc_bc.this.AV11OldPrdTHELIST = GXv_char4[0] ;
         produc_bc.this.AV8Usurcod = GXv_char3[0] ;
         produc_bc.this.AV9Station = GXv_char2[0] ;
      }
      if ( A8896PrdPesCon == 0 )
      {
         nIsDirty_29 = (short)(1) ;
         A8897PrdPesTerm = httpContext.getMessage( httpContext.getMessage( "NOCONTROL", ""), "") ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5255PrdPreAc2)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_29 = (short)(1) ;
         A5255PrdPreAc2 = A724PrdPreAct ;
      }
   }

   public void closeExtendedTableCursors1PJ29( )
   {
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(23);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
      pr_default.close(27);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(31);
   }

   public void enableDisable( )
   {
   }

   public void getKey1PJ29( )
   {
      /* Using cursor BC01PJ37 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(32);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01PJ38 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(33) != 101) && ( GXutil.strcmp(BC01PJ38_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PJ29( 67) ;
         RcdFound29 = (short)(1) ;
         A8896PrdPesCon = BC01PJ38_A8896PrdPesCon[0] ;
         A13968PrdCantAtM = BC01PJ38_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = BC01PJ38_n13968PrdCantAtM[0] ;
         A13970PrdMatSeca = BC01PJ38_A13970PrdMatSeca[0] ;
         n13970PrdMatSeca = BC01PJ38_n13970PrdMatSeca[0] ;
         A13971PrdLoteFch = BC01PJ38_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = BC01PJ38_n13971PrdLoteFch[0] ;
         A13972PrdFTdoc = BC01PJ38_A13972PrdFTdoc[0] ;
         n13972PrdFTdoc = BC01PJ38_n13972PrdFTdoc[0] ;
         A13973PrdFSdoc = BC01PJ38_A13973PrdFSdoc[0] ;
         n13973PrdFSdoc = BC01PJ38_n13973PrdFSdoc[0] ;
         A13974PrdGRS = BC01PJ38_A13974PrdGRS[0] ;
         n13974PrdGRS = BC01PJ38_n13974PrdGRS[0] ;
         A13969PrdGruFamI = BC01PJ38_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = BC01PJ38_n13969PrdGruFamI[0] ;
         A629MetCod = BC01PJ38_A629MetCod[0] ;
         n629MetCod = BC01PJ38_n629MetCod[0] ;
         A795PrvNum = BC01PJ38_A795PrvNum[0] ;
         A835TipDtoCod = BC01PJ38_A835TipDtoCod[0] ;
         n835TipDtoCod = BC01PJ38_n835TipDtoCod[0] ;
         A742PrdUniCom = BC01PJ38_A742PrdUniCom[0] ;
         A743PrdUniCon = BC01PJ38_A743PrdUniCon[0] ;
         A856ValCod = BC01PJ38_A856ValCod[0] ;
         A6301TipPrdCod = BC01PJ38_A6301TipPrdCod[0] ;
         n6301TipPrdCod = BC01PJ38_n6301TipPrdCod[0] ;
         A9609SubFamCod = BC01PJ38_A9609SubFamCod[0] ;
         n9609SubFamCod = BC01PJ38_n9609SubFamCod[0] ;
         A12714PrdFabId = BC01PJ38_A12714PrdFabId[0] ;
         n12714PrdFabId = BC01PJ38_n12714PrdFabId[0] ;
         A13927AlmPrdID = BC01PJ38_A13927AlmPrdID[0] ;
         n13927AlmPrdID = BC01PJ38_n13927AlmPrdID[0] ;
         A719PrdNum = BC01PJ38_A719PrdNum[0] ;
         n719PrdNum = BC01PJ38_n719PrdNum[0] ;
         A709PrdFecPre = BC01PJ38_A709PrdFecPre[0] ;
         A5590PrdSolub = BC01PJ38_A5590PrdSolub[0] ;
         A8897PrdPesTerm = BC01PJ38_A8897PrdPesTerm[0] ;
         A718PrdNom = BC01PJ38_A718PrdNom[0] ;
         A728PrdRefPrv = BC01PJ38_A728PrdRefPrv[0] ;
         A703PrdDscTec = BC01PJ38_A703PrdDscTec[0] ;
         A707PrdFacCon = BC01PJ38_A707PrdFacCon[0] ;
         A727PrdRec = BC01PJ38_A727PrdRec[0] ;
         A682PrdCalNec = BC01PJ38_A682PrdCalNec[0] ;
         A698PrdDetPar = BC01PJ38_A698PrdDetPar[0] ;
         A730PrdSit = BC01PJ38_A730PrdSit[0] ;
         A729PrdRotRea = BC01PJ38_A729PrdRotRea[0] ;
         A724PrdPreAct = BC01PJ38_A724PrdPreAct[0] ;
         A725PrdPreAnt = BC01PJ38_A725PrdPreAnt[0] ;
         A726PrdPreMed = BC01PJ38_A726PrdPreMed[0] ;
         A696PrdConDia = BC01PJ38_A696PrdConDia[0] ;
         A731PrdStkMinD = BC01PJ38_A731PrdStkMinD[0] ;
         A732PrdStkMinU = BC01PJ38_A732PrdStkMinU[0] ;
         A699PrdDiaRot = BC01PJ38_A699PrdDiaRot[0] ;
         A722PrdPlaEnt = BC01PJ38_A722PrdPlaEnt[0] ;
         A716PrdLotMin = BC01PJ38_A716PrdLotMin[0] ;
         A721PrdNumUco = BC01PJ38_A721PrdNumUco[0] ;
         A704PrdExiAlm = BC01PJ38_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01PJ38_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01PJ38_A685PrdCanRes[0] ;
         A684PrdCanPen = BC01PJ38_A684PrdCanPen[0] ;
         A713PrdFulEnt = BC01PJ38_A713PrdFulEnt[0] ;
         A714PrdFulPed = BC01PJ38_A714PrdFulPed[0] ;
         A712PrdFulCC = BC01PJ38_A712PrdFulCC[0] ;
         A706PrdExiCCP = BC01PJ38_A706PrdExiCCP[0] ;
         A740PrdUltECC = BC01PJ38_A740PrdUltECC[0] ;
         A738PrdUltCCC = BC01PJ38_A738PrdUltCCC[0] ;
         A739PrdUltDCC = BC01PJ38_A739PrdUltDCC[0] ;
         A700PrdDifCC = BC01PJ38_A700PrdDifCC[0] ;
         A695PrdConCC = BC01PJ38_A695PrdConCC[0] ;
         A750PrdValStk = BC01PJ38_A750PrdValStk[0] ;
         A332DifValStk = BC01PJ38_A332DifValStk[0] ;
         A708PrdFecEnt = BC01PJ38_A708PrdFecEnt[0] ;
         A1193PrdPosX = BC01PJ38_A1193PrdPosX[0] ;
         A1194PrdPosY = BC01PJ38_A1194PrdPosY[0] ;
         A1643PrdTip = BC01PJ38_A1643PrdTip[0] ;
         A1644PrdDqo = BC01PJ38_A1644PrdDqo[0] ;
         A3004PrdRev = BC01PJ38_A3004PrdRev[0] ;
         A3273PrdTnq = BC01PJ38_A3273PrdTnq[0] ;
         A4692PrdNom2 = BC01PJ38_A4692PrdNom2[0] ;
         A4693PrdNum2 = BC01PJ38_A4693PrdNum2[0] ;
         A4694PrdObs = BC01PJ38_A4694PrdObs[0] ;
         A4338PrdUMeFo = BC01PJ38_A4338PrdUMeFo[0] ;
         A5255PrdPreAc2 = BC01PJ38_A5255PrdPreAc2[0] ;
         A5416PrdDensS = BC01PJ38_A5416PrdDensS[0] ;
         A5417PrdConcS = BC01PJ38_A5417PrdConcS[0] ;
         A5418PrdSalM = BC01PJ38_A5418PrdSalM[0] ;
         A6191PrdNumCent = BC01PJ38_A6191PrdNumCent[0] ;
         A7226PrdNumct1 = BC01PJ38_A7226PrdNumct1[0] ;
         A7227PrdNumct2 = BC01PJ38_A7227PrdNumct2[0] ;
         A7260PrdHorMad = BC01PJ38_A7260PrdHorMad[0] ;
         A8659PrdExiAlmc = BC01PJ38_A8659PrdExiAlmc[0] ;
         A8936PrdSal = BC01PJ38_A8936PrdSal[0] ;
         A9731PrdInc = BC01PJ38_A9731PrdInc[0] ;
         A9732PrdComp = BC01PJ38_A9732PrdComp[0] ;
         A9733PrdAox = BC01PJ38_A9733PrdAox[0] ;
         A9734PrdNCAS = BC01PJ38_A9734PrdNCAS[0] ;
         A9739PrdFT = BC01PJ38_A9739PrdFT[0] ;
         A9740PrdFFT = BC01PJ38_A9740PrdFFT[0] ;
         A9741PrdHS = BC01PJ38_A9741PrdHS[0] ;
         A9742PrdFHS = BC01PJ38_A9742PrdFHS[0] ;
         A10119PrdColIdx = BC01PJ38_A10119PrdColIdx[0] ;
         A5888PrdOkotex = BC01PJ38_A5888PrdOkotex[0] ;
         A5887PrdReach = BC01PJ38_A5887PrdReach[0] ;
         A10881PrdLote = BC01PJ38_A10881PrdLote[0] ;
         A10935PrdRTM = BC01PJ38_A10935PrdRTM[0] ;
         A10936PrdCtw1 = BC01PJ38_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = BC01PJ38_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = BC01PJ38_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = BC01PJ38_A11663PrdCtw4[0] ;
         A11196PrdNroCAS = BC01PJ38_A11196PrdNroCAS[0] ;
         A11363PrdGots = BC01PJ38_A11363PrdGots[0] ;
         A11364PrdHm = BC01PJ38_A11364PrdHm[0] ;
         A11470PrdConct = BC01PJ38_A11470PrdConct[0] ;
         A11614PrdEINECS = BC01PJ38_A11614PrdEINECS[0] ;
         A11615PrdFuncion = BC01PJ38_A11615PrdFuncion[0] ;
         A11616PrdNmQu = BC01PJ38_A11616PrdNmQu[0] ;
         A11687PrdList = BC01PJ38_A11687PrdList[0] ;
         A12957PrdLoteOb = BC01PJ38_A12957PrdLoteOb[0] ;
         A13232PrdRGB = BC01PJ38_A13232PrdRGB[0] ;
         A13301PrdZDHC = BC01PJ38_A13301PrdZDHC[0] ;
         A13302PrdTHELIST = BC01PJ38_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = BC01PJ38_n13302PrdTHELIST[0] ;
         A13457PrdUbicaci = BC01PJ38_A13457PrdUbicaci[0] ;
         A3936PrdEqLP = BC01PJ38_A3936PrdEqLP[0] ;
         O13302PrdTHELIST = A13302PrdTHELIST ;
         n13302PrdTHELIST = false ;
         O732PrdStkMinU = A732PrdStkMinU ;
         O10881PrdLote = A10881PrdLote ;
         O718PrdNom = A718PrdNom ;
         O724PrdPreAct = A724PrdPreAct ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1PJ29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1PJ29( ) ;
         }
         Gx_mode = sMode29 ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1PJ29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
      }
      pr_default.close(33);
   }

   public void getEqualNoModal( )
   {
      getKey1PJ29( ) ;
      if ( RcdFound29 == 0 )
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
      confirm_1PJ0( ) ;
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

   public void checkOptimisticConcurrency1PJ29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01PJ39 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(34) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(BC01PJ39_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z5590PrdSolub, BC01PJ39_A5590PrdSolub[0]) != 0 ) || ( GXutil.strcmp(Z8897PrdPesTerm, BC01PJ39_A8897PrdPesTerm[0]) != 0 ) || ( GXutil.strcmp(Z718PrdNom, BC01PJ39_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z728PrdRefPrv, BC01PJ39_A728PrdRefPrv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z703PrdDscTec, BC01PJ39_A703PrdDscTec[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, BC01PJ39_A707PrdFacCon[0]) != 0 ) || ( GXutil.strcmp(Z727PrdRec, BC01PJ39_A727PrdRec[0]) != 0 ) || ( GXutil.strcmp(Z682PrdCalNec, BC01PJ39_A682PrdCalNec[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, BC01PJ39_A698PrdDetPar[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z730PrdSit != BC01PJ39_A730PrdSit[0] ) || ( DecimalUtil.compareTo(Z729PrdRotRea, BC01PJ39_A729PrdRotRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, BC01PJ39_A724PrdPreAct[0]) != 0 ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, BC01PJ39_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z726PrdPreMed, BC01PJ39_A726PrdPreMed[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z696PrdConDia, BC01PJ39_A696PrdConDia[0]) != 0 ) || ( Z731PrdStkMinD != BC01PJ39_A731PrdStkMinD[0] ) || ( DecimalUtil.compareTo(Z732PrdStkMinU, BC01PJ39_A732PrdStkMinU[0]) != 0 ) || ( Z699PrdDiaRot != BC01PJ39_A699PrdDiaRot[0] ) || ( Z722PrdPlaEnt != BC01PJ39_A722PrdPlaEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z716PrdLotMin != BC01PJ39_A716PrdLotMin[0] ) || ( DecimalUtil.compareTo(Z721PrdNumUco, BC01PJ39_A721PrdNumUco[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, BC01PJ39_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, BC01PJ39_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z685PrdCanRes, BC01PJ39_A685PrdCanRes[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z684PrdCanPen, BC01PJ39_A684PrdCanPen[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(BC01PJ39_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z714PrdFulPed), GXutil.resetTime(BC01PJ39_A714PrdFulPed[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z712PrdFulCC), GXutil.resetTime(BC01PJ39_A712PrdFulCC[0])) ) || ( DecimalUtil.compareTo(Z706PrdExiCCP, BC01PJ39_A706PrdExiCCP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z740PrdUltECC, BC01PJ39_A740PrdUltECC[0]) != 0 ) || ( Z738PrdUltCCC != BC01PJ39_A738PrdUltCCC[0] ) || ( DecimalUtil.compareTo(Z739PrdUltDCC, BC01PJ39_A739PrdUltDCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z700PrdDifCC, BC01PJ39_A700PrdDifCC[0]) != 0 ) || ( Z695PrdConCC != BC01PJ39_A695PrdConCC[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z750PrdValStk, BC01PJ39_A750PrdValStk[0]) != 0 ) || ( DecimalUtil.compareTo(Z332DifValStk, BC01PJ39_A332DifValStk[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z708PrdFecEnt), GXutil.resetTime(BC01PJ39_A708PrdFecEnt[0])) ) || ( Z1193PrdPosX != BC01PJ39_A1193PrdPosX[0] ) || ( Z1194PrdPosY != BC01PJ39_A1194PrdPosY[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1643PrdTip, BC01PJ39_A1643PrdTip[0]) != 0 ) || ( Z1644PrdDqo != BC01PJ39_A1644PrdDqo[0] ) || ( GXutil.strcmp(Z3004PrdRev, BC01PJ39_A3004PrdRev[0]) != 0 ) || ( Z3273PrdTnq != BC01PJ39_A3273PrdTnq[0] ) || ( GXutil.strcmp(Z4692PrdNom2, BC01PJ39_A4692PrdNom2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4693PrdNum2, BC01PJ39_A4693PrdNum2[0]) != 0 ) || ( GXutil.strcmp(Z4694PrdObs, BC01PJ39_A4694PrdObs[0]) != 0 ) || ( Z4338PrdUMeFo != BC01PJ39_A4338PrdUMeFo[0] ) || ( DecimalUtil.compareTo(Z5255PrdPreAc2, BC01PJ39_A5255PrdPreAc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z5416PrdDensS, BC01PJ39_A5416PrdDensS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z5417PrdConcS, BC01PJ39_A5417PrdConcS[0]) != 0 ) || ( GXutil.strcmp(Z5418PrdSalM, BC01PJ39_A5418PrdSalM[0]) != 0 ) || ( GXutil.strcmp(Z6191PrdNumCent, BC01PJ39_A6191PrdNumCent[0]) != 0 ) || ( DecimalUtil.compareTo(Z7226PrdNumct1, BC01PJ39_A7226PrdNumct1[0]) != 0 ) || ( DecimalUtil.compareTo(Z7227PrdNumct2, BC01PJ39_A7227PrdNumct2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7260PrdHorMad != BC01PJ39_A7260PrdHorMad[0] ) || ( DecimalUtil.compareTo(Z8659PrdExiAlmc, BC01PJ39_A8659PrdExiAlmc[0]) != 0 ) || ( GXutil.strcmp(Z8936PrdSal, BC01PJ39_A8936PrdSal[0]) != 0 ) || ( GXutil.strcmp(Z9731PrdInc, BC01PJ39_A9731PrdInc[0]) != 0 ) || ( GXutil.strcmp(Z9732PrdComp, BC01PJ39_A9732PrdComp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9733PrdAox, BC01PJ39_A9733PrdAox[0]) != 0 ) || ( GXutil.strcmp(Z9734PrdNCAS, BC01PJ39_A9734PrdNCAS[0]) != 0 ) || ( GXutil.strcmp(Z9739PrdFT, BC01PJ39_A9739PrdFT[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9740PrdFFT), GXutil.resetTime(BC01PJ39_A9740PrdFFT[0])) ) || ( GXutil.strcmp(Z9741PrdHS, BC01PJ39_A9741PrdHS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z9742PrdFHS), GXutil.resetTime(BC01PJ39_A9742PrdFHS[0])) ) || ( GXutil.strcmp(Z10119PrdColIdx, BC01PJ39_A10119PrdColIdx[0]) != 0 ) || ( GXutil.strcmp(Z5888PrdOkotex, BC01PJ39_A5888PrdOkotex[0]) != 0 ) || ( GXutil.strcmp(Z5887PrdReach, BC01PJ39_A5887PrdReach[0]) != 0 ) || ( GXutil.strcmp(Z10881PrdLote, BC01PJ39_A10881PrdLote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10935PrdRTM, BC01PJ39_A10935PrdRTM[0]) != 0 ) || ( GXutil.strcmp(Z10936PrdCtw1, BC01PJ39_A10936PrdCtw1[0]) != 0 ) || ( GXutil.strcmp(Z10937PrdCtw2, BC01PJ39_A10937PrdCtw2[0]) != 0 ) || ( GXutil.strcmp(Z10938PrdCtw3, BC01PJ39_A10938PrdCtw3[0]) != 0 ) || ( GXutil.strcmp(Z11663PrdCtw4, BC01PJ39_A11663PrdCtw4[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11196PrdNroCAS, BC01PJ39_A11196PrdNroCAS[0]) != 0 ) || ( GXutil.strcmp(Z11363PrdGots, BC01PJ39_A11363PrdGots[0]) != 0 ) || ( GXutil.strcmp(Z11364PrdHm, BC01PJ39_A11364PrdHm[0]) != 0 ) || ( Z11470PrdConct != BC01PJ39_A11470PrdConct[0] ) || ( GXutil.strcmp(Z11614PrdEINECS, BC01PJ39_A11614PrdEINECS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11615PrdFuncion, BC01PJ39_A11615PrdFuncion[0]) != 0 ) || ( GXutil.strcmp(Z11616PrdNmQu, BC01PJ39_A11616PrdNmQu[0]) != 0 ) || ( GXutil.strcmp(Z11687PrdList, BC01PJ39_A11687PrdList[0]) != 0 ) || ( GXutil.strcmp(Z12957PrdLoteOb, BC01PJ39_A12957PrdLoteOb[0]) != 0 ) || ( Z13232PrdRGB != BC01PJ39_A13232PrdRGB[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13301PrdZDHC, BC01PJ39_A13301PrdZDHC[0]) != 0 ) || ( GXutil.strcmp(Z13302PrdTHELIST, BC01PJ39_A13302PrdTHELIST[0]) != 0 ) || ( GXutil.strcmp(Z13457PrdUbicaci, BC01PJ39_A13457PrdUbicaci[0]) != 0 ) || ( GXutil.strcmp(Z3936PrdEqLP, BC01PJ39_A3936PrdEqLP[0]) != 0 ) || ( Z8896PrdPesCon != BC01PJ39_A8896PrdPesCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13968PrdCantAtM != BC01PJ39_A13968PrdCantAtM[0] ) || ( DecimalUtil.compareTo(Z13970PrdMatSeca, BC01PJ39_A13970PrdMatSeca[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13971PrdLoteFch), GXutil.resetTime(BC01PJ39_A13971PrdLoteFch[0])) ) || ( GXutil.strcmp(Z13972PrdFTdoc, BC01PJ39_A13972PrdFTdoc[0]) != 0 ) || ( GXutil.strcmp(Z13973PrdFSdoc, BC01PJ39_A13973PrdFSdoc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13974PrdGRS, BC01PJ39_A13974PrdGRS[0]) != 0 ) || ( Z13969PrdGruFamI != BC01PJ39_A13969PrdGruFamI[0] ) || ( Z629MetCod != BC01PJ39_A629MetCod[0] ) || ( Z795PrvNum != BC01PJ39_A795PrvNum[0] ) || ( Z835TipDtoCod != BC01PJ39_A835TipDtoCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z742PrdUniCom != BC01PJ39_A742PrdUniCom[0] ) || ( Z743PrdUniCon != BC01PJ39_A743PrdUniCon[0] ) || ( Z856ValCod != BC01PJ39_A856ValCod[0] ) || ( Z6301TipPrdCod != BC01PJ39_A6301TipPrdCod[0] ) || ( Z9609SubFamCod != BC01PJ39_A9609SubFamCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12714PrdFabId != BC01PJ39_A12714PrdFabId[0] ) || ( Z13927AlmPrdID != BC01PJ39_A13927AlmPrdID[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PJ29( )
   {
      beforeValidate1PJ29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PJ29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PJ29( 0) ;
         checkOptimisticConcurrency1PJ29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PJ29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PJ29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01PJ40 */
                  pr_default.execute(35, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A709PrdFecPre, A5590PrdSolub, A8897PrdPesTerm, A718PrdNom, A728PrdRefPrv, A703PrdDscTec, A707PrdFacCon, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), A4692PrdNom2, A4693PrdNum2, A4694PrdObs, Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A5416PrdDensS, A5417PrdConcS, A5418PrdSalM, A6191PrdNumCent, A7226PrdNumct1, A7227PrdNumct2, Byte.valueOf(A7260PrdHorMad), A8659PrdExiAlmc, A8936PrdSal, A9731PrdInc, A9732PrdComp, A9733PrdAox, A9734PrdNCAS, A9739PrdFT, A9740PrdFFT, A9741PrdHS, A9742PrdFHS, A10119PrdColIdx, A5888PrdOkotex, A5887PrdReach, A10881PrdLote, A10935PrdRTM, A10936PrdCtw1, A10937PrdCtw2, A10938PrdCtw3, A11663PrdCtw4, A11196PrdNroCAS, A11363PrdGots, A11364PrdHm, Short.valueOf(A11470PrdConct), A11614PrdEINECS, A11615PrdFuncion, A11616PrdNmQu, A11687PrdList, A12957PrdLoteOb, Long.valueOf(A13232PrdRGB), A13301PrdZDHC, Boolean.valueOf(n13302PrdTHELIST), A13302PrdTHELIST, A13457PrdUbicaci, A3936PrdEqLP, Byte.valueOf(A8896PrdPesCon), Boolean.valueOf(n13968PrdCantAtM), Short.valueOf(A13968PrdCantAtM), Boolean.valueOf(n13970PrdMatSeca), A13970PrdMatSeca, Boolean.valueOf(n13971PrdLoteFch), A13971PrdLoteFch, Boolean.valueOf(n13972PrdFTdoc), A13972PrdFTdoc, Boolean.valueOf(n13973PrdFSdoc), A13973PrdFSdoc, Boolean.valueOf(n13974PrdGRS), A13974PrdGRS, A396EmprCod, Boolean.valueOf(n13969PrdGruFamI), Byte.valueOf(A13969PrdGruFamI), Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod), Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod), Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod), Boolean.valueOf(n12714PrdFabId), Integer.valueOf(A12714PrdFabId),
                  Boolean.valueOf(n13927AlmPrdID), Short.valueOf(A13927AlmPrdID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(35) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ && ( AV33EliotLavanderia == 1 ) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_char11[0] = A719PrdNum ;
                        GXv_char10[0] = Gx_mode ;
                        new app.pdvproduc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10) ;
                        produc_bc.this.A396EmprCod = GXv_char12[0] ;
                        produc_bc.this.A719PrdNum = GXv_char11[0] ;
                        produc_bc.this.Gx_mode = GXv_char10[0] ;
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
            load1PJ29( ) ;
         }
         endLevel1PJ29( ) ;
      }
      closeExtendedTableCursors1PJ29( ) ;
   }

   public void update1PJ29( )
   {
      beforeValidate1PJ29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PJ29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PJ29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PJ29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PJ29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01PJ41 */
                  pr_default.execute(36, new Object[] {A709PrdFecPre, A5590PrdSolub, A8897PrdPesTerm, A718PrdNom, A728PrdRefPrv, A703PrdDscTec, A707PrdFacCon, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), A4692PrdNom2, A4693PrdNum2, A4694PrdObs, Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A5416PrdDensS, A5417PrdConcS, A5418PrdSalM, A6191PrdNumCent, A7226PrdNumct1, A7227PrdNumct2, Byte.valueOf(A7260PrdHorMad), A8659PrdExiAlmc, A8936PrdSal, A9731PrdInc, A9732PrdComp, A9733PrdAox, A9734PrdNCAS, A9739PrdFT, A9740PrdFFT, A9741PrdHS, A9742PrdFHS, A10119PrdColIdx, A5888PrdOkotex, A5887PrdReach, A10881PrdLote, A10935PrdRTM, A10936PrdCtw1, A10937PrdCtw2, A10938PrdCtw3, A11663PrdCtw4, A11196PrdNroCAS, A11363PrdGots, A11364PrdHm, Short.valueOf(A11470PrdConct), A11614PrdEINECS, A11615PrdFuncion, A11616PrdNmQu, A11687PrdList, A12957PrdLoteOb, Long.valueOf(A13232PrdRGB), A13301PrdZDHC, Boolean.valueOf(n13302PrdTHELIST), A13302PrdTHELIST, A13457PrdUbicaci, A3936PrdEqLP, Byte.valueOf(A8896PrdPesCon), Boolean.valueOf(n13968PrdCantAtM), Short.valueOf(A13968PrdCantAtM), Boolean.valueOf(n13970PrdMatSeca), A13970PrdMatSeca, Boolean.valueOf(n13971PrdLoteFch), A13971PrdLoteFch, Boolean.valueOf(n13972PrdFTdoc), A13972PrdFTdoc, Boolean.valueOf(n13973PrdFSdoc), A13973PrdFSdoc, Boolean.valueOf(n13974PrdGRS), A13974PrdGRS, Boolean.valueOf(n13969PrdGruFamI), Byte.valueOf(A13969PrdGruFamI), Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod), Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod), Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod), Boolean.valueOf(n12714PrdFabId), Integer.valueOf(A12714PrdFabId), Boolean.valueOf(n13927AlmPrdID), Short.valueOf(A13927AlmPrdID), A396EmprCod,
                  Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(36) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PJ29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ && ( AV33EliotLavanderia == 1 ) && ( true /* After */ || true /* After */ ) )
                     {
                        GXv_char12[0] = A396EmprCod ;
                        GXv_char11[0] = A719PrdNum ;
                        GXv_char10[0] = Gx_mode ;
                        new app.pdvproduc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10) ;
                        produc_bc.this.A396EmprCod = GXv_char12[0] ;
                        produc_bc.this.A719PrdNum = GXv_char11[0] ;
                        produc_bc.this.Gx_mode = GXv_char10[0] ;
                     }
                     if ( ( GXutil.strcmp(A718PrdNom, O718PrdNom) != 0 ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV8Usurcod, AV9Station, AV49Msg_e, 99999999, (byte)(0), "@") ;
                     }
                     if ( ( DecimalUtil.compareTo(A724PrdPreAct, AV7Prdpreact) != 0 ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV8Usurcod, AV9Station, AV49Msg_e, 99999999, (byte)(0), "@") ;
                     }
                     if ( ( DecimalUtil.compareTo(A732PrdStkMinU, O732PrdStkMinU) != 0 ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV8Usurcod, AV9Station, AV49Msg_e, 99999999, (byte)(0), "@") ;
                     }
                     if ( ( GXutil.strcmp(A10881PrdLote, O10881PrdLote) != 0 ) && true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV82Pgmname, AV8Usurcod, AV9Station, AV49Msg_e, 99999999, (byte)(0), "@") ;
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
         endLevel1PJ29( ) ;
      }
      closeExtendedTableCursors1PJ29( ) ;
   }

   public void deferredUpdate1PJ29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1PJ29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PJ29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PJ29( ) ;
         afterConfirm1PJ29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PJ29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01PJ42 */
               pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ && ( AV33EliotLavanderia == 1 ) && ( true /* After */ || true /* After */ ) )
                  {
                     GXv_char12[0] = A396EmprCod ;
                     GXv_char11[0] = A719PrdNum ;
                     GXv_char10[0] = Gx_mode ;
                     new app.pdvproduc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_char10) ;
                     produc_bc.this.A396EmprCod = GXv_char12[0] ;
                     produc_bc.this.A719PrdNum = GXv_char11[0] ;
                     produc_bc.this.Gx_mode = GXv_char10[0] ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1PJ29( ) ;
      Gx_mode = sMode29 ;
   }

   public void onDeleteControls1PJ29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_int15 = A13873PrdUltMovC ;
         GXv_int16[0] = GXt_int15 ;
         new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int16) ;
         produc_bc.this.GXt_int15 = GXv_int16[0] ;
         A13873PrdUltMovC = GXt_int15 ;
         GXt_date17 = A13872PrdFecUltM ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_date18[0] = GXt_date17 ;
         new app.core.ultimafechamovcc(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_date18) ;
         produc_bc.this.A396EmprCod = GXv_char12[0] ;
         produc_bc.this.A719PrdNum = GXv_char11[0] ;
         produc_bc.this.GXt_date17 = GXv_date18[0] ;
         A13872PrdFecUltM = GXt_date17 ;
         GXt_int13 = A13871PrdDiasIna ;
         GXv_char12[0] = A396EmprCod ;
         GXv_char11[0] = A719PrdNum ;
         GXv_int14[0] = GXt_int13 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_int14) ;
         produc_bc.this.A396EmprCod = GXv_char12[0] ;
         produc_bc.this.A719PrdNum = GXv_char11[0] ;
         produc_bc.this.GXt_int13 = GXv_int14[0] ;
         A13871PrdDiasIna = GXt_int13 ;
         if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
         {
            A13881PrdEsCompu = true ;
         }
         else
         {
            A13881PrdEsCompu = false ;
         }
         A13874PrdTipMovU = getPrdTipMovU0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
         A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
         A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
         A13747PrdCDsc = GXutil.trim( A719PrdNum) + " - " + GXutil.trim( A718PrdNom) ;
         /* Using cursor BC01PJ43 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = BC01PJ43_A794PrvNom[0] ;
         n794PrvNom = BC01PJ43_n794PrvNom[0] ;
         pr_default.close(38);
         GXt_int13 = A14006PrdDiaSinM ;
         GXv_int14[0] = GXt_int13 ;
         new app.pget_diasprodsinmovimiento(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_int14) ;
         produc_bc.this.GXt_int13 = GXv_int14[0] ;
         A14006PrdDiaSinM = GXt_int13 ;
         /* Using cursor BC01PJ44 */
         pr_default.execute(39, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
         A737PrdUcpDsc = BC01PJ44_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = BC01PJ44_n737PrdUcpDsc[0] ;
         pr_default.close(39);
         /* Using cursor BC01PJ45 */
         pr_default.execute(40, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
         A736PrdUcoDsc = BC01PJ45_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = BC01PJ45_n736PrdUcoDsc[0] ;
         pr_default.close(40);
         /* Using cursor BC01PJ46 */
         pr_default.execute(41, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
         A857ValDsc = BC01PJ46_A857ValDsc[0] ;
         n857ValDsc = BC01PJ46_n857ValDsc[0] ;
         pr_default.close(41);
         /* Using cursor BC01PJ47 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         A837TipDtoDto = BC01PJ47_A837TipDtoDto[0] ;
         n837TipDtoDto = BC01PJ47_n837TipDtoDto[0] ;
         pr_default.close(42);
         AV7Prdpreact = O724PrdPreAct ;
         AV10oldPrdStkMinU = O732PrdStkMinU ;
         /* Using cursor BC01PJ48 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
         A630MetDsc = BC01PJ48_A630MetDsc[0] ;
         n630MetDsc = BC01PJ48_n630MetDsc[0] ;
         pr_default.close(43);
         A13831PrdDisponi = A704PrdExiAlm.subtract(A685PrdCanRes) ;
         /* Using cursor BC01PJ49 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
         A6302TipPrdDsc = BC01PJ49_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = BC01PJ49_n6302TipPrdDsc[0] ;
         pr_default.close(44);
         /* Using cursor BC01PJ50 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
         A9610SubFamDsc = BC01PJ50_A9610SubFamDsc[0] ;
         n9610SubFamDsc = BC01PJ50_n9610SubFamDsc[0] ;
         pr_default.close(45);
         if ( DecimalUtil.compareTo(A724PrdPreAct, AV7Prdpreact) != 0 )
         {
            AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Precio Producto, Precio Old =", ""), "") + GXutil.str( AV7Prdpreact, 14, 5) + httpContext.getMessage( httpContext.getMessage( " New Precio = ", ""), "") + GXutil.str( A724PrdPreAct, 14, 5) ;
         }
         else
         {
            if ( GXutil.strcmp(A718PrdNom, O718PrdNom) != 0 )
            {
               AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Nombre Producto, Nombre Old =", ""), "") + O718PrdNom + httpContext.getMessage( httpContext.getMessage( " Nombre New = ", ""), "") + A718PrdNom ;
            }
            else
            {
               if ( DecimalUtil.compareTo(A732PrdStkMinU, O732PrdStkMinU) != 0 )
               {
                  AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Stock Seguridad,Stock Old =", ""), "") + GXutil.str( AV10oldPrdStkMinU, 8, 2) + httpContext.getMessage( httpContext.getMessage( " Stock New = ", ""), "") + GXutil.str( A732PrdStkMinU, 8, 2) ;
               }
               else
               {
                  if ( GXutil.strcmp(A10881PrdLote, O10881PrdLote) != 0 )
                  {
                     AV49Msg_e = httpContext.getMessage( httpContext.getMessage( "Producto ", ""), "") + GXutil.trim( A719PrdNum) + httpContext.getMessage( httpContext.getMessage( ".Cambio Lote Actual, Anterior =", ""), "") + O10881PrdLote + httpContext.getMessage( httpContext.getMessage( " Nuevo = ", ""), "") + A10881PrdLote ;
                  }
               }
            }
         }
         /* Using cursor BC01PJ51 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n12714PrdFabId), Integer.valueOf(A12714PrdFabId)});
         A12715PrdFabNm = BC01PJ51_A12715PrdFabNm[0] ;
         n12715PrdFabNm = BC01PJ51_n12715PrdFabNm[0] ;
         pr_default.close(46);
         AV11OldPrdTHELIST = O13302PrdTHELIST ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01PJ52 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor BC01PJ53 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor BC01PJ54 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor BC01PJ55 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor BC01PJ56 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor BC01PJ57 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor BC01PJ58 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor BC01PJ59 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor BC01PJ60 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor BC01PJ61 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor BC01PJ62 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor BC01PJ63 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor BC01PJ64 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor BC01PJ65 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor BC01PJ66 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor BC01PJ67 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor BC01PJ68 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor BC01PJ69 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor BC01PJ70 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor BC01PJ71 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor BC01PJ72 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor BC01PJ73 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor BC01PJ74 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor BC01PJ75 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor BC01PJ76 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor BC01PJ77 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor BC01PJ78 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor BC01PJ79 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor BC01PJ80 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor BC01PJ81 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor BC01PJ82 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor BC01PJ83 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor BC01PJ84 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor BC01PJ85 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor BC01PJ86 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor BC01PJ87 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor BC01PJ88 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor BC01PJ89 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor BC01PJ90 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor BC01PJ91 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor BC01PJ92 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor BC01PJ93 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor BC01PJ94 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor BC01PJ95 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor BC01PJ96 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor BC01PJ97 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor BC01PJ98 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor BC01PJ99 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor BC01PJ100 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor BC01PJ101 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor BC01PJ102 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor BC01PJ103 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor BC01PJ104 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor BC01PJ105 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor BC01PJ106 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor BC01PJ107 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor BC01PJ108 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor BC01PJ109 */
         pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor BC01PJ110 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor BC01PJ111 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor BC01PJ112 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor BC01PJ113 */
         pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor BC01PJ114 */
         pr_default.execute(109, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
         /* Using cursor BC01PJ115 */
         pr_default.execute(110, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(110) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(110);
         /* Using cursor BC01PJ116 */
         pr_default.execute(111, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(111) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(111);
         /* Using cursor BC01PJ117 */
         pr_default.execute(112, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(112) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(112);
         /* Using cursor BC01PJ118 */
         pr_default.execute(113, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(113) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(113);
         /* Using cursor BC01PJ119 */
         pr_default.execute(114, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(114) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(114);
         /* Using cursor BC01PJ120 */
         pr_default.execute(115, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(115) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(115);
         /* Using cursor BC01PJ121 */
         pr_default.execute(116, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(116) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(116);
         /* Using cursor BC01PJ122 */
         pr_default.execute(117, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(117) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(117);
         /* Using cursor BC01PJ123 */
         pr_default.execute(118, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(118) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(118);
         /* Using cursor BC01PJ124 */
         pr_default.execute(119, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(119) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(119);
      }
   }

   public void endLevel1PJ29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(34);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PJ29( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         if ( true /* After */ )
         {
            GXv_char12[0] = A396EmprCod ;
            GXv_char11[0] = A719PrdNum ;
            GXv_decimal19[0] = A724PrdPreAct ;
            new app.pprecmp(remoteHandle, context).execute( GXv_char12, GXv_char11, GXv_decimal19) ;
            produc_bc.this.A396EmprCod = GXv_char12[0] ;
            produc_bc.this.A719PrdNum = GXv_char11[0] ;
            produc_bc.this.A724PrdPreAct = GXv_decimal19[0] ;
         }
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

   public void scanKeyStart1PJ29( )
   {
      /* Scan By routine */
      /* Using cursor BC01PJ126 */
      pr_default.execute(120, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A8896PrdPesCon = BC01PJ126_A8896PrdPesCon[0] ;
         A13968PrdCantAtM = BC01PJ126_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = BC01PJ126_n13968PrdCantAtM[0] ;
         A13970PrdMatSeca = BC01PJ126_A13970PrdMatSeca[0] ;
         n13970PrdMatSeca = BC01PJ126_n13970PrdMatSeca[0] ;
         A13971PrdLoteFch = BC01PJ126_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = BC01PJ126_n13971PrdLoteFch[0] ;
         A13972PrdFTdoc = BC01PJ126_A13972PrdFTdoc[0] ;
         n13972PrdFTdoc = BC01PJ126_n13972PrdFTdoc[0] ;
         A13973PrdFSdoc = BC01PJ126_A13973PrdFSdoc[0] ;
         n13973PrdFSdoc = BC01PJ126_n13973PrdFSdoc[0] ;
         A13974PrdGRS = BC01PJ126_A13974PrdGRS[0] ;
         n13974PrdGRS = BC01PJ126_n13974PrdGRS[0] ;
         A13969PrdGruFamI = BC01PJ126_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = BC01PJ126_n13969PrdGruFamI[0] ;
         A629MetCod = BC01PJ126_A629MetCod[0] ;
         n629MetCod = BC01PJ126_n629MetCod[0] ;
         A795PrvNum = BC01PJ126_A795PrvNum[0] ;
         A835TipDtoCod = BC01PJ126_A835TipDtoCod[0] ;
         n835TipDtoCod = BC01PJ126_n835TipDtoCod[0] ;
         A742PrdUniCom = BC01PJ126_A742PrdUniCom[0] ;
         A743PrdUniCon = BC01PJ126_A743PrdUniCon[0] ;
         A856ValCod = BC01PJ126_A856ValCod[0] ;
         A6301TipPrdCod = BC01PJ126_A6301TipPrdCod[0] ;
         n6301TipPrdCod = BC01PJ126_n6301TipPrdCod[0] ;
         A9609SubFamCod = BC01PJ126_A9609SubFamCod[0] ;
         n9609SubFamCod = BC01PJ126_n9609SubFamCod[0] ;
         A12714PrdFabId = BC01PJ126_A12714PrdFabId[0] ;
         n12714PrdFabId = BC01PJ126_n12714PrdFabId[0] ;
         A13927AlmPrdID = BC01PJ126_A13927AlmPrdID[0] ;
         n13927AlmPrdID = BC01PJ126_n13927AlmPrdID[0] ;
         A13875PrdLastLin = BC01PJ126_A13875PrdLastLin[0] ;
         n13875PrdLastLin = BC01PJ126_n13875PrdLastLin[0] ;
         A719PrdNum = BC01PJ126_A719PrdNum[0] ;
         n719PrdNum = BC01PJ126_n719PrdNum[0] ;
         A709PrdFecPre = BC01PJ126_A709PrdFecPre[0] ;
         A5590PrdSolub = BC01PJ126_A5590PrdSolub[0] ;
         A8897PrdPesTerm = BC01PJ126_A8897PrdPesTerm[0] ;
         A407EmprNom = BC01PJ126_A407EmprNom[0] ;
         n407EmprNom = BC01PJ126_n407EmprNom[0] ;
         A718PrdNom = BC01PJ126_A718PrdNom[0] ;
         A794PrvNom = BC01PJ126_A794PrvNom[0] ;
         n794PrvNom = BC01PJ126_n794PrvNom[0] ;
         A728PrdRefPrv = BC01PJ126_A728PrdRefPrv[0] ;
         A703PrdDscTec = BC01PJ126_A703PrdDscTec[0] ;
         A737PrdUcpDsc = BC01PJ126_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = BC01PJ126_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = BC01PJ126_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = BC01PJ126_n736PrdUcoDsc[0] ;
         A707PrdFacCon = BC01PJ126_A707PrdFacCon[0] ;
         A857ValDsc = BC01PJ126_A857ValDsc[0] ;
         n857ValDsc = BC01PJ126_n857ValDsc[0] ;
         A727PrdRec = BC01PJ126_A727PrdRec[0] ;
         A682PrdCalNec = BC01PJ126_A682PrdCalNec[0] ;
         A698PrdDetPar = BC01PJ126_A698PrdDetPar[0] ;
         A730PrdSit = BC01PJ126_A730PrdSit[0] ;
         A729PrdRotRea = BC01PJ126_A729PrdRotRea[0] ;
         A837TipDtoDto = BC01PJ126_A837TipDtoDto[0] ;
         n837TipDtoDto = BC01PJ126_n837TipDtoDto[0] ;
         A724PrdPreAct = BC01PJ126_A724PrdPreAct[0] ;
         A725PrdPreAnt = BC01PJ126_A725PrdPreAnt[0] ;
         A726PrdPreMed = BC01PJ126_A726PrdPreMed[0] ;
         A696PrdConDia = BC01PJ126_A696PrdConDia[0] ;
         A731PrdStkMinD = BC01PJ126_A731PrdStkMinD[0] ;
         A732PrdStkMinU = BC01PJ126_A732PrdStkMinU[0] ;
         A699PrdDiaRot = BC01PJ126_A699PrdDiaRot[0] ;
         A722PrdPlaEnt = BC01PJ126_A722PrdPlaEnt[0] ;
         A630MetDsc = BC01PJ126_A630MetDsc[0] ;
         n630MetDsc = BC01PJ126_n630MetDsc[0] ;
         A716PrdLotMin = BC01PJ126_A716PrdLotMin[0] ;
         A721PrdNumUco = BC01PJ126_A721PrdNumUco[0] ;
         A704PrdExiAlm = BC01PJ126_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01PJ126_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01PJ126_A685PrdCanRes[0] ;
         A684PrdCanPen = BC01PJ126_A684PrdCanPen[0] ;
         A713PrdFulEnt = BC01PJ126_A713PrdFulEnt[0] ;
         A714PrdFulPed = BC01PJ126_A714PrdFulPed[0] ;
         A712PrdFulCC = BC01PJ126_A712PrdFulCC[0] ;
         A706PrdExiCCP = BC01PJ126_A706PrdExiCCP[0] ;
         A740PrdUltECC = BC01PJ126_A740PrdUltECC[0] ;
         A738PrdUltCCC = BC01PJ126_A738PrdUltCCC[0] ;
         A739PrdUltDCC = BC01PJ126_A739PrdUltDCC[0] ;
         A700PrdDifCC = BC01PJ126_A700PrdDifCC[0] ;
         A695PrdConCC = BC01PJ126_A695PrdConCC[0] ;
         A750PrdValStk = BC01PJ126_A750PrdValStk[0] ;
         A332DifValStk = BC01PJ126_A332DifValStk[0] ;
         A708PrdFecEnt = BC01PJ126_A708PrdFecEnt[0] ;
         A1193PrdPosX = BC01PJ126_A1193PrdPosX[0] ;
         A1194PrdPosY = BC01PJ126_A1194PrdPosY[0] ;
         A1643PrdTip = BC01PJ126_A1643PrdTip[0] ;
         A1644PrdDqo = BC01PJ126_A1644PrdDqo[0] ;
         A3004PrdRev = BC01PJ126_A3004PrdRev[0] ;
         A3273PrdTnq = BC01PJ126_A3273PrdTnq[0] ;
         A4692PrdNom2 = BC01PJ126_A4692PrdNom2[0] ;
         A4693PrdNum2 = BC01PJ126_A4693PrdNum2[0] ;
         A4694PrdObs = BC01PJ126_A4694PrdObs[0] ;
         A4338PrdUMeFo = BC01PJ126_A4338PrdUMeFo[0] ;
         A5255PrdPreAc2 = BC01PJ126_A5255PrdPreAc2[0] ;
         A5416PrdDensS = BC01PJ126_A5416PrdDensS[0] ;
         A5417PrdConcS = BC01PJ126_A5417PrdConcS[0] ;
         A5418PrdSalM = BC01PJ126_A5418PrdSalM[0] ;
         A6302TipPrdDsc = BC01PJ126_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = BC01PJ126_n6302TipPrdDsc[0] ;
         A6191PrdNumCent = BC01PJ126_A6191PrdNumCent[0] ;
         A7226PrdNumct1 = BC01PJ126_A7226PrdNumct1[0] ;
         A7227PrdNumct2 = BC01PJ126_A7227PrdNumct2[0] ;
         A7260PrdHorMad = BC01PJ126_A7260PrdHorMad[0] ;
         A8659PrdExiAlmc = BC01PJ126_A8659PrdExiAlmc[0] ;
         A8936PrdSal = BC01PJ126_A8936PrdSal[0] ;
         A9610SubFamDsc = BC01PJ126_A9610SubFamDsc[0] ;
         n9610SubFamDsc = BC01PJ126_n9610SubFamDsc[0] ;
         A9731PrdInc = BC01PJ126_A9731PrdInc[0] ;
         A9732PrdComp = BC01PJ126_A9732PrdComp[0] ;
         A9733PrdAox = BC01PJ126_A9733PrdAox[0] ;
         A9734PrdNCAS = BC01PJ126_A9734PrdNCAS[0] ;
         A9739PrdFT = BC01PJ126_A9739PrdFT[0] ;
         A9740PrdFFT = BC01PJ126_A9740PrdFFT[0] ;
         A9741PrdHS = BC01PJ126_A9741PrdHS[0] ;
         A9742PrdFHS = BC01PJ126_A9742PrdFHS[0] ;
         A10119PrdColIdx = BC01PJ126_A10119PrdColIdx[0] ;
         A5888PrdOkotex = BC01PJ126_A5888PrdOkotex[0] ;
         A5887PrdReach = BC01PJ126_A5887PrdReach[0] ;
         A10881PrdLote = BC01PJ126_A10881PrdLote[0] ;
         A10935PrdRTM = BC01PJ126_A10935PrdRTM[0] ;
         A10936PrdCtw1 = BC01PJ126_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = BC01PJ126_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = BC01PJ126_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = BC01PJ126_A11663PrdCtw4[0] ;
         A11196PrdNroCAS = BC01PJ126_A11196PrdNroCAS[0] ;
         A11363PrdGots = BC01PJ126_A11363PrdGots[0] ;
         A11364PrdHm = BC01PJ126_A11364PrdHm[0] ;
         A11470PrdConct = BC01PJ126_A11470PrdConct[0] ;
         A11614PrdEINECS = BC01PJ126_A11614PrdEINECS[0] ;
         A11615PrdFuncion = BC01PJ126_A11615PrdFuncion[0] ;
         A11616PrdNmQu = BC01PJ126_A11616PrdNmQu[0] ;
         A11687PrdList = BC01PJ126_A11687PrdList[0] ;
         A12715PrdFabNm = BC01PJ126_A12715PrdFabNm[0] ;
         n12715PrdFabNm = BC01PJ126_n12715PrdFabNm[0] ;
         A12957PrdLoteOb = BC01PJ126_A12957PrdLoteOb[0] ;
         A13232PrdRGB = BC01PJ126_A13232PrdRGB[0] ;
         A13301PrdZDHC = BC01PJ126_A13301PrdZDHC[0] ;
         A13302PrdTHELIST = BC01PJ126_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = BC01PJ126_n13302PrdTHELIST[0] ;
         A13457PrdUbicaci = BC01PJ126_A13457PrdUbicaci[0] ;
         A3936PrdEqLP = BC01PJ126_A3936PrdEqLP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1PJ29( )
   {
      /* Scan next routine */
      pr_default.readNext(120);
      RcdFound29 = (short)(0) ;
      scanKeyLoad1PJ29( ) ;
   }

   public void scanKeyLoad1PJ29( )
   {
      sMode29 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(120) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A8896PrdPesCon = BC01PJ126_A8896PrdPesCon[0] ;
         A13968PrdCantAtM = BC01PJ126_A13968PrdCantAtM[0] ;
         n13968PrdCantAtM = BC01PJ126_n13968PrdCantAtM[0] ;
         A13970PrdMatSeca = BC01PJ126_A13970PrdMatSeca[0] ;
         n13970PrdMatSeca = BC01PJ126_n13970PrdMatSeca[0] ;
         A13971PrdLoteFch = BC01PJ126_A13971PrdLoteFch[0] ;
         n13971PrdLoteFch = BC01PJ126_n13971PrdLoteFch[0] ;
         A13972PrdFTdoc = BC01PJ126_A13972PrdFTdoc[0] ;
         n13972PrdFTdoc = BC01PJ126_n13972PrdFTdoc[0] ;
         A13973PrdFSdoc = BC01PJ126_A13973PrdFSdoc[0] ;
         n13973PrdFSdoc = BC01PJ126_n13973PrdFSdoc[0] ;
         A13974PrdGRS = BC01PJ126_A13974PrdGRS[0] ;
         n13974PrdGRS = BC01PJ126_n13974PrdGRS[0] ;
         A13969PrdGruFamI = BC01PJ126_A13969PrdGruFamI[0] ;
         n13969PrdGruFamI = BC01PJ126_n13969PrdGruFamI[0] ;
         A629MetCod = BC01PJ126_A629MetCod[0] ;
         n629MetCod = BC01PJ126_n629MetCod[0] ;
         A795PrvNum = BC01PJ126_A795PrvNum[0] ;
         A835TipDtoCod = BC01PJ126_A835TipDtoCod[0] ;
         n835TipDtoCod = BC01PJ126_n835TipDtoCod[0] ;
         A742PrdUniCom = BC01PJ126_A742PrdUniCom[0] ;
         A743PrdUniCon = BC01PJ126_A743PrdUniCon[0] ;
         A856ValCod = BC01PJ126_A856ValCod[0] ;
         A6301TipPrdCod = BC01PJ126_A6301TipPrdCod[0] ;
         n6301TipPrdCod = BC01PJ126_n6301TipPrdCod[0] ;
         A9609SubFamCod = BC01PJ126_A9609SubFamCod[0] ;
         n9609SubFamCod = BC01PJ126_n9609SubFamCod[0] ;
         A12714PrdFabId = BC01PJ126_A12714PrdFabId[0] ;
         n12714PrdFabId = BC01PJ126_n12714PrdFabId[0] ;
         A13927AlmPrdID = BC01PJ126_A13927AlmPrdID[0] ;
         n13927AlmPrdID = BC01PJ126_n13927AlmPrdID[0] ;
         A13875PrdLastLin = BC01PJ126_A13875PrdLastLin[0] ;
         n13875PrdLastLin = BC01PJ126_n13875PrdLastLin[0] ;
         A719PrdNum = BC01PJ126_A719PrdNum[0] ;
         n719PrdNum = BC01PJ126_n719PrdNum[0] ;
         A709PrdFecPre = BC01PJ126_A709PrdFecPre[0] ;
         A5590PrdSolub = BC01PJ126_A5590PrdSolub[0] ;
         A8897PrdPesTerm = BC01PJ126_A8897PrdPesTerm[0] ;
         A407EmprNom = BC01PJ126_A407EmprNom[0] ;
         n407EmprNom = BC01PJ126_n407EmprNom[0] ;
         A718PrdNom = BC01PJ126_A718PrdNom[0] ;
         A794PrvNom = BC01PJ126_A794PrvNom[0] ;
         n794PrvNom = BC01PJ126_n794PrvNom[0] ;
         A728PrdRefPrv = BC01PJ126_A728PrdRefPrv[0] ;
         A703PrdDscTec = BC01PJ126_A703PrdDscTec[0] ;
         A737PrdUcpDsc = BC01PJ126_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = BC01PJ126_n737PrdUcpDsc[0] ;
         A736PrdUcoDsc = BC01PJ126_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = BC01PJ126_n736PrdUcoDsc[0] ;
         A707PrdFacCon = BC01PJ126_A707PrdFacCon[0] ;
         A857ValDsc = BC01PJ126_A857ValDsc[0] ;
         n857ValDsc = BC01PJ126_n857ValDsc[0] ;
         A727PrdRec = BC01PJ126_A727PrdRec[0] ;
         A682PrdCalNec = BC01PJ126_A682PrdCalNec[0] ;
         A698PrdDetPar = BC01PJ126_A698PrdDetPar[0] ;
         A730PrdSit = BC01PJ126_A730PrdSit[0] ;
         A729PrdRotRea = BC01PJ126_A729PrdRotRea[0] ;
         A837TipDtoDto = BC01PJ126_A837TipDtoDto[0] ;
         n837TipDtoDto = BC01PJ126_n837TipDtoDto[0] ;
         A724PrdPreAct = BC01PJ126_A724PrdPreAct[0] ;
         A725PrdPreAnt = BC01PJ126_A725PrdPreAnt[0] ;
         A726PrdPreMed = BC01PJ126_A726PrdPreMed[0] ;
         A696PrdConDia = BC01PJ126_A696PrdConDia[0] ;
         A731PrdStkMinD = BC01PJ126_A731PrdStkMinD[0] ;
         A732PrdStkMinU = BC01PJ126_A732PrdStkMinU[0] ;
         A699PrdDiaRot = BC01PJ126_A699PrdDiaRot[0] ;
         A722PrdPlaEnt = BC01PJ126_A722PrdPlaEnt[0] ;
         A630MetDsc = BC01PJ126_A630MetDsc[0] ;
         n630MetDsc = BC01PJ126_n630MetDsc[0] ;
         A716PrdLotMin = BC01PJ126_A716PrdLotMin[0] ;
         A721PrdNumUco = BC01PJ126_A721PrdNumUco[0] ;
         A704PrdExiAlm = BC01PJ126_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01PJ126_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01PJ126_A685PrdCanRes[0] ;
         A684PrdCanPen = BC01PJ126_A684PrdCanPen[0] ;
         A713PrdFulEnt = BC01PJ126_A713PrdFulEnt[0] ;
         A714PrdFulPed = BC01PJ126_A714PrdFulPed[0] ;
         A712PrdFulCC = BC01PJ126_A712PrdFulCC[0] ;
         A706PrdExiCCP = BC01PJ126_A706PrdExiCCP[0] ;
         A740PrdUltECC = BC01PJ126_A740PrdUltECC[0] ;
         A738PrdUltCCC = BC01PJ126_A738PrdUltCCC[0] ;
         A739PrdUltDCC = BC01PJ126_A739PrdUltDCC[0] ;
         A700PrdDifCC = BC01PJ126_A700PrdDifCC[0] ;
         A695PrdConCC = BC01PJ126_A695PrdConCC[0] ;
         A750PrdValStk = BC01PJ126_A750PrdValStk[0] ;
         A332DifValStk = BC01PJ126_A332DifValStk[0] ;
         A708PrdFecEnt = BC01PJ126_A708PrdFecEnt[0] ;
         A1193PrdPosX = BC01PJ126_A1193PrdPosX[0] ;
         A1194PrdPosY = BC01PJ126_A1194PrdPosY[0] ;
         A1643PrdTip = BC01PJ126_A1643PrdTip[0] ;
         A1644PrdDqo = BC01PJ126_A1644PrdDqo[0] ;
         A3004PrdRev = BC01PJ126_A3004PrdRev[0] ;
         A3273PrdTnq = BC01PJ126_A3273PrdTnq[0] ;
         A4692PrdNom2 = BC01PJ126_A4692PrdNom2[0] ;
         A4693PrdNum2 = BC01PJ126_A4693PrdNum2[0] ;
         A4694PrdObs = BC01PJ126_A4694PrdObs[0] ;
         A4338PrdUMeFo = BC01PJ126_A4338PrdUMeFo[0] ;
         A5255PrdPreAc2 = BC01PJ126_A5255PrdPreAc2[0] ;
         A5416PrdDensS = BC01PJ126_A5416PrdDensS[0] ;
         A5417PrdConcS = BC01PJ126_A5417PrdConcS[0] ;
         A5418PrdSalM = BC01PJ126_A5418PrdSalM[0] ;
         A6302TipPrdDsc = BC01PJ126_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = BC01PJ126_n6302TipPrdDsc[0] ;
         A6191PrdNumCent = BC01PJ126_A6191PrdNumCent[0] ;
         A7226PrdNumct1 = BC01PJ126_A7226PrdNumct1[0] ;
         A7227PrdNumct2 = BC01PJ126_A7227PrdNumct2[0] ;
         A7260PrdHorMad = BC01PJ126_A7260PrdHorMad[0] ;
         A8659PrdExiAlmc = BC01PJ126_A8659PrdExiAlmc[0] ;
         A8936PrdSal = BC01PJ126_A8936PrdSal[0] ;
         A9610SubFamDsc = BC01PJ126_A9610SubFamDsc[0] ;
         n9610SubFamDsc = BC01PJ126_n9610SubFamDsc[0] ;
         A9731PrdInc = BC01PJ126_A9731PrdInc[0] ;
         A9732PrdComp = BC01PJ126_A9732PrdComp[0] ;
         A9733PrdAox = BC01PJ126_A9733PrdAox[0] ;
         A9734PrdNCAS = BC01PJ126_A9734PrdNCAS[0] ;
         A9739PrdFT = BC01PJ126_A9739PrdFT[0] ;
         A9740PrdFFT = BC01PJ126_A9740PrdFFT[0] ;
         A9741PrdHS = BC01PJ126_A9741PrdHS[0] ;
         A9742PrdFHS = BC01PJ126_A9742PrdFHS[0] ;
         A10119PrdColIdx = BC01PJ126_A10119PrdColIdx[0] ;
         A5888PrdOkotex = BC01PJ126_A5888PrdOkotex[0] ;
         A5887PrdReach = BC01PJ126_A5887PrdReach[0] ;
         A10881PrdLote = BC01PJ126_A10881PrdLote[0] ;
         A10935PrdRTM = BC01PJ126_A10935PrdRTM[0] ;
         A10936PrdCtw1 = BC01PJ126_A10936PrdCtw1[0] ;
         A10937PrdCtw2 = BC01PJ126_A10937PrdCtw2[0] ;
         A10938PrdCtw3 = BC01PJ126_A10938PrdCtw3[0] ;
         A11663PrdCtw4 = BC01PJ126_A11663PrdCtw4[0] ;
         A11196PrdNroCAS = BC01PJ126_A11196PrdNroCAS[0] ;
         A11363PrdGots = BC01PJ126_A11363PrdGots[0] ;
         A11364PrdHm = BC01PJ126_A11364PrdHm[0] ;
         A11470PrdConct = BC01PJ126_A11470PrdConct[0] ;
         A11614PrdEINECS = BC01PJ126_A11614PrdEINECS[0] ;
         A11615PrdFuncion = BC01PJ126_A11615PrdFuncion[0] ;
         A11616PrdNmQu = BC01PJ126_A11616PrdNmQu[0] ;
         A11687PrdList = BC01PJ126_A11687PrdList[0] ;
         A12715PrdFabNm = BC01PJ126_A12715PrdFabNm[0] ;
         n12715PrdFabNm = BC01PJ126_n12715PrdFabNm[0] ;
         A12957PrdLoteOb = BC01PJ126_A12957PrdLoteOb[0] ;
         A13232PrdRGB = BC01PJ126_A13232PrdRGB[0] ;
         A13301PrdZDHC = BC01PJ126_A13301PrdZDHC[0] ;
         A13302PrdTHELIST = BC01PJ126_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = BC01PJ126_n13302PrdTHELIST[0] ;
         A13457PrdUbicaci = BC01PJ126_A13457PrdUbicaci[0] ;
         A3936PrdEqLP = BC01PJ126_A3936PrdEqLP[0] ;
      }
      Gx_mode = sMode29 ;
   }

   public void scanKeyEnd1PJ29( )
   {
      pr_default.close(120);
   }

   public void afterConfirm1PJ29( )
   {
      /* After Confirm Rules */
      if ( ( isIns( )  || isDlt( )  || isUpd( )  ) && ( AV34TexplusAcatex == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ( A707PrdFacCon.doubleValue() == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Factor Conversion NO puede ser NULO ¡¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ( A9609SubFamCod == 0 ) && ( GXutil.strcmp(A3004PrdRev, httpContext.getMessage( "S", "")) == 0 ) && ( AV13Eliot == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta SUBFAMILIA. Insumo clasificado como ESPECIAL ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1PJ29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PJ29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PJ29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PJ29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PJ29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PJ29( )
   {
   }

   public void send_integrity_lvl_hashes1PJ29( )
   {
   }

   public void addRow1PJ29( )
   {
      VarsToRow29( bcstocksquimicos_PRODUC) ;
   }

   public void readRow1PJ29( )
   {
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
   }

   public void initializeNonKey1PJ29( )
   {
      A709PrdFecPre = GXutil.nullDate() ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A8897PrdPesTerm = "" ;
      AV7Prdpreact = DecimalUtil.ZERO ;
      AV49Msg_e = "" ;
      AV10oldPrdStkMinU = DecimalUtil.ZERO ;
      AV11OldPrdTHELIST = "" ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A13747PrdCDsc = "" ;
      A13881PrdEsCompu = false ;
      A13871PrdDiasIna = (short)(0) ;
      A13872PrdFecUltM = GXutil.nullDate() ;
      A13873PrdUltMovC = 0 ;
      A13874PrdTipMovU = "" ;
      A13876PrdLastFec = GXutil.nullDate() ;
      A13877PrdLastTip = "" ;
      A14006PrdDiaSinM = (short)(0) ;
      A718PrdNom = "" ;
      A795PrvNum = 0 ;
      A794PrvNom = "" ;
      n794PrvNom = false ;
      A728PrdRefPrv = "" ;
      A703PrdDscTec = "" ;
      A737PrdUcpDsc = "" ;
      n737PrdUcpDsc = false ;
      A736PrdUcoDsc = "" ;
      n736PrdUcoDsc = false ;
      A857ValDsc = "" ;
      n857ValDsc = false ;
      A730PrdSit = (byte)(0) ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A835TipDtoCod = (byte)(0) ;
      n835TipDtoCod = false ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      n837TipDtoDto = false ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A731PrdStkMinD = (short)(0) ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A699PrdDiaRot = (short)(0) ;
      A722PrdPlaEnt = (short)(0) ;
      A629MetCod = (byte)(0) ;
      n629MetCod = false ;
      A630MetDsc = "" ;
      n630MetDsc = false ;
      A716PrdLotMin = (short)(0) ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      A712PrdFulCC = GXutil.nullDate() ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      A738PrdUltCCC = (short)(0) ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      A695PrdConCC = (short)(0) ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      A708PrdFecEnt = GXutil.nullDate() ;
      A1193PrdPosX = (short)(0) ;
      A1194PrdPosY = (byte)(0) ;
      A1644PrdDqo = (short)(0) ;
      A3273PrdTnq = (byte)(0) ;
      A4692PrdNom2 = "" ;
      A4693PrdNum2 = "" ;
      A4694PrdObs = "" ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A6301TipPrdCod = (short)(0) ;
      n6301TipPrdCod = false ;
      A6302TipPrdDsc = "" ;
      n6302TipPrdDsc = false ;
      A6191PrdNumCent = "" ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      A7260PrdHorMad = (byte)(0) ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A8936PrdSal = "" ;
      A9609SubFamCod = (byte)(0) ;
      n9609SubFamCod = false ;
      A9610SubFamDsc = "" ;
      n9610SubFamDsc = false ;
      A9731PrdInc = "" ;
      A9732PrdComp = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A9734PrdNCAS = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9742PrdFHS = GXutil.nullDate() ;
      A10119PrdColIdx = "" ;
      A10881PrdLote = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11196PrdNroCAS = "" ;
      A11470PrdConct = (short)(0) ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
      A12714PrdFabId = 0 ;
      n12714PrdFabId = false ;
      A12715PrdFabNm = "" ;
      n12715PrdFabNm = false ;
      A13232PrdRGB = 0 ;
      A13302PrdTHELIST = "" ;
      n13302PrdTHELIST = false ;
      A13457PrdUbicaci = "" ;
      A13969PrdGruFamI = (byte)(0) ;
      n13969PrdGruFamI = false ;
      A13970PrdMatSeca = DecimalUtil.ZERO ;
      n13970PrdMatSeca = false ;
      A13927AlmPrdID = (short)(0) ;
      n13927AlmPrdID = false ;
      A13971PrdLoteFch = GXutil.nullDate() ;
      n13971PrdLoteFch = false ;
      A13972PrdFTdoc = "" ;
      n13972PrdFTdoc = false ;
      A13973PrdFSdoc = "" ;
      n13973PrdFSdoc = false ;
      A742PrdUniCom = (byte)(1) ;
      A743PrdUniCon = (byte)(1) ;
      A707PrdFacCon = DecimalUtil.doubleToDec(1) ;
      A856ValCod = (byte)(1) ;
      A727PrdRec = httpContext.getMessage( "N", "") ;
      A682PrdCalNec = httpContext.getMessage( "S", "") ;
      A698PrdDetPar = httpContext.getMessage( "N", "") ;
      A696PrdConDia = DecimalUtil.doubleToDec(1) ;
      A1643PrdTip = httpContext.getMessage( "M", "") ;
      A3004PrdRev = httpContext.getMessage( "N", "") ;
      A4338PrdUMeFo = (byte)(1) ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5418PrdSalM = httpContext.getMessage( "N", "") ;
      A9739PrdFT = httpContext.getMessage( "N", "") ;
      A9741PrdHS = httpContext.getMessage( "N", "") ;
      A5888PrdOkotex = httpContext.getMessage( "N", "") ;
      A5887PrdReach = httpContext.getMessage( "N", "") ;
      A11363PrdGots = httpContext.getMessage( "N", "") ;
      A11364PrdHm = httpContext.getMessage( "N", "") ;
      A11687PrdList = httpContext.getMessage( "N", "") ;
      A12957PrdLoteOb = httpContext.getMessage( "N", "") ;
      A13301PrdZDHC = httpContext.getMessage( "N", "") ;
      A3936PrdEqLP = " " ;
      A8896PrdPesCon = (byte)(1) ;
      A13968PrdCantAtM = (short)(0) ;
      n13968PrdCantAtM = false ;
      A13974PrdGRS = httpContext.getMessage( "N", "") ;
      n13974PrdGRS = false ;
      O13302PrdTHELIST = A13302PrdTHELIST ;
      n13302PrdTHELIST = false ;
      O732PrdStkMinU = A732PrdStkMinU ;
      O10881PrdLote = A10881PrdLote ;
      O718PrdNom = A718PrdNom ;
      O724PrdPreAct = A724PrdPreAct ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      Z8897PrdPesTerm = "" ;
      Z718PrdNom = "" ;
      Z728PrdRefPrv = "" ;
      Z703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      Z730PrdSit = (byte)(0) ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      Z731PrdStkMinD = (short)(0) ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      Z699PrdDiaRot = (short)(0) ;
      Z722PrdPlaEnt = (short)(0) ;
      Z716PrdLotMin = (short)(0) ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z738PrdUltCCC = (short)(0) ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z695PrdConCC = (short)(0) ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      Z1193PrdPosX = (short)(0) ;
      Z1194PrdPosY = (byte)(0) ;
      Z1643PrdTip = "" ;
      Z1644PrdDqo = (short)(0) ;
      Z3004PrdRev = "" ;
      Z3273PrdTnq = (byte)(0) ;
      Z4692PrdNom2 = "" ;
      Z4693PrdNum2 = "" ;
      Z4694PrdObs = "" ;
      Z4338PrdUMeFo = (byte)(0) ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z5416PrdDensS = DecimalUtil.ZERO ;
      Z5417PrdConcS = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z6191PrdNumCent = "" ;
      Z7226PrdNumct1 = DecimalUtil.ZERO ;
      Z7227PrdNumct2 = DecimalUtil.ZERO ;
      Z7260PrdHorMad = (byte)(0) ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8936PrdSal = "" ;
      Z9731PrdInc = "" ;
      Z9732PrdComp = "" ;
      Z9733PrdAox = DecimalUtil.ZERO ;
      Z9734PrdNCAS = "" ;
      Z9739PrdFT = "" ;
      Z9740PrdFFT = GXutil.nullDate() ;
      Z9741PrdHS = "" ;
      Z9742PrdFHS = GXutil.nullDate() ;
      Z10119PrdColIdx = "" ;
      Z5888PrdOkotex = "" ;
      Z5887PrdReach = "" ;
      Z10881PrdLote = "" ;
      Z10935PrdRTM = "" ;
      Z10936PrdCtw1 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10938PrdCtw3 = "" ;
      Z11663PrdCtw4 = "" ;
      Z11196PrdNroCAS = "" ;
      Z11363PrdGots = "" ;
      Z11364PrdHm = "" ;
      Z11470PrdConct = (short)(0) ;
      Z11614PrdEINECS = "" ;
      Z11615PrdFuncion = "" ;
      Z11616PrdNmQu = "" ;
      Z11687PrdList = "" ;
      Z12957PrdLoteOb = "" ;
      Z13232PrdRGB = 0 ;
      Z13301PrdZDHC = "" ;
      Z13302PrdTHELIST = "" ;
      Z13457PrdUbicaci = "" ;
      Z3936PrdEqLP = "" ;
      Z8896PrdPesCon = (byte)(0) ;
      Z13968PrdCantAtM = (short)(0) ;
      Z13970PrdMatSeca = DecimalUtil.ZERO ;
      Z13971PrdLoteFch = GXutil.nullDate() ;
      Z13972PrdFTdoc = "" ;
      Z13973PrdFSdoc = "" ;
      Z13974PrdGRS = "" ;
      Z13969PrdGruFamI = (byte)(0) ;
      Z629MetCod = (byte)(0) ;
      Z795PrvNum = 0 ;
      Z835TipDtoCod = (byte)(0) ;
      Z742PrdUniCom = (byte)(0) ;
      Z743PrdUniCon = (byte)(0) ;
      Z856ValCod = (byte)(0) ;
      Z6301TipPrdCod = (short)(0) ;
      Z9609SubFamCod = (byte)(0) ;
      Z12714PrdFabId = 0 ;
      Z13927AlmPrdID = (short)(0) ;
   }

   public void initAll1PJ29( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      initializeNonKey1PJ29( ) ;
   }

   public void standaloneModalInsert( )
   {
      A709PrdFecPre = i709PrdFecPre ;
      A5590PrdSolub = i5590PrdSolub ;
      A742PrdUniCom = i742PrdUniCom ;
      A743PrdUniCon = i743PrdUniCon ;
      A856ValCod = i856ValCod ;
      A707PrdFacCon = i707PrdFacCon ;
      A698PrdDetPar = i698PrdDetPar ;
      A682PrdCalNec = i682PrdCalNec ;
      A727PrdRec = i727PrdRec ;
      A696PrdConDia = i696PrdConDia ;
      A1643PrdTip = i1643PrdTip ;
      A3004PrdRev = i3004PrdRev ;
      A4338PrdUMeFo = i4338PrdUMeFo ;
      A5418PrdSalM = i5418PrdSalM ;
      A9739PrdFT = i9739PrdFT ;
      A9741PrdHS = i9741PrdHS ;
      A5887PrdReach = i5887PrdReach ;
      A5888PrdOkotex = i5888PrdOkotex ;
      A11363PrdGots = i11363PrdGots ;
      A11364PrdHm = i11364PrdHm ;
      A11687PrdList = i11687PrdList ;
      A12957PrdLoteOb = i12957PrdLoteOb ;
      A13301PrdZDHC = i13301PrdZDHC ;
      A3936PrdEqLP = i3936PrdEqLP ;
      A13974PrdGRS = i13974PrdGRS ;
      n13974PrdGRS = false ;
      A8896PrdPesCon = i8896PrdPesCon ;
      A13968PrdCantAtM = i13968PrdCantAtM ;
      n13968PrdCantAtM = false ;
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

   public void VarsToRow29( app.stocksquimicos.SdtPRODUC obj29 )
   {
      obj29.setgxTv_SdtPRODUC_Mode( Gx_mode );
      obj29.setgxTv_SdtPRODUC_Emprcod( A396EmprCod );
      obj29.setgxTv_SdtPRODUC_Prdfecpre( A709PrdFecPre );
      obj29.setgxTv_SdtPRODUC_Prdsolub( A5590PrdSolub );
      obj29.setgxTv_SdtPRODUC_Prdpesterm( A8897PrdPesTerm );
      obj29.setgxTv_SdtPRODUC_Prddisponible( A13831PrdDisponi );
      obj29.setgxTv_SdtPRODUC_Prdcdsc( A13747PrdCDsc );
      obj29.setgxTv_SdtPRODUC_Prdescompuesto( A13881PrdEsCompu );
      obj29.setgxTv_SdtPRODUC_Prddiasinactivo( A13871PrdDiasIna );
      obj29.setgxTv_SdtPRODUC_Prdfecultmov( A13872PrdFecUltM );
      obj29.setgxTv_SdtPRODUC_Prdultmovcc( A13873PrdUltMovC );
      obj29.setgxTv_SdtPRODUC_Prdtipmovult( A13874PrdTipMovU );
      obj29.setgxTv_SdtPRODUC_Prdlastlineacc( A13875PrdLastLin );
      obj29.setgxTv_SdtPRODUC_Prdlastfechcc( A13876PrdLastFec );
      obj29.setgxTv_SdtPRODUC_Prdlasttipmovcc( A13877PrdLastTip );
      obj29.setgxTv_SdtPRODUC_Prddiasinmov( A14006PrdDiaSinM );
      obj29.setgxTv_SdtPRODUC_Emprnom( A407EmprNom );
      obj29.setgxTv_SdtPRODUC_Prdnom( A718PrdNom );
      obj29.setgxTv_SdtPRODUC_Prvnum( A795PrvNum );
      obj29.setgxTv_SdtPRODUC_Prvnom( A794PrvNom );
      obj29.setgxTv_SdtPRODUC_Prdrefprv( A728PrdRefPrv );
      obj29.setgxTv_SdtPRODUC_Prddsctec( A703PrdDscTec );
      obj29.setgxTv_SdtPRODUC_Prducpdsc( A737PrdUcpDsc );
      obj29.setgxTv_SdtPRODUC_Prducodsc( A736PrdUcoDsc );
      obj29.setgxTv_SdtPRODUC_Valdsc( A857ValDsc );
      obj29.setgxTv_SdtPRODUC_Prdsit( A730PrdSit );
      obj29.setgxTv_SdtPRODUC_Prdrotrea( A729PrdRotRea );
      obj29.setgxTv_SdtPRODUC_Tipdtocod( A835TipDtoCod );
      obj29.setgxTv_SdtPRODUC_Tipdtodto( A837TipDtoDto );
      obj29.setgxTv_SdtPRODUC_Prdpreact( A724PrdPreAct );
      obj29.setgxTv_SdtPRODUC_Prdpreant( A725PrdPreAnt );
      obj29.setgxTv_SdtPRODUC_Prdpremed( A726PrdPreMed );
      obj29.setgxTv_SdtPRODUC_Prdstkmind( A731PrdStkMinD );
      obj29.setgxTv_SdtPRODUC_Prdstkminu( A732PrdStkMinU );
      obj29.setgxTv_SdtPRODUC_Prddiarot( A699PrdDiaRot );
      obj29.setgxTv_SdtPRODUC_Prdplaent( A722PrdPlaEnt );
      obj29.setgxTv_SdtPRODUC_Metcod( A629MetCod );
      obj29.setgxTv_SdtPRODUC_Metdsc( A630MetDsc );
      obj29.setgxTv_SdtPRODUC_Prdlotmin( A716PrdLotMin );
      obj29.setgxTv_SdtPRODUC_Prdnumuco( A721PrdNumUco );
      obj29.setgxTv_SdtPRODUC_Prdexialm( A704PrdExiAlm );
      obj29.setgxTv_SdtPRODUC_Prdexicc( A705PrdExiCC );
      obj29.setgxTv_SdtPRODUC_Prdcanres( A685PrdCanRes );
      obj29.setgxTv_SdtPRODUC_Prdcanpen( A684PrdCanPen );
      obj29.setgxTv_SdtPRODUC_Prdfulent( A713PrdFulEnt );
      obj29.setgxTv_SdtPRODUC_Prdfulped( A714PrdFulPed );
      obj29.setgxTv_SdtPRODUC_Prdfulcc( A712PrdFulCC );
      obj29.setgxTv_SdtPRODUC_Prdexiccp( A706PrdExiCCP );
      obj29.setgxTv_SdtPRODUC_Prdultecc( A740PrdUltECC );
      obj29.setgxTv_SdtPRODUC_Prdultccc( A738PrdUltCCC );
      obj29.setgxTv_SdtPRODUC_Prdultdcc( A739PrdUltDCC );
      obj29.setgxTv_SdtPRODUC_Prddifcc( A700PrdDifCC );
      obj29.setgxTv_SdtPRODUC_Prdconcc( A695PrdConCC );
      obj29.setgxTv_SdtPRODUC_Prdvalstk( A750PrdValStk );
      obj29.setgxTv_SdtPRODUC_Difvalstk( A332DifValStk );
      obj29.setgxTv_SdtPRODUC_Prdfecent( A708PrdFecEnt );
      obj29.setgxTv_SdtPRODUC_Prdposx( A1193PrdPosX );
      obj29.setgxTv_SdtPRODUC_Prdposy( A1194PrdPosY );
      obj29.setgxTv_SdtPRODUC_Prddqo( A1644PrdDqo );
      obj29.setgxTv_SdtPRODUC_Prdtnq( A3273PrdTnq );
      obj29.setgxTv_SdtPRODUC_Prdnom2( A4692PrdNom2 );
      obj29.setgxTv_SdtPRODUC_Prdnum2( A4693PrdNum2 );
      obj29.setgxTv_SdtPRODUC_Prdobs( A4694PrdObs );
      obj29.setgxTv_SdtPRODUC_Prddenss( A5416PrdDensS );
      obj29.setgxTv_SdtPRODUC_Prdconcs( A5417PrdConcS );
      obj29.setgxTv_SdtPRODUC_Tipprdcod( A6301TipPrdCod );
      obj29.setgxTv_SdtPRODUC_Tipprddsc( A6302TipPrdDsc );
      obj29.setgxTv_SdtPRODUC_Prdnumcentra( A6191PrdNumCent );
      obj29.setgxTv_SdtPRODUC_Prdnumct1( A7226PrdNumct1 );
      obj29.setgxTv_SdtPRODUC_Prdnumct2( A7227PrdNumct2 );
      obj29.setgxTv_SdtPRODUC_Prdhormad( A7260PrdHorMad );
      obj29.setgxTv_SdtPRODUC_Prdexialmc( A8659PrdExiAlmc );
      obj29.setgxTv_SdtPRODUC_Prdsal( A8936PrdSal );
      obj29.setgxTv_SdtPRODUC_Subfamcod( A9609SubFamCod );
      obj29.setgxTv_SdtPRODUC_Subfamdsc( A9610SubFamDsc );
      obj29.setgxTv_SdtPRODUC_Prdinc( A9731PrdInc );
      obj29.setgxTv_SdtPRODUC_Prdcomp( A9732PrdComp );
      obj29.setgxTv_SdtPRODUC_Prdaox( A9733PrdAox );
      obj29.setgxTv_SdtPRODUC_Prdncas( A9734PrdNCAS );
      obj29.setgxTv_SdtPRODUC_Prdfft( A9740PrdFFT );
      obj29.setgxTv_SdtPRODUC_Prdfhs( A9742PrdFHS );
      obj29.setgxTv_SdtPRODUC_Prdcolidx( A10119PrdColIdx );
      obj29.setgxTv_SdtPRODUC_Prdlote( A10881PrdLote );
      obj29.setgxTv_SdtPRODUC_Prdrtm( A10935PrdRTM );
      obj29.setgxTv_SdtPRODUC_Prdctw1( A10936PrdCtw1 );
      obj29.setgxTv_SdtPRODUC_Prdctw2( A10937PrdCtw2 );
      obj29.setgxTv_SdtPRODUC_Prdctw3( A10938PrdCtw3 );
      obj29.setgxTv_SdtPRODUC_Prdctw4( A11663PrdCtw4 );
      obj29.setgxTv_SdtPRODUC_Prdnrocas( A11196PrdNroCAS );
      obj29.setgxTv_SdtPRODUC_Prdconct( A11470PrdConct );
      obj29.setgxTv_SdtPRODUC_Prdeinecs( A11614PrdEINECS );
      obj29.setgxTv_SdtPRODUC_Prdfuncion( A11615PrdFuncion );
      obj29.setgxTv_SdtPRODUC_Prdnmqu( A11616PrdNmQu );
      obj29.setgxTv_SdtPRODUC_Prdfabid( A12714PrdFabId );
      obj29.setgxTv_SdtPRODUC_Prdfabnm( A12715PrdFabNm );
      obj29.setgxTv_SdtPRODUC_Prdrgb( A13232PrdRGB );
      obj29.setgxTv_SdtPRODUC_Prdthelist( A13302PrdTHELIST );
      obj29.setgxTv_SdtPRODUC_Prdubicacion( A13457PrdUbicaci );
      obj29.setgxTv_SdtPRODUC_Prdgrufamid( A13969PrdGruFamI );
      obj29.setgxTv_SdtPRODUC_Prdmatseca( A13970PrdMatSeca );
      obj29.setgxTv_SdtPRODUC_Almprdid( A13927AlmPrdID );
      obj29.setgxTv_SdtPRODUC_Prdlotefch( A13971PrdLoteFch );
      obj29.setgxTv_SdtPRODUC_Prdftdoc( A13972PrdFTdoc );
      obj29.setgxTv_SdtPRODUC_Prdfsdoc( A13973PrdFSdoc );
      obj29.setgxTv_SdtPRODUC_Prdunicom( A742PrdUniCom );
      obj29.setgxTv_SdtPRODUC_Prdunicon( A743PrdUniCon );
      obj29.setgxTv_SdtPRODUC_Prdfaccon( A707PrdFacCon );
      obj29.setgxTv_SdtPRODUC_Valcod( A856ValCod );
      obj29.setgxTv_SdtPRODUC_Prdrec( A727PrdRec );
      obj29.setgxTv_SdtPRODUC_Prdcalnec( A682PrdCalNec );
      obj29.setgxTv_SdtPRODUC_Prddetpar( A698PrdDetPar );
      obj29.setgxTv_SdtPRODUC_Prdcondia( A696PrdConDia );
      obj29.setgxTv_SdtPRODUC_Prdtip( A1643PrdTip );
      obj29.setgxTv_SdtPRODUC_Prdrev( A3004PrdRev );
      obj29.setgxTv_SdtPRODUC_Prdumefo( A4338PrdUMeFo );
      obj29.setgxTv_SdtPRODUC_Prdpreac2( A5255PrdPreAc2 );
      obj29.setgxTv_SdtPRODUC_Prdsalm( A5418PrdSalM );
      obj29.setgxTv_SdtPRODUC_Prdft( A9739PrdFT );
      obj29.setgxTv_SdtPRODUC_Prdhs( A9741PrdHS );
      obj29.setgxTv_SdtPRODUC_Prdokotex( A5888PrdOkotex );
      obj29.setgxTv_SdtPRODUC_Prdreach( A5887PrdReach );
      obj29.setgxTv_SdtPRODUC_Prdgots( A11363PrdGots );
      obj29.setgxTv_SdtPRODUC_Prdhm( A11364PrdHm );
      obj29.setgxTv_SdtPRODUC_Prdlist( A11687PrdList );
      obj29.setgxTv_SdtPRODUC_Prdloteob( A12957PrdLoteOb );
      obj29.setgxTv_SdtPRODUC_Prdzdhc( A13301PrdZDHC );
      obj29.setgxTv_SdtPRODUC_Prdeqlp( A3936PrdEqLP );
      obj29.setgxTv_SdtPRODUC_Prdpescon( A8896PrdPesCon );
      obj29.setgxTv_SdtPRODUC_Prdcantatm( A13968PrdCantAtM );
      obj29.setgxTv_SdtPRODUC_Prdgrs( A13974PrdGRS );
      obj29.setgxTv_SdtPRODUC_Emprcod( A396EmprCod );
      obj29.setgxTv_SdtPRODUC_Prdnum( A719PrdNum );
      obj29.setgxTv_SdtPRODUC_Emprcod_Z( Z396EmprCod );
      obj29.setgxTv_SdtPRODUC_Emprnom_Z( Z407EmprNom );
      obj29.setgxTv_SdtPRODUC_Prdnum_Z( Z719PrdNum );
      obj29.setgxTv_SdtPRODUC_Prdnom_Z( Z718PrdNom );
      obj29.setgxTv_SdtPRODUC_Prvnum_Z( Z795PrvNum );
      obj29.setgxTv_SdtPRODUC_Prvnom_Z( Z794PrvNom );
      obj29.setgxTv_SdtPRODUC_Prdrefprv_Z( Z728PrdRefPrv );
      obj29.setgxTv_SdtPRODUC_Prddsctec_Z( Z703PrdDscTec );
      obj29.setgxTv_SdtPRODUC_Prdunicom_Z( Z742PrdUniCom );
      obj29.setgxTv_SdtPRODUC_Prducpdsc_Z( Z737PrdUcpDsc );
      obj29.setgxTv_SdtPRODUC_Prdunicon_Z( Z743PrdUniCon );
      obj29.setgxTv_SdtPRODUC_Prducodsc_Z( Z736PrdUcoDsc );
      obj29.setgxTv_SdtPRODUC_Prdfaccon_Z( Z707PrdFacCon );
      obj29.setgxTv_SdtPRODUC_Valcod_Z( Z856ValCod );
      obj29.setgxTv_SdtPRODUC_Valdsc_Z( Z857ValDsc );
      obj29.setgxTv_SdtPRODUC_Prdrec_Z( Z727PrdRec );
      obj29.setgxTv_SdtPRODUC_Prdcalnec_Z( Z682PrdCalNec );
      obj29.setgxTv_SdtPRODUC_Prddetpar_Z( Z698PrdDetPar );
      obj29.setgxTv_SdtPRODUC_Prdsit_Z( Z730PrdSit );
      obj29.setgxTv_SdtPRODUC_Prdrotrea_Z( Z729PrdRotRea );
      obj29.setgxTv_SdtPRODUC_Tipdtocod_Z( Z835TipDtoCod );
      obj29.setgxTv_SdtPRODUC_Tipdtodto_Z( Z837TipDtoDto );
      obj29.setgxTv_SdtPRODUC_Prdpreact_Z( Z724PrdPreAct );
      obj29.setgxTv_SdtPRODUC_Prdfecpre_Z( Z709PrdFecPre );
      obj29.setgxTv_SdtPRODUC_Prdpreant_Z( Z725PrdPreAnt );
      obj29.setgxTv_SdtPRODUC_Prdpremed_Z( Z726PrdPreMed );
      obj29.setgxTv_SdtPRODUC_Prdcondia_Z( Z696PrdConDia );
      obj29.setgxTv_SdtPRODUC_Prdstkmind_Z( Z731PrdStkMinD );
      obj29.setgxTv_SdtPRODUC_Prdstkminu_Z( Z732PrdStkMinU );
      obj29.setgxTv_SdtPRODUC_Prddiarot_Z( Z699PrdDiaRot );
      obj29.setgxTv_SdtPRODUC_Prdplaent_Z( Z722PrdPlaEnt );
      obj29.setgxTv_SdtPRODUC_Metcod_Z( Z629MetCod );
      obj29.setgxTv_SdtPRODUC_Metdsc_Z( Z630MetDsc );
      obj29.setgxTv_SdtPRODUC_Prdlotmin_Z( Z716PrdLotMin );
      obj29.setgxTv_SdtPRODUC_Prdnumuco_Z( Z721PrdNumUco );
      obj29.setgxTv_SdtPRODUC_Prdexialm_Z( Z704PrdExiAlm );
      obj29.setgxTv_SdtPRODUC_Prdexicc_Z( Z705PrdExiCC );
      obj29.setgxTv_SdtPRODUC_Prdcanres_Z( Z685PrdCanRes );
      obj29.setgxTv_SdtPRODUC_Prdcanpen_Z( Z684PrdCanPen );
      obj29.setgxTv_SdtPRODUC_Prdfulent_Z( Z713PrdFulEnt );
      obj29.setgxTv_SdtPRODUC_Prdfulped_Z( Z714PrdFulPed );
      obj29.setgxTv_SdtPRODUC_Prdfulcc_Z( Z712PrdFulCC );
      obj29.setgxTv_SdtPRODUC_Prdexiccp_Z( Z706PrdExiCCP );
      obj29.setgxTv_SdtPRODUC_Prdultecc_Z( Z740PrdUltECC );
      obj29.setgxTv_SdtPRODUC_Prdultccc_Z( Z738PrdUltCCC );
      obj29.setgxTv_SdtPRODUC_Prdultdcc_Z( Z739PrdUltDCC );
      obj29.setgxTv_SdtPRODUC_Prddifcc_Z( Z700PrdDifCC );
      obj29.setgxTv_SdtPRODUC_Prdconcc_Z( Z695PrdConCC );
      obj29.setgxTv_SdtPRODUC_Prdvalstk_Z( Z750PrdValStk );
      obj29.setgxTv_SdtPRODUC_Difvalstk_Z( Z332DifValStk );
      obj29.setgxTv_SdtPRODUC_Prdfecent_Z( Z708PrdFecEnt );
      obj29.setgxTv_SdtPRODUC_Prdposx_Z( Z1193PrdPosX );
      obj29.setgxTv_SdtPRODUC_Prdposy_Z( Z1194PrdPosY );
      obj29.setgxTv_SdtPRODUC_Prdtip_Z( Z1643PrdTip );
      obj29.setgxTv_SdtPRODUC_Prddqo_Z( Z1644PrdDqo );
      obj29.setgxTv_SdtPRODUC_Prdrev_Z( Z3004PrdRev );
      obj29.setgxTv_SdtPRODUC_Prdtnq_Z( Z3273PrdTnq );
      obj29.setgxTv_SdtPRODUC_Prdnom2_Z( Z4692PrdNom2 );
      obj29.setgxTv_SdtPRODUC_Prdnum2_Z( Z4693PrdNum2 );
      obj29.setgxTv_SdtPRODUC_Prdobs_Z( Z4694PrdObs );
      obj29.setgxTv_SdtPRODUC_Prdumefo_Z( Z4338PrdUMeFo );
      obj29.setgxTv_SdtPRODUC_Prdpreac2_Z( Z5255PrdPreAc2 );
      obj29.setgxTv_SdtPRODUC_Prddenss_Z( Z5416PrdDensS );
      obj29.setgxTv_SdtPRODUC_Prdconcs_Z( Z5417PrdConcS );
      obj29.setgxTv_SdtPRODUC_Prdsalm_Z( Z5418PrdSalM );
      obj29.setgxTv_SdtPRODUC_Prdsolub_Z( Z5590PrdSolub );
      obj29.setgxTv_SdtPRODUC_Tipprdcod_Z( Z6301TipPrdCod );
      obj29.setgxTv_SdtPRODUC_Tipprddsc_Z( Z6302TipPrdDsc );
      obj29.setgxTv_SdtPRODUC_Prdnumcentra_Z( Z6191PrdNumCent );
      obj29.setgxTv_SdtPRODUC_Prdnumct1_Z( Z7226PrdNumct1 );
      obj29.setgxTv_SdtPRODUC_Prdnumct2_Z( Z7227PrdNumct2 );
      obj29.setgxTv_SdtPRODUC_Prdhormad_Z( Z7260PrdHorMad );
      obj29.setgxTv_SdtPRODUC_Prdexialmc_Z( Z8659PrdExiAlmc );
      obj29.setgxTv_SdtPRODUC_Prdpesterm_Z( Z8897PrdPesTerm );
      obj29.setgxTv_SdtPRODUC_Prdsal_Z( Z8936PrdSal );
      obj29.setgxTv_SdtPRODUC_Subfamcod_Z( Z9609SubFamCod );
      obj29.setgxTv_SdtPRODUC_Subfamdsc_Z( Z9610SubFamDsc );
      obj29.setgxTv_SdtPRODUC_Prdinc_Z( Z9731PrdInc );
      obj29.setgxTv_SdtPRODUC_Prdcomp_Z( Z9732PrdComp );
      obj29.setgxTv_SdtPRODUC_Prdaox_Z( Z9733PrdAox );
      obj29.setgxTv_SdtPRODUC_Prdncas_Z( Z9734PrdNCAS );
      obj29.setgxTv_SdtPRODUC_Prdft_Z( Z9739PrdFT );
      obj29.setgxTv_SdtPRODUC_Prdfft_Z( Z9740PrdFFT );
      obj29.setgxTv_SdtPRODUC_Prdhs_Z( Z9741PrdHS );
      obj29.setgxTv_SdtPRODUC_Prdfhs_Z( Z9742PrdFHS );
      obj29.setgxTv_SdtPRODUC_Prdcolidx_Z( Z10119PrdColIdx );
      obj29.setgxTv_SdtPRODUC_Prdokotex_Z( Z5888PrdOkotex );
      obj29.setgxTv_SdtPRODUC_Prdreach_Z( Z5887PrdReach );
      obj29.setgxTv_SdtPRODUC_Prdlote_Z( Z10881PrdLote );
      obj29.setgxTv_SdtPRODUC_Prdrtm_Z( Z10935PrdRTM );
      obj29.setgxTv_SdtPRODUC_Prdctw1_Z( Z10936PrdCtw1 );
      obj29.setgxTv_SdtPRODUC_Prdctw2_Z( Z10937PrdCtw2 );
      obj29.setgxTv_SdtPRODUC_Prdctw3_Z( Z10938PrdCtw3 );
      obj29.setgxTv_SdtPRODUC_Prdctw4_Z( Z11663PrdCtw4 );
      obj29.setgxTv_SdtPRODUC_Prdnrocas_Z( Z11196PrdNroCAS );
      obj29.setgxTv_SdtPRODUC_Prdgots_Z( Z11363PrdGots );
      obj29.setgxTv_SdtPRODUC_Prdhm_Z( Z11364PrdHm );
      obj29.setgxTv_SdtPRODUC_Prdconct_Z( Z11470PrdConct );
      obj29.setgxTv_SdtPRODUC_Prdeinecs_Z( Z11614PrdEINECS );
      obj29.setgxTv_SdtPRODUC_Prdfuncion_Z( Z11615PrdFuncion );
      obj29.setgxTv_SdtPRODUC_Prdnmqu_Z( Z11616PrdNmQu );
      obj29.setgxTv_SdtPRODUC_Prdlist_Z( Z11687PrdList );
      obj29.setgxTv_SdtPRODUC_Prdfabid_Z( Z12714PrdFabId );
      obj29.setgxTv_SdtPRODUC_Prdfabnm_Z( Z12715PrdFabNm );
      obj29.setgxTv_SdtPRODUC_Prdloteob_Z( Z12957PrdLoteOb );
      obj29.setgxTv_SdtPRODUC_Prdrgb_Z( Z13232PrdRGB );
      obj29.setgxTv_SdtPRODUC_Prdzdhc_Z( Z13301PrdZDHC );
      obj29.setgxTv_SdtPRODUC_Prdthelist_Z( Z13302PrdTHELIST );
      obj29.setgxTv_SdtPRODUC_Prdubicacion_Z( Z13457PrdUbicaci );
      obj29.setgxTv_SdtPRODUC_Prdeqlp_Z( Z3936PrdEqLP );
      obj29.setgxTv_SdtPRODUC_Prdpescon_Z( Z8896PrdPesCon );
      obj29.setgxTv_SdtPRODUC_Prdcantatm_Z( Z13968PrdCantAtM );
      obj29.setgxTv_SdtPRODUC_Prdgrufamid_Z( Z13969PrdGruFamI );
      obj29.setgxTv_SdtPRODUC_Prdmatseca_Z( Z13970PrdMatSeca );
      obj29.setgxTv_SdtPRODUC_Almprdid_Z( Z13927AlmPrdID );
      obj29.setgxTv_SdtPRODUC_Prdlotefch_Z( Z13971PrdLoteFch );
      obj29.setgxTv_SdtPRODUC_Prdftdoc_Z( Z13972PrdFTdoc );
      obj29.setgxTv_SdtPRODUC_Prdfsdoc_Z( Z13973PrdFSdoc );
      obj29.setgxTv_SdtPRODUC_Prdgrs_Z( Z13974PrdGRS );
      obj29.setgxTv_SdtPRODUC_Prdcdsc_Z( Z13747PrdCDsc );
      obj29.setgxTv_SdtPRODUC_Prddisponible_Z( Z13831PrdDisponi );
      obj29.setgxTv_SdtPRODUC_Prddiasinactivo_Z( Z13871PrdDiasIna );
      obj29.setgxTv_SdtPRODUC_Prdultmovcc_Z( Z13873PrdUltMovC );
      obj29.setgxTv_SdtPRODUC_Prdfecultmov_Z( Z13872PrdFecUltM );
      obj29.setgxTv_SdtPRODUC_Prdtipmovult_Z( Z13874PrdTipMovU );
      obj29.setgxTv_SdtPRODUC_Prdlastlineacc_Z( Z13875PrdLastLin );
      obj29.setgxTv_SdtPRODUC_Prdlastfechcc_Z( Z13876PrdLastFec );
      obj29.setgxTv_SdtPRODUC_Prdlasttipmovcc_Z( Z13877PrdLastTip );
      obj29.setgxTv_SdtPRODUC_Prdescompuesto_Z( Z13881PrdEsCompu );
      obj29.setgxTv_SdtPRODUC_Prddiasinmov_Z( Z14006PrdDiaSinM );
      obj29.setgxTv_SdtPRODUC_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdnum_N( (byte)((byte)((n719PrdNum)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prvnom_N( (byte)((byte)((n794PrvNom)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prducpdsc_N( (byte)((byte)((n737PrdUcpDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prducodsc_N( (byte)((byte)((n736PrdUcoDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Valdsc_N( (byte)((byte)((n857ValDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Tipdtocod_N( (byte)((byte)((n835TipDtoCod)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Tipdtodto_N( (byte)((byte)((n837TipDtoDto)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Metcod_N( (byte)((byte)((n629MetCod)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Metdsc_N( (byte)((byte)((n630MetDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Tipprdcod_N( (byte)((byte)((n6301TipPrdCod)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Tipprddsc_N( (byte)((byte)((n6302TipPrdDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Subfamcod_N( (byte)((byte)((n9609SubFamCod)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Subfamdsc_N( (byte)((byte)((n9610SubFamDsc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdfabid_N( (byte)((byte)((n12714PrdFabId)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdfabnm_N( (byte)((byte)((n12715PrdFabNm)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdthelist_N( (byte)((byte)((n13302PrdTHELIST)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdcantatm_N( (byte)((byte)((n13968PrdCantAtM)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdgrufamid_N( (byte)((byte)((n13969PrdGruFamI)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdmatseca_N( (byte)((byte)((n13970PrdMatSeca)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Almprdid_N( (byte)((byte)((n13927AlmPrdID)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdlotefch_N( (byte)((byte)((n13971PrdLoteFch)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdftdoc_N( (byte)((byte)((n13972PrdFTdoc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdfsdoc_N( (byte)((byte)((n13973PrdFSdoc)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdgrs_N( (byte)((byte)((n13974PrdGRS)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Prdlastlineacc_N( (byte)((byte)((n13875PrdLastLin)?1:0)) );
      obj29.setgxTv_SdtPRODUC_Mode( Gx_mode );
   }

   public void KeyVarsToRow29( app.stocksquimicos.SdtPRODUC obj29 )
   {
      obj29.setgxTv_SdtPRODUC_Emprcod( A396EmprCod );
      obj29.setgxTv_SdtPRODUC_Prdnum( A719PrdNum );
   }

   public void RowToVars29( app.stocksquimicos.SdtPRODUC obj29 ,
                            int forceLoad )
   {
      Gx_mode = obj29.getgxTv_SdtPRODUC_Mode() ;
      A396EmprCod = obj29.getgxTv_SdtPRODUC_Emprcod() ;
      A709PrdFecPre = obj29.getgxTv_SdtPRODUC_Prdfecpre() ;
      A5590PrdSolub = obj29.getgxTv_SdtPRODUC_Prdsolub() ;
      if ( ! ( ( obj29.getgxTv_SdtPRODUC_Prdpescon() == 0 ) ) || ( forceLoad == 1 ) )
      {
         A8897PrdPesTerm = obj29.getgxTv_SdtPRODUC_Prdpesterm() ;
      }
      A13831PrdDisponi = obj29.getgxTv_SdtPRODUC_Prddisponible() ;
      A13747PrdCDsc = obj29.getgxTv_SdtPRODUC_Prdcdsc() ;
      A13881PrdEsCompu = obj29.getgxTv_SdtPRODUC_Prdescompuesto() ;
      A13871PrdDiasIna = obj29.getgxTv_SdtPRODUC_Prddiasinactivo() ;
      A13872PrdFecUltM = obj29.getgxTv_SdtPRODUC_Prdfecultmov() ;
      A13873PrdUltMovC = obj29.getgxTv_SdtPRODUC_Prdultmovcc() ;
      A13874PrdTipMovU = obj29.getgxTv_SdtPRODUC_Prdtipmovult() ;
      A13875PrdLastLin = obj29.getgxTv_SdtPRODUC_Prdlastlineacc() ;
      n13875PrdLastLin = false ;
      A13876PrdLastFec = obj29.getgxTv_SdtPRODUC_Prdlastfechcc() ;
      A13877PrdLastTip = obj29.getgxTv_SdtPRODUC_Prdlasttipmovcc() ;
      A14006PrdDiaSinM = obj29.getgxTv_SdtPRODUC_Prddiasinmov() ;
      A407EmprNom = obj29.getgxTv_SdtPRODUC_Emprnom() ;
      n407EmprNom = false ;
      A718PrdNom = obj29.getgxTv_SdtPRODUC_Prdnom() ;
      A795PrvNum = obj29.getgxTv_SdtPRODUC_Prvnum() ;
      A794PrvNom = obj29.getgxTv_SdtPRODUC_Prvnom() ;
      n794PrvNom = false ;
      A728PrdRefPrv = obj29.getgxTv_SdtPRODUC_Prdrefprv() ;
      A703PrdDscTec = obj29.getgxTv_SdtPRODUC_Prddsctec() ;
      A737PrdUcpDsc = obj29.getgxTv_SdtPRODUC_Prducpdsc() ;
      n737PrdUcpDsc = false ;
      A736PrdUcoDsc = obj29.getgxTv_SdtPRODUC_Prducodsc() ;
      n736PrdUcoDsc = false ;
      A857ValDsc = obj29.getgxTv_SdtPRODUC_Valdsc() ;
      n857ValDsc = false ;
      A730PrdSit = obj29.getgxTv_SdtPRODUC_Prdsit() ;
      A729PrdRotRea = obj29.getgxTv_SdtPRODUC_Prdrotrea() ;
      A835TipDtoCod = obj29.getgxTv_SdtPRODUC_Tipdtocod() ;
      n835TipDtoCod = false ;
      A837TipDtoDto = obj29.getgxTv_SdtPRODUC_Tipdtodto() ;
      n837TipDtoDto = false ;
      A724PrdPreAct = obj29.getgxTv_SdtPRODUC_Prdpreact() ;
      A725PrdPreAnt = obj29.getgxTv_SdtPRODUC_Prdpreant() ;
      A726PrdPreMed = obj29.getgxTv_SdtPRODUC_Prdpremed() ;
      A731PrdStkMinD = obj29.getgxTv_SdtPRODUC_Prdstkmind() ;
      A732PrdStkMinU = obj29.getgxTv_SdtPRODUC_Prdstkminu() ;
      A699PrdDiaRot = obj29.getgxTv_SdtPRODUC_Prddiarot() ;
      A722PrdPlaEnt = obj29.getgxTv_SdtPRODUC_Prdplaent() ;
      A629MetCod = obj29.getgxTv_SdtPRODUC_Metcod() ;
      n629MetCod = false ;
      A630MetDsc = obj29.getgxTv_SdtPRODUC_Metdsc() ;
      n630MetDsc = false ;
      A716PrdLotMin = obj29.getgxTv_SdtPRODUC_Prdlotmin() ;
      A721PrdNumUco = obj29.getgxTv_SdtPRODUC_Prdnumuco() ;
      A704PrdExiAlm = obj29.getgxTv_SdtPRODUC_Prdexialm() ;
      A705PrdExiCC = obj29.getgxTv_SdtPRODUC_Prdexicc() ;
      A685PrdCanRes = obj29.getgxTv_SdtPRODUC_Prdcanres() ;
      A684PrdCanPen = obj29.getgxTv_SdtPRODUC_Prdcanpen() ;
      A713PrdFulEnt = obj29.getgxTv_SdtPRODUC_Prdfulent() ;
      A714PrdFulPed = obj29.getgxTv_SdtPRODUC_Prdfulped() ;
      A712PrdFulCC = obj29.getgxTv_SdtPRODUC_Prdfulcc() ;
      A706PrdExiCCP = obj29.getgxTv_SdtPRODUC_Prdexiccp() ;
      A740PrdUltECC = obj29.getgxTv_SdtPRODUC_Prdultecc() ;
      A738PrdUltCCC = obj29.getgxTv_SdtPRODUC_Prdultccc() ;
      A739PrdUltDCC = obj29.getgxTv_SdtPRODUC_Prdultdcc() ;
      A700PrdDifCC = obj29.getgxTv_SdtPRODUC_Prddifcc() ;
      A695PrdConCC = obj29.getgxTv_SdtPRODUC_Prdconcc() ;
      A750PrdValStk = obj29.getgxTv_SdtPRODUC_Prdvalstk() ;
      A332DifValStk = obj29.getgxTv_SdtPRODUC_Difvalstk() ;
      A708PrdFecEnt = obj29.getgxTv_SdtPRODUC_Prdfecent() ;
      A1193PrdPosX = obj29.getgxTv_SdtPRODUC_Prdposx() ;
      A1194PrdPosY = obj29.getgxTv_SdtPRODUC_Prdposy() ;
      A1644PrdDqo = obj29.getgxTv_SdtPRODUC_Prddqo() ;
      A3273PrdTnq = obj29.getgxTv_SdtPRODUC_Prdtnq() ;
      A4692PrdNom2 = obj29.getgxTv_SdtPRODUC_Prdnom2() ;
      A4693PrdNum2 = obj29.getgxTv_SdtPRODUC_Prdnum2() ;
      A4694PrdObs = obj29.getgxTv_SdtPRODUC_Prdobs() ;
      A5416PrdDensS = obj29.getgxTv_SdtPRODUC_Prddenss() ;
      A5417PrdConcS = obj29.getgxTv_SdtPRODUC_Prdconcs() ;
      A6301TipPrdCod = obj29.getgxTv_SdtPRODUC_Tipprdcod() ;
      n6301TipPrdCod = false ;
      A6302TipPrdDsc = obj29.getgxTv_SdtPRODUC_Tipprddsc() ;
      n6302TipPrdDsc = false ;
      A6191PrdNumCent = obj29.getgxTv_SdtPRODUC_Prdnumcentra() ;
      A7226PrdNumct1 = obj29.getgxTv_SdtPRODUC_Prdnumct1() ;
      A7227PrdNumct2 = obj29.getgxTv_SdtPRODUC_Prdnumct2() ;
      A7260PrdHorMad = obj29.getgxTv_SdtPRODUC_Prdhormad() ;
      A8659PrdExiAlmc = obj29.getgxTv_SdtPRODUC_Prdexialmc() ;
      A8936PrdSal = obj29.getgxTv_SdtPRODUC_Prdsal() ;
      A9609SubFamCod = obj29.getgxTv_SdtPRODUC_Subfamcod() ;
      n9609SubFamCod = false ;
      A9610SubFamDsc = obj29.getgxTv_SdtPRODUC_Subfamdsc() ;
      n9610SubFamDsc = false ;
      A9731PrdInc = obj29.getgxTv_SdtPRODUC_Prdinc() ;
      A9732PrdComp = obj29.getgxTv_SdtPRODUC_Prdcomp() ;
      A9733PrdAox = obj29.getgxTv_SdtPRODUC_Prdaox() ;
      A9734PrdNCAS = obj29.getgxTv_SdtPRODUC_Prdncas() ;
      A9740PrdFFT = obj29.getgxTv_SdtPRODUC_Prdfft() ;
      A9742PrdFHS = obj29.getgxTv_SdtPRODUC_Prdfhs() ;
      A10119PrdColIdx = obj29.getgxTv_SdtPRODUC_Prdcolidx() ;
      A10881PrdLote = obj29.getgxTv_SdtPRODUC_Prdlote() ;
      A10935PrdRTM = obj29.getgxTv_SdtPRODUC_Prdrtm() ;
      A10936PrdCtw1 = obj29.getgxTv_SdtPRODUC_Prdctw1() ;
      A10937PrdCtw2 = obj29.getgxTv_SdtPRODUC_Prdctw2() ;
      A10938PrdCtw3 = obj29.getgxTv_SdtPRODUC_Prdctw3() ;
      A11663PrdCtw4 = obj29.getgxTv_SdtPRODUC_Prdctw4() ;
      A11196PrdNroCAS = obj29.getgxTv_SdtPRODUC_Prdnrocas() ;
      A11470PrdConct = obj29.getgxTv_SdtPRODUC_Prdconct() ;
      A11614PrdEINECS = obj29.getgxTv_SdtPRODUC_Prdeinecs() ;
      A11615PrdFuncion = obj29.getgxTv_SdtPRODUC_Prdfuncion() ;
      A11616PrdNmQu = obj29.getgxTv_SdtPRODUC_Prdnmqu() ;
      A12714PrdFabId = obj29.getgxTv_SdtPRODUC_Prdfabid() ;
      n12714PrdFabId = false ;
      A12715PrdFabNm = obj29.getgxTv_SdtPRODUC_Prdfabnm() ;
      n12715PrdFabNm = false ;
      A13232PrdRGB = obj29.getgxTv_SdtPRODUC_Prdrgb() ;
      A13302PrdTHELIST = obj29.getgxTv_SdtPRODUC_Prdthelist() ;
      n13302PrdTHELIST = false ;
      A13457PrdUbicaci = obj29.getgxTv_SdtPRODUC_Prdubicacion() ;
      A13969PrdGruFamI = obj29.getgxTv_SdtPRODUC_Prdgrufamid() ;
      n13969PrdGruFamI = false ;
      A13970PrdMatSeca = obj29.getgxTv_SdtPRODUC_Prdmatseca() ;
      n13970PrdMatSeca = false ;
      A13927AlmPrdID = obj29.getgxTv_SdtPRODUC_Almprdid() ;
      n13927AlmPrdID = false ;
      A13971PrdLoteFch = obj29.getgxTv_SdtPRODUC_Prdlotefch() ;
      n13971PrdLoteFch = false ;
      A13972PrdFTdoc = obj29.getgxTv_SdtPRODUC_Prdftdoc() ;
      n13972PrdFTdoc = false ;
      A13973PrdFSdoc = obj29.getgxTv_SdtPRODUC_Prdfsdoc() ;
      n13973PrdFSdoc = false ;
      A742PrdUniCom = obj29.getgxTv_SdtPRODUC_Prdunicom() ;
      A743PrdUniCon = obj29.getgxTv_SdtPRODUC_Prdunicon() ;
      A707PrdFacCon = obj29.getgxTv_SdtPRODUC_Prdfaccon() ;
      A856ValCod = obj29.getgxTv_SdtPRODUC_Valcod() ;
      A727PrdRec = obj29.getgxTv_SdtPRODUC_Prdrec() ;
      A682PrdCalNec = obj29.getgxTv_SdtPRODUC_Prdcalnec() ;
      A698PrdDetPar = obj29.getgxTv_SdtPRODUC_Prddetpar() ;
      A696PrdConDia = obj29.getgxTv_SdtPRODUC_Prdcondia() ;
      A1643PrdTip = obj29.getgxTv_SdtPRODUC_Prdtip() ;
      A3004PrdRev = obj29.getgxTv_SdtPRODUC_Prdrev() ;
      A4338PrdUMeFo = obj29.getgxTv_SdtPRODUC_Prdumefo() ;
      A5255PrdPreAc2 = obj29.getgxTv_SdtPRODUC_Prdpreac2() ;
      A5418PrdSalM = obj29.getgxTv_SdtPRODUC_Prdsalm() ;
      A9739PrdFT = obj29.getgxTv_SdtPRODUC_Prdft() ;
      A9741PrdHS = obj29.getgxTv_SdtPRODUC_Prdhs() ;
      A5888PrdOkotex = obj29.getgxTv_SdtPRODUC_Prdokotex() ;
      A5887PrdReach = obj29.getgxTv_SdtPRODUC_Prdreach() ;
      A11363PrdGots = obj29.getgxTv_SdtPRODUC_Prdgots() ;
      A11364PrdHm = obj29.getgxTv_SdtPRODUC_Prdhm() ;
      A11687PrdList = obj29.getgxTv_SdtPRODUC_Prdlist() ;
      A12957PrdLoteOb = obj29.getgxTv_SdtPRODUC_Prdloteob() ;
      A13301PrdZDHC = obj29.getgxTv_SdtPRODUC_Prdzdhc() ;
      A3936PrdEqLP = obj29.getgxTv_SdtPRODUC_Prdeqlp() ;
      A8896PrdPesCon = obj29.getgxTv_SdtPRODUC_Prdpescon() ;
      A13968PrdCantAtM = obj29.getgxTv_SdtPRODUC_Prdcantatm() ;
      n13968PrdCantAtM = false ;
      A13974PrdGRS = obj29.getgxTv_SdtPRODUC_Prdgrs() ;
      n13974PrdGRS = false ;
      A396EmprCod = obj29.getgxTv_SdtPRODUC_Emprcod() ;
      A719PrdNum = obj29.getgxTv_SdtPRODUC_Prdnum() ;
      n719PrdNum = false ;
      Z396EmprCod = obj29.getgxTv_SdtPRODUC_Emprcod_Z() ;
      Z407EmprNom = obj29.getgxTv_SdtPRODUC_Emprnom_Z() ;
      Z719PrdNum = obj29.getgxTv_SdtPRODUC_Prdnum_Z() ;
      Z718PrdNom = obj29.getgxTv_SdtPRODUC_Prdnom_Z() ;
      O718PrdNom = obj29.getgxTv_SdtPRODUC_Prdnom_Z() ;
      Z795PrvNum = obj29.getgxTv_SdtPRODUC_Prvnum_Z() ;
      Z794PrvNom = obj29.getgxTv_SdtPRODUC_Prvnom_Z() ;
      Z728PrdRefPrv = obj29.getgxTv_SdtPRODUC_Prdrefprv_Z() ;
      Z703PrdDscTec = obj29.getgxTv_SdtPRODUC_Prddsctec_Z() ;
      Z742PrdUniCom = obj29.getgxTv_SdtPRODUC_Prdunicom_Z() ;
      Z737PrdUcpDsc = obj29.getgxTv_SdtPRODUC_Prducpdsc_Z() ;
      Z743PrdUniCon = obj29.getgxTv_SdtPRODUC_Prdunicon_Z() ;
      Z736PrdUcoDsc = obj29.getgxTv_SdtPRODUC_Prducodsc_Z() ;
      Z707PrdFacCon = obj29.getgxTv_SdtPRODUC_Prdfaccon_Z() ;
      Z856ValCod = obj29.getgxTv_SdtPRODUC_Valcod_Z() ;
      Z857ValDsc = obj29.getgxTv_SdtPRODUC_Valdsc_Z() ;
      Z727PrdRec = obj29.getgxTv_SdtPRODUC_Prdrec_Z() ;
      Z682PrdCalNec = obj29.getgxTv_SdtPRODUC_Prdcalnec_Z() ;
      Z698PrdDetPar = obj29.getgxTv_SdtPRODUC_Prddetpar_Z() ;
      Z730PrdSit = obj29.getgxTv_SdtPRODUC_Prdsit_Z() ;
      Z729PrdRotRea = obj29.getgxTv_SdtPRODUC_Prdrotrea_Z() ;
      Z835TipDtoCod = obj29.getgxTv_SdtPRODUC_Tipdtocod_Z() ;
      Z837TipDtoDto = obj29.getgxTv_SdtPRODUC_Tipdtodto_Z() ;
      Z724PrdPreAct = obj29.getgxTv_SdtPRODUC_Prdpreact_Z() ;
      O724PrdPreAct = obj29.getgxTv_SdtPRODUC_Prdpreact_Z() ;
      Z709PrdFecPre = obj29.getgxTv_SdtPRODUC_Prdfecpre_Z() ;
      Z725PrdPreAnt = obj29.getgxTv_SdtPRODUC_Prdpreant_Z() ;
      Z726PrdPreMed = obj29.getgxTv_SdtPRODUC_Prdpremed_Z() ;
      Z696PrdConDia = obj29.getgxTv_SdtPRODUC_Prdcondia_Z() ;
      Z731PrdStkMinD = obj29.getgxTv_SdtPRODUC_Prdstkmind_Z() ;
      Z732PrdStkMinU = obj29.getgxTv_SdtPRODUC_Prdstkminu_Z() ;
      O732PrdStkMinU = obj29.getgxTv_SdtPRODUC_Prdstkminu_Z() ;
      Z699PrdDiaRot = obj29.getgxTv_SdtPRODUC_Prddiarot_Z() ;
      Z722PrdPlaEnt = obj29.getgxTv_SdtPRODUC_Prdplaent_Z() ;
      Z629MetCod = obj29.getgxTv_SdtPRODUC_Metcod_Z() ;
      Z630MetDsc = obj29.getgxTv_SdtPRODUC_Metdsc_Z() ;
      Z716PrdLotMin = obj29.getgxTv_SdtPRODUC_Prdlotmin_Z() ;
      Z721PrdNumUco = obj29.getgxTv_SdtPRODUC_Prdnumuco_Z() ;
      Z704PrdExiAlm = obj29.getgxTv_SdtPRODUC_Prdexialm_Z() ;
      Z705PrdExiCC = obj29.getgxTv_SdtPRODUC_Prdexicc_Z() ;
      Z685PrdCanRes = obj29.getgxTv_SdtPRODUC_Prdcanres_Z() ;
      Z684PrdCanPen = obj29.getgxTv_SdtPRODUC_Prdcanpen_Z() ;
      Z713PrdFulEnt = obj29.getgxTv_SdtPRODUC_Prdfulent_Z() ;
      Z714PrdFulPed = obj29.getgxTv_SdtPRODUC_Prdfulped_Z() ;
      Z712PrdFulCC = obj29.getgxTv_SdtPRODUC_Prdfulcc_Z() ;
      Z706PrdExiCCP = obj29.getgxTv_SdtPRODUC_Prdexiccp_Z() ;
      Z740PrdUltECC = obj29.getgxTv_SdtPRODUC_Prdultecc_Z() ;
      Z738PrdUltCCC = obj29.getgxTv_SdtPRODUC_Prdultccc_Z() ;
      Z739PrdUltDCC = obj29.getgxTv_SdtPRODUC_Prdultdcc_Z() ;
      Z700PrdDifCC = obj29.getgxTv_SdtPRODUC_Prddifcc_Z() ;
      Z695PrdConCC = obj29.getgxTv_SdtPRODUC_Prdconcc_Z() ;
      Z750PrdValStk = obj29.getgxTv_SdtPRODUC_Prdvalstk_Z() ;
      Z332DifValStk = obj29.getgxTv_SdtPRODUC_Difvalstk_Z() ;
      Z708PrdFecEnt = obj29.getgxTv_SdtPRODUC_Prdfecent_Z() ;
      Z1193PrdPosX = obj29.getgxTv_SdtPRODUC_Prdposx_Z() ;
      Z1194PrdPosY = obj29.getgxTv_SdtPRODUC_Prdposy_Z() ;
      Z1643PrdTip = obj29.getgxTv_SdtPRODUC_Prdtip_Z() ;
      Z1644PrdDqo = obj29.getgxTv_SdtPRODUC_Prddqo_Z() ;
      Z3004PrdRev = obj29.getgxTv_SdtPRODUC_Prdrev_Z() ;
      Z3273PrdTnq = obj29.getgxTv_SdtPRODUC_Prdtnq_Z() ;
      Z4692PrdNom2 = obj29.getgxTv_SdtPRODUC_Prdnom2_Z() ;
      Z4693PrdNum2 = obj29.getgxTv_SdtPRODUC_Prdnum2_Z() ;
      Z4694PrdObs = obj29.getgxTv_SdtPRODUC_Prdobs_Z() ;
      Z4338PrdUMeFo = obj29.getgxTv_SdtPRODUC_Prdumefo_Z() ;
      Z5255PrdPreAc2 = obj29.getgxTv_SdtPRODUC_Prdpreac2_Z() ;
      Z5416PrdDensS = obj29.getgxTv_SdtPRODUC_Prddenss_Z() ;
      Z5417PrdConcS = obj29.getgxTv_SdtPRODUC_Prdconcs_Z() ;
      Z5418PrdSalM = obj29.getgxTv_SdtPRODUC_Prdsalm_Z() ;
      Z5590PrdSolub = obj29.getgxTv_SdtPRODUC_Prdsolub_Z() ;
      Z6301TipPrdCod = obj29.getgxTv_SdtPRODUC_Tipprdcod_Z() ;
      Z6302TipPrdDsc = obj29.getgxTv_SdtPRODUC_Tipprddsc_Z() ;
      Z6191PrdNumCent = obj29.getgxTv_SdtPRODUC_Prdnumcentra_Z() ;
      Z7226PrdNumct1 = obj29.getgxTv_SdtPRODUC_Prdnumct1_Z() ;
      Z7227PrdNumct2 = obj29.getgxTv_SdtPRODUC_Prdnumct2_Z() ;
      Z7260PrdHorMad = obj29.getgxTv_SdtPRODUC_Prdhormad_Z() ;
      Z8659PrdExiAlmc = obj29.getgxTv_SdtPRODUC_Prdexialmc_Z() ;
      Z8897PrdPesTerm = obj29.getgxTv_SdtPRODUC_Prdpesterm_Z() ;
      Z8936PrdSal = obj29.getgxTv_SdtPRODUC_Prdsal_Z() ;
      Z9609SubFamCod = obj29.getgxTv_SdtPRODUC_Subfamcod_Z() ;
      Z9610SubFamDsc = obj29.getgxTv_SdtPRODUC_Subfamdsc_Z() ;
      Z9731PrdInc = obj29.getgxTv_SdtPRODUC_Prdinc_Z() ;
      Z9732PrdComp = obj29.getgxTv_SdtPRODUC_Prdcomp_Z() ;
      Z9733PrdAox = obj29.getgxTv_SdtPRODUC_Prdaox_Z() ;
      Z9734PrdNCAS = obj29.getgxTv_SdtPRODUC_Prdncas_Z() ;
      Z9739PrdFT = obj29.getgxTv_SdtPRODUC_Prdft_Z() ;
      Z9740PrdFFT = obj29.getgxTv_SdtPRODUC_Prdfft_Z() ;
      Z9741PrdHS = obj29.getgxTv_SdtPRODUC_Prdhs_Z() ;
      Z9742PrdFHS = obj29.getgxTv_SdtPRODUC_Prdfhs_Z() ;
      Z10119PrdColIdx = obj29.getgxTv_SdtPRODUC_Prdcolidx_Z() ;
      Z5888PrdOkotex = obj29.getgxTv_SdtPRODUC_Prdokotex_Z() ;
      Z5887PrdReach = obj29.getgxTv_SdtPRODUC_Prdreach_Z() ;
      Z10881PrdLote = obj29.getgxTv_SdtPRODUC_Prdlote_Z() ;
      O10881PrdLote = obj29.getgxTv_SdtPRODUC_Prdlote_Z() ;
      Z10935PrdRTM = obj29.getgxTv_SdtPRODUC_Prdrtm_Z() ;
      Z10936PrdCtw1 = obj29.getgxTv_SdtPRODUC_Prdctw1_Z() ;
      Z10937PrdCtw2 = obj29.getgxTv_SdtPRODUC_Prdctw2_Z() ;
      Z10938PrdCtw3 = obj29.getgxTv_SdtPRODUC_Prdctw3_Z() ;
      Z11663PrdCtw4 = obj29.getgxTv_SdtPRODUC_Prdctw4_Z() ;
      Z11196PrdNroCAS = obj29.getgxTv_SdtPRODUC_Prdnrocas_Z() ;
      Z11363PrdGots = obj29.getgxTv_SdtPRODUC_Prdgots_Z() ;
      Z11364PrdHm = obj29.getgxTv_SdtPRODUC_Prdhm_Z() ;
      Z11470PrdConct = obj29.getgxTv_SdtPRODUC_Prdconct_Z() ;
      Z11614PrdEINECS = obj29.getgxTv_SdtPRODUC_Prdeinecs_Z() ;
      Z11615PrdFuncion = obj29.getgxTv_SdtPRODUC_Prdfuncion_Z() ;
      Z11616PrdNmQu = obj29.getgxTv_SdtPRODUC_Prdnmqu_Z() ;
      Z11687PrdList = obj29.getgxTv_SdtPRODUC_Prdlist_Z() ;
      Z12714PrdFabId = obj29.getgxTv_SdtPRODUC_Prdfabid_Z() ;
      Z12715PrdFabNm = obj29.getgxTv_SdtPRODUC_Prdfabnm_Z() ;
      Z12957PrdLoteOb = obj29.getgxTv_SdtPRODUC_Prdloteob_Z() ;
      Z13232PrdRGB = obj29.getgxTv_SdtPRODUC_Prdrgb_Z() ;
      Z13301PrdZDHC = obj29.getgxTv_SdtPRODUC_Prdzdhc_Z() ;
      Z13302PrdTHELIST = obj29.getgxTv_SdtPRODUC_Prdthelist_Z() ;
      O13302PrdTHELIST = obj29.getgxTv_SdtPRODUC_Prdthelist_Z() ;
      Z13457PrdUbicaci = obj29.getgxTv_SdtPRODUC_Prdubicacion_Z() ;
      Z3936PrdEqLP = obj29.getgxTv_SdtPRODUC_Prdeqlp_Z() ;
      Z8896PrdPesCon = obj29.getgxTv_SdtPRODUC_Prdpescon_Z() ;
      Z13968PrdCantAtM = obj29.getgxTv_SdtPRODUC_Prdcantatm_Z() ;
      Z13969PrdGruFamI = obj29.getgxTv_SdtPRODUC_Prdgrufamid_Z() ;
      Z13970PrdMatSeca = obj29.getgxTv_SdtPRODUC_Prdmatseca_Z() ;
      Z13927AlmPrdID = obj29.getgxTv_SdtPRODUC_Almprdid_Z() ;
      Z13971PrdLoteFch = obj29.getgxTv_SdtPRODUC_Prdlotefch_Z() ;
      Z13972PrdFTdoc = obj29.getgxTv_SdtPRODUC_Prdftdoc_Z() ;
      Z13973PrdFSdoc = obj29.getgxTv_SdtPRODUC_Prdfsdoc_Z() ;
      Z13974PrdGRS = obj29.getgxTv_SdtPRODUC_Prdgrs_Z() ;
      Z13747PrdCDsc = obj29.getgxTv_SdtPRODUC_Prdcdsc_Z() ;
      Z13831PrdDisponi = obj29.getgxTv_SdtPRODUC_Prddisponible_Z() ;
      Z13871PrdDiasIna = obj29.getgxTv_SdtPRODUC_Prddiasinactivo_Z() ;
      Z13873PrdUltMovC = obj29.getgxTv_SdtPRODUC_Prdultmovcc_Z() ;
      Z13872PrdFecUltM = obj29.getgxTv_SdtPRODUC_Prdfecultmov_Z() ;
      Z13874PrdTipMovU = obj29.getgxTv_SdtPRODUC_Prdtipmovult_Z() ;
      Z13875PrdLastLin = obj29.getgxTv_SdtPRODUC_Prdlastlineacc_Z() ;
      Z13876PrdLastFec = obj29.getgxTv_SdtPRODUC_Prdlastfechcc_Z() ;
      Z13877PrdLastTip = obj29.getgxTv_SdtPRODUC_Prdlasttipmovcc_Z() ;
      Z13881PrdEsCompu = obj29.getgxTv_SdtPRODUC_Prdescompuesto_Z() ;
      Z14006PrdDiaSinM = obj29.getgxTv_SdtPRODUC_Prddiasinmov_Z() ;
      n407EmprNom = (boolean)((obj29.getgxTv_SdtPRODUC_Emprnom_N()==0)?false:true) ;
      n719PrdNum = (boolean)((obj29.getgxTv_SdtPRODUC_Prdnum_N()==0)?false:true) ;
      n794PrvNom = (boolean)((obj29.getgxTv_SdtPRODUC_Prvnom_N()==0)?false:true) ;
      n737PrdUcpDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Prducpdsc_N()==0)?false:true) ;
      n736PrdUcoDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Prducodsc_N()==0)?false:true) ;
      n857ValDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Valdsc_N()==0)?false:true) ;
      n835TipDtoCod = (boolean)((obj29.getgxTv_SdtPRODUC_Tipdtocod_N()==0)?false:true) ;
      n837TipDtoDto = (boolean)((obj29.getgxTv_SdtPRODUC_Tipdtodto_N()==0)?false:true) ;
      n629MetCod = (boolean)((obj29.getgxTv_SdtPRODUC_Metcod_N()==0)?false:true) ;
      n630MetDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Metdsc_N()==0)?false:true) ;
      n6301TipPrdCod = (boolean)((obj29.getgxTv_SdtPRODUC_Tipprdcod_N()==0)?false:true) ;
      n6302TipPrdDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Tipprddsc_N()==0)?false:true) ;
      n9609SubFamCod = (boolean)((obj29.getgxTv_SdtPRODUC_Subfamcod_N()==0)?false:true) ;
      n9610SubFamDsc = (boolean)((obj29.getgxTv_SdtPRODUC_Subfamdsc_N()==0)?false:true) ;
      n12714PrdFabId = (boolean)((obj29.getgxTv_SdtPRODUC_Prdfabid_N()==0)?false:true) ;
      n12715PrdFabNm = (boolean)((obj29.getgxTv_SdtPRODUC_Prdfabnm_N()==0)?false:true) ;
      n13302PrdTHELIST = (boolean)((obj29.getgxTv_SdtPRODUC_Prdthelist_N()==0)?false:true) ;
      n13968PrdCantAtM = (boolean)((obj29.getgxTv_SdtPRODUC_Prdcantatm_N()==0)?false:true) ;
      n13969PrdGruFamI = (boolean)((obj29.getgxTv_SdtPRODUC_Prdgrufamid_N()==0)?false:true) ;
      n13970PrdMatSeca = (boolean)((obj29.getgxTv_SdtPRODUC_Prdmatseca_N()==0)?false:true) ;
      n13927AlmPrdID = (boolean)((obj29.getgxTv_SdtPRODUC_Almprdid_N()==0)?false:true) ;
      n13971PrdLoteFch = (boolean)((obj29.getgxTv_SdtPRODUC_Prdlotefch_N()==0)?false:true) ;
      n13972PrdFTdoc = (boolean)((obj29.getgxTv_SdtPRODUC_Prdftdoc_N()==0)?false:true) ;
      n13973PrdFSdoc = (boolean)((obj29.getgxTv_SdtPRODUC_Prdfsdoc_N()==0)?false:true) ;
      n13974PrdGRS = (boolean)((obj29.getgxTv_SdtPRODUC_Prdgrs_N()==0)?false:true) ;
      n13875PrdLastLin = (boolean)((obj29.getgxTv_SdtPRODUC_Prdlastlineacc_N()==0)?false:true) ;
      Gx_mode = obj29.getgxTv_SdtPRODUC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A719PrdNum = (String)getParm(obj,1) ;
      n719PrdNum = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1PJ29( ) ;
      scanKeyStart1PJ29( ) ;
      if ( RcdFound29 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01PJ127 */
         pr_default.execute(121, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(121) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01PJ127_A407EmprNom[0] ;
         n407EmprNom = BC01PJ127_n407EmprNom[0] ;
         pr_default.close(121);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         O13302PrdTHELIST = A13302PrdTHELIST ;
         n13302PrdTHELIST = false ;
         O732PrdStkMinU = A732PrdStkMinU ;
         O10881PrdLote = A10881PrdLote ;
         O718PrdNom = A718PrdNom ;
         O724PrdPreAct = A724PrdPreAct ;
      }
      zm1PJ29( -67) ;
      onLoadActions1PJ29( ) ;
      addRow1PJ29( ) ;
      scanKeyEnd1PJ29( ) ;
      if ( RcdFound29 == 0 )
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
      RowToVars29( bcstocksquimicos_PRODUC, 0) ;
      scanKeyStart1PJ29( ) ;
      if ( RcdFound29 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01PJ128 */
         pr_default.execute(122, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(122) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01PJ128_A407EmprNom[0] ;
         n407EmprNom = BC01PJ128_n407EmprNom[0] ;
         pr_default.close(122);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         O13302PrdTHELIST = A13302PrdTHELIST ;
         n13302PrdTHELIST = false ;
         O732PrdStkMinU = A732PrdStkMinU ;
         O10881PrdLote = A10881PrdLote ;
         O718PrdNom = A718PrdNom ;
         O724PrdPreAct = A724PrdPreAct ;
      }
      zm1PJ29( -67) ;
      onLoadActions1PJ29( ) ;
      addRow1PJ29( ) ;
      scanKeyEnd1PJ29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PJ29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1PJ29( ) ;
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
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
               update1PJ29( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
                     insert1PJ29( ) ;
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
                     insert1PJ29( ) ;
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
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
      saveImpl( ) ;
      VarsToRow29( bcstocksquimicos_PRODUC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1PJ29( ) ;
      afterTrn( ) ;
      VarsToRow29( bcstocksquimicos_PRODUC) ;
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
         app.stocksquimicos.SdtPRODUC auxBC = new app.stocksquimicos.SdtPRODUC( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A719PrdNum);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcstocksquimicos_PRODUC);
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
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
      updateImpl( ) ;
      VarsToRow29( bcstocksquimicos_PRODUC) ;
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
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1PJ29( ) ;
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
      VarsToRow29( bcstocksquimicos_PRODUC) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars29( bcstocksquimicos_PRODUC, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1PJ29( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A719PrdNum = Z719PrdNum ;
            n719PrdNum = false ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.produc_bc");
      VarsToRow29( bcstocksquimicos_PRODUC) ;
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
      Gx_mode = bcstocksquimicos_PRODUC.getgxTv_SdtPRODUC_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcstocksquimicos_PRODUC.setgxTv_SdtPRODUC_Mode( Gx_mode );
   }

   public void SetSDT( app.stocksquimicos.SdtPRODUC sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcstocksquimicos_PRODUC )
      {
         bcstocksquimicos_PRODUC = sdt ;
         if ( GXutil.strcmp(bcstocksquimicos_PRODUC.getgxTv_SdtPRODUC_Mode(), "") == 0 )
         {
            bcstocksquimicos_PRODUC.setgxTv_SdtPRODUC_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow29( bcstocksquimicos_PRODUC) ;
         }
         else
         {
            RowToVars29( bcstocksquimicos_PRODUC, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcstocksquimicos_PRODUC.getgxTv_SdtPRODUC_Mode(), "") == 0 )
         {
            bcstocksquimicos_PRODUC.setgxTv_SdtPRODUC_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars29( bcstocksquimicos_PRODUC, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtPRODUC getPRODUC_BC( )
   {
      return bcstocksquimicos_PRODUC ;
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
   public String getPrdLastTip0( String E396EmprCod ,
                                 String E719PrdNum ,
                                 long E13873PrdUltMovC )
   {
      X3345TipMovCc = "" ;
      Gx_first = true ;
      /* Using cursor BC01PJ129 */
      pr_default.execute(123, new Object[] {E396EmprCod, Boolean.valueOf(nA719PrdNum), E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(123) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( BC01PJ129_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3345TipMovCc = BC01PJ129_A3345TipMovCc[0] ;
            if (true) break;
         }
         pr_default.readNext(123);
      }
      pr_default.close(123);
      return X3345TipMovCc ;
   }

   public java.util.Date getPrdLastFec0( String E396EmprCod ,
                                         String E719PrdNum ,
                                         long E13873PrdUltMovC )
   {
      X3348CCStkFec = GXutil.nullDate() ;
      Gx_first = true ;
      /* Using cursor BC01PJ130 */
      pr_default.execute(124, new Object[] {E396EmprCod, Boolean.valueOf(nE719PrdNum), E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(124) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( BC01PJ130_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3348CCStkFec = BC01PJ130_A3348CCStkFec[0] ;
            if (true) break;
         }
         pr_default.readNext(124);
      }
      pr_default.close(124);
      return X3348CCStkFec ;
   }

   public String getPrdTipMovU0( String E396EmprCod ,
                                 String E719PrdNum ,
                                 long E13873PrdUltMovC )
   {
      X3345TipMovCc = " " ;
      Gx_first = true ;
      /* Using cursor BC01PJ131 */
      pr_default.execute(125, new Object[] {E396EmprCod, Boolean.valueOf(nE719PrdNum), E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(125) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( BC01PJ131_A3342CCStkLin[0] == E13873PrdUltMovC ) && ( GXutil.strcmp(BC01PJ131_A3345TipMovCc[0], httpContext.getMessage( "SR", "")) != 0 ) )
         {
            X3345TipMovCc = BC01PJ131_A3345TipMovCc[0] ;
            if (true) break;
         }
         pr_default.readNext(125);
      }
      pr_default.close(125);
      return X3345TipMovCc ;
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
      AV9Station = "" ;
      AV47EmprNom = "" ;
      AV8Usurcod = "" ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      AV51EmprCod = "" ;
      AV53WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV54TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV55WebSession = httpContext.getWebSession();
      AV82Pgmname = "" ;
      AV65TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      A13302PrdTHELIST = "" ;
      AV11OldPrdTHELIST = "" ;
      A718PrdNom = "" ;
      Z709PrdFecPre = GXutil.nullDate() ;
      A709PrdFecPre = GXutil.nullDate() ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      Z8897PrdPesTerm = "" ;
      A8897PrdPesTerm = "" ;
      Z718PrdNom = "" ;
      Z728PrdRefPrv = "" ;
      A728PrdRefPrv = "" ;
      Z703PrdDscTec = "" ;
      A703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      A727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      A682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      A698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      A713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      A712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      A708PrdFecEnt = GXutil.nullDate() ;
      Z1643PrdTip = "" ;
      A1643PrdTip = "" ;
      Z3004PrdRev = "" ;
      A3004PrdRev = "" ;
      Z4692PrdNom2 = "" ;
      A4692PrdNom2 = "" ;
      Z4693PrdNum2 = "" ;
      A4693PrdNum2 = "" ;
      Z4694PrdObs = "" ;
      A4694PrdObs = "" ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z5416PrdDensS = DecimalUtil.ZERO ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      Z5417PrdConcS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      A5418PrdSalM = "" ;
      Z6191PrdNumCent = "" ;
      A6191PrdNumCent = "" ;
      Z7226PrdNumct1 = DecimalUtil.ZERO ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      Z7227PrdNumct2 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8936PrdSal = "" ;
      A8936PrdSal = "" ;
      Z9731PrdInc = "" ;
      A9731PrdInc = "" ;
      Z9732PrdComp = "" ;
      A9732PrdComp = "" ;
      Z9733PrdAox = DecimalUtil.ZERO ;
      A9733PrdAox = DecimalUtil.ZERO ;
      Z9734PrdNCAS = "" ;
      A9734PrdNCAS = "" ;
      Z9739PrdFT = "" ;
      A9739PrdFT = "" ;
      Z9740PrdFFT = GXutil.nullDate() ;
      A9740PrdFFT = GXutil.nullDate() ;
      Z9741PrdHS = "" ;
      A9741PrdHS = "" ;
      Z9742PrdFHS = GXutil.nullDate() ;
      A9742PrdFHS = GXutil.nullDate() ;
      Z10119PrdColIdx = "" ;
      A10119PrdColIdx = "" ;
      Z5888PrdOkotex = "" ;
      A5888PrdOkotex = "" ;
      Z5887PrdReach = "" ;
      A5887PrdReach = "" ;
      Z10881PrdLote = "" ;
      A10881PrdLote = "" ;
      Z10935PrdRTM = "" ;
      A10935PrdRTM = "" ;
      Z10936PrdCtw1 = "" ;
      A10936PrdCtw1 = "" ;
      Z10937PrdCtw2 = "" ;
      A10937PrdCtw2 = "" ;
      Z10938PrdCtw3 = "" ;
      A10938PrdCtw3 = "" ;
      Z11663PrdCtw4 = "" ;
      A11663PrdCtw4 = "" ;
      Z11196PrdNroCAS = "" ;
      A11196PrdNroCAS = "" ;
      Z11363PrdGots = "" ;
      A11363PrdGots = "" ;
      Z11364PrdHm = "" ;
      A11364PrdHm = "" ;
      Z11614PrdEINECS = "" ;
      A11614PrdEINECS = "" ;
      Z11615PrdFuncion = "" ;
      A11615PrdFuncion = "" ;
      Z11616PrdNmQu = "" ;
      A11616PrdNmQu = "" ;
      Z11687PrdList = "" ;
      A11687PrdList = "" ;
      Z12957PrdLoteOb = "" ;
      A12957PrdLoteOb = "" ;
      Z13301PrdZDHC = "" ;
      A13301PrdZDHC = "" ;
      Z13302PrdTHELIST = "" ;
      Z13457PrdUbicaci = "" ;
      A13457PrdUbicaci = "" ;
      Z3936PrdEqLP = "" ;
      A3936PrdEqLP = "" ;
      Z13970PrdMatSeca = DecimalUtil.ZERO ;
      A13970PrdMatSeca = DecimalUtil.ZERO ;
      Z13971PrdLoteFch = GXutil.nullDate() ;
      A13971PrdLoteFch = GXutil.nullDate() ;
      Z13972PrdFTdoc = "" ;
      A13972PrdFTdoc = "" ;
      Z13973PrdFSdoc = "" ;
      A13973PrdFSdoc = "" ;
      Z13974PrdGRS = "" ;
      A13974PrdGRS = "" ;
      Z13747PrdCDsc = "" ;
      A13747PrdCDsc = "" ;
      Z13831PrdDisponi = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      Z13872PrdFecUltM = GXutil.nullDate() ;
      A13872PrdFecUltM = GXutil.nullDate() ;
      Z13874PrdTipMovU = "" ;
      A13874PrdTipMovU = "" ;
      Z13876PrdLastFec = GXutil.nullDate() ;
      A13876PrdLastFec = GXutil.nullDate() ;
      Z13877PrdLastTip = "" ;
      A13877PrdLastTip = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z630MetDsc = "" ;
      A630MetDsc = "" ;
      Z794PrvNom = "" ;
      A794PrvNom = "" ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      Z737PrdUcpDsc = "" ;
      A737PrdUcpDsc = "" ;
      Z736PrdUcoDsc = "" ;
      A736PrdUcoDsc = "" ;
      Z857ValDsc = "" ;
      A857ValDsc = "" ;
      Z6302TipPrdDsc = "" ;
      A6302TipPrdDsc = "" ;
      Z9610SubFamDsc = "" ;
      A9610SubFamDsc = "" ;
      Z12715PrdFabNm = "" ;
      A12715PrdFabNm = "" ;
      BC01PJ19_A13875PrdLastLin = new long[1] ;
      BC01PJ19_n13875PrdLastLin = new boolean[] {false} ;
      BC01PJ20_A407EmprNom = new String[] {""} ;
      BC01PJ20_n407EmprNom = new boolean[] {false} ;
      BC01PJ21_A737PrdUcpDsc = new String[] {""} ;
      BC01PJ21_n737PrdUcpDsc = new boolean[] {false} ;
      BC01PJ22_A736PrdUcoDsc = new String[] {""} ;
      BC01PJ22_n736PrdUcoDsc = new boolean[] {false} ;
      BC01PJ23_A857ValDsc = new String[] {""} ;
      BC01PJ23_n857ValDsc = new boolean[] {false} ;
      BC01PJ25_A8896PrdPesCon = new byte[1] ;
      BC01PJ25_A13968PrdCantAtM = new short[1] ;
      BC01PJ25_n13968PrdCantAtM = new boolean[] {false} ;
      BC01PJ25_A13970PrdMatSeca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_n13970PrdMatSeca = new boolean[] {false} ;
      BC01PJ25_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_n13971PrdLoteFch = new boolean[] {false} ;
      BC01PJ25_A13972PrdFTdoc = new String[] {""} ;
      BC01PJ25_n13972PrdFTdoc = new boolean[] {false} ;
      BC01PJ25_A13973PrdFSdoc = new String[] {""} ;
      BC01PJ25_n13973PrdFSdoc = new boolean[] {false} ;
      BC01PJ25_A13974PrdGRS = new String[] {""} ;
      BC01PJ25_n13974PrdGRS = new boolean[] {false} ;
      BC01PJ25_A396EmprCod = new String[] {""} ;
      BC01PJ25_A13969PrdGruFamI = new byte[1] ;
      BC01PJ25_n13969PrdGruFamI = new boolean[] {false} ;
      BC01PJ25_A629MetCod = new byte[1] ;
      BC01PJ25_n629MetCod = new boolean[] {false} ;
      BC01PJ25_A795PrvNum = new int[1] ;
      BC01PJ25_A835TipDtoCod = new byte[1] ;
      BC01PJ25_n835TipDtoCod = new boolean[] {false} ;
      BC01PJ25_A742PrdUniCom = new byte[1] ;
      BC01PJ25_A743PrdUniCon = new byte[1] ;
      BC01PJ25_A856ValCod = new byte[1] ;
      BC01PJ25_A6301TipPrdCod = new short[1] ;
      BC01PJ25_n6301TipPrdCod = new boolean[] {false} ;
      BC01PJ25_A9609SubFamCod = new byte[1] ;
      BC01PJ25_n9609SubFamCod = new boolean[] {false} ;
      BC01PJ25_A12714PrdFabId = new int[1] ;
      BC01PJ25_n12714PrdFabId = new boolean[] {false} ;
      BC01PJ25_A13927AlmPrdID = new short[1] ;
      BC01PJ25_n13927AlmPrdID = new boolean[] {false} ;
      BC01PJ25_A13875PrdLastLin = new long[1] ;
      BC01PJ25_n13875PrdLastLin = new boolean[] {false} ;
      BC01PJ25_A719PrdNum = new String[] {""} ;
      BC01PJ25_n719PrdNum = new boolean[] {false} ;
      BC01PJ25_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A8897PrdPesTerm = new String[] {""} ;
      BC01PJ25_A407EmprNom = new String[] {""} ;
      BC01PJ25_n407EmprNom = new boolean[] {false} ;
      BC01PJ25_A718PrdNom = new String[] {""} ;
      BC01PJ25_A794PrvNom = new String[] {""} ;
      BC01PJ25_n794PrvNom = new boolean[] {false} ;
      BC01PJ25_A728PrdRefPrv = new String[] {""} ;
      BC01PJ25_A703PrdDscTec = new String[] {""} ;
      BC01PJ25_A737PrdUcpDsc = new String[] {""} ;
      BC01PJ25_n737PrdUcpDsc = new boolean[] {false} ;
      BC01PJ25_A736PrdUcoDsc = new String[] {""} ;
      BC01PJ25_n736PrdUcoDsc = new boolean[] {false} ;
      BC01PJ25_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A857ValDsc = new String[] {""} ;
      BC01PJ25_n857ValDsc = new boolean[] {false} ;
      BC01PJ25_A727PrdRec = new String[] {""} ;
      BC01PJ25_A682PrdCalNec = new String[] {""} ;
      BC01PJ25_A698PrdDetPar = new String[] {""} ;
      BC01PJ25_A730PrdSit = new byte[1] ;
      BC01PJ25_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_n837TipDtoDto = new boolean[] {false} ;
      BC01PJ25_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A731PrdStkMinD = new short[1] ;
      BC01PJ25_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A699PrdDiaRot = new short[1] ;
      BC01PJ25_A722PrdPlaEnt = new short[1] ;
      BC01PJ25_A630MetDsc = new String[] {""} ;
      BC01PJ25_n630MetDsc = new boolean[] {false} ;
      BC01PJ25_A716PrdLotMin = new short[1] ;
      BC01PJ25_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A738PrdUltCCC = new short[1] ;
      BC01PJ25_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A695PrdConCC = new short[1] ;
      BC01PJ25_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A1193PrdPosX = new short[1] ;
      BC01PJ25_A1194PrdPosY = new byte[1] ;
      BC01PJ25_A1643PrdTip = new String[] {""} ;
      BC01PJ25_A1644PrdDqo = new short[1] ;
      BC01PJ25_A3004PrdRev = new String[] {""} ;
      BC01PJ25_A3273PrdTnq = new byte[1] ;
      BC01PJ25_A4692PrdNom2 = new String[] {""} ;
      BC01PJ25_A4693PrdNum2 = new String[] {""} ;
      BC01PJ25_A4694PrdObs = new String[] {""} ;
      BC01PJ25_A4338PrdUMeFo = new byte[1] ;
      BC01PJ25_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A5418PrdSalM = new String[] {""} ;
      BC01PJ25_A6302TipPrdDsc = new String[] {""} ;
      BC01PJ25_n6302TipPrdDsc = new boolean[] {false} ;
      BC01PJ25_A6191PrdNumCent = new String[] {""} ;
      BC01PJ25_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A7260PrdHorMad = new byte[1] ;
      BC01PJ25_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A8936PrdSal = new String[] {""} ;
      BC01PJ25_A9610SubFamDsc = new String[] {""} ;
      BC01PJ25_n9610SubFamDsc = new boolean[] {false} ;
      BC01PJ25_A9731PrdInc = new String[] {""} ;
      BC01PJ25_A9732PrdComp = new String[] {""} ;
      BC01PJ25_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ25_A9734PrdNCAS = new String[] {""} ;
      BC01PJ25_A9739PrdFT = new String[] {""} ;
      BC01PJ25_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A9741PrdHS = new String[] {""} ;
      BC01PJ25_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ25_A10119PrdColIdx = new String[] {""} ;
      BC01PJ25_A5888PrdOkotex = new String[] {""} ;
      BC01PJ25_A5887PrdReach = new String[] {""} ;
      BC01PJ25_A10881PrdLote = new String[] {""} ;
      BC01PJ25_A10935PrdRTM = new String[] {""} ;
      BC01PJ25_A10936PrdCtw1 = new String[] {""} ;
      BC01PJ25_A10937PrdCtw2 = new String[] {""} ;
      BC01PJ25_A10938PrdCtw3 = new String[] {""} ;
      BC01PJ25_A11663PrdCtw4 = new String[] {""} ;
      BC01PJ25_A11196PrdNroCAS = new String[] {""} ;
      BC01PJ25_A11363PrdGots = new String[] {""} ;
      BC01PJ25_A11364PrdHm = new String[] {""} ;
      BC01PJ25_A11470PrdConct = new short[1] ;
      BC01PJ25_A11614PrdEINECS = new String[] {""} ;
      BC01PJ25_A11615PrdFuncion = new String[] {""} ;
      BC01PJ25_A11616PrdNmQu = new String[] {""} ;
      BC01PJ25_A11687PrdList = new String[] {""} ;
      BC01PJ25_A12715PrdFabNm = new String[] {""} ;
      BC01PJ25_n12715PrdFabNm = new boolean[] {false} ;
      BC01PJ25_A12957PrdLoteOb = new String[] {""} ;
      BC01PJ25_A13232PrdRGB = new long[1] ;
      BC01PJ25_A13301PrdZDHC = new String[] {""} ;
      BC01PJ25_A13302PrdTHELIST = new String[] {""} ;
      BC01PJ25_n13302PrdTHELIST = new boolean[] {false} ;
      BC01PJ25_A13457PrdUbicaci = new String[] {""} ;
      BC01PJ25_A3936PrdEqLP = new String[] {""} ;
      AV7Prdpreact = DecimalUtil.ZERO ;
      O724PrdPreAct = DecimalUtil.ZERO ;
      AV10oldPrdStkMinU = DecimalUtil.ZERO ;
      O732PrdStkMinU = DecimalUtil.ZERO ;
      AV49Msg_e = "" ;
      O718PrdNom = "" ;
      O10881PrdLote = "" ;
      O13302PrdTHELIST = "" ;
      BC01PJ26_A396EmprCod = new String[] {""} ;
      BC01PJ27_A630MetDsc = new String[] {""} ;
      BC01PJ27_n630MetDsc = new boolean[] {false} ;
      BC01PJ28_A794PrvNom = new String[] {""} ;
      BC01PJ28_n794PrvNom = new boolean[] {false} ;
      BC01PJ29_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ29_n837TipDtoDto = new boolean[] {false} ;
      BC01PJ30_A737PrdUcpDsc = new String[] {""} ;
      BC01PJ30_n737PrdUcpDsc = new boolean[] {false} ;
      BC01PJ31_A736PrdUcoDsc = new String[] {""} ;
      BC01PJ31_n736PrdUcoDsc = new boolean[] {false} ;
      BC01PJ32_A857ValDsc = new String[] {""} ;
      BC01PJ32_n857ValDsc = new boolean[] {false} ;
      BC01PJ33_A6302TipPrdDsc = new String[] {""} ;
      BC01PJ33_n6302TipPrdDsc = new boolean[] {false} ;
      BC01PJ34_A9610SubFamDsc = new String[] {""} ;
      BC01PJ34_n9610SubFamDsc = new boolean[] {false} ;
      BC01PJ35_A12715PrdFabNm = new String[] {""} ;
      BC01PJ35_n12715PrdFabNm = new boolean[] {false} ;
      BC01PJ36_A396EmprCod = new String[] {""} ;
      GXv_char9 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BC01PJ37_A396EmprCod = new String[] {""} ;
      BC01PJ37_A719PrdNum = new String[] {""} ;
      BC01PJ37_n719PrdNum = new boolean[] {false} ;
      BC01PJ38_A8896PrdPesCon = new byte[1] ;
      BC01PJ38_A13968PrdCantAtM = new short[1] ;
      BC01PJ38_n13968PrdCantAtM = new boolean[] {false} ;
      BC01PJ38_A13970PrdMatSeca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_n13970PrdMatSeca = new boolean[] {false} ;
      BC01PJ38_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_n13971PrdLoteFch = new boolean[] {false} ;
      BC01PJ38_A13972PrdFTdoc = new String[] {""} ;
      BC01PJ38_n13972PrdFTdoc = new boolean[] {false} ;
      BC01PJ38_A13973PrdFSdoc = new String[] {""} ;
      BC01PJ38_n13973PrdFSdoc = new boolean[] {false} ;
      BC01PJ38_A13974PrdGRS = new String[] {""} ;
      BC01PJ38_n13974PrdGRS = new boolean[] {false} ;
      BC01PJ38_A396EmprCod = new String[] {""} ;
      BC01PJ38_A13969PrdGruFamI = new byte[1] ;
      BC01PJ38_n13969PrdGruFamI = new boolean[] {false} ;
      BC01PJ38_A629MetCod = new byte[1] ;
      BC01PJ38_n629MetCod = new boolean[] {false} ;
      BC01PJ38_A795PrvNum = new int[1] ;
      BC01PJ38_A835TipDtoCod = new byte[1] ;
      BC01PJ38_n835TipDtoCod = new boolean[] {false} ;
      BC01PJ38_A742PrdUniCom = new byte[1] ;
      BC01PJ38_A743PrdUniCon = new byte[1] ;
      BC01PJ38_A856ValCod = new byte[1] ;
      BC01PJ38_A6301TipPrdCod = new short[1] ;
      BC01PJ38_n6301TipPrdCod = new boolean[] {false} ;
      BC01PJ38_A9609SubFamCod = new byte[1] ;
      BC01PJ38_n9609SubFamCod = new boolean[] {false} ;
      BC01PJ38_A12714PrdFabId = new int[1] ;
      BC01PJ38_n12714PrdFabId = new boolean[] {false} ;
      BC01PJ38_A13927AlmPrdID = new short[1] ;
      BC01PJ38_n13927AlmPrdID = new boolean[] {false} ;
      BC01PJ38_A719PrdNum = new String[] {""} ;
      BC01PJ38_n719PrdNum = new boolean[] {false} ;
      BC01PJ38_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A8897PrdPesTerm = new String[] {""} ;
      BC01PJ38_A718PrdNom = new String[] {""} ;
      BC01PJ38_A728PrdRefPrv = new String[] {""} ;
      BC01PJ38_A703PrdDscTec = new String[] {""} ;
      BC01PJ38_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A727PrdRec = new String[] {""} ;
      BC01PJ38_A682PrdCalNec = new String[] {""} ;
      BC01PJ38_A698PrdDetPar = new String[] {""} ;
      BC01PJ38_A730PrdSit = new byte[1] ;
      BC01PJ38_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A731PrdStkMinD = new short[1] ;
      BC01PJ38_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A699PrdDiaRot = new short[1] ;
      BC01PJ38_A722PrdPlaEnt = new short[1] ;
      BC01PJ38_A716PrdLotMin = new short[1] ;
      BC01PJ38_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A738PrdUltCCC = new short[1] ;
      BC01PJ38_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A695PrdConCC = new short[1] ;
      BC01PJ38_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A1193PrdPosX = new short[1] ;
      BC01PJ38_A1194PrdPosY = new byte[1] ;
      BC01PJ38_A1643PrdTip = new String[] {""} ;
      BC01PJ38_A1644PrdDqo = new short[1] ;
      BC01PJ38_A3004PrdRev = new String[] {""} ;
      BC01PJ38_A3273PrdTnq = new byte[1] ;
      BC01PJ38_A4692PrdNom2 = new String[] {""} ;
      BC01PJ38_A4693PrdNum2 = new String[] {""} ;
      BC01PJ38_A4694PrdObs = new String[] {""} ;
      BC01PJ38_A4338PrdUMeFo = new byte[1] ;
      BC01PJ38_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A5418PrdSalM = new String[] {""} ;
      BC01PJ38_A6191PrdNumCent = new String[] {""} ;
      BC01PJ38_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A7260PrdHorMad = new byte[1] ;
      BC01PJ38_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A8936PrdSal = new String[] {""} ;
      BC01PJ38_A9731PrdInc = new String[] {""} ;
      BC01PJ38_A9732PrdComp = new String[] {""} ;
      BC01PJ38_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ38_A9734PrdNCAS = new String[] {""} ;
      BC01PJ38_A9739PrdFT = new String[] {""} ;
      BC01PJ38_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A9741PrdHS = new String[] {""} ;
      BC01PJ38_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ38_A10119PrdColIdx = new String[] {""} ;
      BC01PJ38_A5888PrdOkotex = new String[] {""} ;
      BC01PJ38_A5887PrdReach = new String[] {""} ;
      BC01PJ38_A10881PrdLote = new String[] {""} ;
      BC01PJ38_A10935PrdRTM = new String[] {""} ;
      BC01PJ38_A10936PrdCtw1 = new String[] {""} ;
      BC01PJ38_A10937PrdCtw2 = new String[] {""} ;
      BC01PJ38_A10938PrdCtw3 = new String[] {""} ;
      BC01PJ38_A11663PrdCtw4 = new String[] {""} ;
      BC01PJ38_A11196PrdNroCAS = new String[] {""} ;
      BC01PJ38_A11363PrdGots = new String[] {""} ;
      BC01PJ38_A11364PrdHm = new String[] {""} ;
      BC01PJ38_A11470PrdConct = new short[1] ;
      BC01PJ38_A11614PrdEINECS = new String[] {""} ;
      BC01PJ38_A11615PrdFuncion = new String[] {""} ;
      BC01PJ38_A11616PrdNmQu = new String[] {""} ;
      BC01PJ38_A11687PrdList = new String[] {""} ;
      BC01PJ38_A12957PrdLoteOb = new String[] {""} ;
      BC01PJ38_A13232PrdRGB = new long[1] ;
      BC01PJ38_A13301PrdZDHC = new String[] {""} ;
      BC01PJ38_A13302PrdTHELIST = new String[] {""} ;
      BC01PJ38_n13302PrdTHELIST = new boolean[] {false} ;
      BC01PJ38_A13457PrdUbicaci = new String[] {""} ;
      BC01PJ38_A3936PrdEqLP = new String[] {""} ;
      sMode29 = "" ;
      BC01PJ39_A8896PrdPesCon = new byte[1] ;
      BC01PJ39_A13968PrdCantAtM = new short[1] ;
      BC01PJ39_n13968PrdCantAtM = new boolean[] {false} ;
      BC01PJ39_A13970PrdMatSeca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_n13970PrdMatSeca = new boolean[] {false} ;
      BC01PJ39_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_n13971PrdLoteFch = new boolean[] {false} ;
      BC01PJ39_A13972PrdFTdoc = new String[] {""} ;
      BC01PJ39_n13972PrdFTdoc = new boolean[] {false} ;
      BC01PJ39_A13973PrdFSdoc = new String[] {""} ;
      BC01PJ39_n13973PrdFSdoc = new boolean[] {false} ;
      BC01PJ39_A13974PrdGRS = new String[] {""} ;
      BC01PJ39_n13974PrdGRS = new boolean[] {false} ;
      BC01PJ39_A396EmprCod = new String[] {""} ;
      BC01PJ39_A13969PrdGruFamI = new byte[1] ;
      BC01PJ39_n13969PrdGruFamI = new boolean[] {false} ;
      BC01PJ39_A629MetCod = new byte[1] ;
      BC01PJ39_n629MetCod = new boolean[] {false} ;
      BC01PJ39_A795PrvNum = new int[1] ;
      BC01PJ39_A835TipDtoCod = new byte[1] ;
      BC01PJ39_n835TipDtoCod = new boolean[] {false} ;
      BC01PJ39_A742PrdUniCom = new byte[1] ;
      BC01PJ39_A743PrdUniCon = new byte[1] ;
      BC01PJ39_A856ValCod = new byte[1] ;
      BC01PJ39_A6301TipPrdCod = new short[1] ;
      BC01PJ39_n6301TipPrdCod = new boolean[] {false} ;
      BC01PJ39_A9609SubFamCod = new byte[1] ;
      BC01PJ39_n9609SubFamCod = new boolean[] {false} ;
      BC01PJ39_A12714PrdFabId = new int[1] ;
      BC01PJ39_n12714PrdFabId = new boolean[] {false} ;
      BC01PJ39_A13927AlmPrdID = new short[1] ;
      BC01PJ39_n13927AlmPrdID = new boolean[] {false} ;
      BC01PJ39_A719PrdNum = new String[] {""} ;
      BC01PJ39_n719PrdNum = new boolean[] {false} ;
      BC01PJ39_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A8897PrdPesTerm = new String[] {""} ;
      BC01PJ39_A718PrdNom = new String[] {""} ;
      BC01PJ39_A728PrdRefPrv = new String[] {""} ;
      BC01PJ39_A703PrdDscTec = new String[] {""} ;
      BC01PJ39_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A727PrdRec = new String[] {""} ;
      BC01PJ39_A682PrdCalNec = new String[] {""} ;
      BC01PJ39_A698PrdDetPar = new String[] {""} ;
      BC01PJ39_A730PrdSit = new byte[1] ;
      BC01PJ39_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A731PrdStkMinD = new short[1] ;
      BC01PJ39_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A699PrdDiaRot = new short[1] ;
      BC01PJ39_A722PrdPlaEnt = new short[1] ;
      BC01PJ39_A716PrdLotMin = new short[1] ;
      BC01PJ39_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A738PrdUltCCC = new short[1] ;
      BC01PJ39_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A695PrdConCC = new short[1] ;
      BC01PJ39_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A1193PrdPosX = new short[1] ;
      BC01PJ39_A1194PrdPosY = new byte[1] ;
      BC01PJ39_A1643PrdTip = new String[] {""} ;
      BC01PJ39_A1644PrdDqo = new short[1] ;
      BC01PJ39_A3004PrdRev = new String[] {""} ;
      BC01PJ39_A3273PrdTnq = new byte[1] ;
      BC01PJ39_A4692PrdNom2 = new String[] {""} ;
      BC01PJ39_A4693PrdNum2 = new String[] {""} ;
      BC01PJ39_A4694PrdObs = new String[] {""} ;
      BC01PJ39_A4338PrdUMeFo = new byte[1] ;
      BC01PJ39_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A5418PrdSalM = new String[] {""} ;
      BC01PJ39_A6191PrdNumCent = new String[] {""} ;
      BC01PJ39_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A7260PrdHorMad = new byte[1] ;
      BC01PJ39_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A8936PrdSal = new String[] {""} ;
      BC01PJ39_A9731PrdInc = new String[] {""} ;
      BC01PJ39_A9732PrdComp = new String[] {""} ;
      BC01PJ39_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ39_A9734PrdNCAS = new String[] {""} ;
      BC01PJ39_A9739PrdFT = new String[] {""} ;
      BC01PJ39_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A9741PrdHS = new String[] {""} ;
      BC01PJ39_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ39_A10119PrdColIdx = new String[] {""} ;
      BC01PJ39_A5888PrdOkotex = new String[] {""} ;
      BC01PJ39_A5887PrdReach = new String[] {""} ;
      BC01PJ39_A10881PrdLote = new String[] {""} ;
      BC01PJ39_A10935PrdRTM = new String[] {""} ;
      BC01PJ39_A10936PrdCtw1 = new String[] {""} ;
      BC01PJ39_A10937PrdCtw2 = new String[] {""} ;
      BC01PJ39_A10938PrdCtw3 = new String[] {""} ;
      BC01PJ39_A11663PrdCtw4 = new String[] {""} ;
      BC01PJ39_A11196PrdNroCAS = new String[] {""} ;
      BC01PJ39_A11363PrdGots = new String[] {""} ;
      BC01PJ39_A11364PrdHm = new String[] {""} ;
      BC01PJ39_A11470PrdConct = new short[1] ;
      BC01PJ39_A11614PrdEINECS = new String[] {""} ;
      BC01PJ39_A11615PrdFuncion = new String[] {""} ;
      BC01PJ39_A11616PrdNmQu = new String[] {""} ;
      BC01PJ39_A11687PrdList = new String[] {""} ;
      BC01PJ39_A12957PrdLoteOb = new String[] {""} ;
      BC01PJ39_A13232PrdRGB = new long[1] ;
      BC01PJ39_A13301PrdZDHC = new String[] {""} ;
      BC01PJ39_A13302PrdTHELIST = new String[] {""} ;
      BC01PJ39_n13302PrdTHELIST = new boolean[] {false} ;
      BC01PJ39_A13457PrdUbicaci = new String[] {""} ;
      BC01PJ39_A3936PrdEqLP = new String[] {""} ;
      GXv_char10 = new String[1] ;
      GXv_int16 = new long[1] ;
      GXt_date17 = GXutil.nullDate() ;
      GXv_date18 = new java.util.Date[1] ;
      BC01PJ43_A794PrvNom = new String[] {""} ;
      BC01PJ43_n794PrvNom = new boolean[] {false} ;
      GXv_int14 = new short[1] ;
      BC01PJ44_A737PrdUcpDsc = new String[] {""} ;
      BC01PJ44_n737PrdUcpDsc = new boolean[] {false} ;
      BC01PJ45_A736PrdUcoDsc = new String[] {""} ;
      BC01PJ45_n736PrdUcoDsc = new boolean[] {false} ;
      BC01PJ46_A857ValDsc = new String[] {""} ;
      BC01PJ46_n857ValDsc = new boolean[] {false} ;
      BC01PJ47_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ47_n837TipDtoDto = new boolean[] {false} ;
      BC01PJ48_A630MetDsc = new String[] {""} ;
      BC01PJ48_n630MetDsc = new boolean[] {false} ;
      BC01PJ49_A6302TipPrdDsc = new String[] {""} ;
      BC01PJ49_n6302TipPrdDsc = new boolean[] {false} ;
      BC01PJ50_A9610SubFamDsc = new String[] {""} ;
      BC01PJ50_n9610SubFamDsc = new boolean[] {false} ;
      BC01PJ51_A12715PrdFabNm = new String[] {""} ;
      BC01PJ51_n12715PrdFabNm = new boolean[] {false} ;
      BC01PJ52_A396EmprCod = new String[] {""} ;
      BC01PJ52_A719PrdNum = new String[] {""} ;
      BC01PJ52_n719PrdNum = new boolean[] {false} ;
      BC01PJ52_A13217NormaID = new String[] {""} ;
      BC01PJ53_A396EmprCod = new String[] {""} ;
      BC01PJ53_A719PrdNum = new String[] {""} ;
      BC01PJ53_n719PrdNum = new boolean[] {false} ;
      BC01PJ53_A13586TheList = new String[] {""} ;
      BC01PJ54_A396EmprCod = new String[] {""} ;
      BC01PJ54_A5532Lb_numero = new int[1] ;
      BC01PJ54_A5555Lb_opcion = new String[] {""} ;
      BC01PJ54_A13460Lb_linCP = new short[1] ;
      BC01PJ54_A13458Lb_TipCP = new String[] {""} ;
      BC01PJ55_A396EmprCod = new String[] {""} ;
      BC01PJ55_A13418AlbProID = new int[1] ;
      BC01PJ55_A13442AlbProLine = new short[1] ;
      BC01PJ56_A396EmprCod = new String[] {""} ;
      BC01PJ56_A13324LDESID = new int[1] ;
      BC01PJ56_A13333LDESNPeque = new String[] {""} ;
      BC01PJ56_A13337LDESComb = new String[] {""} ;
      BC01PJ56_A13339LDESFondo = new String[] {""} ;
      BC01PJ56_A13342LDESLinea = new short[1] ;
      BC01PJ57_A396EmprCod = new String[] {""} ;
      BC01PJ57_A13312Lb_NLab = new int[1] ;
      BC01PJ57_A13305Lb_IDVeces = new short[1] ;
      BC01PJ57_A13306Lb_LinID = new short[1] ;
      BC01PJ58_A396EmprCod = new String[] {""} ;
      BC01PJ58_A12673LavMqId = new int[1] ;
      BC01PJ58_A12692LavMqLnPq = new short[1] ;
      BC01PJ58_A12681LavMqLn = new short[1] ;
      BC01PJ59_A396EmprCod = new String[] {""} ;
      BC01PJ59_A719PrdNum = new String[] {""} ;
      BC01PJ59_n719PrdNum = new boolean[] {false} ;
      BC01PJ59_A9713Tb1_Cod = new short[1] ;
      BC01PJ60_A396EmprCod = new String[] {""} ;
      BC01PJ60_A12236PrdNumD = new String[] {""} ;
      BC01PJ60_A719PrdNum = new String[] {""} ;
      BC01PJ60_n719PrdNum = new boolean[] {false} ;
      BC01PJ61_A396EmprCod = new String[] {""} ;
      BC01PJ61_A12225DocDisID = new long[1] ;
      BC01PJ61_A12226LinDisID = new short[1] ;
      BC01PJ62_A396EmprCod = new String[] {""} ;
      BC01PJ62_A12225DocDisID = new long[1] ;
      BC01PJ63_A396EmprCod = new String[] {""} ;
      BC01PJ63_A12205OrdenCID = new long[1] ;
      BC01PJ63_A12206OrdenCLnId = new short[1] ;
      BC01PJ64_A396EmprCod = new String[] {""} ;
      BC01PJ64_A719PrdNum = new String[] {""} ;
      BC01PJ64_n719PrdNum = new boolean[] {false} ;
      BC01PJ64_A11664LoteID = new String[] {""} ;
      BC01PJ64_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ65_A396EmprCod = new String[] {""} ;
      BC01PJ65_A4850DevComCod = new int[1] ;
      BC01PJ65_A719PrdNum = new String[] {""} ;
      BC01PJ65_n719PrdNum = new boolean[] {false} ;
      BC01PJ66_A396EmprCod = new String[] {""} ;
      BC01PJ66_A252CliCod = new int[1] ;
      BC01PJ66_A494ForSer = new String[] {""} ;
      BC01PJ66_A482ForColNom = new String[] {""} ;
      BC01PJ66_A483ForColNum = new int[1] ;
      BC01PJ66_A831TipColCod = new byte[1] ;
      BC01PJ66_A3571EnsCod = new String[] {""} ;
      BC01PJ66_A3582EnsLin = new short[1] ;
      BC01PJ67_A396EmprCod = new String[] {""} ;
      BC01PJ67_A129BarCod = new int[1] ;
      BC01PJ67_A132BarCodReo = new byte[1] ;
      BC01PJ67_A130BarCodPar = new String[] {""} ;
      BC01PJ67_A4075recestncol = new byte[1] ;
      BC01PJ67_A4076recestnpro = new byte[1] ;
      BC01PJ67_A4108recestlin = new short[1] ;
      BC01PJ68_A396EmprCod = new String[] {""} ;
      BC01PJ68_A4052EstNumFor = new int[1] ;
      BC01PJ68_A4053EstNumCol = new byte[1] ;
      BC01PJ68_A4090EstEspLin = new byte[1] ;
      BC01PJ69_A396EmprCod = new String[] {""} ;
      BC01PJ69_A4052EstNumFor = new int[1] ;
      BC01PJ69_A4053EstNumCol = new byte[1] ;
      BC01PJ69_A4084EstProLin = new byte[1] ;
      BC01PJ70_A396EmprCod = new String[] {""} ;
      BC01PJ70_A11644TransferId = new long[1] ;
      BC01PJ70_A11653TransferLn = new int[1] ;
      BC01PJ71_A396EmprCod = new String[] {""} ;
      BC01PJ71_A11634TaesId = new String[] {""} ;
      BC01PJ71_A11637TaesLn = new short[1] ;
      BC01PJ71_A11641TaesLnP = new short[1] ;
      BC01PJ72_A396EmprCod = new String[] {""} ;
      BC01PJ72_A719PrdNum = new String[] {""} ;
      BC01PJ72_n719PrdNum = new boolean[] {false} ;
      BC01PJ72_A11329H_stklin = new long[1] ;
      BC01PJ73_A396EmprCod = new String[] {""} ;
      BC01PJ73_A11270Pot_num = new int[1] ;
      BC01PJ73_A11271Pot_lin = new short[1] ;
      BC01PJ74_A396EmprCod = new String[] {""} ;
      BC01PJ74_A719PrdNum = new String[] {""} ;
      BC01PJ74_n719PrdNum = new boolean[] {false} ;
      BC01PJ74_A11199PrdNcasC = new String[] {""} ;
      BC01PJ75_A396EmprCod = new String[] {""} ;
      BC01PJ75_A719PrdNum = new String[] {""} ;
      BC01PJ75_n719PrdNum = new boolean[] {false} ;
      BC01PJ75_A11197CFraseR = new String[] {""} ;
      BC01PJ76_A396EmprCod = new String[] {""} ;
      BC01PJ76_A10243Jt_codigo = new short[1] ;
      BC01PJ76_A10246Jt_ord = new short[1] ;
      BC01PJ77_A396EmprCod = new String[] {""} ;
      BC01PJ77_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ77_A10238Bny_lin = new short[1] ;
      BC01PJ78_A396EmprCod = new String[] {""} ;
      BC01PJ78_A129BarCod = new int[1] ;
      BC01PJ78_A132BarCodReo = new byte[1] ;
      BC01PJ78_A130BarCodPar = new String[] {""} ;
      BC01PJ78_A758ProCod = new String[] {""} ;
      BC01PJ78_A194BarOrdLin = new short[1] ;
      BC01PJ78_A719PrdNum = new String[] {""} ;
      BC01PJ78_n719PrdNum = new boolean[] {false} ;
      BC01PJ79_A396EmprCod = new String[] {""} ;
      BC01PJ79_A719PrdNum = new String[] {""} ;
      BC01PJ79_n719PrdNum = new boolean[] {false} ;
      BC01PJ79_A9735Cod_Rgo = new String[] {""} ;
      BC01PJ80_A396EmprCod = new String[] {""} ;
      BC01PJ80_A719PrdNum = new String[] {""} ;
      BC01PJ80_n719PrdNum = new boolean[] {false} ;
      BC01PJ80_A9711Ct_codigo = new short[1] ;
      BC01PJ81_A396EmprCod = new String[] {""} ;
      BC01PJ81_A9652OeNum = new long[1] ;
      BC01PJ81_A9653OeHdr = new int[1] ;
      BC01PJ81_A9654OeHdrr = new byte[1] ;
      BC01PJ81_A9655OeHdrp = new String[] {""} ;
      BC01PJ81_A9656OeLinC = new byte[1] ;
      BC01PJ81_A9657OeComb = new String[] {""} ;
      BC01PJ81_A9658Oefondo = new String[] {""} ;
      BC01PJ81_A9659OeMolCil = new byte[1] ;
      BC01PJ81_A9686OePasLin = new short[1] ;
      BC01PJ81_A9694OePasPLi = new short[1] ;
      BC01PJ82_A396EmprCod = new String[] {""} ;
      BC01PJ82_A9652OeNum = new long[1] ;
      BC01PJ82_A9653OeHdr = new int[1] ;
      BC01PJ82_A9654OeHdrr = new byte[1] ;
      BC01PJ82_A9655OeHdrp = new String[] {""} ;
      BC01PJ82_A9656OeLinC = new byte[1] ;
      BC01PJ82_A9657OeComb = new String[] {""} ;
      BC01PJ82_A9658Oefondo = new String[] {""} ;
      BC01PJ82_A9659OeMolCil = new byte[1] ;
      BC01PJ82_A9677OeMolLin = new byte[1] ;
      BC01PJ83_A396EmprCod = new String[] {""} ;
      BC01PJ83_A9578Pas_Num = new int[1] ;
      BC01PJ83_A719PrdNum = new String[] {""} ;
      BC01PJ83_n719PrdNum = new boolean[] {false} ;
      BC01PJ84_A396EmprCod = new String[] {""} ;
      BC01PJ84_A719PrdNum = new String[] {""} ;
      BC01PJ84_n719PrdNum = new boolean[] {false} ;
      BC01PJ84_A8908CC_AlmCod = new byte[1] ;
      BC01PJ85_A396EmprCod = new String[] {""} ;
      BC01PJ85_A719PrdNum = new String[] {""} ;
      BC01PJ85_n719PrdNum = new boolean[] {false} ;
      BC01PJ85_A8661Almc_Ln = new int[1] ;
      BC01PJ86_A396EmprCod = new String[] {""} ;
      BC01PJ86_A719PrdNum = new String[] {""} ;
      BC01PJ86_n719PrdNum = new boolean[] {false} ;
      BC01PJ86_A8648Mat_PrdN = new String[] {""} ;
      BC01PJ87_A396EmprCod = new String[] {""} ;
      BC01PJ87_A8585Pet_cod = new long[1] ;
      BC01PJ87_A719PrdNum = new String[] {""} ;
      BC01PJ87_n719PrdNum = new boolean[] {false} ;
      BC01PJ88_A396EmprCod = new String[] {""} ;
      BC01PJ88_A719PrdNum = new String[] {""} ;
      BC01PJ88_n719PrdNum = new boolean[] {false} ;
      BC01PJ88_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ89_A396EmprCod = new String[] {""} ;
      BC01PJ89_A719PrdNum = new String[] {""} ;
      BC01PJ89_n719PrdNum = new boolean[] {false} ;
      BC01PJ89_A8366PrdAnyo = new short[1] ;
      BC01PJ89_A8360PrdProv = new int[1] ;
      BC01PJ90_A396EmprCod = new String[] {""} ;
      BC01PJ90_A252CliCod = new int[1] ;
      BC01PJ90_A494ForSer = new String[] {""} ;
      BC01PJ90_A482ForColNom = new String[] {""} ;
      BC01PJ90_A483ForColNum = new int[1] ;
      BC01PJ90_A831TipColCod = new byte[1] ;
      BC01PJ90_A7797Sim_lin = new short[1] ;
      BC01PJ91_A396EmprCod = new String[] {""} ;
      BC01PJ91_A7163Vir_Codigo = new int[1] ;
      BC01PJ91_A719PrdNum = new String[] {""} ;
      BC01PJ91_n719PrdNum = new boolean[] {false} ;
      BC01PJ92_A396EmprCod = new String[] {""} ;
      BC01PJ92_A6310Lb_TaAuxC = new String[] {""} ;
      BC01PJ92_A6313lb_TaAuxL = new short[1] ;
      BC01PJ92_A6378Lb_TauxLP = new short[1] ;
      BC01PJ93_A396EmprCod = new String[] {""} ;
      BC01PJ93_A6290PreCoNum = new int[1] ;
      BC01PJ93_A719PrdNum = new String[] {""} ;
      BC01PJ93_n719PrdNum = new boolean[] {false} ;
      BC01PJ94_A396EmprCod = new String[] {""} ;
      BC01PJ94_A719PrdNum = new String[] {""} ;
      BC01PJ94_n719PrdNum = new boolean[] {false} ;
      BC01PJ94_A6158PrdPrv = new int[1] ;
      BC01PJ95_A396EmprCod = new String[] {""} ;
      BC01PJ95_A719PrdNum = new String[] {""} ;
      BC01PJ95_n719PrdNum = new boolean[] {false} ;
      BC01PJ95_A5973PrdSusNum = new String[] {""} ;
      BC01PJ96_A396EmprCod = new String[] {""} ;
      BC01PJ96_A5612Lb_CodGru = new String[] {""} ;
      BC01PJ96_A5615Lb_LinGru = new short[1] ;
      BC01PJ97_A396EmprCod = new String[] {""} ;
      BC01PJ97_A5532Lb_numero = new int[1] ;
      BC01PJ97_A5555Lb_opcion = new String[] {""} ;
      BC01PJ97_A5560Lb_LineaPr = new short[1] ;
      BC01PJ98_A396EmprCod = new String[] {""} ;
      BC01PJ98_A5532Lb_numero = new int[1] ;
      BC01PJ98_A5555Lb_opcion = new String[] {""} ;
      BC01PJ98_A5557Lb_LineaC = new short[1] ;
      BC01PJ99_A396EmprCod = new String[] {""} ;
      BC01PJ99_A5145SobCod = new int[1] ;
      BC01PJ99_A719PrdNum = new String[] {""} ;
      BC01PJ99_n719PrdNum = new boolean[] {false} ;
      BC01PJ100_A396EmprCod = new String[] {""} ;
      BC01PJ100_A4744RecPreCod = new int[1] ;
      BC01PJ100_A4762RecPreLin = new short[1] ;
      BC01PJ100_A4763RecPreNli = new short[1] ;
      BC01PJ101_A396EmprCod = new String[] {""} ;
      BC01PJ101_A4492HreBarCod = new int[1] ;
      BC01PJ101_A4493HreBarReo = new byte[1] ;
      BC01PJ101_A4494HreBarPar = new String[] {""} ;
      BC01PJ101_A4495HreNumCie = new byte[1] ;
      BC01PJ101_A4545HreLinMaq = new short[1] ;
      BC01PJ101_A4550HreLinPro = new byte[1] ;
      BC01PJ101_A4557HreRecLin = new short[1] ;
      BC01PJ102_A396EmprCod = new String[] {""} ;
      BC01PJ102_A4492HreBarCod = new int[1] ;
      BC01PJ102_A4493HreBarReo = new byte[1] ;
      BC01PJ102_A4494HreBarPar = new String[] {""} ;
      BC01PJ102_A4495HreNumCie = new byte[1] ;
      BC01PJ102_A4508HreLinMAL = new short[1] ;
      BC01PJ102_A4509HreNumAny = new byte[1] ;
      BC01PJ102_A719PrdNum = new String[] {""} ;
      BC01PJ102_n719PrdNum = new boolean[] {false} ;
      BC01PJ103_A396EmprCod = new String[] {""} ;
      BC01PJ103_A252CliCod = new int[1] ;
      BC01PJ103_A4415EstCol = new String[] {""} ;
      BC01PJ103_A4416EstColLin = new short[1] ;
      BC01PJ104_A396EmprCod = new String[] {""} ;
      BC01PJ104_A129BarCod = new int[1] ;
      BC01PJ104_A132BarCodReo = new byte[1] ;
      BC01PJ104_A130BarCodPar = new String[] {""} ;
      BC01PJ104_A2524DisComLin = new byte[1] ;
      BC01PJ104_A1056DisComCod = new String[] {""} ;
      BC01PJ104_A1032FonCod = new String[] {""} ;
      BC01PJ104_A2124RecMolCod = new byte[1] ;
      BC01PJ104_A2672RecPasLin = new short[1] ;
      BC01PJ104_A2675RecPasPLi = new short[1] ;
      BC01PJ105_A396EmprCod = new String[] {""} ;
      BC01PJ105_A129BarCod = new int[1] ;
      BC01PJ105_A132BarCodReo = new byte[1] ;
      BC01PJ105_A130BarCodPar = new String[] {""} ;
      BC01PJ105_A2524DisComLin = new byte[1] ;
      BC01PJ105_A1056DisComCod = new String[] {""} ;
      BC01PJ105_A1032FonCod = new String[] {""} ;
      BC01PJ105_A2124RecMolCod = new byte[1] ;
      BC01PJ105_A2126RecMolLin = new byte[1] ;
      BC01PJ106_A396EmprCod = new String[] {""} ;
      BC01PJ106_A2107PasCod = new String[] {""} ;
      BC01PJ106_A719PrdNum = new String[] {""} ;
      BC01PJ106_n719PrdNum = new boolean[] {false} ;
      BC01PJ107_A396EmprCod = new String[] {""} ;
      BC01PJ107_A2637HisEstHRu = new int[1] ;
      BC01PJ107_A2636HisEstHRe = new byte[1] ;
      BC01PJ107_A2635HisEstHPa = new String[] {""} ;
      BC01PJ107_A2638HisEstLCo = new byte[1] ;
      BC01PJ107_A2630HisEstCom = new String[] {""} ;
      BC01PJ107_A2634HisEstFon = new String[] {""} ;
      BC01PJ107_A719PrdNum = new String[] {""} ;
      BC01PJ107_n719PrdNum = new boolean[] {false} ;
      BC01PJ108_A396EmprCod = new String[] {""} ;
      BC01PJ108_A252CliCod = new int[1] ;
      BC01PJ108_A2141SerEst = new String[] {""} ;
      BC01PJ108_A1013DibCli = new String[] {""} ;
      BC01PJ108_A1014DibInt = new int[1] ;
      BC01PJ108_A2074ColCom = new String[] {""} ;
      BC01PJ108_A2078ColFon = new String[] {""} ;
      BC01PJ108_A2098MolCod = new byte[1] ;
      BC01PJ108_A2535ForPrdLin = new short[1] ;
      BC01PJ109_A396EmprCod = new String[] {""} ;
      BC01PJ109_A719PrdNum = new String[] {""} ;
      BC01PJ109_n719PrdNum = new boolean[] {false} ;
      BC01PJ109_A3342CCStkLin = new long[1] ;
      BC01PJ110_A396EmprCod = new String[] {""} ;
      BC01PJ110_A252CliCod = new int[1] ;
      BC01PJ110_A2891HMaForSer = new String[] {""} ;
      BC01PJ110_A2892HMaForCNom = new String[] {""} ;
      BC01PJ110_A2893HMaForCNum = new int[1] ;
      BC01PJ110_A2894HMaTipCCod = new byte[1] ;
      BC01PJ110_A2895HMaForNumC = new int[1] ;
      BC01PJ110_A2897HMaColLin = new short[1] ;
      BC01PJ110_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ110_A2907HmaLin = new short[1] ;
      BC01PJ111_A396EmprCod = new String[] {""} ;
      BC01PJ111_A129BarCod = new int[1] ;
      BC01PJ111_A132BarCodReo = new byte[1] ;
      BC01PJ111_A130BarCodPar = new String[] {""} ;
      BC01PJ111_A2808RecLinMAL = new short[1] ;
      BC01PJ111_A1377RecNumAny = new byte[1] ;
      BC01PJ111_A719PrdNum = new String[] {""} ;
      BC01PJ111_n719PrdNum = new boolean[] {false} ;
      BC01PJ112_A396EmprCod = new String[] {""} ;
      BC01PJ112_A129BarCod = new int[1] ;
      BC01PJ112_A132BarCodReo = new byte[1] ;
      BC01PJ112_A130BarCodPar = new String[] {""} ;
      BC01PJ112_A2804RecLinMaq = new short[1] ;
      BC01PJ112_A1273RecLinPro = new byte[1] ;
      BC01PJ112_A811RecLin = new short[1] ;
      BC01PJ113_A396EmprCod = new String[] {""} ;
      BC01PJ113_A129BarCod = new int[1] ;
      BC01PJ113_A132BarCodReo = new byte[1] ;
      BC01PJ113_A130BarCodPar = new String[] {""} ;
      BC01PJ113_A2494BarDosPro = new String[] {""} ;
      BC01PJ113_A719PrdNum = new String[] {""} ;
      BC01PJ113_n719PrdNum = new boolean[] {false} ;
      BC01PJ114_A396EmprCod = new String[] {""} ;
      BC01PJ114_A1314EnsLabCod = new int[1] ;
      BC01PJ114_A1317EnsLabLin = new short[1] ;
      BC01PJ115_A396EmprCod = new String[] {""} ;
      BC01PJ115_A910Workstat = new String[] {""} ;
      BC01PJ115_A887EscMLin = new int[1] ;
      BC01PJ116_A396EmprCod = new String[] {""} ;
      BC01PJ116_A859CumCodCont = new int[1] ;
      BC01PJ116_A719PrdNum = new String[] {""} ;
      BC01PJ116_n719PrdNum = new boolean[] {false} ;
      BC01PJ117_A396EmprCod = new String[] {""} ;
      BC01PJ117_A719PrdNum = new String[] {""} ;
      BC01PJ117_n719PrdNum = new boolean[] {false} ;
      BC01PJ117_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ118_A396EmprCod = new String[] {""} ;
      BC01PJ118_A486ForNumCol = new int[1] ;
      BC01PJ118_A715PrdLin = new short[1] ;
      BC01PJ119_A396EmprCod = new String[] {""} ;
      BC01PJ119_A719PrdNum = new String[] {""} ;
      BC01PJ119_n719PrdNum = new boolean[] {false} ;
      BC01PJ119_A681PrdAny = new short[1] ;
      BC01PJ120_A396EmprCod = new String[] {""} ;
      BC01PJ120_A719PrdNum = new String[] {""} ;
      BC01PJ120_n719PrdNum = new boolean[] {false} ;
      BC01PJ120_A688PrdComCod = new String[] {""} ;
      BC01PJ121_A396EmprCod = new String[] {""} ;
      BC01PJ121_A719PrdNum = new String[] {""} ;
      BC01PJ121_n719PrdNum = new boolean[] {false} ;
      BC01PJ121_A680PrdAltNum = new String[] {""} ;
      BC01PJ122_A396EmprCod = new String[] {""} ;
      BC01PJ122_A658PedCod = new int[1] ;
      BC01PJ122_A719PrdNum = new String[] {""} ;
      BC01PJ122_n719PrdNum = new boolean[] {false} ;
      BC01PJ123_A396EmprCod = new String[] {""} ;
      BC01PJ123_A486ForNumCol = new int[1] ;
      BC01PJ123_A309ColLin = new short[1] ;
      BC01PJ124_A396EmprCod = new String[] {""} ;
      BC01PJ124_A719PrdNum = new String[] {""} ;
      BC01PJ124_n719PrdNum = new boolean[] {false} ;
      BC01PJ124_A647NumCon = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_decimal19 = new java.math.BigDecimal[1] ;
      BC01PJ126_A8896PrdPesCon = new byte[1] ;
      BC01PJ126_A13968PrdCantAtM = new short[1] ;
      BC01PJ126_n13968PrdCantAtM = new boolean[] {false} ;
      BC01PJ126_A13970PrdMatSeca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_n13970PrdMatSeca = new boolean[] {false} ;
      BC01PJ126_A13971PrdLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_n13971PrdLoteFch = new boolean[] {false} ;
      BC01PJ126_A13972PrdFTdoc = new String[] {""} ;
      BC01PJ126_n13972PrdFTdoc = new boolean[] {false} ;
      BC01PJ126_A13973PrdFSdoc = new String[] {""} ;
      BC01PJ126_n13973PrdFSdoc = new boolean[] {false} ;
      BC01PJ126_A13974PrdGRS = new String[] {""} ;
      BC01PJ126_n13974PrdGRS = new boolean[] {false} ;
      BC01PJ126_A396EmprCod = new String[] {""} ;
      BC01PJ126_A13969PrdGruFamI = new byte[1] ;
      BC01PJ126_n13969PrdGruFamI = new boolean[] {false} ;
      BC01PJ126_A629MetCod = new byte[1] ;
      BC01PJ126_n629MetCod = new boolean[] {false} ;
      BC01PJ126_A795PrvNum = new int[1] ;
      BC01PJ126_A835TipDtoCod = new byte[1] ;
      BC01PJ126_n835TipDtoCod = new boolean[] {false} ;
      BC01PJ126_A742PrdUniCom = new byte[1] ;
      BC01PJ126_A743PrdUniCon = new byte[1] ;
      BC01PJ126_A856ValCod = new byte[1] ;
      BC01PJ126_A6301TipPrdCod = new short[1] ;
      BC01PJ126_n6301TipPrdCod = new boolean[] {false} ;
      BC01PJ126_A9609SubFamCod = new byte[1] ;
      BC01PJ126_n9609SubFamCod = new boolean[] {false} ;
      BC01PJ126_A12714PrdFabId = new int[1] ;
      BC01PJ126_n12714PrdFabId = new boolean[] {false} ;
      BC01PJ126_A13927AlmPrdID = new short[1] ;
      BC01PJ126_n13927AlmPrdID = new boolean[] {false} ;
      BC01PJ126_A13875PrdLastLin = new long[1] ;
      BC01PJ126_n13875PrdLastLin = new boolean[] {false} ;
      BC01PJ126_A719PrdNum = new String[] {""} ;
      BC01PJ126_n719PrdNum = new boolean[] {false} ;
      BC01PJ126_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A8897PrdPesTerm = new String[] {""} ;
      BC01PJ126_A407EmprNom = new String[] {""} ;
      BC01PJ126_n407EmprNom = new boolean[] {false} ;
      BC01PJ126_A718PrdNom = new String[] {""} ;
      BC01PJ126_A794PrvNom = new String[] {""} ;
      BC01PJ126_n794PrvNom = new boolean[] {false} ;
      BC01PJ126_A728PrdRefPrv = new String[] {""} ;
      BC01PJ126_A703PrdDscTec = new String[] {""} ;
      BC01PJ126_A737PrdUcpDsc = new String[] {""} ;
      BC01PJ126_n737PrdUcpDsc = new boolean[] {false} ;
      BC01PJ126_A736PrdUcoDsc = new String[] {""} ;
      BC01PJ126_n736PrdUcoDsc = new boolean[] {false} ;
      BC01PJ126_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A857ValDsc = new String[] {""} ;
      BC01PJ126_n857ValDsc = new boolean[] {false} ;
      BC01PJ126_A727PrdRec = new String[] {""} ;
      BC01PJ126_A682PrdCalNec = new String[] {""} ;
      BC01PJ126_A698PrdDetPar = new String[] {""} ;
      BC01PJ126_A730PrdSit = new byte[1] ;
      BC01PJ126_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_n837TipDtoDto = new boolean[] {false} ;
      BC01PJ126_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A731PrdStkMinD = new short[1] ;
      BC01PJ126_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A699PrdDiaRot = new short[1] ;
      BC01PJ126_A722PrdPlaEnt = new short[1] ;
      BC01PJ126_A630MetDsc = new String[] {""} ;
      BC01PJ126_n630MetDsc = new boolean[] {false} ;
      BC01PJ126_A716PrdLotMin = new short[1] ;
      BC01PJ126_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A738PrdUltCCC = new short[1] ;
      BC01PJ126_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A695PrdConCC = new short[1] ;
      BC01PJ126_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A1193PrdPosX = new short[1] ;
      BC01PJ126_A1194PrdPosY = new byte[1] ;
      BC01PJ126_A1643PrdTip = new String[] {""} ;
      BC01PJ126_A1644PrdDqo = new short[1] ;
      BC01PJ126_A3004PrdRev = new String[] {""} ;
      BC01PJ126_A3273PrdTnq = new byte[1] ;
      BC01PJ126_A4692PrdNom2 = new String[] {""} ;
      BC01PJ126_A4693PrdNum2 = new String[] {""} ;
      BC01PJ126_A4694PrdObs = new String[] {""} ;
      BC01PJ126_A4338PrdUMeFo = new byte[1] ;
      BC01PJ126_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A5418PrdSalM = new String[] {""} ;
      BC01PJ126_A6302TipPrdDsc = new String[] {""} ;
      BC01PJ126_n6302TipPrdDsc = new boolean[] {false} ;
      BC01PJ126_A6191PrdNumCent = new String[] {""} ;
      BC01PJ126_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A7260PrdHorMad = new byte[1] ;
      BC01PJ126_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A8936PrdSal = new String[] {""} ;
      BC01PJ126_A9610SubFamDsc = new String[] {""} ;
      BC01PJ126_n9610SubFamDsc = new boolean[] {false} ;
      BC01PJ126_A9731PrdInc = new String[] {""} ;
      BC01PJ126_A9732PrdComp = new String[] {""} ;
      BC01PJ126_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01PJ126_A9734PrdNCAS = new String[] {""} ;
      BC01PJ126_A9739PrdFT = new String[] {""} ;
      BC01PJ126_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A9741PrdHS = new String[] {""} ;
      BC01PJ126_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ126_A10119PrdColIdx = new String[] {""} ;
      BC01PJ126_A5888PrdOkotex = new String[] {""} ;
      BC01PJ126_A5887PrdReach = new String[] {""} ;
      BC01PJ126_A10881PrdLote = new String[] {""} ;
      BC01PJ126_A10935PrdRTM = new String[] {""} ;
      BC01PJ126_A10936PrdCtw1 = new String[] {""} ;
      BC01PJ126_A10937PrdCtw2 = new String[] {""} ;
      BC01PJ126_A10938PrdCtw3 = new String[] {""} ;
      BC01PJ126_A11663PrdCtw4 = new String[] {""} ;
      BC01PJ126_A11196PrdNroCAS = new String[] {""} ;
      BC01PJ126_A11363PrdGots = new String[] {""} ;
      BC01PJ126_A11364PrdHm = new String[] {""} ;
      BC01PJ126_A11470PrdConct = new short[1] ;
      BC01PJ126_A11614PrdEINECS = new String[] {""} ;
      BC01PJ126_A11615PrdFuncion = new String[] {""} ;
      BC01PJ126_A11616PrdNmQu = new String[] {""} ;
      BC01PJ126_A11687PrdList = new String[] {""} ;
      BC01PJ126_A12715PrdFabNm = new String[] {""} ;
      BC01PJ126_n12715PrdFabNm = new boolean[] {false} ;
      BC01PJ126_A12957PrdLoteOb = new String[] {""} ;
      BC01PJ126_A13232PrdRGB = new long[1] ;
      BC01PJ126_A13301PrdZDHC = new String[] {""} ;
      BC01PJ126_A13302PrdTHELIST = new String[] {""} ;
      BC01PJ126_n13302PrdTHELIST = new boolean[] {false} ;
      BC01PJ126_A13457PrdUbicaci = new String[] {""} ;
      BC01PJ126_A3936PrdEqLP = new String[] {""} ;
      N8897PrdPesTerm = "" ;
      i709PrdFecPre = GXutil.nullDate() ;
      i5590PrdSolub = DecimalUtil.ZERO ;
      i707PrdFacCon = DecimalUtil.ZERO ;
      i698PrdDetPar = "" ;
      i682PrdCalNec = "" ;
      i727PrdRec = "" ;
      i696PrdConDia = DecimalUtil.ZERO ;
      i1643PrdTip = "" ;
      i3004PrdRev = "" ;
      i5418PrdSalM = "" ;
      i9739PrdFT = "" ;
      i9741PrdHS = "" ;
      i5887PrdReach = "" ;
      i5888PrdOkotex = "" ;
      i11363PrdGots = "" ;
      i11364PrdHm = "" ;
      i11687PrdList = "" ;
      i12957PrdLoteOb = "" ;
      i13301PrdZDHC = "" ;
      i3936PrdEqLP = "" ;
      i13974PrdGRS = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01PJ127_A407EmprNom = new String[] {""} ;
      BC01PJ127_n407EmprNom = new boolean[] {false} ;
      BC01PJ128_A407EmprNom = new String[] {""} ;
      BC01PJ128_n407EmprNom = new boolean[] {false} ;
      X3345TipMovCc = "" ;
      E396EmprCod = "" ;
      E719PrdNum = "" ;
      BC01PJ129_A396EmprCod = new String[] {""} ;
      BC01PJ129_A719PrdNum = new String[] {""} ;
      BC01PJ129_n719PrdNum = new boolean[] {false} ;
      BC01PJ129_A3342CCStkLin = new long[1] ;
      BC01PJ129_A3345TipMovCc = new String[] {""} ;
      X3348CCStkFec = GXutil.nullDate() ;
      BC01PJ130_A396EmprCod = new String[] {""} ;
      BC01PJ130_A719PrdNum = new String[] {""} ;
      BC01PJ130_n719PrdNum = new boolean[] {false} ;
      BC01PJ130_A3342CCStkLin = new long[1] ;
      BC01PJ130_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01PJ131_A396EmprCod = new String[] {""} ;
      BC01PJ131_A719PrdNum = new String[] {""} ;
      BC01PJ131_n719PrdNum = new boolean[] {false} ;
      BC01PJ131_A3342CCStkLin = new long[1] ;
      BC01PJ131_A3345TipMovCc = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.produc_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.produc_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.produc_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.produc_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.produc_bc__default(),
         new Object[] {
             new Object[] {
            BC01PJ2_A8896PrdPesCon, BC01PJ2_A13968PrdCantAtM, BC01PJ2_n13968PrdCantAtM, BC01PJ2_A13970PrdMatSeca, BC01PJ2_n13970PrdMatSeca, BC01PJ2_A13971PrdLoteFch, BC01PJ2_n13971PrdLoteFch, BC01PJ2_A13972PrdFTdoc, BC01PJ2_n13972PrdFTdoc, BC01PJ2_A13973PrdFSdoc,
            BC01PJ2_n13973PrdFSdoc, BC01PJ2_A13974PrdGRS, BC01PJ2_n13974PrdGRS, BC01PJ2_A396EmprCod, BC01PJ2_A13969PrdGruFamI, BC01PJ2_n13969PrdGruFamI, BC01PJ2_A629MetCod, BC01PJ2_n629MetCod, BC01PJ2_A795PrvNum, BC01PJ2_A835TipDtoCod,
            BC01PJ2_n835TipDtoCod, BC01PJ2_A742PrdUniCom, BC01PJ2_A743PrdUniCon, BC01PJ2_A856ValCod, BC01PJ2_A6301TipPrdCod, BC01PJ2_n6301TipPrdCod, BC01PJ2_A9609SubFamCod, BC01PJ2_n9609SubFamCod, BC01PJ2_A12714PrdFabId, BC01PJ2_n12714PrdFabId,
            BC01PJ2_A13927AlmPrdID, BC01PJ2_n13927AlmPrdID, BC01PJ2_A719PrdNum, BC01PJ2_A709PrdFecPre, BC01PJ2_A5590PrdSolub, BC01PJ2_A8897PrdPesTerm, BC01PJ2_A718PrdNom, BC01PJ2_A728PrdRefPrv, BC01PJ2_A703PrdDscTec, BC01PJ2_A707PrdFacCon,
            BC01PJ2_A727PrdRec, BC01PJ2_A682PrdCalNec, BC01PJ2_A698PrdDetPar, BC01PJ2_A730PrdSit, BC01PJ2_A729PrdRotRea, BC01PJ2_A724PrdPreAct, BC01PJ2_A725PrdPreAnt, BC01PJ2_A726PrdPreMed, BC01PJ2_A696PrdConDia, BC01PJ2_A731PrdStkMinD,
            BC01PJ2_A732PrdStkMinU, BC01PJ2_A699PrdDiaRot, BC01PJ2_A722PrdPlaEnt, BC01PJ2_A716PrdLotMin, BC01PJ2_A721PrdNumUco, BC01PJ2_A704PrdExiAlm, BC01PJ2_A705PrdExiCC, BC01PJ2_A685PrdCanRes, BC01PJ2_A684PrdCanPen, BC01PJ2_A713PrdFulEnt,
            BC01PJ2_A714PrdFulPed, BC01PJ2_A712PrdFulCC, BC01PJ2_A706PrdExiCCP, BC01PJ2_A740PrdUltECC, BC01PJ2_A738PrdUltCCC, BC01PJ2_A739PrdUltDCC, BC01PJ2_A700PrdDifCC, BC01PJ2_A695PrdConCC, BC01PJ2_A750PrdValStk, BC01PJ2_A332DifValStk,
            BC01PJ2_A708PrdFecEnt, BC01PJ2_A1193PrdPosX, BC01PJ2_A1194PrdPosY, BC01PJ2_A1643PrdTip, BC01PJ2_A1644PrdDqo, BC01PJ2_A3004PrdRev, BC01PJ2_A3273PrdTnq, BC01PJ2_A4692PrdNom2, BC01PJ2_A4693PrdNum2, BC01PJ2_A4694PrdObs,
            BC01PJ2_A4338PrdUMeFo, BC01PJ2_A5255PrdPreAc2, BC01PJ2_A5416PrdDensS, BC01PJ2_A5417PrdConcS, BC01PJ2_A5418PrdSalM, BC01PJ2_A6191PrdNumCent, BC01PJ2_A7226PrdNumct1, BC01PJ2_A7227PrdNumct2, BC01PJ2_A7260PrdHorMad, BC01PJ2_A8659PrdExiAlmc,
            BC01PJ2_A8936PrdSal, BC01PJ2_A9731PrdInc, BC01PJ2_A9732PrdComp, BC01PJ2_A9733PrdAox, BC01PJ2_A9734PrdNCAS, BC01PJ2_A9739PrdFT, BC01PJ2_A9740PrdFFT, BC01PJ2_A9741PrdHS, BC01PJ2_A9742PrdFHS, BC01PJ2_A10119PrdColIdx,
            BC01PJ2_A5888PrdOkotex, BC01PJ2_A5887PrdReach, BC01PJ2_A10881PrdLote, BC01PJ2_A10935PrdRTM, BC01PJ2_A10936PrdCtw1, BC01PJ2_A10937PrdCtw2, BC01PJ2_A10938PrdCtw3, BC01PJ2_A11663PrdCtw4, BC01PJ2_A11196PrdNroCAS, BC01PJ2_A11363PrdGots,
            BC01PJ2_A11364PrdHm, BC01PJ2_A11470PrdConct, BC01PJ2_A11614PrdEINECS, BC01PJ2_A11615PrdFuncion, BC01PJ2_A11616PrdNmQu, BC01PJ2_A11687PrdList, BC01PJ2_A12957PrdLoteOb, BC01PJ2_A13232PrdRGB, BC01PJ2_A13301PrdZDHC, BC01PJ2_A13302PrdTHELIST,
            BC01PJ2_n13302PrdTHELIST, BC01PJ2_A13457PrdUbicaci, BC01PJ2_A3936PrdEqLP
            }
            , new Object[] {
            BC01PJ3_A8896PrdPesCon, BC01PJ3_A13968PrdCantAtM, BC01PJ3_n13968PrdCantAtM, BC01PJ3_A13970PrdMatSeca, BC01PJ3_n13970PrdMatSeca, BC01PJ3_A13971PrdLoteFch, BC01PJ3_n13971PrdLoteFch, BC01PJ3_A13972PrdFTdoc, BC01PJ3_n13972PrdFTdoc, BC01PJ3_A13973PrdFSdoc,
            BC01PJ3_n13973PrdFSdoc, BC01PJ3_A13974PrdGRS, BC01PJ3_n13974PrdGRS, BC01PJ3_A396EmprCod, BC01PJ3_A13969PrdGruFamI, BC01PJ3_n13969PrdGruFamI, BC01PJ3_A629MetCod, BC01PJ3_n629MetCod, BC01PJ3_A795PrvNum, BC01PJ3_A835TipDtoCod,
            BC01PJ3_n835TipDtoCod, BC01PJ3_A742PrdUniCom, BC01PJ3_A743PrdUniCon, BC01PJ3_A856ValCod, BC01PJ3_A6301TipPrdCod, BC01PJ3_n6301TipPrdCod, BC01PJ3_A9609SubFamCod, BC01PJ3_n9609SubFamCod, BC01PJ3_A12714PrdFabId, BC01PJ3_n12714PrdFabId,
            BC01PJ3_A13927AlmPrdID, BC01PJ3_n13927AlmPrdID, BC01PJ3_A719PrdNum, BC01PJ3_A709PrdFecPre, BC01PJ3_A5590PrdSolub, BC01PJ3_A8897PrdPesTerm, BC01PJ3_A718PrdNom, BC01PJ3_A728PrdRefPrv, BC01PJ3_A703PrdDscTec, BC01PJ3_A707PrdFacCon,
            BC01PJ3_A727PrdRec, BC01PJ3_A682PrdCalNec, BC01PJ3_A698PrdDetPar, BC01PJ3_A730PrdSit, BC01PJ3_A729PrdRotRea, BC01PJ3_A724PrdPreAct, BC01PJ3_A725PrdPreAnt, BC01PJ3_A726PrdPreMed, BC01PJ3_A696PrdConDia, BC01PJ3_A731PrdStkMinD,
            BC01PJ3_A732PrdStkMinU, BC01PJ3_A699PrdDiaRot, BC01PJ3_A722PrdPlaEnt, BC01PJ3_A716PrdLotMin, BC01PJ3_A721PrdNumUco, BC01PJ3_A704PrdExiAlm, BC01PJ3_A705PrdExiCC, BC01PJ3_A685PrdCanRes, BC01PJ3_A684PrdCanPen, BC01PJ3_A713PrdFulEnt,
            BC01PJ3_A714PrdFulPed, BC01PJ3_A712PrdFulCC, BC01PJ3_A706PrdExiCCP, BC01PJ3_A740PrdUltECC, BC01PJ3_A738PrdUltCCC, BC01PJ3_A739PrdUltDCC, BC01PJ3_A700PrdDifCC, BC01PJ3_A695PrdConCC, BC01PJ3_A750PrdValStk, BC01PJ3_A332DifValStk,
            BC01PJ3_A708PrdFecEnt, BC01PJ3_A1193PrdPosX, BC01PJ3_A1194PrdPosY, BC01PJ3_A1643PrdTip, BC01PJ3_A1644PrdDqo, BC01PJ3_A3004PrdRev, BC01PJ3_A3273PrdTnq, BC01PJ3_A4692PrdNom2, BC01PJ3_A4693PrdNum2, BC01PJ3_A4694PrdObs,
            BC01PJ3_A4338PrdUMeFo, BC01PJ3_A5255PrdPreAc2, BC01PJ3_A5416PrdDensS, BC01PJ3_A5417PrdConcS, BC01PJ3_A5418PrdSalM, BC01PJ3_A6191PrdNumCent, BC01PJ3_A7226PrdNumct1, BC01PJ3_A7227PrdNumct2, BC01PJ3_A7260PrdHorMad, BC01PJ3_A8659PrdExiAlmc,
            BC01PJ3_A8936PrdSal, BC01PJ3_A9731PrdInc, BC01PJ3_A9732PrdComp, BC01PJ3_A9733PrdAox, BC01PJ3_A9734PrdNCAS, BC01PJ3_A9739PrdFT, BC01PJ3_A9740PrdFFT, BC01PJ3_A9741PrdHS, BC01PJ3_A9742PrdFHS, BC01PJ3_A10119PrdColIdx,
            BC01PJ3_A5888PrdOkotex, BC01PJ3_A5887PrdReach, BC01PJ3_A10881PrdLote, BC01PJ3_A10935PrdRTM, BC01PJ3_A10936PrdCtw1, BC01PJ3_A10937PrdCtw2, BC01PJ3_A10938PrdCtw3, BC01PJ3_A11663PrdCtw4, BC01PJ3_A11196PrdNroCAS, BC01PJ3_A11363PrdGots,
            BC01PJ3_A11364PrdHm, BC01PJ3_A11470PrdConct, BC01PJ3_A11614PrdEINECS, BC01PJ3_A11615PrdFuncion, BC01PJ3_A11616PrdNmQu, BC01PJ3_A11687PrdList, BC01PJ3_A12957PrdLoteOb, BC01PJ3_A13232PrdRGB, BC01PJ3_A13301PrdZDHC, BC01PJ3_A13302PrdTHELIST,
            BC01PJ3_n13302PrdTHELIST, BC01PJ3_A13457PrdUbicaci, BC01PJ3_A3936PrdEqLP
            }
            , new Object[] {
            BC01PJ5_A13875PrdLastLin, BC01PJ5_n13875PrdLastLin
            }
            , new Object[] {
            BC01PJ6_A407EmprNom, BC01PJ6_n407EmprNom
            }
            , new Object[] {
            BC01PJ7_A396EmprCod
            }
            , new Object[] {
            BC01PJ8_A630MetDsc, BC01PJ8_n630MetDsc
            }
            , new Object[] {
            BC01PJ9_A794PrvNom, BC01PJ9_n794PrvNom
            }
            , new Object[] {
            BC01PJ10_A837TipDtoDto, BC01PJ10_n837TipDtoDto
            }
            , new Object[] {
            BC01PJ11_A737PrdUcpDsc, BC01PJ11_n737PrdUcpDsc
            }
            , new Object[] {
            BC01PJ12_A736PrdUcoDsc, BC01PJ12_n736PrdUcoDsc
            }
            , new Object[] {
            BC01PJ13_A857ValDsc, BC01PJ13_n857ValDsc
            }
            , new Object[] {
            BC01PJ14_A6302TipPrdDsc, BC01PJ14_n6302TipPrdDsc
            }
            , new Object[] {
            BC01PJ15_A9610SubFamDsc, BC01PJ15_n9610SubFamDsc
            }
            , new Object[] {
            BC01PJ16_A12715PrdFabNm, BC01PJ16_n12715PrdFabNm
            }
            , new Object[] {
            BC01PJ17_A396EmprCod
            }
            , new Object[] {
            BC01PJ19_A13875PrdLastLin, BC01PJ19_n13875PrdLastLin
            }
            , new Object[] {
            BC01PJ20_A407EmprNom, BC01PJ20_n407EmprNom
            }
            , new Object[] {
            BC01PJ21_A737PrdUcpDsc, BC01PJ21_n737PrdUcpDsc
            }
            , new Object[] {
            BC01PJ22_A736PrdUcoDsc, BC01PJ22_n736PrdUcoDsc
            }
            , new Object[] {
            BC01PJ23_A857ValDsc, BC01PJ23_n857ValDsc
            }
            , new Object[] {
            BC01PJ25_A8896PrdPesCon, BC01PJ25_A13968PrdCantAtM, BC01PJ25_n13968PrdCantAtM, BC01PJ25_A13970PrdMatSeca, BC01PJ25_n13970PrdMatSeca, BC01PJ25_A13971PrdLoteFch, BC01PJ25_n13971PrdLoteFch, BC01PJ25_A13972PrdFTdoc, BC01PJ25_n13972PrdFTdoc, BC01PJ25_A13973PrdFSdoc,
            BC01PJ25_n13973PrdFSdoc, BC01PJ25_A13974PrdGRS, BC01PJ25_n13974PrdGRS, BC01PJ25_A396EmprCod, BC01PJ25_A13969PrdGruFamI, BC01PJ25_n13969PrdGruFamI, BC01PJ25_A629MetCod, BC01PJ25_n629MetCod, BC01PJ25_A795PrvNum, BC01PJ25_A835TipDtoCod,
            BC01PJ25_n835TipDtoCod, BC01PJ25_A742PrdUniCom, BC01PJ25_A743PrdUniCon, BC01PJ25_A856ValCod, BC01PJ25_A6301TipPrdCod, BC01PJ25_n6301TipPrdCod, BC01PJ25_A9609SubFamCod, BC01PJ25_n9609SubFamCod, BC01PJ25_A12714PrdFabId, BC01PJ25_n12714PrdFabId,
            BC01PJ25_A13927AlmPrdID, BC01PJ25_n13927AlmPrdID, BC01PJ25_A13875PrdLastLin, BC01PJ25_n13875PrdLastLin, BC01PJ25_A719PrdNum, BC01PJ25_A709PrdFecPre, BC01PJ25_A5590PrdSolub, BC01PJ25_A8897PrdPesTerm, BC01PJ25_A407EmprNom, BC01PJ25_n407EmprNom,
            BC01PJ25_A718PrdNom, BC01PJ25_A794PrvNom, BC01PJ25_n794PrvNom, BC01PJ25_A728PrdRefPrv, BC01PJ25_A703PrdDscTec, BC01PJ25_A737PrdUcpDsc, BC01PJ25_n737PrdUcpDsc, BC01PJ25_A736PrdUcoDsc, BC01PJ25_n736PrdUcoDsc, BC01PJ25_A707PrdFacCon,
            BC01PJ25_A857ValDsc, BC01PJ25_n857ValDsc, BC01PJ25_A727PrdRec, BC01PJ25_A682PrdCalNec, BC01PJ25_A698PrdDetPar, BC01PJ25_A730PrdSit, BC01PJ25_A729PrdRotRea, BC01PJ25_A837TipDtoDto, BC01PJ25_n837TipDtoDto, BC01PJ25_A724PrdPreAct,
            BC01PJ25_A725PrdPreAnt, BC01PJ25_A726PrdPreMed, BC01PJ25_A696PrdConDia, BC01PJ25_A731PrdStkMinD, BC01PJ25_A732PrdStkMinU, BC01PJ25_A699PrdDiaRot, BC01PJ25_A722PrdPlaEnt, BC01PJ25_A630MetDsc, BC01PJ25_n630MetDsc, BC01PJ25_A716PrdLotMin,
            BC01PJ25_A721PrdNumUco, BC01PJ25_A704PrdExiAlm, BC01PJ25_A705PrdExiCC, BC01PJ25_A685PrdCanRes, BC01PJ25_A684PrdCanPen, BC01PJ25_A713PrdFulEnt, BC01PJ25_A714PrdFulPed, BC01PJ25_A712PrdFulCC, BC01PJ25_A706PrdExiCCP, BC01PJ25_A740PrdUltECC,
            BC01PJ25_A738PrdUltCCC, BC01PJ25_A739PrdUltDCC, BC01PJ25_A700PrdDifCC, BC01PJ25_A695PrdConCC, BC01PJ25_A750PrdValStk, BC01PJ25_A332DifValStk, BC01PJ25_A708PrdFecEnt, BC01PJ25_A1193PrdPosX, BC01PJ25_A1194PrdPosY, BC01PJ25_A1643PrdTip,
            BC01PJ25_A1644PrdDqo, BC01PJ25_A3004PrdRev, BC01PJ25_A3273PrdTnq, BC01PJ25_A4692PrdNom2, BC01PJ25_A4693PrdNum2, BC01PJ25_A4694PrdObs, BC01PJ25_A4338PrdUMeFo, BC01PJ25_A5255PrdPreAc2, BC01PJ25_A5416PrdDensS, BC01PJ25_A5417PrdConcS,
            BC01PJ25_A5418PrdSalM, BC01PJ25_A6302TipPrdDsc, BC01PJ25_n6302TipPrdDsc, BC01PJ25_A6191PrdNumCent, BC01PJ25_A7226PrdNumct1, BC01PJ25_A7227PrdNumct2, BC01PJ25_A7260PrdHorMad, BC01PJ25_A8659PrdExiAlmc, BC01PJ25_A8936PrdSal, BC01PJ25_A9610SubFamDsc,
            BC01PJ25_n9610SubFamDsc, BC01PJ25_A9731PrdInc, BC01PJ25_A9732PrdComp, BC01PJ25_A9733PrdAox, BC01PJ25_A9734PrdNCAS, BC01PJ25_A9739PrdFT, BC01PJ25_A9740PrdFFT, BC01PJ25_A9741PrdHS, BC01PJ25_A9742PrdFHS, BC01PJ25_A10119PrdColIdx,
            BC01PJ25_A5888PrdOkotex, BC01PJ25_A5887PrdReach, BC01PJ25_A10881PrdLote, BC01PJ25_A10935PrdRTM, BC01PJ25_A10936PrdCtw1, BC01PJ25_A10937PrdCtw2, BC01PJ25_A10938PrdCtw3, BC01PJ25_A11663PrdCtw4, BC01PJ25_A11196PrdNroCAS, BC01PJ25_A11363PrdGots,
            BC01PJ25_A11364PrdHm, BC01PJ25_A11470PrdConct, BC01PJ25_A11614PrdEINECS, BC01PJ25_A11615PrdFuncion, BC01PJ25_A11616PrdNmQu, BC01PJ25_A11687PrdList, BC01PJ25_A12715PrdFabNm, BC01PJ25_n12715PrdFabNm, BC01PJ25_A12957PrdLoteOb, BC01PJ25_A13232PrdRGB,
            BC01PJ25_A13301PrdZDHC, BC01PJ25_A13302PrdTHELIST, BC01PJ25_n13302PrdTHELIST, BC01PJ25_A13457PrdUbicaci, BC01PJ25_A3936PrdEqLP
            }
            , new Object[] {
            BC01PJ26_A396EmprCod
            }
            , new Object[] {
            BC01PJ27_A630MetDsc, BC01PJ27_n630MetDsc
            }
            , new Object[] {
            BC01PJ28_A794PrvNom, BC01PJ28_n794PrvNom
            }
            , new Object[] {
            BC01PJ29_A837TipDtoDto, BC01PJ29_n837TipDtoDto
            }
            , new Object[] {
            BC01PJ30_A737PrdUcpDsc, BC01PJ30_n737PrdUcpDsc
            }
            , new Object[] {
            BC01PJ31_A736PrdUcoDsc, BC01PJ31_n736PrdUcoDsc
            }
            , new Object[] {
            BC01PJ32_A857ValDsc, BC01PJ32_n857ValDsc
            }
            , new Object[] {
            BC01PJ33_A6302TipPrdDsc, BC01PJ33_n6302TipPrdDsc
            }
            , new Object[] {
            BC01PJ34_A9610SubFamDsc, BC01PJ34_n9610SubFamDsc
            }
            , new Object[] {
            BC01PJ35_A12715PrdFabNm, BC01PJ35_n12715PrdFabNm
            }
            , new Object[] {
            BC01PJ36_A396EmprCod
            }
            , new Object[] {
            BC01PJ37_A396EmprCod, BC01PJ37_A719PrdNum
            }
            , new Object[] {
            BC01PJ38_A8896PrdPesCon, BC01PJ38_A13968PrdCantAtM, BC01PJ38_n13968PrdCantAtM, BC01PJ38_A13970PrdMatSeca, BC01PJ38_n13970PrdMatSeca, BC01PJ38_A13971PrdLoteFch, BC01PJ38_n13971PrdLoteFch, BC01PJ38_A13972PrdFTdoc, BC01PJ38_n13972PrdFTdoc, BC01PJ38_A13973PrdFSdoc,
            BC01PJ38_n13973PrdFSdoc, BC01PJ38_A13974PrdGRS, BC01PJ38_n13974PrdGRS, BC01PJ38_A396EmprCod, BC01PJ38_A13969PrdGruFamI, BC01PJ38_n13969PrdGruFamI, BC01PJ38_A629MetCod, BC01PJ38_n629MetCod, BC01PJ38_A795PrvNum, BC01PJ38_A835TipDtoCod,
            BC01PJ38_n835TipDtoCod, BC01PJ38_A742PrdUniCom, BC01PJ38_A743PrdUniCon, BC01PJ38_A856ValCod, BC01PJ38_A6301TipPrdCod, BC01PJ38_n6301TipPrdCod, BC01PJ38_A9609SubFamCod, BC01PJ38_n9609SubFamCod, BC01PJ38_A12714PrdFabId, BC01PJ38_n12714PrdFabId,
            BC01PJ38_A13927AlmPrdID, BC01PJ38_n13927AlmPrdID, BC01PJ38_A719PrdNum, BC01PJ38_A709PrdFecPre, BC01PJ38_A5590PrdSolub, BC01PJ38_A8897PrdPesTerm, BC01PJ38_A718PrdNom, BC01PJ38_A728PrdRefPrv, BC01PJ38_A703PrdDscTec, BC01PJ38_A707PrdFacCon,
            BC01PJ38_A727PrdRec, BC01PJ38_A682PrdCalNec, BC01PJ38_A698PrdDetPar, BC01PJ38_A730PrdSit, BC01PJ38_A729PrdRotRea, BC01PJ38_A724PrdPreAct, BC01PJ38_A725PrdPreAnt, BC01PJ38_A726PrdPreMed, BC01PJ38_A696PrdConDia, BC01PJ38_A731PrdStkMinD,
            BC01PJ38_A732PrdStkMinU, BC01PJ38_A699PrdDiaRot, BC01PJ38_A722PrdPlaEnt, BC01PJ38_A716PrdLotMin, BC01PJ38_A721PrdNumUco, BC01PJ38_A704PrdExiAlm, BC01PJ38_A705PrdExiCC, BC01PJ38_A685PrdCanRes, BC01PJ38_A684PrdCanPen, BC01PJ38_A713PrdFulEnt,
            BC01PJ38_A714PrdFulPed, BC01PJ38_A712PrdFulCC, BC01PJ38_A706PrdExiCCP, BC01PJ38_A740PrdUltECC, BC01PJ38_A738PrdUltCCC, BC01PJ38_A739PrdUltDCC, BC01PJ38_A700PrdDifCC, BC01PJ38_A695PrdConCC, BC01PJ38_A750PrdValStk, BC01PJ38_A332DifValStk,
            BC01PJ38_A708PrdFecEnt, BC01PJ38_A1193PrdPosX, BC01PJ38_A1194PrdPosY, BC01PJ38_A1643PrdTip, BC01PJ38_A1644PrdDqo, BC01PJ38_A3004PrdRev, BC01PJ38_A3273PrdTnq, BC01PJ38_A4692PrdNom2, BC01PJ38_A4693PrdNum2, BC01PJ38_A4694PrdObs,
            BC01PJ38_A4338PrdUMeFo, BC01PJ38_A5255PrdPreAc2, BC01PJ38_A5416PrdDensS, BC01PJ38_A5417PrdConcS, BC01PJ38_A5418PrdSalM, BC01PJ38_A6191PrdNumCent, BC01PJ38_A7226PrdNumct1, BC01PJ38_A7227PrdNumct2, BC01PJ38_A7260PrdHorMad, BC01PJ38_A8659PrdExiAlmc,
            BC01PJ38_A8936PrdSal, BC01PJ38_A9731PrdInc, BC01PJ38_A9732PrdComp, BC01PJ38_A9733PrdAox, BC01PJ38_A9734PrdNCAS, BC01PJ38_A9739PrdFT, BC01PJ38_A9740PrdFFT, BC01PJ38_A9741PrdHS, BC01PJ38_A9742PrdFHS, BC01PJ38_A10119PrdColIdx,
            BC01PJ38_A5888PrdOkotex, BC01PJ38_A5887PrdReach, BC01PJ38_A10881PrdLote, BC01PJ38_A10935PrdRTM, BC01PJ38_A10936PrdCtw1, BC01PJ38_A10937PrdCtw2, BC01PJ38_A10938PrdCtw3, BC01PJ38_A11663PrdCtw4, BC01PJ38_A11196PrdNroCAS, BC01PJ38_A11363PrdGots,
            BC01PJ38_A11364PrdHm, BC01PJ38_A11470PrdConct, BC01PJ38_A11614PrdEINECS, BC01PJ38_A11615PrdFuncion, BC01PJ38_A11616PrdNmQu, BC01PJ38_A11687PrdList, BC01PJ38_A12957PrdLoteOb, BC01PJ38_A13232PrdRGB, BC01PJ38_A13301PrdZDHC, BC01PJ38_A13302PrdTHELIST,
            BC01PJ38_n13302PrdTHELIST, BC01PJ38_A13457PrdUbicaci, BC01PJ38_A3936PrdEqLP
            }
            , new Object[] {
            BC01PJ39_A8896PrdPesCon, BC01PJ39_A13968PrdCantAtM, BC01PJ39_n13968PrdCantAtM, BC01PJ39_A13970PrdMatSeca, BC01PJ39_n13970PrdMatSeca, BC01PJ39_A13971PrdLoteFch, BC01PJ39_n13971PrdLoteFch, BC01PJ39_A13972PrdFTdoc, BC01PJ39_n13972PrdFTdoc, BC01PJ39_A13973PrdFSdoc,
            BC01PJ39_n13973PrdFSdoc, BC01PJ39_A13974PrdGRS, BC01PJ39_n13974PrdGRS, BC01PJ39_A396EmprCod, BC01PJ39_A13969PrdGruFamI, BC01PJ39_n13969PrdGruFamI, BC01PJ39_A629MetCod, BC01PJ39_n629MetCod, BC01PJ39_A795PrvNum, BC01PJ39_A835TipDtoCod,
            BC01PJ39_n835TipDtoCod, BC01PJ39_A742PrdUniCom, BC01PJ39_A743PrdUniCon, BC01PJ39_A856ValCod, BC01PJ39_A6301TipPrdCod, BC01PJ39_n6301TipPrdCod, BC01PJ39_A9609SubFamCod, BC01PJ39_n9609SubFamCod, BC01PJ39_A12714PrdFabId, BC01PJ39_n12714PrdFabId,
            BC01PJ39_A13927AlmPrdID, BC01PJ39_n13927AlmPrdID, BC01PJ39_A719PrdNum, BC01PJ39_A709PrdFecPre, BC01PJ39_A5590PrdSolub, BC01PJ39_A8897PrdPesTerm, BC01PJ39_A718PrdNom, BC01PJ39_A728PrdRefPrv, BC01PJ39_A703PrdDscTec, BC01PJ39_A707PrdFacCon,
            BC01PJ39_A727PrdRec, BC01PJ39_A682PrdCalNec, BC01PJ39_A698PrdDetPar, BC01PJ39_A730PrdSit, BC01PJ39_A729PrdRotRea, BC01PJ39_A724PrdPreAct, BC01PJ39_A725PrdPreAnt, BC01PJ39_A726PrdPreMed, BC01PJ39_A696PrdConDia, BC01PJ39_A731PrdStkMinD,
            BC01PJ39_A732PrdStkMinU, BC01PJ39_A699PrdDiaRot, BC01PJ39_A722PrdPlaEnt, BC01PJ39_A716PrdLotMin, BC01PJ39_A721PrdNumUco, BC01PJ39_A704PrdExiAlm, BC01PJ39_A705PrdExiCC, BC01PJ39_A685PrdCanRes, BC01PJ39_A684PrdCanPen, BC01PJ39_A713PrdFulEnt,
            BC01PJ39_A714PrdFulPed, BC01PJ39_A712PrdFulCC, BC01PJ39_A706PrdExiCCP, BC01PJ39_A740PrdUltECC, BC01PJ39_A738PrdUltCCC, BC01PJ39_A739PrdUltDCC, BC01PJ39_A700PrdDifCC, BC01PJ39_A695PrdConCC, BC01PJ39_A750PrdValStk, BC01PJ39_A332DifValStk,
            BC01PJ39_A708PrdFecEnt, BC01PJ39_A1193PrdPosX, BC01PJ39_A1194PrdPosY, BC01PJ39_A1643PrdTip, BC01PJ39_A1644PrdDqo, BC01PJ39_A3004PrdRev, BC01PJ39_A3273PrdTnq, BC01PJ39_A4692PrdNom2, BC01PJ39_A4693PrdNum2, BC01PJ39_A4694PrdObs,
            BC01PJ39_A4338PrdUMeFo, BC01PJ39_A5255PrdPreAc2, BC01PJ39_A5416PrdDensS, BC01PJ39_A5417PrdConcS, BC01PJ39_A5418PrdSalM, BC01PJ39_A6191PrdNumCent, BC01PJ39_A7226PrdNumct1, BC01PJ39_A7227PrdNumct2, BC01PJ39_A7260PrdHorMad, BC01PJ39_A8659PrdExiAlmc,
            BC01PJ39_A8936PrdSal, BC01PJ39_A9731PrdInc, BC01PJ39_A9732PrdComp, BC01PJ39_A9733PrdAox, BC01PJ39_A9734PrdNCAS, BC01PJ39_A9739PrdFT, BC01PJ39_A9740PrdFFT, BC01PJ39_A9741PrdHS, BC01PJ39_A9742PrdFHS, BC01PJ39_A10119PrdColIdx,
            BC01PJ39_A5888PrdOkotex, BC01PJ39_A5887PrdReach, BC01PJ39_A10881PrdLote, BC01PJ39_A10935PrdRTM, BC01PJ39_A10936PrdCtw1, BC01PJ39_A10937PrdCtw2, BC01PJ39_A10938PrdCtw3, BC01PJ39_A11663PrdCtw4, BC01PJ39_A11196PrdNroCAS, BC01PJ39_A11363PrdGots,
            BC01PJ39_A11364PrdHm, BC01PJ39_A11470PrdConct, BC01PJ39_A11614PrdEINECS, BC01PJ39_A11615PrdFuncion, BC01PJ39_A11616PrdNmQu, BC01PJ39_A11687PrdList, BC01PJ39_A12957PrdLoteOb, BC01PJ39_A13232PrdRGB, BC01PJ39_A13301PrdZDHC, BC01PJ39_A13302PrdTHELIST,
            BC01PJ39_n13302PrdTHELIST, BC01PJ39_A13457PrdUbicaci, BC01PJ39_A3936PrdEqLP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01PJ43_A794PrvNom, BC01PJ43_n794PrvNom
            }
            , new Object[] {
            BC01PJ44_A737PrdUcpDsc, BC01PJ44_n737PrdUcpDsc
            }
            , new Object[] {
            BC01PJ45_A736PrdUcoDsc, BC01PJ45_n736PrdUcoDsc
            }
            , new Object[] {
            BC01PJ46_A857ValDsc, BC01PJ46_n857ValDsc
            }
            , new Object[] {
            BC01PJ47_A837TipDtoDto, BC01PJ47_n837TipDtoDto
            }
            , new Object[] {
            BC01PJ48_A630MetDsc, BC01PJ48_n630MetDsc
            }
            , new Object[] {
            BC01PJ49_A6302TipPrdDsc, BC01PJ49_n6302TipPrdDsc
            }
            , new Object[] {
            BC01PJ50_A9610SubFamDsc, BC01PJ50_n9610SubFamDsc
            }
            , new Object[] {
            BC01PJ51_A12715PrdFabNm, BC01PJ51_n12715PrdFabNm
            }
            , new Object[] {
            BC01PJ52_A396EmprCod, BC01PJ52_A719PrdNum, BC01PJ52_A13217NormaID
            }
            , new Object[] {
            BC01PJ53_A396EmprCod, BC01PJ53_A719PrdNum, BC01PJ53_A13586TheList
            }
            , new Object[] {
            BC01PJ54_A396EmprCod, BC01PJ54_A5532Lb_numero, BC01PJ54_A5555Lb_opcion, BC01PJ54_A13460Lb_linCP, BC01PJ54_A13458Lb_TipCP
            }
            , new Object[] {
            BC01PJ55_A396EmprCod, BC01PJ55_A13418AlbProID, BC01PJ55_A13442AlbProLine
            }
            , new Object[] {
            BC01PJ56_A396EmprCod, BC01PJ56_A13324LDESID, BC01PJ56_A13333LDESNPeque, BC01PJ56_A13337LDESComb, BC01PJ56_A13339LDESFondo, BC01PJ56_A13342LDESLinea
            }
            , new Object[] {
            BC01PJ57_A396EmprCod, BC01PJ57_A13312Lb_NLab, BC01PJ57_A13305Lb_IDVeces, BC01PJ57_A13306Lb_LinID
            }
            , new Object[] {
            BC01PJ58_A396EmprCod, BC01PJ58_A12673LavMqId, BC01PJ58_A12692LavMqLnPq, BC01PJ58_A12681LavMqLn
            }
            , new Object[] {
            BC01PJ59_A396EmprCod, BC01PJ59_A719PrdNum, BC01PJ59_A9713Tb1_Cod
            }
            , new Object[] {
            BC01PJ60_A396EmprCod, BC01PJ60_A12236PrdNumD, BC01PJ60_A719PrdNum
            }
            , new Object[] {
            BC01PJ61_A396EmprCod, BC01PJ61_A12225DocDisID, BC01PJ61_A12226LinDisID
            }
            , new Object[] {
            BC01PJ62_A396EmprCod, BC01PJ62_A12225DocDisID
            }
            , new Object[] {
            BC01PJ63_A396EmprCod, BC01PJ63_A12205OrdenCID, BC01PJ63_A12206OrdenCLnId
            }
            , new Object[] {
            BC01PJ64_A396EmprCod, BC01PJ64_A719PrdNum, BC01PJ64_A11664LoteID, BC01PJ64_A11665LoteFec
            }
            , new Object[] {
            BC01PJ65_A396EmprCod, BC01PJ65_A4850DevComCod, BC01PJ65_A719PrdNum
            }
            , new Object[] {
            BC01PJ66_A396EmprCod, BC01PJ66_A252CliCod, BC01PJ66_A494ForSer, BC01PJ66_A482ForColNom, BC01PJ66_A483ForColNum, BC01PJ66_A831TipColCod, BC01PJ66_A3571EnsCod, BC01PJ66_A3582EnsLin
            }
            , new Object[] {
            BC01PJ67_A396EmprCod, BC01PJ67_A129BarCod, BC01PJ67_A132BarCodReo, BC01PJ67_A130BarCodPar, BC01PJ67_A4075recestncol, BC01PJ67_A4076recestnpro, BC01PJ67_A4108recestlin
            }
            , new Object[] {
            BC01PJ68_A396EmprCod, BC01PJ68_A4052EstNumFor, BC01PJ68_A4053EstNumCol, BC01PJ68_A4090EstEspLin
            }
            , new Object[] {
            BC01PJ69_A396EmprCod, BC01PJ69_A4052EstNumFor, BC01PJ69_A4053EstNumCol, BC01PJ69_A4084EstProLin
            }
            , new Object[] {
            BC01PJ70_A396EmprCod, BC01PJ70_A11644TransferId, BC01PJ70_A11653TransferLn
            }
            , new Object[] {
            BC01PJ71_A396EmprCod, BC01PJ71_A11634TaesId, BC01PJ71_A11637TaesLn, BC01PJ71_A11641TaesLnP
            }
            , new Object[] {
            BC01PJ72_A396EmprCod, BC01PJ72_A719PrdNum, BC01PJ72_A11329H_stklin
            }
            , new Object[] {
            BC01PJ73_A396EmprCod, BC01PJ73_A11270Pot_num, BC01PJ73_A11271Pot_lin
            }
            , new Object[] {
            BC01PJ74_A396EmprCod, BC01PJ74_A719PrdNum, BC01PJ74_A11199PrdNcasC
            }
            , new Object[] {
            BC01PJ75_A396EmprCod, BC01PJ75_A719PrdNum, BC01PJ75_A11197CFraseR
            }
            , new Object[] {
            BC01PJ76_A396EmprCod, BC01PJ76_A10243Jt_codigo, BC01PJ76_A10246Jt_ord
            }
            , new Object[] {
            BC01PJ77_A396EmprCod, BC01PJ77_A10236Bny_dia, BC01PJ77_A10238Bny_lin
            }
            , new Object[] {
            BC01PJ78_A396EmprCod, BC01PJ78_A129BarCod, BC01PJ78_A132BarCodReo, BC01PJ78_A130BarCodPar, BC01PJ78_A758ProCod, BC01PJ78_A194BarOrdLin, BC01PJ78_A719PrdNum
            }
            , new Object[] {
            BC01PJ79_A396EmprCod, BC01PJ79_A719PrdNum, BC01PJ79_A9735Cod_Rgo
            }
            , new Object[] {
            BC01PJ80_A396EmprCod, BC01PJ80_A719PrdNum, BC01PJ80_A9711Ct_codigo
            }
            , new Object[] {
            BC01PJ81_A396EmprCod, BC01PJ81_A9652OeNum, BC01PJ81_A9653OeHdr, BC01PJ81_A9654OeHdrr, BC01PJ81_A9655OeHdrp, BC01PJ81_A9656OeLinC, BC01PJ81_A9657OeComb, BC01PJ81_A9658Oefondo, BC01PJ81_A9659OeMolCil, BC01PJ81_A9686OePasLin,
            BC01PJ81_A9694OePasPLi
            }
            , new Object[] {
            BC01PJ82_A396EmprCod, BC01PJ82_A9652OeNum, BC01PJ82_A9653OeHdr, BC01PJ82_A9654OeHdrr, BC01PJ82_A9655OeHdrp, BC01PJ82_A9656OeLinC, BC01PJ82_A9657OeComb, BC01PJ82_A9658Oefondo, BC01PJ82_A9659OeMolCil, BC01PJ82_A9677OeMolLin
            }
            , new Object[] {
            BC01PJ83_A396EmprCod, BC01PJ83_A9578Pas_Num, BC01PJ83_A719PrdNum
            }
            , new Object[] {
            BC01PJ84_A396EmprCod, BC01PJ84_A719PrdNum, BC01PJ84_A8908CC_AlmCod
            }
            , new Object[] {
            BC01PJ85_A396EmprCod, BC01PJ85_A719PrdNum, BC01PJ85_A8661Almc_Ln
            }
            , new Object[] {
            BC01PJ86_A396EmprCod, BC01PJ86_A719PrdNum, BC01PJ86_A8648Mat_PrdN
            }
            , new Object[] {
            BC01PJ87_A396EmprCod, BC01PJ87_A8585Pet_cod, BC01PJ87_A719PrdNum
            }
            , new Object[] {
            BC01PJ88_A396EmprCod, BC01PJ88_A719PrdNum, BC01PJ88_A8577RecFecHr
            }
            , new Object[] {
            BC01PJ89_A396EmprCod, BC01PJ89_A719PrdNum, BC01PJ89_A8366PrdAnyo, BC01PJ89_A8360PrdProv
            }
            , new Object[] {
            BC01PJ90_A396EmprCod, BC01PJ90_A252CliCod, BC01PJ90_A494ForSer, BC01PJ90_A482ForColNom, BC01PJ90_A483ForColNum, BC01PJ90_A831TipColCod, BC01PJ90_A7797Sim_lin
            }
            , new Object[] {
            BC01PJ91_A396EmprCod, BC01PJ91_A7163Vir_Codigo, BC01PJ91_A719PrdNum
            }
            , new Object[] {
            BC01PJ92_A396EmprCod, BC01PJ92_A6310Lb_TaAuxC, BC01PJ92_A6313lb_TaAuxL, BC01PJ92_A6378Lb_TauxLP
            }
            , new Object[] {
            BC01PJ93_A396EmprCod, BC01PJ93_A6290PreCoNum, BC01PJ93_A719PrdNum
            }
            , new Object[] {
            BC01PJ94_A396EmprCod, BC01PJ94_A719PrdNum, BC01PJ94_A6158PrdPrv
            }
            , new Object[] {
            BC01PJ95_A396EmprCod, BC01PJ95_A719PrdNum, BC01PJ95_A5973PrdSusNum
            }
            , new Object[] {
            BC01PJ96_A396EmprCod, BC01PJ96_A5612Lb_CodGru, BC01PJ96_A5615Lb_LinGru
            }
            , new Object[] {
            BC01PJ97_A396EmprCod, BC01PJ97_A5532Lb_numero, BC01PJ97_A5555Lb_opcion, BC01PJ97_A5560Lb_LineaPr
            }
            , new Object[] {
            BC01PJ98_A396EmprCod, BC01PJ98_A5532Lb_numero, BC01PJ98_A5555Lb_opcion, BC01PJ98_A5557Lb_LineaC
            }
            , new Object[] {
            BC01PJ99_A396EmprCod, BC01PJ99_A5145SobCod, BC01PJ99_A719PrdNum
            }
            , new Object[] {
            BC01PJ100_A396EmprCod, BC01PJ100_A4744RecPreCod, BC01PJ100_A4762RecPreLin, BC01PJ100_A4763RecPreNli
            }
            , new Object[] {
            BC01PJ101_A396EmprCod, BC01PJ101_A4492HreBarCod, BC01PJ101_A4493HreBarReo, BC01PJ101_A4494HreBarPar, BC01PJ101_A4495HreNumCie, BC01PJ101_A4545HreLinMaq, BC01PJ101_A4550HreLinPro, BC01PJ101_A4557HreRecLin
            }
            , new Object[] {
            BC01PJ102_A396EmprCod, BC01PJ102_A4492HreBarCod, BC01PJ102_A4493HreBarReo, BC01PJ102_A4494HreBarPar, BC01PJ102_A4495HreNumCie, BC01PJ102_A4508HreLinMAL, BC01PJ102_A4509HreNumAny, BC01PJ102_A719PrdNum
            }
            , new Object[] {
            BC01PJ103_A396EmprCod, BC01PJ103_A252CliCod, BC01PJ103_A4415EstCol, BC01PJ103_A4416EstColLin
            }
            , new Object[] {
            BC01PJ104_A396EmprCod, BC01PJ104_A129BarCod, BC01PJ104_A132BarCodReo, BC01PJ104_A130BarCodPar, BC01PJ104_A2524DisComLin, BC01PJ104_A1056DisComCod, BC01PJ104_A1032FonCod, BC01PJ104_A2124RecMolCod, BC01PJ104_A2672RecPasLin, BC01PJ104_A2675RecPasPLi
            }
            , new Object[] {
            BC01PJ105_A396EmprCod, BC01PJ105_A129BarCod, BC01PJ105_A132BarCodReo, BC01PJ105_A130BarCodPar, BC01PJ105_A2524DisComLin, BC01PJ105_A1056DisComCod, BC01PJ105_A1032FonCod, BC01PJ105_A2124RecMolCod, BC01PJ105_A2126RecMolLin
            }
            , new Object[] {
            BC01PJ106_A396EmprCod, BC01PJ106_A2107PasCod, BC01PJ106_A719PrdNum
            }
            , new Object[] {
            BC01PJ107_A396EmprCod, BC01PJ107_A2637HisEstHRu, BC01PJ107_A2636HisEstHRe, BC01PJ107_A2635HisEstHPa, BC01PJ107_A2638HisEstLCo, BC01PJ107_A2630HisEstCom, BC01PJ107_A2634HisEstFon, BC01PJ107_A719PrdNum
            }
            , new Object[] {
            BC01PJ108_A396EmprCod, BC01PJ108_A252CliCod, BC01PJ108_A2141SerEst, BC01PJ108_A1013DibCli, BC01PJ108_A1014DibInt, BC01PJ108_A2074ColCom, BC01PJ108_A2078ColFon, BC01PJ108_A2098MolCod, BC01PJ108_A2535ForPrdLin
            }
            , new Object[] {
            BC01PJ109_A396EmprCod, BC01PJ109_A719PrdNum, BC01PJ109_A3342CCStkLin
            }
            , new Object[] {
            BC01PJ110_A396EmprCod, BC01PJ110_A252CliCod, BC01PJ110_A2891HMaForSer, BC01PJ110_A2892HMaForCNom, BC01PJ110_A2893HMaForCNum, BC01PJ110_A2894HMaTipCCod, BC01PJ110_A2895HMaForNumC, BC01PJ110_A2897HMaColLin, BC01PJ110_A2896HMaFec, BC01PJ110_A2907HmaLin
            }
            , new Object[] {
            BC01PJ111_A396EmprCod, BC01PJ111_A129BarCod, BC01PJ111_A132BarCodReo, BC01PJ111_A130BarCodPar, BC01PJ111_A2808RecLinMAL, BC01PJ111_A1377RecNumAny, BC01PJ111_A719PrdNum
            }
            , new Object[] {
            BC01PJ112_A396EmprCod, BC01PJ112_A129BarCod, BC01PJ112_A132BarCodReo, BC01PJ112_A130BarCodPar, BC01PJ112_A2804RecLinMaq, BC01PJ112_A1273RecLinPro, BC01PJ112_A811RecLin
            }
            , new Object[] {
            BC01PJ113_A396EmprCod, BC01PJ113_A129BarCod, BC01PJ113_A132BarCodReo, BC01PJ113_A130BarCodPar, BC01PJ113_A2494BarDosPro, BC01PJ113_A719PrdNum
            }
            , new Object[] {
            BC01PJ114_A396EmprCod, BC01PJ114_A1314EnsLabCod, BC01PJ114_A1317EnsLabLin
            }
            , new Object[] {
            BC01PJ115_A396EmprCod, BC01PJ115_A910Workstat, BC01PJ115_A887EscMLin
            }
            , new Object[] {
            BC01PJ116_A396EmprCod, BC01PJ116_A859CumCodCont, BC01PJ116_A719PrdNum
            }
            , new Object[] {
            BC01PJ117_A396EmprCod, BC01PJ117_A719PrdNum, BC01PJ117_A810RecFec
            }
            , new Object[] {
            BC01PJ118_A396EmprCod, BC01PJ118_A486ForNumCol, BC01PJ118_A715PrdLin
            }
            , new Object[] {
            BC01PJ119_A396EmprCod, BC01PJ119_A719PrdNum, BC01PJ119_A681PrdAny
            }
            , new Object[] {
            BC01PJ120_A396EmprCod, BC01PJ120_A719PrdNum, BC01PJ120_A688PrdComCod
            }
            , new Object[] {
            BC01PJ121_A396EmprCod, BC01PJ121_A719PrdNum, BC01PJ121_A680PrdAltNum
            }
            , new Object[] {
            BC01PJ122_A396EmprCod, BC01PJ122_A658PedCod, BC01PJ122_A719PrdNum
            }
            , new Object[] {
            BC01PJ123_A396EmprCod, BC01PJ123_A486ForNumCol, BC01PJ123_A309ColLin
            }
            , new Object[] {
            BC01PJ124_A396EmprCod, BC01PJ124_A719PrdNum, BC01PJ124_A647NumCon
            }
            , new Object[] {
            BC01PJ126_A8896PrdPesCon, BC01PJ126_A13968PrdCantAtM, BC01PJ126_n13968PrdCantAtM, BC01PJ126_A13970PrdMatSeca, BC01PJ126_n13970PrdMatSeca, BC01PJ126_A13971PrdLoteFch, BC01PJ126_n13971PrdLoteFch, BC01PJ126_A13972PrdFTdoc, BC01PJ126_n13972PrdFTdoc, BC01PJ126_A13973PrdFSdoc,
            BC01PJ126_n13973PrdFSdoc, BC01PJ126_A13974PrdGRS, BC01PJ126_n13974PrdGRS, BC01PJ126_A396EmprCod, BC01PJ126_A13969PrdGruFamI, BC01PJ126_n13969PrdGruFamI, BC01PJ126_A629MetCod, BC01PJ126_n629MetCod, BC01PJ126_A795PrvNum, BC01PJ126_A835TipDtoCod,
            BC01PJ126_n835TipDtoCod, BC01PJ126_A742PrdUniCom, BC01PJ126_A743PrdUniCon, BC01PJ126_A856ValCod, BC01PJ126_A6301TipPrdCod, BC01PJ126_n6301TipPrdCod, BC01PJ126_A9609SubFamCod, BC01PJ126_n9609SubFamCod, BC01PJ126_A12714PrdFabId, BC01PJ126_n12714PrdFabId,
            BC01PJ126_A13927AlmPrdID, BC01PJ126_n13927AlmPrdID, BC01PJ126_A13875PrdLastLin, BC01PJ126_n13875PrdLastLin, BC01PJ126_A719PrdNum, BC01PJ126_A709PrdFecPre, BC01PJ126_A5590PrdSolub, BC01PJ126_A8897PrdPesTerm, BC01PJ126_A407EmprNom, BC01PJ126_n407EmprNom,
            BC01PJ126_A718PrdNom, BC01PJ126_A794PrvNom, BC01PJ126_n794PrvNom, BC01PJ126_A728PrdRefPrv, BC01PJ126_A703PrdDscTec, BC01PJ126_A737PrdUcpDsc, BC01PJ126_n737PrdUcpDsc, BC01PJ126_A736PrdUcoDsc, BC01PJ126_n736PrdUcoDsc, BC01PJ126_A707PrdFacCon,
            BC01PJ126_A857ValDsc, BC01PJ126_n857ValDsc, BC01PJ126_A727PrdRec, BC01PJ126_A682PrdCalNec, BC01PJ126_A698PrdDetPar, BC01PJ126_A730PrdSit, BC01PJ126_A729PrdRotRea, BC01PJ126_A837TipDtoDto, BC01PJ126_n837TipDtoDto, BC01PJ126_A724PrdPreAct,
            BC01PJ126_A725PrdPreAnt, BC01PJ126_A726PrdPreMed, BC01PJ126_A696PrdConDia, BC01PJ126_A731PrdStkMinD, BC01PJ126_A732PrdStkMinU, BC01PJ126_A699PrdDiaRot, BC01PJ126_A722PrdPlaEnt, BC01PJ126_A630MetDsc, BC01PJ126_n630MetDsc, BC01PJ126_A716PrdLotMin,
            BC01PJ126_A721PrdNumUco, BC01PJ126_A704PrdExiAlm, BC01PJ126_A705PrdExiCC, BC01PJ126_A685PrdCanRes, BC01PJ126_A684PrdCanPen, BC01PJ126_A713PrdFulEnt, BC01PJ126_A714PrdFulPed, BC01PJ126_A712PrdFulCC, BC01PJ126_A706PrdExiCCP, BC01PJ126_A740PrdUltECC,
            BC01PJ126_A738PrdUltCCC, BC01PJ126_A739PrdUltDCC, BC01PJ126_A700PrdDifCC, BC01PJ126_A695PrdConCC, BC01PJ126_A750PrdValStk, BC01PJ126_A332DifValStk, BC01PJ126_A708PrdFecEnt, BC01PJ126_A1193PrdPosX, BC01PJ126_A1194PrdPosY, BC01PJ126_A1643PrdTip,
            BC01PJ126_A1644PrdDqo, BC01PJ126_A3004PrdRev, BC01PJ126_A3273PrdTnq, BC01PJ126_A4692PrdNom2, BC01PJ126_A4693PrdNum2, BC01PJ126_A4694PrdObs, BC01PJ126_A4338PrdUMeFo, BC01PJ126_A5255PrdPreAc2, BC01PJ126_A5416PrdDensS, BC01PJ126_A5417PrdConcS,
            BC01PJ126_A5418PrdSalM, BC01PJ126_A6302TipPrdDsc, BC01PJ126_n6302TipPrdDsc, BC01PJ126_A6191PrdNumCent, BC01PJ126_A7226PrdNumct1, BC01PJ126_A7227PrdNumct2, BC01PJ126_A7260PrdHorMad, BC01PJ126_A8659PrdExiAlmc, BC01PJ126_A8936PrdSal, BC01PJ126_A9610SubFamDsc,
            BC01PJ126_n9610SubFamDsc, BC01PJ126_A9731PrdInc, BC01PJ126_A9732PrdComp, BC01PJ126_A9733PrdAox, BC01PJ126_A9734PrdNCAS, BC01PJ126_A9739PrdFT, BC01PJ126_A9740PrdFFT, BC01PJ126_A9741PrdHS, BC01PJ126_A9742PrdFHS, BC01PJ126_A10119PrdColIdx,
            BC01PJ126_A5888PrdOkotex, BC01PJ126_A5887PrdReach, BC01PJ126_A10881PrdLote, BC01PJ126_A10935PrdRTM, BC01PJ126_A10936PrdCtw1, BC01PJ126_A10937PrdCtw2, BC01PJ126_A10938PrdCtw3, BC01PJ126_A11663PrdCtw4, BC01PJ126_A11196PrdNroCAS, BC01PJ126_A11363PrdGots,
            BC01PJ126_A11364PrdHm, BC01PJ126_A11470PrdConct, BC01PJ126_A11614PrdEINECS, BC01PJ126_A11615PrdFuncion, BC01PJ126_A11616PrdNmQu, BC01PJ126_A11687PrdList, BC01PJ126_A12715PrdFabNm, BC01PJ126_n12715PrdFabNm, BC01PJ126_A12957PrdLoteOb, BC01PJ126_A13232PrdRGB,
            BC01PJ126_A13301PrdZDHC, BC01PJ126_A13302PrdTHELIST, BC01PJ126_n13302PrdTHELIST, BC01PJ126_A13457PrdUbicaci, BC01PJ126_A3936PrdEqLP
            }
            , new Object[] {
            BC01PJ127_A407EmprNom, BC01PJ127_n407EmprNom
            }
            , new Object[] {
            BC01PJ128_A407EmprNom, BC01PJ128_n407EmprNom
            }
            , new Object[] {
            BC01PJ129_A396EmprCod, BC01PJ129_A719PrdNum, BC01PJ129_A3342CCStkLin, BC01PJ129_A3345TipMovCc
            }
            , new Object[] {
            BC01PJ130_A396EmprCod, BC01PJ130_A719PrdNum, BC01PJ130_A3342CCStkLin, BC01PJ130_A3348CCStkFec
            }
            , new Object[] {
            BC01PJ131_A396EmprCod, BC01PJ131_A719PrdNum, BC01PJ131_A3342CCStkLin, BC01PJ131_A3345TipMovCc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      E396EmprCod = "" ;
      AV82Pgmname = "StocksQuimicos.PRODUC_BC" ;
      Z13968PrdCantAtM = (short)(0) ;
      n13968PrdCantAtM = false ;
      A13968PrdCantAtM = (short)(0) ;
      n13968PrdCantAtM = false ;
      i13968PrdCantAtM = (short)(0) ;
      n13968PrdCantAtM = false ;
      Z8896PrdPesCon = (byte)(1) ;
      A8896PrdPesCon = (byte)(1) ;
      i8896PrdPesCon = (byte)(1) ;
      Z13974PrdGRS = httpContext.getMessage( "N", "") ;
      n13974PrdGRS = false ;
      A13974PrdGRS = httpContext.getMessage( "N", "") ;
      n13974PrdGRS = false ;
      i13974PrdGRS = httpContext.getMessage( "N", "") ;
      n13974PrdGRS = false ;
      Z3936PrdEqLP = " " ;
      A3936PrdEqLP = " " ;
      i3936PrdEqLP = " " ;
      Z13301PrdZDHC = httpContext.getMessage( "N", "") ;
      A13301PrdZDHC = httpContext.getMessage( "N", "") ;
      i13301PrdZDHC = httpContext.getMessage( "N", "") ;
      Z12957PrdLoteOb = httpContext.getMessage( "N", "") ;
      A12957PrdLoteOb = httpContext.getMessage( "N", "") ;
      i12957PrdLoteOb = httpContext.getMessage( "N", "") ;
      Z11687PrdList = httpContext.getMessage( "N", "") ;
      A11687PrdList = httpContext.getMessage( "N", "") ;
      i11687PrdList = httpContext.getMessage( "N", "") ;
      Z11364PrdHm = httpContext.getMessage( "N", "") ;
      A11364PrdHm = httpContext.getMessage( "N", "") ;
      i11364PrdHm = httpContext.getMessage( "N", "") ;
      Z11363PrdGots = httpContext.getMessage( "N", "") ;
      A11363PrdGots = httpContext.getMessage( "N", "") ;
      i11363PrdGots = httpContext.getMessage( "N", "") ;
      Z5888PrdOkotex = httpContext.getMessage( "N", "") ;
      A5888PrdOkotex = httpContext.getMessage( "N", "") ;
      i5888PrdOkotex = httpContext.getMessage( "N", "") ;
      Z5887PrdReach = httpContext.getMessage( "N", "") ;
      A5887PrdReach = httpContext.getMessage( "N", "") ;
      i5887PrdReach = httpContext.getMessage( "N", "") ;
      Z9741PrdHS = httpContext.getMessage( "N", "") ;
      A9741PrdHS = httpContext.getMessage( "N", "") ;
      i9741PrdHS = httpContext.getMessage( "N", "") ;
      Z9739PrdFT = httpContext.getMessage( "N", "") ;
      A9739PrdFT = httpContext.getMessage( "N", "") ;
      i9739PrdFT = httpContext.getMessage( "N", "") ;
      Z5418PrdSalM = httpContext.getMessage( "N", "") ;
      A5418PrdSalM = httpContext.getMessage( "N", "") ;
      i5418PrdSalM = httpContext.getMessage( "N", "") ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z4338PrdUMeFo = (byte)(1) ;
      A4338PrdUMeFo = (byte)(1) ;
      i4338PrdUMeFo = (byte)(1) ;
      Z3004PrdRev = httpContext.getMessage( "N", "") ;
      A3004PrdRev = httpContext.getMessage( "N", "") ;
      i3004PrdRev = httpContext.getMessage( "N", "") ;
      Z1643PrdTip = httpContext.getMessage( "M", "") ;
      A1643PrdTip = httpContext.getMessage( "M", "") ;
      i1643PrdTip = httpContext.getMessage( "M", "") ;
      Z696PrdConDia = DecimalUtil.doubleToDec(1) ;
      A696PrdConDia = DecimalUtil.doubleToDec(1) ;
      i696PrdConDia = DecimalUtil.doubleToDec(1) ;
      Z727PrdRec = httpContext.getMessage( "N", "") ;
      A727PrdRec = httpContext.getMessage( "N", "") ;
      i727PrdRec = httpContext.getMessage( "N", "") ;
      Z682PrdCalNec = httpContext.getMessage( "S", "") ;
      A682PrdCalNec = httpContext.getMessage( "S", "") ;
      i682PrdCalNec = httpContext.getMessage( "S", "") ;
      Z698PrdDetPar = httpContext.getMessage( "N", "") ;
      A698PrdDetPar = httpContext.getMessage( "N", "") ;
      i698PrdDetPar = httpContext.getMessage( "N", "") ;
      Z707PrdFacCon = DecimalUtil.doubleToDec(1) ;
      A707PrdFacCon = DecimalUtil.doubleToDec(1) ;
      i707PrdFacCon = DecimalUtil.doubleToDec(1) ;
      Z856ValCod = (byte)(1) ;
      A856ValCod = (byte)(1) ;
      i856ValCod = (byte)(1) ;
      Z743PrdUniCon = (byte)(1) ;
      A743PrdUniCon = (byte)(1) ;
      i743PrdUniCon = (byte)(1) ;
      Z742PrdUniCom = (byte)(1) ;
      A742PrdUniCom = (byte)(1) ;
      i742PrdUniCom = (byte)(1) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121PJ2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV38Prdlist ;
   private byte AV39Thelist ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte AV57Insert_PrdUniCom ;
   private byte AV58Insert_PrdUniCon ;
   private byte AV59Insert_ValCod ;
   private byte AV60Insert_TipDtoCod ;
   private byte AV61Insert_MetCod ;
   private byte AV63Insert_SubFamCod ;
   private byte AV80Insert_PrdGruFamId ;
   private byte Z730PrdSit ;
   private byte A730PrdSit ;
   private byte Z1194PrdPosY ;
   private byte A1194PrdPosY ;
   private byte Z3273PrdTnq ;
   private byte A3273PrdTnq ;
   private byte Z4338PrdUMeFo ;
   private byte A4338PrdUMeFo ;
   private byte Z7260PrdHorMad ;
   private byte A7260PrdHorMad ;
   private byte Z8896PrdPesCon ;
   private byte A8896PrdPesCon ;
   private byte Z13969PrdGruFamI ;
   private byte A13969PrdGruFamI ;
   private byte Z629MetCod ;
   private byte A629MetCod ;
   private byte Z835TipDtoCod ;
   private byte A835TipDtoCod ;
   private byte Z742PrdUniCom ;
   private byte A742PrdUniCom ;
   private byte Z743PrdUniCon ;
   private byte A743PrdUniCon ;
   private byte Z856ValCod ;
   private byte A856ValCod ;
   private byte Z9609SubFamCod ;
   private byte A9609SubFamCod ;
   private byte Gx_BScreen ;
   private byte i742PrdUniCom ;
   private byte i743PrdUniCon ;
   private byte i856ValCod ;
   private byte i4338PrdUMeFo ;
   private byte i8896PrdPesCon ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV12gavim ;
   private short AV13Eliot ;
   private short AV14FlagCcs ;
   private short AV16FlagStm ;
   private short AV17F_preci2 ;
   private short AV18F_moda21 ;
   private short AV19ProPrv ;
   private short AV20FlagCen ;
   private short AV21NoVisible ;
   private short AV22Suprema ;
   private short AV23HorasM ;
   private short AV24PesColNE ;
   private short AV25PesColGX ;
   private short AV26Nalmcc ;
   private short AV27Premed ;
   private short AV28Carvema ;
   private short AV29Prdtb2 ;
   private short AV30Lotes ;
   private short AV31Erfoc ;
   private short AV33EliotLavanderia ;
   private short AV34TexplusAcatex ;
   private short AV35Ubicacion ;
   private short AV36SiRGB ;
   private short AV37Hm ;
   private short AV40Reach ;
   private short AV41Aox ;
   private short AV42Incid ;
   private short AV43Complej ;
   private short AV44Rtm ;
   private short AV45sustancias ;
   private short AV46BCTexplus ;
   private short AV62Insert_TipPrdCod ;
   private short AV74Insert_AlmPrdID ;
   private short Z731PrdStkMinD ;
   private short A731PrdStkMinD ;
   private short Z699PrdDiaRot ;
   private short A699PrdDiaRot ;
   private short Z722PrdPlaEnt ;
   private short A722PrdPlaEnt ;
   private short Z716PrdLotMin ;
   private short A716PrdLotMin ;
   private short Z738PrdUltCCC ;
   private short A738PrdUltCCC ;
   private short Z695PrdConCC ;
   private short A695PrdConCC ;
   private short Z1193PrdPosX ;
   private short A1193PrdPosX ;
   private short Z1644PrdDqo ;
   private short A1644PrdDqo ;
   private short Z11470PrdConct ;
   private short A11470PrdConct ;
   private short Z13968PrdCantAtM ;
   private short A13968PrdCantAtM ;
   private short Z6301TipPrdCod ;
   private short A6301TipPrdCod ;
   private short Z13927AlmPrdID ;
   private short A13927AlmPrdID ;
   private short Z13871PrdDiasIna ;
   private short A13871PrdDiasIna ;
   private short Z14006PrdDiaSinM ;
   private short A14006PrdDiaSinM ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short GXt_int13 ;
   private short GXv_int14[] ;
   private short i13968PrdCantAtM ;
   private int trnEnded ;
   private int AV15ContVal ;
   private int GXv_int7[] ;
   private int AV83GXV1 ;
   private int AV56Insert_PrvNum ;
   private int AV64Insert_PrdFabId ;
   private int GX_JID ;
   private int Z795PrvNum ;
   private int A795PrvNum ;
   private int Z12714PrdFabId ;
   private int A12714PrdFabId ;
   private long AV32FlagCColor ;
   private long Z13232PrdRGB ;
   private long A13232PrdRGB ;
   private long Z13873PrdUltMovC ;
   private long A13873PrdUltMovC ;
   private long Z13875PrdLastLin ;
   private long A13875PrdLastLin ;
   private long GXt_int15 ;
   private long GXv_int16[] ;
   private long E13873PrdUltMovC ;
   private java.math.BigDecimal Z5590PrdSolub ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal Z696PrdConDia ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal Z732PrdStkMinU ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal Z721PrdNumUco ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal Z740PrdUltECC ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal Z739PrdUltDCC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal Z700PrdDifCC ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal Z332DifValStk ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal Z5416PrdDensS ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal Z5417PrdConcS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal Z7226PrdNumct1 ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal Z7227PrdNumct2 ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal Z8659PrdExiAlmc ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal Z9733PrdAox ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal Z13970PrdMatSeca ;
   private java.math.BigDecimal A13970PrdMatSeca ;
   private java.math.BigDecimal Z13831PrdDisponi ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal Z837TipDtoDto ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV7Prdpreact ;
   private java.math.BigDecimal O724PrdPreAct ;
   private java.math.BigDecimal AV10oldPrdStkMinU ;
   private java.math.BigDecimal O732PrdStkMinU ;
   private java.math.BigDecimal GXv_decimal19[] ;
   private java.math.BigDecimal i5590PrdSolub ;
   private java.math.BigDecimal i707PrdFacCon ;
   private java.math.BigDecimal i696PrdConDia ;
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
   private String AV9Station ;
   private String AV47EmprNom ;
   private String AV8Usurcod ;
   private String GXt_char1 ;
   private String AV51EmprCod ;
   private String AV82Pgmname ;
   private String A13302PrdTHELIST ;
   private String AV11OldPrdTHELIST ;
   private String A718PrdNom ;
   private String Z8897PrdPesTerm ;
   private String A8897PrdPesTerm ;
   private String Z718PrdNom ;
   private String Z728PrdRefPrv ;
   private String A728PrdRefPrv ;
   private String Z703PrdDscTec ;
   private String A703PrdDscTec ;
   private String Z727PrdRec ;
   private String A727PrdRec ;
   private String Z682PrdCalNec ;
   private String A682PrdCalNec ;
   private String Z698PrdDetPar ;
   private String A698PrdDetPar ;
   private String Z1643PrdTip ;
   private String A1643PrdTip ;
   private String Z3004PrdRev ;
   private String A3004PrdRev ;
   private String Z4692PrdNom2 ;
   private String A4692PrdNom2 ;
   private String Z4693PrdNum2 ;
   private String A4693PrdNum2 ;
   private String Z5418PrdSalM ;
   private String A5418PrdSalM ;
   private String Z6191PrdNumCent ;
   private String A6191PrdNumCent ;
   private String Z8936PrdSal ;
   private String A8936PrdSal ;
   private String Z9731PrdInc ;
   private String A9731PrdInc ;
   private String Z9732PrdComp ;
   private String A9732PrdComp ;
   private String Z9734PrdNCAS ;
   private String A9734PrdNCAS ;
   private String Z9739PrdFT ;
   private String A9739PrdFT ;
   private String Z9741PrdHS ;
   private String A9741PrdHS ;
   private String Z10119PrdColIdx ;
   private String A10119PrdColIdx ;
   private String Z5888PrdOkotex ;
   private String A5888PrdOkotex ;
   private String Z5887PrdReach ;
   private String A5887PrdReach ;
   private String Z10881PrdLote ;
   private String A10881PrdLote ;
   private String Z10935PrdRTM ;
   private String A10935PrdRTM ;
   private String Z10936PrdCtw1 ;
   private String A10936PrdCtw1 ;
   private String Z10937PrdCtw2 ;
   private String A10937PrdCtw2 ;
   private String Z10938PrdCtw3 ;
   private String A10938PrdCtw3 ;
   private String Z11663PrdCtw4 ;
   private String A11663PrdCtw4 ;
   private String Z11196PrdNroCAS ;
   private String A11196PrdNroCAS ;
   private String Z11363PrdGots ;
   private String A11363PrdGots ;
   private String Z11364PrdHm ;
   private String A11364PrdHm ;
   private String Z11614PrdEINECS ;
   private String A11614PrdEINECS ;
   private String Z11615PrdFuncion ;
   private String A11615PrdFuncion ;
   private String Z11687PrdList ;
   private String A11687PrdList ;
   private String Z12957PrdLoteOb ;
   private String A12957PrdLoteOb ;
   private String Z13301PrdZDHC ;
   private String A13301PrdZDHC ;
   private String Z13302PrdTHELIST ;
   private String Z13457PrdUbicaci ;
   private String A13457PrdUbicaci ;
   private String Z3936PrdEqLP ;
   private String A3936PrdEqLP ;
   private String Z13974PrdGRS ;
   private String A13974PrdGRS ;
   private String Z13874PrdTipMovU ;
   private String A13874PrdTipMovU ;
   private String Z13877PrdLastTip ;
   private String A13877PrdLastTip ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z630MetDsc ;
   private String A630MetDsc ;
   private String Z794PrvNom ;
   private String A794PrvNom ;
   private String Z737PrdUcpDsc ;
   private String A737PrdUcpDsc ;
   private String Z736PrdUcoDsc ;
   private String A736PrdUcoDsc ;
   private String Z857ValDsc ;
   private String A857ValDsc ;
   private String Z6302TipPrdDsc ;
   private String A6302TipPrdDsc ;
   private String Z9610SubFamDsc ;
   private String A9610SubFamDsc ;
   private String Z12715PrdFabNm ;
   private String A12715PrdFabNm ;
   private String AV49Msg_e ;
   private String O718PrdNom ;
   private String O10881PrdLote ;
   private String O13302PrdTHELIST ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sMode29 ;
   private String GXv_char10[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String N8897PrdPesTerm ;
   private String i698PrdDetPar ;
   private String i682PrdCalNec ;
   private String i727PrdRec ;
   private String i1643PrdTip ;
   private String i3004PrdRev ;
   private String i5418PrdSalM ;
   private String i9739PrdFT ;
   private String i9741PrdHS ;
   private String i5887PrdReach ;
   private String i5888PrdOkotex ;
   private String i11363PrdGots ;
   private String i11364PrdHm ;
   private String i11687PrdList ;
   private String i12957PrdLoteOb ;
   private String i13301PrdZDHC ;
   private String i3936PrdEqLP ;
   private String i13974PrdGRS ;
   private String X3345TipMovCc ;
   private String E396EmprCod ;
   private String E719PrdNum ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date Z714PrdFulPed ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date Z712PrdFulCC ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date Z708PrdFecEnt ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date Z9740PrdFFT ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date Z9742PrdFHS ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date Z13971PrdLoteFch ;
   private java.util.Date A13971PrdLoteFch ;
   private java.util.Date Z13872PrdFecUltM ;
   private java.util.Date A13872PrdFecUltM ;
   private java.util.Date Z13876PrdLastFec ;
   private java.util.Date A13876PrdLastFec ;
   private java.util.Date GXt_date17 ;
   private java.util.Date GXv_date18[] ;
   private java.util.Date i709PrdFecPre ;
   private java.util.Date X3348CCStkFec ;
   private boolean returnInSub ;
   private boolean Z13881PrdEsCompu ;
   private boolean A13881PrdEsCompu ;
   private boolean n719PrdNum ;
   private boolean n13875PrdLastLin ;
   private boolean n407EmprNom ;
   private boolean n13974PrdGRS ;
   private boolean n13968PrdCantAtM ;
   private boolean n737PrdUcpDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n857ValDsc ;
   private boolean n13970PrdMatSeca ;
   private boolean n13971PrdLoteFch ;
   private boolean n13972PrdFTdoc ;
   private boolean n13973PrdFSdoc ;
   private boolean n13969PrdGruFamI ;
   private boolean n629MetCod ;
   private boolean n835TipDtoCod ;
   private boolean n6301TipPrdCod ;
   private boolean n9609SubFamCod ;
   private boolean n12714PrdFabId ;
   private boolean n13927AlmPrdID ;
   private boolean n794PrvNom ;
   private boolean n837TipDtoDto ;
   private boolean n630MetDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n9610SubFamDsc ;
   private boolean n12715PrdFabNm ;
   private boolean n13302PrdTHELIST ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private boolean Gx_first ;
   private boolean nA719PrdNum ;
   private boolean nE719PrdNum ;
   private String Z4694PrdObs ;
   private String A4694PrdObs ;
   private String Z11616PrdNmQu ;
   private String A11616PrdNmQu ;
   private String Z13972PrdFTdoc ;
   private String A13972PrdFTdoc ;
   private String Z13973PrdFSdoc ;
   private String A13973PrdFSdoc ;
   private String Z13747PrdCDsc ;
   private String A13747PrdCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV55WebSession ;
   private app.stocksquimicos.SdtPRODUC bcstocksquimicos_PRODUC ;
   private IDataStoreProvider pr_default ;
   private long[] BC01PJ19_A13875PrdLastLin ;
   private boolean[] BC01PJ19_n13875PrdLastLin ;
   private String[] BC01PJ20_A407EmprNom ;
   private boolean[] BC01PJ20_n407EmprNom ;
   private String[] BC01PJ21_A737PrdUcpDsc ;
   private boolean[] BC01PJ21_n737PrdUcpDsc ;
   private String[] BC01PJ22_A736PrdUcoDsc ;
   private boolean[] BC01PJ22_n736PrdUcoDsc ;
   private String[] BC01PJ23_A857ValDsc ;
   private boolean[] BC01PJ23_n857ValDsc ;
   private byte[] BC01PJ25_A8896PrdPesCon ;
   private short[] BC01PJ25_A13968PrdCantAtM ;
   private boolean[] BC01PJ25_n13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ25_A13970PrdMatSeca ;
   private boolean[] BC01PJ25_n13970PrdMatSeca ;
   private java.util.Date[] BC01PJ25_A13971PrdLoteFch ;
   private boolean[] BC01PJ25_n13971PrdLoteFch ;
   private String[] BC01PJ25_A13972PrdFTdoc ;
   private boolean[] BC01PJ25_n13972PrdFTdoc ;
   private String[] BC01PJ25_A13973PrdFSdoc ;
   private boolean[] BC01PJ25_n13973PrdFSdoc ;
   private String[] BC01PJ25_A13974PrdGRS ;
   private boolean[] BC01PJ25_n13974PrdGRS ;
   private String[] BC01PJ25_A396EmprCod ;
   private byte[] BC01PJ25_A13969PrdGruFamI ;
   private boolean[] BC01PJ25_n13969PrdGruFamI ;
   private byte[] BC01PJ25_A629MetCod ;
   private boolean[] BC01PJ25_n629MetCod ;
   private int[] BC01PJ25_A795PrvNum ;
   private byte[] BC01PJ25_A835TipDtoCod ;
   private boolean[] BC01PJ25_n835TipDtoCod ;
   private byte[] BC01PJ25_A742PrdUniCom ;
   private byte[] BC01PJ25_A743PrdUniCon ;
   private byte[] BC01PJ25_A856ValCod ;
   private short[] BC01PJ25_A6301TipPrdCod ;
   private boolean[] BC01PJ25_n6301TipPrdCod ;
   private byte[] BC01PJ25_A9609SubFamCod ;
   private boolean[] BC01PJ25_n9609SubFamCod ;
   private int[] BC01PJ25_A12714PrdFabId ;
   private boolean[] BC01PJ25_n12714PrdFabId ;
   private short[] BC01PJ25_A13927AlmPrdID ;
   private boolean[] BC01PJ25_n13927AlmPrdID ;
   private long[] BC01PJ25_A13875PrdLastLin ;
   private boolean[] BC01PJ25_n13875PrdLastLin ;
   private String[] BC01PJ25_A719PrdNum ;
   private boolean[] BC01PJ25_n719PrdNum ;
   private java.util.Date[] BC01PJ25_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ25_A5590PrdSolub ;
   private String[] BC01PJ25_A8897PrdPesTerm ;
   private String[] BC01PJ25_A407EmprNom ;
   private boolean[] BC01PJ25_n407EmprNom ;
   private String[] BC01PJ25_A718PrdNom ;
   private String[] BC01PJ25_A794PrvNom ;
   private boolean[] BC01PJ25_n794PrvNom ;
   private String[] BC01PJ25_A728PrdRefPrv ;
   private String[] BC01PJ25_A703PrdDscTec ;
   private String[] BC01PJ25_A737PrdUcpDsc ;
   private boolean[] BC01PJ25_n737PrdUcpDsc ;
   private String[] BC01PJ25_A736PrdUcoDsc ;
   private boolean[] BC01PJ25_n736PrdUcoDsc ;
   private java.math.BigDecimal[] BC01PJ25_A707PrdFacCon ;
   private String[] BC01PJ25_A857ValDsc ;
   private boolean[] BC01PJ25_n857ValDsc ;
   private String[] BC01PJ25_A727PrdRec ;
   private String[] BC01PJ25_A682PrdCalNec ;
   private String[] BC01PJ25_A698PrdDetPar ;
   private byte[] BC01PJ25_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ25_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ25_A837TipDtoDto ;
   private boolean[] BC01PJ25_n837TipDtoDto ;
   private java.math.BigDecimal[] BC01PJ25_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ25_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ25_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ25_A696PrdConDia ;
   private short[] BC01PJ25_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ25_A732PrdStkMinU ;
   private short[] BC01PJ25_A699PrdDiaRot ;
   private short[] BC01PJ25_A722PrdPlaEnt ;
   private String[] BC01PJ25_A630MetDsc ;
   private boolean[] BC01PJ25_n630MetDsc ;
   private short[] BC01PJ25_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ25_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ25_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ25_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ25_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ25_A684PrdCanPen ;
   private java.util.Date[] BC01PJ25_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ25_A714PrdFulPed ;
   private java.util.Date[] BC01PJ25_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ25_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ25_A740PrdUltECC ;
   private short[] BC01PJ25_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ25_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ25_A700PrdDifCC ;
   private short[] BC01PJ25_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ25_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ25_A332DifValStk ;
   private java.util.Date[] BC01PJ25_A708PrdFecEnt ;
   private short[] BC01PJ25_A1193PrdPosX ;
   private byte[] BC01PJ25_A1194PrdPosY ;
   private String[] BC01PJ25_A1643PrdTip ;
   private short[] BC01PJ25_A1644PrdDqo ;
   private String[] BC01PJ25_A3004PrdRev ;
   private byte[] BC01PJ25_A3273PrdTnq ;
   private String[] BC01PJ25_A4692PrdNom2 ;
   private String[] BC01PJ25_A4693PrdNum2 ;
   private String[] BC01PJ25_A4694PrdObs ;
   private byte[] BC01PJ25_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ25_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ25_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ25_A5417PrdConcS ;
   private String[] BC01PJ25_A5418PrdSalM ;
   private String[] BC01PJ25_A6302TipPrdDsc ;
   private boolean[] BC01PJ25_n6302TipPrdDsc ;
   private String[] BC01PJ25_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ25_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ25_A7227PrdNumct2 ;
   private byte[] BC01PJ25_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ25_A8659PrdExiAlmc ;
   private String[] BC01PJ25_A8936PrdSal ;
   private String[] BC01PJ25_A9610SubFamDsc ;
   private boolean[] BC01PJ25_n9610SubFamDsc ;
   private String[] BC01PJ25_A9731PrdInc ;
   private String[] BC01PJ25_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ25_A9733PrdAox ;
   private String[] BC01PJ25_A9734PrdNCAS ;
   private String[] BC01PJ25_A9739PrdFT ;
   private java.util.Date[] BC01PJ25_A9740PrdFFT ;
   private String[] BC01PJ25_A9741PrdHS ;
   private java.util.Date[] BC01PJ25_A9742PrdFHS ;
   private String[] BC01PJ25_A10119PrdColIdx ;
   private String[] BC01PJ25_A5888PrdOkotex ;
   private String[] BC01PJ25_A5887PrdReach ;
   private String[] BC01PJ25_A10881PrdLote ;
   private String[] BC01PJ25_A10935PrdRTM ;
   private String[] BC01PJ25_A10936PrdCtw1 ;
   private String[] BC01PJ25_A10937PrdCtw2 ;
   private String[] BC01PJ25_A10938PrdCtw3 ;
   private String[] BC01PJ25_A11663PrdCtw4 ;
   private String[] BC01PJ25_A11196PrdNroCAS ;
   private String[] BC01PJ25_A11363PrdGots ;
   private String[] BC01PJ25_A11364PrdHm ;
   private short[] BC01PJ25_A11470PrdConct ;
   private String[] BC01PJ25_A11614PrdEINECS ;
   private String[] BC01PJ25_A11615PrdFuncion ;
   private String[] BC01PJ25_A11616PrdNmQu ;
   private String[] BC01PJ25_A11687PrdList ;
   private String[] BC01PJ25_A12715PrdFabNm ;
   private boolean[] BC01PJ25_n12715PrdFabNm ;
   private String[] BC01PJ25_A12957PrdLoteOb ;
   private long[] BC01PJ25_A13232PrdRGB ;
   private String[] BC01PJ25_A13301PrdZDHC ;
   private String[] BC01PJ25_A13302PrdTHELIST ;
   private boolean[] BC01PJ25_n13302PrdTHELIST ;
   private String[] BC01PJ25_A13457PrdUbicaci ;
   private String[] BC01PJ25_A3936PrdEqLP ;
   private String[] BC01PJ26_A396EmprCod ;
   private String[] BC01PJ27_A630MetDsc ;
   private boolean[] BC01PJ27_n630MetDsc ;
   private String[] BC01PJ28_A794PrvNom ;
   private boolean[] BC01PJ28_n794PrvNom ;
   private java.math.BigDecimal[] BC01PJ29_A837TipDtoDto ;
   private boolean[] BC01PJ29_n837TipDtoDto ;
   private String[] BC01PJ30_A737PrdUcpDsc ;
   private boolean[] BC01PJ30_n737PrdUcpDsc ;
   private String[] BC01PJ31_A736PrdUcoDsc ;
   private boolean[] BC01PJ31_n736PrdUcoDsc ;
   private String[] BC01PJ32_A857ValDsc ;
   private boolean[] BC01PJ32_n857ValDsc ;
   private String[] BC01PJ33_A6302TipPrdDsc ;
   private boolean[] BC01PJ33_n6302TipPrdDsc ;
   private String[] BC01PJ34_A9610SubFamDsc ;
   private boolean[] BC01PJ34_n9610SubFamDsc ;
   private String[] BC01PJ35_A12715PrdFabNm ;
   private boolean[] BC01PJ35_n12715PrdFabNm ;
   private String[] BC01PJ36_A396EmprCod ;
   private String[] BC01PJ37_A396EmprCod ;
   private String[] BC01PJ37_A719PrdNum ;
   private boolean[] BC01PJ37_n719PrdNum ;
   private byte[] BC01PJ38_A8896PrdPesCon ;
   private short[] BC01PJ38_A13968PrdCantAtM ;
   private boolean[] BC01PJ38_n13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ38_A13970PrdMatSeca ;
   private boolean[] BC01PJ38_n13970PrdMatSeca ;
   private java.util.Date[] BC01PJ38_A13971PrdLoteFch ;
   private boolean[] BC01PJ38_n13971PrdLoteFch ;
   private String[] BC01PJ38_A13972PrdFTdoc ;
   private boolean[] BC01PJ38_n13972PrdFTdoc ;
   private String[] BC01PJ38_A13973PrdFSdoc ;
   private boolean[] BC01PJ38_n13973PrdFSdoc ;
   private String[] BC01PJ38_A13974PrdGRS ;
   private boolean[] BC01PJ38_n13974PrdGRS ;
   private String[] BC01PJ38_A396EmprCod ;
   private byte[] BC01PJ38_A13969PrdGruFamI ;
   private boolean[] BC01PJ38_n13969PrdGruFamI ;
   private byte[] BC01PJ38_A629MetCod ;
   private boolean[] BC01PJ38_n629MetCod ;
   private int[] BC01PJ38_A795PrvNum ;
   private byte[] BC01PJ38_A835TipDtoCod ;
   private boolean[] BC01PJ38_n835TipDtoCod ;
   private byte[] BC01PJ38_A742PrdUniCom ;
   private byte[] BC01PJ38_A743PrdUniCon ;
   private byte[] BC01PJ38_A856ValCod ;
   private short[] BC01PJ38_A6301TipPrdCod ;
   private boolean[] BC01PJ38_n6301TipPrdCod ;
   private byte[] BC01PJ38_A9609SubFamCod ;
   private boolean[] BC01PJ38_n9609SubFamCod ;
   private int[] BC01PJ38_A12714PrdFabId ;
   private boolean[] BC01PJ38_n12714PrdFabId ;
   private short[] BC01PJ38_A13927AlmPrdID ;
   private boolean[] BC01PJ38_n13927AlmPrdID ;
   private String[] BC01PJ38_A719PrdNum ;
   private boolean[] BC01PJ38_n719PrdNum ;
   private java.util.Date[] BC01PJ38_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ38_A5590PrdSolub ;
   private String[] BC01PJ38_A8897PrdPesTerm ;
   private String[] BC01PJ38_A718PrdNom ;
   private String[] BC01PJ38_A728PrdRefPrv ;
   private String[] BC01PJ38_A703PrdDscTec ;
   private java.math.BigDecimal[] BC01PJ38_A707PrdFacCon ;
   private String[] BC01PJ38_A727PrdRec ;
   private String[] BC01PJ38_A682PrdCalNec ;
   private String[] BC01PJ38_A698PrdDetPar ;
   private byte[] BC01PJ38_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ38_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ38_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ38_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ38_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ38_A696PrdConDia ;
   private short[] BC01PJ38_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ38_A732PrdStkMinU ;
   private short[] BC01PJ38_A699PrdDiaRot ;
   private short[] BC01PJ38_A722PrdPlaEnt ;
   private short[] BC01PJ38_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ38_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ38_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ38_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ38_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ38_A684PrdCanPen ;
   private java.util.Date[] BC01PJ38_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ38_A714PrdFulPed ;
   private java.util.Date[] BC01PJ38_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ38_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ38_A740PrdUltECC ;
   private short[] BC01PJ38_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ38_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ38_A700PrdDifCC ;
   private short[] BC01PJ38_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ38_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ38_A332DifValStk ;
   private java.util.Date[] BC01PJ38_A708PrdFecEnt ;
   private short[] BC01PJ38_A1193PrdPosX ;
   private byte[] BC01PJ38_A1194PrdPosY ;
   private String[] BC01PJ38_A1643PrdTip ;
   private short[] BC01PJ38_A1644PrdDqo ;
   private String[] BC01PJ38_A3004PrdRev ;
   private byte[] BC01PJ38_A3273PrdTnq ;
   private String[] BC01PJ38_A4692PrdNom2 ;
   private String[] BC01PJ38_A4693PrdNum2 ;
   private String[] BC01PJ38_A4694PrdObs ;
   private byte[] BC01PJ38_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ38_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ38_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ38_A5417PrdConcS ;
   private String[] BC01PJ38_A5418PrdSalM ;
   private String[] BC01PJ38_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ38_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ38_A7227PrdNumct2 ;
   private byte[] BC01PJ38_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ38_A8659PrdExiAlmc ;
   private String[] BC01PJ38_A8936PrdSal ;
   private String[] BC01PJ38_A9731PrdInc ;
   private String[] BC01PJ38_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ38_A9733PrdAox ;
   private String[] BC01PJ38_A9734PrdNCAS ;
   private String[] BC01PJ38_A9739PrdFT ;
   private java.util.Date[] BC01PJ38_A9740PrdFFT ;
   private String[] BC01PJ38_A9741PrdHS ;
   private java.util.Date[] BC01PJ38_A9742PrdFHS ;
   private String[] BC01PJ38_A10119PrdColIdx ;
   private String[] BC01PJ38_A5888PrdOkotex ;
   private String[] BC01PJ38_A5887PrdReach ;
   private String[] BC01PJ38_A10881PrdLote ;
   private String[] BC01PJ38_A10935PrdRTM ;
   private String[] BC01PJ38_A10936PrdCtw1 ;
   private String[] BC01PJ38_A10937PrdCtw2 ;
   private String[] BC01PJ38_A10938PrdCtw3 ;
   private String[] BC01PJ38_A11663PrdCtw4 ;
   private String[] BC01PJ38_A11196PrdNroCAS ;
   private String[] BC01PJ38_A11363PrdGots ;
   private String[] BC01PJ38_A11364PrdHm ;
   private short[] BC01PJ38_A11470PrdConct ;
   private String[] BC01PJ38_A11614PrdEINECS ;
   private String[] BC01PJ38_A11615PrdFuncion ;
   private String[] BC01PJ38_A11616PrdNmQu ;
   private String[] BC01PJ38_A11687PrdList ;
   private String[] BC01PJ38_A12957PrdLoteOb ;
   private long[] BC01PJ38_A13232PrdRGB ;
   private String[] BC01PJ38_A13301PrdZDHC ;
   private String[] BC01PJ38_A13302PrdTHELIST ;
   private boolean[] BC01PJ38_n13302PrdTHELIST ;
   private String[] BC01PJ38_A13457PrdUbicaci ;
   private String[] BC01PJ38_A3936PrdEqLP ;
   private byte[] BC01PJ39_A8896PrdPesCon ;
   private short[] BC01PJ39_A13968PrdCantAtM ;
   private boolean[] BC01PJ39_n13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ39_A13970PrdMatSeca ;
   private boolean[] BC01PJ39_n13970PrdMatSeca ;
   private java.util.Date[] BC01PJ39_A13971PrdLoteFch ;
   private boolean[] BC01PJ39_n13971PrdLoteFch ;
   private String[] BC01PJ39_A13972PrdFTdoc ;
   private boolean[] BC01PJ39_n13972PrdFTdoc ;
   private String[] BC01PJ39_A13973PrdFSdoc ;
   private boolean[] BC01PJ39_n13973PrdFSdoc ;
   private String[] BC01PJ39_A13974PrdGRS ;
   private boolean[] BC01PJ39_n13974PrdGRS ;
   private String[] BC01PJ39_A396EmprCod ;
   private byte[] BC01PJ39_A13969PrdGruFamI ;
   private boolean[] BC01PJ39_n13969PrdGruFamI ;
   private byte[] BC01PJ39_A629MetCod ;
   private boolean[] BC01PJ39_n629MetCod ;
   private int[] BC01PJ39_A795PrvNum ;
   private byte[] BC01PJ39_A835TipDtoCod ;
   private boolean[] BC01PJ39_n835TipDtoCod ;
   private byte[] BC01PJ39_A742PrdUniCom ;
   private byte[] BC01PJ39_A743PrdUniCon ;
   private byte[] BC01PJ39_A856ValCod ;
   private short[] BC01PJ39_A6301TipPrdCod ;
   private boolean[] BC01PJ39_n6301TipPrdCod ;
   private byte[] BC01PJ39_A9609SubFamCod ;
   private boolean[] BC01PJ39_n9609SubFamCod ;
   private int[] BC01PJ39_A12714PrdFabId ;
   private boolean[] BC01PJ39_n12714PrdFabId ;
   private short[] BC01PJ39_A13927AlmPrdID ;
   private boolean[] BC01PJ39_n13927AlmPrdID ;
   private String[] BC01PJ39_A719PrdNum ;
   private boolean[] BC01PJ39_n719PrdNum ;
   private java.util.Date[] BC01PJ39_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ39_A5590PrdSolub ;
   private String[] BC01PJ39_A8897PrdPesTerm ;
   private String[] BC01PJ39_A718PrdNom ;
   private String[] BC01PJ39_A728PrdRefPrv ;
   private String[] BC01PJ39_A703PrdDscTec ;
   private java.math.BigDecimal[] BC01PJ39_A707PrdFacCon ;
   private String[] BC01PJ39_A727PrdRec ;
   private String[] BC01PJ39_A682PrdCalNec ;
   private String[] BC01PJ39_A698PrdDetPar ;
   private byte[] BC01PJ39_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ39_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ39_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ39_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ39_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ39_A696PrdConDia ;
   private short[] BC01PJ39_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ39_A732PrdStkMinU ;
   private short[] BC01PJ39_A699PrdDiaRot ;
   private short[] BC01PJ39_A722PrdPlaEnt ;
   private short[] BC01PJ39_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ39_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ39_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ39_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ39_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ39_A684PrdCanPen ;
   private java.util.Date[] BC01PJ39_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ39_A714PrdFulPed ;
   private java.util.Date[] BC01PJ39_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ39_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ39_A740PrdUltECC ;
   private short[] BC01PJ39_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ39_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ39_A700PrdDifCC ;
   private short[] BC01PJ39_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ39_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ39_A332DifValStk ;
   private java.util.Date[] BC01PJ39_A708PrdFecEnt ;
   private short[] BC01PJ39_A1193PrdPosX ;
   private byte[] BC01PJ39_A1194PrdPosY ;
   private String[] BC01PJ39_A1643PrdTip ;
   private short[] BC01PJ39_A1644PrdDqo ;
   private String[] BC01PJ39_A3004PrdRev ;
   private byte[] BC01PJ39_A3273PrdTnq ;
   private String[] BC01PJ39_A4692PrdNom2 ;
   private String[] BC01PJ39_A4693PrdNum2 ;
   private String[] BC01PJ39_A4694PrdObs ;
   private byte[] BC01PJ39_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ39_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ39_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ39_A5417PrdConcS ;
   private String[] BC01PJ39_A5418PrdSalM ;
   private String[] BC01PJ39_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ39_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ39_A7227PrdNumct2 ;
   private byte[] BC01PJ39_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ39_A8659PrdExiAlmc ;
   private String[] BC01PJ39_A8936PrdSal ;
   private String[] BC01PJ39_A9731PrdInc ;
   private String[] BC01PJ39_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ39_A9733PrdAox ;
   private String[] BC01PJ39_A9734PrdNCAS ;
   private String[] BC01PJ39_A9739PrdFT ;
   private java.util.Date[] BC01PJ39_A9740PrdFFT ;
   private String[] BC01PJ39_A9741PrdHS ;
   private java.util.Date[] BC01PJ39_A9742PrdFHS ;
   private String[] BC01PJ39_A10119PrdColIdx ;
   private String[] BC01PJ39_A5888PrdOkotex ;
   private String[] BC01PJ39_A5887PrdReach ;
   private String[] BC01PJ39_A10881PrdLote ;
   private String[] BC01PJ39_A10935PrdRTM ;
   private String[] BC01PJ39_A10936PrdCtw1 ;
   private String[] BC01PJ39_A10937PrdCtw2 ;
   private String[] BC01PJ39_A10938PrdCtw3 ;
   private String[] BC01PJ39_A11663PrdCtw4 ;
   private String[] BC01PJ39_A11196PrdNroCAS ;
   private String[] BC01PJ39_A11363PrdGots ;
   private String[] BC01PJ39_A11364PrdHm ;
   private short[] BC01PJ39_A11470PrdConct ;
   private String[] BC01PJ39_A11614PrdEINECS ;
   private String[] BC01PJ39_A11615PrdFuncion ;
   private String[] BC01PJ39_A11616PrdNmQu ;
   private String[] BC01PJ39_A11687PrdList ;
   private String[] BC01PJ39_A12957PrdLoteOb ;
   private long[] BC01PJ39_A13232PrdRGB ;
   private String[] BC01PJ39_A13301PrdZDHC ;
   private String[] BC01PJ39_A13302PrdTHELIST ;
   private boolean[] BC01PJ39_n13302PrdTHELIST ;
   private String[] BC01PJ39_A13457PrdUbicaci ;
   private String[] BC01PJ39_A3936PrdEqLP ;
   private String[] BC01PJ43_A794PrvNom ;
   private boolean[] BC01PJ43_n794PrvNom ;
   private String[] BC01PJ44_A737PrdUcpDsc ;
   private boolean[] BC01PJ44_n737PrdUcpDsc ;
   private String[] BC01PJ45_A736PrdUcoDsc ;
   private boolean[] BC01PJ45_n736PrdUcoDsc ;
   private String[] BC01PJ46_A857ValDsc ;
   private boolean[] BC01PJ46_n857ValDsc ;
   private java.math.BigDecimal[] BC01PJ47_A837TipDtoDto ;
   private boolean[] BC01PJ47_n837TipDtoDto ;
   private String[] BC01PJ48_A630MetDsc ;
   private boolean[] BC01PJ48_n630MetDsc ;
   private String[] BC01PJ49_A6302TipPrdDsc ;
   private boolean[] BC01PJ49_n6302TipPrdDsc ;
   private String[] BC01PJ50_A9610SubFamDsc ;
   private boolean[] BC01PJ50_n9610SubFamDsc ;
   private String[] BC01PJ51_A12715PrdFabNm ;
   private boolean[] BC01PJ51_n12715PrdFabNm ;
   private String[] BC01PJ52_A396EmprCod ;
   private String[] BC01PJ52_A719PrdNum ;
   private boolean[] BC01PJ52_n719PrdNum ;
   private String[] BC01PJ52_A13217NormaID ;
   private String[] BC01PJ53_A396EmprCod ;
   private String[] BC01PJ53_A719PrdNum ;
   private boolean[] BC01PJ53_n719PrdNum ;
   private String[] BC01PJ53_A13586TheList ;
   private String[] BC01PJ54_A396EmprCod ;
   private int[] BC01PJ54_A5532Lb_numero ;
   private String[] BC01PJ54_A5555Lb_opcion ;
   private short[] BC01PJ54_A13460Lb_linCP ;
   private String[] BC01PJ54_A13458Lb_TipCP ;
   private String[] BC01PJ55_A396EmprCod ;
   private int[] BC01PJ55_A13418AlbProID ;
   private short[] BC01PJ55_A13442AlbProLine ;
   private String[] BC01PJ56_A396EmprCod ;
   private int[] BC01PJ56_A13324LDESID ;
   private String[] BC01PJ56_A13333LDESNPeque ;
   private String[] BC01PJ56_A13337LDESComb ;
   private String[] BC01PJ56_A13339LDESFondo ;
   private short[] BC01PJ56_A13342LDESLinea ;
   private String[] BC01PJ57_A396EmprCod ;
   private int[] BC01PJ57_A13312Lb_NLab ;
   private short[] BC01PJ57_A13305Lb_IDVeces ;
   private short[] BC01PJ57_A13306Lb_LinID ;
   private String[] BC01PJ58_A396EmprCod ;
   private int[] BC01PJ58_A12673LavMqId ;
   private short[] BC01PJ58_A12692LavMqLnPq ;
   private short[] BC01PJ58_A12681LavMqLn ;
   private String[] BC01PJ59_A396EmprCod ;
   private String[] BC01PJ59_A719PrdNum ;
   private boolean[] BC01PJ59_n719PrdNum ;
   private short[] BC01PJ59_A9713Tb1_Cod ;
   private String[] BC01PJ60_A396EmprCod ;
   private String[] BC01PJ60_A12236PrdNumD ;
   private String[] BC01PJ60_A719PrdNum ;
   private boolean[] BC01PJ60_n719PrdNum ;
   private String[] BC01PJ61_A396EmprCod ;
   private long[] BC01PJ61_A12225DocDisID ;
   private short[] BC01PJ61_A12226LinDisID ;
   private String[] BC01PJ62_A396EmprCod ;
   private long[] BC01PJ62_A12225DocDisID ;
   private String[] BC01PJ63_A396EmprCod ;
   private long[] BC01PJ63_A12205OrdenCID ;
   private short[] BC01PJ63_A12206OrdenCLnId ;
   private String[] BC01PJ64_A396EmprCod ;
   private String[] BC01PJ64_A719PrdNum ;
   private boolean[] BC01PJ64_n719PrdNum ;
   private String[] BC01PJ64_A11664LoteID ;
   private java.util.Date[] BC01PJ64_A11665LoteFec ;
   private String[] BC01PJ65_A396EmprCod ;
   private int[] BC01PJ65_A4850DevComCod ;
   private String[] BC01PJ65_A719PrdNum ;
   private boolean[] BC01PJ65_n719PrdNum ;
   private String[] BC01PJ66_A396EmprCod ;
   private int[] BC01PJ66_A252CliCod ;
   private String[] BC01PJ66_A494ForSer ;
   private String[] BC01PJ66_A482ForColNom ;
   private int[] BC01PJ66_A483ForColNum ;
   private byte[] BC01PJ66_A831TipColCod ;
   private String[] BC01PJ66_A3571EnsCod ;
   private short[] BC01PJ66_A3582EnsLin ;
   private String[] BC01PJ67_A396EmprCod ;
   private int[] BC01PJ67_A129BarCod ;
   private byte[] BC01PJ67_A132BarCodReo ;
   private String[] BC01PJ67_A130BarCodPar ;
   private byte[] BC01PJ67_A4075recestncol ;
   private byte[] BC01PJ67_A4076recestnpro ;
   private short[] BC01PJ67_A4108recestlin ;
   private String[] BC01PJ68_A396EmprCod ;
   private int[] BC01PJ68_A4052EstNumFor ;
   private byte[] BC01PJ68_A4053EstNumCol ;
   private byte[] BC01PJ68_A4090EstEspLin ;
   private String[] BC01PJ69_A396EmprCod ;
   private int[] BC01PJ69_A4052EstNumFor ;
   private byte[] BC01PJ69_A4053EstNumCol ;
   private byte[] BC01PJ69_A4084EstProLin ;
   private String[] BC01PJ70_A396EmprCod ;
   private long[] BC01PJ70_A11644TransferId ;
   private int[] BC01PJ70_A11653TransferLn ;
   private String[] BC01PJ71_A396EmprCod ;
   private String[] BC01PJ71_A11634TaesId ;
   private short[] BC01PJ71_A11637TaesLn ;
   private short[] BC01PJ71_A11641TaesLnP ;
   private String[] BC01PJ72_A396EmprCod ;
   private String[] BC01PJ72_A719PrdNum ;
   private boolean[] BC01PJ72_n719PrdNum ;
   private long[] BC01PJ72_A11329H_stklin ;
   private String[] BC01PJ73_A396EmprCod ;
   private int[] BC01PJ73_A11270Pot_num ;
   private short[] BC01PJ73_A11271Pot_lin ;
   private String[] BC01PJ74_A396EmprCod ;
   private String[] BC01PJ74_A719PrdNum ;
   private boolean[] BC01PJ74_n719PrdNum ;
   private String[] BC01PJ74_A11199PrdNcasC ;
   private String[] BC01PJ75_A396EmprCod ;
   private String[] BC01PJ75_A719PrdNum ;
   private boolean[] BC01PJ75_n719PrdNum ;
   private String[] BC01PJ75_A11197CFraseR ;
   private String[] BC01PJ76_A396EmprCod ;
   private short[] BC01PJ76_A10243Jt_codigo ;
   private short[] BC01PJ76_A10246Jt_ord ;
   private String[] BC01PJ77_A396EmprCod ;
   private java.util.Date[] BC01PJ77_A10236Bny_dia ;
   private short[] BC01PJ77_A10238Bny_lin ;
   private String[] BC01PJ78_A396EmprCod ;
   private int[] BC01PJ78_A129BarCod ;
   private byte[] BC01PJ78_A132BarCodReo ;
   private String[] BC01PJ78_A130BarCodPar ;
   private String[] BC01PJ78_A758ProCod ;
   private short[] BC01PJ78_A194BarOrdLin ;
   private String[] BC01PJ78_A719PrdNum ;
   private boolean[] BC01PJ78_n719PrdNum ;
   private String[] BC01PJ79_A396EmprCod ;
   private String[] BC01PJ79_A719PrdNum ;
   private boolean[] BC01PJ79_n719PrdNum ;
   private String[] BC01PJ79_A9735Cod_Rgo ;
   private String[] BC01PJ80_A396EmprCod ;
   private String[] BC01PJ80_A719PrdNum ;
   private boolean[] BC01PJ80_n719PrdNum ;
   private short[] BC01PJ80_A9711Ct_codigo ;
   private String[] BC01PJ81_A396EmprCod ;
   private long[] BC01PJ81_A9652OeNum ;
   private int[] BC01PJ81_A9653OeHdr ;
   private byte[] BC01PJ81_A9654OeHdrr ;
   private String[] BC01PJ81_A9655OeHdrp ;
   private byte[] BC01PJ81_A9656OeLinC ;
   private String[] BC01PJ81_A9657OeComb ;
   private String[] BC01PJ81_A9658Oefondo ;
   private byte[] BC01PJ81_A9659OeMolCil ;
   private short[] BC01PJ81_A9686OePasLin ;
   private short[] BC01PJ81_A9694OePasPLi ;
   private String[] BC01PJ82_A396EmprCod ;
   private long[] BC01PJ82_A9652OeNum ;
   private int[] BC01PJ82_A9653OeHdr ;
   private byte[] BC01PJ82_A9654OeHdrr ;
   private String[] BC01PJ82_A9655OeHdrp ;
   private byte[] BC01PJ82_A9656OeLinC ;
   private String[] BC01PJ82_A9657OeComb ;
   private String[] BC01PJ82_A9658Oefondo ;
   private byte[] BC01PJ82_A9659OeMolCil ;
   private byte[] BC01PJ82_A9677OeMolLin ;
   private String[] BC01PJ83_A396EmprCod ;
   private int[] BC01PJ83_A9578Pas_Num ;
   private String[] BC01PJ83_A719PrdNum ;
   private boolean[] BC01PJ83_n719PrdNum ;
   private String[] BC01PJ84_A396EmprCod ;
   private String[] BC01PJ84_A719PrdNum ;
   private boolean[] BC01PJ84_n719PrdNum ;
   private byte[] BC01PJ84_A8908CC_AlmCod ;
   private String[] BC01PJ85_A396EmprCod ;
   private String[] BC01PJ85_A719PrdNum ;
   private boolean[] BC01PJ85_n719PrdNum ;
   private int[] BC01PJ85_A8661Almc_Ln ;
   private String[] BC01PJ86_A396EmprCod ;
   private String[] BC01PJ86_A719PrdNum ;
   private boolean[] BC01PJ86_n719PrdNum ;
   private String[] BC01PJ86_A8648Mat_PrdN ;
   private String[] BC01PJ87_A396EmprCod ;
   private long[] BC01PJ87_A8585Pet_cod ;
   private String[] BC01PJ87_A719PrdNum ;
   private boolean[] BC01PJ87_n719PrdNum ;
   private String[] BC01PJ88_A396EmprCod ;
   private String[] BC01PJ88_A719PrdNum ;
   private boolean[] BC01PJ88_n719PrdNum ;
   private java.util.Date[] BC01PJ88_A8577RecFecHr ;
   private String[] BC01PJ89_A396EmprCod ;
   private String[] BC01PJ89_A719PrdNum ;
   private boolean[] BC01PJ89_n719PrdNum ;
   private short[] BC01PJ89_A8366PrdAnyo ;
   private int[] BC01PJ89_A8360PrdProv ;
   private String[] BC01PJ90_A396EmprCod ;
   private int[] BC01PJ90_A252CliCod ;
   private String[] BC01PJ90_A494ForSer ;
   private String[] BC01PJ90_A482ForColNom ;
   private int[] BC01PJ90_A483ForColNum ;
   private byte[] BC01PJ90_A831TipColCod ;
   private short[] BC01PJ90_A7797Sim_lin ;
   private String[] BC01PJ91_A396EmprCod ;
   private int[] BC01PJ91_A7163Vir_Codigo ;
   private String[] BC01PJ91_A719PrdNum ;
   private boolean[] BC01PJ91_n719PrdNum ;
   private String[] BC01PJ92_A396EmprCod ;
   private String[] BC01PJ92_A6310Lb_TaAuxC ;
   private short[] BC01PJ92_A6313lb_TaAuxL ;
   private short[] BC01PJ92_A6378Lb_TauxLP ;
   private String[] BC01PJ93_A396EmprCod ;
   private int[] BC01PJ93_A6290PreCoNum ;
   private String[] BC01PJ93_A719PrdNum ;
   private boolean[] BC01PJ93_n719PrdNum ;
   private String[] BC01PJ94_A396EmprCod ;
   private String[] BC01PJ94_A719PrdNum ;
   private boolean[] BC01PJ94_n719PrdNum ;
   private int[] BC01PJ94_A6158PrdPrv ;
   private String[] BC01PJ95_A396EmprCod ;
   private String[] BC01PJ95_A719PrdNum ;
   private boolean[] BC01PJ95_n719PrdNum ;
   private String[] BC01PJ95_A5973PrdSusNum ;
   private String[] BC01PJ96_A396EmprCod ;
   private String[] BC01PJ96_A5612Lb_CodGru ;
   private short[] BC01PJ96_A5615Lb_LinGru ;
   private String[] BC01PJ97_A396EmprCod ;
   private int[] BC01PJ97_A5532Lb_numero ;
   private String[] BC01PJ97_A5555Lb_opcion ;
   private short[] BC01PJ97_A5560Lb_LineaPr ;
   private String[] BC01PJ98_A396EmprCod ;
   private int[] BC01PJ98_A5532Lb_numero ;
   private String[] BC01PJ98_A5555Lb_opcion ;
   private short[] BC01PJ98_A5557Lb_LineaC ;
   private String[] BC01PJ99_A396EmprCod ;
   private int[] BC01PJ99_A5145SobCod ;
   private String[] BC01PJ99_A719PrdNum ;
   private boolean[] BC01PJ99_n719PrdNum ;
   private String[] BC01PJ100_A396EmprCod ;
   private int[] BC01PJ100_A4744RecPreCod ;
   private short[] BC01PJ100_A4762RecPreLin ;
   private short[] BC01PJ100_A4763RecPreNli ;
   private String[] BC01PJ101_A396EmprCod ;
   private int[] BC01PJ101_A4492HreBarCod ;
   private byte[] BC01PJ101_A4493HreBarReo ;
   private String[] BC01PJ101_A4494HreBarPar ;
   private byte[] BC01PJ101_A4495HreNumCie ;
   private short[] BC01PJ101_A4545HreLinMaq ;
   private byte[] BC01PJ101_A4550HreLinPro ;
   private short[] BC01PJ101_A4557HreRecLin ;
   private String[] BC01PJ102_A396EmprCod ;
   private int[] BC01PJ102_A4492HreBarCod ;
   private byte[] BC01PJ102_A4493HreBarReo ;
   private String[] BC01PJ102_A4494HreBarPar ;
   private byte[] BC01PJ102_A4495HreNumCie ;
   private short[] BC01PJ102_A4508HreLinMAL ;
   private byte[] BC01PJ102_A4509HreNumAny ;
   private String[] BC01PJ102_A719PrdNum ;
   private boolean[] BC01PJ102_n719PrdNum ;
   private String[] BC01PJ103_A396EmprCod ;
   private int[] BC01PJ103_A252CliCod ;
   private String[] BC01PJ103_A4415EstCol ;
   private short[] BC01PJ103_A4416EstColLin ;
   private String[] BC01PJ104_A396EmprCod ;
   private int[] BC01PJ104_A129BarCod ;
   private byte[] BC01PJ104_A132BarCodReo ;
   private String[] BC01PJ104_A130BarCodPar ;
   private byte[] BC01PJ104_A2524DisComLin ;
   private String[] BC01PJ104_A1056DisComCod ;
   private String[] BC01PJ104_A1032FonCod ;
   private byte[] BC01PJ104_A2124RecMolCod ;
   private short[] BC01PJ104_A2672RecPasLin ;
   private short[] BC01PJ104_A2675RecPasPLi ;
   private String[] BC01PJ105_A396EmprCod ;
   private int[] BC01PJ105_A129BarCod ;
   private byte[] BC01PJ105_A132BarCodReo ;
   private String[] BC01PJ105_A130BarCodPar ;
   private byte[] BC01PJ105_A2524DisComLin ;
   private String[] BC01PJ105_A1056DisComCod ;
   private String[] BC01PJ105_A1032FonCod ;
   private byte[] BC01PJ105_A2124RecMolCod ;
   private byte[] BC01PJ105_A2126RecMolLin ;
   private String[] BC01PJ106_A396EmprCod ;
   private String[] BC01PJ106_A2107PasCod ;
   private String[] BC01PJ106_A719PrdNum ;
   private boolean[] BC01PJ106_n719PrdNum ;
   private String[] BC01PJ107_A396EmprCod ;
   private int[] BC01PJ107_A2637HisEstHRu ;
   private byte[] BC01PJ107_A2636HisEstHRe ;
   private String[] BC01PJ107_A2635HisEstHPa ;
   private byte[] BC01PJ107_A2638HisEstLCo ;
   private String[] BC01PJ107_A2630HisEstCom ;
   private String[] BC01PJ107_A2634HisEstFon ;
   private String[] BC01PJ107_A719PrdNum ;
   private boolean[] BC01PJ107_n719PrdNum ;
   private String[] BC01PJ108_A396EmprCod ;
   private int[] BC01PJ108_A252CliCod ;
   private String[] BC01PJ108_A2141SerEst ;
   private String[] BC01PJ108_A1013DibCli ;
   private int[] BC01PJ108_A1014DibInt ;
   private String[] BC01PJ108_A2074ColCom ;
   private String[] BC01PJ108_A2078ColFon ;
   private byte[] BC01PJ108_A2098MolCod ;
   private short[] BC01PJ108_A2535ForPrdLin ;
   private String[] BC01PJ109_A396EmprCod ;
   private String[] BC01PJ109_A719PrdNum ;
   private boolean[] BC01PJ109_n719PrdNum ;
   private long[] BC01PJ109_A3342CCStkLin ;
   private String[] BC01PJ110_A396EmprCod ;
   private int[] BC01PJ110_A252CliCod ;
   private String[] BC01PJ110_A2891HMaForSer ;
   private String[] BC01PJ110_A2892HMaForCNom ;
   private int[] BC01PJ110_A2893HMaForCNum ;
   private byte[] BC01PJ110_A2894HMaTipCCod ;
   private int[] BC01PJ110_A2895HMaForNumC ;
   private short[] BC01PJ110_A2897HMaColLin ;
   private java.util.Date[] BC01PJ110_A2896HMaFec ;
   private short[] BC01PJ110_A2907HmaLin ;
   private String[] BC01PJ111_A396EmprCod ;
   private int[] BC01PJ111_A129BarCod ;
   private byte[] BC01PJ111_A132BarCodReo ;
   private String[] BC01PJ111_A130BarCodPar ;
   private short[] BC01PJ111_A2808RecLinMAL ;
   private byte[] BC01PJ111_A1377RecNumAny ;
   private String[] BC01PJ111_A719PrdNum ;
   private boolean[] BC01PJ111_n719PrdNum ;
   private String[] BC01PJ112_A396EmprCod ;
   private int[] BC01PJ112_A129BarCod ;
   private byte[] BC01PJ112_A132BarCodReo ;
   private String[] BC01PJ112_A130BarCodPar ;
   private short[] BC01PJ112_A2804RecLinMaq ;
   private byte[] BC01PJ112_A1273RecLinPro ;
   private short[] BC01PJ112_A811RecLin ;
   private String[] BC01PJ113_A396EmprCod ;
   private int[] BC01PJ113_A129BarCod ;
   private byte[] BC01PJ113_A132BarCodReo ;
   private String[] BC01PJ113_A130BarCodPar ;
   private String[] BC01PJ113_A2494BarDosPro ;
   private String[] BC01PJ113_A719PrdNum ;
   private boolean[] BC01PJ113_n719PrdNum ;
   private String[] BC01PJ114_A396EmprCod ;
   private int[] BC01PJ114_A1314EnsLabCod ;
   private short[] BC01PJ114_A1317EnsLabLin ;
   private String[] BC01PJ115_A396EmprCod ;
   private String[] BC01PJ115_A910Workstat ;
   private int[] BC01PJ115_A887EscMLin ;
   private String[] BC01PJ116_A396EmprCod ;
   private int[] BC01PJ116_A859CumCodCont ;
   private String[] BC01PJ116_A719PrdNum ;
   private boolean[] BC01PJ116_n719PrdNum ;
   private String[] BC01PJ117_A396EmprCod ;
   private String[] BC01PJ117_A719PrdNum ;
   private boolean[] BC01PJ117_n719PrdNum ;
   private java.util.Date[] BC01PJ117_A810RecFec ;
   private String[] BC01PJ118_A396EmprCod ;
   private int[] BC01PJ118_A486ForNumCol ;
   private short[] BC01PJ118_A715PrdLin ;
   private String[] BC01PJ119_A396EmprCod ;
   private String[] BC01PJ119_A719PrdNum ;
   private boolean[] BC01PJ119_n719PrdNum ;
   private short[] BC01PJ119_A681PrdAny ;
   private String[] BC01PJ120_A396EmprCod ;
   private String[] BC01PJ120_A719PrdNum ;
   private boolean[] BC01PJ120_n719PrdNum ;
   private String[] BC01PJ120_A688PrdComCod ;
   private String[] BC01PJ121_A396EmprCod ;
   private String[] BC01PJ121_A719PrdNum ;
   private boolean[] BC01PJ121_n719PrdNum ;
   private String[] BC01PJ121_A680PrdAltNum ;
   private String[] BC01PJ122_A396EmprCod ;
   private int[] BC01PJ122_A658PedCod ;
   private String[] BC01PJ122_A719PrdNum ;
   private boolean[] BC01PJ122_n719PrdNum ;
   private String[] BC01PJ123_A396EmprCod ;
   private int[] BC01PJ123_A486ForNumCol ;
   private short[] BC01PJ123_A309ColLin ;
   private String[] BC01PJ124_A396EmprCod ;
   private String[] BC01PJ124_A719PrdNum ;
   private boolean[] BC01PJ124_n719PrdNum ;
   private int[] BC01PJ124_A647NumCon ;
   private byte[] BC01PJ126_A8896PrdPesCon ;
   private short[] BC01PJ126_A13968PrdCantAtM ;
   private boolean[] BC01PJ126_n13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ126_A13970PrdMatSeca ;
   private boolean[] BC01PJ126_n13970PrdMatSeca ;
   private java.util.Date[] BC01PJ126_A13971PrdLoteFch ;
   private boolean[] BC01PJ126_n13971PrdLoteFch ;
   private String[] BC01PJ126_A13972PrdFTdoc ;
   private boolean[] BC01PJ126_n13972PrdFTdoc ;
   private String[] BC01PJ126_A13973PrdFSdoc ;
   private boolean[] BC01PJ126_n13973PrdFSdoc ;
   private String[] BC01PJ126_A13974PrdGRS ;
   private boolean[] BC01PJ126_n13974PrdGRS ;
   private String[] BC01PJ126_A396EmprCod ;
   private byte[] BC01PJ126_A13969PrdGruFamI ;
   private boolean[] BC01PJ126_n13969PrdGruFamI ;
   private byte[] BC01PJ126_A629MetCod ;
   private boolean[] BC01PJ126_n629MetCod ;
   private int[] BC01PJ126_A795PrvNum ;
   private byte[] BC01PJ126_A835TipDtoCod ;
   private boolean[] BC01PJ126_n835TipDtoCod ;
   private byte[] BC01PJ126_A742PrdUniCom ;
   private byte[] BC01PJ126_A743PrdUniCon ;
   private byte[] BC01PJ126_A856ValCod ;
   private short[] BC01PJ126_A6301TipPrdCod ;
   private boolean[] BC01PJ126_n6301TipPrdCod ;
   private byte[] BC01PJ126_A9609SubFamCod ;
   private boolean[] BC01PJ126_n9609SubFamCod ;
   private int[] BC01PJ126_A12714PrdFabId ;
   private boolean[] BC01PJ126_n12714PrdFabId ;
   private short[] BC01PJ126_A13927AlmPrdID ;
   private boolean[] BC01PJ126_n13927AlmPrdID ;
   private long[] BC01PJ126_A13875PrdLastLin ;
   private boolean[] BC01PJ126_n13875PrdLastLin ;
   private String[] BC01PJ126_A719PrdNum ;
   private boolean[] BC01PJ126_n719PrdNum ;
   private java.util.Date[] BC01PJ126_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ126_A5590PrdSolub ;
   private String[] BC01PJ126_A8897PrdPesTerm ;
   private String[] BC01PJ126_A407EmprNom ;
   private boolean[] BC01PJ126_n407EmprNom ;
   private String[] BC01PJ126_A718PrdNom ;
   private String[] BC01PJ126_A794PrvNom ;
   private boolean[] BC01PJ126_n794PrvNom ;
   private String[] BC01PJ126_A728PrdRefPrv ;
   private String[] BC01PJ126_A703PrdDscTec ;
   private String[] BC01PJ126_A737PrdUcpDsc ;
   private boolean[] BC01PJ126_n737PrdUcpDsc ;
   private String[] BC01PJ126_A736PrdUcoDsc ;
   private boolean[] BC01PJ126_n736PrdUcoDsc ;
   private java.math.BigDecimal[] BC01PJ126_A707PrdFacCon ;
   private String[] BC01PJ126_A857ValDsc ;
   private boolean[] BC01PJ126_n857ValDsc ;
   private String[] BC01PJ126_A727PrdRec ;
   private String[] BC01PJ126_A682PrdCalNec ;
   private String[] BC01PJ126_A698PrdDetPar ;
   private byte[] BC01PJ126_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ126_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ126_A837TipDtoDto ;
   private boolean[] BC01PJ126_n837TipDtoDto ;
   private java.math.BigDecimal[] BC01PJ126_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ126_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ126_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ126_A696PrdConDia ;
   private short[] BC01PJ126_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ126_A732PrdStkMinU ;
   private short[] BC01PJ126_A699PrdDiaRot ;
   private short[] BC01PJ126_A722PrdPlaEnt ;
   private String[] BC01PJ126_A630MetDsc ;
   private boolean[] BC01PJ126_n630MetDsc ;
   private short[] BC01PJ126_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ126_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ126_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ126_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ126_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ126_A684PrdCanPen ;
   private java.util.Date[] BC01PJ126_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ126_A714PrdFulPed ;
   private java.util.Date[] BC01PJ126_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ126_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ126_A740PrdUltECC ;
   private short[] BC01PJ126_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ126_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ126_A700PrdDifCC ;
   private short[] BC01PJ126_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ126_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ126_A332DifValStk ;
   private java.util.Date[] BC01PJ126_A708PrdFecEnt ;
   private short[] BC01PJ126_A1193PrdPosX ;
   private byte[] BC01PJ126_A1194PrdPosY ;
   private String[] BC01PJ126_A1643PrdTip ;
   private short[] BC01PJ126_A1644PrdDqo ;
   private String[] BC01PJ126_A3004PrdRev ;
   private byte[] BC01PJ126_A3273PrdTnq ;
   private String[] BC01PJ126_A4692PrdNom2 ;
   private String[] BC01PJ126_A4693PrdNum2 ;
   private String[] BC01PJ126_A4694PrdObs ;
   private byte[] BC01PJ126_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ126_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ126_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ126_A5417PrdConcS ;
   private String[] BC01PJ126_A5418PrdSalM ;
   private String[] BC01PJ126_A6302TipPrdDsc ;
   private boolean[] BC01PJ126_n6302TipPrdDsc ;
   private String[] BC01PJ126_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ126_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ126_A7227PrdNumct2 ;
   private byte[] BC01PJ126_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ126_A8659PrdExiAlmc ;
   private String[] BC01PJ126_A8936PrdSal ;
   private String[] BC01PJ126_A9610SubFamDsc ;
   private boolean[] BC01PJ126_n9610SubFamDsc ;
   private String[] BC01PJ126_A9731PrdInc ;
   private String[] BC01PJ126_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ126_A9733PrdAox ;
   private String[] BC01PJ126_A9734PrdNCAS ;
   private String[] BC01PJ126_A9739PrdFT ;
   private java.util.Date[] BC01PJ126_A9740PrdFFT ;
   private String[] BC01PJ126_A9741PrdHS ;
   private java.util.Date[] BC01PJ126_A9742PrdFHS ;
   private String[] BC01PJ126_A10119PrdColIdx ;
   private String[] BC01PJ126_A5888PrdOkotex ;
   private String[] BC01PJ126_A5887PrdReach ;
   private String[] BC01PJ126_A10881PrdLote ;
   private String[] BC01PJ126_A10935PrdRTM ;
   private String[] BC01PJ126_A10936PrdCtw1 ;
   private String[] BC01PJ126_A10937PrdCtw2 ;
   private String[] BC01PJ126_A10938PrdCtw3 ;
   private String[] BC01PJ126_A11663PrdCtw4 ;
   private String[] BC01PJ126_A11196PrdNroCAS ;
   private String[] BC01PJ126_A11363PrdGots ;
   private String[] BC01PJ126_A11364PrdHm ;
   private short[] BC01PJ126_A11470PrdConct ;
   private String[] BC01PJ126_A11614PrdEINECS ;
   private String[] BC01PJ126_A11615PrdFuncion ;
   private String[] BC01PJ126_A11616PrdNmQu ;
   private String[] BC01PJ126_A11687PrdList ;
   private String[] BC01PJ126_A12715PrdFabNm ;
   private boolean[] BC01PJ126_n12715PrdFabNm ;
   private String[] BC01PJ126_A12957PrdLoteOb ;
   private long[] BC01PJ126_A13232PrdRGB ;
   private String[] BC01PJ126_A13301PrdZDHC ;
   private String[] BC01PJ126_A13302PrdTHELIST ;
   private boolean[] BC01PJ126_n13302PrdTHELIST ;
   private String[] BC01PJ126_A13457PrdUbicaci ;
   private String[] BC01PJ126_A3936PrdEqLP ;
   private String[] BC01PJ127_A407EmprNom ;
   private boolean[] BC01PJ127_n407EmprNom ;
   private String[] BC01PJ128_A407EmprNom ;
   private boolean[] BC01PJ128_n407EmprNom ;
   private String[] BC01PJ129_A396EmprCod ;
   private String[] BC01PJ129_A719PrdNum ;
   private boolean[] BC01PJ129_n719PrdNum ;
   private long[] BC01PJ129_A3342CCStkLin ;
   private String[] BC01PJ129_A3345TipMovCc ;
   private String[] BC01PJ130_A396EmprCod ;
   private String[] BC01PJ130_A719PrdNum ;
   private boolean[] BC01PJ130_n719PrdNum ;
   private long[] BC01PJ130_A3342CCStkLin ;
   private java.util.Date[] BC01PJ130_A3348CCStkFec ;
   private String[] BC01PJ131_A396EmprCod ;
   private String[] BC01PJ131_A719PrdNum ;
   private boolean[] BC01PJ131_n719PrdNum ;
   private long[] BC01PJ131_A3342CCStkLin ;
   private String[] BC01PJ131_A3345TipMovCc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private byte[] BC01PJ2_A8896PrdPesCon ;
   private short[] BC01PJ2_A13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ2_A13970PrdMatSeca ;
   private java.util.Date[] BC01PJ2_A13971PrdLoteFch ;
   private String[] BC01PJ2_A13972PrdFTdoc ;
   private String[] BC01PJ2_A13973PrdFSdoc ;
   private String[] BC01PJ2_A13974PrdGRS ;
   private String[] BC01PJ2_A396EmprCod ;
   private byte[] BC01PJ2_A13969PrdGruFamI ;
   private byte[] BC01PJ2_A629MetCod ;
   private int[] BC01PJ2_A795PrvNum ;
   private byte[] BC01PJ2_A835TipDtoCod ;
   private byte[] BC01PJ2_A742PrdUniCom ;
   private byte[] BC01PJ2_A743PrdUniCon ;
   private byte[] BC01PJ2_A856ValCod ;
   private short[] BC01PJ2_A6301TipPrdCod ;
   private byte[] BC01PJ2_A9609SubFamCod ;
   private int[] BC01PJ2_A12714PrdFabId ;
   private short[] BC01PJ2_A13927AlmPrdID ;
   private String[] BC01PJ2_A719PrdNum ;
   private java.util.Date[] BC01PJ2_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ2_A5590PrdSolub ;
   private String[] BC01PJ2_A8897PrdPesTerm ;
   private String[] BC01PJ2_A718PrdNom ;
   private String[] BC01PJ2_A728PrdRefPrv ;
   private String[] BC01PJ2_A703PrdDscTec ;
   private java.math.BigDecimal[] BC01PJ2_A707PrdFacCon ;
   private String[] BC01PJ2_A727PrdRec ;
   private String[] BC01PJ2_A682PrdCalNec ;
   private String[] BC01PJ2_A698PrdDetPar ;
   private byte[] BC01PJ2_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ2_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ2_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ2_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ2_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ2_A696PrdConDia ;
   private short[] BC01PJ2_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ2_A732PrdStkMinU ;
   private short[] BC01PJ2_A699PrdDiaRot ;
   private short[] BC01PJ2_A722PrdPlaEnt ;
   private short[] BC01PJ2_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ2_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ2_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ2_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ2_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ2_A684PrdCanPen ;
   private java.util.Date[] BC01PJ2_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ2_A714PrdFulPed ;
   private java.util.Date[] BC01PJ2_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ2_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ2_A740PrdUltECC ;
   private short[] BC01PJ2_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ2_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ2_A700PrdDifCC ;
   private short[] BC01PJ2_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ2_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ2_A332DifValStk ;
   private java.util.Date[] BC01PJ2_A708PrdFecEnt ;
   private short[] BC01PJ2_A1193PrdPosX ;
   private byte[] BC01PJ2_A1194PrdPosY ;
   private String[] BC01PJ2_A1643PrdTip ;
   private short[] BC01PJ2_A1644PrdDqo ;
   private String[] BC01PJ2_A3004PrdRev ;
   private byte[] BC01PJ2_A3273PrdTnq ;
   private String[] BC01PJ2_A4692PrdNom2 ;
   private String[] BC01PJ2_A4693PrdNum2 ;
   private String[] BC01PJ2_A4694PrdObs ;
   private byte[] BC01PJ2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ2_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ2_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ2_A5417PrdConcS ;
   private String[] BC01PJ2_A5418PrdSalM ;
   private String[] BC01PJ2_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ2_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ2_A7227PrdNumct2 ;
   private byte[] BC01PJ2_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ2_A8659PrdExiAlmc ;
   private String[] BC01PJ2_A8936PrdSal ;
   private String[] BC01PJ2_A9731PrdInc ;
   private String[] BC01PJ2_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ2_A9733PrdAox ;
   private String[] BC01PJ2_A9734PrdNCAS ;
   private String[] BC01PJ2_A9739PrdFT ;
   private java.util.Date[] BC01PJ2_A9740PrdFFT ;
   private String[] BC01PJ2_A9741PrdHS ;
   private java.util.Date[] BC01PJ2_A9742PrdFHS ;
   private String[] BC01PJ2_A10119PrdColIdx ;
   private String[] BC01PJ2_A5888PrdOkotex ;
   private String[] BC01PJ2_A5887PrdReach ;
   private String[] BC01PJ2_A10881PrdLote ;
   private String[] BC01PJ2_A10935PrdRTM ;
   private String[] BC01PJ2_A10936PrdCtw1 ;
   private String[] BC01PJ2_A10937PrdCtw2 ;
   private String[] BC01PJ2_A10938PrdCtw3 ;
   private String[] BC01PJ2_A11663PrdCtw4 ;
   private String[] BC01PJ2_A11196PrdNroCAS ;
   private String[] BC01PJ2_A11363PrdGots ;
   private String[] BC01PJ2_A11364PrdHm ;
   private short[] BC01PJ2_A11470PrdConct ;
   private String[] BC01PJ2_A11614PrdEINECS ;
   private String[] BC01PJ2_A11615PrdFuncion ;
   private String[] BC01PJ2_A11616PrdNmQu ;
   private String[] BC01PJ2_A11687PrdList ;
   private String[] BC01PJ2_A12957PrdLoteOb ;
   private long[] BC01PJ2_A13232PrdRGB ;
   private String[] BC01PJ2_A13301PrdZDHC ;
   private String[] BC01PJ2_A13302PrdTHELIST ;
   private String[] BC01PJ2_A13457PrdUbicaci ;
   private String[] BC01PJ2_A3936PrdEqLP ;
   private byte[] BC01PJ3_A8896PrdPesCon ;
   private short[] BC01PJ3_A13968PrdCantAtM ;
   private java.math.BigDecimal[] BC01PJ3_A13970PrdMatSeca ;
   private java.util.Date[] BC01PJ3_A13971PrdLoteFch ;
   private String[] BC01PJ3_A13972PrdFTdoc ;
   private String[] BC01PJ3_A13973PrdFSdoc ;
   private String[] BC01PJ3_A13974PrdGRS ;
   private String[] BC01PJ3_A396EmprCod ;
   private byte[] BC01PJ3_A13969PrdGruFamI ;
   private byte[] BC01PJ3_A629MetCod ;
   private int[] BC01PJ3_A795PrvNum ;
   private byte[] BC01PJ3_A835TipDtoCod ;
   private byte[] BC01PJ3_A742PrdUniCom ;
   private byte[] BC01PJ3_A743PrdUniCon ;
   private byte[] BC01PJ3_A856ValCod ;
   private short[] BC01PJ3_A6301TipPrdCod ;
   private byte[] BC01PJ3_A9609SubFamCod ;
   private int[] BC01PJ3_A12714PrdFabId ;
   private short[] BC01PJ3_A13927AlmPrdID ;
   private String[] BC01PJ3_A719PrdNum ;
   private java.util.Date[] BC01PJ3_A709PrdFecPre ;
   private java.math.BigDecimal[] BC01PJ3_A5590PrdSolub ;
   private String[] BC01PJ3_A8897PrdPesTerm ;
   private String[] BC01PJ3_A718PrdNom ;
   private String[] BC01PJ3_A728PrdRefPrv ;
   private String[] BC01PJ3_A703PrdDscTec ;
   private java.math.BigDecimal[] BC01PJ3_A707PrdFacCon ;
   private String[] BC01PJ3_A727PrdRec ;
   private String[] BC01PJ3_A682PrdCalNec ;
   private String[] BC01PJ3_A698PrdDetPar ;
   private byte[] BC01PJ3_A730PrdSit ;
   private java.math.BigDecimal[] BC01PJ3_A729PrdRotRea ;
   private java.math.BigDecimal[] BC01PJ3_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01PJ3_A725PrdPreAnt ;
   private java.math.BigDecimal[] BC01PJ3_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01PJ3_A696PrdConDia ;
   private short[] BC01PJ3_A731PrdStkMinD ;
   private java.math.BigDecimal[] BC01PJ3_A732PrdStkMinU ;
   private short[] BC01PJ3_A699PrdDiaRot ;
   private short[] BC01PJ3_A722PrdPlaEnt ;
   private short[] BC01PJ3_A716PrdLotMin ;
   private java.math.BigDecimal[] BC01PJ3_A721PrdNumUco ;
   private java.math.BigDecimal[] BC01PJ3_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01PJ3_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01PJ3_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01PJ3_A684PrdCanPen ;
   private java.util.Date[] BC01PJ3_A713PrdFulEnt ;
   private java.util.Date[] BC01PJ3_A714PrdFulPed ;
   private java.util.Date[] BC01PJ3_A712PrdFulCC ;
   private java.math.BigDecimal[] BC01PJ3_A706PrdExiCCP ;
   private java.math.BigDecimal[] BC01PJ3_A740PrdUltECC ;
   private short[] BC01PJ3_A738PrdUltCCC ;
   private java.math.BigDecimal[] BC01PJ3_A739PrdUltDCC ;
   private java.math.BigDecimal[] BC01PJ3_A700PrdDifCC ;
   private short[] BC01PJ3_A695PrdConCC ;
   private java.math.BigDecimal[] BC01PJ3_A750PrdValStk ;
   private java.math.BigDecimal[] BC01PJ3_A332DifValStk ;
   private java.util.Date[] BC01PJ3_A708PrdFecEnt ;
   private short[] BC01PJ3_A1193PrdPosX ;
   private byte[] BC01PJ3_A1194PrdPosY ;
   private String[] BC01PJ3_A1643PrdTip ;
   private short[] BC01PJ3_A1644PrdDqo ;
   private String[] BC01PJ3_A3004PrdRev ;
   private byte[] BC01PJ3_A3273PrdTnq ;
   private String[] BC01PJ3_A4692PrdNom2 ;
   private String[] BC01PJ3_A4693PrdNum2 ;
   private String[] BC01PJ3_A4694PrdObs ;
   private byte[] BC01PJ3_A4338PrdUMeFo ;
   private java.math.BigDecimal[] BC01PJ3_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] BC01PJ3_A5416PrdDensS ;
   private java.math.BigDecimal[] BC01PJ3_A5417PrdConcS ;
   private String[] BC01PJ3_A5418PrdSalM ;
   private String[] BC01PJ3_A6191PrdNumCent ;
   private java.math.BigDecimal[] BC01PJ3_A7226PrdNumct1 ;
   private java.math.BigDecimal[] BC01PJ3_A7227PrdNumct2 ;
   private byte[] BC01PJ3_A7260PrdHorMad ;
   private java.math.BigDecimal[] BC01PJ3_A8659PrdExiAlmc ;
   private String[] BC01PJ3_A8936PrdSal ;
   private String[] BC01PJ3_A9731PrdInc ;
   private String[] BC01PJ3_A9732PrdComp ;
   private java.math.BigDecimal[] BC01PJ3_A9733PrdAox ;
   private String[] BC01PJ3_A9734PrdNCAS ;
   private String[] BC01PJ3_A9739PrdFT ;
   private java.util.Date[] BC01PJ3_A9740PrdFFT ;
   private String[] BC01PJ3_A9741PrdHS ;
   private java.util.Date[] BC01PJ3_A9742PrdFHS ;
   private String[] BC01PJ3_A10119PrdColIdx ;
   private String[] BC01PJ3_A5888PrdOkotex ;
   private String[] BC01PJ3_A5887PrdReach ;
   private String[] BC01PJ3_A10881PrdLote ;
   private String[] BC01PJ3_A10935PrdRTM ;
   private String[] BC01PJ3_A10936PrdCtw1 ;
   private String[] BC01PJ3_A10937PrdCtw2 ;
   private String[] BC01PJ3_A10938PrdCtw3 ;
   private String[] BC01PJ3_A11663PrdCtw4 ;
   private String[] BC01PJ3_A11196PrdNroCAS ;
   private String[] BC01PJ3_A11363PrdGots ;
   private String[] BC01PJ3_A11364PrdHm ;
   private short[] BC01PJ3_A11470PrdConct ;
   private String[] BC01PJ3_A11614PrdEINECS ;
   private String[] BC01PJ3_A11615PrdFuncion ;
   private String[] BC01PJ3_A11616PrdNmQu ;
   private String[] BC01PJ3_A11687PrdList ;
   private String[] BC01PJ3_A12957PrdLoteOb ;
   private long[] BC01PJ3_A13232PrdRGB ;
   private String[] BC01PJ3_A13301PrdZDHC ;
   private String[] BC01PJ3_A13302PrdTHELIST ;
   private String[] BC01PJ3_A13457PrdUbicaci ;
   private String[] BC01PJ3_A3936PrdEqLP ;
   private long[] BC01PJ5_A13875PrdLastLin ;
   private String[] BC01PJ6_A407EmprNom ;
   private String[] BC01PJ7_A396EmprCod ;
   private String[] BC01PJ8_A630MetDsc ;
   private String[] BC01PJ9_A794PrvNom ;
   private java.math.BigDecimal[] BC01PJ10_A837TipDtoDto ;
   private String[] BC01PJ11_A737PrdUcpDsc ;
   private String[] BC01PJ12_A736PrdUcoDsc ;
   private String[] BC01PJ13_A857ValDsc ;
   private String[] BC01PJ14_A6302TipPrdDsc ;
   private String[] BC01PJ15_A9610SubFamDsc ;
   private String[] BC01PJ16_A12715PrdFabNm ;
   private String[] BC01PJ17_A396EmprCod ;
   private boolean[] BC01PJ2_n13968PrdCantAtM ;
   private boolean[] BC01PJ2_n13970PrdMatSeca ;
   private boolean[] BC01PJ2_n13971PrdLoteFch ;
   private boolean[] BC01PJ2_n13972PrdFTdoc ;
   private boolean[] BC01PJ2_n13973PrdFSdoc ;
   private boolean[] BC01PJ2_n13974PrdGRS ;
   private boolean[] BC01PJ2_n13969PrdGruFamI ;
   private boolean[] BC01PJ2_n629MetCod ;
   private boolean[] BC01PJ2_n835TipDtoCod ;
   private boolean[] BC01PJ2_n6301TipPrdCod ;
   private boolean[] BC01PJ2_n9609SubFamCod ;
   private boolean[] BC01PJ2_n12714PrdFabId ;
   private boolean[] BC01PJ2_n13927AlmPrdID ;
   private boolean[] BC01PJ2_n13302PrdTHELIST ;
   private boolean[] BC01PJ3_n13968PrdCantAtM ;
   private boolean[] BC01PJ3_n13970PrdMatSeca ;
   private boolean[] BC01PJ3_n13971PrdLoteFch ;
   private boolean[] BC01PJ3_n13972PrdFTdoc ;
   private boolean[] BC01PJ3_n13973PrdFSdoc ;
   private boolean[] BC01PJ3_n13974PrdGRS ;
   private boolean[] BC01PJ3_n13969PrdGruFamI ;
   private boolean[] BC01PJ3_n629MetCod ;
   private boolean[] BC01PJ3_n835TipDtoCod ;
   private boolean[] BC01PJ3_n6301TipPrdCod ;
   private boolean[] BC01PJ3_n9609SubFamCod ;
   private boolean[] BC01PJ3_n12714PrdFabId ;
   private boolean[] BC01PJ3_n13927AlmPrdID ;
   private boolean[] BC01PJ3_n13302PrdTHELIST ;
   private boolean[] BC01PJ5_n13875PrdLastLin ;
   private boolean[] BC01PJ6_n407EmprNom ;
   private boolean[] BC01PJ8_n630MetDsc ;
   private boolean[] BC01PJ9_n794PrvNom ;
   private boolean[] BC01PJ10_n837TipDtoDto ;
   private boolean[] BC01PJ11_n737PrdUcpDsc ;
   private boolean[] BC01PJ12_n736PrdUcoDsc ;
   private boolean[] BC01PJ13_n857ValDsc ;
   private boolean[] BC01PJ14_n6302TipPrdDsc ;
   private boolean[] BC01PJ15_n9610SubFamDsc ;
   private boolean[] BC01PJ16_n12715PrdFabNm ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV54TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV65TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV53WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class produc_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class produc_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class produc_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class produc_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class produc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01PJ2", "SELECT PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, EmprCod, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID, PrdNum, PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP, PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ3", "SELECT PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, EmprCod, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID, PrdNum, PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ5", "SELECT COALESCE( T1.PrdLastLin, 0) AS PrdLastLin FROM (SELECT MAX(CCStkLin) AS PrdLastLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and Not TipMovCc = 'SR' ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ7", "SELECT EmprCod FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ8", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ9", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ10", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ11", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ12", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ13", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ14", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ15", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ16", "SELECT PrdFabNm FROM TXPPRDFAB WHERE EmprCod = ? AND PrdFabId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ17", "SELECT EmprCod FROM TXPALMPRD WHERE EmprCod = ? AND AlmPrdID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ19", "SELECT COALESCE( T1.PrdLastLin, 0) AS PrdLastLin FROM (SELECT MAX(CCStkLin) AS PrdLastLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and Not TipMovCc = 'SR' ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ21", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ22", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ23", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ25", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdPesCon, TM1.PrdCantAtM, TM1.PrdMatSeca, TM1.PrdLoteFch, TM1.PrdFTdoc, TM1.PrdFSdoc, TM1.PrdGRS, TM1.EmprCod, TM1.PrdGruFamI AS PrdGruFamI, TM1.MetCod, TM1.PrvNum, TM1.TipDtoCod, TM1.PrdUniCom AS PrdUniCom, TM1.PrdUniCon AS PrdUniCon, TM1.ValCod, TM1.TipPrdCod, TM1.SubFamCod, TM1.PrdFabId, TM1.AlmPrdID, COALESCE( T3.PrdLastLin, 0) AS PrdLastLin, TM1.PrdNum, TM1.PrdFecPre, TM1.PrdSolub, TM1.PrdPesTerm, T2.EmprNom, TM1.PrdNom, T4.PrvNom, TM1.PrdRefPrv, TM1.PrdDscTec, T5.UniDsc AS PrdUcpDsc, T6.UniDsc AS PrdUcoDsc, TM1.PrdFacCon, T7.ValDsc, TM1.PrdRec, TM1.PrdCalNec, TM1.PrdDetPar, TM1.PrdSit, TM1.PrdRotRea, T8.TipDtoDto, TM1.PrdPreAct, TM1.PrdPreAnt, TM1.PrdPreMed, TM1.PrdConDia, TM1.PrdStkMinD, TM1.PrdStkMinU, TM1.PrdDiaRot, TM1.PrdPlaEnt, T9.MetDsc, TM1.PrdLotMin, TM1.PrdNumUco, TM1.PrdExiAlm, TM1.PrdExiCC, TM1.PrdCanRes, TM1.PrdCanPen, TM1.PrdFulEnt, TM1.PrdFulPed, TM1.PrdFulCC, TM1.PrdExiCCP, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdUltDCC, TM1.PrdDifCC, TM1.PrdConCC, TM1.PrdValStk, TM1.DifValStk, TM1.PrdFecEnt, TM1.PrdPosX, TM1.PrdPosY, TM1.PrdTip, TM1.PrdDqo, TM1.PrdRev, TM1.PrdTnq, TM1.PrdNom2, TM1.PrdNum2, TM1.PrdObs, TM1.PrdUMeFo, TM1.PrdPreAc2, TM1.PrdDensS, TM1.PrdConcS, TM1.PrdSalM, T10.TipPrdDsc, TM1.PrdNumCent, TM1.PrdNumct1, TM1.PrdNumct2, TM1.PrdHorMad, TM1.PrdExiAlmc, TM1.PrdSal, T11.SubFamDsc, TM1.PrdInc, TM1.PrdComp, TM1.PrdAox, TM1.PrdNCAS, TM1.PrdFT, TM1.PrdFFT, TM1.PrdHS, TM1.PrdFHS, TM1.PrdColIdx, TM1.PrdOkotex, TM1.PrdReach, TM1.PrdLote, TM1.PrdRTM, TM1.PrdCtw1, TM1.PrdCtw2, TM1.PrdCtw3, TM1.PrdCtw4, TM1.PrdNroCAS, TM1.PrdGots, TM1.PrdHm, TM1.PrdConct, TM1.PrdEINECS, TM1.PrdFuncion, TM1.PrdNmQu, TM1.PrdList, T12.PrdFabNm, TM1.PrdLoteOb, TM1.PrdRGB, TM1.PrdZDHC, TM1.PrdTHELIST, TM1.PrdUbicaci, TM1.PrdEqLP FROM ((((((((((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = TM1.PrvNum) INNER JOIN TXPTIPUNI T5 ON T5.EmprCod = TM1.EmprCod AND T5.UniCod = TM1.PrdUniCom) INNER JOIN TXPTIPUNI T6 ON T6.EmprCod = TM1.EmprCod AND T6.UniCod = TM1.PrdUniCon) INNER JOIN TXPTIPVAL T7 ON T7.EmprCod = TM1.EmprCod AND T7.ValCod = TM1.ValCod) LEFT JOIN TXPTIPDTO T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipDtoCod = TM1.TipDtoCod) LEFT JOIN TXPMETPED T9 ON T9.EmprCod = TM1.EmprCod AND T9.MetCod = TM1.MetCod) LEFT JOIN TXPTIPPRD T10 ON T10.EmprCod = TM1.EmprCod AND T10.TipPrdCod = TM1.TipPrdCod) LEFT JOIN TXPSUBFSP T11 ON T11.EmprCod = TM1.EmprCod AND T11.SubFamCod = TM1.SubFamCod) LEFT JOIN TXPPRDFAB T12 ON T12.EmprCod = TM1.EmprCod AND T12.PrdFabId = TM1.PrdFabId),  (SELECT MAX(CCStkLin) AS PrdLastLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and Not TipMovCc = 'SR' ) T3 WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ26", "SELECT EmprCod FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ27", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ28", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ29", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ30", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ31", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ32", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ33", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ34", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ35", "SELECT PrdFabNm FROM TXPPRDFAB WHERE EmprCod = ? AND PrdFabId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ36", "SELECT EmprCod FROM TXPALMPRD WHERE EmprCod = ? AND AlmPrdID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ37", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ38", "SELECT PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, EmprCod, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID, PrdNum, PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ39", "SELECT PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, EmprCod, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID, PrdNum, PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP, PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01PJ40", "INSERT INTO TXPPRODUC(PrdNum, PrdFecPre, PrdSolub, PrdPesTerm, PrdNom, PrdRefPrv, PrdDscTec, PrdFacCon, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdColIdx, PrdOkotex, PrdReach, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdEqLP, PrdPesCon, PrdCantAtM, PrdMatSeca, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, EmprCod, PrdGruFamI, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdFabId, AlmPrdID, MovEspULin, PrdSus, CCStKULin, PrdPreRef, Mat_Lts, Almc_Ult, PrdAltAct, CC_Ultln, PrdConc, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("BC01PJ41", "UPDATE TXPPRODUC SET PrdFecPre=?, PrdSolub=?, PrdPesTerm=?, PrdNom=?, PrdRefPrv=?, PrdDscTec=?, PrdFacCon=?, PrdRec=?, PrdCalNec=?, PrdDetPar=?, PrdSit=?, PrdRotRea=?, PrdPreAct=?, PrdPreAnt=?, PrdPreMed=?, PrdConDia=?, PrdStkMinD=?, PrdStkMinU=?, PrdDiaRot=?, PrdPlaEnt=?, PrdLotMin=?, PrdNumUco=?, PrdExiAlm=?, PrdExiCC=?, PrdCanRes=?, PrdCanPen=?, PrdFulEnt=?, PrdFulPed=?, PrdFulCC=?, PrdExiCCP=?, PrdUltECC=?, PrdUltCCC=?, PrdUltDCC=?, PrdDifCC=?, PrdConCC=?, PrdValStk=?, DifValStk=?, PrdFecEnt=?, PrdPosX=?, PrdPosY=?, PrdTip=?, PrdDqo=?, PrdRev=?, PrdTnq=?, PrdNom2=?, PrdNum2=?, PrdObs=?, PrdUMeFo=?, PrdPreAc2=?, PrdDensS=?, PrdConcS=?, PrdSalM=?, PrdNumCent=?, PrdNumct1=?, PrdNumct2=?, PrdHorMad=?, PrdExiAlmc=?, PrdSal=?, PrdInc=?, PrdComp=?, PrdAox=?, PrdNCAS=?, PrdFT=?, PrdFFT=?, PrdHS=?, PrdFHS=?, PrdColIdx=?, PrdOkotex=?, PrdReach=?, PrdLote=?, PrdRTM=?, PrdCtw1=?, PrdCtw2=?, PrdCtw3=?, PrdCtw4=?, PrdNroCAS=?, PrdGots=?, PrdHm=?, PrdConct=?, PrdEINECS=?, PrdFuncion=?, PrdNmQu=?, PrdList=?, PrdLoteOb=?, PrdRGB=?, PrdZDHC=?, PrdTHELIST=?, PrdUbicaci=?, PrdEqLP=?, PrdPesCon=?, PrdCantAtM=?, PrdMatSeca=?, PrdLoteFch=?, PrdFTdoc=?, PrdFSdoc=?, PrdGRS=?, PrdGruFamI=?, MetCod=?, PrvNum=?, TipDtoCod=?, PrdUniCom=?, PrdUniCon=?, ValCod=?, TipPrdCod=?, SubFamCod=?, PrdFabId=?, AlmPrdID=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("BC01PJ42", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("BC01PJ43", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ44", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ45", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ46", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ47", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ48", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ49", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ50", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ51", "SELECT PrdFabNm FROM TXPPRDFAB WHERE EmprCod = ? AND PrdFabId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ52", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ53", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ54", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ55", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ56", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ57", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ58", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ59", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ60", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ61", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ62", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ63", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ64", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ65", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ66", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ67", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ68", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ69", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ70", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ71", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ72", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ73", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ74", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ75", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ76", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ77", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ78", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ79", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ80", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ81", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ82", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ83", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ84", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ85", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ86", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ87", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ88", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ89", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ90", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ91", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ92", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ93", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ94", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ95", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ96", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ97", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ98", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ99", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ100", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ101", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ102", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ103", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ104", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ105", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ106", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ107", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ108", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ109", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ110", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ111", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ112", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ113", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ114", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ115", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ116", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ117", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ118", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ119", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ120", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ121", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ122", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ123", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ124", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01PJ126", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdPesCon, TM1.PrdCantAtM, TM1.PrdMatSeca, TM1.PrdLoteFch, TM1.PrdFTdoc, TM1.PrdFSdoc, TM1.PrdGRS, TM1.EmprCod, TM1.PrdGruFamI AS PrdGruFamI, TM1.MetCod, TM1.PrvNum, TM1.TipDtoCod, TM1.PrdUniCom AS PrdUniCom, TM1.PrdUniCon AS PrdUniCon, TM1.ValCod, TM1.TipPrdCod, TM1.SubFamCod, TM1.PrdFabId, TM1.AlmPrdID, COALESCE( T3.PrdLastLin, 0) AS PrdLastLin, TM1.PrdNum, TM1.PrdFecPre, TM1.PrdSolub, TM1.PrdPesTerm, T2.EmprNom, TM1.PrdNom, T4.PrvNom, TM1.PrdRefPrv, TM1.PrdDscTec, T5.UniDsc AS PrdUcpDsc, T6.UniDsc AS PrdUcoDsc, TM1.PrdFacCon, T7.ValDsc, TM1.PrdRec, TM1.PrdCalNec, TM1.PrdDetPar, TM1.PrdSit, TM1.PrdRotRea, T8.TipDtoDto, TM1.PrdPreAct, TM1.PrdPreAnt, TM1.PrdPreMed, TM1.PrdConDia, TM1.PrdStkMinD, TM1.PrdStkMinU, TM1.PrdDiaRot, TM1.PrdPlaEnt, T9.MetDsc, TM1.PrdLotMin, TM1.PrdNumUco, TM1.PrdExiAlm, TM1.PrdExiCC, TM1.PrdCanRes, TM1.PrdCanPen, TM1.PrdFulEnt, TM1.PrdFulPed, TM1.PrdFulCC, TM1.PrdExiCCP, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdUltDCC, TM1.PrdDifCC, TM1.PrdConCC, TM1.PrdValStk, TM1.DifValStk, TM1.PrdFecEnt, TM1.PrdPosX, TM1.PrdPosY, TM1.PrdTip, TM1.PrdDqo, TM1.PrdRev, TM1.PrdTnq, TM1.PrdNom2, TM1.PrdNum2, TM1.PrdObs, TM1.PrdUMeFo, TM1.PrdPreAc2, TM1.PrdDensS, TM1.PrdConcS, TM1.PrdSalM, T10.TipPrdDsc, TM1.PrdNumCent, TM1.PrdNumct1, TM1.PrdNumct2, TM1.PrdHorMad, TM1.PrdExiAlmc, TM1.PrdSal, T11.SubFamDsc, TM1.PrdInc, TM1.PrdComp, TM1.PrdAox, TM1.PrdNCAS, TM1.PrdFT, TM1.PrdFFT, TM1.PrdHS, TM1.PrdFHS, TM1.PrdColIdx, TM1.PrdOkotex, TM1.PrdReach, TM1.PrdLote, TM1.PrdRTM, TM1.PrdCtw1, TM1.PrdCtw2, TM1.PrdCtw3, TM1.PrdCtw4, TM1.PrdNroCAS, TM1.PrdGots, TM1.PrdHm, TM1.PrdConct, TM1.PrdEINECS, TM1.PrdFuncion, TM1.PrdNmQu, TM1.PrdList, T12.PrdFabNm, TM1.PrdLoteOb, TM1.PrdRGB, TM1.PrdZDHC, TM1.PrdTHELIST, TM1.PrdUbicaci, TM1.PrdEqLP FROM ((((((((((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = TM1.PrvNum) INNER JOIN TXPTIPUNI T5 ON T5.EmprCod = TM1.EmprCod AND T5.UniCod = TM1.PrdUniCom) INNER JOIN TXPTIPUNI T6 ON T6.EmprCod = TM1.EmprCod AND T6.UniCod = TM1.PrdUniCon) INNER JOIN TXPTIPVAL T7 ON T7.EmprCod = TM1.EmprCod AND T7.ValCod = TM1.ValCod) LEFT JOIN TXPTIPDTO T8 ON T8.EmprCod = TM1.EmprCod AND T8.TipDtoCod = TM1.TipDtoCod) LEFT JOIN TXPMETPED T9 ON T9.EmprCod = TM1.EmprCod AND T9.MetCod = TM1.MetCod) LEFT JOIN TXPTIPPRD T10 ON T10.EmprCod = TM1.EmprCod AND T10.TipPrdCod = TM1.TipPrdCod) LEFT JOIN TXPSUBFSP T11 ON T11.EmprCod = TM1.EmprCod AND T11.SubFamCod = TM1.SubFamCod) LEFT JOIN TXPPRDFAB T12 ON T12.EmprCod = TM1.EmprCod AND T12.PrdFabId = TM1.PrdFabId),  (SELECT MAX(CCStkLin) AS PrdLastLin FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and Not TipMovCc = 'SR' ) T3 WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ127", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ128", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ129", "SELECT EmprCod, PrdNum, CCStkLin, TipMovCc FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ130", "SELECT EmprCod, PrdNum, CCStkLin, CCStkFec FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01PJ131", "SELECT EmprCod, PrdNum, CCStkLin, TipMovCc FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 6);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[35])[0] = rslt.getString(23, 10);
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((String[]) buf[37])[0] = rslt.getString(25, 30);
               ((String[]) buf[38])[0] = rslt.getString(26, 4);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[40])[0] = rslt.getString(28, 1);
               ((String[]) buf[41])[0] = rslt.getString(29, 1);
               ((String[]) buf[42])[0] = rslt.getString(30, 1);
               ((byte[]) buf[43])[0] = rslt.getByte(31);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(36,2);
               ((short[]) buf[49])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((short[]) buf[52])[0] = rslt.getShort(40);
               ((short[]) buf[53])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(43,4);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,4);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,4);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,4);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(47);
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(48);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(51,2);
               ((short[]) buf[64])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[67])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(57,2);
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(58);
               ((short[]) buf[71])[0] = rslt.getShort(59);
               ((byte[]) buf[72])[0] = rslt.getByte(60);
               ((String[]) buf[73])[0] = rslt.getString(61, 1);
               ((short[]) buf[74])[0] = rslt.getShort(62);
               ((String[]) buf[75])[0] = rslt.getString(63, 1);
               ((byte[]) buf[76])[0] = rslt.getByte(64);
               ((String[]) buf[77])[0] = rslt.getString(65, 40);
               ((String[]) buf[78])[0] = rslt.getString(66, 16);
               ((String[]) buf[79])[0] = rslt.getVarchar(67);
               ((byte[]) buf[80])[0] = rslt.getByte(68);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(69,5);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(70,3);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(71,3);
               ((String[]) buf[84])[0] = rslt.getString(72, 1);
               ((String[]) buf[85])[0] = rslt.getString(73, 6);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(74,2);
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(75,2);
               ((byte[]) buf[88])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(77,4);
               ((String[]) buf[90])[0] = rslt.getString(78, 1);
               ((String[]) buf[91])[0] = rslt.getString(79, 2);
               ((String[]) buf[92])[0] = rslt.getString(80, 2);
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(81,2);
               ((String[]) buf[94])[0] = rslt.getString(82, 30);
               ((String[]) buf[95])[0] = rslt.getString(83, 1);
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDate(84);
               ((String[]) buf[97])[0] = rslt.getString(85, 1);
               ((java.util.Date[]) buf[98])[0] = rslt.getGXDate(86);
               ((String[]) buf[99])[0] = rslt.getString(87, 10);
               ((String[]) buf[100])[0] = rslt.getString(88, 1);
               ((String[]) buf[101])[0] = rslt.getString(89, 1);
               ((String[]) buf[102])[0] = rslt.getString(90, 26);
               ((String[]) buf[103])[0] = rslt.getString(91, 10);
               ((String[]) buf[104])[0] = rslt.getString(92, 3);
               ((String[]) buf[105])[0] = rslt.getString(93, 20);
               ((String[]) buf[106])[0] = rslt.getString(94, 3);
               ((String[]) buf[107])[0] = rslt.getString(95, 3);
               ((String[]) buf[108])[0] = rslt.getString(96, 40);
               ((String[]) buf[109])[0] = rslt.getString(97, 1);
               ((String[]) buf[110])[0] = rslt.getString(98, 1);
               ((short[]) buf[111])[0] = rslt.getShort(99);
               ((String[]) buf[112])[0] = rslt.getString(100, 40);
               ((String[]) buf[113])[0] = rslt.getString(101, 50);
               ((String[]) buf[114])[0] = rslt.getVarchar(102);
               ((String[]) buf[115])[0] = rslt.getString(103, 1);
               ((String[]) buf[116])[0] = rslt.getString(104, 1);
               ((long[]) buf[117])[0] = rslt.getLong(105);
               ((String[]) buf[118])[0] = rslt.getString(106, 1);
               ((String[]) buf[119])[0] = rslt.getString(107, 4);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(108, 20);
               ((String[]) buf[122])[0] = rslt.getString(109, 6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 6);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[35])[0] = rslt.getString(23, 10);
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((String[]) buf[37])[0] = rslt.getString(25, 30);
               ((String[]) buf[38])[0] = rslt.getString(26, 4);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[40])[0] = rslt.getString(28, 1);
               ((String[]) buf[41])[0] = rslt.getString(29, 1);
               ((String[]) buf[42])[0] = rslt.getString(30, 1);
               ((byte[]) buf[43])[0] = rslt.getByte(31);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(36,2);
               ((short[]) buf[49])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((short[]) buf[52])[0] = rslt.getShort(40);
               ((short[]) buf[53])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(43,4);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,4);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,4);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,4);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(47);
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(48);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(51,2);
               ((short[]) buf[64])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[67])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(57,2);
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(58);
               ((short[]) buf[71])[0] = rslt.getShort(59);
               ((byte[]) buf[72])[0] = rslt.getByte(60);
               ((String[]) buf[73])[0] = rslt.getString(61, 1);
               ((short[]) buf[74])[0] = rslt.getShort(62);
               ((String[]) buf[75])[0] = rslt.getString(63, 1);
               ((byte[]) buf[76])[0] = rslt.getByte(64);
               ((String[]) buf[77])[0] = rslt.getString(65, 40);
               ((String[]) buf[78])[0] = rslt.getString(66, 16);
               ((String[]) buf[79])[0] = rslt.getVarchar(67);
               ((byte[]) buf[80])[0] = rslt.getByte(68);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(69,5);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(70,3);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(71,3);
               ((String[]) buf[84])[0] = rslt.getString(72, 1);
               ((String[]) buf[85])[0] = rslt.getString(73, 6);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(74,2);
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(75,2);
               ((byte[]) buf[88])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(77,4);
               ((String[]) buf[90])[0] = rslt.getString(78, 1);
               ((String[]) buf[91])[0] = rslt.getString(79, 2);
               ((String[]) buf[92])[0] = rslt.getString(80, 2);
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(81,2);
               ((String[]) buf[94])[0] = rslt.getString(82, 30);
               ((String[]) buf[95])[0] = rslt.getString(83, 1);
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDate(84);
               ((String[]) buf[97])[0] = rslt.getString(85, 1);
               ((java.util.Date[]) buf[98])[0] = rslt.getGXDate(86);
               ((String[]) buf[99])[0] = rslt.getString(87, 10);
               ((String[]) buf[100])[0] = rslt.getString(88, 1);
               ((String[]) buf[101])[0] = rslt.getString(89, 1);
               ((String[]) buf[102])[0] = rslt.getString(90, 26);
               ((String[]) buf[103])[0] = rslt.getString(91, 10);
               ((String[]) buf[104])[0] = rslt.getString(92, 3);
               ((String[]) buf[105])[0] = rslt.getString(93, 20);
               ((String[]) buf[106])[0] = rslt.getString(94, 3);
               ((String[]) buf[107])[0] = rslt.getString(95, 3);
               ((String[]) buf[108])[0] = rslt.getString(96, 40);
               ((String[]) buf[109])[0] = rslt.getString(97, 1);
               ((String[]) buf[110])[0] = rslt.getString(98, 1);
               ((short[]) buf[111])[0] = rslt.getShort(99);
               ((String[]) buf[112])[0] = rslt.getString(100, 40);
               ((String[]) buf[113])[0] = rslt.getString(101, 50);
               ((String[]) buf[114])[0] = rslt.getVarchar(102);
               ((String[]) buf[115])[0] = rslt.getString(103, 1);
               ((String[]) buf[116])[0] = rslt.getString(104, 1);
               ((long[]) buf[117])[0] = rslt.getLong(105);
               ((String[]) buf[118])[0] = rslt.getString(106, 1);
               ((String[]) buf[119])[0] = rslt.getString(107, 4);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(108, 20);
               ((String[]) buf[122])[0] = rslt.getString(109, 6);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 6);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(22);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[37])[0] = rslt.getString(24, 10);
               ((String[]) buf[38])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 26);
               ((String[]) buf[41])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(28, 30);
               ((String[]) buf[44])[0] = rslt.getString(29, 4);
               ((String[]) buf[45])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(32,4);
               ((String[]) buf[50])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(34, 1);
               ((String[]) buf[53])[0] = rslt.getString(35, 1);
               ((String[]) buf[54])[0] = rslt.getString(36, 1);
               ((byte[]) buf[55])[0] = rslt.getByte(37);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(38,5);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(40,5);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(41,5);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(42,5);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[63])[0] = rslt.getShort(44);
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[65])[0] = rslt.getShort(46);
               ((short[]) buf[66])[0] = rslt.getShort(47);
               ((String[]) buf[67])[0] = rslt.getString(48, 8);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(49);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(51,4);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(52,4);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(53,4);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(54,4);
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(55);
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(56);
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDate(57);
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(58,2);
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[80])[0] = rslt.getShort(60);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(61,2);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(62,2);
               ((short[]) buf[83])[0] = rslt.getShort(63);
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(64,2);
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(65,2);
               ((java.util.Date[]) buf[86])[0] = rslt.getGXDate(66);
               ((short[]) buf[87])[0] = rslt.getShort(67);
               ((byte[]) buf[88])[0] = rslt.getByte(68);
               ((String[]) buf[89])[0] = rslt.getString(69, 1);
               ((short[]) buf[90])[0] = rslt.getShort(70);
               ((String[]) buf[91])[0] = rslt.getString(71, 1);
               ((byte[]) buf[92])[0] = rslt.getByte(72);
               ((String[]) buf[93])[0] = rslt.getString(73, 40);
               ((String[]) buf[94])[0] = rslt.getString(74, 16);
               ((String[]) buf[95])[0] = rslt.getVarchar(75);
               ((byte[]) buf[96])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(77,5);
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(78,3);
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(79,3);
               ((String[]) buf[100])[0] = rslt.getString(80, 1);
               ((String[]) buf[101])[0] = rslt.getString(81, 40);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(82, 6);
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(83,2);
               ((java.math.BigDecimal[]) buf[105])[0] = rslt.getBigDecimal(84,2);
               ((byte[]) buf[106])[0] = rslt.getByte(85);
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(86,4);
               ((String[]) buf[108])[0] = rslt.getString(87, 1);
               ((String[]) buf[109])[0] = rslt.getString(88, 40);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(89, 2);
               ((String[]) buf[112])[0] = rslt.getString(90, 2);
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(91,2);
               ((String[]) buf[114])[0] = rslt.getString(92, 30);
               ((String[]) buf[115])[0] = rslt.getString(93, 1);
               ((java.util.Date[]) buf[116])[0] = rslt.getGXDate(94);
               ((String[]) buf[117])[0] = rslt.getString(95, 1);
               ((java.util.Date[]) buf[118])[0] = rslt.getGXDate(96);
               ((String[]) buf[119])[0] = rslt.getString(97, 10);
               ((String[]) buf[120])[0] = rslt.getString(98, 1);
               ((String[]) buf[121])[0] = rslt.getString(99, 1);
               ((String[]) buf[122])[0] = rslt.getString(100, 26);
               ((String[]) buf[123])[0] = rslt.getString(101, 10);
               ((String[]) buf[124])[0] = rslt.getString(102, 3);
               ((String[]) buf[125])[0] = rslt.getString(103, 20);
               ((String[]) buf[126])[0] = rslt.getString(104, 3);
               ((String[]) buf[127])[0] = rslt.getString(105, 3);
               ((String[]) buf[128])[0] = rslt.getString(106, 40);
               ((String[]) buf[129])[0] = rslt.getString(107, 1);
               ((String[]) buf[130])[0] = rslt.getString(108, 1);
               ((short[]) buf[131])[0] = rslt.getShort(109);
               ((String[]) buf[132])[0] = rslt.getString(110, 40);
               ((String[]) buf[133])[0] = rslt.getString(111, 50);
               ((String[]) buf[134])[0] = rslt.getVarchar(112);
               ((String[]) buf[135])[0] = rslt.getString(113, 1);
               ((String[]) buf[136])[0] = rslt.getString(114, 60);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(115, 1);
               ((long[]) buf[139])[0] = rslt.getLong(116);
               ((String[]) buf[140])[0] = rslt.getString(117, 1);
               ((String[]) buf[141])[0] = rslt.getString(118, 4);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(119, 20);
               ((String[]) buf[144])[0] = rslt.getString(120, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 33 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 6);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[35])[0] = rslt.getString(23, 10);
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((String[]) buf[37])[0] = rslt.getString(25, 30);
               ((String[]) buf[38])[0] = rslt.getString(26, 4);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[40])[0] = rslt.getString(28, 1);
               ((String[]) buf[41])[0] = rslt.getString(29, 1);
               ((String[]) buf[42])[0] = rslt.getString(30, 1);
               ((byte[]) buf[43])[0] = rslt.getByte(31);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(36,2);
               ((short[]) buf[49])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((short[]) buf[52])[0] = rslt.getShort(40);
               ((short[]) buf[53])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(43,4);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,4);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,4);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,4);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(47);
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(48);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(51,2);
               ((short[]) buf[64])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[67])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(57,2);
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(58);
               ((short[]) buf[71])[0] = rslt.getShort(59);
               ((byte[]) buf[72])[0] = rslt.getByte(60);
               ((String[]) buf[73])[0] = rslt.getString(61, 1);
               ((short[]) buf[74])[0] = rslt.getShort(62);
               ((String[]) buf[75])[0] = rslt.getString(63, 1);
               ((byte[]) buf[76])[0] = rslt.getByte(64);
               ((String[]) buf[77])[0] = rslt.getString(65, 40);
               ((String[]) buf[78])[0] = rslt.getString(66, 16);
               ((String[]) buf[79])[0] = rslt.getVarchar(67);
               ((byte[]) buf[80])[0] = rslt.getByte(68);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(69,5);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(70,3);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(71,3);
               ((String[]) buf[84])[0] = rslt.getString(72, 1);
               ((String[]) buf[85])[0] = rslt.getString(73, 6);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(74,2);
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(75,2);
               ((byte[]) buf[88])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(77,4);
               ((String[]) buf[90])[0] = rslt.getString(78, 1);
               ((String[]) buf[91])[0] = rslt.getString(79, 2);
               ((String[]) buf[92])[0] = rslt.getString(80, 2);
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(81,2);
               ((String[]) buf[94])[0] = rslt.getString(82, 30);
               ((String[]) buf[95])[0] = rslt.getString(83, 1);
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDate(84);
               ((String[]) buf[97])[0] = rslt.getString(85, 1);
               ((java.util.Date[]) buf[98])[0] = rslt.getGXDate(86);
               ((String[]) buf[99])[0] = rslt.getString(87, 10);
               ((String[]) buf[100])[0] = rslt.getString(88, 1);
               ((String[]) buf[101])[0] = rslt.getString(89, 1);
               ((String[]) buf[102])[0] = rslt.getString(90, 26);
               ((String[]) buf[103])[0] = rslt.getString(91, 10);
               ((String[]) buf[104])[0] = rslt.getString(92, 3);
               ((String[]) buf[105])[0] = rslt.getString(93, 20);
               ((String[]) buf[106])[0] = rslt.getString(94, 3);
               ((String[]) buf[107])[0] = rslt.getString(95, 3);
               ((String[]) buf[108])[0] = rslt.getString(96, 40);
               ((String[]) buf[109])[0] = rslt.getString(97, 1);
               ((String[]) buf[110])[0] = rslt.getString(98, 1);
               ((short[]) buf[111])[0] = rslt.getShort(99);
               ((String[]) buf[112])[0] = rslt.getString(100, 40);
               ((String[]) buf[113])[0] = rslt.getString(101, 50);
               ((String[]) buf[114])[0] = rslt.getVarchar(102);
               ((String[]) buf[115])[0] = rslt.getString(103, 1);
               ((String[]) buf[116])[0] = rslt.getString(104, 1);
               ((long[]) buf[117])[0] = rslt.getLong(105);
               ((String[]) buf[118])[0] = rslt.getString(106, 1);
               ((String[]) buf[119])[0] = rslt.getString(107, 4);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(108, 20);
               ((String[]) buf[122])[0] = rslt.getString(109, 6);
               return;
            case 34 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 6);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(21);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(22,2);
               ((String[]) buf[35])[0] = rslt.getString(23, 10);
               ((String[]) buf[36])[0] = rslt.getString(24, 26);
               ((String[]) buf[37])[0] = rslt.getString(25, 30);
               ((String[]) buf[38])[0] = rslt.getString(26, 4);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(27,4);
               ((String[]) buf[40])[0] = rslt.getString(28, 1);
               ((String[]) buf[41])[0] = rslt.getString(29, 1);
               ((String[]) buf[42])[0] = rslt.getString(30, 1);
               ((byte[]) buf[43])[0] = rslt.getByte(31);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(32,5);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(33,5);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(34,5);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(35,5);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(36,2);
               ((short[]) buf[49])[0] = rslt.getShort(37);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[51])[0] = rslt.getShort(39);
               ((short[]) buf[52])[0] = rslt.getShort(40);
               ((short[]) buf[53])[0] = rslt.getShort(41);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(42,2);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(43,4);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(44,4);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(45,4);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(46,4);
               ((java.util.Date[]) buf[59])[0] = rslt.getGXDate(47);
               ((java.util.Date[]) buf[60])[0] = rslt.getGXDate(48);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(49);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(51,2);
               ((short[]) buf[64])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(53,2);
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(54,2);
               ((short[]) buf[67])[0] = rslt.getShort(55);
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(56,2);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(57,2);
               ((java.util.Date[]) buf[70])[0] = rslt.getGXDate(58);
               ((short[]) buf[71])[0] = rslt.getShort(59);
               ((byte[]) buf[72])[0] = rslt.getByte(60);
               ((String[]) buf[73])[0] = rslt.getString(61, 1);
               ((short[]) buf[74])[0] = rslt.getShort(62);
               ((String[]) buf[75])[0] = rslt.getString(63, 1);
               ((byte[]) buf[76])[0] = rslt.getByte(64);
               ((String[]) buf[77])[0] = rslt.getString(65, 40);
               ((String[]) buf[78])[0] = rslt.getString(66, 16);
               ((String[]) buf[79])[0] = rslt.getVarchar(67);
               ((byte[]) buf[80])[0] = rslt.getByte(68);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(69,5);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(70,3);
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(71,3);
               ((String[]) buf[84])[0] = rslt.getString(72, 1);
               ((String[]) buf[85])[0] = rslt.getString(73, 6);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(74,2);
               ((java.math.BigDecimal[]) buf[87])[0] = rslt.getBigDecimal(75,2);
               ((byte[]) buf[88])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[89])[0] = rslt.getBigDecimal(77,4);
               ((String[]) buf[90])[0] = rslt.getString(78, 1);
               ((String[]) buf[91])[0] = rslt.getString(79, 2);
               ((String[]) buf[92])[0] = rslt.getString(80, 2);
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(81,2);
               ((String[]) buf[94])[0] = rslt.getString(82, 30);
               ((String[]) buf[95])[0] = rslt.getString(83, 1);
               ((java.util.Date[]) buf[96])[0] = rslt.getGXDate(84);
               ((String[]) buf[97])[0] = rslt.getString(85, 1);
               ((java.util.Date[]) buf[98])[0] = rslt.getGXDate(86);
               ((String[]) buf[99])[0] = rslt.getString(87, 10);
               ((String[]) buf[100])[0] = rslt.getString(88, 1);
               ((String[]) buf[101])[0] = rslt.getString(89, 1);
               ((String[]) buf[102])[0] = rslt.getString(90, 26);
               ((String[]) buf[103])[0] = rslt.getString(91, 10);
               ((String[]) buf[104])[0] = rslt.getString(92, 3);
               ((String[]) buf[105])[0] = rslt.getString(93, 20);
               ((String[]) buf[106])[0] = rslt.getString(94, 3);
               ((String[]) buf[107])[0] = rslt.getString(95, 3);
               ((String[]) buf[108])[0] = rslt.getString(96, 40);
               ((String[]) buf[109])[0] = rslt.getString(97, 1);
               ((String[]) buf[110])[0] = rslt.getString(98, 1);
               ((short[]) buf[111])[0] = rslt.getShort(99);
               ((String[]) buf[112])[0] = rslt.getString(100, 40);
               ((String[]) buf[113])[0] = rslt.getString(101, 50);
               ((String[]) buf[114])[0] = rslt.getVarchar(102);
               ((String[]) buf[115])[0] = rslt.getString(103, 1);
               ((String[]) buf[116])[0] = rslt.getString(104, 1);
               ((long[]) buf[117])[0] = rslt.getLong(105);
               ((String[]) buf[118])[0] = rslt.getString(106, 1);
               ((String[]) buf[119])[0] = rslt.getString(107, 4);
               ((boolean[]) buf[120])[0] = rslt.wasNull();
               ((String[]) buf[121])[0] = rslt.getString(108, 20);
               ((String[]) buf[122])[0] = rslt.getString(109, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 113 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 114 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 115 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 116 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 117 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 118 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 119 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
      }
      getresults120( cursor, rslt, buf) ;
   }

   public void getresults120( int cursor ,
                              IFieldGetter rslt ,
                              Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((byte[]) buf[19])[0] = rslt.getByte(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((long[]) buf[32])[0] = rslt.getLong(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 6);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(22);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[37])[0] = rslt.getString(24, 10);
               ((String[]) buf[38])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(26, 26);
               ((String[]) buf[41])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(28, 30);
               ((String[]) buf[44])[0] = rslt.getString(29, 4);
               ((String[]) buf[45])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(32,4);
               ((String[]) buf[50])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(34, 1);
               ((String[]) buf[53])[0] = rslt.getString(35, 1);
               ((String[]) buf[54])[0] = rslt.getString(36, 1);
               ((byte[]) buf[55])[0] = rslt.getByte(37);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(38,5);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(40,5);
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(41,5);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(42,5);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(43,2);
               ((short[]) buf[63])[0] = rslt.getShort(44);
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[65])[0] = rslt.getShort(46);
               ((short[]) buf[66])[0] = rslt.getShort(47);
               ((String[]) buf[67])[0] = rslt.getString(48, 8);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(49);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(50,2);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(51,4);
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(52,4);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(53,4);
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(54,4);
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(55);
               ((java.util.Date[]) buf[76])[0] = rslt.getGXDate(56);
               ((java.util.Date[]) buf[77])[0] = rslt.getGXDate(57);
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(58,2);
               ((java.math.BigDecimal[]) buf[79])[0] = rslt.getBigDecimal(59,2);
               ((short[]) buf[80])[0] = rslt.getShort(60);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(61,2);
               ((java.math.BigDecimal[]) buf[82])[0] = rslt.getBigDecimal(62,2);
               ((short[]) buf[83])[0] = rslt.getShort(63);
               ((java.math.BigDecimal[]) buf[84])[0] = rslt.getBigDecimal(64,2);
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(65,2);
               ((java.util.Date[]) buf[86])[0] = rslt.getGXDate(66);
               ((short[]) buf[87])[0] = rslt.getShort(67);
               ((byte[]) buf[88])[0] = rslt.getByte(68);
               ((String[]) buf[89])[0] = rslt.getString(69, 1);
               ((short[]) buf[90])[0] = rslt.getShort(70);
               ((String[]) buf[91])[0] = rslt.getString(71, 1);
               ((byte[]) buf[92])[0] = rslt.getByte(72);
               ((String[]) buf[93])[0] = rslt.getString(73, 40);
               ((String[]) buf[94])[0] = rslt.getString(74, 16);
               ((String[]) buf[95])[0] = rslt.getVarchar(75);
               ((byte[]) buf[96])[0] = rslt.getByte(76);
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(77,5);
               ((java.math.BigDecimal[]) buf[98])[0] = rslt.getBigDecimal(78,3);
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(79,3);
               ((String[]) buf[100])[0] = rslt.getString(80, 1);
               ((String[]) buf[101])[0] = rslt.getString(81, 40);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(82, 6);
               ((java.math.BigDecimal[]) buf[104])[0] = rslt.getBigDecimal(83,2);
               ((java.math.BigDecimal[]) buf[105])[0] = rslt.getBigDecimal(84,2);
               ((byte[]) buf[106])[0] = rslt.getByte(85);
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(86,4);
               ((String[]) buf[108])[0] = rslt.getString(87, 1);
               ((String[]) buf[109])[0] = rslt.getString(88, 40);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(89, 2);
               ((String[]) buf[112])[0] = rslt.getString(90, 2);
               ((java.math.BigDecimal[]) buf[113])[0] = rslt.getBigDecimal(91,2);
               ((String[]) buf[114])[0] = rslt.getString(92, 30);
               ((String[]) buf[115])[0] = rslt.getString(93, 1);
               ((java.util.Date[]) buf[116])[0] = rslt.getGXDate(94);
               ((String[]) buf[117])[0] = rslt.getString(95, 1);
               ((java.util.Date[]) buf[118])[0] = rslt.getGXDate(96);
               ((String[]) buf[119])[0] = rslt.getString(97, 10);
               ((String[]) buf[120])[0] = rslt.getString(98, 1);
               ((String[]) buf[121])[0] = rslt.getString(99, 1);
               ((String[]) buf[122])[0] = rslt.getString(100, 26);
               ((String[]) buf[123])[0] = rslt.getString(101, 10);
               ((String[]) buf[124])[0] = rslt.getString(102, 3);
               ((String[]) buf[125])[0] = rslt.getString(103, 20);
               ((String[]) buf[126])[0] = rslt.getString(104, 3);
               ((String[]) buf[127])[0] = rslt.getString(105, 3);
               ((String[]) buf[128])[0] = rslt.getString(106, 40);
               ((String[]) buf[129])[0] = rslt.getString(107, 1);
               ((String[]) buf[130])[0] = rslt.getString(108, 1);
               ((short[]) buf[131])[0] = rslt.getShort(109);
               ((String[]) buf[132])[0] = rslt.getString(110, 40);
               ((String[]) buf[133])[0] = rslt.getString(111, 50);
               ((String[]) buf[134])[0] = rslt.getVarchar(112);
               ((String[]) buf[135])[0] = rslt.getString(113, 1);
               ((String[]) buf[136])[0] = rslt.getString(114, 60);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               ((String[]) buf[138])[0] = rslt.getString(115, 1);
               ((long[]) buf[139])[0] = rslt.getLong(116);
               ((String[]) buf[140])[0] = rslt.getString(117, 1);
               ((String[]) buf[141])[0] = rslt.getString(118, 4);
               ((boolean[]) buf[142])[0] = rslt.wasNull();
               ((String[]) buf[143])[0] = rslt.getString(119, 20);
               ((String[]) buf[144])[0] = rslt.getString(120, 6);
               return;
            case 121 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 122 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 123 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               return;
            case 124 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 125 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
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
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setDate(2, (java.util.Date)parms[2]);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 10);
               stmt.setString(5, (String)parms[5], 26);
               stmt.setString(6, (String)parms[6], 30);
               stmt.setString(7, (String)parms[7], 4);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 4);
               stmt.setString(9, (String)parms[9], 1);
               stmt.setString(10, (String)parms[10], 1);
               stmt.setString(11, (String)parms[11], 1);
               stmt.setByte(12, ((Number) parms[12]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 5);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[16], 5);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[19], 2);
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setShort(21, ((Number) parms[21]).shortValue());
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 4);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 4);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 4);
               stmt.setDate(28, (java.util.Date)parms[28]);
               stmt.setDate(29, (java.util.Date)parms[29]);
               stmt.setDate(30, (java.util.Date)parms[30]);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setShort(33, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(36, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(38, (java.math.BigDecimal)parms[38], 2);
               stmt.setDate(39, (java.util.Date)parms[39]);
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setByte(41, ((Number) parms[41]).byteValue());
               stmt.setString(42, (String)parms[42], 1);
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setString(44, (String)parms[44], 1);
               stmt.setByte(45, ((Number) parms[45]).byteValue());
               stmt.setString(46, (String)parms[46], 40);
               stmt.setString(47, (String)parms[47], 16);
               stmt.setVarchar(48, (String)parms[48], 1024, false);
               stmt.setByte(49, ((Number) parms[49]).byteValue());
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[50], 5);
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[51], 3);
               stmt.setBigDecimal(52, (java.math.BigDecimal)parms[52], 3);
               stmt.setString(53, (String)parms[53], 1);
               stmt.setString(54, (String)parms[54], 6);
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[55], 2);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[56], 2);
               stmt.setByte(57, ((Number) parms[57]).byteValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[58], 4);
               stmt.setString(59, (String)parms[59], 1);
               stmt.setString(60, (String)parms[60], 2);
               stmt.setString(61, (String)parms[61], 2);
               stmt.setBigDecimal(62, (java.math.BigDecimal)parms[62], 2);
               stmt.setString(63, (String)parms[63], 30);
               stmt.setString(64, (String)parms[64], 1);
               stmt.setDate(65, (java.util.Date)parms[65]);
               stmt.setString(66, (String)parms[66], 1);
               stmt.setDate(67, (java.util.Date)parms[67]);
               stmt.setString(68, (String)parms[68], 10);
               stmt.setString(69, (String)parms[69], 1);
               stmt.setString(70, (String)parms[70], 1);
               stmt.setString(71, (String)parms[71], 26);
               stmt.setString(72, (String)parms[72], 10);
               stmt.setString(73, (String)parms[73], 3);
               stmt.setString(74, (String)parms[74], 20);
               stmt.setString(75, (String)parms[75], 3);
               stmt.setString(76, (String)parms[76], 3);
               stmt.setString(77, (String)parms[77], 40);
               stmt.setString(78, (String)parms[78], 1);
               stmt.setString(79, (String)parms[79], 1);
               stmt.setShort(80, ((Number) parms[80]).shortValue());
               stmt.setString(81, (String)parms[81], 40);
               stmt.setString(82, (String)parms[82], 50);
               stmt.setVarchar(83, (String)parms[83], 200, false);
               stmt.setString(84, (String)parms[84], 1);
               stmt.setString(85, (String)parms[85], 1);
               stmt.setLong(86, ((Number) parms[86]).longValue());
               stmt.setString(87, (String)parms[87], 1);
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(88, (String)parms[89], 4);
               }
               stmt.setString(89, (String)parms[90], 20);
               stmt.setString(90, (String)parms[91], 6);
               stmt.setByte(91, ((Number) parms[92]).byteValue());
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(92, ((Number) parms[94]).shortValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(93, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.DATE );
               }
               else
               {
                  stmt.setDate(94, (java.util.Date)parms[98]);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(95, (String)parms[100], 200);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(96, (String)parms[102], 200);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(97, (String)parms[104], 1);
               }
               stmt.setString(98, (String)parms[105], 3);
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 99 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(99, ((Number) parms[107]).byteValue());
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(100, ((Number) parms[109]).byteValue());
               }
               stmt.setInt(101, ((Number) parms[110]).intValue());
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 102 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(102, ((Number) parms[112]).byteValue());
               }
               stmt.setByte(103, ((Number) parms[113]).byteValue());
               stmt.setByte(104, ((Number) parms[114]).byteValue());
               stmt.setByte(105, ((Number) parms[115]).byteValue());
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(106, ((Number) parms[117]).shortValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(107, ((Number) parms[119]).byteValue());
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 108 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(108, ((Number) parms[121]).intValue());
               }
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(109, ((Number) parms[123]).shortValue());
               }
               return;
            case 36 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 26);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 4);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 2);
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[25], 4);
               stmt.setDate(27, (java.util.Date)parms[26]);
               stmt.setDate(28, (java.util.Date)parms[27]);
               stmt.setDate(29, (java.util.Date)parms[28]);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setShort(32, ((Number) parms[31]).shortValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setShort(35, ((Number) parms[34]).shortValue());
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[36], 2);
               stmt.setDate(38, (java.util.Date)parms[37]);
               stmt.setShort(39, ((Number) parms[38]).shortValue());
               stmt.setByte(40, ((Number) parms[39]).byteValue());
               stmt.setString(41, (String)parms[40], 1);
               stmt.setShort(42, ((Number) parms[41]).shortValue());
               stmt.setString(43, (String)parms[42], 1);
               stmt.setByte(44, ((Number) parms[43]).byteValue());
               stmt.setString(45, (String)parms[44], 40);
               stmt.setString(46, (String)parms[45], 16);
               stmt.setVarchar(47, (String)parms[46], 1024, false);
               stmt.setByte(48, ((Number) parms[47]).byteValue());
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[48], 5);
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[49], 3);
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[50], 3);
               stmt.setString(52, (String)parms[51], 1);
               stmt.setString(53, (String)parms[52], 6);
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[53], 2);
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[54], 2);
               stmt.setByte(56, ((Number) parms[55]).byteValue());
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[56], 4);
               stmt.setString(58, (String)parms[57], 1);
               stmt.setString(59, (String)parms[58], 2);
               stmt.setString(60, (String)parms[59], 2);
               stmt.setBigDecimal(61, (java.math.BigDecimal)parms[60], 2);
               stmt.setString(62, (String)parms[61], 30);
               stmt.setString(63, (String)parms[62], 1);
               stmt.setDate(64, (java.util.Date)parms[63]);
               stmt.setString(65, (String)parms[64], 1);
               stmt.setDate(66, (java.util.Date)parms[65]);
               stmt.setString(67, (String)parms[66], 10);
               stmt.setString(68, (String)parms[67], 1);
               stmt.setString(69, (String)parms[68], 1);
               stmt.setString(70, (String)parms[69], 26);
               stmt.setString(71, (String)parms[70], 10);
               stmt.setString(72, (String)parms[71], 3);
               stmt.setString(73, (String)parms[72], 20);
               stmt.setString(74, (String)parms[73], 3);
               stmt.setString(75, (String)parms[74], 3);
               stmt.setString(76, (String)parms[75], 40);
               stmt.setString(77, (String)parms[76], 1);
               stmt.setString(78, (String)parms[77], 1);
               stmt.setShort(79, ((Number) parms[78]).shortValue());
               stmt.setString(80, (String)parms[79], 40);
               stmt.setString(81, (String)parms[80], 50);
               stmt.setVarchar(82, (String)parms[81], 200, false);
               stmt.setString(83, (String)parms[82], 1);
               stmt.setString(84, (String)parms[83], 1);
               stmt.setLong(85, ((Number) parms[84]).longValue());
               stmt.setString(86, (String)parms[85], 1);
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 87 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(87, (String)parms[87], 4);
               }
               stmt.setString(88, (String)parms[88], 20);
               stmt.setString(89, (String)parms[89], 6);
               stmt.setByte(90, ((Number) parms[90]).byteValue());
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 91 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(91, ((Number) parms[92]).shortValue());
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(92, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.DATE );
               }
               else
               {
                  stmt.setDate(93, (java.util.Date)parms[96]);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(94, (String)parms[98], 200);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(95, (String)parms[100], 200);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 96 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(96, (String)parms[102], 1);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 97 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(97, ((Number) parms[104]).byteValue());
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 98 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(98, ((Number) parms[106]).byteValue());
               }
               stmt.setInt(99, ((Number) parms[107]).intValue());
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 100 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(100, ((Number) parms[109]).byteValue());
               }
               stmt.setByte(101, ((Number) parms[110]).byteValue());
               stmt.setByte(102, ((Number) parms[111]).byteValue());
               stmt.setByte(103, ((Number) parms[112]).byteValue());
               if ( ((Boolean) parms[113]).booleanValue() )
               {
                  stmt.setNull( 104 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(104, ((Number) parms[114]).shortValue());
               }
               if ( ((Boolean) parms[115]).booleanValue() )
               {
                  stmt.setNull( 105 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(105, ((Number) parms[116]).byteValue());
               }
               if ( ((Boolean) parms[117]).booleanValue() )
               {
                  stmt.setNull( 106 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(106, ((Number) parms[118]).intValue());
               }
               if ( ((Boolean) parms[119]).booleanValue() )
               {
                  stmt.setNull( 107 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(107, ((Number) parms[120]).shortValue());
               }
               stmt.setString(108, (String)parms[121], 3);
               if ( ((Boolean) parms[122]).booleanValue() )
               {
                  stmt.setNull( 109 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(109, (String)parms[123], 6);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 46 :
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
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 102 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 103 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 104 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 105 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 106 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 107 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 108 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 109 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 110 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 111 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 112 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 113 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 114 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 115 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 116 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 117 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 118 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 119 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters120( cursor, stmt, parms) ;
   }

   public void setparameters120( int cursor ,
                                 IFieldSetter stmt ,
                                 Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 120 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               return;
            case 121 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 122 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 123 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 124 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 125 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
   }

}

