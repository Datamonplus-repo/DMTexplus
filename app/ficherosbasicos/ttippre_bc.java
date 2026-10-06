package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttippre_bc extends GXWebPanel implements IGxSilentTrn
{
   public ttippre_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttippre_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttippre_bc.class ));
   }

   public ttippre_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow6F1867( ) ;
      standaloneNotModal( ) ;
      initializeNonKey6F1867( ) ;
      standaloneModal( ) ;
      addRow6F1867( ) ;
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
         e116F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z1962TipPreCod = A1962TipPreCod ;
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

   public void confirm_6F0( )
   {
      beforeValidate6F1867( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls6F1867( ) ;
         }
         else
         {
            checkExtendedTable6F1867( ) ;
            if ( AnyError == 0 )
            {
               zm6F1867( 5) ;
            }
            closeExtendedTableCursors6F1867( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e126F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttippre_bc.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttippre_bc.this.A396EmprCod = GXv_char2[0] ;
      ttippre_bc.this.AV16EmprNom = GXv_char3[0] ;
      ttippre_bc.this.AV17UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV31autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      ttippre_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31autonumber = GXt_int5 ;
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttippre_bc.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttippre_bc.this.AV32EmprCod = GXv_char4[0] ;
      ttippre_bc.this.AV16EmprNom = GXv_char3[0] ;
      ttippre_bc.this.AV17UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext7[0] = AV26WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV26WWPContext = GXv_SdtWWPContext7[0] ;
      AV27TrnContext.fromxml(AV28WebSession.getValue("TrnContext"), null, null);
   }

   public void e116F2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm6F1867( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         Z1963TipPreDsc = A1963TipPreDsc ;
         Z13812TipPreDscI = A13812TipPreDscI ;
      }
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z13812TipPreDscI = A13812TipPreDscI ;
      }
      if ( GX_JID == -4 )
      {
         Z1962TipPreCod = A1962TipPreCod ;
         Z1963TipPreDsc = A1963TipPreDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor BC006F5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC006F5_A407EmprNom[0] ;
      n407EmprNom = BC006F5_n407EmprNom[0] ;
      pr_default.close(3);
   }

   public void standaloneModal( )
   {
   }

   public void load6F1867( )
   {
      /* Using cursor BC006F6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1867 = (short)(1) ;
         A407EmprNom = BC006F6_A407EmprNom[0] ;
         n407EmprNom = BC006F6_n407EmprNom[0] ;
         A1963TipPreDsc = BC006F6_A1963TipPreDsc[0] ;
         zm6F1867( -4) ;
      }
      pr_default.close(4);
      onLoadActions6F1867( ) ;
   }

   public void onLoadActions6F1867( )
   {
      A13812TipPreDscI = GXutil.trim( A1963TipPreDsc) + "(" + GXutil.trim( GXutil.str( A1962TipPreCod, 4, 0)) + ")" ;
   }

   public void checkExtendedTable6F1867( )
   {
      nIsDirty_1867 = (short)(0) ;
      standaloneModal( ) ;
      nIsDirty_1867 = (short)(1) ;
      A13812TipPreDscI = GXutil.trim( A1963TipPreDsc) + "(" + GXutil.trim( GXutil.str( A1962TipPreCod, 4, 0)) + ")" ;
   }

   public void closeExtendedTableCursors6F1867( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey6F1867( )
   {
      /* Using cursor BC006F7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1867 = (short)(1) ;
      }
      else
      {
         RcdFound1867 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC006F8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(BC006F8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm6F1867( 4) ;
         RcdFound1867 = (short)(1) ;
         A1962TipPreCod = BC006F8_A1962TipPreCod[0] ;
         A1963TipPreDsc = BC006F8_A1963TipPreDsc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1962TipPreCod = A1962TipPreCod ;
         sMode1867 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load6F1867( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1867 = (short)(0) ;
            initializeNonKey6F1867( ) ;
         }
         Gx_mode = sMode1867 ;
      }
      else
      {
         RcdFound1867 = (short)(0) ;
         initializeNonKey6F1867( ) ;
         sMode1867 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1867 ;
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey6F1867( ) ;
      if ( RcdFound1867 == 0 )
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
      confirm_6F0( ) ;
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

   public void checkOptimisticConcurrency6F1867( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC006F9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
         if ( (pr_default.getStatus(7) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPPRE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(7) == 101) || ( GXutil.strcmp(Z1963TipPreDsc, BC006F9_A1963TipPreDsc[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPPRE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert6F1867( )
   {
      beforeValidate6F1867( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable6F1867( ) ;
      }
      if ( AnyError == 0 )
      {
         zm6F1867( 0) ;
         checkOptimisticConcurrency6F1867( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm6F1867( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert6F1867( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC006F10 */
                  pr_default.execute(8, new Object[] {Short.valueOf(A1962TipPreCod), A1963TipPreDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPPRE");
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
            load6F1867( ) ;
         }
         endLevel6F1867( ) ;
      }
      closeExtendedTableCursors6F1867( ) ;
   }

   public void update6F1867( )
   {
      beforeValidate6F1867( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable6F1867( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency6F1867( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm6F1867( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate6F1867( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC006F11 */
                  pr_default.execute(9, new Object[] {A1963TipPreDsc, A396EmprCod, Short.valueOf(A1962TipPreCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPPRE");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPPRE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate6F1867( ) ;
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
         endLevel6F1867( ) ;
      }
      closeExtendedTableCursors6F1867( ) ;
   }

   public void deferredUpdate6F1867( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate6F1867( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency6F1867( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls6F1867( ) ;
         afterConfirm6F1867( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete6F1867( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC006F12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPPRE");
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
      sMode1867 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel6F1867( ) ;
      Gx_mode = sMode1867 ;
   }

   public void onDeleteControls6F1867( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13812TipPreDscI = GXutil.trim( A1963TipPreDsc) + "(" + GXutil.trim( GXutil.str( A1962TipPreCod, 4, 0)) + ")" ;
      }
   }

   public void endLevel6F1867( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(7);
      }
      if ( AnyError == 0 )
      {
         beforeComplete6F1867( ) ;
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

   public void scanKeyStart6F1867( )
   {
      /* Scan By routine */
      /* Using cursor BC006F13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A1962TipPreCod)});
      RcdFound1867 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1867 = (short)(1) ;
         A1962TipPreCod = BC006F13_A1962TipPreCod[0] ;
         A407EmprNom = BC006F13_A407EmprNom[0] ;
         n407EmprNom = BC006F13_n407EmprNom[0] ;
         A1963TipPreDsc = BC006F13_A1963TipPreDsc[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext6F1867( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1867 = (short)(0) ;
      scanKeyLoad6F1867( ) ;
   }

   public void scanKeyLoad6F1867( )
   {
      sMode1867 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1867 = (short)(1) ;
         A1962TipPreCod = BC006F13_A1962TipPreCod[0] ;
         A407EmprNom = BC006F13_A407EmprNom[0] ;
         n407EmprNom = BC006F13_n407EmprNom[0] ;
         A1963TipPreDsc = BC006F13_A1963TipPreDsc[0] ;
      }
      Gx_mode = sMode1867 ;
   }

   public void scanKeyEnd6F1867( )
   {
      pr_default.close(11);
   }

   public void afterConfirm6F1867( )
   {
      /* After Confirm Rules */
      if ( (0==A1962TipPreCod) && (0==AV31autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert6F1867( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1962TipPreCod) && ( AV31autonumber == 1 ) )
      {
         GXt_int8 = A1962TipPreCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.ttippre_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         ttippre_bc.this.GXt_int8 = GXv_int9[0] ;
         A1962TipPreCod = GXt_int8 ;
      }
   }

   public void beforeUpdate6F1867( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete6F1867( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete6F1867( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate6F1867( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes6F1867( )
   {
   }

   public void send_integrity_lvl_hashes6F1867( )
   {
   }

   public void addRow6F1867( )
   {
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
   }

   public void readRow6F1867( )
   {
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
   }

   public void initializeNonKey6F1867( )
   {
      A13812TipPreDscI = "" ;
      A1963TipPreDsc = "" ;
      Z1963TipPreDsc = "" ;
   }

   public void initAll6F1867( )
   {
      A1962TipPreCod = (short)(0) ;
      initializeNonKey6F1867( ) ;
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

   public void VarsToRow1867( app.ficherosbasicos.SdtTTIPPRE obj1867 )
   {
      obj1867.setgxTv_SdtTTIPPRE_Mode( Gx_mode );
      obj1867.setgxTv_SdtTTIPPRE_Emprcod( A396EmprCod );
      obj1867.setgxTv_SdtTTIPPRE_Tippredscid( A13812TipPreDscI );
      obj1867.setgxTv_SdtTTIPPRE_Emprnom( A407EmprNom );
      obj1867.setgxTv_SdtTTIPPRE_Tippredsc( A1963TipPreDsc );
      obj1867.setgxTv_SdtTTIPPRE_Emprcod( A396EmprCod );
      obj1867.setgxTv_SdtTTIPPRE_Tipprecod( A1962TipPreCod );
      obj1867.setgxTv_SdtTTIPPRE_Emprcod_Z( Z396EmprCod );
      obj1867.setgxTv_SdtTTIPPRE_Emprnom_Z( Z407EmprNom );
      obj1867.setgxTv_SdtTTIPPRE_Tipprecod_Z( Z1962TipPreCod );
      obj1867.setgxTv_SdtTTIPPRE_Tippredsc_Z( Z1963TipPreDsc );
      obj1867.setgxTv_SdtTTIPPRE_Tippredscid_Z( Z13812TipPreDscI );
      obj1867.setgxTv_SdtTTIPPRE_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1867.setgxTv_SdtTTIPPRE_Mode( Gx_mode );
   }

   public void KeyVarsToRow1867( app.ficherosbasicos.SdtTTIPPRE obj1867 )
   {
      obj1867.setgxTv_SdtTTIPPRE_Emprcod( A396EmprCod );
      obj1867.setgxTv_SdtTTIPPRE_Tipprecod( A1962TipPreCod );
   }

   public void RowToVars1867( app.ficherosbasicos.SdtTTIPPRE obj1867 ,
                              int forceLoad )
   {
      Gx_mode = obj1867.getgxTv_SdtTTIPPRE_Mode() ;
      A396EmprCod = obj1867.getgxTv_SdtTTIPPRE_Emprcod() ;
      A13812TipPreDscI = obj1867.getgxTv_SdtTTIPPRE_Tippredscid() ;
      A407EmprNom = obj1867.getgxTv_SdtTTIPPRE_Emprnom() ;
      n407EmprNom = false ;
      A1963TipPreDsc = obj1867.getgxTv_SdtTTIPPRE_Tippredsc() ;
      A396EmprCod = obj1867.getgxTv_SdtTTIPPRE_Emprcod() ;
      A1962TipPreCod = obj1867.getgxTv_SdtTTIPPRE_Tipprecod() ;
      Z396EmprCod = obj1867.getgxTv_SdtTTIPPRE_Emprcod_Z() ;
      Z407EmprNom = obj1867.getgxTv_SdtTTIPPRE_Emprnom_Z() ;
      Z1962TipPreCod = obj1867.getgxTv_SdtTTIPPRE_Tipprecod_Z() ;
      Z1963TipPreDsc = obj1867.getgxTv_SdtTTIPPRE_Tippredsc_Z() ;
      Z13812TipPreDscI = obj1867.getgxTv_SdtTTIPPRE_Tippredscid_Z() ;
      n407EmprNom = (boolean)((obj1867.getgxTv_SdtTTIPPRE_Emprnom_N()==0)?false:true) ;
      Gx_mode = obj1867.getgxTv_SdtTTIPPRE_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A1962TipPreCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.SHORT)).shortValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey6F1867( ) ;
      scanKeyStart6F1867( ) ;
      if ( RcdFound1867 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC006F14 */
         pr_default.execute(12, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(12) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC006F14_A407EmprNom[0] ;
         n407EmprNom = BC006F14_n407EmprNom[0] ;
         pr_default.close(12);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z1962TipPreCod = A1962TipPreCod ;
      }
      zm6F1867( -4) ;
      onLoadActions6F1867( ) ;
      addRow6F1867( ) ;
      scanKeyEnd6F1867( ) ;
      if ( RcdFound1867 == 0 )
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
      RowToVars1867( bcficherosbasicos_TTIPPRE, 0) ;
      scanKeyStart6F1867( ) ;
      if ( RcdFound1867 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC006F15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(13) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC006F15_A407EmprNom[0] ;
         n407EmprNom = BC006F15_n407EmprNom[0] ;
         pr_default.close(13);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z1962TipPreCod = A1962TipPreCod ;
      }
      zm6F1867( -4) ;
      onLoadActions6F1867( ) ;
      addRow6F1867( ) ;
      scanKeyEnd6F1867( ) ;
      if ( RcdFound1867 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey6F1867( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert6F1867( ) ;
      }
      else
      {
         if ( RcdFound1867 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1962TipPreCod != Z1962TipPreCod ) )
            {
               A1962TipPreCod = Z1962TipPreCod ;
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
               update6F1867( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1962TipPreCod != Z1962TipPreCod ) )
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
                     insert6F1867( ) ;
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
                     insert6F1867( ) ;
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
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
      saveImpl( ) ;
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert6F1867( ) ;
      afterTrn( ) ;
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
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
         app.ficherosbasicos.SdtTTIPPRE auxBC = new app.ficherosbasicos.SdtTTIPPRE( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A1962TipPreCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcficherosbasicos_TTIPPRE);
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
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
      updateImpl( ) ;
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
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
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert6F1867( ) ;
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
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1867( bcficherosbasicos_TTIPPRE, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey6F1867( ) ;
      if ( RcdFound1867 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1962TipPreCod != Z1962TipPreCod ) )
         {
            A1962TipPreCod = Z1962TipPreCod ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1962TipPreCod != Z1962TipPreCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.ttippre_bc");
      VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
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
      Gx_mode = bcficherosbasicos_TTIPPRE.getgxTv_SdtTTIPPRE_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcficherosbasicos_TTIPPRE.setgxTv_SdtTTIPPRE_Mode( Gx_mode );
   }

   public void SetSDT( app.ficherosbasicos.SdtTTIPPRE sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcficherosbasicos_TTIPPRE )
      {
         bcficherosbasicos_TTIPPRE = sdt ;
         if ( GXutil.strcmp(bcficherosbasicos_TTIPPRE.getgxTv_SdtTTIPPRE_Mode(), "") == 0 )
         {
            bcficherosbasicos_TTIPPRE.setgxTv_SdtTTIPPRE_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1867( bcficherosbasicos_TTIPPRE) ;
         }
         else
         {
            RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcficherosbasicos_TTIPPRE.getgxTv_SdtTTIPPRE_Mode(), "") == 0 )
         {
            bcficherosbasicos_TTIPPRE.setgxTv_SdtTTIPPRE_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1867( bcficherosbasicos_TTIPPRE, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTTIPPRE getTTIPPRE_BC( )
   {
      return bcficherosbasicos_TTIPPRE ;
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
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      AV32EmprCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV26WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV28WebSession = httpContext.getWebSession();
      Z1963TipPreDsc = "" ;
      A1963TipPreDsc = "" ;
      Z13812TipPreDscI = "" ;
      A13812TipPreDscI = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC006F5_A407EmprNom = new String[] {""} ;
      BC006F5_n407EmprNom = new boolean[] {false} ;
      BC006F6_A1962TipPreCod = new short[1] ;
      BC006F6_A407EmprNom = new String[] {""} ;
      BC006F6_n407EmprNom = new boolean[] {false} ;
      BC006F6_A1963TipPreDsc = new String[] {""} ;
      BC006F6_A396EmprCod = new String[] {""} ;
      BC006F7_A396EmprCod = new String[] {""} ;
      BC006F7_A1962TipPreCod = new short[1] ;
      BC006F8_A1962TipPreCod = new short[1] ;
      BC006F8_A1963TipPreDsc = new String[] {""} ;
      BC006F8_A396EmprCod = new String[] {""} ;
      sMode1867 = "" ;
      BC006F9_A1962TipPreCod = new short[1] ;
      BC006F9_A1963TipPreDsc = new String[] {""} ;
      BC006F9_A396EmprCod = new String[] {""} ;
      BC006F13_A1962TipPreCod = new short[1] ;
      BC006F13_A407EmprNom = new String[] {""} ;
      BC006F13_n407EmprNom = new boolean[] {false} ;
      BC006F13_A1963TipPreDsc = new String[] {""} ;
      BC006F13_A396EmprCod = new String[] {""} ;
      GXv_int9 = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC006F14_A407EmprNom = new String[] {""} ;
      BC006F14_n407EmprNom = new boolean[] {false} ;
      BC006F15_A407EmprNom = new String[] {""} ;
      BC006F15_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttippre_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttippre_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttippre_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttippre_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttippre_bc__default(),
         new Object[] {
             new Object[] {
            BC006F2_A1962TipPreCod, BC006F2_A1963TipPreDsc, BC006F2_A396EmprCod
            }
            , new Object[] {
            BC006F3_A1962TipPreCod, BC006F3_A1963TipPreDsc, BC006F3_A396EmprCod
            }
            , new Object[] {
            BC006F4_A407EmprNom, BC006F4_n407EmprNom
            }
            , new Object[] {
            BC006F5_A407EmprNom, BC006F5_n407EmprNom
            }
            , new Object[] {
            BC006F6_A1962TipPreCod, BC006F6_A407EmprNom, BC006F6_n407EmprNom, BC006F6_A1963TipPreDsc, BC006F6_A396EmprCod
            }
            , new Object[] {
            BC006F7_A396EmprCod, BC006F7_A1962TipPreCod
            }
            , new Object[] {
            BC006F8_A1962TipPreCod, BC006F8_A1963TipPreDsc, BC006F8_A396EmprCod
            }
            , new Object[] {
            BC006F9_A1962TipPreCod, BC006F9_A1963TipPreDsc, BC006F9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC006F13_A1962TipPreCod, BC006F13_A407EmprNom, BC006F13_n407EmprNom, BC006F13_A1963TipPreDsc, BC006F13_A396EmprCod
            }
            , new Object[] {
            BC006F14_A407EmprNom, BC006F14_n407EmprNom
            }
            , new Object[] {
            BC006F15_A407EmprNom, BC006F15_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e126F2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z1962TipPreCod ;
   private short A1962TipPreCod ;
   private short AV31autonumber ;
   private short RcdFound1867 ;
   private short nIsDirty_1867 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
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
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String AV32EmprCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z1963TipPreDsc ;
   private String A1963TipPreDsc ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String sMode1867 ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean mustCommit ;
   private String Z13812TipPreDscI ;
   private String A13812TipPreDscI ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV28WebSession ;
   private app.ficherosbasicos.SdtTTIPPRE bcficherosbasicos_TTIPPRE ;
   private IDataStoreProvider pr_default ;
   private String[] BC006F5_A407EmprNom ;
   private boolean[] BC006F5_n407EmprNom ;
   private short[] BC006F6_A1962TipPreCod ;
   private String[] BC006F6_A407EmprNom ;
   private boolean[] BC006F6_n407EmprNom ;
   private String[] BC006F6_A1963TipPreDsc ;
   private String[] BC006F6_A396EmprCod ;
   private String[] BC006F7_A396EmprCod ;
   private short[] BC006F7_A1962TipPreCod ;
   private short[] BC006F8_A1962TipPreCod ;
   private String[] BC006F8_A1963TipPreDsc ;
   private String[] BC006F8_A396EmprCod ;
   private short[] BC006F9_A1962TipPreCod ;
   private String[] BC006F9_A1963TipPreDsc ;
   private String[] BC006F9_A396EmprCod ;
   private short[] BC006F13_A1962TipPreCod ;
   private String[] BC006F13_A407EmprNom ;
   private boolean[] BC006F13_n407EmprNom ;
   private String[] BC006F13_A1963TipPreDsc ;
   private String[] BC006F13_A396EmprCod ;
   private String[] BC006F14_A407EmprNom ;
   private boolean[] BC006F14_n407EmprNom ;
   private String[] BC006F15_A407EmprNom ;
   private boolean[] BC006F15_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private short[] BC006F2_A1962TipPreCod ;
   private String[] BC006F2_A1963TipPreDsc ;
   private String[] BC006F2_A396EmprCod ;
   private short[] BC006F3_A1962TipPreCod ;
   private String[] BC006F3_A1963TipPreDsc ;
   private String[] BC006F3_A396EmprCod ;
   private String[] BC006F4_A407EmprNom ;
   private boolean[] BC006F4_n407EmprNom ;
   private app.wwpbaseobjects.SdtWWPContext AV26WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV27TrnContext ;
}

final  class ttippre_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttippre_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttippre_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttippre_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttippre_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC006F2", "SELECT TipPreCod, TipPreDsc, EmprCod FROM TXPTIPPRE WHERE EmprCod = ? AND TipPreCod = ?  FOR UPDATE OF TipPreDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F3", "SELECT TipPreCod, TipPreDsc, EmprCod FROM TXPTIPPRE WHERE EmprCod = ? AND TipPreCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F6", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipPreCod, T2.EmprNom, TM1.TipPreDsc, TM1.EmprCod FROM (TXPTIPPRE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipPreCod = ? ORDER BY TM1.EmprCod, TM1.TipPreCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipPreCod FROM TXPTIPPRE WHERE EmprCod = ? AND TipPreCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F8", "SELECT TipPreCod, TipPreDsc, EmprCod FROM TXPTIPPRE WHERE EmprCod = ? AND TipPreCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F9", "SELECT TipPreCod, TipPreDsc, EmprCod FROM TXPTIPPRE WHERE EmprCod = ? AND TipPreCod = ?  FOR UPDATE OF TipPreDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC006F10", "INSERT INTO TXPTIPPRE(TipPreCod, TipPreDsc, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPTIPPRE")
         ,new UpdateCursor("BC006F11", "UPDATE TXPTIPPRE SET TipPreDsc=?  WHERE EmprCod = ? AND TipPreCod = ?", GX_NOMASK, "TXPTIPPRE")
         ,new UpdateCursor("BC006F12", "DELETE FROM TXPTIPPRE  WHERE EmprCod = ? AND TipPreCod = ?", GX_NOMASK, "TXPTIPPRE")
         ,new ForEachCursor("BC006F13", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipPreCod, T2.EmprNom, TM1.TipPreDsc, TM1.EmprCod FROM (TXPTIPPRE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipPreCod = ? ORDER BY TM1.EmprCod, TM1.TipPreCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F14", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC006F15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 11 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 60);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

