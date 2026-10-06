package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tterpes_bc extends GXWebPanel implements IGxSilentTrn
{
   public tterpes_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tterpes_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tterpes_bc.class ));
   }

   public tterpes_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1341208( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1341208( ) ;
      standaloneModal( ) ;
      addRow1341208( ) ;
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
         e111342 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z942TermCod = A942TermCod ;
            Z8900TermPesPro = A8900TermPesPro ;
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

   public void confirm_1340( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1341208( ) ;
         }
         else
         {
            checkExtendedTable1341208( ) ;
            if ( AnyError == 0 )
            {
               zm1341208( 4) ;
               zm1341208( 5) ;
               zm1341208( 6) ;
            }
            closeExtendedTableCursors1341208( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1208 = Gx_mode ;
         confirm_1341209( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1208 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode1208 ;
      }
   }

   public void confirm_1341209( )
   {
      s13880TermPesQty = O13880TermPesQty ;
      n13880TermPesQty = false ;
      nGXsfl_1209_idx = 0 ;
      while ( nGXsfl_1209_idx < bcTTERPES.getgxTv_SdtTTERPES_Level1().size() )
      {
         readRow1341209( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1209 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1209 != 0 ) )
         {
            getKey1341209( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound1209 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate1341209( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1341209( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1341209( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                     }
                     O13880TermPesQty = A13880TermPesQty ;
                     n13880TermPesQty = false ;
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
               if ( RcdFound1209 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey1341209( ) ;
                     load1341209( ) ;
                     beforeValidate1341209( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1341209( ) ;
                        O13880TermPesQty = A13880TermPesQty ;
                        n13880TermPesQty = false ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1209 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate1341209( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1341209( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1341209( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                           }
                           O13880TermPesQty = A13880TermPesQty ;
                           n13880TermPesQty = false ;
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
            VarsToRow1209( ((app.SdtTTERPES_Level1Item)bcTTERPES.getgxTv_SdtTTERPES_Level1().elementAt(-1+nGXsfl_1209_idx))) ;
         }
      }
      O13880TermPesQty = s13880TermPesQty ;
      n13880TermPesQty = false ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e121342( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tterpes_bc.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      tterpes_bc.this.AV25EmprCod = GXv_char2[0] ;
      tterpes_bc.this.AV26EmprNom = GXv_char3[0] ;
      tterpes_bc.this.AV20UsurCod = GXv_char4[0] ;
      GXt_int5 = AV32tinteoriente ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "ORIENT", ""), GXv_int6) ;
      tterpes_bc.this.GXt_int5 = GXv_int6[0] ;
      AV32tinteoriente = GXt_int5 ;
      A12701TermPesOpP_Visible = AV32tinteoriente ;
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tterpes_bc.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      tterpes_bc.this.AV25EmprCod = GXv_char4[0] ;
      tterpes_bc.this.AV26EmprNom = GXv_char3[0] ;
      tterpes_bc.this.AV20UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e111342( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1341208( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z8901TermPesUlt = A8901TermPesUlt ;
         Z10177TermPesTpo = A10177TermPesTpo ;
         Z13880TermPesQty = A13880TermPesQty ;
      }
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         Z8898TermDsc = A8898TermDsc ;
         Z8899TermPes = A8899TermPes ;
         Z396EmprCod = A396EmprCod ;
         Z13880TermPesQty = A13880TermPesQty ;
      }
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z13880TermPesQty = A13880TermPesQty ;
      }
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z13880TermPesQty = A13880TermPesQty ;
      }
      if ( GX_JID == -3 )
      {
         Z8900TermPesPro = A8900TermPesPro ;
         Z8901TermPesUlt = A8901TermPesUlt ;
         Z10177TermPesTpo = A10177TermPesTpo ;
         Z942TermCod = A942TermCod ;
         Z8898TermDsc = A8898TermDsc ;
         Z8899TermPes = A8899TermPes ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13880TermPesQty = A13880TermPesQty ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1341208( )
   {
      /* Using cursor BC013411 */
      pr_default.execute(7, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A8898TermDsc = BC013411_A8898TermDsc[0] ;
         n8898TermDsc = BC013411_n8898TermDsc[0] ;
         A407EmprNom = BC013411_A407EmprNom[0] ;
         n407EmprNom = BC013411_n407EmprNom[0] ;
         A8899TermPes = BC013411_A8899TermPes[0] ;
         n8899TermPes = BC013411_n8899TermPes[0] ;
         A8901TermPesUlt = BC013411_A8901TermPesUlt[0] ;
         n8901TermPesUlt = BC013411_n8901TermPesUlt[0] ;
         A10177TermPesTpo = BC013411_A10177TermPesTpo[0] ;
         n10177TermPesTpo = BC013411_n10177TermPesTpo[0] ;
         A396EmprCod = BC013411_A396EmprCod[0] ;
         n396EmprCod = BC013411_n396EmprCod[0] ;
         A13880TermPesQty = BC013411_A13880TermPesQty[0] ;
         n13880TermPesQty = BC013411_n13880TermPesQty[0] ;
         zm1341208( -3) ;
      }
      pr_default.close(7);
      onLoadActions1341208( ) ;
   }

   public void onLoadActions1341208( )
   {
      O13880TermPesQty = A13880TermPesQty ;
      n13880TermPesQty = false ;
   }

   public void checkExtendedTable1341208( )
   {
      nIsDirty_1208 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC013412 */
      pr_default.execute(8, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
         AnyError = (short)(1) ;
      }
      A8898TermDsc = BC013412_A8898TermDsc[0] ;
      n8898TermDsc = BC013412_n8898TermDsc[0] ;
      A8899TermPes = BC013412_A8899TermPes[0] ;
      n8899TermPes = BC013412_n8899TermPes[0] ;
      A396EmprCod = BC013412_A396EmprCod[0] ;
      n396EmprCod = BC013412_n396EmprCod[0] ;
      pr_default.close(8);
      /* Using cursor BC013413 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC013413_A407EmprNom[0] ;
      n407EmprNom = BC013413_n407EmprNom[0] ;
      pr_default.close(9);
      /* Using cursor BC013415 */
      pr_default.execute(10, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A13880TermPesQty = BC013415_A13880TermPesQty[0] ;
         n13880TermPesQty = BC013415_n13880TermPesQty[0] ;
      }
      else
      {
         nIsDirty_1208 = (short)(1) ;
         A13880TermPesQty = (short)(0) ;
         n13880TermPesQty = false ;
      }
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A10177TermPesTpo, "A") == 0 ) || ( GXutil.strcmp(A10177TermPesTpo, "C") == 0 ) || ( GXutil.strcmp(A10177TermPesTpo, "T") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Bascula", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1341208( )
   {
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void getKey1341208( )
   {
      /* Using cursor BC013416 */
      pr_default.execute(11, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1208 = (short)(1) ;
      }
      else
      {
         RcdFound1208 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC013417 */
      pr_default.execute(12, new Object[] {A942TermCod, A8900TermPesPro});
      if ( (pr_default.getStatus(12) != 101) )
      {
         zm1341208( 3) ;
         RcdFound1208 = (short)(1) ;
         A8900TermPesPro = BC013417_A8900TermPesPro[0] ;
         A8901TermPesUlt = BC013417_A8901TermPesUlt[0] ;
         n8901TermPesUlt = BC013417_n8901TermPesUlt[0] ;
         A10177TermPesTpo = BC013417_A10177TermPesTpo[0] ;
         n10177TermPesTpo = BC013417_n10177TermPesTpo[0] ;
         A942TermCod = BC013417_A942TermCod[0] ;
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         sMode1208 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1341208( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1208 = (short)(0) ;
            initializeNonKey1341208( ) ;
         }
         Gx_mode = sMode1208 ;
      }
      else
      {
         RcdFound1208 = (short)(0) ;
         initializeNonKey1341208( ) ;
         sMode1208 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1208 ;
      }
      pr_default.close(12);
   }

   public void getEqualNoModal( )
   {
      getKey1341208( ) ;
      if ( RcdFound1208 == 0 )
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
      confirm_1340( ) ;
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

   public void checkOptimisticConcurrency1341208( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC013418 */
         pr_default.execute(13, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(13) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(13) == 101) || ( Z8901TermPesUlt != BC013418_A8901TermPesUlt[0] ) || ( GXutil.strcmp(Z10177TermPesTpo, BC013418_A10177TermPesTpo[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1341208( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1341208( 0) ;
         checkOptimisticConcurrency1341208( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341208( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1341208( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC013419 */
                  pr_default.execute(14, new Object[] {A8900TermPesPro, Boolean.valueOf(n8901TermPesUlt), Long.valueOf(A8901TermPesUlt), Boolean.valueOf(n10177TermPesTpo), A10177TermPesTpo, A942TermCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1341208( ) ;
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
            load1341208( ) ;
         }
         endLevel1341208( ) ;
      }
      closeExtendedTableCursors1341208( ) ;
   }

   public void update1341208( )
   {
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341208( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341208( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1341208( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC013420 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n8901TermPesUlt), Long.valueOf(A8901TermPesUlt), Boolean.valueOf(n10177TermPesTpo), A10177TermPesTpo, A942TermCod, A8900TermPesPro});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1341208( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1341208( ) ;
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
         endLevel1341208( ) ;
      }
      closeExtendedTableCursors1341208( ) ;
   }

   public void deferredUpdate1341208( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1341208( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341208( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1341208( ) ;
         afterConfirm1341208( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1341208( ) ;
            if ( AnyError == 0 )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               scanKeyStart1341209( ) ;
               while ( RcdFound1209 != 0 )
               {
                  getByPrimaryKey1341209( ) ;
                  delete1341209( ) ;
                  scanKeyNext1341209( ) ;
                  O13880TermPesQty = A13880TermPesQty ;
                  n13880TermPesQty = false ;
               }
               scanKeyEnd1341209( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC013421 */
                  pr_default.execute(16, new Object[] {A942TermCod, A8900TermPesPro});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI1");
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
      sMode1208 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1341208( ) ;
      Gx_mode = sMode1208 ;
   }

   public void onDeleteControls1341208( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC013422 */
         pr_default.execute(17, new Object[] {A942TermCod});
         A8898TermDsc = BC013422_A8898TermDsc[0] ;
         n8898TermDsc = BC013422_n8898TermDsc[0] ;
         A8899TermPes = BC013422_A8899TermPes[0] ;
         n8899TermPes = BC013422_n8899TermPes[0] ;
         A396EmprCod = BC013422_A396EmprCod[0] ;
         n396EmprCod = BC013422_n396EmprCod[0] ;
         pr_default.close(17);
         /* Using cursor BC013423 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = BC013423_A407EmprNom[0] ;
         n407EmprNom = BC013423_n407EmprNom[0] ;
         pr_default.close(18);
         /* Using cursor BC013425 */
         pr_default.execute(19, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A13880TermPesQty = BC013425_A13880TermPesQty[0] ;
            n13880TermPesQty = BC013425_n13880TermPesQty[0] ;
         }
         else
         {
            A13880TermPesQty = (short)(0) ;
            n13880TermPesQty = false ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel1341209( )
   {
      s13880TermPesQty = O13880TermPesQty ;
      n13880TermPesQty = false ;
      nGXsfl_1209_idx = 0 ;
      while ( nGXsfl_1209_idx < bcTTERPES.getgxTv_SdtTTERPES_Level1().size() )
      {
         readRow1341209( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound1209 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_1209 != 0 ) )
         {
            standaloneNotModal1341209( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert1341209( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete1341209( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update1341209( ) ;
               }
            }
            O13880TermPesQty = A13880TermPesQty ;
            n13880TermPesQty = false ;
         }
         KeyVarsToRow1209( ((app.SdtTTERPES_Level1Item)bcTTERPES.getgxTv_SdtTTERPES_Level1().elementAt(-1+nGXsfl_1209_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_1209_idx = 0 ;
         while ( nGXsfl_1209_idx < bcTTERPES.getgxTv_SdtTTERPES_Level1().size() )
         {
            readRow1341209( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound1209 == 0 )
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
               bcTTERPES.getgxTv_SdtTTERPES_Level1().removeElement(nGXsfl_1209_idx);
               nGXsfl_1209_idx = (int)(nGXsfl_1209_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey1341209( ) ;
               VarsToRow1209( ((app.SdtTTERPES_Level1Item)bcTTERPES.getgxTv_SdtTTERPES_Level1().elementAt(-1+nGXsfl_1209_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1341209( ) ;
      if ( AnyError != 0 )
      {
         O13880TermPesQty = s13880TermPesQty ;
         n13880TermPesQty = false ;
      }
      nRcdExists_1209 = (short)(0) ;
      nIsMod_1209 = (short)(0) ;
      Gxremove1209 = (byte)(0) ;
   }

   public void processLevel1341208( )
   {
      /* Save parent mode. */
      sMode1208 = Gx_mode ;
      processNestedLevel1341209( ) ;
      if ( AnyError != 0 )
      {
         O13880TermPesQty = s13880TermPesQty ;
         n13880TermPesQty = false ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode1208 ;
      /* ' Update level parameters */
   }

   public void endLevel1341208( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1341208( ) ;
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

   public void scanKeyStart1341208( )
   {
      /* Scan By routine */
      /* Using cursor BC013427 */
      pr_default.execute(20, new Object[] {A942TermCod, A8900TermPesPro});
      RcdFound1208 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A8900TermPesPro = BC013427_A8900TermPesPro[0] ;
         A8898TermDsc = BC013427_A8898TermDsc[0] ;
         n8898TermDsc = BC013427_n8898TermDsc[0] ;
         A407EmprNom = BC013427_A407EmprNom[0] ;
         n407EmprNom = BC013427_n407EmprNom[0] ;
         A8899TermPes = BC013427_A8899TermPes[0] ;
         n8899TermPes = BC013427_n8899TermPes[0] ;
         A8901TermPesUlt = BC013427_A8901TermPesUlt[0] ;
         n8901TermPesUlt = BC013427_n8901TermPesUlt[0] ;
         A10177TermPesTpo = BC013427_A10177TermPesTpo[0] ;
         n10177TermPesTpo = BC013427_n10177TermPesTpo[0] ;
         A942TermCod = BC013427_A942TermCod[0] ;
         A396EmprCod = BC013427_A396EmprCod[0] ;
         n396EmprCod = BC013427_n396EmprCod[0] ;
         A13880TermPesQty = BC013427_A13880TermPesQty[0] ;
         n13880TermPesQty = BC013427_n13880TermPesQty[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1341208( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1208 = (short)(0) ;
      scanKeyLoad1341208( ) ;
   }

   public void scanKeyLoad1341208( )
   {
      sMode1208 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1208 = (short)(1) ;
         A8900TermPesPro = BC013427_A8900TermPesPro[0] ;
         A8898TermDsc = BC013427_A8898TermDsc[0] ;
         n8898TermDsc = BC013427_n8898TermDsc[0] ;
         A407EmprNom = BC013427_A407EmprNom[0] ;
         n407EmprNom = BC013427_n407EmprNom[0] ;
         A8899TermPes = BC013427_A8899TermPes[0] ;
         n8899TermPes = BC013427_n8899TermPes[0] ;
         A8901TermPesUlt = BC013427_A8901TermPesUlt[0] ;
         n8901TermPesUlt = BC013427_n8901TermPesUlt[0] ;
         A10177TermPesTpo = BC013427_A10177TermPesTpo[0] ;
         n10177TermPesTpo = BC013427_n10177TermPesTpo[0] ;
         A942TermCod = BC013427_A942TermCod[0] ;
         A396EmprCod = BC013427_A396EmprCod[0] ;
         n396EmprCod = BC013427_n396EmprCod[0] ;
         A13880TermPesQty = BC013427_A13880TermPesQty[0] ;
         n13880TermPesQty = BC013427_n13880TermPesQty[0] ;
      }
      Gx_mode = sMode1208 ;
   }

   public void scanKeyEnd1341208( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1341208( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1341208( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1341208( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1341208( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1341208( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1341208( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1341208( )
   {
   }

   public void zm1341209( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         Z8903TermPesMin = A8903TermPesMin ;
         Z8904TermPesMax = A8904TermPesMax ;
         Z8905TermPesOpe = A8905TermPesOpe ;
         Z8906TermPesTol = A8906TermPesTol ;
         Z12701TermPesOpP = A12701TermPesOpP ;
      }
      if ( GX_JID == -7 )
      {
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         Z8902TermPesRng = A8902TermPesRng ;
         Z8903TermPesMin = A8903TermPesMin ;
         Z8904TermPesMax = A8904TermPesMax ;
         Z8905TermPesOpe = A8905TermPesOpe ;
         Z8906TermPesTol = A8906TermPesTol ;
         Z12701TermPesOpP = A12701TermPesOpP ;
      }
   }

   public void standaloneNotModal1341209( )
   {
   }

   public void standaloneModal1341209( )
   {
   }

   public void load1341209( )
   {
      /* Using cursor BC013428 */
      pr_default.execute(21, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8903TermPesMin = BC013428_A8903TermPesMin[0] ;
         A8904TermPesMax = BC013428_A8904TermPesMax[0] ;
         A8905TermPesOpe = BC013428_A8905TermPesOpe[0] ;
         A8906TermPesTol = BC013428_A8906TermPesTol[0] ;
         A12701TermPesOpP = BC013428_A12701TermPesOpP[0] ;
         zm1341209( -7) ;
      }
      pr_default.close(21);
      onLoadActions1341209( ) ;
   }

   public void onLoadActions1341209( )
   {
      if ( isIns( )  )
      {
         A13880TermPesQty = (short)(O13880TermPesQty+1) ;
         n13880TermPesQty = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A13880TermPesQty = O13880TermPesQty ;
            n13880TermPesQty = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A13880TermPesQty = (short)(O13880TermPesQty-1) ;
               n13880TermPesQty = false ;
            }
         }
      }
   }

   public void checkExtendedTable1341209( )
   {
      nIsDirty_1209 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1341209( ) ;
      Gx_BScreen = (byte)(0) ;
      if ( isIns( )  )
      {
         nIsDirty_1209 = (short)(1) ;
         A13880TermPesQty = (short)(O13880TermPesQty+1) ;
         n13880TermPesQty = false ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1209 = (short)(1) ;
            A13880TermPesQty = O13880TermPesQty ;
            n13880TermPesQty = false ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1209 = (short)(1) ;
               A13880TermPesQty = (short)(O13880TermPesQty-1) ;
               n13880TermPesQty = false ;
            }
         }
      }
   }

   public void closeExtendedTableCursors1341209( )
   {
   }

   public void enableDisable1341209( )
   {
   }

   public void getKey1341209( )
   {
      /* Using cursor BC013429 */
      pr_default.execute(22, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1209 = (short)(1) ;
      }
      else
      {
         RcdFound1209 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1341209( )
   {
      /* Using cursor BC013430 */
      pr_default.execute(23, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         zm1341209( 7) ;
         RcdFound1209 = (short)(1) ;
         initializeNonKey1341209( ) ;
         A8902TermPesRng = BC013430_A8902TermPesRng[0] ;
         A8903TermPesMin = BC013430_A8903TermPesMin[0] ;
         A8904TermPesMax = BC013430_A8904TermPesMax[0] ;
         A8905TermPesOpe = BC013430_A8905TermPesOpe[0] ;
         A8906TermPesTol = BC013430_A8906TermPesTol[0] ;
         A12701TermPesOpP = BC013430_A12701TermPesOpP[0] ;
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
         Z8902TermPesRng = A8902TermPesRng ;
         sMode1209 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1341209( ) ;
         load1341209( ) ;
         Gx_mode = sMode1209 ;
      }
      else
      {
         RcdFound1209 = (short)(0) ;
         initializeNonKey1341209( ) ;
         sMode1209 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal1341209( ) ;
         Gx_mode = sMode1209 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1341209( ) ;
      }
      pr_default.close(23);
   }

   public void checkOptimisticConcurrency1341209( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC013431 */
         pr_default.execute(24, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
         if ( (pr_default.getStatus(24) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(24) == 101) || ( DecimalUtil.compareTo(Z8903TermPesMin, BC013431_A8903TermPesMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z8904TermPesMax, BC013431_A8904TermPesMax[0]) != 0 ) || ( GXutil.strcmp(Z8905TermPesOpe, BC013431_A8905TermPesOpe[0]) != 0 ) || ( DecimalUtil.compareTo(Z8906TermPesTol, BC013431_A8906TermPesTol[0]) != 0 ) || ( GXutil.strcmp(Z12701TermPesOpP, BC013431_A12701TermPesOpP[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMI2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1341209( )
   {
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341209( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1341209( 0) ;
         checkOptimisticConcurrency1341209( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341209( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1341209( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC013432 */
                  pr_default.execute(25, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng), A8903TermPesMin, A8904TermPesMax, A8905TermPesOpe, A8906TermPesTol, A12701TermPesOpP});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
                  if ( (pr_default.getStatus(25) == 1) )
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
            load1341209( ) ;
         }
         endLevel1341209( ) ;
      }
      closeExtendedTableCursors1341209( ) ;
   }

   public void update1341209( )
   {
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1341209( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341209( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1341209( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1341209( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC013433 */
                  pr_default.execute(26, new Object[] {A8903TermPesMin, A8904TermPesMax, A8905TermPesOpe, A8906TermPesTol, A12701TermPesOpP, A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMI2"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1341209( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey1341209( ) ;
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
         endLevel1341209( ) ;
      }
      closeExtendedTableCursors1341209( ) ;
   }

   public void deferredUpdate1341209( )
   {
   }

   public void delete1341209( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1341209( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1341209( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1341209( ) ;
         afterConfirm1341209( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1341209( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC013434 */
               pr_default.execute(27, new Object[] {A942TermCod, A8900TermPesPro, Long.valueOf(A8902TermPesRng)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMI2");
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
      sMode1209 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1341209( ) ;
      Gx_mode = sMode1209 ;
   }

   public void onDeleteControls1341209( )
   {
      standaloneModal1341209( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A13880TermPesQty = (short)(O13880TermPesQty+1) ;
            n13880TermPesQty = false ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A13880TermPesQty = (short)(O13880TermPesQty-1) ;
                  n13880TermPesQty = false ;
               }
            }
         }
      }
   }

   public void endLevel1341209( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(24);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart1341209( )
   {
      /* Scan By routine */
      /* Using cursor BC013435 */
      pr_default.execute(28, new Object[] {A942TermCod, A8900TermPesPro});
      RcdFound1209 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8902TermPesRng = BC013435_A8902TermPesRng[0] ;
         A8903TermPesMin = BC013435_A8903TermPesMin[0] ;
         A8904TermPesMax = BC013435_A8904TermPesMax[0] ;
         A8905TermPesOpe = BC013435_A8905TermPesOpe[0] ;
         A8906TermPesTol = BC013435_A8906TermPesTol[0] ;
         A12701TermPesOpP = BC013435_A12701TermPesOpP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1341209( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1209 = (short)(0) ;
      scanKeyLoad1341209( ) ;
   }

   public void scanKeyLoad1341209( )
   {
      sMode1209 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1209 = (short)(1) ;
         A8902TermPesRng = BC013435_A8902TermPesRng[0] ;
         A8903TermPesMin = BC013435_A8903TermPesMin[0] ;
         A8904TermPesMax = BC013435_A8904TermPesMax[0] ;
         A8905TermPesOpe = BC013435_A8905TermPesOpe[0] ;
         A8906TermPesTol = BC013435_A8906TermPesTol[0] ;
         A12701TermPesOpP = BC013435_A12701TermPesOpP[0] ;
      }
      Gx_mode = sMode1209 ;
   }

   public void scanKeyEnd1341209( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1341209( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1341209( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1341209( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1341209( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1341209( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1341209( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1341209( )
   {
   }

   public void send_integrity_lvl_hashes1341209( )
   {
   }

   public void send_integrity_lvl_hashes1341208( )
   {
   }

   public void addRow1341208( )
   {
      VarsToRow1208( bcTTERPES) ;
   }

   public void readRow1341208( )
   {
      RowToVars1208( bcTTERPES, 1) ;
   }

   public void addRow1341209( )
   {
      app.SdtTTERPES_Level1Item obj1209;
      obj1209 = new app.SdtTTERPES_Level1Item(remoteHandle);
      VarsToRow1209( obj1209) ;
      bcTTERPES.getgxTv_SdtTTERPES_Level1().add(obj1209, 0);
      obj1209.setgxTv_SdtTTERPES_Level1Item_Mode( "UPD" );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Modified( (short)(0) );
   }

   public void readRow1341209( )
   {
      nGXsfl_1209_idx = (int)(nGXsfl_1209_idx+1) ;
      RowToVars1209( ((app.SdtTTERPES_Level1Item)bcTTERPES.getgxTv_SdtTTERPES_Level1().elementAt(-1+nGXsfl_1209_idx)), 1) ;
   }

   public void initializeNonKey1341208( )
   {
      A8898TermDsc = "" ;
      n8898TermDsc = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A8899TermPes = (byte)(0) ;
      n8899TermPes = false ;
      A8901TermPesUlt = 0 ;
      n8901TermPesUlt = false ;
      A10177TermPesTpo = "" ;
      n10177TermPesTpo = false ;
      A13880TermPesQty = (short)(0) ;
      n13880TermPesQty = false ;
      O13880TermPesQty = A13880TermPesQty ;
      n13880TermPesQty = false ;
      Z8901TermPesUlt = 0 ;
      Z10177TermPesTpo = "" ;
   }

   public void initAll1341208( )
   {
      A942TermCod = "" ;
      A8900TermPesPro = "" ;
      initializeNonKey1341208( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1341209( )
   {
      A8903TermPesMin = DecimalUtil.ZERO ;
      A8904TermPesMax = DecimalUtil.ZERO ;
      A8905TermPesOpe = "" ;
      A8906TermPesTol = DecimalUtil.ZERO ;
      A12701TermPesOpP = "" ;
      Z8903TermPesMin = DecimalUtil.ZERO ;
      Z8904TermPesMax = DecimalUtil.ZERO ;
      Z8905TermPesOpe = "" ;
      Z8906TermPesTol = DecimalUtil.ZERO ;
      Z12701TermPesOpP = "" ;
   }

   public void initAll1341209( )
   {
      A8902TermPesRng = 0 ;
      initializeNonKey1341209( ) ;
   }

   public void standaloneModalInsert1341209( )
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

   public void VarsToRow1208( app.SdtTTERPES obj1208 )
   {
      obj1208.setgxTv_SdtTTERPES_Mode( Gx_mode );
      obj1208.setgxTv_SdtTTERPES_Termdsc( A8898TermDsc );
      obj1208.setgxTv_SdtTTERPES_Emprcod( A396EmprCod );
      obj1208.setgxTv_SdtTTERPES_Emprnom( A407EmprNom );
      obj1208.setgxTv_SdtTTERPES_Termpes( A8899TermPes );
      obj1208.setgxTv_SdtTTERPES_Termpesult( A8901TermPesUlt );
      obj1208.setgxTv_SdtTTERPES_Termpestpo( A10177TermPesTpo );
      obj1208.setgxTv_SdtTTERPES_Termpesqty( A13880TermPesQty );
      obj1208.setgxTv_SdtTTERPES_Termcod( A942TermCod );
      obj1208.setgxTv_SdtTTERPES_Termpespro( A8900TermPesPro );
      obj1208.setgxTv_SdtTTERPES_Termcod_Z( Z942TermCod );
      obj1208.setgxTv_SdtTTERPES_Termdsc_Z( Z8898TermDsc );
      obj1208.setgxTv_SdtTTERPES_Emprcod_Z( Z396EmprCod );
      obj1208.setgxTv_SdtTTERPES_Emprnom_Z( Z407EmprNom );
      obj1208.setgxTv_SdtTTERPES_Termpes_Z( Z8899TermPes );
      obj1208.setgxTv_SdtTTERPES_Termpespro_Z( Z8900TermPesPro );
      obj1208.setgxTv_SdtTTERPES_Termpesult_Z( Z8901TermPesUlt );
      obj1208.setgxTv_SdtTTERPES_Termpestpo_Z( Z10177TermPesTpo );
      obj1208.setgxTv_SdtTTERPES_Termpesqty_Z( Z13880TermPesQty );
      obj1208.setgxTv_SdtTTERPES_Termdsc_N( (byte)((byte)((n8898TermDsc)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Emprcod_N( (byte)((byte)((n396EmprCod)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Termpes_N( (byte)((byte)((n8899TermPes)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Termpesult_N( (byte)((byte)((n8901TermPesUlt)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Termpestpo_N( (byte)((byte)((n10177TermPesTpo)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Termpesqty_N( (byte)((byte)((n13880TermPesQty)?1:0)) );
      obj1208.setgxTv_SdtTTERPES_Mode( Gx_mode );
   }

   public void KeyVarsToRow1208( app.SdtTTERPES obj1208 )
   {
      obj1208.setgxTv_SdtTTERPES_Termcod( A942TermCod );
      obj1208.setgxTv_SdtTTERPES_Termpespro( A8900TermPesPro );
   }

   public void RowToVars1208( app.SdtTTERPES obj1208 ,
                              int forceLoad )
   {
      Gx_mode = obj1208.getgxTv_SdtTTERPES_Mode() ;
      A8898TermDsc = obj1208.getgxTv_SdtTTERPES_Termdsc() ;
      n8898TermDsc = false ;
      A396EmprCod = obj1208.getgxTv_SdtTTERPES_Emprcod() ;
      n396EmprCod = false ;
      A407EmprNom = obj1208.getgxTv_SdtTTERPES_Emprnom() ;
      n407EmprNom = false ;
      A8899TermPes = obj1208.getgxTv_SdtTTERPES_Termpes() ;
      n8899TermPes = false ;
      A8901TermPesUlt = obj1208.getgxTv_SdtTTERPES_Termpesult() ;
      n8901TermPesUlt = false ;
      A10177TermPesTpo = obj1208.getgxTv_SdtTTERPES_Termpestpo() ;
      n10177TermPesTpo = false ;
      A13880TermPesQty = obj1208.getgxTv_SdtTTERPES_Termpesqty() ;
      n13880TermPesQty = false ;
      A942TermCod = obj1208.getgxTv_SdtTTERPES_Termcod() ;
      A8900TermPesPro = obj1208.getgxTv_SdtTTERPES_Termpespro() ;
      Z942TermCod = obj1208.getgxTv_SdtTTERPES_Termcod_Z() ;
      Z8898TermDsc = obj1208.getgxTv_SdtTTERPES_Termdsc_Z() ;
      Z396EmprCod = obj1208.getgxTv_SdtTTERPES_Emprcod_Z() ;
      Z407EmprNom = obj1208.getgxTv_SdtTTERPES_Emprnom_Z() ;
      Z8899TermPes = obj1208.getgxTv_SdtTTERPES_Termpes_Z() ;
      Z8900TermPesPro = obj1208.getgxTv_SdtTTERPES_Termpespro_Z() ;
      Z8901TermPesUlt = obj1208.getgxTv_SdtTTERPES_Termpesult_Z() ;
      Z10177TermPesTpo = obj1208.getgxTv_SdtTTERPES_Termpestpo_Z() ;
      Z13880TermPesQty = obj1208.getgxTv_SdtTTERPES_Termpesqty_Z() ;
      O13880TermPesQty = obj1208.getgxTv_SdtTTERPES_Termpesqty_Z() ;
      n8898TermDsc = (boolean)((obj1208.getgxTv_SdtTTERPES_Termdsc_N()==0)?false:true) ;
      n396EmprCod = (boolean)((obj1208.getgxTv_SdtTTERPES_Emprcod_N()==0)?false:true) ;
      n407EmprNom = (boolean)((obj1208.getgxTv_SdtTTERPES_Emprnom_N()==0)?false:true) ;
      n8899TermPes = (boolean)((obj1208.getgxTv_SdtTTERPES_Termpes_N()==0)?false:true) ;
      n8901TermPesUlt = (boolean)((obj1208.getgxTv_SdtTTERPES_Termpesult_N()==0)?false:true) ;
      n10177TermPesTpo = (boolean)((obj1208.getgxTv_SdtTTERPES_Termpestpo_N()==0)?false:true) ;
      n13880TermPesQty = (boolean)((obj1208.getgxTv_SdtTTERPES_Termpesqty_N()==0)?false:true) ;
      Gx_mode = obj1208.getgxTv_SdtTTERPES_Mode() ;
   }

   public void VarsToRow1209( app.SdtTTERPES_Level1Item obj1209 )
   {
      obj1209.setgxTv_SdtTTERPES_Level1Item_Mode( Gx_mode );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesmin( A8903TermPesMin );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesmax( A8904TermPesMax );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesope( A8905TermPesOpe );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpestol( A8906TermPesTol );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesopp( A12701TermPesOpP );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesrng( A8902TermPesRng );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesrng_Z( Z8902TermPesRng );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesmin_Z( Z8903TermPesMin );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesmax_Z( Z8904TermPesMax );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesope_Z( Z8905TermPesOpe );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpestol_Z( Z8906TermPesTol );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesopp_Z( Z12701TermPesOpP );
      obj1209.setgxTv_SdtTTERPES_Level1Item_Modified( nIsMod_1209 );
   }

   public void KeyVarsToRow1209( app.SdtTTERPES_Level1Item obj1209 )
   {
      obj1209.setgxTv_SdtTTERPES_Level1Item_Termpesrng( A8902TermPesRng );
   }

   public void RowToVars1209( app.SdtTTERPES_Level1Item obj1209 ,
                              int forceLoad )
   {
      Gx_mode = obj1209.getgxTv_SdtTTERPES_Level1Item_Mode() ;
      A8903TermPesMin = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesmin() ;
      A8904TermPesMax = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesmax() ;
      A8905TermPesOpe = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesope() ;
      A8906TermPesTol = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpestol() ;
      A12701TermPesOpP = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesopp() ;
      A8902TermPesRng = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesrng() ;
      Z8902TermPesRng = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesrng_Z() ;
      Z8903TermPesMin = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesmin_Z() ;
      Z8904TermPesMax = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesmax_Z() ;
      Z8905TermPesOpe = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesope_Z() ;
      Z8906TermPesTol = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpestol_Z() ;
      Z12701TermPesOpP = obj1209.getgxTv_SdtTTERPES_Level1Item_Termpesopp_Z() ;
      nIsMod_1209 = obj1209.getgxTv_SdtTTERPES_Level1Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A942TermCod = (String)getParm(obj,0) ;
      A8900TermPesPro = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1341208( ) ;
      scanKeyStart1341208( ) ;
      if ( RcdFound1208 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC013436 */
         pr_default.execute(29, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(29) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
            AnyError = (short)(1) ;
         }
         A8898TermDsc = BC013436_A8898TermDsc[0] ;
         n8898TermDsc = BC013436_n8898TermDsc[0] ;
         A8899TermPes = BC013436_A8899TermPes[0] ;
         n8899TermPes = BC013436_n8899TermPes[0] ;
         A396EmprCod = BC013436_A396EmprCod[0] ;
         n396EmprCod = BC013436_n396EmprCod[0] ;
         pr_default.close(29);
         /* Using cursor BC013437 */
         pr_default.execute(30, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         if ( (pr_default.getStatus(30) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC013437_A407EmprNom[0] ;
         n407EmprNom = BC013437_n407EmprNom[0] ;
         pr_default.close(30);
         /* Using cursor BC013439 */
         pr_default.execute(31, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(31) != 101) )
         {
            A13880TermPesQty = BC013439_A13880TermPesQty[0] ;
            n13880TermPesQty = BC013439_n13880TermPesQty[0] ;
         }
         else
         {
            A13880TermPesQty = (short)(0) ;
            n13880TermPesQty = false ;
         }
         pr_default.close(31);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
      }
      zm1341208( -3) ;
      onLoadActions1341208( ) ;
      addRow1341208( ) ;
      bcTTERPES.getgxTv_SdtTTERPES_Level1().clearCollection();
      if ( RcdFound1208 == 1 )
      {
         scanKeyStart1341209( ) ;
         nGXsfl_1209_idx = 1 ;
         while ( RcdFound1209 != 0 )
         {
            Z942TermCod = A942TermCod ;
            Z8900TermPesPro = A8900TermPesPro ;
            Z8902TermPesRng = A8902TermPesRng ;
            zm1341209( -7) ;
            onLoadActions1341209( ) ;
            nRcdExists_1209 = (short)(1) ;
            nIsMod_1209 = (short)(0) ;
            addRow1341209( ) ;
            nGXsfl_1209_idx = (int)(nGXsfl_1209_idx+1) ;
            scanKeyNext1341209( ) ;
         }
         scanKeyEnd1341209( ) ;
      }
      scanKeyEnd1341208( ) ;
      if ( RcdFound1208 == 0 )
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
      RowToVars1208( bcTTERPES, 0) ;
      scanKeyStart1341208( ) ;
      if ( RcdFound1208 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC013440 */
         pr_default.execute(32, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(32) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TERMIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TERMCOD");
            AnyError = (short)(1) ;
         }
         A8898TermDsc = BC013440_A8898TermDsc[0] ;
         n8898TermDsc = BC013440_n8898TermDsc[0] ;
         A8899TermPes = BC013440_A8899TermPes[0] ;
         n8899TermPes = BC013440_n8899TermPes[0] ;
         A396EmprCod = BC013440_A396EmprCod[0] ;
         n396EmprCod = BC013440_n396EmprCod[0] ;
         pr_default.close(32);
         /* Using cursor BC013441 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         if ( (pr_default.getStatus(33) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC013441_A407EmprNom[0] ;
         n407EmprNom = BC013441_n407EmprNom[0] ;
         pr_default.close(33);
         /* Using cursor BC013443 */
         pr_default.execute(34, new Object[] {A942TermCod, A8900TermPesPro});
         if ( (pr_default.getStatus(34) != 101) )
         {
            A13880TermPesQty = BC013443_A13880TermPesQty[0] ;
            n13880TermPesQty = BC013443_n13880TermPesQty[0] ;
         }
         else
         {
            A13880TermPesQty = (short)(0) ;
            n13880TermPesQty = false ;
         }
         pr_default.close(34);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z942TermCod = A942TermCod ;
         Z8900TermPesPro = A8900TermPesPro ;
      }
      zm1341208( -3) ;
      onLoadActions1341208( ) ;
      addRow1341208( ) ;
      bcTTERPES.getgxTv_SdtTTERPES_Level1().clearCollection();
      if ( RcdFound1208 == 1 )
      {
         scanKeyStart1341209( ) ;
         nGXsfl_1209_idx = 1 ;
         while ( RcdFound1209 != 0 )
         {
            Z942TermCod = A942TermCod ;
            Z8900TermPesPro = A8900TermPesPro ;
            Z8902TermPesRng = A8902TermPesRng ;
            zm1341209( -7) ;
            onLoadActions1341209( ) ;
            nRcdExists_1209 = (short)(1) ;
            nIsMod_1209 = (short)(0) ;
            addRow1341209( ) ;
            nGXsfl_1209_idx = (int)(nGXsfl_1209_idx+1) ;
            scanKeyNext1341209( ) ;
         }
         scanKeyEnd1341209( ) ;
      }
      scanKeyEnd1341208( ) ;
      if ( RcdFound1208 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1341208( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13880TermPesQty = O13880TermPesQty ;
         n13880TermPesQty = false ;
         insert1341208( ) ;
      }
      else
      {
         if ( RcdFound1208 == 1 )
         {
            if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
            {
               A942TermCod = Z942TermCod ;
               A8900TermPesPro = Z8900TermPesPro ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               /* Update record */
               A13880TermPesQty = O13880TermPesQty ;
               n13880TermPesQty = false ;
               update1341208( ) ;
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
               if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
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
                     A13880TermPesQty = O13880TermPesQty ;
                     n13880TermPesQty = false ;
                     insert1341208( ) ;
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
                     A13880TermPesQty = O13880TermPesQty ;
                     n13880TermPesQty = false ;
                     insert1341208( ) ;
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
      RowToVars1208( bcTTERPES, 1) ;
      saveImpl( ) ;
      VarsToRow1208( bcTTERPES) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1208( bcTTERPES, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      A13880TermPesQty = O13880TermPesQty ;
      n13880TermPesQty = false ;
      insert1341208( ) ;
      afterTrn( ) ;
      VarsToRow1208( bcTTERPES) ;
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
         app.SdtTTERPES auxBC = new app.SdtTTERPES( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A942TermCod, A8900TermPesPro);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTTERPES);
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
      RowToVars1208( bcTTERPES, 1) ;
      updateImpl( ) ;
      VarsToRow1208( bcTTERPES) ;
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
      RowToVars1208( bcTTERPES, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1341208( ) ;
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
      VarsToRow1208( bcTTERPES) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1208( bcTTERPES, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1341208( ) ;
      if ( RcdFound1208 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
         {
            A942TermCod = Z942TermCod ;
            A8900TermPesPro = Z8900TermPesPro ;
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
         if ( ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 ) || ( GXutil.strcmp(A8900TermPesPro, Z8900TermPesPro) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tterpes_bc");
      VarsToRow1208( bcTTERPES) ;
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
      Gx_mode = bcTTERPES.getgxTv_SdtTTERPES_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTTERPES.setgxTv_SdtTTERPES_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTTERPES sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTTERPES )
      {
         bcTTERPES = sdt ;
         if ( GXutil.strcmp(bcTTERPES.getgxTv_SdtTTERPES_Mode(), "") == 0 )
         {
            bcTTERPES.setgxTv_SdtTTERPES_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1208( bcTTERPES) ;
         }
         else
         {
            RowToVars1208( bcTTERPES, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTTERPES.getgxTv_SdtTTERPES_Mode(), "") == 0 )
         {
            bcTTERPES.setgxTv_SdtTTERPES_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1208( bcTTERPES, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTTERPES getTTERPES_BC( )
   {
      return bcTTERPES ;
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
      Z942TermCod = "" ;
      A942TermCod = "" ;
      Z8900TermPesPro = "" ;
      A8900TermPesPro = "" ;
      sMode1208 = "" ;
      AV27Station = "" ;
      AV25EmprCod = "" ;
      AV26EmprNom = "" ;
      AV20UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z10177TermPesTpo = "" ;
      A10177TermPesTpo = "" ;
      Z8898TermDsc = "" ;
      A8898TermDsc = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC013411_A8900TermPesPro = new String[] {""} ;
      BC013411_A8898TermDsc = new String[] {""} ;
      BC013411_n8898TermDsc = new boolean[] {false} ;
      BC013411_A407EmprNom = new String[] {""} ;
      BC013411_n407EmprNom = new boolean[] {false} ;
      BC013411_A8899TermPes = new byte[1] ;
      BC013411_n8899TermPes = new boolean[] {false} ;
      BC013411_A8901TermPesUlt = new long[1] ;
      BC013411_n8901TermPesUlt = new boolean[] {false} ;
      BC013411_A10177TermPesTpo = new String[] {""} ;
      BC013411_n10177TermPesTpo = new boolean[] {false} ;
      BC013411_A942TermCod = new String[] {""} ;
      BC013411_A396EmprCod = new String[] {""} ;
      BC013411_n396EmprCod = new boolean[] {false} ;
      BC013411_A13880TermPesQty = new short[1] ;
      BC013411_n13880TermPesQty = new boolean[] {false} ;
      BC013412_A8898TermDsc = new String[] {""} ;
      BC013412_n8898TermDsc = new boolean[] {false} ;
      BC013412_A8899TermPes = new byte[1] ;
      BC013412_n8899TermPes = new boolean[] {false} ;
      BC013412_A396EmprCod = new String[] {""} ;
      BC013412_n396EmprCod = new boolean[] {false} ;
      BC013413_A407EmprNom = new String[] {""} ;
      BC013413_n407EmprNom = new boolean[] {false} ;
      BC013415_A13880TermPesQty = new short[1] ;
      BC013415_n13880TermPesQty = new boolean[] {false} ;
      BC013416_A942TermCod = new String[] {""} ;
      BC013416_A8900TermPesPro = new String[] {""} ;
      BC013417_A8900TermPesPro = new String[] {""} ;
      BC013417_A8901TermPesUlt = new long[1] ;
      BC013417_n8901TermPesUlt = new boolean[] {false} ;
      BC013417_A10177TermPesTpo = new String[] {""} ;
      BC013417_n10177TermPesTpo = new boolean[] {false} ;
      BC013417_A942TermCod = new String[] {""} ;
      BC013418_A8900TermPesPro = new String[] {""} ;
      BC013418_A8901TermPesUlt = new long[1] ;
      BC013418_n8901TermPesUlt = new boolean[] {false} ;
      BC013418_A10177TermPesTpo = new String[] {""} ;
      BC013418_n10177TermPesTpo = new boolean[] {false} ;
      BC013418_A942TermCod = new String[] {""} ;
      BC013422_A8898TermDsc = new String[] {""} ;
      BC013422_n8898TermDsc = new boolean[] {false} ;
      BC013422_A8899TermPes = new byte[1] ;
      BC013422_n8899TermPes = new boolean[] {false} ;
      BC013422_A396EmprCod = new String[] {""} ;
      BC013422_n396EmprCod = new boolean[] {false} ;
      BC013423_A407EmprNom = new String[] {""} ;
      BC013423_n407EmprNom = new boolean[] {false} ;
      BC013425_A13880TermPesQty = new short[1] ;
      BC013425_n13880TermPesQty = new boolean[] {false} ;
      BC013427_A8900TermPesPro = new String[] {""} ;
      BC013427_A8898TermDsc = new String[] {""} ;
      BC013427_n8898TermDsc = new boolean[] {false} ;
      BC013427_A407EmprNom = new String[] {""} ;
      BC013427_n407EmprNom = new boolean[] {false} ;
      BC013427_A8899TermPes = new byte[1] ;
      BC013427_n8899TermPes = new boolean[] {false} ;
      BC013427_A8901TermPesUlt = new long[1] ;
      BC013427_n8901TermPesUlt = new boolean[] {false} ;
      BC013427_A10177TermPesTpo = new String[] {""} ;
      BC013427_n10177TermPesTpo = new boolean[] {false} ;
      BC013427_A942TermCod = new String[] {""} ;
      BC013427_A396EmprCod = new String[] {""} ;
      BC013427_n396EmprCod = new boolean[] {false} ;
      BC013427_A13880TermPesQty = new short[1] ;
      BC013427_n13880TermPesQty = new boolean[] {false} ;
      Z8903TermPesMin = DecimalUtil.ZERO ;
      A8903TermPesMin = DecimalUtil.ZERO ;
      Z8904TermPesMax = DecimalUtil.ZERO ;
      A8904TermPesMax = DecimalUtil.ZERO ;
      Z8905TermPesOpe = "" ;
      A8905TermPesOpe = "" ;
      Z8906TermPesTol = DecimalUtil.ZERO ;
      A8906TermPesTol = DecimalUtil.ZERO ;
      Z12701TermPesOpP = "" ;
      A12701TermPesOpP = "" ;
      BC013428_A942TermCod = new String[] {""} ;
      BC013428_A8900TermPesPro = new String[] {""} ;
      BC013428_A8902TermPesRng = new long[1] ;
      BC013428_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013428_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013428_A8905TermPesOpe = new String[] {""} ;
      BC013428_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013428_A12701TermPesOpP = new String[] {""} ;
      BC013429_A942TermCod = new String[] {""} ;
      BC013429_A8900TermPesPro = new String[] {""} ;
      BC013429_A8902TermPesRng = new long[1] ;
      BC013430_A942TermCod = new String[] {""} ;
      BC013430_A8900TermPesPro = new String[] {""} ;
      BC013430_A8902TermPesRng = new long[1] ;
      BC013430_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013430_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013430_A8905TermPesOpe = new String[] {""} ;
      BC013430_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013430_A12701TermPesOpP = new String[] {""} ;
      sMode1209 = "" ;
      BC013431_A942TermCod = new String[] {""} ;
      BC013431_A8900TermPesPro = new String[] {""} ;
      BC013431_A8902TermPesRng = new long[1] ;
      BC013431_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013431_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013431_A8905TermPesOpe = new String[] {""} ;
      BC013431_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013431_A12701TermPesOpP = new String[] {""} ;
      BC013435_A942TermCod = new String[] {""} ;
      BC013435_A8900TermPesPro = new String[] {""} ;
      BC013435_A8902TermPesRng = new long[1] ;
      BC013435_A8903TermPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013435_A8904TermPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013435_A8905TermPesOpe = new String[] {""} ;
      BC013435_A8906TermPesTol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC013435_A12701TermPesOpP = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC013436_A8898TermDsc = new String[] {""} ;
      BC013436_n8898TermDsc = new boolean[] {false} ;
      BC013436_A8899TermPes = new byte[1] ;
      BC013436_n8899TermPes = new boolean[] {false} ;
      BC013436_A396EmprCod = new String[] {""} ;
      BC013436_n396EmprCod = new boolean[] {false} ;
      BC013437_A407EmprNom = new String[] {""} ;
      BC013437_n407EmprNom = new boolean[] {false} ;
      BC013439_A13880TermPesQty = new short[1] ;
      BC013439_n13880TermPesQty = new boolean[] {false} ;
      BC013440_A8898TermDsc = new String[] {""} ;
      BC013440_n8898TermDsc = new boolean[] {false} ;
      BC013440_A8899TermPes = new byte[1] ;
      BC013440_n8899TermPes = new boolean[] {false} ;
      BC013440_A396EmprCod = new String[] {""} ;
      BC013440_n396EmprCod = new boolean[] {false} ;
      BC013441_A407EmprNom = new String[] {""} ;
      BC013441_n407EmprNom = new boolean[] {false} ;
      BC013443_A13880TermPesQty = new short[1] ;
      BC013443_n13880TermPesQty = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tterpes_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tterpes_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tterpes_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tterpes_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tterpes_bc__default(),
         new Object[] {
             new Object[] {
            BC01342_A942TermCod, BC01342_A8900TermPesPro, BC01342_A8902TermPesRng, BC01342_A8903TermPesMin, BC01342_A8904TermPesMax, BC01342_A8905TermPesOpe, BC01342_A8906TermPesTol, BC01342_A12701TermPesOpP
            }
            , new Object[] {
            BC01343_A942TermCod, BC01343_A8900TermPesPro, BC01343_A8902TermPesRng, BC01343_A8903TermPesMin, BC01343_A8904TermPesMax, BC01343_A8905TermPesOpe, BC01343_A8906TermPesTol, BC01343_A12701TermPesOpP
            }
            , new Object[] {
            BC01344_A8900TermPesPro, BC01344_A8901TermPesUlt, BC01344_n8901TermPesUlt, BC01344_A10177TermPesTpo, BC01344_n10177TermPesTpo, BC01344_A942TermCod
            }
            , new Object[] {
            BC01345_A8900TermPesPro, BC01345_A8901TermPesUlt, BC01345_n8901TermPesUlt, BC01345_A10177TermPesTpo, BC01345_n10177TermPesTpo, BC01345_A942TermCod
            }
            , new Object[] {
            BC01346_A8898TermDsc, BC01346_n8898TermDsc, BC01346_A8899TermPes, BC01346_n8899TermPes, BC01346_A396EmprCod, BC01346_n396EmprCod
            }
            , new Object[] {
            BC01347_A407EmprNom, BC01347_n407EmprNom
            }
            , new Object[] {
            BC01349_A13880TermPesQty, BC01349_n13880TermPesQty
            }
            , new Object[] {
            BC013411_A8900TermPesPro, BC013411_A8898TermDsc, BC013411_n8898TermDsc, BC013411_A407EmprNom, BC013411_n407EmprNom, BC013411_A8899TermPes, BC013411_n8899TermPes, BC013411_A8901TermPesUlt, BC013411_n8901TermPesUlt, BC013411_A10177TermPesTpo,
            BC013411_n10177TermPesTpo, BC013411_A942TermCod, BC013411_A396EmprCod, BC013411_n396EmprCod, BC013411_A13880TermPesQty, BC013411_n13880TermPesQty
            }
            , new Object[] {
            BC013412_A8898TermDsc, BC013412_n8898TermDsc, BC013412_A8899TermPes, BC013412_n8899TermPes, BC013412_A396EmprCod, BC013412_n396EmprCod
            }
            , new Object[] {
            BC013413_A407EmprNom, BC013413_n407EmprNom
            }
            , new Object[] {
            BC013415_A13880TermPesQty, BC013415_n13880TermPesQty
            }
            , new Object[] {
            BC013416_A942TermCod, BC013416_A8900TermPesPro
            }
            , new Object[] {
            BC013417_A8900TermPesPro, BC013417_A8901TermPesUlt, BC013417_n8901TermPesUlt, BC013417_A10177TermPesTpo, BC013417_n10177TermPesTpo, BC013417_A942TermCod
            }
            , new Object[] {
            BC013418_A8900TermPesPro, BC013418_A8901TermPesUlt, BC013418_n8901TermPesUlt, BC013418_A10177TermPesTpo, BC013418_n10177TermPesTpo, BC013418_A942TermCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC013422_A8898TermDsc, BC013422_n8898TermDsc, BC013422_A8899TermPes, BC013422_n8899TermPes, BC013422_A396EmprCod, BC013422_n396EmprCod
            }
            , new Object[] {
            BC013423_A407EmprNom, BC013423_n407EmprNom
            }
            , new Object[] {
            BC013425_A13880TermPesQty, BC013425_n13880TermPesQty
            }
            , new Object[] {
            BC013427_A8900TermPesPro, BC013427_A8898TermDsc, BC013427_n8898TermDsc, BC013427_A407EmprNom, BC013427_n407EmprNom, BC013427_A8899TermPes, BC013427_n8899TermPes, BC013427_A8901TermPesUlt, BC013427_n8901TermPesUlt, BC013427_A10177TermPesTpo,
            BC013427_n10177TermPesTpo, BC013427_A942TermCod, BC013427_A396EmprCod, BC013427_n396EmprCod, BC013427_A13880TermPesQty, BC013427_n13880TermPesQty
            }
            , new Object[] {
            BC013428_A942TermCod, BC013428_A8900TermPesPro, BC013428_A8902TermPesRng, BC013428_A8903TermPesMin, BC013428_A8904TermPesMax, BC013428_A8905TermPesOpe, BC013428_A8906TermPesTol, BC013428_A12701TermPesOpP
            }
            , new Object[] {
            BC013429_A942TermCod, BC013429_A8900TermPesPro, BC013429_A8902TermPesRng
            }
            , new Object[] {
            BC013430_A942TermCod, BC013430_A8900TermPesPro, BC013430_A8902TermPesRng, BC013430_A8903TermPesMin, BC013430_A8904TermPesMax, BC013430_A8905TermPesOpe, BC013430_A8906TermPesTol, BC013430_A12701TermPesOpP
            }
            , new Object[] {
            BC013431_A942TermCod, BC013431_A8900TermPesPro, BC013431_A8902TermPesRng, BC013431_A8903TermPesMin, BC013431_A8904TermPesMax, BC013431_A8905TermPesOpe, BC013431_A8906TermPesTol, BC013431_A12701TermPesOpP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC013435_A942TermCod, BC013435_A8900TermPesPro, BC013435_A8902TermPesRng, BC013435_A8903TermPesMin, BC013435_A8904TermPesMax, BC013435_A8905TermPesOpe, BC013435_A8906TermPesTol, BC013435_A12701TermPesOpP
            }
            , new Object[] {
            BC013436_A8898TermDsc, BC013436_n8898TermDsc, BC013436_A8899TermPes, BC013436_n8899TermPes, BC013436_A396EmprCod, BC013436_n396EmprCod
            }
            , new Object[] {
            BC013437_A407EmprNom, BC013437_n407EmprNom
            }
            , new Object[] {
            BC013439_A13880TermPesQty, BC013439_n13880TermPesQty
            }
            , new Object[] {
            BC013440_A8898TermDsc, BC013440_n8898TermDsc, BC013440_A8899TermPes, BC013440_n8899TermPes, BC013440_A396EmprCod, BC013440_n396EmprCod
            }
            , new Object[] {
            BC013441_A407EmprNom, BC013441_n407EmprNom
            }
            , new Object[] {
            BC013443_A13880TermPesQty, BC013443_n13880TermPesQty
            }
         }
      );
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121342 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV32tinteoriente ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Z8899TermPes ;
   private byte A8899TermPes ;
   private byte Gxremove1209 ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short s13880TermPesQty ;
   private short O13880TermPesQty ;
   private short A13880TermPesQty ;
   private short nIsMod_1209 ;
   private short RcdFound1209 ;
   private short Z13880TermPesQty ;
   private short RcdFound1208 ;
   private short nIsDirty_1208 ;
   private short nRcdExists_1209 ;
   private short nIsDirty_1209 ;
   private int trnEnded ;
   private int nGXsfl_1209_idx=1 ;
   private int A12701TermPesOpP_Visible ;
   private int GX_JID ;
   private long Z8901TermPesUlt ;
   private long A8901TermPesUlt ;
   private long Z8902TermPesRng ;
   private long A8902TermPesRng ;
   private java.math.BigDecimal Z8903TermPesMin ;
   private java.math.BigDecimal A8903TermPesMin ;
   private java.math.BigDecimal Z8904TermPesMax ;
   private java.math.BigDecimal A8904TermPesMax ;
   private java.math.BigDecimal Z8906TermPesTol ;
   private java.math.BigDecimal A8906TermPesTol ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z942TermCod ;
   private String A942TermCod ;
   private String Z8900TermPesPro ;
   private String A8900TermPesPro ;
   private String sMode1208 ;
   private String AV27Station ;
   private String AV25EmprCod ;
   private String AV26EmprNom ;
   private String AV20UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z10177TermPesTpo ;
   private String A10177TermPesTpo ;
   private String Z8898TermDsc ;
   private String A8898TermDsc ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z8905TermPesOpe ;
   private String A8905TermPesOpe ;
   private String Z12701TermPesOpP ;
   private String A12701TermPesOpP ;
   private String sMode1209 ;
   private boolean n13880TermPesQty ;
   private boolean returnInSub ;
   private boolean n8898TermDsc ;
   private boolean n407EmprNom ;
   private boolean n8899TermPes ;
   private boolean n8901TermPesUlt ;
   private boolean n10177TermPesTpo ;
   private boolean n396EmprCod ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private app.SdtTTERPES bcTTERPES ;
   private IDataStoreProvider pr_default ;
   private String[] BC013411_A8900TermPesPro ;
   private String[] BC013411_A8898TermDsc ;
   private boolean[] BC013411_n8898TermDsc ;
   private String[] BC013411_A407EmprNom ;
   private boolean[] BC013411_n407EmprNom ;
   private byte[] BC013411_A8899TermPes ;
   private boolean[] BC013411_n8899TermPes ;
   private long[] BC013411_A8901TermPesUlt ;
   private boolean[] BC013411_n8901TermPesUlt ;
   private String[] BC013411_A10177TermPesTpo ;
   private boolean[] BC013411_n10177TermPesTpo ;
   private String[] BC013411_A942TermCod ;
   private String[] BC013411_A396EmprCod ;
   private boolean[] BC013411_n396EmprCod ;
   private short[] BC013411_A13880TermPesQty ;
   private boolean[] BC013411_n13880TermPesQty ;
   private String[] BC013412_A8898TermDsc ;
   private boolean[] BC013412_n8898TermDsc ;
   private byte[] BC013412_A8899TermPes ;
   private boolean[] BC013412_n8899TermPes ;
   private String[] BC013412_A396EmprCod ;
   private boolean[] BC013412_n396EmprCod ;
   private String[] BC013413_A407EmprNom ;
   private boolean[] BC013413_n407EmprNom ;
   private short[] BC013415_A13880TermPesQty ;
   private boolean[] BC013415_n13880TermPesQty ;
   private String[] BC013416_A942TermCod ;
   private String[] BC013416_A8900TermPesPro ;
   private String[] BC013417_A8900TermPesPro ;
   private long[] BC013417_A8901TermPesUlt ;
   private boolean[] BC013417_n8901TermPesUlt ;
   private String[] BC013417_A10177TermPesTpo ;
   private boolean[] BC013417_n10177TermPesTpo ;
   private String[] BC013417_A942TermCod ;
   private String[] BC013418_A8900TermPesPro ;
   private long[] BC013418_A8901TermPesUlt ;
   private boolean[] BC013418_n8901TermPesUlt ;
   private String[] BC013418_A10177TermPesTpo ;
   private boolean[] BC013418_n10177TermPesTpo ;
   private String[] BC013418_A942TermCod ;
   private String[] BC013422_A8898TermDsc ;
   private boolean[] BC013422_n8898TermDsc ;
   private byte[] BC013422_A8899TermPes ;
   private boolean[] BC013422_n8899TermPes ;
   private String[] BC013422_A396EmprCod ;
   private boolean[] BC013422_n396EmprCod ;
   private String[] BC013423_A407EmprNom ;
   private boolean[] BC013423_n407EmprNom ;
   private short[] BC013425_A13880TermPesQty ;
   private boolean[] BC013425_n13880TermPesQty ;
   private String[] BC013427_A8900TermPesPro ;
   private String[] BC013427_A8898TermDsc ;
   private boolean[] BC013427_n8898TermDsc ;
   private String[] BC013427_A407EmprNom ;
   private boolean[] BC013427_n407EmprNom ;
   private byte[] BC013427_A8899TermPes ;
   private boolean[] BC013427_n8899TermPes ;
   private long[] BC013427_A8901TermPesUlt ;
   private boolean[] BC013427_n8901TermPesUlt ;
   private String[] BC013427_A10177TermPesTpo ;
   private boolean[] BC013427_n10177TermPesTpo ;
   private String[] BC013427_A942TermCod ;
   private String[] BC013427_A396EmprCod ;
   private boolean[] BC013427_n396EmprCod ;
   private short[] BC013427_A13880TermPesQty ;
   private boolean[] BC013427_n13880TermPesQty ;
   private String[] BC013428_A942TermCod ;
   private String[] BC013428_A8900TermPesPro ;
   private long[] BC013428_A8902TermPesRng ;
   private java.math.BigDecimal[] BC013428_A8903TermPesMin ;
   private java.math.BigDecimal[] BC013428_A8904TermPesMax ;
   private String[] BC013428_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC013428_A8906TermPesTol ;
   private String[] BC013428_A12701TermPesOpP ;
   private String[] BC013429_A942TermCod ;
   private String[] BC013429_A8900TermPesPro ;
   private long[] BC013429_A8902TermPesRng ;
   private String[] BC013430_A942TermCod ;
   private String[] BC013430_A8900TermPesPro ;
   private long[] BC013430_A8902TermPesRng ;
   private java.math.BigDecimal[] BC013430_A8903TermPesMin ;
   private java.math.BigDecimal[] BC013430_A8904TermPesMax ;
   private String[] BC013430_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC013430_A8906TermPesTol ;
   private String[] BC013430_A12701TermPesOpP ;
   private String[] BC013431_A942TermCod ;
   private String[] BC013431_A8900TermPesPro ;
   private long[] BC013431_A8902TermPesRng ;
   private java.math.BigDecimal[] BC013431_A8903TermPesMin ;
   private java.math.BigDecimal[] BC013431_A8904TermPesMax ;
   private String[] BC013431_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC013431_A8906TermPesTol ;
   private String[] BC013431_A12701TermPesOpP ;
   private String[] BC013435_A942TermCod ;
   private String[] BC013435_A8900TermPesPro ;
   private long[] BC013435_A8902TermPesRng ;
   private java.math.BigDecimal[] BC013435_A8903TermPesMin ;
   private java.math.BigDecimal[] BC013435_A8904TermPesMax ;
   private String[] BC013435_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC013435_A8906TermPesTol ;
   private String[] BC013435_A12701TermPesOpP ;
   private String[] BC013436_A8898TermDsc ;
   private boolean[] BC013436_n8898TermDsc ;
   private byte[] BC013436_A8899TermPes ;
   private boolean[] BC013436_n8899TermPes ;
   private String[] BC013436_A396EmprCod ;
   private boolean[] BC013436_n396EmprCod ;
   private String[] BC013437_A407EmprNom ;
   private boolean[] BC013437_n407EmprNom ;
   private short[] BC013439_A13880TermPesQty ;
   private boolean[] BC013439_n13880TermPesQty ;
   private String[] BC013440_A8898TermDsc ;
   private boolean[] BC013440_n8898TermDsc ;
   private byte[] BC013440_A8899TermPes ;
   private boolean[] BC013440_n8899TermPes ;
   private String[] BC013440_A396EmprCod ;
   private boolean[] BC013440_n396EmprCod ;
   private String[] BC013441_A407EmprNom ;
   private boolean[] BC013441_n407EmprNom ;
   private short[] BC013443_A13880TermPesQty ;
   private boolean[] BC013443_n13880TermPesQty ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01342_A942TermCod ;
   private String[] BC01342_A8900TermPesPro ;
   private long[] BC01342_A8902TermPesRng ;
   private java.math.BigDecimal[] BC01342_A8903TermPesMin ;
   private java.math.BigDecimal[] BC01342_A8904TermPesMax ;
   private String[] BC01342_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC01342_A8906TermPesTol ;
   private String[] BC01342_A12701TermPesOpP ;
   private String[] BC01343_A942TermCod ;
   private String[] BC01343_A8900TermPesPro ;
   private long[] BC01343_A8902TermPesRng ;
   private java.math.BigDecimal[] BC01343_A8903TermPesMin ;
   private java.math.BigDecimal[] BC01343_A8904TermPesMax ;
   private String[] BC01343_A8905TermPesOpe ;
   private java.math.BigDecimal[] BC01343_A8906TermPesTol ;
   private String[] BC01343_A12701TermPesOpP ;
   private String[] BC01344_A8900TermPesPro ;
   private long[] BC01344_A8901TermPesUlt ;
   private String[] BC01344_A10177TermPesTpo ;
   private String[] BC01344_A942TermCod ;
   private String[] BC01345_A8900TermPesPro ;
   private long[] BC01345_A8901TermPesUlt ;
   private String[] BC01345_A10177TermPesTpo ;
   private String[] BC01345_A942TermCod ;
   private String[] BC01346_A8898TermDsc ;
   private byte[] BC01346_A8899TermPes ;
   private String[] BC01346_A396EmprCod ;
   private String[] BC01347_A407EmprNom ;
   private short[] BC01349_A13880TermPesQty ;
   private boolean[] BC01344_n8901TermPesUlt ;
   private boolean[] BC01344_n10177TermPesTpo ;
   private boolean[] BC01345_n8901TermPesUlt ;
   private boolean[] BC01345_n10177TermPesTpo ;
   private boolean[] BC01346_n8898TermDsc ;
   private boolean[] BC01346_n8899TermPes ;
   private boolean[] BC01346_n396EmprCod ;
   private boolean[] BC01347_n407EmprNom ;
   private boolean[] BC01349_n13880TermPesQty ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tterpes_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tterpes_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01342", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?  FOR UPDATE OF TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01343", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01344", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ?  FOR UPDATE OF TermPesUlt, TermPesTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01345", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01346", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01347", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01349", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013411", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermPesPro, T2.TermDsc, T3.EmprNom, T2.TermPes, TM1.TermPesUlt, TM1.TermPesTpo, TM1.TermCod, T2.EmprCod, COALESCE( T4.TermPesQty, 0) AS TermPesQty FROM (((TXPTERMI1 TM1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = TM1.TermCod) LEFT JOIN TXPEMPRES T3 ON T3.EmprCod = T2.EmprCod) LEFT JOIN (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T4 ON T4.TermCod = TM1.TermCod AND T4.TermPesPro = TM1.TermPesPro) WHERE TM1.TermCod = ? and TM1.TermPesPro = ? ORDER BY TM1.TermCod, TM1.TermPesPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013412", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013413", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013415", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013416", "SELECT /*+ FIRST_ROWS(1) */ TermCod, TermPesPro FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013417", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013418", "SELECT TermPesPro, TermPesUlt, TermPesTpo, TermCod FROM TXPTERMI1 WHERE TermCod = ? AND TermPesPro = ?  FOR UPDATE OF TermPesUlt, TermPesTpo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC013419", "INSERT INTO TXPTERMI1(TermPesPro, TermPesUlt, TermPesTpo, TermCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPTERMI1")
         ,new UpdateCursor("BC013420", "UPDATE TXPTERMI1 SET TermPesUlt=?, TermPesTpo=?  WHERE TermCod = ? AND TermPesPro = ?", GX_NOMASK, "TXPTERMI1")
         ,new UpdateCursor("BC013421", "DELETE FROM TXPTERMI1  WHERE TermCod = ? AND TermPesPro = ?", GX_NOMASK, "TXPTERMI1")
         ,new ForEachCursor("BC013422", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013423", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013425", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013427", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermPesPro, T2.TermDsc, T3.EmprNom, T2.TermPes, TM1.TermPesUlt, TM1.TermPesTpo, TM1.TermCod, T2.EmprCod, COALESCE( T4.TermPesQty, 0) AS TermPesQty FROM (((TXPTERMI1 TM1 INNER JOIN TXPTERMIN T2 ON T2.TermCod = TM1.TermCod) LEFT JOIN TXPEMPRES T3 ON T3.EmprCod = T2.EmprCod) LEFT JOIN (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T4 ON T4.TermCod = TM1.TermCod AND T4.TermPesPro = TM1.TermPesPro) WHERE TM1.TermCod = ? and TM1.TermPesPro = ? ORDER BY TM1.TermCod, TM1.TermPesPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013428", "SELECT /*+ FIRST_ROWS(11) */ TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? and TermPesPro = ? and TermPesRng = ? ORDER BY TermCod, TermPesPro, TermPesRng ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013429", "SELECT /*+ FIRST_ROWS(1) */ TermCod, TermPesPro, TermPesRng FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013430", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013431", "SELECT TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?  FOR UPDATE OF TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC013432", "INSERT INTO TXPTERMI2(TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTERMI2")
         ,new UpdateCursor("BC013433", "UPDATE TXPTERMI2 SET TermPesMin=?, TermPesMax=?, TermPesOpe=?, TermPesTol=?, TermPesOpP=?  WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?", GX_NOMASK, "TXPTERMI2")
         ,new UpdateCursor("BC013434", "DELETE FROM TXPTERMI2  WHERE TermCod = ? AND TermPesPro = ? AND TermPesRng = ?", GX_NOMASK, "TXPTERMI2")
         ,new ForEachCursor("BC013435", "SELECT /*+ FIRST_ROWS(11) */ TermCod, TermPesPro, TermPesRng, TermPesMin, TermPesMax, TermPesOpe, TermPesTol, TermPesOpP FROM TXPTERMI2 WHERE TermCod = ? and TermPesPro = ? ORDER BY TermCod, TermPesPro, TermPesRng ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013436", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013437", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013439", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013440", "SELECT TermDsc, TermPes, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013441", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC013443", "SELECT COALESCE( T1.TermPesQty, 0) AS TermPesQty FROM (SELECT COUNT(*) AS TermPesQty, TermCod, TermPesPro FROM TXPTERMI2 GROUP BY TermCod, TermPesPro ) T1 WHERE T1.TermCod = ? AND T1.TermPesPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((long[]) buf[7])[0] = rslt.getLong(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((String[]) buf[12])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 20);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 1);
               }
               stmt.setString(4, (String)parms[5], 10);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setString(3, (String)parms[4], 10);
               stmt.setString(4, (String)parms[5], 20);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 5);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 26 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 10);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 20);
               return;
      }
   }

}

