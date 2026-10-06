package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class obsalb_trn_bc extends GXWebPanel implements IGxSilentTrn
{
   public obsalb_trn_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public obsalb_trn_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obsalb_trn_bc.class ));
   }

   public obsalb_trn_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1Q9121( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1Q9121( ) ;
      standaloneModal( ) ;
      addRow1Q9121( ) ;
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z30AlbProCod = A30AlbProCod ;
            Z915AlbPObsLin = A915AlbPObsLin ;
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

   public void confirm_1Q90( )
   {
      beforeValidate1Q9121( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1Q9121( ) ;
         }
         else
         {
            checkExtendedTable1Q9121( ) ;
            if ( AnyError == 0 )
            {
               zm1Q9121( 6) ;
            }
            closeExtendedTableCursors1Q9121( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1Q9121( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z916AlbPObs = A916AlbPObs ;
      }
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z33AlbProEst = A33AlbProEst ;
      }
      if ( GX_JID == -5 )
      {
         Z915AlbPObsLin = A915AlbPObsLin ;
         Z916AlbPObs = A916AlbPObs ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z33AlbProEst = A33AlbProEst ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1Q9121( )
   {
      /* Using cursor BC01Q96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A914AlbPObsCon = BC01Q96_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q96_A33AlbProEst[0] ;
         A916AlbPObs = BC01Q96_A916AlbPObs[0] ;
         zm1Q9121( -5) ;
      }
      pr_default.close(4);
      onLoadActions1Q9121( ) ;
   }

   public void onLoadActions1Q9121( )
   {
      O914AlbPObsCon = A914AlbPObsCon ;
      if ( isIns( )  )
      {
         A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
      }
      if ( isIns( )  )
      {
         A915AlbPObsLin = A914AlbPObsCon ;
      }
   }

   public void checkExtendedTable1Q9121( )
   {
      nIsDirty_121 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01Q97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      A914AlbPObsCon = BC01Q97_A914AlbPObsCon[0] ;
      A33AlbProEst = BC01Q97_A33AlbProEst[0] ;
      nIsDirty_121 = (short)(1) ;
      O914AlbPObsCon = A914AlbPObsCon ;
      pr_default.close(5);
      if ( isIns( )  )
      {
         nIsDirty_121 = (short)(1) ;
         A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
      }
      if ( isIns( )  )
      {
         nIsDirty_121 = (short)(1) ;
         A915AlbPObsLin = A914AlbPObsCon ;
      }
   }

   public void closeExtendedTableCursors1Q9121( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey1Q9121( )
   {
      /* Using cursor BC01Q98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound121 = (short)(1) ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01Q99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm1Q9121( 5) ;
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = BC01Q99_A915AlbPObsLin[0] ;
         A916AlbPObs = BC01Q99_A916AlbPObs[0] ;
         A396EmprCod = BC01Q99_A396EmprCod[0] ;
         A30AlbProCod = BC01Q99_A30AlbProCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1Q9121( ) ;
         if ( AnyError == 1 )
         {
            RcdFound121 = (short)(0) ;
            initializeNonKey1Q9121( ) ;
         }
         Gx_mode = sMode121 ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
         initializeNonKey1Q9121( ) ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode121 ;
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1Q9121( ) ;
      if ( RcdFound121 == 0 )
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
      confirm_1Q90( ) ;
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

   public void checkOptimisticConcurrency1Q9121( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01Q910 */
         pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(8) == 101) || ( GXutil.strcmp(Z916AlbPObs, BC01Q910_A916AlbPObs[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor BC01Q911 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( Z33AlbProEst != BC01Q911_A33AlbProEst[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q9121( )
   {
      beforeValidate1Q9121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q9121( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q9121( 0) ;
         checkOptimisticConcurrency1Q9121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q9121( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q9121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01Q912 */
                  pr_default.execute(10, new Object[] {Byte.valueOf(A915AlbPObsLin), A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(10) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11Q9121( ) ;
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
            load1Q9121( ) ;
         }
         endLevel1Q9121( ) ;
      }
      closeExtendedTableCursors1Q9121( ) ;
   }

   public void update1Q9121( )
   {
      beforeValidate1Q9121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q9121( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q9121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q9121( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q9121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01Q913 */
                  pr_default.execute(11, new Object[] {A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q9121( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11Q9121( ) ;
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
         endLevel1Q9121( ) ;
      }
      closeExtendedTableCursors1Q9121( ) ;
   }

   public void deferredUpdate1Q9121( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1Q9121( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q9121( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q9121( ) ;
         afterConfirm1Q9121( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q9121( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01Q914 */
               pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
               if ( AnyError == 0 )
               {
                  updateTablesN11Q9121( ) ;
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
      sMode121 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1Q9121( ) ;
      Gx_mode = sMode121 ;
   }

   public void onDeleteControls1Q9121( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01Q915 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         zm1Q9121( 6) ;
         A914AlbPObsCon = BC01Q915_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q915_A33AlbProEst[0] ;
         O914AlbPObsCon = A914AlbPObsCon ;
         pr_default.close(13);
         if ( isIns( )  )
         {
            A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
         }
      }
   }

   public void updateTablesN11Q9121( )
   {
      /* Using cursor BC01Q916 */
      pr_default.execute(14, new Object[] {Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
   }

   public void endLevel1Q9121( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      pr_default.close(9);
      if ( AnyError == 0 )
      {
         beforeComplete1Q9121( ) ;
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

   public void scanKeyStart1Q9121( )
   {
      /* Using cursor BC01Q917 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = BC01Q917_A915AlbPObsLin[0] ;
         A914AlbPObsCon = BC01Q917_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q917_A33AlbProEst[0] ;
         A916AlbPObs = BC01Q917_A916AlbPObs[0] ;
         A396EmprCod = BC01Q917_A396EmprCod[0] ;
         A30AlbProCod = BC01Q917_A30AlbProCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1Q9121( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound121 = (short)(0) ;
      scanKeyLoad1Q9121( ) ;
   }

   public void scanKeyLoad1Q9121( )
   {
      sMode121 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = BC01Q917_A915AlbPObsLin[0] ;
         A914AlbPObsCon = BC01Q917_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q917_A33AlbProEst[0] ;
         A916AlbPObs = BC01Q917_A916AlbPObs[0] ;
         A396EmprCod = BC01Q917_A396EmprCod[0] ;
         A30AlbProCod = BC01Q917_A30AlbProCod[0] ;
      }
      Gx_mode = sMode121 ;
   }

   public void scanKeyEnd1Q9121( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1Q9121( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q9121( )
   {
      /* Before Insert Rules */
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdate1Q9121( )
   {
      /* Before Update Rules */
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDelete1Q9121( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q9121( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q9121( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q9121( )
   {
   }

   public void send_integrity_lvl_hashes1Q9121( )
   {
   }

   public void addRow1Q9121( )
   {
      VarsToRow121( bcObsalb_TRN) ;
   }

   public void readRow1Q9121( )
   {
      RowToVars121( bcObsalb_TRN, 1) ;
   }

   public void initializeNonKey1Q9121( )
   {
      A914AlbPObsCon = (byte)(0) ;
      A33AlbProEst = (byte)(0) ;
      A916AlbPObs = "" ;
      O914AlbPObsCon = A914AlbPObsCon ;
      Z916AlbPObs = "" ;
      Z33AlbProEst = (byte)(0) ;
   }

   public void initAll1Q9121( )
   {
      A396EmprCod = "" ;
      A30AlbProCod = 0 ;
      A915AlbPObsLin = (byte)(0) ;
      initializeNonKey1Q9121( ) ;
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

   public void VarsToRow121( app.SdtObsalb_TRN obj121 )
   {
      obj121.setgxTv_SdtObsalb_TRN_Mode( Gx_mode );
      obj121.setgxTv_SdtObsalb_TRN_Albpobscon( A914AlbPObsCon );
      obj121.setgxTv_SdtObsalb_TRN_Albproest( A33AlbProEst );
      obj121.setgxTv_SdtObsalb_TRN_Albpobs( A916AlbPObs );
      obj121.setgxTv_SdtObsalb_TRN_Emprcod( A396EmprCod );
      obj121.setgxTv_SdtObsalb_TRN_Albprocod( A30AlbProCod );
      obj121.setgxTv_SdtObsalb_TRN_Albpobslin( A915AlbPObsLin );
      obj121.setgxTv_SdtObsalb_TRN_Emprcod_Z( Z396EmprCod );
      obj121.setgxTv_SdtObsalb_TRN_Albprocod_Z( Z30AlbProCod );
      obj121.setgxTv_SdtObsalb_TRN_Albpobscon_Z( Z914AlbPObsCon );
      obj121.setgxTv_SdtObsalb_TRN_Albproest_Z( Z33AlbProEst );
      obj121.setgxTv_SdtObsalb_TRN_Albpobslin_Z( Z915AlbPObsLin );
      obj121.setgxTv_SdtObsalb_TRN_Albpobs_Z( Z916AlbPObs );
      obj121.setgxTv_SdtObsalb_TRN_Mode( Gx_mode );
   }

   public void KeyVarsToRow121( app.SdtObsalb_TRN obj121 )
   {
      obj121.setgxTv_SdtObsalb_TRN_Emprcod( A396EmprCod );
      obj121.setgxTv_SdtObsalb_TRN_Albprocod( A30AlbProCod );
      obj121.setgxTv_SdtObsalb_TRN_Albpobslin( A915AlbPObsLin );
   }

   public void RowToVars121( app.SdtObsalb_TRN obj121 ,
                             int forceLoad )
   {
      Gx_mode = obj121.getgxTv_SdtObsalb_TRN_Mode() ;
      if ( forceLoad == 1 )
      {
         A914AlbPObsCon = obj121.getgxTv_SdtObsalb_TRN_Albpobscon() ;
      }
      A33AlbProEst = obj121.getgxTv_SdtObsalb_TRN_Albproest() ;
      if ( ! ( ( obj121.getgxTv_SdtObsalb_TRN_Albproest() == 2 ) ) || ( forceLoad == 1 ) )
      {
         A916AlbPObs = obj121.getgxTv_SdtObsalb_TRN_Albpobs() ;
      }
      A396EmprCod = obj121.getgxTv_SdtObsalb_TRN_Emprcod() ;
      A30AlbProCod = obj121.getgxTv_SdtObsalb_TRN_Albprocod() ;
      A915AlbPObsLin = obj121.getgxTv_SdtObsalb_TRN_Albpobslin() ;
      Z396EmprCod = obj121.getgxTv_SdtObsalb_TRN_Emprcod_Z() ;
      Z30AlbProCod = obj121.getgxTv_SdtObsalb_TRN_Albprocod_Z() ;
      Z914AlbPObsCon = obj121.getgxTv_SdtObsalb_TRN_Albpobscon_Z() ;
      O914AlbPObsCon = obj121.getgxTv_SdtObsalb_TRN_Albpobscon_Z() ;
      Z33AlbProEst = obj121.getgxTv_SdtObsalb_TRN_Albproest_Z() ;
      Z915AlbPObsLin = obj121.getgxTv_SdtObsalb_TRN_Albpobslin_Z() ;
      Z916AlbPObs = obj121.getgxTv_SdtObsalb_TRN_Albpobs_Z() ;
      Gx_mode = obj121.getgxTv_SdtObsalb_TRN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A30AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      A915AlbPObsLin = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1Q9121( ) ;
      scanKeyStart1Q9121( ) ;
      if ( RcdFound121 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01Q918 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(16) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
            AnyError = (short)(1) ;
         }
         A914AlbPObsCon = BC01Q918_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q918_A33AlbProEst[0] ;
         pr_default.close(16);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         O914AlbPObsCon = A914AlbPObsCon ;
      }
      zm1Q9121( -5) ;
      onLoadActions1Q9121( ) ;
      addRow1Q9121( ) ;
      scanKeyEnd1Q9121( ) ;
      if ( RcdFound121 == 0 )
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
      RowToVars121( bcObsalb_TRN, 0) ;
      scanKeyStart1Q9121( ) ;
      if ( RcdFound121 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01Q919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(17) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
            AnyError = (short)(1) ;
         }
         A914AlbPObsCon = BC01Q919_A914AlbPObsCon[0] ;
         A33AlbProEst = BC01Q919_A33AlbProEst[0] ;
         pr_default.close(17);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         O914AlbPObsCon = A914AlbPObsCon ;
      }
      zm1Q9121( -5) ;
      onLoadActions1Q9121( ) ;
      addRow1Q9121( ) ;
      scanKeyEnd1Q9121( ) ;
      if ( RcdFound121 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q9121( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1Q9121( ) ;
      }
      else
      {
         if ( RcdFound121 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               A30AlbProCod = Z30AlbProCod ;
               A915AlbPObsLin = Z915AlbPObsLin ;
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
               update1Q9121( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
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
                     insert1Q9121( ) ;
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
                     insert1Q9121( ) ;
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
      RowToVars121( bcObsalb_TRN, 1) ;
      saveImpl( ) ;
      VarsToRow121( bcObsalb_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars121( bcObsalb_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1Q9121( ) ;
      afterTrn( ) ;
      VarsToRow121( bcObsalb_TRN) ;
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
         app.SdtObsalb_TRN auxBC = new app.SdtObsalb_TRN( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A30AlbProCod, A915AlbPObsLin);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcObsalb_TRN);
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
      RowToVars121( bcObsalb_TRN, 1) ;
      updateImpl( ) ;
      VarsToRow121( bcObsalb_TRN) ;
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
      RowToVars121( bcObsalb_TRN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1Q9121( ) ;
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
      VarsToRow121( bcObsalb_TRN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars121( bcObsalb_TRN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1Q9121( ) ;
      if ( RcdFound121 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
         {
            A396EmprCod = Z396EmprCod ;
            A30AlbProCod = Z30AlbProCod ;
            A915AlbPObsLin = Z915AlbPObsLin ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "obsalb_trn_bc");
      VarsToRow121( bcObsalb_TRN) ;
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
      Gx_mode = bcObsalb_TRN.getgxTv_SdtObsalb_TRN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcObsalb_TRN.setgxTv_SdtObsalb_TRN_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtObsalb_TRN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcObsalb_TRN )
      {
         bcObsalb_TRN = sdt ;
         if ( GXutil.strcmp(bcObsalb_TRN.getgxTv_SdtObsalb_TRN_Mode(), "") == 0 )
         {
            bcObsalb_TRN.setgxTv_SdtObsalb_TRN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow121( bcObsalb_TRN) ;
         }
         else
         {
            RowToVars121( bcObsalb_TRN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcObsalb_TRN.getgxTv_SdtObsalb_TRN_Mode(), "") == 0 )
         {
            bcObsalb_TRN.setgxTv_SdtObsalb_TRN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars121( bcObsalb_TRN, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtObsalb_TRN getObsalb_TRN_BC( )
   {
      return bcObsalb_TRN ;
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
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z916AlbPObs = "" ;
      A916AlbPObs = "" ;
      BC01Q96_A915AlbPObsLin = new byte[1] ;
      BC01Q96_A914AlbPObsCon = new byte[1] ;
      BC01Q96_A33AlbProEst = new byte[1] ;
      BC01Q96_A916AlbPObs = new String[] {""} ;
      BC01Q96_A396EmprCod = new String[] {""} ;
      BC01Q96_A30AlbProCod = new long[1] ;
      BC01Q97_A914AlbPObsCon = new byte[1] ;
      BC01Q97_A33AlbProEst = new byte[1] ;
      BC01Q98_A396EmprCod = new String[] {""} ;
      BC01Q98_A30AlbProCod = new long[1] ;
      BC01Q98_A915AlbPObsLin = new byte[1] ;
      BC01Q99_A915AlbPObsLin = new byte[1] ;
      BC01Q99_A916AlbPObs = new String[] {""} ;
      BC01Q99_A396EmprCod = new String[] {""} ;
      BC01Q99_A30AlbProCod = new long[1] ;
      sMode121 = "" ;
      BC01Q910_A915AlbPObsLin = new byte[1] ;
      BC01Q910_A916AlbPObs = new String[] {""} ;
      BC01Q910_A396EmprCod = new String[] {""} ;
      BC01Q910_A30AlbProCod = new long[1] ;
      BC01Q911_A914AlbPObsCon = new byte[1] ;
      BC01Q911_A33AlbProEst = new byte[1] ;
      BC01Q915_A914AlbPObsCon = new byte[1] ;
      BC01Q915_A33AlbProEst = new byte[1] ;
      BC01Q917_A915AlbPObsLin = new byte[1] ;
      BC01Q917_A914AlbPObsCon = new byte[1] ;
      BC01Q917_A33AlbProEst = new byte[1] ;
      BC01Q917_A916AlbPObs = new String[] {""} ;
      BC01Q917_A396EmprCod = new String[] {""} ;
      BC01Q917_A30AlbProCod = new long[1] ;
      N916AlbPObs = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01Q918_A914AlbPObsCon = new byte[1] ;
      BC01Q918_A33AlbProEst = new byte[1] ;
      BC01Q919_A914AlbPObsCon = new byte[1] ;
      BC01Q919_A33AlbProEst = new byte[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.obsalb_trn_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.obsalb_trn_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.obsalb_trn_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obsalb_trn_bc__default(),
         new Object[] {
             new Object[] {
            BC01Q92_A915AlbPObsLin, BC01Q92_A916AlbPObs, BC01Q92_A396EmprCod, BC01Q92_A30AlbProCod
            }
            , new Object[] {
            BC01Q93_A915AlbPObsLin, BC01Q93_A916AlbPObs, BC01Q93_A396EmprCod, BC01Q93_A30AlbProCod
            }
            , new Object[] {
            BC01Q94_A914AlbPObsCon, BC01Q94_A33AlbProEst
            }
            , new Object[] {
            BC01Q95_A914AlbPObsCon, BC01Q95_A33AlbProEst
            }
            , new Object[] {
            BC01Q96_A915AlbPObsLin, BC01Q96_A914AlbPObsCon, BC01Q96_A33AlbProEst, BC01Q96_A916AlbPObs, BC01Q96_A396EmprCod, BC01Q96_A30AlbProCod
            }
            , new Object[] {
            BC01Q97_A914AlbPObsCon, BC01Q97_A33AlbProEst
            }
            , new Object[] {
            BC01Q98_A396EmprCod, BC01Q98_A30AlbProCod, BC01Q98_A915AlbPObsLin
            }
            , new Object[] {
            BC01Q99_A915AlbPObsLin, BC01Q99_A916AlbPObs, BC01Q99_A396EmprCod, BC01Q99_A30AlbProCod
            }
            , new Object[] {
            BC01Q910_A915AlbPObsLin, BC01Q910_A916AlbPObs, BC01Q910_A396EmprCod, BC01Q910_A30AlbProCod
            }
            , new Object[] {
            BC01Q911_A914AlbPObsCon, BC01Q911_A33AlbProEst
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01Q915_A914AlbPObsCon, BC01Q915_A33AlbProEst
            }
            , new Object[] {
            }
            , new Object[] {
            BC01Q917_A915AlbPObsLin, BC01Q917_A914AlbPObsCon, BC01Q917_A33AlbProEst, BC01Q917_A916AlbPObs, BC01Q917_A396EmprCod, BC01Q917_A30AlbProCod
            }
            , new Object[] {
            BC01Q918_A914AlbPObsCon, BC01Q918_A33AlbProEst
            }
            , new Object[] {
            BC01Q919_A914AlbPObsCon, BC01Q919_A33AlbProEst
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z915AlbPObsLin ;
   private byte A915AlbPObsLin ;
   private byte Z33AlbProEst ;
   private byte A33AlbProEst ;
   private byte Z914AlbPObsCon ;
   private byte A914AlbPObsCon ;
   private byte O914AlbPObsCon ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound121 ;
   private short nIsDirty_121 ;
   private int trnEnded ;
   private int GX_JID ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z916AlbPObs ;
   private String A916AlbPObs ;
   private String sMode121 ;
   private String N916AlbPObs ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.SdtObsalb_TRN bcObsalb_TRN ;
   private IDataStoreProvider pr_default ;
   private byte[] BC01Q96_A915AlbPObsLin ;
   private byte[] BC01Q96_A914AlbPObsCon ;
   private byte[] BC01Q96_A33AlbProEst ;
   private String[] BC01Q96_A916AlbPObs ;
   private String[] BC01Q96_A396EmprCod ;
   private long[] BC01Q96_A30AlbProCod ;
   private byte[] BC01Q97_A914AlbPObsCon ;
   private byte[] BC01Q97_A33AlbProEst ;
   private String[] BC01Q98_A396EmprCod ;
   private long[] BC01Q98_A30AlbProCod ;
   private byte[] BC01Q98_A915AlbPObsLin ;
   private byte[] BC01Q99_A915AlbPObsLin ;
   private String[] BC01Q99_A916AlbPObs ;
   private String[] BC01Q99_A396EmprCod ;
   private long[] BC01Q99_A30AlbProCod ;
   private byte[] BC01Q910_A915AlbPObsLin ;
   private String[] BC01Q910_A916AlbPObs ;
   private String[] BC01Q910_A396EmprCod ;
   private long[] BC01Q910_A30AlbProCod ;
   private byte[] BC01Q911_A914AlbPObsCon ;
   private byte[] BC01Q911_A33AlbProEst ;
   private byte[] BC01Q915_A914AlbPObsCon ;
   private byte[] BC01Q915_A33AlbProEst ;
   private byte[] BC01Q917_A915AlbPObsLin ;
   private byte[] BC01Q917_A914AlbPObsCon ;
   private byte[] BC01Q917_A33AlbProEst ;
   private String[] BC01Q917_A916AlbPObs ;
   private String[] BC01Q917_A396EmprCod ;
   private long[] BC01Q917_A30AlbProCod ;
   private byte[] BC01Q918_A914AlbPObsCon ;
   private byte[] BC01Q918_A33AlbProEst ;
   private byte[] BC01Q919_A914AlbPObsCon ;
   private byte[] BC01Q919_A33AlbProEst ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private byte[] BC01Q92_A915AlbPObsLin ;
   private String[] BC01Q92_A916AlbPObs ;
   private String[] BC01Q92_A396EmprCod ;
   private long[] BC01Q92_A30AlbProCod ;
   private byte[] BC01Q93_A915AlbPObsLin ;
   private String[] BC01Q93_A916AlbPObs ;
   private String[] BC01Q93_A396EmprCod ;
   private long[] BC01Q93_A30AlbProCod ;
   private byte[] BC01Q94_A914AlbPObsCon ;
   private byte[] BC01Q94_A33AlbProEst ;
   private byte[] BC01Q95_A914AlbPObsCon ;
   private byte[] BC01Q95_A33AlbProEst ;
}

final  class obsalb_trn_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class obsalb_trn_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class obsalb_trn_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class obsalb_trn_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01Q92", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q93", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q94", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbPObsCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q95", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q96", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbPObsLin, T2.AlbPObsCon, T2.AlbProEst, TM1.AlbPObs, TM1.EmprCod, TM1.AlbProCod FROM (TXPOBSALB TM1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = TM1.EmprCod AND T2.AlbProCod = TM1.AlbProCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.AlbPObsLin = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.AlbPObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q97", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q98", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q99", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q910", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q911", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbPObsCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01Q912", "INSERT INTO TXPOBSALB(AlbPObsLin, AlbPObs, EmprCod, AlbProCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("BC01Q913", "UPDATE TXPOBSALB SET AlbPObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("BC01Q914", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new ForEachCursor("BC01Q915", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01Q916", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("BC01Q917", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbPObsLin, T2.AlbPObsCon, T2.AlbProEst, TM1.AlbPObs, TM1.EmprCod, TM1.AlbProCod FROM (TXPOBSALB TM1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = TM1.EmprCod AND T2.AlbProCod = TM1.AlbProCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.AlbPObsLin = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.AlbPObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q918", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01Q919", "SELECT AlbPObsCon, AlbProEst FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 16 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 17 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 50);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

