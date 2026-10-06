package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashdocumentofactura extends GXProcedure
{
   public obtengocadenaparahashdocumentofactura( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashdocumentofactura.class ), "" );
   }

   public obtengocadenaparahashdocumentofactura( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             String[] aP3 )
   {
      obtengocadenaparahashdocumentofactura.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      obtengocadenaparahashdocumentofactura.this.A396EmprCod = aP0;
      obtengocadenaparahashdocumentofactura.this.AV10FacCod = aP1;
      obtengocadenaparahashdocumentofactura.this.AV14FacHor = aP2;
      obtengocadenaparahashdocumentofactura.this.aP3 = aP3;
      obtengocadenaparahashdocumentofactura.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16FirmaD ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int2) ;
      obtengocadenaparahashdocumentofactura.this.GXt_int1 = GXv_int2[0] ;
      AV16FirmaD = GXt_int1 ;
      GXt_int3 = AV28Contval2 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "FIRDIG", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      obtengocadenaparahashdocumentofactura.this.A396EmprCod = GXv_char4[0] ;
      obtengocadenaparahashdocumentofactura.this.GXt_int3 = GXv_int6[0] ;
      AV28Contval2 = GXt_int3 ;
      GXt_char7 = AV21ddmmaaaa ;
      GXv_char5[0] = GXt_char7 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_char5) ;
      obtengocadenaparahashdocumentofactura.this.GXt_char7 = GXv_char5[0] ;
      AV21ddmmaaaa = GXt_char7 ;
      if ( ( AV16FirmaD == 0 ) || ( AV28Contval2 == 1 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV21ddmmaaaa, " ") == 0 )
      {
         AV21ddmmaaaa = "02/04/12" ;
      }
      AV22FacFch = localUtil.ctod( AV21ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV21ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV22FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      System.out.println( Gx_msg );
      /* Using cursor P09YQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10FacCod), A396EmprCod, Integer.valueOf(AV10FacCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7210FacObs = P09YQ2_A7210FacObs[0] ;
         A430FacCod = P09YQ2_A430FacCod[0] ;
         A436FacFch = P09YQ2_A436FacFch[0] ;
         A14236FacSerAT = P09YQ2_A14236FacSerAT[0] ;
         A14237FacTipAT = P09YQ2_A14237FacTipAT[0] ;
         A2739FacSerNum = P09YQ2_A2739FacSerNum[0] ;
         A1153FacTipFac = P09YQ2_A1153FacTipFac[0] ;
         A9606FacHor = P09YQ2_A9606FacHor[0] ;
         A11513FacRecIca = P09YQ2_A11513FacRecIca[0] ;
         A8346FacRecI = P09YQ2_A8346FacRecI[0] ;
         n8346FacRecI = P09YQ2_n8346FacRecI[0] ;
         A7212FacRect = P09YQ2_A7212FacRect[0] ;
         A453FacRECPor = P09YQ2_A453FacRECPor[0] ;
         A443FacIVAPor = P09YQ2_A443FacIVAPor[0] ;
         A14224FacCostFac = P09YQ2_A14224FacCostFac[0] ;
         A14223FacCostKgs = P09YQ2_A14223FacCostKgs[0] ;
         A14222FacCostMts = P09YQ2_A14222FacCostMts[0] ;
         A434FacDtoPP = P09YQ2_A434FacDtoPP[0] ;
         A433FacDtoGen = P09YQ2_A433FacDtoGen[0] ;
         A14219FacEnergia = P09YQ2_A14219FacEnergia[0] ;
         /* Using cursor P09YQ3 */
         pr_default.execute(1, new Object[] {A396EmprCod});
         A7209Colombia = P09YQ3_A7209Colombia[0] ;
         n7209Colombia = P09YQ3_n7209Colombia[0] ;
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         /* Using cursor P09YQ5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A3918FacImpTot1 = P09YQ5_A3918FacImpTot1[0] ;
         }
         else
         {
            A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
         }
         A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
            }
            else
            {
               A440FacImpPP = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
            }
         }
         A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
         A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
            }
            else
            {
               A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
            }
            else
            {
               A452FacRecImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
            }
            else
            {
               A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
            }
         }
         A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         if ( A7209Colombia == 0 )
         {
            A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
            }
            else
            {
               A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
            }
         }
         A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
         AV17VarAux = localUtil.ttoc( AV14FacHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV24HhSys = GXutil.substring( AV17VarAux, 12, 8) ;
         AV23FecSys = localUtil.ctod( GXutil.substring( AV17VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV27Invoicedt = GXutil.trim( GXutil.str( GXutil.year( A436FacFch), 10, 0)) ;
         if ( GXutil.month( A436FacFch) < 10 )
         {
            AV27Invoicedt += "-0" + GXutil.trim( GXutil.str( GXutil.month( A436FacFch), 10, 0)) ;
         }
         else
         {
            AV27Invoicedt += "-" + GXutil.trim( GXutil.str( GXutil.month( A436FacFch), 10, 0)) ;
         }
         if ( GXutil.day( A436FacFch) < 10 )
         {
            AV27Invoicedt += "-0" + GXutil.trim( GXutil.str( GXutil.day( A436FacFch), 10, 0)) ;
         }
         else
         {
            AV27Invoicedt += "-" + GXutil.trim( GXutil.str( GXutil.day( A436FacFch), 10, 0)) ;
         }
         AV11DateAux = GXutil.trim( GXutil.str( GXutil.year( AV23FecSys), 10, 0)) ;
         if ( GXutil.month( AV23FecSys) < 10 )
         {
            AV11DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV23FecSys), 10, 0)) ;
         }
         else
         {
            AV11DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV23FecSys), 10, 0)) ;
         }
         if ( GXutil.day( AV23FecSys) < 10 )
         {
            AV11DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV23FecSys), 10, 0)) ;
         }
         else
         {
            AV11DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV23FecSys), 10, 0)) ;
         }
         AV8texto = AV27Invoicedt ;
         AV8texto += ";" + AV11DateAux + httpContext.getMessage( "T", "") + AV24HhSys ;
         AV8texto += ";" + GXutil.trim( A14237FacTipAT) + " " + GXutil.trim( A14236FacSerAT) + "/" + GXutil.trim( GXutil.str( A430FacCod, 8, 0)) ;
         AV8texto += ";" + GXutil.trim( GXutil.str( A455FacTot, 13, 2)) + ";" ;
         AV12FacSerNum = A2739FacSerNum ;
         AV19FacTipfac = A1153FacTipFac ;
         /* Execute user subroutine: 'FIRMAANTERIOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(1);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A7210FacObs = GXutil.trim( AV8texto) ;
         AV17VarAux = GXutil.str( GXutil.day( AV23FecSys), 2, 0) + "/" + GXutil.str( GXutil.month( AV23FecSys), 2, 0) + "/" + GXutil.str( GXutil.year( AV23FecSys), 4, 0) + " " + AV24HhSys ;
         AV25FecHhSys = localUtil.ctot( AV17VarAux, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         Gx_msg = httpContext.getMessage( "&FecHhSys =", "") + localUtil.ttoc( AV25FecHhSys, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         System.out.println( Gx_msg );
         A9606FacHor = AV14FacHor ;
         /* Using cursor P09YQ6 */
         pr_default.execute(3, new Object[] {A7210FacObs, A9606FacHor, A396EmprCod, Integer.valueOf(A430FacCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      AV9firma = GXutil.trim( AV9firma) ;
      /* Optimized UPDATE. */
      /* Using cursor P09YQ7 */
      pr_default.execute(4, new Object[] {AV9firma, A396EmprCod, Integer.valueOf(AV10FacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV13FacFirma = "" ;
      AV20FirmaLast = "" ;
      /* Using cursor P09YQ8 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV22FacFch, Byte.valueOf(AV19FacTipfac)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1153FacTipFac = P09YQ8_A1153FacTipFac[0] ;
         A436FacFch = P09YQ8_A436FacFch[0] ;
         A9605FacFirma = P09YQ8_A9605FacFirma[0] ;
         A430FacCod = P09YQ8_A430FacCod[0] ;
         if ( A430FacCod != AV10FacCod )
         {
            AV13FacFirma = A9605FacFirma ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV13FacFirma)==0) )
            {
               AV8texto += GXutil.trim( AV13FacFirma) ;
               AV20FirmaLast = AV13FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = obtengocadenaparahashdocumentofactura.this.AV8texto;
      this.aP4[0] = obtengocadenaparahashdocumentofactura.this.AV9firma;
      Application.commitDataStores(context, remoteHandle, pr_default, "obtengocadenaparahashdocumentofactura");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8texto = "" ;
      AV9firma = "" ;
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new long[1] ;
      AV21ddmmaaaa = "" ;
      GXt_char7 = "" ;
      GXv_char5 = new String[1] ;
      AV22FacFch = GXutil.nullDate() ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P09YQ2_A7210FacObs = new String[] {""} ;
      P09YQ2_A396EmprCod = new String[] {""} ;
      P09YQ2_A430FacCod = new int[1] ;
      P09YQ2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YQ2_A14236FacSerAT = new String[] {""} ;
      P09YQ2_A14237FacTipAT = new String[] {""} ;
      P09YQ2_A2739FacSerNum = new String[] {""} ;
      P09YQ2_A1153FacTipFac = new byte[1] ;
      P09YQ2_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      P09YQ2_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_n8346FacRecI = new boolean[] {false} ;
      P09YQ2_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A443FacIVAPor = new byte[1] ;
      P09YQ2_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09YQ2_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A7210FacObs = "" ;
      A436FacFch = GXutil.nullDate() ;
      A14236FacSerAT = "" ;
      A14237FacTipAT = "" ;
      A2739FacSerNum = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P09YQ3_A7209Colombia = new byte[1] ;
      P09YQ3_n7209Colombia = new boolean[] {false} ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      P09YQ5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV17VarAux = "" ;
      AV24HhSys = "" ;
      AV23FecSys = GXutil.nullDate() ;
      AV27Invoicedt = "" ;
      AV11DateAux = "" ;
      AV12FacSerNum = "" ;
      AV25FecHhSys = GXutil.resetTime( GXutil.nullDate() );
      A9605FacFirma = "" ;
      AV13FacFirma = "" ;
      AV20FirmaLast = "" ;
      P09YQ8_A396EmprCod = new String[] {""} ;
      P09YQ8_A1153FacTipFac = new byte[1] ;
      P09YQ8_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P09YQ8_A9605FacFirma = new String[] {""} ;
      P09YQ8_A430FacCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.obtengocadenaparahashdocumentofactura__default(),
         new Object[] {
             new Object[] {
            P09YQ2_A7210FacObs, P09YQ2_A396EmprCod, P09YQ2_A430FacCod, P09YQ2_A436FacFch, P09YQ2_A14236FacSerAT, P09YQ2_A14237FacTipAT, P09YQ2_A2739FacSerNum, P09YQ2_A1153FacTipFac, P09YQ2_A9606FacHor, P09YQ2_A11513FacRecIca,
            P09YQ2_A8346FacRecI, P09YQ2_n8346FacRecI, P09YQ2_A7212FacRect, P09YQ2_A453FacRECPor, P09YQ2_A443FacIVAPor, P09YQ2_A14224FacCostFac, P09YQ2_A14223FacCostKgs, P09YQ2_A14222FacCostMts, P09YQ2_A434FacDtoPP, P09YQ2_A433FacDtoGen,
            P09YQ2_A14219FacEnergia
            }
            , new Object[] {
            P09YQ3_A7209Colombia, P09YQ3_n7209Colombia
            }
            , new Object[] {
            P09YQ5_A3918FacImpTot1
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P09YQ8_A396EmprCod, P09YQ8_A1153FacTipFac, P09YQ8_A436FacFch, P09YQ8_A9605FacFirma, P09YQ8_A430FacCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16FirmaD ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte AV19FacTipfac ;
   private short Gx_err ;
   private int AV10FacCod ;
   private int A430FacCod ;
   private long AV28Contval2 ;
   private long GXt_int3 ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private String A396EmprCod ;
   private String AV8texto ;
   private String AV9firma ;
   private String GXv_char4[] ;
   private String AV21ddmmaaaa ;
   private String GXt_char7 ;
   private String GXv_char5[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A14236FacSerAT ;
   private String A14237FacTipAT ;
   private String A2739FacSerNum ;
   private String AV17VarAux ;
   private String AV24HhSys ;
   private String AV27Invoicedt ;
   private String AV11DateAux ;
   private String AV12FacSerNum ;
   private String A9605FacFirma ;
   private String AV13FacFirma ;
   private String AV20FirmaLast ;
   private java.util.Date AV14FacHor ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV25FecHhSys ;
   private java.util.Date AV22FacFch ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV23FecSys ;
   private boolean returnInSub ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private String A7210FacObs ;
   private String[] aP4 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P09YQ2_A7210FacObs ;
   private String[] P09YQ2_A396EmprCod ;
   private int[] P09YQ2_A430FacCod ;
   private java.util.Date[] P09YQ2_A436FacFch ;
   private String[] P09YQ2_A14236FacSerAT ;
   private String[] P09YQ2_A14237FacTipAT ;
   private String[] P09YQ2_A2739FacSerNum ;
   private byte[] P09YQ2_A1153FacTipFac ;
   private java.util.Date[] P09YQ2_A9606FacHor ;
   private java.math.BigDecimal[] P09YQ2_A11513FacRecIca ;
   private java.math.BigDecimal[] P09YQ2_A8346FacRecI ;
   private boolean[] P09YQ2_n8346FacRecI ;
   private java.math.BigDecimal[] P09YQ2_A7212FacRect ;
   private java.math.BigDecimal[] P09YQ2_A453FacRECPor ;
   private byte[] P09YQ2_A443FacIVAPor ;
   private java.math.BigDecimal[] P09YQ2_A14224FacCostFac ;
   private java.math.BigDecimal[] P09YQ2_A14223FacCostKgs ;
   private java.math.BigDecimal[] P09YQ2_A14222FacCostMts ;
   private java.math.BigDecimal[] P09YQ2_A434FacDtoPP ;
   private java.math.BigDecimal[] P09YQ2_A433FacDtoGen ;
   private java.math.BigDecimal[] P09YQ2_A14219FacEnergia ;
   private byte[] P09YQ3_A7209Colombia ;
   private boolean[] P09YQ3_n7209Colombia ;
   private java.math.BigDecimal[] P09YQ5_A3918FacImpTot1 ;
   private String[] P09YQ8_A396EmprCod ;
   private byte[] P09YQ8_A1153FacTipFac ;
   private java.util.Date[] P09YQ8_A436FacFch ;
   private String[] P09YQ8_A9605FacFirma ;
   private int[] P09YQ8_A430FacCod ;
}

final  class obtengocadenaparahashdocumentofactura__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09YQ2", "SELECT FacObs, EmprCod, FacCod, FacFch, FacSerAT, FacTipAT, FacSerNum, FacTipFac, FacHor, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacObs, FacHor NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09YQ3", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09YQ5", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P09YQ6", "UPDATE TXPCFAVEN SET FacObs=?, FacHor=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new UpdateCursor("P09YQ7", "UPDATE TXPCFAVEN SET FacFirma=?  WHERE EmprCod = ? and FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P09YQ8", "SELECT EmprCod, FacTipFac, FacFch, FacFirma, FacCod FROM TXPCFAVEN WHERE (EmprCod = ?) AND (FacFch >= ?) AND (FacTipFac = ?) ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 200);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLongVarchar(1, (String)parms[0], false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 200);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

