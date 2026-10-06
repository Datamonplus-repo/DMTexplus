package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrm_bc extends GXWebPanel implements IGxSilentTrn
{
   public ttrm_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrm_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrm_bc.class ));
   }

   public ttrm_bc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1T51888( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1T51888( ) ;
      standaloneModal( ) ;
      addRow1T51888( ) ;
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
         e111T52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z14105TRMDivID = A14105TRMDivID ;
            Z14106TRMFecha = A14106TRMFecha ;
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

   public void confirm_1T50( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T51888( ) ;
         }
         else
         {
            checkExtendedTable1T51888( ) ;
            if ( AnyError == 0 )
            {
               zm1T51888( 9) ;
               zm1T51888( 10) ;
            }
            closeExtendedTableCursors1T51888( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121T52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrm_bc.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrm_bc.this.A396EmprCod = GXv_char2[0] ;
      ttrm_bc.this.AV11EmprNom = GXv_char3[0] ;
      ttrm_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttrm_bc.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttrm_bc.this.AV32EmprCod = GXv_char4[0] ;
      ttrm_bc.this.AV11EmprNom = GXv_char3[0] ;
      ttrm_bc.this.AV8UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e111T52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1T51888( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z14108TRMCompra = A14108TRMCompra ;
         Z14109TRMVenta = A14109TRMVenta ;
         Z14110TRMAutMan = A14110TRMAutMan ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
      }
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         Z14107TRMDivNom = A14107TRMDivNom ;
      }
      if ( GX_JID == -8 )
      {
         Z14106TRMFecha = A14106TRMFecha ;
         Z14108TRMCompra = A14108TRMCompra ;
         Z14109TRMVenta = A14109TRMVenta ;
         Z14110TRMAutMan = A14110TRMAutMan ;
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z407EmprNom = A407EmprNom ;
         Z14107TRMDivNom = A14107TRMDivNom ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      Gx_date = GXutil.today( ) ;
      /* Using cursor BC01T56 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01T56_A407EmprNom[0] ;
      n407EmprNom = BC01T56_n407EmprNom[0] ;
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) && ( Gx_BScreen == 0 ) )
      {
         A14106TRMFecha = GXutil.resetTime( Gx_date );
      }
      if ( isIns( )  && (GXutil.strcmp("", A14110TRMAutMan)==0) && ( Gx_BScreen == 0 ) )
      {
         A14110TRMAutMan = httpContext.getMessage( httpContext.getMessage( "M", ""), "") ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1T51888( )
   {
      /* Using cursor BC01T57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A407EmprNom = BC01T57_A407EmprNom[0] ;
         n407EmprNom = BC01T57_n407EmprNom[0] ;
         A14107TRMDivNom = BC01T57_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T57_n14107TRMDivNom[0] ;
         A14108TRMCompra = BC01T57_A14108TRMCompra[0] ;
         A14109TRMVenta = BC01T57_A14109TRMVenta[0] ;
         A14110TRMAutMan = BC01T57_A14110TRMAutMan[0] ;
         zm1T51888( -8) ;
      }
      pr_default.close(5);
      onLoadActions1T51888( ) ;
   }

   public void onLoadActions1T51888( )
   {
   }

   public void checkExtendedTable1T51888( )
   {
      nIsDirty_1888 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01T58 */
      pr_default.execute(6, new Object[] {Byte.valueOf(A14105TRMDivID)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
         AnyError = (short)(1) ;
      }
      A14107TRMDivNom = BC01T58_A14107TRMDivNom[0] ;
      n14107TRMDivNom = BC01T58_n14107TRMDivNom[0] ;
      pr_default.close(6);
      if ( (0==A14105TRMDivID) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Divisa requerida.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14106TRMFecha) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fecha requerida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A14108TRMCompra)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor de compra es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A14109TRMVenta)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor de venta es requerido.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (GXutil.strcmp("", A14110TRMAutMan)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "TRegistración requerida.", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1T51888( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey1T51888( )
   {
      /* Using cursor BC01T59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1888 = (short)(1) ;
      }
      else
      {
         RcdFound1888 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01T510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(BC01T510_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1T51888( 8) ;
         RcdFound1888 = (short)(1) ;
         A14106TRMFecha = BC01T510_A14106TRMFecha[0] ;
         A14108TRMCompra = BC01T510_A14108TRMCompra[0] ;
         A14109TRMVenta = BC01T510_A14109TRMVenta[0] ;
         A14110TRMAutMan = BC01T510_A14110TRMAutMan[0] ;
         A14105TRMDivID = BC01T510_A14105TRMDivID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z14106TRMFecha = A14106TRMFecha ;
         sMode1888 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1T51888( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1888 = (short)(0) ;
            initializeNonKey1T51888( ) ;
         }
         Gx_mode = sMode1888 ;
      }
      else
      {
         RcdFound1888 = (short)(0) ;
         initializeNonKey1T51888( ) ;
         sMode1888 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1888 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey1T51888( ) ;
      if ( RcdFound1888 == 0 )
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
      confirm_1T50( ) ;
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

   public void checkOptimisticConcurrency1T51888( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01T511 */
         pr_default.execute(9, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(9) == 101) || ( DecimalUtil.compareTo(Z14108TRMCompra, BC01T511_A14108TRMCompra[0]) != 0 ) || ( DecimalUtil.compareTo(Z14109TRMVenta, BC01T511_A14109TRMVenta[0]) != 0 ) || ( GXutil.strcmp(Z14110TRMAutMan, BC01T511_A14110TRMAutMan[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTRM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T51888( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T51888( 0) ;
         checkOptimisticConcurrency1T51888( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T51888( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T51888( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01T512 */
                  pr_default.execute(10, new Object[] {A14106TRMFecha, A14108TRMCompra, A14109TRMVenta, A14110TRMAutMan, A396EmprCod, Byte.valueOf(A14105TRMDivID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
                  if ( (pr_default.getStatus(10) == 1) )
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
            load1T51888( ) ;
         }
         endLevel1T51888( ) ;
      }
      closeExtendedTableCursors1T51888( ) ;
   }

   public void update1T51888( )
   {
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T51888( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T51888( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T51888( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01T513 */
                  pr_default.execute(11, new Object[] {A14108TRMCompra, A14109TRMVenta, A14110TRMAutMan, A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTRM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T51888( ) ;
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
         endLevel1T51888( ) ;
      }
      closeExtendedTableCursors1T51888( ) ;
   }

   public void deferredUpdate1T51888( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1T51888( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T51888( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T51888( ) ;
         afterConfirm1T51888( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T51888( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01T514 */
               pr_default.execute(12, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTRM");
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
      sMode1888 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1T51888( ) ;
      Gx_mode = sMode1888 ;
   }

   public void onDeleteControls1T51888( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01T515 */
         pr_default.execute(13, new Object[] {Byte.valueOf(A14105TRMDivID)});
         A14107TRMDivNom = BC01T515_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T515_n14107TRMDivNom[0] ;
         pr_default.close(13);
      }
   }

   public void endLevel1T51888( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1T51888( ) ;
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

   public void scanKeyStart1T51888( )
   {
      /* Scan By routine */
      /* Using cursor BC01T516 */
      pr_default.execute(14, new Object[] {A396EmprCod, Byte.valueOf(A14105TRMDivID), A14106TRMFecha});
      RcdFound1888 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A14106TRMFecha = BC01T516_A14106TRMFecha[0] ;
         A407EmprNom = BC01T516_A407EmprNom[0] ;
         n407EmprNom = BC01T516_n407EmprNom[0] ;
         A14107TRMDivNom = BC01T516_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T516_n14107TRMDivNom[0] ;
         A14108TRMCompra = BC01T516_A14108TRMCompra[0] ;
         A14109TRMVenta = BC01T516_A14109TRMVenta[0] ;
         A14110TRMAutMan = BC01T516_A14110TRMAutMan[0] ;
         A14105TRMDivID = BC01T516_A14105TRMDivID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1T51888( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1888 = (short)(0) ;
      scanKeyLoad1T51888( ) ;
   }

   public void scanKeyLoad1T51888( )
   {
      sMode1888 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1888 = (short)(1) ;
         A14106TRMFecha = BC01T516_A14106TRMFecha[0] ;
         A407EmprNom = BC01T516_A407EmprNom[0] ;
         n407EmprNom = BC01T516_n407EmprNom[0] ;
         A14107TRMDivNom = BC01T516_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T516_n14107TRMDivNom[0] ;
         A14108TRMCompra = BC01T516_A14108TRMCompra[0] ;
         A14109TRMVenta = BC01T516_A14109TRMVenta[0] ;
         A14110TRMAutMan = BC01T516_A14110TRMAutMan[0] ;
         A14105TRMDivID = BC01T516_A14105TRMDivID[0] ;
      }
      Gx_mode = sMode1888 ;
   }

   public void scanKeyEnd1T51888( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1T51888( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T51888( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1T51888( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T51888( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T51888( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T51888( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T51888( )
   {
   }

   public void send_integrity_lvl_hashes1T51888( )
   {
   }

   public void addRow1T51888( )
   {
      VarsToRow1888( bcficherosbasicos_TTRM) ;
   }

   public void readRow1T51888( )
   {
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
   }

   public void initializeNonKey1T51888( )
   {
      A14107TRMDivNom = "" ;
      n14107TRMDivNom = false ;
      A14108TRMCompra = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      A14110TRMAutMan = httpContext.getMessage( "M", "") ;
      Z14108TRMCompra = DecimalUtil.ZERO ;
      Z14109TRMVenta = DecimalUtil.ZERO ;
      Z14110TRMAutMan = "" ;
   }

   public void initAll1T51888( )
   {
      A14105TRMDivID = (byte)(0) ;
      A14106TRMFecha = GXutil.resetTime( Gx_date );
      initializeNonKey1T51888( ) ;
   }

   public void standaloneModalInsert( )
   {
      A14110TRMAutMan = i14110TRMAutMan ;
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

   public void VarsToRow1888( app.ficherosbasicos.SdtTTRM obj1888 )
   {
      obj1888.setgxTv_SdtTTRM_Mode( Gx_mode );
      obj1888.setgxTv_SdtTTRM_Emprcod( A396EmprCod );
      obj1888.setgxTv_SdtTTRM_Emprnom( A407EmprNom );
      obj1888.setgxTv_SdtTTRM_Trmdivnom( A14107TRMDivNom );
      obj1888.setgxTv_SdtTTRM_Trmcompra( A14108TRMCompra );
      obj1888.setgxTv_SdtTTRM_Trmventa( A14109TRMVenta );
      obj1888.setgxTv_SdtTTRM_Trmautman( A14110TRMAutMan );
      obj1888.setgxTv_SdtTTRM_Emprcod( A396EmprCod );
      obj1888.setgxTv_SdtTTRM_Trmdivid( A14105TRMDivID );
      obj1888.setgxTv_SdtTTRM_Trmfecha( A14106TRMFecha );
      obj1888.setgxTv_SdtTTRM_Emprcod_Z( Z396EmprCod );
      obj1888.setgxTv_SdtTTRM_Emprnom_Z( Z407EmprNom );
      obj1888.setgxTv_SdtTTRM_Trmdivid_Z( Z14105TRMDivID );
      obj1888.setgxTv_SdtTTRM_Trmdivnom_Z( Z14107TRMDivNom );
      obj1888.setgxTv_SdtTTRM_Trmfecha_Z( Z14106TRMFecha );
      obj1888.setgxTv_SdtTTRM_Trmcompra_Z( Z14108TRMCompra );
      obj1888.setgxTv_SdtTTRM_Trmventa_Z( Z14109TRMVenta );
      obj1888.setgxTv_SdtTTRM_Trmautman_Z( Z14110TRMAutMan );
      obj1888.setgxTv_SdtTTRM_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1888.setgxTv_SdtTTRM_Trmdivnom_N( (byte)((byte)((n14107TRMDivNom)?1:0)) );
      obj1888.setgxTv_SdtTTRM_Mode( Gx_mode );
   }

   public void KeyVarsToRow1888( app.ficherosbasicos.SdtTTRM obj1888 )
   {
      obj1888.setgxTv_SdtTTRM_Emprcod( A396EmprCod );
      obj1888.setgxTv_SdtTTRM_Trmdivid( A14105TRMDivID );
      obj1888.setgxTv_SdtTTRM_Trmfecha( A14106TRMFecha );
   }

   public void RowToVars1888( app.ficherosbasicos.SdtTTRM obj1888 ,
                              int forceLoad )
   {
      Gx_mode = obj1888.getgxTv_SdtTTRM_Mode() ;
      A396EmprCod = obj1888.getgxTv_SdtTTRM_Emprcod() ;
      A407EmprNom = obj1888.getgxTv_SdtTTRM_Emprnom() ;
      n407EmprNom = false ;
      A14107TRMDivNom = obj1888.getgxTv_SdtTTRM_Trmdivnom() ;
      n14107TRMDivNom = false ;
      A14108TRMCompra = obj1888.getgxTv_SdtTTRM_Trmcompra() ;
      A14109TRMVenta = obj1888.getgxTv_SdtTTRM_Trmventa() ;
      A14110TRMAutMan = obj1888.getgxTv_SdtTTRM_Trmautman() ;
      A396EmprCod = obj1888.getgxTv_SdtTTRM_Emprcod() ;
      A14105TRMDivID = obj1888.getgxTv_SdtTTRM_Trmdivid() ;
      A14106TRMFecha = obj1888.getgxTv_SdtTTRM_Trmfecha() ;
      Z396EmprCod = obj1888.getgxTv_SdtTTRM_Emprcod_Z() ;
      Z407EmprNom = obj1888.getgxTv_SdtTTRM_Emprnom_Z() ;
      Z14105TRMDivID = obj1888.getgxTv_SdtTTRM_Trmdivid_Z() ;
      Z14107TRMDivNom = obj1888.getgxTv_SdtTTRM_Trmdivnom_Z() ;
      Z14106TRMFecha = obj1888.getgxTv_SdtTTRM_Trmfecha_Z() ;
      Z14108TRMCompra = obj1888.getgxTv_SdtTTRM_Trmcompra_Z() ;
      Z14109TRMVenta = obj1888.getgxTv_SdtTTRM_Trmventa_Z() ;
      Z14110TRMAutMan = obj1888.getgxTv_SdtTTRM_Trmautman_Z() ;
      n407EmprNom = (boolean)((obj1888.getgxTv_SdtTTRM_Emprnom_N()==0)?false:true) ;
      n14107TRMDivNom = (boolean)((obj1888.getgxTv_SdtTTRM_Trmdivnom_N()==0)?false:true) ;
      Gx_mode = obj1888.getgxTv_SdtTTRM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A14105TRMDivID = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      A14106TRMFecha = (java.util.Date)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1T51888( ) ;
      scanKeyStart1T51888( ) ;
      if ( RcdFound1888 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01T517 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(15) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01T517_A407EmprNom[0] ;
         n407EmprNom = BC01T517_n407EmprNom[0] ;
         pr_default.close(15);
         /* Using cursor BC01T518 */
         pr_default.execute(16, new Object[] {Byte.valueOf(A14105TRMDivID)});
         if ( (pr_default.getStatus(16) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
            AnyError = (short)(1) ;
         }
         A14107TRMDivNom = BC01T518_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T518_n14107TRMDivNom[0] ;
         pr_default.close(16);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z14106TRMFecha = A14106TRMFecha ;
      }
      zm1T51888( -8) ;
      onLoadActions1T51888( ) ;
      addRow1T51888( ) ;
      scanKeyEnd1T51888( ) ;
      if ( RcdFound1888 == 0 )
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
      RowToVars1888( bcficherosbasicos_TTRM, 0) ;
      scanKeyStart1T51888( ) ;
      if ( RcdFound1888 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01T519 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01T519_A407EmprNom[0] ;
         n407EmprNom = BC01T519_n407EmprNom[0] ;
         pr_default.close(17);
         /* Using cursor BC01T520 */
         pr_default.execute(18, new Object[] {Byte.valueOf(A14105TRMDivID)});
         if ( (pr_default.getStatus(18) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Divisa", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRMDIVID");
            AnyError = (short)(1) ;
         }
         A14107TRMDivNom = BC01T520_A14107TRMDivNom[0] ;
         n14107TRMDivNom = BC01T520_n14107TRMDivNom[0] ;
         pr_default.close(18);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z14105TRMDivID = A14105TRMDivID ;
         Z14106TRMFecha = A14106TRMFecha ;
      }
      zm1T51888( -8) ;
      onLoadActions1T51888( ) ;
      addRow1T51888( ) ;
      scanKeyEnd1T51888( ) ;
      if ( RcdFound1888 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T51888( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1T51888( ) ;
      }
      else
      {
         if ( RcdFound1888 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
            {
               A14105TRMDivID = Z14105TRMDivID ;
               A14106TRMFecha = Z14106TRMFecha ;
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
               update1T51888( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
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
                     insert1T51888( ) ;
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
                     insert1T51888( ) ;
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
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
      saveImpl( ) ;
      VarsToRow1888( bcficherosbasicos_TTRM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1T51888( ) ;
      afterTrn( ) ;
      VarsToRow1888( bcficherosbasicos_TTRM) ;
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
         app.ficherosbasicos.SdtTTRM auxBC = new app.ficherosbasicos.SdtTTRM( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A14105TRMDivID, A14106TRMFecha);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcficherosbasicos_TTRM);
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
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
      updateImpl( ) ;
      VarsToRow1888( bcficherosbasicos_TTRM) ;
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
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1T51888( ) ;
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
      VarsToRow1888( bcficherosbasicos_TTRM) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1888( bcficherosbasicos_TTRM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1T51888( ) ;
      if ( RcdFound1888 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
         {
            A14105TRMDivID = Z14105TRMDivID ;
            A14106TRMFecha = Z14106TRMFecha ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14105TRMDivID != Z14105TRMDivID ) || !( GXutil.dateCompare(A14106TRMFecha, Z14106TRMFecha) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttrm_bc");
      VarsToRow1888( bcficherosbasicos_TTRM) ;
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
      Gx_mode = bcficherosbasicos_TTRM.getgxTv_SdtTTRM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcficherosbasicos_TTRM.setgxTv_SdtTTRM_Mode( Gx_mode );
   }

   public void SetSDT( app.ficherosbasicos.SdtTTRM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcficherosbasicos_TTRM )
      {
         bcficherosbasicos_TTRM = sdt ;
         if ( GXutil.strcmp(bcficherosbasicos_TTRM.getgxTv_SdtTTRM_Mode(), "") == 0 )
         {
            bcficherosbasicos_TTRM.setgxTv_SdtTTRM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1888( bcficherosbasicos_TTRM) ;
         }
         else
         {
            RowToVars1888( bcficherosbasicos_TTRM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcficherosbasicos_TTRM.getgxTv_SdtTTRM_Mode(), "") == 0 )
         {
            bcficherosbasicos_TTRM.setgxTv_SdtTTRM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1888( bcficherosbasicos_TTRM, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTTRM getTTRM_BC( )
   {
      return bcficherosbasicos_TTRM ;
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
      Z14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV32EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z14108TRMCompra = DecimalUtil.ZERO ;
      A14108TRMCompra = DecimalUtil.ZERO ;
      Z14109TRMVenta = DecimalUtil.ZERO ;
      A14109TRMVenta = DecimalUtil.ZERO ;
      Z14110TRMAutMan = "" ;
      A14110TRMAutMan = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z14107TRMDivNom = "" ;
      A14107TRMDivNom = "" ;
      Gx_date = GXutil.nullDate() ;
      BC01T56_A407EmprNom = new String[] {""} ;
      BC01T56_n407EmprNom = new boolean[] {false} ;
      BC01T57_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01T57_A407EmprNom = new String[] {""} ;
      BC01T57_n407EmprNom = new boolean[] {false} ;
      BC01T57_A14107TRMDivNom = new String[] {""} ;
      BC01T57_n14107TRMDivNom = new boolean[] {false} ;
      BC01T57_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T57_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T57_A14110TRMAutMan = new String[] {""} ;
      BC01T57_A396EmprCod = new String[] {""} ;
      BC01T57_A14105TRMDivID = new byte[1] ;
      BC01T58_A14107TRMDivNom = new String[] {""} ;
      BC01T58_n14107TRMDivNom = new boolean[] {false} ;
      BC01T59_A396EmprCod = new String[] {""} ;
      BC01T59_A14105TRMDivID = new byte[1] ;
      BC01T59_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01T510_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01T510_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T510_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T510_A14110TRMAutMan = new String[] {""} ;
      BC01T510_A396EmprCod = new String[] {""} ;
      BC01T510_A14105TRMDivID = new byte[1] ;
      sMode1888 = "" ;
      BC01T511_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01T511_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T511_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T511_A14110TRMAutMan = new String[] {""} ;
      BC01T511_A396EmprCod = new String[] {""} ;
      BC01T511_A14105TRMDivID = new byte[1] ;
      BC01T515_A14107TRMDivNom = new String[] {""} ;
      BC01T515_n14107TRMDivNom = new boolean[] {false} ;
      BC01T516_A14106TRMFecha = new java.util.Date[] {GXutil.nullDate()} ;
      BC01T516_A407EmprNom = new String[] {""} ;
      BC01T516_n407EmprNom = new boolean[] {false} ;
      BC01T516_A14107TRMDivNom = new String[] {""} ;
      BC01T516_n14107TRMDivNom = new boolean[] {false} ;
      BC01T516_A14108TRMCompra = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T516_A14109TRMVenta = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01T516_A14110TRMAutMan = new String[] {""} ;
      BC01T516_A396EmprCod = new String[] {""} ;
      BC01T516_A14105TRMDivID = new byte[1] ;
      i14110TRMAutMan = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01T517_A407EmprNom = new String[] {""} ;
      BC01T517_n407EmprNom = new boolean[] {false} ;
      BC01T518_A14107TRMDivNom = new String[] {""} ;
      BC01T518_n14107TRMDivNom = new boolean[] {false} ;
      BC01T519_A407EmprNom = new String[] {""} ;
      BC01T519_n407EmprNom = new boolean[] {false} ;
      BC01T520_A14107TRMDivNom = new String[] {""} ;
      BC01T520_n14107TRMDivNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttrm_bc__default(),
         new Object[] {
             new Object[] {
            BC01T52_A14106TRMFecha, BC01T52_A14108TRMCompra, BC01T52_A14109TRMVenta, BC01T52_A14110TRMAutMan, BC01T52_A396EmprCod, BC01T52_A14105TRMDivID
            }
            , new Object[] {
            BC01T53_A14106TRMFecha, BC01T53_A14108TRMCompra, BC01T53_A14109TRMVenta, BC01T53_A14110TRMAutMan, BC01T53_A396EmprCod, BC01T53_A14105TRMDivID
            }
            , new Object[] {
            BC01T54_A407EmprNom, BC01T54_n407EmprNom
            }
            , new Object[] {
            BC01T55_A14107TRMDivNom, BC01T55_n14107TRMDivNom
            }
            , new Object[] {
            BC01T56_A407EmprNom, BC01T56_n407EmprNom
            }
            , new Object[] {
            BC01T57_A14106TRMFecha, BC01T57_A407EmprNom, BC01T57_n407EmprNom, BC01T57_A14107TRMDivNom, BC01T57_n14107TRMDivNom, BC01T57_A14108TRMCompra, BC01T57_A14109TRMVenta, BC01T57_A14110TRMAutMan, BC01T57_A396EmprCod, BC01T57_A14105TRMDivID
            }
            , new Object[] {
            BC01T58_A14107TRMDivNom, BC01T58_n14107TRMDivNom
            }
            , new Object[] {
            BC01T59_A396EmprCod, BC01T59_A14105TRMDivID, BC01T59_A14106TRMFecha
            }
            , new Object[] {
            BC01T510_A14106TRMFecha, BC01T510_A14108TRMCompra, BC01T510_A14109TRMVenta, BC01T510_A14110TRMAutMan, BC01T510_A396EmprCod, BC01T510_A14105TRMDivID
            }
            , new Object[] {
            BC01T511_A14106TRMFecha, BC01T511_A14108TRMCompra, BC01T511_A14109TRMVenta, BC01T511_A14110TRMAutMan, BC01T511_A396EmprCod, BC01T511_A14105TRMDivID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01T515_A14107TRMDivNom, BC01T515_n14107TRMDivNom
            }
            , new Object[] {
            BC01T516_A14106TRMFecha, BC01T516_A407EmprNom, BC01T516_n407EmprNom, BC01T516_A14107TRMDivNom, BC01T516_n14107TRMDivNom, BC01T516_A14108TRMCompra, BC01T516_A14109TRMVenta, BC01T516_A14110TRMAutMan, BC01T516_A396EmprCod, BC01T516_A14105TRMDivID
            }
            , new Object[] {
            BC01T517_A407EmprNom, BC01T517_n407EmprNom
            }
            , new Object[] {
            BC01T518_A14107TRMDivNom, BC01T518_n14107TRMDivNom
            }
            , new Object[] {
            BC01T519_A407EmprNom, BC01T519_n407EmprNom
            }
            , new Object[] {
            BC01T520_A14107TRMDivNom, BC01T520_n14107TRMDivNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z14110TRMAutMan = httpContext.getMessage( "M", "") ;
      A14110TRMAutMan = httpContext.getMessage( "M", "") ;
      i14110TRMAutMan = httpContext.getMessage( "M", "") ;
      Z14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      A14106TRMFecha = GXutil.resetTime( GXutil.nullDate() );
      Gx_date = GXutil.today( ) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121T52 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z14105TRMDivID ;
   private byte A14105TRMDivID ;
   private byte Gx_BScreen ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1888 ;
   private short nIsDirty_1888 ;
   private int trnEnded ;
   private int GX_JID ;
   private java.math.BigDecimal Z14108TRMCompra ;
   private java.math.BigDecimal A14108TRMCompra ;
   private java.math.BigDecimal Z14109TRMVenta ;
   private java.math.BigDecimal A14109TRMVenta ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String AV32EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z14110TRMAutMan ;
   private String A14110TRMAutMan ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z14107TRMDivNom ;
   private String A14107TRMDivNom ;
   private String sMode1888 ;
   private String i14110TRMAutMan ;
   private java.util.Date Z14106TRMFecha ;
   private java.util.Date A14106TRMFecha ;
   private java.util.Date Gx_date ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n14107TRMDivNom ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private app.ficherosbasicos.SdtTTRM bcficherosbasicos_TTRM ;
   private IDataStoreProvider pr_default ;
   private String[] BC01T56_A407EmprNom ;
   private boolean[] BC01T56_n407EmprNom ;
   private java.util.Date[] BC01T57_A14106TRMFecha ;
   private String[] BC01T57_A407EmprNom ;
   private boolean[] BC01T57_n407EmprNom ;
   private String[] BC01T57_A14107TRMDivNom ;
   private boolean[] BC01T57_n14107TRMDivNom ;
   private java.math.BigDecimal[] BC01T57_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T57_A14109TRMVenta ;
   private String[] BC01T57_A14110TRMAutMan ;
   private String[] BC01T57_A396EmprCod ;
   private byte[] BC01T57_A14105TRMDivID ;
   private String[] BC01T58_A14107TRMDivNom ;
   private boolean[] BC01T58_n14107TRMDivNom ;
   private String[] BC01T59_A396EmprCod ;
   private byte[] BC01T59_A14105TRMDivID ;
   private java.util.Date[] BC01T59_A14106TRMFecha ;
   private java.util.Date[] BC01T510_A14106TRMFecha ;
   private java.math.BigDecimal[] BC01T510_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T510_A14109TRMVenta ;
   private String[] BC01T510_A14110TRMAutMan ;
   private String[] BC01T510_A396EmprCod ;
   private byte[] BC01T510_A14105TRMDivID ;
   private java.util.Date[] BC01T511_A14106TRMFecha ;
   private java.math.BigDecimal[] BC01T511_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T511_A14109TRMVenta ;
   private String[] BC01T511_A14110TRMAutMan ;
   private String[] BC01T511_A396EmprCod ;
   private byte[] BC01T511_A14105TRMDivID ;
   private String[] BC01T515_A14107TRMDivNom ;
   private boolean[] BC01T515_n14107TRMDivNom ;
   private java.util.Date[] BC01T516_A14106TRMFecha ;
   private String[] BC01T516_A407EmprNom ;
   private boolean[] BC01T516_n407EmprNom ;
   private String[] BC01T516_A14107TRMDivNom ;
   private boolean[] BC01T516_n14107TRMDivNom ;
   private java.math.BigDecimal[] BC01T516_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T516_A14109TRMVenta ;
   private String[] BC01T516_A14110TRMAutMan ;
   private String[] BC01T516_A396EmprCod ;
   private byte[] BC01T516_A14105TRMDivID ;
   private String[] BC01T517_A407EmprNom ;
   private boolean[] BC01T517_n407EmprNom ;
   private String[] BC01T518_A14107TRMDivNom ;
   private boolean[] BC01T518_n14107TRMDivNom ;
   private String[] BC01T519_A407EmprNom ;
   private boolean[] BC01T519_n407EmprNom ;
   private String[] BC01T520_A14107TRMDivNom ;
   private boolean[] BC01T520_n14107TRMDivNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.util.Date[] BC01T52_A14106TRMFecha ;
   private java.math.BigDecimal[] BC01T52_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T52_A14109TRMVenta ;
   private String[] BC01T52_A14110TRMAutMan ;
   private String[] BC01T52_A396EmprCod ;
   private byte[] BC01T52_A14105TRMDivID ;
   private java.util.Date[] BC01T53_A14106TRMFecha ;
   private java.math.BigDecimal[] BC01T53_A14108TRMCompra ;
   private java.math.BigDecimal[] BC01T53_A14109TRMVenta ;
   private String[] BC01T53_A14110TRMAutMan ;
   private String[] BC01T53_A396EmprCod ;
   private byte[] BC01T53_A14105TRMDivID ;
   private String[] BC01T54_A407EmprNom ;
   private String[] BC01T55_A14107TRMDivNom ;
   private boolean[] BC01T54_n407EmprNom ;
   private boolean[] BC01T55_n14107TRMDivNom ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class ttrm_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrm_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01T52", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?  FOR UPDATE OF TRMCompra, TRMVenta, TRMAutMan NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T53", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T54", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T55", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T56", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T57", "SELECT /*+ FIRST_ROWS(100) */ TM1.TRMFecha, T2.EmprNom, T3.DivNom AS TRMDivNom, TM1.TRMCompra, TM1.TRMVenta, TM1.TRMAutMan, TM1.EmprCod, TM1.TRMDivID AS TRMDivID FROM ((TXPTRM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDIVISA T3 ON T3.DivCod = TM1.TRMDivID) WHERE TM1.EmprCod = ? and TM1.TRMDivID = ? and TM1.TRMFecha = ? ORDER BY TM1.EmprCod, TM1.TRMDivID, TM1.TRMFecha ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T58", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T59", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TRMDivID, TRMFecha FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T510", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T511", "SELECT TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID FROM TXPTRM WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?  FOR UPDATE OF TRMCompra, TRMVenta, TRMAutMan NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01T512", "INSERT INTO TXPTRM(TRMFecha, TRMCompra, TRMVenta, TRMAutMan, EmprCod, TRMDivID) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTRM")
         ,new UpdateCursor("BC01T513", "UPDATE TXPTRM SET TRMCompra=?, TRMVenta=?, TRMAutMan=?  WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?", GX_NOMASK, "TXPTRM")
         ,new UpdateCursor("BC01T514", "DELETE FROM TXPTRM  WHERE EmprCod = ? AND TRMDivID = ? AND TRMFecha = ?", GX_NOMASK, "TXPTRM")
         ,new ForEachCursor("BC01T515", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T516", "SELECT /*+ FIRST_ROWS(100) */ TM1.TRMFecha, T2.EmprNom, T3.DivNom AS TRMDivNom, TM1.TRMCompra, TM1.TRMVenta, TM1.TRMAutMan, TM1.EmprCod, TM1.TRMDivID AS TRMDivID FROM ((TXPTRM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDIVISA T3 ON T3.DivCod = TM1.TRMDivID) WHERE TM1.EmprCod = ? and TM1.TRMDivID = ? and TM1.TRMFecha = ? ORDER BY TM1.EmprCod, TM1.TRMDivID, TM1.TRMFecha ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T517", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T518", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T519", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01T520", "SELECT DivNom AS TRMDivNom FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 10 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
      }
   }

}

