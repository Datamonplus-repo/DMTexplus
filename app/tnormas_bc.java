package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnormas_bc extends GXWebPanel implements IGxSilentTrn
{
   public tnormas_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnormas_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnormas_bc.class ));
   }

   public tnormas_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1NE1813( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1NE1813( ) ;
      standaloneModal( ) ;
      addRow1NE1813( ) ;
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
         e111NE2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z13217NormaID = A13217NormaID ;
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

   public void confirm_1NE0( )
   {
      beforeValidate1NE1813( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1NE1813( ) ;
         }
         else
         {
            checkExtendedTable1NE1813( ) ;
            if ( AnyError == 0 )
            {
               zm1NE1813( 3) ;
            }
            closeExtendedTableCursors1NE1813( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121NE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnormas_bc.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnormas_bc.this.A396EmprCod = GXv_char2[0] ;
      tnormas_bc.this.AV11EmprNom = GXv_char3[0] ;
      tnormas_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tnormas_bc.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tnormas_bc.this.AV32EmprCod = GXv_char4[0] ;
      tnormas_bc.this.AV11EmprNom = GXv_char3[0] ;
      tnormas_bc.this.AV8UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
   }

   public void e111NE2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1NE1813( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z13218NormaDsc = A13218NormaDsc ;
         Z13814NormaDscID = A13814NormaDscID ;
      }
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z13814NormaDscID = A13814NormaDscID ;
      }
      if ( GX_JID == -2 )
      {
         Z13217NormaID = A13217NormaID ;
         Z13218NormaDsc = A13218NormaDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor BC01NE5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01NE5_A407EmprNom[0] ;
      n407EmprNom = BC01NE5_n407EmprNom[0] ;
      pr_default.close(3);
   }

   public void standaloneModal( )
   {
   }

   public void load1NE1813( )
   {
      /* Using cursor BC01NE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A13217NormaID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1813 = (short)(1) ;
         A407EmprNom = BC01NE6_A407EmprNom[0] ;
         n407EmprNom = BC01NE6_n407EmprNom[0] ;
         A13218NormaDsc = BC01NE6_A13218NormaDsc[0] ;
         n13218NormaDsc = BC01NE6_n13218NormaDsc[0] ;
         zm1NE1813( -2) ;
      }
      pr_default.close(4);
      onLoadActions1NE1813( ) ;
   }

   public void onLoadActions1NE1813( )
   {
      A13814NormaDscID = GXutil.trim( A13217NormaID) + "-" + GXutil.trim( A13218NormaDsc) ;
   }

   public void checkExtendedTable1NE1813( )
   {
      nIsDirty_1813 = (short)(0) ;
      standaloneModal( ) ;
      nIsDirty_1813 = (short)(1) ;
      A13814NormaDscID = GXutil.trim( A13217NormaID) + "-" + GXutil.trim( A13218NormaDsc) ;
   }

   public void closeExtendedTableCursors1NE1813( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1NE1813( )
   {
      /* Using cursor BC01NE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A13217NormaID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1813 = (short)(1) ;
      }
      else
      {
         RcdFound1813 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01NE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A13217NormaID});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(BC01NE8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1NE1813( 2) ;
         RcdFound1813 = (short)(1) ;
         A13217NormaID = BC01NE8_A13217NormaID[0] ;
         A13218NormaDsc = BC01NE8_A13218NormaDsc[0] ;
         n13218NormaDsc = BC01NE8_n13218NormaDsc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13217NormaID = A13217NormaID ;
         sMode1813 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1NE1813( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1813 = (short)(0) ;
            initializeNonKey1NE1813( ) ;
         }
         Gx_mode = sMode1813 ;
      }
      else
      {
         RcdFound1813 = (short)(0) ;
         initializeNonKey1NE1813( ) ;
         sMode1813 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1813 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey1NE1813( ) ;
      if ( RcdFound1813 == 0 )
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
      confirm_1NE0( ) ;
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

   public void checkOptimisticConcurrency1NE1813( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01NE9 */
         pr_default.execute(7, new Object[] {A396EmprCod, A13217NormaID});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNORMAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z13218NormaDsc, BC01NE9_A13218NormaDsc[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPNORMAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1NE1813( )
   {
      beforeValidate1NE1813( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NE1813( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1NE1813( 0) ;
         checkOptimisticConcurrency1NE1813( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NE1813( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1NE1813( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01NE10 */
                  pr_default.execute(8, new Object[] {A13217NormaID, Boolean.valueOf(n13218NormaDsc), A13218NormaDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNORMAS");
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
            load1NE1813( ) ;
         }
         endLevel1NE1813( ) ;
      }
      closeExtendedTableCursors1NE1813( ) ;
   }

   public void update1NE1813( )
   {
      beforeValidate1NE1813( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1NE1813( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NE1813( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1NE1813( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1NE1813( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01NE11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n13218NormaDsc), A13218NormaDsc, A396EmprCod, A13217NormaID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNORMAS");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPNORMAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1NE1813( ) ;
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
         endLevel1NE1813( ) ;
      }
      closeExtendedTableCursors1NE1813( ) ;
   }

   public void deferredUpdate1NE1813( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1NE1813( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1NE1813( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1NE1813( ) ;
         afterConfirm1NE1813( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1NE1813( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01NE12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A13217NormaID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPNORMAS");
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
      sMode1813 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1NE1813( ) ;
      Gx_mode = sMode1813 ;
   }

   public void onDeleteControls1NE1813( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13814NormaDscID = GXutil.trim( A13217NormaID) + "-" + GXutil.trim( A13218NormaDsc) ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01NE13 */
         pr_default.execute(11, new Object[] {A396EmprCod, A13217NormaID});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC01NE14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A13217NormaID});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC01NE15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A13217NormaID});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC01NE16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A13217NormaID});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel1NE1813( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1NE1813( ) ;
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

   public void scanKeyStart1NE1813( )
   {
      /* Scan By routine */
      /* Using cursor BC01NE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A13217NormaID});
      RcdFound1813 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1813 = (short)(1) ;
         A13217NormaID = BC01NE17_A13217NormaID[0] ;
         A407EmprNom = BC01NE17_A407EmprNom[0] ;
         n407EmprNom = BC01NE17_n407EmprNom[0] ;
         A13218NormaDsc = BC01NE17_A13218NormaDsc[0] ;
         n13218NormaDsc = BC01NE17_n13218NormaDsc[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1NE1813( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1813 = (short)(0) ;
      scanKeyLoad1NE1813( ) ;
   }

   public void scanKeyLoad1NE1813( )
   {
      sMode1813 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1813 = (short)(1) ;
         A13217NormaID = BC01NE17_A13217NormaID[0] ;
         A407EmprNom = BC01NE17_A407EmprNom[0] ;
         n407EmprNom = BC01NE17_n407EmprNom[0] ;
         A13218NormaDsc = BC01NE17_A13218NormaDsc[0] ;
         n13218NormaDsc = BC01NE17_n13218NormaDsc[0] ;
      }
      Gx_mode = sMode1813 ;
   }

   public void scanKeyEnd1NE1813( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1NE1813( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1NE1813( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1NE1813( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1NE1813( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1NE1813( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1NE1813( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1NE1813( )
   {
   }

   public void send_integrity_lvl_hashes1NE1813( )
   {
   }

   public void addRow1NE1813( )
   {
      VarsToRow1813( bcTNORMAS) ;
   }

   public void readRow1NE1813( )
   {
      RowToVars1813( bcTNORMAS, 1) ;
   }

   public void initializeNonKey1NE1813( )
   {
      A13814NormaDscID = "" ;
      A13218NormaDsc = "" ;
      n13218NormaDsc = false ;
      Z13218NormaDsc = "" ;
   }

   public void initAll1NE1813( )
   {
      A13217NormaID = "" ;
      initializeNonKey1NE1813( ) ;
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

   public void VarsToRow1813( app.SdtTNORMAS obj1813 )
   {
      obj1813.setgxTv_SdtTNORMAS_Mode( Gx_mode );
      obj1813.setgxTv_SdtTNORMAS_Emprcod( A396EmprCod );
      obj1813.setgxTv_SdtTNORMAS_Normadscid( A13814NormaDscID );
      obj1813.setgxTv_SdtTNORMAS_Emprnom( A407EmprNom );
      obj1813.setgxTv_SdtTNORMAS_Normadsc( A13218NormaDsc );
      obj1813.setgxTv_SdtTNORMAS_Emprcod( A396EmprCod );
      obj1813.setgxTv_SdtTNORMAS_Normaid( A13217NormaID );
      obj1813.setgxTv_SdtTNORMAS_Emprcod_Z( Z396EmprCod );
      obj1813.setgxTv_SdtTNORMAS_Emprnom_Z( Z407EmprNom );
      obj1813.setgxTv_SdtTNORMAS_Normaid_Z( Z13217NormaID );
      obj1813.setgxTv_SdtTNORMAS_Normadsc_Z( Z13218NormaDsc );
      obj1813.setgxTv_SdtTNORMAS_Normadscid_Z( Z13814NormaDscID );
      obj1813.setgxTv_SdtTNORMAS_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1813.setgxTv_SdtTNORMAS_Normadsc_N( (byte)((byte)((n13218NormaDsc)?1:0)) );
      obj1813.setgxTv_SdtTNORMAS_Mode( Gx_mode );
   }

   public void KeyVarsToRow1813( app.SdtTNORMAS obj1813 )
   {
      obj1813.setgxTv_SdtTNORMAS_Emprcod( A396EmprCod );
      obj1813.setgxTv_SdtTNORMAS_Normaid( A13217NormaID );
   }

   public void RowToVars1813( app.SdtTNORMAS obj1813 ,
                              int forceLoad )
   {
      Gx_mode = obj1813.getgxTv_SdtTNORMAS_Mode() ;
      A396EmprCod = obj1813.getgxTv_SdtTNORMAS_Emprcod() ;
      A13814NormaDscID = obj1813.getgxTv_SdtTNORMAS_Normadscid() ;
      A407EmprNom = obj1813.getgxTv_SdtTNORMAS_Emprnom() ;
      n407EmprNom = false ;
      A13218NormaDsc = obj1813.getgxTv_SdtTNORMAS_Normadsc() ;
      n13218NormaDsc = false ;
      A396EmprCod = obj1813.getgxTv_SdtTNORMAS_Emprcod() ;
      A13217NormaID = obj1813.getgxTv_SdtTNORMAS_Normaid() ;
      Z396EmprCod = obj1813.getgxTv_SdtTNORMAS_Emprcod_Z() ;
      Z407EmprNom = obj1813.getgxTv_SdtTNORMAS_Emprnom_Z() ;
      Z13217NormaID = obj1813.getgxTv_SdtTNORMAS_Normaid_Z() ;
      Z13218NormaDsc = obj1813.getgxTv_SdtTNORMAS_Normadsc_Z() ;
      Z13814NormaDscID = obj1813.getgxTv_SdtTNORMAS_Normadscid_Z() ;
      n407EmprNom = (boolean)((obj1813.getgxTv_SdtTNORMAS_Emprnom_N()==0)?false:true) ;
      n13218NormaDsc = (boolean)((obj1813.getgxTv_SdtTNORMAS_Normadsc_N()==0)?false:true) ;
      Gx_mode = obj1813.getgxTv_SdtTNORMAS_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A13217NormaID = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1NE1813( ) ;
      scanKeyStart1NE1813( ) ;
      if ( RcdFound1813 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01NE18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(16) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01NE18_A407EmprNom[0] ;
         n407EmprNom = BC01NE18_n407EmprNom[0] ;
         pr_default.close(16);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z13217NormaID = A13217NormaID ;
      }
      zm1NE1813( -2) ;
      onLoadActions1NE1813( ) ;
      addRow1NE1813( ) ;
      scanKeyEnd1NE1813( ) ;
      if ( RcdFound1813 == 0 )
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
      RowToVars1813( bcTNORMAS, 0) ;
      scanKeyStart1NE1813( ) ;
      if ( RcdFound1813 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01NE19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01NE19_A407EmprNom[0] ;
         n407EmprNom = BC01NE19_n407EmprNom[0] ;
         pr_default.close(17);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z13217NormaID = A13217NormaID ;
      }
      zm1NE1813( -2) ;
      onLoadActions1NE1813( ) ;
      addRow1NE1813( ) ;
      scanKeyEnd1NE1813( ) ;
      if ( RcdFound1813 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1NE1813( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1NE1813( ) ;
      }
      else
      {
         if ( RcdFound1813 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13217NormaID, Z13217NormaID) != 0 ) )
            {
               A13217NormaID = Z13217NormaID ;
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
               update1NE1813( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13217NormaID, Z13217NormaID) != 0 ) )
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
                     insert1NE1813( ) ;
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
                     insert1NE1813( ) ;
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
      RowToVars1813( bcTNORMAS, 1) ;
      saveImpl( ) ;
      VarsToRow1813( bcTNORMAS) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1813( bcTNORMAS, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1NE1813( ) ;
      afterTrn( ) ;
      VarsToRow1813( bcTNORMAS) ;
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
         app.SdtTNORMAS auxBC = new app.SdtTNORMAS( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A13217NormaID);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTNORMAS);
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
      RowToVars1813( bcTNORMAS, 1) ;
      updateImpl( ) ;
      VarsToRow1813( bcTNORMAS) ;
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
      RowToVars1813( bcTNORMAS, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1NE1813( ) ;
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
      VarsToRow1813( bcTNORMAS) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1813( bcTNORMAS, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1NE1813( ) ;
      if ( RcdFound1813 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13217NormaID, Z13217NormaID) != 0 ) )
         {
            A13217NormaID = Z13217NormaID ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13217NormaID, Z13217NormaID) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tnormas_bc");
      VarsToRow1813( bcTNORMAS) ;
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
      Gx_mode = bcTNORMAS.getgxTv_SdtTNORMAS_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTNORMAS.setgxTv_SdtTNORMAS_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTNORMAS sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTNORMAS )
      {
         bcTNORMAS = sdt ;
         if ( GXutil.strcmp(bcTNORMAS.getgxTv_SdtTNORMAS_Mode(), "") == 0 )
         {
            bcTNORMAS.setgxTv_SdtTNORMAS_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1813( bcTNORMAS) ;
         }
         else
         {
            RowToVars1813( bcTNORMAS, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTNORMAS.getgxTv_SdtTNORMAS_Mode(), "") == 0 )
         {
            bcTNORMAS.setgxTv_SdtTNORMAS_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1813( bcTNORMAS, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTNORMAS getTNORMAS_BC( )
   {
      return bcTNORMAS ;
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
      Z13217NormaID = "" ;
      A13217NormaID = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV32EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      Z13218NormaDsc = "" ;
      A13218NormaDsc = "" ;
      Z13814NormaDscID = "" ;
      A13814NormaDscID = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC01NE5_A407EmprNom = new String[] {""} ;
      BC01NE5_n407EmprNom = new boolean[] {false} ;
      BC01NE6_A13217NormaID = new String[] {""} ;
      BC01NE6_A407EmprNom = new String[] {""} ;
      BC01NE6_n407EmprNom = new boolean[] {false} ;
      BC01NE6_A13218NormaDsc = new String[] {""} ;
      BC01NE6_n13218NormaDsc = new boolean[] {false} ;
      BC01NE6_A396EmprCod = new String[] {""} ;
      BC01NE7_A396EmprCod = new String[] {""} ;
      BC01NE7_A13217NormaID = new String[] {""} ;
      BC01NE8_A13217NormaID = new String[] {""} ;
      BC01NE8_A13218NormaDsc = new String[] {""} ;
      BC01NE8_n13218NormaDsc = new boolean[] {false} ;
      BC01NE8_A396EmprCod = new String[] {""} ;
      sMode1813 = "" ;
      BC01NE9_A13217NormaID = new String[] {""} ;
      BC01NE9_A13218NormaDsc = new String[] {""} ;
      BC01NE9_n13218NormaDsc = new boolean[] {false} ;
      BC01NE9_A396EmprCod = new String[] {""} ;
      BC01NE13_A396EmprCod = new String[] {""} ;
      BC01NE13_A719PrdNum = new String[] {""} ;
      BC01NE13_A13217NormaID = new String[] {""} ;
      BC01NE14_A396EmprCod = new String[] {""} ;
      BC01NE14_A5532Lb_numero = new int[1] ;
      BC01NE14_A13379LbNormaID = new String[] {""} ;
      BC01NE15_A396EmprCod = new String[] {""} ;
      BC01NE15_A252CliCod = new int[1] ;
      BC01NE15_A494ForSer = new String[] {""} ;
      BC01NE15_A482ForColNom = new String[] {""} ;
      BC01NE15_A483ForColNum = new int[1] ;
      BC01NE15_A831TipColCod = new byte[1] ;
      BC01NE15_A13377ForNormaID = new String[] {""} ;
      BC01NE16_A396EmprCod = new String[] {""} ;
      BC01NE16_A361DisCod = new int[1] ;
      BC01NE16_A13213DisNormID = new String[] {""} ;
      BC01NE17_A13217NormaID = new String[] {""} ;
      BC01NE17_A407EmprNom = new String[] {""} ;
      BC01NE17_n407EmprNom = new boolean[] {false} ;
      BC01NE17_A13218NormaDsc = new String[] {""} ;
      BC01NE17_n13218NormaDsc = new boolean[] {false} ;
      BC01NE17_A396EmprCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01NE18_A407EmprNom = new String[] {""} ;
      BC01NE18_n407EmprNom = new boolean[] {false} ;
      BC01NE19_A407EmprNom = new String[] {""} ;
      BC01NE19_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnormas_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnormas_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnormas_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnormas_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnormas_bc__default(),
         new Object[] {
             new Object[] {
            BC01NE2_A13217NormaID, BC01NE2_A13218NormaDsc, BC01NE2_n13218NormaDsc, BC01NE2_A396EmprCod
            }
            , new Object[] {
            BC01NE3_A13217NormaID, BC01NE3_A13218NormaDsc, BC01NE3_n13218NormaDsc, BC01NE3_A396EmprCod
            }
            , new Object[] {
            BC01NE4_A407EmprNom, BC01NE4_n407EmprNom
            }
            , new Object[] {
            BC01NE5_A407EmprNom, BC01NE5_n407EmprNom
            }
            , new Object[] {
            BC01NE6_A13217NormaID, BC01NE6_A407EmprNom, BC01NE6_n407EmprNom, BC01NE6_A13218NormaDsc, BC01NE6_n13218NormaDsc, BC01NE6_A396EmprCod
            }
            , new Object[] {
            BC01NE7_A396EmprCod, BC01NE7_A13217NormaID
            }
            , new Object[] {
            BC01NE8_A13217NormaID, BC01NE8_A13218NormaDsc, BC01NE8_n13218NormaDsc, BC01NE8_A396EmprCod
            }
            , new Object[] {
            BC01NE9_A13217NormaID, BC01NE9_A13218NormaDsc, BC01NE9_n13218NormaDsc, BC01NE9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01NE13_A396EmprCod, BC01NE13_A719PrdNum, BC01NE13_A13217NormaID
            }
            , new Object[] {
            BC01NE14_A396EmprCod, BC01NE14_A5532Lb_numero, BC01NE14_A13379LbNormaID
            }
            , new Object[] {
            BC01NE15_A396EmprCod, BC01NE15_A252CliCod, BC01NE15_A494ForSer, BC01NE15_A482ForColNom, BC01NE15_A483ForColNum, BC01NE15_A831TipColCod, BC01NE15_A13377ForNormaID
            }
            , new Object[] {
            BC01NE16_A396EmprCod, BC01NE16_A361DisCod, BC01NE16_A13213DisNormID
            }
            , new Object[] {
            BC01NE17_A13217NormaID, BC01NE17_A407EmprNom, BC01NE17_n407EmprNom, BC01NE17_A13218NormaDsc, BC01NE17_n13218NormaDsc, BC01NE17_A396EmprCod
            }
            , new Object[] {
            BC01NE18_A407EmprNom, BC01NE18_n407EmprNom
            }
            , new Object[] {
            BC01NE19_A407EmprNom, BC01NE19_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121NE2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1813 ;
   private short nIsDirty_1813 ;
   private int trnEnded ;
   private int GX_JID ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z13217NormaID ;
   private String A13217NormaID ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String AV32EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13218NormaDsc ;
   private String A13218NormaDsc ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String sMode1813 ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n13218NormaDsc ;
   private boolean mustCommit ;
   private String Z13814NormaDscID ;
   private String A13814NormaDscID ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private app.SdtTNORMAS bcTNORMAS ;
   private IDataStoreProvider pr_default ;
   private String[] BC01NE5_A407EmprNom ;
   private boolean[] BC01NE5_n407EmprNom ;
   private String[] BC01NE6_A13217NormaID ;
   private String[] BC01NE6_A407EmprNom ;
   private boolean[] BC01NE6_n407EmprNom ;
   private String[] BC01NE6_A13218NormaDsc ;
   private boolean[] BC01NE6_n13218NormaDsc ;
   private String[] BC01NE6_A396EmprCod ;
   private String[] BC01NE7_A396EmprCod ;
   private String[] BC01NE7_A13217NormaID ;
   private String[] BC01NE8_A13217NormaID ;
   private String[] BC01NE8_A13218NormaDsc ;
   private boolean[] BC01NE8_n13218NormaDsc ;
   private String[] BC01NE8_A396EmprCod ;
   private String[] BC01NE9_A13217NormaID ;
   private String[] BC01NE9_A13218NormaDsc ;
   private boolean[] BC01NE9_n13218NormaDsc ;
   private String[] BC01NE9_A396EmprCod ;
   private String[] BC01NE13_A396EmprCod ;
   private String[] BC01NE13_A719PrdNum ;
   private String[] BC01NE13_A13217NormaID ;
   private String[] BC01NE14_A396EmprCod ;
   private int[] BC01NE14_A5532Lb_numero ;
   private String[] BC01NE14_A13379LbNormaID ;
   private String[] BC01NE15_A396EmprCod ;
   private int[] BC01NE15_A252CliCod ;
   private String[] BC01NE15_A494ForSer ;
   private String[] BC01NE15_A482ForColNom ;
   private int[] BC01NE15_A483ForColNum ;
   private byte[] BC01NE15_A831TipColCod ;
   private String[] BC01NE15_A13377ForNormaID ;
   private String[] BC01NE16_A396EmprCod ;
   private int[] BC01NE16_A361DisCod ;
   private String[] BC01NE16_A13213DisNormID ;
   private String[] BC01NE17_A13217NormaID ;
   private String[] BC01NE17_A407EmprNom ;
   private boolean[] BC01NE17_n407EmprNom ;
   private String[] BC01NE17_A13218NormaDsc ;
   private boolean[] BC01NE17_n13218NormaDsc ;
   private String[] BC01NE17_A396EmprCod ;
   private String[] BC01NE18_A407EmprNom ;
   private boolean[] BC01NE18_n407EmprNom ;
   private String[] BC01NE19_A407EmprNom ;
   private boolean[] BC01NE19_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01NE2_A13217NormaID ;
   private String[] BC01NE2_A13218NormaDsc ;
   private String[] BC01NE2_A396EmprCod ;
   private String[] BC01NE3_A13217NormaID ;
   private String[] BC01NE3_A13218NormaDsc ;
   private String[] BC01NE3_A396EmprCod ;
   private String[] BC01NE4_A407EmprNom ;
   private boolean[] BC01NE2_n13218NormaDsc ;
   private boolean[] BC01NE3_n13218NormaDsc ;
   private boolean[] BC01NE4_n407EmprNom ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tnormas_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnormas_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnormas_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnormas_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnormas_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01NE2", "SELECT NormaID, NormaDsc, EmprCod FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ?  FOR UPDATE OF NormaDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE3", "SELECT NormaID, NormaDsc, EmprCod FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE6", "SELECT /*+ FIRST_ROWS(100) */ TM1.NormaID, T2.EmprNom, TM1.NormaDsc, TM1.EmprCod FROM (TXPNORMAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.NormaID = ? ORDER BY TM1.EmprCod, TM1.NormaID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, NormaID FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE8", "SELECT NormaID, NormaDsc, EmprCod FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE9", "SELECT NormaID, NormaDsc, EmprCod FROM TXPNORMAS WHERE EmprCod = ? AND NormaID = ?  FOR UPDATE OF NormaDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01NE10", "INSERT INTO TXPNORMAS(NormaID, NormaDsc, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPNORMAS")
         ,new UpdateCursor("BC01NE11", "UPDATE TXPNORMAS SET NormaDsc=?  WHERE EmprCod = ? AND NormaID = ?", GX_NOMASK, "TXPNORMAS")
         ,new UpdateCursor("BC01NE12", "DELETE FROM TXPNORMAS  WHERE EmprCod = ? AND NormaID = ?", GX_NOMASK, "TXPNORMAS")
         ,new ForEachCursor("BC01NE13", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND NormaID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01NE14", "SELECT * FROM (SELECT EmprCod, Lb_numero, LbNormaID FROM TXPLBDNOR WHERE EmprCod = ? AND LbNormaID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01NE15", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForNormaID FROM TXPFORNOR WHERE EmprCod = ? AND ForNormaID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01NE16", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisNormID = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01NE17", "SELECT /*+ FIRST_ROWS(100) */ TM1.NormaID, T2.EmprNom, TM1.NormaDsc, TM1.EmprCod FROM (TXPNORMAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.NormaID = ? ORDER BY TM1.EmprCod, TM1.NormaID ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01NE19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
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
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 4);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 60);
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 4);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

