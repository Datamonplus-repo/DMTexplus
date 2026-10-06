package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tuniest_bc extends GXWebPanel implements IGxSilentTrn
{
   public tuniest_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tuniest_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tuniest_bc.class ));
   }

   public tuniest_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRowHB606( ) ;
      standaloneNotModal( ) ;
      initializeNonKeyHB606( ) ;
      standaloneModal( ) ;
      addRowHB606( ) ;
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
         e11HB2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z2144UniEstCod = A2144UniEstCod ;
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

   public void confirm_HB0( )
   {
      beforeValidateHB606( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsHB606( ) ;
         }
         else
         {
            checkExtendedTableHB606( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursorsHB606( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e12HB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tuniest_bc.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      GXv_char2[0] = AV29ObtenerEmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tuniest_bc.this.AV29ObtenerEmprCod = GXv_char2[0] ;
      tuniest_bc.this.AV23EmprNom = GXv_char3[0] ;
      tuniest_bc.this.AV20UsurCod = GXv_char4[0] ;
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tuniest_bc.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      GXv_char4[0] = AV22EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tuniest_bc.this.AV22EmprCod = GXv_char4[0] ;
      tuniest_bc.this.AV23EmprNom = GXv_char3[0] ;
      tuniest_bc.this.AV20UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV26WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV26WWPContext = GXv_SdtWWPContext5[0] ;
      AV27TrnContext.fromxml(AV28WebSession.getValue("TrnContext"), null, null);
   }

   public void e11HB2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zmHB606( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z2145UniEstDes = A2145UniEstDes ;
         Z13834UniEstCDes = A13834UniEstCDes ;
      }
      if ( GX_JID == -2 )
      {
         Z2144UniEstCod = A2144UniEstCod ;
         Z2145UniEstDes = A2145UniEstDes ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void loadHB606( )
   {
      /* Using cursor BC00HB4 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound606 = (short)(1) ;
         A2145UniEstDes = BC00HB4_A2145UniEstDes[0] ;
         n2145UniEstDes = BC00HB4_n2145UniEstDes[0] ;
         zmHB606( -2) ;
      }
      pr_default.close(2);
      onLoadActionsHB606( ) ;
   }

   public void onLoadActionsHB606( )
   {
      A13834UniEstCDes = GXutil.trim( A2144UniEstCod) + "-" + GXutil.trim( A2145UniEstDes) ;
   }

   public void checkExtendedTableHB606( )
   {
      nIsDirty_606 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC00HB5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n2145UniEstDes), A2145UniEstDes, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Descripcion", "")}), 1, "");
         AnyError = (short)(1) ;
      }
      pr_default.close(3);
      nIsDirty_606 = (short)(1) ;
      A13834UniEstCDes = GXutil.trim( A2144UniEstCod) + "-" + GXutil.trim( A2145UniEstDes) ;
   }

   public void closeExtendedTableCursorsHB606( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyHB606( )
   {
      /* Using cursor BC00HB6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound606 = (short)(1) ;
      }
      else
      {
         RcdFound606 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC00HB7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmHB606( 2) ;
         RcdFound606 = (short)(1) ;
         A2144UniEstCod = BC00HB7_A2144UniEstCod[0] ;
         n2144UniEstCod = BC00HB7_n2144UniEstCod[0] ;
         A2145UniEstDes = BC00HB7_A2145UniEstDes[0] ;
         n2145UniEstDes = BC00HB7_n2145UniEstDes[0] ;
         Z2144UniEstCod = A2144UniEstCod ;
         sMode606 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         loadHB606( ) ;
         if ( AnyError == 1 )
         {
            RcdFound606 = (short)(0) ;
            initializeNonKeyHB606( ) ;
         }
         Gx_mode = sMode606 ;
      }
      else
      {
         RcdFound606 = (short)(0) ;
         initializeNonKeyHB606( ) ;
         sMode606 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode606 ;
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyHB606( ) ;
      if ( RcdFound606 == 0 )
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
      confirm_HB0( ) ;
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

   public void checkOptimisticConcurrencyHB606( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC00HB8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUNIEST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( GXutil.strcmp(Z2145UniEstDes, BC00HB8_A2145UniEstDes[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUNIEST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertHB606( )
   {
      beforeValidateHB606( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableHB606( ) ;
      }
      if ( AnyError == 0 )
      {
         zmHB606( 0) ;
         checkOptimisticConcurrencyHB606( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmHB606( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertHB606( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00HB9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, Boolean.valueOf(n2145UniEstDes), A2145UniEstDes});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUNIEST");
                  if ( (pr_default.getStatus(7) == 1) )
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
            loadHB606( ) ;
         }
         endLevelHB606( ) ;
      }
      closeExtendedTableCursorsHB606( ) ;
   }

   public void updateHB606( )
   {
      beforeValidateHB606( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableHB606( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyHB606( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmHB606( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateHB606( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC00HB10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n2145UniEstDes), A2145UniEstDes, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUNIEST");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUNIEST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateHB606( ) ;
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
         endLevelHB606( ) ;
      }
      closeExtendedTableCursorsHB606( ) ;
   }

   public void deferredUpdateHB606( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidateHB606( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyHB606( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsHB606( ) ;
         afterConfirmHB606( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteHB606( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC00HB11 */
               pr_default.execute(9, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUNIEST");
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
      sMode606 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevelHB606( ) ;
      Gx_mode = sMode606 ;
   }

   public void onDeleteControlsHB606( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13834UniEstCDes = GXutil.trim( A2144UniEstCod) + "-" + GXutil.trim( A2145UniEstDes) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC00HB12 */
         pr_default.execute(10, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC00HB13 */
         pr_default.execute(11, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC00HB14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PSTCO2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC00HB15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PSTCO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC00HB16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstPa1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor BC00HB17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC00HB18 */
         pr_default.execute(16, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor BC00HB19 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PASFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor BC00HB20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevelHB606( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteHB606( ) ;
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

   public void scanKeyStartHB606( )
   {
      /* Scan By routine */
      /* Using cursor BC00HB21 */
      pr_default.execute(19, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      RcdFound606 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound606 = (short)(1) ;
         A2144UniEstCod = BC00HB21_A2144UniEstCod[0] ;
         n2144UniEstCod = BC00HB21_n2144UniEstCod[0] ;
         A2145UniEstDes = BC00HB21_A2145UniEstDes[0] ;
         n2145UniEstDes = BC00HB21_n2145UniEstDes[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNextHB606( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound606 = (short)(0) ;
      scanKeyLoadHB606( ) ;
   }

   public void scanKeyLoadHB606( )
   {
      sMode606 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound606 = (short)(1) ;
         A2144UniEstCod = BC00HB21_A2144UniEstCod[0] ;
         n2144UniEstCod = BC00HB21_n2144UniEstCod[0] ;
         A2145UniEstDes = BC00HB21_A2145UniEstDes[0] ;
         n2145UniEstDes = BC00HB21_n2145UniEstDes[0] ;
      }
      Gx_mode = sMode606 ;
   }

   public void scanKeyEndHB606( )
   {
      pr_default.close(19);
   }

   public void afterConfirmHB606( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertHB606( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateHB606( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteHB606( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteHB606( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateHB606( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesHB606( )
   {
   }

   public void send_integrity_lvl_hashesHB606( )
   {
   }

   public void addRowHB606( )
   {
      VarsToRow606( bcTUNIEST) ;
   }

   public void readRowHB606( )
   {
      RowToVars606( bcTUNIEST, 1) ;
   }

   public void initializeNonKeyHB606( )
   {
      A13834UniEstCDes = "" ;
      A2145UniEstDes = "" ;
      n2145UniEstDes = false ;
      Z2145UniEstDes = "" ;
   }

   public void initAllHB606( )
   {
      A2144UniEstCod = "" ;
      n2144UniEstCod = false ;
      initializeNonKeyHB606( ) ;
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

   public void VarsToRow606( app.SdtTUNIEST obj606 )
   {
      obj606.setgxTv_SdtTUNIEST_Mode( Gx_mode );
      obj606.setgxTv_SdtTUNIEST_Uniestcdes( A13834UniEstCDes );
      obj606.setgxTv_SdtTUNIEST_Uniestdes( A2145UniEstDes );
      obj606.setgxTv_SdtTUNIEST_Uniestcod( A2144UniEstCod );
      obj606.setgxTv_SdtTUNIEST_Uniestcod_Z( Z2144UniEstCod );
      obj606.setgxTv_SdtTUNIEST_Uniestdes_Z( Z2145UniEstDes );
      obj606.setgxTv_SdtTUNIEST_Uniestcdes_Z( Z13834UniEstCDes );
      obj606.setgxTv_SdtTUNIEST_Uniestcod_N( (byte)((byte)((n2144UniEstCod)?1:0)) );
      obj606.setgxTv_SdtTUNIEST_Uniestdes_N( (byte)((byte)((n2145UniEstDes)?1:0)) );
      obj606.setgxTv_SdtTUNIEST_Mode( Gx_mode );
   }

   public void KeyVarsToRow606( app.SdtTUNIEST obj606 )
   {
      obj606.setgxTv_SdtTUNIEST_Uniestcod( A2144UniEstCod );
   }

   public void RowToVars606( app.SdtTUNIEST obj606 ,
                             int forceLoad )
   {
      Gx_mode = obj606.getgxTv_SdtTUNIEST_Mode() ;
      A13834UniEstCDes = obj606.getgxTv_SdtTUNIEST_Uniestcdes() ;
      A2145UniEstDes = obj606.getgxTv_SdtTUNIEST_Uniestdes() ;
      n2145UniEstDes = false ;
      A2144UniEstCod = obj606.getgxTv_SdtTUNIEST_Uniestcod() ;
      n2144UniEstCod = false ;
      Z2144UniEstCod = obj606.getgxTv_SdtTUNIEST_Uniestcod_Z() ;
      Z2145UniEstDes = obj606.getgxTv_SdtTUNIEST_Uniestdes_Z() ;
      Z13834UniEstCDes = obj606.getgxTv_SdtTUNIEST_Uniestcdes_Z() ;
      n2144UniEstCod = (boolean)((obj606.getgxTv_SdtTUNIEST_Uniestcod_N()==0)?false:true) ;
      n2145UniEstDes = (boolean)((obj606.getgxTv_SdtTUNIEST_Uniestdes_N()==0)?false:true) ;
      Gx_mode = obj606.getgxTv_SdtTUNIEST_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A2144UniEstCod = (String)getParm(obj,0) ;
      n2144UniEstCod = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKeyHB606( ) ;
      scanKeyStartHB606( ) ;
      if ( RcdFound606 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z2144UniEstCod = A2144UniEstCod ;
      }
      zmHB606( -2) ;
      onLoadActionsHB606( ) ;
      addRowHB606( ) ;
      scanKeyEndHB606( ) ;
      if ( RcdFound606 == 0 )
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
      RowToVars606( bcTUNIEST, 0) ;
      scanKeyStartHB606( ) ;
      if ( RcdFound606 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z2144UniEstCod = A2144UniEstCod ;
      }
      zmHB606( -2) ;
      onLoadActionsHB606( ) ;
      addRowHB606( ) ;
      scanKeyEndHB606( ) ;
      if ( RcdFound606 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyHB606( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insertHB606( ) ;
      }
      else
      {
         if ( RcdFound606 == 1 )
         {
            if ( GXutil.strcmp(A2144UniEstCod, Z2144UniEstCod) != 0 )
            {
               A2144UniEstCod = Z2144UniEstCod ;
               n2144UniEstCod = false ;
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
               updateHB606( ) ;
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
               if ( GXutil.strcmp(A2144UniEstCod, Z2144UniEstCod) != 0 )
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
                     insertHB606( ) ;
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
                     insertHB606( ) ;
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
      RowToVars606( bcTUNIEST, 1) ;
      saveImpl( ) ;
      VarsToRow606( bcTUNIEST) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars606( bcTUNIEST, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insertHB606( ) ;
      afterTrn( ) ;
      VarsToRow606( bcTUNIEST) ;
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
         app.SdtTUNIEST auxBC = new app.SdtTUNIEST( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A2144UniEstCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTUNIEST);
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
      RowToVars606( bcTUNIEST, 1) ;
      updateImpl( ) ;
      VarsToRow606( bcTUNIEST) ;
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
      RowToVars606( bcTUNIEST, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insertHB606( ) ;
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
      VarsToRow606( bcTUNIEST) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars606( bcTUNIEST, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKeyHB606( ) ;
      if ( RcdFound606 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A2144UniEstCod, Z2144UniEstCod) != 0 )
         {
            A2144UniEstCod = Z2144UniEstCod ;
            n2144UniEstCod = false ;
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
         if ( GXutil.strcmp(A2144UniEstCod, Z2144UniEstCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tuniest_bc");
      VarsToRow606( bcTUNIEST) ;
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
      Gx_mode = bcTUNIEST.getgxTv_SdtTUNIEST_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTUNIEST.setgxTv_SdtTUNIEST_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTUNIEST sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTUNIEST )
      {
         bcTUNIEST = sdt ;
         if ( GXutil.strcmp(bcTUNIEST.getgxTv_SdtTUNIEST_Mode(), "") == 0 )
         {
            bcTUNIEST.setgxTv_SdtTUNIEST_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow606( bcTUNIEST) ;
         }
         else
         {
            RowToVars606( bcTUNIEST, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTUNIEST.getgxTv_SdtTUNIEST_Mode(), "") == 0 )
         {
            bcTUNIEST.setgxTv_SdtTUNIEST_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars606( bcTUNIEST, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTUNIEST getTUNIEST_BC( )
   {
      return bcTUNIEST ;
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
      Z2144UniEstCod = "" ;
      A2144UniEstCod = "" ;
      AV24Station = "" ;
      AV29ObtenerEmprCod = "" ;
      AV23EmprNom = "" ;
      AV20UsurCod = "" ;
      GXt_char1 = "" ;
      AV22EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV26WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV28WebSession = httpContext.getWebSession();
      Z2145UniEstDes = "" ;
      A2145UniEstDes = "" ;
      Z13834UniEstCDes = "" ;
      A13834UniEstCDes = "" ;
      BC00HB4_A2144UniEstCod = new String[] {""} ;
      BC00HB4_n2144UniEstCod = new boolean[] {false} ;
      BC00HB4_A2145UniEstDes = new String[] {""} ;
      BC00HB4_n2145UniEstDes = new boolean[] {false} ;
      BC00HB5_A2145UniEstDes = new String[] {""} ;
      BC00HB5_n2145UniEstDes = new boolean[] {false} ;
      BC00HB6_A2144UniEstCod = new String[] {""} ;
      BC00HB6_n2144UniEstCod = new boolean[] {false} ;
      BC00HB7_A2144UniEstCod = new String[] {""} ;
      BC00HB7_n2144UniEstCod = new boolean[] {false} ;
      BC00HB7_A2145UniEstDes = new String[] {""} ;
      BC00HB7_n2145UniEstDes = new boolean[] {false} ;
      sMode606 = "" ;
      BC00HB8_A2144UniEstCod = new String[] {""} ;
      BC00HB8_n2144UniEstCod = new boolean[] {false} ;
      BC00HB8_A2145UniEstDes = new String[] {""} ;
      BC00HB8_n2145UniEstDes = new boolean[] {false} ;
      BC00HB12_A396EmprCod = new String[] {""} ;
      BC00HB12_A252CliCod = new int[1] ;
      BC00HB12_A2141SerEst = new String[] {""} ;
      BC00HB12_A1013DibCli = new String[] {""} ;
      BC00HB12_A1014DibInt = new int[1] ;
      BC00HB12_A2074ColCom = new String[] {""} ;
      BC00HB12_A2078ColFon = new String[] {""} ;
      BC00HB12_A11712ClaveID = new short[1] ;
      BC00HB13_A396EmprCod = new String[] {""} ;
      BC00HB13_A11634TaesId = new String[] {""} ;
      BC00HB13_A11637TaesLn = new short[1] ;
      BC00HB13_A11641TaesLnP = new short[1] ;
      BC00HB14_A396EmprCod = new String[] {""} ;
      BC00HB14_A7588Pc_Codigo = new String[] {""} ;
      BC00HB14_A7591Pc_Lin = new short[1] ;
      BC00HB15_A396EmprCod = new String[] {""} ;
      BC00HB15_A7588Pc_Codigo = new String[] {""} ;
      BC00HB15_A7598Pc_LinP = new short[1] ;
      BC00HB16_A396EmprCod = new String[] {""} ;
      BC00HB16_A4418EstPasMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC00HB16_A2107PasCod = new String[] {""} ;
      BC00HB17_A396EmprCod = new String[] {""} ;
      BC00HB17_A252CliCod = new int[1] ;
      BC00HB17_A4415EstCol = new String[] {""} ;
      BC00HB17_A4416EstColLin = new short[1] ;
      BC00HB18_A396EmprCod = new String[] {""} ;
      BC00HB18_A2107PasCod = new String[] {""} ;
      BC00HB18_A719PrdNum = new String[] {""} ;
      BC00HB19_A396EmprCod = new String[] {""} ;
      BC00HB19_A252CliCod = new int[1] ;
      BC00HB19_A2141SerEst = new String[] {""} ;
      BC00HB19_A1013DibCli = new String[] {""} ;
      BC00HB19_A1014DibInt = new int[1] ;
      BC00HB19_A2074ColCom = new String[] {""} ;
      BC00HB19_A2078ColFon = new String[] {""} ;
      BC00HB19_A2098MolCod = new byte[1] ;
      BC00HB19_A2654PasForLin = new short[1] ;
      BC00HB20_A396EmprCod = new String[] {""} ;
      BC00HB20_A252CliCod = new int[1] ;
      BC00HB20_A2141SerEst = new String[] {""} ;
      BC00HB20_A1013DibCli = new String[] {""} ;
      BC00HB20_A1014DibInt = new int[1] ;
      BC00HB20_A2074ColCom = new String[] {""} ;
      BC00HB20_A2078ColFon = new String[] {""} ;
      BC00HB20_A2098MolCod = new byte[1] ;
      BC00HB20_A2535ForPrdLin = new short[1] ;
      BC00HB21_A2144UniEstCod = new String[] {""} ;
      BC00HB21_n2144UniEstCod = new boolean[] {false} ;
      BC00HB21_A2145UniEstDes = new String[] {""} ;
      BC00HB21_n2145UniEstDes = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tuniest_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tuniest_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tuniest_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tuniest_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tuniest_bc__default(),
         new Object[] {
             new Object[] {
            BC00HB2_A2144UniEstCod, BC00HB2_A2145UniEstDes, BC00HB2_n2145UniEstDes
            }
            , new Object[] {
            BC00HB3_A2144UniEstCod, BC00HB3_A2145UniEstDes, BC00HB3_n2145UniEstDes
            }
            , new Object[] {
            BC00HB4_A2144UniEstCod, BC00HB4_A2145UniEstDes, BC00HB4_n2145UniEstDes
            }
            , new Object[] {
            BC00HB5_A2145UniEstDes, BC00HB5_n2145UniEstDes
            }
            , new Object[] {
            BC00HB6_A2144UniEstCod
            }
            , new Object[] {
            BC00HB7_A2144UniEstCod, BC00HB7_A2145UniEstDes, BC00HB7_n2145UniEstDes
            }
            , new Object[] {
            BC00HB8_A2144UniEstCod, BC00HB8_A2145UniEstDes, BC00HB8_n2145UniEstDes
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC00HB12_A396EmprCod, BC00HB12_A252CliCod, BC00HB12_A2141SerEst, BC00HB12_A1013DibCli, BC00HB12_A1014DibInt, BC00HB12_A2074ColCom, BC00HB12_A2078ColFon, BC00HB12_A11712ClaveID
            }
            , new Object[] {
            BC00HB13_A396EmprCod, BC00HB13_A11634TaesId, BC00HB13_A11637TaesLn, BC00HB13_A11641TaesLnP
            }
            , new Object[] {
            BC00HB14_A396EmprCod, BC00HB14_A7588Pc_Codigo, BC00HB14_A7591Pc_Lin
            }
            , new Object[] {
            BC00HB15_A396EmprCod, BC00HB15_A7588Pc_Codigo, BC00HB15_A7598Pc_LinP
            }
            , new Object[] {
            BC00HB16_A396EmprCod, BC00HB16_A4418EstPasMax, BC00HB16_A2107PasCod
            }
            , new Object[] {
            BC00HB17_A396EmprCod, BC00HB17_A252CliCod, BC00HB17_A4415EstCol, BC00HB17_A4416EstColLin
            }
            , new Object[] {
            BC00HB18_A396EmprCod, BC00HB18_A2107PasCod, BC00HB18_A719PrdNum
            }
            , new Object[] {
            BC00HB19_A396EmprCod, BC00HB19_A252CliCod, BC00HB19_A2141SerEst, BC00HB19_A1013DibCli, BC00HB19_A1014DibInt, BC00HB19_A2074ColCom, BC00HB19_A2078ColFon, BC00HB19_A2098MolCod, BC00HB19_A2654PasForLin
            }
            , new Object[] {
            BC00HB20_A396EmprCod, BC00HB20_A252CliCod, BC00HB20_A2141SerEst, BC00HB20_A1013DibCli, BC00HB20_A1014DibInt, BC00HB20_A2074ColCom, BC00HB20_A2078ColFon, BC00HB20_A2098MolCod, BC00HB20_A2535ForPrdLin
            }
            , new Object[] {
            BC00HB21_A2144UniEstCod, BC00HB21_A2145UniEstDes, BC00HB21_n2145UniEstDes
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e12HB2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound606 ;
   private short nIsDirty_606 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z2144UniEstCod ;
   private String A2144UniEstCod ;
   private String AV24Station ;
   private String AV29ObtenerEmprCod ;
   private String AV23EmprNom ;
   private String AV20UsurCod ;
   private String GXt_char1 ;
   private String AV22EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z2145UniEstDes ;
   private String A2145UniEstDes ;
   private String sMode606 ;
   private boolean returnInSub ;
   private boolean n2144UniEstCod ;
   private boolean n2145UniEstDes ;
   private boolean mustCommit ;
   private String Z13834UniEstCDes ;
   private String A13834UniEstCDes ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV28WebSession ;
   private app.SdtTUNIEST bcTUNIEST ;
   private IDataStoreProvider pr_default ;
   private String[] BC00HB4_A2144UniEstCod ;
   private boolean[] BC00HB4_n2144UniEstCod ;
   private String[] BC00HB4_A2145UniEstDes ;
   private boolean[] BC00HB4_n2145UniEstDes ;
   private String[] BC00HB5_A2145UniEstDes ;
   private boolean[] BC00HB5_n2145UniEstDes ;
   private String[] BC00HB6_A2144UniEstCod ;
   private boolean[] BC00HB6_n2144UniEstCod ;
   private String[] BC00HB7_A2144UniEstCod ;
   private boolean[] BC00HB7_n2144UniEstCod ;
   private String[] BC00HB7_A2145UniEstDes ;
   private boolean[] BC00HB7_n2145UniEstDes ;
   private String[] BC00HB8_A2144UniEstCod ;
   private boolean[] BC00HB8_n2144UniEstCod ;
   private String[] BC00HB8_A2145UniEstDes ;
   private boolean[] BC00HB8_n2145UniEstDes ;
   private String[] BC00HB12_A396EmprCod ;
   private int[] BC00HB12_A252CliCod ;
   private String[] BC00HB12_A2141SerEst ;
   private String[] BC00HB12_A1013DibCli ;
   private int[] BC00HB12_A1014DibInt ;
   private String[] BC00HB12_A2074ColCom ;
   private String[] BC00HB12_A2078ColFon ;
   private short[] BC00HB12_A11712ClaveID ;
   private String[] BC00HB13_A396EmprCod ;
   private String[] BC00HB13_A11634TaesId ;
   private short[] BC00HB13_A11637TaesLn ;
   private short[] BC00HB13_A11641TaesLnP ;
   private String[] BC00HB14_A396EmprCod ;
   private String[] BC00HB14_A7588Pc_Codigo ;
   private short[] BC00HB14_A7591Pc_Lin ;
   private String[] BC00HB15_A396EmprCod ;
   private String[] BC00HB15_A7588Pc_Codigo ;
   private short[] BC00HB15_A7598Pc_LinP ;
   private String[] BC00HB16_A396EmprCod ;
   private java.math.BigDecimal[] BC00HB16_A4418EstPasMax ;
   private String[] BC00HB16_A2107PasCod ;
   private String[] BC00HB17_A396EmprCod ;
   private int[] BC00HB17_A252CliCod ;
   private String[] BC00HB17_A4415EstCol ;
   private short[] BC00HB17_A4416EstColLin ;
   private String[] BC00HB18_A396EmprCod ;
   private String[] BC00HB18_A2107PasCod ;
   private String[] BC00HB18_A719PrdNum ;
   private String[] BC00HB19_A396EmprCod ;
   private int[] BC00HB19_A252CliCod ;
   private String[] BC00HB19_A2141SerEst ;
   private String[] BC00HB19_A1013DibCli ;
   private int[] BC00HB19_A1014DibInt ;
   private String[] BC00HB19_A2074ColCom ;
   private String[] BC00HB19_A2078ColFon ;
   private byte[] BC00HB19_A2098MolCod ;
   private short[] BC00HB19_A2654PasForLin ;
   private String[] BC00HB20_A396EmprCod ;
   private int[] BC00HB20_A252CliCod ;
   private String[] BC00HB20_A2141SerEst ;
   private String[] BC00HB20_A1013DibCli ;
   private int[] BC00HB20_A1014DibInt ;
   private String[] BC00HB20_A2074ColCom ;
   private String[] BC00HB20_A2078ColFon ;
   private byte[] BC00HB20_A2098MolCod ;
   private short[] BC00HB20_A2535ForPrdLin ;
   private String[] BC00HB21_A2144UniEstCod ;
   private boolean[] BC00HB21_n2144UniEstCod ;
   private String[] BC00HB21_A2145UniEstDes ;
   private boolean[] BC00HB21_n2145UniEstDes ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC00HB2_A2144UniEstCod ;
   private String[] BC00HB2_A2145UniEstDes ;
   private String[] BC00HB3_A2144UniEstCod ;
   private String[] BC00HB3_A2145UniEstDes ;
   private boolean[] BC00HB2_n2145UniEstDes ;
   private boolean[] BC00HB3_n2145UniEstDes ;
   private app.wwpbaseobjects.SdtWWPContext AV26WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV27TrnContext ;
}

final  class tuniest_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tuniest_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tuniest_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tuniest_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tuniest_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC00HB2", "SELECT UniEstCod, UniEstDes FROM TXPUNIEST WHERE UniEstCod = ?  FOR UPDATE OF UniEstDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB3", "SELECT UniEstCod, UniEstDes FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB4", "SELECT /*+ FIRST_ROWS(100) */ TM1.UniEstCod, TM1.UniEstDes FROM TXPUNIEST TM1 WHERE TM1.UniEstCod = ? ORDER BY TM1.UniEstCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB5", "SELECT UniEstDes FROM TXPUNIEST WHERE (UniEstDes = ?) AND (Not ( UniEstCod = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB6", "SELECT /*+ FIRST_ROWS(1) */ UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB7", "SELECT UniEstCod, UniEstDes FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC00HB8", "SELECT UniEstCod, UniEstDes FROM TXPUNIEST WHERE UniEstCod = ?  FOR UPDATE OF UniEstDes NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC00HB9", "INSERT INTO TXPUNIEST(UniEstCod, UniEstDes) VALUES(?, ?)", GX_NOMASK, "TXPUNIEST")
         ,new UpdateCursor("BC00HB10", "UPDATE TXPUNIEST SET UniEstDes=?  WHERE UniEstCod = ?", GX_NOMASK, "TXPUNIEST")
         ,new UpdateCursor("BC00HB11", "DELETE FROM TXPUNIEST  WHERE UniEstCod = ?", GX_NOMASK, "TXPUNIEST")
         ,new ForEachCursor("BC00HB12", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID FROM TXPClaves WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB13", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB14", "SELECT * FROM (SELECT EmprCod, Pc_Codigo, Pc_Lin FROM TXPPSTCO2 WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB15", "SELECT * FROM (SELECT EmprCod, Pc_Codigo, Pc_LinP FROM TXPPSTCO1 WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB16", "SELECT * FROM (SELECT EmprCod, EstPasMax, PasCod FROM TXPEstPa1 WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB17", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB18", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB19", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB20", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE UniEstCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC00HB21", "SELECT /*+ FIRST_ROWS(100) */ TM1.UniEstCod, TM1.UniEstDes FROM TXPUNIEST TM1 WHERE TM1.UniEstCod = ? ORDER BY TM1.UniEstCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
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
            case 18 :
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
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 25);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 25);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 25);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 3);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
      }
   }

}

