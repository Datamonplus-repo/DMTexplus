package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaespx extends GXProcedure
{
   public pclaespx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaespx.class ), "" );
   }

   public pclaespx( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           String[] aP2 ,
                                           byte[] aP3 ,
                                           int[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           String[] aP8 ,
                                           String[] aP9 ,
                                           short[] aP10 )
   {
      pclaespx.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 ,
                        java.math.BigDecimal[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      pclaespx.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaespx.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaespx.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaespx.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaespx.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaespx.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaespx.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaespx.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaespx.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaespx.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaespx.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaespx.this.AV124Por_p = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CX", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char1[0] = AV82Ini_5 ;
         GXv_char2[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
         pclaespx.this.AV82Ini_5 = GXv_char1[0] ;
         pclaespx.this.AV85Inip_5 = GXv_char2[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char2[0] = AV83Fin_5 ;
         GXv_char1[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
         pclaespx.this.AV83Fin_5 = GXv_char2[0] ;
         pclaespx.this.AV92Finp_5 = GXv_char1[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV124Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV41BarCliCod ;
         GXv_char1[0] = AV46ForSer ;
         GXv_char4[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int6[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int9[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9) ;
         pclaespx.this.A396EmprCod = GXv_char2[0] ;
         pclaespx.this.AV41BarCliCod = GXv_int3[0] ;
         pclaespx.this.AV46ForSer = GXv_char1[0] ;
         pclaespx.this.AV47ForColNom = GXv_char4[0] ;
         pclaespx.this.AV48ForColNum = GXv_int5[0] ;
         pclaespx.this.AV49TipColCod = GXv_int6[0] ;
         pclaespx.this.AV35Familia = GXv_int7[0] ;
         pclaespx.this.AV36TotCol = GXv_decimal8[0] ;
         pclaespx.this.AV50FlagCol = GXv_int9[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CF", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char4[0] = AV82Ini_5 ;
         GXv_char2[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclaespx.this.AV82Ini_5 = GXv_char4[0] ;
         pclaespx.this.AV85Inip_5 = GXv_char2[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char4[0] = AV83Fin_5 ;
         GXv_char2[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclaespx.this.AV83Fin_5 = GXv_char4[0] ;
         pclaespx.this.AV92Finp_5 = GXv_char2[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV124Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV41BarCliCod ;
         GXv_char2[0] = AV46ForSer ;
         GXv_char1[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaespf(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2, GXv_char1, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclaespx.this.A396EmprCod = GXv_char4[0] ;
         pclaespx.this.AV41BarCliCod = GXv_int5[0] ;
         pclaespx.this.AV46ForSer = GXv_char2[0] ;
         pclaespx.this.AV47ForColNom = GXv_char1[0] ;
         pclaespx.this.AV48ForColNum = GXv_int3[0] ;
         pclaespx.this.AV49TipColCod = GXv_int9[0] ;
         pclaespx.this.AV35Familia = GXv_int7[0] ;
         pclaespx.this.AV36TotCol = GXv_decimal8[0] ;
         pclaespx.this.AV50FlagCol = GXv_int6[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "DA", "")) == 0 )
      {
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV23Accion = GXutil.substring( AV16Clave, 22, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char4[0] = AV82Ini_5 ;
         GXv_char2[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclaespx.this.AV82Ini_5 = GXv_char4[0] ;
         pclaespx.this.AV85Inip_5 = GXv_char2[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char4[0] = AV83Fin_5 ;
         GXv_char2[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char4, GXv_char2) ;
         pclaespx.this.AV83Fin_5 = GXv_char4[0] ;
         pclaespx.this.AV92Finp_5 = GXv_char2[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = AV41BarCliCod ;
         GXv_char2[0] = AV46ForSer ;
         GXv_char1[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_char10[0] = AV38Producto ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int7[0] = AV50FlagCol ;
         new app.pclaesp2(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char2, GXv_char1, GXv_int3, GXv_int9, GXv_char10, GXv_decimal8, GXv_int7) ;
         pclaespx.this.A396EmprCod = GXv_char4[0] ;
         pclaespx.this.AV41BarCliCod = GXv_int5[0] ;
         pclaespx.this.AV46ForSer = GXv_char2[0] ;
         pclaespx.this.AV47ForColNom = GXv_char1[0] ;
         pclaespx.this.AV48ForColNum = GXv_int3[0] ;
         pclaespx.this.AV49TipColCod = GXv_int9[0] ;
         pclaespx.this.AV38Producto = GXv_char10[0] ;
         pclaespx.this.AV36TotCol = GXv_decimal8[0] ;
         pclaespx.this.AV50FlagCol = GXv_int7[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CP", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV82Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char10[0] = AV82Ini_5 ;
         GXv_char4[0] = AV85Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclaespx.this.AV82Ini_5 = GXv_char10[0] ;
         pclaespx.this.AV85Inip_5 = GXv_char4[0] ;
         AV84ColIni_5 = CommonUtil.decimalVal( AV85Inip_5, ".") ;
         AV83Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char10[0] = AV83Fin_5 ;
         GXv_char4[0] = AV92Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char10, GXv_char4) ;
         pclaespx.this.AV83Fin_5 = GXv_char10[0] ;
         pclaespx.this.AV92Finp_5 = GXv_char4[0] ;
         AV86ColFin_5 = CommonUtil.decimalVal( AV92Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV124Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         GXv_char10[0] = A396EmprCod ;
         GXv_int5[0] = AV41BarCliCod ;
         GXv_char4[0] = AV46ForSer ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int3[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char10, GXv_int5, GXv_char4, GXv_char2, GXv_int3, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6) ;
         pclaespx.this.A396EmprCod = GXv_char10[0] ;
         pclaespx.this.AV41BarCliCod = GXv_int5[0] ;
         pclaespx.this.AV46ForSer = GXv_char4[0] ;
         pclaespx.this.AV47ForColNom = GXv_char2[0] ;
         pclaespx.this.AV48ForColNum = GXv_int3[0] ;
         pclaespx.this.AV49TipColCod = GXv_int9[0] ;
         pclaespx.this.AV35Familia = GXv_int7[0] ;
         pclaespx.this.AV36TotCol = GXv_decimal8[0] ;
         pclaespx.this.AV50FlagCol = GXv_int6[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV84ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV86ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV99BarAcc = GXutil.space( (short)(1)) ;
      AV41BarCliCod = 0 ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV48ForColNum = 0 ;
      AV49TipColCod = (byte)(0) ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      AV26RelBany = (byte)(0) ;
      AV105BarMaqCod = "" ;
      /* Using cursor P02VX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02VX2_A130BarCodPar[0] ;
         A132BarCodReo = P02VX2_A132BarCodReo[0] ;
         A129BarCod = P02VX2_A129BarCod[0] ;
         A252CliCod = P02VX2_A252CliCod[0] ;
         n252CliCod = P02VX2_n252CliCod[0] ;
         A212BarSer = P02VX2_A212BarSer[0] ;
         A135BarColNom = P02VX2_A135BarColNom[0] ;
         A136BarColNum = P02VX2_A136BarColNum[0] ;
         A218BarTipCol = P02VX2_A218BarTipCol[0] ;
         A221BarTra1 = P02VX2_A221BarTra1[0] ;
         A222BarTra2 = P02VX2_A222BarTra2[0] ;
         A223BarTra3 = P02VX2_A223BarTra3[0] ;
         A236BarVolMaq = P02VX2_A236BarVolMaq[0] ;
         A5253BarAcc = P02VX2_A5253BarAcc[0] ;
         A180BarMaqCod = P02VX2_A180BarMaqCod[0] ;
         AV41BarCliCod = A252CliCod ;
         AV46ForSer = A212BarSer ;
         AV47ForColNom = A135BarColNom ;
         AV48ForColNum = A136BarColNum ;
         AV49TipColCod = A218BarTipCol ;
         AV110BarTra1 = A221BarTra1 ;
         AV111BarTra2 = A222BarTra2 ;
         AV112BarTra3 = A223BarTra3 ;
         AV72Color13_1 = GXutil.substring( A135BarColNom, 13, 1) ;
         AV76BarSer34 = GXutil.substring( A212BarSer, 3, 2) ;
         AV26RelBany = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(A236BarVolMaq).divide(AV21TotKil, 18, java.math.RoundingMode.DOWN)), 0))) ;
         AV99BarAcc = A5253BarAcc ;
         AV105BarMaqCod = A180BarMaqCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaespx.this.A396EmprCod;
      this.aP1[0] = pclaespx.this.AV15Descrip;
      this.aP2[0] = pclaespx.this.AV16Clave;
      this.aP3[0] = pclaespx.this.AV17PrdVal;
      this.aP4[0] = pclaespx.this.AV18BarCod;
      this.aP5[0] = pclaespx.this.AV19BarCodReo;
      this.aP6[0] = pclaespx.this.AV20BarCodPar;
      this.aP7[0] = pclaespx.this.AV21TotKil;
      this.aP8[0] = pclaespx.this.AV22PrdDesc;
      this.aP9[0] = pclaespx.this.AV23Accion;
      this.aP10[0] = pclaespx.this.AV67BarLinMaq;
      this.aP11[0] = pclaespx.this.AV124Por_p;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Opcion = "" ;
      AV82Ini_5 = "" ;
      AV85Inip_5 = "" ;
      AV84ColIni_5 = DecimalUtil.ZERO ;
      AV83Fin_5 = "" ;
      AV92Finp_5 = "" ;
      AV86ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV38Producto = "" ;
      GXv_char1 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int6 = new byte[1] ;
      AV99BarAcc = "" ;
      AV110BarTra1 = "" ;
      AV111BarTra2 = "" ;
      AV112BarTra3 = "" ;
      AV72Color13_1 = "" ;
      AV76BarSer34 = "" ;
      AV105BarMaqCod = "" ;
      scmdbuf = "" ;
      P02VX2_A396EmprCod = new String[] {""} ;
      P02VX2_A130BarCodPar = new String[] {""} ;
      P02VX2_A132BarCodReo = new byte[1] ;
      P02VX2_A129BarCod = new int[1] ;
      P02VX2_A252CliCod = new int[1] ;
      P02VX2_n252CliCod = new boolean[] {false} ;
      P02VX2_A212BarSer = new String[] {""} ;
      P02VX2_A135BarColNom = new String[] {""} ;
      P02VX2_A136BarColNum = new int[1] ;
      P02VX2_A218BarTipCol = new byte[1] ;
      P02VX2_A221BarTra1 = new String[] {""} ;
      P02VX2_A222BarTra2 = new String[] {""} ;
      P02VX2_A223BarTra3 = new String[] {""} ;
      P02VX2_A236BarVolMaq = new int[1] ;
      P02VX2_A5253BarAcc = new String[] {""} ;
      P02VX2_A180BarMaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A5253BarAcc = "" ;
      A180BarMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaespx__default(),
         new Object[] {
             new Object[] {
            P02VX2_A396EmprCod, P02VX2_A130BarCodPar, P02VX2_A132BarCodReo, P02VX2_A129BarCod, P02VX2_A252CliCod, P02VX2_n252CliCod, P02VX2_A212BarSer, P02VX2_A135BarColNom, P02VX2_A136BarColNum, P02VX2_A218BarTipCol,
            P02VX2_A221BarTra1, P02VX2_A222BarTra2, P02VX2_A223BarTra3, P02VX2_A236BarVolMaq, P02VX2_A5253BarAcc, P02VX2_A180BarMaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV35Familia ;
   private byte AV49TipColCod ;
   private byte AV50FlagCol ;
   private byte GXv_int9[] ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte AV26RelBany ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short AV67BarLinMaq ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int AV41BarCliCod ;
   private int AV48ForColNum ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A236BarVolMaq ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV124Por_p ;
   private java.math.BigDecimal AV84ColIni_5 ;
   private java.math.BigDecimal AV86ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV24Opcion ;
   private String AV82Ini_5 ;
   private String AV85Inip_5 ;
   private String AV83Fin_5 ;
   private String AV92Finp_5 ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String AV38Producto ;
   private String GXv_char1[] ;
   private String GXv_char10[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String AV99BarAcc ;
   private String AV110BarTra1 ;
   private String AV111BarTra2 ;
   private String AV112BarTra3 ;
   private String AV72Color13_1 ;
   private String AV76BarSer34 ;
   private String AV105BarMaqCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A5253BarAcc ;
   private String A180BarMaqCod ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P02VX2_A396EmprCod ;
   private String[] P02VX2_A130BarCodPar ;
   private byte[] P02VX2_A132BarCodReo ;
   private int[] P02VX2_A129BarCod ;
   private int[] P02VX2_A252CliCod ;
   private boolean[] P02VX2_n252CliCod ;
   private String[] P02VX2_A212BarSer ;
   private String[] P02VX2_A135BarColNom ;
   private int[] P02VX2_A136BarColNum ;
   private byte[] P02VX2_A218BarTipCol ;
   private String[] P02VX2_A221BarTra1 ;
   private String[] P02VX2_A222BarTra2 ;
   private String[] P02VX2_A223BarTra3 ;
   private int[] P02VX2_A236BarVolMaq ;
   private String[] P02VX2_A5253BarAcc ;
   private String[] P02VX2_A180BarMaqCod ;
}

final  class pclaespx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02VX2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarTra1, BarTra2, BarTra3, BarVolMaq, BarAcc, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((String[]) buf[11])[0] = rslt.getString(11, 4);
               ((String[]) buf[12])[0] = rslt.getString(12, 4);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((String[]) buf[15])[0] = rslt.getString(15, 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

