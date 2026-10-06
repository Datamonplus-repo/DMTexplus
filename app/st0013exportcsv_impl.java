package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class st0013exportcsv_impl extends GXWebProcedure
{
   public st0013exportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV29ImpCod = httpContext.GetPar( "ImpCod") ;
            AV50PProd = httpContext.GetPar( "PProd") ;
            AV61UProd = httpContext.GetPar( "UProd") ;
            AV51PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV62UProv = (int)(GXutil.lval( httpContext.GetPar( "UProv"))) ;
            AV70Filename = httpContext.GetPar( "Filename") ;
            AV72ErrorMessage = httpContext.GetPar( "ErrorMessage") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV31Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN259_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit0 = GXt_char1 ;
      GXt_char1 = AV32Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit1 = GXt_char1 ;
      GXt_char1 = AV37Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit2 = GXt_char1 ;
      GXt_char1 = AV38Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit3 = GXt_char1 ;
      GXt_char1 = AV39Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN121_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit4 = GXt_char1 ;
      GXt_char1 = AV40Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT3005_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit5 = GXt_char1 ;
      GXt_char1 = AV41Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1020_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit6 = GXt_char1 ;
      GXt_char1 = AV42Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN495_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit7 = GXt_char1 ;
      GXt_char1 = AV43Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT398_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit8 = GXt_char1 ;
      GXt_char1 = AV44Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN118_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit9 = GXt_char1 ;
      GXt_char1 = AV33Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1367_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit10 = GXt_char1 ;
      GXt_char1 = AV34Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN523_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit11 = GXt_char1 ;
      GXt_char1 = AV35Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN459_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit12 = GXt_char1 ;
      GXt_char1 = AV36Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1302_", ""), (byte)(99), GXv_char2) ;
      st0013exportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit13 = GXt_char1 ;
      GXt_int3 = AV30Induyco ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUYC", ""), GXv_int4) ;
      st0013exportcsv_impl.this.GXt_int3 = GXv_int4[0] ;
      AV30Induyco = GXt_int3 ;
      GXt_int5 = AV19CC ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char6[0] = "011100" ;
      GXv_int7[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char2, GXv_char6, GXv_int7) ;
      st0013exportcsv_impl.this.A396EmprCod = GXv_char2[0] ;
      st0013exportcsv_impl.this.GXt_int5 = GXv_int7[0] ;
      AV19CC = (byte)(GXt_int5) ;
      GXt_int3 = AV49PedCol ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PEDCOL", ""), GXv_int4) ;
      st0013exportcsv_impl.this.GXt_int3 = GXv_int4[0] ;
      AV49PedCol = GXt_int3 ;
      GXt_int3 = AV26Etm ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int4) ;
      st0013exportcsv_impl.this.GXt_int3 = GXv_int4[0] ;
      AV26Etm = GXt_int3 ;
      /* Using cursor P08VL2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P08VL2_A407EmprNom[0] ;
         n407EmprNom = P08VL2_n407EmprNom[0] ;
         AV47NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P08VL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV50PProd, Integer.valueOf(AV51PProv), Integer.valueOf(AV62UProv), AV61UProd});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A856ValCod = P08VL3_A856ValCod[0] ;
         A795PrvNum = P08VL3_A795PrvNum[0] ;
         A719PrdNum = P08VL3_A719PrdNum[0] ;
         A705PrdExiCC = P08VL3_A705PrdExiCC[0] ;
         A732PrdStkMinU = P08VL3_A732PrdStkMinU[0] ;
         A684PrdCanPen = P08VL3_A684PrdCanPen[0] ;
         A685PrdCanRes = P08VL3_A685PrdCanRes[0] ;
         A704PrdExiAlm = P08VL3_A704PrdExiAlm[0] ;
         A707PrdFacCon = P08VL3_A707PrdFacCon[0] ;
         A721PrdNumUco = P08VL3_A721PrdNumUco[0] ;
         A629MetCod = P08VL3_A629MetCod[0] ;
         n629MetCod = P08VL3_n629MetCod[0] ;
         A696PrdConDia = P08VL3_A696PrdConDia[0] ;
         A699PrdDiaRot = P08VL3_A699PrdDiaRot[0] ;
         A716PrdLotMin = P08VL3_A716PrdLotMin[0] ;
         A718PrdNom = P08VL3_A718PrdNom[0] ;
         A724PrdPreAct = P08VL3_A724PrdPreAct[0] ;
         A803PrvTlf = P08VL3_A803PrvTlf[0] ;
         n803PrvTlf = P08VL3_n803PrvTlf[0] ;
         A794PrvNom = P08VL3_A794PrvNom[0] ;
         n794PrvNom = P08VL3_n794PrvNom[0] ;
         A803PrvTlf = P08VL3_A803PrvTlf[0] ;
         n803PrvTlf = P08VL3_n803PrvTlf[0] ;
         A794PrvNom = P08VL3_A794PrvNom[0] ;
         n794PrvNom = P08VL3_n794PrvNom[0] ;
         if ( ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen)), A732PrdStkMinU) < 0 ) && ( AV19CC == 1 ) && ( AV26Etm == 0 ) ) || ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes)), A732PrdStkMinU) < 0 ) && ( AV19CC == 1 ) && ( AV26Etm == 1 ) ) || ( ( DecimalUtil.compareTo((A704PrdExiAlm.subtract(A685PrdCanRes).add(A684PrdCanPen).add(A705PrdExiCC)), A732PrdStkMinU) < 0 ) && ( AV19CC == 0 ) ) )
         {
            AV52PrdExiAlm = A704PrdExiAlm.add(((AV19CC==1) ? DecimalUtil.doubleToDec(0) : A705PrdExiCC)) ;
            AV55StkRea = AV52PrdExiAlm.subtract((A685PrdCanRes.multiply(A707PrdFacCon))) ;
            AV24Dia = GXutil.nullDate() ;
            AV15Any = (short)(GXutil.year( GXutil.today( ))) ;
            GXv_char6[0] = AV67SdtPConCosJSon ;
            GXv_date8[0] = AV24Dia ;
            GXv_date9[0] = AV24Dia ;
            GXv_date10[0] = AV24Dia ;
            GXv_date11[0] = AV24Dia ;
            new app.pconconsdt(remoteHandle, context).execute( A396EmprCod, A719PrdNum, AV15Any, GXv_char6, GXv_date8, GXv_date9, GXv_date10, GXv_date11) ;
            st0013exportcsv_impl.this.AV67SdtPConCosJSon = GXv_char6[0] ;
            st0013exportcsv_impl.this.AV24Dia = GXv_date8[0] ;
            st0013exportcsv_impl.this.AV24Dia = GXv_date9[0] ;
            st0013exportcsv_impl.this.AV24Dia = GXv_date10[0] ;
            st0013exportcsv_impl.this.AV24Dia = GXv_date11[0] ;
            AV66SdtPConCosCollection.fromJSonString(AV67SdtPConCosJSon, null);
            if ( AV66SdtPConCosCollection.size() > 0 )
            {
               AV80GXV1 = 1 ;
               while ( AV80GXV1 <= AV66SdtPConCosCollection.size() )
               {
                  AV68SdtPConCos = (app.SdtSdtPConCos)((app.SdtSdtPConCos)AV66SdtPConCosCollection.elementAt(-1+AV80GXV1));
                  AV57TotCon = AV57TotCon.add((AV68SdtPConCos.getgxTv_SdtSdtPConCos_Prduniconm())) ;
                  AV80GXV1 = (int)(AV80GXV1+1) ;
               }
            }
            AV66SdtPConCosCollection.clear();
            AV53PromCon = AV57TotCon.divide(DecimalUtil.doubleToDec(11), 18, java.math.RoundingMode.DOWN) ;
            if ( ( A629MetCod == 0 ) && ( A721PrdNumUco.doubleValue() != 0 ) )
            {
               AV60UniPed = GXutil.roundDecimal( (DecimalUtil.doubleToDec(A699PrdDiaRot).multiply(A696PrdConDia).divide(A721PrdNumUco, 18, java.math.RoundingMode.DOWN)), 0) ;
            }
            if ( A629MetCod == 1 )
            {
               if ( A721PrdNumUco.doubleValue() == 0 )
               {
                  AV16CantPedir = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble((AV53PromCon.multiply(DecimalUtil.doubleToDec(A699PrdDiaRot))).divide(DecimalUtil.doubleToDec(30), 18, java.math.RoundingMode.DOWN)))) ;
                  AV46Multiplo = A716PrdLotMin ;
                  if ( AV46Multiplo == 0 )
                  {
                     AV46Multiplo = (short)(1) ;
                  }
                  if ( GXutil.Int( DecimalUtil.decToDouble(AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN))) == (AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN)).doubleValue() )
                  {
                     AV60UniPed = AV16CantPedir ;
                  }
                  else
                  {
                     AV60UniPed = DecimalUtil.doubleToDec(AV46Multiplo*GXutil.Int( DecimalUtil.decToDouble(AV16CantPedir.divide(DecimalUtil.doubleToDec(AV46Multiplo), 18, java.math.RoundingMode.DOWN)))+AV46Multiplo) ;
                  }
               }
               else
               {
                  AV60UniPed = A721PrdNumUco.multiply(((AV49PedCol==1) ? DecimalUtil.doubleToDec(A716PrdLotMin) : DecimalUtil.doubleToDec(1))) ;
               }
            }
            if ( A629MetCod == 2 )
            {
               AV60UniPed = DecimalUtil.doubleToDec(-1) ;
            }
            AV17CantPend = A684PrdCanPen ;
            AV74TextFileLine = "" ;
            AV74TextFileLine = A719PrdNum + ";" + GXutil.trim( A718PrdNom) + ";" + GXutil.str( AV17CantPend, 10, 4) + ";" + GXutil.trim( GXutil.str( A685PrdCanRes, 12, 4)) + ";" + GXutil.trim( GXutil.str( AV52PrdExiAlm, 12, 4)) + ";" + GXutil.trim( GXutil.str( AV55StkRea, 12, 4)) + ";" ;
            AV74TextFileLine += GXutil.trim( GXutil.str( A732PrdStkMinU, 8, 2)) + ";" + GXutil.str( A795PrvNum, 6, 0) + ";" + GXutil.trim( A794PrvNom) + ";" + GXutil.trim( A803PrvTlf) + ";" + GXutil.str( AV60UniPed, 10, 2) + ";" + GXutil.str( A724PrdPreAct, 14, 5) ;
            if ( GXutil.len( AV74TextFileLine) > 0 )
            {
               AV71TextFile.writeLine(GXutil.substring( AV74TextFileLine, 1, -1));
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV70Filename = " " ;
      AV69Random = (int)(GXutil.random( )*10000) ;
      AV70Filename = "ProductosBajoMinimosExportCSV-" + GXutil.trim( GXutil.str( AV69Random, 8, 0)) + ".csv" ;
      AV71TextFile.setSource( AV70Filename );
      AV71TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV71TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV74TextFileLine = "" ;
      AV74TextFileLine = httpContext.getMessage( "Producto", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Cant Pdte", "") + ";" + httpContext.getMessage( "Cant Reservada", "") + ";" + httpContext.getMessage( "Existencias", "") + ";" + httpContext.getMessage( "Stock Real", "") + ";" ;
      AV74TextFileLine += httpContext.getMessage( "Stock Seguridad", "") + ";" + httpContext.getMessage( "Proveedor", "") + ";" + httpContext.getMessage( "Nombre", "") + ";" + httpContext.getMessage( "Telefono", "") + ";" + httpContext.getMessage( "Cant a pedir", "") + ";" + httpContext.getMessage( "Precio", "") ;
      if ( GXutil.len( AV74TextFileLine) > 0 )
      {
         AV71TextFile.writeLine(GXutil.substring( AV74TextFileLine, 1, -1));
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV71TextFile.getErrCode() != 0 )
      {
         AV70Filename = "" ;
         AV72ErrorMessage = AV71TextFile.getErrDescription() ;
         AV71TextFile.close();
         AV73HttpResponse.addString(AV72ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV71TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV71TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV73HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV73HttpResponse.addHeader("Content-Disposition", "attachment;filename=PRODUCWWExportCSV.csv");
         }
         AV73HttpResponse.addFile(AV71TextFile.getAbsoluteName());
      }
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV29ImpCod = "" ;
      AV50PProd = "" ;
      AV61UProd = "" ;
      AV70Filename = "" ;
      AV72ErrorMessage = "" ;
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV37Lit2 = "" ;
      AV38Lit3 = "" ;
      AV39Lit4 = "" ;
      AV40Lit5 = "" ;
      AV41Lit6 = "" ;
      AV42Lit7 = "" ;
      AV43Lit8 = "" ;
      AV44Lit9 = "" ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      AV36Lit13 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P08VL2_A396EmprCod = new String[] {""} ;
      P08VL2_A407EmprNom = new String[] {""} ;
      P08VL2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV47NomEmp = "" ;
      P08VL3_A396EmprCod = new String[] {""} ;
      P08VL3_A856ValCod = new byte[1] ;
      P08VL3_A795PrvNum = new int[1] ;
      P08VL3_A719PrdNum = new String[] {""} ;
      P08VL3_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A629MetCod = new byte[1] ;
      P08VL3_n629MetCod = new boolean[] {false} ;
      P08VL3_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A699PrdDiaRot = new short[1] ;
      P08VL3_A716PrdLotMin = new short[1] ;
      P08VL3_A718PrdNom = new String[] {""} ;
      P08VL3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VL3_A803PrvTlf = new String[] {""} ;
      P08VL3_n803PrvTlf = new boolean[] {false} ;
      P08VL3_A794PrvNom = new String[] {""} ;
      P08VL3_n794PrvNom = new boolean[] {false} ;
      A719PrdNum = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A803PrvTlf = "" ;
      A794PrvNom = "" ;
      AV52PrdExiAlm = DecimalUtil.ZERO ;
      AV55StkRea = DecimalUtil.ZERO ;
      AV24Dia = GXutil.nullDate() ;
      AV67SdtPConCosJSon = "" ;
      GXv_char6 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date11 = new java.util.Date[1] ;
      AV66SdtPConCosCollection = new GXBaseCollection<app.SdtSdtPConCos>(app.SdtSdtPConCos.class, "SdtPConCos", "TexplusNET", remoteHandle);
      AV68SdtPConCos = new app.SdtSdtPConCos(remoteHandle, context);
      AV57TotCon = DecimalUtil.ZERO ;
      AV53PromCon = DecimalUtil.ZERO ;
      AV60UniPed = DecimalUtil.ZERO ;
      AV16CantPedir = DecimalUtil.ZERO ;
      AV17CantPend = DecimalUtil.ZERO ;
      AV74TextFileLine = "" ;
      AV71TextFile = new com.genexus.util.GXFile();
      AV73HttpResponse = httpContext.getHttpResponse();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.st0013exportcsv__default(),
         new Object[] {
             new Object[] {
            P08VL2_A396EmprCod, P08VL2_A407EmprNom, P08VL2_n407EmprNom
            }
            , new Object[] {
            P08VL3_A396EmprCod, P08VL3_A856ValCod, P08VL3_A795PrvNum, P08VL3_A719PrdNum, P08VL3_A705PrdExiCC, P08VL3_A732PrdStkMinU, P08VL3_A684PrdCanPen, P08VL3_A685PrdCanRes, P08VL3_A704PrdExiAlm, P08VL3_A707PrdFacCon,
            P08VL3_A721PrdNumUco, P08VL3_A629MetCod, P08VL3_n629MetCod, P08VL3_A696PrdConDia, P08VL3_A699PrdDiaRot, P08VL3_A716PrdLotMin, P08VL3_A718PrdNom, P08VL3_A724PrdPreAct, P08VL3_A803PrvTlf, P08VL3_n803PrvTlf,
            P08VL3_A794PrvNom, P08VL3_n794PrvNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30Induyco ;
   private byte AV19CC ;
   private byte AV49PedCol ;
   private byte AV26Etm ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A856ValCod ;
   private byte A629MetCod ;
   private short gxcookieaux ;
   private short A699PrdDiaRot ;
   private short A716PrdLotMin ;
   private short AV15Any ;
   private short AV46Multiplo ;
   private short Gx_err ;
   private int AV51PProv ;
   private int AV62UProv ;
   private int GXt_int5 ;
   private int GXv_int7[] ;
   private int A795PrvNum ;
   private int AV80GXV1 ;
   private int AV69Random ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV52PrdExiAlm ;
   private java.math.BigDecimal AV55StkRea ;
   private java.math.BigDecimal AV57TotCon ;
   private java.math.BigDecimal AV53PromCon ;
   private java.math.BigDecimal AV60UniPed ;
   private java.math.BigDecimal AV16CantPedir ;
   private java.math.BigDecimal AV17CantPend ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV29ImpCod ;
   private String AV50PProd ;
   private String AV61UProd ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV37Lit2 ;
   private String AV38Lit3 ;
   private String AV39Lit4 ;
   private String AV40Lit5 ;
   private String AV41Lit6 ;
   private String AV42Lit7 ;
   private String AV43Lit8 ;
   private String AV44Lit9 ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String AV36Lit13 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV47NomEmp ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A803PrvTlf ;
   private String A794PrvNom ;
   private String GXv_char6[] ;
   private java.util.Date AV24Dia ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date GXv_date9[] ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n629MetCod ;
   private boolean n803PrvTlf ;
   private boolean n794PrvNom ;
   private String AV74TextFileLine ;
   private String AV70Filename ;
   private String AV72ErrorMessage ;
   private String AV67SdtPConCosJSon ;
   private IDataStoreProvider pr_default ;
   private String[] P08VL2_A396EmprCod ;
   private String[] P08VL2_A407EmprNom ;
   private boolean[] P08VL2_n407EmprNom ;
   private String[] P08VL3_A396EmprCod ;
   private byte[] P08VL3_A856ValCod ;
   private int[] P08VL3_A795PrvNum ;
   private String[] P08VL3_A719PrdNum ;
   private java.math.BigDecimal[] P08VL3_A705PrdExiCC ;
   private java.math.BigDecimal[] P08VL3_A732PrdStkMinU ;
   private java.math.BigDecimal[] P08VL3_A684PrdCanPen ;
   private java.math.BigDecimal[] P08VL3_A685PrdCanRes ;
   private java.math.BigDecimal[] P08VL3_A704PrdExiAlm ;
   private java.math.BigDecimal[] P08VL3_A707PrdFacCon ;
   private java.math.BigDecimal[] P08VL3_A721PrdNumUco ;
   private byte[] P08VL3_A629MetCod ;
   private boolean[] P08VL3_n629MetCod ;
   private java.math.BigDecimal[] P08VL3_A696PrdConDia ;
   private short[] P08VL3_A699PrdDiaRot ;
   private short[] P08VL3_A716PrdLotMin ;
   private String[] P08VL3_A718PrdNom ;
   private java.math.BigDecimal[] P08VL3_A724PrdPreAct ;
   private String[] P08VL3_A803PrvTlf ;
   private boolean[] P08VL3_n803PrvTlf ;
   private String[] P08VL3_A794PrvNom ;
   private boolean[] P08VL3_n794PrvNom ;
   private com.genexus.internet.HttpResponse AV73HttpResponse ;
   private com.genexus.util.GXFile AV71TextFile ;
   private GXBaseCollection<app.SdtSdtPConCos> AV66SdtPConCosCollection ;
   private app.SdtSdtPConCos AV68SdtPConCos ;
}

final  class st0013exportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VL2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08VL3", "SELECT T1.EmprCod, T1.ValCod, T1.PrvNum, T1.PrdNum, T1.PrdExiCC, T1.PrdStkMinU, T1.PrdCanPen, T1.PrdCanRes, T1.PrdExiAlm, T1.PrdFacCon, T1.PrdNumUco, T1.MetCod, T1.PrdConDia, T1.PrdDiaRot, T1.PrdLotMin, T1.PrdNom, T1.PrdPreAct, T2.PrvTlf, T2.PrvNom FROM (TXPPRODUC T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.PrdNum >= ?) AND (T1.PrvNum >= ? and T1.PrvNum <= ?) AND (T1.ValCod = 1) AND (T1.PrdNum <= ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 26);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,5);
               ((String[]) buf[18])[0] = rslt.getString(18, 18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               return;
      }
   }

}

