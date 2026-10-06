package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_cabecera_bc extends GXWebPanel implements IGxSilentTrn
{
   public salidasmanualesproductos_cabecera_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_cabecera_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_cabecera_bc.class ));
   }

   public salidasmanualesproductos_cabecera_bc( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow1QY111( ) ;
      standaloneNotModal( ) ;
      initializeNonKey1QY111( ) ;
      standaloneModal( ) ;
      addRow1QY111( ) ;
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
         e111QY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z396EmprCod = A396EmprCod ;
            Z859CumCodCont = A859CumCodCont ;
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

   public void confirm_1QY0( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1QY111( ) ;
         }
         else
         {
            checkExtendedTable1QY111( ) ;
            if ( AnyError == 0 )
            {
               zm1QY111( 13) ;
               zm1QY111( 14) ;
               zm1QY111( 15) ;
            }
            closeExtendedTableCursors1QY111( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e121QY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidasmanualesproductos_cabecera_bc.this.A396EmprCod = GXv_char2[0] ;
      salidasmanualesproductos_cabecera_bc.this.AV15EmprNom = GXv_char3[0] ;
      salidasmanualesproductos_cabecera_bc.this.AV16UsurCod = GXv_char4[0] ;
      GXt_char1 = AV14Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char4[0] ;
      AV14Station = GXt_char1 ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char2[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char4, GXv_char3, GXv_char2) ;
      salidasmanualesproductos_cabecera_bc.this.AV7EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_bc.this.AV15EmprNom = GXv_char3[0] ;
      salidasmanualesproductos_cabecera_bc.this.AV16UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV21Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         while ( AV22GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CcoCod") == 0 )
            {
               AV12Insert_CcoCod = (short)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCod") == 0 )
            {
               AV17Insert_BarCod = (int)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodReo") == 0 )
            {
               AV18Insert_BarCodReo = (byte)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
            }
            else if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "BarCodPar") == 0 )
            {
               AV19Insert_BarCodPar = AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
         }
      }
   }

   public void e111QY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zm1QY111( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         Z862CumConFec = A862CumConFec ;
         Z10777CumCCos = A10777CumCCos ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z3839CcoCod = A3839CcoCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z10778CumCCosD = A10778CumCCosD ;
         Z8926CC_AlmDc = A8926CC_AlmDc ;
      }
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
         Z10778CumCCosD = A10778CumCCosD ;
         Z8926CC_AlmDc = A8926CC_AlmDc ;
      }
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         Z10778CumCCosD = A10778CumCCosD ;
         Z8926CC_AlmDc = A8926CC_AlmDc ;
      }
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z10778CumCCosD = A10778CumCCosD ;
         Z8926CC_AlmDc = A8926CC_AlmDc ;
      }
      if ( GX_JID == -12 )
      {
         Z859CumCodCont = A859CumCodCont ;
         Z862CumConFec = A862CumConFec ;
         Z10777CumCCos = A10777CumCCos ;
         Z11368CumConTipo = A11368CumConTipo ;
         Z8925CC_AlmCd = A8925CC_AlmCd ;
         Z396EmprCod = A396EmprCod ;
         Z3839CcoCod = A3839CcoCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV21Pgmname = "StocksQuimicos.SalidasManualesProductos_Cabecera_BC" ;
      Gx_BScreen = (byte)(0) ;
      /* Using cursor BC01QY7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC01QY7_A407EmprNom[0] ;
      n407EmprNom = BC01QY7_n407EmprNom[0] ;
      pr_default.close(5);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A862CumConFec)) && ( Gx_BScreen == 0 ) )
      {
         A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      }
      if ( isIns( )  && (0==A11368CumConTipo) && ( Gx_BScreen == 0 ) )
      {
         A11368CumConTipo = (byte)(0) ;
      }
   }

   public void load1QY111( )
   {
      /* Using cursor BC01QY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A407EmprNom = BC01QY8_A407EmprNom[0] ;
         n407EmprNom = BC01QY8_n407EmprNom[0] ;
         A862CumConFec = BC01QY8_A862CumConFec[0] ;
         A10777CumCCos = BC01QY8_A10777CumCCos[0] ;
         A11368CumConTipo = BC01QY8_A11368CumConTipo[0] ;
         A8925CC_AlmCd = BC01QY8_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = BC01QY8_n8925CC_AlmCd[0] ;
         A3839CcoCod = BC01QY8_A3839CcoCod[0] ;
         n3839CcoCod = BC01QY8_n3839CcoCod[0] ;
         A129BarCod = BC01QY8_A129BarCod[0] ;
         A132BarCodReo = BC01QY8_A132BarCodReo[0] ;
         A130BarCodPar = BC01QY8_A130BarCodPar[0] ;
         zm1QY111( -12) ;
      }
      pr_default.close(6);
      onLoadActions1QY111( ) ;
   }

   public void onLoadActions1QY111( )
   {
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidasmanualesproductos_cabecera_bc.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_bc.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char3[0] ;
      A8926CC_AlmDc = GXt_char1 ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int7[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int7, GXv_char4) ;
      salidasmanualesproductos_cabecera_bc.this.A10777CumCCos = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char4[0] ;
      A10778CumCCosD = GXt_char1 ;
      A3839CcoCod = A10777CumCCos ;
      n3839CcoCod = false ;
   }

   public void checkExtendedTable1QY111( )
   {
      nIsDirty_111 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC01QY9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A8926CC_AlmDc ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A8925CC_AlmCd ;
      GXv_char3[0] = GXt_char1 ;
      new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
      salidasmanualesproductos_cabecera_bc.this.A396EmprCod = GXv_char4[0] ;
      salidasmanualesproductos_cabecera_bc.this.A8925CC_AlmCd = GXv_int6[0] ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char3[0] ;
      A8926CC_AlmDc = GXt_char1 ;
      nIsDirty_111 = (short)(1) ;
      GXt_char1 = A10778CumCCosD ;
      GXv_int7[0] = A10777CumCCos ;
      GXv_char4[0] = GXt_char1 ;
      new app.pccdsc(remoteHandle, context).execute( GXv_int7, GXv_char4) ;
      salidasmanualesproductos_cabecera_bc.this.A10777CumCCos = GXv_int7[0] ;
      salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char4[0] ;
      A10778CumCCosD = GXt_char1 ;
      nIsDirty_111 = (short)(1) ;
      A3839CcoCod = A10777CumCCos ;
      n3839CcoCod = false ;
      if ( ( A10777CumCCos > 0 ) && ( GXutil.strcmp(A10778CumCCosD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No Existe Centro Coste", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor BC01QY10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A3839CcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CENTCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCOCOD");
            AnyError = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void closeExtendedTableCursors1QY111( )
   {
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void getKey1QY111( )
   {
      /* Using cursor BC01QY11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound111 = (short)(1) ;
      }
      else
      {
         RcdFound111 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC01QY12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(BC01QY12_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1QY111( 12) ;
         RcdFound111 = (short)(1) ;
         A859CumCodCont = BC01QY12_A859CumCodCont[0] ;
         A862CumConFec = BC01QY12_A862CumConFec[0] ;
         A10777CumCCos = BC01QY12_A10777CumCCos[0] ;
         A11368CumConTipo = BC01QY12_A11368CumConTipo[0] ;
         A8925CC_AlmCd = BC01QY12_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = BC01QY12_n8925CC_AlmCd[0] ;
         A3839CcoCod = BC01QY12_A3839CcoCod[0] ;
         n3839CcoCod = BC01QY12_n3839CcoCod[0] ;
         A129BarCod = BC01QY12_A129BarCod[0] ;
         A132BarCodReo = BC01QY12_A132BarCodReo[0] ;
         A130BarCodPar = BC01QY12_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load1QY111( ) ;
         if ( AnyError == 1 )
         {
            RcdFound111 = (short)(0) ;
            initializeNonKey1QY111( ) ;
         }
         Gx_mode = sMode111 ;
      }
      else
      {
         RcdFound111 = (short)(0) ;
         initializeNonKey1QY111( ) ;
         sMode111 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode111 ;
      }
      pr_default.close(10);
   }

   public void getEqualNoModal( )
   {
      getKey1QY111( ) ;
      if ( RcdFound111 == 0 )
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
      confirm_1QY0( ) ;
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

   public void checkOptimisticConcurrency1QY111( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC01QY13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(11) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(11) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z862CumConFec), GXutil.resetTime(BC01QY13_A862CumConFec[0])) ) || ( Z10777CumCCos != BC01QY13_A10777CumCCos[0] ) || ( Z11368CumConTipo != BC01QY13_A11368CumConTipo[0] ) || ( Z8925CC_AlmCd != BC01QY13_A8925CC_AlmCd[0] ) || ( Z3839CcoCod != BC01QY13_A3839CcoCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z129BarCod != BC01QY13_A129BarCod[0] ) || ( Z132BarCodReo != BC01QY13_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, BC01QY13_A130BarCodPar[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QY111( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QY111( 0) ;
         checkOptimisticConcurrency1QY111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QY111( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QY111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01QY14 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A859CumCodCont), A862CumConFec, Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), A396EmprCod, Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(12) == 1) )
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
            load1QY111( ) ;
         }
         endLevel1QY111( ) ;
      }
      closeExtendedTableCursors1QY111( ) ;
   }

   public void update1QY111( )
   {
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QY111( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QY111( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QY111( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC01QY15 */
                  pr_default.execute(13, new Object[] {A862CumConFec, Short.valueOf(A10777CumCCos), Byte.valueOf(A11368CumConTipo), Boolean.valueOf(n8925CC_AlmCd), Byte.valueOf(A8925CC_AlmCd), Boolean.valueOf(n3839CcoCod), Short.valueOf(A3839CcoCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QY111( ) ;
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
         endLevel1QY111( ) ;
      }
      closeExtendedTableCursors1QY111( ) ;
   }

   public void deferredUpdate1QY111( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate1QY111( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QY111( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QY111( ) ;
         afterConfirm1QY111( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QY111( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC01QY16 */
               pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCUMCO");
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
      sMode111 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel1QY111( ) ;
      Gx_mode = sMode111 ;
   }

   public void onDeleteControls1QY111( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A10778CumCCosD ;
         GXv_int7[0] = A10777CumCCos ;
         GXv_char4[0] = GXt_char1 ;
         new app.pccdsc(remoteHandle, context).execute( GXv_int7, GXv_char4) ;
         salidasmanualesproductos_cabecera_bc.this.A10777CumCCos = GXv_int7[0] ;
         salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char4[0] ;
         A10778CumCCosD = GXt_char1 ;
         GXt_char1 = A8926CC_AlmDc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A8925CC_AlmCd ;
         GXv_char3[0] = GXt_char1 ;
         new app.pexialmc(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3) ;
         salidasmanualesproductos_cabecera_bc.this.A396EmprCod = GXv_char4[0] ;
         salidasmanualesproductos_cabecera_bc.this.A8925CC_AlmCd = GXv_int6[0] ;
         salidasmanualesproductos_cabecera_bc.this.GXt_char1 = GXv_char3[0] ;
         A8926CC_AlmDc = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC01QY17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel1QY111( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(11);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QY111( ) ;
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

   public void scanKeyStart1QY111( )
   {
      /* Scan By routine */
      /* Using cursor BC01QY18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      RcdFound111 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = BC01QY18_A859CumCodCont[0] ;
         A407EmprNom = BC01QY18_A407EmprNom[0] ;
         n407EmprNom = BC01QY18_n407EmprNom[0] ;
         A862CumConFec = BC01QY18_A862CumConFec[0] ;
         A10777CumCCos = BC01QY18_A10777CumCCos[0] ;
         A11368CumConTipo = BC01QY18_A11368CumConTipo[0] ;
         A8925CC_AlmCd = BC01QY18_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = BC01QY18_n8925CC_AlmCd[0] ;
         A3839CcoCod = BC01QY18_A3839CcoCod[0] ;
         n3839CcoCod = BC01QY18_n3839CcoCod[0] ;
         A129BarCod = BC01QY18_A129BarCod[0] ;
         A132BarCodReo = BC01QY18_A132BarCodReo[0] ;
         A130BarCodPar = BC01QY18_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext1QY111( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound111 = (short)(0) ;
      scanKeyLoad1QY111( ) ;
   }

   public void scanKeyLoad1QY111( )
   {
      sMode111 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound111 = (short)(1) ;
         A859CumCodCont = BC01QY18_A859CumCodCont[0] ;
         A407EmprNom = BC01QY18_A407EmprNom[0] ;
         n407EmprNom = BC01QY18_n407EmprNom[0] ;
         A862CumConFec = BC01QY18_A862CumConFec[0] ;
         A10777CumCCos = BC01QY18_A10777CumCCos[0] ;
         A11368CumConTipo = BC01QY18_A11368CumConTipo[0] ;
         A8925CC_AlmCd = BC01QY18_A8925CC_AlmCd[0] ;
         n8925CC_AlmCd = BC01QY18_n8925CC_AlmCd[0] ;
         A3839CcoCod = BC01QY18_A3839CcoCod[0] ;
         n3839CcoCod = BC01QY18_n3839CcoCod[0] ;
         A129BarCod = BC01QY18_A129BarCod[0] ;
         A132BarCodReo = BC01QY18_A132BarCodReo[0] ;
         A130BarCodPar = BC01QY18_A130BarCodPar[0] ;
      }
      Gx_mode = sMode111 ;
   }

   public void scanKeyEnd1QY111( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1QY111( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QY111( )
   {
      /* Before Insert Rules */
      if ( BC01QY3_n10777CumCCos[0] )
      {
         A10777CumCCos = (short)(0) ;
      }
      if ( BC01QY3_n8925CC_AlmCd[0] )
      {
         A8925CC_AlmCd = (byte)(0) ;
         n8925CC_AlmCd = false ;
         n8925CC_AlmCd = false ;
      }
      if ( (0==A859CumCodCont) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXv_int8[0] = A859CumCodCont ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "111111", GXv_int8) ;
         salidasmanualesproductos_cabecera_bc.this.A859CumCodCont = GXv_int8[0] ;
      }
   }

   public void beforeUpdate1QY111( )
   {
      /* Before Update Rules */
      if ( BC01QY3_n10777CumCCos[0] )
      {
         A10777CumCCos = (short)(0) ;
      }
      if ( BC01QY3_n8925CC_AlmCd[0] )
      {
         A8925CC_AlmCd = (byte)(0) ;
         n8925CC_AlmCd = false ;
         n8925CC_AlmCd = false ;
      }
   }

   public void beforeDelete1QY111( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QY111( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QY111( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QY111( )
   {
   }

   public void send_integrity_lvl_hashes1QY111( )
   {
   }

   public void addRow1QY111( )
   {
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
   }

   public void readRow1QY111( )
   {
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
   }

   public void initializeNonKey1QY111( )
   {
      A3839CcoCod = (short)(0) ;
      n3839CcoCod = false ;
      A10778CumCCosD = "" ;
      A8926CC_AlmDc = "" ;
      A10777CumCCos = (short)(0) ;
      A8925CC_AlmCd = (byte)(0) ;
      n8925CC_AlmCd = false ;
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.nullDate() ;
      Z10777CumCCos = (short)(0) ;
      Z11368CumConTipo = (byte)(0) ;
      Z8925CC_AlmCd = (byte)(0) ;
      Z3839CcoCod = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAll1QY111( )
   {
      A859CumCodCont = 0 ;
      initializeNonKey1QY111( ) ;
   }

   public void standaloneModalInsert( )
   {
      A862CumConFec = i862CumConFec ;
      A11368CumConTipo = i11368CumConTipo ;
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

   public void VarsToRow111( app.stocksquimicos.SdtSalidasManualesProductos_Cabecera obj111 )
   {
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( Gx_mode );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod( A396EmprCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod( A3839CcoCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd( A10778CumCCosD );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc( A8926CC_AlmDc );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom( A407EmprNom );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos( A10777CumCCos );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd( A8925CC_AlmCd );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod( A129BarCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo( A132BarCodReo );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar( A130BarCodPar );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec( A862CumConFec );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo( A11368CumConTipo );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod( A396EmprCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont( A859CumCodCont );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z( Z396EmprCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z( Z859CumCodCont );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z( Z407EmprNom );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z( Z862CumConFec );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z( Z3839CcoCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z( Z10777CumCCos );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z( Z10778CumCCosD );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z( Z11368CumConTipo );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z( Z8925CC_AlmCd );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z( Z8926CC_AlmDc );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z( Z129BarCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z( Z132BarCodReo );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z( Z130BarCodPar );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N( (byte)((byte)((n3839CcoCod)?1:0)) );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N( (byte)((byte)((n8925CC_AlmCd)?1:0)) );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( Gx_mode );
   }

   public void KeyVarsToRow111( app.stocksquimicos.SdtSalidasManualesProductos_Cabecera obj111 )
   {
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod( A396EmprCod );
      obj111.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont( A859CumCodCont );
   }

   public void RowToVars111( app.stocksquimicos.SdtSalidasManualesProductos_Cabecera obj111 ,
                             int forceLoad )
   {
      Gx_mode = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Mode() ;
      A396EmprCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod() ;
      A3839CcoCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod() ;
      n3839CcoCod = false ;
      A10778CumCCosD = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd() ;
      A8926CC_AlmDc = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc() ;
      A407EmprNom = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom() ;
      n407EmprNom = false ;
      A10777CumCCos = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos() ;
      A8925CC_AlmCd = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd() ;
      n8925CC_AlmCd = false ;
      A129BarCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod() ;
      A132BarCodReo = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo() ;
      A130BarCodPar = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar() ;
      A862CumConFec = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec() ;
      A11368CumConTipo = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo() ;
      A396EmprCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod() ;
      A859CumCodCont = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont() ;
      Z396EmprCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprcod_Z() ;
      Z859CumCodCont = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcodcont_Z() ;
      Z407EmprNom = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_Z() ;
      Z862CumConFec = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec_Z() ;
      Z3839CcoCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_Z() ;
      Z10777CumCCos = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos_Z() ;
      Z10778CumCCosD = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd_Z() ;
      Z11368CumConTipo = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo_Z() ;
      Z8925CC_AlmCd = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_Z() ;
      Z8926CC_AlmDc = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almdc_Z() ;
      Z129BarCod = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcod_Z() ;
      Z132BarCodReo = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodreo_Z() ;
      Z130BarCodPar = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Barcodpar_Z() ;
      n407EmprNom = (boolean)((obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Emprnom_N()==0)?false:true) ;
      n3839CcoCod = (boolean)((obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Ccocod_N()==0)?false:true) ;
      n8925CC_AlmCd = (boolean)((obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Cc_almcd_N()==0)?false:true) ;
      Gx_mode = obj111.getgxTv_SdtSalidasManualesProductos_Cabecera_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A396EmprCod = (String)getParm(obj,0) ;
      A859CumCodCont = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey1QY111( ) ;
      scanKeyStart1QY111( ) ;
      if ( RcdFound111 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01QY19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(17) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01QY19_A407EmprNom[0] ;
         n407EmprNom = BC01QY19_n407EmprNom[0] ;
         pr_default.close(17);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
      }
      zm1QY111( -12) ;
      onLoadActions1QY111( ) ;
      addRow1QY111( ) ;
      scanKeyEnd1QY111( ) ;
      if ( RcdFound111 == 0 )
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
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 0) ;
      scanKeyStart1QY111( ) ;
      if ( RcdFound111 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC01QY20 */
         pr_default.execute(18, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(18) == 101) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
            AnyError = (short)(1) ;
         }
         A407EmprNom = BC01QY20_A407EmprNom[0] ;
         n407EmprNom = BC01QY20_n407EmprNom[0] ;
         pr_default.close(18);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
      }
      zm1QY111( -12) ;
      onLoadActions1QY111( ) ;
      addRow1QY111( ) ;
      scanKeyEnd1QY111( ) ;
      if ( RcdFound111 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QY111( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1QY111( ) ;
      }
      else
      {
         if ( RcdFound111 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
            {
               A859CumCodCont = Z859CumCodCont ;
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
               update1QY111( ) ;
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
               if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
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
                     insert1QY111( ) ;
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
                     insert1QY111( ) ;
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
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
      saveImpl( ) ;
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1QY111( ) ;
      afterTrn( ) ;
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
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
         app.stocksquimicos.SdtSalidasManualesProductos_Cabecera auxBC = new app.stocksquimicos.SdtSalidasManualesProductos_Cabecera( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A396EmprCod, A859CumCodCont);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcstocksquimicos_SalidasManualesProductos_Cabecera);
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
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
      updateImpl( ) ;
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
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
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert1QY111( ) ;
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
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey1QY111( ) ;
      if ( RcdFound111 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
         {
            A859CumCodCont = Z859CumCodCont ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_cabecera_bc");
      VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
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
      Gx_mode = bcstocksquimicos_SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcstocksquimicos_SalidasManualesProductos_Cabecera.setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( Gx_mode );
   }

   public void SetSDT( app.stocksquimicos.SdtSalidasManualesProductos_Cabecera sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcstocksquimicos_SalidasManualesProductos_Cabecera )
      {
         bcstocksquimicos_SalidasManualesProductos_Cabecera = sdt ;
         if ( GXutil.strcmp(bcstocksquimicos_SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Mode(), "") == 0 )
         {
            bcstocksquimicos_SalidasManualesProductos_Cabecera.setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow111( bcstocksquimicos_SalidasManualesProductos_Cabecera) ;
         }
         else
         {
            RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcstocksquimicos_SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Mode(), "") == 0 )
         {
            bcstocksquimicos_SalidasManualesProductos_Cabecera.setgxTv_SdtSalidasManualesProductos_Cabecera_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars111( bcstocksquimicos_SalidasManualesProductos_Cabecera, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtSalidasManualesProductos_Cabecera getSalidasManualesProductos_Cabecera_BC( )
   {
      return bcstocksquimicos_SalidasManualesProductos_Cabecera ;
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
      AV14Station = "" ;
      AV15EmprNom = "" ;
      AV16UsurCod = "" ;
      AV7EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV21Pgmname = "" ;
      AV13TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV19Insert_BarCodPar = "" ;
      Z862CumConFec = GXutil.nullDate() ;
      A862CumConFec = GXutil.nullDate() ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z10778CumCCosD = "" ;
      A10778CumCCosD = "" ;
      Z8926CC_AlmDc = "" ;
      A8926CC_AlmDc = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC01QY7_A407EmprNom = new String[] {""} ;
      BC01QY7_n407EmprNom = new boolean[] {false} ;
      BC01QY8_A859CumCodCont = new int[1] ;
      BC01QY8_A407EmprNom = new String[] {""} ;
      BC01QY8_n407EmprNom = new boolean[] {false} ;
      BC01QY8_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01QY8_A10777CumCCos = new short[1] ;
      BC01QY8_A11368CumConTipo = new byte[1] ;
      BC01QY8_A8925CC_AlmCd = new byte[1] ;
      BC01QY8_n8925CC_AlmCd = new boolean[] {false} ;
      BC01QY8_A396EmprCod = new String[] {""} ;
      BC01QY8_A3839CcoCod = new short[1] ;
      BC01QY8_n3839CcoCod = new boolean[] {false} ;
      BC01QY8_A129BarCod = new int[1] ;
      BC01QY8_A132BarCodReo = new byte[1] ;
      BC01QY8_A130BarCodPar = new String[] {""} ;
      BC01QY9_A396EmprCod = new String[] {""} ;
      BC01QY10_A3839CcoCod = new short[1] ;
      BC01QY10_n3839CcoCod = new boolean[] {false} ;
      BC01QY11_A396EmprCod = new String[] {""} ;
      BC01QY11_A859CumCodCont = new int[1] ;
      BC01QY12_A859CumCodCont = new int[1] ;
      BC01QY12_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01QY12_A10777CumCCos = new short[1] ;
      BC01QY12_A11368CumConTipo = new byte[1] ;
      BC01QY12_A8925CC_AlmCd = new byte[1] ;
      BC01QY12_n8925CC_AlmCd = new boolean[] {false} ;
      BC01QY12_A396EmprCod = new String[] {""} ;
      BC01QY12_A3839CcoCod = new short[1] ;
      BC01QY12_n3839CcoCod = new boolean[] {false} ;
      BC01QY12_A129BarCod = new int[1] ;
      BC01QY12_A132BarCodReo = new byte[1] ;
      BC01QY12_A130BarCodPar = new String[] {""} ;
      sMode111 = "" ;
      BC01QY13_A859CumCodCont = new int[1] ;
      BC01QY13_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01QY13_A10777CumCCos = new short[1] ;
      BC01QY13_A11368CumConTipo = new byte[1] ;
      BC01QY13_A8925CC_AlmCd = new byte[1] ;
      BC01QY13_n8925CC_AlmCd = new boolean[] {false} ;
      BC01QY13_A396EmprCod = new String[] {""} ;
      BC01QY13_A3839CcoCod = new short[1] ;
      BC01QY13_n3839CcoCod = new boolean[] {false} ;
      BC01QY13_A129BarCod = new int[1] ;
      BC01QY13_A132BarCodReo = new byte[1] ;
      BC01QY13_A130BarCodPar = new String[] {""} ;
      GXv_int7 = new short[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      BC01QY17_A396EmprCod = new String[] {""} ;
      BC01QY17_A859CumCodCont = new int[1] ;
      BC01QY17_A719PrdNum = new String[] {""} ;
      BC01QY18_A859CumCodCont = new int[1] ;
      BC01QY18_A407EmprNom = new String[] {""} ;
      BC01QY18_n407EmprNom = new boolean[] {false} ;
      BC01QY18_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC01QY18_A10777CumCCos = new short[1] ;
      BC01QY18_A11368CumConTipo = new byte[1] ;
      BC01QY18_A8925CC_AlmCd = new byte[1] ;
      BC01QY18_n8925CC_AlmCd = new boolean[] {false} ;
      BC01QY18_A396EmprCod = new String[] {""} ;
      BC01QY18_A3839CcoCod = new short[1] ;
      BC01QY18_n3839CcoCod = new boolean[] {false} ;
      BC01QY18_A129BarCod = new int[1] ;
      BC01QY18_A132BarCodReo = new byte[1] ;
      BC01QY18_A130BarCodPar = new String[] {""} ;
      BC01QY3_n10777CumCCos = new boolean[] {false} ;
      BC01QY3_n8925CC_AlmCd = new boolean[] {false} ;
      GXv_int8 = new int[1] ;
      i862CumConFec = GXutil.nullDate() ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC01QY19_A407EmprNom = new String[] {""} ;
      BC01QY19_n407EmprNom = new boolean[] {false} ;
      BC01QY20_A407EmprNom = new String[] {""} ;
      BC01QY20_n407EmprNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_cabecera_bc__default(),
         new Object[] {
             new Object[] {
            BC01QY2_A859CumCodCont, BC01QY2_A862CumConFec, BC01QY2_A10777CumCCos, BC01QY2_A11368CumConTipo, BC01QY2_A8925CC_AlmCd, BC01QY2_n8925CC_AlmCd, BC01QY2_A396EmprCod, BC01QY2_A3839CcoCod, BC01QY2_n3839CcoCod, BC01QY2_A129BarCod,
            BC01QY2_A132BarCodReo, BC01QY2_A130BarCodPar
            }
            , new Object[] {
            BC01QY3_A859CumCodCont, BC01QY3_A862CumConFec, BC01QY3_A10777CumCCos, BC01QY3_A11368CumConTipo, BC01QY3_A8925CC_AlmCd, BC01QY3_n8925CC_AlmCd, BC01QY3_A396EmprCod, BC01QY3_A3839CcoCod, BC01QY3_n3839CcoCod, BC01QY3_A129BarCod,
            BC01QY3_A132BarCodReo, BC01QY3_A130BarCodPar
            }
            , new Object[] {
            BC01QY4_A407EmprNom, BC01QY4_n407EmprNom
            }
            , new Object[] {
            BC01QY5_A3839CcoCod
            }
            , new Object[] {
            BC01QY6_A396EmprCod
            }
            , new Object[] {
            BC01QY7_A407EmprNom, BC01QY7_n407EmprNom
            }
            , new Object[] {
            BC01QY8_A859CumCodCont, BC01QY8_A407EmprNom, BC01QY8_n407EmprNom, BC01QY8_A862CumConFec, BC01QY8_A10777CumCCos, BC01QY8_A11368CumConTipo, BC01QY8_A8925CC_AlmCd, BC01QY8_n8925CC_AlmCd, BC01QY8_A396EmprCod, BC01QY8_A3839CcoCod,
            BC01QY8_n3839CcoCod, BC01QY8_A129BarCod, BC01QY8_A132BarCodReo, BC01QY8_A130BarCodPar
            }
            , new Object[] {
            BC01QY9_A396EmprCod
            }
            , new Object[] {
            BC01QY10_A3839CcoCod
            }
            , new Object[] {
            BC01QY11_A396EmprCod, BC01QY11_A859CumCodCont
            }
            , new Object[] {
            BC01QY12_A859CumCodCont, BC01QY12_A862CumConFec, BC01QY12_A10777CumCCos, BC01QY12_A11368CumConTipo, BC01QY12_A8925CC_AlmCd, BC01QY12_n8925CC_AlmCd, BC01QY12_A396EmprCod, BC01QY12_A3839CcoCod, BC01QY12_n3839CcoCod, BC01QY12_A129BarCod,
            BC01QY12_A132BarCodReo, BC01QY12_A130BarCodPar
            }
            , new Object[] {
            BC01QY13_A859CumCodCont, BC01QY13_A862CumConFec, BC01QY13_A10777CumCCos, BC01QY13_A11368CumConTipo, BC01QY13_A8925CC_AlmCd, BC01QY13_n8925CC_AlmCd, BC01QY13_A396EmprCod, BC01QY13_A3839CcoCod, BC01QY13_n3839CcoCod, BC01QY13_A129BarCod,
            BC01QY13_A132BarCodReo, BC01QY13_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC01QY17_A396EmprCod, BC01QY17_A859CumCodCont, BC01QY17_A719PrdNum
            }
            , new Object[] {
            BC01QY18_A859CumCodCont, BC01QY18_A407EmprNom, BC01QY18_n407EmprNom, BC01QY18_A862CumConFec, BC01QY18_A10777CumCCos, BC01QY18_A11368CumConTipo, BC01QY18_A8925CC_AlmCd, BC01QY18_n8925CC_AlmCd, BC01QY18_A396EmprCod, BC01QY18_A3839CcoCod,
            BC01QY18_n3839CcoCod, BC01QY18_A129BarCod, BC01QY18_A132BarCodReo, BC01QY18_A130BarCodPar
            }
            , new Object[] {
            BC01QY19_A407EmprNom, BC01QY19_n407EmprNom
            }
            , new Object[] {
            BC01QY20_A407EmprNom, BC01QY20_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV21Pgmname = "StocksQuimicos.SalidasManualesProductos_Cabecera_BC" ;
      Z11368CumConTipo = (byte)(0) ;
      A11368CumConTipo = (byte)(0) ;
      i11368CumConTipo = (byte)(0) ;
      Z862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i862CumConFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e121QY2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV18Insert_BarCodReo ;
   private byte Z11368CumConTipo ;
   private byte A11368CumConTipo ;
   private byte Z8925CC_AlmCd ;
   private byte A8925CC_AlmCd ;
   private byte Z132BarCodReo ;
   private byte A132BarCodReo ;
   private byte Gx_BScreen ;
   private byte GXv_int6[] ;
   private byte i11368CumConTipo ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV12Insert_CcoCod ;
   private short Z10777CumCCos ;
   private short A10777CumCCos ;
   private short Z3839CcoCod ;
   private short A3839CcoCod ;
   private short RcdFound111 ;
   private short nIsDirty_111 ;
   private short GXv_int7[] ;
   private int trnEnded ;
   private int Z859CumCodCont ;
   private int A859CumCodCont ;
   private int AV22GXV1 ;
   private int AV17Insert_BarCod ;
   private int GX_JID ;
   private int Z129BarCod ;
   private int A129BarCod ;
   private int GXv_int8[] ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z396EmprCod ;
   private String A396EmprCod ;
   private String AV14Station ;
   private String AV15EmprNom ;
   private String AV16UsurCod ;
   private String AV7EmprCod ;
   private String GXv_char2[] ;
   private String AV21Pgmname ;
   private String AV19Insert_BarCodPar ;
   private String Z130BarCodPar ;
   private String A130BarCodPar ;
   private String Z10778CumCCosD ;
   private String A10778CumCCosD ;
   private String Z8926CC_AlmDc ;
   private String A8926CC_AlmDc ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String sMode111 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z862CumConFec ;
   private java.util.Date A862CumConFec ;
   private java.util.Date i862CumConFec ;
   private boolean returnInSub ;
   private boolean n407EmprNom ;
   private boolean n8925CC_AlmCd ;
   private boolean n3839CcoCod ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Cabecera bcstocksquimicos_SalidasManualesProductos_Cabecera ;
   private IDataStoreProvider pr_default ;
   private String[] BC01QY7_A407EmprNom ;
   private boolean[] BC01QY7_n407EmprNom ;
   private int[] BC01QY8_A859CumCodCont ;
   private String[] BC01QY8_A407EmprNom ;
   private boolean[] BC01QY8_n407EmprNom ;
   private java.util.Date[] BC01QY8_A862CumConFec ;
   private short[] BC01QY8_A10777CumCCos ;
   private byte[] BC01QY8_A11368CumConTipo ;
   private byte[] BC01QY8_A8925CC_AlmCd ;
   private boolean[] BC01QY8_n8925CC_AlmCd ;
   private String[] BC01QY8_A396EmprCod ;
   private short[] BC01QY8_A3839CcoCod ;
   private boolean[] BC01QY8_n3839CcoCod ;
   private int[] BC01QY8_A129BarCod ;
   private byte[] BC01QY8_A132BarCodReo ;
   private String[] BC01QY8_A130BarCodPar ;
   private String[] BC01QY9_A396EmprCod ;
   private short[] BC01QY10_A3839CcoCod ;
   private boolean[] BC01QY10_n3839CcoCod ;
   private String[] BC01QY11_A396EmprCod ;
   private int[] BC01QY11_A859CumCodCont ;
   private int[] BC01QY12_A859CumCodCont ;
   private java.util.Date[] BC01QY12_A862CumConFec ;
   private short[] BC01QY12_A10777CumCCos ;
   private byte[] BC01QY12_A11368CumConTipo ;
   private byte[] BC01QY12_A8925CC_AlmCd ;
   private boolean[] BC01QY12_n8925CC_AlmCd ;
   private String[] BC01QY12_A396EmprCod ;
   private short[] BC01QY12_A3839CcoCod ;
   private boolean[] BC01QY12_n3839CcoCod ;
   private int[] BC01QY12_A129BarCod ;
   private byte[] BC01QY12_A132BarCodReo ;
   private String[] BC01QY12_A130BarCodPar ;
   private int[] BC01QY13_A859CumCodCont ;
   private java.util.Date[] BC01QY13_A862CumConFec ;
   private short[] BC01QY13_A10777CumCCos ;
   private byte[] BC01QY13_A11368CumConTipo ;
   private byte[] BC01QY13_A8925CC_AlmCd ;
   private boolean[] BC01QY13_n8925CC_AlmCd ;
   private String[] BC01QY13_A396EmprCod ;
   private short[] BC01QY13_A3839CcoCod ;
   private boolean[] BC01QY13_n3839CcoCod ;
   private int[] BC01QY13_A129BarCod ;
   private byte[] BC01QY13_A132BarCodReo ;
   private String[] BC01QY13_A130BarCodPar ;
   private String[] BC01QY17_A396EmprCod ;
   private int[] BC01QY17_A859CumCodCont ;
   private String[] BC01QY17_A719PrdNum ;
   private int[] BC01QY18_A859CumCodCont ;
   private String[] BC01QY18_A407EmprNom ;
   private boolean[] BC01QY18_n407EmprNom ;
   private java.util.Date[] BC01QY18_A862CumConFec ;
   private short[] BC01QY18_A10777CumCCos ;
   private byte[] BC01QY18_A11368CumConTipo ;
   private byte[] BC01QY18_A8925CC_AlmCd ;
   private boolean[] BC01QY18_n8925CC_AlmCd ;
   private String[] BC01QY18_A396EmprCod ;
   private short[] BC01QY18_A3839CcoCod ;
   private boolean[] BC01QY18_n3839CcoCod ;
   private int[] BC01QY18_A129BarCod ;
   private byte[] BC01QY18_A132BarCodReo ;
   private String[] BC01QY18_A130BarCodPar ;
   private boolean[] BC01QY3_n10777CumCCos ;
   private boolean[] BC01QY3_n8925CC_AlmCd ;
   private String[] BC01QY19_A407EmprNom ;
   private boolean[] BC01QY19_n407EmprNom ;
   private String[] BC01QY20_A407EmprNom ;
   private boolean[] BC01QY20_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] BC01QY2_A859CumCodCont ;
   private java.util.Date[] BC01QY2_A862CumConFec ;
   private short[] BC01QY2_A10777CumCCos ;
   private byte[] BC01QY2_A11368CumConTipo ;
   private byte[] BC01QY2_A8925CC_AlmCd ;
   private String[] BC01QY2_A396EmprCod ;
   private short[] BC01QY2_A3839CcoCod ;
   private int[] BC01QY2_A129BarCod ;
   private byte[] BC01QY2_A132BarCodReo ;
   private String[] BC01QY2_A130BarCodPar ;
   private int[] BC01QY3_A859CumCodCont ;
   private java.util.Date[] BC01QY3_A862CumConFec ;
   private short[] BC01QY3_A10777CumCCos ;
   private byte[] BC01QY3_A11368CumConTipo ;
   private byte[] BC01QY3_A8925CC_AlmCd ;
   private String[] BC01QY3_A396EmprCod ;
   private short[] BC01QY3_A3839CcoCod ;
   private int[] BC01QY3_A129BarCod ;
   private byte[] BC01QY3_A132BarCodReo ;
   private String[] BC01QY3_A130BarCodPar ;
   private String[] BC01QY4_A407EmprNom ;
   private short[] BC01QY5_A3839CcoCod ;
   private String[] BC01QY6_A396EmprCod ;
   private boolean[] BC01QY2_n8925CC_AlmCd ;
   private boolean[] BC01QY2_n3839CcoCod ;
   private boolean[] BC01QY3_n3839CcoCod ;
   private boolean[] BC01QY4_n407EmprNom ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class salidasmanualesproductos_cabecera_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_cabecera_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC01QY2", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ?  FOR UPDATE OF CumConFec, CumCCos, CumConTipo, CC_AlmCd, CcoCod, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY3", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY5", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY6", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumCodCont, T2.EmprNom, TM1.CumConFec, TM1.CumCCos, TM1.CumConTipo, TM1.CC_AlmCd, TM1.EmprCod, TM1.CcoCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPCCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY9", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY10", "SELECT CcoCod FROM TXPCENTCO WHERE CcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY12", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY13", "SELECT CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ?  FOR UPDATE OF CumConFec, CumCCos, CumConTipo, CC_AlmCd, CcoCod, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC01QY14", "INSERT INTO TXPCCUMCO(CumCodCont, CumConFec, CumCCos, CumConTipo, CC_AlmCd, EmprCod, CcoCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("BC01QY15", "UPDATE TXPCCUMCO SET CumConFec=?, CumCCos=?, CumConTipo=?, CC_AlmCd=?, CcoCod=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new UpdateCursor("BC01QY16", "DELETE FROM TXPCCUMCO  WHERE EmprCod = ? AND CumCodCont = ?", GX_NOMASK, "TXPCCUMCO")
         ,new ForEachCursor("BC01QY17", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC01QY18", "SELECT /*+ FIRST_ROWS(100) */ TM1.CumCodCont, T2.EmprNom, TM1.CumConFec, TM1.CumCCos, TM1.CumConTipo, TM1.CC_AlmCd, TM1.EmprCod, TM1.CcoCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPCCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC01QY20", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[5]).byteValue());
               }
               stmt.setString(6, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setByte(9, ((Number) parms[10]).byteValue());
               stmt.setString(10, (String)parms[11], 1);
               return;
            case 13 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               stmt.setInt(6, ((Number) parms[7]).intValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 1);
               stmt.setString(9, (String)parms[10], 3);
               stmt.setInt(10, ((Number) parms[11]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

