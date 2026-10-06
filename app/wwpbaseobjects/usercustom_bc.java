package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class usercustom_bc extends GXWebPanel implements IGxSilentTrn
{
   public usercustom_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public usercustom_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( usercustom_bc.class ));
   }

   public usercustom_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1V11904( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1V11904( ) ;
      standaloneModal( ) ;
      addRow1V11904( ) ;
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
            Z14365SecUserId = A14365SecUserId ;
            Z14369UsrCusKey = A14369UsrCusKey ;
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

   public void confirm_1V10( )
   {
      beforeValidate1V11904( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1V11904( ) ;
         }
         else
         {
            checkExtendedTable1V11904( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1V11904( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1V11904( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -1 )
      {
         Z14365SecUserId = A14365SecUserId ;
         Z14369UsrCusKey = A14369UsrCusKey ;
         Z14370UsrCusVal = A14370UsrCusVal ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1V11904( )
   {
      /* Using cursor BC01V14 */
      pr_default.execute(2, new Object[] {A14365SecUserId, A14369UsrCusKey});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound1904 = (short)(1) ;
         A14370UsrCusVal = BC01V14_A14370UsrCusVal[0] ;
         zm1V11904( -1) ;
      }
      pr_default.close(2);
      onLoadActions1V11904( ) ;
   }

   public void onLoadActions1V11904( )
   {
   }

   public void checkExtendedTable1V11904( )
   {
      nIsDirty_1904 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1V11904( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1V11904( )
   {
      /* Using cursor BC01V15 */
      pr_default.execute(3, new Object[] {A14365SecUserId, A14369UsrCusKey});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1904 = (short)(1) ;
      }
      else
      {
         RcdFound1904 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01V16 */
      pr_default.execute(4, new Object[] {A14365SecUserId, A14369UsrCusKey});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1V11904( 1) ;
         RcdFound1904 = (short)(1) ;
         A14370UsrCusVal = BC01V16_A14370UsrCusVal[0] ;
         A14365SecUserId = BC01V16_A14365SecUserId[0] ;
         A14369UsrCusKey = BC01V16_A14369UsrCusKey[0] ;
         Z14365SecUserId = A14365SecUserId ;
         Z14369UsrCusKey = A14369UsrCusKey ;
         sMode1904 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1V11904( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1904 = (short)(0) ;
            initializeNonKey1V11904( ) ;
         }
         Gx_mode = sMode1904 ;
      }
      else
      {
         RcdFound1904 = (short)(0) ;
         initializeNonKey1V11904( ) ;
         sMode1904 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1904 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1V11904( ) ;
      if ( RcdFound1904 == 0 )
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
      confirm_1V10( ) ;
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

   public void checkOptimisticConcurrency1V11904( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01V17 */
         pr_default.execute(5, new Object[] {A14365SecUserId, A14369UsrCusKey});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSRECU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUSRECU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1V11904( )
   {
      beforeValidate1V11904( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V11904( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1V11904( 0) ;
         checkOptimisticConcurrency1V11904( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V11904( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1V11904( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01V18 */
                  pr_default.execute(6, new Object[] {A14365SecUserId, A14369UsrCusKey, A14370UsrCusVal});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSRECU");
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
            load1V11904( ) ;
         }
         endLevel1V11904( ) ;
      }
      closeExtendedTableCursors1V11904( ) ;
   }

   public void update1V11904( )
   {
      beforeValidate1V11904( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1V11904( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V11904( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1V11904( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1V11904( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01V19 */
                  pr_default.execute(7, new Object[] {A14370UsrCusVal, A14365SecUserId, A14369UsrCusKey});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSRECU");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSRECU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1V11904( ) ;
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
         endLevel1V11904( ) ;
      }
      closeExtendedTableCursors1V11904( ) ;
   }

   public void deferredUpdate1V11904( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1V11904( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1V11904( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1V11904( ) ;
         afterConfirm1V11904( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1V11904( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01V110 */
               pr_default.execute(8, new Object[] {A14365SecUserId, A14369UsrCusKey});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSRECU");
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
      sMode1904 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1V11904( ) ;
      Gx_mode = sMode1904 ;
   }

   public void onDeleteControls1V11904( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1V11904( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1V11904( ) ;
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

   public void scanKeyStart1V11904( )
   {
      /* Using cursor BC01V111 */
      pr_default.execute(9, new Object[] {A14365SecUserId, A14369UsrCusKey});
      RcdFound1904 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1904 = (short)(1) ;
         A14370UsrCusVal = BC01V111_A14370UsrCusVal[0] ;
         A14365SecUserId = BC01V111_A14365SecUserId[0] ;
         A14369UsrCusKey = BC01V111_A14369UsrCusKey[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1V11904( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound1904 = (short)(0) ;
      scanKeyLoad1V11904( ) ;
   }

   public void scanKeyLoad1V11904( )
   {
      sMode1904 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1904 = (short)(1) ;
         A14370UsrCusVal = BC01V111_A14370UsrCusVal[0] ;
         A14365SecUserId = BC01V111_A14365SecUserId[0] ;
         A14369UsrCusKey = BC01V111_A14369UsrCusKey[0] ;
      }
      Gx_mode = sMode1904 ;
   }

   public void scanKeyEnd1V11904( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1V11904( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1V11904( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1V11904( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1V11904( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1V11904( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1V11904( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1V11904( )
   {
   }

   public void send_integrity_lvl_hashes1V11904( )
   {
   }

   public void addRow1V11904( )
   {
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
   }

   public void readRow1V11904( )
   {
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
   }

   public void initializeNonKey1V11904( )
   {
      A14370UsrCusVal = "" ;
   }

   public void initAll1V11904( )
   {
      A14365SecUserId = "" ;
      A14369UsrCusKey = "" ;
      initializeNonKey1V11904( ) ;
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

   public void VarsToRow1904( app.wwpbaseobjects.SdtUserCustom obj1904 )
   {
      obj1904.setgxTv_SdtUserCustom_Mode( Gx_mode );
      obj1904.setgxTv_SdtUserCustom_Usrcusval( A14370UsrCusVal );
      obj1904.setgxTv_SdtUserCustom_Secuserid( A14365SecUserId );
      obj1904.setgxTv_SdtUserCustom_Usrcuskey( A14369UsrCusKey );
      obj1904.setgxTv_SdtUserCustom_Secuserid_Z( Z14365SecUserId );
      obj1904.setgxTv_SdtUserCustom_Usrcuskey_Z( Z14369UsrCusKey );
      obj1904.setgxTv_SdtUserCustom_Mode( Gx_mode );
   }

   public void KeyVarsToRow1904( app.wwpbaseobjects.SdtUserCustom obj1904 )
   {
      obj1904.setgxTv_SdtUserCustom_Secuserid( A14365SecUserId );
      obj1904.setgxTv_SdtUserCustom_Usrcuskey( A14369UsrCusKey );
   }

   public void RowToVars1904( app.wwpbaseobjects.SdtUserCustom obj1904 ,
                              int forceLoad )
   {
      Gx_mode = obj1904.getgxTv_SdtUserCustom_Mode() ;
      A14370UsrCusVal = obj1904.getgxTv_SdtUserCustom_Usrcusval() ;
      A14365SecUserId = obj1904.getgxTv_SdtUserCustom_Secuserid() ;
      A14369UsrCusKey = obj1904.getgxTv_SdtUserCustom_Usrcuskey() ;
      Z14365SecUserId = obj1904.getgxTv_SdtUserCustom_Secuserid_Z() ;
      Z14369UsrCusKey = obj1904.getgxTv_SdtUserCustom_Usrcuskey_Z() ;
      Gx_mode = obj1904.getgxTv_SdtUserCustom_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A14365SecUserId = (String)getParm(obj,0) ;
      A14369UsrCusKey = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1V11904( ) ;
      scanKeyStart1V11904( ) ;
      if ( RcdFound1904 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14365SecUserId = A14365SecUserId ;
         Z14369UsrCusKey = A14369UsrCusKey ;
      }
      zm1V11904( -1) ;
      onLoadActions1V11904( ) ;
      addRow1V11904( ) ;
      scanKeyEnd1V11904( ) ;
      if ( RcdFound1904 == 0 )
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
      RowToVars1904( bcwwpbaseobjects_UserCustom, 0) ;
      scanKeyStart1V11904( ) ;
      if ( RcdFound1904 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z14365SecUserId = A14365SecUserId ;
         Z14369UsrCusKey = A14369UsrCusKey ;
      }
      zm1V11904( -1) ;
      onLoadActions1V11904( ) ;
      addRow1V11904( ) ;
      scanKeyEnd1V11904( ) ;
      if ( RcdFound1904 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1V11904( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1V11904( ) ;
      }
      else
      {
         if ( RcdFound1904 == 1 )
         {
            if ( ( GXutil.strcmp(A14365SecUserId, Z14365SecUserId) != 0 ) || ( GXutil.strcmp(A14369UsrCusKey, Z14369UsrCusKey) != 0 ) )
            {
               A14365SecUserId = Z14365SecUserId ;
               A14369UsrCusKey = Z14369UsrCusKey ;
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
               update1V11904( ) ;
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
               if ( ( GXutil.strcmp(A14365SecUserId, Z14365SecUserId) != 0 ) || ( GXutil.strcmp(A14369UsrCusKey, Z14369UsrCusKey) != 0 ) )
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
                     insert1V11904( ) ;
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
                     insert1V11904( ) ;
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
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
      saveImpl( ) ;
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1V11904( ) ;
      afterTrn( ) ;
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
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
         app.wwpbaseobjects.SdtUserCustom auxBC = new app.wwpbaseobjects.SdtUserCustom( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A14365SecUserId, A14369UsrCusKey);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcwwpbaseobjects_UserCustom);
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
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
      updateImpl( ) ;
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
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
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1V11904( ) ;
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
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1904( bcwwpbaseobjects_UserCustom, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1V11904( ) ;
      if ( RcdFound1904 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A14365SecUserId, Z14365SecUserId) != 0 ) || ( GXutil.strcmp(A14369UsrCusKey, Z14369UsrCusKey) != 0 ) )
         {
            A14365SecUserId = Z14365SecUserId ;
            A14369UsrCusKey = Z14369UsrCusKey ;
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
         if ( ( GXutil.strcmp(A14365SecUserId, Z14365SecUserId) != 0 ) || ( GXutil.strcmp(A14369UsrCusKey, Z14369UsrCusKey) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "wwpbaseobjects.usercustom_bc");
      VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
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
      Gx_mode = bcwwpbaseobjects_UserCustom.getgxTv_SdtUserCustom_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcwwpbaseobjects_UserCustom.setgxTv_SdtUserCustom_Mode( Gx_mode );
   }

   public void SetSDT( app.wwpbaseobjects.SdtUserCustom sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcwwpbaseobjects_UserCustom )
      {
         bcwwpbaseobjects_UserCustom = sdt ;
         if ( GXutil.strcmp(bcwwpbaseobjects_UserCustom.getgxTv_SdtUserCustom_Mode(), "") == 0 )
         {
            bcwwpbaseobjects_UserCustom.setgxTv_SdtUserCustom_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1904( bcwwpbaseobjects_UserCustom) ;
         }
         else
         {
            RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcwwpbaseobjects_UserCustom.getgxTv_SdtUserCustom_Mode(), "") == 0 )
         {
            bcwwpbaseobjects_UserCustom.setgxTv_SdtUserCustom_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1904( bcwwpbaseobjects_UserCustom, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtUserCustom getUserCustom_BC( )
   {
      return bcwwpbaseobjects_UserCustom ;
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
      Z14365SecUserId = "" ;
      A14365SecUserId = "" ;
      Z14369UsrCusKey = "" ;
      A14369UsrCusKey = "" ;
      Z14370UsrCusVal = "" ;
      A14370UsrCusVal = "" ;
      BC01V14_A14370UsrCusVal = new String[] {""} ;
      BC01V14_A14365SecUserId = new String[] {""} ;
      BC01V14_A14369UsrCusKey = new String[] {""} ;
      BC01V15_A14365SecUserId = new String[] {""} ;
      BC01V15_A14369UsrCusKey = new String[] {""} ;
      BC01V16_A14370UsrCusVal = new String[] {""} ;
      BC01V16_A14365SecUserId = new String[] {""} ;
      BC01V16_A14369UsrCusKey = new String[] {""} ;
      sMode1904 = "" ;
      BC01V17_A14370UsrCusVal = new String[] {""} ;
      BC01V17_A14365SecUserId = new String[] {""} ;
      BC01V17_A14369UsrCusKey = new String[] {""} ;
      BC01V111_A14370UsrCusVal = new String[] {""} ;
      BC01V111_A14365SecUserId = new String[] {""} ;
      BC01V111_A14369UsrCusKey = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.usercustom_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.usercustom_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.usercustom_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wwpbaseobjects.usercustom_bc__default(),
         new Object[] {
             new Object[] {
            BC01V12_A14370UsrCusVal, BC01V12_A14365SecUserId, BC01V12_A14369UsrCusKey
            }
            , new Object[] {
            BC01V13_A14370UsrCusVal, BC01V13_A14365SecUserId, BC01V13_A14369UsrCusKey
            }
            , new Object[] {
            BC01V14_A14370UsrCusVal, BC01V14_A14365SecUserId, BC01V14_A14369UsrCusKey
            }
            , new Object[] {
            BC01V15_A14365SecUserId, BC01V15_A14369UsrCusKey
            }
            , new Object[] {
            BC01V16_A14370UsrCusVal, BC01V16_A14365SecUserId, BC01V16_A14369UsrCusKey
            }
            , new Object[] {
            BC01V17_A14370UsrCusVal, BC01V17_A14365SecUserId, BC01V17_A14369UsrCusKey
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01V111_A14370UsrCusVal, BC01V111_A14365SecUserId, BC01V111_A14369UsrCusKey
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1904 ;
   private short nIsDirty_1904 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1904 ;
   private boolean mustCommit ;
   private String Z14370UsrCusVal ;
   private String A14370UsrCusVal ;
   private String Z14365SecUserId ;
   private String A14365SecUserId ;
   private String Z14369UsrCusKey ;
   private String A14369UsrCusKey ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.wwpbaseobjects.SdtUserCustom bcwwpbaseobjects_UserCustom ;
   private IDataStoreProvider pr_default ;
   private String[] BC01V14_A14370UsrCusVal ;
   private String[] BC01V14_A14365SecUserId ;
   private String[] BC01V14_A14369UsrCusKey ;
   private String[] BC01V15_A14365SecUserId ;
   private String[] BC01V15_A14369UsrCusKey ;
   private String[] BC01V16_A14370UsrCusVal ;
   private String[] BC01V16_A14365SecUserId ;
   private String[] BC01V16_A14369UsrCusKey ;
   private String[] BC01V17_A14370UsrCusVal ;
   private String[] BC01V17_A14365SecUserId ;
   private String[] BC01V17_A14369UsrCusKey ;
   private String[] BC01V111_A14370UsrCusVal ;
   private String[] BC01V111_A14365SecUserId ;
   private String[] BC01V111_A14369UsrCusKey ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01V12_A14370UsrCusVal ;
   private String[] BC01V12_A14365SecUserId ;
   private String[] BC01V12_A14369UsrCusKey ;
   private String[] BC01V13_A14370UsrCusVal ;
   private String[] BC01V13_A14365SecUserId ;
   private String[] BC01V13_A14369UsrCusKey ;
}

final  class usercustom_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class usercustom_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class usercustom_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class usercustom_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01V12", "SELECT UsrCusVal, SecUserId, UsrCusKey FROM TXPUSRECU WHERE SecUserId = ? AND UsrCusKey = ?  FOR UPDATE OF UsrCusVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01V13", "SELECT UsrCusVal, SecUserId, UsrCusKey FROM TXPUSRECU WHERE SecUserId = ? AND UsrCusKey = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01V14", "SELECT /*+ FIRST_ROWS(100) */ TM1.UsrCusVal, TM1.SecUserId, TM1.UsrCusKey FROM TXPUSRECU TM1 WHERE TM1.SecUserId = ? and TM1.UsrCusKey = ? ORDER BY TM1.SecUserId, TM1.UsrCusKey ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01V15", "SELECT /*+ FIRST_ROWS(1) */ SecUserId, UsrCusKey FROM TXPUSRECU WHERE SecUserId = ? AND UsrCusKey = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01V16", "SELECT UsrCusVal, SecUserId, UsrCusKey FROM TXPUSRECU WHERE SecUserId = ? AND UsrCusKey = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01V17", "SELECT UsrCusVal, SecUserId, UsrCusKey FROM TXPUSRECU WHERE SecUserId = ? AND UsrCusKey = ?  FOR UPDATE OF UsrCusVal NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01V18", "INSERT INTO TXPUSRECU(SecUserId, UsrCusKey, UsrCusVal) VALUES(?, ?, ?)", GX_NOMASK, "TXPUSRECU")
         ,new UpdateCursor("BC01V19", "UPDATE TXPUSRECU SET UsrCusVal=?  WHERE SecUserId = ? AND UsrCusKey = ?", GX_NOMASK, "TXPUSRECU")
         ,new UpdateCursor("BC01V110", "DELETE FROM TXPUSRECU  WHERE SecUserId = ? AND UsrCusKey = ?", GX_NOMASK, "TXPUSRECU")
         ,new ForEachCursor("BC01V111", "SELECT /*+ FIRST_ROWS(100) */ TM1.UsrCusVal, TM1.SecUserId, TM1.UsrCusKey FROM TXPUSRECU TM1 WHERE TM1.SecUserId = ? and TM1.UsrCusKey = ? ORDER BY TM1.SecUserId, TM1.UsrCusKey ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               stmt.setLongVarchar(3, (String)parms[2], false);
               return;
            case 7 :
               stmt.setLongVarchar(1, (String)parms[0], false);
               stmt.setVarchar(2, (String)parms[1], 40, false);
               stmt.setVarchar(3, (String)parms[2], 200, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40, false);
               stmt.setVarchar(2, (String)parms[1], 200, false);
               return;
      }
   }

}

