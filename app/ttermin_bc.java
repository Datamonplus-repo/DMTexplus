package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttermin_bc extends GXWebPanel implements IGxSilentTrn
{
   public ttermin_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttermin_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttermin_bc.class ));
   }

   public ttermin_bc( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void getInsDefault( )
   {
      readRow2Y122( ) ;
      standaloneNotModal( ) ;
      initializeNonKey2Y122( ) ;
      standaloneModal( ) ;
      addRow2Y122( ) ;
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
         e112Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            Z942TermCod = A942TermCod ;
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

   public void confirm_2Y0( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2Y122( ) ;
         }
         else
         {
            checkExtendedTable2Y122( ) ;
            if ( AnyError == 0 )
            {
               zm2Y122( 15) ;
               zm2Y122( 16) ;
            }
            closeExtendedTableCursors2Y122( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e122Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit0 = GXt_char1 ;
      GXt_char1 = AV17Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN522_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit1 = GXt_char1 ;
      GXt_char1 = AV18Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1107_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit2 = GXt_char1 ;
      GXt_char1 = AV19Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN002_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit3 = GXt_char1 ;
      AV22Lit4 = AV19Lit3 ;
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      GXt_char1 = AV24Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT79_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit6 = GXt_char1 ;
      GXt_char1 = AV28Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1238_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit7 = GXt_char1 ;
      GXt_char1 = AV21LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV21LitFe = GXt_char1 ;
      GXt_char1 = AV27Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttermin_bc.this.GXt_char1 = GXv_char2[0] ;
      AV27Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttermin_bc.this.AV25EmprCod = GXv_char2[0] ;
      ttermin_bc.this.AV26EmprNom = GXv_char3[0] ;
      ttermin_bc.this.AV20UsurCod = GXv_char4[0] ;
      AV38Insert_EmprCod = AV25EmprCod ;
      GXt_int5 = AV32PesColGX ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "PECOGX", ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV32PesColGX = GXt_int5 ;
      A8899TermPes_Visible = AV32PesColGX ;
      GXt_int5 = AV33Bros ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV25EmprCod, httpContext.getMessage( "BROS", ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV33Bros = GXt_int5 ;
      GXt_char1 = AV27Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttermin_bc.this.GXt_char1 = GXv_char4[0] ;
      AV27Station = GXt_char1 ;
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV27Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttermin_bc.this.AV25EmprCod = GXv_char4[0] ;
      ttermin_bc.this.AV26EmprNom = GXv_char3[0] ;
      ttermin_bc.this.AV20UsurCod = GXv_char2[0] ;
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV36TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV44Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV45GXV1 = 1 ;
         while ( AV45GXV1 <= AV36TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV40TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV36TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV45GXV1));
            if ( GXutil.strcmp(AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "EmprCod") == 0 )
            {
               AV38Insert_EmprCod = AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
            }
            else if ( GXutil.strcmp(AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ImpCod") == 0 )
            {
               AV39Insert_ImpCod = AV40TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
            }
            AV45GXV1 = (int)(AV45GXV1+1) ;
         }
      }
   }

   public void e112Y2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void e132Y2( )
   {
      /* 'Asociar CLIENTES' Routine */
      returnInSub = false ;
      if ( ( AV33Bros == 1 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 ) && ( GXutil.strcmp(A942TermCod, " ") != 0 ) )
      {
         callWebObject(formatLink("app.ttermcl", new String[] {GXutil.URLEncode(GXutil.rtrim(A942TermCod)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A8898TermDsc))}, new String[] {"TermCod","EmprCod","TermDsc"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void zm2Y122( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         Z8899TermPes = A8899TermPes ;
         Z8898TermDsc = A8898TermDsc ;
         Z1189TermUsu = A1189TermUsu ;
         Z1441ImpCod1 = A1441ImpCod1 ;
         Z1442ImpCod2 = A1442ImpCod2 ;
         Z1443ImpCod3 = A1443ImpCod3 ;
         Z1444ImpCod4 = A1444ImpCod4 ;
         Z1445ImpCod5 = A1445ImpCod5 ;
         Z1446ImpLpt1 = A1446ImpLpt1 ;
         Z1447ImpLpt2 = A1447ImpLpt2 ;
         Z1448ImpLpt3 = A1448ImpLpt3 ;
         Z1449ImpLpt4 = A1449ImpLpt4 ;
         Z1450ImpLpt5 = A1450ImpLpt5 ;
         Z6112TermBol = A6112TermBol ;
         Z6113TermBal = A6113TermBal ;
         Z8678TermNoTr = A8678TermNoTr ;
         Z6721TermLog1 = A6721TermLog1 ;
         Z6722TermLog2 = A6722TermLog2 ;
         Z11757TermEst = A11757TermEst ;
         Z11758TermFec = A11758TermFec ;
         Z574ImpCod = A574ImpCod ;
         Z396EmprCod = A396EmprCod ;
      }
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z576ImpDsc = A576ImpDsc ;
      }
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         Z407EmprNom = A407EmprNom ;
      }
      if ( GX_JID == -14 )
      {
         Z942TermCod = A942TermCod ;
         Z8899TermPes = A8899TermPes ;
         Z8898TermDsc = A8898TermDsc ;
         Z1189TermUsu = A1189TermUsu ;
         Z1441ImpCod1 = A1441ImpCod1 ;
         Z1442ImpCod2 = A1442ImpCod2 ;
         Z1443ImpCod3 = A1443ImpCod3 ;
         Z1444ImpCod4 = A1444ImpCod4 ;
         Z1445ImpCod5 = A1445ImpCod5 ;
         Z1446ImpLpt1 = A1446ImpLpt1 ;
         Z1447ImpLpt2 = A1447ImpLpt2 ;
         Z1448ImpLpt3 = A1448ImpLpt3 ;
         Z1449ImpLpt4 = A1449ImpLpt4 ;
         Z1450ImpLpt5 = A1450ImpLpt5 ;
         Z6112TermBol = A6112TermBol ;
         Z6113TermBal = A6113TermBal ;
         Z8678TermNoTr = A8678TermNoTr ;
         Z6721TermLog1 = A6721TermLog1 ;
         Z6722TermLog2 = A6722TermLog2 ;
         Z11757TermEst = A11757TermEst ;
         Z11758TermFec = A11758TermFec ;
         Z574ImpCod = A574ImpCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z576ImpDsc = A576ImpDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV44Pgmname = "TTERMIN_BC" ;
   }

   public void standaloneModal( )
   {
      if ( AV32PesColGX == 0 )
      {
         A8899TermPes = (byte)(0) ;
         n8899TermPes = false ;
      }
   }

   public void load2Y122( )
   {
      /* Using cursor BC002Y6 */
      pr_default.execute(4, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A8899TermPes = BC002Y6_A8899TermPes[0] ;
         n8899TermPes = BC002Y6_n8899TermPes[0] ;
         A407EmprNom = BC002Y6_A407EmprNom[0] ;
         n407EmprNom = BC002Y6_n407EmprNom[0] ;
         A8898TermDsc = BC002Y6_A8898TermDsc[0] ;
         n8898TermDsc = BC002Y6_n8898TermDsc[0] ;
         A576ImpDsc = BC002Y6_A576ImpDsc[0] ;
         n576ImpDsc = BC002Y6_n576ImpDsc[0] ;
         A1189TermUsu = BC002Y6_A1189TermUsu[0] ;
         n1189TermUsu = BC002Y6_n1189TermUsu[0] ;
         A1441ImpCod1 = BC002Y6_A1441ImpCod1[0] ;
         n1441ImpCod1 = BC002Y6_n1441ImpCod1[0] ;
         A1442ImpCod2 = BC002Y6_A1442ImpCod2[0] ;
         n1442ImpCod2 = BC002Y6_n1442ImpCod2[0] ;
         A1443ImpCod3 = BC002Y6_A1443ImpCod3[0] ;
         n1443ImpCod3 = BC002Y6_n1443ImpCod3[0] ;
         A1444ImpCod4 = BC002Y6_A1444ImpCod4[0] ;
         n1444ImpCod4 = BC002Y6_n1444ImpCod4[0] ;
         A1445ImpCod5 = BC002Y6_A1445ImpCod5[0] ;
         n1445ImpCod5 = BC002Y6_n1445ImpCod5[0] ;
         A1446ImpLpt1 = BC002Y6_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = BC002Y6_n1446ImpLpt1[0] ;
         A1447ImpLpt2 = BC002Y6_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = BC002Y6_n1447ImpLpt2[0] ;
         A1448ImpLpt3 = BC002Y6_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = BC002Y6_n1448ImpLpt3[0] ;
         A1449ImpLpt4 = BC002Y6_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = BC002Y6_n1449ImpLpt4[0] ;
         A1450ImpLpt5 = BC002Y6_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = BC002Y6_n1450ImpLpt5[0] ;
         A6112TermBol = BC002Y6_A6112TermBol[0] ;
         n6112TermBol = BC002Y6_n6112TermBol[0] ;
         A6113TermBal = BC002Y6_A6113TermBal[0] ;
         n6113TermBal = BC002Y6_n6113TermBal[0] ;
         A8678TermNoTr = BC002Y6_A8678TermNoTr[0] ;
         n8678TermNoTr = BC002Y6_n8678TermNoTr[0] ;
         A6721TermLog1 = BC002Y6_A6721TermLog1[0] ;
         n6721TermLog1 = BC002Y6_n6721TermLog1[0] ;
         A6722TermLog2 = BC002Y6_A6722TermLog2[0] ;
         n6722TermLog2 = BC002Y6_n6722TermLog2[0] ;
         A11757TermEst = BC002Y6_A11757TermEst[0] ;
         n11757TermEst = BC002Y6_n11757TermEst[0] ;
         A11758TermFec = BC002Y6_A11758TermFec[0] ;
         n11758TermFec = BC002Y6_n11758TermFec[0] ;
         A574ImpCod = BC002Y6_A574ImpCod[0] ;
         n574ImpCod = BC002Y6_n574ImpCod[0] ;
         A396EmprCod = BC002Y6_A396EmprCod[0] ;
         n396EmprCod = BC002Y6_n396EmprCod[0] ;
         zm2Y122( -14) ;
      }
      pr_default.close(4);
      onLoadActions2Y122( ) ;
   }

   public void onLoadActions2Y122( )
   {
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( AV30Sedamil.doubleValue() == 1 )
      {
         A6112TermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
      }
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      if ( ! ( ( AV29Cladd == 1 ) ) )
      {
         A8678TermNoTr_Visible = 0 ;
      }
      else
      {
         if ( AV29Cladd == 1 )
         {
            A8678TermNoTr_Visible = 1 ;
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         A6112TermBol_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            A6112TermBol_Visible = 0 ;
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         A6721TermLog1_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            A6721TermLog1_Visible = 0 ;
         }
         else
         {
            A6721TermLog1_Visible = AV29Cladd ;
         }
      }
      A6722TermLog2_Visible = AV29Cladd ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
      {
         A6113TermBal_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
         {
            A6113TermBal_Visible = 0 ;
         }
      }
   }

   public void checkExtendedTable2Y122( )
   {
      nIsDirty_122 = (short)(0) ;
      standaloneModal( ) ;
      /* Using cursor BC002Y7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = BC002Y7_A407EmprNom[0] ;
      n407EmprNom = BC002Y7_n407EmprNom[0] ;
      pr_default.close(5);
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( AV30Sedamil.doubleValue() == 1 )
      {
         A6112TermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
      }
      GXt_int5 = AV29Cladd ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV29Cladd = GXt_int5 ;
      if ( ! ( ( AV29Cladd == 1 ) ) )
      {
         A8678TermNoTr_Visible = 0 ;
      }
      else
      {
         if ( AV29Cladd == 1 )
         {
            A8678TermNoTr_Visible = 1 ;
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         A6112TermBol_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            A6112TermBol_Visible = 0 ;
         }
      }
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
      {
         A6721TermLog1_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
         {
            A6721TermLog1_Visible = 0 ;
         }
         else
         {
            A6721TermLog1_Visible = AV29Cladd ;
         }
      }
      A6722TermLog2_Visible = AV29Cladd ;
      GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
      AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
      if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
      {
         A6113TermBal_Visible = 1 ;
      }
      else
      {
         if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
         {
            A6113TermBal_Visible = 0 ;
         }
      }
      /* Using cursor BC002Y8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "IMPRES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "IMPCOD");
         AnyError = (short)(1) ;
      }
      A576ImpDsc = BC002Y8_A576ImpDsc[0] ;
      n576ImpDsc = BC002Y8_n576ImpDsc[0] ;
      pr_default.close(6);
   }

   public void closeExtendedTableCursors2Y122( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void getKey2Y122( )
   {
      /* Using cursor BC002Y9 */
      pr_default.execute(7, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound122 = (short)(1) ;
      }
      else
      {
         RcdFound122 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC002Y10 */
      pr_default.execute(8, new Object[] {A942TermCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         zm2Y122( 14) ;
         RcdFound122 = (short)(1) ;
         A942TermCod = BC002Y10_A942TermCod[0] ;
         A8899TermPes = BC002Y10_A8899TermPes[0] ;
         n8899TermPes = BC002Y10_n8899TermPes[0] ;
         A8898TermDsc = BC002Y10_A8898TermDsc[0] ;
         n8898TermDsc = BC002Y10_n8898TermDsc[0] ;
         A1189TermUsu = BC002Y10_A1189TermUsu[0] ;
         n1189TermUsu = BC002Y10_n1189TermUsu[0] ;
         A1441ImpCod1 = BC002Y10_A1441ImpCod1[0] ;
         n1441ImpCod1 = BC002Y10_n1441ImpCod1[0] ;
         A1442ImpCod2 = BC002Y10_A1442ImpCod2[0] ;
         n1442ImpCod2 = BC002Y10_n1442ImpCod2[0] ;
         A1443ImpCod3 = BC002Y10_A1443ImpCod3[0] ;
         n1443ImpCod3 = BC002Y10_n1443ImpCod3[0] ;
         A1444ImpCod4 = BC002Y10_A1444ImpCod4[0] ;
         n1444ImpCod4 = BC002Y10_n1444ImpCod4[0] ;
         A1445ImpCod5 = BC002Y10_A1445ImpCod5[0] ;
         n1445ImpCod5 = BC002Y10_n1445ImpCod5[0] ;
         A1446ImpLpt1 = BC002Y10_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = BC002Y10_n1446ImpLpt1[0] ;
         A1447ImpLpt2 = BC002Y10_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = BC002Y10_n1447ImpLpt2[0] ;
         A1448ImpLpt3 = BC002Y10_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = BC002Y10_n1448ImpLpt3[0] ;
         A1449ImpLpt4 = BC002Y10_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = BC002Y10_n1449ImpLpt4[0] ;
         A1450ImpLpt5 = BC002Y10_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = BC002Y10_n1450ImpLpt5[0] ;
         A6112TermBol = BC002Y10_A6112TermBol[0] ;
         n6112TermBol = BC002Y10_n6112TermBol[0] ;
         A6113TermBal = BC002Y10_A6113TermBal[0] ;
         n6113TermBal = BC002Y10_n6113TermBal[0] ;
         A8678TermNoTr = BC002Y10_A8678TermNoTr[0] ;
         n8678TermNoTr = BC002Y10_n8678TermNoTr[0] ;
         A6721TermLog1 = BC002Y10_A6721TermLog1[0] ;
         n6721TermLog1 = BC002Y10_n6721TermLog1[0] ;
         A6722TermLog2 = BC002Y10_A6722TermLog2[0] ;
         n6722TermLog2 = BC002Y10_n6722TermLog2[0] ;
         A11757TermEst = BC002Y10_A11757TermEst[0] ;
         n11757TermEst = BC002Y10_n11757TermEst[0] ;
         A11758TermFec = BC002Y10_A11758TermFec[0] ;
         n11758TermFec = BC002Y10_n11758TermFec[0] ;
         A574ImpCod = BC002Y10_A574ImpCod[0] ;
         n574ImpCod = BC002Y10_n574ImpCod[0] ;
         A396EmprCod = BC002Y10_A396EmprCod[0] ;
         n396EmprCod = BC002Y10_n396EmprCod[0] ;
         Z942TermCod = A942TermCod ;
         sMode122 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load2Y122( ) ;
         if ( AnyError == 1 )
         {
            RcdFound122 = (short)(0) ;
            initializeNonKey2Y122( ) ;
         }
         Gx_mode = sMode122 ;
      }
      else
      {
         RcdFound122 = (short)(0) ;
         initializeNonKey2Y122( ) ;
         sMode122 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode122 ;
      }
      pr_default.close(8);
   }

   public void getEqualNoModal( )
   {
      getKey2Y122( ) ;
      if ( RcdFound122 == 0 )
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
      confirm_2Y0( ) ;
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

   public void checkOptimisticConcurrency2Y122( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor BC002Y11 */
         pr_default.execute(9, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(9) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(9) == 101) || ( Z8899TermPes != BC002Y11_A8899TermPes[0] ) || ( GXutil.strcmp(Z8898TermDsc, BC002Y11_A8898TermDsc[0]) != 0 ) || ( GXutil.strcmp(Z1189TermUsu, BC002Y11_A1189TermUsu[0]) != 0 ) || ( GXutil.strcmp(Z1441ImpCod1, BC002Y11_A1441ImpCod1[0]) != 0 ) || ( GXutil.strcmp(Z1442ImpCod2, BC002Y11_A1442ImpCod2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1443ImpCod3, BC002Y11_A1443ImpCod3[0]) != 0 ) || ( GXutil.strcmp(Z1444ImpCod4, BC002Y11_A1444ImpCod4[0]) != 0 ) || ( GXutil.strcmp(Z1445ImpCod5, BC002Y11_A1445ImpCod5[0]) != 0 ) || ( GXutil.strcmp(Z1446ImpLpt1, BC002Y11_A1446ImpLpt1[0]) != 0 ) || ( GXutil.strcmp(Z1447ImpLpt2, BC002Y11_A1447ImpLpt2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1448ImpLpt3, BC002Y11_A1448ImpLpt3[0]) != 0 ) || ( GXutil.strcmp(Z1449ImpLpt4, BC002Y11_A1449ImpLpt4[0]) != 0 ) || ( GXutil.strcmp(Z1450ImpLpt5, BC002Y11_A1450ImpLpt5[0]) != 0 ) || ( Z6112TermBol != BC002Y11_A6112TermBol[0] ) || ( Z6113TermBal != BC002Y11_A6113TermBal[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8678TermNoTr != BC002Y11_A8678TermNoTr[0] ) || ( GXutil.strcmp(Z6721TermLog1, BC002Y11_A6721TermLog1[0]) != 0 ) || ( GXutil.strcmp(Z6722TermLog2, BC002Y11_A6722TermLog2[0]) != 0 ) || ( Z11757TermEst != BC002Y11_A11757TermEst[0] ) || !( GXutil.dateCompare(Z11758TermFec, BC002Y11_A11758TermFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z574ImpCod, BC002Y11_A574ImpCod[0]) != 0 ) || ( GXutil.strcmp(Z396EmprCod, BC002Y11_A396EmprCod[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTERMIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2Y122( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2Y122( 0) ;
         checkOptimisticConcurrency2Y122( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2Y122( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2Y122( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002Y12 */
                  pr_default.execute(10, new Object[] {A942TermCod, Boolean.valueOf(n8899TermPes), Byte.valueOf(A8899TermPes), Boolean.valueOf(n8898TermDsc), A8898TermDsc, Boolean.valueOf(n1189TermUsu), A1189TermUsu, Boolean.valueOf(n1441ImpCod1), A1441ImpCod1, Boolean.valueOf(n1442ImpCod2), A1442ImpCod2, Boolean.valueOf(n1443ImpCod3), A1443ImpCod3, Boolean.valueOf(n1444ImpCod4), A1444ImpCod4, Boolean.valueOf(n1445ImpCod5), A1445ImpCod5, Boolean.valueOf(n1446ImpLpt1), A1446ImpLpt1, Boolean.valueOf(n1447ImpLpt2), A1447ImpLpt2, Boolean.valueOf(n1448ImpLpt3), A1448ImpLpt3, Boolean.valueOf(n1449ImpLpt4), A1449ImpLpt4, Boolean.valueOf(n1450ImpLpt5), A1450ImpLpt5, Boolean.valueOf(n6112TermBol), Byte.valueOf(A6112TermBol), Boolean.valueOf(n6113TermBal), Byte.valueOf(A6113TermBal), Boolean.valueOf(n8678TermNoTr), Byte.valueOf(A8678TermNoTr), Boolean.valueOf(n6721TermLog1), A6721TermLog1, Boolean.valueOf(n6722TermLog2), A6722TermLog2, Boolean.valueOf(n11757TermEst), Byte.valueOf(A11757TermEst), Boolean.valueOf(n11758TermFec), A11758TermFec, Boolean.valueOf(n574ImpCod), A574ImpCod, Boolean.valueOf(n396EmprCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
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
            load2Y122( ) ;
         }
         endLevel2Y122( ) ;
      }
      closeExtendedTableCursors2Y122( ) ;
   }

   public void update2Y122( )
   {
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2Y122( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2Y122( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2Y122( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC002Y13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n8899TermPes), Byte.valueOf(A8899TermPes), Boolean.valueOf(n8898TermDsc), A8898TermDsc, Boolean.valueOf(n1189TermUsu), A1189TermUsu, Boolean.valueOf(n1441ImpCod1), A1441ImpCod1, Boolean.valueOf(n1442ImpCod2), A1442ImpCod2, Boolean.valueOf(n1443ImpCod3), A1443ImpCod3, Boolean.valueOf(n1444ImpCod4), A1444ImpCod4, Boolean.valueOf(n1445ImpCod5), A1445ImpCod5, Boolean.valueOf(n1446ImpLpt1), A1446ImpLpt1, Boolean.valueOf(n1447ImpLpt2), A1447ImpLpt2, Boolean.valueOf(n1448ImpLpt3), A1448ImpLpt3, Boolean.valueOf(n1449ImpLpt4), A1449ImpLpt4, Boolean.valueOf(n1450ImpLpt5), A1450ImpLpt5, Boolean.valueOf(n6112TermBol), Byte.valueOf(A6112TermBol), Boolean.valueOf(n6113TermBal), Byte.valueOf(A6113TermBal), Boolean.valueOf(n8678TermNoTr), Byte.valueOf(A8678TermNoTr), Boolean.valueOf(n6721TermLog1), A6721TermLog1, Boolean.valueOf(n6722TermLog2), A6722TermLog2, Boolean.valueOf(n11757TermEst), Byte.valueOf(A11757TermEst), Boolean.valueOf(n11758TermFec), A11758TermFec, Boolean.valueOf(n574ImpCod), A574ImpCod, Boolean.valueOf(n396EmprCod), A396EmprCod, A942TermCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTERMIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2Y122( ) ;
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
         endLevel2Y122( ) ;
      }
      closeExtendedTableCursors2Y122( ) ;
   }

   public void deferredUpdate2Y122( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate2Y122( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2Y122( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2Y122( ) ;
         afterConfirm2Y122( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2Y122( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC002Y14 */
               pr_default.execute(12, new Object[] {A942TermCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTERMIN");
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
      sMode122 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel2Y122( ) ;
      Gx_mode = sMode122 ;
   }

   public void onDeleteControls2Y122( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor BC002Y15 */
         pr_default.execute(13, new Object[] {Boolean.valueOf(n396EmprCod), A396EmprCod});
         A407EmprNom = BC002Y15_A407EmprNom[0] ;
         n407EmprNom = BC002Y15_n407EmprNom[0] ;
         pr_default.close(13);
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV30Sedamil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "SEDAMI", ""), ""), GXv_int6) ;
         ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
         AV30Sedamil = DecimalUtil.doubleToDec(GXt_int5) ;
         if ( AV30Sedamil.doubleValue() == 1 )
         {
            A6112TermBol_Caption = httpContext.getMessage( httpContext.getMessage( "Intermec", ""), "") ;
         }
         GXt_int5 = AV29Cladd ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "CLADD", ""), ""), GXv_int6) ;
         ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
         AV29Cladd = GXt_int5 ;
         if ( ! ( ( AV29Cladd == 1 ) ) )
         {
            A8678TermNoTr_Visible = 0 ;
         }
         else
         {
            if ( AV29Cladd == 1 )
            {
               A8678TermNoTr_Visible = 1 ;
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            A6112TermBol_Visible = 1 ;
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               A6112TermBol_Visible = 0 ;
            }
         }
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) )
         {
            A6721TermLog1_Visible = 1 ;
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) ) )
            {
               A6721TermLog1_Visible = 0 ;
            }
            else
            {
               A6721TermLog1_Visible = AV29Cladd ;
            }
         }
         A6722TermLog2_Visible = AV29Cladd ;
         GXt_int5 = (byte)(DecimalUtil.decToDouble(AV31Artextil)) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         ttermin_bc.this.GXt_int5 = GXv_int6[0] ;
         AV31Artextil = DecimalUtil.doubleToDec(GXt_int5) ;
         if ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) )
         {
            A6113TermBal_Visible = 1 ;
         }
         else
         {
            if ( ! ( ( AV29Cladd == 1 ) || ( AV30Sedamil.doubleValue() == 1 ) || ( AV31Artextil.doubleValue() == 1 ) ) )
            {
               A6113TermBal_Visible = 0 ;
            }
         }
         /* Using cursor BC002Y16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n574ImpCod), A574ImpCod});
         A576ImpDsc = BC002Y16_A576ImpDsc[0] ;
         n576ImpDsc = BC002Y16_n576ImpDsc[0] ;
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC002Y17 */
         pr_default.execute(15, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TERMCL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor BC002Y18 */
         pr_default.execute(16, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TERMI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor BC002Y19 */
         pr_default.execute(17, new Object[] {A942TermCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void endLevel2Y122( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(9);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2Y122( ) ;
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

   public void scanKeyStart2Y122( )
   {
      /* Scan By routine */
      /* Using cursor BC002Y20 */
      pr_default.execute(18, new Object[] {A942TermCod});
      RcdFound122 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A942TermCod = BC002Y20_A942TermCod[0] ;
         A8899TermPes = BC002Y20_A8899TermPes[0] ;
         n8899TermPes = BC002Y20_n8899TermPes[0] ;
         A407EmprNom = BC002Y20_A407EmprNom[0] ;
         n407EmprNom = BC002Y20_n407EmprNom[0] ;
         A8898TermDsc = BC002Y20_A8898TermDsc[0] ;
         n8898TermDsc = BC002Y20_n8898TermDsc[0] ;
         A576ImpDsc = BC002Y20_A576ImpDsc[0] ;
         n576ImpDsc = BC002Y20_n576ImpDsc[0] ;
         A1189TermUsu = BC002Y20_A1189TermUsu[0] ;
         n1189TermUsu = BC002Y20_n1189TermUsu[0] ;
         A1441ImpCod1 = BC002Y20_A1441ImpCod1[0] ;
         n1441ImpCod1 = BC002Y20_n1441ImpCod1[0] ;
         A1442ImpCod2 = BC002Y20_A1442ImpCod2[0] ;
         n1442ImpCod2 = BC002Y20_n1442ImpCod2[0] ;
         A1443ImpCod3 = BC002Y20_A1443ImpCod3[0] ;
         n1443ImpCod3 = BC002Y20_n1443ImpCod3[0] ;
         A1444ImpCod4 = BC002Y20_A1444ImpCod4[0] ;
         n1444ImpCod4 = BC002Y20_n1444ImpCod4[0] ;
         A1445ImpCod5 = BC002Y20_A1445ImpCod5[0] ;
         n1445ImpCod5 = BC002Y20_n1445ImpCod5[0] ;
         A1446ImpLpt1 = BC002Y20_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = BC002Y20_n1446ImpLpt1[0] ;
         A1447ImpLpt2 = BC002Y20_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = BC002Y20_n1447ImpLpt2[0] ;
         A1448ImpLpt3 = BC002Y20_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = BC002Y20_n1448ImpLpt3[0] ;
         A1449ImpLpt4 = BC002Y20_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = BC002Y20_n1449ImpLpt4[0] ;
         A1450ImpLpt5 = BC002Y20_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = BC002Y20_n1450ImpLpt5[0] ;
         A6112TermBol = BC002Y20_A6112TermBol[0] ;
         n6112TermBol = BC002Y20_n6112TermBol[0] ;
         A6113TermBal = BC002Y20_A6113TermBal[0] ;
         n6113TermBal = BC002Y20_n6113TermBal[0] ;
         A8678TermNoTr = BC002Y20_A8678TermNoTr[0] ;
         n8678TermNoTr = BC002Y20_n8678TermNoTr[0] ;
         A6721TermLog1 = BC002Y20_A6721TermLog1[0] ;
         n6721TermLog1 = BC002Y20_n6721TermLog1[0] ;
         A6722TermLog2 = BC002Y20_A6722TermLog2[0] ;
         n6722TermLog2 = BC002Y20_n6722TermLog2[0] ;
         A11757TermEst = BC002Y20_A11757TermEst[0] ;
         n11757TermEst = BC002Y20_n11757TermEst[0] ;
         A11758TermFec = BC002Y20_A11758TermFec[0] ;
         n11758TermFec = BC002Y20_n11758TermFec[0] ;
         A574ImpCod = BC002Y20_A574ImpCod[0] ;
         n574ImpCod = BC002Y20_n574ImpCod[0] ;
         A396EmprCod = BC002Y20_A396EmprCod[0] ;
         n396EmprCod = BC002Y20_n396EmprCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext2Y122( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound122 = (short)(0) ;
      scanKeyLoad2Y122( ) ;
   }

   public void scanKeyLoad2Y122( )
   {
      sMode122 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound122 = (short)(1) ;
         A942TermCod = BC002Y20_A942TermCod[0] ;
         A8899TermPes = BC002Y20_A8899TermPes[0] ;
         n8899TermPes = BC002Y20_n8899TermPes[0] ;
         A407EmprNom = BC002Y20_A407EmprNom[0] ;
         n407EmprNom = BC002Y20_n407EmprNom[0] ;
         A8898TermDsc = BC002Y20_A8898TermDsc[0] ;
         n8898TermDsc = BC002Y20_n8898TermDsc[0] ;
         A576ImpDsc = BC002Y20_A576ImpDsc[0] ;
         n576ImpDsc = BC002Y20_n576ImpDsc[0] ;
         A1189TermUsu = BC002Y20_A1189TermUsu[0] ;
         n1189TermUsu = BC002Y20_n1189TermUsu[0] ;
         A1441ImpCod1 = BC002Y20_A1441ImpCod1[0] ;
         n1441ImpCod1 = BC002Y20_n1441ImpCod1[0] ;
         A1442ImpCod2 = BC002Y20_A1442ImpCod2[0] ;
         n1442ImpCod2 = BC002Y20_n1442ImpCod2[0] ;
         A1443ImpCod3 = BC002Y20_A1443ImpCod3[0] ;
         n1443ImpCod3 = BC002Y20_n1443ImpCod3[0] ;
         A1444ImpCod4 = BC002Y20_A1444ImpCod4[0] ;
         n1444ImpCod4 = BC002Y20_n1444ImpCod4[0] ;
         A1445ImpCod5 = BC002Y20_A1445ImpCod5[0] ;
         n1445ImpCod5 = BC002Y20_n1445ImpCod5[0] ;
         A1446ImpLpt1 = BC002Y20_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = BC002Y20_n1446ImpLpt1[0] ;
         A1447ImpLpt2 = BC002Y20_A1447ImpLpt2[0] ;
         n1447ImpLpt2 = BC002Y20_n1447ImpLpt2[0] ;
         A1448ImpLpt3 = BC002Y20_A1448ImpLpt3[0] ;
         n1448ImpLpt3 = BC002Y20_n1448ImpLpt3[0] ;
         A1449ImpLpt4 = BC002Y20_A1449ImpLpt4[0] ;
         n1449ImpLpt4 = BC002Y20_n1449ImpLpt4[0] ;
         A1450ImpLpt5 = BC002Y20_A1450ImpLpt5[0] ;
         n1450ImpLpt5 = BC002Y20_n1450ImpLpt5[0] ;
         A6112TermBol = BC002Y20_A6112TermBol[0] ;
         n6112TermBol = BC002Y20_n6112TermBol[0] ;
         A6113TermBal = BC002Y20_A6113TermBal[0] ;
         n6113TermBal = BC002Y20_n6113TermBal[0] ;
         A8678TermNoTr = BC002Y20_A8678TermNoTr[0] ;
         n8678TermNoTr = BC002Y20_n8678TermNoTr[0] ;
         A6721TermLog1 = BC002Y20_A6721TermLog1[0] ;
         n6721TermLog1 = BC002Y20_n6721TermLog1[0] ;
         A6722TermLog2 = BC002Y20_A6722TermLog2[0] ;
         n6722TermLog2 = BC002Y20_n6722TermLog2[0] ;
         A11757TermEst = BC002Y20_A11757TermEst[0] ;
         n11757TermEst = BC002Y20_n11757TermEst[0] ;
         A11758TermFec = BC002Y20_A11758TermFec[0] ;
         n11758TermFec = BC002Y20_n11758TermFec[0] ;
         A574ImpCod = BC002Y20_A574ImpCod[0] ;
         n574ImpCod = BC002Y20_n574ImpCod[0] ;
         A396EmprCod = BC002Y20_A396EmprCod[0] ;
         n396EmprCod = BC002Y20_n396EmprCod[0] ;
      }
      Gx_mode = sMode122 ;
   }

   public void scanKeyEnd2Y122( )
   {
      pr_default.close(18);
   }

   public void afterConfirm2Y122( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2Y122( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2Y122( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2Y122( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2Y122( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2Y122( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2Y122( )
   {
   }

   public void send_integrity_lvl_hashes2Y122( )
   {
   }

   public void addRow2Y122( )
   {
      VarsToRow122( bcTTERMIN) ;
   }

   public void readRow2Y122( )
   {
      RowToVars122( bcTTERMIN, 1) ;
   }

   public void initializeNonKey2Y122( )
   {
      AV30Sedamil = DecimalUtil.ZERO ;
      AV29Cladd = (byte)(0) ;
      AV31Artextil = DecimalUtil.ZERO ;
      A8899TermPes = (byte)(0) ;
      n8899TermPes = false ;
      A396EmprCod = "" ;
      n396EmprCod = false ;
      A407EmprNom = "" ;
      n407EmprNom = false ;
      A8898TermDsc = "" ;
      n8898TermDsc = false ;
      A574ImpCod = "" ;
      n574ImpCod = false ;
      A576ImpDsc = "" ;
      n576ImpDsc = false ;
      A1189TermUsu = "" ;
      n1189TermUsu = false ;
      A1441ImpCod1 = "" ;
      n1441ImpCod1 = false ;
      A1442ImpCod2 = "" ;
      n1442ImpCod2 = false ;
      A1443ImpCod3 = "" ;
      n1443ImpCod3 = false ;
      A1444ImpCod4 = "" ;
      n1444ImpCod4 = false ;
      A1445ImpCod5 = "" ;
      n1445ImpCod5 = false ;
      A1446ImpLpt1 = "" ;
      n1446ImpLpt1 = false ;
      A1447ImpLpt2 = "" ;
      n1447ImpLpt2 = false ;
      A1448ImpLpt3 = "" ;
      n1448ImpLpt3 = false ;
      A1449ImpLpt4 = "" ;
      n1449ImpLpt4 = false ;
      A1450ImpLpt5 = "" ;
      n1450ImpLpt5 = false ;
      A6112TermBol = (byte)(0) ;
      n6112TermBol = false ;
      A6113TermBal = (byte)(0) ;
      n6113TermBal = false ;
      A8678TermNoTr = (byte)(0) ;
      n8678TermNoTr = false ;
      A6721TermLog1 = "" ;
      n6721TermLog1 = false ;
      A6722TermLog2 = "" ;
      n6722TermLog2 = false ;
      A11757TermEst = (byte)(0) ;
      n11757TermEst = false ;
      A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      n11758TermFec = false ;
      Z8899TermPes = (byte)(0) ;
      Z8898TermDsc = "" ;
      Z1189TermUsu = "" ;
      Z1441ImpCod1 = "" ;
      Z1442ImpCod2 = "" ;
      Z1443ImpCod3 = "" ;
      Z1444ImpCod4 = "" ;
      Z1445ImpCod5 = "" ;
      Z1446ImpLpt1 = "" ;
      Z1447ImpLpt2 = "" ;
      Z1448ImpLpt3 = "" ;
      Z1449ImpLpt4 = "" ;
      Z1450ImpLpt5 = "" ;
      Z6112TermBol = (byte)(0) ;
      Z6113TermBal = (byte)(0) ;
      Z8678TermNoTr = (byte)(0) ;
      Z6721TermLog1 = "" ;
      Z6722TermLog2 = "" ;
      Z11757TermEst = (byte)(0) ;
      Z11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      Z574ImpCod = "" ;
      Z396EmprCod = "" ;
   }

   public void initAll2Y122( )
   {
      A942TermCod = "" ;
      initializeNonKey2Y122( ) ;
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

   public void VarsToRow122( app.SdtTTERMIN obj122 )
   {
      obj122.setgxTv_SdtTTERMIN_Mode( Gx_mode );
      obj122.setgxTv_SdtTTERMIN_Termpes( A8899TermPes );
      obj122.setgxTv_SdtTTERMIN_Emprcod( A396EmprCod );
      obj122.setgxTv_SdtTTERMIN_Emprnom( A407EmprNom );
      obj122.setgxTv_SdtTTERMIN_Termdsc( A8898TermDsc );
      obj122.setgxTv_SdtTTERMIN_Impcod( A574ImpCod );
      obj122.setgxTv_SdtTTERMIN_Impdsc( A576ImpDsc );
      obj122.setgxTv_SdtTTERMIN_Termusu( A1189TermUsu );
      obj122.setgxTv_SdtTTERMIN_Impcod1( A1441ImpCod1 );
      obj122.setgxTv_SdtTTERMIN_Impcod2( A1442ImpCod2 );
      obj122.setgxTv_SdtTTERMIN_Impcod3( A1443ImpCod3 );
      obj122.setgxTv_SdtTTERMIN_Impcod4( A1444ImpCod4 );
      obj122.setgxTv_SdtTTERMIN_Impcod5( A1445ImpCod5 );
      obj122.setgxTv_SdtTTERMIN_Implpt1( A1446ImpLpt1 );
      obj122.setgxTv_SdtTTERMIN_Implpt2( A1447ImpLpt2 );
      obj122.setgxTv_SdtTTERMIN_Implpt3( A1448ImpLpt3 );
      obj122.setgxTv_SdtTTERMIN_Implpt4( A1449ImpLpt4 );
      obj122.setgxTv_SdtTTERMIN_Implpt5( A1450ImpLpt5 );
      obj122.setgxTv_SdtTTERMIN_Termbol( A6112TermBol );
      obj122.setgxTv_SdtTTERMIN_Termbal( A6113TermBal );
      obj122.setgxTv_SdtTTERMIN_Termnotr( A8678TermNoTr );
      obj122.setgxTv_SdtTTERMIN_Termlog1( A6721TermLog1 );
      obj122.setgxTv_SdtTTERMIN_Termlog2( A6722TermLog2 );
      obj122.setgxTv_SdtTTERMIN_Termest( A11757TermEst );
      obj122.setgxTv_SdtTTERMIN_Termfec( A11758TermFec );
      obj122.setgxTv_SdtTTERMIN_Termcod( A942TermCod );
      obj122.setgxTv_SdtTTERMIN_Termcod_Z( Z942TermCod );
      obj122.setgxTv_SdtTTERMIN_Emprcod_Z( Z396EmprCod );
      obj122.setgxTv_SdtTTERMIN_Emprnom_Z( Z407EmprNom );
      obj122.setgxTv_SdtTTERMIN_Termdsc_Z( Z8898TermDsc );
      obj122.setgxTv_SdtTTERMIN_Impcod_Z( Z574ImpCod );
      obj122.setgxTv_SdtTTERMIN_Impdsc_Z( Z576ImpDsc );
      obj122.setgxTv_SdtTTERMIN_Termusu_Z( Z1189TermUsu );
      obj122.setgxTv_SdtTTERMIN_Impcod1_Z( Z1441ImpCod1 );
      obj122.setgxTv_SdtTTERMIN_Impcod2_Z( Z1442ImpCod2 );
      obj122.setgxTv_SdtTTERMIN_Impcod3_Z( Z1443ImpCod3 );
      obj122.setgxTv_SdtTTERMIN_Impcod4_Z( Z1444ImpCod4 );
      obj122.setgxTv_SdtTTERMIN_Impcod5_Z( Z1445ImpCod5 );
      obj122.setgxTv_SdtTTERMIN_Implpt1_Z( Z1446ImpLpt1 );
      obj122.setgxTv_SdtTTERMIN_Implpt2_Z( Z1447ImpLpt2 );
      obj122.setgxTv_SdtTTERMIN_Implpt3_Z( Z1448ImpLpt3 );
      obj122.setgxTv_SdtTTERMIN_Implpt4_Z( Z1449ImpLpt4 );
      obj122.setgxTv_SdtTTERMIN_Implpt5_Z( Z1450ImpLpt5 );
      obj122.setgxTv_SdtTTERMIN_Termbol_Z( Z6112TermBol );
      obj122.setgxTv_SdtTTERMIN_Termbal_Z( Z6113TermBal );
      obj122.setgxTv_SdtTTERMIN_Termnotr_Z( Z8678TermNoTr );
      obj122.setgxTv_SdtTTERMIN_Termlog1_Z( Z6721TermLog1 );
      obj122.setgxTv_SdtTTERMIN_Termlog2_Z( Z6722TermLog2 );
      obj122.setgxTv_SdtTTERMIN_Termpes_Z( Z8899TermPes );
      obj122.setgxTv_SdtTTERMIN_Termest_Z( Z11757TermEst );
      obj122.setgxTv_SdtTTERMIN_Termfec_Z( Z11758TermFec );
      obj122.setgxTv_SdtTTERMIN_Emprcod_N( (byte)((byte)((n396EmprCod)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Emprnom_N( (byte)((byte)((n407EmprNom)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termdsc_N( (byte)((byte)((n8898TermDsc)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod_N( (byte)((byte)((n574ImpCod)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impdsc_N( (byte)((byte)((n576ImpDsc)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termusu_N( (byte)((byte)((n1189TermUsu)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod1_N( (byte)((byte)((n1441ImpCod1)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod2_N( (byte)((byte)((n1442ImpCod2)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod3_N( (byte)((byte)((n1443ImpCod3)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod4_N( (byte)((byte)((n1444ImpCod4)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Impcod5_N( (byte)((byte)((n1445ImpCod5)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Implpt1_N( (byte)((byte)((n1446ImpLpt1)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Implpt2_N( (byte)((byte)((n1447ImpLpt2)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Implpt3_N( (byte)((byte)((n1448ImpLpt3)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Implpt4_N( (byte)((byte)((n1449ImpLpt4)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Implpt5_N( (byte)((byte)((n1450ImpLpt5)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termbol_N( (byte)((byte)((n6112TermBol)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termbal_N( (byte)((byte)((n6113TermBal)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termnotr_N( (byte)((byte)((n8678TermNoTr)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termlog1_N( (byte)((byte)((n6721TermLog1)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termlog2_N( (byte)((byte)((n6722TermLog2)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termpes_N( (byte)((byte)((n8899TermPes)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termest_N( (byte)((byte)((n11757TermEst)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Termfec_N( (byte)((byte)((n11758TermFec)?1:0)) );
      obj122.setgxTv_SdtTTERMIN_Mode( Gx_mode );
   }

   public void KeyVarsToRow122( app.SdtTTERMIN obj122 )
   {
      obj122.setgxTv_SdtTTERMIN_Termcod( A942TermCod );
   }

   public void RowToVars122( app.SdtTTERMIN obj122 ,
                             int forceLoad )
   {
      Gx_mode = obj122.getgxTv_SdtTTERMIN_Mode() ;
      if ( ! ( ( AV32PesColGX == 0 ) ) || ( forceLoad == 1 ) )
      {
         A8899TermPes = obj122.getgxTv_SdtTTERMIN_Termpes() ;
         n8899TermPes = false ;
      }
      A396EmprCod = obj122.getgxTv_SdtTTERMIN_Emprcod() ;
      n396EmprCod = false ;
      A407EmprNom = obj122.getgxTv_SdtTTERMIN_Emprnom() ;
      n407EmprNom = false ;
      A8898TermDsc = obj122.getgxTv_SdtTTERMIN_Termdsc() ;
      n8898TermDsc = false ;
      A574ImpCod = obj122.getgxTv_SdtTTERMIN_Impcod() ;
      n574ImpCod = false ;
      A576ImpDsc = obj122.getgxTv_SdtTTERMIN_Impdsc() ;
      n576ImpDsc = false ;
      if ( forceLoad == 1 )
      {
         A1189TermUsu = obj122.getgxTv_SdtTTERMIN_Termusu() ;
         n1189TermUsu = false ;
      }
      A1441ImpCod1 = obj122.getgxTv_SdtTTERMIN_Impcod1() ;
      n1441ImpCod1 = false ;
      A1442ImpCod2 = obj122.getgxTv_SdtTTERMIN_Impcod2() ;
      n1442ImpCod2 = false ;
      A1443ImpCod3 = obj122.getgxTv_SdtTTERMIN_Impcod3() ;
      n1443ImpCod3 = false ;
      A1444ImpCod4 = obj122.getgxTv_SdtTTERMIN_Impcod4() ;
      n1444ImpCod4 = false ;
      A1445ImpCod5 = obj122.getgxTv_SdtTTERMIN_Impcod5() ;
      n1445ImpCod5 = false ;
      A1446ImpLpt1 = obj122.getgxTv_SdtTTERMIN_Implpt1() ;
      n1446ImpLpt1 = false ;
      A1447ImpLpt2 = obj122.getgxTv_SdtTTERMIN_Implpt2() ;
      n1447ImpLpt2 = false ;
      A1448ImpLpt3 = obj122.getgxTv_SdtTTERMIN_Implpt3() ;
      n1448ImpLpt3 = false ;
      A1449ImpLpt4 = obj122.getgxTv_SdtTTERMIN_Implpt4() ;
      n1449ImpLpt4 = false ;
      A1450ImpLpt5 = obj122.getgxTv_SdtTTERMIN_Implpt5() ;
      n1450ImpLpt5 = false ;
      A6112TermBol = obj122.getgxTv_SdtTTERMIN_Termbol() ;
      n6112TermBol = false ;
      A6113TermBal = obj122.getgxTv_SdtTTERMIN_Termbal() ;
      n6113TermBal = false ;
      A8678TermNoTr = obj122.getgxTv_SdtTTERMIN_Termnotr() ;
      n8678TermNoTr = false ;
      A6721TermLog1 = obj122.getgxTv_SdtTTERMIN_Termlog1() ;
      n6721TermLog1 = false ;
      A6722TermLog2 = obj122.getgxTv_SdtTTERMIN_Termlog2() ;
      n6722TermLog2 = false ;
      A11757TermEst = obj122.getgxTv_SdtTTERMIN_Termest() ;
      n11757TermEst = false ;
      A11758TermFec = obj122.getgxTv_SdtTTERMIN_Termfec() ;
      n11758TermFec = false ;
      A942TermCod = obj122.getgxTv_SdtTTERMIN_Termcod() ;
      Z942TermCod = obj122.getgxTv_SdtTTERMIN_Termcod_Z() ;
      Z396EmprCod = obj122.getgxTv_SdtTTERMIN_Emprcod_Z() ;
      Z407EmprNom = obj122.getgxTv_SdtTTERMIN_Emprnom_Z() ;
      Z8898TermDsc = obj122.getgxTv_SdtTTERMIN_Termdsc_Z() ;
      Z574ImpCod = obj122.getgxTv_SdtTTERMIN_Impcod_Z() ;
      Z576ImpDsc = obj122.getgxTv_SdtTTERMIN_Impdsc_Z() ;
      Z1189TermUsu = obj122.getgxTv_SdtTTERMIN_Termusu_Z() ;
      Z1441ImpCod1 = obj122.getgxTv_SdtTTERMIN_Impcod1_Z() ;
      Z1442ImpCod2 = obj122.getgxTv_SdtTTERMIN_Impcod2_Z() ;
      Z1443ImpCod3 = obj122.getgxTv_SdtTTERMIN_Impcod3_Z() ;
      Z1444ImpCod4 = obj122.getgxTv_SdtTTERMIN_Impcod4_Z() ;
      Z1445ImpCod5 = obj122.getgxTv_SdtTTERMIN_Impcod5_Z() ;
      Z1446ImpLpt1 = obj122.getgxTv_SdtTTERMIN_Implpt1_Z() ;
      Z1447ImpLpt2 = obj122.getgxTv_SdtTTERMIN_Implpt2_Z() ;
      Z1448ImpLpt3 = obj122.getgxTv_SdtTTERMIN_Implpt3_Z() ;
      Z1449ImpLpt4 = obj122.getgxTv_SdtTTERMIN_Implpt4_Z() ;
      Z1450ImpLpt5 = obj122.getgxTv_SdtTTERMIN_Implpt5_Z() ;
      Z6112TermBol = obj122.getgxTv_SdtTTERMIN_Termbol_Z() ;
      Z6113TermBal = obj122.getgxTv_SdtTTERMIN_Termbal_Z() ;
      Z8678TermNoTr = obj122.getgxTv_SdtTTERMIN_Termnotr_Z() ;
      Z6721TermLog1 = obj122.getgxTv_SdtTTERMIN_Termlog1_Z() ;
      Z6722TermLog2 = obj122.getgxTv_SdtTTERMIN_Termlog2_Z() ;
      Z8899TermPes = obj122.getgxTv_SdtTTERMIN_Termpes_Z() ;
      Z11757TermEst = obj122.getgxTv_SdtTTERMIN_Termest_Z() ;
      Z11758TermFec = obj122.getgxTv_SdtTTERMIN_Termfec_Z() ;
      n396EmprCod = (boolean)((obj122.getgxTv_SdtTTERMIN_Emprcod_N()==0)?false:true) ;
      n407EmprNom = (boolean)((obj122.getgxTv_SdtTTERMIN_Emprnom_N()==0)?false:true) ;
      n8898TermDsc = (boolean)((obj122.getgxTv_SdtTTERMIN_Termdsc_N()==0)?false:true) ;
      n574ImpCod = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod_N()==0)?false:true) ;
      n576ImpDsc = (boolean)((obj122.getgxTv_SdtTTERMIN_Impdsc_N()==0)?false:true) ;
      n1189TermUsu = (boolean)((obj122.getgxTv_SdtTTERMIN_Termusu_N()==0)?false:true) ;
      n1441ImpCod1 = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod1_N()==0)?false:true) ;
      n1442ImpCod2 = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod2_N()==0)?false:true) ;
      n1443ImpCod3 = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod3_N()==0)?false:true) ;
      n1444ImpCod4 = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod4_N()==0)?false:true) ;
      n1445ImpCod5 = (boolean)((obj122.getgxTv_SdtTTERMIN_Impcod5_N()==0)?false:true) ;
      n1446ImpLpt1 = (boolean)((obj122.getgxTv_SdtTTERMIN_Implpt1_N()==0)?false:true) ;
      n1447ImpLpt2 = (boolean)((obj122.getgxTv_SdtTTERMIN_Implpt2_N()==0)?false:true) ;
      n1448ImpLpt3 = (boolean)((obj122.getgxTv_SdtTTERMIN_Implpt3_N()==0)?false:true) ;
      n1449ImpLpt4 = (boolean)((obj122.getgxTv_SdtTTERMIN_Implpt4_N()==0)?false:true) ;
      n1450ImpLpt5 = (boolean)((obj122.getgxTv_SdtTTERMIN_Implpt5_N()==0)?false:true) ;
      n6112TermBol = (boolean)((obj122.getgxTv_SdtTTERMIN_Termbol_N()==0)?false:true) ;
      n6113TermBal = (boolean)((obj122.getgxTv_SdtTTERMIN_Termbal_N()==0)?false:true) ;
      n8678TermNoTr = (boolean)((obj122.getgxTv_SdtTTERMIN_Termnotr_N()==0)?false:true) ;
      n6721TermLog1 = (boolean)((obj122.getgxTv_SdtTTERMIN_Termlog1_N()==0)?false:true) ;
      n6722TermLog2 = (boolean)((obj122.getgxTv_SdtTTERMIN_Termlog2_N()==0)?false:true) ;
      n8899TermPes = (boolean)((obj122.getgxTv_SdtTTERMIN_Termpes_N()==0)?false:true) ;
      n11757TermEst = (boolean)((obj122.getgxTv_SdtTTERMIN_Termest_N()==0)?false:true) ;
      n11758TermFec = (boolean)((obj122.getgxTv_SdtTTERMIN_Termfec_N()==0)?false:true) ;
      Gx_mode = obj122.getgxTv_SdtTTERMIN_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A942TermCod = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey2Y122( ) ;
      scanKeyStart2Y122( ) ;
      if ( RcdFound122 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z942TermCod = A942TermCod ;
      }
      zm2Y122( -14) ;
      onLoadActions2Y122( ) ;
      addRow2Y122( ) ;
      scanKeyEnd2Y122( ) ;
      if ( RcdFound122 == 0 )
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
      RowToVars122( bcTTERMIN, 0) ;
      scanKeyStart2Y122( ) ;
      if ( RcdFound122 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z942TermCod = A942TermCod ;
      }
      zm2Y122( -14) ;
      onLoadActions2Y122( ) ;
      addRow2Y122( ) ;
      scanKeyEnd2Y122( ) ;
      if ( RcdFound122 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void saveImpl( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2Y122( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert2Y122( ) ;
      }
      else
      {
         if ( RcdFound122 == 1 )
         {
            if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
            {
               A942TermCod = Z942TermCod ;
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
               update2Y122( ) ;
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
               if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
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
                     insert2Y122( ) ;
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
                     insert2Y122( ) ;
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
      RowToVars122( bcTTERMIN, 1) ;
      saveImpl( ) ;
      VarsToRow122( bcTTERMIN) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public boolean Insert( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars122( bcTTERMIN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2Y122( ) ;
      afterTrn( ) ;
      VarsToRow122( bcTTERMIN) ;
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
         app.SdtTTERMIN auxBC = new app.SdtTTERMIN( remoteHandle, context);
         IGxSilentTrn auxTrn = auxBC.getTransaction();
         auxBC.Load(A942TermCod);
         if ( auxTrn.Errors() == 0 )
         {
            auxBC.updateDirties(bcTTERMIN);
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
      RowToVars122( bcTTERMIN, 1) ;
      updateImpl( ) ;
      VarsToRow122( bcTTERMIN) ;
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
      RowToVars122( bcTTERMIN, 1) ;
      Gx_mode = "INS" ;
      /* Insert record */
      insert2Y122( ) ;
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
      VarsToRow122( bcTTERMIN) ;
      httpContext.GX_msglist = BackMsgLst ;
      return (AnyError==0) ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars122( bcTTERMIN, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey2Y122( ) ;
      if ( RcdFound122 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
         {
            A942TermCod = Z942TermCod ;
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
         if ( GXutil.strcmp(A942TermCod, Z942TermCod) != 0 )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttermin_bc");
      VarsToRow122( bcTTERMIN) ;
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
      Gx_mode = bcTTERMIN.getgxTv_SdtTTERMIN_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTTERMIN.setgxTv_SdtTTERMIN_Mode( Gx_mode );
   }

   public void SetSDT( app.SdtTTERMIN sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTTERMIN )
      {
         bcTTERMIN = sdt ;
         if ( GXutil.strcmp(bcTTERMIN.getgxTv_SdtTTERMIN_Mode(), "") == 0 )
         {
            bcTTERMIN.setgxTv_SdtTTERMIN_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow122( bcTTERMIN) ;
         }
         else
         {
            RowToVars122( bcTTERMIN, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTTERMIN.getgxTv_SdtTTERMIN_Mode(), "") == 0 )
         {
            bcTTERMIN.setgxTv_SdtTTERMIN_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars122( bcTTERMIN, 1) ;
   }

   public void ForceCommitOnExit( )
   {
      mustCommit = true ;
   }

   public SdtTTERMIN getTTERMIN_BC( )
   {
      return bcTTERMIN ;
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
      AV16Lit0 = "" ;
      AV17Lit1 = "" ;
      AV18Lit2 = "" ;
      AV19Lit3 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV28Lit7 = "" ;
      AV21LitFe = "" ;
      AV27Station = "" ;
      AV25EmprCod = "" ;
      AV26EmprNom = "" ;
      AV20UsurCod = "" ;
      AV38Insert_EmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      AV44Pgmname = "" ;
      AV40TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV39Insert_ImpCod = "" ;
      A396EmprCod = "" ;
      A8898TermDsc = "" ;
      Z8898TermDsc = "" ;
      Z1189TermUsu = "" ;
      A1189TermUsu = "" ;
      Z1441ImpCod1 = "" ;
      A1441ImpCod1 = "" ;
      Z1442ImpCod2 = "" ;
      A1442ImpCod2 = "" ;
      Z1443ImpCod3 = "" ;
      A1443ImpCod3 = "" ;
      Z1444ImpCod4 = "" ;
      A1444ImpCod4 = "" ;
      Z1445ImpCod5 = "" ;
      A1445ImpCod5 = "" ;
      Z1446ImpLpt1 = "" ;
      A1446ImpLpt1 = "" ;
      Z1447ImpLpt2 = "" ;
      A1447ImpLpt2 = "" ;
      Z1448ImpLpt3 = "" ;
      A1448ImpLpt3 = "" ;
      Z1449ImpLpt4 = "" ;
      A1449ImpLpt4 = "" ;
      Z1450ImpLpt5 = "" ;
      A1450ImpLpt5 = "" ;
      Z6721TermLog1 = "" ;
      A6721TermLog1 = "" ;
      Z6722TermLog2 = "" ;
      A6722TermLog2 = "" ;
      Z11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      A11758TermFec = GXutil.resetTime( GXutil.nullDate() );
      Z574ImpCod = "" ;
      A574ImpCod = "" ;
      Z396EmprCod = "" ;
      Z576ImpDsc = "" ;
      A576ImpDsc = "" ;
      Z407EmprNom = "" ;
      A407EmprNom = "" ;
      BC002Y6_A942TermCod = new String[] {""} ;
      BC002Y6_A8899TermPes = new byte[1] ;
      BC002Y6_n8899TermPes = new boolean[] {false} ;
      BC002Y6_A407EmprNom = new String[] {""} ;
      BC002Y6_n407EmprNom = new boolean[] {false} ;
      BC002Y6_A8898TermDsc = new String[] {""} ;
      BC002Y6_n8898TermDsc = new boolean[] {false} ;
      BC002Y6_A576ImpDsc = new String[] {""} ;
      BC002Y6_n576ImpDsc = new boolean[] {false} ;
      BC002Y6_A1189TermUsu = new String[] {""} ;
      BC002Y6_n1189TermUsu = new boolean[] {false} ;
      BC002Y6_A1441ImpCod1 = new String[] {""} ;
      BC002Y6_n1441ImpCod1 = new boolean[] {false} ;
      BC002Y6_A1442ImpCod2 = new String[] {""} ;
      BC002Y6_n1442ImpCod2 = new boolean[] {false} ;
      BC002Y6_A1443ImpCod3 = new String[] {""} ;
      BC002Y6_n1443ImpCod3 = new boolean[] {false} ;
      BC002Y6_A1444ImpCod4 = new String[] {""} ;
      BC002Y6_n1444ImpCod4 = new boolean[] {false} ;
      BC002Y6_A1445ImpCod5 = new String[] {""} ;
      BC002Y6_n1445ImpCod5 = new boolean[] {false} ;
      BC002Y6_A1446ImpLpt1 = new String[] {""} ;
      BC002Y6_n1446ImpLpt1 = new boolean[] {false} ;
      BC002Y6_A1447ImpLpt2 = new String[] {""} ;
      BC002Y6_n1447ImpLpt2 = new boolean[] {false} ;
      BC002Y6_A1448ImpLpt3 = new String[] {""} ;
      BC002Y6_n1448ImpLpt3 = new boolean[] {false} ;
      BC002Y6_A1449ImpLpt4 = new String[] {""} ;
      BC002Y6_n1449ImpLpt4 = new boolean[] {false} ;
      BC002Y6_A1450ImpLpt5 = new String[] {""} ;
      BC002Y6_n1450ImpLpt5 = new boolean[] {false} ;
      BC002Y6_A6112TermBol = new byte[1] ;
      BC002Y6_n6112TermBol = new boolean[] {false} ;
      BC002Y6_A6113TermBal = new byte[1] ;
      BC002Y6_n6113TermBal = new boolean[] {false} ;
      BC002Y6_A8678TermNoTr = new byte[1] ;
      BC002Y6_n8678TermNoTr = new boolean[] {false} ;
      BC002Y6_A6721TermLog1 = new String[] {""} ;
      BC002Y6_n6721TermLog1 = new boolean[] {false} ;
      BC002Y6_A6722TermLog2 = new String[] {""} ;
      BC002Y6_n6722TermLog2 = new boolean[] {false} ;
      BC002Y6_A11757TermEst = new byte[1] ;
      BC002Y6_n11757TermEst = new boolean[] {false} ;
      BC002Y6_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002Y6_n11758TermFec = new boolean[] {false} ;
      BC002Y6_A574ImpCod = new String[] {""} ;
      BC002Y6_n574ImpCod = new boolean[] {false} ;
      BC002Y6_A396EmprCod = new String[] {""} ;
      BC002Y6_n396EmprCod = new boolean[] {false} ;
      AV30Sedamil = DecimalUtil.ZERO ;
      A6112TermBol_Caption = "" ;
      AV31Artextil = DecimalUtil.ZERO ;
      BC002Y7_A407EmprNom = new String[] {""} ;
      BC002Y7_n407EmprNom = new boolean[] {false} ;
      BC002Y8_A576ImpDsc = new String[] {""} ;
      BC002Y8_n576ImpDsc = new boolean[] {false} ;
      BC002Y9_A942TermCod = new String[] {""} ;
      BC002Y10_A942TermCod = new String[] {""} ;
      BC002Y10_A8899TermPes = new byte[1] ;
      BC002Y10_n8899TermPes = new boolean[] {false} ;
      BC002Y10_A8898TermDsc = new String[] {""} ;
      BC002Y10_n8898TermDsc = new boolean[] {false} ;
      BC002Y10_A1189TermUsu = new String[] {""} ;
      BC002Y10_n1189TermUsu = new boolean[] {false} ;
      BC002Y10_A1441ImpCod1 = new String[] {""} ;
      BC002Y10_n1441ImpCod1 = new boolean[] {false} ;
      BC002Y10_A1442ImpCod2 = new String[] {""} ;
      BC002Y10_n1442ImpCod2 = new boolean[] {false} ;
      BC002Y10_A1443ImpCod3 = new String[] {""} ;
      BC002Y10_n1443ImpCod3 = new boolean[] {false} ;
      BC002Y10_A1444ImpCod4 = new String[] {""} ;
      BC002Y10_n1444ImpCod4 = new boolean[] {false} ;
      BC002Y10_A1445ImpCod5 = new String[] {""} ;
      BC002Y10_n1445ImpCod5 = new boolean[] {false} ;
      BC002Y10_A1446ImpLpt1 = new String[] {""} ;
      BC002Y10_n1446ImpLpt1 = new boolean[] {false} ;
      BC002Y10_A1447ImpLpt2 = new String[] {""} ;
      BC002Y10_n1447ImpLpt2 = new boolean[] {false} ;
      BC002Y10_A1448ImpLpt3 = new String[] {""} ;
      BC002Y10_n1448ImpLpt3 = new boolean[] {false} ;
      BC002Y10_A1449ImpLpt4 = new String[] {""} ;
      BC002Y10_n1449ImpLpt4 = new boolean[] {false} ;
      BC002Y10_A1450ImpLpt5 = new String[] {""} ;
      BC002Y10_n1450ImpLpt5 = new boolean[] {false} ;
      BC002Y10_A6112TermBol = new byte[1] ;
      BC002Y10_n6112TermBol = new boolean[] {false} ;
      BC002Y10_A6113TermBal = new byte[1] ;
      BC002Y10_n6113TermBal = new boolean[] {false} ;
      BC002Y10_A8678TermNoTr = new byte[1] ;
      BC002Y10_n8678TermNoTr = new boolean[] {false} ;
      BC002Y10_A6721TermLog1 = new String[] {""} ;
      BC002Y10_n6721TermLog1 = new boolean[] {false} ;
      BC002Y10_A6722TermLog2 = new String[] {""} ;
      BC002Y10_n6722TermLog2 = new boolean[] {false} ;
      BC002Y10_A11757TermEst = new byte[1] ;
      BC002Y10_n11757TermEst = new boolean[] {false} ;
      BC002Y10_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002Y10_n11758TermFec = new boolean[] {false} ;
      BC002Y10_A574ImpCod = new String[] {""} ;
      BC002Y10_n574ImpCod = new boolean[] {false} ;
      BC002Y10_A396EmprCod = new String[] {""} ;
      BC002Y10_n396EmprCod = new boolean[] {false} ;
      sMode122 = "" ;
      BC002Y11_A942TermCod = new String[] {""} ;
      BC002Y11_A8899TermPes = new byte[1] ;
      BC002Y11_n8899TermPes = new boolean[] {false} ;
      BC002Y11_A8898TermDsc = new String[] {""} ;
      BC002Y11_n8898TermDsc = new boolean[] {false} ;
      BC002Y11_A1189TermUsu = new String[] {""} ;
      BC002Y11_n1189TermUsu = new boolean[] {false} ;
      BC002Y11_A1441ImpCod1 = new String[] {""} ;
      BC002Y11_n1441ImpCod1 = new boolean[] {false} ;
      BC002Y11_A1442ImpCod2 = new String[] {""} ;
      BC002Y11_n1442ImpCod2 = new boolean[] {false} ;
      BC002Y11_A1443ImpCod3 = new String[] {""} ;
      BC002Y11_n1443ImpCod3 = new boolean[] {false} ;
      BC002Y11_A1444ImpCod4 = new String[] {""} ;
      BC002Y11_n1444ImpCod4 = new boolean[] {false} ;
      BC002Y11_A1445ImpCod5 = new String[] {""} ;
      BC002Y11_n1445ImpCod5 = new boolean[] {false} ;
      BC002Y11_A1446ImpLpt1 = new String[] {""} ;
      BC002Y11_n1446ImpLpt1 = new boolean[] {false} ;
      BC002Y11_A1447ImpLpt2 = new String[] {""} ;
      BC002Y11_n1447ImpLpt2 = new boolean[] {false} ;
      BC002Y11_A1448ImpLpt3 = new String[] {""} ;
      BC002Y11_n1448ImpLpt3 = new boolean[] {false} ;
      BC002Y11_A1449ImpLpt4 = new String[] {""} ;
      BC002Y11_n1449ImpLpt4 = new boolean[] {false} ;
      BC002Y11_A1450ImpLpt5 = new String[] {""} ;
      BC002Y11_n1450ImpLpt5 = new boolean[] {false} ;
      BC002Y11_A6112TermBol = new byte[1] ;
      BC002Y11_n6112TermBol = new boolean[] {false} ;
      BC002Y11_A6113TermBal = new byte[1] ;
      BC002Y11_n6113TermBal = new boolean[] {false} ;
      BC002Y11_A8678TermNoTr = new byte[1] ;
      BC002Y11_n8678TermNoTr = new boolean[] {false} ;
      BC002Y11_A6721TermLog1 = new String[] {""} ;
      BC002Y11_n6721TermLog1 = new boolean[] {false} ;
      BC002Y11_A6722TermLog2 = new String[] {""} ;
      BC002Y11_n6722TermLog2 = new boolean[] {false} ;
      BC002Y11_A11757TermEst = new byte[1] ;
      BC002Y11_n11757TermEst = new boolean[] {false} ;
      BC002Y11_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002Y11_n11758TermFec = new boolean[] {false} ;
      BC002Y11_A574ImpCod = new String[] {""} ;
      BC002Y11_n574ImpCod = new boolean[] {false} ;
      BC002Y11_A396EmprCod = new String[] {""} ;
      BC002Y11_n396EmprCod = new boolean[] {false} ;
      BC002Y15_A407EmprNom = new String[] {""} ;
      BC002Y15_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      BC002Y16_A576ImpDsc = new String[] {""} ;
      BC002Y16_n576ImpDsc = new boolean[] {false} ;
      BC002Y17_A942TermCod = new String[] {""} ;
      BC002Y17_A10133TermCliCod = new int[1] ;
      BC002Y18_A942TermCod = new String[] {""} ;
      BC002Y18_A8900TermPesPro = new String[] {""} ;
      BC002Y19_A942TermCod = new String[] {""} ;
      BC002Y19_A2135RepBarCod = new int[1] ;
      BC002Y19_A2137RepBarReo = new byte[1] ;
      BC002Y19_A2136RepBarPar = new String[] {""} ;
      BC002Y19_A2681RepComLin = new byte[1] ;
      BC002Y19_A2138RepComCod = new String[] {""} ;
      BC002Y19_A2140RepFonCod = new String[] {""} ;
      BC002Y20_A942TermCod = new String[] {""} ;
      BC002Y20_A8899TermPes = new byte[1] ;
      BC002Y20_n8899TermPes = new boolean[] {false} ;
      BC002Y20_A407EmprNom = new String[] {""} ;
      BC002Y20_n407EmprNom = new boolean[] {false} ;
      BC002Y20_A8898TermDsc = new String[] {""} ;
      BC002Y20_n8898TermDsc = new boolean[] {false} ;
      BC002Y20_A576ImpDsc = new String[] {""} ;
      BC002Y20_n576ImpDsc = new boolean[] {false} ;
      BC002Y20_A1189TermUsu = new String[] {""} ;
      BC002Y20_n1189TermUsu = new boolean[] {false} ;
      BC002Y20_A1441ImpCod1 = new String[] {""} ;
      BC002Y20_n1441ImpCod1 = new boolean[] {false} ;
      BC002Y20_A1442ImpCod2 = new String[] {""} ;
      BC002Y20_n1442ImpCod2 = new boolean[] {false} ;
      BC002Y20_A1443ImpCod3 = new String[] {""} ;
      BC002Y20_n1443ImpCod3 = new boolean[] {false} ;
      BC002Y20_A1444ImpCod4 = new String[] {""} ;
      BC002Y20_n1444ImpCod4 = new boolean[] {false} ;
      BC002Y20_A1445ImpCod5 = new String[] {""} ;
      BC002Y20_n1445ImpCod5 = new boolean[] {false} ;
      BC002Y20_A1446ImpLpt1 = new String[] {""} ;
      BC002Y20_n1446ImpLpt1 = new boolean[] {false} ;
      BC002Y20_A1447ImpLpt2 = new String[] {""} ;
      BC002Y20_n1447ImpLpt2 = new boolean[] {false} ;
      BC002Y20_A1448ImpLpt3 = new String[] {""} ;
      BC002Y20_n1448ImpLpt3 = new boolean[] {false} ;
      BC002Y20_A1449ImpLpt4 = new String[] {""} ;
      BC002Y20_n1449ImpLpt4 = new boolean[] {false} ;
      BC002Y20_A1450ImpLpt5 = new String[] {""} ;
      BC002Y20_n1450ImpLpt5 = new boolean[] {false} ;
      BC002Y20_A6112TermBol = new byte[1] ;
      BC002Y20_n6112TermBol = new boolean[] {false} ;
      BC002Y20_A6113TermBal = new byte[1] ;
      BC002Y20_n6113TermBal = new boolean[] {false} ;
      BC002Y20_A8678TermNoTr = new byte[1] ;
      BC002Y20_n8678TermNoTr = new boolean[] {false} ;
      BC002Y20_A6721TermLog1 = new String[] {""} ;
      BC002Y20_n6721TermLog1 = new boolean[] {false} ;
      BC002Y20_A6722TermLog2 = new String[] {""} ;
      BC002Y20_n6722TermLog2 = new boolean[] {false} ;
      BC002Y20_A11757TermEst = new byte[1] ;
      BC002Y20_n11757TermEst = new boolean[] {false} ;
      BC002Y20_A11758TermFec = new java.util.Date[] {GXutil.nullDate()} ;
      BC002Y20_n11758TermFec = new boolean[] {false} ;
      BC002Y20_A574ImpCod = new String[] {""} ;
      BC002Y20_n574ImpCod = new boolean[] {false} ;
      BC002Y20_A396EmprCod = new String[] {""} ;
      BC002Y20_n396EmprCod = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttermin_bc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttermin_bc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttermin_bc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttermin_bc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttermin_bc__default(),
         new Object[] {
             new Object[] {
            BC002Y2_A942TermCod, BC002Y2_A8899TermPes, BC002Y2_n8899TermPes, BC002Y2_A8898TermDsc, BC002Y2_n8898TermDsc, BC002Y2_A1189TermUsu, BC002Y2_n1189TermUsu, BC002Y2_A1441ImpCod1, BC002Y2_n1441ImpCod1, BC002Y2_A1442ImpCod2,
            BC002Y2_n1442ImpCod2, BC002Y2_A1443ImpCod3, BC002Y2_n1443ImpCod3, BC002Y2_A1444ImpCod4, BC002Y2_n1444ImpCod4, BC002Y2_A1445ImpCod5, BC002Y2_n1445ImpCod5, BC002Y2_A1446ImpLpt1, BC002Y2_n1446ImpLpt1, BC002Y2_A1447ImpLpt2,
            BC002Y2_n1447ImpLpt2, BC002Y2_A1448ImpLpt3, BC002Y2_n1448ImpLpt3, BC002Y2_A1449ImpLpt4, BC002Y2_n1449ImpLpt4, BC002Y2_A1450ImpLpt5, BC002Y2_n1450ImpLpt5, BC002Y2_A6112TermBol, BC002Y2_n6112TermBol, BC002Y2_A6113TermBal,
            BC002Y2_n6113TermBal, BC002Y2_A8678TermNoTr, BC002Y2_n8678TermNoTr, BC002Y2_A6721TermLog1, BC002Y2_n6721TermLog1, BC002Y2_A6722TermLog2, BC002Y2_n6722TermLog2, BC002Y2_A11757TermEst, BC002Y2_n11757TermEst, BC002Y2_A11758TermFec,
            BC002Y2_n11758TermFec, BC002Y2_A574ImpCod, BC002Y2_n574ImpCod, BC002Y2_A396EmprCod, BC002Y2_n396EmprCod
            }
            , new Object[] {
            BC002Y3_A942TermCod, BC002Y3_A8899TermPes, BC002Y3_n8899TermPes, BC002Y3_A8898TermDsc, BC002Y3_n8898TermDsc, BC002Y3_A1189TermUsu, BC002Y3_n1189TermUsu, BC002Y3_A1441ImpCod1, BC002Y3_n1441ImpCod1, BC002Y3_A1442ImpCod2,
            BC002Y3_n1442ImpCod2, BC002Y3_A1443ImpCod3, BC002Y3_n1443ImpCod3, BC002Y3_A1444ImpCod4, BC002Y3_n1444ImpCod4, BC002Y3_A1445ImpCod5, BC002Y3_n1445ImpCod5, BC002Y3_A1446ImpLpt1, BC002Y3_n1446ImpLpt1, BC002Y3_A1447ImpLpt2,
            BC002Y3_n1447ImpLpt2, BC002Y3_A1448ImpLpt3, BC002Y3_n1448ImpLpt3, BC002Y3_A1449ImpLpt4, BC002Y3_n1449ImpLpt4, BC002Y3_A1450ImpLpt5, BC002Y3_n1450ImpLpt5, BC002Y3_A6112TermBol, BC002Y3_n6112TermBol, BC002Y3_A6113TermBal,
            BC002Y3_n6113TermBal, BC002Y3_A8678TermNoTr, BC002Y3_n8678TermNoTr, BC002Y3_A6721TermLog1, BC002Y3_n6721TermLog1, BC002Y3_A6722TermLog2, BC002Y3_n6722TermLog2, BC002Y3_A11757TermEst, BC002Y3_n11757TermEst, BC002Y3_A11758TermFec,
            BC002Y3_n11758TermFec, BC002Y3_A574ImpCod, BC002Y3_n574ImpCod, BC002Y3_A396EmprCod, BC002Y3_n396EmprCod
            }
            , new Object[] {
            BC002Y4_A576ImpDsc, BC002Y4_n576ImpDsc
            }
            , new Object[] {
            BC002Y5_A407EmprNom, BC002Y5_n407EmprNom
            }
            , new Object[] {
            BC002Y6_A942TermCod, BC002Y6_A8899TermPes, BC002Y6_n8899TermPes, BC002Y6_A407EmprNom, BC002Y6_n407EmprNom, BC002Y6_A8898TermDsc, BC002Y6_n8898TermDsc, BC002Y6_A576ImpDsc, BC002Y6_n576ImpDsc, BC002Y6_A1189TermUsu,
            BC002Y6_n1189TermUsu, BC002Y6_A1441ImpCod1, BC002Y6_n1441ImpCod1, BC002Y6_A1442ImpCod2, BC002Y6_n1442ImpCod2, BC002Y6_A1443ImpCod3, BC002Y6_n1443ImpCod3, BC002Y6_A1444ImpCod4, BC002Y6_n1444ImpCod4, BC002Y6_A1445ImpCod5,
            BC002Y6_n1445ImpCod5, BC002Y6_A1446ImpLpt1, BC002Y6_n1446ImpLpt1, BC002Y6_A1447ImpLpt2, BC002Y6_n1447ImpLpt2, BC002Y6_A1448ImpLpt3, BC002Y6_n1448ImpLpt3, BC002Y6_A1449ImpLpt4, BC002Y6_n1449ImpLpt4, BC002Y6_A1450ImpLpt5,
            BC002Y6_n1450ImpLpt5, BC002Y6_A6112TermBol, BC002Y6_n6112TermBol, BC002Y6_A6113TermBal, BC002Y6_n6113TermBal, BC002Y6_A8678TermNoTr, BC002Y6_n8678TermNoTr, BC002Y6_A6721TermLog1, BC002Y6_n6721TermLog1, BC002Y6_A6722TermLog2,
            BC002Y6_n6722TermLog2, BC002Y6_A11757TermEst, BC002Y6_n11757TermEst, BC002Y6_A11758TermFec, BC002Y6_n11758TermFec, BC002Y6_A574ImpCod, BC002Y6_n574ImpCod, BC002Y6_A396EmprCod, BC002Y6_n396EmprCod
            }
            , new Object[] {
            BC002Y7_A407EmprNom, BC002Y7_n407EmprNom
            }
            , new Object[] {
            BC002Y8_A576ImpDsc, BC002Y8_n576ImpDsc
            }
            , new Object[] {
            BC002Y9_A942TermCod
            }
            , new Object[] {
            BC002Y10_A942TermCod, BC002Y10_A8899TermPes, BC002Y10_n8899TermPes, BC002Y10_A8898TermDsc, BC002Y10_n8898TermDsc, BC002Y10_A1189TermUsu, BC002Y10_n1189TermUsu, BC002Y10_A1441ImpCod1, BC002Y10_n1441ImpCod1, BC002Y10_A1442ImpCod2,
            BC002Y10_n1442ImpCod2, BC002Y10_A1443ImpCod3, BC002Y10_n1443ImpCod3, BC002Y10_A1444ImpCod4, BC002Y10_n1444ImpCod4, BC002Y10_A1445ImpCod5, BC002Y10_n1445ImpCod5, BC002Y10_A1446ImpLpt1, BC002Y10_n1446ImpLpt1, BC002Y10_A1447ImpLpt2,
            BC002Y10_n1447ImpLpt2, BC002Y10_A1448ImpLpt3, BC002Y10_n1448ImpLpt3, BC002Y10_A1449ImpLpt4, BC002Y10_n1449ImpLpt4, BC002Y10_A1450ImpLpt5, BC002Y10_n1450ImpLpt5, BC002Y10_A6112TermBol, BC002Y10_n6112TermBol, BC002Y10_A6113TermBal,
            BC002Y10_n6113TermBal, BC002Y10_A8678TermNoTr, BC002Y10_n8678TermNoTr, BC002Y10_A6721TermLog1, BC002Y10_n6721TermLog1, BC002Y10_A6722TermLog2, BC002Y10_n6722TermLog2, BC002Y10_A11757TermEst, BC002Y10_n11757TermEst, BC002Y10_A11758TermFec,
            BC002Y10_n11758TermFec, BC002Y10_A574ImpCod, BC002Y10_n574ImpCod, BC002Y10_A396EmprCod, BC002Y10_n396EmprCod
            }
            , new Object[] {
            BC002Y11_A942TermCod, BC002Y11_A8899TermPes, BC002Y11_n8899TermPes, BC002Y11_A8898TermDsc, BC002Y11_n8898TermDsc, BC002Y11_A1189TermUsu, BC002Y11_n1189TermUsu, BC002Y11_A1441ImpCod1, BC002Y11_n1441ImpCod1, BC002Y11_A1442ImpCod2,
            BC002Y11_n1442ImpCod2, BC002Y11_A1443ImpCod3, BC002Y11_n1443ImpCod3, BC002Y11_A1444ImpCod4, BC002Y11_n1444ImpCod4, BC002Y11_A1445ImpCod5, BC002Y11_n1445ImpCod5, BC002Y11_A1446ImpLpt1, BC002Y11_n1446ImpLpt1, BC002Y11_A1447ImpLpt2,
            BC002Y11_n1447ImpLpt2, BC002Y11_A1448ImpLpt3, BC002Y11_n1448ImpLpt3, BC002Y11_A1449ImpLpt4, BC002Y11_n1449ImpLpt4, BC002Y11_A1450ImpLpt5, BC002Y11_n1450ImpLpt5, BC002Y11_A6112TermBol, BC002Y11_n6112TermBol, BC002Y11_A6113TermBal,
            BC002Y11_n6113TermBal, BC002Y11_A8678TermNoTr, BC002Y11_n8678TermNoTr, BC002Y11_A6721TermLog1, BC002Y11_n6721TermLog1, BC002Y11_A6722TermLog2, BC002Y11_n6722TermLog2, BC002Y11_A11757TermEst, BC002Y11_n11757TermEst, BC002Y11_A11758TermFec,
            BC002Y11_n11758TermFec, BC002Y11_A574ImpCod, BC002Y11_n574ImpCod, BC002Y11_A396EmprCod, BC002Y11_n396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC002Y15_A407EmprNom, BC002Y15_n407EmprNom
            }
            , new Object[] {
            BC002Y16_A576ImpDsc, BC002Y16_n576ImpDsc
            }
            , new Object[] {
            BC002Y17_A942TermCod, BC002Y17_A10133TermCliCod
            }
            , new Object[] {
            BC002Y18_A942TermCod, BC002Y18_A8900TermPesPro
            }
            , new Object[] {
            BC002Y19_A942TermCod, BC002Y19_A2135RepBarCod, BC002Y19_A2137RepBarReo, BC002Y19_A2136RepBarPar, BC002Y19_A2681RepComLin, BC002Y19_A2138RepComCod, BC002Y19_A2140RepFonCod
            }
            , new Object[] {
            BC002Y20_A942TermCod, BC002Y20_A8899TermPes, BC002Y20_n8899TermPes, BC002Y20_A407EmprNom, BC002Y20_n407EmprNom, BC002Y20_A8898TermDsc, BC002Y20_n8898TermDsc, BC002Y20_A576ImpDsc, BC002Y20_n576ImpDsc, BC002Y20_A1189TermUsu,
            BC002Y20_n1189TermUsu, BC002Y20_A1441ImpCod1, BC002Y20_n1441ImpCod1, BC002Y20_A1442ImpCod2, BC002Y20_n1442ImpCod2, BC002Y20_A1443ImpCod3, BC002Y20_n1443ImpCod3, BC002Y20_A1444ImpCod4, BC002Y20_n1444ImpCod4, BC002Y20_A1445ImpCod5,
            BC002Y20_n1445ImpCod5, BC002Y20_A1446ImpLpt1, BC002Y20_n1446ImpLpt1, BC002Y20_A1447ImpLpt2, BC002Y20_n1447ImpLpt2, BC002Y20_A1448ImpLpt3, BC002Y20_n1448ImpLpt3, BC002Y20_A1449ImpLpt4, BC002Y20_n1449ImpLpt4, BC002Y20_A1450ImpLpt5,
            BC002Y20_n1450ImpLpt5, BC002Y20_A6112TermBol, BC002Y20_n6112TermBol, BC002Y20_A6113TermBal, BC002Y20_n6113TermBal, BC002Y20_A8678TermNoTr, BC002Y20_n8678TermNoTr, BC002Y20_A6721TermLog1, BC002Y20_n6721TermLog1, BC002Y20_A6722TermLog2,
            BC002Y20_n6722TermLog2, BC002Y20_A11757TermEst, BC002Y20_n11757TermEst, BC002Y20_A11758TermFec, BC002Y20_n11758TermFec, BC002Y20_A574ImpCod, BC002Y20_n574ImpCod, BC002Y20_A396EmprCod, BC002Y20_n396EmprCod
            }
         }
      );
      AV44Pgmname = "TTERMIN_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: Start */
      e122Y2 ();
      standaloneNotModal( ) ;
   }

   private byte nKeyPressed ;
   private byte AV32PesColGX ;
   private byte AV33Bros ;
   private byte Z8899TermPes ;
   private byte A8899TermPes ;
   private byte Z6112TermBol ;
   private byte A6112TermBol ;
   private byte Z6113TermBal ;
   private byte A6113TermBal ;
   private byte Z8678TermNoTr ;
   private byte A8678TermNoTr ;
   private byte Z11757TermEst ;
   private byte A11757TermEst ;
   private byte AV29Cladd ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte N8899TermPes ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound122 ;
   private short nIsDirty_122 ;
   private int trnEnded ;
   private int A8899TermPes_Visible ;
   private int AV45GXV1 ;
   private int GX_JID ;
   private int A8678TermNoTr_Visible ;
   private int A6112TermBol_Visible ;
   private int A6721TermLog1_Visible ;
   private int A6722TermLog2_Visible ;
   private int A6113TermBal_Visible ;
   private java.math.BigDecimal AV30Sedamil ;
   private java.math.BigDecimal AV31Artextil ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z942TermCod ;
   private String A942TermCod ;
   private String AV16Lit0 ;
   private String AV17Lit1 ;
   private String AV18Lit2 ;
   private String AV19Lit3 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV28Lit7 ;
   private String AV21LitFe ;
   private String AV27Station ;
   private String AV25EmprCod ;
   private String AV26EmprNom ;
   private String AV20UsurCod ;
   private String AV38Insert_EmprCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV44Pgmname ;
   private String AV39Insert_ImpCod ;
   private String A396EmprCod ;
   private String A8898TermDsc ;
   private String Z8898TermDsc ;
   private String Z1189TermUsu ;
   private String A1189TermUsu ;
   private String Z1441ImpCod1 ;
   private String A1441ImpCod1 ;
   private String Z1442ImpCod2 ;
   private String A1442ImpCod2 ;
   private String Z1443ImpCod3 ;
   private String A1443ImpCod3 ;
   private String Z1444ImpCod4 ;
   private String A1444ImpCod4 ;
   private String Z1445ImpCod5 ;
   private String A1445ImpCod5 ;
   private String Z1446ImpLpt1 ;
   private String A1446ImpLpt1 ;
   private String Z1447ImpLpt2 ;
   private String A1447ImpLpt2 ;
   private String Z1448ImpLpt3 ;
   private String A1448ImpLpt3 ;
   private String Z1449ImpLpt4 ;
   private String A1449ImpLpt4 ;
   private String Z1450ImpLpt5 ;
   private String A1450ImpLpt5 ;
   private String Z574ImpCod ;
   private String A574ImpCod ;
   private String Z396EmprCod ;
   private String Z576ImpDsc ;
   private String A576ImpDsc ;
   private String Z407EmprNom ;
   private String A407EmprNom ;
   private String A6112TermBol_Caption ;
   private String sMode122 ;
   private java.util.Date Z11758TermFec ;
   private java.util.Date A11758TermFec ;
   private boolean returnInSub ;
   private boolean n8899TermPes ;
   private boolean n407EmprNom ;
   private boolean n8898TermDsc ;
   private boolean n576ImpDsc ;
   private boolean n1189TermUsu ;
   private boolean n1441ImpCod1 ;
   private boolean n1442ImpCod2 ;
   private boolean n1443ImpCod3 ;
   private boolean n1444ImpCod4 ;
   private boolean n1445ImpCod5 ;
   private boolean n1446ImpLpt1 ;
   private boolean n1447ImpLpt2 ;
   private boolean n1448ImpLpt3 ;
   private boolean n1449ImpLpt4 ;
   private boolean n1450ImpLpt5 ;
   private boolean n6112TermBol ;
   private boolean n6113TermBal ;
   private boolean n8678TermNoTr ;
   private boolean n6721TermLog1 ;
   private boolean n6722TermLog2 ;
   private boolean n11757TermEst ;
   private boolean n11758TermFec ;
   private boolean n574ImpCod ;
   private boolean n396EmprCod ;
   private boolean Gx_longc ;
   private boolean mustCommit ;
   private String Z6721TermLog1 ;
   private String A6721TermLog1 ;
   private String Z6722TermLog2 ;
   private String A6722TermLog2 ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private app.SdtTTERMIN bcTTERMIN ;
   private IDataStoreProvider pr_default ;
   private String[] BC002Y6_A942TermCod ;
   private byte[] BC002Y6_A8899TermPes ;
   private boolean[] BC002Y6_n8899TermPes ;
   private String[] BC002Y6_A407EmprNom ;
   private boolean[] BC002Y6_n407EmprNom ;
   private String[] BC002Y6_A8898TermDsc ;
   private boolean[] BC002Y6_n8898TermDsc ;
   private String[] BC002Y6_A576ImpDsc ;
   private boolean[] BC002Y6_n576ImpDsc ;
   private String[] BC002Y6_A1189TermUsu ;
   private boolean[] BC002Y6_n1189TermUsu ;
   private String[] BC002Y6_A1441ImpCod1 ;
   private boolean[] BC002Y6_n1441ImpCod1 ;
   private String[] BC002Y6_A1442ImpCod2 ;
   private boolean[] BC002Y6_n1442ImpCod2 ;
   private String[] BC002Y6_A1443ImpCod3 ;
   private boolean[] BC002Y6_n1443ImpCod3 ;
   private String[] BC002Y6_A1444ImpCod4 ;
   private boolean[] BC002Y6_n1444ImpCod4 ;
   private String[] BC002Y6_A1445ImpCod5 ;
   private boolean[] BC002Y6_n1445ImpCod5 ;
   private String[] BC002Y6_A1446ImpLpt1 ;
   private boolean[] BC002Y6_n1446ImpLpt1 ;
   private String[] BC002Y6_A1447ImpLpt2 ;
   private boolean[] BC002Y6_n1447ImpLpt2 ;
   private String[] BC002Y6_A1448ImpLpt3 ;
   private boolean[] BC002Y6_n1448ImpLpt3 ;
   private String[] BC002Y6_A1449ImpLpt4 ;
   private boolean[] BC002Y6_n1449ImpLpt4 ;
   private String[] BC002Y6_A1450ImpLpt5 ;
   private boolean[] BC002Y6_n1450ImpLpt5 ;
   private byte[] BC002Y6_A6112TermBol ;
   private boolean[] BC002Y6_n6112TermBol ;
   private byte[] BC002Y6_A6113TermBal ;
   private boolean[] BC002Y6_n6113TermBal ;
   private byte[] BC002Y6_A8678TermNoTr ;
   private boolean[] BC002Y6_n8678TermNoTr ;
   private String[] BC002Y6_A6721TermLog1 ;
   private boolean[] BC002Y6_n6721TermLog1 ;
   private String[] BC002Y6_A6722TermLog2 ;
   private boolean[] BC002Y6_n6722TermLog2 ;
   private byte[] BC002Y6_A11757TermEst ;
   private boolean[] BC002Y6_n11757TermEst ;
   private java.util.Date[] BC002Y6_A11758TermFec ;
   private boolean[] BC002Y6_n11758TermFec ;
   private String[] BC002Y6_A574ImpCod ;
   private boolean[] BC002Y6_n574ImpCod ;
   private String[] BC002Y6_A396EmprCod ;
   private boolean[] BC002Y6_n396EmprCod ;
   private String[] BC002Y7_A407EmprNom ;
   private boolean[] BC002Y7_n407EmprNom ;
   private String[] BC002Y8_A576ImpDsc ;
   private boolean[] BC002Y8_n576ImpDsc ;
   private String[] BC002Y9_A942TermCod ;
   private String[] BC002Y10_A942TermCod ;
   private byte[] BC002Y10_A8899TermPes ;
   private boolean[] BC002Y10_n8899TermPes ;
   private String[] BC002Y10_A8898TermDsc ;
   private boolean[] BC002Y10_n8898TermDsc ;
   private String[] BC002Y10_A1189TermUsu ;
   private boolean[] BC002Y10_n1189TermUsu ;
   private String[] BC002Y10_A1441ImpCod1 ;
   private boolean[] BC002Y10_n1441ImpCod1 ;
   private String[] BC002Y10_A1442ImpCod2 ;
   private boolean[] BC002Y10_n1442ImpCod2 ;
   private String[] BC002Y10_A1443ImpCod3 ;
   private boolean[] BC002Y10_n1443ImpCod3 ;
   private String[] BC002Y10_A1444ImpCod4 ;
   private boolean[] BC002Y10_n1444ImpCod4 ;
   private String[] BC002Y10_A1445ImpCod5 ;
   private boolean[] BC002Y10_n1445ImpCod5 ;
   private String[] BC002Y10_A1446ImpLpt1 ;
   private boolean[] BC002Y10_n1446ImpLpt1 ;
   private String[] BC002Y10_A1447ImpLpt2 ;
   private boolean[] BC002Y10_n1447ImpLpt2 ;
   private String[] BC002Y10_A1448ImpLpt3 ;
   private boolean[] BC002Y10_n1448ImpLpt3 ;
   private String[] BC002Y10_A1449ImpLpt4 ;
   private boolean[] BC002Y10_n1449ImpLpt4 ;
   private String[] BC002Y10_A1450ImpLpt5 ;
   private boolean[] BC002Y10_n1450ImpLpt5 ;
   private byte[] BC002Y10_A6112TermBol ;
   private boolean[] BC002Y10_n6112TermBol ;
   private byte[] BC002Y10_A6113TermBal ;
   private boolean[] BC002Y10_n6113TermBal ;
   private byte[] BC002Y10_A8678TermNoTr ;
   private boolean[] BC002Y10_n8678TermNoTr ;
   private String[] BC002Y10_A6721TermLog1 ;
   private boolean[] BC002Y10_n6721TermLog1 ;
   private String[] BC002Y10_A6722TermLog2 ;
   private boolean[] BC002Y10_n6722TermLog2 ;
   private byte[] BC002Y10_A11757TermEst ;
   private boolean[] BC002Y10_n11757TermEst ;
   private java.util.Date[] BC002Y10_A11758TermFec ;
   private boolean[] BC002Y10_n11758TermFec ;
   private String[] BC002Y10_A574ImpCod ;
   private boolean[] BC002Y10_n574ImpCod ;
   private String[] BC002Y10_A396EmprCod ;
   private boolean[] BC002Y10_n396EmprCod ;
   private String[] BC002Y11_A942TermCod ;
   private byte[] BC002Y11_A8899TermPes ;
   private boolean[] BC002Y11_n8899TermPes ;
   private String[] BC002Y11_A8898TermDsc ;
   private boolean[] BC002Y11_n8898TermDsc ;
   private String[] BC002Y11_A1189TermUsu ;
   private boolean[] BC002Y11_n1189TermUsu ;
   private String[] BC002Y11_A1441ImpCod1 ;
   private boolean[] BC002Y11_n1441ImpCod1 ;
   private String[] BC002Y11_A1442ImpCod2 ;
   private boolean[] BC002Y11_n1442ImpCod2 ;
   private String[] BC002Y11_A1443ImpCod3 ;
   private boolean[] BC002Y11_n1443ImpCod3 ;
   private String[] BC002Y11_A1444ImpCod4 ;
   private boolean[] BC002Y11_n1444ImpCod4 ;
   private String[] BC002Y11_A1445ImpCod5 ;
   private boolean[] BC002Y11_n1445ImpCod5 ;
   private String[] BC002Y11_A1446ImpLpt1 ;
   private boolean[] BC002Y11_n1446ImpLpt1 ;
   private String[] BC002Y11_A1447ImpLpt2 ;
   private boolean[] BC002Y11_n1447ImpLpt2 ;
   private String[] BC002Y11_A1448ImpLpt3 ;
   private boolean[] BC002Y11_n1448ImpLpt3 ;
   private String[] BC002Y11_A1449ImpLpt4 ;
   private boolean[] BC002Y11_n1449ImpLpt4 ;
   private String[] BC002Y11_A1450ImpLpt5 ;
   private boolean[] BC002Y11_n1450ImpLpt5 ;
   private byte[] BC002Y11_A6112TermBol ;
   private boolean[] BC002Y11_n6112TermBol ;
   private byte[] BC002Y11_A6113TermBal ;
   private boolean[] BC002Y11_n6113TermBal ;
   private byte[] BC002Y11_A8678TermNoTr ;
   private boolean[] BC002Y11_n8678TermNoTr ;
   private String[] BC002Y11_A6721TermLog1 ;
   private boolean[] BC002Y11_n6721TermLog1 ;
   private String[] BC002Y11_A6722TermLog2 ;
   private boolean[] BC002Y11_n6722TermLog2 ;
   private byte[] BC002Y11_A11757TermEst ;
   private boolean[] BC002Y11_n11757TermEst ;
   private java.util.Date[] BC002Y11_A11758TermFec ;
   private boolean[] BC002Y11_n11758TermFec ;
   private String[] BC002Y11_A574ImpCod ;
   private boolean[] BC002Y11_n574ImpCod ;
   private String[] BC002Y11_A396EmprCod ;
   private boolean[] BC002Y11_n396EmprCod ;
   private String[] BC002Y15_A407EmprNom ;
   private boolean[] BC002Y15_n407EmprNom ;
   private String[] BC002Y16_A576ImpDsc ;
   private boolean[] BC002Y16_n576ImpDsc ;
   private String[] BC002Y17_A942TermCod ;
   private int[] BC002Y17_A10133TermCliCod ;
   private String[] BC002Y18_A942TermCod ;
   private String[] BC002Y18_A8900TermPesPro ;
   private String[] BC002Y19_A942TermCod ;
   private int[] BC002Y19_A2135RepBarCod ;
   private byte[] BC002Y19_A2137RepBarReo ;
   private String[] BC002Y19_A2136RepBarPar ;
   private byte[] BC002Y19_A2681RepComLin ;
   private String[] BC002Y19_A2138RepComCod ;
   private String[] BC002Y19_A2140RepFonCod ;
   private String[] BC002Y20_A942TermCod ;
   private byte[] BC002Y20_A8899TermPes ;
   private boolean[] BC002Y20_n8899TermPes ;
   private String[] BC002Y20_A407EmprNom ;
   private boolean[] BC002Y20_n407EmprNom ;
   private String[] BC002Y20_A8898TermDsc ;
   private boolean[] BC002Y20_n8898TermDsc ;
   private String[] BC002Y20_A576ImpDsc ;
   private boolean[] BC002Y20_n576ImpDsc ;
   private String[] BC002Y20_A1189TermUsu ;
   private boolean[] BC002Y20_n1189TermUsu ;
   private String[] BC002Y20_A1441ImpCod1 ;
   private boolean[] BC002Y20_n1441ImpCod1 ;
   private String[] BC002Y20_A1442ImpCod2 ;
   private boolean[] BC002Y20_n1442ImpCod2 ;
   private String[] BC002Y20_A1443ImpCod3 ;
   private boolean[] BC002Y20_n1443ImpCod3 ;
   private String[] BC002Y20_A1444ImpCod4 ;
   private boolean[] BC002Y20_n1444ImpCod4 ;
   private String[] BC002Y20_A1445ImpCod5 ;
   private boolean[] BC002Y20_n1445ImpCod5 ;
   private String[] BC002Y20_A1446ImpLpt1 ;
   private boolean[] BC002Y20_n1446ImpLpt1 ;
   private String[] BC002Y20_A1447ImpLpt2 ;
   private boolean[] BC002Y20_n1447ImpLpt2 ;
   private String[] BC002Y20_A1448ImpLpt3 ;
   private boolean[] BC002Y20_n1448ImpLpt3 ;
   private String[] BC002Y20_A1449ImpLpt4 ;
   private boolean[] BC002Y20_n1449ImpLpt4 ;
   private String[] BC002Y20_A1450ImpLpt5 ;
   private boolean[] BC002Y20_n1450ImpLpt5 ;
   private byte[] BC002Y20_A6112TermBol ;
   private boolean[] BC002Y20_n6112TermBol ;
   private byte[] BC002Y20_A6113TermBal ;
   private boolean[] BC002Y20_n6113TermBal ;
   private byte[] BC002Y20_A8678TermNoTr ;
   private boolean[] BC002Y20_n8678TermNoTr ;
   private String[] BC002Y20_A6721TermLog1 ;
   private boolean[] BC002Y20_n6721TermLog1 ;
   private String[] BC002Y20_A6722TermLog2 ;
   private boolean[] BC002Y20_n6722TermLog2 ;
   private byte[] BC002Y20_A11757TermEst ;
   private boolean[] BC002Y20_n11757TermEst ;
   private java.util.Date[] BC002Y20_A11758TermFec ;
   private boolean[] BC002Y20_n11758TermFec ;
   private String[] BC002Y20_A574ImpCod ;
   private boolean[] BC002Y20_n574ImpCod ;
   private String[] BC002Y20_A396EmprCod ;
   private boolean[] BC002Y20_n396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] BC002Y2_A942TermCod ;
   private byte[] BC002Y2_A8899TermPes ;
   private String[] BC002Y2_A8898TermDsc ;
   private String[] BC002Y2_A1189TermUsu ;
   private String[] BC002Y2_A1441ImpCod1 ;
   private String[] BC002Y2_A1442ImpCod2 ;
   private String[] BC002Y2_A1443ImpCod3 ;
   private String[] BC002Y2_A1444ImpCod4 ;
   private String[] BC002Y2_A1445ImpCod5 ;
   private String[] BC002Y2_A1446ImpLpt1 ;
   private String[] BC002Y2_A1447ImpLpt2 ;
   private String[] BC002Y2_A1448ImpLpt3 ;
   private String[] BC002Y2_A1449ImpLpt4 ;
   private String[] BC002Y2_A1450ImpLpt5 ;
   private byte[] BC002Y2_A6112TermBol ;
   private byte[] BC002Y2_A6113TermBal ;
   private byte[] BC002Y2_A8678TermNoTr ;
   private String[] BC002Y2_A6721TermLog1 ;
   private String[] BC002Y2_A6722TermLog2 ;
   private byte[] BC002Y2_A11757TermEst ;
   private java.util.Date[] BC002Y2_A11758TermFec ;
   private String[] BC002Y2_A574ImpCod ;
   private String[] BC002Y2_A396EmprCod ;
   private String[] BC002Y3_A942TermCod ;
   private byte[] BC002Y3_A8899TermPes ;
   private String[] BC002Y3_A8898TermDsc ;
   private String[] BC002Y3_A1189TermUsu ;
   private String[] BC002Y3_A1441ImpCod1 ;
   private String[] BC002Y3_A1442ImpCod2 ;
   private String[] BC002Y3_A1443ImpCod3 ;
   private String[] BC002Y3_A1444ImpCod4 ;
   private String[] BC002Y3_A1445ImpCod5 ;
   private String[] BC002Y3_A1446ImpLpt1 ;
   private String[] BC002Y3_A1447ImpLpt2 ;
   private String[] BC002Y3_A1448ImpLpt3 ;
   private String[] BC002Y3_A1449ImpLpt4 ;
   private String[] BC002Y3_A1450ImpLpt5 ;
   private byte[] BC002Y3_A6112TermBol ;
   private byte[] BC002Y3_A6113TermBal ;
   private byte[] BC002Y3_A8678TermNoTr ;
   private String[] BC002Y3_A6721TermLog1 ;
   private String[] BC002Y3_A6722TermLog2 ;
   private byte[] BC002Y3_A11757TermEst ;
   private java.util.Date[] BC002Y3_A11758TermFec ;
   private String[] BC002Y3_A574ImpCod ;
   private String[] BC002Y3_A396EmprCod ;
   private String[] BC002Y4_A576ImpDsc ;
   private String[] BC002Y5_A407EmprNom ;
   private boolean[] BC002Y2_n8899TermPes ;
   private boolean[] BC002Y2_n8898TermDsc ;
   private boolean[] BC002Y2_n1189TermUsu ;
   private boolean[] BC002Y2_n1441ImpCod1 ;
   private boolean[] BC002Y2_n1442ImpCod2 ;
   private boolean[] BC002Y2_n1443ImpCod3 ;
   private boolean[] BC002Y2_n1444ImpCod4 ;
   private boolean[] BC002Y2_n1445ImpCod5 ;
   private boolean[] BC002Y2_n1446ImpLpt1 ;
   private boolean[] BC002Y2_n1447ImpLpt2 ;
   private boolean[] BC002Y2_n1448ImpLpt3 ;
   private boolean[] BC002Y2_n1449ImpLpt4 ;
   private boolean[] BC002Y2_n1450ImpLpt5 ;
   private boolean[] BC002Y2_n6112TermBol ;
   private boolean[] BC002Y2_n6113TermBal ;
   private boolean[] BC002Y2_n8678TermNoTr ;
   private boolean[] BC002Y2_n6721TermLog1 ;
   private boolean[] BC002Y2_n6722TermLog2 ;
   private boolean[] BC002Y2_n11757TermEst ;
   private boolean[] BC002Y2_n11758TermFec ;
   private boolean[] BC002Y2_n574ImpCod ;
   private boolean[] BC002Y2_n396EmprCod ;
   private boolean[] BC002Y3_n8899TermPes ;
   private boolean[] BC002Y3_n8898TermDsc ;
   private boolean[] BC002Y3_n1189TermUsu ;
   private boolean[] BC002Y3_n1441ImpCod1 ;
   private boolean[] BC002Y3_n1442ImpCod2 ;
   private boolean[] BC002Y3_n1443ImpCod3 ;
   private boolean[] BC002Y3_n1444ImpCod4 ;
   private boolean[] BC002Y3_n1445ImpCod5 ;
   private boolean[] BC002Y3_n1446ImpLpt1 ;
   private boolean[] BC002Y3_n1447ImpLpt2 ;
   private boolean[] BC002Y3_n1448ImpLpt3 ;
   private boolean[] BC002Y3_n1449ImpLpt4 ;
   private boolean[] BC002Y3_n1450ImpLpt5 ;
   private boolean[] BC002Y3_n6112TermBol ;
   private boolean[] BC002Y3_n6113TermBal ;
   private boolean[] BC002Y3_n8678TermNoTr ;
   private boolean[] BC002Y3_n6721TermLog1 ;
   private boolean[] BC002Y3_n6722TermLog2 ;
   private boolean[] BC002Y3_n11757TermEst ;
   private boolean[] BC002Y3_n11758TermFec ;
   private boolean[] BC002Y3_n574ImpCod ;
   private boolean[] BC002Y3_n396EmprCod ;
   private boolean[] BC002Y4_n576ImpDsc ;
   private boolean[] BC002Y5_n407EmprNom ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV40TrnContextAtt ;
}

final  class ttermin_bc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin_bc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin_bc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin_bc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttermin_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC002Y2", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ?  FOR UPDATE OF TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y3", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y4", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y5", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y6", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermCod, TM1.TermPes, T2.EmprNom, TM1.TermDsc, T3.ImpDsc, TM1.TermUsu, TM1.ImpCod1, TM1.ImpCod2, TM1.ImpCod3, TM1.ImpCod4, TM1.ImpCod5, TM1.ImpLpt1, TM1.ImpLpt2, TM1.ImpLpt3, TM1.ImpLpt4, TM1.ImpLpt5, TM1.TermBol, TM1.TermBal, TM1.TermNoTr, TM1.TermLog1, TM1.TermLog2, TM1.TermEst, TM1.TermFec, TM1.ImpCod, TM1.EmprCod FROM ((TXPTERMIN TM1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPIMPRES T3 ON T3.ImpCod = TM1.ImpCod) WHERE TM1.TermCod = ? ORDER BY TM1.TermCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y8", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y9", "SELECT /*+ FIRST_ROWS(1) */ TermCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y10", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y11", "SELECT TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod FROM TXPTERMIN WHERE TermCod = ?  FOR UPDATE OF TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("BC002Y12", "INSERT INTO TXPTERMIN(TermCod, TermPes, TermDsc, TermUsu, ImpCod1, ImpCod2, ImpCod3, ImpCod4, ImpCod5, ImpLpt1, ImpLpt2, ImpLpt3, ImpLpt4, ImpLpt5, TermBol, TermBal, TermNoTr, TermLog1, TermLog2, TermEst, TermFec, ImpCod, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTERMIN")
         ,new UpdateCursor("BC002Y13", "UPDATE TXPTERMIN SET TermPes=?, TermDsc=?, TermUsu=?, ImpCod1=?, ImpCod2=?, ImpCod3=?, ImpCod4=?, ImpCod5=?, ImpLpt1=?, ImpLpt2=?, ImpLpt3=?, ImpLpt4=?, ImpLpt5=?, TermBol=?, TermBal=?, TermNoTr=?, TermLog1=?, TermLog2=?, TermEst=?, TermFec=?, ImpCod=?, EmprCod=?  WHERE TermCod = ?", GX_NOMASK, "TXPTERMIN")
         ,new UpdateCursor("BC002Y14", "DELETE FROM TXPTERMIN  WHERE TermCod = ?", GX_NOMASK, "TXPTERMIN")
         ,new ForEachCursor("BC002Y15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y16", "SELECT ImpDsc FROM TXPIMPRES WHERE ImpCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("BC002Y17", "SELECT * FROM (SELECT TermCod, TermCliCod FROM TXPTERMCL WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002Y18", "SELECT * FROM (SELECT TermCod, TermPesPro FROM TXPTERMI1 WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002Y19", "SELECT * FROM (SELECT TermCod, RepBarCod, RepBarReo, RepBarPar, RepComLin, RepComCod, RepFonCod FROM TXPLANREP WHERE TermCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("BC002Y20", "SELECT /*+ FIRST_ROWS(100) */ TM1.TermCod, TM1.TermPes, T2.EmprNom, TM1.TermDsc, T3.ImpDsc, TM1.TermUsu, TM1.ImpCod1, TM1.ImpCod2, TM1.ImpCod3, TM1.ImpCod4, TM1.ImpCod5, TM1.ImpLpt1, TM1.ImpLpt2, TM1.ImpLpt3, TM1.ImpLpt4, TM1.ImpLpt5, TM1.TermBol, TM1.TermBal, TM1.TermNoTr, TM1.TermLog1, TM1.TermLog2, TM1.TermEst, TM1.TermFec, TM1.ImpCod, TM1.EmprCod FROM ((TXPTERMIN TM1 LEFT JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPIMPRES T3 ON T3.ImpCod = TM1.ImpCod) WHERE TM1.TermCod = ? ORDER BY TM1.TermCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 10);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 3);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 10);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 3);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 10);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 10);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 10);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 10);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 128);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 128);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[40], false);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 10);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 3);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 10);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(19, ((Number) parms[37]).byteValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 3);
               }
               stmt.setString(23, (String)parms[44], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 10);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

