package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_detalle_bc extends GXWebPanel implements IGxSilentTrn
{
   public salidasmanualesproductos_detalle_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_detalle_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_detalle_bc.class ));
   }

   public salidasmanualesproductos_detalle_bc( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1QZ112( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1QZ112( ) ;
      standaloneModal( ) ;
      addRow1QZ112( ) ;
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
            Z396EmprCod = A396EmprCod ;
            Z859CumCodCont = A859CumCodCont ;
            Z719PrdNum = A719PrdNum ;
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

   public void confirm_1QZ0( )
   {
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1QZ112( ) ;
         }
         else
         {
            checkExtendedTable1QZ112( ) ;
            if ( AnyError == 0 )
            {
               zm1QZ112( 5) ;
               zm1QZ112( 6) ;
               zm1QZ112( 7) ;
               zm1QZ112( 8) ;
            }
            closeExtendedTableCursors1QZ112( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void zm1QZ112( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         Z860CumConCant = A860CumConCant ;
         Z861CumConCbis = A861CumConCbis ;
         Z5862CumConLot = A5862CumConLot ;
         Z8639CumUnidad = A8639CumUnidad ;
         Z12257PrdComID = A12257PrdComID ;
         Z12700CumUMed = A12700CumUMed ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z863CumCosPro = A863CumCosPro ;
         Z3835UltFecCCs = A3835UltFecCCs ;
      }
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z863CumCosPro = A863CumCosPro ;
         Z3835UltFecCCs = A3835UltFecCCs ;
      }
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z750PrdValStk = A750PrdValStk ;
         Z10881PrdLote = A10881PrdLote ;
         Z863CumCosPro = A863CumCosPro ;
         Z3835UltFecCCs = A3835UltFecCCs ;
      }
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         Z488ForPrdDsc = A488ForPrdDsc ;
         Z863CumCosPro = A863CumCosPro ;
         Z3835UltFecCCs = A3835UltFecCCs ;
      }
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z863CumCosPro = A863CumCosPro ;
         Z3835UltFecCCs = A3835UltFecCCs ;
      }
      if ( GX_JID == -4 )
      {
         Z860CumConCant = A860CumConCant ;
         Z861CumConCbis = A861CumConCbis ;
         Z5862CumConLot = A5862CumConLot ;
         Z8639CumUnidad = A8639CumUnidad ;
         Z12257PrdComID = A12257PrdComID ;
         Z12700CumUMed = A12700CumUMed ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z859CumCodCont = A859CumCodCont ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z750PrdValStk = A750PrdValStk ;
         Z10881PrdLote = A10881PrdLote ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load1QZ112( )
   {
      /* Using cursor BC01QZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A407EmprNom = BC01QZ8_A407EmprNom[0] ;
         n407EmprNom = BC01QZ8_n407EmprNom[0] ;
         A718PrdNom = BC01QZ8_A718PrdNom[0] ;
         A860CumConCant = BC01QZ8_A860CumConCant[0] ;
         A861CumConCbis = BC01QZ8_A861CumConCbis[0] ;
         A724PrdPreAct = BC01QZ8_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ8_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ8_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ8_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ8_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ8_A707PrdFacCon[0] ;
         A5862CumConLot = BC01QZ8_A5862CumConLot[0] ;
         A750PrdValStk = BC01QZ8_A750PrdValStk[0] ;
         A488ForPrdDsc = BC01QZ8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = BC01QZ8_n488ForPrdDsc[0] ;
         A8639CumUnidad = BC01QZ8_A8639CumUnidad[0] ;
         A12257PrdComID = BC01QZ8_A12257PrdComID[0] ;
         A10881PrdLote = BC01QZ8_A10881PrdLote[0] ;
         A12700CumUMed = BC01QZ8_A12700CumUMed[0] ;
         A3915EmpNumDec = BC01QZ8_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ8_n3915EmpNumDec[0] ;
         A490ForPrdUMe = BC01QZ8_A490ForPrdUMe[0] ;
         zm1QZ112( -4) ;
      }
      pr_default.close(6);
      onLoadActions1QZ112( ) ;
   }

   public void onLoadActions1QZ112( )
   {
      if ( A3915EmpNumDec == 0 )
      {
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
         }
         else
         {
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
         }
      }
      GXt_date1 = A3835UltFecCCs ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4) ;
      salidasmanualesproductos_detalle_bc.this.A396EmprCod = GXv_char2[0] ;
      salidasmanualesproductos_detalle_bc.this.A719PrdNum = GXv_char3[0] ;
      salidasmanualesproductos_detalle_bc.this.GXt_date1 = GXv_date4[0] ;
      A3835UltFecCCs = GXt_date1 ;
   }

   public void checkExtendedTable1QZ112( )
   {
      nIsDirty_112 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01QZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01QZ9_A407EmprNom[0] ;
      n407EmprNom = BC01QZ9_n407EmprNom[0] ;
      A3915EmpNumDec = BC01QZ9_A3915EmpNumDec[0] ;
      n3915EmpNumDec = BC01QZ9_n3915EmpNumDec[0] ;
      pr_default.close(7);
      /* Using cursor BC01QZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
      }
      A488ForPrdDsc = BC01QZ10_A488ForPrdDsc[0] ;
      n488ForPrdDsc = BC01QZ10_n488ForPrdDsc[0] ;
      pr_default.close(8);
      /* Using cursor BC01QZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
      }
      pr_default.close(9);
      /* Using cursor BC01QZ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      A718PrdNom = BC01QZ12_A718PrdNom[0] ;
      A724PrdPreAct = BC01QZ12_A724PrdPreAct[0] ;
      A704PrdExiAlm = BC01QZ12_A704PrdExiAlm[0] ;
      A705PrdExiCC = BC01QZ12_A705PrdExiCC[0] ;
      A685PrdCanRes = BC01QZ12_A685PrdCanRes[0] ;
      A726PrdPreMed = BC01QZ12_A726PrdPreMed[0] ;
      A707PrdFacCon = BC01QZ12_A707PrdFacCon[0] ;
      A750PrdValStk = BC01QZ12_A750PrdValStk[0] ;
      A10881PrdLote = BC01QZ12_A10881PrdLote[0] ;
      pr_default.close(10);
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
         }
         else
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
         }
      }
      nIsDirty_112 = (short)(1) ;
      GXt_date1 = A3835UltFecCCs ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
      salidasmanualesproductos_detalle_bc.this.A396EmprCod = GXv_char3[0] ;
      salidasmanualesproductos_detalle_bc.this.A719PrdNum = GXv_char2[0] ;
      salidasmanualesproductos_detalle_bc.this.GXt_date1 = GXv_date4[0] ;
      A3835UltFecCCs = GXt_date1 ;
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1QZ112( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void getKey1QZ112( )
   {
      /* Using cursor BC01QZ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound112 = (short)(1) ;
      }
      else
      {
         RcdFound112 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01QZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         zm1QZ112( 4) ;
         RcdFound112 = (short)(1) ;
         A860CumConCant = BC01QZ14_A860CumConCant[0] ;
         A861CumConCbis = BC01QZ14_A861CumConCbis[0] ;
         A5862CumConLot = BC01QZ14_A5862CumConLot[0] ;
         A8639CumUnidad = BC01QZ14_A8639CumUnidad[0] ;
         A12257PrdComID = BC01QZ14_A12257PrdComID[0] ;
         A12700CumUMed = BC01QZ14_A12700CumUMed[0] ;
         A396EmprCod = BC01QZ14_A396EmprCod[0] ;
         A719PrdNum = BC01QZ14_A719PrdNum[0] ;
         A490ForPrdUMe = BC01QZ14_A490ForPrdUMe[0] ;
         A859CumCodCont = BC01QZ14_A859CumCodCont[0] ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1QZ112( ) ;
         if ( AnyError == 1 )
         {
            RcdFound112 = (short)(0) ;
            initializeNonKey1QZ112( ) ;
         }
         Gx_mode = sMode112 ;
      }
      else
      {
         RcdFound112 = (short)(0) ;
         initializeNonKey1QZ112( ) ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode112 ;
      }
      pr_default.close(12);
   }

   public void getEqualNoModal( )
   {
      getKey1QZ112( ) ;
      if ( RcdFound112 == 0 )
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
      confirm_1QZ0( ) ;
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

   public void checkOptimisticConcurrency1QZ112( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01QZ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
         if ( (pr_default.getStatus(13) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(13) == 101) || ( DecimalUtil.compareTo(Z860CumConCant, BC01QZ15_A860CumConCant[0]) != 0 ) || ( DecimalUtil.compareTo(Z861CumConCbis, BC01QZ15_A861CumConCbis[0]) != 0 ) || ( GXutil.strcmp(Z5862CumConLot, BC01QZ15_A5862CumConLot[0]) != 0 ) || ( Z8639CumUnidad != BC01QZ15_A8639CumUnidad[0] ) || ( GXutil.strcmp(Z12257PrdComID, BC01QZ15_A12257PrdComID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12700CumUMed != BC01QZ15_A12700CumUMed[0] ) || ( Z490ForPrdUMe != BC01QZ15_A490ForPrdUMe[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QZ112( )
   {
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QZ112( 0) ;
         checkOptimisticConcurrency1QZ112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QZ112( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QZ112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01QZ16 */
                  pr_default.execute(14, new Object[] {A860CumConCant, A861CumConCbis, A5862CumConLot, Byte.valueOf(A8639CumUnidad), A12257PrdComID, Byte.valueOf(A12700CumUMed), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
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
            load1QZ112( ) ;
         }
         endLevel1QZ112( ) ;
      }
      closeExtendedTableCursors1QZ112( ) ;
   }

   public void update1QZ112( )
   {
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QZ112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QZ112( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QZ112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01QZ17 */
                  pr_default.execute(15, new Object[] {A860CumConCant, A861CumConCbis, A5862CumConLot, Byte.valueOf(A8639CumUnidad), A12257PrdComID, Byte.valueOf(A12700CumUMed), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QZ112( ) ;
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
         endLevel1QZ112( ) ;
      }
      closeExtendedTableCursors1QZ112( ) ;
   }

   public void deferredUpdate1QZ112( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QZ112( ) ;
         afterConfirm1QZ112( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QZ112( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01QZ18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
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
      sMode112 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1QZ112( ) ;
      Gx_mode = sMode112 ;
   }

   public void onDeleteControls1QZ112( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC01QZ19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = BC01QZ19_A407EmprNom[0] ;
         n407EmprNom = BC01QZ19_n407EmprNom[0] ;
         A3915EmpNumDec = BC01QZ19_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ19_n3915EmpNumDec[0] ;
         pr_default.close(17);
         /* Using cursor BC01QZ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = BC01QZ20_A718PrdNom[0] ;
         A724PrdPreAct = BC01QZ20_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ20_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ20_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ20_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ20_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ20_A707PrdFacCon[0] ;
         A750PrdValStk = BC01QZ20_A750PrdValStk[0] ;
         A10881PrdLote = BC01QZ20_A10881PrdLote[0] ;
         pr_default.close(18);
         GXt_date1 = A3835UltFecCCs ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_date4[0] = GXt_date1 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
         salidasmanualesproductos_detalle_bc.this.A396EmprCod = GXv_char3[0] ;
         salidasmanualesproductos_detalle_bc.this.A719PrdNum = GXv_char2[0] ;
         salidasmanualesproductos_detalle_bc.this.GXt_date1 = GXv_date4[0] ;
         A3835UltFecCCs = GXt_date1 ;
         if ( A3915EmpNumDec == 0 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            }
            else
            {
               A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Using cursor BC01QZ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = BC01QZ21_A488ForPrdDsc[0] ;
         n488ForPrdDsc = BC01QZ21_n488ForPrdDsc[0] ;
         pr_default.close(19);
      }
   }

   public void endLevel1QZ112( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QZ112( ) ;
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

   public void scanKeyStart1QZ112( )
   {
      /* Using cursor BC01QZ22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A859CumCodCont)});
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A407EmprNom = BC01QZ22_A407EmprNom[0] ;
         n407EmprNom = BC01QZ22_n407EmprNom[0] ;
         A718PrdNom = BC01QZ22_A718PrdNom[0] ;
         A860CumConCant = BC01QZ22_A860CumConCant[0] ;
         A861CumConCbis = BC01QZ22_A861CumConCbis[0] ;
         A724PrdPreAct = BC01QZ22_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ22_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ22_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ22_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ22_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ22_A707PrdFacCon[0] ;
         A5862CumConLot = BC01QZ22_A5862CumConLot[0] ;
         A750PrdValStk = BC01QZ22_A750PrdValStk[0] ;
         A488ForPrdDsc = BC01QZ22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = BC01QZ22_n488ForPrdDsc[0] ;
         A8639CumUnidad = BC01QZ22_A8639CumUnidad[0] ;
         A12257PrdComID = BC01QZ22_A12257PrdComID[0] ;
         A10881PrdLote = BC01QZ22_A10881PrdLote[0] ;
         A12700CumUMed = BC01QZ22_A12700CumUMed[0] ;
         A3915EmpNumDec = BC01QZ22_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ22_n3915EmpNumDec[0] ;
         A396EmprCod = BC01QZ22_A396EmprCod[0] ;
         A719PrdNum = BC01QZ22_A719PrdNum[0] ;
         A490ForPrdUMe = BC01QZ22_A490ForPrdUMe[0] ;
         A859CumCodCont = BC01QZ22_A859CumCodCont[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1QZ112( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound112 = (short)(0) ;
      scanKeyLoad1QZ112( ) ;
   }

   public void scanKeyLoad1QZ112( )
   {
      sMode112 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A407EmprNom = BC01QZ22_A407EmprNom[0] ;
         n407EmprNom = BC01QZ22_n407EmprNom[0] ;
         A718PrdNom = BC01QZ22_A718PrdNom[0] ;
         A860CumConCant = BC01QZ22_A860CumConCant[0] ;
         A861CumConCbis = BC01QZ22_A861CumConCbis[0] ;
         A724PrdPreAct = BC01QZ22_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ22_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ22_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ22_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ22_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ22_A707PrdFacCon[0] ;
         A5862CumConLot = BC01QZ22_A5862CumConLot[0] ;
         A750PrdValStk = BC01QZ22_A750PrdValStk[0] ;
         A488ForPrdDsc = BC01QZ22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = BC01QZ22_n488ForPrdDsc[0] ;
         A8639CumUnidad = BC01QZ22_A8639CumUnidad[0] ;
         A12257PrdComID = BC01QZ22_A12257PrdComID[0] ;
         A10881PrdLote = BC01QZ22_A10881PrdLote[0] ;
         A12700CumUMed = BC01QZ22_A12700CumUMed[0] ;
         A3915EmpNumDec = BC01QZ22_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ22_n3915EmpNumDec[0] ;
         A396EmprCod = BC01QZ22_A396EmprCod[0] ;
         A719PrdNum = BC01QZ22_A719PrdNum[0] ;
         A490ForPrdUMe = BC01QZ22_A490ForPrdUMe[0] ;
         A859CumCodCont = BC01QZ22_A859CumCodCont[0] ;
      }
      Gx_mode = sMode112 ;
   }

   public void scanKeyEnd1QZ112( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1QZ112( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QZ112( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QZ112( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QZ112( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QZ112( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QZ112( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QZ112( )
   {
   }

   public void send_integrity_lvl_hashes1QZ112( )
   {
   }

   public void addRow1QZ112( )
   {
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
   }

   public void readRow1QZ112( )
   {
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
   }

   public void initializeNonKey1QZ112( )
   {
      A863CumCosPro = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A718PrdNom = "" ;
      A860CumConCant = DecimalUtil.ZERO ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A490ForPrdUMe = (byte)(0) ;
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      A8639CumUnidad = (byte)(0) ;
      A12257PrdComID = "" ;
      A10881PrdLote = "" ;
      A12700CumUMed = (byte)(0) ;
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      Z860CumConCant = DecimalUtil.ZERO ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z5862CumConLot = "" ;
      Z8639CumUnidad = (byte)(0) ;
      Z12257PrdComID = "" ;
      Z12700CumUMed = (byte)(0) ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1QZ112( )
   {
      A396EmprCod = "" ;
      A859CumCodCont = 0 ;
      A719PrdNum = "" ;
      initializeNonKey1QZ112( ) ;
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

   public void VarsToRow112( app.stocksquimicos.SdtSalidasManualesProductos_Detalle obj112 )
   {
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Mode( Gx_mode );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro( A863CumCosPro );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs( A3835UltFecCCs );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom( A407EmprNom );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom( A718PrdNom );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant( A860CumConCant );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis( A861CumConCbis );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact( A724PrdPreAct );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm( A704PrdExiAlm );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc( A705PrdExiCC );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres( A685PrdCanRes );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed( A726PrdPreMed );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon( A707PrdFacCon );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot( A5862CumConLot );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk( A750PrdValStk );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume( A490ForPrdUMe );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc( A488ForPrdDsc );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad( A8639CumUnidad );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid( A12257PrdComID );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote( A10881PrdLote );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed( A12700CumUMed );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod( A396EmprCod );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont( A859CumCodCont );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum( A719PrdNum );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z( Z396EmprCod );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z( Z859CumCodCont );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z( Z407EmprNom );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z( Z719PrdNum );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z( Z718PrdNom );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z( Z860CumConCant );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z( Z861CumConCbis );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z( Z863CumCosPro );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z( Z724PrdPreAct );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z( Z704PrdExiAlm );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z( Z705PrdExiCC );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z( Z685PrdCanRes );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z( Z726PrdPreMed );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z( Z3835UltFecCCs );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z( Z707PrdFacCon );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z( Z5862CumConLot );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z( Z750PrdValStk );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z( Z490ForPrdUMe );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z( Z488ForPrdDsc );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z( Z8639CumUnidad );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z( Z12257PrdComID );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z( Z10881PrdLote );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z( Z12700CumUMed );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N( (byte)((byte)((n488ForPrdDsc)?1:0)) );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Mode( Gx_mode );
   }

   public void KeyVarsToRow112( app.stocksquimicos.SdtSalidasManualesProductos_Detalle obj112 )
   {
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Emprcod( A396EmprCod );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont( A859CumCodCont );
      obj112.setgxTv_SdtSalidasManualesProductos_Detalle_Prdnum( A719PrdNum );
   }

   public void RowToVars112( app.stocksquimicos.SdtSalidasManualesProductos_Detalle obj112 ,
                             int forceLoad )
   {
      Gx_mode = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Mode() ;
      A863CumCosPro = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro() ;
      A3835UltFecCCs = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs() ;
      A407EmprNom = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom() ;
      n407EmprNom = false ;
      A718PrdNom = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom() ;
      A860CumConCant = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant() ;
      A861CumConCbis = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis() ;
      A724PrdPreAct = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact() ;
      A704PrdExiAlm = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm() ;
      A705PrdExiCC = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc() ;
      A685PrdCanRes = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres() ;
      A726PrdPreMed = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed() ;
      A707PrdFacCon = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon() ;
      A5862CumConLot = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot() ;
      A750PrdValStk = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk() ;
      A490ForPrdUMe = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume() ;
      A488ForPrdDsc = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc() ;
      n488ForPrdDsc = false ;
      A8639CumUnidad = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad() ;
      A12257PrdComID = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid() ;
      A10881PrdLote = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote() ;
      A12700CumUMed = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed() ;
      A396EmprCod = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod() ;
      A859CumCodCont = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont() ;
      A719PrdNum = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum() ;
      Z396EmprCod = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Emprcod_Z() ;
      Z859CumCodCont = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcodcont_Z() ;
      Z407EmprNom = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_Z() ;
      Z719PrdNum = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnum_Z() ;
      Z718PrdNom = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdnom_Z() ;
      Z860CumConCant = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcant_Z() ;
      Z861CumConCbis = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconcbis_Z() ;
      Z863CumCosPro = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumcospro_Z() ;
      Z724PrdPreAct = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpreact_Z() ;
      Z704PrdExiAlm = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexialm_Z() ;
      Z705PrdExiCC = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdexicc_Z() ;
      Z685PrdCanRes = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcanres_Z() ;
      Z726PrdPreMed = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdpremed_Z() ;
      Z3835UltFecCCs = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Ultfecccs_Z() ;
      Z707PrdFacCon = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdfaccon_Z() ;
      Z5862CumConLot = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumconlot_Z() ;
      Z750PrdValStk = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdvalstk_Z() ;
      Z490ForPrdUMe = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Forprdume_Z() ;
      Z488ForPrdDsc = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_Z() ;
      Z8639CumUnidad = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumunidad_Z() ;
      Z12257PrdComID = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdcomid_Z() ;
      Z10881PrdLote = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Prdlote_Z() ;
      Z12700CumUMed = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Cumumed_Z() ;
      n407EmprNom = (boolean)((obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Emprnom_N()==0)?false:true) ;
      n488ForPrdDsc = (boolean)((obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Forprddsc_N()==0)?false:true) ;
      Gx_mode = obj112.getgxTv_SdtSalidasManualesProductos_Detalle_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A859CumCodCont = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      A719PrdNum = (String)getParm(obj,2) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1QZ112( ) ;
      scanKeyStart1QZ112( ) ;
      if ( RcdFound112 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01QZ23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(21) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01QZ23_A407EmprNom[0] ;
         n407EmprNom = BC01QZ23_n407EmprNom[0] ;
         A3915EmpNumDec = BC01QZ23_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ23_n3915EmpNumDec[0] ;
         pr_default.close(21);
         /* Using cursor BC01QZ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(22) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor BC01QZ25 */
         pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(23) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
         }
         A718PrdNom = BC01QZ25_A718PrdNom[0] ;
         A724PrdPreAct = BC01QZ25_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ25_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ25_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ25_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ25_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ25_A707PrdFacCon[0] ;
         A750PrdValStk = BC01QZ25_A750PrdValStk[0] ;
         A10881PrdLote = BC01QZ25_A10881PrdLote[0] ;
         pr_default.close(23);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
      }
      zm1QZ112( -4) ;
      onLoadActions1QZ112( ) ;
      addRow1QZ112( ) ;
      scanKeyEnd1QZ112( ) ;
      if ( RcdFound112 == 0 )
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
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 0) ;
      scanKeyStart1QZ112( ) ;
      if ( RcdFound112 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01QZ26 */
         pr_default.execute(24, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(24) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01QZ26_A407EmprNom[0] ;
         n407EmprNom = BC01QZ26_n407EmprNom[0] ;
         A3915EmpNumDec = BC01QZ26_A3915EmpNumDec[0] ;
         n3915EmpNumDec = BC01QZ26_n3915EmpNumDec[0] ;
         pr_default.close(24);
         /* Using cursor BC01QZ27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(25) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor BC01QZ28 */
         pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
         if ( (pr_default.getStatus(26) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
         }
         A718PrdNom = BC01QZ28_A718PrdNom[0] ;
         A724PrdPreAct = BC01QZ28_A724PrdPreAct[0] ;
         A704PrdExiAlm = BC01QZ28_A704PrdExiAlm[0] ;
         A705PrdExiCC = BC01QZ28_A705PrdExiCC[0] ;
         A685PrdCanRes = BC01QZ28_A685PrdCanRes[0] ;
         A726PrdPreMed = BC01QZ28_A726PrdPreMed[0] ;
         A707PrdFacCon = BC01QZ28_A707PrdFacCon[0] ;
         A750PrdValStk = BC01QZ28_A750PrdValStk[0] ;
         A10881PrdLote = BC01QZ28_A10881PrdLote[0] ;
         pr_default.close(26);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
      }
      zm1QZ112( -4) ;
      onLoadActions1QZ112( ) ;
      addRow1QZ112( ) ;
      scanKeyEnd1QZ112( ) ;
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QZ112( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1QZ112( ) ;
      }
      else
      {
         if ( RcdFound112 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               A859CumCodCont = Z859CumCodCont ;
               A719PrdNum = Z719PrdNum ;
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
               update1QZ112( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
                     insert1QZ112( ) ;
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
                     insert1QZ112( ) ;
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
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
      saveImpl( ) ;
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1QZ112( ) ;
      afterTrn( ) ;
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
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
         app.stocksquimicos.SdtSalidasManualesProductos_Detalle auxBC = new app.stocksquimicos.SdtSalidasManualesProductos_Detalle( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A859CumCodCont, A719PrdNum);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcstocksquimicos_SalidasManualesProductos_Detalle);
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
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
      updateImpl( ) ;
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
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
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1QZ112( ) ;
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
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1QZ112( ) ;
      if ( RcdFound112 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            A859CumCodCont = Z859CumCodCont ;
            A719PrdNum = Z719PrdNum ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_detalle_bc");
      VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
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
      Gx_mode = bcstocksquimicos_SalidasManualesProductos_Detalle.getgxTv_SdtSalidasManualesProductos_Detalle_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcstocksquimicos_SalidasManualesProductos_Detalle.setgxTv_SdtSalidasManualesProductos_Detalle_Mode( Gx_mode );
   }

   public void SetSDT( app.stocksquimicos.SdtSalidasManualesProductos_Detalle sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcstocksquimicos_SalidasManualesProductos_Detalle )
      {
         bcstocksquimicos_SalidasManualesProductos_Detalle = sdt ;
         if ( GXutil.strcmp(bcstocksquimicos_SalidasManualesProductos_Detalle.getgxTv_SdtSalidasManualesProductos_Detalle_Mode(), "") == 0 )
         {
            bcstocksquimicos_SalidasManualesProductos_Detalle.setgxTv_SdtSalidasManualesProductos_Detalle_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow112( bcstocksquimicos_SalidasManualesProductos_Detalle) ;
         }
         else
         {
            RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcstocksquimicos_SalidasManualesProductos_Detalle.getgxTv_SdtSalidasManualesProductos_Detalle_Mode(), "") == 0 )
         {
            bcstocksquimicos_SalidasManualesProductos_Detalle.setgxTv_SdtSalidasManualesProductos_Detalle_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars112( bcstocksquimicos_SalidasManualesProductos_Detalle, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtSalidasManualesProductos_Detalle getSalidasManualesProductos_Detalle_BC( )
   {
      return bcstocksquimicos_SalidasManualesProductos_Detalle ;
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
      Z719PrdNum = "" ;
      A719PrdNum = "" ;
      Z860CumConCant = DecimalUtil.ZERO ;
      A860CumConCant = DecimalUtil.ZERO ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      A861CumConCbis = DecimalUtil.ZERO ;
      Z5862CumConLot = "" ;
      A5862CumConLot = "" ;
      Z12257PrdComID = "" ;
      A12257PrdComID = "" ;
      Z863CumCosPro = DecimalUtil.ZERO ;
      A863CumCosPro = DecimalUtil.ZERO ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      A3835UltFecCCs = GXutil.nullDate() ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      Z718PrdNom = "" ;
      A718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      Z10881PrdLote = "" ;
      A10881PrdLote = "" ;
      Z488ForPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      BC01QZ8_A407EmprNom = new String[] {""} ;
      BC01QZ8_n407EmprNom = new boolean[] {false} ;
      BC01QZ8_A718PrdNom = new String[] {""} ;
      BC01QZ8_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A5862CumConLot = new String[] {""} ;
      BC01QZ8_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ8_A488ForPrdDsc = new String[] {""} ;
      BC01QZ8_n488ForPrdDsc = new boolean[] {false} ;
      BC01QZ8_A8639CumUnidad = new byte[1] ;
      BC01QZ8_A12257PrdComID = new String[] {""} ;
      BC01QZ8_A10881PrdLote = new String[] {""} ;
      BC01QZ8_A12700CumUMed = new byte[1] ;
      BC01QZ8_A3915EmpNumDec = new byte[1] ;
      BC01QZ8_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ8_A396EmprCod = new String[] {""} ;
      BC01QZ8_A719PrdNum = new String[] {""} ;
      BC01QZ8_A490ForPrdUMe = new byte[1] ;
      BC01QZ8_A859CumCodCont = new int[1] ;
      BC01QZ9_A407EmprNom = new String[] {""} ;
      BC01QZ9_n407EmprNom = new boolean[] {false} ;
      BC01QZ9_A3915EmpNumDec = new byte[1] ;
      BC01QZ9_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ10_A488ForPrdDsc = new String[] {""} ;
      BC01QZ10_n488ForPrdDsc = new boolean[] {false} ;
      BC01QZ11_A396EmprCod = new String[] {""} ;
      BC01QZ12_A718PrdNom = new String[] {""} ;
      BC01QZ12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ12_A10881PrdLote = new String[] {""} ;
      BC01QZ13_A396EmprCod = new String[] {""} ;
      BC01QZ13_A859CumCodCont = new int[1] ;
      BC01QZ13_A719PrdNum = new String[] {""} ;
      BC01QZ14_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ14_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ14_A5862CumConLot = new String[] {""} ;
      BC01QZ14_A8639CumUnidad = new byte[1] ;
      BC01QZ14_A12257PrdComID = new String[] {""} ;
      BC01QZ14_A12700CumUMed = new byte[1] ;
      BC01QZ14_A396EmprCod = new String[] {""} ;
      BC01QZ14_A719PrdNum = new String[] {""} ;
      BC01QZ14_A490ForPrdUMe = new byte[1] ;
      BC01QZ14_A859CumCodCont = new int[1] ;
      sMode112 = "" ;
      BC01QZ15_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ15_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ15_A5862CumConLot = new String[] {""} ;
      BC01QZ15_A8639CumUnidad = new byte[1] ;
      BC01QZ15_A12257PrdComID = new String[] {""} ;
      BC01QZ15_A12700CumUMed = new byte[1] ;
      BC01QZ15_A396EmprCod = new String[] {""} ;
      BC01QZ15_A719PrdNum = new String[] {""} ;
      BC01QZ15_A490ForPrdUMe = new byte[1] ;
      BC01QZ15_A859CumCodCont = new int[1] ;
      BC01QZ19_A407EmprNom = new String[] {""} ;
      BC01QZ19_n407EmprNom = new boolean[] {false} ;
      BC01QZ19_A3915EmpNumDec = new byte[1] ;
      BC01QZ19_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ20_A718PrdNom = new String[] {""} ;
      BC01QZ20_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ20_A10881PrdLote = new String[] {""} ;
      GXt_date1 = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      BC01QZ21_A488ForPrdDsc = new String[] {""} ;
      BC01QZ21_n488ForPrdDsc = new boolean[] {false} ;
      BC01QZ22_A407EmprNom = new String[] {""} ;
      BC01QZ22_n407EmprNom = new boolean[] {false} ;
      BC01QZ22_A718PrdNom = new String[] {""} ;
      BC01QZ22_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A5862CumConLot = new String[] {""} ;
      BC01QZ22_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ22_A488ForPrdDsc = new String[] {""} ;
      BC01QZ22_n488ForPrdDsc = new boolean[] {false} ;
      BC01QZ22_A8639CumUnidad = new byte[1] ;
      BC01QZ22_A12257PrdComID = new String[] {""} ;
      BC01QZ22_A10881PrdLote = new String[] {""} ;
      BC01QZ22_A12700CumUMed = new byte[1] ;
      BC01QZ22_A3915EmpNumDec = new byte[1] ;
      BC01QZ22_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ22_A396EmprCod = new String[] {""} ;
      BC01QZ22_A719PrdNum = new String[] {""} ;
      BC01QZ22_A490ForPrdUMe = new byte[1] ;
      BC01QZ22_A859CumCodCont = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01QZ23_A407EmprNom = new String[] {""} ;
      BC01QZ23_n407EmprNom = new boolean[] {false} ;
      BC01QZ23_A3915EmpNumDec = new byte[1] ;
      BC01QZ23_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ24_A396EmprCod = new String[] {""} ;
      BC01QZ25_A718PrdNom = new String[] {""} ;
      BC01QZ25_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ25_A10881PrdLote = new String[] {""} ;
      BC01QZ26_A407EmprNom = new String[] {""} ;
      BC01QZ26_n407EmprNom = new boolean[] {false} ;
      BC01QZ26_A3915EmpNumDec = new byte[1] ;
      BC01QZ26_n3915EmpNumDec = new boolean[] {false} ;
      BC01QZ27_A396EmprCod = new String[] {""} ;
      BC01QZ28_A718PrdNom = new String[] {""} ;
      BC01QZ28_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      BC01QZ28_A10881PrdLote = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle_bc__default(),
         new Object[] {
             new Object[] {
            BC01QZ2_A860CumConCant, BC01QZ2_A861CumConCbis, BC01QZ2_A5862CumConLot, BC01QZ2_A8639CumUnidad, BC01QZ2_A12257PrdComID, BC01QZ2_A12700CumUMed, BC01QZ2_A396EmprCod, BC01QZ2_A719PrdNum, BC01QZ2_A490ForPrdUMe, BC01QZ2_A859CumCodCont
            }
            , new Object[] {
            BC01QZ3_A860CumConCant, BC01QZ3_A861CumConCbis, BC01QZ3_A5862CumConLot, BC01QZ3_A8639CumUnidad, BC01QZ3_A12257PrdComID, BC01QZ3_A12700CumUMed, BC01QZ3_A396EmprCod, BC01QZ3_A719PrdNum, BC01QZ3_A490ForPrdUMe, BC01QZ3_A859CumCodCont
            }
            , new Object[] {
            BC01QZ4_A407EmprNom, BC01QZ4_n407EmprNom, BC01QZ4_A3915EmpNumDec, BC01QZ4_n3915EmpNumDec
            }
            , new Object[] {
            BC01QZ5_A718PrdNom, BC01QZ5_A724PrdPreAct, BC01QZ5_A704PrdExiAlm, BC01QZ5_A705PrdExiCC, BC01QZ5_A685PrdCanRes, BC01QZ5_A726PrdPreMed, BC01QZ5_A707PrdFacCon, BC01QZ5_A750PrdValStk, BC01QZ5_A10881PrdLote
            }
            , new Object[] {
            BC01QZ6_A488ForPrdDsc, BC01QZ6_n488ForPrdDsc
            }
            , new Object[] {
            BC01QZ7_A396EmprCod
            }
            , new Object[] {
            BC01QZ8_A407EmprNom, BC01QZ8_n407EmprNom, BC01QZ8_A718PrdNom, BC01QZ8_A860CumConCant, BC01QZ8_A861CumConCbis, BC01QZ8_A724PrdPreAct, BC01QZ8_A704PrdExiAlm, BC01QZ8_A705PrdExiCC, BC01QZ8_A685PrdCanRes, BC01QZ8_A726PrdPreMed,
            BC01QZ8_A707PrdFacCon, BC01QZ8_A5862CumConLot, BC01QZ8_A750PrdValStk, BC01QZ8_A488ForPrdDsc, BC01QZ8_n488ForPrdDsc, BC01QZ8_A8639CumUnidad, BC01QZ8_A12257PrdComID, BC01QZ8_A10881PrdLote, BC01QZ8_A12700CumUMed, BC01QZ8_A3915EmpNumDec,
            BC01QZ8_n3915EmpNumDec, BC01QZ8_A396EmprCod, BC01QZ8_A719PrdNum, BC01QZ8_A490ForPrdUMe, BC01QZ8_A859CumCodCont
            }
            , new Object[] {
            BC01QZ9_A407EmprNom, BC01QZ9_n407EmprNom, BC01QZ9_A3915EmpNumDec, BC01QZ9_n3915EmpNumDec
            }
            , new Object[] {
            BC01QZ10_A488ForPrdDsc, BC01QZ10_n488ForPrdDsc
            }
            , new Object[] {
            BC01QZ11_A396EmprCod
            }
            , new Object[] {
            BC01QZ12_A718PrdNom, BC01QZ12_A724PrdPreAct, BC01QZ12_A704PrdExiAlm, BC01QZ12_A705PrdExiCC, BC01QZ12_A685PrdCanRes, BC01QZ12_A726PrdPreMed, BC01QZ12_A707PrdFacCon, BC01QZ12_A750PrdValStk, BC01QZ12_A10881PrdLote
            }
            , new Object[] {
            BC01QZ13_A396EmprCod, BC01QZ13_A859CumCodCont, BC01QZ13_A719PrdNum
            }
            , new Object[] {
            BC01QZ14_A860CumConCant, BC01QZ14_A861CumConCbis, BC01QZ14_A5862CumConLot, BC01QZ14_A8639CumUnidad, BC01QZ14_A12257PrdComID, BC01QZ14_A12700CumUMed, BC01QZ14_A396EmprCod, BC01QZ14_A719PrdNum, BC01QZ14_A490ForPrdUMe, BC01QZ14_A859CumCodCont
            }
            , new Object[] {
            BC01QZ15_A860CumConCant, BC01QZ15_A861CumConCbis, BC01QZ15_A5862CumConLot, BC01QZ15_A8639CumUnidad, BC01QZ15_A12257PrdComID, BC01QZ15_A12700CumUMed, BC01QZ15_A396EmprCod, BC01QZ15_A719PrdNum, BC01QZ15_A490ForPrdUMe, BC01QZ15_A859CumCodCont
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01QZ19_A407EmprNom, BC01QZ19_n407EmprNom, BC01QZ19_A3915EmpNumDec, BC01QZ19_n3915EmpNumDec
            }
            , new Object[] {
            BC01QZ20_A718PrdNom, BC01QZ20_A724PrdPreAct, BC01QZ20_A704PrdExiAlm, BC01QZ20_A705PrdExiCC, BC01QZ20_A685PrdCanRes, BC01QZ20_A726PrdPreMed, BC01QZ20_A707PrdFacCon, BC01QZ20_A750PrdValStk, BC01QZ20_A10881PrdLote
            }
            , new Object[] {
            BC01QZ21_A488ForPrdDsc, BC01QZ21_n488ForPrdDsc
            }
            , new Object[] {
            BC01QZ22_A407EmprNom, BC01QZ22_n407EmprNom, BC01QZ22_A718PrdNom, BC01QZ22_A860CumConCant, BC01QZ22_A861CumConCbis, BC01QZ22_A724PrdPreAct, BC01QZ22_A704PrdExiAlm, BC01QZ22_A705PrdExiCC, BC01QZ22_A685PrdCanRes, BC01QZ22_A726PrdPreMed,
            BC01QZ22_A707PrdFacCon, BC01QZ22_A5862CumConLot, BC01QZ22_A750PrdValStk, BC01QZ22_A488ForPrdDsc, BC01QZ22_n488ForPrdDsc, BC01QZ22_A8639CumUnidad, BC01QZ22_A12257PrdComID, BC01QZ22_A10881PrdLote, BC01QZ22_A12700CumUMed, BC01QZ22_A3915EmpNumDec,
            BC01QZ22_n3915EmpNumDec, BC01QZ22_A396EmprCod, BC01QZ22_A719PrdNum, BC01QZ22_A490ForPrdUMe, BC01QZ22_A859CumCodCont
            }
            , new Object[] {
            BC01QZ23_A407EmprNom, BC01QZ23_n407EmprNom, BC01QZ23_A3915EmpNumDec, BC01QZ23_n3915EmpNumDec
            }
            , new Object[] {
            BC01QZ24_A396EmprCod
            }
            , new Object[] {
            BC01QZ25_A718PrdNom, BC01QZ25_A724PrdPreAct, BC01QZ25_A704PrdExiAlm, BC01QZ25_A705PrdExiCC, BC01QZ25_A685PrdCanRes, BC01QZ25_A726PrdPreMed, BC01QZ25_A707PrdFacCon, BC01QZ25_A750PrdValStk, BC01QZ25_A10881PrdLote
            }
            , new Object[] {
            BC01QZ26_A407EmprNom, BC01QZ26_n407EmprNom, BC01QZ26_A3915EmpNumDec, BC01QZ26_n3915EmpNumDec
            }
            , new Object[] {
            BC01QZ27_A396EmprCod
            }
            , new Object[] {
            BC01QZ28_A718PrdNom, BC01QZ28_A724PrdPreAct, BC01QZ28_A704PrdExiAlm, BC01QZ28_A705PrdExiCC, BC01QZ28_A685PrdCanRes, BC01QZ28_A726PrdPreMed, BC01QZ28_A707PrdFacCon, BC01QZ28_A750PrdValStk, BC01QZ28_A10881PrdLote
            }
         }
      );
      /* Execute Start event if defined. */
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte Z8639CumUnidad ;
   private byte A8639CumUnidad ;
   private byte Z12700CumUMed ;
   private byte A12700CumUMed ;
   private byte Z490ForPrdUMe ;
   private byte A490ForPrdUMe ;
   private byte Z3915EmpNumDec ;
   private byte A3915EmpNumDec ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound112 ;
   private short nIsDirty_112 ;
   private int trnEnded ;
   private int Z859CumCodCont ;
   private int A859CumCodCont ;
   private int GX_JID ;
   private java.math.BigDecimal Z860CumConCant ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal Z861CumConCbis ;
   private java.math.BigDecimal A861CumConCbis ;
   private java.math.BigDecimal Z863CumCosPro ;
   private java.math.BigDecimal A863CumCosPro ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal A750PrdValStk ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String Z719PrdNum ;
   private String A719PrdNum ;
   private String Z5862CumConLot ;
   private String A5862CumConLot ;
   private String Z12257PrdComID ;
   private String A12257PrdComID ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String Z718PrdNom ;
   private String A718PrdNom ;
   private String Z10881PrdLote ;
   private String A10881PrdLote ;
   private String Z488ForPrdDsc ;
   private String A488ForPrdDsc ;
   private String sMode112 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z3835UltFecCCs ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date GXt_date1 ;
   private java.util.Date GXv_date4[] ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean n3915EmpNumDec ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Detalle bcstocksquimicos_SalidasManualesProductos_Detalle ;
   private IDataStoreProvider pr_default ;
   private String[] BC01QZ8_A407EmprNom ;
   private boolean[] BC01QZ8_n407EmprNom ;
   private String[] BC01QZ8_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ8_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ8_A861CumConCbis ;
   private java.math.BigDecimal[] BC01QZ8_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ8_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ8_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ8_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ8_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ8_A707PrdFacCon ;
   private String[] BC01QZ8_A5862CumConLot ;
   private java.math.BigDecimal[] BC01QZ8_A750PrdValStk ;
   private String[] BC01QZ8_A488ForPrdDsc ;
   private boolean[] BC01QZ8_n488ForPrdDsc ;
   private byte[] BC01QZ8_A8639CumUnidad ;
   private String[] BC01QZ8_A12257PrdComID ;
   private String[] BC01QZ8_A10881PrdLote ;
   private byte[] BC01QZ8_A12700CumUMed ;
   private byte[] BC01QZ8_A3915EmpNumDec ;
   private boolean[] BC01QZ8_n3915EmpNumDec ;
   private String[] BC01QZ8_A396EmprCod ;
   private String[] BC01QZ8_A719PrdNum ;
   private byte[] BC01QZ8_A490ForPrdUMe ;
   private int[] BC01QZ8_A859CumCodCont ;
   private String[] BC01QZ9_A407EmprNom ;
   private boolean[] BC01QZ9_n407EmprNom ;
   private byte[] BC01QZ9_A3915EmpNumDec ;
   private boolean[] BC01QZ9_n3915EmpNumDec ;
   private String[] BC01QZ10_A488ForPrdDsc ;
   private boolean[] BC01QZ10_n488ForPrdDsc ;
   private String[] BC01QZ11_A396EmprCod ;
   private String[] BC01QZ12_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ12_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ12_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ12_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ12_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ12_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ12_A707PrdFacCon ;
   private java.math.BigDecimal[] BC01QZ12_A750PrdValStk ;
   private String[] BC01QZ12_A10881PrdLote ;
   private String[] BC01QZ13_A396EmprCod ;
   private int[] BC01QZ13_A859CumCodCont ;
   private String[] BC01QZ13_A719PrdNum ;
   private java.math.BigDecimal[] BC01QZ14_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ14_A861CumConCbis ;
   private String[] BC01QZ14_A5862CumConLot ;
   private byte[] BC01QZ14_A8639CumUnidad ;
   private String[] BC01QZ14_A12257PrdComID ;
   private byte[] BC01QZ14_A12700CumUMed ;
   private String[] BC01QZ14_A396EmprCod ;
   private String[] BC01QZ14_A719PrdNum ;
   private byte[] BC01QZ14_A490ForPrdUMe ;
   private int[] BC01QZ14_A859CumCodCont ;
   private java.math.BigDecimal[] BC01QZ15_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ15_A861CumConCbis ;
   private String[] BC01QZ15_A5862CumConLot ;
   private byte[] BC01QZ15_A8639CumUnidad ;
   private String[] BC01QZ15_A12257PrdComID ;
   private byte[] BC01QZ15_A12700CumUMed ;
   private String[] BC01QZ15_A396EmprCod ;
   private String[] BC01QZ15_A719PrdNum ;
   private byte[] BC01QZ15_A490ForPrdUMe ;
   private int[] BC01QZ15_A859CumCodCont ;
   private String[] BC01QZ19_A407EmprNom ;
   private boolean[] BC01QZ19_n407EmprNom ;
   private byte[] BC01QZ19_A3915EmpNumDec ;
   private boolean[] BC01QZ19_n3915EmpNumDec ;
   private String[] BC01QZ20_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ20_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ20_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ20_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ20_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ20_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ20_A707PrdFacCon ;
   private java.math.BigDecimal[] BC01QZ20_A750PrdValStk ;
   private String[] BC01QZ20_A10881PrdLote ;
   private String[] BC01QZ21_A488ForPrdDsc ;
   private boolean[] BC01QZ21_n488ForPrdDsc ;
   private String[] BC01QZ22_A407EmprNom ;
   private boolean[] BC01QZ22_n407EmprNom ;
   private String[] BC01QZ22_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ22_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ22_A861CumConCbis ;
   private java.math.BigDecimal[] BC01QZ22_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ22_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ22_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ22_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ22_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ22_A707PrdFacCon ;
   private String[] BC01QZ22_A5862CumConLot ;
   private java.math.BigDecimal[] BC01QZ22_A750PrdValStk ;
   private String[] BC01QZ22_A488ForPrdDsc ;
   private boolean[] BC01QZ22_n488ForPrdDsc ;
   private byte[] BC01QZ22_A8639CumUnidad ;
   private String[] BC01QZ22_A12257PrdComID ;
   private String[] BC01QZ22_A10881PrdLote ;
   private byte[] BC01QZ22_A12700CumUMed ;
   private byte[] BC01QZ22_A3915EmpNumDec ;
   private boolean[] BC01QZ22_n3915EmpNumDec ;
   private String[] BC01QZ22_A396EmprCod ;
   private String[] BC01QZ22_A719PrdNum ;
   private byte[] BC01QZ22_A490ForPrdUMe ;
   private int[] BC01QZ22_A859CumCodCont ;
   private String[] BC01QZ23_A407EmprNom ;
   private boolean[] BC01QZ23_n407EmprNom ;
   private byte[] BC01QZ23_A3915EmpNumDec ;
   private boolean[] BC01QZ23_n3915EmpNumDec ;
   private String[] BC01QZ24_A396EmprCod ;
   private String[] BC01QZ25_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ25_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ25_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ25_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ25_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ25_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ25_A707PrdFacCon ;
   private java.math.BigDecimal[] BC01QZ25_A750PrdValStk ;
   private String[] BC01QZ25_A10881PrdLote ;
   private String[] BC01QZ26_A407EmprNom ;
   private boolean[] BC01QZ26_n407EmprNom ;
   private byte[] BC01QZ26_A3915EmpNumDec ;
   private boolean[] BC01QZ26_n3915EmpNumDec ;
   private String[] BC01QZ27_A396EmprCod ;
   private String[] BC01QZ28_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ28_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ28_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ28_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ28_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ28_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ28_A707PrdFacCon ;
   private java.math.BigDecimal[] BC01QZ28_A750PrdValStk ;
   private String[] BC01QZ28_A10881PrdLote ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] BC01QZ2_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ2_A861CumConCbis ;
   private String[] BC01QZ2_A5862CumConLot ;
   private byte[] BC01QZ2_A8639CumUnidad ;
   private String[] BC01QZ2_A12257PrdComID ;
   private byte[] BC01QZ2_A12700CumUMed ;
   private String[] BC01QZ2_A396EmprCod ;
   private String[] BC01QZ2_A719PrdNum ;
   private byte[] BC01QZ2_A490ForPrdUMe ;
   private int[] BC01QZ2_A859CumCodCont ;
   private java.math.BigDecimal[] BC01QZ3_A860CumConCant ;
   private java.math.BigDecimal[] BC01QZ3_A861CumConCbis ;
   private String[] BC01QZ3_A5862CumConLot ;
   private byte[] BC01QZ3_A8639CumUnidad ;
   private String[] BC01QZ3_A12257PrdComID ;
   private byte[] BC01QZ3_A12700CumUMed ;
   private String[] BC01QZ3_A396EmprCod ;
   private String[] BC01QZ3_A719PrdNum ;
   private byte[] BC01QZ3_A490ForPrdUMe ;
   private int[] BC01QZ3_A859CumCodCont ;
   private String[] BC01QZ4_A407EmprNom ;
   private byte[] BC01QZ4_A3915EmpNumDec ;
   private String[] BC01QZ5_A718PrdNom ;
   private java.math.BigDecimal[] BC01QZ5_A724PrdPreAct ;
   private java.math.BigDecimal[] BC01QZ5_A704PrdExiAlm ;
   private java.math.BigDecimal[] BC01QZ5_A705PrdExiCC ;
   private java.math.BigDecimal[] BC01QZ5_A685PrdCanRes ;
   private java.math.BigDecimal[] BC01QZ5_A726PrdPreMed ;
   private java.math.BigDecimal[] BC01QZ5_A707PrdFacCon ;
   private java.math.BigDecimal[] BC01QZ5_A750PrdValStk ;
   private String[] BC01QZ5_A10881PrdLote ;
   private String[] BC01QZ6_A488ForPrdDsc ;
   private String[] BC01QZ7_A396EmprCod ;
   private boolean[] BC01QZ4_n407EmprNom ;
   private boolean[] BC01QZ4_n3915EmpNumDec ;
   private boolean[] BC01QZ6_n488ForPrdDsc ;
}

final  class salidasmanualesproductos_detalle_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01QZ2", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?  FOR UPDATE OF CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ3", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ5", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ6", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ7", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ8", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.PrdNom, TM1.CumConCant, TM1.CumConCbis, T3.PrdPreAct, T3.PrdExiAlm, T3.PrdExiCC, T3.PrdCanRes, T3.PrdPreMed, T3.PrdFacCon, TM1.CumConLot, T3.PrdValStk, T4.ForPrdDsc, TM1.CumUnidad, TM1.PrdComID, T3.PrdLote, TM1.CumUMed, T2.EmpNumDec, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.CumCodCont FROM (((TXPLCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ9", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ10", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ11", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ12", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ14", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ15", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?  FOR UPDATE OF CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01QZ16", "INSERT INTO TXPLCUMCO(CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont, CumLotAlm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("BC01QZ17", "UPDATE TXPLCUMCO SET CumConCant=?, CumConCbis=?, CumConLot=?, CumUnidad=?, PrdComID=?, CumUMed=?, ForPrdUMe=?  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("BC01QZ18", "DELETE FROM TXPLCUMCO  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new ForEachCursor("BC01QZ19", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ20", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ21", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ22", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.PrdNom, TM1.CumConCant, TM1.CumConCbis, T3.PrdPreAct, T3.PrdExiAlm, T3.PrdExiCC, T3.PrdCanRes, T3.PrdPreMed, T3.PrdFacCon, TM1.CumConLot, T3.PrdValStk, T4.ForPrdDsc, TM1.CumUnidad, TM1.PrdComID, T3.PrdLote, TM1.CumUMed, T2.EmpNumDec, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.CumCodCont FROM (((TXPLCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ23", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ24", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ25", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ26", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ27", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QZ28", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((String[]) buf[22])[0] = rslt.getString(20, 6);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((String[]) buf[22])[0] = rslt.getString(20, 6);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

