package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class conproduc_bc extends GXWebPanel implements IGxSilentTrn
{
   public conproduc_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public conproduc_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( conproduc_bc.class ));
   }

   public conproduc_bc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1UO1902( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1UO1902( ) ;
      standaloneModal( ) ;
      addRow1UO1902( ) ;
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
         e111UO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z14297CP_ID = A14297CP_ID ;
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

   public void confirm_1UO0( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UO1902( ) ;
         }
         else
         {
            checkExtendedTable1UO1902( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1UO1902( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121UO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      conproduc_bc.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      conproduc_bc.this.AV12EmprCod = GXv_char2[0] ;
      conproduc_bc.this.AV13EmprNom = GXv_char3[0] ;
      conproduc_bc.this.AV14UsurCod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV7WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV7WWPContext = GXv_SdtWWPContext5[0] ;
      AV8TrnContext.fromxml(AV9WebSession.getValue("TrnContext"), null, null);
   }

   public void e111UO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1UO1902( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z14328CP_EMPRCOD = A14328CP_EMPRCOD ;
         Z14326CP_CLICOD = A14326CP_CLICOD ;
         Z14327CP_CLINOM = A14327CP_CLINOM ;
         Z14301CP_BARCOD = A14301CP_BARCOD ;
         Z14302CP_BARCODR = A14302CP_BARCODR ;
         Z14303CP_BARCODP = A14303CP_BARCODP ;
         Z14304CP_BARFECF = A14304CP_BARFECF ;
         Z14305CP_BARNUMC = A14305CP_BARNUMC ;
         Z14306CP_BARPLF = A14306CP_BARPLF ;
         Z14307CP_BARSIT = A14307CP_BARSIT ;
         Z14309CP_BARFECC = A14309CP_BARFECC ;
         Z14310CP_BARFECS = A14310CP_BARFECS ;
         Z14308CP_BARFECG = A14308CP_BARFECG ;
         Z14311CP_BARSER = A14311CP_BARSER ;
         Z14312CP_BARSERD = A14312CP_BARSERD ;
         Z14331CP_BARCOLO = A14331CP_BARCOLO ;
         Z14332CP_BARCOLU = A14332CP_BARCOLU ;
         Z14315CP_BARNOMC = A14315CP_BARNOMC ;
         Z14316CP_BARTIPA = A14316CP_BARTIPA ;
         Z14343CP_TARTDSC = A14343CP_TARTDSC ;
         Z14317CP_BARGIRA = A14317CP_BARGIRA ;
         Z14318CP_BARACAA = A14318CP_BARACAA ;
         Z14319CP_BARAGRE = A14319CP_BARAGRE ;
         Z14320CP_BAREXT = A14320CP_BAREXT ;
         Z14321CP_DISDES = A14321CP_DISDES ;
         Z14322CP_DISCOD = A14322CP_DISCOD ;
         Z14323CP_BARPROP = A14323CP_BARPROP ;
         Z14334CP_DSC_BAR = A14334CP_DSC_BAR ;
         Z14324CP_BARDISN = A14324CP_BARDISN ;
         Z14336CP_BARKGM = A14336CP_BARKGM ;
         Z14337CP_BARMTR = A14337CP_BARMTR ;
         Z14338CP_BARPIE = A14338CP_BARPIE ;
         Z14339CP_BARALBK = A14339CP_BARALBK ;
         Z14340CP_BARALBM = A14340CP_BARALBM ;
         Z14325CP_BARENCC = A14325CP_BARENCC ;
         Z14341CP_DISUSRC = A14341CP_DISUSRC ;
         Z14351CP_BARMAQC = A14351CP_BARMAQC ;
         Z14352CP_BARESTR = A14352CP_BARESTR ;
      }
      if ( GX_JID == -1 )
      {
         Z14297CP_ID = A14297CP_ID ;
         Z14328CP_EMPRCOD = A14328CP_EMPRCOD ;
         Z14326CP_CLICOD = A14326CP_CLICOD ;
         Z14327CP_CLINOM = A14327CP_CLINOM ;
         Z14301CP_BARCOD = A14301CP_BARCOD ;
         Z14302CP_BARCODR = A14302CP_BARCODR ;
         Z14303CP_BARCODP = A14303CP_BARCODP ;
         Z14304CP_BARFECF = A14304CP_BARFECF ;
         Z14305CP_BARNUMC = A14305CP_BARNUMC ;
         Z14306CP_BARPLF = A14306CP_BARPLF ;
         Z14307CP_BARSIT = A14307CP_BARSIT ;
         Z14309CP_BARFECC = A14309CP_BARFECC ;
         Z14310CP_BARFECS = A14310CP_BARFECS ;
         Z14308CP_BARFECG = A14308CP_BARFECG ;
         Z14311CP_BARSER = A14311CP_BARSER ;
         Z14312CP_BARSERD = A14312CP_BARSERD ;
         Z14331CP_BARCOLO = A14331CP_BARCOLO ;
         Z14332CP_BARCOLU = A14332CP_BARCOLU ;
         Z14315CP_BARNOMC = A14315CP_BARNOMC ;
         Z14316CP_BARTIPA = A14316CP_BARTIPA ;
         Z14343CP_TARTDSC = A14343CP_TARTDSC ;
         Z14317CP_BARGIRA = A14317CP_BARGIRA ;
         Z14318CP_BARACAA = A14318CP_BARACAA ;
         Z14319CP_BARAGRE = A14319CP_BARAGRE ;
         Z14320CP_BAREXT = A14320CP_BAREXT ;
         Z14321CP_DISDES = A14321CP_DISDES ;
         Z14322CP_DISCOD = A14322CP_DISCOD ;
         Z14323CP_BARPROP = A14323CP_BARPROP ;
         Z14334CP_DSC_BAR = A14334CP_DSC_BAR ;
         Z14324CP_BARDISN = A14324CP_BARDISN ;
         Z14336CP_BARKGM = A14336CP_BARKGM ;
         Z14337CP_BARMTR = A14337CP_BARMTR ;
         Z14338CP_BARPIE = A14338CP_BARPIE ;
         Z14339CP_BARALBK = A14339CP_BARALBK ;
         Z14340CP_BARALBM = A14340CP_BARALBM ;
         Z14325CP_BARENCC = A14325CP_BARENCC ;
         Z14341CP_DISUSRC = A14341CP_DISUSRC ;
         Z14351CP_BARMAQC = A14351CP_BARMAQC ;
         Z14352CP_BARESTR = A14352CP_BARESTR ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1UO1902( )
   {
      /* Using cursor BC01UO4 */
      pr_default.execute(2, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14328CP_EMPRCOD = BC01UO4_A14328CP_EMPRCOD[0] ;
         A14326CP_CLICOD = BC01UO4_A14326CP_CLICOD[0] ;
         A14327CP_CLINOM = BC01UO4_A14327CP_CLINOM[0] ;
         A14301CP_BARCOD = BC01UO4_A14301CP_BARCOD[0] ;
         A14302CP_BARCODR = BC01UO4_A14302CP_BARCODR[0] ;
         A14303CP_BARCODP = BC01UO4_A14303CP_BARCODP[0] ;
         A14304CP_BARFECF = BC01UO4_A14304CP_BARFECF[0] ;
         A14305CP_BARNUMC = BC01UO4_A14305CP_BARNUMC[0] ;
         A14306CP_BARPLF = BC01UO4_A14306CP_BARPLF[0] ;
         A14307CP_BARSIT = BC01UO4_A14307CP_BARSIT[0] ;
         A14309CP_BARFECC = BC01UO4_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = BC01UO4_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = BC01UO4_A14308CP_BARFECG[0] ;
         A14311CP_BARSER = BC01UO4_A14311CP_BARSER[0] ;
         A14312CP_BARSERD = BC01UO4_A14312CP_BARSERD[0] ;
         A14331CP_BARCOLO = BC01UO4_A14331CP_BARCOLO[0] ;
         A14332CP_BARCOLU = BC01UO4_A14332CP_BARCOLU[0] ;
         A14315CP_BARNOMC = BC01UO4_A14315CP_BARNOMC[0] ;
         A14316CP_BARTIPA = BC01UO4_A14316CP_BARTIPA[0] ;
         A14343CP_TARTDSC = BC01UO4_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = BC01UO4_A14317CP_BARGIRA[0] ;
         A14318CP_BARACAA = BC01UO4_A14318CP_BARACAA[0] ;
         A14319CP_BARAGRE = BC01UO4_A14319CP_BARAGRE[0] ;
         A14320CP_BAREXT = BC01UO4_A14320CP_BAREXT[0] ;
         A14321CP_DISDES = BC01UO4_A14321CP_DISDES[0] ;
         A14322CP_DISCOD = BC01UO4_A14322CP_DISCOD[0] ;
         A14323CP_BARPROP = BC01UO4_A14323CP_BARPROP[0] ;
         A14334CP_DSC_BAR = BC01UO4_A14334CP_DSC_BAR[0] ;
         A14324CP_BARDISN = BC01UO4_A14324CP_BARDISN[0] ;
         A14336CP_BARKGM = BC01UO4_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = BC01UO4_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = BC01UO4_A14338CP_BARPIE[0] ;
         A14339CP_BARALBK = BC01UO4_A14339CP_BARALBK[0] ;
         A14340CP_BARALBM = BC01UO4_A14340CP_BARALBM[0] ;
         A14325CP_BARENCC = BC01UO4_A14325CP_BARENCC[0] ;
         A14341CP_DISUSRC = BC01UO4_A14341CP_DISUSRC[0] ;
         A14351CP_BARMAQC = BC01UO4_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = BC01UO4_A14352CP_BARESTR[0] ;
         zm1UO1902( -1) ;
      }
      pr_default.close(2);
      onLoadActions1UO1902( ) ;
   }

   public void onLoadActions1UO1902( )
   {
   }

   public void checkExtendedTable1UO1902( )
   {
      nIsDirty_1902 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1UO1902( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1UO1902( )
   {
      /* Using cursor BC01UO5 */
      pr_default.execute(3, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1902 = (short)(1) ;
      }
      else
      {
         RcdFound1902 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01UO6 */
      pr_default.execute(4, new Object[] {Long.valueOf(A14297CP_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1UO1902( 1) ;
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = BC01UO6_A14297CP_ID[0] ;
         A14328CP_EMPRCOD = BC01UO6_A14328CP_EMPRCOD[0] ;
         A14326CP_CLICOD = BC01UO6_A14326CP_CLICOD[0] ;
         A14327CP_CLINOM = BC01UO6_A14327CP_CLINOM[0] ;
         A14301CP_BARCOD = BC01UO6_A14301CP_BARCOD[0] ;
         A14302CP_BARCODR = BC01UO6_A14302CP_BARCODR[0] ;
         A14303CP_BARCODP = BC01UO6_A14303CP_BARCODP[0] ;
         A14304CP_BARFECF = BC01UO6_A14304CP_BARFECF[0] ;
         A14305CP_BARNUMC = BC01UO6_A14305CP_BARNUMC[0] ;
         A14306CP_BARPLF = BC01UO6_A14306CP_BARPLF[0] ;
         A14307CP_BARSIT = BC01UO6_A14307CP_BARSIT[0] ;
         A14309CP_BARFECC = BC01UO6_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = BC01UO6_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = BC01UO6_A14308CP_BARFECG[0] ;
         A14311CP_BARSER = BC01UO6_A14311CP_BARSER[0] ;
         A14312CP_BARSERD = BC01UO6_A14312CP_BARSERD[0] ;
         A14331CP_BARCOLO = BC01UO6_A14331CP_BARCOLO[0] ;
         A14332CP_BARCOLU = BC01UO6_A14332CP_BARCOLU[0] ;
         A14315CP_BARNOMC = BC01UO6_A14315CP_BARNOMC[0] ;
         A14316CP_BARTIPA = BC01UO6_A14316CP_BARTIPA[0] ;
         A14343CP_TARTDSC = BC01UO6_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = BC01UO6_A14317CP_BARGIRA[0] ;
         A14318CP_BARACAA = BC01UO6_A14318CP_BARACAA[0] ;
         A14319CP_BARAGRE = BC01UO6_A14319CP_BARAGRE[0] ;
         A14320CP_BAREXT = BC01UO6_A14320CP_BAREXT[0] ;
         A14321CP_DISDES = BC01UO6_A14321CP_DISDES[0] ;
         A14322CP_DISCOD = BC01UO6_A14322CP_DISCOD[0] ;
         A14323CP_BARPROP = BC01UO6_A14323CP_BARPROP[0] ;
         A14334CP_DSC_BAR = BC01UO6_A14334CP_DSC_BAR[0] ;
         A14324CP_BARDISN = BC01UO6_A14324CP_BARDISN[0] ;
         A14336CP_BARKGM = BC01UO6_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = BC01UO6_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = BC01UO6_A14338CP_BARPIE[0] ;
         A14339CP_BARALBK = BC01UO6_A14339CP_BARALBK[0] ;
         A14340CP_BARALBM = BC01UO6_A14340CP_BARALBM[0] ;
         A14325CP_BARENCC = BC01UO6_A14325CP_BARENCC[0] ;
         A14341CP_DISUSRC = BC01UO6_A14341CP_DISUSRC[0] ;
         A14351CP_BARMAQC = BC01UO6_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = BC01UO6_A14352CP_BARESTR[0] ;
         Z14297CP_ID = A14297CP_ID ;
         sMode1902 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1UO1902( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1902 = (short)(0) ;
            initializeNonKey1UO1902( ) ;
         }
         Gx_mode = sMode1902 ;
      }
      else
      {
         RcdFound1902 = (short)(0) ;
         initializeNonKey1UO1902( ) ;
         sMode1902 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1902 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1UO1902( ) ;
      if ( RcdFound1902 == 0 )
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
      confirm_1UO0( ) ;
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

   public void checkOptimisticConcurrency1UO1902( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01UO7 */
         pr_default.execute(5, new Object[] {Long.valueOf(A14297CP_ID)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z14328CP_EMPRCOD, BC01UO7_A14328CP_EMPRCOD[0]) != 0 ) || ( Z14326CP_CLICOD != BC01UO7_A14326CP_CLICOD[0] ) || ( GXutil.strcmp(Z14327CP_CLINOM, BC01UO7_A14327CP_CLINOM[0]) != 0 ) || ( Z14301CP_BARCOD != BC01UO7_A14301CP_BARCOD[0] ) || ( Z14302CP_BARCODR != BC01UO7_A14302CP_BARCODR[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14303CP_BARCODP, BC01UO7_A14303CP_BARCODP[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14304CP_BARFECF), GXutil.resetTime(BC01UO7_A14304CP_BARFECF[0])) ) || ( Z14305CP_BARNUMC != BC01UO7_A14305CP_BARNUMC[0] ) || ( GXutil.strcmp(Z14306CP_BARPLF, BC01UO7_A14306CP_BARPLF[0]) != 0 ) || ( Z14307CP_BARSIT != BC01UO7_A14307CP_BARSIT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z14309CP_BARFECC), GXutil.resetTime(BC01UO7_A14309CP_BARFECC[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14310CP_BARFECS), GXutil.resetTime(BC01UO7_A14310CP_BARFECS[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14308CP_BARFECG), GXutil.resetTime(BC01UO7_A14308CP_BARFECG[0])) ) || ( GXutil.strcmp(Z14311CP_BARSER, BC01UO7_A14311CP_BARSER[0]) != 0 ) || ( GXutil.strcmp(Z14312CP_BARSERD, BC01UO7_A14312CP_BARSERD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14331CP_BARCOLO, BC01UO7_A14331CP_BARCOLO[0]) != 0 ) || ( Z14332CP_BARCOLU != BC01UO7_A14332CP_BARCOLU[0] ) || ( GXutil.strcmp(Z14315CP_BARNOMC, BC01UO7_A14315CP_BARNOMC[0]) != 0 ) || ( Z14316CP_BARTIPA != BC01UO7_A14316CP_BARTIPA[0] ) || ( GXutil.strcmp(Z14343CP_TARTDSC, BC01UO7_A14343CP_TARTDSC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14317CP_BARGIRA, BC01UO7_A14317CP_BARGIRA[0]) != 0 ) || ( Z14318CP_BARACAA != BC01UO7_A14318CP_BARACAA[0] ) || ( GXutil.strcmp(Z14319CP_BARAGRE, BC01UO7_A14319CP_BARAGRE[0]) != 0 ) || ( Z14320CP_BAREXT != BC01UO7_A14320CP_BAREXT[0] ) || ( GXutil.strcmp(Z14321CP_DISDES, BC01UO7_A14321CP_DISDES[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14322CP_DISCOD != BC01UO7_A14322CP_DISCOD[0] ) || ( GXutil.strcmp(Z14323CP_BARPROP, BC01UO7_A14323CP_BARPROP[0]) != 0 ) || ( GXutil.strcmp(Z14334CP_DSC_BAR, BC01UO7_A14334CP_DSC_BAR[0]) != 0 ) || ( GXutil.strcmp(Z14324CP_BARDISN, BC01UO7_A14324CP_BARDISN[0]) != 0 ) || ( DecimalUtil.compareTo(Z14336CP_BARKGM, BC01UO7_A14336CP_BARKGM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14337CP_BARMTR, BC01UO7_A14337CP_BARMTR[0]) != 0 ) || ( Z14338CP_BARPIE != BC01UO7_A14338CP_BARPIE[0] ) || ( DecimalUtil.compareTo(Z14339CP_BARALBK, BC01UO7_A14339CP_BARALBK[0]) != 0 ) || ( DecimalUtil.compareTo(Z14340CP_BARALBM, BC01UO7_A14340CP_BARALBM[0]) != 0 ) || ( GXutil.strcmp(Z14325CP_BARENCC, BC01UO7_A14325CP_BARENCC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14341CP_DISUSRC, BC01UO7_A14341CP_DISUSRC[0]) != 0 ) || ( GXutil.strcmp(Z14351CP_BARMAQC, BC01UO7_A14351CP_BARMAQC[0]) != 0 ) || ( Z14352CP_BARESTR != BC01UO7_A14352CP_BARESTR[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCONPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UO1902( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UO1902( 0) ;
         checkOptimisticConcurrency1UO1902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UO1902( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UO1902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01UO8 */
                  pr_default.execute(6, new Object[] {Long.valueOf(A14297CP_ID), A14328CP_EMPRCOD, Integer.valueOf(A14326CP_CLICOD), A14327CP_CLINOM, Integer.valueOf(A14301CP_BARCOD), Byte.valueOf(A14302CP_BARCODR), A14303CP_BARCODP, A14304CP_BARFECF, Integer.valueOf(A14305CP_BARNUMC), A14306CP_BARPLF, Byte.valueOf(A14307CP_BARSIT), A14309CP_BARFECC, A14310CP_BARFECS, A14308CP_BARFECG, A14311CP_BARSER, A14312CP_BARSERD, A14331CP_BARCOLO, Integer.valueOf(A14332CP_BARCOLU), A14315CP_BARNOMC, Short.valueOf(A14316CP_BARTIPA), A14343CP_TARTDSC, A14317CP_BARGIRA, Short.valueOf(A14318CP_BARACAA), A14319CP_BARAGRE, Byte.valueOf(A14320CP_BAREXT), A14321CP_DISDES, Integer.valueOf(A14322CP_DISCOD), A14323CP_BARPROP, A14334CP_DSC_BAR, A14324CP_BARDISN, A14336CP_BARKGM, A14337CP_BARMTR, Integer.valueOf(A14338CP_BARPIE), A14339CP_BARALBK, A14340CP_BARALBM, A14325CP_BARENCC, A14341CP_DISUSRC, A14351CP_BARMAQC, Byte.valueOf(A14352CP_BARESTR)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
                  if ( (pr_default.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
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
            load1UO1902( ) ;
         }
         endLevel1UO1902( ) ;
      }
      closeExtendedTableCursors1UO1902( ) ;
   }

   public void update1UO1902( )
   {
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UO1902( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UO1902( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UO1902( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01UO9 */
                  pr_default.execute(7, new Object[] {A14328CP_EMPRCOD, Integer.valueOf(A14326CP_CLICOD), A14327CP_CLINOM, Integer.valueOf(A14301CP_BARCOD), Byte.valueOf(A14302CP_BARCODR), A14303CP_BARCODP, A14304CP_BARFECF, Integer.valueOf(A14305CP_BARNUMC), A14306CP_BARPLF, Byte.valueOf(A14307CP_BARSIT), A14309CP_BARFECC, A14310CP_BARFECS, A14308CP_BARFECG, A14311CP_BARSER, A14312CP_BARSERD, A14331CP_BARCOLO, Integer.valueOf(A14332CP_BARCOLU), A14315CP_BARNOMC, Short.valueOf(A14316CP_BARTIPA), A14343CP_TARTDSC, A14317CP_BARGIRA, Short.valueOf(A14318CP_BARACAA), A14319CP_BARAGRE, Byte.valueOf(A14320CP_BAREXT), A14321CP_DISDES, Integer.valueOf(A14322CP_DISCOD), A14323CP_BARPROP, A14334CP_DSC_BAR, A14324CP_BARDISN, A14336CP_BARKGM, A14337CP_BARMTR, Integer.valueOf(A14338CP_BARPIE), A14339CP_BARALBK, A14340CP_BARALBM, A14325CP_BARENCC, A14341CP_DISUSRC, A14351CP_BARMAQC, Byte.valueOf(A14352CP_BARESTR), Long.valueOf(A14297CP_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCONPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UO1902( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
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
         endLevel1UO1902( ) ;
      }
      closeExtendedTableCursors1UO1902( ) ;
   }

   public void deferredUpdate1UO1902( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1UO1902( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UO1902( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UO1902( ) ;
         afterConfirm1UO1902( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UO1902( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01UO10 */
               pr_default.execute(8, new Object[] {Long.valueOf(A14297CP_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCONPRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
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
      sMode1902 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1UO1902( ) ;
      Gx_mode = sMode1902 ;
   }

   public void onDeleteControls1UO1902( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1UO1902( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UO1902( ) ;
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

   public void scanKeyStart1UO1902( )
   {
      /* Scan By routine */
      /* Using cursor BC01UO11 */
      pr_default.execute(9, new Object[] {Long.valueOf(A14297CP_ID)});
      RcdFound1902 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = BC01UO11_A14297CP_ID[0] ;
         A14328CP_EMPRCOD = BC01UO11_A14328CP_EMPRCOD[0] ;
         A14326CP_CLICOD = BC01UO11_A14326CP_CLICOD[0] ;
         A14327CP_CLINOM = BC01UO11_A14327CP_CLINOM[0] ;
         A14301CP_BARCOD = BC01UO11_A14301CP_BARCOD[0] ;
         A14302CP_BARCODR = BC01UO11_A14302CP_BARCODR[0] ;
         A14303CP_BARCODP = BC01UO11_A14303CP_BARCODP[0] ;
         A14304CP_BARFECF = BC01UO11_A14304CP_BARFECF[0] ;
         A14305CP_BARNUMC = BC01UO11_A14305CP_BARNUMC[0] ;
         A14306CP_BARPLF = BC01UO11_A14306CP_BARPLF[0] ;
         A14307CP_BARSIT = BC01UO11_A14307CP_BARSIT[0] ;
         A14309CP_BARFECC = BC01UO11_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = BC01UO11_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = BC01UO11_A14308CP_BARFECG[0] ;
         A14311CP_BARSER = BC01UO11_A14311CP_BARSER[0] ;
         A14312CP_BARSERD = BC01UO11_A14312CP_BARSERD[0] ;
         A14331CP_BARCOLO = BC01UO11_A14331CP_BARCOLO[0] ;
         A14332CP_BARCOLU = BC01UO11_A14332CP_BARCOLU[0] ;
         A14315CP_BARNOMC = BC01UO11_A14315CP_BARNOMC[0] ;
         A14316CP_BARTIPA = BC01UO11_A14316CP_BARTIPA[0] ;
         A14343CP_TARTDSC = BC01UO11_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = BC01UO11_A14317CP_BARGIRA[0] ;
         A14318CP_BARACAA = BC01UO11_A14318CP_BARACAA[0] ;
         A14319CP_BARAGRE = BC01UO11_A14319CP_BARAGRE[0] ;
         A14320CP_BAREXT = BC01UO11_A14320CP_BAREXT[0] ;
         A14321CP_DISDES = BC01UO11_A14321CP_DISDES[0] ;
         A14322CP_DISCOD = BC01UO11_A14322CP_DISCOD[0] ;
         A14323CP_BARPROP = BC01UO11_A14323CP_BARPROP[0] ;
         A14334CP_DSC_BAR = BC01UO11_A14334CP_DSC_BAR[0] ;
         A14324CP_BARDISN = BC01UO11_A14324CP_BARDISN[0] ;
         A14336CP_BARKGM = BC01UO11_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = BC01UO11_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = BC01UO11_A14338CP_BARPIE[0] ;
         A14339CP_BARALBK = BC01UO11_A14339CP_BARALBK[0] ;
         A14340CP_BARALBM = BC01UO11_A14340CP_BARALBM[0] ;
         A14325CP_BARENCC = BC01UO11_A14325CP_BARENCC[0] ;
         A14341CP_DISUSRC = BC01UO11_A14341CP_DISUSRC[0] ;
         A14351CP_BARMAQC = BC01UO11_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = BC01UO11_A14352CP_BARESTR[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1UO1902( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1902 = (short)(0) ;
      scanKeyLoad1UO1902( ) ;
   }

   public void scanKeyLoad1UO1902( )
   {
      sMode1902 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1902 = (short)(1) ;
         A14297CP_ID = BC01UO11_A14297CP_ID[0] ;
         A14328CP_EMPRCOD = BC01UO11_A14328CP_EMPRCOD[0] ;
         A14326CP_CLICOD = BC01UO11_A14326CP_CLICOD[0] ;
         A14327CP_CLINOM = BC01UO11_A14327CP_CLINOM[0] ;
         A14301CP_BARCOD = BC01UO11_A14301CP_BARCOD[0] ;
         A14302CP_BARCODR = BC01UO11_A14302CP_BARCODR[0] ;
         A14303CP_BARCODP = BC01UO11_A14303CP_BARCODP[0] ;
         A14304CP_BARFECF = BC01UO11_A14304CP_BARFECF[0] ;
         A14305CP_BARNUMC = BC01UO11_A14305CP_BARNUMC[0] ;
         A14306CP_BARPLF = BC01UO11_A14306CP_BARPLF[0] ;
         A14307CP_BARSIT = BC01UO11_A14307CP_BARSIT[0] ;
         A14309CP_BARFECC = BC01UO11_A14309CP_BARFECC[0] ;
         A14310CP_BARFECS = BC01UO11_A14310CP_BARFECS[0] ;
         A14308CP_BARFECG = BC01UO11_A14308CP_BARFECG[0] ;
         A14311CP_BARSER = BC01UO11_A14311CP_BARSER[0] ;
         A14312CP_BARSERD = BC01UO11_A14312CP_BARSERD[0] ;
         A14331CP_BARCOLO = BC01UO11_A14331CP_BARCOLO[0] ;
         A14332CP_BARCOLU = BC01UO11_A14332CP_BARCOLU[0] ;
         A14315CP_BARNOMC = BC01UO11_A14315CP_BARNOMC[0] ;
         A14316CP_BARTIPA = BC01UO11_A14316CP_BARTIPA[0] ;
         A14343CP_TARTDSC = BC01UO11_A14343CP_TARTDSC[0] ;
         A14317CP_BARGIRA = BC01UO11_A14317CP_BARGIRA[0] ;
         A14318CP_BARACAA = BC01UO11_A14318CP_BARACAA[0] ;
         A14319CP_BARAGRE = BC01UO11_A14319CP_BARAGRE[0] ;
         A14320CP_BAREXT = BC01UO11_A14320CP_BAREXT[0] ;
         A14321CP_DISDES = BC01UO11_A14321CP_DISDES[0] ;
         A14322CP_DISCOD = BC01UO11_A14322CP_DISCOD[0] ;
         A14323CP_BARPROP = BC01UO11_A14323CP_BARPROP[0] ;
         A14334CP_DSC_BAR = BC01UO11_A14334CP_DSC_BAR[0] ;
         A14324CP_BARDISN = BC01UO11_A14324CP_BARDISN[0] ;
         A14336CP_BARKGM = BC01UO11_A14336CP_BARKGM[0] ;
         A14337CP_BARMTR = BC01UO11_A14337CP_BARMTR[0] ;
         A14338CP_BARPIE = BC01UO11_A14338CP_BARPIE[0] ;
         A14339CP_BARALBK = BC01UO11_A14339CP_BARALBK[0] ;
         A14340CP_BARALBM = BC01UO11_A14340CP_BARALBM[0] ;
         A14325CP_BARENCC = BC01UO11_A14325CP_BARENCC[0] ;
         A14341CP_DISUSRC = BC01UO11_A14341CP_DISUSRC[0] ;
         A14351CP_BARMAQC = BC01UO11_A14351CP_BARMAQC[0] ;
         A14352CP_BARESTR = BC01UO11_A14352CP_BARESTR[0] ;
      }
      Gx_mode = sMode1902 ;
   }

   public void scanKeyEnd1UO1902( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1UO1902( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UO1902( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UO1902( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UO1902( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UO1902( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UO1902( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UO1902( )
   {
   }

   public void send_integrity_lvl_hashes1UO1902( )
   {
   }

   public void addRow1UO1902( )
   {
      VarsToRow1902( bcproduccion_CONPRODUC) ;
   }

   public void readRow1UO1902( )
   {
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
   }

   public void initializeNonKey1UO1902( )
   {
      A14328CP_EMPRCOD = "" ;
      A14326CP_CLICOD = 0 ;
      A14327CP_CLINOM = "" ;
      A14301CP_BARCOD = 0 ;
      A14302CP_BARCODR = (byte)(0) ;
      A14303CP_BARCODP = "" ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14305CP_BARNUMC = 0 ;
      A14306CP_BARPLF = "" ;
      A14307CP_BARSIT = (byte)(0) ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14312CP_BARSERD = "" ;
      A14331CP_BARCOLO = "" ;
      A14332CP_BARCOLU = 0 ;
      A14315CP_BARNOMC = "" ;
      A14316CP_BARTIPA = (short)(0) ;
      A14343CP_TARTDSC = "" ;
      A14317CP_BARGIRA = "" ;
      A14318CP_BARACAA = (short)(0) ;
      A14319CP_BARAGRE = "" ;
      A14320CP_BAREXT = (byte)(0) ;
      A14321CP_DISDES = "" ;
      A14322CP_DISCOD = 0 ;
      A14323CP_BARPROP = "" ;
      A14334CP_DSC_BAR = "" ;
      A14324CP_BARDISN = "" ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      A14338CP_BARPIE = 0 ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      A14325CP_BARENCC = "" ;
      A14341CP_DISUSRC = "" ;
      A14351CP_BARMAQC = "" ;
      A14352CP_BARESTR = (byte)(0) ;
      Z14328CP_EMPRCOD = "" ;
      Z14326CP_CLICOD = 0 ;
      Z14327CP_CLINOM = "" ;
      Z14301CP_BARCOD = 0 ;
      Z14302CP_BARCODR = (byte)(0) ;
      Z14303CP_BARCODP = "" ;
      Z14304CP_BARFECF = GXutil.nullDate() ;
      Z14305CP_BARNUMC = 0 ;
      Z14306CP_BARPLF = "" ;
      Z14307CP_BARSIT = (byte)(0) ;
      Z14309CP_BARFECC = GXutil.nullDate() ;
      Z14310CP_BARFECS = GXutil.nullDate() ;
      Z14308CP_BARFECG = GXutil.nullDate() ;
      Z14311CP_BARSER = "" ;
      Z14312CP_BARSERD = "" ;
      Z14331CP_BARCOLO = "" ;
      Z14332CP_BARCOLU = 0 ;
      Z14315CP_BARNOMC = "" ;
      Z14316CP_BARTIPA = (short)(0) ;
      Z14343CP_TARTDSC = "" ;
      Z14317CP_BARGIRA = "" ;
      Z14318CP_BARACAA = (short)(0) ;
      Z14319CP_BARAGRE = "" ;
      Z14320CP_BAREXT = (byte)(0) ;
      Z14321CP_DISDES = "" ;
      Z14322CP_DISCOD = 0 ;
      Z14323CP_BARPROP = "" ;
      Z14334CP_DSC_BAR = "" ;
      Z14324CP_BARDISN = "" ;
      Z14336CP_BARKGM = DecimalUtil.ZERO ;
      Z14337CP_BARMTR = DecimalUtil.ZERO ;
      Z14338CP_BARPIE = 0 ;
      Z14339CP_BARALBK = DecimalUtil.ZERO ;
      Z14340CP_BARALBM = DecimalUtil.ZERO ;
      Z14325CP_BARENCC = "" ;
      Z14341CP_DISUSRC = "" ;
      Z14351CP_BARMAQC = "" ;
      Z14352CP_BARESTR = (byte)(0) ;
   }

   public void initAll1UO1902( )
   {
      A14297CP_ID = 0 ;
      initializeNonKey1UO1902( ) ;
   }

   public void standaloneModalInsert( )
   {
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

   public void VarsToRow1902( app.produccion.SdtCONPRODUC obj1902 )
   {
      obj1902.setgxTv_SdtCONPRODUC_Mode( Gx_mode );
      obj1902.setgxTv_SdtCONPRODUC_Cp_emprcod( A14328CP_EMPRCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_clicod( A14326CP_CLICOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_clinom( A14327CP_CLINOM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcod( A14301CP_BARCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcodreo( A14302CP_BARCODR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcodpar( A14303CP_BARCODP );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecfpr( A14304CP_BARFECF );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barnumcli( A14305CP_BARNUMC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barplf( A14306CP_BARPLF );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barsit( A14307CP_BARSIT );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfeccli( A14309CP_BARFECC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecsal( A14310CP_BARFECS );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecgen( A14308CP_BARFECG );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barser( A14311CP_BARSER );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barserdsc( A14312CP_BARSERD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcolo( A14331CP_BARCOLO );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcolu( A14332CP_BARCOLU );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barnomcli( A14315CP_BARNOMC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bartipart( A14316CP_BARTIPA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_tartdsc( A14343CP_TARTDSC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bargirar( A14317CP_BARGIRA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baracaanh( A14318CP_BARACAA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baragrest( A14319CP_BARAGRE );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barext( A14320CP_BAREXT );
      obj1902.setgxTv_SdtCONPRODUC_Cp_disdes( A14321CP_DISDES );
      obj1902.setgxTv_SdtCONPRODUC_Cp_discod( A14322CP_DISCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barproper( A14323CP_BARPROP );
      obj1902.setgxTv_SdtCONPRODUC_Cp_dsc_bar( A14334CP_DSC_BAR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bardisnum( A14324CP_BARDISN );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barkgm( A14336CP_BARKGM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barmtr( A14337CP_BARMTR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barpie( A14338CP_BARPIE );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baralbk( A14339CP_BARALBK );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baralbm( A14340CP_BARALBM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barenccli( A14325CP_BARENCC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_disusrc( A14341CP_DISUSRC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barmaqcd( A14351CP_BARMAQC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barestr( A14352CP_BARESTR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_id( A14297CP_ID );
      obj1902.setgxTv_SdtCONPRODUC_Cp_id_Z( Z14297CP_ID );
      obj1902.setgxTv_SdtCONPRODUC_Cp_emprcod_Z( Z14328CP_EMPRCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_clicod_Z( Z14326CP_CLICOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_clinom_Z( Z14327CP_CLINOM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcod_Z( Z14301CP_BARCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcodreo_Z( Z14302CP_BARCODR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcodpar_Z( Z14303CP_BARCODP );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecfpr_Z( Z14304CP_BARFECF );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barnumcli_Z( Z14305CP_BARNUMC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barplf_Z( Z14306CP_BARPLF );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barsit_Z( Z14307CP_BARSIT );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfeccli_Z( Z14309CP_BARFECC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecsal_Z( Z14310CP_BARFECS );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barfecgen_Z( Z14308CP_BARFECG );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barser_Z( Z14311CP_BARSER );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barserdsc_Z( Z14312CP_BARSERD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcolo_Z( Z14331CP_BARCOLO );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barcolu_Z( Z14332CP_BARCOLU );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barnomcli_Z( Z14315CP_BARNOMC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bartipart_Z( Z14316CP_BARTIPA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_tartdsc_Z( Z14343CP_TARTDSC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bargirar_Z( Z14317CP_BARGIRA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baracaanh_Z( Z14318CP_BARACAA );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baragrest_Z( Z14319CP_BARAGRE );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barext_Z( Z14320CP_BAREXT );
      obj1902.setgxTv_SdtCONPRODUC_Cp_disdes_Z( Z14321CP_DISDES );
      obj1902.setgxTv_SdtCONPRODUC_Cp_discod_Z( Z14322CP_DISCOD );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barproper_Z( Z14323CP_BARPROP );
      obj1902.setgxTv_SdtCONPRODUC_Cp_dsc_bar_Z( Z14334CP_DSC_BAR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_bardisnum_Z( Z14324CP_BARDISN );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barkgm_Z( Z14336CP_BARKGM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barmtr_Z( Z14337CP_BARMTR );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barpie_Z( Z14338CP_BARPIE );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baralbk_Z( Z14339CP_BARALBK );
      obj1902.setgxTv_SdtCONPRODUC_Cp_baralbm_Z( Z14340CP_BARALBM );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barenccli_Z( Z14325CP_BARENCC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_disusrc_Z( Z14341CP_DISUSRC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barmaqcd_Z( Z14351CP_BARMAQC );
      obj1902.setgxTv_SdtCONPRODUC_Cp_barestr_Z( Z14352CP_BARESTR );
      obj1902.setgxTv_SdtCONPRODUC_Mode( Gx_mode );
   }

   public void KeyVarsToRow1902( app.produccion.SdtCONPRODUC obj1902 )
   {
      obj1902.setgxTv_SdtCONPRODUC_Cp_id( A14297CP_ID );
   }

   public void RowToVars1902( app.produccion.SdtCONPRODUC obj1902 ,
                              int forceLoad )
   {
      Gx_mode = obj1902.getgxTv_SdtCONPRODUC_Mode() ;
      A14328CP_EMPRCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_emprcod() ;
      A14326CP_CLICOD = obj1902.getgxTv_SdtCONPRODUC_Cp_clicod() ;
      A14327CP_CLINOM = obj1902.getgxTv_SdtCONPRODUC_Cp_clinom() ;
      A14301CP_BARCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_barcod() ;
      A14302CP_BARCODR = obj1902.getgxTv_SdtCONPRODUC_Cp_barcodreo() ;
      A14303CP_BARCODP = obj1902.getgxTv_SdtCONPRODUC_Cp_barcodpar() ;
      A14304CP_BARFECF = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecfpr() ;
      A14305CP_BARNUMC = obj1902.getgxTv_SdtCONPRODUC_Cp_barnumcli() ;
      A14306CP_BARPLF = obj1902.getgxTv_SdtCONPRODUC_Cp_barplf() ;
      A14307CP_BARSIT = obj1902.getgxTv_SdtCONPRODUC_Cp_barsit() ;
      A14309CP_BARFECC = obj1902.getgxTv_SdtCONPRODUC_Cp_barfeccli() ;
      A14310CP_BARFECS = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecsal() ;
      A14308CP_BARFECG = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecgen() ;
      A14311CP_BARSER = obj1902.getgxTv_SdtCONPRODUC_Cp_barser() ;
      A14312CP_BARSERD = obj1902.getgxTv_SdtCONPRODUC_Cp_barserdsc() ;
      A14331CP_BARCOLO = obj1902.getgxTv_SdtCONPRODUC_Cp_barcolo() ;
      A14332CP_BARCOLU = obj1902.getgxTv_SdtCONPRODUC_Cp_barcolu() ;
      A14315CP_BARNOMC = obj1902.getgxTv_SdtCONPRODUC_Cp_barnomcli() ;
      A14316CP_BARTIPA = obj1902.getgxTv_SdtCONPRODUC_Cp_bartipart() ;
      A14343CP_TARTDSC = obj1902.getgxTv_SdtCONPRODUC_Cp_tartdsc() ;
      A14317CP_BARGIRA = obj1902.getgxTv_SdtCONPRODUC_Cp_bargirar() ;
      A14318CP_BARACAA = obj1902.getgxTv_SdtCONPRODUC_Cp_baracaanh() ;
      A14319CP_BARAGRE = obj1902.getgxTv_SdtCONPRODUC_Cp_baragrest() ;
      A14320CP_BAREXT = obj1902.getgxTv_SdtCONPRODUC_Cp_barext() ;
      A14321CP_DISDES = obj1902.getgxTv_SdtCONPRODUC_Cp_disdes() ;
      A14322CP_DISCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_discod() ;
      A14323CP_BARPROP = obj1902.getgxTv_SdtCONPRODUC_Cp_barproper() ;
      A14334CP_DSC_BAR = obj1902.getgxTv_SdtCONPRODUC_Cp_dsc_bar() ;
      A14324CP_BARDISN = obj1902.getgxTv_SdtCONPRODUC_Cp_bardisnum() ;
      A14336CP_BARKGM = obj1902.getgxTv_SdtCONPRODUC_Cp_barkgm() ;
      A14337CP_BARMTR = obj1902.getgxTv_SdtCONPRODUC_Cp_barmtr() ;
      A14338CP_BARPIE = obj1902.getgxTv_SdtCONPRODUC_Cp_barpie() ;
      A14339CP_BARALBK = obj1902.getgxTv_SdtCONPRODUC_Cp_baralbk() ;
      A14340CP_BARALBM = obj1902.getgxTv_SdtCONPRODUC_Cp_baralbm() ;
      A14325CP_BARENCC = obj1902.getgxTv_SdtCONPRODUC_Cp_barenccli() ;
      A14341CP_DISUSRC = obj1902.getgxTv_SdtCONPRODUC_Cp_disusrc() ;
      A14351CP_BARMAQC = obj1902.getgxTv_SdtCONPRODUC_Cp_barmaqcd() ;
      A14352CP_BARESTR = obj1902.getgxTv_SdtCONPRODUC_Cp_barestr() ;
      A14297CP_ID = obj1902.getgxTv_SdtCONPRODUC_Cp_id() ;
      Z14297CP_ID = obj1902.getgxTv_SdtCONPRODUC_Cp_id_Z() ;
      Z14328CP_EMPRCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_emprcod_Z() ;
      Z14326CP_CLICOD = obj1902.getgxTv_SdtCONPRODUC_Cp_clicod_Z() ;
      Z14327CP_CLINOM = obj1902.getgxTv_SdtCONPRODUC_Cp_clinom_Z() ;
      Z14301CP_BARCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_barcod_Z() ;
      Z14302CP_BARCODR = obj1902.getgxTv_SdtCONPRODUC_Cp_barcodreo_Z() ;
      Z14303CP_BARCODP = obj1902.getgxTv_SdtCONPRODUC_Cp_barcodpar_Z() ;
      Z14304CP_BARFECF = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecfpr_Z() ;
      Z14305CP_BARNUMC = obj1902.getgxTv_SdtCONPRODUC_Cp_barnumcli_Z() ;
      Z14306CP_BARPLF = obj1902.getgxTv_SdtCONPRODUC_Cp_barplf_Z() ;
      Z14307CP_BARSIT = obj1902.getgxTv_SdtCONPRODUC_Cp_barsit_Z() ;
      Z14309CP_BARFECC = obj1902.getgxTv_SdtCONPRODUC_Cp_barfeccli_Z() ;
      Z14310CP_BARFECS = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecsal_Z() ;
      Z14308CP_BARFECG = obj1902.getgxTv_SdtCONPRODUC_Cp_barfecgen_Z() ;
      Z14311CP_BARSER = obj1902.getgxTv_SdtCONPRODUC_Cp_barser_Z() ;
      Z14312CP_BARSERD = obj1902.getgxTv_SdtCONPRODUC_Cp_barserdsc_Z() ;
      Z14331CP_BARCOLO = obj1902.getgxTv_SdtCONPRODUC_Cp_barcolo_Z() ;
      Z14332CP_BARCOLU = obj1902.getgxTv_SdtCONPRODUC_Cp_barcolu_Z() ;
      Z14315CP_BARNOMC = obj1902.getgxTv_SdtCONPRODUC_Cp_barnomcli_Z() ;
      Z14316CP_BARTIPA = obj1902.getgxTv_SdtCONPRODUC_Cp_bartipart_Z() ;
      Z14343CP_TARTDSC = obj1902.getgxTv_SdtCONPRODUC_Cp_tartdsc_Z() ;
      Z14317CP_BARGIRA = obj1902.getgxTv_SdtCONPRODUC_Cp_bargirar_Z() ;
      Z14318CP_BARACAA = obj1902.getgxTv_SdtCONPRODUC_Cp_baracaanh_Z() ;
      Z14319CP_BARAGRE = obj1902.getgxTv_SdtCONPRODUC_Cp_baragrest_Z() ;
      Z14320CP_BAREXT = obj1902.getgxTv_SdtCONPRODUC_Cp_barext_Z() ;
      Z14321CP_DISDES = obj1902.getgxTv_SdtCONPRODUC_Cp_disdes_Z() ;
      Z14322CP_DISCOD = obj1902.getgxTv_SdtCONPRODUC_Cp_discod_Z() ;
      Z14323CP_BARPROP = obj1902.getgxTv_SdtCONPRODUC_Cp_barproper_Z() ;
      Z14334CP_DSC_BAR = obj1902.getgxTv_SdtCONPRODUC_Cp_dsc_bar_Z() ;
      Z14324CP_BARDISN = obj1902.getgxTv_SdtCONPRODUC_Cp_bardisnum_Z() ;
      Z14336CP_BARKGM = obj1902.getgxTv_SdtCONPRODUC_Cp_barkgm_Z() ;
      Z14337CP_BARMTR = obj1902.getgxTv_SdtCONPRODUC_Cp_barmtr_Z() ;
      Z14338CP_BARPIE = obj1902.getgxTv_SdtCONPRODUC_Cp_barpie_Z() ;
      Z14339CP_BARALBK = obj1902.getgxTv_SdtCONPRODUC_Cp_baralbk_Z() ;
      Z14340CP_BARALBM = obj1902.getgxTv_SdtCONPRODUC_Cp_baralbm_Z() ;
      Z14325CP_BARENCC = obj1902.getgxTv_SdtCONPRODUC_Cp_barenccli_Z() ;
      Z14341CP_DISUSRC = obj1902.getgxTv_SdtCONPRODUC_Cp_disusrc_Z() ;
      Z14351CP_BARMAQC = obj1902.getgxTv_SdtCONPRODUC_Cp_barmaqcd_Z() ;
      Z14352CP_BARESTR = obj1902.getgxTv_SdtCONPRODUC_Cp_barestr_Z() ;
      Gx_mode = obj1902.getgxTv_SdtCONPRODUC_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14297CP_ID = ((Number) GXutil.testNumericType( getParm(obj,0), TypeConstants.LONG)).longValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1UO1902( ) ;
      scanKeyStart1UO1902( ) ;
      if ( RcdFound1902 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14297CP_ID = A14297CP_ID ;
      }
      zm1UO1902( -1) ;
      onLoadActions1UO1902( ) ;
      addRow1UO1902( ) ;
      scanKeyEnd1UO1902( ) ;
      if ( RcdFound1902 == 0 )
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
      RowToVars1902( bcproduccion_CONPRODUC, 0) ;
      scanKeyStart1UO1902( ) ;
      if ( RcdFound1902 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14297CP_ID = A14297CP_ID ;
      }
      zm1UO1902( -1) ;
      onLoadActions1UO1902( ) ;
      addRow1UO1902( ) ;
      scanKeyEnd1UO1902( ) ;
      if ( RcdFound1902 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UO1902( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1UO1902( ) ;
      }
      else
      {
         if ( RcdFound1902 == 1 )
         {
            if ( A14297CP_ID != Z14297CP_ID )
            {
               A14297CP_ID = Z14297CP_ID ;
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
               update1UO1902( ) ;
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
               if ( A14297CP_ID != Z14297CP_ID )
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
                     insert1UO1902( ) ;
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
                     insert1UO1902( ) ;
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
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
      saveImpl( ) ;
      VarsToRow1902( bcproduccion_CONPRODUC) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1UO1902( ) ;
      afterTrn( ) ;
      VarsToRow1902( bcproduccion_CONPRODUC) ;
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
         app.produccion.SdtCONPRODUC auxBC = new app.produccion.SdtCONPRODUC( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14297CP_ID);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcproduccion_CONPRODUC);
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
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
      updateImpl( ) ;
      VarsToRow1902( bcproduccion_CONPRODUC) ;
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
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1UO1902( ) ;
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
      VarsToRow1902( bcproduccion_CONPRODUC) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1902( bcproduccion_CONPRODUC, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1UO1902( ) ;
      if ( RcdFound1902 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( A14297CP_ID != Z14297CP_ID )
         {
            A14297CP_ID = Z14297CP_ID ;
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
         if ( A14297CP_ID != Z14297CP_ID )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "produccion.conproduc_bc");
      VarsToRow1902( bcproduccion_CONPRODUC) ;
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
      Gx_mode = bcproduccion_CONPRODUC.getgxTv_SdtCONPRODUC_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcproduccion_CONPRODUC.setgxTv_SdtCONPRODUC_Mode( Gx_mode );
   }

   public void SetSDT( app.produccion.SdtCONPRODUC sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcproduccion_CONPRODUC )
      {
         bcproduccion_CONPRODUC = sdt ;
         if ( GXutil.strcmp(bcproduccion_CONPRODUC.getgxTv_SdtCONPRODUC_Mode(), "") == 0 )
         {
            bcproduccion_CONPRODUC.setgxTv_SdtCONPRODUC_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1902( bcproduccion_CONPRODUC) ;
         }
         else
         {
            RowToVars1902( bcproduccion_CONPRODUC, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcproduccion_CONPRODUC.getgxTv_SdtCONPRODUC_Mode(), "") == 0 )
         {
            bcproduccion_CONPRODUC.setgxTv_SdtCONPRODUC_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1902( bcproduccion_CONPRODUC, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtCONPRODUC getCONPRODUC_BC( )
   {
      return bcproduccion_CONPRODUC ;
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
   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV12EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV7WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9WebSession = httpContext.getWebSession();
      Z14328CP_EMPRCOD = "" ;
      A14328CP_EMPRCOD = "" ;
      Z14327CP_CLINOM = "" ;
      A14327CP_CLINOM = "" ;
      Z14303CP_BARCODP = "" ;
      A14303CP_BARCODP = "" ;
      Z14304CP_BARFECF = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      Z14306CP_BARPLF = "" ;
      A14306CP_BARPLF = "" ;
      Z14309CP_BARFECC = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      Z14310CP_BARFECS = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      Z14308CP_BARFECG = GXutil.nullDate() ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      Z14311CP_BARSER = "" ;
      A14311CP_BARSER = "" ;
      Z14312CP_BARSERD = "" ;
      A14312CP_BARSERD = "" ;
      Z14331CP_BARCOLO = "" ;
      A14331CP_BARCOLO = "" ;
      Z14315CP_BARNOMC = "" ;
      A14315CP_BARNOMC = "" ;
      Z14343CP_TARTDSC = "" ;
      A14343CP_TARTDSC = "" ;
      Z14317CP_BARGIRA = "" ;
      A14317CP_BARGIRA = "" ;
      Z14319CP_BARAGRE = "" ;
      A14319CP_BARAGRE = "" ;
      Z14321CP_DISDES = "" ;
      A14321CP_DISDES = "" ;
      Z14323CP_BARPROP = "" ;
      A14323CP_BARPROP = "" ;
      Z14334CP_DSC_BAR = "" ;
      A14334CP_DSC_BAR = "" ;
      Z14324CP_BARDISN = "" ;
      A14324CP_BARDISN = "" ;
      Z14336CP_BARKGM = DecimalUtil.ZERO ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      Z14337CP_BARMTR = DecimalUtil.ZERO ;
      A14337CP_BARMTR = DecimalUtil.ZERO ;
      Z14339CP_BARALBK = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      Z14340CP_BARALBM = DecimalUtil.ZERO ;
      A14340CP_BARALBM = DecimalUtil.ZERO ;
      Z14325CP_BARENCC = "" ;
      A14325CP_BARENCC = "" ;
      Z14341CP_DISUSRC = "" ;
      A14341CP_DISUSRC = "" ;
      Z14351CP_BARMAQC = "" ;
      A14351CP_BARMAQC = "" ;
      BC01UO4_A14297CP_ID = new long[1] ;
      BC01UO4_A14328CP_EMPRCOD = new String[] {""} ;
      BC01UO4_A14326CP_CLICOD = new int[1] ;
      BC01UO4_A14327CP_CLINOM = new String[] {""} ;
      BC01UO4_A14301CP_BARCOD = new int[1] ;
      BC01UO4_A14302CP_BARCODR = new byte[1] ;
      BC01UO4_A14303CP_BARCODP = new String[] {""} ;
      BC01UO4_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO4_A14305CP_BARNUMC = new int[1] ;
      BC01UO4_A14306CP_BARPLF = new String[] {""} ;
      BC01UO4_A14307CP_BARSIT = new byte[1] ;
      BC01UO4_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO4_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO4_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO4_A14311CP_BARSER = new String[] {""} ;
      BC01UO4_A14312CP_BARSERD = new String[] {""} ;
      BC01UO4_A14331CP_BARCOLO = new String[] {""} ;
      BC01UO4_A14332CP_BARCOLU = new int[1] ;
      BC01UO4_A14315CP_BARNOMC = new String[] {""} ;
      BC01UO4_A14316CP_BARTIPA = new short[1] ;
      BC01UO4_A14343CP_TARTDSC = new String[] {""} ;
      BC01UO4_A14317CP_BARGIRA = new String[] {""} ;
      BC01UO4_A14318CP_BARACAA = new short[1] ;
      BC01UO4_A14319CP_BARAGRE = new String[] {""} ;
      BC01UO4_A14320CP_BAREXT = new byte[1] ;
      BC01UO4_A14321CP_DISDES = new String[] {""} ;
      BC01UO4_A14322CP_DISCOD = new int[1] ;
      BC01UO4_A14323CP_BARPROP = new String[] {""} ;
      BC01UO4_A14334CP_DSC_BAR = new String[] {""} ;
      BC01UO4_A14324CP_BARDISN = new String[] {""} ;
      BC01UO4_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO4_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO4_A14338CP_BARPIE = new int[1] ;
      BC01UO4_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO4_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO4_A14325CP_BARENCC = new String[] {""} ;
      BC01UO4_A14341CP_DISUSRC = new String[] {""} ;
      BC01UO4_A14351CP_BARMAQC = new String[] {""} ;
      BC01UO4_A14352CP_BARESTR = new byte[1] ;
      BC01UO5_A14297CP_ID = new long[1] ;
      BC01UO6_A14297CP_ID = new long[1] ;
      BC01UO6_A14328CP_EMPRCOD = new String[] {""} ;
      BC01UO6_A14326CP_CLICOD = new int[1] ;
      BC01UO6_A14327CP_CLINOM = new String[] {""} ;
      BC01UO6_A14301CP_BARCOD = new int[1] ;
      BC01UO6_A14302CP_BARCODR = new byte[1] ;
      BC01UO6_A14303CP_BARCODP = new String[] {""} ;
      BC01UO6_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO6_A14305CP_BARNUMC = new int[1] ;
      BC01UO6_A14306CP_BARPLF = new String[] {""} ;
      BC01UO6_A14307CP_BARSIT = new byte[1] ;
      BC01UO6_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO6_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO6_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO6_A14311CP_BARSER = new String[] {""} ;
      BC01UO6_A14312CP_BARSERD = new String[] {""} ;
      BC01UO6_A14331CP_BARCOLO = new String[] {""} ;
      BC01UO6_A14332CP_BARCOLU = new int[1] ;
      BC01UO6_A14315CP_BARNOMC = new String[] {""} ;
      BC01UO6_A14316CP_BARTIPA = new short[1] ;
      BC01UO6_A14343CP_TARTDSC = new String[] {""} ;
      BC01UO6_A14317CP_BARGIRA = new String[] {""} ;
      BC01UO6_A14318CP_BARACAA = new short[1] ;
      BC01UO6_A14319CP_BARAGRE = new String[] {""} ;
      BC01UO6_A14320CP_BAREXT = new byte[1] ;
      BC01UO6_A14321CP_DISDES = new String[] {""} ;
      BC01UO6_A14322CP_DISCOD = new int[1] ;
      BC01UO6_A14323CP_BARPROP = new String[] {""} ;
      BC01UO6_A14334CP_DSC_BAR = new String[] {""} ;
      BC01UO6_A14324CP_BARDISN = new String[] {""} ;
      BC01UO6_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO6_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO6_A14338CP_BARPIE = new int[1] ;
      BC01UO6_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO6_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO6_A14325CP_BARENCC = new String[] {""} ;
      BC01UO6_A14341CP_DISUSRC = new String[] {""} ;
      BC01UO6_A14351CP_BARMAQC = new String[] {""} ;
      BC01UO6_A14352CP_BARESTR = new byte[1] ;
      sMode1902 = "" ;
      BC01UO7_A14297CP_ID = new long[1] ;
      BC01UO7_A14328CP_EMPRCOD = new String[] {""} ;
      BC01UO7_A14326CP_CLICOD = new int[1] ;
      BC01UO7_A14327CP_CLINOM = new String[] {""} ;
      BC01UO7_A14301CP_BARCOD = new int[1] ;
      BC01UO7_A14302CP_BARCODR = new byte[1] ;
      BC01UO7_A14303CP_BARCODP = new String[] {""} ;
      BC01UO7_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO7_A14305CP_BARNUMC = new int[1] ;
      BC01UO7_A14306CP_BARPLF = new String[] {""} ;
      BC01UO7_A14307CP_BARSIT = new byte[1] ;
      BC01UO7_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO7_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO7_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO7_A14311CP_BARSER = new String[] {""} ;
      BC01UO7_A14312CP_BARSERD = new String[] {""} ;
      BC01UO7_A14331CP_BARCOLO = new String[] {""} ;
      BC01UO7_A14332CP_BARCOLU = new int[1] ;
      BC01UO7_A14315CP_BARNOMC = new String[] {""} ;
      BC01UO7_A14316CP_BARTIPA = new short[1] ;
      BC01UO7_A14343CP_TARTDSC = new String[] {""} ;
      BC01UO7_A14317CP_BARGIRA = new String[] {""} ;
      BC01UO7_A14318CP_BARACAA = new short[1] ;
      BC01UO7_A14319CP_BARAGRE = new String[] {""} ;
      BC01UO7_A14320CP_BAREXT = new byte[1] ;
      BC01UO7_A14321CP_DISDES = new String[] {""} ;
      BC01UO7_A14322CP_DISCOD = new int[1] ;
      BC01UO7_A14323CP_BARPROP = new String[] {""} ;
      BC01UO7_A14334CP_DSC_BAR = new String[] {""} ;
      BC01UO7_A14324CP_BARDISN = new String[] {""} ;
      BC01UO7_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO7_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO7_A14338CP_BARPIE = new int[1] ;
      BC01UO7_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO7_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO7_A14325CP_BARENCC = new String[] {""} ;
      BC01UO7_A14341CP_DISUSRC = new String[] {""} ;
      BC01UO7_A14351CP_BARMAQC = new String[] {""} ;
      BC01UO7_A14352CP_BARESTR = new byte[1] ;
      BC01UO11_A14297CP_ID = new long[1] ;
      BC01UO11_A14328CP_EMPRCOD = new String[] {""} ;
      BC01UO11_A14326CP_CLICOD = new int[1] ;
      BC01UO11_A14327CP_CLINOM = new String[] {""} ;
      BC01UO11_A14301CP_BARCOD = new int[1] ;
      BC01UO11_A14302CP_BARCODR = new byte[1] ;
      BC01UO11_A14303CP_BARCODP = new String[] {""} ;
      BC01UO11_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO11_A14305CP_BARNUMC = new int[1] ;
      BC01UO11_A14306CP_BARPLF = new String[] {""} ;
      BC01UO11_A14307CP_BARSIT = new byte[1] ;
      BC01UO11_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO11_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO11_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      BC01UO11_A14311CP_BARSER = new String[] {""} ;
      BC01UO11_A14312CP_BARSERD = new String[] {""} ;
      BC01UO11_A14331CP_BARCOLO = new String[] {""} ;
      BC01UO11_A14332CP_BARCOLU = new int[1] ;
      BC01UO11_A14315CP_BARNOMC = new String[] {""} ;
      BC01UO11_A14316CP_BARTIPA = new short[1] ;
      BC01UO11_A14343CP_TARTDSC = new String[] {""} ;
      BC01UO11_A14317CP_BARGIRA = new String[] {""} ;
      BC01UO11_A14318CP_BARACAA = new short[1] ;
      BC01UO11_A14319CP_BARAGRE = new String[] {""} ;
      BC01UO11_A14320CP_BAREXT = new byte[1] ;
      BC01UO11_A14321CP_DISDES = new String[] {""} ;
      BC01UO11_A14322CP_DISCOD = new int[1] ;
      BC01UO11_A14323CP_BARPROP = new String[] {""} ;
      BC01UO11_A14334CP_DSC_BAR = new String[] {""} ;
      BC01UO11_A14324CP_BARDISN = new String[] {""} ;
      BC01UO11_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO11_A14337CP_BARMTR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO11_A14338CP_BARPIE = new int[1] ;
      BC01UO11_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO11_A14340CP_BARALBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01UO11_A14325CP_BARENCC = new String[] {""} ;
      BC01UO11_A14341CP_DISUSRC = new String[] {""} ;
      BC01UO11_A14351CP_BARMAQC = new String[] {""} ;
      BC01UO11_A14352CP_BARESTR = new byte[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.conproduc_bc__default(),
         new Object[] {
             new Object[] {
            BC01UO2_A14297CP_ID, BC01UO2_A14328CP_EMPRCOD, BC01UO2_A14326CP_CLICOD, BC01UO2_A14327CP_CLINOM, BC01UO2_A14301CP_BARCOD, BC01UO2_A14302CP_BARCODR, BC01UO2_A14303CP_BARCODP, BC01UO2_A14304CP_BARFECF, BC01UO2_A14305CP_BARNUMC, BC01UO2_A14306CP_BARPLF,
            BC01UO2_A14307CP_BARSIT, BC01UO2_A14309CP_BARFECC, BC01UO2_A14310CP_BARFECS, BC01UO2_A14308CP_BARFECG, BC01UO2_A14311CP_BARSER, BC01UO2_A14312CP_BARSERD, BC01UO2_A14331CP_BARCOLO, BC01UO2_A14332CP_BARCOLU, BC01UO2_A14315CP_BARNOMC, BC01UO2_A14316CP_BARTIPA,
            BC01UO2_A14343CP_TARTDSC, BC01UO2_A14317CP_BARGIRA, BC01UO2_A14318CP_BARACAA, BC01UO2_A14319CP_BARAGRE, BC01UO2_A14320CP_BAREXT, BC01UO2_A14321CP_DISDES, BC01UO2_A14322CP_DISCOD, BC01UO2_A14323CP_BARPROP, BC01UO2_A14334CP_DSC_BAR, BC01UO2_A14324CP_BARDISN,
            BC01UO2_A14336CP_BARKGM, BC01UO2_A14337CP_BARMTR, BC01UO2_A14338CP_BARPIE, BC01UO2_A14339CP_BARALBK, BC01UO2_A14340CP_BARALBM, BC01UO2_A14325CP_BARENCC, BC01UO2_A14341CP_DISUSRC, BC01UO2_A14351CP_BARMAQC, BC01UO2_A14352CP_BARESTR
            }
            , new Object[] {
            BC01UO3_A14297CP_ID, BC01UO3_A14328CP_EMPRCOD, BC01UO3_A14326CP_CLICOD, BC01UO3_A14327CP_CLINOM, BC01UO3_A14301CP_BARCOD, BC01UO3_A14302CP_BARCODR, BC01UO3_A14303CP_BARCODP, BC01UO3_A14304CP_BARFECF, BC01UO3_A14305CP_BARNUMC, BC01UO3_A14306CP_BARPLF,
            BC01UO3_A14307CP_BARSIT, BC01UO3_A14309CP_BARFECC, BC01UO3_A14310CP_BARFECS, BC01UO3_A14308CP_BARFECG, BC01UO3_A14311CP_BARSER, BC01UO3_A14312CP_BARSERD, BC01UO3_A14331CP_BARCOLO, BC01UO3_A14332CP_BARCOLU, BC01UO3_A14315CP_BARNOMC, BC01UO3_A14316CP_BARTIPA,
            BC01UO3_A14343CP_TARTDSC, BC01UO3_A14317CP_BARGIRA, BC01UO3_A14318CP_BARACAA, BC01UO3_A14319CP_BARAGRE, BC01UO3_A14320CP_BAREXT, BC01UO3_A14321CP_DISDES, BC01UO3_A14322CP_DISCOD, BC01UO3_A14323CP_BARPROP, BC01UO3_A14334CP_DSC_BAR, BC01UO3_A14324CP_BARDISN,
            BC01UO3_A14336CP_BARKGM, BC01UO3_A14337CP_BARMTR, BC01UO3_A14338CP_BARPIE, BC01UO3_A14339CP_BARALBK, BC01UO3_A14340CP_BARALBM, BC01UO3_A14325CP_BARENCC, BC01UO3_A14341CP_DISUSRC, BC01UO3_A14351CP_BARMAQC, BC01UO3_A14352CP_BARESTR
            }
            , new Object[] {
            BC01UO4_A14297CP_ID, BC01UO4_A14328CP_EMPRCOD, BC01UO4_A14326CP_CLICOD, BC01UO4_A14327CP_CLINOM, BC01UO4_A14301CP_BARCOD, BC01UO4_A14302CP_BARCODR, BC01UO4_A14303CP_BARCODP, BC01UO4_A14304CP_BARFECF, BC01UO4_A14305CP_BARNUMC, BC01UO4_A14306CP_BARPLF,
            BC01UO4_A14307CP_BARSIT, BC01UO4_A14309CP_BARFECC, BC01UO4_A14310CP_BARFECS, BC01UO4_A14308CP_BARFECG, BC01UO4_A14311CP_BARSER, BC01UO4_A14312CP_BARSERD, BC01UO4_A14331CP_BARCOLO, BC01UO4_A14332CP_BARCOLU, BC01UO4_A14315CP_BARNOMC, BC01UO4_A14316CP_BARTIPA,
            BC01UO4_A14343CP_TARTDSC, BC01UO4_A14317CP_BARGIRA, BC01UO4_A14318CP_BARACAA, BC01UO4_A14319CP_BARAGRE, BC01UO4_A14320CP_BAREXT, BC01UO4_A14321CP_DISDES, BC01UO4_A14322CP_DISCOD, BC01UO4_A14323CP_BARPROP, BC01UO4_A14334CP_DSC_BAR, BC01UO4_A14324CP_BARDISN,
            BC01UO4_A14336CP_BARKGM, BC01UO4_A14337CP_BARMTR, BC01UO4_A14338CP_BARPIE, BC01UO4_A14339CP_BARALBK, BC01UO4_A14340CP_BARALBM, BC01UO4_A14325CP_BARENCC, BC01UO4_A14341CP_DISUSRC, BC01UO4_A14351CP_BARMAQC, BC01UO4_A14352CP_BARESTR
            }
            , new Object[] {
            BC01UO5_A14297CP_ID
            }
            , new Object[] {
            BC01UO6_A14297CP_ID, BC01UO6_A14328CP_EMPRCOD, BC01UO6_A14326CP_CLICOD, BC01UO6_A14327CP_CLINOM, BC01UO6_A14301CP_BARCOD, BC01UO6_A14302CP_BARCODR, BC01UO6_A14303CP_BARCODP, BC01UO6_A14304CP_BARFECF, BC01UO6_A14305CP_BARNUMC, BC01UO6_A14306CP_BARPLF,
            BC01UO6_A14307CP_BARSIT, BC01UO6_A14309CP_BARFECC, BC01UO6_A14310CP_BARFECS, BC01UO6_A14308CP_BARFECG, BC01UO6_A14311CP_BARSER, BC01UO6_A14312CP_BARSERD, BC01UO6_A14331CP_BARCOLO, BC01UO6_A14332CP_BARCOLU, BC01UO6_A14315CP_BARNOMC, BC01UO6_A14316CP_BARTIPA,
            BC01UO6_A14343CP_TARTDSC, BC01UO6_A14317CP_BARGIRA, BC01UO6_A14318CP_BARACAA, BC01UO6_A14319CP_BARAGRE, BC01UO6_A14320CP_BAREXT, BC01UO6_A14321CP_DISDES, BC01UO6_A14322CP_DISCOD, BC01UO6_A14323CP_BARPROP, BC01UO6_A14334CP_DSC_BAR, BC01UO6_A14324CP_BARDISN,
            BC01UO6_A14336CP_BARKGM, BC01UO6_A14337CP_BARMTR, BC01UO6_A14338CP_BARPIE, BC01UO6_A14339CP_BARALBK, BC01UO6_A14340CP_BARALBM, BC01UO6_A14325CP_BARENCC, BC01UO6_A14341CP_DISUSRC, BC01UO6_A14351CP_BARMAQC, BC01UO6_A14352CP_BARESTR
            }
            , new Object[] {
            BC01UO7_A14297CP_ID, BC01UO7_A14328CP_EMPRCOD, BC01UO7_A14326CP_CLICOD, BC01UO7_A14327CP_CLINOM, BC01UO7_A14301CP_BARCOD, BC01UO7_A14302CP_BARCODR, BC01UO7_A14303CP_BARCODP, BC01UO7_A14304CP_BARFECF, BC01UO7_A14305CP_BARNUMC, BC01UO7_A14306CP_BARPLF,
            BC01UO7_A14307CP_BARSIT, BC01UO7_A14309CP_BARFECC, BC01UO7_A14310CP_BARFECS, BC01UO7_A14308CP_BARFECG, BC01UO7_A14311CP_BARSER, BC01UO7_A14312CP_BARSERD, BC01UO7_A14331CP_BARCOLO, BC01UO7_A14332CP_BARCOLU, BC01UO7_A14315CP_BARNOMC, BC01UO7_A14316CP_BARTIPA,
            BC01UO7_A14343CP_TARTDSC, BC01UO7_A14317CP_BARGIRA, BC01UO7_A14318CP_BARACAA, BC01UO7_A14319CP_BARAGRE, BC01UO7_A14320CP_BAREXT, BC01UO7_A14321CP_DISDES, BC01UO7_A14322CP_DISCOD, BC01UO7_A14323CP_BARPROP, BC01UO7_A14334CP_DSC_BAR, BC01UO7_A14324CP_BARDISN,
            BC01UO7_A14336CP_BARKGM, BC01UO7_A14337CP_BARMTR, BC01UO7_A14338CP_BARPIE, BC01UO7_A14339CP_BARALBK, BC01UO7_A14340CP_BARALBM, BC01UO7_A14325CP_BARENCC, BC01UO7_A14341CP_DISUSRC, BC01UO7_A14351CP_BARMAQC, BC01UO7_A14352CP_BARESTR
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01UO11_A14297CP_ID, BC01UO11_A14328CP_EMPRCOD, BC01UO11_A14326CP_CLICOD, BC01UO11_A14327CP_CLINOM, BC01UO11_A14301CP_BARCOD, BC01UO11_A14302CP_BARCODR, BC01UO11_A14303CP_BARCODP, BC01UO11_A14304CP_BARFECF, BC01UO11_A14305CP_BARNUMC, BC01UO11_A14306CP_BARPLF,
            BC01UO11_A14307CP_BARSIT, BC01UO11_A14309CP_BARFECC, BC01UO11_A14310CP_BARFECS, BC01UO11_A14308CP_BARFECG, BC01UO11_A14311CP_BARSER, BC01UO11_A14312CP_BARSERD, BC01UO11_A14331CP_BARCOLO, BC01UO11_A14332CP_BARCOLU, BC01UO11_A14315CP_BARNOMC, BC01UO11_A14316CP_BARTIPA,
            BC01UO11_A14343CP_TARTDSC, BC01UO11_A14317CP_BARGIRA, BC01UO11_A14318CP_BARACAA, BC01UO11_A14319CP_BARAGRE, BC01UO11_A14320CP_BAREXT, BC01UO11_A14321CP_DISDES, BC01UO11_A14322CP_DISCOD, BC01UO11_A14323CP_BARPROP, BC01UO11_A14334CP_DSC_BAR, BC01UO11_A14324CP_BARDISN,
            BC01UO11_A14336CP_BARKGM, BC01UO11_A14337CP_BARMTR, BC01UO11_A14338CP_BARPIE, BC01UO11_A14339CP_BARALBK, BC01UO11_A14340CP_BARALBM, BC01UO11_A14325CP_BARENCC, BC01UO11_A14341CP_DISUSRC, BC01UO11_A14351CP_BARMAQC, BC01UO11_A14352CP_BARESTR
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121UO2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z14302CP_BARCODR ;
   private byte A14302CP_BARCODR ;
   private byte Z14307CP_BARSIT ;
   private byte A14307CP_BARSIT ;
   private byte Z14320CP_BAREXT ;
   private byte A14320CP_BAREXT ;
   private byte Z14352CP_BARESTR ;
   private byte A14352CP_BARESTR ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z14316CP_BARTIPA ;
   private short A14316CP_BARTIPA ;
   private short Z14318CP_BARACAA ;
   private short A14318CP_BARACAA ;
   private short RcdFound1902 ;
   private short nIsDirty_1902 ;
   private int trnEnded ;
   private int GX_JID ;
   private int Z14326CP_CLICOD ;
   private int A14326CP_CLICOD ;
   private int Z14301CP_BARCOD ;
   private int A14301CP_BARCOD ;
   private int Z14305CP_BARNUMC ;
   private int A14305CP_BARNUMC ;
   private int Z14332CP_BARCOLU ;
   private int A14332CP_BARCOLU ;
   private int Z14322CP_DISCOD ;
   private int A14322CP_DISCOD ;
   private int Z14338CP_BARPIE ;
   private int A14338CP_BARPIE ;
   private long Z14297CP_ID ;
   private long A14297CP_ID ;
   private java.math.BigDecimal Z14336CP_BARKGM ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal Z14337CP_BARMTR ;
   private java.math.BigDecimal A14337CP_BARMTR ;
   private java.math.BigDecimal Z14339CP_BARALBK ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal Z14340CP_BARALBM ;
   private java.math.BigDecimal A14340CP_BARALBM ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV12EmprCod ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String Z14328CP_EMPRCOD ;
   private String A14328CP_EMPRCOD ;
   private String Z14303CP_BARCODP ;
   private String A14303CP_BARCODP ;
   private String Z14306CP_BARPLF ;
   private String A14306CP_BARPLF ;
   private String Z14311CP_BARSER ;
   private String A14311CP_BARSER ;
   private String Z14331CP_BARCOLO ;
   private String A14331CP_BARCOLO ;
   private String Z14319CP_BARAGRE ;
   private String A14319CP_BARAGRE ;
   private String Z14321CP_DISDES ;
   private String A14321CP_DISDES ;
   private String Z14323CP_BARPROP ;
   private String A14323CP_BARPROP ;
   private String Z14324CP_BARDISN ;
   private String A14324CP_BARDISN ;
   private String Z14325CP_BARENCC ;
   private String A14325CP_BARENCC ;
   private String Z14341CP_DISUSRC ;
   private String A14341CP_DISUSRC ;
   private String Z14351CP_BARMAQC ;
   private String A14351CP_BARMAQC ;
   private String sMode1902 ;
   private java.util.Date Z14304CP_BARFECF ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date Z14309CP_BARFECC ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date Z14310CP_BARFECS ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date Z14308CP_BARFECG ;
   private java.util.Date A14308CP_BARFECG ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z14327CP_CLINOM ;
   private String A14327CP_CLINOM ;
   private String Z14312CP_BARSERD ;
   private String A14312CP_BARSERD ;
   private String Z14315CP_BARNOMC ;
   private String A14315CP_BARNOMC ;
   private String Z14343CP_TARTDSC ;
   private String A14343CP_TARTDSC ;
   private String Z14317CP_BARGIRA ;
   private String A14317CP_BARGIRA ;
   private String Z14334CP_DSC_BAR ;
   private String A14334CP_DSC_BAR ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
   private app.produccion.SdtCONPRODUC bcproduccion_CONPRODUC ;
   private IDataStoreProvider pr_default ;
   private long[] BC01UO4_A14297CP_ID ;
   private String[] BC01UO4_A14328CP_EMPRCOD ;
   private int[] BC01UO4_A14326CP_CLICOD ;
   private String[] BC01UO4_A14327CP_CLINOM ;
   private int[] BC01UO4_A14301CP_BARCOD ;
   private byte[] BC01UO4_A14302CP_BARCODR ;
   private String[] BC01UO4_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO4_A14304CP_BARFECF ;
   private int[] BC01UO4_A14305CP_BARNUMC ;
   private String[] BC01UO4_A14306CP_BARPLF ;
   private byte[] BC01UO4_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO4_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO4_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO4_A14308CP_BARFECG ;
   private String[] BC01UO4_A14311CP_BARSER ;
   private String[] BC01UO4_A14312CP_BARSERD ;
   private String[] BC01UO4_A14331CP_BARCOLO ;
   private int[] BC01UO4_A14332CP_BARCOLU ;
   private String[] BC01UO4_A14315CP_BARNOMC ;
   private short[] BC01UO4_A14316CP_BARTIPA ;
   private String[] BC01UO4_A14343CP_TARTDSC ;
   private String[] BC01UO4_A14317CP_BARGIRA ;
   private short[] BC01UO4_A14318CP_BARACAA ;
   private String[] BC01UO4_A14319CP_BARAGRE ;
   private byte[] BC01UO4_A14320CP_BAREXT ;
   private String[] BC01UO4_A14321CP_DISDES ;
   private int[] BC01UO4_A14322CP_DISCOD ;
   private String[] BC01UO4_A14323CP_BARPROP ;
   private String[] BC01UO4_A14334CP_DSC_BAR ;
   private String[] BC01UO4_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO4_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO4_A14337CP_BARMTR ;
   private int[] BC01UO4_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO4_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO4_A14340CP_BARALBM ;
   private String[] BC01UO4_A14325CP_BARENCC ;
   private String[] BC01UO4_A14341CP_DISUSRC ;
   private String[] BC01UO4_A14351CP_BARMAQC ;
   private byte[] BC01UO4_A14352CP_BARESTR ;
   private long[] BC01UO5_A14297CP_ID ;
   private long[] BC01UO6_A14297CP_ID ;
   private String[] BC01UO6_A14328CP_EMPRCOD ;
   private int[] BC01UO6_A14326CP_CLICOD ;
   private String[] BC01UO6_A14327CP_CLINOM ;
   private int[] BC01UO6_A14301CP_BARCOD ;
   private byte[] BC01UO6_A14302CP_BARCODR ;
   private String[] BC01UO6_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO6_A14304CP_BARFECF ;
   private int[] BC01UO6_A14305CP_BARNUMC ;
   private String[] BC01UO6_A14306CP_BARPLF ;
   private byte[] BC01UO6_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO6_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO6_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO6_A14308CP_BARFECG ;
   private String[] BC01UO6_A14311CP_BARSER ;
   private String[] BC01UO6_A14312CP_BARSERD ;
   private String[] BC01UO6_A14331CP_BARCOLO ;
   private int[] BC01UO6_A14332CP_BARCOLU ;
   private String[] BC01UO6_A14315CP_BARNOMC ;
   private short[] BC01UO6_A14316CP_BARTIPA ;
   private String[] BC01UO6_A14343CP_TARTDSC ;
   private String[] BC01UO6_A14317CP_BARGIRA ;
   private short[] BC01UO6_A14318CP_BARACAA ;
   private String[] BC01UO6_A14319CP_BARAGRE ;
   private byte[] BC01UO6_A14320CP_BAREXT ;
   private String[] BC01UO6_A14321CP_DISDES ;
   private int[] BC01UO6_A14322CP_DISCOD ;
   private String[] BC01UO6_A14323CP_BARPROP ;
   private String[] BC01UO6_A14334CP_DSC_BAR ;
   private String[] BC01UO6_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO6_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO6_A14337CP_BARMTR ;
   private int[] BC01UO6_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO6_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO6_A14340CP_BARALBM ;
   private String[] BC01UO6_A14325CP_BARENCC ;
   private String[] BC01UO6_A14341CP_DISUSRC ;
   private String[] BC01UO6_A14351CP_BARMAQC ;
   private byte[] BC01UO6_A14352CP_BARESTR ;
   private long[] BC01UO7_A14297CP_ID ;
   private String[] BC01UO7_A14328CP_EMPRCOD ;
   private int[] BC01UO7_A14326CP_CLICOD ;
   private String[] BC01UO7_A14327CP_CLINOM ;
   private int[] BC01UO7_A14301CP_BARCOD ;
   private byte[] BC01UO7_A14302CP_BARCODR ;
   private String[] BC01UO7_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO7_A14304CP_BARFECF ;
   private int[] BC01UO7_A14305CP_BARNUMC ;
   private String[] BC01UO7_A14306CP_BARPLF ;
   private byte[] BC01UO7_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO7_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO7_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO7_A14308CP_BARFECG ;
   private String[] BC01UO7_A14311CP_BARSER ;
   private String[] BC01UO7_A14312CP_BARSERD ;
   private String[] BC01UO7_A14331CP_BARCOLO ;
   private int[] BC01UO7_A14332CP_BARCOLU ;
   private String[] BC01UO7_A14315CP_BARNOMC ;
   private short[] BC01UO7_A14316CP_BARTIPA ;
   private String[] BC01UO7_A14343CP_TARTDSC ;
   private String[] BC01UO7_A14317CP_BARGIRA ;
   private short[] BC01UO7_A14318CP_BARACAA ;
   private String[] BC01UO7_A14319CP_BARAGRE ;
   private byte[] BC01UO7_A14320CP_BAREXT ;
   private String[] BC01UO7_A14321CP_DISDES ;
   private int[] BC01UO7_A14322CP_DISCOD ;
   private String[] BC01UO7_A14323CP_BARPROP ;
   private String[] BC01UO7_A14334CP_DSC_BAR ;
   private String[] BC01UO7_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO7_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO7_A14337CP_BARMTR ;
   private int[] BC01UO7_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO7_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO7_A14340CP_BARALBM ;
   private String[] BC01UO7_A14325CP_BARENCC ;
   private String[] BC01UO7_A14341CP_DISUSRC ;
   private String[] BC01UO7_A14351CP_BARMAQC ;
   private byte[] BC01UO7_A14352CP_BARESTR ;
   private long[] BC01UO11_A14297CP_ID ;
   private String[] BC01UO11_A14328CP_EMPRCOD ;
   private int[] BC01UO11_A14326CP_CLICOD ;
   private String[] BC01UO11_A14327CP_CLINOM ;
   private int[] BC01UO11_A14301CP_BARCOD ;
   private byte[] BC01UO11_A14302CP_BARCODR ;
   private String[] BC01UO11_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO11_A14304CP_BARFECF ;
   private int[] BC01UO11_A14305CP_BARNUMC ;
   private String[] BC01UO11_A14306CP_BARPLF ;
   private byte[] BC01UO11_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO11_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO11_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO11_A14308CP_BARFECG ;
   private String[] BC01UO11_A14311CP_BARSER ;
   private String[] BC01UO11_A14312CP_BARSERD ;
   private String[] BC01UO11_A14331CP_BARCOLO ;
   private int[] BC01UO11_A14332CP_BARCOLU ;
   private String[] BC01UO11_A14315CP_BARNOMC ;
   private short[] BC01UO11_A14316CP_BARTIPA ;
   private String[] BC01UO11_A14343CP_TARTDSC ;
   private String[] BC01UO11_A14317CP_BARGIRA ;
   private short[] BC01UO11_A14318CP_BARACAA ;
   private String[] BC01UO11_A14319CP_BARAGRE ;
   private byte[] BC01UO11_A14320CP_BAREXT ;
   private String[] BC01UO11_A14321CP_DISDES ;
   private int[] BC01UO11_A14322CP_DISCOD ;
   private String[] BC01UO11_A14323CP_BARPROP ;
   private String[] BC01UO11_A14334CP_DSC_BAR ;
   private String[] BC01UO11_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO11_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO11_A14337CP_BARMTR ;
   private int[] BC01UO11_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO11_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO11_A14340CP_BARALBM ;
   private String[] BC01UO11_A14325CP_BARENCC ;
   private String[] BC01UO11_A14341CP_DISUSRC ;
   private String[] BC01UO11_A14351CP_BARMAQC ;
   private byte[] BC01UO11_A14352CP_BARESTR ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private long[] BC01UO2_A14297CP_ID ;
   private String[] BC01UO2_A14328CP_EMPRCOD ;
   private int[] BC01UO2_A14326CP_CLICOD ;
   private String[] BC01UO2_A14327CP_CLINOM ;
   private int[] BC01UO2_A14301CP_BARCOD ;
   private byte[] BC01UO2_A14302CP_BARCODR ;
   private String[] BC01UO2_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO2_A14304CP_BARFECF ;
   private int[] BC01UO2_A14305CP_BARNUMC ;
   private String[] BC01UO2_A14306CP_BARPLF ;
   private byte[] BC01UO2_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO2_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO2_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO2_A14308CP_BARFECG ;
   private String[] BC01UO2_A14311CP_BARSER ;
   private String[] BC01UO2_A14312CP_BARSERD ;
   private String[] BC01UO2_A14331CP_BARCOLO ;
   private int[] BC01UO2_A14332CP_BARCOLU ;
   private String[] BC01UO2_A14315CP_BARNOMC ;
   private short[] BC01UO2_A14316CP_BARTIPA ;
   private String[] BC01UO2_A14343CP_TARTDSC ;
   private String[] BC01UO2_A14317CP_BARGIRA ;
   private short[] BC01UO2_A14318CP_BARACAA ;
   private String[] BC01UO2_A14319CP_BARAGRE ;
   private byte[] BC01UO2_A14320CP_BAREXT ;
   private String[] BC01UO2_A14321CP_DISDES ;
   private int[] BC01UO2_A14322CP_DISCOD ;
   private String[] BC01UO2_A14323CP_BARPROP ;
   private String[] BC01UO2_A14334CP_DSC_BAR ;
   private String[] BC01UO2_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO2_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO2_A14337CP_BARMTR ;
   private int[] BC01UO2_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO2_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO2_A14340CP_BARALBM ;
   private String[] BC01UO2_A14325CP_BARENCC ;
   private String[] BC01UO2_A14341CP_DISUSRC ;
   private String[] BC01UO2_A14351CP_BARMAQC ;
   private byte[] BC01UO2_A14352CP_BARESTR ;
   private long[] BC01UO3_A14297CP_ID ;
   private String[] BC01UO3_A14328CP_EMPRCOD ;
   private int[] BC01UO3_A14326CP_CLICOD ;
   private String[] BC01UO3_A14327CP_CLINOM ;
   private int[] BC01UO3_A14301CP_BARCOD ;
   private byte[] BC01UO3_A14302CP_BARCODR ;
   private String[] BC01UO3_A14303CP_BARCODP ;
   private java.util.Date[] BC01UO3_A14304CP_BARFECF ;
   private int[] BC01UO3_A14305CP_BARNUMC ;
   private String[] BC01UO3_A14306CP_BARPLF ;
   private byte[] BC01UO3_A14307CP_BARSIT ;
   private java.util.Date[] BC01UO3_A14309CP_BARFECC ;
   private java.util.Date[] BC01UO3_A14310CP_BARFECS ;
   private java.util.Date[] BC01UO3_A14308CP_BARFECG ;
   private String[] BC01UO3_A14311CP_BARSER ;
   private String[] BC01UO3_A14312CP_BARSERD ;
   private String[] BC01UO3_A14331CP_BARCOLO ;
   private int[] BC01UO3_A14332CP_BARCOLU ;
   private String[] BC01UO3_A14315CP_BARNOMC ;
   private short[] BC01UO3_A14316CP_BARTIPA ;
   private String[] BC01UO3_A14343CP_TARTDSC ;
   private String[] BC01UO3_A14317CP_BARGIRA ;
   private short[] BC01UO3_A14318CP_BARACAA ;
   private String[] BC01UO3_A14319CP_BARAGRE ;
   private byte[] BC01UO3_A14320CP_BAREXT ;
   private String[] BC01UO3_A14321CP_DISDES ;
   private int[] BC01UO3_A14322CP_DISCOD ;
   private String[] BC01UO3_A14323CP_BARPROP ;
   private String[] BC01UO3_A14334CP_DSC_BAR ;
   private String[] BC01UO3_A14324CP_BARDISN ;
   private java.math.BigDecimal[] BC01UO3_A14336CP_BARKGM ;
   private java.math.BigDecimal[] BC01UO3_A14337CP_BARMTR ;
   private int[] BC01UO3_A14338CP_BARPIE ;
   private java.math.BigDecimal[] BC01UO3_A14339CP_BARALBK ;
   private java.math.BigDecimal[] BC01UO3_A14340CP_BARALBM ;
   private String[] BC01UO3_A14325CP_BARENCC ;
   private String[] BC01UO3_A14341CP_DISUSRC ;
   private String[] BC01UO3_A14351CP_BARMAQC ;
   private byte[] BC01UO3_A14352CP_BARESTR ;
   private app.wwpbaseobjects.SdtWWPContext AV7WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
}

final  class conproduc_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class conproduc_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01UO2", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ?  FOR UPDATE OF CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UO3", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UO4", "SELECT /*+ FIRST_ROWS(100) */ TM1.CP_ID, TM1.CP_EMPRCOD, TM1.CP_CLICOD, TM1.CP_CLINOM, TM1.CP_BARCOD, TM1.CP_BARCODR, TM1.CP_BARCODP, TM1.CP_BARFECF, TM1.CP_BARNUMC, TM1.CP_BARPLF, TM1.CP_BARSIT, TM1.CP_BARFECC, TM1.CP_BARFECS, TM1.CP_BARFECG, TM1.CP_BARSER, TM1.CP_BARSERD, TM1.CP_BARCOLO, TM1.CP_BARCOLU, TM1.CP_BARNOMC, TM1.CP_BARTIPA, TM1.CP_TARTDSC, TM1.CP_BARGIRA, TM1.CP_BARACAA, TM1.CP_BARAGRE, TM1.CP_BAREXT, TM1.CP_DISDES, TM1.CP_DISCOD, TM1.CP_BARPROP, TM1.CP_DSC_BAR, TM1.CP_BARDISN, TM1.CP_BARKGM, TM1.CP_BARMTR, TM1.CP_BARPIE, TM1.CP_BARALBK, TM1.CP_BARALBM, TM1.CP_BARENCC, TM1.CP_DISUSRC, TM1.CP_BARMAQC, TM1.CP_BARESTR FROM TXPCONPRO TM1 WHERE TM1.CP_ID = ? ORDER BY TM1.CP_ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UO5", "SELECT /*+ FIRST_ROWS(1) */ CP_ID FROM TXPCONPRO WHERE CP_ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UO6", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UO7", "SELECT CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR FROM TXPCONPRO WHERE CP_ID = ?  FOR UPDATE OF CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01UO8", "INSERT INTO TXPCONPRO(CP_ID, CP_EMPRCOD, CP_CLICOD, CP_CLINOM, CP_BARCOD, CP_BARCODR, CP_BARCODP, CP_BARFECF, CP_BARNUMC, CP_BARPLF, CP_BARSIT, CP_BARFECC, CP_BARFECS, CP_BARFECG, CP_BARSER, CP_BARSERD, CP_BARCOLO, CP_BARCOLU, CP_BARNOMC, CP_BARTIPA, CP_TARTDSC, CP_BARGIRA, CP_BARACAA, CP_BARAGRE, CP_BAREXT, CP_DISDES, CP_DISCOD, CP_BARPROP, CP_DSC_BAR, CP_BARDISN, CP_BARKGM, CP_BARMTR, CP_BARPIE, CP_BARALBK, CP_BARALBM, CP_BARENCC, CP_DISUSRC, CP_BARMAQC, CP_BARESTR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCONPRO")
         ,new UpdateCursor("BC01UO9", "UPDATE TXPCONPRO SET CP_EMPRCOD=?, CP_CLICOD=?, CP_CLINOM=?, CP_BARCOD=?, CP_BARCODR=?, CP_BARCODP=?, CP_BARFECF=?, CP_BARNUMC=?, CP_BARPLF=?, CP_BARSIT=?, CP_BARFECC=?, CP_BARFECS=?, CP_BARFECG=?, CP_BARSER=?, CP_BARSERD=?, CP_BARCOLO=?, CP_BARCOLU=?, CP_BARNOMC=?, CP_BARTIPA=?, CP_TARTDSC=?, CP_BARGIRA=?, CP_BARACAA=?, CP_BARAGRE=?, CP_BAREXT=?, CP_DISDES=?, CP_DISCOD=?, CP_BARPROP=?, CP_DSC_BAR=?, CP_BARDISN=?, CP_BARKGM=?, CP_BARMTR=?, CP_BARPIE=?, CP_BARALBK=?, CP_BARALBM=?, CP_BARENCC=?, CP_DISUSRC=?, CP_BARMAQC=?, CP_BARESTR=?  WHERE CP_ID = ?", GX_NOMASK, "TXPCONPRO")
         ,new UpdateCursor("BC01UO10", "DELETE FROM TXPCONPRO  WHERE CP_ID = ?", GX_NOMASK, "TXPCONPRO")
         ,new ForEachCursor("BC01UO11", "SELECT /*+ FIRST_ROWS(100) */ TM1.CP_ID, TM1.CP_EMPRCOD, TM1.CP_CLICOD, TM1.CP_CLINOM, TM1.CP_BARCOD, TM1.CP_BARCODR, TM1.CP_BARCODP, TM1.CP_BARFECF, TM1.CP_BARNUMC, TM1.CP_BARPLF, TM1.CP_BARSIT, TM1.CP_BARFECC, TM1.CP_BARFECS, TM1.CP_BARFECG, TM1.CP_BARSER, TM1.CP_BARSERD, TM1.CP_BARCOLO, TM1.CP_BARCOLU, TM1.CP_BARNOMC, TM1.CP_BARTIPA, TM1.CP_TARTDSC, TM1.CP_BARGIRA, TM1.CP_BARACAA, TM1.CP_BARAGRE, TM1.CP_BAREXT, TM1.CP_DISDES, TM1.CP_DISCOD, TM1.CP_BARPROP, TM1.CP_DSC_BAR, TM1.CP_BARDISN, TM1.CP_BARKGM, TM1.CP_BARMTR, TM1.CP_BARPIE, TM1.CP_BARALBK, TM1.CP_BARALBM, TM1.CP_BARENCC, TM1.CP_DISUSRC, TM1.CP_BARMAQC, TM1.CP_BARESTR FROM TXPCONPRO TM1 WHERE TM1.CP_ID = ? ORDER BY TM1.CP_ID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 16);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 13);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((String[]) buf[20])[0] = rslt.getVarchar(21);
               ((String[]) buf[21])[0] = rslt.getVarchar(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(25);
               ((String[]) buf[25])[0] = rslt.getString(26, 1);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               ((String[]) buf[27])[0] = rslt.getString(28, 8);
               ((String[]) buf[28])[0] = rslt.getVarchar(29);
               ((String[]) buf[29])[0] = rslt.getString(30, 8);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(32,2);
               ((int[]) buf[32])[0] = rslt.getInt(33);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((String[]) buf[35])[0] = rslt.getString(36, 20);
               ((String[]) buf[36])[0] = rslt.getString(37, 8);
               ((String[]) buf[37])[0] = rslt.getString(38, 6);
               ((byte[]) buf[38])[0] = rslt.getByte(39);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setVarchar(4, (String)parms[3], 100, false);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setDate(8, (java.util.Date)parms[7]);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setString(15, (String)parms[14], 16);
               stmt.setVarchar(16, (String)parms[15], 100, false);
               stmt.setString(17, (String)parms[16], 13);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setVarchar(19, (String)parms[18], 100, false);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setVarchar(21, (String)parms[20], 40, false);
               stmt.setVarchar(22, (String)parms[21], 100, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setString(26, (String)parms[25], 1);
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 8);
               stmt.setVarchar(29, (String)parms[28], 100, false);
               stmt.setString(30, (String)parms[29], 8);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[31], 2);
               stmt.setInt(33, ((Number) parms[32]).intValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 2);
               stmt.setString(36, (String)parms[35], 20);
               stmt.setString(37, (String)parms[36], 8);
               stmt.setString(38, (String)parms[37], 6);
               stmt.setByte(39, ((Number) parms[38]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setVarchar(3, (String)parms[2], 100, false);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setString(14, (String)parms[13], 16);
               stmt.setVarchar(15, (String)parms[14], 100, false);
               stmt.setString(16, (String)parms[15], 13);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setVarchar(18, (String)parms[17], 100, false);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setVarchar(20, (String)parms[19], 40, false);
               stmt.setVarchar(21, (String)parms[20], 100, false);
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 8);
               stmt.setVarchar(28, (String)parms[27], 100, false);
               stmt.setString(29, (String)parms[28], 8);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[30], 2);
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setString(35, (String)parms[34], 20);
               stmt.setString(36, (String)parms[35], 8);
               stmt.setString(37, (String)parms[36], 6);
               stmt.setByte(38, ((Number) parms[37]).byteValue());
               stmt.setLong(39, ((Number) parms[38]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

