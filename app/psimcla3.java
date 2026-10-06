package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psimcla3 extends GXProcedure
{
   public psimcla3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psimcla3.class ), "" );
   }

   public psimcla3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             int[] aP19 )
   {
      psimcla3.this.aP20 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
      return aP20[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        short[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        int[] aP14 ,
                        byte[] aP15 ,
                        byte[] aP16 ,
                        String[] aP17 ,
                        java.math.BigDecimal[] aP18 ,
                        int[] aP19 ,
                        String[] aP20 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             short[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             int[] aP14 ,
                             byte[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 ,
                             java.math.BigDecimal[] aP18 ,
                             int[] aP19 ,
                             String[] aP20 )
   {
      psimcla3.this.AV75EmprCod = aP0[0];
      this.aP0 = aP0;
      psimcla3.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      psimcla3.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      psimcla3.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      psimcla3.this.AV52CliCod = aP4[0];
      this.aP4 = aP4;
      psimcla3.this.AV68ArtCod = aP5[0];
      this.aP5 = aP5;
      psimcla3.this.AV21TotKil = aP6[0];
      this.aP6 = aP6;
      psimcla3.this.AV22PrdDesc = aP7[0];
      this.aP7 = aP7;
      psimcla3.this.AV23Accion = aP8[0];
      this.aP8 = aP8;
      psimcla3.this.AV67BarLinMaq = aP9[0];
      this.aP9 = aP9;
      psimcla3.this.AV69Volumen = aP10[0];
      this.aP10 = aP10;
      psimcla3.this.AV70MaqCod = aP11[0];
      this.aP11 = aP11;
      psimcla3.this.AV71MatizForm = aP12[0];
      this.aP12 = aP12;
      psimcla3.this.AV47ForColNom = aP13[0];
      this.aP13 = aP13;
      psimcla3.this.AV48ForColNum = aP14[0];
      this.aP14 = aP14;
      psimcla3.this.AV49TipColCod = aP15[0];
      this.aP15 = aP15;
      psimcla3.this.AV73IntCodFor = aP16[0];
      this.aP16 = aP16;
      psimcla3.this.AV106Procodi = aP17[0];
      this.aP17 = aP17;
      psimcla3.this.AV107Por_p = aP18[0];
      this.aP18 = aP18;
      psimcla3.this.AV110Lb_numero = aP19[0];
      this.aP19 = aP19;
      psimcla3.this.AV109Lb_opcion = aP20[0];
      this.aP20 = aP20;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CP", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char1[0] = AV76Ini_5 ;
         GXv_char2[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
         psimcla3.this.AV76Ini_5 = GXv_char1[0] ;
         psimcla3.this.AV77Inip_5 = GXv_char2[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char2[0] = AV78Fin_5 ;
         GXv_char1[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
         psimcla3.this.AV78Fin_5 = GXv_char2[0] ;
         psimcla3.this.AV81Finp_5 = GXv_char1[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV107Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char2[0] = AV75EmprCod ;
         GXv_int3[0] = AV52CliCod ;
         GXv_char1[0] = AV68ArtCod ;
         GXv_char4[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int6[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int9[0] = AV50FlagCol ;
         GXv_int10[0] = AV110Lb_numero ;
         GXv_char11[0] = AV109Lb_opcion ;
         new app.pclaesp7(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9, GXv_int10, GXv_char11) ;
         psimcla3.this.AV75EmprCod = GXv_char2[0] ;
         psimcla3.this.AV52CliCod = GXv_int3[0] ;
         psimcla3.this.AV68ArtCod = GXv_char1[0] ;
         psimcla3.this.AV47ForColNom = GXv_char4[0] ;
         psimcla3.this.AV48ForColNum = GXv_int5[0] ;
         psimcla3.this.AV49TipColCod = GXv_int6[0] ;
         psimcla3.this.AV35Familia = GXv_int7[0] ;
         psimcla3.this.AV36TotCol = GXv_decimal8[0] ;
         psimcla3.this.AV50FlagCol = GXv_int9[0] ;
         psimcla3.this.AV110Lb_numero = GXv_int10[0] ;
         psimcla3.this.AV109Lb_opcion = GXv_char11[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CX", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char11[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV76Ini_5 = GXv_char11[0] ;
         psimcla3.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char11[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV78Fin_5 = GXv_char11[0] ;
         psimcla3.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV107Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char11[0] = AV75EmprCod ;
         GXv_int10[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         GXv_int3[0] = AV110Lb_numero ;
         GXv_char1[0] = AV109Lb_opcion ;
         new app.pclaesp7(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char4, GXv_char2, GXv_int5, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6, GXv_int3, GXv_char1) ;
         psimcla3.this.AV75EmprCod = GXv_char11[0] ;
         psimcla3.this.AV52CliCod = GXv_int10[0] ;
         psimcla3.this.AV68ArtCod = GXv_char4[0] ;
         psimcla3.this.AV47ForColNom = GXv_char2[0] ;
         psimcla3.this.AV48ForColNum = GXv_int5[0] ;
         psimcla3.this.AV49TipColCod = GXv_int9[0] ;
         psimcla3.this.AV35Familia = GXv_int7[0] ;
         psimcla3.this.AV36TotCol = GXv_decimal8[0] ;
         psimcla3.this.AV50FlagCol = GXv_int6[0] ;
         psimcla3.this.AV110Lb_numero = GXv_int3[0] ;
         psimcla3.this.AV109Lb_opcion = GXv_char1[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "CF", "")) == 0 )
      {
         AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char11[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV76Ini_5 = GXv_char11[0] ;
         psimcla3.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char11[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV78Fin_5 = GXv_char11[0] ;
         psimcla3.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 29, 2))) ;
         AV107Por_p = CommonUtil.decimalVal( GXutil.substring( AV16Clave, 22, 6), ".") ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char11[0] = AV75EmprCod ;
         GXv_int10[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int6[0] = AV50FlagCol ;
         GXv_int3[0] = AV110Lb_numero ;
         GXv_char1[0] = AV109Lb_opcion ;
         new app.pclaespg(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char4, GXv_char2, GXv_int5, GXv_int9, GXv_int7, GXv_decimal8, GXv_int6, GXv_int3, GXv_char1) ;
         psimcla3.this.AV75EmprCod = GXv_char11[0] ;
         psimcla3.this.AV52CliCod = GXv_int10[0] ;
         psimcla3.this.AV68ArtCod = GXv_char4[0] ;
         psimcla3.this.AV47ForColNom = GXv_char2[0] ;
         psimcla3.this.AV48ForColNum = GXv_int5[0] ;
         psimcla3.this.AV49TipColCod = GXv_int9[0] ;
         psimcla3.this.AV35Familia = GXv_int7[0] ;
         psimcla3.this.AV36TotCol = GXv_decimal8[0] ;
         psimcla3.this.AV50FlagCol = GXv_int6[0] ;
         psimcla3.this.AV110Lb_numero = GXv_int3[0] ;
         psimcla3.this.AV109Lb_opcion = GXv_char1[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV24Opcion, httpContext.getMessage( "DA", "")) == 0 )
      {
         AV38Producto = GXutil.substring( AV22PrdDesc, 1, 6) ;
         AV23Accion = GXutil.substring( AV16Clave, 22, 1) ;
         AV76Ini_5 = GXutil.substring( AV16Clave, 4, 8) ;
         GXv_char11[0] = AV76Ini_5 ;
         GXv_char4[0] = AV77Inip_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV76Ini_5 = GXv_char11[0] ;
         psimcla3.this.AV77Inip_5 = GXv_char4[0] ;
         AV80ColIni_5 = CommonUtil.decimalVal( AV77Inip_5, ".") ;
         AV78Fin_5 = GXutil.substring( AV16Clave, 13, 8) ;
         GXv_char11[0] = AV78Fin_5 ;
         GXv_char4[0] = AV81Finp_5 ;
         new app.pcomtop(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
         psimcla3.this.AV78Fin_5 = GXv_char11[0] ;
         psimcla3.this.AV81Finp_5 = GXv_char4[0] ;
         AV79ColFin_5 = CommonUtil.decimalVal( AV81Finp_5, ".") ;
         AV15Descrip = AV38Producto ;
         AV36TotCol = DecimalUtil.doubleToDec(0) ;
         GXv_char11[0] = AV75EmprCod ;
         GXv_int10[0] = AV52CliCod ;
         GXv_char4[0] = AV68ArtCod ;
         GXv_char2[0] = AV47ForColNom ;
         GXv_int5[0] = AV48ForColNum ;
         GXv_int9[0] = AV49TipColCod ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int7[0] = AV50FlagCol ;
         GXv_int3[0] = AV110Lb_numero ;
         GXv_char1[0] = AV109Lb_opcion ;
         new app.pclasda(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_char4, GXv_char2, GXv_int5, GXv_int9, GXv_decimal8, GXv_int7, GXv_int3, GXv_char1) ;
         psimcla3.this.AV75EmprCod = GXv_char11[0] ;
         psimcla3.this.AV52CliCod = GXv_int10[0] ;
         psimcla3.this.AV68ArtCod = GXv_char4[0] ;
         psimcla3.this.AV47ForColNom = GXv_char2[0] ;
         psimcla3.this.AV48ForColNum = GXv_int5[0] ;
         psimcla3.this.AV49TipColCod = GXv_int9[0] ;
         psimcla3.this.AV36TotCol = GXv_decimal8[0] ;
         psimcla3.this.AV50FlagCol = GXv_int7[0] ;
         psimcla3.this.AV110Lb_numero = GXv_int3[0] ;
         psimcla3.this.AV109Lb_opcion = GXv_char1[0] ;
         if ( ! (0==AV50FlagCol) )
         {
            if ( ( DecimalUtil.compareTo(AV36TotCol, AV80ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV36TotCol, AV79ColFin_5) <= 0 ) )
            {
               AV17PrdVal = (byte)(1) ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psimcla3.this.AV75EmprCod;
      this.aP1[0] = psimcla3.this.AV15Descrip;
      this.aP2[0] = psimcla3.this.AV16Clave;
      this.aP3[0] = psimcla3.this.AV17PrdVal;
      this.aP4[0] = psimcla3.this.AV52CliCod;
      this.aP5[0] = psimcla3.this.AV68ArtCod;
      this.aP6[0] = psimcla3.this.AV21TotKil;
      this.aP7[0] = psimcla3.this.AV22PrdDesc;
      this.aP8[0] = psimcla3.this.AV23Accion;
      this.aP9[0] = psimcla3.this.AV67BarLinMaq;
      this.aP10[0] = psimcla3.this.AV69Volumen;
      this.aP11[0] = psimcla3.this.AV70MaqCod;
      this.aP12[0] = psimcla3.this.AV71MatizForm;
      this.aP13[0] = psimcla3.this.AV47ForColNom;
      this.aP14[0] = psimcla3.this.AV48ForColNum;
      this.aP15[0] = psimcla3.this.AV49TipColCod;
      this.aP16[0] = psimcla3.this.AV73IntCodFor;
      this.aP17[0] = psimcla3.this.AV106Procodi;
      this.aP18[0] = psimcla3.this.AV107Por_p;
      this.aP19[0] = psimcla3.this.AV110Lb_numero;
      this.aP20[0] = psimcla3.this.AV109Lb_opcion;
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
      AV76Ini_5 = "" ;
      AV77Inip_5 = "" ;
      AV80ColIni_5 = DecimalUtil.ZERO ;
      AV78Fin_5 = "" ;
      AV81Finp_5 = "" ;
      AV79ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      AV38Producto = "" ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int3 = new int[1] ;
      GXv_char1 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV49TipColCod ;
   private byte AV73IntCodFor ;
   private byte AV35Familia ;
   private byte AV50FlagCol ;
   private byte GXv_int6[] ;
   private byte GXv_int9[] ;
   private byte GXv_int7[] ;
   private short AV67BarLinMaq ;
   private short AV71MatizForm ;
   private short Gx_err ;
   private int AV52CliCod ;
   private int AV69Volumen ;
   private int AV48ForColNum ;
   private int AV110Lb_numero ;
   private int GXv_int10[] ;
   private int GXv_int5[] ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV107Por_p ;
   private java.math.BigDecimal AV80ColIni_5 ;
   private java.math.BigDecimal AV79ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String AV75EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV68ArtCod ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV70MaqCod ;
   private String AV47ForColNom ;
   private String AV106Procodi ;
   private String AV109Lb_opcion ;
   private String AV24Opcion ;
   private String AV76Ini_5 ;
   private String AV77Inip_5 ;
   private String AV78Fin_5 ;
   private String AV81Finp_5 ;
   private String AV38Producto ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String[] aP20 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private short[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private int[] aP14 ;
   private byte[] aP15 ;
   private byte[] aP16 ;
   private String[] aP17 ;
   private java.math.BigDecimal[] aP18 ;
   private int[] aP19 ;
}

