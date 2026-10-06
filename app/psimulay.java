package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimulay extends GXProcedure
{
   public psimulay( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimulay.class ), "" );
   }

   public psimulay( int remoteHandle ,
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
                            java.math.BigDecimal[] aP13 )
   {
      psimulay.this.aP14 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
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
                        short[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
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
                             short[] aP14 )
   {
      psimulay.this.AV40EmprCod = aP0[0];
      this.aP0 = aP0;
      psimulay.this.AV39PrdNum = aP1[0];
      this.aP1 = aP1;
      psimulay.this.AV41Cantidad = aP2[0];
      this.aP2 = aP2;
      psimulay.this.AV42UniMed = aP3[0];
      this.aP3 = aP3;
      psimulay.this.AV43TotKil = aP4[0];
      this.aP4 = aP4;
      psimulay.this.AV44Volumen = aP5[0];
      this.aP5 = aP5;
      psimulay.this.AV45ValCos = aP6[0];
      this.aP6 = aP6;
      psimulay.this.AV46LinRec = aP7[0];
      this.aP7 = aP7;
      psimulay.this.AV47Station = aP8[0];
      this.aP8 = aP8;
      psimulay.this.AV48UltRecLin = aP9[0];
      this.aP9 = aP9;
      psimulay.this.AV49FlagComp = aP10[0];
      this.aP10 = aP10;
      psimulay.this.AV51ProForCod = aP11[0];
      this.aP11 = aP11;
      psimulay.this.AV53ContLinea = aP12[0];
      this.aP12 = aP12;
      psimulay.this.AV54Incre = aP13[0];
      this.aP13 = aP13;
      psimulay.this.AV59EscMRb = aP14[0];
      this.aP14 = aP14;
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
      psimulay.this.AV60F_precio2 = GXv_int1[0] ;
      GXt_int2 = AV61Carvema ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      psimulay.this.GXt_int2 = GXv_int1[0] ;
      AV61Carvema = GXt_int2 ;
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV62CosAlt)) ;
      new app.pexicon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "COSALT", ""), GXv_int1) ;
      psimulay.this.AV62CosAlt = DecimalUtil.doubleToDec(GXv_int1[0]) ;
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
         GXt_int3 = (int)(DecimalUtil.decToDouble(AV64Consumos)) ;
         GXv_int4[0] = GXt_int3 ;
         new app.pbuscon(remoteHandle, context).execute( AV40EmprCod, "011100", GXv_int4) ;
         psimulay.this.GXt_int3 = GXv_int4[0] ;
         AV64Consumos = DecimalUtil.doubleToDec(GXt_int3) ;
         AV76GXLvl23 = (byte)(0) ;
         /* Using cursor P00VV2 */
         pr_default.execute(0, new Object[] {AV40EmprCod, AV63PrdNum1, AV64Consumos, AV50CanTeo, AV64Consumos, AV50CanTeo});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A704PrdExiAlm = P00VV2_A704PrdExiAlm[0] ;
            A705PrdExiCC = P00VV2_A705PrdExiCC[0] ;
            A856ValCod = P00VV2_A856ValCod[0] ;
            A719PrdNum = P00VV2_A719PrdNum[0] ;
            A396EmprCod = P00VV2_A396EmprCod[0] ;
            AV76GXLvl23 = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV76GXLvl23 == 0 )
         {
            /* Execute user subroutine: 'PRDALT' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      else
      {
      }
      /* Using cursor P00VV3 */
      pr_default.execute(1, new Object[] {AV40EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P00VV3_A396EmprCod[0] ;
         A3915EmpNumDec = P00VV3_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00VV3_n3915EmpNumDec[0] ;
         AV55EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P00VV4 */
      pr_default.execute(2, new Object[] {AV40EmprCod, AV39PrdNum});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P00VV4_A719PrdNum[0] ;
         A396EmprCod = P00VV4_A396EmprCod[0] ;
         A707PrdFacCon = P00VV4_A707PrdFacCon[0] ;
         A724PrdPreAct = P00VV4_A724PrdPreAct[0] ;
         A5255PrdPreAc2 = P00VV4_A5255PrdPreAc2[0] ;
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
         /* Using cursor P00VV6 */
         pr_default.execute(3, new Object[] {AV40EmprCod, AV39PrdNum});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A688PrdComCod = P00VV6_A688PrdComCod[0] ;
            A396EmprCod = P00VV6_A396EmprCod[0] ;
            A1185PrdComPr = P00VV6_A1185PrdComPr[0] ;
            n1185PrdComPr = P00VV6_n1185PrdComPr[0] ;
            A1185PrdComPr = P00VV6_A1185PrdComPr[0] ;
            n1185PrdComPr = P00VV6_n1185PrdComPr[0] ;
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
      /*
         INSERT RECORD ON TABLE TXPESCMAN

      */
      A396EmprCod = AV40EmprCod ;
      A910Workstat = GXutil.substring( AV47Station, 1, 10) ;
      A887EscMLin = AV46LinRec ;
      A719PrdNum = AV39PrdNum ;
      A764ProForCod = AV51ProForCod ;
      A897EscMDsc = GXutil.str( AV41Cantidad, 11, 5) ;
      if ( ( AV61Carvema == 1 ) && ( ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1  ", "")) == 0 ) || ( GXutil.strcmp(AV51ProForCod, httpContext.getMessage( "TPP1D ", "")) == 0 ) ) )
      {
         A889EscMPrdPre = DecimalUtil.doubleToDec(0) ;
      }
      else
      {
         A889EscMPrdPre = AV52PrdPreAct ;
      }
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
      /* Using cursor P00VV7 */
      pr_default.execute(4, new Object[] {A396EmprCod, A910Workstat, Integer.valueOf(A887EscMLin), A719PrdNum, A764ProForCod, A897EscMDsc, A889EscMPrdPre, A890EscMCan, Byte.valueOf(A490ForPrdUMe), A891EscMCos, A4712EscMFacCon, Short.valueOf(A4713EscMRb), Integer.valueOf(A6060EscSol), Integer.valueOf(A7584EscVolm), A10363EscMCant});
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
      AV80GXLvl175 = (byte)(0) ;
      /* Using cursor P00VV8 */
      pr_default.execute(5, new Object[] {AV40EmprCod, AV63PrdNum1});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A719PrdNum = P00VV8_A719PrdNum[0] ;
         A396EmprCod = P00VV8_A396EmprCod[0] ;
         A680PrdAltNum = P00VV8_A680PrdAltNum[0] ;
         A678PrdAltFac = P00VV8_A678PrdAltFac[0] ;
         AV80GXLvl175 = (byte)(1) ;
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
      if ( AV80GXLvl175 == 0 )
      {
      }
   }

   public void S127( )
   {
      /* 'PRDALT1' Routine */
      returnInSub = false ;
      AV68OkAlt = DecimalUtil.doubleToDec(0) ;
      AV81GXLvl197 = (byte)(0) ;
      /* Using cursor P00VV9 */
      pr_default.execute(6, new Object[] {AV40EmprCod, AV66PrdNum2, AV64Consumos, AV50CanTeo, AV67PrdAltFac, AV64Consumos, AV50CanTeo, AV67PrdAltFac});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A704PrdExiAlm = P00VV9_A704PrdExiAlm[0] ;
         A685PrdCanRes = P00VV9_A685PrdCanRes[0] ;
         A705PrdExiCC = P00VV9_A705PrdExiCC[0] ;
         A856ValCod = P00VV9_A856ValCod[0] ;
         A719PrdNum = P00VV9_A719PrdNum[0] ;
         A396EmprCod = P00VV9_A396EmprCod[0] ;
         AV81GXLvl197 = (byte)(1) ;
         AV39PrdNum = A719PrdNum ;
         AV41Cantidad = AV65Cantidad1.multiply(AV67PrdAltFac) ;
         AV68OkAlt = DecimalUtil.doubleToDec(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      if ( AV81GXLvl197 == 0 )
      {
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimulay.this.AV40EmprCod;
      this.aP1[0] = psimulay.this.AV39PrdNum;
      this.aP2[0] = psimulay.this.AV41Cantidad;
      this.aP3[0] = psimulay.this.AV42UniMed;
      this.aP4[0] = psimulay.this.AV43TotKil;
      this.aP5[0] = psimulay.this.AV44Volumen;
      this.aP6[0] = psimulay.this.AV45ValCos;
      this.aP7[0] = psimulay.this.AV46LinRec;
      this.aP8[0] = psimulay.this.AV47Station;
      this.aP9[0] = psimulay.this.AV48UltRecLin;
      this.aP10[0] = psimulay.this.AV49FlagComp;
      this.aP11[0] = psimulay.this.AV51ProForCod;
      this.aP12[0] = psimulay.this.AV53ContLinea;
      this.aP13[0] = psimulay.this.AV54Incre;
      this.aP14[0] = psimulay.this.AV59EscMRb;
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
      P00VV2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV2_A856ValCod = new byte[1] ;
      P00VV2_A719PrdNum = new String[] {""} ;
      P00VV2_A396EmprCod = new String[] {""} ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      P00VV3_A396EmprCod = new String[] {""} ;
      P00VV3_A3915EmpNumDec = new byte[1] ;
      P00VV3_n3915EmpNumDec = new boolean[] {false} ;
      P00VV4_A719PrdNum = new String[] {""} ;
      P00VV4_A396EmprCod = new String[] {""} ;
      P00VV4_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV4_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      AV58PrdFacCon = DecimalUtil.ZERO ;
      AV52PrdPreAct = DecimalUtil.ZERO ;
      P00VV6_A688PrdComCod = new String[] {""} ;
      P00VV6_A396EmprCod = new String[] {""} ;
      P00VV6_A1185PrdComPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV6_n1185PrdComPr = new boolean[] {false} ;
      A688PrdComCod = "" ;
      A1185PrdComPr = DecimalUtil.ZERO ;
      A910Workstat = "" ;
      A764ProForCod = "" ;
      A897EscMDsc = "" ;
      A889EscMPrdPre = DecimalUtil.ZERO ;
      A890EscMCan = DecimalUtil.ZERO ;
      A10363EscMCant = DecimalUtil.ZERO ;
      AV56EscMCos2 = DecimalUtil.ZERO ;
      A891EscMCos = DecimalUtil.ZERO ;
      A4712EscMFacCon = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A680PrdAltNum = "" ;
      A678PrdAltFac = DecimalUtil.ZERO ;
      P00VV8_A719PrdNum = new String[] {""} ;
      P00VV8_A396EmprCod = new String[] {""} ;
      P00VV8_A680PrdAltNum = new String[] {""} ;
      P00VV8_A678PrdAltFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV66PrdNum2 = "" ;
      AV67PrdAltFac = DecimalUtil.ZERO ;
      AV68OkAlt = DecimalUtil.ZERO ;
      P00VV9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV9_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00VV9_A856ValCod = new byte[1] ;
      P00VV9_A719PrdNum = new String[] {""} ;
      P00VV9_A396EmprCod = new String[] {""} ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psimulay__default(),
         new Object[] {
             new Object[] {
            P00VV2_A704PrdExiAlm, P00VV2_A705PrdExiCC, P00VV2_A856ValCod, P00VV2_A719PrdNum, P00VV2_A396EmprCod
            }
            , new Object[] {
            P00VV3_A396EmprCod, P00VV3_A3915EmpNumDec, P00VV3_n3915EmpNumDec
            }
            , new Object[] {
            P00VV4_A719PrdNum, P00VV4_A396EmprCod, P00VV4_A707PrdFacCon, P00VV4_A724PrdPreAct, P00VV4_A5255PrdPreAc2
            }
            , new Object[] {
            P00VV6_A688PrdComCod, P00VV6_A396EmprCod, P00VV6_A1185PrdComPr, P00VV6_n1185PrdComPr
            }
            , new Object[] {
            }
            , new Object[] {
            P00VV8_A719PrdNum, P00VV8_A396EmprCod, P00VV8_A680PrdAltNum, P00VV8_A678PrdAltFac
            }
            , new Object[] {
            P00VV9_A704PrdExiAlm, P00VV9_A685PrdCanRes, P00VV9_A705PrdExiCC, P00VV9_A856ValCod, P00VV9_A719PrdNum, P00VV9_A396EmprCod
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
   private byte AV76GXLvl23 ;
   private byte A856ValCod ;
   private byte A3915EmpNumDec ;
   private byte AV55EmpNumDec ;
   private byte A490ForPrdUMe ;
   private byte AV80GXLvl175 ;
   private byte AV81GXLvl197 ;
   private short AV46LinRec ;
   private short AV48UltRecLin ;
   private short AV53ContLinea ;
   private short AV59EscMRb ;
   private short A4713EscMRb ;
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
   private java.math.BigDecimal A889EscMPrdPre ;
   private java.math.BigDecimal A890EscMCan ;
   private java.math.BigDecimal A10363EscMCant ;
   private java.math.BigDecimal AV56EscMCos2 ;
   private java.math.BigDecimal A891EscMCos ;
   private java.math.BigDecimal A4712EscMFacCon ;
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
   private short[] aP14 ;
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
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P00VV2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00VV2_A705PrdExiCC ;
   private byte[] P00VV2_A856ValCod ;
   private String[] P00VV2_A719PrdNum ;
   private String[] P00VV2_A396EmprCod ;
   private String[] P00VV3_A396EmprCod ;
   private byte[] P00VV3_A3915EmpNumDec ;
   private boolean[] P00VV3_n3915EmpNumDec ;
   private String[] P00VV4_A719PrdNum ;
   private String[] P00VV4_A396EmprCod ;
   private java.math.BigDecimal[] P00VV4_A707PrdFacCon ;
   private java.math.BigDecimal[] P00VV4_A724PrdPreAct ;
   private java.math.BigDecimal[] P00VV4_A5255PrdPreAc2 ;
   private String[] P00VV6_A688PrdComCod ;
   private String[] P00VV6_A396EmprCod ;
   private java.math.BigDecimal[] P00VV6_A1185PrdComPr ;
   private boolean[] P00VV6_n1185PrdComPr ;
   private String[] P00VV8_A719PrdNum ;
   private String[] P00VV8_A396EmprCod ;
   private String[] P00VV8_A680PrdAltNum ;
   private java.math.BigDecimal[] P00VV8_A678PrdAltFac ;
   private java.math.BigDecimal[] P00VV9_A704PrdExiAlm ;
   private java.math.BigDecimal[] P00VV9_A685PrdCanRes ;
   private java.math.BigDecimal[] P00VV9_A705PrdExiCC ;
   private byte[] P00VV9_A856ValCod ;
   private String[] P00VV9_A719PrdNum ;
   private String[] P00VV9_A396EmprCod ;
}

final  class psimulay__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00VV2", "SELECT PrdExiAlm, PrdExiCC, ValCod, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (ValCod <> 3) AND (( ? = 0 and PrdExiCC >= ?) or ( ? = 1 and PrdExiAlm >= ?)) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VV3", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VV4", "SELECT PrdNum, EmprCod, PrdFacCon, PrdPreAct, PrdPreAc2 FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00VV6", "SELECT T1.PrdComCod, T1.EmprCod, COALESCE( T2.PrdComPr, 0) AS PrdComPr FROM (TXPCPRDCO T1 LEFT JOIN (SELECT SUM(PrdComVal) AS PrdComPr, EmprCod, PrdComCod FROM TXPLPRDCO GROUP BY EmprCod, PrdComCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdComCod = T1.PrdComCod) WHERE T1.EmprCod = ? and T1.PrdComCod = ? ORDER BY T1.EmprCod, T1.PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00VV7", "INSERT INTO TXPESCMAN(EmprCod, Workstat, EscMLin, PrdNum, ProForCod, EscMDsc, EscMPrdPre, EscMCan, ForPrdUMe, EscMCos, EscMFacCon, EscMRb, EscSol, EscVolm, EscMCant, EscMCliCod, EscMArtCod, EscMMdlCod, EscMProCod, EscMFasCod, EscOrdn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPESCMAN")
         ,new ForEachCursor("P00VV8", "SELECT PrdNum, EmprCod, PrdAltNum, PrdAltFac FROM TXPPRDALT WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00VV9", "SELECT PrdExiAlm, PrdCanRes, PrdExiCC, ValCod, PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum = ?) AND (ValCod <> 3) AND (( ? = 0 and PrdExiCC >= ( ? * CAST(? AS NUMERIC(21,10)) + PrdCanRes)) or ( ? = 1 and PrdExiAlm >= ( ? * CAST(? AS NUMERIC(21,10)) + PrdCanRes))) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 3);
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

