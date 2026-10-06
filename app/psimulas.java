package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimulas extends GXProcedure
{
   public psimulas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimulas.class ), "" );
   }

   public psimulas( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            java.math.BigDecimal[] aP2 ,
                            byte[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            int[] aP5 ,
                            int[] aP6 ,
                            short[] aP7 ,
                            String[] aP8 ,
                            short[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 ,
                            short[] aP12 ,
                            java.math.BigDecimal[] aP13 ,
                            short[] aP14 )
   {
      psimulas.this.aP15 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        int[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             int[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 )
   {
      psimulas.this.AV40EmprCod = aP0[0];
      this.aP0 = aP0;
      psimulas.this.AV39PrdNum = aP1[0];
      this.aP1 = aP1;
      psimulas.this.AV41Cantidad = aP2[0];
      this.aP2 = aP2;
      psimulas.this.AV42UniMed = aP3[0];
      this.aP3 = aP3;
      psimulas.this.AV43TotKil = aP4[0];
      this.aP4 = aP4;
      psimulas.this.AV44Volumen = aP5[0];
      this.aP5 = aP5;
      psimulas.this.AV45ValCos = aP6[0];
      this.aP6 = aP6;
      psimulas.this.AV46LinRec = aP7[0];
      this.aP7 = aP7;
      psimulas.this.AV47Station = aP8[0];
      this.aP8 = aP8;
      psimulas.this.AV48UltRecLin = aP9[0];
      this.aP9 = aP9;
      psimulas.this.AV49FlagComp = aP10[0];
      this.aP10 = aP10;
      psimulas.this.AV51ProForCod = aP11[0];
      this.aP11 = aP11;
      psimulas.this.AV53ContLinea = aP12[0];
      this.aP12 = aP12;
      psimulas.this.AV54Incre = aP13[0];
      this.aP13 = aP13;
      psimulas.this.AV59EscMRb = aP14[0];
      this.aP14 = aP14;
      psimulas.this.AV73forprdnor = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV60F_precio2 = (byte)(0) ;
      GXv_int1[0] = AV60F_precio2 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "PRECI2", ""), GXv_int1) ;
      psimulas.this.AV60F_precio2 = GXv_int1[0] ;
      GXt_int2 = AV61Carvema ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      psimulas.this.GXt_int2 = GXv_int1[0] ;
      AV61Carvema = GXt_int2 ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV62CosAlt)) ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "COSALT", ""), GXv_int1) ;
      psimulas.this.AV62CosAlt = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      if ( AV62CosAlt.doubleValue() == 1 )
      {
         Gx_msg = httpContext.getMessage( "Costos Alternativos", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += "-------------------" + GXutil.chr( (short)(13)) ;
         AV63PrdNum1 = AV39PrdNum ;
         AV65Cantidad1 = AV41Cantidad ;
         if ( AV42UniMed == 3 )
         {
            AV50CanTeo = AV41Cantidad.multiply(AV43TotKil).multiply(DecimalUtil.doubleToDec(AV45ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV50CanTeo = AV41Cantidad.multiply(DecimalUtil.doubleToDec(AV44Volumen)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         Gx_msg += httpContext.getMessage( "Producto Original : ", "") + AV63PrdNum1 + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Cantidad Original : ", "") + GXutil.trim( GXutil.str( AV50CanTeo, 10, 5)) + GXutil.chr( (short)(13)) ;
         GXt_int3 = (int)(DecimalUtil.decToDouble(AV64Consumos)) ;
         GXv_int4[0] = GXt_int3 ;
         new app.pbuscon(remoteHandle, context).execute( AV40EmprCod, "011100", GXv_int4) ;
         psimulas.this.GXt_int3 = GXv_int4[0] ;
         AV64Consumos = DecimalUtil.doubleToDec(GXt_int3) ;
         Gx_msg += httpContext.getMessage( "Consumos : ", "") + ((AV64Consumos.doubleValue()==1) ? httpContext.getMessage( "Almacen", "") : httpContext.getMessage( "Cuarto de colores", "")) + GXutil.chr( (short)(13)) ;
         AV77GXLvl24 = (byte)(0) ;
         /* Using cursor P04J32 */
         pr_default.execute(0, new Object[] {AV40EmprCod, AV63PrdNum1, AV64Consumos, AV50CanTeo, AV64Consumos, AV50CanTeo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A704PrdExiAlm = P04J32_A704PrdExiAlm[0] ;
            A705PrdExiCC = P04J32_A705PrdExiCC[0] ;
            A856ValCod = P04J32_A856ValCod[0] ;
            A719PrdNum = P04J32_A719PrdNum[0] ;
            A396EmprCod = P04J32_A396EmprCod[0] ;
            AV77GXLvl24 = (byte)(1) ;
            Gx_msg += httpContext.getMessage( "Producto válido", "") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV77GXLvl24 == 0 )
         {
            Gx_msg += httpContext.getMessage( "Voy a Buscar Alternativos", "") + GXutil.chr( (short)(13)) ;
            /* Execute user subroutine: 'PRDALT' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( GXutil.strcmp(AV63PrdNum1, "107000") == 0 )
         {
         }
      }
      else
      {
         Gx_msg = httpContext.getMessage( "No hay Costos Alternativos", "") ;
      }
      /* Using cursor P04J33 */
      pr_default.execute(1, new Object[] {AV40EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P04J33_A396EmprCod[0] ;
         A3915EmpNumDec = P04J33_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P04J33_n3915EmpNumDec[0] ;
         AV55EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P04J34 */
      pr_default.execute(2, new Object[] {AV40EmprCod, AV39PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P04J34_A719PrdNum[0] ;
         A396EmprCod = P04J34_A396EmprCod[0] ;
         A707PrdFacCon = P04J34_A707PrdFacCon[0] ;
         A724PrdPreAct = P04J34_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P04J34_A5255PrdPreAc2[0] ;
         AV58PrdFacCon = A707PrdFacCon ;
         AV52PrdPreAct = A724PrdPreAct ;
         if ( ( AV60F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
         {
            AV52PrdPreAct = A5255PrdPreAc2 ;
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Incre)==0) )
         {
            if ( AV55EmpNumDec == 0 )
            {
               AV52PrdPreAct = GXutil.roundDecimal( A724PrdPreAct.add(((A724PrdPreAct.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 0) ;
               if ( ( AV60F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
               {
                  AV52PrdPreAct = GXutil.roundDecimal( A5255PrdPreAc2.add(((A5255PrdPreAc2.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 0) ;
               }
            }
            else
            {
               if ( AV55EmpNumDec == 2 )
               {
                  AV52PrdPreAct = GXutil.roundDecimal( A724PrdPreAct.add(((A724PrdPreAct.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
                  if ( ( AV60F_precio2 == 1 ) && ( A5255PrdPreAc2.doubleValue() > 0 ) )
                  {
                     AV52PrdPreAct = GXutil.roundDecimal( A5255PrdPreAc2.add(((A5255PrdPreAc2.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
                  }
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      if ( GXutil.strcmp(GXutil.substring( AV39PrdNum, 1, 1), "0") == 0 )
      {
         /* Using cursor P04J36 */
         pr_default.execute(3, new Object[] {AV40EmprCod, AV39PrdNum});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A688PrdComCod = P04J36_A688PrdComCod[0] ;
            A396EmprCod = P04J36_A396EmprCod[0] ;
            A1185PrdComPr = P04J36_A1185PrdComPr[0] ;
            n1185PrdComPr = P04J36_n1185PrdComPr[0] ;
            A1185PrdComPr = P04J36_A1185PrdComPr[0] ;
            n1185PrdComPr = P04J36_n1185PrdComPr[0] ;
            AV52PrdPreAct = A1185PrdComPr ;
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Incre)==0) )
            {
               if ( AV55EmpNumDec == 0 )
               {
                  AV52PrdPreAct = GXutil.roundDecimal( A1185PrdComPr.add(((A1185PrdComPr.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 0) ;
               }
               else
               {
                  if ( AV55EmpNumDec == 2 )
                  {
                     AV52PrdPreAct = GXutil.roundDecimal( A1185PrdComPr.add(((A1185PrdComPr.multiply(AV54Incre)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))), 3) ;
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      if ( (0==AV49FlagComp) )
      {
         AV48UltRecLin = (short)(AV46LinRec+1) ;
      }
      if ( AV42UniMed == 3 )
      {
         AV50CanTeo = AV41Cantidad.multiply(AV43TotKil).multiply(DecimalUtil.doubleToDec(AV45ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      else
      {
         AV50CanTeo = AV41Cantidad.multiply(DecimalUtil.doubleToDec(AV44Volumen)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      }
      AV46LinRec = (short)(AV46LinRec+1) ;
      System.out.println( httpContext.getMessage( "Insert ESCMAN", "") );
      /*
         INSERT RECORD ON TABLE TXPESCMAN

      */
      A396EmprCod = AV40EmprCod ;
      A910Workstat = GXutil.substring( AV47Station, 1, 10) ;
      A887EscMLin = AV46LinRec ;
      A719PrdNum = AV39PrdNum ;
      A764ProForCod = AV51ProForCod ;
      A897EscMDsc = GXutil.str( AV41Cantidad, 10, 4) ;
      if ( DecimalUtil.compareTo(AV41Cantidad, DecimalUtil.stringToDec("999999.99999")) > 0 )
      {
         A4712EscMFacCon = DecimalUtil.stringToDec("999999.99999") ;
      }
      else
      {
         A4712EscMFacCon = AV41Cantidad ;
      }
      if ( ( AV61Carvema == 1 ) && ( ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1  ", "")) == 0 ) || ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1D ", "")) == 0 ) ) )
      {
         A889EscMPrdPre = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         A889EscMPrdPre = AV52PrdPreAct ;
      }
      System.out.println( httpContext.getMessage( "1.Begin ORA-01438??", "") );
      if ( DecimalUtil.compareTo((AV50CanTeo.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("999999.9999")) > 0 )
      {
         A890EscMCan = DecimalUtil.stringToDec("999999.9999") ;
      }
      else
      {
         A890EscMCan = AV50CanTeo.multiply(DecimalUtil.doubleToDec(1000)) ;
      }
      if ( DecimalUtil.compareTo((AV50CanTeo.multiply(DecimalUtil.doubleToDec(1000))), DecimalUtil.stringToDec("9999999.999")) > 0 )
      {
         A10363EscMCant = DecimalUtil.stringToDec("9999999.999") ;
      }
      else
      {
         A10363EscMCant = AV50CanTeo.multiply(DecimalUtil.doubleToDec(1000)) ;
      }
      A490ForPrdUMe = AV42UniMed ;
      if ( ( AV61Carvema == 1 ) && ( ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1  ", "")) == 0 ) || ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1D ", "")) == 0 ) ) )
      {
         AV56EscMCos2 = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         AV56EscMCos2 = AV50CanTeo.multiply(AV52PrdPreAct).multiply(AV58PrdFacCon) ;
      }
      if ( DecimalUtil.compareTo(AV56EscMCos2, DecimalUtil.stringToDec("999999999.99999")) > 0 )
      {
         A891EscMCos = DecimalUtil.stringToDec("999999999.99999") ;
      }
      else
      {
         A891EscMCos = AV56EscMCos2 ;
      }
      System.out.println( httpContext.getMessage( "2.Begin ORA-01438??", "") );
      if ( AV59EscMRb > 9999 )
      {
         A4713EscMRb = (short)(9999) ;
      }
      else
      {
         A4713EscMRb = AV59EscMRb ;
      }
      if ( DecimalUtil.compareTo(AV41Cantidad, DecimalUtil.stringToDec("999999.99999")) > 0 )
      {
         A4712EscMFacCon = DecimalUtil.stringToDec("999999.99999") ;
      }
      else
      {
         A4712EscMFacCon = AV41Cantidad ;
      }
      A6060EscSol = AV44Volumen ;
      A7584EscVolm = AV44Volumen ;
      A7583EscOrdn = AV73forprdnor ;
      System.out.println( httpContext.getMessage( "3.Begin ORA-01438??", "") );
      /* Using cursor P04J37 */
      pr_default.execute(4, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin), A719PrdNum, A764ProForCod, A897EscMDsc, A889EscMPrdPre, A890EscMCan, Byte.valueOf(A490ForPrdUMe), A891EscMCos, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Short.valueOf(A7583EscOrdn), Integer.valueOf(A7584EscVolm), A10363EscMCant});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPESCMAN");
      if ( (pr_default.getStatus(4) == 1) )
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
      cleanup();
   }

   public void S111( )
   {
      /* 'PRDALT' Routine */
      returnInSub = false ;
      AV81GXLvl205 = (byte)(0) ;
      /* Using cursor P04J38 */
      pr_default.execute(5, new Object[] {AV40EmprCod, AV63PrdNum1});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A719PrdNum = P04J38_A719PrdNum[0] ;
         A396EmprCod = P04J38_A396EmprCod[0] ;
         A680PrdAltNum = P04J38_A680PrdAltNum[0] ;
         A678PrdAltFac = P04J38_A678PrdAltFac[0] ;
         AV81GXLvl205 = (byte)(1) ;
         AV66PrdNum2 = A680PrdAltNum ;
         AV67PrdAltFac = A678PrdAltFac ;
         if ( AV42UniMed == 3 )
         {
            AV50CanTeo = AV65Cantidad1.multiply(AV67PrdAltFac).multiply(AV43TotKil).multiply(DecimalUtil.doubleToDec(AV45ValCos)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV50CanTeo = AV65Cantidad1.multiply(AV67PrdAltFac).multiply(DecimalUtil.doubleToDec(AV44Volumen)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         }
         Gx_msg += "================================" + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Producto Alternativo : ", "") + AV66PrdNum2 + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Factor Alternativo : ", "") + GXutil.trim( GXutil.str( AV67PrdAltFac, 10, 5)) + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Cantidad Alternativo : ", "") + GXutil.trim( GXutil.str( AV50CanTeo, 10, 5)) + GXutil.chr( (short)(13)) ;
         /* Execute user subroutine: 'PRDALT1' */
         S127 ();
         if ( returnInSub )
         {
            pr_default.close(5);
            returnInSub = true;
            if (true) return;
         }
         if ( AV68OkAlt.doubleValue() == 1 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV81GXLvl205 == 0 )
      {
         Gx_msg += httpContext.getMessage( "No hay Alternativos", "") ;
      }
   }

   public void S127( )
   {
      /* 'PRDALT1' Routine */
      returnInSub = false ;
      AV68OkAlt = DecimalUtil.doubleToDec(0) ;
      AV82GXLvl232 = (byte)(0) ;
      /* Using cursor P04J39 */
      pr_default.execute(6, new Object[] {AV40EmprCod, AV66PrdNum2, AV64Consumos, AV50CanTeo, AV67PrdAltFac, AV64Consumos, AV50CanTeo, AV67PrdAltFac});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A704PrdExiAlm = P04J39_A704PrdExiAlm[0] ;
         A685PrdCanRes = P04J39_A685PrdCanRes[0] ;
         A705PrdExiCC = P04J39_A705PrdExiCC[0] ;
         A856ValCod = P04J39_A856ValCod[0] ;
         A719PrdNum = P04J39_A719PrdNum[0] ;
         A396EmprCod = P04J39_A396EmprCod[0] ;
         AV82GXLvl232 = (byte)(1) ;
         AV39PrdNum = A719PrdNum ;
         AV41Cantidad = AV65Cantidad1.multiply(AV67PrdAltFac) ;
         Gx_msg += httpContext.getMessage( "Resultado", "") + GXutil.chr( (short)(13)) ;
         Gx_msg += "---------" + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Producto Alternativo : ", "") + AV39PrdNum + GXutil.chr( (short)(13)) ;
         Gx_msg += httpContext.getMessage( "Unidades Alternativo : ", "") + GXutil.trim( GXutil.str( AV41Cantidad, 10, 5)) + GXutil.chr( (short)(13)) ;
         AV68OkAlt = DecimalUtil.doubleToDec(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      if ( AV82GXLvl232 == 0 )
      {
         Gx_msg += httpContext.getMessage( "Producto inválido", "") + GXutil.chr( (short)(13)) ;
      }
   }

   public void S131( )
   {
      /* 'LOGGEO' Routine */
      returnInSub = false ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimulas.this.AV40EmprCod;
      this.aP1[0] = psimulas.this.AV39PrdNum;
      this.aP2[0] = psimulas.this.AV41Cantidad;
      this.aP3[0] = psimulas.this.AV42UniMed;
      this.aP4[0] = psimulas.this.AV43TotKil;
      this.aP5[0] = psimulas.this.AV44Volumen;
      this.aP6[0] = psimulas.this.AV45ValCos;
      this.aP7[0] = psimulas.this.AV46LinRec;
      this.aP8[0] = psimulas.this.AV47Station;
      this.aP9[0] = psimulas.this.AV48UltRecLin;
      this.aP10[0] = psimulas.this.AV49FlagComp;
      this.aP11[0] = psimulas.this.AV51ProForCod;
      this.aP12[0] = psimulas.this.AV53ContLinea;
      this.aP13[0] = psimulas.this.AV54Incre;
      this.aP14[0] = psimulas.this.AV59EscMRb;
      this.aP15[0] = psimulas.this.AV73forprdnor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62CosAlt = DecimalUtil.ZERO ;
      GXv_int1 = new byte[1] ;
      Gx_msg = "" ;
      AV63PrdNum1 = "" ;
      AV65Cantidad1 = DecimalUtil.ZERO ;
      AV50CanTeo = DecimalUtil.ZERO ;
      AV64Consumos = DecimalUtil.ZERO ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P04J32_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J32_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J32_A856ValCod = new byte[1] ;
      P04J32_A719PrdNum = new String[] {""} ;
      P04J32_A396EmprCod = new String[] {""} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      P04J33_A396EmprCod = new String[] {""} ;
      P04J33_A3915EmpNumDec = new byte[1] ;
      P04J33_n3915EmpNumDec = new boolean[] {false} ;
      P04J34_A719PrdNum = new String[] {""} ;
      P04J34_A396EmprCod = new String[] {""} ;
      P04J34_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J34_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J34_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      AV58PrdFacCon = DecimalUtil.ZERO ;
      AV52PrdPreAct = DecimalUtil.ZERO ;
      P04J36_A688PrdComCod = new String[] {""} ;
      P04J36_A396EmprCod = new String[] {""} ;
      P04J36_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J36_n1185PrdComPr = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A1185PrdComPr = DecimalUtil.ZERO ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A897EscMDsc = "" ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A10363EscMCant = DecimalUtil.ZERO ;
      AV56EscMCos2 = DecimalUtil.ZERO ;
      A891EscMCos = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      P04J38_A719PrdNum = new String[] {""} ;
      P04J38_A396EmprCod = new String[] {""} ;
      P04J38_A680PrdAltNum = new String[] {""} ;
      P04J38_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV66PrdNum2 = "" ;
      AV67PrdAltFac = DecimalUtil.ZERO ;
      AV68OkAlt = DecimalUtil.ZERO ;
      P04J39_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J39_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J39_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04J39_A856ValCod = new byte[1] ;
      P04J39_A719PrdNum = new String[] {""} ;
      P04J39_A396EmprCod = new String[] {""} ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimulas__default(),
         new Object[] {
             new Object[] {
            P04J32_A704PrdExiAlm, P04J32_A705PrdExiCC, P04J32_A856ValCod, P04J32_A719PrdNum, P04J32_A396EmprCod
            }
            , new Object[] {
            P04J33_A396EmprCod, P04J33_A3915EmpNumDec, P04J33_n3915EmpNumDec
            }
            , new Object[] {
            P04J34_A719PrdNum, P04J34_A396EmprCod, P04J34_A707PrdFacCon, P04J34_A724PrdPreAct, P04J34_A5255PrdPreAc2
            }
            , new Object[] {
            P04J36_A688PrdComCod, P04J36_A396EmprCod, P04J36_A1185PrdComPr, P04J36_n1185PrdComPr
            }
            , new Object[] {
            }
            , new Object[] {
            P04J38_A719PrdNum, P04J38_A396EmprCod, P04J38_A680PrdAltNum, P04J38_A678PrdAltFac
            }
            , new Object[] {
            P04J39_A704PrdExiAlm, P04J39_A685PrdCanRes, P04J39_A705PrdExiCC, P04J39_A856ValCod, P04J39_A719PrdNum, P04J39_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42UniMed ;
   private byte AV49FlagComp ;
   private byte AV60F_precio2 ;
   private byte AV61Carvema ;
   private byte GXt_int2 ;
   private byte GXv_int1[] ;
   private byte AV77GXLvl24 ;
   private byte A856ValCod ;
   private byte A3915EmpNumDec ;
   private byte AV55EmpNumDec ;
   private byte A490ForPrdUMe ;
   private byte AV81GXLvl205 ;
   private byte AV82GXLvl232 ;
   private short AV46LinRec ;
   private short AV48UltRecLin ;
   private short AV53ContLinea ;
   private short AV59EscMRb ;
   private short AV73forprdnor ;
   private short A4713EscMRb ;
   private short A7583EscOrdn ;
   private short Gx_err ;
   private int AV44Volumen ;
   private int AV45ValCos ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int GX_INS120 ;
   private int A887EscMLin ;
   private int A6060EscSol ;
   private int A7584EscVolm ;
   private java.math.BigDecimal AV41Cantidad ;
   private java.math.BigDecimal AV43TotKil ;
   private java.math.BigDecimal AV54Incre ;
   private java.math.BigDecimal AV62CosAlt ;
   private java.math.BigDecimal AV65Cantidad1 ;
   private java.math.BigDecimal AV50CanTeo ;
   private java.math.BigDecimal AV64Consumos ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal AV58PrdFacCon ;
   private java.math.BigDecimal AV52PrdPreAct ;
   private java.math.BigDecimal A1185PrdComPr ;
   private java.math.BigDecimal A4712EscMFacCon ;
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal AV56EscMCos2 ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A678PrdAltFac ;
   private java.math.BigDecimal AV67PrdAltFac ;
   private java.math.BigDecimal AV68OkAlt ;
   private java.math.BigDecimal A685PrdCanRes ;
   private String AV40EmprCod ;
   private String AV39PrdNum ;
   private String AV47Station ;
   private String AV51ProForCod ;
   private String Gx_msg ;
   private String AV63PrdNum1 ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private String A688PrdComCod ;
   private String A910Workstat ;
   private String A764ProForCod ;
   private String A897EscMDsc ;
   private String Gx_emsg ;
   private String A680PrdAltNum ;
   private String AV66PrdNum2 ;
   private boolean returnInSub ;
   private boolean n3915EmpNumDec ;
   private boolean n1185PrdComPr ;
   private short[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private int[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private short[] aP14 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P04J32_A704PrdExiAlm ;
   private java.math.BigDecimal[] P04J32_A705PrdExiCC ;
   private byte[] P04J32_A856ValCod ;
   private String[] P04J32_A719PrdNum ;
   private String[] P04J32_A396EmprCod ;
   private String[] P04J33_A396EmprCod ;
   private byte[] P04J33_A3915EmpNumDec ;
   private boolean[] P04J33_n3915EmpNumDec ;
   private String[] P04J34_A719PrdNum ;
   private String[] P04J34_A396EmprCod ;
   private java.math.BigDecimal[] P04J34_A707PrdFacCon ;
   private java.math.BigDecimal[] P04J34_A724PrdPreAct ;
   private java.math.BigDecimal[] P04J34_A5255PrdPreAc2 ;
   private String[] P04J36_A688PrdComCod ;
   private String[] P04J36_A396EmprCod ;
   private java.math.BigDecimal[] P04J36_A1185PrdComPr ;
   private boolean[] P04J36_n1185PrdComPr ;
   private String[] P04J38_A719PrdNum ;
   private String[] P04J38_A396EmprCod ;
   private String[] P04J38_A680PrdAltNum ;
   private java.math.BigDecimal[] P04J38_A678PrdAltFac ;
   private java.math.BigDecimal[] P04J39_A704PrdExiAlm ;
   private java.math.BigDecimal[] P04J39_A685PrdCanRes ;
   private java.math.BigDecimal[] P04J39_A705PrdExiCC ;
   private byte[] P04J39_A856ValCod ;
   private String[] P04J39_A719PrdNum ;
   private String[] P04J39_A396EmprCod ;
}

final  class psimulas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04J32", "SELECT PrdExiAlm, PrdExiCC, ValCod, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (ValCod <> 3) AND (( ? = 0 and PrdExiCC >= ?) or ( ? = 1 and PrdExiAlm >= ?)) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04J33", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04J34", "SELECT PrdNum, EmprCod, PrdFacCon, PrdPreAct, PrdPreAc2 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04J36", "SELECT T1.PrdComCod, T1.EmprCod, COALESCE( T2.PrdComPr, 0) AS PrdComPr FROM (TXPCPRDCO T1 LEFT JOIN (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdComCod = T1.PrdComCod) WHERE T1.EmprCod = ? and T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04J37", "INSERT INTO TXPESCMAN(EmprCod, Workstat, EscMLin, PrdNum, ProForCod, EscMDsc, EscMPrdPre, EscMCan, ForPrdUMe, EscMCos, EscMFacCon, EscMRb, EscSol, EscOrdn, EscVolm, EscMCant, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new ForEachCursor("P04J38", "SELECT PrdNum, EmprCod, PrdAltNum, PrdAltFac FROM TXPPRDALT WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04J39", "SELECT PrdExiAlm, PrdCanRes, PrdExiCC, ValCod, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (ValCod <> 3) AND (( ? = 0 and PrdExiCC >= ( ? * CAST(? AS NUMERIC(21,10)) + PrdCanRes)) or ( ? = 1 and PrdExiAlm >= ( ? * CAST(? AS NUMERIC(21,10)) + PrdCanRes))) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 4);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[15], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 4);
               return;
      }
   }

}

