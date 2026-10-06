package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipart_bc extends GXWebPanel implements IGxSilentTrn
{
   public ttipart_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipart_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipart_bc.class ));
   }

   public ttipart_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow2C100( ) ;
      standaloneNotModal( ) ;
      initializeNonKey2C100( ) ;
      standaloneModal( ) ;
      addRow2C100( ) ;
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
         e112C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z829TipArtCod = A829TipArtCod ;
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

   public void confirm_2C0( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2C100( ) ;
         }
         else
         {
            checkExtendedTable2C100( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors2C100( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e122C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipart_bc.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipart_bc.this.A396EmprCod = GXv_char2[0] ;
      ttipart_bc.this.AV16EmprNom = GXv_char3[0] ;
      ttipart_bc.this.AV17UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV52autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttipart_bc.this.GXt_int5 = GXv_int6[0] ;
      AV52autonumber = GXt_int5 ;
      GXt_int5 = AV28Reg000 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      ttipart_bc.this.GXt_int5 = GXv_int6[0] ;
      AV28Reg000 = GXt_int5 ;
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipart_bc.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      GXv_char4[0] = AV46EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipart_bc.this.AV46EmprCod = GXv_char4[0] ;
      ttipart_bc.this.AV16EmprNom = GXv_char3[0] ;
      ttipart_bc.this.AV17UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext7[0] = AV48WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV48WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV49TrnContext.fromxml(AV50WebSession.getValue("TrnContext"), null, null);
   }

   public void e112C2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm2C100( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         Z8713TipArtEst = A8713TipArtEst ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z6014TipArtDsc2 = A6014TipArtDsc2 ;
         Z4608TipArtClas = A4608TipArtClas ;
         Z5250TipArtCtb = A5250TipArtCtb ;
         Z7078TipArtProd = A7078TipArtProd ;
         Z7376TipArtDias = A7376TipArtDias ;
         Z11044TipArtOrd = A11044TipArtOrd ;
         Z14361TipArtAct = A14361TipArtAct ;
         Z13788TipArtCodD = A13788TipArtCodD ;
         Z14008ID_TipArtD = A14008ID_TipArtD ;
      }
      if ( GX_JID == -7 )
      {
         Z829TipArtCod = A829TipArtCod ;
         Z8713TipArtEst = A8713TipArtEst ;
         Z830TipArtDsc = A830TipArtDsc ;
         Z6014TipArtDsc2 = A6014TipArtDsc2 ;
         Z4608TipArtClas = A4608TipArtClas ;
         Z5250TipArtCtb = A5250TipArtCtb ;
         Z7078TipArtProd = A7078TipArtProd ;
         Z7376TipArtDias = A7376TipArtDias ;
         Z11044TipArtOrd = A11044TipArtOrd ;
         Z14361TipArtAct = A14361TipArtAct ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A14361TipArtAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A14361TipArtAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
   }

   public void load2C100( )
   {
      /* Using cursor BC002C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A8713TipArtEst = BC002C4_A8713TipArtEst[0] ;
         n8713TipArtEst = BC002C4_n8713TipArtEst[0] ;
         A830TipArtDsc = BC002C4_A830TipArtDsc[0] ;
         n830TipArtDsc = BC002C4_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = BC002C4_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC002C4_n6014TipArtDsc2[0] ;
         A4608TipArtClas = BC002C4_A4608TipArtClas[0] ;
         n4608TipArtClas = BC002C4_n4608TipArtClas[0] ;
         A5250TipArtCtb = BC002C4_A5250TipArtCtb[0] ;
         n5250TipArtCtb = BC002C4_n5250TipArtCtb[0] ;
         A7078TipArtProd = BC002C4_A7078TipArtProd[0] ;
         n7078TipArtProd = BC002C4_n7078TipArtProd[0] ;
         A7376TipArtDias = BC002C4_A7376TipArtDias[0] ;
         n7376TipArtDias = BC002C4_n7376TipArtDias[0] ;
         A11044TipArtOrd = BC002C4_A11044TipArtOrd[0] ;
         n11044TipArtOrd = BC002C4_n11044TipArtOrd[0] ;
         A14361TipArtAct = BC002C4_A14361TipArtAct[0] ;
         zm2C100( -7) ;
      }
      pr_default.close(2);
      onLoadActions2C100( ) ;
   }

   public void onLoadActions2C100( )
   {
      A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
      A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
      if ( isIns( )  )
      {
         A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n8713TipArtEst = false ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) )
         {
            A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            n8713TipArtEst = false ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) )
            {
               A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               n8713TipArtEst = false ;
            }
         }
      }
   }

   public void checkExtendedTable2C100( )
   {
      nIsDirty_100 = (short)(0) ;
      standaloneModal( ) ;
      nIsDirty_100 = (short)(1) ;
      A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
      nIsDirty_100 = (short)(1) ;
      A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
      if ( isIns( )  )
      {
         nIsDirty_100 = (short)(1) ;
         A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n8713TipArtEst = false ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) )
         {
            nIsDirty_100 = (short)(1) ;
            A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
            n8713TipArtEst = false ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A8713TipArtEst, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) )
            {
               nIsDirty_100 = (short)(1) ;
               A8713TipArtEst = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               n8713TipArtEst = false ;
            }
         }
      }
   }

   public void closeExtendedTableCursors2C100( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2C100( )
   {
      /* Using cursor BC002C5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound100 = (short)(1) ;
      }
      else
      {
         RcdFound100 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC002C6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(BC002C6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm2C100( 7) ;
         RcdFound100 = (short)(1) ;
         A829TipArtCod = BC002C6_A829TipArtCod[0] ;
         n829TipArtCod = BC002C6_n829TipArtCod[0] ;
         A8713TipArtEst = BC002C6_A8713TipArtEst[0] ;
         n8713TipArtEst = BC002C6_n8713TipArtEst[0] ;
         A830TipArtDsc = BC002C6_A830TipArtDsc[0] ;
         n830TipArtDsc = BC002C6_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = BC002C6_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC002C6_n6014TipArtDsc2[0] ;
         A4608TipArtClas = BC002C6_A4608TipArtClas[0] ;
         n4608TipArtClas = BC002C6_n4608TipArtClas[0] ;
         A5250TipArtCtb = BC002C6_A5250TipArtCtb[0] ;
         n5250TipArtCtb = BC002C6_n5250TipArtCtb[0] ;
         A7078TipArtProd = BC002C6_A7078TipArtProd[0] ;
         n7078TipArtProd = BC002C6_n7078TipArtProd[0] ;
         A7376TipArtDias = BC002C6_A7376TipArtDias[0] ;
         n7376TipArtDias = BC002C6_n7376TipArtDias[0] ;
         A11044TipArtOrd = BC002C6_A11044TipArtOrd[0] ;
         n11044TipArtOrd = BC002C6_n11044TipArtOrd[0] ;
         A14361TipArtAct = BC002C6_A14361TipArtAct[0] ;
         Z396EmprCod = A396EmprCod ;
         Z829TipArtCod = A829TipArtCod ;
         sMode100 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load2C100( ) ;
         if ( AnyError == 1 )
         {
            RcdFound100 = (short)(0) ;
            initializeNonKey2C100( ) ;
         }
         Gx_mode = sMode100 ;
      }
      else
      {
         RcdFound100 = (short)(0) ;
         initializeNonKey2C100( ) ;
         sMode100 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode100 ;
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey2C100( ) ;
      if ( RcdFound100 == 0 )
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
      confirm_2C0( ) ;
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

   public void checkOptimisticConcurrency2C100( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC002C7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPART"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z8713TipArtEst, BC002C7_A8713TipArtEst[0]) != 0 ) || ( GXutil.strcmp(Z830TipArtDsc, BC002C7_A830TipArtDsc[0]) != 0 ) || ( GXutil.strcmp(Z6014TipArtDsc2, BC002C7_A6014TipArtDsc2[0]) != 0 ) || ( GXutil.strcmp(Z4608TipArtClas, BC002C7_A4608TipArtClas[0]) != 0 ) || ( Z5250TipArtCtb != BC002C7_A5250TipArtCtb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7078TipArtProd, BC002C7_A7078TipArtProd[0]) != 0 ) || ( Z7376TipArtDias != BC002C7_A7376TipArtDias[0] ) || ( Z11044TipArtOrd != BC002C7_A11044TipArtOrd[0] ) || ( GXutil.strcmp(Z14361TipArtAct, BC002C7_A14361TipArtAct[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPART"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2C100( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2C100( 0) ;
         checkOptimisticConcurrency2C100( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2C100( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2C100( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002C8 */
                  pr_default.execute(6, new Object[] {Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod), Boolean.valueOf(n8713TipArtEst), A8713TipArtEst, Boolean.valueOf(n830TipArtDsc), A830TipArtDsc, Boolean.valueOf(n6014TipArtDsc2), A6014TipArtDsc2, Boolean.valueOf(n4608TipArtClas), A4608TipArtClas, Boolean.valueOf(n5250TipArtCtb), Byte.valueOf(A5250TipArtCtb), Boolean.valueOf(n7078TipArtProd), A7078TipArtProd, Boolean.valueOf(n7376TipArtDias), Short.valueOf(A7376TipArtDias), Boolean.valueOf(n11044TipArtOrd), Short.valueOf(A11044TipArtOrd), A14361TipArtAct, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
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
            load2C100( ) ;
         }
         endLevel2C100( ) ;
      }
      closeExtendedTableCursors2C100( ) ;
   }

   public void update2C100( )
   {
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2C100( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2C100( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2C100( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002C9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n8713TipArtEst), A8713TipArtEst, Boolean.valueOf(n830TipArtDsc), A830TipArtDsc, Boolean.valueOf(n6014TipArtDsc2), A6014TipArtDsc2, Boolean.valueOf(n4608TipArtClas), A4608TipArtClas, Boolean.valueOf(n5250TipArtCtb), Byte.valueOf(A5250TipArtCtb), Boolean.valueOf(n7078TipArtProd), A7078TipArtProd, Boolean.valueOf(n7376TipArtDias), Short.valueOf(A7376TipArtDias), Boolean.valueOf(n11044TipArtOrd), Short.valueOf(A11044TipArtOrd), A14361TipArtAct, A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPART"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2C100( ) ;
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
         endLevel2C100( ) ;
      }
      closeExtendedTableCursors2C100( ) ;
   }

   public void deferredUpdate2C100( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate2C100( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2C100( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2C100( ) ;
         afterConfirm2C100( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2C100( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC002C10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPART");
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
      sMode100 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel2C100( ) ;
      Gx_mode = sMode100 ;
   }

   public void onDeleteControls2C100( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14008ID_TipArtD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) ;
         A13788TipArtCodD = GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) + "-" + GXutil.trim( A830TipArtDsc) + " " + GXutil.trim( A6014TipArtDsc2) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC002C11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARINT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC002C12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TAREST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC002C13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC002C14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPARC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC002C15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC002C16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor BC002C17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC002C18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor BC002C19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor BC002C20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor BC002C21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void endLevel2C100( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2C100( ) ;
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

   public void scanKeyStart2C100( )
   {
      /* Scan By routine */
      /* Using cursor BC002C22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n829TipArtCod), Short.valueOf(A829TipArtCod)});
      RcdFound100 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A829TipArtCod = BC002C22_A829TipArtCod[0] ;
         n829TipArtCod = BC002C22_n829TipArtCod[0] ;
         A8713TipArtEst = BC002C22_A8713TipArtEst[0] ;
         n8713TipArtEst = BC002C22_n8713TipArtEst[0] ;
         A830TipArtDsc = BC002C22_A830TipArtDsc[0] ;
         n830TipArtDsc = BC002C22_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = BC002C22_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC002C22_n6014TipArtDsc2[0] ;
         A4608TipArtClas = BC002C22_A4608TipArtClas[0] ;
         n4608TipArtClas = BC002C22_n4608TipArtClas[0] ;
         A5250TipArtCtb = BC002C22_A5250TipArtCtb[0] ;
         n5250TipArtCtb = BC002C22_n5250TipArtCtb[0] ;
         A7078TipArtProd = BC002C22_A7078TipArtProd[0] ;
         n7078TipArtProd = BC002C22_n7078TipArtProd[0] ;
         A7376TipArtDias = BC002C22_A7376TipArtDias[0] ;
         n7376TipArtDias = BC002C22_n7376TipArtDias[0] ;
         A11044TipArtOrd = BC002C22_A11044TipArtOrd[0] ;
         n11044TipArtOrd = BC002C22_n11044TipArtOrd[0] ;
         A14361TipArtAct = BC002C22_A14361TipArtAct[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext2C100( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound100 = (short)(0) ;
      scanKeyLoad2C100( ) ;
   }

   public void scanKeyLoad2C100( )
   {
      sMode100 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound100 = (short)(1) ;
         A829TipArtCod = BC002C22_A829TipArtCod[0] ;
         n829TipArtCod = BC002C22_n829TipArtCod[0] ;
         A8713TipArtEst = BC002C22_A8713TipArtEst[0] ;
         n8713TipArtEst = BC002C22_n8713TipArtEst[0] ;
         A830TipArtDsc = BC002C22_A830TipArtDsc[0] ;
         n830TipArtDsc = BC002C22_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = BC002C22_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = BC002C22_n6014TipArtDsc2[0] ;
         A4608TipArtClas = BC002C22_A4608TipArtClas[0] ;
         n4608TipArtClas = BC002C22_n4608TipArtClas[0] ;
         A5250TipArtCtb = BC002C22_A5250TipArtCtb[0] ;
         n5250TipArtCtb = BC002C22_n5250TipArtCtb[0] ;
         A7078TipArtProd = BC002C22_A7078TipArtProd[0] ;
         n7078TipArtProd = BC002C22_n7078TipArtProd[0] ;
         A7376TipArtDias = BC002C22_A7376TipArtDias[0] ;
         n7376TipArtDias = BC002C22_n7376TipArtDias[0] ;
         A11044TipArtOrd = BC002C22_A11044TipArtOrd[0] ;
         n11044TipArtOrd = BC002C22_n11044TipArtOrd[0] ;
         A14361TipArtAct = BC002C22_A14361TipArtAct[0] ;
      }
      Gx_mode = sMode100 ;
   }

   public void scanKeyEnd2C100( )
   {
      pr_default.close(20);
   }

   public void afterConfirm2C100( )
   {
      /* After Confirm Rules */
      if ( (0==A829TipArtCod) && (0==AV52autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert2C100( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A829TipArtCod) && ( AV52autonumber == 1 ) )
      {
         GXt_int8 = A829TipArtCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttipart_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttipart_bc.this.GXt_int8 = GXv_int9[0] ;
         A829TipArtCod = GXt_int8 ;
         n829TipArtCod = false ;
      }
   }

   public void beforeUpdate2C100( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2C100( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2C100( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2C100( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2C100( )
   {
   }

   public void send_integrity_lvl_hashes2C100( )
   {
   }

   public void addRow2C100( )
   {
      VarsToRow100( bcTTIPART) ;
   }

   public void readRow2C100( )
   {
      RowToVars100( bcTTIPART, 1) ;
   }

   public void initializeNonKey2C100( )
   {
      A8713TipArtEst = "" ;
      n8713TipArtEst = false ;
      A13788TipArtCodD = "" ;
      A14008ID_TipArtD = "" ;
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      A6014TipArtDsc2 = "" ;
      n6014TipArtDsc2 = false ;
      A4608TipArtClas = "" ;
      n4608TipArtClas = false ;
      A5250TipArtCtb = (byte)(0) ;
      n5250TipArtCtb = false ;
      A7078TipArtProd = DecimalUtil.ZERO ;
      n7078TipArtProd = false ;
      A7376TipArtDias = (short)(0) ;
      n7376TipArtDias = false ;
      A11044TipArtOrd = (short)(0) ;
      n11044TipArtOrd = false ;
      A14361TipArtAct = httpContext.getMessage( "S", "") ;
      Z8713TipArtEst = "" ;
      Z830TipArtDsc = "" ;
      Z6014TipArtDsc2 = "" ;
      Z4608TipArtClas = "" ;
      Z5250TipArtCtb = (byte)(0) ;
      Z7078TipArtProd = DecimalUtil.ZERO ;
      Z7376TipArtDias = (short)(0) ;
      Z11044TipArtOrd = (short)(0) ;
      Z14361TipArtAct = "" ;
   }

   public void initAll2C100( )
   {
      A829TipArtCod = (short)(0) ;
      n829TipArtCod = false ;
      initializeNonKey2C100( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14361TipArtAct = i14361TipArtAct ;
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

   public void VarsToRow100( app.SdtTTIPART obj100 )
   {
      obj100.setgxTv_SdtTTIPART_Mode( Gx_mode );
      obj100.setgxTv_SdtTTIPART_Emprcod( A396EmprCod );
      obj100.setgxTv_SdtTTIPART_Tipartest( A8713TipArtEst );
      obj100.setgxTv_SdtTTIPART_Tipartcoddsc( A13788TipArtCodD );
      obj100.setgxTv_SdtTTIPART_Id_tipartdsc( A14008ID_TipArtD );
      obj100.setgxTv_SdtTTIPART_Tipartdsc( A830TipArtDsc );
      obj100.setgxTv_SdtTTIPART_Tipartdsc2( A6014TipArtDsc2 );
      obj100.setgxTv_SdtTTIPART_Tipartclas( A4608TipArtClas );
      obj100.setgxTv_SdtTTIPART_Tipartctb( A5250TipArtCtb );
      obj100.setgxTv_SdtTTIPART_Tipartprod( A7078TipArtProd );
      obj100.setgxTv_SdtTTIPART_Tipartdias( A7376TipArtDias );
      obj100.setgxTv_SdtTTIPART_Tipartord( A11044TipArtOrd );
      obj100.setgxTv_SdtTTIPART_Tipartact( A14361TipArtAct );
      obj100.setgxTv_SdtTTIPART_Emprcod( A396EmprCod );
      obj100.setgxTv_SdtTTIPART_Tipartcod( A829TipArtCod );
      obj100.setgxTv_SdtTTIPART_Emprcod_Z( Z396EmprCod );
      obj100.setgxTv_SdtTTIPART_Tipartcod_Z( Z829TipArtCod );
      obj100.setgxTv_SdtTTIPART_Tipartdsc_Z( Z830TipArtDsc );
      obj100.setgxTv_SdtTTIPART_Tipartdsc2_Z( Z6014TipArtDsc2 );
      obj100.setgxTv_SdtTTIPART_Tipartclas_Z( Z4608TipArtClas );
      obj100.setgxTv_SdtTTIPART_Tipartctb_Z( Z5250TipArtCtb );
      obj100.setgxTv_SdtTTIPART_Tipartprod_Z( Z7078TipArtProd );
      obj100.setgxTv_SdtTTIPART_Tipartdias_Z( Z7376TipArtDias );
      obj100.setgxTv_SdtTTIPART_Tipartest_Z( Z8713TipArtEst );
      obj100.setgxTv_SdtTTIPART_Tipartord_Z( Z11044TipArtOrd );
      obj100.setgxTv_SdtTTIPART_Tipartact_Z( Z14361TipArtAct );
      obj100.setgxTv_SdtTTIPART_Tipartcoddsc_Z( Z13788TipArtCodD );
      obj100.setgxTv_SdtTTIPART_Id_tipartdsc_Z( Z14008ID_TipArtD );
      obj100.setgxTv_SdtTTIPART_Tipartcod_N( (byte)((byte)((n829TipArtCod)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartdsc_N( (byte)((byte)((n830TipArtDsc)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartdsc2_N( (byte)((byte)((n6014TipArtDsc2)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartclas_N( (byte)((byte)((n4608TipArtClas)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartctb_N( (byte)((byte)((n5250TipArtCtb)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartprod_N( (byte)((byte)((n7078TipArtProd)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartdias_N( (byte)((byte)((n7376TipArtDias)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartest_N( (byte)((byte)((n8713TipArtEst)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Tipartord_N( (byte)((byte)((n11044TipArtOrd)?1:0)) );
      obj100.setgxTv_SdtTTIPART_Mode( Gx_mode );
   }

   public void KeyVarsToRow100( app.SdtTTIPART obj100 )
   {
      obj100.setgxTv_SdtTTIPART_Emprcod( A396EmprCod );
      obj100.setgxTv_SdtTTIPART_Tipartcod( A829TipArtCod );
   }

   public void RowToVars100( app.SdtTTIPART obj100 ,
                             int forceLoad )
   {
      Gx_mode = obj100.getgxTv_SdtTTIPART_Mode() ;
      A396EmprCod = obj100.getgxTv_SdtTTIPART_Emprcod() ;
      A8713TipArtEst = obj100.getgxTv_SdtTTIPART_Tipartest() ;
      n8713TipArtEst = false ;
      A13788TipArtCodD = obj100.getgxTv_SdtTTIPART_Tipartcoddsc() ;
      A14008ID_TipArtD = obj100.getgxTv_SdtTTIPART_Id_tipartdsc() ;
      A830TipArtDsc = obj100.getgxTv_SdtTTIPART_Tipartdsc() ;
      n830TipArtDsc = false ;
      A6014TipArtDsc2 = obj100.getgxTv_SdtTTIPART_Tipartdsc2() ;
      n6014TipArtDsc2 = false ;
      A4608TipArtClas = obj100.getgxTv_SdtTTIPART_Tipartclas() ;
      n4608TipArtClas = false ;
      A5250TipArtCtb = obj100.getgxTv_SdtTTIPART_Tipartctb() ;
      n5250TipArtCtb = false ;
      A7078TipArtProd = obj100.getgxTv_SdtTTIPART_Tipartprod() ;
      n7078TipArtProd = false ;
      A7376TipArtDias = obj100.getgxTv_SdtTTIPART_Tipartdias() ;
      n7376TipArtDias = false ;
      A11044TipArtOrd = obj100.getgxTv_SdtTTIPART_Tipartord() ;
      n11044TipArtOrd = false ;
      A14361TipArtAct = obj100.getgxTv_SdtTTIPART_Tipartact() ;
      A396EmprCod = obj100.getgxTv_SdtTTIPART_Emprcod() ;
      A829TipArtCod = obj100.getgxTv_SdtTTIPART_Tipartcod() ;
      n829TipArtCod = false ;
      Z396EmprCod = obj100.getgxTv_SdtTTIPART_Emprcod_Z() ;
      Z829TipArtCod = obj100.getgxTv_SdtTTIPART_Tipartcod_Z() ;
      Z830TipArtDsc = obj100.getgxTv_SdtTTIPART_Tipartdsc_Z() ;
      Z6014TipArtDsc2 = obj100.getgxTv_SdtTTIPART_Tipartdsc2_Z() ;
      Z4608TipArtClas = obj100.getgxTv_SdtTTIPART_Tipartclas_Z() ;
      Z5250TipArtCtb = obj100.getgxTv_SdtTTIPART_Tipartctb_Z() ;
      Z7078TipArtProd = obj100.getgxTv_SdtTTIPART_Tipartprod_Z() ;
      Z7376TipArtDias = obj100.getgxTv_SdtTTIPART_Tipartdias_Z() ;
      Z8713TipArtEst = obj100.getgxTv_SdtTTIPART_Tipartest_Z() ;
      Z11044TipArtOrd = obj100.getgxTv_SdtTTIPART_Tipartord_Z() ;
      Z14361TipArtAct = obj100.getgxTv_SdtTTIPART_Tipartact_Z() ;
      Z13788TipArtCodD = obj100.getgxTv_SdtTTIPART_Tipartcoddsc_Z() ;
      Z14008ID_TipArtD = obj100.getgxTv_SdtTTIPART_Id_tipartdsc_Z() ;
      n829TipArtCod = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartcod_N()==0)?false:true) ;
      n830TipArtDsc = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartdsc_N()==0)?false:true) ;
      n6014TipArtDsc2 = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartdsc2_N()==0)?false:true) ;
      n4608TipArtClas = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartclas_N()==0)?false:true) ;
      n5250TipArtCtb = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartctb_N()==0)?false:true) ;
      n7078TipArtProd = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartprod_N()==0)?false:true) ;
      n7376TipArtDias = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartdias_N()==0)?false:true) ;
      n8713TipArtEst = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartest_N()==0)?false:true) ;
      n11044TipArtOrd = (boolean)((obj100.getgxTv_SdtTTIPART_Tipartord_N()==0)?false:true) ;
      Gx_mode = obj100.getgxTv_SdtTTIPART_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A829TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      n829TipArtCod = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey2C100( ) ;
      scanKeyStart2C100( ) ;
      if ( RcdFound100 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z829TipArtCod = A829TipArtCod ;
      }
      zm2C100( -7) ;
      onLoadActions2C100( ) ;
      addRow2C100( ) ;
      scanKeyEnd2C100( ) ;
      if ( RcdFound100 == 0 )
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
      RowToVars100( bcTTIPART, 0) ;
      scanKeyStart2C100( ) ;
      if ( RcdFound100 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z829TipArtCod = A829TipArtCod ;
      }
      zm2C100( -7) ;
      onLoadActions2C100( ) ;
      addRow2C100( ) ;
      scanKeyEnd2C100( ) ;
      if ( RcdFound100 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2C100( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert2C100( ) ;
      }
      else
      {
         if ( RcdFound100 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
            {
               A829TipArtCod = Z829TipArtCod ;
               n829TipArtCod = false ;
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
               update2C100( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
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
                     insert2C100( ) ;
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
                     insert2C100( ) ;
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
      RowToVars100( bcTTIPART, 1) ;
      saveImpl( ) ;
      VarsToRow100( bcTTIPART) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars100( bcTTIPART, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2C100( ) ;
      afterTrn( ) ;
      VarsToRow100( bcTTIPART) ;
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
         app.SdtTTIPART auxBC = new app.SdtTTIPART( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A829TipArtCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTTIPART);
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
      RowToVars100( bcTTIPART, 1) ;
      updateImpl( ) ;
      VarsToRow100( bcTTIPART) ;
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
      RowToVars100( bcTTIPART, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2C100( ) ;
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
      VarsToRow100( bcTTIPART) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars100( bcTTIPART, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey2C100( ) ;
      if ( RcdFound100 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
         {
            A829TipArtCod = Z829TipArtCod ;
            n829TipArtCod = false ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A829TipArtCod != Z829TipArtCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttipart_bc");
      VarsToRow100( bcTTIPART) ;
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
      Gx_mode = bcTTIPART.getgxTv_SdtTTIPART_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTTIPART.setgxTv_SdtTTIPART_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTTIPART sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTTIPART )
      {
         bcTTIPART = sdt ;
         if ( GXutil.strcmp(bcTTIPART.getgxTv_SdtTTIPART_Mode(), "") == 0 )
         {
            bcTTIPART.setgxTv_SdtTTIPART_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow100( bcTTIPART) ;
         }
         else
         {
            RowToVars100( bcTTIPART, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTTIPART.getgxTv_SdtTTIPART_Mode(), "") == 0 )
         {
            bcTTIPART.setgxTv_SdtTTIPART_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars100( bcTTIPART, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTTIPART getTTIPART_BC( )
   {
      return bcTTIPART ;
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
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      AV46EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV48WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV50WebSession = httpContext.getWebSession();
      Z8713TipArtEst = "" ;
      A8713TipArtEst = "" ;
      Z830TipArtDsc = "" ;
      A830TipArtDsc = "" ;
      Z6014TipArtDsc2 = "" ;
      A6014TipArtDsc2 = "" ;
      Z4608TipArtClas = "" ;
      A4608TipArtClas = "" ;
      Z7078TipArtProd = DecimalUtil.ZERO ;
      A7078TipArtProd = DecimalUtil.ZERO ;
      Z14361TipArtAct = "" ;
      A14361TipArtAct = "" ;
      Z13788TipArtCodD = "" ;
      A13788TipArtCodD = "" ;
      Z14008ID_TipArtD = "" ;
      A14008ID_TipArtD = "" ;
      BC002C4_A829TipArtCod = new short[1] ;
      BC002C4_n829TipArtCod = new boolean[] {false} ;
      BC002C4_A8713TipArtEst = new String[] {""} ;
      BC002C4_n8713TipArtEst = new boolean[] {false} ;
      BC002C4_A830TipArtDsc = new String[] {""} ;
      BC002C4_n830TipArtDsc = new boolean[] {false} ;
      BC002C4_A6014TipArtDsc2 = new String[] {""} ;
      BC002C4_n6014TipArtDsc2 = new boolean[] {false} ;
      BC002C4_A4608TipArtClas = new String[] {""} ;
      BC002C4_n4608TipArtClas = new boolean[] {false} ;
      BC002C4_A5250TipArtCtb = new byte[1] ;
      BC002C4_n5250TipArtCtb = new boolean[] {false} ;
      BC002C4_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC002C4_n7078TipArtProd = new boolean[] {false} ;
      BC002C4_A7376TipArtDias = new short[1] ;
      BC002C4_n7376TipArtDias = new boolean[] {false} ;
      BC002C4_A11044TipArtOrd = new short[1] ;
      BC002C4_n11044TipArtOrd = new boolean[] {false} ;
      BC002C4_A14361TipArtAct = new String[] {""} ;
      BC002C4_A396EmprCod = new String[] {""} ;
      BC002C5_A396EmprCod = new String[] {""} ;
      BC002C5_A829TipArtCod = new short[1] ;
      BC002C5_n829TipArtCod = new boolean[] {false} ;
      BC002C6_A829TipArtCod = new short[1] ;
      BC002C6_n829TipArtCod = new boolean[] {false} ;
      BC002C6_A8713TipArtEst = new String[] {""} ;
      BC002C6_n8713TipArtEst = new boolean[] {false} ;
      BC002C6_A830TipArtDsc = new String[] {""} ;
      BC002C6_n830TipArtDsc = new boolean[] {false} ;
      BC002C6_A6014TipArtDsc2 = new String[] {""} ;
      BC002C6_n6014TipArtDsc2 = new boolean[] {false} ;
      BC002C6_A4608TipArtClas = new String[] {""} ;
      BC002C6_n4608TipArtClas = new boolean[] {false} ;
      BC002C6_A5250TipArtCtb = new byte[1] ;
      BC002C6_n5250TipArtCtb = new boolean[] {false} ;
      BC002C6_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC002C6_n7078TipArtProd = new boolean[] {false} ;
      BC002C6_A7376TipArtDias = new short[1] ;
      BC002C6_n7376TipArtDias = new boolean[] {false} ;
      BC002C6_A11044TipArtOrd = new short[1] ;
      BC002C6_n11044TipArtOrd = new boolean[] {false} ;
      BC002C6_A14361TipArtAct = new String[] {""} ;
      BC002C6_A396EmprCod = new String[] {""} ;
      sMode100 = "" ;
      BC002C7_A829TipArtCod = new short[1] ;
      BC002C7_n829TipArtCod = new boolean[] {false} ;
      BC002C7_A8713TipArtEst = new String[] {""} ;
      BC002C7_n8713TipArtEst = new boolean[] {false} ;
      BC002C7_A830TipArtDsc = new String[] {""} ;
      BC002C7_n830TipArtDsc = new boolean[] {false} ;
      BC002C7_A6014TipArtDsc2 = new String[] {""} ;
      BC002C7_n6014TipArtDsc2 = new boolean[] {false} ;
      BC002C7_A4608TipArtClas = new String[] {""} ;
      BC002C7_n4608TipArtClas = new boolean[] {false} ;
      BC002C7_A5250TipArtCtb = new byte[1] ;
      BC002C7_n5250TipArtCtb = new boolean[] {false} ;
      BC002C7_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC002C7_n7078TipArtProd = new boolean[] {false} ;
      BC002C7_A7376TipArtDias = new short[1] ;
      BC002C7_n7376TipArtDias = new boolean[] {false} ;
      BC002C7_A11044TipArtOrd = new short[1] ;
      BC002C7_n11044TipArtOrd = new boolean[] {false} ;
      BC002C7_A14361TipArtAct = new String[] {""} ;
      BC002C7_A396EmprCod = new String[] {""} ;
      BC002C11_A396EmprCod = new String[] {""} ;
      BC002C11_A829TipArtCod = new short[1] ;
      BC002C11_n829TipArtCod = new boolean[] {false} ;
      BC002C11_A583IntCod = new byte[1] ;
      BC002C12_A396EmprCod = new String[] {""} ;
      BC002C12_A829TipArtCod = new short[1] ;
      BC002C12_n829TipArtCod = new boolean[] {false} ;
      BC002C12_A5173EstTpaAny = new short[1] ;
      BC002C12_A5174EstTpaSF = new String[] {""} ;
      BC002C13_A396EmprCod = new String[] {""} ;
      BC002C13_A4686MaqTipArt = new short[1] ;
      BC002C14_A396EmprCod = new String[] {""} ;
      BC002C14_A829TipArtCod = new short[1] ;
      BC002C14_n829TipArtCod = new boolean[] {false} ;
      BC002C14_A4378TipArtVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC002C15_A396EmprCod = new String[] {""} ;
      BC002C15_A4364GrdTipArt = new short[1] ;
      BC002C15_A829TipArtCod = new short[1] ;
      BC002C15_n829TipArtCod = new boolean[] {false} ;
      BC002C16_A396EmprCod = new String[] {""} ;
      BC002C16_A2720TarSec = new String[] {""} ;
      BC002C16_A252CliCod = new int[1] ;
      BC002C16_A829TipArtCod = new short[1] ;
      BC002C16_n829TipArtCod = new boolean[] {false} ;
      BC002C16_A831TipColCod = new byte[1] ;
      BC002C17_A396EmprCod = new String[] {""} ;
      BC002C17_A966PartCod = new String[] {""} ;
      BC002C17_A252CliCod = new int[1] ;
      BC002C18_A396EmprCod = new String[] {""} ;
      BC002C18_A539HisBarCod = new int[1] ;
      BC002C18_A545HisCodReo = new byte[1] ;
      BC002C18_A544HisCodPar = new String[] {""} ;
      BC002C18_A833TipDefCod = new short[1] ;
      BC002C19_A396EmprCod = new String[] {""} ;
      BC002C19_A129BarCod = new int[1] ;
      BC002C19_A132BarCodReo = new byte[1] ;
      BC002C19_A130BarCodPar = new String[] {""} ;
      BC002C20_A396EmprCod = new String[] {""} ;
      BC002C20_A252CliCod = new int[1] ;
      BC002C20_A65ArtCod = new String[] {""} ;
      BC002C21_A396EmprCod = new String[] {""} ;
      BC002C21_A44AlbRecCod = new int[1] ;
      BC002C22_A829TipArtCod = new short[1] ;
      BC002C22_n829TipArtCod = new boolean[] {false} ;
      BC002C22_A8713TipArtEst = new String[] {""} ;
      BC002C22_n8713TipArtEst = new boolean[] {false} ;
      BC002C22_A830TipArtDsc = new String[] {""} ;
      BC002C22_n830TipArtDsc = new boolean[] {false} ;
      BC002C22_A6014TipArtDsc2 = new String[] {""} ;
      BC002C22_n6014TipArtDsc2 = new boolean[] {false} ;
      BC002C22_A4608TipArtClas = new String[] {""} ;
      BC002C22_n4608TipArtClas = new boolean[] {false} ;
      BC002C22_A5250TipArtCtb = new byte[1] ;
      BC002C22_n5250TipArtCtb = new boolean[] {false} ;
      BC002C22_A7078TipArtProd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC002C22_n7078TipArtProd = new boolean[] {false} ;
      BC002C22_A7376TipArtDias = new short[1] ;
      BC002C22_n7376TipArtDias = new boolean[] {false} ;
      BC002C22_A11044TipArtOrd = new short[1] ;
      BC002C22_n11044TipArtOrd = new boolean[] {false} ;
      BC002C22_A14361TipArtAct = new String[] {""} ;
      BC002C22_A396EmprCod = new String[] {""} ;
      GXv_int9 = new short[1] ;
      i14361TipArtAct = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttipart_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttipart_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttipart_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttipart_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttipart_bc__default(),
         new Object[] {
             new Object[] {
            BC002C2_A829TipArtCod, BC002C2_A8713TipArtEst, BC002C2_n8713TipArtEst, BC002C2_A830TipArtDsc, BC002C2_n830TipArtDsc, BC002C2_A6014TipArtDsc2, BC002C2_n6014TipArtDsc2, BC002C2_A4608TipArtClas, BC002C2_n4608TipArtClas, BC002C2_A5250TipArtCtb,
            BC002C2_n5250TipArtCtb, BC002C2_A7078TipArtProd, BC002C2_n7078TipArtProd, BC002C2_A7376TipArtDias, BC002C2_n7376TipArtDias, BC002C2_A11044TipArtOrd, BC002C2_n11044TipArtOrd, BC002C2_A14361TipArtAct, BC002C2_A396EmprCod
            }
            , new Object[] {
            BC002C3_A829TipArtCod, BC002C3_A8713TipArtEst, BC002C3_n8713TipArtEst, BC002C3_A830TipArtDsc, BC002C3_n830TipArtDsc, BC002C3_A6014TipArtDsc2, BC002C3_n6014TipArtDsc2, BC002C3_A4608TipArtClas, BC002C3_n4608TipArtClas, BC002C3_A5250TipArtCtb,
            BC002C3_n5250TipArtCtb, BC002C3_A7078TipArtProd, BC002C3_n7078TipArtProd, BC002C3_A7376TipArtDias, BC002C3_n7376TipArtDias, BC002C3_A11044TipArtOrd, BC002C3_n11044TipArtOrd, BC002C3_A14361TipArtAct, BC002C3_A396EmprCod
            }
            , new Object[] {
            BC002C4_A829TipArtCod, BC002C4_A8713TipArtEst, BC002C4_n8713TipArtEst, BC002C4_A830TipArtDsc, BC002C4_n830TipArtDsc, BC002C4_A6014TipArtDsc2, BC002C4_n6014TipArtDsc2, BC002C4_A4608TipArtClas, BC002C4_n4608TipArtClas, BC002C4_A5250TipArtCtb,
            BC002C4_n5250TipArtCtb, BC002C4_A7078TipArtProd, BC002C4_n7078TipArtProd, BC002C4_A7376TipArtDias, BC002C4_n7376TipArtDias, BC002C4_A11044TipArtOrd, BC002C4_n11044TipArtOrd, BC002C4_A14361TipArtAct, BC002C4_A396EmprCod
            }
            , new Object[] {
            BC002C5_A396EmprCod, BC002C5_A829TipArtCod
            }
            , new Object[] {
            BC002C6_A829TipArtCod, BC002C6_A8713TipArtEst, BC002C6_n8713TipArtEst, BC002C6_A830TipArtDsc, BC002C6_n830TipArtDsc, BC002C6_A6014TipArtDsc2, BC002C6_n6014TipArtDsc2, BC002C6_A4608TipArtClas, BC002C6_n4608TipArtClas, BC002C6_A5250TipArtCtb,
            BC002C6_n5250TipArtCtb, BC002C6_A7078TipArtProd, BC002C6_n7078TipArtProd, BC002C6_A7376TipArtDias, BC002C6_n7376TipArtDias, BC002C6_A11044TipArtOrd, BC002C6_n11044TipArtOrd, BC002C6_A14361TipArtAct, BC002C6_A396EmprCod
            }
            , new Object[] {
            BC002C7_A829TipArtCod, BC002C7_A8713TipArtEst, BC002C7_n8713TipArtEst, BC002C7_A830TipArtDsc, BC002C7_n830TipArtDsc, BC002C7_A6014TipArtDsc2, BC002C7_n6014TipArtDsc2, BC002C7_A4608TipArtClas, BC002C7_n4608TipArtClas, BC002C7_A5250TipArtCtb,
            BC002C7_n5250TipArtCtb, BC002C7_A7078TipArtProd, BC002C7_n7078TipArtProd, BC002C7_A7376TipArtDias, BC002C7_n7376TipArtDias, BC002C7_A11044TipArtOrd, BC002C7_n11044TipArtOrd, BC002C7_A14361TipArtAct, BC002C7_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC002C11_A396EmprCod, BC002C11_A829TipArtCod, BC002C11_A583IntCod
            }
            , new Object[] {
            BC002C12_A396EmprCod, BC002C12_A829TipArtCod, BC002C12_A5173EstTpaAny, BC002C12_A5174EstTpaSF
            }
            , new Object[] {
            BC002C13_A396EmprCod, BC002C13_A4686MaqTipArt
            }
            , new Object[] {
            BC002C14_A396EmprCod, BC002C14_A829TipArtCod, BC002C14_A4378TipArtVal
            }
            , new Object[] {
            BC002C15_A396EmprCod, BC002C15_A4364GrdTipArt, BC002C15_A829TipArtCod
            }
            , new Object[] {
            BC002C16_A396EmprCod, BC002C16_A2720TarSec, BC002C16_A252CliCod, BC002C16_A829TipArtCod, BC002C16_A831TipColCod
            }
            , new Object[] {
            BC002C17_A396EmprCod, BC002C17_A966PartCod, BC002C17_A252CliCod
            }
            , new Object[] {
            BC002C18_A396EmprCod, BC002C18_A539HisBarCod, BC002C18_A545HisCodReo, BC002C18_A544HisCodPar, BC002C18_A833TipDefCod
            }
            , new Object[] {
            BC002C19_A396EmprCod, BC002C19_A129BarCod, BC002C19_A132BarCodReo, BC002C19_A130BarCodPar
            }
            , new Object[] {
            BC002C20_A396EmprCod, BC002C20_A252CliCod, BC002C20_A65ArtCod
            }
            , new Object[] {
            BC002C21_A396EmprCod, BC002C21_A44AlbRecCod
            }
            , new Object[] {
            BC002C22_A829TipArtCod, BC002C22_A8713TipArtEst, BC002C22_n8713TipArtEst, BC002C22_A830TipArtDsc, BC002C22_n830TipArtDsc, BC002C22_A6014TipArtDsc2, BC002C22_n6014TipArtDsc2, BC002C22_A4608TipArtClas, BC002C22_n4608TipArtClas, BC002C22_A5250TipArtCtb,
            BC002C22_n5250TipArtCtb, BC002C22_A7078TipArtProd, BC002C22_n7078TipArtProd, BC002C22_A7376TipArtDias, BC002C22_n7376TipArtDias, BC002C22_A11044TipArtOrd, BC002C22_n11044TipArtOrd, BC002C22_A14361TipArtAct, BC002C22_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z14361TipArtAct = httpContext.getMessage( "S", "") ;
      A14361TipArtAct = httpContext.getMessage( "S", "") ;
      i14361TipArtAct = httpContext.getMessage( "S", "") ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e122C2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV28Reg000 ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Z5250TipArtCtb ;
   private byte A5250TipArtCtb ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z829TipArtCod ;
   private short A829TipArtCod ;
   private short AV52autonumber ;
   private short Z7376TipArtDias ;
   private short A7376TipArtDias ;
   private short Z11044TipArtOrd ;
   private short A11044TipArtOrd ;
   private short RcdFound100 ;
   private short nIsDirty_100 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int GX_JID ;
   private java.math.BigDecimal Z7078TipArtProd ;
   private java.math.BigDecimal A7078TipArtProd ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String AV46EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z8713TipArtEst ;
   private String A8713TipArtEst ;
   private String Z830TipArtDsc ;
   private String A830TipArtDsc ;
   private String Z6014TipArtDsc2 ;
   private String A6014TipArtDsc2 ;
   private String Z4608TipArtClas ;
   private String A4608TipArtClas ;
   private String Z14361TipArtAct ;
   private String A14361TipArtAct ;
   private String Z14008ID_TipArtD ;
   private String A14008ID_TipArtD ;
   private String sMode100 ;
   private String i14361TipArtAct ;
   private boolean returnInSub ;
   private boolean n829TipArtCod ;
   private boolean n8713TipArtEst ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private boolean n4608TipArtClas ;
   private boolean n5250TipArtCtb ;
   private boolean n7078TipArtProd ;
   private boolean n7376TipArtDias ;
   private boolean n11044TipArtOrd ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z13788TipArtCodD ;
   private String A13788TipArtCodD ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV50WebSession ;
   private app.SdtTTIPART bcTTIPART ;
   private IDataStoreProvider pr_default ;
   private short[] BC002C4_A829TipArtCod ;
   private boolean[] BC002C4_n829TipArtCod ;
   private String[] BC002C4_A8713TipArtEst ;
   private boolean[] BC002C4_n8713TipArtEst ;
   private String[] BC002C4_A830TipArtDsc ;
   private boolean[] BC002C4_n830TipArtDsc ;
   private String[] BC002C4_A6014TipArtDsc2 ;
   private boolean[] BC002C4_n6014TipArtDsc2 ;
   private String[] BC002C4_A4608TipArtClas ;
   private boolean[] BC002C4_n4608TipArtClas ;
   private byte[] BC002C4_A5250TipArtCtb ;
   private boolean[] BC002C4_n5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C4_A7078TipArtProd ;
   private boolean[] BC002C4_n7078TipArtProd ;
   private short[] BC002C4_A7376TipArtDias ;
   private boolean[] BC002C4_n7376TipArtDias ;
   private short[] BC002C4_A11044TipArtOrd ;
   private boolean[] BC002C4_n11044TipArtOrd ;
   private String[] BC002C4_A14361TipArtAct ;
   private String[] BC002C4_A396EmprCod ;
   private String[] BC002C5_A396EmprCod ;
   private short[] BC002C5_A829TipArtCod ;
   private boolean[] BC002C5_n829TipArtCod ;
   private short[] BC002C6_A829TipArtCod ;
   private boolean[] BC002C6_n829TipArtCod ;
   private String[] BC002C6_A8713TipArtEst ;
   private boolean[] BC002C6_n8713TipArtEst ;
   private String[] BC002C6_A830TipArtDsc ;
   private boolean[] BC002C6_n830TipArtDsc ;
   private String[] BC002C6_A6014TipArtDsc2 ;
   private boolean[] BC002C6_n6014TipArtDsc2 ;
   private String[] BC002C6_A4608TipArtClas ;
   private boolean[] BC002C6_n4608TipArtClas ;
   private byte[] BC002C6_A5250TipArtCtb ;
   private boolean[] BC002C6_n5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C6_A7078TipArtProd ;
   private boolean[] BC002C6_n7078TipArtProd ;
   private short[] BC002C6_A7376TipArtDias ;
   private boolean[] BC002C6_n7376TipArtDias ;
   private short[] BC002C6_A11044TipArtOrd ;
   private boolean[] BC002C6_n11044TipArtOrd ;
   private String[] BC002C6_A14361TipArtAct ;
   private String[] BC002C6_A396EmprCod ;
   private short[] BC002C7_A829TipArtCod ;
   private boolean[] BC002C7_n829TipArtCod ;
   private String[] BC002C7_A8713TipArtEst ;
   private boolean[] BC002C7_n8713TipArtEst ;
   private String[] BC002C7_A830TipArtDsc ;
   private boolean[] BC002C7_n830TipArtDsc ;
   private String[] BC002C7_A6014TipArtDsc2 ;
   private boolean[] BC002C7_n6014TipArtDsc2 ;
   private String[] BC002C7_A4608TipArtClas ;
   private boolean[] BC002C7_n4608TipArtClas ;
   private byte[] BC002C7_A5250TipArtCtb ;
   private boolean[] BC002C7_n5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C7_A7078TipArtProd ;
   private boolean[] BC002C7_n7078TipArtProd ;
   private short[] BC002C7_A7376TipArtDias ;
   private boolean[] BC002C7_n7376TipArtDias ;
   private short[] BC002C7_A11044TipArtOrd ;
   private boolean[] BC002C7_n11044TipArtOrd ;
   private String[] BC002C7_A14361TipArtAct ;
   private String[] BC002C7_A396EmprCod ;
   private String[] BC002C11_A396EmprCod ;
   private short[] BC002C11_A829TipArtCod ;
   private boolean[] BC002C11_n829TipArtCod ;
   private byte[] BC002C11_A583IntCod ;
   private String[] BC002C12_A396EmprCod ;
   private short[] BC002C12_A829TipArtCod ;
   private boolean[] BC002C12_n829TipArtCod ;
   private short[] BC002C12_A5173EstTpaAny ;
   private String[] BC002C12_A5174EstTpaSF ;
   private String[] BC002C13_A396EmprCod ;
   private short[] BC002C13_A4686MaqTipArt ;
   private String[] BC002C14_A396EmprCod ;
   private short[] BC002C14_A829TipArtCod ;
   private boolean[] BC002C14_n829TipArtCod ;
   private java.math.BigDecimal[] BC002C14_A4378TipArtVal ;
   private String[] BC002C15_A396EmprCod ;
   private short[] BC002C15_A4364GrdTipArt ;
   private short[] BC002C15_A829TipArtCod ;
   private boolean[] BC002C15_n829TipArtCod ;
   private String[] BC002C16_A396EmprCod ;
   private String[] BC002C16_A2720TarSec ;
   private int[] BC002C16_A252CliCod ;
   private short[] BC002C16_A829TipArtCod ;
   private boolean[] BC002C16_n829TipArtCod ;
   private byte[] BC002C16_A831TipColCod ;
   private String[] BC002C17_A396EmprCod ;
   private String[] BC002C17_A966PartCod ;
   private int[] BC002C17_A252CliCod ;
   private String[] BC002C18_A396EmprCod ;
   private int[] BC002C18_A539HisBarCod ;
   private byte[] BC002C18_A545HisCodReo ;
   private String[] BC002C18_A544HisCodPar ;
   private short[] BC002C18_A833TipDefCod ;
   private String[] BC002C19_A396EmprCod ;
   private int[] BC002C19_A129BarCod ;
   private byte[] BC002C19_A132BarCodReo ;
   private String[] BC002C19_A130BarCodPar ;
   private String[] BC002C20_A396EmprCod ;
   private int[] BC002C20_A252CliCod ;
   private String[] BC002C20_A65ArtCod ;
   private String[] BC002C21_A396EmprCod ;
   private int[] BC002C21_A44AlbRecCod ;
   private short[] BC002C22_A829TipArtCod ;
   private boolean[] BC002C22_n829TipArtCod ;
   private String[] BC002C22_A8713TipArtEst ;
   private boolean[] BC002C22_n8713TipArtEst ;
   private String[] BC002C22_A830TipArtDsc ;
   private boolean[] BC002C22_n830TipArtDsc ;
   private String[] BC002C22_A6014TipArtDsc2 ;
   private boolean[] BC002C22_n6014TipArtDsc2 ;
   private String[] BC002C22_A4608TipArtClas ;
   private boolean[] BC002C22_n4608TipArtClas ;
   private byte[] BC002C22_A5250TipArtCtb ;
   private boolean[] BC002C22_n5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C22_A7078TipArtProd ;
   private boolean[] BC002C22_n7078TipArtProd ;
   private short[] BC002C22_A7376TipArtDias ;
   private boolean[] BC002C22_n7376TipArtDias ;
   private short[] BC002C22_A11044TipArtOrd ;
   private boolean[] BC002C22_n11044TipArtOrd ;
   private String[] BC002C22_A14361TipArtAct ;
   private String[] BC002C22_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] BC002C2_A829TipArtCod ;
   private String[] BC002C2_A8713TipArtEst ;
   private String[] BC002C2_A830TipArtDsc ;
   private String[] BC002C2_A6014TipArtDsc2 ;
   private String[] BC002C2_A4608TipArtClas ;
   private byte[] BC002C2_A5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C2_A7078TipArtProd ;
   private short[] BC002C2_A7376TipArtDias ;
   private short[] BC002C2_A11044TipArtOrd ;
   private String[] BC002C2_A14361TipArtAct ;
   private String[] BC002C2_A396EmprCod ;
   private short[] BC002C3_A829TipArtCod ;
   private String[] BC002C3_A8713TipArtEst ;
   private String[] BC002C3_A830TipArtDsc ;
   private String[] BC002C3_A6014TipArtDsc2 ;
   private String[] BC002C3_A4608TipArtClas ;
   private byte[] BC002C3_A5250TipArtCtb ;
   private java.math.BigDecimal[] BC002C3_A7078TipArtProd ;
   private short[] BC002C3_A7376TipArtDias ;
   private short[] BC002C3_A11044TipArtOrd ;
   private String[] BC002C3_A14361TipArtAct ;
   private String[] BC002C3_A396EmprCod ;
   private boolean[] BC002C2_n8713TipArtEst ;
   private boolean[] BC002C2_n830TipArtDsc ;
   private boolean[] BC002C2_n6014TipArtDsc2 ;
   private boolean[] BC002C2_n4608TipArtClas ;
   private boolean[] BC002C2_n5250TipArtCtb ;
   private boolean[] BC002C2_n7078TipArtProd ;
   private boolean[] BC002C2_n7376TipArtDias ;
   private boolean[] BC002C2_n11044TipArtOrd ;
   private boolean[] BC002C3_n8713TipArtEst ;
   private boolean[] BC002C3_n830TipArtDsc ;
   private boolean[] BC002C3_n6014TipArtDsc2 ;
   private boolean[] BC002C3_n4608TipArtClas ;
   private boolean[] BC002C3_n5250TipArtCtb ;
   private boolean[] BC002C3_n7078TipArtProd ;
   private boolean[] BC002C3_n7376TipArtDias ;
   private boolean[] BC002C3_n11044TipArtOrd ;
   private app.wwpbaseobjects.SdtWWPContext AV48WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV49TrnContext ;
}

final  class ttipart_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipart_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC002C2", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ?  FOR UPDATE OF TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002C3", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002C4", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipArtCod, TM1.TipArtEst, TM1.TipArtDsc, TM1.TipArtDsc2, TM1.TipArtClas, TM1.TipArtCtb, TM1.TipArtProd, TM1.TipArtDias, TM1.TipArtOrd, TM1.TipArtAct, TM1.EmprCod FROM TXPTIPART TM1 WHERE TM1.EmprCod = ? and TM1.TipArtCod = ? ORDER BY TM1.EmprCod, TM1.TipArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002C5", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipArtCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002C6", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002C7", "SELECT TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ?  FOR UPDATE OF TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC002C8", "INSERT INTO TXPTIPART(TipArtCod, TipArtEst, TipArtDsc, TipArtDsc2, TipArtClas, TipArtCtb, TipArtProd, TipArtDias, TipArtOrd, TipArtAct, EmprCod, TipArtCos, EnsGru) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK, "TXPTIPART")
         ,new UpdateCursor("BC002C9", "UPDATE TXPTIPART SET TipArtEst=?, TipArtDsc=?, TipArtDsc2=?, TipArtClas=?, TipArtCtb=?, TipArtProd=?, TipArtDias=?, TipArtOrd=?, TipArtAct=?  WHERE EmprCod = ? AND TipArtCod = ?", GX_NOMASK, "TXPTIPART")
         ,new UpdateCursor("BC002C10", "DELETE FROM TXPTIPART  WHERE EmprCod = ? AND TipArtCod = ?", GX_NOMASK, "TXPTIPART")
         ,new ForEachCursor("BC002C11", "SELECT * FROM (SELECT EmprCod, TipArtCod, IntCod FROM TXPTARINT WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C12", "SELECT * FROM (SELECT EmprCod, TipArtCod, EstTpaAny, EstTpaSF FROM TXPTAREST WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C13", "SELECT * FROM (SELECT EmprCod, MaqTipArt FROM TXPMAQTAR WHERE EmprCod = ? AND MaqTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C14", "SELECT * FROM (SELECT EmprCod, TipArtCod, TipArtVal FROM TXPTIPARC WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C15", "SELECT * FROM (SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C16", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C17", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C18", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND HisTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND BarTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C20", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND TipArtCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C21", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRTartC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002C22", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipArtCod, TM1.TipArtEst, TM1.TipArtDsc, TM1.TipArtDsc2, TM1.TipArtClas, TM1.TipArtCtb, TM1.TipArtProd, TM1.TipArtDias, TM1.TipArtOrd, TM1.TipArtAct, TM1.EmprCod FROM TXPTIPART TM1 WHERE TM1.EmprCod = ? and TM1.TipArtCod = ? ORDER BY TM1.EmprCod, TM1.TipArtCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
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
            case 5 :
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
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 80);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 1);
               stmt.setString(11, (String)parms[19], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 80);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               stmt.setString(9, (String)parms[16], 1);
               stmt.setString(10, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 16 :
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
            case 17 :
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
            case 18 :
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
            case 19 :
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
            case 20 :
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
      }
   }

}

