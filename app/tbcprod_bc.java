package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbcprod_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbcprod_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbcprod_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbcprod_bc.class ));
   }

   public tbcprod_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1OD1844( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1OD1844( ) ;
      standaloneModal( ) ;
      addRow1OD1844( ) ;
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
         e111OD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z13478BCProducto = A13478BCProducto ;
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

   public void confirm_1OD0( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OD1844( ) ;
         }
         else
         {
            checkExtendedTable1OD1844( ) ;
            if ( AnyError == 0 )
            {
               zm1OD1844( 2) ;
            }
            closeExtendedTableCursors1OD1844( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121OD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV32EmprCod ;
      GXv_char2[0] = A396EmprCod ;
      new app.obtenerempresaprovisional(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      tbcprod_bc.this.AV32EmprCod = GXv_char1[0] ;
      tbcprod_bc.this.A396EmprCod = GXv_char2[0] ;
      GXt_char3 = AV12Station ;
      GXv_char2[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tbcprod_bc.this.GXt_char3 = GXv_char2[0] ;
      AV12Station = GXt_char3 ;
      GXv_char2[0] = AV32EmprCod ;
      GXv_char1[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char1, GXv_char4) ;
      tbcprod_bc.this.AV32EmprCod = GXv_char2[0] ;
      tbcprod_bc.this.AV11EmprNom = GXv_char1[0] ;
      tbcprod_bc.this.AV8UsurCod = GXv_char4[0] ;
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
   }

   public void e111OD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1OD1844( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         Z13479BCDescripc = A13479BCDescripc ;
         Z13480BCPrecio = A13480BCPrecio ;
         Z13481BCUndComp = A13481BCUndComp ;
         Z13482BCProveedo = A13482BCProveedo ;
         Z13483BCProcesad = A13483BCProcesad ;
         Z13484BCError = A13484BCError ;
         Z13485BCDescErro = A13485BCDescErro ;
         Z13486BCFechErro = A13486BCFechErro ;
         Z13487BCPilaErro = A13487BCPilaErro ;
      }
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
      }
      if ( GX_JID == -1 )
      {
         Z13478BCProducto = A13478BCProducto ;
         Z13479BCDescripc = A13479BCDescripc ;
         Z13480BCPrecio = A13480BCPrecio ;
         Z13481BCUndComp = A13481BCUndComp ;
         Z13482BCProveedo = A13482BCProveedo ;
         Z13483BCProcesad = A13483BCProcesad ;
         Z13484BCError = A13484BCError ;
         Z13485BCDescErro = A13485BCDescErro ;
         Z13486BCFechErro = A13486BCFechErro ;
         Z13487BCPilaErro = A13487BCPilaErro ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor BC01OD5 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(1) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01OD5_A407EmprNom[0] ;
      n407EmprNom = BC01OD5_n407EmprNom[0] ;
      pr_default.close(1);
   }

   public void standaloneModal( )
   {
   }

   public void load1OD1844( )
   {
      /* Using cursor BC01OD6 */
      pr_ekamat.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(2) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13479BCDescripc = BC01OD6_A13479BCDescripc[0] ;
         n13479BCDescripc = BC01OD6_n13479BCDescripc[0] ;
         A13480BCPrecio = BC01OD6_A13480BCPrecio[0] ;
         n13480BCPrecio = BC01OD6_n13480BCPrecio[0] ;
         A13481BCUndComp = BC01OD6_A13481BCUndComp[0] ;
         n13481BCUndComp = BC01OD6_n13481BCUndComp[0] ;
         A13482BCProveedo = BC01OD6_A13482BCProveedo[0] ;
         n13482BCProveedo = BC01OD6_n13482BCProveedo[0] ;
         A13483BCProcesad = BC01OD6_A13483BCProcesad[0] ;
         n13483BCProcesad = BC01OD6_n13483BCProcesad[0] ;
         A13484BCError = BC01OD6_A13484BCError[0] ;
         n13484BCError = BC01OD6_n13484BCError[0] ;
         A13485BCDescErro = BC01OD6_A13485BCDescErro[0] ;
         n13485BCDescErro = BC01OD6_n13485BCDescErro[0] ;
         A13486BCFechErro = BC01OD6_A13486BCFechErro[0] ;
         n13486BCFechErro = BC01OD6_n13486BCFechErro[0] ;
         A13487BCPilaErro = BC01OD6_A13487BCPilaErro[0] ;
         n13487BCPilaErro = BC01OD6_n13487BCPilaErro[0] ;
         zm1OD1844( -1) ;
      }
      pr_ekamat.close(2);
      onLoadActions1OD1844( ) ;
   }

   public void onLoadActions1OD1844( )
   {
   }

   public void checkExtendedTable1OD1844( )
   {
      nIsDirty_1844 = (short)(0) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1OD1844( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1OD1844( )
   {
      /* Using cursor BC01OD7 */
      pr_ekamat.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(3) != 101) )
      {
         RcdFound1844 = (short)(1) ;
      }
      else
      {
         RcdFound1844 = (short)(0) ;
      }
      pr_ekamat.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01OD8 */
      pr_ekamat.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(4) != 101) && ( GXutil.strcmp(BC01OD8_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OD1844( 1) ;
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = BC01OD8_A13478BCProducto[0] ;
         n13478BCProducto = BC01OD8_n13478BCProducto[0] ;
         A13479BCDescripc = BC01OD8_A13479BCDescripc[0] ;
         n13479BCDescripc = BC01OD8_n13479BCDescripc[0] ;
         A13480BCPrecio = BC01OD8_A13480BCPrecio[0] ;
         n13480BCPrecio = BC01OD8_n13480BCPrecio[0] ;
         A13481BCUndComp = BC01OD8_A13481BCUndComp[0] ;
         n13481BCUndComp = BC01OD8_n13481BCUndComp[0] ;
         A13482BCProveedo = BC01OD8_A13482BCProveedo[0] ;
         n13482BCProveedo = BC01OD8_n13482BCProveedo[0] ;
         A13483BCProcesad = BC01OD8_A13483BCProcesad[0] ;
         n13483BCProcesad = BC01OD8_n13483BCProcesad[0] ;
         A13484BCError = BC01OD8_A13484BCError[0] ;
         n13484BCError = BC01OD8_n13484BCError[0] ;
         A13485BCDescErro = BC01OD8_A13485BCDescErro[0] ;
         n13485BCDescErro = BC01OD8_n13485BCDescErro[0] ;
         A13486BCFechErro = BC01OD8_A13486BCFechErro[0] ;
         n13486BCFechErro = BC01OD8_n13486BCFechErro[0] ;
         A13487BCPilaErro = BC01OD8_A13487BCPilaErro[0] ;
         n13487BCPilaErro = BC01OD8_n13487BCPilaErro[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
         sMode1844 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1OD1844( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1844 = (short)(0) ;
            initializeNonKey1OD1844( ) ;
         }
         Gx_mode = sMode1844 ;
      }
      else
      {
         RcdFound1844 = (short)(0) ;
         initializeNonKey1OD1844( ) ;
         sMode1844 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode1844 ;
      }
      pr_ekamat.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1OD1844( ) ;
      if ( RcdFound1844 == 0 )
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
      confirm_1OD0( ) ;
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

   public void checkOptimisticConcurrency1OD1844( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01OD9 */
         pr_ekamat.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_ekamat.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PRODUCTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_ekamat.getStatus(5) == 101) || ( GXutil.strcmp(Z13479BCDescripc, BC01OD9_A13479BCDescripc[0]) != 0 ) || ( DecimalUtil.compareTo(Z13480BCPrecio, BC01OD9_A13480BCPrecio[0]) != 0 ) || ( Z13481BCUndComp != BC01OD9_A13481BCUndComp[0] ) || ( GXutil.strcmp(Z13482BCProveedo, BC01OD9_A13482BCProveedo[0]) != 0 ) || ( Z13483BCProcesad != BC01OD9_A13483BCProcesad[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13484BCError != BC01OD9_A13484BCError[0] ) || ( GXutil.strcmp(Z13485BCDescErro, BC01OD9_A13485BCDescErro[0]) != 0 ) || !( GXutil.dateCompare(Z13486BCFechErro, BC01OD9_A13486BCFechErro[0]) ) || ( GXutil.strcmp(Z13487BCPilaErro, BC01OD9_A13487BCPilaErro[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"PRODUCTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OD1844( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OD1844( 0) ;
         checkOptimisticConcurrency1OD1844( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OD1844( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OD1844( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OD10 */
                  pr_ekamat.execute(6, new Object[] {Boolean.valueOf(n13478BCProducto), A13478BCProducto, Boolean.valueOf(n13479BCDescripc), A13479BCDescripc, Boolean.valueOf(n13480BCPrecio), A13480BCPrecio, Boolean.valueOf(n13481BCUndComp), Short.valueOf(A13481BCUndComp), Boolean.valueOf(n13482BCProveedo), A13482BCProveedo, Boolean.valueOf(n13483BCProcesad), Short.valueOf(A13483BCProcesad), Boolean.valueOf(n13484BCError), Short.valueOf(A13484BCError), Boolean.valueOf(n13485BCDescErro), A13485BCDescErro, Boolean.valueOf(n13486BCFechErro), A13486BCFechErro, Boolean.valueOf(n13487BCPilaErro), A13487BCPilaErro, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
                  if ( (pr_ekamat.getStatus(6) == 1) )
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
            load1OD1844( ) ;
         }
         endLevel1OD1844( ) ;
      }
      closeExtendedTableCursors1OD1844( ) ;
   }

   public void update1OD1844( )
   {
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OD1844( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OD1844( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OD1844( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01OD11 */
                  pr_ekamat.execute(7, new Object[] {Boolean.valueOf(n13479BCDescripc), A13479BCDescripc, Boolean.valueOf(n13480BCPrecio), A13480BCPrecio, Boolean.valueOf(n13481BCUndComp), Short.valueOf(A13481BCUndComp), Boolean.valueOf(n13482BCProveedo), A13482BCProveedo, Boolean.valueOf(n13483BCProcesad), Short.valueOf(A13483BCProcesad), Boolean.valueOf(n13484BCError), Short.valueOf(A13484BCError), Boolean.valueOf(n13485BCDescErro), A13485BCDescErro, Boolean.valueOf(n13486BCFechErro), A13486BCFechErro, Boolean.valueOf(n13487BCPilaErro), A13487BCPilaErro, A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
                  if ( (pr_ekamat.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"PRODUCTO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OD1844( ) ;
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
         endLevel1OD1844( ) ;
      }
      closeExtendedTableCursors1OD1844( ) ;
   }

   public void deferredUpdate1OD1844( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1OD1844( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OD1844( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OD1844( ) ;
         afterConfirm1OD1844( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OD1844( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01OD12 */
               pr_ekamat.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("Producto");
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
      sMode1844 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1OD1844( ) ;
      Gx_mode = sMode1844 ;
   }

   public void onDeleteControls1OD1844( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor BC01OD13 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_default.getStatus(2) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(2);
         /* Using cursor BC01OD14 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
         if ( (pr_default.getStatus(3) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Compras Recepcion envio", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(3);
      }
   }

   public void endLevel1OD1844( )
   {
      if ( ! isIns( ) )
      {
         pr_ekamat.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OD1844( ) ;
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

   public void scanKeyStart1OD1844( )
   {
      /* Scan By routine */
      /* Using cursor BC01OD15 */
      pr_ekamat.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      RcdFound1844 = (short)(0) ;
      if ( (pr_ekamat.getStatus(9) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = BC01OD15_A13478BCProducto[0] ;
         n13478BCProducto = BC01OD15_n13478BCProducto[0] ;
         A13479BCDescripc = BC01OD15_A13479BCDescripc[0] ;
         n13479BCDescripc = BC01OD15_n13479BCDescripc[0] ;
         A13480BCPrecio = BC01OD15_A13480BCPrecio[0] ;
         n13480BCPrecio = BC01OD15_n13480BCPrecio[0] ;
         A13481BCUndComp = BC01OD15_A13481BCUndComp[0] ;
         n13481BCUndComp = BC01OD15_n13481BCUndComp[0] ;
         A13482BCProveedo = BC01OD15_A13482BCProveedo[0] ;
         n13482BCProveedo = BC01OD15_n13482BCProveedo[0] ;
         A13483BCProcesad = BC01OD15_A13483BCProcesad[0] ;
         n13483BCProcesad = BC01OD15_n13483BCProcesad[0] ;
         A13484BCError = BC01OD15_A13484BCError[0] ;
         n13484BCError = BC01OD15_n13484BCError[0] ;
         A13485BCDescErro = BC01OD15_A13485BCDescErro[0] ;
         n13485BCDescErro = BC01OD15_n13485BCDescErro[0] ;
         A13486BCFechErro = BC01OD15_A13486BCFechErro[0] ;
         n13486BCFechErro = BC01OD15_n13486BCFechErro[0] ;
         A13487BCPilaErro = BC01OD15_A13487BCPilaErro[0] ;
         n13487BCPilaErro = BC01OD15_n13487BCPilaErro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1OD1844( )
   {
      /* Scan next routine */
      pr_ekamat.readNext(9);
      RcdFound1844 = (short)(0) ;
      scanKeyLoad1OD1844( ) ;
   }

   public void scanKeyLoad1OD1844( )
   {
      sMode1844 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_ekamat.getStatus(9) != 101) )
      {
         RcdFound1844 = (short)(1) ;
         A13478BCProducto = BC01OD15_A13478BCProducto[0] ;
         n13478BCProducto = BC01OD15_n13478BCProducto[0] ;
         A13479BCDescripc = BC01OD15_A13479BCDescripc[0] ;
         n13479BCDescripc = BC01OD15_n13479BCDescripc[0] ;
         A13480BCPrecio = BC01OD15_A13480BCPrecio[0] ;
         n13480BCPrecio = BC01OD15_n13480BCPrecio[0] ;
         A13481BCUndComp = BC01OD15_A13481BCUndComp[0] ;
         n13481BCUndComp = BC01OD15_n13481BCUndComp[0] ;
         A13482BCProveedo = BC01OD15_A13482BCProveedo[0] ;
         n13482BCProveedo = BC01OD15_n13482BCProveedo[0] ;
         A13483BCProcesad = BC01OD15_A13483BCProcesad[0] ;
         n13483BCProcesad = BC01OD15_n13483BCProcesad[0] ;
         A13484BCError = BC01OD15_A13484BCError[0] ;
         n13484BCError = BC01OD15_n13484BCError[0] ;
         A13485BCDescErro = BC01OD15_A13485BCDescErro[0] ;
         n13485BCDescErro = BC01OD15_n13485BCDescErro[0] ;
         A13486BCFechErro = BC01OD15_A13486BCFechErro[0] ;
         n13486BCFechErro = BC01OD15_n13486BCFechErro[0] ;
         A13487BCPilaErro = BC01OD15_A13487BCPilaErro[0] ;
         n13487BCPilaErro = BC01OD15_n13487BCPilaErro[0] ;
      }
      Gx_mode = sMode1844 ;
   }

   public void scanKeyEnd1OD1844( )
   {
      pr_ekamat.close(9);
   }

   public void afterConfirm1OD1844( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OD1844( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OD1844( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OD1844( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OD1844( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OD1844( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OD1844( )
   {
   }

   public void send_integrity_lvl_hashes1OD1844( )
   {
   }

   public void addRow1OD1844( )
   {
      VarsToRow1844( bcTBCPROD) ;
   }

   public void readRow1OD1844( )
   {
      RowToVars1844( bcTBCPROD, 1) ;
   }

   public void initializeNonKey1OD1844( )
   {
      A13479BCDescripc = "" ;
      n13479BCDescripc = false ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      n13480BCPrecio = false ;
      A13481BCUndComp = (short)(0) ;
      n13481BCUndComp = false ;
      A13482BCProveedo = "" ;
      n13482BCProveedo = false ;
      A13483BCProcesad = (short)(0) ;
      n13483BCProcesad = false ;
      A13484BCError = (short)(0) ;
      n13484BCError = false ;
      A13485BCDescErro = "" ;
      n13485BCDescErro = false ;
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      n13486BCFechErro = false ;
      A13487BCPilaErro = "" ;
      n13487BCPilaErro = false ;
      Z13479BCDescripc = "" ;
      Z13480BCPrecio = DecimalUtil.ZERO ;
      Z13481BCUndComp = (short)(0) ;
      Z13482BCProveedo = "" ;
      Z13483BCProcesad = (short)(0) ;
      Z13484BCError = (short)(0) ;
      Z13485BCDescErro = "" ;
      Z13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      Z13487BCPilaErro = "" ;
   }

   public void initAll1OD1844( )
   {
      A13478BCProducto = "" ;
      n13478BCProducto = false ;
      initializeNonKey1OD1844( ) ;
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

   public void VarsToRow1844( app.SdtTBCPROD obj1844 )
   {
      obj1844.setgxTv_SdtTBCPROD_Mode( Gx_mode );
      obj1844.setgxTv_SdtTBCPROD_Emprcod( A396EmprCod );
      obj1844.setgxTv_SdtTBCPROD_Emprnom( A407EmprNom );
      obj1844.setgxTv_SdtTBCPROD_Bcdescripcion( A13479BCDescripc );
      obj1844.setgxTv_SdtTBCPROD_Bcprecio( A13480BCPrecio );
      obj1844.setgxTv_SdtTBCPROD_Bcundcomp( A13481BCUndComp );
      obj1844.setgxTv_SdtTBCPROD_Bcproveedor( A13482BCProveedo );
      obj1844.setgxTv_SdtTBCPROD_Bcprocesado( A13483BCProcesad );
      obj1844.setgxTv_SdtTBCPROD_Bcerror( A13484BCError );
      obj1844.setgxTv_SdtTBCPROD_Bcdescerror( A13485BCDescErro );
      obj1844.setgxTv_SdtTBCPROD_Bcfecherror( A13486BCFechErro );
      obj1844.setgxTv_SdtTBCPROD_Bcpilaerror( A13487BCPilaErro );
      obj1844.setgxTv_SdtTBCPROD_Emprcod( A396EmprCod );
      obj1844.setgxTv_SdtTBCPROD_Bcproducto( A13478BCProducto );
      obj1844.setgxTv_SdtTBCPROD_Emprcod_Z( Z396EmprCod );
      obj1844.setgxTv_SdtTBCPROD_Emprnom_Z( Z407EmprNom );
      obj1844.setgxTv_SdtTBCPROD_Bcproducto_Z( Z13478BCProducto );
      obj1844.setgxTv_SdtTBCPROD_Bcdescripcion_Z( Z13479BCDescripc );
      obj1844.setgxTv_SdtTBCPROD_Bcprecio_Z( Z13480BCPrecio );
      obj1844.setgxTv_SdtTBCPROD_Bcundcomp_Z( Z13481BCUndComp );
      obj1844.setgxTv_SdtTBCPROD_Bcproveedor_Z( Z13482BCProveedo );
      obj1844.setgxTv_SdtTBCPROD_Bcprocesado_Z( Z13483BCProcesad );
      obj1844.setgxTv_SdtTBCPROD_Bcerror_Z( Z13484BCError );
      obj1844.setgxTv_SdtTBCPROD_Bcdescerror_Z( Z13485BCDescErro );
      obj1844.setgxTv_SdtTBCPROD_Bcfecherror_Z( Z13486BCFechErro );
      obj1844.setgxTv_SdtTBCPROD_Bcpilaerror_Z( Z13487BCPilaErro );
      obj1844.setgxTv_SdtTBCPROD_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcproducto_N( (byte)((byte)((n13478BCProducto)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcdescripcion_N( (byte)((byte)((n13479BCDescripc)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcprecio_N( (byte)((byte)((n13480BCPrecio)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcundcomp_N( (byte)((byte)((n13481BCUndComp)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcproveedor_N( (byte)((byte)((n13482BCProveedo)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcprocesado_N( (byte)((byte)((n13483BCProcesad)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcerror_N( (byte)((byte)((n13484BCError)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcdescerror_N( (byte)((byte)((n13485BCDescErro)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcfecherror_N( (byte)((byte)((n13486BCFechErro)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Bcpilaerror_N( (byte)((byte)((n13487BCPilaErro)?1:0)) );
      obj1844.setgxTv_SdtTBCPROD_Mode( Gx_mode );
   }

   public void KeyVarsToRow1844( app.SdtTBCPROD obj1844 )
   {
      obj1844.setgxTv_SdtTBCPROD_Emprcod( A396EmprCod );
      obj1844.setgxTv_SdtTBCPROD_Bcproducto( A13478BCProducto );
   }

   public void RowToVars1844( app.SdtTBCPROD obj1844 ,
                              int forceLoad )
   {
      Gx_mode = obj1844.getgxTv_SdtTBCPROD_Mode() ;
      A396EmprCod = obj1844.getgxTv_SdtTBCPROD_Emprcod() ;
      A407EmprNom = obj1844.getgxTv_SdtTBCPROD_Emprnom() ;
      n407EmprNom = false ;
      A13479BCDescripc = obj1844.getgxTv_SdtTBCPROD_Bcdescripcion() ;
      n13479BCDescripc = false ;
      A13480BCPrecio = obj1844.getgxTv_SdtTBCPROD_Bcprecio() ;
      n13480BCPrecio = false ;
      A13481BCUndComp = obj1844.getgxTv_SdtTBCPROD_Bcundcomp() ;
      n13481BCUndComp = false ;
      A13482BCProveedo = obj1844.getgxTv_SdtTBCPROD_Bcproveedor() ;
      n13482BCProveedo = false ;
      A13483BCProcesad = obj1844.getgxTv_SdtTBCPROD_Bcprocesado() ;
      n13483BCProcesad = false ;
      A13484BCError = obj1844.getgxTv_SdtTBCPROD_Bcerror() ;
      n13484BCError = false ;
      A13485BCDescErro = obj1844.getgxTv_SdtTBCPROD_Bcdescerror() ;
      n13485BCDescErro = false ;
      A13486BCFechErro = obj1844.getgxTv_SdtTBCPROD_Bcfecherror() ;
      n13486BCFechErro = false ;
      A13487BCPilaErro = obj1844.getgxTv_SdtTBCPROD_Bcpilaerror() ;
      n13487BCPilaErro = false ;
      A396EmprCod = obj1844.getgxTv_SdtTBCPROD_Emprcod() ;
      A13478BCProducto = obj1844.getgxTv_SdtTBCPROD_Bcproducto() ;
      n13478BCProducto = false ;
      Z396EmprCod = obj1844.getgxTv_SdtTBCPROD_Emprcod_Z() ;
      Z407EmprNom = obj1844.getgxTv_SdtTBCPROD_Emprnom_Z() ;
      Z13478BCProducto = obj1844.getgxTv_SdtTBCPROD_Bcproducto_Z() ;
      Z13479BCDescripc = obj1844.getgxTv_SdtTBCPROD_Bcdescripcion_Z() ;
      Z13480BCPrecio = obj1844.getgxTv_SdtTBCPROD_Bcprecio_Z() ;
      Z13481BCUndComp = obj1844.getgxTv_SdtTBCPROD_Bcundcomp_Z() ;
      Z13482BCProveedo = obj1844.getgxTv_SdtTBCPROD_Bcproveedor_Z() ;
      Z13483BCProcesad = obj1844.getgxTv_SdtTBCPROD_Bcprocesado_Z() ;
      Z13484BCError = obj1844.getgxTv_SdtTBCPROD_Bcerror_Z() ;
      Z13485BCDescErro = obj1844.getgxTv_SdtTBCPROD_Bcdescerror_Z() ;
      Z13486BCFechErro = obj1844.getgxTv_SdtTBCPROD_Bcfecherror_Z() ;
      Z13487BCPilaErro = obj1844.getgxTv_SdtTBCPROD_Bcpilaerror_Z() ;
      n407EmprNom = (boolean)((obj1844.getgxTv_SdtTBCPROD_Emprnom_N()==0)?false:true) ;
      n13478BCProducto = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcproducto_N()==0)?false:true) ;
      n13479BCDescripc = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcdescripcion_N()==0)?false:true) ;
      n13480BCPrecio = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcprecio_N()==0)?false:true) ;
      n13481BCUndComp = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcundcomp_N()==0)?false:true) ;
      n13482BCProveedo = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcproveedor_N()==0)?false:true) ;
      n13483BCProcesad = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcprocesado_N()==0)?false:true) ;
      n13484BCError = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcerror_N()==0)?false:true) ;
      n13485BCDescErro = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcdescerror_N()==0)?false:true) ;
      n13486BCFechErro = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcfecherror_N()==0)?false:true) ;
      n13487BCPilaErro = (boolean)((obj1844.getgxTv_SdtTBCPROD_Bcpilaerror_N()==0)?false:true) ;
      Gx_mode = obj1844.getgxTv_SdtTBCPROD_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A13478BCProducto = (String)getParm(obj,1) ;
      n13478BCProducto = false ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1OD1844( ) ;
      scanKeyStart1OD1844( ) ;
      if ( RcdFound1844 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01OD16 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(4) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01OD16_A407EmprNom[0] ;
         n407EmprNom = BC01OD16_n407EmprNom[0] ;
         pr_default.close(4);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
      }
      zm1OD1844( -1) ;
      onLoadActions1OD1844( ) ;
      addRow1OD1844( ) ;
      scanKeyEnd1OD1844( ) ;
      if ( RcdFound1844 == 0 )
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
      RowToVars1844( bcTBCPROD, 0) ;
      scanKeyStart1OD1844( ) ;
      if ( RcdFound1844 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01OD17 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(5) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01OD17_A407EmprNom[0] ;
         n407EmprNom = BC01OD17_n407EmprNom[0] ;
         pr_default.close(5);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
      }
      zm1OD1844( -1) ;
      onLoadActions1OD1844( ) ;
      addRow1OD1844( ) ;
      scanKeyEnd1OD1844( ) ;
      if ( RcdFound1844 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OD1844( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1OD1844( ) ;
      }
      else
      {
         if ( RcdFound1844 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
            {
               A13478BCProducto = Z13478BCProducto ;
               n13478BCProducto = false ;
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
               update1OD1844( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
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
                     insert1OD1844( ) ;
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
                     insert1OD1844( ) ;
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
      RowToVars1844( bcTBCPROD, 1) ;
      saveImpl( ) ;
      VarsToRow1844( bcTBCPROD) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars1844( bcTBCPROD, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1OD1844( ) ;
      afterTrn( ) ;
      VarsToRow1844( bcTBCPROD) ;
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
         app.SdtTBCPROD auxBC = new app.SdtTBCPROD( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A13478BCProducto);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTBCPROD);
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
      RowToVars1844( bcTBCPROD, 1) ;
      updateImpl( ) ;
      VarsToRow1844( bcTBCPROD) ;
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
      RowToVars1844( bcTBCPROD, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1OD1844( ) ;
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
      VarsToRow1844( bcTBCPROD) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars1844( bcTBCPROD, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1OD1844( ) ;
      if ( RcdFound1844 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
         {
            A13478BCProducto = Z13478BCProducto ;
            n13478BCProducto = false ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A13478BCProducto, Z13478BCProducto) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbcprod_bc");
      VarsToRow1844( bcTBCPROD) ;
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
      Gx_mode = bcTBCPROD.getgxTv_SdtTBCPROD_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBCPROD.setgxTv_SdtTBCPROD_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTBCPROD sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBCPROD )
      {
         bcTBCPROD = sdt ;
         if ( GXutil.strcmp(bcTBCPROD.getgxTv_SdtTBCPROD_Mode(), "") == 0 )
         {
            bcTBCPROD.setgxTv_SdtTBCPROD_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow1844( bcTBCPROD) ;
         }
         else
         {
            RowToVars1844( bcTBCPROD, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBCPROD.getgxTv_SdtTBCPROD_Mode(), "") == 0 )
         {
            bcTBCPROD.setgxTv_SdtTBCPROD_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars1844( bcTBCPROD, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTBCPROD getTBCPROD_BC( )
   {
      return bcTBCPROD ;
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
      Z13478BCProducto = "" ;
      A13478BCProducto = "" ;
      AV32EmprCod = "" ;
      AV12Station = "" ;
      GXt_char3 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char1 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      Z13479BCDescripc = "" ;
      A13479BCDescripc = "" ;
      Z13480BCPrecio = DecimalUtil.ZERO ;
      A13480BCPrecio = DecimalUtil.ZERO ;
      Z13482BCProveedo = "" ;
      A13482BCProveedo = "" ;
      Z13485BCDescErro = "" ;
      A13485BCDescErro = "" ;
      Z13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      A13486BCFechErro = GXutil.resetTime( GXutil.nullDate() );
      Z13487BCPilaErro = "" ;
      A13487BCPilaErro = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC01OD5_A407EmprNom = new String[] {""} ;
      BC01OD5_n407EmprNom = new boolean[] {false} ;
      BC01OD6_A13478BCProducto = new String[] {""} ;
      BC01OD6_n13478BCProducto = new boolean[] {false} ;
      BC01OD6_A13479BCDescripc = new String[] {""} ;
      BC01OD6_n13479BCDescripc = new boolean[] {false} ;
      BC01OD6_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OD6_n13480BCPrecio = new boolean[] {false} ;
      BC01OD6_A13481BCUndComp = new short[1] ;
      BC01OD6_n13481BCUndComp = new boolean[] {false} ;
      BC01OD6_A13482BCProveedo = new String[] {""} ;
      BC01OD6_n13482BCProveedo = new boolean[] {false} ;
      BC01OD6_A13483BCProcesad = new short[1] ;
      BC01OD6_n13483BCProcesad = new boolean[] {false} ;
      BC01OD6_A13484BCError = new short[1] ;
      BC01OD6_n13484BCError = new boolean[] {false} ;
      BC01OD6_A13485BCDescErro = new String[] {""} ;
      BC01OD6_n13485BCDescErro = new boolean[] {false} ;
      BC01OD6_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OD6_n13486BCFechErro = new boolean[] {false} ;
      BC01OD6_A13487BCPilaErro = new String[] {""} ;
      BC01OD6_n13487BCPilaErro = new boolean[] {false} ;
      BC01OD6_A396EmprCod = new String[] {""} ;
      BC01OD7_A396EmprCod = new String[] {""} ;
      BC01OD7_A13478BCProducto = new String[] {""} ;
      BC01OD7_n13478BCProducto = new boolean[] {false} ;
      BC01OD8_A13478BCProducto = new String[] {""} ;
      BC01OD8_n13478BCProducto = new boolean[] {false} ;
      BC01OD8_A13479BCDescripc = new String[] {""} ;
      BC01OD8_n13479BCDescripc = new boolean[] {false} ;
      BC01OD8_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OD8_n13480BCPrecio = new boolean[] {false} ;
      BC01OD8_A13481BCUndComp = new short[1] ;
      BC01OD8_n13481BCUndComp = new boolean[] {false} ;
      BC01OD8_A13482BCProveedo = new String[] {""} ;
      BC01OD8_n13482BCProveedo = new boolean[] {false} ;
      BC01OD8_A13483BCProcesad = new short[1] ;
      BC01OD8_n13483BCProcesad = new boolean[] {false} ;
      BC01OD8_A13484BCError = new short[1] ;
      BC01OD8_n13484BCError = new boolean[] {false} ;
      BC01OD8_A13485BCDescErro = new String[] {""} ;
      BC01OD8_n13485BCDescErro = new boolean[] {false} ;
      BC01OD8_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OD8_n13486BCFechErro = new boolean[] {false} ;
      BC01OD8_A13487BCPilaErro = new String[] {""} ;
      BC01OD8_n13487BCPilaErro = new boolean[] {false} ;
      BC01OD8_A396EmprCod = new String[] {""} ;
      sMode1844 = "" ;
      BC01OD9_A13478BCProducto = new String[] {""} ;
      BC01OD9_n13478BCProducto = new boolean[] {false} ;
      BC01OD9_A13479BCDescripc = new String[] {""} ;
      BC01OD9_n13479BCDescripc = new boolean[] {false} ;
      BC01OD9_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OD9_n13480BCPrecio = new boolean[] {false} ;
      BC01OD9_A13481BCUndComp = new short[1] ;
      BC01OD9_n13481BCUndComp = new boolean[] {false} ;
      BC01OD9_A13482BCProveedo = new String[] {""} ;
      BC01OD9_n13482BCProveedo = new boolean[] {false} ;
      BC01OD9_A13483BCProcesad = new short[1] ;
      BC01OD9_n13483BCProcesad = new boolean[] {false} ;
      BC01OD9_A13484BCError = new short[1] ;
      BC01OD9_n13484BCError = new boolean[] {false} ;
      BC01OD9_A13485BCDescErro = new String[] {""} ;
      BC01OD9_n13485BCDescErro = new boolean[] {false} ;
      BC01OD9_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OD9_n13486BCFechErro = new boolean[] {false} ;
      BC01OD9_A13487BCPilaErro = new String[] {""} ;
      BC01OD9_n13487BCPilaErro = new boolean[] {false} ;
      BC01OD9_A396EmprCod = new String[] {""} ;
      BC01OD13_A396EmprCod = new String[] {""} ;
      BC01OD13_A13465BCNumeroOP = new int[1] ;
      BC01OD13_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OD13_A13501BCNumero = new short[1] ;
      BC01OD13_A13502BCLinea = new int[1] ;
      BC01OD14_A396EmprCod = new String[] {""} ;
      BC01OD14_A13488BCCPPedido = new int[1] ;
      BC01OD14_A13478BCProducto = new String[] {""} ;
      BC01OD14_n13478BCProducto = new boolean[] {false} ;
      BC01OD15_A13478BCProducto = new String[] {""} ;
      BC01OD15_n13478BCProducto = new boolean[] {false} ;
      BC01OD15_A13479BCDescripc = new String[] {""} ;
      BC01OD15_n13479BCDescripc = new boolean[] {false} ;
      BC01OD15_A13480BCPrecio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01OD15_n13480BCPrecio = new boolean[] {false} ;
      BC01OD15_A13481BCUndComp = new short[1] ;
      BC01OD15_n13481BCUndComp = new boolean[] {false} ;
      BC01OD15_A13482BCProveedo = new String[] {""} ;
      BC01OD15_n13482BCProveedo = new boolean[] {false} ;
      BC01OD15_A13483BCProcesad = new short[1] ;
      BC01OD15_n13483BCProcesad = new boolean[] {false} ;
      BC01OD15_A13484BCError = new short[1] ;
      BC01OD15_n13484BCError = new boolean[] {false} ;
      BC01OD15_A13485BCDescErro = new String[] {""} ;
      BC01OD15_n13485BCDescErro = new boolean[] {false} ;
      BC01OD15_A13486BCFechErro = new java.util.Date[] {GXutil.nullDate()} ;
      BC01OD15_n13486BCFechErro = new boolean[] {false} ;
      BC01OD15_A13487BCPilaErro = new String[] {""} ;
      BC01OD15_n13487BCPilaErro = new boolean[] {false} ;
      BC01OD15_A396EmprCod = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01OD16_A407EmprNom = new String[] {""} ;
      BC01OD16_n407EmprNom = new boolean[] {false} ;
      BC01OD17_A407EmprNom = new String[] {""} ;
      BC01OD17_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbcprod_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbcprod_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbcprod_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbcprod_bc__ekamat(),
         new Object[] {
             new Object[] {
            BC01OD2_A13478BCProducto, BC01OD2_A13479BCDescripc, BC01OD2_n13479BCDescripc, BC01OD2_A13480BCPrecio, BC01OD2_n13480BCPrecio, BC01OD2_A13481BCUndComp, BC01OD2_n13481BCUndComp, BC01OD2_A13482BCProveedo, BC01OD2_n13482BCProveedo, BC01OD2_A13483BCProcesad,
            BC01OD2_n13483BCProcesad, BC01OD2_A13484BCError, BC01OD2_n13484BCError, BC01OD2_A13485BCDescErro, BC01OD2_n13485BCDescErro, BC01OD2_A13486BCFechErro, BC01OD2_n13486BCFechErro, BC01OD2_A13487BCPilaErro, BC01OD2_n13487BCPilaErro, BC01OD2_A396EmprCod
            }
            , new Object[] {
            BC01OD3_A13478BCProducto, BC01OD3_A13479BCDescripc, BC01OD3_n13479BCDescripc, BC01OD3_A13480BCPrecio, BC01OD3_n13480BCPrecio, BC01OD3_A13481BCUndComp, BC01OD3_n13481BCUndComp, BC01OD3_A13482BCProveedo, BC01OD3_n13482BCProveedo, BC01OD3_A13483BCProcesad,
            BC01OD3_n13483BCProcesad, BC01OD3_A13484BCError, BC01OD3_n13484BCError, BC01OD3_A13485BCDescErro, BC01OD3_n13485BCDescErro, BC01OD3_A13486BCFechErro, BC01OD3_n13486BCFechErro, BC01OD3_A13487BCPilaErro, BC01OD3_n13487BCPilaErro, BC01OD3_A396EmprCod
            }
            , new Object[] {
            BC01OD6_A13478BCProducto, BC01OD6_A13479BCDescripc, BC01OD6_n13479BCDescripc, BC01OD6_A13480BCPrecio, BC01OD6_n13480BCPrecio, BC01OD6_A13481BCUndComp, BC01OD6_n13481BCUndComp, BC01OD6_A13482BCProveedo, BC01OD6_n13482BCProveedo, BC01OD6_A13483BCProcesad,
            BC01OD6_n13483BCProcesad, BC01OD6_A13484BCError, BC01OD6_n13484BCError, BC01OD6_A13485BCDescErro, BC01OD6_n13485BCDescErro, BC01OD6_A13486BCFechErro, BC01OD6_n13486BCFechErro, BC01OD6_A13487BCPilaErro, BC01OD6_n13487BCPilaErro, BC01OD6_A396EmprCod
            }
            , new Object[] {
            BC01OD7_A396EmprCod, BC01OD7_A13478BCProducto
            }
            , new Object[] {
            BC01OD8_A13478BCProducto, BC01OD8_A13479BCDescripc, BC01OD8_n13479BCDescripc, BC01OD8_A13480BCPrecio, BC01OD8_n13480BCPrecio, BC01OD8_A13481BCUndComp, BC01OD8_n13481BCUndComp, BC01OD8_A13482BCProveedo, BC01OD8_n13482BCProveedo, BC01OD8_A13483BCProcesad,
            BC01OD8_n13483BCProcesad, BC01OD8_A13484BCError, BC01OD8_n13484BCError, BC01OD8_A13485BCDescErro, BC01OD8_n13485BCDescErro, BC01OD8_A13486BCFechErro, BC01OD8_n13486BCFechErro, BC01OD8_A13487BCPilaErro, BC01OD8_n13487BCPilaErro, BC01OD8_A396EmprCod
            }
            , new Object[] {
            BC01OD9_A13478BCProducto, BC01OD9_A13479BCDescripc, BC01OD9_n13479BCDescripc, BC01OD9_A13480BCPrecio, BC01OD9_n13480BCPrecio, BC01OD9_A13481BCUndComp, BC01OD9_n13481BCUndComp, BC01OD9_A13482BCProveedo, BC01OD9_n13482BCProveedo, BC01OD9_A13483BCProcesad,
            BC01OD9_n13483BCProcesad, BC01OD9_A13484BCError, BC01OD9_n13484BCError, BC01OD9_A13485BCDescErro, BC01OD9_n13485BCDescErro, BC01OD9_A13486BCFechErro, BC01OD9_n13486BCFechErro, BC01OD9_A13487BCPilaErro, BC01OD9_n13487BCPilaErro, BC01OD9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01OD15_A13478BCProducto, BC01OD15_A13479BCDescripc, BC01OD15_n13479BCDescripc, BC01OD15_A13480BCPrecio, BC01OD15_n13480BCPrecio, BC01OD15_A13481BCUndComp, BC01OD15_n13481BCUndComp, BC01OD15_A13482BCProveedo, BC01OD15_n13482BCProveedo, BC01OD15_A13483BCProcesad,
            BC01OD15_n13483BCProcesad, BC01OD15_A13484BCError, BC01OD15_n13484BCError, BC01OD15_A13485BCDescErro, BC01OD15_n13485BCDescErro, BC01OD15_A13486BCFechErro, BC01OD15_n13486BCFechErro, BC01OD15_A13487BCPilaErro, BC01OD15_n13487BCPilaErro, BC01OD15_A396EmprCod
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbcprod_bc__default(),
         new Object[] {
             new Object[] {
            BC01OD4_A407EmprNom, BC01OD4_n407EmprNom
            }
            , new Object[] {
            BC01OD5_A407EmprNom, BC01OD5_n407EmprNom
            }
            , new Object[] {
            BC01OD13_A396EmprCod, BC01OD13_A13465BCNumeroOP, BC01OD13_A13500BCFecCierr, BC01OD13_A13501BCNumero, BC01OD13_A13502BCLinea
            }
            , new Object[] {
            BC01OD14_A396EmprCod, BC01OD14_A13488BCCPPedido, BC01OD14_A13478BCProducto
            }
            , new Object[] {
            BC01OD16_A407EmprNom, BC01OD16_n407EmprNom
            }
            , new Object[] {
            BC01OD17_A407EmprNom, BC01OD17_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121OD2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short Z13481BCUndComp ;
   private short A13481BCUndComp ;
   private short Z13483BCProcesad ;
   private short A13483BCProcesad ;
   private short Z13484BCError ;
   private short A13484BCError ;
   private short RcdFound1844 ;
   private short nIsDirty_1844 ;
   private int trnEnded ;
   private int GX_JID ;
   private java.math.BigDecimal Z13480BCPrecio ;
   private java.math.BigDecimal A13480BCPrecio ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z13478BCProducto ;
   private String A13478BCProducto ;
   private String AV32EmprCod ;
   private String AV12Station ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char1[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z13479BCDescripc ;
   private String A13479BCDescripc ;
   private String Z13482BCProveedo ;
   private String A13482BCProveedo ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String sMode1844 ;
   private java.util.Date Z13486BCFechErro ;
   private java.util.Date A13486BCFechErro ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n13478BCProducto ;
   private boolean n13479BCDescripc ;
   private boolean n13480BCPrecio ;
   private boolean n13481BCUndComp ;
   private boolean n13482BCProveedo ;
   private boolean n13483BCProcesad ;
   private boolean n13484BCError ;
   private boolean n13485BCDescErro ;
   private boolean n13486BCFechErro ;
   private boolean n13487BCPilaErro ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z13485BCDescErro ;
   private String A13485BCDescErro ;
   private String Z13487BCPilaErro ;
   private String A13487BCPilaErro ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private app.SdtTBCPROD bcTBCPROD ;
   private IDataStoreProvider pr_default ;
   private String[] BC01OD5_A407EmprNom ;
   private boolean[] BC01OD5_n407EmprNom ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC01OD6_A13478BCProducto ;
   private boolean[] BC01OD6_n13478BCProducto ;
   private String[] BC01OD6_A13479BCDescripc ;
   private boolean[] BC01OD6_n13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD6_A13480BCPrecio ;
   private boolean[] BC01OD6_n13480BCPrecio ;
   private short[] BC01OD6_A13481BCUndComp ;
   private boolean[] BC01OD6_n13481BCUndComp ;
   private String[] BC01OD6_A13482BCProveedo ;
   private boolean[] BC01OD6_n13482BCProveedo ;
   private short[] BC01OD6_A13483BCProcesad ;
   private boolean[] BC01OD6_n13483BCProcesad ;
   private short[] BC01OD6_A13484BCError ;
   private boolean[] BC01OD6_n13484BCError ;
   private String[] BC01OD6_A13485BCDescErro ;
   private boolean[] BC01OD6_n13485BCDescErro ;
   private java.util.Date[] BC01OD6_A13486BCFechErro ;
   private boolean[] BC01OD6_n13486BCFechErro ;
   private String[] BC01OD6_A13487BCPilaErro ;
   private boolean[] BC01OD6_n13487BCPilaErro ;
   private String[] BC01OD6_A396EmprCod ;
   private String[] BC01OD7_A396EmprCod ;
   private String[] BC01OD7_A13478BCProducto ;
   private boolean[] BC01OD7_n13478BCProducto ;
   private String[] BC01OD8_A13478BCProducto ;
   private boolean[] BC01OD8_n13478BCProducto ;
   private String[] BC01OD8_A13479BCDescripc ;
   private boolean[] BC01OD8_n13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD8_A13480BCPrecio ;
   private boolean[] BC01OD8_n13480BCPrecio ;
   private short[] BC01OD8_A13481BCUndComp ;
   private boolean[] BC01OD8_n13481BCUndComp ;
   private String[] BC01OD8_A13482BCProveedo ;
   private boolean[] BC01OD8_n13482BCProveedo ;
   private short[] BC01OD8_A13483BCProcesad ;
   private boolean[] BC01OD8_n13483BCProcesad ;
   private short[] BC01OD8_A13484BCError ;
   private boolean[] BC01OD8_n13484BCError ;
   private String[] BC01OD8_A13485BCDescErro ;
   private boolean[] BC01OD8_n13485BCDescErro ;
   private java.util.Date[] BC01OD8_A13486BCFechErro ;
   private boolean[] BC01OD8_n13486BCFechErro ;
   private String[] BC01OD8_A13487BCPilaErro ;
   private boolean[] BC01OD8_n13487BCPilaErro ;
   private String[] BC01OD8_A396EmprCod ;
   private String[] BC01OD9_A13478BCProducto ;
   private boolean[] BC01OD9_n13478BCProducto ;
   private String[] BC01OD9_A13479BCDescripc ;
   private boolean[] BC01OD9_n13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD9_A13480BCPrecio ;
   private boolean[] BC01OD9_n13480BCPrecio ;
   private short[] BC01OD9_A13481BCUndComp ;
   private boolean[] BC01OD9_n13481BCUndComp ;
   private String[] BC01OD9_A13482BCProveedo ;
   private boolean[] BC01OD9_n13482BCProveedo ;
   private short[] BC01OD9_A13483BCProcesad ;
   private boolean[] BC01OD9_n13483BCProcesad ;
   private short[] BC01OD9_A13484BCError ;
   private boolean[] BC01OD9_n13484BCError ;
   private String[] BC01OD9_A13485BCDescErro ;
   private boolean[] BC01OD9_n13485BCDescErro ;
   private java.util.Date[] BC01OD9_A13486BCFechErro ;
   private boolean[] BC01OD9_n13486BCFechErro ;
   private String[] BC01OD9_A13487BCPilaErro ;
   private boolean[] BC01OD9_n13487BCPilaErro ;
   private String[] BC01OD9_A396EmprCod ;
   private String[] BC01OD13_A396EmprCod ;
   private int[] BC01OD13_A13465BCNumeroOP ;
   private java.util.Date[] BC01OD13_A13500BCFecCierr ;
   private short[] BC01OD13_A13501BCNumero ;
   private int[] BC01OD13_A13502BCLinea ;
   private String[] BC01OD14_A396EmprCod ;
   private int[] BC01OD14_A13488BCCPPedido ;
   private String[] BC01OD14_A13478BCProducto ;
   private boolean[] BC01OD14_n13478BCProducto ;
   private String[] BC01OD15_A13478BCProducto ;
   private boolean[] BC01OD15_n13478BCProducto ;
   private String[] BC01OD15_A13479BCDescripc ;
   private boolean[] BC01OD15_n13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD15_A13480BCPrecio ;
   private boolean[] BC01OD15_n13480BCPrecio ;
   private short[] BC01OD15_A13481BCUndComp ;
   private boolean[] BC01OD15_n13481BCUndComp ;
   private String[] BC01OD15_A13482BCProveedo ;
   private boolean[] BC01OD15_n13482BCProveedo ;
   private short[] BC01OD15_A13483BCProcesad ;
   private boolean[] BC01OD15_n13483BCProcesad ;
   private short[] BC01OD15_A13484BCError ;
   private boolean[] BC01OD15_n13484BCError ;
   private String[] BC01OD15_A13485BCDescErro ;
   private boolean[] BC01OD15_n13485BCDescErro ;
   private java.util.Date[] BC01OD15_A13486BCFechErro ;
   private boolean[] BC01OD15_n13486BCFechErro ;
   private String[] BC01OD15_A13487BCPilaErro ;
   private boolean[] BC01OD15_n13487BCPilaErro ;
   private String[] BC01OD15_A396EmprCod ;
   private String[] BC01OD16_A407EmprNom ;
   private boolean[] BC01OD16_n407EmprNom ;
   private String[] BC01OD17_A407EmprNom ;
   private boolean[] BC01OD17_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private String[] BC01OD2_A13478BCProducto ;
   private String[] BC01OD2_A13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD2_A13480BCPrecio ;
   private short[] BC01OD2_A13481BCUndComp ;
   private String[] BC01OD2_A13482BCProveedo ;
   private short[] BC01OD2_A13483BCProcesad ;
   private short[] BC01OD2_A13484BCError ;
   private String[] BC01OD2_A13485BCDescErro ;
   private java.util.Date[] BC01OD2_A13486BCFechErro ;
   private String[] BC01OD2_A13487BCPilaErro ;
   private String[] BC01OD2_A396EmprCod ;
   private String[] BC01OD3_A13478BCProducto ;
   private String[] BC01OD3_A13479BCDescripc ;
   private java.math.BigDecimal[] BC01OD3_A13480BCPrecio ;
   private short[] BC01OD3_A13481BCUndComp ;
   private String[] BC01OD3_A13482BCProveedo ;
   private short[] BC01OD3_A13483BCProcesad ;
   private short[] BC01OD3_A13484BCError ;
   private String[] BC01OD3_A13485BCDescErro ;
   private java.util.Date[] BC01OD3_A13486BCFechErro ;
   private String[] BC01OD3_A13487BCPilaErro ;
   private String[] BC01OD3_A396EmprCod ;
   private boolean[] BC01OD2_n13479BCDescripc ;
   private boolean[] BC01OD2_n13480BCPrecio ;
   private boolean[] BC01OD2_n13481BCUndComp ;
   private boolean[] BC01OD2_n13482BCProveedo ;
   private boolean[] BC01OD2_n13483BCProcesad ;
   private boolean[] BC01OD2_n13484BCError ;
   private boolean[] BC01OD2_n13485BCDescErro ;
   private boolean[] BC01OD2_n13486BCFechErro ;
   private boolean[] BC01OD2_n13487BCPilaErro ;
   private boolean[] BC01OD3_n13479BCDescripc ;
   private boolean[] BC01OD3_n13480BCPrecio ;
   private boolean[] BC01OD3_n13481BCUndComp ;
   private boolean[] BC01OD3_n13482BCProveedo ;
   private boolean[] BC01OD3_n13483BCProcesad ;
   private boolean[] BC01OD3_n13484BCError ;
   private boolean[] BC01OD3_n13485BCDescErro ;
   private boolean[] BC01OD3_n13486BCFechErro ;
   private boolean[] BC01OD3_n13487BCPilaErro ;
   private String[] BC01OD4_A407EmprNom ;
   private boolean[] BC01OD4_n407EmprNom ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tbcprod_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbcprod_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01OD2", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (UPDLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD3", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD6", "SELECT TM1.[Producto], TM1.[Descripción], TM1.[Precio], TM1.[Unidad Compra], TM1.[Proveedor], TM1.[Procesado], TM1.[Error], TM1.[Descripción error], TM1.[Fecha y hora error], TM1.[Pila error], TM1.[Emprcod] FROM [Producto] TM1 WITH (NOLOCK) WHERE TM1.[Emprcod] = ? and TM1.[Producto] = ? ORDER BY TM1.[Emprcod], TM1.[Producto]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD7", "SELECT [Emprcod], [Producto] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ?  OPTION (FAST 1)",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD8", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD9", "SELECT [Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod] FROM [Producto] WITH (UPDLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01OD10", "INSERT INTO [Producto]([Producto], [Descripción], [Precio], [Unidad Compra], [Proveedor], [Procesado], [Error], [Descripción error], [Fecha y hora error], [Pila error], [Emprcod]) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC01OD11", "UPDATE [Producto] SET [Descripción]=?, [Precio]=?, [Unidad Compra]=?, [Proveedor]=?, [Procesado]=?, [Error]=?, [Descripción error]=?, [Fecha y hora error]=?, [Pila error]=?  WHERE [Emprcod] = ? AND [Producto] = ?", GX_NOMASK)
         ,new UpdateCursor("BC01OD12", "DELETE FROM [Producto]  WHERE [Emprcod] = ? AND [Producto] = ?", GX_NOMASK)
         ,new ForEachCursor("BC01OD15", "SELECT TM1.[Producto], TM1.[Descripción], TM1.[Precio], TM1.[Unidad Compra], TM1.[Proveedor], TM1.[Procesado], TM1.[Error], TM1.[Descripción error], TM1.[Fecha y hora error], TM1.[Pila error], TM1.[Emprcod] FROM [Producto] TM1 WITH (NOLOCK) WHERE TM1.[Emprcod] = ? and TM1.[Producto] = ? ORDER BY TM1.[Emprcod], TM1.[Producto]  OPTION (FAST 100)",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 200);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 200);
               }
               stmt.setString(11, (String)parms[20], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               stmt.setString(10, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class tbcprod_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01OD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD13", "SELECT * FROM (SELECT EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea FROM TXPOPBCCD WHERE EmprCod = ? AND BCProducto = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01OD14", "SELECT * FROM (SELECT EmprCod, BCCPPedido, BCProducto FROM TXPBCCOMP WHERE EmprCod = ? AND BCProducto = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01OD16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01OD17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

