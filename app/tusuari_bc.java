package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tusuari_bc extends GXWebPanel implements IGxSilentTrn
{
   public tusuari_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tusuari_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tusuari_bc.class ));
   }

   public tusuari_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow2M110( ) ;
      standaloneNotModal( ) ;
      initializeNonKey2M110( ) ;
      standaloneModal( ) ;
      addRow2M110( ) ;
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
            Z850UsurCod = A850UsurCod ;
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

   public void confirm_2M0( )
   {
      beforeValidate2M110( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2M110( ) ;
         }
         else
         {
            checkExtendedTable2M110( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors2M110( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode110 = Gx_mode ;
         confirm_2M127( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode110 ;
            IsConfirmed = (short)(1) ;
         }
         /* Restore parent mode. */
         Gx_mode = sMode110 ;
      }
   }

   public void confirm_2M127( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < bcTUSUARI.getgxTv_SdtTUSUARI_Level1().size() )
      {
         readRow2M127( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound127 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_127 != 0 ) )
         {
            getKey2M127( ) ;
            if ( isIns( ) && ! isDlt( ) )
            {
               if ( RcdFound127 == 0 )
               {
                  Gx_mode = "INS" ;
                  beforeValidate2M127( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2M127( ) ;
                     if ( AnyError == 0 )
                     {
                        zm2M127( 7) ;
                     }
                     closeExtendedTableCursors2M127( ) ;
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
               if ( RcdFound127 != 0 )
               {
                  if ( isDlt( ) )
                  {
                     Gx_mode = "DLT" ;
                     getByPrimaryKey2M127( ) ;
                     load2M127( ) ;
                     beforeValidate2M127( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2M127( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_127 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        beforeValidate2M127( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2M127( ) ;
                           if ( AnyError == 0 )
                           {
                              zm2M127( 7) ;
                           }
                           closeExtendedTableCursors2M127( ) ;
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
            VarsToRow127( ((app.SdtTUSUARI_Level1Item)bcTUSUARI.getgxTv_SdtTUSUARI_Level1().elementAt(-1+nGXsfl_127_idx))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void e112M2( )
   {
      /* Start Routine */
      returnInSub = false ;
   }

   public void e122M2( )
   {
      /* 'Asociar Empresa' Routine */
      returnInSub = false ;
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e132M2 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e132M2( )
   {
      /* Exit Routine */
      returnInSub = false ;
   }

   public void zm2M110( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z14371UsurGuid = A14371UsurGuid ;
         Z854UsurNom = A854UsurNom ;
         Z855UsurPwd = A855UsurPwd ;
         Z851UsurFec = A851UsurFec ;
         Z10513UsuMail = A10513UsuMail ;
         Z10713UsuMailP = A10713UsuMailP ;
         Z10714UsuMailU = A10714UsuMailU ;
         Z13837UsurCmbPwd = A13837UsurCmbPwd ;
         Z13838UsurTkn = A13838UsurTkn ;
         Z13839UsurTknCrd = A13839UsurTknCrd ;
         Z13840UsurTknVto = A13840UsurTknVto ;
         Z14415UsurPrint = A14415UsurPrint ;
         Z14487UsurSockt = A14487UsurSockt ;
      }
      if ( GX_JID == -5 )
      {
         Z850UsurCod = A850UsurCod ;
         Z14371UsurGuid = A14371UsurGuid ;
         Z854UsurNom = A854UsurNom ;
         Z855UsurPwd = A855UsurPwd ;
         Z851UsurFec = A851UsurFec ;
         Z10513UsuMail = A10513UsuMail ;
         Z10713UsuMailP = A10713UsuMailP ;
         Z10714UsuMailU = A10714UsuMailU ;
         Z13837UsurCmbPwd = A13837UsurCmbPwd ;
         Z13838UsurTkn = A13838UsurTkn ;
         Z13839UsurTknCrd = A13839UsurTknCrd ;
         Z13840UsurTknVto = A13840UsurTknVto ;
         Z14415UsurPrint = A14415UsurPrint ;
         Z14487UsurSockt = A14487UsurSockt ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && java.util.UUID.fromString("00000000-0000-0000-0000-000000000000").equals(A14371UsurGuid) )
      {
         A14371UsurGuid = java.util.UUID.randomUUID( ) ;
         n14371UsurGuid = false ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load2M110( )
   {
      /* Using cursor BC002M7 */
      pr_default.execute(5, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A14371UsurGuid = BC002M7_A14371UsurGuid[0] ;
         n14371UsurGuid = BC002M7_n14371UsurGuid[0] ;
         A854UsurNom = BC002M7_A854UsurNom[0] ;
         n854UsurNom = BC002M7_n854UsurNom[0] ;
         A855UsurPwd = BC002M7_A855UsurPwd[0] ;
         n855UsurPwd = BC002M7_n855UsurPwd[0] ;
         A851UsurFec = BC002M7_A851UsurFec[0] ;
         n851UsurFec = BC002M7_n851UsurFec[0] ;
         A10513UsuMail = BC002M7_A10513UsuMail[0] ;
         A10713UsuMailP = BC002M7_A10713UsuMailP[0] ;
         n10713UsuMailP = BC002M7_n10713UsuMailP[0] ;
         A10714UsuMailU = BC002M7_A10714UsuMailU[0] ;
         n10714UsuMailU = BC002M7_n10714UsuMailU[0] ;
         A13837UsurCmbPwd = BC002M7_A13837UsurCmbPwd[0] ;
         n13837UsurCmbPwd = BC002M7_n13837UsurCmbPwd[0] ;
         A13838UsurTkn = BC002M7_A13838UsurTkn[0] ;
         n13838UsurTkn = BC002M7_n13838UsurTkn[0] ;
         A13839UsurTknCrd = BC002M7_A13839UsurTknCrd[0] ;
         n13839UsurTknCrd = BC002M7_n13839UsurTknCrd[0] ;
         A13840UsurTknVto = BC002M7_A13840UsurTknVto[0] ;
         n13840UsurTknVto = BC002M7_n13840UsurTknVto[0] ;
         A14415UsurPrint = BC002M7_A14415UsurPrint[0] ;
         n14415UsurPrint = BC002M7_n14415UsurPrint[0] ;
         A14487UsurSockt = BC002M7_A14487UsurSockt[0] ;
         n14487UsurSockt = BC002M7_n14487UsurSockt[0] ;
         zm2M110( -5) ;
      }
      pr_default.close(5);
      onLoadActions2M110( ) ;
   }

   public void onLoadActions2M110( )
   {
   }

   public void checkExtendedTable2M110( )
   {
      nIsDirty_110 = (short)(0) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", A850UsurCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código no válido", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A854UsurNom)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nombre incorrecto", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors2M110( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2M110( )
   {
      /* Using cursor BC002M8 */
      pr_default.execute(6, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound110 = (short)(1) ;
      }
      else
      {
         RcdFound110 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC002M9 */
      pr_default.execute(7, new Object[] {A850UsurCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm2M110( 5) ;
         RcdFound110 = (short)(1) ;
         A850UsurCod = BC002M9_A850UsurCod[0] ;
         A14371UsurGuid = BC002M9_A14371UsurGuid[0] ;
         n14371UsurGuid = BC002M9_n14371UsurGuid[0] ;
         A854UsurNom = BC002M9_A854UsurNom[0] ;
         n854UsurNom = BC002M9_n854UsurNom[0] ;
         A855UsurPwd = BC002M9_A855UsurPwd[0] ;
         n855UsurPwd = BC002M9_n855UsurPwd[0] ;
         A851UsurFec = BC002M9_A851UsurFec[0] ;
         n851UsurFec = BC002M9_n851UsurFec[0] ;
         A10513UsuMail = BC002M9_A10513UsuMail[0] ;
         A10713UsuMailP = BC002M9_A10713UsuMailP[0] ;
         n10713UsuMailP = BC002M9_n10713UsuMailP[0] ;
         A10714UsuMailU = BC002M9_A10714UsuMailU[0] ;
         n10714UsuMailU = BC002M9_n10714UsuMailU[0] ;
         A13837UsurCmbPwd = BC002M9_A13837UsurCmbPwd[0] ;
         n13837UsurCmbPwd = BC002M9_n13837UsurCmbPwd[0] ;
         A13838UsurTkn = BC002M9_A13838UsurTkn[0] ;
         n13838UsurTkn = BC002M9_n13838UsurTkn[0] ;
         A13839UsurTknCrd = BC002M9_A13839UsurTknCrd[0] ;
         n13839UsurTknCrd = BC002M9_n13839UsurTknCrd[0] ;
         A13840UsurTknVto = BC002M9_A13840UsurTknVto[0] ;
         n13840UsurTknVto = BC002M9_n13840UsurTknVto[0] ;
         A14415UsurPrint = BC002M9_A14415UsurPrint[0] ;
         n14415UsurPrint = BC002M9_n14415UsurPrint[0] ;
         A14487UsurSockt = BC002M9_A14487UsurSockt[0] ;
         n14487UsurSockt = BC002M9_n14487UsurSockt[0] ;
         Z850UsurCod = A850UsurCod ;
         sMode110 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load2M110( ) ;
         if ( AnyError == 1 )
         {
            RcdFound110 = (short)(0) ;
            initializeNonKey2M110( ) ;
         }
         Gx_mode = sMode110 ;
      }
      else
      {
         RcdFound110 = (short)(0) ;
         initializeNonKey2M110( ) ;
         sMode110 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode110 ;
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey2M110( ) ;
      if ( RcdFound110 == 0 )
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
      confirm_2M0( ) ;
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

   public void checkOptimisticConcurrency2M110( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC002M10 */
         pr_default.execute(8, new Object[] {A850UsurCod});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUARI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(8) == 101) || !( Z14371UsurGuid.equals( BC002M10_A14371UsurGuid[0] ) ) || ( GXutil.strcmp(Z854UsurNom, BC002M10_A854UsurNom[0]) != 0 ) || ( GXutil.strcmp(Z855UsurPwd, BC002M10_A855UsurPwd[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z851UsurFec), GXutil.resetTime(BC002M10_A851UsurFec[0])) ) || ( GXutil.strcmp(Z10513UsuMail, BC002M10_A10513UsuMail[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10713UsuMailP, BC002M10_A10713UsuMailP[0]) != 0 ) || ( GXutil.strcmp(Z10714UsuMailU, BC002M10_A10714UsuMailU[0]) != 0 ) || ( Z13837UsurCmbPwd != BC002M10_A13837UsurCmbPwd[0] ) || ( GXutil.strcmp(Z13838UsurTkn, BC002M10_A13838UsurTkn[0]) != 0 ) || !( GXutil.dateCompare(Z13839UsurTknCrd, BC002M10_A13839UsurTknCrd[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z13840UsurTknVto, BC002M10_A13840UsurTknVto[0]) ) || ( GXutil.strcmp(Z14415UsurPrint, BC002M10_A14415UsurPrint[0]) != 0 ) || ( GXutil.strcmp(Z14487UsurSockt, BC002M10_A14487UsurSockt[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUSUARI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2M110( )
   {
      beforeValidate2M110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2M110( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2M110( 0) ;
         checkOptimisticConcurrency2M110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2M110( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2M110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002M11 */
                  pr_default.execute(9, new Object[] {A850UsurCod, Boolean.valueOf(n14371UsurGuid), A14371UsurGuid, Boolean.valueOf(n854UsurNom), A854UsurNom, Boolean.valueOf(n855UsurPwd), A855UsurPwd, Boolean.valueOf(n851UsurFec), A851UsurFec, A10513UsuMail, Boolean.valueOf(n10713UsuMailP), A10713UsuMailP, Boolean.valueOf(n10714UsuMailU), A10714UsuMailU, Boolean.valueOf(n13837UsurCmbPwd), Boolean.valueOf(A13837UsurCmbPwd), Boolean.valueOf(n13838UsurTkn), A13838UsurTkn, Boolean.valueOf(n13839UsurTknCrd), A13839UsurTknCrd, Boolean.valueOf(n13840UsurTknVto), A13840UsurTknVto, Boolean.valueOf(n14415UsurPrint), A14415UsurPrint, Boolean.valueOf(n14487UsurSockt), A14487UsurSockt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel2M110( ) ;
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
            load2M110( ) ;
         }
         endLevel2M110( ) ;
      }
      closeExtendedTableCursors2M110( ) ;
   }

   public void update2M110( )
   {
      beforeValidate2M110( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2M110( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2M110( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2M110( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2M110( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002M12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n14371UsurGuid), A14371UsurGuid, Boolean.valueOf(n854UsurNom), A854UsurNom, Boolean.valueOf(n855UsurPwd), A855UsurPwd, Boolean.valueOf(n851UsurFec), A851UsurFec, A10513UsuMail, Boolean.valueOf(n10713UsuMailP), A10713UsuMailP, Boolean.valueOf(n10714UsuMailU), A10714UsuMailU, Boolean.valueOf(n13837UsurCmbPwd), Boolean.valueOf(A13837UsurCmbPwd), Boolean.valueOf(n13838UsurTkn), A13838UsurTkn, Boolean.valueOf(n13839UsurTknCrd), A13839UsurTknCrd, Boolean.valueOf(n13840UsurTknVto), A13840UsurTknVto, Boolean.valueOf(n14415UsurPrint), A14415UsurPrint, Boolean.valueOf(n14487UsurSockt), A14487UsurSockt, A850UsurCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUARI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2M110( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2M110( ) ;
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
         endLevel2M110( ) ;
      }
      closeExtendedTableCursors2M110( ) ;
   }

   public void deferredUpdate2M110( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate2M110( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2M110( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2M110( ) ;
         afterConfirm2M110( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2M110( ) ;
            if ( AnyError == 0 )
            {
               scanKeyStart2M127( ) ;
               while ( RcdFound127 != 0 )
               {
                  getByPrimaryKey2M127( ) ;
                  delete2M127( ) ;
                  scanKeyNext2M127( ) ;
               }
               scanKeyEnd2M127( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002M13 */
                  pr_default.execute(11, new Object[] {A850UsurCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUARI");
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
      sMode110 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel2M110( ) ;
      Gx_mode = sMode110 ;
   }

   public void onDeleteControls2M110( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC002M14 */
         pr_default.execute(12, new Object[] {A850UsurCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "USUEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void processNestedLevel2M127( )
   {
      nGXsfl_127_idx = 0 ;
      while ( nGXsfl_127_idx < bcTUSUARI.getgxTv_SdtTUSUARI_Level1().size() )
      {
         readRow2M127( ) ;
         if ( (GXutil.strcmp("", Gx_mode)==0) )
         {
            if ( RcdFound127 == 0 )
            {
               Gx_mode = "INS" ;
            }
            else
            {
               Gx_mode = "UPD" ;
            }
         }
         if ( ! isIns( ) || ( nIsMod_127 != 0 ) )
         {
            standaloneNotModal2M127( ) ;
            if ( isIns( ) )
            {
               Gx_mode = "INS" ;
               insert2M127( ) ;
            }
            else
            {
               if ( isDlt( ) )
               {
                  Gx_mode = "DLT" ;
                  delete2M127( ) ;
               }
               else
               {
                  Gx_mode = "UPD" ;
                  update2M127( ) ;
               }
            }
         }
         KeyVarsToRow127( ((app.SdtTUSUARI_Level1Item)bcTUSUARI.getgxTv_SdtTUSUARI_Level1().elementAt(-1+nGXsfl_127_idx))) ;
      }
      if ( AnyError == 0 )
      {
         /* Batch update SDT rows */
         nGXsfl_127_idx = 0 ;
         while ( nGXsfl_127_idx < bcTUSUARI.getgxTv_SdtTUSUARI_Level1().size() )
         {
            readRow2M127( ) ;
            if ( (GXutil.strcmp("", Gx_mode)==0) )
            {
               if ( RcdFound127 == 0 )
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
               bcTUSUARI.getgxTv_SdtTUSUARI_Level1().removeElement(nGXsfl_127_idx);
               nGXsfl_127_idx = (int)(nGXsfl_127_idx-1) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               getByPrimaryKey2M127( ) ;
               VarsToRow127( ((app.SdtTUSUARI_Level1Item)bcTUSUARI.getgxTv_SdtTUSUARI_Level1().elementAt(-1+nGXsfl_127_idx))) ;
            }
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll2M127( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_127 = (short)(0) ;
      nIsMod_127 = (short)(0) ;
      Gxremove127 = (byte)(0) ;
   }

   public void processLevel2M110( )
   {
      /* Save parent mode. */
      sMode110 = Gx_mode ;
      processNestedLevel2M127( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode110 ;
      /* ' Update level parameters */
   }

   public void endLevel2M110( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2M110( ) ;
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

   public void scanKeyStart2M110( )
   {
      /* Using cursor BC002M15 */
      pr_default.execute(13, new Object[] {A850UsurCod});
      RcdFound110 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A850UsurCod = BC002M15_A850UsurCod[0] ;
         A14371UsurGuid = BC002M15_A14371UsurGuid[0] ;
         n14371UsurGuid = BC002M15_n14371UsurGuid[0] ;
         A854UsurNom = BC002M15_A854UsurNom[0] ;
         n854UsurNom = BC002M15_n854UsurNom[0] ;
         A855UsurPwd = BC002M15_A855UsurPwd[0] ;
         n855UsurPwd = BC002M15_n855UsurPwd[0] ;
         A851UsurFec = BC002M15_A851UsurFec[0] ;
         n851UsurFec = BC002M15_n851UsurFec[0] ;
         A10513UsuMail = BC002M15_A10513UsuMail[0] ;
         A10713UsuMailP = BC002M15_A10713UsuMailP[0] ;
         n10713UsuMailP = BC002M15_n10713UsuMailP[0] ;
         A10714UsuMailU = BC002M15_A10714UsuMailU[0] ;
         n10714UsuMailU = BC002M15_n10714UsuMailU[0] ;
         A13837UsurCmbPwd = BC002M15_A13837UsurCmbPwd[0] ;
         n13837UsurCmbPwd = BC002M15_n13837UsurCmbPwd[0] ;
         A13838UsurTkn = BC002M15_A13838UsurTkn[0] ;
         n13838UsurTkn = BC002M15_n13838UsurTkn[0] ;
         A13839UsurTknCrd = BC002M15_A13839UsurTknCrd[0] ;
         n13839UsurTknCrd = BC002M15_n13839UsurTknCrd[0] ;
         A13840UsurTknVto = BC002M15_A13840UsurTknVto[0] ;
         n13840UsurTknVto = BC002M15_n13840UsurTknVto[0] ;
         A14415UsurPrint = BC002M15_A14415UsurPrint[0] ;
         n14415UsurPrint = BC002M15_n14415UsurPrint[0] ;
         A14487UsurSockt = BC002M15_A14487UsurSockt[0] ;
         n14487UsurSockt = BC002M15_n14487UsurSockt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext2M110( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound110 = (short)(0) ;
      scanKeyLoad2M110( ) ;
   }

   public void scanKeyLoad2M110( )
   {
      sMode110 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound110 = (short)(1) ;
         A850UsurCod = BC002M15_A850UsurCod[0] ;
         A14371UsurGuid = BC002M15_A14371UsurGuid[0] ;
         n14371UsurGuid = BC002M15_n14371UsurGuid[0] ;
         A854UsurNom = BC002M15_A854UsurNom[0] ;
         n854UsurNom = BC002M15_n854UsurNom[0] ;
         A855UsurPwd = BC002M15_A855UsurPwd[0] ;
         n855UsurPwd = BC002M15_n855UsurPwd[0] ;
         A851UsurFec = BC002M15_A851UsurFec[0] ;
         n851UsurFec = BC002M15_n851UsurFec[0] ;
         A10513UsuMail = BC002M15_A10513UsuMail[0] ;
         A10713UsuMailP = BC002M15_A10713UsuMailP[0] ;
         n10713UsuMailP = BC002M15_n10713UsuMailP[0] ;
         A10714UsuMailU = BC002M15_A10714UsuMailU[0] ;
         n10714UsuMailU = BC002M15_n10714UsuMailU[0] ;
         A13837UsurCmbPwd = BC002M15_A13837UsurCmbPwd[0] ;
         n13837UsurCmbPwd = BC002M15_n13837UsurCmbPwd[0] ;
         A13838UsurTkn = BC002M15_A13838UsurTkn[0] ;
         n13838UsurTkn = BC002M15_n13838UsurTkn[0] ;
         A13839UsurTknCrd = BC002M15_A13839UsurTknCrd[0] ;
         n13839UsurTknCrd = BC002M15_n13839UsurTknCrd[0] ;
         A13840UsurTknVto = BC002M15_A13840UsurTknVto[0] ;
         n13840UsurTknVto = BC002M15_n13840UsurTknVto[0] ;
         A14415UsurPrint = BC002M15_A14415UsurPrint[0] ;
         n14415UsurPrint = BC002M15_n14415UsurPrint[0] ;
         A14487UsurSockt = BC002M15_A14487UsurSockt[0] ;
         n14487UsurSockt = BC002M15_n14487UsurSockt[0] ;
      }
      Gx_mode = sMode110 ;
   }

   public void scanKeyEnd2M110( )
   {
      pr_default.close(13);
   }

   public void afterConfirm2M110( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2M110( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2M110( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2M110( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2M110( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2M110( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2M110( )
   {
   }

   public void zm2M127( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z952GrpPri = A952GrpPri ;
      }
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         Z944GrpTxt = A944GrpTxt ;
      }
      if ( GX_JID == -6 )
      {
         Z850UsurCod = A850UsurCod ;
         Z952GrpPri = A952GrpPri ;
         Z943GrpId = A943GrpId ;
         Z944GrpTxt = A944GrpTxt ;
      }
   }

   public void standaloneNotModal2M127( )
   {
   }

   public void standaloneModal2M127( )
   {
   }

   public void load2M127( )
   {
      /* Using cursor BC002M16 */
      pr_default.execute(14, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A944GrpTxt = BC002M16_A944GrpTxt[0] ;
         n944GrpTxt = BC002M16_n944GrpTxt[0] ;
         A952GrpPri = BC002M16_A952GrpPri[0] ;
         zm2M127( -6) ;
      }
      pr_default.close(14);
      onLoadActions2M127( ) ;
   }

   public void onLoadActions2M127( )
   {
   }

   public void checkExtendedTable2M127( )
   {
      nIsDirty_127 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal2M127( ) ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC002M17 */
      pr_default.execute(15, new Object[] {A943GrpId});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPID");
         AnyError = (short)(1) ;
      }
      A944GrpTxt = BC002M17_A944GrpTxt[0] ;
      n944GrpTxt = BC002M17_n944GrpTxt[0] ;
      pr_default.close(15);
   }

   public void closeExtendedTableCursors2M127( )
   {
      pr_default.close(15);
   }

   public void enableDisable2M127( )
   {
   }

   public void getKey2M127( )
   {
      /* Using cursor BC002M18 */
      pr_default.execute(16, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound127 = (short)(1) ;
      }
      else
      {
         RcdFound127 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey2M127( )
   {
      /* Using cursor BC002M19 */
      pr_default.execute(17, new Object[] {A850UsurCod, A943GrpId});
      if ( (pr_default.getStatus(17) != 101) )
      {
         zm2M127( 6) ;
         RcdFound127 = (short)(1) ;
         initializeNonKey2M127( ) ;
         A952GrpPri = BC002M19_A952GrpPri[0] ;
         A943GrpId = BC002M19_A943GrpId[0] ;
         Z850UsurCod = A850UsurCod ;
         Z943GrpId = A943GrpId ;
         sMode127 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal2M127( ) ;
         load2M127( ) ;
         Gx_mode = sMode127 ;
      }
      else
      {
         RcdFound127 = (short)(0) ;
         initializeNonKey2M127( ) ;
         sMode127 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal2M127( ) ;
         Gx_mode = sMode127 ;
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2M127( ) ;
      }
      pr_default.close(17);
   }

   public void checkOptimisticConcurrency2M127( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC002M20 */
         pr_default.execute(18, new Object[] {A850UsurCod, A943GrpId});
         if ( (pr_default.getStatus(18) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUGRP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(18) == 101) || ( Z952GrpPri != BC002M20_A952GrpPri[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPUSUGRP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2M127( )
   {
      beforeValidate2M127( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2M127( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2M127( 0) ;
         checkOptimisticConcurrency2M127( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2M127( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2M127( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002M21 */
                  pr_default.execute(19, new Object[] {A850UsurCod, Byte.valueOf(A952GrpPri), A943GrpId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load2M127( ) ;
         }
         endLevel2M127( ) ;
      }
      closeExtendedTableCursors2M127( ) ;
   }

   public void update2M127( )
   {
      beforeValidate2M127( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2M127( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2M127( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2M127( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2M127( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002M22 */
                  pr_default.execute(20, new Object[] {Byte.valueOf(A952GrpPri), A850UsurCod, A943GrpId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPUSUGRP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2M127( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey2M127( ) ;
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
         endLevel2M127( ) ;
      }
      closeExtendedTableCursors2M127( ) ;
   }

   public void deferredUpdate2M127( )
   {
   }

   public void delete2M127( )
   {
      Gx_mode = "DLT" ;
      beforeValidate2M127( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2M127( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2M127( ) ;
         afterConfirm2M127( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2M127( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC002M23 */
               pr_default.execute(21, new Object[] {A850UsurCod, A943GrpId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUSUGRP");
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
      sMode127 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel2M127( ) ;
      Gx_mode = sMode127 ;
   }

   public void onDeleteControls2M127( )
   {
      standaloneModal2M127( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC002M24 */
         pr_default.execute(22, new Object[] {A943GrpId});
         A944GrpTxt = BC002M24_A944GrpTxt[0] ;
         n944GrpTxt = BC002M24_n944GrpTxt[0] ;
         pr_default.close(22);
      }
   }

   public void endLevel2M127( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(18);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart2M127( )
   {
      /* Scan By routine */
      /* Using cursor BC002M25 */
      pr_default.execute(23, new Object[] {A850UsurCod});
      RcdFound127 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A944GrpTxt = BC002M25_A944GrpTxt[0] ;
         n944GrpTxt = BC002M25_n944GrpTxt[0] ;
         A952GrpPri = BC002M25_A952GrpPri[0] ;
         A943GrpId = BC002M25_A943GrpId[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext2M127( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound127 = (short)(0) ;
      scanKeyLoad2M127( ) ;
   }

   public void scanKeyLoad2M127( )
   {
      sMode127 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound127 = (short)(1) ;
         A944GrpTxt = BC002M25_A944GrpTxt[0] ;
         n944GrpTxt = BC002M25_n944GrpTxt[0] ;
         A952GrpPri = BC002M25_A952GrpPri[0] ;
         A943GrpId = BC002M25_A943GrpId[0] ;
      }
      Gx_mode = sMode127 ;
   }

   public void scanKeyEnd2M127( )
   {
      pr_default.close(23);
   }

   public void afterConfirm2M127( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2M127( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2M127( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2M127( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2M127( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2M127( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2M127( )
   {
   }

   public void send_integrity_lvl_hashes2M127( )
   {
   }

   public void send_integrity_lvl_hashes2M110( )
   {
   }

   public void addRow2M110( )
   {
      VarsToRow110( bcTUSUARI) ;
   }

   public void readRow2M110( )
   {
      RowToVars110( bcTUSUARI, 1) ;
   }

   public void addRow2M127( )
   {
      app.SdtTUSUARI_Level1Item obj127;
      obj127 = new app.SdtTUSUARI_Level1Item(remoteHandle);
      VarsToRow127( obj127) ;
      bcTUSUARI.getgxTv_SdtTUSUARI_Level1().add(obj127, 0);
      obj127.setgxTv_SdtTUSUARI_Level1Item_Mode( "UPD" );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Modified( (short)(0) );
   }

   public void readRow2M127( )
   {
      nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
      RowToVars127( ((app.SdtTUSUARI_Level1Item)bcTUSUARI.getgxTv_SdtTUSUARI_Level1().elementAt(-1+nGXsfl_127_idx)), 1) ;
   }

   public void initializeNonKey2M110( )
   {
      A854UsurNom = "" ;
      n854UsurNom = false ;
      A855UsurPwd = "" ;
      n855UsurPwd = false ;
      A851UsurFec = GXutil.nullDate() ;
      n851UsurFec = false ;
      A10513UsuMail = "" ;
      A10713UsuMailP = "" ;
      n10713UsuMailP = false ;
      A10714UsuMailU = "" ;
      n10714UsuMailU = false ;
      A13837UsurCmbPwd = false ;
      n13837UsurCmbPwd = false ;
      A13838UsurTkn = "" ;
      n13838UsurTkn = false ;
      A13839UsurTknCrd = GXutil.resetTime( GXutil.nullDate() );
      n13839UsurTknCrd = false ;
      A13840UsurTknVto = GXutil.resetTime( GXutil.nullDate() );
      n13840UsurTknVto = false ;
      A14415UsurPrint = "" ;
      n14415UsurPrint = false ;
      A14487UsurSockt = "" ;
      n14487UsurSockt = false ;
      A14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      Z14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z854UsurNom = "" ;
      Z855UsurPwd = "" ;
      Z851UsurFec = GXutil.nullDate() ;
      Z10513UsuMail = "" ;
      Z10713UsuMailP = "" ;
      Z10714UsuMailU = "" ;
      Z13837UsurCmbPwd = false ;
      Z13838UsurTkn = "" ;
      Z13839UsurTknCrd = GXutil.resetTime( GXutil.nullDate() );
      Z13840UsurTknVto = GXutil.resetTime( GXutil.nullDate() );
      Z14415UsurPrint = "" ;
      Z14487UsurSockt = "" ;
   }

   public void initAll2M110( )
   {
      A850UsurCod = "" ;
      initializeNonKey2M110( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14371UsurGuid = i14371UsurGuid ;
      n14371UsurGuid = false ;
   }

   public void initializeNonKey2M127( )
   {
      A944GrpTxt = "" ;
      n944GrpTxt = false ;
      A952GrpPri = (byte)(0) ;
      Z952GrpPri = (byte)(0) ;
   }

   public void initAll2M127( )
   {
      A943GrpId = "" ;
      initializeNonKey2M127( ) ;
   }

   public void standaloneModalInsert2M127( )
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

   public void VarsToRow110( app.SdtTUSUARI obj110 )
   {
      obj110.setgxTv_SdtTUSUARI_Mode( Gx_mode );
      obj110.setgxTv_SdtTUSUARI_Usurnom( A854UsurNom );
      obj110.setgxTv_SdtTUSUARI_Usurpwd( A855UsurPwd );
      obj110.setgxTv_SdtTUSUARI_Usurfec( A851UsurFec );
      obj110.setgxTv_SdtTUSUARI_Usumail( A10513UsuMail );
      obj110.setgxTv_SdtTUSUARI_Usumailp( A10713UsuMailP );
      obj110.setgxTv_SdtTUSUARI_Usumailu( A10714UsuMailU );
      obj110.setgxTv_SdtTUSUARI_Usurcmbpwd( A13837UsurCmbPwd );
      obj110.setgxTv_SdtTUSUARI_Usurtkn( A13838UsurTkn );
      obj110.setgxTv_SdtTUSUARI_Usurtkncrd( A13839UsurTknCrd );
      obj110.setgxTv_SdtTUSUARI_Usurtknvto( A13840UsurTknVto );
      obj110.setgxTv_SdtTUSUARI_Usurprint( A14415UsurPrint );
      obj110.setgxTv_SdtTUSUARI_Usursockt( A14487UsurSockt );
      obj110.setgxTv_SdtTUSUARI_Usurguid( A14371UsurGuid );
      obj110.setgxTv_SdtTUSUARI_Usurcod( A850UsurCod );
      obj110.setgxTv_SdtTUSUARI_Usurcod_Z( Z850UsurCod );
      obj110.setgxTv_SdtTUSUARI_Usurnom_Z( Z854UsurNom );
      obj110.setgxTv_SdtTUSUARI_Usurpwd_Z( Z855UsurPwd );
      obj110.setgxTv_SdtTUSUARI_Usurfec_Z( Z851UsurFec );
      obj110.setgxTv_SdtTUSUARI_Usumail_Z( Z10513UsuMail );
      obj110.setgxTv_SdtTUSUARI_Usumailp_Z( Z10713UsuMailP );
      obj110.setgxTv_SdtTUSUARI_Usumailu_Z( Z10714UsuMailU );
      obj110.setgxTv_SdtTUSUARI_Usurcmbpwd_Z( Z13837UsurCmbPwd );
      obj110.setgxTv_SdtTUSUARI_Usurtkn_Z( Z13838UsurTkn );
      obj110.setgxTv_SdtTUSUARI_Usurtkncrd_Z( Z13839UsurTknCrd );
      obj110.setgxTv_SdtTUSUARI_Usurtknvto_Z( Z13840UsurTknVto );
      obj110.setgxTv_SdtTUSUARI_Usurguid_Z( Z14371UsurGuid );
      obj110.setgxTv_SdtTUSUARI_Usurprint_Z( Z14415UsurPrint );
      obj110.setgxTv_SdtTUSUARI_Usursockt_Z( Z14487UsurSockt );
      obj110.setgxTv_SdtTUSUARI_Usurnom_N( (byte)((byte)((n854UsurNom)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurpwd_N( (byte)((byte)((n855UsurPwd)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurfec_N( (byte)((byte)((n851UsurFec)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usumailp_N( (byte)((byte)((n10713UsuMailP)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usumailu_N( (byte)((byte)((n10714UsuMailU)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurcmbpwd_N( (byte)((byte)((n13837UsurCmbPwd)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurtkn_N( (byte)((byte)((n13838UsurTkn)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurtkncrd_N( (byte)((byte)((n13839UsurTknCrd)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurtknvto_N( (byte)((byte)((n13840UsurTknVto)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurguid_N( (byte)((byte)((n14371UsurGuid)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usurprint_N( (byte)((byte)((n14415UsurPrint)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Usursockt_N( (byte)((byte)((n14487UsurSockt)?1:0)) );
      obj110.setgxTv_SdtTUSUARI_Mode( Gx_mode );
   }

   public void KeyVarsToRow110( app.SdtTUSUARI obj110 )
   {
      obj110.setgxTv_SdtTUSUARI_Usurcod( A850UsurCod );
   }

   public void RowToVars110( app.SdtTUSUARI obj110 ,
                             int forceLoad )
   {
      Gx_mode = obj110.getgxTv_SdtTUSUARI_Mode() ;
      A854UsurNom = obj110.getgxTv_SdtTUSUARI_Usurnom() ;
      n854UsurNom = false ;
      A855UsurPwd = obj110.getgxTv_SdtTUSUARI_Usurpwd() ;
      n855UsurPwd = false ;
      A851UsurFec = obj110.getgxTv_SdtTUSUARI_Usurfec() ;
      n851UsurFec = false ;
      A10513UsuMail = obj110.getgxTv_SdtTUSUARI_Usumail() ;
      A10713UsuMailP = obj110.getgxTv_SdtTUSUARI_Usumailp() ;
      n10713UsuMailP = false ;
      A10714UsuMailU = obj110.getgxTv_SdtTUSUARI_Usumailu() ;
      n10714UsuMailU = false ;
      A13837UsurCmbPwd = obj110.getgxTv_SdtTUSUARI_Usurcmbpwd() ;
      n13837UsurCmbPwd = false ;
      A13838UsurTkn = obj110.getgxTv_SdtTUSUARI_Usurtkn() ;
      n13838UsurTkn = false ;
      A13839UsurTknCrd = obj110.getgxTv_SdtTUSUARI_Usurtkncrd() ;
      n13839UsurTknCrd = false ;
      A13840UsurTknVto = obj110.getgxTv_SdtTUSUARI_Usurtknvto() ;
      n13840UsurTknVto = false ;
      A14415UsurPrint = obj110.getgxTv_SdtTUSUARI_Usurprint() ;
      n14415UsurPrint = false ;
      A14487UsurSockt = obj110.getgxTv_SdtTUSUARI_Usursockt() ;
      n14487UsurSockt = false ;
      A14371UsurGuid = obj110.getgxTv_SdtTUSUARI_Usurguid() ;
      n14371UsurGuid = false ;
      A850UsurCod = obj110.getgxTv_SdtTUSUARI_Usurcod() ;
      Z850UsurCod = obj110.getgxTv_SdtTUSUARI_Usurcod_Z() ;
      Z854UsurNom = obj110.getgxTv_SdtTUSUARI_Usurnom_Z() ;
      Z855UsurPwd = obj110.getgxTv_SdtTUSUARI_Usurpwd_Z() ;
      Z851UsurFec = obj110.getgxTv_SdtTUSUARI_Usurfec_Z() ;
      Z10513UsuMail = obj110.getgxTv_SdtTUSUARI_Usumail_Z() ;
      Z10713UsuMailP = obj110.getgxTv_SdtTUSUARI_Usumailp_Z() ;
      Z10714UsuMailU = obj110.getgxTv_SdtTUSUARI_Usumailu_Z() ;
      Z13837UsurCmbPwd = obj110.getgxTv_SdtTUSUARI_Usurcmbpwd_Z() ;
      Z13838UsurTkn = obj110.getgxTv_SdtTUSUARI_Usurtkn_Z() ;
      Z13839UsurTknCrd = obj110.getgxTv_SdtTUSUARI_Usurtkncrd_Z() ;
      Z13840UsurTknVto = obj110.getgxTv_SdtTUSUARI_Usurtknvto_Z() ;
      Z14371UsurGuid = obj110.getgxTv_SdtTUSUARI_Usurguid_Z() ;
      Z14415UsurPrint = obj110.getgxTv_SdtTUSUARI_Usurprint_Z() ;
      Z14487UsurSockt = obj110.getgxTv_SdtTUSUARI_Usursockt_Z() ;
      n854UsurNom = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurnom_N()==0)?false:true) ;
      n855UsurPwd = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurpwd_N()==0)?false:true) ;
      n851UsurFec = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurfec_N()==0)?false:true) ;
      n10713UsuMailP = (boolean)((obj110.getgxTv_SdtTUSUARI_Usumailp_N()==0)?false:true) ;
      n10714UsuMailU = (boolean)((obj110.getgxTv_SdtTUSUARI_Usumailu_N()==0)?false:true) ;
      n13837UsurCmbPwd = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurcmbpwd_N()==0)?false:true) ;
      n13838UsurTkn = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurtkn_N()==0)?false:true) ;
      n13839UsurTknCrd = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurtkncrd_N()==0)?false:true) ;
      n13840UsurTknVto = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurtknvto_N()==0)?false:true) ;
      n14371UsurGuid = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurguid_N()==0)?false:true) ;
      n14415UsurPrint = (boolean)((obj110.getgxTv_SdtTUSUARI_Usurprint_N()==0)?false:true) ;
      n14487UsurSockt = (boolean)((obj110.getgxTv_SdtTUSUARI_Usursockt_N()==0)?false:true) ;
      Gx_mode = obj110.getgxTv_SdtTUSUARI_Mode() ;
   }

   public void VarsToRow127( app.SdtTUSUARI_Level1Item obj127 )
   {
      obj127.setgxTv_SdtTUSUARI_Level1Item_Mode( Gx_mode );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grptxt( A944GrpTxt );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grppri( A952GrpPri );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grpid( A943GrpId );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grpid_Z( Z943GrpId );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grptxt_Z( Z944GrpTxt );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grppri_Z( Z952GrpPri );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grptxt_N( (byte)((byte)((n944GrpTxt)?1:0)) );
      obj127.setgxTv_SdtTUSUARI_Level1Item_Modified( nIsMod_127 );
   }

   public void KeyVarsToRow127( app.SdtTUSUARI_Level1Item obj127 )
   {
      obj127.setgxTv_SdtTUSUARI_Level1Item_Grpid( A943GrpId );
   }

   public void RowToVars127( app.SdtTUSUARI_Level1Item obj127 ,
                             int forceLoad )
   {
      Gx_mode = obj127.getgxTv_SdtTUSUARI_Level1Item_Mode() ;
      A944GrpTxt = obj127.getgxTv_SdtTUSUARI_Level1Item_Grptxt() ;
      n944GrpTxt = false ;
      A952GrpPri = obj127.getgxTv_SdtTUSUARI_Level1Item_Grppri() ;
      A943GrpId = obj127.getgxTv_SdtTUSUARI_Level1Item_Grpid() ;
      Z943GrpId = obj127.getgxTv_SdtTUSUARI_Level1Item_Grpid_Z() ;
      Z944GrpTxt = obj127.getgxTv_SdtTUSUARI_Level1Item_Grptxt_Z() ;
      Z952GrpPri = obj127.getgxTv_SdtTUSUARI_Level1Item_Grppri_Z() ;
      n944GrpTxt = (boolean)((obj127.getgxTv_SdtTUSUARI_Level1Item_Grptxt_N()==0)?false:true) ;
      nIsMod_127 = obj127.getgxTv_SdtTUSUARI_Level1Item_Modified() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A850UsurCod = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey2M110( ) ;
      scanKeyStart2M110( ) ;
      if ( RcdFound110 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z850UsurCod = A850UsurCod ;
      }
      zm2M110( -5) ;
      onLoadActions2M110( ) ;
      addRow2M110( ) ;
      bcTUSUARI.getgxTv_SdtTUSUARI_Level1().clearCollection();
      if ( RcdFound110 == 1 )
      {
         scanKeyStart2M127( ) ;
         nGXsfl_127_idx = 1 ;
         while ( RcdFound127 != 0 )
         {
            Z850UsurCod = A850UsurCod ;
            Z943GrpId = A943GrpId ;
            zm2M127( -6) ;
            onLoadActions2M127( ) ;
            nRcdExists_127 = (short)(1) ;
            nIsMod_127 = (short)(0) ;
            addRow2M127( ) ;
            nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
            scanKeyNext2M127( ) ;
         }
         scanKeyEnd2M127( ) ;
      }
      scanKeyEnd2M110( ) ;
      if ( RcdFound110 == 0 )
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
      RowToVars110( bcTUSUARI, 0) ;
      scanKeyStart2M110( ) ;
      if ( RcdFound110 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z850UsurCod = A850UsurCod ;
      }
      zm2M110( -5) ;
      onLoadActions2M110( ) ;
      addRow2M110( ) ;
      bcTUSUARI.getgxTv_SdtTUSUARI_Level1().clearCollection();
      if ( RcdFound110 == 1 )
      {
         scanKeyStart2M127( ) ;
         nGXsfl_127_idx = 1 ;
         while ( RcdFound127 != 0 )
         {
            Z850UsurCod = A850UsurCod ;
            Z943GrpId = A943GrpId ;
            zm2M127( -6) ;
            onLoadActions2M127( ) ;
            nRcdExists_127 = (short)(1) ;
            nIsMod_127 = (short)(0) ;
            addRow2M127( ) ;
            nGXsfl_127_idx = (int)(nGXsfl_127_idx+1) ;
            scanKeyNext2M127( ) ;
         }
         scanKeyEnd2M127( ) ;
      }
      scanKeyEnd2M110( ) ;
      if ( RcdFound110 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2M110( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert2M110( ) ;
      }
      else
      {
         if ( RcdFound110 == 1 )
         {
            if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
            {
               A850UsurCod = Z850UsurCod ;
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
               update2M110( ) ;
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
               if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
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
                     insert2M110( ) ;
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
                     insert2M110( ) ;
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
      RowToVars110( bcTUSUARI, 1) ;
      saveImpl( ) ;
      VarsToRow110( bcTUSUARI) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars110( bcTUSUARI, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2M110( ) ;
      afterTrn( ) ;
      VarsToRow110( bcTUSUARI) ;
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
         app.SdtTUSUARI auxBC = new app.SdtTUSUARI( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A850UsurCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTUSUARI);
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
      RowToVars110( bcTUSUARI, 1) ;
      updateImpl( ) ;
      VarsToRow110( bcTUSUARI) ;
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
      RowToVars110( bcTUSUARI, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2M110( ) ;
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
      VarsToRow110( bcTUSUARI) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars110( bcTUSUARI, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey2M110( ) ;
      if ( RcdFound110 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
         {
            A850UsurCod = Z850UsurCod ;
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
         if ( GXutil.strcmp(A850UsurCod, Z850UsurCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tusuari_bc");
      VarsToRow110( bcTUSUARI) ;
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
      Gx_mode = bcTUSUARI.getgxTv_SdtTUSUARI_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTUSUARI.setgxTv_SdtTUSUARI_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTUSUARI sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTUSUARI )
      {
         bcTUSUARI = sdt ;
         if ( GXutil.strcmp(bcTUSUARI.getgxTv_SdtTUSUARI_Mode(), "") == 0 )
         {
            bcTUSUARI.setgxTv_SdtTUSUARI_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow110( bcTUSUARI) ;
         }
         else
         {
            RowToVars110( bcTUSUARI, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTUSUARI.getgxTv_SdtTUSUARI_Mode(), "") == 0 )
         {
            bcTUSUARI.setgxTv_SdtTUSUARI_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars110( bcTUSUARI, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTUSUARI getTUSUARI_BC( )
   {
      return bcTUSUARI ;
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
      Z850UsurCod = "" ;
      A850UsurCod = "" ;
      sMode110 = "" ;
      Z14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      A14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Z854UsurNom = "" ;
      A854UsurNom = "" ;
      Z855UsurPwd = "" ;
      A855UsurPwd = "" ;
      Z851UsurFec = GXutil.nullDate() ;
      A851UsurFec = GXutil.nullDate() ;
      Z10513UsuMail = "" ;
      A10513UsuMail = "" ;
      Z10713UsuMailP = "" ;
      A10713UsuMailP = "" ;
      Z10714UsuMailU = "" ;
      A10714UsuMailU = "" ;
      Z13838UsurTkn = "" ;
      A13838UsurTkn = "" ;
      Z13839UsurTknCrd = GXutil.resetTime( GXutil.nullDate() );
      A13839UsurTknCrd = GXutil.resetTime( GXutil.nullDate() );
      Z13840UsurTknVto = GXutil.resetTime( GXutil.nullDate() );
      A13840UsurTknVto = GXutil.resetTime( GXutil.nullDate() );
      Z14415UsurPrint = "" ;
      A14415UsurPrint = "" ;
      Z14487UsurSockt = "" ;
      A14487UsurSockt = "" ;
      BC002M7_A850UsurCod = new String[] {""} ;
      BC002M7_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC002M7_n14371UsurGuid = new boolean[] {false} ;
      BC002M7_A854UsurNom = new String[] {""} ;
      BC002M7_n854UsurNom = new boolean[] {false} ;
      BC002M7_A855UsurPwd = new String[] {""} ;
      BC002M7_n855UsurPwd = new boolean[] {false} ;
      BC002M7_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M7_n851UsurFec = new boolean[] {false} ;
      BC002M7_A10513UsuMail = new String[] {""} ;
      BC002M7_A10713UsuMailP = new String[] {""} ;
      BC002M7_n10713UsuMailP = new boolean[] {false} ;
      BC002M7_A10714UsuMailU = new String[] {""} ;
      BC002M7_n10714UsuMailU = new boolean[] {false} ;
      BC002M7_A13837UsurCmbPwd = new boolean[] {false} ;
      BC002M7_n13837UsurCmbPwd = new boolean[] {false} ;
      BC002M7_A13838UsurTkn = new String[] {""} ;
      BC002M7_n13838UsurTkn = new boolean[] {false} ;
      BC002M7_A13839UsurTknCrd = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M7_n13839UsurTknCrd = new boolean[] {false} ;
      BC002M7_A13840UsurTknVto = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M7_n13840UsurTknVto = new boolean[] {false} ;
      BC002M7_A14415UsurPrint = new String[] {""} ;
      BC002M7_n14415UsurPrint = new boolean[] {false} ;
      BC002M7_A14487UsurSockt = new String[] {""} ;
      BC002M7_n14487UsurSockt = new boolean[] {false} ;
      BC002M8_A850UsurCod = new String[] {""} ;
      BC002M9_A850UsurCod = new String[] {""} ;
      BC002M9_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC002M9_n14371UsurGuid = new boolean[] {false} ;
      BC002M9_A854UsurNom = new String[] {""} ;
      BC002M9_n854UsurNom = new boolean[] {false} ;
      BC002M9_A855UsurPwd = new String[] {""} ;
      BC002M9_n855UsurPwd = new boolean[] {false} ;
      BC002M9_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M9_n851UsurFec = new boolean[] {false} ;
      BC002M9_A10513UsuMail = new String[] {""} ;
      BC002M9_A10713UsuMailP = new String[] {""} ;
      BC002M9_n10713UsuMailP = new boolean[] {false} ;
      BC002M9_A10714UsuMailU = new String[] {""} ;
      BC002M9_n10714UsuMailU = new boolean[] {false} ;
      BC002M9_A13837UsurCmbPwd = new boolean[] {false} ;
      BC002M9_n13837UsurCmbPwd = new boolean[] {false} ;
      BC002M9_A13838UsurTkn = new String[] {""} ;
      BC002M9_n13838UsurTkn = new boolean[] {false} ;
      BC002M9_A13839UsurTknCrd = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M9_n13839UsurTknCrd = new boolean[] {false} ;
      BC002M9_A13840UsurTknVto = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M9_n13840UsurTknVto = new boolean[] {false} ;
      BC002M9_A14415UsurPrint = new String[] {""} ;
      BC002M9_n14415UsurPrint = new boolean[] {false} ;
      BC002M9_A14487UsurSockt = new String[] {""} ;
      BC002M9_n14487UsurSockt = new boolean[] {false} ;
      BC002M10_A850UsurCod = new String[] {""} ;
      BC002M10_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC002M10_n14371UsurGuid = new boolean[] {false} ;
      BC002M10_A854UsurNom = new String[] {""} ;
      BC002M10_n854UsurNom = new boolean[] {false} ;
      BC002M10_A855UsurPwd = new String[] {""} ;
      BC002M10_n855UsurPwd = new boolean[] {false} ;
      BC002M10_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M10_n851UsurFec = new boolean[] {false} ;
      BC002M10_A10513UsuMail = new String[] {""} ;
      BC002M10_A10713UsuMailP = new String[] {""} ;
      BC002M10_n10713UsuMailP = new boolean[] {false} ;
      BC002M10_A10714UsuMailU = new String[] {""} ;
      BC002M10_n10714UsuMailU = new boolean[] {false} ;
      BC002M10_A13837UsurCmbPwd = new boolean[] {false} ;
      BC002M10_n13837UsurCmbPwd = new boolean[] {false} ;
      BC002M10_A13838UsurTkn = new String[] {""} ;
      BC002M10_n13838UsurTkn = new boolean[] {false} ;
      BC002M10_A13839UsurTknCrd = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M10_n13839UsurTknCrd = new boolean[] {false} ;
      BC002M10_A13840UsurTknVto = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M10_n13840UsurTknVto = new boolean[] {false} ;
      BC002M10_A14415UsurPrint = new String[] {""} ;
      BC002M10_n14415UsurPrint = new boolean[] {false} ;
      BC002M10_A14487UsurSockt = new String[] {""} ;
      BC002M10_n14487UsurSockt = new boolean[] {false} ;
      BC002M14_A850UsurCod = new String[] {""} ;
      BC002M14_A5159EmprCodU = new String[] {""} ;
      BC002M15_A850UsurCod = new String[] {""} ;
      BC002M15_A14371UsurGuid = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      BC002M15_n14371UsurGuid = new boolean[] {false} ;
      BC002M15_A854UsurNom = new String[] {""} ;
      BC002M15_n854UsurNom = new boolean[] {false} ;
      BC002M15_A855UsurPwd = new String[] {""} ;
      BC002M15_n855UsurPwd = new boolean[] {false} ;
      BC002M15_A851UsurFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M15_n851UsurFec = new boolean[] {false} ;
      BC002M15_A10513UsuMail = new String[] {""} ;
      BC002M15_A10713UsuMailP = new String[] {""} ;
      BC002M15_n10713UsuMailP = new boolean[] {false} ;
      BC002M15_A10714UsuMailU = new String[] {""} ;
      BC002M15_n10714UsuMailU = new boolean[] {false} ;
      BC002M15_A13837UsurCmbPwd = new boolean[] {false} ;
      BC002M15_n13837UsurCmbPwd = new boolean[] {false} ;
      BC002M15_A13838UsurTkn = new String[] {""} ;
      BC002M15_n13838UsurTkn = new boolean[] {false} ;
      BC002M15_A13839UsurTknCrd = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M15_n13839UsurTknCrd = new boolean[] {false} ;
      BC002M15_A13840UsurTknVto = new java.util.Date[] {GXutil.nullDate()} ;
      BC002M15_n13840UsurTknVto = new boolean[] {false} ;
      BC002M15_A14415UsurPrint = new String[] {""} ;
      BC002M15_n14415UsurPrint = new boolean[] {false} ;
      BC002M15_A14487UsurSockt = new String[] {""} ;
      BC002M15_n14487UsurSockt = new boolean[] {false} ;
      Z944GrpTxt = "" ;
      A944GrpTxt = "" ;
      Z943GrpId = "" ;
      A943GrpId = "" ;
      BC002M16_A850UsurCod = new String[] {""} ;
      BC002M16_A944GrpTxt = new String[] {""} ;
      BC002M16_n944GrpTxt = new boolean[] {false} ;
      BC002M16_A952GrpPri = new byte[1] ;
      BC002M16_A943GrpId = new String[] {""} ;
      BC002M17_A944GrpTxt = new String[] {""} ;
      BC002M17_n944GrpTxt = new boolean[] {false} ;
      BC002M18_A850UsurCod = new String[] {""} ;
      BC002M18_A943GrpId = new String[] {""} ;
      BC002M19_A850UsurCod = new String[] {""} ;
      BC002M19_A952GrpPri = new byte[1] ;
      BC002M19_A943GrpId = new String[] {""} ;
      sMode127 = "" ;
      BC002M20_A850UsurCod = new String[] {""} ;
      BC002M20_A952GrpPri = new byte[1] ;
      BC002M20_A943GrpId = new String[] {""} ;
      BC002M24_A944GrpTxt = new String[] {""} ;
      BC002M24_n944GrpTxt = new boolean[] {false} ;
      BC002M25_A850UsurCod = new String[] {""} ;
      BC002M25_A944GrpTxt = new String[] {""} ;
      BC002M25_n944GrpTxt = new boolean[] {false} ;
      BC002M25_A952GrpPri = new byte[1] ;
      BC002M25_A943GrpId = new String[] {""} ;
      i14371UsurGuid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tusuari_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tusuari_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tusuari_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tusuari_bc__default(),
         new Object[] {
             new Object[] {
            BC002M2_A850UsurCod, BC002M2_A952GrpPri, BC002M2_A943GrpId
            }
            , new Object[] {
            BC002M3_A850UsurCod, BC002M3_A952GrpPri, BC002M3_A943GrpId
            }
            , new Object[] {
            BC002M4_A944GrpTxt, BC002M4_n944GrpTxt
            }
            , new Object[] {
            BC002M5_A850UsurCod, BC002M5_A14371UsurGuid, BC002M5_n14371UsurGuid, BC002M5_A854UsurNom, BC002M5_n854UsurNom, BC002M5_A855UsurPwd, BC002M5_n855UsurPwd, BC002M5_A851UsurFec, BC002M5_n851UsurFec, BC002M5_A10513UsuMail,
            BC002M5_A10713UsuMailP, BC002M5_n10713UsuMailP, BC002M5_A10714UsuMailU, BC002M5_n10714UsuMailU, BC002M5_A13837UsurCmbPwd, BC002M5_n13837UsurCmbPwd, BC002M5_A13838UsurTkn, BC002M5_n13838UsurTkn, BC002M5_A13839UsurTknCrd, BC002M5_n13839UsurTknCrd,
            BC002M5_A13840UsurTknVto, BC002M5_n13840UsurTknVto, BC002M5_A14415UsurPrint, BC002M5_n14415UsurPrint, BC002M5_A14487UsurSockt, BC002M5_n14487UsurSockt
            }
            , new Object[] {
            BC002M6_A850UsurCod, BC002M6_A14371UsurGuid, BC002M6_n14371UsurGuid, BC002M6_A854UsurNom, BC002M6_n854UsurNom, BC002M6_A855UsurPwd, BC002M6_n855UsurPwd, BC002M6_A851UsurFec, BC002M6_n851UsurFec, BC002M6_A10513UsuMail,
            BC002M6_A10713UsuMailP, BC002M6_n10713UsuMailP, BC002M6_A10714UsuMailU, BC002M6_n10714UsuMailU, BC002M6_A13837UsurCmbPwd, BC002M6_n13837UsurCmbPwd, BC002M6_A13838UsurTkn, BC002M6_n13838UsurTkn, BC002M6_A13839UsurTknCrd, BC002M6_n13839UsurTknCrd,
            BC002M6_A13840UsurTknVto, BC002M6_n13840UsurTknVto, BC002M6_A14415UsurPrint, BC002M6_n14415UsurPrint, BC002M6_A14487UsurSockt, BC002M6_n14487UsurSockt
            }
            , new Object[] {
            BC002M7_A850UsurCod, BC002M7_A14371UsurGuid, BC002M7_n14371UsurGuid, BC002M7_A854UsurNom, BC002M7_n854UsurNom, BC002M7_A855UsurPwd, BC002M7_n855UsurPwd, BC002M7_A851UsurFec, BC002M7_n851UsurFec, BC002M7_A10513UsuMail,
            BC002M7_A10713UsuMailP, BC002M7_n10713UsuMailP, BC002M7_A10714UsuMailU, BC002M7_n10714UsuMailU, BC002M7_A13837UsurCmbPwd, BC002M7_n13837UsurCmbPwd, BC002M7_A13838UsurTkn, BC002M7_n13838UsurTkn, BC002M7_A13839UsurTknCrd, BC002M7_n13839UsurTknCrd,
            BC002M7_A13840UsurTknVto, BC002M7_n13840UsurTknVto, BC002M7_A14415UsurPrint, BC002M7_n14415UsurPrint, BC002M7_A14487UsurSockt, BC002M7_n14487UsurSockt
            }
            , new Object[] {
            BC002M8_A850UsurCod
            }
            , new Object[] {
            BC002M9_A850UsurCod, BC002M9_A14371UsurGuid, BC002M9_n14371UsurGuid, BC002M9_A854UsurNom, BC002M9_n854UsurNom, BC002M9_A855UsurPwd, BC002M9_n855UsurPwd, BC002M9_A851UsurFec, BC002M9_n851UsurFec, BC002M9_A10513UsuMail,
            BC002M9_A10713UsuMailP, BC002M9_n10713UsuMailP, BC002M9_A10714UsuMailU, BC002M9_n10714UsuMailU, BC002M9_A13837UsurCmbPwd, BC002M9_n13837UsurCmbPwd, BC002M9_A13838UsurTkn, BC002M9_n13838UsurTkn, BC002M9_A13839UsurTknCrd, BC002M9_n13839UsurTknCrd,
            BC002M9_A13840UsurTknVto, BC002M9_n13840UsurTknVto, BC002M9_A14415UsurPrint, BC002M9_n14415UsurPrint, BC002M9_A14487UsurSockt, BC002M9_n14487UsurSockt
            }
            , new Object[] {
            BC002M10_A850UsurCod, BC002M10_A14371UsurGuid, BC002M10_n14371UsurGuid, BC002M10_A854UsurNom, BC002M10_n854UsurNom, BC002M10_A855UsurPwd, BC002M10_n855UsurPwd, BC002M10_A851UsurFec, BC002M10_n851UsurFec, BC002M10_A10513UsuMail,
            BC002M10_A10713UsuMailP, BC002M10_n10713UsuMailP, BC002M10_A10714UsuMailU, BC002M10_n10714UsuMailU, BC002M10_A13837UsurCmbPwd, BC002M10_n13837UsurCmbPwd, BC002M10_A13838UsurTkn, BC002M10_n13838UsurTkn, BC002M10_A13839UsurTknCrd, BC002M10_n13839UsurTknCrd,
            BC002M10_A13840UsurTknVto, BC002M10_n13840UsurTknVto, BC002M10_A14415UsurPrint, BC002M10_n14415UsurPrint, BC002M10_A14487UsurSockt, BC002M10_n14487UsurSockt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC002M14_A850UsurCod, BC002M14_A5159EmprCodU
            }
            , new Object[] {
            BC002M15_A850UsurCod, BC002M15_A14371UsurGuid, BC002M15_n14371UsurGuid, BC002M15_A854UsurNom, BC002M15_n854UsurNom, BC002M15_A855UsurPwd, BC002M15_n855UsurPwd, BC002M15_A851UsurFec, BC002M15_n851UsurFec, BC002M15_A10513UsuMail,
            BC002M15_A10713UsuMailP, BC002M15_n10713UsuMailP, BC002M15_A10714UsuMailU, BC002M15_n10714UsuMailU, BC002M15_A13837UsurCmbPwd, BC002M15_n13837UsurCmbPwd, BC002M15_A13838UsurTkn, BC002M15_n13838UsurTkn, BC002M15_A13839UsurTknCrd, BC002M15_n13839UsurTknCrd,
            BC002M15_A13840UsurTknVto, BC002M15_n13840UsurTknVto, BC002M15_A14415UsurPrint, BC002M15_n14415UsurPrint, BC002M15_A14487UsurSockt, BC002M15_n14487UsurSockt
            }
            , new Object[] {
            BC002M16_A850UsurCod, BC002M16_A944GrpTxt, BC002M16_n944GrpTxt, BC002M16_A952GrpPri, BC002M16_A943GrpId
            }
            , new Object[] {
            BC002M17_A944GrpTxt, BC002M17_n944GrpTxt
            }
            , new Object[] {
            BC002M18_A850UsurCod, BC002M18_A943GrpId
            }
            , new Object[] {
            BC002M19_A850UsurCod, BC002M19_A952GrpPri, BC002M19_A943GrpId
            }
            , new Object[] {
            BC002M20_A850UsurCod, BC002M20_A952GrpPri, BC002M20_A943GrpId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC002M24_A944GrpTxt, BC002M24_n944GrpTxt
            }
            , new Object[] {
            BC002M25_A850UsurCod, BC002M25_A944GrpTxt, BC002M25_n944GrpTxt, BC002M25_A952GrpPri, BC002M25_A943GrpId
            }
         }
      );
      Z14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      A14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      i14371UsurGuid = java.util.UUID.randomUUID( ) ;
      n14371UsurGuid = false ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e112M2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte Gxremove127 ;
   private byte Z952GrpPri ;
   private byte A952GrpPri ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nIsMod_127 ;
   private short RcdFound127 ;
   private short RcdFound110 ;
   private short nIsDirty_110 ;
   private short nRcdExists_127 ;
   private short nIsDirty_127 ;
   private int trnEnded ;
   private int nGXsfl_127_idx=1 ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z850UsurCod ;
   private String A850UsurCod ;
   private String sMode110 ;
   private String Z854UsurNom ;
   private String A854UsurNom ;
   private String Z855UsurPwd ;
   private String A855UsurPwd ;
   private String Z10513UsuMail ;
   private String A10513UsuMail ;
   private String Z944GrpTxt ;
   private String A944GrpTxt ;
   private String Z943GrpId ;
   private String A943GrpId ;
   private String sMode127 ;
   private java.util.Date Z13839UsurTknCrd ;
   private java.util.Date A13839UsurTknCrd ;
   private java.util.Date Z13840UsurTknVto ;
   private java.util.Date A13840UsurTknVto ;
   private java.util.Date Z851UsurFec ;
   private java.util.Date A851UsurFec ;
   private boolean returnInSub ;
   private boolean Z13837UsurCmbPwd ;
   private boolean A13837UsurCmbPwd ;
   private boolean n14371UsurGuid ;
   private boolean n854UsurNom ;
   private boolean n855UsurPwd ;
   private boolean n851UsurFec ;
   private boolean n10713UsuMailP ;
   private boolean n10714UsuMailU ;
   private boolean n13837UsurCmbPwd ;
   private boolean n13838UsurTkn ;
   private boolean n13839UsurTknCrd ;
   private boolean n13840UsurTknVto ;
   private boolean n14415UsurPrint ;
   private boolean n14487UsurSockt ;
   private boolean Gx_longc ;
   private boolean n944GrpTxt ;
   private boolean mustCommit ;
   private String Z10713UsuMailP ;
   private String A10713UsuMailP ;
   private String Z10714UsuMailU ;
   private String A10714UsuMailU ;
   private String Z13838UsurTkn ;
   private String A13838UsurTkn ;
   private String Z14415UsurPrint ;
   private String A14415UsurPrint ;
   private String Z14487UsurSockt ;
   private String A14487UsurSockt ;
   private java.util.UUID Z14371UsurGuid ;
   private java.util.UUID A14371UsurGuid ;
   private java.util.UUID i14371UsurGuid ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.SdtTUSUARI bcTUSUARI ;
   private IDataStoreProvider pr_default ;
   private String[] BC002M7_A850UsurCod ;
   private java.util.UUID[] BC002M7_A14371UsurGuid ;
   private boolean[] BC002M7_n14371UsurGuid ;
   private String[] BC002M7_A854UsurNom ;
   private boolean[] BC002M7_n854UsurNom ;
   private String[] BC002M7_A855UsurPwd ;
   private boolean[] BC002M7_n855UsurPwd ;
   private java.util.Date[] BC002M7_A851UsurFec ;
   private boolean[] BC002M7_n851UsurFec ;
   private String[] BC002M7_A10513UsuMail ;
   private String[] BC002M7_A10713UsuMailP ;
   private boolean[] BC002M7_n10713UsuMailP ;
   private String[] BC002M7_A10714UsuMailU ;
   private boolean[] BC002M7_n10714UsuMailU ;
   private boolean[] BC002M7_A13837UsurCmbPwd ;
   private boolean[] BC002M7_n13837UsurCmbPwd ;
   private String[] BC002M7_A13838UsurTkn ;
   private boolean[] BC002M7_n13838UsurTkn ;
   private java.util.Date[] BC002M7_A13839UsurTknCrd ;
   private boolean[] BC002M7_n13839UsurTknCrd ;
   private java.util.Date[] BC002M7_A13840UsurTknVto ;
   private boolean[] BC002M7_n13840UsurTknVto ;
   private String[] BC002M7_A14415UsurPrint ;
   private boolean[] BC002M7_n14415UsurPrint ;
   private String[] BC002M7_A14487UsurSockt ;
   private boolean[] BC002M7_n14487UsurSockt ;
   private String[] BC002M8_A850UsurCod ;
   private String[] BC002M9_A850UsurCod ;
   private java.util.UUID[] BC002M9_A14371UsurGuid ;
   private boolean[] BC002M9_n14371UsurGuid ;
   private String[] BC002M9_A854UsurNom ;
   private boolean[] BC002M9_n854UsurNom ;
   private String[] BC002M9_A855UsurPwd ;
   private boolean[] BC002M9_n855UsurPwd ;
   private java.util.Date[] BC002M9_A851UsurFec ;
   private boolean[] BC002M9_n851UsurFec ;
   private String[] BC002M9_A10513UsuMail ;
   private String[] BC002M9_A10713UsuMailP ;
   private boolean[] BC002M9_n10713UsuMailP ;
   private String[] BC002M9_A10714UsuMailU ;
   private boolean[] BC002M9_n10714UsuMailU ;
   private boolean[] BC002M9_A13837UsurCmbPwd ;
   private boolean[] BC002M9_n13837UsurCmbPwd ;
   private String[] BC002M9_A13838UsurTkn ;
   private boolean[] BC002M9_n13838UsurTkn ;
   private java.util.Date[] BC002M9_A13839UsurTknCrd ;
   private boolean[] BC002M9_n13839UsurTknCrd ;
   private java.util.Date[] BC002M9_A13840UsurTknVto ;
   private boolean[] BC002M9_n13840UsurTknVto ;
   private String[] BC002M9_A14415UsurPrint ;
   private boolean[] BC002M9_n14415UsurPrint ;
   private String[] BC002M9_A14487UsurSockt ;
   private boolean[] BC002M9_n14487UsurSockt ;
   private String[] BC002M10_A850UsurCod ;
   private java.util.UUID[] BC002M10_A14371UsurGuid ;
   private boolean[] BC002M10_n14371UsurGuid ;
   private String[] BC002M10_A854UsurNom ;
   private boolean[] BC002M10_n854UsurNom ;
   private String[] BC002M10_A855UsurPwd ;
   private boolean[] BC002M10_n855UsurPwd ;
   private java.util.Date[] BC002M10_A851UsurFec ;
   private boolean[] BC002M10_n851UsurFec ;
   private String[] BC002M10_A10513UsuMail ;
   private String[] BC002M10_A10713UsuMailP ;
   private boolean[] BC002M10_n10713UsuMailP ;
   private String[] BC002M10_A10714UsuMailU ;
   private boolean[] BC002M10_n10714UsuMailU ;
   private boolean[] BC002M10_A13837UsurCmbPwd ;
   private boolean[] BC002M10_n13837UsurCmbPwd ;
   private String[] BC002M10_A13838UsurTkn ;
   private boolean[] BC002M10_n13838UsurTkn ;
   private java.util.Date[] BC002M10_A13839UsurTknCrd ;
   private boolean[] BC002M10_n13839UsurTknCrd ;
   private java.util.Date[] BC002M10_A13840UsurTknVto ;
   private boolean[] BC002M10_n13840UsurTknVto ;
   private String[] BC002M10_A14415UsurPrint ;
   private boolean[] BC002M10_n14415UsurPrint ;
   private String[] BC002M10_A14487UsurSockt ;
   private boolean[] BC002M10_n14487UsurSockt ;
   private String[] BC002M14_A850UsurCod ;
   private String[] BC002M14_A5159EmprCodU ;
   private String[] BC002M15_A850UsurCod ;
   private java.util.UUID[] BC002M15_A14371UsurGuid ;
   private boolean[] BC002M15_n14371UsurGuid ;
   private String[] BC002M15_A854UsurNom ;
   private boolean[] BC002M15_n854UsurNom ;
   private String[] BC002M15_A855UsurPwd ;
   private boolean[] BC002M15_n855UsurPwd ;
   private java.util.Date[] BC002M15_A851UsurFec ;
   private boolean[] BC002M15_n851UsurFec ;
   private String[] BC002M15_A10513UsuMail ;
   private String[] BC002M15_A10713UsuMailP ;
   private boolean[] BC002M15_n10713UsuMailP ;
   private String[] BC002M15_A10714UsuMailU ;
   private boolean[] BC002M15_n10714UsuMailU ;
   private boolean[] BC002M15_A13837UsurCmbPwd ;
   private boolean[] BC002M15_n13837UsurCmbPwd ;
   private String[] BC002M15_A13838UsurTkn ;
   private boolean[] BC002M15_n13838UsurTkn ;
   private java.util.Date[] BC002M15_A13839UsurTknCrd ;
   private boolean[] BC002M15_n13839UsurTknCrd ;
   private java.util.Date[] BC002M15_A13840UsurTknVto ;
   private boolean[] BC002M15_n13840UsurTknVto ;
   private String[] BC002M15_A14415UsurPrint ;
   private boolean[] BC002M15_n14415UsurPrint ;
   private String[] BC002M15_A14487UsurSockt ;
   private boolean[] BC002M15_n14487UsurSockt ;
   private String[] BC002M16_A850UsurCod ;
   private String[] BC002M16_A944GrpTxt ;
   private boolean[] BC002M16_n944GrpTxt ;
   private byte[] BC002M16_A952GrpPri ;
   private String[] BC002M16_A943GrpId ;
   private String[] BC002M17_A944GrpTxt ;
   private boolean[] BC002M17_n944GrpTxt ;
   private String[] BC002M18_A850UsurCod ;
   private String[] BC002M18_A943GrpId ;
   private String[] BC002M19_A850UsurCod ;
   private byte[] BC002M19_A952GrpPri ;
   private String[] BC002M19_A943GrpId ;
   private String[] BC002M20_A850UsurCod ;
   private byte[] BC002M20_A952GrpPri ;
   private String[] BC002M20_A943GrpId ;
   private String[] BC002M24_A944GrpTxt ;
   private boolean[] BC002M24_n944GrpTxt ;
   private String[] BC002M25_A850UsurCod ;
   private String[] BC002M25_A944GrpTxt ;
   private boolean[] BC002M25_n944GrpTxt ;
   private byte[] BC002M25_A952GrpPri ;
   private String[] BC002M25_A943GrpId ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC002M2_A850UsurCod ;
   private byte[] BC002M2_A952GrpPri ;
   private String[] BC002M2_A943GrpId ;
   private String[] BC002M3_A850UsurCod ;
   private byte[] BC002M3_A952GrpPri ;
   private String[] BC002M3_A943GrpId ;
   private String[] BC002M4_A944GrpTxt ;
   private String[] BC002M5_A850UsurCod ;
   private java.util.UUID[] BC002M5_A14371UsurGuid ;
   private String[] BC002M5_A854UsurNom ;
   private String[] BC002M5_A855UsurPwd ;
   private java.util.Date[] BC002M5_A851UsurFec ;
   private String[] BC002M5_A10513UsuMail ;
   private String[] BC002M5_A10713UsuMailP ;
   private String[] BC002M5_A10714UsuMailU ;
   private boolean[] BC002M5_A13837UsurCmbPwd ;
   private String[] BC002M5_A13838UsurTkn ;
   private java.util.Date[] BC002M5_A13839UsurTknCrd ;
   private java.util.Date[] BC002M5_A13840UsurTknVto ;
   private String[] BC002M5_A14415UsurPrint ;
   private String[] BC002M5_A14487UsurSockt ;
   private String[] BC002M6_A850UsurCod ;
   private java.util.UUID[] BC002M6_A14371UsurGuid ;
   private String[] BC002M6_A854UsurNom ;
   private String[] BC002M6_A855UsurPwd ;
   private java.util.Date[] BC002M6_A851UsurFec ;
   private String[] BC002M6_A10513UsuMail ;
   private String[] BC002M6_A10713UsuMailP ;
   private String[] BC002M6_A10714UsuMailU ;
   private boolean[] BC002M6_A13837UsurCmbPwd ;
   private String[] BC002M6_A13838UsurTkn ;
   private java.util.Date[] BC002M6_A13839UsurTknCrd ;
   private java.util.Date[] BC002M6_A13840UsurTknVto ;
   private String[] BC002M6_A14415UsurPrint ;
   private String[] BC002M6_A14487UsurSockt ;
   private boolean[] BC002M4_n944GrpTxt ;
   private boolean[] BC002M5_n14371UsurGuid ;
   private boolean[] BC002M5_n854UsurNom ;
   private boolean[] BC002M5_n855UsurPwd ;
   private boolean[] BC002M5_n851UsurFec ;
   private boolean[] BC002M5_n10713UsuMailP ;
   private boolean[] BC002M5_n10714UsuMailU ;
   private boolean[] BC002M5_n13837UsurCmbPwd ;
   private boolean[] BC002M5_n13838UsurTkn ;
   private boolean[] BC002M5_n13839UsurTknCrd ;
   private boolean[] BC002M5_n13840UsurTknVto ;
   private boolean[] BC002M5_n14415UsurPrint ;
   private boolean[] BC002M5_n14487UsurSockt ;
   private boolean[] BC002M6_n14371UsurGuid ;
   private boolean[] BC002M6_n854UsurNom ;
   private boolean[] BC002M6_n855UsurPwd ;
   private boolean[] BC002M6_n851UsurFec ;
   private boolean[] BC002M6_n10713UsuMailP ;
   private boolean[] BC002M6_n10714UsuMailU ;
   private boolean[] BC002M6_n13837UsurCmbPwd ;
   private boolean[] BC002M6_n13838UsurTkn ;
   private boolean[] BC002M6_n13839UsurTknCrd ;
   private boolean[] BC002M6_n13840UsurTknVto ;
   private boolean[] BC002M6_n14415UsurPrint ;
   private boolean[] BC002M6_n14487UsurSockt ;
}

final  class tusuari_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tusuari_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tusuari_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tusuari_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC002M2", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ?  FOR UPDATE OF GrpPri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M3", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M4", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M5", "SELECT UsurCod, UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt FROM TXPUSUARI WHERE UsurCod = ?  FOR UPDATE OF UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M6", "SELECT UsurCod, UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt FROM TXPUSUARI WHERE UsurCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M7", "SELECT /*+ FIRST_ROWS(100) */ TM1.UsurCod, TM1.UsurGuid, TM1.UsurNom, TM1.UsurPwd, TM1.UsurFec, TM1.UsuMail, TM1.UsuMailP, TM1.UsuMailU, TM1.UsurCmbPwd, TM1.UsurTkn, TM1.UsurTknCrd, TM1.UsurTknVto, TM1.UsurPrint, TM1.UsurSockt FROM TXPUSUARI TM1 WHERE TM1.UsurCod = ? ORDER BY TM1.UsurCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M8", "SELECT /*+ FIRST_ROWS(1) */ UsurCod FROM TXPUSUARI WHERE UsurCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M9", "SELECT UsurCod, UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt FROM TXPUSUARI WHERE UsurCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M10", "SELECT UsurCod, UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt FROM TXPUSUARI WHERE UsurCod = ?  FOR UPDATE OF UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC002M11", "INSERT INTO TXPUSUARI(UsurCod, UsurGuid, UsurNom, UsurPwd, UsurFec, UsuMail, UsuMailP, UsuMailU, UsurCmbPwd, UsurTkn, UsurTknCrd, UsurTknVto, UsurPrint, UsurSockt, UsurTpo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPUSUARI")
         ,new UpdateCursor("BC002M12", "UPDATE TXPUSUARI SET UsurGuid=?, UsurNom=?, UsurPwd=?, UsurFec=?, UsuMail=?, UsuMailP=?, UsuMailU=?, UsurCmbPwd=?, UsurTkn=?, UsurTknCrd=?, UsurTknVto=?, UsurPrint=?, UsurSockt=?  WHERE UsurCod = ?", GX_NOMASK, "TXPUSUARI")
         ,new UpdateCursor("BC002M13", "DELETE FROM TXPUSUARI  WHERE UsurCod = ?", GX_NOMASK, "TXPUSUARI")
         ,new ForEachCursor("BC002M14", "SELECT * FROM (SELECT UsurCod, EmprCodU FROM TXPUSUEMP WHERE UsurCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002M15", "SELECT /*+ FIRST_ROWS(100) */ TM1.UsurCod, TM1.UsurGuid, TM1.UsurNom, TM1.UsurPwd, TM1.UsurFec, TM1.UsuMail, TM1.UsuMailP, TM1.UsuMailU, TM1.UsurCmbPwd, TM1.UsurTkn, TM1.UsurTknCrd, TM1.UsurTknVto, TM1.UsurPrint, TM1.UsurSockt FROM TXPUSUARI TM1 WHERE TM1.UsurCod = ? ORDER BY TM1.UsurCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M16", "SELECT /*+ FIRST_ROWS(11) */ T1.UsurCod, T2.GrpTxt, T1.GrpPri, T1.GrpId FROM (TXPUSUGRP T1 INNER JOIN TXPGRUPOS T2 ON T2.GrpId = T1.GrpId) WHERE T1.UsurCod = ? and T1.GrpId = ? ORDER BY T1.UsurCod, T1.GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M17", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M18", "SELECT /*+ FIRST_ROWS(1) */ UsurCod, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M19", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M20", "SELECT UsurCod, GrpPri, GrpId FROM TXPUSUGRP WHERE UsurCod = ? AND GrpId = ?  FOR UPDATE OF GrpPri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC002M21", "INSERT INTO TXPUSUGRP(UsurCod, GrpPri, GrpId) VALUES(?, ?, ?)", GX_NOMASK, "TXPUSUGRP")
         ,new UpdateCursor("BC002M22", "UPDATE TXPUSUGRP SET GrpPri=?  WHERE UsurCod = ? AND GrpId = ?", GX_NOMASK, "TXPUSUGRP")
         ,new UpdateCursor("BC002M23", "DELETE FROM TXPUSUGRP  WHERE UsurCod = ? AND GrpId = ?", GX_NOMASK, "TXPUSUGRP")
         ,new ForEachCursor("BC002M24", "SELECT GrpTxt FROM TXPGRUPOS WHERE GrpId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002M25", "SELECT /*+ FIRST_ROWS(11) */ T1.UsurCod, T2.GrpTxt, T1.GrpPri, T1.GrpId FROM (TXPUSUGRP T1 INNER JOIN TXPGRUPOS T2 ON T2.GrpId = T1.GrpId) WHERE T1.UsurCod = ? ORDER BY T1.UsurCod, T1.GrpId ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((String[]) buf[10])[0] = rslt.getVarchar(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((boolean[]) buf[14])[0] = rslt.getBoolean(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 10);
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGUID(2, (java.util.UUID)parms[2]);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 35);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               stmt.setString(6, (String)parms[9], 40);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(9, ((Boolean) parms[15]).booleanValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 100);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 150);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[25], 100);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setGUID(1, (java.util.UUID)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 35);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               stmt.setString(5, (String)parms[8], 40);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 200);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 200);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.BIT );
               }
               else
               {
                  stmt.setBoolean(8, ((Boolean) parms[14]).booleanValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 150);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 100);
               }
               stmt.setString(14, (String)parms[25], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 20 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 10);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

