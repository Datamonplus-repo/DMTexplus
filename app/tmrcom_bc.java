package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrcom_bc extends GXWebPanel implements IGxSilentTrn
{
   public tmrcom_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmrcom_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrcom_bc.class ));
   }

   public tmrcom_bc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow16M1345( ) ;
      standaloneNotModal( ) ;
      initializeNonKey16M1345( ) ;
      standaloneModal( ) ;
      addRow16M1345( ) ;
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
         e1116M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z1061MRPriCod = A1061MRPriCod ;
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

   public void confirm_16M0( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16M1345( ) ;
         }
         else
         {
            checkExtendedTable16M1345( ) ;
            if ( AnyError == 0 )
            {
               zm16M1345( 2) ;
               zm16M1345( 3) ;
            }
            closeExtendedTableCursors16M1345( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1345 = Gx_mode ;
         confirm_16M1346( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1345 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode1345 ;
      }
   }

   public void confirm_16M1346( )
   {
      nGXsfl_1346_idx = 0 ;
      while ( nGXsfl_1346_idx < bcTMRCom.getgxTv_SdtTMRCom_Level1().size() )
      {
         readRow16M1346( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1346 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1346 != 0 ) )
         {
            getKey16M1346( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound1346 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate16M1346( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        zm16M1346( 5) ;
                     }
                     closeExtendedTableCursors16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1346 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey16M1346( ) ;
                     load16M1346( ) ;
                     beforeValidate16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16M1346( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1346 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate16M1346( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16M1346( ) ;
                           if ( AnyError == 0 )
                           {
                              zm16M1346( 5) ;
                           }
                           closeExtendedTableCursors16M1346( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( ! isDlt( ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            VarsToRow1346( ((app.SdtTMRCom_Level1Item)bcTMRCom.getgxTv_SdtTMRCom_Level1().elementAt(-1+nGXsfl_1346_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e1216M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmrcom_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV28Pgmname, (byte)(99), GXv_char2) ;
      tmrcom_bc.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmrcom_bc.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmrcom_bc.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      GXv_char2[0] = AV27ObtenerEmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmrcom_bc.this.AV27ObtenerEmprCod = GXv_char2[0] ;
      tmrcom_bc.this.AV14EmprNom = GXv_char3[0] ;
      tmrcom_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmrcom_bc.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      GXv_char4[0] = AV15EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmrcom_bc.this.AV15EmprCod = GXv_char4[0] ;
      tmrcom_bc.this.AV14EmprNom = GXv_char3[0] ;
      tmrcom_bc.this.AV8UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV17WWPContext = GXv_SdtWWPContext5[0] ;
      AV18TrnContext.fromxml(AV19WebSession.getValue("TrnContext"), null, null);
   }

   public void e1116M2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         httpContext.popup(formatLink("app.vistatmrcom", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16MRPriCod,8,0))}, new String[] {"EmprCod","MRPriCod"}) , new Object[] {});
      }
      else
      {
      }
   }

   public void zm16M1345( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z1062MRPriNom = A1062MRPriNom ;
      }
      if ( GX_JID == -1 )
      {
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         Z407EmprNom = A407EmprNom ;
         Z1062MRPriNom = A1062MRPriNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV28Pgmname = "TMRCom_BC" ;
   }

   public void standaloneModal( )
   {
   }

   public void load16M1345( )
   {
      /* Using cursor BC016M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A407EmprNom = BC016M9_A407EmprNom[0] ;
         n407EmprNom = BC016M9_n407EmprNom[0] ;
         A1062MRPriNom = BC016M9_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M9_n1062MRPriNom[0] ;
         zm16M1345( -1) ;
      }
      pr_default.close(7);
      onLoadActions16M1345( ) ;
   }

   public void onLoadActions16M1345( )
   {
   }

   public void checkExtendedTable16M1345( )
   {
      nIsDirty_1345 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC016M10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC016M10_A407EmprNom[0] ;
      n407EmprNom = BC016M10_n407EmprNom[0] ;
      pr_default.close(8);
      /* Using cursor BC016M11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
         AnyError = (short)(1) ;
      }
      A1062MRPriNom = BC016M11_A1062MRPriNom[0] ;
      n1062MRPriNom = BC016M11_n1062MRPriNom[0] ;
      pr_default.close(9);
   }

   public void closeExtendedTableCursors16M1345( )
   {
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void getKey16M1345( )
   {
      /* Using cursor BC016M12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1345 = (short)(1) ;
      }
      else
      {
         RcdFound1345 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC016M13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         zm16M1345( 1) ;
         RcdFound1345 = (short)(1) ;
         A396EmprCod = BC016M13_A396EmprCod[0] ;
         A1061MRPriCod = BC016M13_A1061MRPriCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         sMode1345 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load16M1345( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1345 = (short)(0) ;
            initializeNonKey16M1345( ) ;
         }
         Gx_mode = sMode1345 ;
      }
      else
      {
         RcdFound1345 = (short)(0) ;
         initializeNonKey16M1345( ) ;
         sMode1345 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1345 ;
      }
      pr_default.close(11);
   }

   public void getEqualNoModal( )
   {
      getKey16M1345( ) ;
      if ( RcdFound1345 == 0 )
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
      confirm_16M0( ) ;
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

   public void checkOptimisticConcurrency16M1345( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC016M14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         if ( (pr_default.getStatus(12) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRCom"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(12) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRCom"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16M1345( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16M1345( 0) ;
         checkOptimisticConcurrency16M1345( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1345( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16M1345( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC016M15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel16M1345( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                        }
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
            load16M1345( ) ;
         }
         endLevel16M1345( ) ;
      }
      closeExtendedTableCursors16M1345( ) ;
   }

   public void update16M1345( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1345( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1345( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16M1345( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMRCom */
                  deferredUpdate16M1345( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16M1345( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
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
         }
         endLevel16M1345( ) ;
      }
      closeExtendedTableCursors16M1345( ) ;
   }

   public void deferredUpdate16M1345( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16M1345( ) ;
         afterConfirm16M1345( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16M1345( ) ;
            if ( AnyError == 0 )
            {
               scanKeyStart16M1346( ) ;
               while ( RcdFound1346 != 0 )
               {
                  getByPrimaryKey16M1346( ) ;
                  delete16M1346( ) ;
                  scanKeyNext16M1346( ) ;
               }
               scanKeyEnd16M1346( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC016M16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom");
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
      }
      sMode1345 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel16M1345( ) ;
      Gx_mode = sMode1345 ;
   }

   public void onDeleteControls16M1345( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC016M17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = BC016M17_A407EmprNom[0] ;
         n407EmprNom = BC016M17_n407EmprNom[0] ;
         pr_default.close(15);
         /* Using cursor BC016M18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         A1062MRPriNom = BC016M18_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M18_n1062MRPriNom[0] ;
         pr_default.close(16);
      }
   }

   public void processNestedLevel16M1346( )
   {
      nGXsfl_1346_idx = 0 ;
      while ( nGXsfl_1346_idx < bcTMRCom.getgxTv_SdtTMRCom_Level1().size() )
      {
         readRow16M1346( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1346 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1346 != 0 ) )
         {
            standaloneNotModal16M1346( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert16M1346( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete16M1346( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update16M1346( ) ;
               }
            }
         }
         KeyVarsToRow1346( ((app.SdtTMRCom_Level1Item)bcTMRCom.getgxTv_SdtTMRCom_Level1().elementAt(-1+nGXsfl_1346_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_1346_idx = 0 ;
         while ( nGXsfl_1346_idx < bcTMRCom.getgxTv_SdtTMRCom_Level1().size() )
         {
            readRow16M1346( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound1346 == 0 )
               {
                  Gx_mode = "INS" ;
               }
               else
               {
                  Gx_mode = "UPD" ;
               }
            }
            /* Update SDT row */
            if ( isDlt( ) )
            {
               bcTMRCom.getgxTv_SdtTMRCom_Level1().removeElement(nGXsfl_1346_idx);
               nGXsfl_1346_idx = (int)(nGXsfl_1346_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey16M1346( ) ;
               VarsToRow1346( ((app.SdtTMRCom_Level1Item)bcTMRCom.getgxTv_SdtTMRCom_Level1().elementAt(-1+nGXsfl_1346_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16M1346( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1346 = (short)(0) ;
      nIsMod_1346 = (short)(0) ;
      Gxremove1346 = (byte)(0) ;
   }

   public void processLevel16M1345( )
   {
      /* Save parent mode. */
      sMode1345 = Gx_mode ;
      processNestedLevel16M1346( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1345 ;
      /* ' Update level parameters */
   }

   public void endLevel16M1345( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16M1345( ) ;
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

   public void scanKeyStart16M1345( )
   {
      /* Scan By routine */
      /* Using cursor BC016M19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      RcdFound1345 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A407EmprNom = BC016M19_A407EmprNom[0] ;
         n407EmprNom = BC016M19_n407EmprNom[0] ;
         A1062MRPriNom = BC016M19_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M19_n1062MRPriNom[0] ;
         A396EmprCod = BC016M19_A396EmprCod[0] ;
         A1061MRPriCod = BC016M19_A1061MRPriCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext16M1345( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1345 = (short)(0) ;
      scanKeyLoad16M1345( ) ;
   }

   public void scanKeyLoad16M1345( )
   {
      sMode1345 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A407EmprNom = BC016M19_A407EmprNom[0] ;
         n407EmprNom = BC016M19_n407EmprNom[0] ;
         A1062MRPriNom = BC016M19_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M19_n1062MRPriNom[0] ;
         A396EmprCod = BC016M19_A396EmprCod[0] ;
         A1061MRPriCod = BC016M19_A1061MRPriCod[0] ;
      }
      Gx_mode = sMode1345 ;
   }

   public void scanKeyEnd16M1345( )
   {
      pr_default.close(17);
   }

   public void afterConfirm16M1345( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16M1345( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16M1345( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16M1345( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16M1345( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16M1345( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16M1345( )
   {
   }

   public void zm16M1346( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
      }
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z1064MRComNom = A1064MRComNom ;
      }
      if ( GX_JID == -4 )
      {
         Z1061MRPriCod = A1061MRPriCod ;
         Z396EmprCod = A396EmprCod ;
         Z1063MRComCod = A1063MRComCod ;
         Z1064MRComNom = A1064MRComNom ;
      }
   }

   public void standaloneNotModal16M1346( )
   {
   }

   public void standaloneModal16M1346( )
   {
   }

   public void load16M1346( )
   {
      /* Using cursor BC016M20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1064MRComNom = BC016M20_A1064MRComNom[0] ;
         n1064MRComNom = BC016M20_n1064MRComNom[0] ;
         zm16M1346( -4) ;
      }
      pr_default.close(18);
      onLoadActions16M1346( ) ;
   }

   public void onLoadActions16M1346( )
   {
   }

   public void checkExtendedTable16M1346( )
   {
      nIsDirty_1346 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16M1346( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC016M21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRCom", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOMCOD");
         AnyError = (short)(1) ;
      }
      A1064MRComNom = BC016M21_A1064MRComNom[0] ;
      n1064MRComNom = BC016M21_n1064MRComNom[0] ;
      pr_default.close(19);
   }

   public void closeExtendedTableCursors16M1346( )
   {
      pr_default.close(19);
   }

   public void enableDisable16M1346( )
   {
   }

   public void getKey16M1346( )
   {
      /* Using cursor BC016M22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1346 = (short)(1) ;
      }
      else
      {
         RcdFound1346 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey16M1346( )
   {
      /* Using cursor BC016M23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         zm16M1346( 4) ;
         RcdFound1346 = (short)(1) ;
         initializeNonKey16M1346( ) ;
         A1063MRComCod = BC016M23_A1063MRComCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         Z1063MRComCod = A1063MRComCod ;
         sMode1346 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal16M1346( ) ;
         load16M1346( ) ;
         Gx_mode = sMode1346 ;
      }
      else
      {
         RcdFound1346 = (short)(0) ;
         initializeNonKey16M1346( ) ;
         sMode1346 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal16M1346( ) ;
         Gx_mode = sMode1346 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16M1346( ) ;
      }
      pr_default.close(21);
   }

   public void checkOptimisticConcurrency16M1346( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC016M24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
         if ( (pr_default.getStatus(22) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRCom1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(22) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRCom1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16M1346( )
   {
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1346( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16M1346( 0) ;
         checkOptimisticConcurrency16M1346( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1346( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16M1346( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC016M25 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A1061MRPriCod), A396EmprCod, Integer.valueOf(A1063MRComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom1");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load16M1346( ) ;
         }
         endLevel16M1346( ) ;
      }
      closeExtendedTableCursors16M1346( ) ;
   }

   public void update16M1346( )
   {
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1346( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1346( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1346( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16M1346( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMRCom1 */
                  deferredUpdate16M1346( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey16M1346( ) ;
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
         endLevel16M1346( ) ;
      }
      closeExtendedTableCursors16M1346( ) ;
   }

   public void deferredUpdate16M1346( )
   {
   }

   public void delete16M1346( )
   {
      Gx_mode = "DLT" ;
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1346( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16M1346( ) ;
         afterConfirm16M1346( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16M1346( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC016M26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom1");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode1346 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel16M1346( ) ;
      Gx_mode = sMode1346 ;
   }

   public void onDeleteControls16M1346( )
   {
      standaloneModal16M1346( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC016M27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
         A1064MRComNom = BC016M27_A1064MRComNom[0] ;
         n1064MRComNom = BC016M27_n1064MRComNom[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel16M1346( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(22);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart16M1346( )
   {
      /* Scan By routine */
      /* Using cursor BC016M28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      RcdFound1346 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1064MRComNom = BC016M28_A1064MRComNom[0] ;
         n1064MRComNom = BC016M28_n1064MRComNom[0] ;
         A1063MRComCod = BC016M28_A1063MRComCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext16M1346( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1346 = (short)(0) ;
      scanKeyLoad16M1346( ) ;
   }

   public void scanKeyLoad16M1346( )
   {
      sMode1346 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1064MRComNom = BC016M28_A1064MRComNom[0] ;
         n1064MRComNom = BC016M28_n1064MRComNom[0] ;
         A1063MRComCod = BC016M28_A1063MRComCod[0] ;
      }
      Gx_mode = sMode1346 ;
   }

   public void scanKeyEnd16M1346( )
   {
      pr_default.close(26);
   }

   public void afterConfirm16M1346( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16M1346( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16M1346( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16M1346( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16M1346( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16M1346( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16M1346( )
   {
   }

   public void send_integrity_lvl_hashes16M1346( )
   {
   }

   public void send_integrity_lvl_hashes16M1345( )
   {
   }

   public void addRow16M1345( )
   {
      VarsToRow1345( bcTMRCom) ;
   }

   public void readRow16M1345( )
   {
      RowToVars1345( bcTMRCom, 1) ;
   }

   public void addRow16M1346( )
   {
      app.SdtTMRCom_Level1Item obj1346;
      obj1346 = new app.SdtTMRCom_Level1Item(remoteHandle);
      VarsToRow1346( obj1346) ;
      bcTMRCom.getgxTv_SdtTMRCom_Level1().add(obj1346, 0);
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mode( "UPD" );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Modified( (short)(0) );
   }

   public void readRow16M1346( )
   {
      nGXsfl_1346_idx = (int)(nGXsfl_1346_idx+1) ;
      RowToVars1346( ((app.SdtTMRCom_Level1Item)bcTMRCom.getgxTv_SdtTMRCom_Level1().elementAt(-1+nGXsfl_1346_idx)), 1) ;
   }

   public void initializeNonKey16M1345( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A1062MRPriNom = "" ;
      n1062MRPriNom = false ;
   }

   public void initAll16M1345( )
   {
      A396EmprCod = "" ;
      A1061MRPriCod = 0 ;
      initializeNonKey16M1345( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16M1346( )
   {
      A1064MRComNom = "" ;
      n1064MRComNom = false ;
   }

   public void initAll16M1346( )
   {
      A1063MRComCod = 0 ;
      initializeNonKey16M1346( ) ;
   }

   public void standaloneModalInsert16M1346( )
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

   public void VarsToRow1345( app.SdtTMRCom obj1345 )
   {
      obj1345.setgxTv_SdtTMRCom_Mode( Gx_mode );
      obj1345.setgxTv_SdtTMRCom_Emprnom( A407EmprNom );
      obj1345.setgxTv_SdtTMRCom_Mrprinom( A1062MRPriNom );
      obj1345.setgxTv_SdtTMRCom_Emprcod( A396EmprCod );
      obj1345.setgxTv_SdtTMRCom_Mrpricod( A1061MRPriCod );
      obj1345.setgxTv_SdtTMRCom_Emprcod_Z( Z396EmprCod );
      obj1345.setgxTv_SdtTMRCom_Emprnom_Z( Z407EmprNom );
      obj1345.setgxTv_SdtTMRCom_Mrpricod_Z( Z1061MRPriCod );
      obj1345.setgxTv_SdtTMRCom_Mrprinom_Z( Z1062MRPriNom );
      obj1345.setgxTv_SdtTMRCom_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1345.setgxTv_SdtTMRCom_Mrprinom_N( (byte)((byte)((n1062MRPriNom)?1:0)) );
      obj1345.setgxTv_SdtTMRCom_Mode( Gx_mode );
   }

   public void KeyVarsToRow1345( app.SdtTMRCom obj1345 )
   {
      obj1345.setgxTv_SdtTMRCom_Emprcod( A396EmprCod );
      obj1345.setgxTv_SdtTMRCom_Mrpricod( A1061MRPriCod );
   }

   public void RowToVars1345( app.SdtTMRCom obj1345 ,
                              int forceLoad )
   {
      Gx_mode = obj1345.getgxTv_SdtTMRCom_Mode() ;
      A407EmprNom = obj1345.getgxTv_SdtTMRCom_Emprnom() ;
      n407EmprNom = false ;
      A1062MRPriNom = obj1345.getgxTv_SdtTMRCom_Mrprinom() ;
      n1062MRPriNom = false ;
      A396EmprCod = obj1345.getgxTv_SdtTMRCom_Emprcod() ;
      A1061MRPriCod = obj1345.getgxTv_SdtTMRCom_Mrpricod() ;
      Z396EmprCod = obj1345.getgxTv_SdtTMRCom_Emprcod_Z() ;
      Z407EmprNom = obj1345.getgxTv_SdtTMRCom_Emprnom_Z() ;
      Z1061MRPriCod = obj1345.getgxTv_SdtTMRCom_Mrpricod_Z() ;
      Z1062MRPriNom = obj1345.getgxTv_SdtTMRCom_Mrprinom_Z() ;
      n407EmprNom = (boolean)((obj1345.getgxTv_SdtTMRCom_Emprnom_N()==0)?false:true) ;
      n1062MRPriNom = (boolean)((obj1345.getgxTv_SdtTMRCom_Mrprinom_N()==0)?false:true) ;
      Gx_mode = obj1345.getgxTv_SdtTMRCom_Mode() ;
   }

   public void VarsToRow1346( app.SdtTMRCom_Level1Item obj1346 )
   {
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mode( Gx_mode );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomnom( A1064MRComNom );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomcod( A1063MRComCod );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z( Z1063MRComCod );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z( Z1064MRComNom );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomnom_N( (byte)((byte)((n1064MRComNom)?1:0)) );
      obj1346.setgxTv_SdtTMRCom_Level1Item_Modified( nIsMod_1346 );
   }

   public void KeyVarsToRow1346( app.SdtTMRCom_Level1Item obj1346 )
   {
      obj1346.setgxTv_SdtTMRCom_Level1Item_Mrcomcod( A1063MRComCod );
   }

   public void RowToVars1346( app.SdtTMRCom_Level1Item obj1346 ,
                              int forceLoad )
   {
      Gx_mode = obj1346.getgxTv_SdtTMRCom_Level1Item_Mode() ;
      A1064MRComNom = obj1346.getgxTv_SdtTMRCom_Level1Item_Mrcomnom() ;
      n1064MRComNom = false ;
      A1063MRComCod = obj1346.getgxTv_SdtTMRCom_Level1Item_Mrcomcod() ;
      Z1063MRComCod = obj1346.getgxTv_SdtTMRCom_Level1Item_Mrcomcod_Z() ;
      Z1064MRComNom = obj1346.getgxTv_SdtTMRCom_Level1Item_Mrcomnom_Z() ;
      n1064MRComNom = (boolean)((obj1346.getgxTv_SdtTMRCom_Level1Item_Mrcomnom_N()==0)?false:true) ;
      nIsMod_1346 = obj1346.getgxTv_SdtTMRCom_Level1Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A1061MRPriCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey16M1345( ) ;
      scanKeyStart16M1345( ) ;
      if ( RcdFound1345 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC016M29 */
         pr_default.execute(27, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(27) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC016M29_A407EmprNom[0] ;
         n407EmprNom = BC016M29_n407EmprNom[0] ;
         pr_default.close(27);
         /* Using cursor BC016M30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         if ( (pr_default.getStatus(28) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
            AnyError = (short)(1) ;
         }
         A1062MRPriNom = BC016M30_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M30_n1062MRPriNom[0] ;
         pr_default.close(28);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
      }
      zm16M1345( -1) ;
      onLoadActions16M1345( ) ;
      addRow16M1345( ) ;
      bcTMRCom.getgxTv_SdtTMRCom_Level1().clearCollection();
      if ( RcdFound1345 == 1 )
      {
         scanKeyStart16M1346( ) ;
         nGXsfl_1346_idx = 1 ;
         while ( RcdFound1346 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z1061MRPriCod = A1061MRPriCod ;
            Z1063MRComCod = A1063MRComCod ;
            zm16M1346( -4) ;
            onLoadActions16M1346( ) ;
            nRcdExists_1346 = (short)(1) ;
            nIsMod_1346 = (short)(0) ;
            addRow16M1346( ) ;
            nGXsfl_1346_idx = (int)(nGXsfl_1346_idx+1) ;
            scanKeyNext16M1346( ) ;
         }
         scanKeyEnd16M1346( ) ;
      }
      scanKeyEnd16M1345( ) ;
      if ( RcdFound1345 == 0 )
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
      RowToVars1345( bcTMRCom, 0) ;
      scanKeyStart16M1345( ) ;
      if ( RcdFound1345 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC016M31 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(29) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC016M31_A407EmprNom[0] ;
         n407EmprNom = BC016M31_n407EmprNom[0] ;
         pr_default.close(29);
         /* Using cursor BC016M32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         if ( (pr_default.getStatus(30) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
            AnyError = (short)(1) ;
         }
         A1062MRPriNom = BC016M32_A1062MRPriNom[0] ;
         n1062MRPriNom = BC016M32_n1062MRPriNom[0] ;
         pr_default.close(30);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
      }
      zm16M1345( -1) ;
      onLoadActions16M1345( ) ;
      addRow16M1345( ) ;
      bcTMRCom.getgxTv_SdtTMRCom_Level1().clearCollection();
      if ( RcdFound1345 == 1 )
      {
         scanKeyStart16M1346( ) ;
         nGXsfl_1346_idx = 1 ;
         while ( RcdFound1346 != 0 )
         {
            Z396EmprCod = A396EmprCod ;
            Z1061MRPriCod = A1061MRPriCod ;
            Z1063MRComCod = A1063MRComCod ;
            zm16M1346( -4) ;
            onLoadActions16M1346( ) ;
            nRcdExists_1346 = (short)(1) ;
            nIsMod_1346 = (short)(0) ;
            addRow16M1346( ) ;
            nGXsfl_1346_idx = (int)(nGXsfl_1346_idx+1) ;
            scanKeyNext16M1346( ) ;
         }
         scanKeyEnd16M1346( ) ;
      }
      scanKeyEnd16M1345( ) ;
      if ( RcdFound1345 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16M1345( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert16M1345( ) ;
      }
      else
      {
         if ( RcdFound1345 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               A1061MRPriCod = Z1061MRPriCod ;
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
               update16M1345( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
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
                     insert16M1345( ) ;
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
                     insert16M1345( ) ;
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
      RowToVars1345( bcTMRCom, 1) ;
      saveImpl( ) ;
      VarsToRow1345( bcTMRCom) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1345( bcTMRCom, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert16M1345( ) ;
      afterTrn( ) ;
      VarsToRow1345( bcTMRCom) ;
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
         app.SdtTMRCom auxBC = new app.SdtTMRCom( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A1061MRPriCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTMRCom);
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
      RowToVars1345( bcTMRCom, 1) ;
      updateImpl( ) ;
      VarsToRow1345( bcTMRCom) ;
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
      RowToVars1345( bcTMRCom, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert16M1345( ) ;
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
      VarsToRow1345( bcTMRCom) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1345( bcTMRCom, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey16M1345( ) ;
      if ( RcdFound1345 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
         {
            A396EmprCod = Z396EmprCod ;
            A1061MRPriCod = Z1061MRPriCod ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmrcom_bc");
      VarsToRow1345( bcTMRCom) ;
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
      Gx_mode = bcTMRCom.getgxTv_SdtTMRCom_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTMRCom.setgxTv_SdtTMRCom_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTMRCom sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTMRCom )
      {
         bcTMRCom = sdt ;
         if ( GXutil.strcmp(bcTMRCom.getgxTv_SdtTMRCom_Mode(), "") == 0 )
         {
            bcTMRCom.setgxTv_SdtTMRCom_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1345( bcTMRCom) ;
         }
         else
         {
            RowToVars1345( bcTMRCom, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTMRCom.getgxTv_SdtTMRCom_Mode(), "") == 0 )
         {
            bcTMRCom.setgxTv_SdtTMRCom_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1345( bcTMRCom, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTMRCom getTMRCom_BC( )
   {
      return bcTMRCom ;
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
      sMode1345 = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV28Pgmname = "" ;
      AV9LitFe = "" ;
      AV11Station = "" ;
      AV27ObtenerEmprCod = "" ;
      AV14EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV15EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z1062MRPriNom = "" ;
      A1062MRPriNom = "" ;
      BC016M9_A407EmprNom = new String[] {""} ;
      BC016M9_n407EmprNom = new boolean[] {false} ;
      BC016M9_A1062MRPriNom = new String[] {""} ;
      BC016M9_n1062MRPriNom = new boolean[] {false} ;
      BC016M9_A396EmprCod = new String[] {""} ;
      BC016M9_A1061MRPriCod = new int[1] ;
      BC016M10_A407EmprNom = new String[] {""} ;
      BC016M10_n407EmprNom = new boolean[] {false} ;
      BC016M11_A1062MRPriNom = new String[] {""} ;
      BC016M11_n1062MRPriNom = new boolean[] {false} ;
      BC016M12_A396EmprCod = new String[] {""} ;
      BC016M12_A1061MRPriCod = new int[1] ;
      BC016M13_A396EmprCod = new String[] {""} ;
      BC016M13_A1061MRPriCod = new int[1] ;
      BC016M14_A396EmprCod = new String[] {""} ;
      BC016M14_A1061MRPriCod = new int[1] ;
      BC016M17_A407EmprNom = new String[] {""} ;
      BC016M17_n407EmprNom = new boolean[] {false} ;
      BC016M18_A1062MRPriNom = new String[] {""} ;
      BC016M18_n1062MRPriNom = new boolean[] {false} ;
      BC016M19_A407EmprNom = new String[] {""} ;
      BC016M19_n407EmprNom = new boolean[] {false} ;
      BC016M19_A1062MRPriNom = new String[] {""} ;
      BC016M19_n1062MRPriNom = new boolean[] {false} ;
      BC016M19_A396EmprCod = new String[] {""} ;
      BC016M19_A1061MRPriCod = new int[1] ;
      Z1064MRComNom = "" ;
      A1064MRComNom = "" ;
      BC016M20_A1061MRPriCod = new int[1] ;
      BC016M20_A1064MRComNom = new String[] {""} ;
      BC016M20_n1064MRComNom = new boolean[] {false} ;
      BC016M20_A396EmprCod = new String[] {""} ;
      BC016M20_A1063MRComCod = new int[1] ;
      BC016M21_A1064MRComNom = new String[] {""} ;
      BC016M21_n1064MRComNom = new boolean[] {false} ;
      BC016M22_A396EmprCod = new String[] {""} ;
      BC016M22_A1061MRPriCod = new int[1] ;
      BC016M22_A1063MRComCod = new int[1] ;
      BC016M23_A1061MRPriCod = new int[1] ;
      BC016M23_A396EmprCod = new String[] {""} ;
      BC016M23_A1063MRComCod = new int[1] ;
      sMode1346 = "" ;
      BC016M24_A1061MRPriCod = new int[1] ;
      BC016M24_A396EmprCod = new String[] {""} ;
      BC016M24_A1063MRComCod = new int[1] ;
      BC016M27_A1064MRComNom = new String[] {""} ;
      BC016M27_n1064MRComNom = new boolean[] {false} ;
      BC016M28_A1061MRPriCod = new int[1] ;
      BC016M28_A1064MRComNom = new String[] {""} ;
      BC016M28_n1064MRComNom = new boolean[] {false} ;
      BC016M28_A396EmprCod = new String[] {""} ;
      BC016M28_A1063MRComCod = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC016M29_A407EmprNom = new String[] {""} ;
      BC016M29_n407EmprNom = new boolean[] {false} ;
      BC016M30_A1062MRPriNom = new String[] {""} ;
      BC016M30_n1062MRPriNom = new boolean[] {false} ;
      BC016M31_A407EmprNom = new String[] {""} ;
      BC016M31_n407EmprNom = new boolean[] {false} ;
      BC016M32_A1062MRPriNom = new String[] {""} ;
      BC016M32_n1062MRPriNom = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmrcom_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmrcom_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmrcom_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrcom_bc__default(),
         new Object[] {
             new Object[] {
            BC016M2_A1061MRPriCod, BC016M2_A396EmprCod, BC016M2_A1063MRComCod
            }
            , new Object[] {
            BC016M3_A1061MRPriCod, BC016M3_A396EmprCod, BC016M3_A1063MRComCod
            }
            , new Object[] {
            BC016M4_A1064MRComNom, BC016M4_n1064MRComNom
            }
            , new Object[] {
            BC016M5_A396EmprCod, BC016M5_A1061MRPriCod
            }
            , new Object[] {
            BC016M6_A396EmprCod, BC016M6_A1061MRPriCod
            }
            , new Object[] {
            BC016M7_A407EmprNom, BC016M7_n407EmprNom
            }
            , new Object[] {
            BC016M8_A1062MRPriNom, BC016M8_n1062MRPriNom
            }
            , new Object[] {
            BC016M9_A407EmprNom, BC016M9_n407EmprNom, BC016M9_A1062MRPriNom, BC016M9_n1062MRPriNom, BC016M9_A396EmprCod, BC016M9_A1061MRPriCod
            }
            , new Object[] {
            BC016M10_A407EmprNom, BC016M10_n407EmprNom
            }
            , new Object[] {
            BC016M11_A1062MRPriNom, BC016M11_n1062MRPriNom
            }
            , new Object[] {
            BC016M12_A396EmprCod, BC016M12_A1061MRPriCod
            }
            , new Object[] {
            BC016M13_A396EmprCod, BC016M13_A1061MRPriCod
            }
            , new Object[] {
            BC016M14_A396EmprCod, BC016M14_A1061MRPriCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC016M17_A407EmprNom, BC016M17_n407EmprNom
            }
            , new Object[] {
            BC016M18_A1062MRPriNom, BC016M18_n1062MRPriNom
            }
            , new Object[] {
            BC016M19_A407EmprNom, BC016M19_n407EmprNom, BC016M19_A1062MRPriNom, BC016M19_n1062MRPriNom, BC016M19_A396EmprCod, BC016M19_A1061MRPriCod
            }
            , new Object[] {
            BC016M20_A1061MRPriCod, BC016M20_A1064MRComNom, BC016M20_n1064MRComNom, BC016M20_A396EmprCod, BC016M20_A1063MRComCod
            }
            , new Object[] {
            BC016M21_A1064MRComNom, BC016M21_n1064MRComNom
            }
            , new Object[] {
            BC016M22_A396EmprCod, BC016M22_A1061MRPriCod, BC016M22_A1063MRComCod
            }
            , new Object[] {
            BC016M23_A1061MRPriCod, BC016M23_A396EmprCod, BC016M23_A1063MRComCod
            }
            , new Object[] {
            BC016M24_A1061MRPriCod, BC016M24_A396EmprCod, BC016M24_A1063MRComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC016M27_A1064MRComNom, BC016M27_n1064MRComNom
            }
            , new Object[] {
            BC016M28_A1061MRPriCod, BC016M28_A1064MRComNom, BC016M28_n1064MRComNom, BC016M28_A396EmprCod, BC016M28_A1063MRComCod
            }
            , new Object[] {
            BC016M29_A407EmprNom, BC016M29_n407EmprNom
            }
            , new Object[] {
            BC016M30_A1062MRPriNom, BC016M30_n1062MRPriNom
            }
            , new Object[] {
            BC016M31_A407EmprNom, BC016M31_n407EmprNom
            }
            , new Object[] {
            BC016M32_A1062MRPriNom, BC016M32_n1062MRPriNom
            }
         }
      );
      AV28Pgmname = "TMRCom_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e1216M2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Gxremove1346 ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_1346 ;
   private short RcdFound1346 ;
   private short RcdFound1345 ;
   private short nIsDirty_1345 ;
   private short nRcdExists_1346 ;
   private short nIsDirty_1346 ;
   private int trnEnded ;
   private int Z1061MRPriCod ;
   private int A1061MRPriCod ;
   private int nGXsfl_1346_idx=1 ;
   private int AV16MRPriCod ;
   private int GX_JID ;
   private int Z1063MRComCod ;
   private int A1063MRComCod ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String sMode1345 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV28Pgmname ;
   private String AV9LitFe ;
   private String AV11Station ;
   private String AV27ObtenerEmprCod ;
   private String AV14EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String AV15EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z1062MRPriNom ;
   private String A1062MRPriNom ;
   private String Z1064MRComNom ;
   private String A1064MRComNom ;
   private String sMode1346 ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n1062MRPriNom ;
   private boolean n1064MRComNom ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19WebSession ;
   private app.SdtTMRCom bcTMRCom ;
   private IDataStoreProvider pr_default ;
   private String[] BC016M9_A407EmprNom ;
   private boolean[] BC016M9_n407EmprNom ;
   private String[] BC016M9_A1062MRPriNom ;
   private boolean[] BC016M9_n1062MRPriNom ;
   private String[] BC016M9_A396EmprCod ;
   private int[] BC016M9_A1061MRPriCod ;
   private String[] BC016M10_A407EmprNom ;
   private boolean[] BC016M10_n407EmprNom ;
   private String[] BC016M11_A1062MRPriNom ;
   private boolean[] BC016M11_n1062MRPriNom ;
   private String[] BC016M12_A396EmprCod ;
   private int[] BC016M12_A1061MRPriCod ;
   private String[] BC016M13_A396EmprCod ;
   private int[] BC016M13_A1061MRPriCod ;
   private String[] BC016M14_A396EmprCod ;
   private int[] BC016M14_A1061MRPriCod ;
   private String[] BC016M17_A407EmprNom ;
   private boolean[] BC016M17_n407EmprNom ;
   private String[] BC016M18_A1062MRPriNom ;
   private boolean[] BC016M18_n1062MRPriNom ;
   private String[] BC016M19_A407EmprNom ;
   private boolean[] BC016M19_n407EmprNom ;
   private String[] BC016M19_A1062MRPriNom ;
   private boolean[] BC016M19_n1062MRPriNom ;
   private String[] BC016M19_A396EmprCod ;
   private int[] BC016M19_A1061MRPriCod ;
   private int[] BC016M20_A1061MRPriCod ;
   private String[] BC016M20_A1064MRComNom ;
   private boolean[] BC016M20_n1064MRComNom ;
   private String[] BC016M20_A396EmprCod ;
   private int[] BC016M20_A1063MRComCod ;
   private String[] BC016M21_A1064MRComNom ;
   private boolean[] BC016M21_n1064MRComNom ;
   private String[] BC016M22_A396EmprCod ;
   private int[] BC016M22_A1061MRPriCod ;
   private int[] BC016M22_A1063MRComCod ;
   private int[] BC016M23_A1061MRPriCod ;
   private String[] BC016M23_A396EmprCod ;
   private int[] BC016M23_A1063MRComCod ;
   private int[] BC016M24_A1061MRPriCod ;
   private String[] BC016M24_A396EmprCod ;
   private int[] BC016M24_A1063MRComCod ;
   private String[] BC016M27_A1064MRComNom ;
   private boolean[] BC016M27_n1064MRComNom ;
   private int[] BC016M28_A1061MRPriCod ;
   private String[] BC016M28_A1064MRComNom ;
   private boolean[] BC016M28_n1064MRComNom ;
   private String[] BC016M28_A396EmprCod ;
   private int[] BC016M28_A1063MRComCod ;
   private String[] BC016M29_A407EmprNom ;
   private boolean[] BC016M29_n407EmprNom ;
   private String[] BC016M30_A1062MRPriNom ;
   private boolean[] BC016M30_n1062MRPriNom ;
   private String[] BC016M31_A407EmprNom ;
   private boolean[] BC016M31_n407EmprNom ;
   private String[] BC016M32_A1062MRPriNom ;
   private boolean[] BC016M32_n1062MRPriNom ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC016M2_A1061MRPriCod ;
   private String[] BC016M2_A396EmprCod ;
   private int[] BC016M2_A1063MRComCod ;
   private int[] BC016M3_A1061MRPriCod ;
   private String[] BC016M3_A396EmprCod ;
   private int[] BC016M3_A1063MRComCod ;
   private String[] BC016M4_A1064MRComNom ;
   private String[] BC016M5_A396EmprCod ;
   private int[] BC016M5_A1061MRPriCod ;
   private String[] BC016M6_A396EmprCod ;
   private int[] BC016M6_A1061MRPriCod ;
   private String[] BC016M7_A407EmprNom ;
   private String[] BC016M8_A1062MRPriNom ;
   private boolean[] BC016M4_n1064MRComNom ;
   private boolean[] BC016M7_n407EmprNom ;
   private boolean[] BC016M8_n1062MRPriNom ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
}

final  class tmrcom_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC016M2", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ?  FOR UPDATE OF MRPriCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M3", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M4", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M5", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M6", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M8", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M9", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.MRNom AS MRPriNom, TM1.EmprCod, TM1.MRPriCod AS MRPriCod FROM ((TXPMRCom TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = TM1.EmprCod AND T3.MRCod = TM1.MRPriCod) WHERE TM1.EmprCod = ? and TM1.MRPriCod = ? ORDER BY TM1.EmprCod, TM1.MRPriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M11", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M13", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M14", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC016M15", "INSERT INTO TXPMRCom(EmprCod, MRPriCod) VALUES(?, ?)", GX_NOMASK, "TXPMRCom")
         ,new UpdateCursor("BC016M16", "DELETE FROM TXPMRCom  WHERE EmprCod = ? AND MRPriCod = ?", GX_NOMASK, "TXPMRCom")
         ,new ForEachCursor("BC016M17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M18", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M19", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.MRNom AS MRPriNom, TM1.EmprCod, TM1.MRPriCod AS MRPriCod FROM ((TXPMRCom TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = TM1.EmprCod AND T3.MRCod = TM1.MRPriCod) WHERE TM1.EmprCod = ? and TM1.MRPriCod = ? ORDER BY TM1.EmprCod, TM1.MRPriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M20", "SELECT /*+ FIRST_ROWS(11) */ T1.MRPriCod AS MRPriCod, T2.MRNom AS MRComNom, T1.EmprCod, T1.MRComCod AS MRComCod FROM (TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRComCod) WHERE T1.EmprCod = ? and T1.MRPriCod = ? and T1.MRComCod = ? ORDER BY T1.EmprCod, T1.MRPriCod, T1.MRComCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M21", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M22", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRPriCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M23", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M24", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ?  FOR UPDATE OF MRPriCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC016M25", "INSERT INTO TXPMRCom1(MRPriCod, EmprCod, MRComCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMRCom1")
         ,new UpdateCursor("BC016M26", "DELETE FROM TXPMRCom1  WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ?", GX_NOMASK, "TXPMRCom1")
         ,new ForEachCursor("BC016M27", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M28", "SELECT /*+ FIRST_ROWS(11) */ T1.MRPriCod AS MRPriCod, T2.MRNom AS MRComNom, T1.EmprCod, T1.MRComCod AS MRComCod FROM (TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRComCod) WHERE T1.EmprCod = ? and T1.MRPriCod = ? ORDER BY T1.EmprCod, T1.MRPriCod, T1.MRComCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M29", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M30", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M31", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC016M32", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

