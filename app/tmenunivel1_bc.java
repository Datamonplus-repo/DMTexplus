package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmenunivel1_bc extends GXWebPanel implements IGxSilentTrn
{
   public tmenunivel1_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmenunivel1_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmenunivel1_bc.class ));
   }

   public tmenunivel1_bc( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1UA125( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1UA125( ) ;
      standaloneModal( ) ;
      addRow1UA125( ) ;
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
            Z945MnuId = A945MnuId ;
            Z946MnuOp = A946MnuOp ;
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

   public void confirm_1UA0( )
   {
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UA125( ) ;
         }
         else
         {
            checkExtendedTable1UA125( ) ;
            if ( AnyError == 0 )
            {
               zm1UA125( 3) ;
            }
            closeExtendedTableCursors1UA125( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1UA125( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z947MnuPgm = A947MnuPgm ;
         Z14286MnuPgmWeb = A14286MnuPgmWeb ;
         Z948MnuPgmTpo = A948MnuPgmTpo ;
         Z949MnuPgmTxt = A949MnuPgmTxt ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z951MnuTxt = A951MnuTxt ;
      }
      if ( GX_JID == -2 )
      {
         Z946MnuOp = A946MnuOp ;
         Z947MnuPgm = A947MnuPgm ;
         Z14286MnuPgmWeb = A14286MnuPgmWeb ;
         Z948MnuPgmTpo = A948MnuPgmTpo ;
         Z949MnuPgmTxt = A949MnuPgmTxt ;
         Z945MnuId = A945MnuId ;
         Z951MnuTxt = A951MnuTxt ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1UA125( )
   {
      /* Using cursor BC01UA5 */
      pr_default.execute(3, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A951MnuTxt = BC01UA5_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA5_n951MnuTxt[0] ;
         A947MnuPgm = BC01UA5_A947MnuPgm[0] ;
         A14286MnuPgmWeb = BC01UA5_A14286MnuPgmWeb[0] ;
         A948MnuPgmTpo = BC01UA5_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = BC01UA5_A949MnuPgmTxt[0] ;
         zm1UA125( -2) ;
      }
      pr_default.close(3);
      onLoadActions1UA125( ) ;
   }

   public void onLoadActions1UA125( )
   {
   }

   public void checkExtendedTable1UA125( )
   {
      nIsDirty_125 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01UA6 */
      pr_default.execute(4, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
         AnyError = (short)(1) ;
      }
      A951MnuTxt = BC01UA6_A951MnuTxt[0] ;
      n951MnuTxt = BC01UA6_n951MnuTxt[0] ;
      pr_default.close(4);
      if ( ! ( ( GXutil.strcmp(A948MnuPgmTpo, "S") == 0 ) || ( GXutil.strcmp(A948MnuPgmTpo, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Ind. de Requiere parámetro", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1UA125( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void getKey1UA125( )
   {
      /* Using cursor BC01UA7 */
      pr_default.execute(5, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound125 = (short)(1) ;
      }
      else
      {
         RcdFound125 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01UA8 */
      pr_default.execute(6, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         zm1UA125( 2) ;
         RcdFound125 = (short)(1) ;
         A946MnuOp = BC01UA8_A946MnuOp[0] ;
         A947MnuPgm = BC01UA8_A947MnuPgm[0] ;
         A14286MnuPgmWeb = BC01UA8_A14286MnuPgmWeb[0] ;
         A948MnuPgmTpo = BC01UA8_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = BC01UA8_A949MnuPgmTxt[0] ;
         A945MnuId = BC01UA8_A945MnuId[0] ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1UA125( ) ;
         if ( AnyError == 1 )
         {
            RcdFound125 = (short)(0) ;
            initializeNonKey1UA125( ) ;
         }
         Gx_mode = sMode125 ;
      }
      else
      {
         RcdFound125 = (short)(0) ;
         initializeNonKey1UA125( ) ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode125 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1UA125( ) ;
      if ( RcdFound125 == 0 )
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
      confirm_1UA0( ) ;
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

   public void checkOptimisticConcurrency1UA125( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01UA9 */
         pr_default.execute(7, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z947MnuPgm, BC01UA9_A947MnuPgm[0]) != 0 ) || ( GXutil.strcmp(Z14286MnuPgmWeb, BC01UA9_A14286MnuPgmWeb[0]) != 0 ) || ( GXutil.strcmp(Z948MnuPgmTpo, BC01UA9_A948MnuPgmTpo[0]) != 0 ) || ( GXutil.strcmp(Z949MnuPgmTxt, BC01UA9_A949MnuPgmTxt[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UA125( )
   {
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UA125( 0) ;
         checkOptimisticConcurrency1UA125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UA125( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UA125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01UA10 */
                  pr_default.execute(8, new Object[] {Byte.valueOf(A946MnuOp), A947MnuPgm, A14286MnuPgmWeb, A948MnuPgmTpo, A949MnuPgmTxt, A945MnuId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                  if ( (pr_default.getStatus(8) == 1) )
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
            load1UA125( ) ;
         }
         endLevel1UA125( ) ;
      }
      closeExtendedTableCursors1UA125( ) ;
   }

   public void update1UA125( )
   {
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UA125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UA125( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UA125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01UA11 */
                  pr_default.execute(9, new Object[] {A947MnuPgm, A14286MnuPgmWeb, A948MnuPgmTpo, A949MnuPgmTxt, A945MnuId, Byte.valueOf(A946MnuOp)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UA125( ) ;
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
         endLevel1UA125( ) ;
      }
      closeExtendedTableCursors1UA125( ) ;
   }

   public void deferredUpdate1UA125( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1UA125( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UA125( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UA125( ) ;
         afterConfirm1UA125( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UA125( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01UA12 */
               pr_default.execute(10, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
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
      sMode125 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1UA125( ) ;
      Gx_mode = sMode125 ;
   }

   public void onDeleteControls1UA125( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01UA13 */
         pr_default.execute(11, new Object[] {A945MnuId});
         A951MnuTxt = BC01UA13_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA13_n951MnuTxt[0] ;
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01UA14 */
         pr_default.execute(12, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPCGRU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void endLevel1UA125( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UA125( ) ;
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

   public void scanKeyStart1UA125( )
   {
      /* Using cursor BC01UA15 */
      pr_default.execute(13, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = BC01UA15_A946MnuOp[0] ;
         A951MnuTxt = BC01UA15_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA15_n951MnuTxt[0] ;
         A947MnuPgm = BC01UA15_A947MnuPgm[0] ;
         A14286MnuPgmWeb = BC01UA15_A14286MnuPgmWeb[0] ;
         A948MnuPgmTpo = BC01UA15_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = BC01UA15_A949MnuPgmTxt[0] ;
         A945MnuId = BC01UA15_A945MnuId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1UA125( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound125 = (short)(0) ;
      scanKeyLoad1UA125( ) ;
   }

   public void scanKeyLoad1UA125( )
   {
      sMode125 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = BC01UA15_A946MnuOp[0] ;
         A951MnuTxt = BC01UA15_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA15_n951MnuTxt[0] ;
         A947MnuPgm = BC01UA15_A947MnuPgm[0] ;
         A14286MnuPgmWeb = BC01UA15_A14286MnuPgmWeb[0] ;
         A948MnuPgmTpo = BC01UA15_A948MnuPgmTpo[0] ;
         A949MnuPgmTxt = BC01UA15_A949MnuPgmTxt[0] ;
         A945MnuId = BC01UA15_A945MnuId[0] ;
      }
      Gx_mode = sMode125 ;
   }

   public void scanKeyEnd1UA125( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1UA125( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UA125( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UA125( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UA125( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UA125( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UA125( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UA125( )
   {
   }

   public void send_integrity_lvl_hashes1UA125( )
   {
   }

   public void addRow1UA125( )
   {
      VarsToRow125( bcTMENUNIVEL1) ;
   }

   public void readRow1UA125( )
   {
      RowToVars125( bcTMENUNIVEL1, 1) ;
   }

   public void initializeNonKey1UA125( )
   {
      A951MnuTxt = "" ;
      n951MnuTxt = false ;
      A947MnuPgm = "" ;
      A14286MnuPgmWeb = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
      Z947MnuPgm = "" ;
      Z14286MnuPgmWeb = "" ;
      Z948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
   }

   public void initAll1UA125( )
   {
      A945MnuId = "" ;
      A946MnuOp = (byte)(0) ;
      initializeNonKey1UA125( ) ;
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

   public void VarsToRow125( app.SdtTMENUNIVEL1 obj125 )
   {
      obj125.setgxTv_SdtTMENUNIVEL1_Mode( Gx_mode );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnutxt( A951MnuTxt );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgm( A947MnuPgm );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmweb( A14286MnuPgmWeb );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmtpo( A948MnuPgmTpo );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmtxt( A949MnuPgmTxt );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuid( A945MnuId );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuop( A946MnuOp );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuid_Z( Z945MnuId );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnutxt_Z( Z951MnuTxt );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuop_Z( Z946MnuOp );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgm_Z( Z947MnuPgm );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z( Z14286MnuPgmWeb );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z( Z948MnuPgmTpo );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z( Z949MnuPgmTxt );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnutxt_N( (byte)((byte)((n951MnuTxt)?1:0)) );
      obj125.setgxTv_SdtTMENUNIVEL1_Mode( Gx_mode );
   }

   public void KeyVarsToRow125( app.SdtTMENUNIVEL1 obj125 )
   {
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuid( A945MnuId );
      obj125.setgxTv_SdtTMENUNIVEL1_Mnuop( A946MnuOp );
   }

   public void RowToVars125( app.SdtTMENUNIVEL1 obj125 ,
                             int forceLoad )
   {
      Gx_mode = obj125.getgxTv_SdtTMENUNIVEL1_Mode() ;
      A951MnuTxt = obj125.getgxTv_SdtTMENUNIVEL1_Mnutxt() ;
      n951MnuTxt = false ;
      A947MnuPgm = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgm() ;
      A14286MnuPgmWeb = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmweb() ;
      A948MnuPgmTpo = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmtpo() ;
      A949MnuPgmTxt = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmtxt() ;
      A945MnuId = obj125.getgxTv_SdtTMENUNIVEL1_Mnuid() ;
      A946MnuOp = obj125.getgxTv_SdtTMENUNIVEL1_Mnuop() ;
      Z945MnuId = obj125.getgxTv_SdtTMENUNIVEL1_Mnuid_Z() ;
      Z951MnuTxt = obj125.getgxTv_SdtTMENUNIVEL1_Mnutxt_Z() ;
      Z946MnuOp = obj125.getgxTv_SdtTMENUNIVEL1_Mnuop_Z() ;
      Z947MnuPgm = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgm_Z() ;
      Z14286MnuPgmWeb = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmweb_Z() ;
      Z948MnuPgmTpo = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmtpo_Z() ;
      Z949MnuPgmTxt = obj125.getgxTv_SdtTMENUNIVEL1_Mnupgmtxt_Z() ;
      n951MnuTxt = (boolean)((obj125.getgxTv_SdtTMENUNIVEL1_Mnutxt_N()==0)?false:true) ;
      Gx_mode = obj125.getgxTv_SdtTMENUNIVEL1_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A945MnuId = (String)getParm(obj,0) ;
      A946MnuOp = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1UA125( ) ;
      scanKeyStart1UA125( ) ;
      if ( RcdFound125 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01UA16 */
         pr_default.execute(14, new Object[] {A945MnuId});
         if ( (pr_default.getStatus(14) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
            AnyError = (short)(1) ;
         }
         A951MnuTxt = BC01UA16_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA16_n951MnuTxt[0] ;
         pr_default.close(14);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
      }
      zm1UA125( -2) ;
      onLoadActions1UA125( ) ;
      addRow1UA125( ) ;
      scanKeyEnd1UA125( ) ;
      if ( RcdFound125 == 0 )
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
      RowToVars125( bcTMENUNIVEL1, 0) ;
      scanKeyStart1UA125( ) ;
      if ( RcdFound125 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01UA17 */
         pr_default.execute(15, new Object[] {A945MnuId});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MNUCAB", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MNUID");
            AnyError = (short)(1) ;
         }
         A951MnuTxt = BC01UA17_A951MnuTxt[0] ;
         n951MnuTxt = BC01UA17_n951MnuTxt[0] ;
         pr_default.close(15);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
      }
      zm1UA125( -2) ;
      onLoadActions1UA125( ) ;
      addRow1UA125( ) ;
      scanKeyEnd1UA125( ) ;
      if ( RcdFound125 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UA125( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1UA125( ) ;
      }
      else
      {
         if ( RcdFound125 == 1 )
         {
            if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
            {
               A945MnuId = Z945MnuId ;
               A946MnuOp = Z946MnuOp ;
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
               update1UA125( ) ;
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
               if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
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
                     insert1UA125( ) ;
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
                     insert1UA125( ) ;
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
      RowToVars125( bcTMENUNIVEL1, 1) ;
      saveImpl( ) ;
      VarsToRow125( bcTMENUNIVEL1) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars125( bcTMENUNIVEL1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1UA125( ) ;
      afterTrn( ) ;
      VarsToRow125( bcTMENUNIVEL1) ;
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
         app.SdtTMENUNIVEL1 auxBC = new app.SdtTMENUNIVEL1( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A945MnuId, A946MnuOp);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTMENUNIVEL1);
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
      RowToVars125( bcTMENUNIVEL1, 1) ;
      updateImpl( ) ;
      VarsToRow125( bcTMENUNIVEL1) ;
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
      RowToVars125( bcTMENUNIVEL1, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1UA125( ) ;
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
      VarsToRow125( bcTMENUNIVEL1) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars125( bcTMENUNIVEL1, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1UA125( ) ;
      if ( RcdFound125 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
         {
            A945MnuId = Z945MnuId ;
            A946MnuOp = Z946MnuOp ;
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
         if ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) || ( A946MnuOp != Z946MnuOp ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmenunivel1_bc");
      VarsToRow125( bcTMENUNIVEL1) ;
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
      Gx_mode = bcTMENUNIVEL1.getgxTv_SdtTMENUNIVEL1_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTMENUNIVEL1.setgxTv_SdtTMENUNIVEL1_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTMENUNIVEL1 sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTMENUNIVEL1 )
      {
         bcTMENUNIVEL1 = sdt ;
         if ( GXutil.strcmp(bcTMENUNIVEL1.getgxTv_SdtTMENUNIVEL1_Mode(), "") == 0 )
         {
            bcTMENUNIVEL1.setgxTv_SdtTMENUNIVEL1_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow125( bcTMENUNIVEL1) ;
         }
         else
         {
            RowToVars125( bcTMENUNIVEL1, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTMENUNIVEL1.getgxTv_SdtTMENUNIVEL1_Mode(), "") == 0 )
         {
            bcTMENUNIVEL1.setgxTv_SdtTMENUNIVEL1_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars125( bcTMENUNIVEL1, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTMENUNIVEL1 getTMENUNIVEL1_BC( )
   {
      return bcTMENUNIVEL1 ;
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
      Z945MnuId = "" ;
      A945MnuId = "" ;
      Z947MnuPgm = "" ;
      A947MnuPgm = "" ;
      Z14286MnuPgmWeb = "" ;
      A14286MnuPgmWeb = "" ;
      Z948MnuPgmTpo = "" ;
      A948MnuPgmTpo = "" ;
      Z949MnuPgmTxt = "" ;
      A949MnuPgmTxt = "" ;
      Z951MnuTxt = "" ;
      A951MnuTxt = "" ;
      BC01UA5_A946MnuOp = new byte[1] ;
      BC01UA5_A951MnuTxt = new String[] {""} ;
      BC01UA5_n951MnuTxt = new boolean[] {false} ;
      BC01UA5_A947MnuPgm = new String[] {""} ;
      BC01UA5_A14286MnuPgmWeb = new String[] {""} ;
      BC01UA5_A948MnuPgmTpo = new String[] {""} ;
      BC01UA5_A949MnuPgmTxt = new String[] {""} ;
      BC01UA5_A945MnuId = new String[] {""} ;
      BC01UA6_A951MnuTxt = new String[] {""} ;
      BC01UA6_n951MnuTxt = new boolean[] {false} ;
      BC01UA7_A945MnuId = new String[] {""} ;
      BC01UA7_A946MnuOp = new byte[1] ;
      BC01UA8_A946MnuOp = new byte[1] ;
      BC01UA8_A947MnuPgm = new String[] {""} ;
      BC01UA8_A14286MnuPgmWeb = new String[] {""} ;
      BC01UA8_A948MnuPgmTpo = new String[] {""} ;
      BC01UA8_A949MnuPgmTxt = new String[] {""} ;
      BC01UA8_A945MnuId = new String[] {""} ;
      sMode125 = "" ;
      BC01UA9_A946MnuOp = new byte[1] ;
      BC01UA9_A947MnuPgm = new String[] {""} ;
      BC01UA9_A14286MnuPgmWeb = new String[] {""} ;
      BC01UA9_A948MnuPgmTpo = new String[] {""} ;
      BC01UA9_A949MnuPgmTxt = new String[] {""} ;
      BC01UA9_A945MnuId = new String[] {""} ;
      BC01UA13_A951MnuTxt = new String[] {""} ;
      BC01UA13_n951MnuTxt = new boolean[] {false} ;
      BC01UA14_A945MnuId = new String[] {""} ;
      BC01UA14_A946MnuOp = new byte[1] ;
      BC01UA14_A943GrpId = new String[] {""} ;
      BC01UA15_A946MnuOp = new byte[1] ;
      BC01UA15_A951MnuTxt = new String[] {""} ;
      BC01UA15_n951MnuTxt = new boolean[] {false} ;
      BC01UA15_A947MnuPgm = new String[] {""} ;
      BC01UA15_A14286MnuPgmWeb = new String[] {""} ;
      BC01UA15_A948MnuPgmTpo = new String[] {""} ;
      BC01UA15_A949MnuPgmTxt = new String[] {""} ;
      BC01UA15_A945MnuId = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01UA16_A951MnuTxt = new String[] {""} ;
      BC01UA16_n951MnuTxt = new boolean[] {false} ;
      BC01UA17_A951MnuTxt = new String[] {""} ;
      BC01UA17_n951MnuTxt = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmenunivel1_bc__default(),
         new Object[] {
             new Object[] {
            BC01UA2_A946MnuOp, BC01UA2_A947MnuPgm, BC01UA2_A14286MnuPgmWeb, BC01UA2_A948MnuPgmTpo, BC01UA2_A949MnuPgmTxt, BC01UA2_A945MnuId
            }
            , new Object[] {
            BC01UA3_A946MnuOp, BC01UA3_A947MnuPgm, BC01UA3_A14286MnuPgmWeb, BC01UA3_A948MnuPgmTpo, BC01UA3_A949MnuPgmTxt, BC01UA3_A945MnuId
            }
            , new Object[] {
            BC01UA4_A951MnuTxt, BC01UA4_n951MnuTxt
            }
            , new Object[] {
            BC01UA5_A946MnuOp, BC01UA5_A951MnuTxt, BC01UA5_n951MnuTxt, BC01UA5_A947MnuPgm, BC01UA5_A14286MnuPgmWeb, BC01UA5_A948MnuPgmTpo, BC01UA5_A949MnuPgmTxt, BC01UA5_A945MnuId
            }
            , new Object[] {
            BC01UA6_A951MnuTxt, BC01UA6_n951MnuTxt
            }
            , new Object[] {
            BC01UA7_A945MnuId, BC01UA7_A946MnuOp
            }
            , new Object[] {
            BC01UA8_A946MnuOp, BC01UA8_A947MnuPgm, BC01UA8_A14286MnuPgmWeb, BC01UA8_A948MnuPgmTpo, BC01UA8_A949MnuPgmTxt, BC01UA8_A945MnuId
            }
            , new Object[] {
            BC01UA9_A946MnuOp, BC01UA9_A947MnuPgm, BC01UA9_A14286MnuPgmWeb, BC01UA9_A948MnuPgmTpo, BC01UA9_A949MnuPgmTxt, BC01UA9_A945MnuId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01UA13_A951MnuTxt, BC01UA13_n951MnuTxt
            }
            , new Object[] {
            BC01UA14_A945MnuId, BC01UA14_A946MnuOp, BC01UA14_A943GrpId
            }
            , new Object[] {
            BC01UA15_A946MnuOp, BC01UA15_A951MnuTxt, BC01UA15_n951MnuTxt, BC01UA15_A947MnuPgm, BC01UA15_A14286MnuPgmWeb, BC01UA15_A948MnuPgmTpo, BC01UA15_A949MnuPgmTxt, BC01UA15_A945MnuId
            }
            , new Object[] {
            BC01UA16_A951MnuTxt, BC01UA16_n951MnuTxt
            }
            , new Object[] {
            BC01UA17_A951MnuTxt, BC01UA17_n951MnuTxt
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z946MnuOp ;
   private byte A946MnuOp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound125 ;
   private short nIsDirty_125 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z945MnuId ;
   private String A945MnuId ;
   private String Z947MnuPgm ;
   private String A947MnuPgm ;
   private String Z948MnuPgmTpo ;
   private String A948MnuPgmTpo ;
   private String Z949MnuPgmTxt ;
   private String A949MnuPgmTxt ;
   private String Z951MnuTxt ;
   private String A951MnuTxt ;
   private String sMode125 ;
   private boolean n951MnuTxt ;
   private boolean mustCommit ;
   private String Z14286MnuPgmWeb ;
   private String A14286MnuPgmWeb ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.SdtTMENUNIVEL1 bcTMENUNIVEL1 ;
   private IDataStoreProvider pr_default ;
   private byte[] BC01UA5_A946MnuOp ;
   private String[] BC01UA5_A951MnuTxt ;
   private boolean[] BC01UA5_n951MnuTxt ;
   private String[] BC01UA5_A947MnuPgm ;
   private String[] BC01UA5_A14286MnuPgmWeb ;
   private String[] BC01UA5_A948MnuPgmTpo ;
   private String[] BC01UA5_A949MnuPgmTxt ;
   private String[] BC01UA5_A945MnuId ;
   private String[] BC01UA6_A951MnuTxt ;
   private boolean[] BC01UA6_n951MnuTxt ;
   private String[] BC01UA7_A945MnuId ;
   private byte[] BC01UA7_A946MnuOp ;
   private byte[] BC01UA8_A946MnuOp ;
   private String[] BC01UA8_A947MnuPgm ;
   private String[] BC01UA8_A14286MnuPgmWeb ;
   private String[] BC01UA8_A948MnuPgmTpo ;
   private String[] BC01UA8_A949MnuPgmTxt ;
   private String[] BC01UA8_A945MnuId ;
   private byte[] BC01UA9_A946MnuOp ;
   private String[] BC01UA9_A947MnuPgm ;
   private String[] BC01UA9_A14286MnuPgmWeb ;
   private String[] BC01UA9_A948MnuPgmTpo ;
   private String[] BC01UA9_A949MnuPgmTxt ;
   private String[] BC01UA9_A945MnuId ;
   private String[] BC01UA13_A951MnuTxt ;
   private boolean[] BC01UA13_n951MnuTxt ;
   private String[] BC01UA14_A945MnuId ;
   private byte[] BC01UA14_A946MnuOp ;
   private String[] BC01UA14_A943GrpId ;
   private byte[] BC01UA15_A946MnuOp ;
   private String[] BC01UA15_A951MnuTxt ;
   private boolean[] BC01UA15_n951MnuTxt ;
   private String[] BC01UA15_A947MnuPgm ;
   private String[] BC01UA15_A14286MnuPgmWeb ;
   private String[] BC01UA15_A948MnuPgmTpo ;
   private String[] BC01UA15_A949MnuPgmTxt ;
   private String[] BC01UA15_A945MnuId ;
   private String[] BC01UA16_A951MnuTxt ;
   private boolean[] BC01UA16_n951MnuTxt ;
   private String[] BC01UA17_A951MnuTxt ;
   private boolean[] BC01UA17_n951MnuTxt ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private byte[] BC01UA2_A946MnuOp ;
   private String[] BC01UA2_A947MnuPgm ;
   private String[] BC01UA2_A14286MnuPgmWeb ;
   private String[] BC01UA2_A948MnuPgmTpo ;
   private String[] BC01UA2_A949MnuPgmTxt ;
   private String[] BC01UA2_A945MnuId ;
   private byte[] BC01UA3_A946MnuOp ;
   private String[] BC01UA3_A947MnuPgm ;
   private String[] BC01UA3_A14286MnuPgmWeb ;
   private String[] BC01UA3_A948MnuPgmTpo ;
   private String[] BC01UA3_A949MnuPgmTxt ;
   private String[] BC01UA3_A945MnuId ;
   private String[] BC01UA4_A951MnuTxt ;
   private boolean[] BC01UA4_n951MnuTxt ;
}

final  class tmenunivel1_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmenunivel1_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01UA2", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ?  FOR UPDATE OF MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA3", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA4", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA5", "SELECT /*+ FIRST_ROWS(100) */ TM1.MnuOp, T2.MnuTxt, TM1.MnuPgm, TM1.MnuPgmWeb, TM1.MnuPgmTpo, TM1.MnuPgmTxt, TM1.MnuId FROM (TXPMNUOP TM1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = TM1.MnuId) WHERE TM1.MnuId = ? and TM1.MnuOp = ? ORDER BY TM1.MnuId, TM1.MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA6", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA7", "SELECT /*+ FIRST_ROWS(1) */ MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA8", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA9", "SELECT MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ?  FOR UPDATE OF MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01UA10", "INSERT INTO TXPMNUOP(MnuOp, MnuPgm, MnuPgmWeb, MnuPgmTpo, MnuPgmTxt, MnuId, MnuIcon, MnuSit) VALUES(?, ?, ?, ?, ?, ?, ' ', ' ')", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("BC01UA11", "UPDATE TXPMNUOP SET MnuPgm=?, MnuPgmWeb=?, MnuPgmTpo=?, MnuPgmTxt=?  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("BC01UA12", "DELETE FROM TXPMNUOP  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new ForEachCursor("BC01UA13", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA14", "SELECT * FROM (SELECT MnuId, MnuOp, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01UA15", "SELECT /*+ FIRST_ROWS(100) */ TM1.MnuOp, T2.MnuTxt, TM1.MnuPgm, TM1.MnuPgmWeb, TM1.MnuPgmTpo, TM1.MnuPgmTxt, TM1.MnuId FROM (TXPMNUOP TM1 INNER JOIN TXPMNUCAB T2 ON T2.MnuId = TM1.MnuId) WHERE TM1.MnuId = ? and TM1.MnuOp = ? ORDER BY TM1.MnuId, TM1.MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA16", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01UA17", "SELECT MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getVarchar(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setVarchar(3, (String)parms[2], 200, false);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 30);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

