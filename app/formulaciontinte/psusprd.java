package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psusprd extends GXProcedure
{
   public psusprd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psusprd.class ), "" );
   }

   public psusprd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        java.math.BigDecimal aP3 ,
                        String aP4 ,
                        String aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             java.math.BigDecimal aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      psusprd.this.A396EmprCod = aP0;
      psusprd.this.AV56PrdOrig = aP1;
      psusprd.this.AV57PrdSus = aP2;
      psusprd.this.AV18Factor = aP3;
      psusprd.this.AV65Usurcod = aP4;
      psusprd.this.AV63Station = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P002C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV57PrdSus});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P002C2_A719PrdNum[0] ;
         n719PrdNum = P002C2_n719PrdNum[0] ;
         A718PrdNom = P002C2_A718PrdNom[0] ;
         AV53PrdDesc = A718PrdNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV59Random = (int)(GXutil.random( )*10000) ;
      AV20Filename = "SustitucionProducto_" + GXutil.trim( AV56PrdOrig) + httpContext.getMessage( "por", "") + GXutil.trim( AV57PrdSus) + "_" + GXutil.trim( GXutil.str( AV59Random, 8, 0)) + ".csv" ;
      AV67TextFile.setSource( AV20Filename );
      AV67TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV67TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV70TextFileLine = httpContext.getMessage( "Cambio de Producto. Origen = ", "") + AV56PrdOrig + httpContext.getMessage( " Destino = ", "") + AV57PrdSus + httpContext.getMessage( " Factor = ", "") + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) ;
      if ( GXutil.len( AV70TextFileLine) > 0 )
      {
         AV67TextFile.writeLine(AV70TextFileLine);
      }
      AV70TextFileLine = httpContext.getMessage( "Tabla", "") + ";" + httpContext.getMessage( "N Formula/Proceso/NEnsayo/Clave", "") + ";" + httpContext.getMessage( "Producto Origen", "") + ";" + httpContext.getMessage( "Producto Destino", "") + ";" + httpContext.getMessage( "Factor", "") + ";" + httpContext.getMessage( "Cantidad Inicial", "") + ";" + httpContext.getMessage( "Cantidad Final", "") + ";" + httpContext.getMessage( "Registro", "") ;
      if ( GXutil.len( AV70TextFileLine) > 0 )
      {
         AV67TextFile.writeLine(AV70TextFileLine);
      }
      AV36Nregtos1 = 0 ;
      /* Optimized group. */
      /* Using cursor P002C3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV56PrdOrig});
      cV36Nregtos1 = P002C3_AV36Nregtos1[0] ;
      pr_default.close(1);
      AV36Nregtos1 = (int)(AV36Nregtos1+cV36Nregtos1*1) ;
      /* End optimized group. */
      AV45NrgtosLdform = 1 ;
      /* Using cursor P002C4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P002C4_A719PrdNum[0] ;
         n719PrdNum = P002C4_n719PrdNum[0] ;
         A481ForCan = P002C4_A481ForCan[0] ;
         A718PrdNom = P002C4_A718PrdNom[0] ;
         A309ColLin = P002C4_A309ColLin[0] ;
         A486ForNumCol = P002C4_A486ForNumCol[0] ;
         A718PrdNom = P002C4_A718PrdNom[0] ;
         AV21ForCan = A481ForCan ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A481ForCan = A481ForCan.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LDFORM", "") + ";" + GXutil.str( A486ForNumCol, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( AV21ForCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( A481ForCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV45NrgtosLdform, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV36Nregtos1, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV45NrgtosLdform = (int)(AV45NrgtosLdform+1) ;
         /* Using cursor P002C5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A481ForCan, A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A309ColLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLDFORM");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV37Nregtos2 = 0 ;
      /* Optimized group. */
      /* Using cursor P002C6 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV56PrdOrig});
      cV37Nregtos2 = P002C6_AV37Nregtos2[0] ;
      pr_default.close(4);
      AV37Nregtos2 = (int)(AV37Nregtos2+cV37Nregtos2*1) ;
      /* End optimized group. */
      AV46NrgtosLprfor = 1 ;
      /* Using cursor P002C7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A719PrdNum = P002C7_A719PrdNum[0] ;
         n719PrdNum = P002C7_n719PrdNum[0] ;
         A489ForPrdNor = P002C7_A489ForPrdNor[0] ;
         A487ForPrdCan = P002C7_A487ForPrdCan[0] ;
         A718PrdNom = P002C7_A718PrdNom[0] ;
         A715PrdLin = P002C7_A715PrdLin[0] ;
         A486ForNumCol = P002C7_A486ForNumCol[0] ;
         A718PrdNom = P002C7_A718PrdNom[0] ;
         AV23ForPrdCan = A487ForPrdCan ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A487ForPrdCan = A487ForPrdCan.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LPRFOR", "") + ";" + GXutil.str( A486ForNumCol, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV23ForPrdCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( A487ForPrdCan, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV46NrgtosLprfor, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV37Nregtos2, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV46NrgtosLprfor = (int)(AV46NrgtosLprfor+1) ;
         /* Using cursor P002C8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A487ForPrdCan, A396EmprCod, Integer.valueOf(A486ForNumCol), Short.valueOf(A715PrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRFOR");
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV38Nregtos3 = 0 ;
      /* Optimized group. */
      /* Using cursor P002C9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV56PrdOrig});
      cV38Nregtos3 = P002C9_AV38Nregtos3[0] ;
      pr_default.close(7);
      AV38Nregtos3 = (int)(AV38Nregtos3+cV38Nregtos3*1) ;
      /* End optimized group. */
      AV47NrgtosLprofo = 1 ;
      /* Using cursor P002C10 */
      pr_default.execute(8, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A770ProForPrd = P002C10_A770ProForPrd[0] ;
         A762ProForCan = P002C10_A762ProForCan[0] ;
         A763ProForCla = P002C10_A763ProForCla[0] ;
         A765ProForDes = P002C10_A765ProForDes[0] ;
         A767ProForLin = P002C10_A767ProForLin[0] ;
         A764ProForCod = P002C10_A764ProForCod[0] ;
         AV58ProForCan = A762ProForCan ;
         A770ProForPrd = AV57PrdSus ;
         if ( GXutil.strcmp(GXutil.substring( A763ProForCla, 1, 2), httpContext.getMessage( "AC", "")) != 0 )
         {
            A765ProForDes = AV53PrdDesc ;
         }
         A762ProForCan = A762ProForCan.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LPROFO", "") + ";" + GXutil.trim( A764ProForCod) + ";" + GXutil.trim( A770ProForPrd) + "-" + GXutil.trim( A765ProForDes) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV58ProForCan, 12, 5)) + ";" + GXutil.trim( GXutil.str( A762ProForCan, 12, 5)) + ";" + GXutil.trim( GXutil.str( AV47NrgtosLprofo, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV38Nregtos3, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV47NrgtosLprofo = (int)(AV47NrgtosLprofo+1) ;
         /* Using cursor P002C11 */
         pr_default.execute(9, new Object[] {A770ProForPrd, A762ProForCan, A765ProForDes, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV39Nregtos4 = 0 ;
      /* Optimized group. */
      /* Using cursor P002C12 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV56PrdOrig});
      cV39Nregtos4 = P002C12_AV39Nregtos4[0] ;
      pr_default.close(10);
      AV39Nregtos4 = (int)(AV39Nregtos4+cV39Nregtos4*1) ;
      /* End optimized group. */
      AV42NrgtosENS003 = 1 ;
      /* Using cursor P002C13 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A719PrdNum = P002C13_A719PrdNum[0] ;
         n719PrdNum = P002C13_n719PrdNum[0] ;
         A5558LB_CantC = P002C13_A5558LB_CantC[0] ;
         A718PrdNom = P002C13_A718PrdNom[0] ;
         A5532Lb_numero = P002C13_A5532Lb_numero[0] ;
         A5555Lb_opcion = P002C13_A5555Lb_opcion[0] ;
         A5557Lb_LineaC = P002C13_A5557Lb_LineaC[0] ;
         A718PrdNom = P002C13_A718PrdNom[0] ;
         AV27LB_CantC = A5558LB_CantC ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A5558LB_CantC = A5558LB_CantC.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LENS003", "") + ";" + GXutil.str( A5532Lb_numero, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV27LB_CantC, 11, 5)) + ";" + GXutil.trim( GXutil.str( A5558LB_CantC, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV42NrgtosENS003, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV39Nregtos4, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV42NrgtosENS003 = (int)(AV42NrgtosENS003+1) ;
         /* Using cursor P002C14 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A5558LB_CantC, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
         pr_default.readNext(11);
      }
      pr_default.close(11);
      AV40Nregtos5 = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P002C15 */
      pr_default.execute(13, new Object[] {A396EmprCod, AV56PrdOrig});
      cV40Nregtos5 = P002C15_AV40Nregtos5[0] ;
      pr_default.close(13);
      AV40Nregtos5 = AV40Nregtos5.add(cV40Nregtos5.multiply(DecimalUtil.doubleToDec(1))) ;
      /* End optimized group. */
      AV43NrgtosENS004 = 1 ;
      /* Using cursor P002C16 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A719PrdNum = P002C16_A719PrdNum[0] ;
         n719PrdNum = P002C16_n719PrdNum[0] ;
         A5561LB_CantP = P002C16_A5561LB_CantP[0] ;
         A718PrdNom = P002C16_A718PrdNom[0] ;
         A5532Lb_numero = P002C16_A5532Lb_numero[0] ;
         A5555Lb_opcion = P002C16_A5555Lb_opcion[0] ;
         A5560Lb_LineaPr = P002C16_A5560Lb_LineaPr[0] ;
         A718PrdNom = P002C16_A718PrdNom[0] ;
         AV28LB_CantP = A5561LB_CantP ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A5561LB_CantP = A5561LB_CantP.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LENS004", "") + ";" + GXutil.str( A5532Lb_numero, 8, 0) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV28LB_CantP, 11, 5)) + ";" + GXutil.trim( GXutil.str( A5561LB_CantP, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV43NrgtosENS004, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV40Nregtos5, 6, 2)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV43NrgtosENS004 = (int)(AV43NrgtosENS004+1) ;
         /* Using cursor P002C17 */
         pr_default.execute(15, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A5561LB_CantP, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         pr_default.readNext(14);
      }
      pr_default.close(14);
      AV41Nregtos6 = 0 ;
      /* Execute user subroutine: 'ENS007' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV49Num_e = 0 ;
      /* Optimized group. */
      /* Using cursor P002C18 */
      pr_default.execute(16, new Object[] {A396EmprCod, AV56PrdOrig});
      cV49Num_e = P002C18_AV49Num_e[0] ;
      pr_default.close(16);
      AV49Num_e = (int)(AV49Num_e+cV49Num_e*1) ;
      /* End optimized group. */
      AV60RecPrd2 = 1 ;
      /* Using cursor P002C19 */
      pr_default.execute(17, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A719PrdNum = P002C19_A719PrdNum[0] ;
         n719PrdNum = P002C19_n719PrdNum[0] ;
         A2116PrdForCan = P002C19_A2116PrdForCan[0] ;
         n2116PrdForCan = P002C19_n2116PrdForCan[0] ;
         A718PrdNom = P002C19_A718PrdNom[0] ;
         A2098MolCod = P002C19_A2098MolCod[0] ;
         A2078ColFon = P002C19_A2078ColFon[0] ;
         A2074ColCom = P002C19_A2074ColCom[0] ;
         A1014DibInt = P002C19_A1014DibInt[0] ;
         A1013DibCli = P002C19_A1013DibCli[0] ;
         A2141SerEst = P002C19_A2141SerEst[0] ;
         A252CliCod = P002C19_A252CliCod[0] ;
         A2535ForPrdLin = P002C19_A2535ForPrdLin[0] ;
         A718PrdNom = P002C19_A718PrdNom[0] ;
         AV54PrdForCan = A2116PrdForCan ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A2116PrdForCan = A2116PrdForCan.multiply(AV18Factor) ;
         n2116PrdForCan = false ;
         AV70TextFileLine = httpContext.getMessage( "RECPR2", "") + ";" + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A2141SerEst) + "-" + GXutil.trim( A1013DibCli) + "-" + GXutil.trim( GXutil.str( A1014DibInt, 8, 0)) + "-" + GXutil.trim( A2074ColCom) + "-" + GXutil.trim( A2078ColFon) + "-" + GXutil.trim( GXutil.str( A2098MolCod, 2, 0)) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( AV54PrdForCan, 10, 3)) + ";" + GXutil.trim( GXutil.str( A2116PrdForCan, 10, 3)) + ";" + GXutil.trim( GXutil.str( AV60RecPrd2, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV49Num_e, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV60RecPrd2 = (int)(AV60RecPrd2+1) ;
         /* Using cursor P002C20 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2116PrdForCan), A2116PrdForCan, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
         pr_default.readNext(17);
      }
      pr_default.close(17);
      AV50Num_p = 0 ;
      /* Optimized group. */
      /* Using cursor P002C21 */
      pr_default.execute(19, new Object[] {A396EmprCod, AV56PrdOrig});
      cV50Num_p = P002C21_AV50Num_p[0] ;
      pr_default.close(19);
      AV50Num_p = (int)(AV50Num_p+cV50Num_p*1) ;
      /* End optimized group. */
      AV31lpastas = 1 ;
      /* Using cursor P002C22 */
      pr_default.execute(20, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(20) != 101) )
      {
         A2105PasCanGrm = P002C22_A2105PasCanGrm[0] ;
         A719PrdNum = P002C22_A719PrdNum[0] ;
         n719PrdNum = P002C22_n719PrdNum[0] ;
         A13176PasOrder = P002C22_A13176PasOrder[0] ;
         n13176PasOrder = P002C22_n13176PasOrder[0] ;
         A7776PasCod_o = P002C22_A7776PasCod_o[0] ;
         n7776PasCod_o = P002C22_n7776PasCod_o[0] ;
         A2106PasCanPrd = P002C22_A2106PasCanPrd[0] ;
         n2106PasCanPrd = P002C22_n2106PasCanPrd[0] ;
         A2144UniEstCod = P002C22_A2144UniEstCod[0] ;
         n2144UniEstCod = P002C22_n2144UniEstCod[0] ;
         A2107PasCod = P002C22_A2107PasCod[0] ;
         A718PrdNom = P002C22_A718PrdNom[0] ;
         A718PrdNom = P002C22_A718PrdNom[0] ;
         W396EmprCod = A396EmprCod ;
         W719PrdNum = A719PrdNum ;
         n719PrdNum = false ;
         AV51PasCanPrd = A2106PasCanPrd ;
         /*
            INSERT RECORD ON TABLE TXPLPASTA

         */
         W396EmprCod = A396EmprCod ;
         W2107PasCod = A2107PasCod ;
         W719PrdNum = A719PrdNum ;
         n719PrdNum = false ;
         W2144UniEstCod = A2144UniEstCod ;
         n2144UniEstCod = false ;
         W2106PasCanPrd = A2106PasCanPrd ;
         n2106PasCanPrd = false ;
         W2105PasCanGrm = A2105PasCanGrm ;
         W7776PasCod_o = A7776PasCod_o ;
         n7776PasCod_o = false ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         n2144UniEstCod = false ;
         A2106PasCanPrd = A2106PasCanPrd.multiply(AV18Factor) ;
         n2106PasCanPrd = false ;
         A2105PasCanGrm = A2106PasCanPrd.multiply(DecimalUtil.doubleToDec(1000)) ;
         n7776PasCod_o = false ;
         /* Using cursor P002C23 */
         pr_default.execute(21, new Object[] {A396EmprCod, A2107PasCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, Boolean.valueOf(n2106PasCanPrd), A2106PasCanPrd, A2105PasCanGrm, Boolean.valueOf(n7776PasCod_o), A7776PasCod_o, Boolean.valueOf(n13176PasOrder), Short.valueOf(A13176PasOrder)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPASTA");
         if ( (pr_default.getStatus(21) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A2107PasCod = W2107PasCod ;
         A719PrdNum = W719PrdNum ;
         n719PrdNum = false ;
         A2144UniEstCod = W2144UniEstCod ;
         n2144UniEstCod = false ;
         A2106PasCanPrd = W2106PasCanPrd ;
         n2106PasCanPrd = false ;
         A2105PasCanGrm = W2105PasCanGrm ;
         A7776PasCod_o = W7776PasCod_o ;
         n7776PasCod_o = false ;
         /* End Insert */
         AV70TextFileLine = httpContext.getMessage( "Insert.LPASTAS", "") + ";" + GXutil.trim( A2107PasCod) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( AV51PasCanPrd, 9, 2)) + ";" + GXutil.trim( GXutil.str( A2106PasCanPrd, 9, 2)) + ";" + GXutil.trim( GXutil.str( AV31lpastas, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV50Num_p, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV31lpastas = (int)(AV31lpastas+1) ;
         A396EmprCod = W396EmprCod ;
         A719PrdNum = W719PrdNum ;
         n719PrdNum = false ;
         pr_default.readNext(20);
      }
      pr_default.close(20);
      AV31lpastas = 1 ;
      /* Using cursor P002C24 */
      pr_default.execute(22, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A719PrdNum = P002C24_A719PrdNum[0] ;
         n719PrdNum = P002C24_n719PrdNum[0] ;
         A2106PasCanPrd = P002C24_A2106PasCanPrd[0] ;
         n2106PasCanPrd = P002C24_n2106PasCanPrd[0] ;
         A718PrdNom = P002C24_A718PrdNom[0] ;
         A2107PasCod = P002C24_A2107PasCod[0] ;
         A718PrdNom = P002C24_A718PrdNom[0] ;
         /* Using cursor P002C25 */
         pr_default.execute(23, new Object[] {A396EmprCod, A2107PasCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPASTA");
         AV70TextFileLine = httpContext.getMessage( "Delete.LPASTAS", "") + ";" + GXutil.trim( A2107PasCod) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( A2106PasCanPrd, 9, 2)) + ";" + GXutil.trim( GXutil.str( A2106PasCanPrd, 9, 2)) + ";" + GXutil.trim( GXutil.str( AV31lpastas, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV50Num_p, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV31lpastas = (int)(AV31lpastas+1) ;
         pr_default.readNext(22);
      }
      pr_default.close(22);
      AV48Num_c = 0 ;
      /* Optimized group. */
      /* Using cursor P002C26 */
      pr_default.execute(24, new Object[] {A396EmprCod, AV56PrdOrig});
      cV48Num_c = P002C26_AV48Num_c[0] ;
      pr_default.close(24);
      AV48Num_c = (int)(AV48Num_c+cV48Num_c*1) ;
      /* End optimized group. */
      AV30Lestco = 1 ;
      /* Using cursor P002C27 */
      pr_default.execute(25, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(25) != 101) )
      {
         A719PrdNum = P002C27_A719PrdNum[0] ;
         n719PrdNum = P002C27_n719PrdNum[0] ;
         A4417EstColCnt = P002C27_A4417EstColCnt[0] ;
         A718PrdNom = P002C27_A718PrdNom[0] ;
         A4415EstCol = P002C27_A4415EstCol[0] ;
         A252CliCod = P002C27_A252CliCod[0] ;
         A4416EstColLin = P002C27_A4416EstColLin[0] ;
         A718PrdNom = P002C27_A718PrdNom[0] ;
         AV17EstColCnt = A4417EstColCnt ;
         AV70TextFileLine = httpContext.getMessage( "LESTCO", "") + ";" + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A4415EstCol) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.str( AV18Factor, 11, 5) + ";" + GXutil.trim( GXutil.str( AV17EstColCnt, 12, 5)) + ";" + GXutil.trim( GXutil.str( A4417EstColCnt, 12, 5)) + ";" + GXutil.trim( GXutil.str( AV30Lestco, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV48Num_c, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV30Lestco = (int)(AV30Lestco+1) ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A4417EstColCnt = A4417EstColCnt.multiply(AV18Factor) ;
         /* Using cursor P002C28 */
         pr_default.execute(26, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A4417EstColCnt, A396EmprCod, Integer.valueOf(A252CliCod), A4415EstCol, Short.valueOf(A4416EstColLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEstCo");
         pr_default.readNext(25);
      }
      pr_default.close(25);
      AV34MatPrd = (byte)(0) ;
      /* Using cursor P002C29 */
      pr_default.execute(27, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A8648Mat_PrdN = P002C29_A8648Mat_PrdN[0] ;
         A719PrdNum = P002C29_A719PrdNum[0] ;
         n719PrdNum = P002C29_n719PrdNum[0] ;
         A8650Mat_Cant = P002C29_A8650Mat_Cant[0] ;
         n8650Mat_Cant = P002C29_n8650Mat_Cant[0] ;
         AV33Mat_prdn = A8648Mat_PrdN ;
         AV55PrdNum = A719PrdNum ;
         AV32Mat_Cant = A8650Mat_Cant ;
         /* Using cursor P002C30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8648Mat_PrdN});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMATPRD");
         AV34MatPrd = (byte)(1) ;
         pr_default.readNext(27);
      }
      pr_default.close(27);
      if ( AV34MatPrd == 1 )
      {
         /*
            INSERT RECORD ON TABLE TXPMATPRD

         */
         A719PrdNum = AV55PrdNum ;
         n719PrdNum = false ;
         A8648Mat_PrdN = AV57PrdSus ;
         A8650Mat_Cant = AV32Mat_Cant.multiply(AV18Factor) ;
         n8650Mat_Cant = false ;
         /* Using cursor P002C31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A8648Mat_PrdN, Boolean.valueOf(n8650Mat_Cant), A8650Mat_Cant});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMATPRD");
         if ( (pr_default.getStatus(29) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      Gx_msg = httpContext.getMessage( "Proceso Finalizado", "") + GXutil.newLine( ) ;
      if ( AV36Nregtos1 > 0 )
      {
         AV45NrgtosLdform = (int)(AV45NrgtosLdform-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LDFORM. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV45NrgtosLdform, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV36Nregtos1, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV37Nregtos2 > 0 )
      {
         AV46NrgtosLprfor = (int)(AV46NrgtosLprfor-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LPRFOR. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV46NrgtosLprfor, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV37Nregtos2, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV38Nregtos3 > 0 )
      {
         AV47NrgtosLprofo = (int)(AV47NrgtosLprofo-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LPROFO. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV47NrgtosLprofo, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV38Nregtos3, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV39Nregtos4 > 0 )
      {
         AV42NrgtosENS003 = (int)(AV42NrgtosENS003-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LENS003. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV42NrgtosENS003, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV39Nregtos4, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV40Nregtos5.doubleValue() > 0 )
      {
         AV43NrgtosENS004 = (int)(AV43NrgtosENS004-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LENS004. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV43NrgtosENS004, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV40Nregtos5, 6, 2)) + GXutil.newLine( ) ;
      }
      if ( AV41Nregtos6 > 0 )
      {
         AV44NrgtosENS007 = (int)(AV44NrgtosENS007-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LENS007. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV44NrgtosENS007, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV41Nregtos6, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV49Num_e > 0 )
      {
         AV60RecPrd2 = (int)(AV60RecPrd2-1) ;
         Gx_msg += httpContext.getMessage( "Tabla RECPRD2. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV60RecPrd2, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV49Num_e, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV50Num_p > 0 )
      {
         AV31lpastas = (int)(AV31lpastas-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LPASTAS. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV31lpastas, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV50Num_p, 6, 0)) + GXutil.newLine( ) ;
      }
      if ( AV48Num_c > 0 )
      {
         AV30Lestco = (int)(AV30Lestco-1) ;
         Gx_msg += httpContext.getMessage( "Tabla LESTCO. Registros actualizados ", "") + GXutil.trim( GXutil.str( AV30Lestco, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV48Num_c, 6, 0)) + GXutil.newLine( ) ;
      }
      httpContext.GX_msglist.addItem(Gx_msg);
      AV67TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV67TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV69HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV69HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoExportCSV.csv");
         }
         AV69HttpResponse.addFile(AV67TextFile.getAbsoluteName());
      }
      AV22Forlis = (byte)(0) ;
      /* Using cursor P002C32 */
      pr_default.execute(30, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A719PrdNum = P002C32_A719PrdNum[0] ;
         n719PrdNum = P002C32_n719PrdNum[0] ;
         A7799Sim_Fact = P002C32_A7799Sim_Fact[0] ;
         n7799Sim_Fact = P002C32_n7799Sim_Fact[0] ;
         A252CliCod = P002C32_A252CliCod[0] ;
         A494ForSer = P002C32_A494ForSer[0] ;
         A482ForColNom = P002C32_A482ForColNom[0] ;
         A483ForColNum = P002C32_A483ForColNum[0] ;
         A831TipColCod = P002C32_A831TipColCod[0] ;
         A7797Sim_lin = P002C32_A7797Sim_lin[0] ;
         AV22Forlis = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(30);
      }
      pr_default.close(30);
      cleanup();
   }

   public void S111( )
   {
      /* 'ENS007' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P002C33 */
      pr_default.execute(31, new Object[] {A396EmprCod, AV56PrdOrig});
      cV41Nregtos6 = P002C33_AV41Nregtos6[0] ;
      pr_default.close(31);
      AV41Nregtos6 = (int)(AV41Nregtos6+cV41Nregtos6*1) ;
      /* End optimized group. */
      AV44NrgtosENS007 = 1 ;
      /* Using cursor P002C34 */
      pr_default.execute(32, new Object[] {A396EmprCod, AV56PrdOrig});
      while ( (pr_default.getStatus(32) != 101) )
      {
         A719PrdNum = P002C34_A719PrdNum[0] ;
         n719PrdNum = P002C34_n719PrdNum[0] ;
         A6316Lb_TaAuxCt = P002C34_A6316Lb_TaAuxCt[0] ;
         A718PrdNom = P002C34_A718PrdNom[0] ;
         A6310Lb_TaAuxC = P002C34_A6310Lb_TaAuxC[0] ;
         A6313lb_TaAuxL = P002C34_A6313lb_TaAuxL[0] ;
         A6378Lb_TauxLP = P002C34_A6378Lb_TauxLP[0] ;
         A718PrdNom = P002C34_A718PrdNom[0] ;
         AV29Lb_TaAuxCt = A6316Lb_TaAuxCt ;
         A719PrdNum = AV57PrdSus ;
         n719PrdNum = false ;
         A6316Lb_TaAuxCt = A6316Lb_TaAuxCt.multiply(AV18Factor) ;
         AV70TextFileLine = httpContext.getMessage( "LENS007", "") + ";" + GXutil.trim( A6310Lb_TaAuxC) + ";" + GXutil.trim( A719PrdNum) + "-" + GXutil.trim( A718PrdNom) + ";" + GXutil.trim( AV57PrdSus) + "-" + GXutil.trim( AV53PrdDesc) + ";" + GXutil.trim( GXutil.str( AV18Factor, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV29Lb_TaAuxCt, 11, 5)) + ";" + GXutil.trim( GXutil.str( A6316Lb_TaAuxCt, 11, 5)) + ";" + GXutil.trim( GXutil.str( AV44NrgtosENS007, 6, 0)) + httpContext.getMessage( " de ", "") + GXutil.trim( GXutil.str( AV41Nregtos6, 6, 0)) ;
         if ( GXutil.len( AV70TextFileLine) > 0 )
         {
            AV67TextFile.writeLine(AV70TextFileLine);
         }
         AV44NrgtosENS007 = (int)(AV44NrgtosENS007+1) ;
         /* Using cursor P002C35 */
         pr_default.execute(33, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A6316Lb_TaAuxCt, A396EmprCod, A6310Lb_TaAuxC, Short.valueOf(A6313lb_TaAuxL), Short.valueOf(A6378Lb_TauxLP)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS007");
         pr_default.readNext(32);
      }
      pr_default.close(32);
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV67TextFile.getErrCode() != 0 )
      {
         AV20Filename = "" ;
         AV68ErrorMessage = AV67TextFile.getErrDescription() ;
         AV67TextFile.close();
         AV69HttpResponse.addString(AV68ErrorMessage);
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.psusprd");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P002C2_A396EmprCod = new String[] {""} ;
      P002C2_A719PrdNum = new String[] {""} ;
      P002C2_n719PrdNum = new boolean[] {false} ;
      P002C2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV53PrdDesc = "" ;
      AV20Filename = "" ;
      AV67TextFile = new com.genexus.util.GXFile();
      AV70TextFileLine = "" ;
      P002C3_AV36Nregtos1 = new int[1] ;
      P002C4_A396EmprCod = new String[] {""} ;
      P002C4_A719PrdNum = new String[] {""} ;
      P002C4_n719PrdNum = new boolean[] {false} ;
      P002C4_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C4_A718PrdNom = new String[] {""} ;
      P002C4_A309ColLin = new short[1] ;
      P002C4_A486ForNumCol = new int[1] ;
      A481ForCan = DecimalUtil.ZERO ;
      AV21ForCan = DecimalUtil.ZERO ;
      P002C6_AV37Nregtos2 = new int[1] ;
      P002C7_A396EmprCod = new String[] {""} ;
      P002C7_A719PrdNum = new String[] {""} ;
      P002C7_n719PrdNum = new boolean[] {false} ;
      P002C7_A489ForPrdNor = new short[1] ;
      P002C7_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C7_A718PrdNom = new String[] {""} ;
      P002C7_A715PrdLin = new short[1] ;
      P002C7_A486ForNumCol = new int[1] ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      AV23ForPrdCan = DecimalUtil.ZERO ;
      P002C9_AV38Nregtos3 = new int[1] ;
      P002C10_A396EmprCod = new String[] {""} ;
      P002C10_A770ProForPrd = new String[] {""} ;
      P002C10_A762ProForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C10_A763ProForCla = new String[] {""} ;
      P002C10_A765ProForDes = new String[] {""} ;
      P002C10_A767ProForLin = new short[1] ;
      P002C10_A764ProForCod = new String[] {""} ;
      A770ProForPrd = "" ;
      A762ProForCan = DecimalUtil.ZERO ;
      A763ProForCla = "" ;
      A765ProForDes = "" ;
      A764ProForCod = "" ;
      AV58ProForCan = DecimalUtil.ZERO ;
      P002C12_AV39Nregtos4 = new int[1] ;
      P002C13_A396EmprCod = new String[] {""} ;
      P002C13_A719PrdNum = new String[] {""} ;
      P002C13_n719PrdNum = new boolean[] {false} ;
      P002C13_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C13_A718PrdNom = new String[] {""} ;
      P002C13_A5532Lb_numero = new int[1] ;
      P002C13_A5555Lb_opcion = new String[] {""} ;
      P002C13_A5557Lb_LineaC = new short[1] ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      AV27LB_CantC = DecimalUtil.ZERO ;
      AV40Nregtos5 = DecimalUtil.ZERO ;
      P002C15_AV40Nregtos5 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      cV40Nregtos5 = DecimalUtil.ZERO ;
      P002C16_A396EmprCod = new String[] {""} ;
      P002C16_A719PrdNum = new String[] {""} ;
      P002C16_n719PrdNum = new boolean[] {false} ;
      P002C16_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C16_A718PrdNom = new String[] {""} ;
      P002C16_A5532Lb_numero = new int[1] ;
      P002C16_A5555Lb_opcion = new String[] {""} ;
      P002C16_A5560Lb_LineaPr = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      AV28LB_CantP = DecimalUtil.ZERO ;
      P002C18_AV49Num_e = new int[1] ;
      P002C19_A396EmprCod = new String[] {""} ;
      P002C19_A719PrdNum = new String[] {""} ;
      P002C19_n719PrdNum = new boolean[] {false} ;
      P002C19_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C19_n2116PrdForCan = new boolean[] {false} ;
      P002C19_A718PrdNom = new String[] {""} ;
      P002C19_A2098MolCod = new byte[1] ;
      P002C19_A2078ColFon = new String[] {""} ;
      P002C19_A2074ColCom = new String[] {""} ;
      P002C19_A1014DibInt = new int[1] ;
      P002C19_A1013DibCli = new String[] {""} ;
      P002C19_A2141SerEst = new String[] {""} ;
      P002C19_A252CliCod = new int[1] ;
      P002C19_A2535ForPrdLin = new short[1] ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      AV54PrdForCan = DecimalUtil.ZERO ;
      P002C21_AV50Num_p = new int[1] ;
      P002C22_A396EmprCod = new String[] {""} ;
      P002C22_A2105PasCanGrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C22_A719PrdNum = new String[] {""} ;
      P002C22_n719PrdNum = new boolean[] {false} ;
      P002C22_A13176PasOrder = new short[1] ;
      P002C22_n13176PasOrder = new boolean[] {false} ;
      P002C22_A7776PasCod_o = new String[] {""} ;
      P002C22_n7776PasCod_o = new boolean[] {false} ;
      P002C22_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C22_n2106PasCanPrd = new boolean[] {false} ;
      P002C22_A2144UniEstCod = new String[] {""} ;
      P002C22_n2144UniEstCod = new boolean[] {false} ;
      P002C22_A2107PasCod = new String[] {""} ;
      P002C22_A718PrdNom = new String[] {""} ;
      A2105PasCanGrm = DecimalUtil.ZERO ;
      A7776PasCod_o = "" ;
      A2106PasCanPrd = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A2107PasCod = "" ;
      W396EmprCod = "" ;
      W719PrdNum = "" ;
      AV51PasCanPrd = DecimalUtil.ZERO ;
      W2107PasCod = "" ;
      W2144UniEstCod = "" ;
      W2106PasCanPrd = DecimalUtil.ZERO ;
      W2105PasCanGrm = DecimalUtil.ZERO ;
      W7776PasCod_o = "" ;
      Gx_emsg = "" ;
      P002C24_A396EmprCod = new String[] {""} ;
      P002C24_A719PrdNum = new String[] {""} ;
      P002C24_n719PrdNum = new boolean[] {false} ;
      P002C24_A2106PasCanPrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C24_n2106PasCanPrd = new boolean[] {false} ;
      P002C24_A718PrdNom = new String[] {""} ;
      P002C24_A2107PasCod = new String[] {""} ;
      P002C26_AV48Num_c = new int[1] ;
      P002C27_A396EmprCod = new String[] {""} ;
      P002C27_A719PrdNum = new String[] {""} ;
      P002C27_n719PrdNum = new boolean[] {false} ;
      P002C27_A4417EstColCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C27_A718PrdNom = new String[] {""} ;
      P002C27_A4415EstCol = new String[] {""} ;
      P002C27_A252CliCod = new int[1] ;
      P002C27_A4416EstColLin = new short[1] ;
      A4417EstColCnt = DecimalUtil.ZERO ;
      A4415EstCol = "" ;
      AV17EstColCnt = DecimalUtil.ZERO ;
      P002C29_A396EmprCod = new String[] {""} ;
      P002C29_A8648Mat_PrdN = new String[] {""} ;
      P002C29_A719PrdNum = new String[] {""} ;
      P002C29_n719PrdNum = new boolean[] {false} ;
      P002C29_A8650Mat_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C29_n8650Mat_Cant = new boolean[] {false} ;
      A8648Mat_PrdN = "" ;
      A8650Mat_Cant = DecimalUtil.ZERO ;
      AV33Mat_prdn = "" ;
      AV55PrdNum = "" ;
      AV32Mat_Cant = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV69HttpResponse = httpContext.getHttpResponse();
      P002C32_A396EmprCod = new String[] {""} ;
      P002C32_A719PrdNum = new String[] {""} ;
      P002C32_n719PrdNum = new boolean[] {false} ;
      P002C32_A7799Sim_Fact = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C32_n7799Sim_Fact = new boolean[] {false} ;
      P002C32_A252CliCod = new int[1] ;
      P002C32_A494ForSer = new String[] {""} ;
      P002C32_A482ForColNom = new String[] {""} ;
      P002C32_A483ForColNum = new int[1] ;
      P002C32_A831TipColCod = new byte[1] ;
      P002C32_A7797Sim_lin = new short[1] ;
      A7799Sim_Fact = DecimalUtil.ZERO ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P002C33_AV41Nregtos6 = new int[1] ;
      P002C34_A396EmprCod = new String[] {""} ;
      P002C34_A719PrdNum = new String[] {""} ;
      P002C34_n719PrdNum = new boolean[] {false} ;
      P002C34_A6316Lb_TaAuxCt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002C34_A718PrdNom = new String[] {""} ;
      P002C34_A6310Lb_TaAuxC = new String[] {""} ;
      P002C34_A6313lb_TaAuxL = new short[1] ;
      P002C34_A6378Lb_TauxLP = new short[1] ;
      A6316Lb_TaAuxCt = DecimalUtil.ZERO ;
      A6310Lb_TaAuxC = "" ;
      AV29Lb_TaAuxCt = DecimalUtil.ZERO ;
      AV68ErrorMessage = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.psusprd__default(),
         new Object[] {
             new Object[] {
            P002C2_A396EmprCod, P002C2_A719PrdNum, P002C2_A718PrdNom
            }
            , new Object[] {
            P002C3_AV36Nregtos1
            }
            , new Object[] {
            P002C4_A396EmprCod, P002C4_A719PrdNum, P002C4_A481ForCan, P002C4_A718PrdNom, P002C4_A309ColLin, P002C4_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            P002C6_AV37Nregtos2
            }
            , new Object[] {
            P002C7_A396EmprCod, P002C7_A719PrdNum, P002C7_A489ForPrdNor, P002C7_A487ForPrdCan, P002C7_A718PrdNom, P002C7_A715PrdLin, P002C7_A486ForNumCol
            }
            , new Object[] {
            }
            , new Object[] {
            P002C9_AV38Nregtos3
            }
            , new Object[] {
            P002C10_A396EmprCod, P002C10_A770ProForPrd, P002C10_A762ProForCan, P002C10_A763ProForCla, P002C10_A765ProForDes, P002C10_A767ProForLin, P002C10_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            P002C12_AV39Nregtos4
            }
            , new Object[] {
            P002C13_A396EmprCod, P002C13_A719PrdNum, P002C13_A5558LB_CantC, P002C13_A718PrdNom, P002C13_A5532Lb_numero, P002C13_A5555Lb_opcion, P002C13_A5557Lb_LineaC
            }
            , new Object[] {
            }
            , new Object[] {
            P002C15_AV40Nregtos5
            }
            , new Object[] {
            P002C16_A396EmprCod, P002C16_A719PrdNum, P002C16_A5561LB_CantP, P002C16_A718PrdNom, P002C16_A5532Lb_numero, P002C16_A5555Lb_opcion, P002C16_A5560Lb_LineaPr
            }
            , new Object[] {
            }
            , new Object[] {
            P002C18_AV49Num_e
            }
            , new Object[] {
            P002C19_A396EmprCod, P002C19_A719PrdNum, P002C19_n719PrdNum, P002C19_A2116PrdForCan, P002C19_n2116PrdForCan, P002C19_A718PrdNom, P002C19_A2098MolCod, P002C19_A2078ColFon, P002C19_A2074ColCom, P002C19_A1014DibInt,
            P002C19_A1013DibCli, P002C19_A2141SerEst, P002C19_A252CliCod, P002C19_A2535ForPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P002C21_AV50Num_p
            }
            , new Object[] {
            P002C22_A396EmprCod, P002C22_A2105PasCanGrm, P002C22_A719PrdNum, P002C22_A13176PasOrder, P002C22_n13176PasOrder, P002C22_A7776PasCod_o, P002C22_n7776PasCod_o, P002C22_A2106PasCanPrd, P002C22_n2106PasCanPrd, P002C22_A2144UniEstCod,
            P002C22_n2144UniEstCod, P002C22_A2107PasCod, P002C22_A718PrdNom
            }
            , new Object[] {
            }
            , new Object[] {
            P002C24_A396EmprCod, P002C24_A719PrdNum, P002C24_A2106PasCanPrd, P002C24_n2106PasCanPrd, P002C24_A718PrdNom, P002C24_A2107PasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P002C26_AV48Num_c
            }
            , new Object[] {
            P002C27_A396EmprCod, P002C27_A719PrdNum, P002C27_A4417EstColCnt, P002C27_A718PrdNom, P002C27_A4415EstCol, P002C27_A252CliCod, P002C27_A4416EstColLin
            }
            , new Object[] {
            }
            , new Object[] {
            P002C29_A396EmprCod, P002C29_A8648Mat_PrdN, P002C29_A719PrdNum, P002C29_A8650Mat_Cant, P002C29_n8650Mat_Cant
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P002C32_A396EmprCod, P002C32_A719PrdNum, P002C32_n719PrdNum, P002C32_A7799Sim_Fact, P002C32_n7799Sim_Fact, P002C32_A252CliCod, P002C32_A494ForSer, P002C32_A482ForColNom, P002C32_A483ForColNum, P002C32_A831TipColCod,
            P002C32_A7797Sim_lin
            }
            , new Object[] {
            P002C33_AV41Nregtos6
            }
            , new Object[] {
            P002C34_A396EmprCod, P002C34_A719PrdNum, P002C34_A6316Lb_TaAuxCt, P002C34_A718PrdNom, P002C34_A6310Lb_TaAuxC, P002C34_A6313lb_TaAuxL, P002C34_A6378Lb_TauxLP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private byte AV34MatPrd ;
   private byte AV22Forlis ;
   private byte A831TipColCod ;
   private short A309ColLin ;
   private short A489ForPrdNor ;
   private short A715PrdLin ;
   private short A767ProForLin ;
   private short A5557Lb_LineaC ;
   private short A5560Lb_LineaPr ;
   private short A2535ForPrdLin ;
   private short A13176PasOrder ;
   private short Gx_err ;
   private short A4416EstColLin ;
   private short A7797Sim_lin ;
   private short A6313lb_TaAuxL ;
   private short A6378Lb_TauxLP ;
   private int AV59Random ;
   private int AV36Nregtos1 ;
   private int cV36Nregtos1 ;
   private int AV45NrgtosLdform ;
   private int A486ForNumCol ;
   private int AV37Nregtos2 ;
   private int cV37Nregtos2 ;
   private int AV46NrgtosLprfor ;
   private int AV38Nregtos3 ;
   private int cV38Nregtos3 ;
   private int AV47NrgtosLprofo ;
   private int AV39Nregtos4 ;
   private int cV39Nregtos4 ;
   private int AV42NrgtosENS003 ;
   private int A5532Lb_numero ;
   private int AV43NrgtosENS004 ;
   private int AV41Nregtos6 ;
   private int AV49Num_e ;
   private int cV49Num_e ;
   private int AV60RecPrd2 ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int AV50Num_p ;
   private int cV50Num_p ;
   private int AV31lpastas ;
   private int GX_INS583 ;
   private int AV48Num_c ;
   private int cV48Num_c ;
   private int AV30Lestco ;
   private int GX_INS1183 ;
   private int AV44NrgtosENS007 ;
   private int A483ForColNum ;
   private int cV41Nregtos6 ;
   private java.math.BigDecimal AV18Factor ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV21ForCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV23ForPrdCan ;
   private java.math.BigDecimal A762ProForCan ;
   private java.math.BigDecimal AV58ProForCan ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal AV27LB_CantC ;
   private java.math.BigDecimal AV40Nregtos5 ;
   private java.math.BigDecimal cV40Nregtos5 ;
   private java.math.BigDecimal A5561LB_CantP ;
   private java.math.BigDecimal AV28LB_CantP ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal AV54PrdForCan ;
   private java.math.BigDecimal A2105PasCanGrm ;
   private java.math.BigDecimal A2106PasCanPrd ;
   private java.math.BigDecimal AV51PasCanPrd ;
   private java.math.BigDecimal W2106PasCanPrd ;
   private java.math.BigDecimal W2105PasCanGrm ;
   private java.math.BigDecimal A4417EstColCnt ;
   private java.math.BigDecimal AV17EstColCnt ;
   private java.math.BigDecimal A8650Mat_Cant ;
   private java.math.BigDecimal AV32Mat_Cant ;
   private java.math.BigDecimal A7799Sim_Fact ;
   private java.math.BigDecimal A6316Lb_TaAuxCt ;
   private java.math.BigDecimal AV29Lb_TaAuxCt ;
   private String A396EmprCod ;
   private String AV56PrdOrig ;
   private String AV57PrdSus ;
   private String AV65Usurcod ;
   private String AV63Station ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV53PrdDesc ;
   private String A770ProForPrd ;
   private String A763ProForCla ;
   private String A765ProForDes ;
   private String A764ProForCod ;
   private String A5555Lb_opcion ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String A7776PasCod_o ;
   private String A2144UniEstCod ;
   private String A2107PasCod ;
   private String W396EmprCod ;
   private String W719PrdNum ;
   private String W2107PasCod ;
   private String W2144UniEstCod ;
   private String W7776PasCod_o ;
   private String Gx_emsg ;
   private String A4415EstCol ;
   private String A8648Mat_PrdN ;
   private String AV33Mat_prdn ;
   private String AV55PrdNum ;
   private String Gx_msg ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A6310Lb_TaAuxC ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean n2116PrdForCan ;
   private boolean n13176PasOrder ;
   private boolean n7776PasCod_o ;
   private boolean n2106PasCanPrd ;
   private boolean n2144UniEstCod ;
   private boolean n8650Mat_Cant ;
   private boolean n7799Sim_Fact ;
   private String AV70TextFileLine ;
   private String AV20Filename ;
   private String AV68ErrorMessage ;
   private com.genexus.util.GXFile AV67TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P002C2_A396EmprCod ;
   private String[] P002C2_A719PrdNum ;
   private boolean[] P002C2_n719PrdNum ;
   private String[] P002C2_A718PrdNom ;
   private int[] P002C3_AV36Nregtos1 ;
   private String[] P002C4_A396EmprCod ;
   private String[] P002C4_A719PrdNum ;
   private boolean[] P002C4_n719PrdNum ;
   private java.math.BigDecimal[] P002C4_A481ForCan ;
   private String[] P002C4_A718PrdNom ;
   private short[] P002C4_A309ColLin ;
   private int[] P002C4_A486ForNumCol ;
   private int[] P002C6_AV37Nregtos2 ;
   private String[] P002C7_A396EmprCod ;
   private String[] P002C7_A719PrdNum ;
   private boolean[] P002C7_n719PrdNum ;
   private short[] P002C7_A489ForPrdNor ;
   private java.math.BigDecimal[] P002C7_A487ForPrdCan ;
   private String[] P002C7_A718PrdNom ;
   private short[] P002C7_A715PrdLin ;
   private int[] P002C7_A486ForNumCol ;
   private int[] P002C9_AV38Nregtos3 ;
   private String[] P002C10_A396EmprCod ;
   private String[] P002C10_A770ProForPrd ;
   private java.math.BigDecimal[] P002C10_A762ProForCan ;
   private String[] P002C10_A763ProForCla ;
   private String[] P002C10_A765ProForDes ;
   private short[] P002C10_A767ProForLin ;
   private String[] P002C10_A764ProForCod ;
   private int[] P002C12_AV39Nregtos4 ;
   private String[] P002C13_A396EmprCod ;
   private String[] P002C13_A719PrdNum ;
   private boolean[] P002C13_n719PrdNum ;
   private java.math.BigDecimal[] P002C13_A5558LB_CantC ;
   private String[] P002C13_A718PrdNom ;
   private int[] P002C13_A5532Lb_numero ;
   private String[] P002C13_A5555Lb_opcion ;
   private short[] P002C13_A5557Lb_LineaC ;
   private java.math.BigDecimal[] P002C15_AV40Nregtos5 ;
   private String[] P002C16_A396EmprCod ;
   private String[] P002C16_A719PrdNum ;
   private boolean[] P002C16_n719PrdNum ;
   private java.math.BigDecimal[] P002C16_A5561LB_CantP ;
   private String[] P002C16_A718PrdNom ;
   private int[] P002C16_A5532Lb_numero ;
   private String[] P002C16_A5555Lb_opcion ;
   private short[] P002C16_A5560Lb_LineaPr ;
   private int[] P002C18_AV49Num_e ;
   private String[] P002C19_A396EmprCod ;
   private String[] P002C19_A719PrdNum ;
   private boolean[] P002C19_n719PrdNum ;
   private java.math.BigDecimal[] P002C19_A2116PrdForCan ;
   private boolean[] P002C19_n2116PrdForCan ;
   private String[] P002C19_A718PrdNom ;
   private byte[] P002C19_A2098MolCod ;
   private String[] P002C19_A2078ColFon ;
   private String[] P002C19_A2074ColCom ;
   private int[] P002C19_A1014DibInt ;
   private String[] P002C19_A1013DibCli ;
   private String[] P002C19_A2141SerEst ;
   private int[] P002C19_A252CliCod ;
   private short[] P002C19_A2535ForPrdLin ;
   private int[] P002C21_AV50Num_p ;
   private String[] P002C22_A396EmprCod ;
   private java.math.BigDecimal[] P002C22_A2105PasCanGrm ;
   private String[] P002C22_A719PrdNum ;
   private boolean[] P002C22_n719PrdNum ;
   private short[] P002C22_A13176PasOrder ;
   private boolean[] P002C22_n13176PasOrder ;
   private String[] P002C22_A7776PasCod_o ;
   private boolean[] P002C22_n7776PasCod_o ;
   private java.math.BigDecimal[] P002C22_A2106PasCanPrd ;
   private boolean[] P002C22_n2106PasCanPrd ;
   private String[] P002C22_A2144UniEstCod ;
   private boolean[] P002C22_n2144UniEstCod ;
   private String[] P002C22_A2107PasCod ;
   private String[] P002C22_A718PrdNom ;
   private String[] P002C24_A396EmprCod ;
   private String[] P002C24_A719PrdNum ;
   private boolean[] P002C24_n719PrdNum ;
   private java.math.BigDecimal[] P002C24_A2106PasCanPrd ;
   private boolean[] P002C24_n2106PasCanPrd ;
   private String[] P002C24_A718PrdNom ;
   private String[] P002C24_A2107PasCod ;
   private int[] P002C26_AV48Num_c ;
   private String[] P002C27_A396EmprCod ;
   private String[] P002C27_A719PrdNum ;
   private boolean[] P002C27_n719PrdNum ;
   private java.math.BigDecimal[] P002C27_A4417EstColCnt ;
   private String[] P002C27_A718PrdNom ;
   private String[] P002C27_A4415EstCol ;
   private int[] P002C27_A252CliCod ;
   private short[] P002C27_A4416EstColLin ;
   private String[] P002C29_A396EmprCod ;
   private String[] P002C29_A8648Mat_PrdN ;
   private String[] P002C29_A719PrdNum ;
   private boolean[] P002C29_n719PrdNum ;
   private java.math.BigDecimal[] P002C29_A8650Mat_Cant ;
   private boolean[] P002C29_n8650Mat_Cant ;
   private String[] P002C32_A396EmprCod ;
   private String[] P002C32_A719PrdNum ;
   private boolean[] P002C32_n719PrdNum ;
   private java.math.BigDecimal[] P002C32_A7799Sim_Fact ;
   private boolean[] P002C32_n7799Sim_Fact ;
   private int[] P002C32_A252CliCod ;
   private String[] P002C32_A494ForSer ;
   private String[] P002C32_A482ForColNom ;
   private int[] P002C32_A483ForColNum ;
   private byte[] P002C32_A831TipColCod ;
   private short[] P002C32_A7797Sim_lin ;
   private int[] P002C33_AV41Nregtos6 ;
   private String[] P002C34_A396EmprCod ;
   private String[] P002C34_A719PrdNum ;
   private boolean[] P002C34_n719PrdNum ;
   private java.math.BigDecimal[] P002C34_A6316Lb_TaAuxCt ;
   private String[] P002C34_A718PrdNom ;
   private String[] P002C34_A6310Lb_TaAuxC ;
   private short[] P002C34_A6313lb_TaAuxL ;
   private short[] P002C34_A6378Lb_TauxLP ;
   private com.genexus.internet.HttpResponse AV69HttpResponse ;
}

final  class psusprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002C2", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002C3", "SELECT COUNT(*) FROM TXPLDFORM WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C4", "SELECT T1.EmprCod, T1.PrdNum, T1.ForCan, T2.PrdNom, T1.ColLin, T1.ForNumCol FROM (TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C5", "UPDATE TXPLDFORM SET PrdNum=?, ForCan=?  WHERE EmprCod = ? AND ForNumCol = ? AND ColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLDFORM")
         ,new ForEachCursor("P002C6", "SELECT COUNT(*) FROM TXPLPRFOR WHERE (EmprCod = ?) AND (PrdNum = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C7", "SELECT T1.EmprCod, T1.PrdNum, T1.ForPrdNor, T1.ForPrdCan, T2.PrdNom, T1.PrdLin, T1.ForNumCol FROM (TXPLPRFOR T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdNum = ?) ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C8", "UPDATE TXPLPRFOR SET PrdNum=?, ForPrdCan=?  WHERE EmprCod = ? AND ForNumCol = ? AND PrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRFOR")
         ,new ForEachCursor("P002C9", "SELECT COUNT(*) FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForPrd = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C10", "SELECT EmprCod, ProForPrd, ProForCan, ProForCla, ProForDes, ProForLin, ProForCod FROM TXPLPROFO WHERE (EmprCod = ?) AND (ProForPrd = ?) ORDER BY EmprCod, ProForCod, ProForLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C11", "UPDATE TXPLPROFO SET ProForPrd=?, ProForCan=?, ProForDes=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
         ,new ForEachCursor("P002C12", "SELECT COUNT(*) FROM TXPENS003 WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C13", "SELECT T1.EmprCod, T1.PrdNum, T1.LB_CantC, T2.PrdNom, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaC FROM (TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C14", "UPDATE TXPENS003 SET PrdNum=?, LB_CantC=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new ForEachCursor("P002C15", "SELECT COUNT(*) FROM TXPENS004 WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C16", "SELECT T1.EmprCod, T1.PrdNum, T1.LB_CantP, T2.PrdNom, T1.Lb_numero, T1.Lb_opcion, T1.Lb_LineaPr FROM (TXPENS004 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C17", "UPDATE TXPENS004 SET PrdNum=?, LB_CantP=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaPr = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new ForEachCursor("P002C18", "SELECT COUNT(*) FROM TXPRECPR2 WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C19", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdForCan, T2.PrdNom, T1.MolCod, T1.ColFon, T1.ColCom, T1.DibInt, T1.DibCli, T1.SerEst, T1.CliCod, T1.ForPrdLin FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C20", "UPDATE TXPRECPR2 SET PrdNum=?, PrdForCan=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECPR2")
         ,new ForEachCursor("P002C21", "SELECT COUNT(*) FROM TXPLPASTA WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C22", "SELECT T1.EmprCod, T1.PasCanGrm, T1.PrdNum, T1.PasOrder, T1.PasCod_o, T1.PasCanPrd, T1.UniEstCod, T1.PasCod, T2.PrdNom FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C23", "INSERT INTO TXPLPASTA(EmprCod, PasCod, PrdNum, UniEstCod, PasCanPrd, PasCanGrm, PasCod_o, PasOrder) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPASTA")
         ,new ForEachCursor("P002C24", "SELECT T1.EmprCod, T1.PrdNum, T1.PasCanPrd, T2.PrdNom, T1.PasCod FROM (TXPLPASTA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C25", "DELETE FROM TXPLPASTA  WHERE EmprCod = ? AND PasCod = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPASTA")
         ,new ForEachCursor("P002C26", "SELECT COUNT(*) FROM TXPLEstCo WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C27", "SELECT T1.EmprCod, T1.PrdNum, T1.EstColCnt, T2.PrdNom, T1.EstCol, T1.CliCod, T1.EstColLin FROM (TXPLEstCo T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C28", "UPDATE TXPLEstCo SET PrdNum=?, EstColCnt=?  WHERE EmprCod = ? AND CliCod = ? AND EstCol = ? AND EstColLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEstCo")
         ,new ForEachCursor("P002C29", "SELECT EmprCod, Mat_PrdN, PrdNum, Mat_Cant FROM TXPMATPRD WHERE EmprCod = ? and Mat_PrdN = ? ORDER BY EmprCod, Mat_PrdN ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C30", "DELETE FROM TXPMATPRD  WHERE EmprCod = ? AND PrdNum = ? AND Mat_PrdN = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMATPRD")
         ,new UpdateCursor("P002C31", "INSERT INTO TXPMATPRD(EmprCod, PrdNum, Mat_PrdN, Mat_Cant) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMATPRD")
         ,new ForEachCursor("P002C32", "SELECT * FROM (SELECT EmprCod, PrdNum, Sim_Fact, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P002C33", "SELECT COUNT(*) FROM TXPENS007 WHERE EmprCod = ? and PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002C34", "SELECT T1.EmprCod, T1.PrdNum, T1.Lb_TaAuxCt, T2.PrdNom, T1.Lb_TaAuxC, T1.lb_TaAuxL, T1.Lb_TauxLP FROM (TXPENS007 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P002C35", "UPDATE TXPENS007 SET PrdNum=?, Lb_TaAuxCt=?  WHERE EmprCod = ? AND Lb_TaAuxC = ? AND lb_TaAuxL = ? AND Lb_TauxLP = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS007")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 12);
               ((String[]) buf[8])[0] = rslt.getString(7, 12);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 18 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setString(6, (String)parms[7], 16);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 12);
               stmt.setString(9, (String)parms[10], 12);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               }
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[12]).shortValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 20);
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               }
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 4);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

