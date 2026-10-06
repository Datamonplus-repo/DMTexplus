package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplectou extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplectou pgm = new aplectou (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      String[] aP2 = new String[] {""};
      int[] aP3 = new int[] {0};
      byte[] aP4 = new byte[] {0};
      String[] aP5 = new String[] {""};
      short[] aP6 = new short[] {0};
      byte[] aP7 = new byte[] {0};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};
      int[] aP11 = new int[] {0};
      byte[] aP12 = new byte[] {0};
      String[] aP13 = new String[] {""};
      short[] aP14 = new short[] {0};
      String[] aP15 = new String[] {""};
      short[] aP16 = new short[] {0};
      short[] aP17 = new short[] {0};
      String[] aP18 = new String[] {""};
      String[] aP19 = new String[] {""};
      String[] aP20 = new String[] {""};
      byte[] aP21 = new byte[] {0};
      java.util.Date[] aP22 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP23 = new String[] {""};
      byte[] aP24 = new byte[] {0};
      String[] aP25 = new String[] {""};
      String[] aP26 = new String[] {""};
      java.util.Date[] aP27 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP28 = new java.util.Date[] {GXutil.nullDate()};
      short[] aP29 = new short[] {0};
      short[] aP30 = new short[] {0};
      String[] aP31 = new String[] {""};
      byte[] aP32 = new byte[] {0};
      String[] aP33 = new String[] {""};
      byte[] aP34 = new byte[] {0};
      java.util.Date[] aP35 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP36 = new String[] {""};
      byte[] aP37 = new byte[] {0};
      String[] aP38 = new String[] {""};
      String[] aP39 = new String[] {""};
      String[] aP40 = new String[] {""};
      String[] aP41 = new String[] {""};
      String[] aP42 = new String[] {""};
      byte[] aP43 = new byte[] {0};
      byte[] aP44 = new byte[] {0};
      byte[] aP45 = new byte[] {0};
      byte[] aP46 = new byte[] {0};
      int[] aP47 = new int[] {0};
      byte[] aP48 = new byte[] {0};
      String[] aP49 = new String[] {""};
      short[] aP50 = new short[] {0};
      String[] aP51 = new String[] {""};
      int[] aP52 = new int[] {0};
      byte[] aP53 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (String) args[2];
         aP3[0] = (int) GXutil.lval( args[3]);
         aP4[0] = (byte) GXutil.lval( args[4]);
         aP5[0] = (String) args[5];
         aP6[0] = (short) GXutil.lval( args[6]);
         aP7[0] = (byte) GXutil.lval( args[7]);
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
         aP11[0] = (int) GXutil.lval( args[11]);
         aP12[0] = (byte) GXutil.lval( args[12]);
         aP13[0] = (String) args[13];
         aP14[0] = (short) GXutil.lval( args[14]);
         aP15[0] = (String) args[15];
         aP16[0] = (short) GXutil.lval( args[16]);
         aP17[0] = (short) GXutil.lval( args[17]);
         aP18[0] = (String) args[18];
         aP19[0] = (String) args[19];
         aP20[0] = (String) args[20];
         aP21[0] = (byte) GXutil.lval( args[21]);
         aP22[0] = (java.util.Date) localUtil.ctod( args[22], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP23[0] = (String) args[23];
         aP24[0] = (byte) GXutil.lval( args[24]);
         aP25[0] = (String) args[25];
         aP26[0] = (String) args[26];
         aP27[0] = (java.util.Date) localUtil.ctot( args[27], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP28[0] = (java.util.Date) localUtil.ctot( args[28], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP29[0] = (short) GXutil.lval( args[29]);
         aP30[0] = (short) GXutil.lval( args[30]);
         aP31[0] = (String) args[31];
         aP32[0] = (byte) GXutil.lval( args[32]);
         aP33[0] = (String) args[33];
         aP34[0] = (byte) GXutil.lval( args[34]);
         aP35[0] = (java.util.Date) localUtil.ctod( args[35], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP36[0] = (String) args[36];
         aP37[0] = (byte) GXutil.lval( args[37]);
         aP38[0] = (String) args[38];
         aP39[0] = (String) args[39];
         aP40[0] = (String) args[40];
         aP41[0] = (String) args[41];
         aP42[0] = (String) args[42];
         aP43[0] = (byte) GXutil.lval( args[43]);
         aP44[0] = (byte) GXutil.lval( args[44]);
         aP45[0] = (byte) GXutil.lval( args[45]);
         aP46[0] = (byte) GXutil.lval( args[46]);
         aP47[0] = (int) GXutil.lval( args[47]);
         aP48[0] = (byte) GXutil.lval( args[48]);
         aP49[0] = (String) args[49];
         aP50[0] = (short) GXutil.lval( args[50]);
         aP51[0] = (String) args[51];
         aP52[0] = (int) GXutil.lval( args[52]);
         aP53[0] = (byte) GXutil.lval( args[53]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53);
   }

   public aplectou( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplectou.class ), "" );
   }

   public aplectou( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           int[] aP3 ,
                           byte[] aP4 ,
                           String[] aP5 ,
                           short[] aP6 ,
                           byte[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           int[] aP11 ,
                           byte[] aP12 ,
                           String[] aP13 ,
                           short[] aP14 ,
                           String[] aP15 ,
                           short[] aP16 ,
                           short[] aP17 ,
                           String[] aP18 ,
                           String[] aP19 ,
                           String[] aP20 ,
                           byte[] aP21 ,
                           java.util.Date[] aP22 ,
                           String[] aP23 ,
                           byte[] aP24 ,
                           String[] aP25 ,
                           String[] aP26 ,
                           java.util.Date[] aP27 ,
                           java.util.Date[] aP28 ,
                           short[] aP29 ,
                           short[] aP30 ,
                           String[] aP31 ,
                           byte[] aP32 ,
                           String[] aP33 ,
                           byte[] aP34 ,
                           java.util.Date[] aP35 ,
                           String[] aP36 ,
                           byte[] aP37 ,
                           String[] aP38 ,
                           String[] aP39 ,
                           String[] aP40 ,
                           String[] aP41 ,
                           String[] aP42 ,
                           byte[] aP43 ,
                           byte[] aP44 ,
                           byte[] aP45 ,
                           byte[] aP46 ,
                           int[] aP47 ,
                           byte[] aP48 ,
                           String[] aP49 ,
                           short[] aP50 ,
                           String[] aP51 ,
                           int[] aP52 )
   {
      aplectou.this.aP53 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53);
      return aP53[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        byte[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        String[] aP15 ,
                        short[] aP16 ,
                        short[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        byte[] aP21 ,
                        java.util.Date[] aP22 ,
                        String[] aP23 ,
                        byte[] aP24 ,
                        String[] aP25 ,
                        String[] aP26 ,
                        java.util.Date[] aP27 ,
                        java.util.Date[] aP28 ,
                        short[] aP29 ,
                        short[] aP30 ,
                        String[] aP31 ,
                        byte[] aP32 ,
                        String[] aP33 ,
                        byte[] aP34 ,
                        java.util.Date[] aP35 ,
                        String[] aP36 ,
                        byte[] aP37 ,
                        String[] aP38 ,
                        String[] aP39 ,
                        String[] aP40 ,
                        String[] aP41 ,
                        String[] aP42 ,
                        byte[] aP43 ,
                        byte[] aP44 ,
                        byte[] aP45 ,
                        byte[] aP46 ,
                        int[] aP47 ,
                        byte[] aP48 ,
                        String[] aP49 ,
                        short[] aP50 ,
                        String[] aP51 ,
                        int[] aP52 ,
                        byte[] aP53 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             byte[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             String[] aP15 ,
                             short[] aP16 ,
                             short[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             byte[] aP21 ,
                             java.util.Date[] aP22 ,
                             String[] aP23 ,
                             byte[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             java.util.Date[] aP27 ,
                             java.util.Date[] aP28 ,
                             short[] aP29 ,
                             short[] aP30 ,
                             String[] aP31 ,
                             byte[] aP32 ,
                             String[] aP33 ,
                             byte[] aP34 ,
                             java.util.Date[] aP35 ,
                             String[] aP36 ,
                             byte[] aP37 ,
                             String[] aP38 ,
                             String[] aP39 ,
                             String[] aP40 ,
                             String[] aP41 ,
                             String[] aP42 ,
                             byte[] aP43 ,
                             byte[] aP44 ,
                             byte[] aP45 ,
                             byte[] aP46 ,
                             int[] aP47 ,
                             byte[] aP48 ,
                             String[] aP49 ,
                             short[] aP50 ,
                             String[] aP51 ,
                             int[] aP52 ,
                             byte[] aP53 )
   {
      aplectou.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      aplectou.this.AV16OpeCod = aP1[0];
      this.aP1 = aP1;
      aplectou.this.AV17MaqCod = aP2[0];
      this.aP2 = aP2;
      aplectou.this.A129BarCod = aP3[0];
      this.aP3 = aP3;
      aplectou.this.A132BarCodReo = aP4[0];
      this.aP4 = aP4;
      aplectou.this.A130BarCodPar = aP5[0];
      this.aP5 = aP5;
      aplectou.this.AV21ParCod = aP6[0];
      this.aP6 = aP6;
      aplectou.this.AV22FlagPa = aP7[0];
      this.aP7 = aP7;
      aplectou.this.AV23Tipo = aP8[0];
      this.aP8 = aP8;
      aplectou.this.AV24Mensa = aP9[0];
      this.aP9 = aP9;
      aplectou.this.AV66BarComLin = aP10[0];
      this.aP10 = aP10;
      aplectou.this.AV35BarCodAnt = aP11[0];
      this.aP11 = aP11;
      aplectou.this.AV36BarReoAnt = aP12[0];
      this.aP12 = aP12;
      aplectou.this.AV37BarParAnt = aP13[0];
      this.aP13 = aP13;
      aplectou.this.AV41OrdLinAnt = aP14[0];
      this.aP14 = aP14;
      aplectou.this.AV40FasCodAnt = aP15[0];
      this.aP15 = aP15;
      aplectou.this.AV39ParCodAnt = aP16[0];
      this.aP16 = aP16;
      aplectou.this.A194BarOrdLin = aP17[0];
      this.aP17 = aP17;
      aplectou.this.AV70FasCod = aP18[0];
      this.aP18 = aP18;
      aplectou.this.AV56LecTipEnt = aP19[0];
      this.aP19 = aP19;
      aplectou.this.AV115BarFactin = aP20[0];
      this.aP20 = aP20;
      aplectou.this.AV29Turno = aP21[0];
      this.aP21 = aP21;
      aplectou.this.AV52Hoy = aP22[0];
      this.aP22 = aP22;
      aplectou.this.AV55Tiempo = aP23[0];
      this.aP23 = aP23;
      aplectou.this.AV107Eliot = aP24[0];
      this.aP24 = aP24;
      aplectou.this.AV108BarEncCli = aP25[0];
      this.aP25 = aP25;
      aplectou.this.AV109BarDibCli = aP26[0];
      this.aP26 = aP26;
      aplectou.this.AV110dti = aP27[0];
      this.aP27 = aP27;
      aplectou.this.AV111Dtf = aP28[0];
      this.aP28 = aP28;
      aplectou.this.AV112Num_oes = aP29[0];
      this.aP29 = aP29;
      aplectou.this.AV113Num_oesc = aP30[0];
      this.aP30 = aP30;
      aplectou.this.AV106BarTipDis = aP31[0];
      this.aP31 = aP31;
      aplectou.this.AV114Conbd1004 = aP32[0];
      this.aP32 = aP32;
      aplectou.this.AV97Msg_15 = aP33[0];
      this.aP33 = aP33;
      aplectou.this.AV90RQ = aP34[0];
      this.aP34 = aP34;
      aplectou.this.AV31Fecha = aP35[0];
      this.aP35 = aP35;
      aplectou.this.AV62vMensaje = aP36[0];
      this.aP36 = aP36;
      aplectou.this.AV67EstadoAnt = aP37[0];
      this.aP37 = aP37;
      aplectou.this.AV99CodFasAnt = aP38[0];
      this.aP38 = aP38;
      aplectou.this.AV24Mensa = aP39[0];
      this.aP39 = aP39;
      aplectou.this.AV98FinAnt = aP40[0];
      this.aP40 = aP40;
      aplectou.this.AV99CodFasAnt = aP41[0];
      this.aP41 = aP41;
      aplectou.this.AV79Msg_6 = aP42[0];
      this.aP42 = aP42;
      aplectou.this.AV47IniProd = aP43[0];
      this.aP43 = aP43;
      aplectou.this.A153BarFasEst = aP44[0];
      this.aP44 = aP44;
      aplectou.this.AV68FlagCC = aP45[0];
      this.aP45 = aP45;
      aplectou.this.AV95FlagFin = aP46[0];
      this.aP46 = aP46;
      aplectou.this.AV18Barcada = aP47[0];
      this.aP47 = aP47;
      aplectou.this.AV19BarCodReo = aP48[0];
      this.aP48 = aP48;
      aplectou.this.AV20BarCodPar = aP49[0];
      this.aP49 = aP49;
      aplectou.this.AV53OrdLinA = aP50[0];
      this.aP50 = aP50;
      aplectou.this.AV54FasCodA = aP51[0];
      this.aP51 = aP51;
      aplectou.this.AV16OpeCod = aP52[0];
      this.aP52 = aP52;
      aplectou.this.AV68FlagCC = aP53[0];
      this.aP53 = aP53;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV95FlagFin == 1 )
      {
         if ( ( AV22FlagPa == 1 ) && ( AV67EstadoAnt == 2 ) )
         {
         }
         else
         {
            AV98FinAnt = httpContext.getMessage( "N", "") ;
            AV99CodFasAnt = "" ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_int5[0] = A194BarOrdLin ;
            GXv_char6[0] = AV98FinAnt ;
            GXv_char7[0] = AV99CodFasAnt ;
            new app.pfinant(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_char7) ;
            aplectou.this.A396EmprCod = GXv_char1[0] ;
            aplectou.this.A129BarCod = GXv_int2[0] ;
            aplectou.this.A132BarCodReo = GXv_int3[0] ;
            aplectou.this.A130BarCodPar = GXv_char4[0] ;
            aplectou.this.A194BarOrdLin = GXv_int5[0] ;
            aplectou.this.AV98FinAnt = GXv_char6[0] ;
            aplectou.this.AV99CodFasAnt = GXv_char7[0] ;
            if ( GXutil.strcmp(AV98FinAnt, httpContext.getMessage( "S", "")) == 0 )
            {
               Gx_msg = httpContext.getMessage( " H.R. con fase ", "") + AV99CodFasAnt + httpContext.getMessage( " sin realizar y control activo", "") ;
               Gx_msg = GXutil.trim( AV96Msg_14) + " " + AV99CodFasAnt + " " + GXutil.trim( AV97Msg_15) ;
               AV24Mensa = Gx_msg ;
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      System.out.println( AV79Msg_6 );
      GXt_int8 = AV51Loop ;
      GXv_int2[0] = 10000 ;
      GXv_int3[0] = GXt_int8 ;
      new app.ploop(remoteHandle, context).execute( GXv_int2, GXv_int3) ;
      aplectou.this.GXt_int8 = GXv_int3[0] ;
      AV51Loop = GXt_int8 ;
      System.out.println( "                 " );
      AV24Mensa = "" ;
      AV24Mensa = AV79Msg_6 ;
      AV62vMensaje = AV79Msg_6 ;
      AV47IniProd = (byte)(1) ;
      if ( ( AV22FlagPa == 1 ) && ( AV67EstadoAnt == 2 ) )
      {
      }
      else
      {
         if ( A153BarFasEst == 0 )
         {
            if ( AV68FlagCC == 1 )
            {
               if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "H", "")) == 0 )
               {
                  /* Execute user subroutine: 'CC1' */
                  S111 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
               }
               else
               {
                  if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "G", "")) == 0 )
                  {
                     AV59BarNor = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                     /* Using cursor P03ZF2 */
                     pr_default.execute(0, new Object[] {AV17MaqCod});
                     while ( (pr_default.getStatus(0) != 101) )
                     {
                        A1795GruOrd = P03ZF2_A1795GruOrd[0] ;
                        A1794GruLecMaq = P03ZF2_A1794GruLecMaq[0] ;
                        A1792GruBarPar = P03ZF2_A1792GruBarPar[0] ;
                        A1793GruBarReo = P03ZF2_A1793GruBarReo[0] ;
                        A1791GruBarCod = P03ZF2_A1791GruBarCod[0] ;
                        A396EmprCod = P03ZF2_A396EmprCod[0] ;
                        AV58BarGru = GXutil.str( A1791GruBarCod, 8, 0) + GXutil.str( A1793GruBarReo, 1, 0) + A1792GruBarPar ;
                        GXv_char7[0] = A396EmprCod ;
                        GXv_int2[0] = A1791GruBarCod ;
                        GXv_int3[0] = A1793GruBarReo ;
                        GXv_char6[0] = A1792GruBarPar ;
                        GXv_char4[0] = AV17MaqCod ;
                        GXv_int5[0] = AV53OrdLinA ;
                        GXv_char1[0] = AV54FasCodA ;
                        GXv_int9[0] = AV50Flag ;
                        GXv_char10[0] = httpContext.getMessage( "S", "") ;
                        new app.pbusag3(remoteHandle, context).execute( GXv_char7, GXv_int2, GXv_int3, GXv_char6, GXv_char4, GXv_int5, GXv_char1, GXv_int9, GXv_char10) ;
                        aplectou.this.A396EmprCod = GXv_char7[0] ;
                        aplectou.this.A1791GruBarCod = GXv_int2[0] ;
                        aplectou.this.A1793GruBarReo = GXv_int3[0] ;
                        aplectou.this.A1792GruBarPar = GXv_char6[0] ;
                        aplectou.this.AV17MaqCod = GXv_char4[0] ;
                        aplectou.this.AV53OrdLinA = GXv_int5[0] ;
                        aplectou.this.AV54FasCodA = GXv_char1[0] ;
                        aplectou.this.AV50Flag = GXv_int9[0] ;
                        AV71GruBarCod = A1791GruBarCod ;
                        AV72GruBarReo = A1793GruBarReo ;
                        AV73GruBarPar = A1792GruBarPar ;
                        if ( AV50Flag == 1 )
                        {
                           /* Execute user subroutine: 'CCALIDAD' */
                           S121 ();
                           if ( returnInSub )
                           {
                              pr_default.close(0);
                              returnInSub = true;
                              cleanup();
                              if (true) return;
                           }
                        }
                        pr_default.readNext(0);
                     }
                     pr_default.close(0);
                  }
               }
            }
            A153BarFasEst = (byte)(1) ;
            A165BarHorIni = (short)(GXutil.lval( GXutil.concat( GXutil.substring( GXutil.time( ), 1, 2), GXutil.substring( GXutil.time( ), 4, 2), ""))) ;
            A160BarFecRea = AV52Hoy ;
            A603MaqCodBis = AV17MaqCod ;
            AV88HisProDti = GXutil.serverNow( context, remoteHandle, pr_default) ;
            A4442BarFasDTI = AV88HisProDti ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         }
         GXv_char10[0] = A396EmprCod ;
         GXv_char7[0] = AV17MaqCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int11[0] = AV46GruOpeCod ;
         GXv_int5[0] = A194BarOrdLin ;
         GXv_char4[0] = A457FasCod ;
         GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int3[0] = AV29Turno ;
         GXv_int13[0] = (short)(0) ;
         GXv_date14[0] = AV52Hoy ;
         GXv_char1[0] = AV66BarComLin ;
         new app.pparpro(remoteHandle, context).execute( GXv_char10, GXv_char7, GXv_int2, GXv_int9, GXv_char6, GXv_int11, GXv_int5, GXv_char4, GXv_decimal12, GXv_int3, GXv_int13, GXv_date14, GXv_char1) ;
         aplectou.this.A396EmprCod = GXv_char10[0] ;
         aplectou.this.AV17MaqCod = GXv_char7[0] ;
         aplectou.this.A129BarCod = GXv_int2[0] ;
         aplectou.this.A132BarCodReo = GXv_int9[0] ;
         aplectou.this.A130BarCodPar = GXv_char6[0] ;
         aplectou.this.AV46GruOpeCod = GXv_int11[0] ;
         aplectou.this.A194BarOrdLin = GXv_int5[0] ;
         aplectou.this.A457FasCod = GXv_char4[0] ;
         aplectou.this.AV29Turno = GXv_int3[0] ;
         aplectou.this.AV52Hoy = GXv_date14[0] ;
         aplectou.this.AV66BarComLin = GXv_char1[0] ;
         GXv_char10[0] = AV15EmprCod ;
         GXv_char7[0] = AV17MaqCod ;
         GXv_int11[0] = A129BarCod ;
         GXv_int9[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_int2[0] = AV16OpeCod ;
         GXv_char4[0] = A457FasCod ;
         GXv_int13[0] = A194BarOrdLin ;
         GXv_int5[0] = AV21ParCod ;
         GXv_char1[0] = AV55Tiempo ;
         GXv_date14[0] = AV52Hoy ;
         GXv_char15[0] = AV23Tipo ;
         new app.pnueopt(remoteHandle, context).execute( GXv_char10, GXv_char7, GXv_int11, GXv_int9, GXv_char6, GXv_int2, GXv_char4, GXv_int13, GXv_int5, GXv_char1, GXv_date14, GXv_char15) ;
         aplectou.this.AV15EmprCod = GXv_char10[0] ;
         aplectou.this.AV17MaqCod = GXv_char7[0] ;
         aplectou.this.A129BarCod = GXv_int11[0] ;
         aplectou.this.A132BarCodReo = GXv_int9[0] ;
         aplectou.this.A130BarCodPar = GXv_char6[0] ;
         aplectou.this.AV16OpeCod = GXv_int2[0] ;
         aplectou.this.A457FasCod = GXv_char4[0] ;
         aplectou.this.A194BarOrdLin = GXv_int13[0] ;
         aplectou.this.AV21ParCod = GXv_int5[0] ;
         aplectou.this.AV55Tiempo = GXv_char1[0] ;
         aplectou.this.AV52Hoy = GXv_date14[0] ;
         aplectou.this.AV23Tipo = GXv_char15[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "H", "")) == 0 )
            {
               /* Using cursor P03ZF3 */
               pr_default.execute(1, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A396EmprCod = P03ZF3_A396EmprCod[0] ;
                  A119BarAgrCod = P03ZF3_A119BarAgrCod[0] ;
                  A124BarAgrReo = P03ZF3_A124BarAgrReo[0] ;
                  A122BarAgrPar = P03ZF3_A122BarAgrPar[0] ;
                  GXv_char15[0] = A396EmprCod ;
                  GXv_int11[0] = A119BarAgrCod ;
                  GXv_int9[0] = A124BarAgrReo ;
                  GXv_char10[0] = A122BarAgrPar ;
                  GXv_char7[0] = AV17MaqCod ;
                  GXv_int13[0] = AV53OrdLinA ;
                  GXv_char6[0] = AV54FasCodA ;
                  GXv_int3[0] = AV50Flag ;
                  GXv_char4[0] = httpContext.getMessage( "S", "") ;
                  new app.pbusagr(remoteHandle, context).execute( GXv_char15, GXv_int11, GXv_int9, GXv_char10, GXv_char7, GXv_int13, GXv_char6, GXv_int3, GXv_char4) ;
                  aplectou.this.A396EmprCod = GXv_char15[0] ;
                  aplectou.this.A119BarAgrCod = GXv_int11[0] ;
                  aplectou.this.A124BarAgrReo = GXv_int9[0] ;
                  aplectou.this.A122BarAgrPar = GXv_char10[0] ;
                  aplectou.this.AV17MaqCod = GXv_char7[0] ;
                  aplectou.this.AV53OrdLinA = GXv_int13[0] ;
                  aplectou.this.AV54FasCodA = GXv_char6[0] ;
                  aplectou.this.AV50Flag = GXv_int3[0] ;
                  if ( AV50Flag == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char10[0] = AV17MaqCod ;
                     GXv_int11[0] = A119BarAgrCod ;
                     GXv_int9[0] = A124BarAgrReo ;
                     GXv_char7[0] = A122BarAgrPar ;
                     GXv_int2[0] = AV46GruOpeCod ;
                     GXv_int13[0] = AV53OrdLinA ;
                     GXv_char6[0] = AV54FasCodA ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int3[0] = AV29Turno ;
                     GXv_int5[0] = (short)(0) ;
                     GXv_date14[0] = AV52Hoy ;
                     GXv_char4[0] = AV66BarComLin ;
                     new app.pparpro(remoteHandle, context).execute( GXv_char15, GXv_char10, GXv_int11, GXv_int9, GXv_char7, GXv_int2, GXv_int13, GXv_char6, GXv_decimal12, GXv_int3, GXv_int5, GXv_date14, GXv_char4) ;
                     aplectou.this.A396EmprCod = GXv_char15[0] ;
                     aplectou.this.AV17MaqCod = GXv_char10[0] ;
                     aplectou.this.A119BarAgrCod = GXv_int11[0] ;
                     aplectou.this.A124BarAgrReo = GXv_int9[0] ;
                     aplectou.this.A122BarAgrPar = GXv_char7[0] ;
                     aplectou.this.AV46GruOpeCod = GXv_int2[0] ;
                     aplectou.this.AV53OrdLinA = GXv_int13[0] ;
                     aplectou.this.AV54FasCodA = GXv_char6[0] ;
                     aplectou.this.AV29Turno = GXv_int3[0] ;
                     aplectou.this.AV52Hoy = GXv_date14[0] ;
                     aplectou.this.AV66BarComLin = GXv_char4[0] ;
                  }
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
         }
         if ( GXutil.strcmp(AV23Tipo, httpContext.getMessage( "G", "")) == 0 )
         {
            AV59BarNor = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            /* Using cursor P03ZF4 */
            pr_default.execute(2, new Object[] {AV17MaqCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1795GruOrd = P03ZF4_A1795GruOrd[0] ;
               A1794GruLecMaq = P03ZF4_A1794GruLecMaq[0] ;
               A1792GruBarPar = P03ZF4_A1792GruBarPar[0] ;
               A1793GruBarReo = P03ZF4_A1793GruBarReo[0] ;
               A1791GruBarCod = P03ZF4_A1791GruBarCod[0] ;
               A396EmprCod = P03ZF4_A396EmprCod[0] ;
               AV58BarGru = GXutil.str( A1791GruBarCod, 8, 0) + GXutil.str( A1793GruBarReo, 1, 0) + A1792GruBarPar ;
               if ( GXutil.strcmp(AV59BarNor, AV58BarGru) != 0 )
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_int11[0] = A1791GruBarCod ;
                  GXv_int9[0] = A1793GruBarReo ;
                  GXv_char10[0] = A1792GruBarPar ;
                  GXv_char7[0] = AV17MaqCod ;
                  GXv_int13[0] = AV53OrdLinA ;
                  GXv_char6[0] = AV54FasCodA ;
                  GXv_int3[0] = AV50Flag ;
                  GXv_char4[0] = httpContext.getMessage( "S", "") ;
                  new app.pbusag2(remoteHandle, context).execute( GXv_char15, GXv_int11, GXv_int9, GXv_char10, GXv_char7, GXv_int13, GXv_char6, GXv_int3, GXv_char4) ;
                  aplectou.this.A396EmprCod = GXv_char15[0] ;
                  aplectou.this.A1791GruBarCod = GXv_int11[0] ;
                  aplectou.this.A1793GruBarReo = GXv_int9[0] ;
                  aplectou.this.A1792GruBarPar = GXv_char10[0] ;
                  aplectou.this.AV17MaqCod = GXv_char7[0] ;
                  aplectou.this.AV53OrdLinA = GXv_int13[0] ;
                  aplectou.this.AV54FasCodA = GXv_char6[0] ;
                  aplectou.this.AV50Flag = GXv_int3[0] ;
                  if ( AV50Flag == 1 )
                  {
                     GXv_char15[0] = A396EmprCod ;
                     GXv_char10[0] = AV17MaqCod ;
                     GXv_int11[0] = A1791GruBarCod ;
                     GXv_int9[0] = A1793GruBarReo ;
                     GXv_char7[0] = A1792GruBarPar ;
                     GXv_int2[0] = AV46GruOpeCod ;
                     GXv_int13[0] = AV53OrdLinA ;
                     GXv_char6[0] = AV54FasCodA ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int3[0] = AV29Turno ;
                     GXv_int5[0] = (short)(0) ;
                     GXv_date14[0] = AV52Hoy ;
                     GXv_char4[0] = AV66BarComLin ;
                     new app.pparpro(remoteHandle, context).execute( GXv_char15, GXv_char10, GXv_int11, GXv_int9, GXv_char7, GXv_int2, GXv_int13, GXv_char6, GXv_decimal12, GXv_int3, GXv_int5, GXv_date14, GXv_char4) ;
                     aplectou.this.A396EmprCod = GXv_char15[0] ;
                     aplectou.this.AV17MaqCod = GXv_char10[0] ;
                     aplectou.this.A1791GruBarCod = GXv_int11[0] ;
                     aplectou.this.A1793GruBarReo = GXv_int9[0] ;
                     aplectou.this.A1792GruBarPar = GXv_char7[0] ;
                     aplectou.this.AV46GruOpeCod = GXv_int2[0] ;
                     aplectou.this.AV53OrdLinA = GXv_int13[0] ;
                     aplectou.this.AV54FasCodA = GXv_char6[0] ;
                     aplectou.this.AV29Turno = GXv_int3[0] ;
                     aplectou.this.AV52Hoy = GXv_date14[0] ;
                     aplectou.this.AV66BarComLin = GXv_char4[0] ;
                  }
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'CC1' Routine */
      returnInSub = false ;
      /* Using cursor P03ZF5 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV69BarOrdLin), AV70FasCod, Byte.valueOf(A153BarFasEst)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A457FasCod = P03ZF5_A457FasCod[0] ;
         A396EmprCod = P03ZF5_A396EmprCod[0] ;
         A165BarHorIni = P03ZF5_A165BarHorIni[0] ;
         A758ProCod = P03ZF5_A758ProCod[0] ;
         if ( (0==A165BarHorIni) )
         {
            GXv_char15[0] = A396EmprCod ;
            GXv_int11[0] = A129BarCod ;
            GXv_int9[0] = A132BarCodReo ;
            GXv_char10[0] = A130BarCodPar ;
            GXv_char7[0] = A758ProCod ;
            GXv_int13[0] = A194BarOrdLin ;
            GXv_int2[0] = AV16OpeCod ;
            GXv_char6[0] = httpContext.getMessage( "I", "") ;
            new app.controlcalidadhtd.pccing(remoteHandle, context).execute( GXv_char15, GXv_int11, GXv_int9, GXv_char10, GXv_char7, GXv_int13, GXv_int2, GXv_char6) ;
            aplectou.this.A396EmprCod = GXv_char15[0] ;
            aplectou.this.A129BarCod = GXv_int11[0] ;
            aplectou.this.A132BarCodReo = GXv_int9[0] ;
            aplectou.this.A130BarCodPar = GXv_char10[0] ;
            aplectou.this.A758ProCod = GXv_char7[0] ;
            aplectou.this.A194BarOrdLin = GXv_int13[0] ;
            aplectou.this.AV16OpeCod = GXv_int2[0] ;
            AV68FlagCC = (byte)(0) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'CCALIDAD' Routine */
      returnInSub = false ;
      GXv_char15[0] = AV15EmprCod ;
      GXv_int11[0] = AV18Barcada ;
      GXv_int9[0] = AV19BarCodReo ;
      GXv_char10[0] = AV20BarCodPar ;
      GXv_int13[0] = AV53OrdLinA ;
      GXv_char7[0] = AV54FasCodA ;
      GXv_int2[0] = AV16OpeCod ;
      GXv_int3[0] = AV68FlagCC ;
      new app.plecto2b(remoteHandle, context).execute( GXv_char15, GXv_int11, GXv_int9, GXv_char10, GXv_int13, GXv_char7, GXv_int2, GXv_int3) ;
      aplectou.this.AV15EmprCod = GXv_char15[0] ;
      aplectou.this.AV18Barcada = GXv_int11[0] ;
      aplectou.this.AV19BarCodReo = GXv_int9[0] ;
      aplectou.this.AV20BarCodPar = GXv_char10[0] ;
      aplectou.this.AV53OrdLinA = GXv_int13[0] ;
      aplectou.this.AV54FasCodA = GXv_char7[0] ;
      aplectou.this.AV16OpeCod = GXv_int2[0] ;
      aplectou.this.AV68FlagCC = GXv_int3[0] ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plectou.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aplectou.this.AV15EmprCod;
      this.aP1[0] = aplectou.this.AV16OpeCod;
      this.aP2[0] = aplectou.this.AV17MaqCod;
      this.aP3[0] = aplectou.this.A129BarCod;
      this.aP4[0] = aplectou.this.A132BarCodReo;
      this.aP5[0] = aplectou.this.A130BarCodPar;
      this.aP6[0] = aplectou.this.AV21ParCod;
      this.aP7[0] = aplectou.this.AV22FlagPa;
      this.aP8[0] = aplectou.this.AV23Tipo;
      this.aP9[0] = aplectou.this.AV24Mensa;
      this.aP10[0] = aplectou.this.AV66BarComLin;
      this.aP11[0] = aplectou.this.AV35BarCodAnt;
      this.aP12[0] = aplectou.this.AV36BarReoAnt;
      this.aP13[0] = aplectou.this.AV37BarParAnt;
      this.aP14[0] = aplectou.this.AV41OrdLinAnt;
      this.aP15[0] = aplectou.this.AV40FasCodAnt;
      this.aP16[0] = aplectou.this.AV39ParCodAnt;
      this.aP17[0] = aplectou.this.A194BarOrdLin;
      this.aP18[0] = aplectou.this.AV70FasCod;
      this.aP19[0] = aplectou.this.AV56LecTipEnt;
      this.aP20[0] = aplectou.this.AV115BarFactin;
      this.aP21[0] = aplectou.this.AV29Turno;
      this.aP22[0] = aplectou.this.AV52Hoy;
      this.aP23[0] = aplectou.this.AV55Tiempo;
      this.aP24[0] = aplectou.this.AV107Eliot;
      this.aP25[0] = aplectou.this.AV108BarEncCli;
      this.aP26[0] = aplectou.this.AV109BarDibCli;
      this.aP27[0] = aplectou.this.AV110dti;
      this.aP28[0] = aplectou.this.AV111Dtf;
      this.aP29[0] = aplectou.this.AV112Num_oes;
      this.aP30[0] = aplectou.this.AV113Num_oesc;
      this.aP31[0] = aplectou.this.AV106BarTipDis;
      this.aP32[0] = aplectou.this.AV114Conbd1004;
      this.aP33[0] = aplectou.this.AV97Msg_15;
      this.aP34[0] = aplectou.this.AV90RQ;
      this.aP35[0] = aplectou.this.AV31Fecha;
      this.aP36[0] = aplectou.this.AV62vMensaje;
      this.aP37[0] = aplectou.this.AV67EstadoAnt;
      this.aP38[0] = aplectou.this.AV99CodFasAnt;
      this.aP39[0] = aplectou.this.AV24Mensa;
      this.aP40[0] = aplectou.this.AV98FinAnt;
      this.aP41[0] = aplectou.this.AV99CodFasAnt;
      this.aP42[0] = aplectou.this.AV79Msg_6;
      this.aP43[0] = aplectou.this.AV47IniProd;
      this.aP44[0] = aplectou.this.A153BarFasEst;
      this.aP45[0] = aplectou.this.AV68FlagCC;
      this.aP46[0] = aplectou.this.AV95FlagFin;
      this.aP47[0] = aplectou.this.AV18Barcada;
      this.aP48[0] = aplectou.this.AV19BarCodReo;
      this.aP49[0] = aplectou.this.AV20BarCodPar;
      this.aP50[0] = aplectou.this.AV53OrdLinA;
      this.aP51[0] = aplectou.this.AV54FasCodA;
      this.aP52[0] = aplectou.this.AV16OpeCod;
      this.aP53[0] = aplectou.this.AV68FlagCC;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      Gx_msg = "" ;
      AV96Msg_14 = "" ;
      AV59BarNor = "" ;
      scmdbuf = "" ;
      P03ZF2_A1795GruOrd = new byte[1] ;
      P03ZF2_A1794GruLecMaq = new String[] {""} ;
      P03ZF2_A1792GruBarPar = new String[] {""} ;
      P03ZF2_A1793GruBarReo = new byte[1] ;
      P03ZF2_A1791GruBarCod = new int[1] ;
      P03ZF2_A396EmprCod = new String[] {""} ;
      A1794GruLecMaq = "" ;
      A1792GruBarPar = "" ;
      AV58BarGru = "" ;
      AV73GruBarPar = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      AV88HisProDti = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A457FasCod = "" ;
      GXv_char1 = new String[1] ;
      A150BarFacTin = "" ;
      P03ZF3_A129BarCod = new int[1] ;
      P03ZF3_A132BarCodReo = new byte[1] ;
      P03ZF3_A130BarCodPar = new String[] {""} ;
      P03ZF3_A396EmprCod = new String[] {""} ;
      P03ZF3_A119BarAgrCod = new int[1] ;
      P03ZF3_A124BarAgrReo = new byte[1] ;
      P03ZF3_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      P03ZF4_A1795GruOrd = new byte[1] ;
      P03ZF4_A1794GruLecMaq = new String[] {""} ;
      P03ZF4_A1792GruBarPar = new String[] {""} ;
      P03ZF4_A1793GruBarReo = new byte[1] ;
      P03ZF4_A1791GruBarCod = new int[1] ;
      P03ZF4_A396EmprCod = new String[] {""} ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int5 = new short[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      P03ZF5_A153BarFasEst = new byte[1] ;
      P03ZF5_A457FasCod = new String[] {""} ;
      P03ZF5_A194BarOrdLin = new short[1] ;
      P03ZF5_A130BarCodPar = new String[] {""} ;
      P03ZF5_A132BarCodReo = new byte[1] ;
      P03ZF5_A129BarCod = new int[1] ;
      P03ZF5_A396EmprCod = new String[] {""} ;
      P03ZF5_A165BarHorIni = new short[1] ;
      P03ZF5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      GXv_char6 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplectou__default(),
         new Object[] {
             new Object[] {
            P03ZF2_A1795GruOrd, P03ZF2_A1794GruLecMaq, P03ZF2_A1792GruBarPar, P03ZF2_A1793GruBarReo, P03ZF2_A1791GruBarCod, P03ZF2_A396EmprCod
            }
            , new Object[] {
            P03ZF3_A129BarCod, P03ZF3_A132BarCodReo, P03ZF3_A130BarCodPar, P03ZF3_A396EmprCod, P03ZF3_A119BarAgrCod, P03ZF3_A124BarAgrReo, P03ZF3_A122BarAgrPar
            }
            , new Object[] {
            P03ZF4_A1795GruOrd, P03ZF4_A1794GruLecMaq, P03ZF4_A1792GruBarPar, P03ZF4_A1793GruBarReo, P03ZF4_A1791GruBarCod, P03ZF4_A396EmprCod
            }
            , new Object[] {
            P03ZF5_A153BarFasEst, P03ZF5_A457FasCod, P03ZF5_A194BarOrdLin, P03ZF5_A130BarCodPar, P03ZF5_A132BarCodReo, P03ZF5_A129BarCod, P03ZF5_A396EmprCod, P03ZF5_A165BarHorIni, P03ZF5_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV22FlagPa ;
   private byte AV36BarReoAnt ;
   private byte AV29Turno ;
   private byte AV107Eliot ;
   private byte AV114Conbd1004 ;
   private byte AV90RQ ;
   private byte AV67EstadoAnt ;
   private byte AV47IniProd ;
   private byte A153BarFasEst ;
   private byte AV68FlagCC ;
   private byte AV95FlagFin ;
   private byte AV19BarCodReo ;
   private byte AV51Loop ;
   private byte GXt_int8 ;
   private byte A1795GruOrd ;
   private byte A1793GruBarReo ;
   private byte AV50Flag ;
   private byte AV72GruBarReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int9[] ;
   private byte GXv_int3[] ;
   private short AV21ParCod ;
   private short AV41OrdLinAnt ;
   private short AV39ParCodAnt ;
   private short A194BarOrdLin ;
   private short AV112Num_oes ;
   private short AV113Num_oesc ;
   private short AV53OrdLinA ;
   private short A165BarHorIni ;
   private short GXv_int5[] ;
   private short AV69BarOrdLin ;
   private short GXv_int13[] ;
   private short Gx_err ;
   private int AV16OpeCod ;
   private int A129BarCod ;
   private int AV35BarCodAnt ;
   private int AV18Barcada ;
   private int A1791GruBarCod ;
   private int AV71GruBarCod ;
   private int AV46GruOpeCod ;
   private int A119BarAgrCod ;
   private int AV25BarCod ;
   private int GXv_int11[] ;
   private int GXv_int2[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String AV15EmprCod ;
   private String AV17MaqCod ;
   private String A130BarCodPar ;
   private String AV23Tipo ;
   private String AV24Mensa ;
   private String AV66BarComLin ;
   private String AV37BarParAnt ;
   private String AV40FasCodAnt ;
   private String AV70FasCod ;
   private String AV56LecTipEnt ;
   private String AV115BarFactin ;
   private String AV55Tiempo ;
   private String AV108BarEncCli ;
   private String AV109BarDibCli ;
   private String AV106BarTipDis ;
   private String AV97Msg_15 ;
   private String AV62vMensaje ;
   private String AV99CodFasAnt ;
   private String AV98FinAnt ;
   private String AV79Msg_6 ;
   private String AV20BarCodPar ;
   private String AV54FasCodA ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV96Msg_14 ;
   private String AV59BarNor ;
   private String scmdbuf ;
   private String A1794GruLecMaq ;
   private String A1792GruBarPar ;
   private String AV58BarGru ;
   private String AV73GruBarPar ;
   private String A603MaqCodBis ;
   private String A457FasCod ;
   private String GXv_char1[] ;
   private String A150BarFacTin ;
   private String A122BarAgrPar ;
   private String GXv_char4[] ;
   private String A758ProCod ;
   private String GXv_char6[] ;
   private String GXv_char15[] ;
   private String GXv_char10[] ;
   private String GXv_char7[] ;
   private java.util.Date AV110dti ;
   private java.util.Date AV111Dtf ;
   private java.util.Date AV88HisProDti ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV52Hoy ;
   private java.util.Date AV31Fecha ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date GXv_date14[] ;
   private boolean returnInSub ;
   private byte[] aP53 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private byte[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private byte[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private String[] aP15 ;
   private short[] aP16 ;
   private short[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private byte[] aP21 ;
   private java.util.Date[] aP22 ;
   private String[] aP23 ;
   private byte[] aP24 ;
   private String[] aP25 ;
   private String[] aP26 ;
   private java.util.Date[] aP27 ;
   private java.util.Date[] aP28 ;
   private short[] aP29 ;
   private short[] aP30 ;
   private String[] aP31 ;
   private byte[] aP32 ;
   private String[] aP33 ;
   private byte[] aP34 ;
   private java.util.Date[] aP35 ;
   private String[] aP36 ;
   private byte[] aP37 ;
   private String[] aP38 ;
   private String[] aP39 ;
   private String[] aP40 ;
   private String[] aP41 ;
   private String[] aP42 ;
   private byte[] aP43 ;
   private byte[] aP44 ;
   private byte[] aP45 ;
   private byte[] aP46 ;
   private int[] aP47 ;
   private byte[] aP48 ;
   private String[] aP49 ;
   private short[] aP50 ;
   private String[] aP51 ;
   private int[] aP52 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03ZF2_A1795GruOrd ;
   private String[] P03ZF2_A1794GruLecMaq ;
   private String[] P03ZF2_A1792GruBarPar ;
   private byte[] P03ZF2_A1793GruBarReo ;
   private int[] P03ZF2_A1791GruBarCod ;
   private String[] P03ZF2_A396EmprCod ;
   private int[] P03ZF3_A129BarCod ;
   private byte[] P03ZF3_A132BarCodReo ;
   private String[] P03ZF3_A130BarCodPar ;
   private String[] P03ZF3_A396EmprCod ;
   private int[] P03ZF3_A119BarAgrCod ;
   private byte[] P03ZF3_A124BarAgrReo ;
   private String[] P03ZF3_A122BarAgrPar ;
   private byte[] P03ZF4_A1795GruOrd ;
   private String[] P03ZF4_A1794GruLecMaq ;
   private String[] P03ZF4_A1792GruBarPar ;
   private byte[] P03ZF4_A1793GruBarReo ;
   private int[] P03ZF4_A1791GruBarCod ;
   private String[] P03ZF4_A396EmprCod ;
   private byte[] P03ZF5_A153BarFasEst ;
   private String[] P03ZF5_A457FasCod ;
   private short[] P03ZF5_A194BarOrdLin ;
   private String[] P03ZF5_A130BarCodPar ;
   private byte[] P03ZF5_A132BarCodReo ;
   private int[] P03ZF5_A129BarCod ;
   private String[] P03ZF5_A396EmprCod ;
   private short[] P03ZF5_A165BarHorIni ;
   private String[] P03ZF5_A758ProCod ;
}

final  class aplectou__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZF2", "SELECT GruOrd, GruLecMaq, GruBarPar, GruBarReo, GruBarCod, EmprCod FROM TXPGRULEC WHERE (GruLecMaq = ?) AND (GruOrd = 1) ORDER BY EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZF3", "SELECT BarCod, BarCodReo, BarCodPar, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZF4", "SELECT GruOrd, GruLecMaq, GruBarPar, GruBarReo, GruBarCod, EmprCod FROM TXPGRULEC WHERE (GruLecMaq = ?) AND (GruOrd = 1) ORDER BY EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZF5", "SELECT BarFasEst, FasCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, BarHorIni, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and FasCod = ?) AND (BarFasEst = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
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
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

