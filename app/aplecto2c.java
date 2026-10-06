package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplecto2c extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplecto2c pgm = new aplecto2c (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      String[] aP1 = new String[] {""};
      java.math.BigDecimal[] aP2 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      String[] aP3 = new String[] {""};
      String[] aP4 = new String[] {""};
      String[] aP5 = new String[] {""};
      String[] aP6 = new String[] {""};
      String[] aP7 = new String[] {""};
      String[] aP8 = new String[] {""};
      String[] aP9 = new String[] {""};
      String[] aP10 = new String[] {""};
      String[] aP11 = new String[] {""};
      String[] aP12 = new String[] {""};
      String[] aP13 = new String[] {""};
      String[] aP14 = new String[] {""};
      String[] aP15 = new String[] {""};
      String[] aP16 = new String[] {""};
      String[] aP17 = new String[] {""};
      String[] aP18 = new String[] {""};
      byte[] aP19 = new byte[] {0};
      byte[] aP20 = new byte[] {0};
      byte[] aP21 = new byte[] {0};
      byte[] aP22 = new byte[] {0};
      byte[] aP23 = new byte[] {0};
      byte[] aP24 = new byte[] {0};
      int[] aP25 = new int[] {0};
      int[] aP26 = new int[] {0};
      java.util.Date[] aP27 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP28 = new String[] {""};
      java.util.Date[] aP29 = new java.util.Date[] {GXutil.nullDate()};
      java.util.Date[] aP30 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP31 = new String[] {""};
      String[] aP32 = new String[] {""};
      int[] aP33 = new int[] {0};
      byte[] aP34 = new byte[] {0};
      String[] aP35 = new String[] {""};
      byte[] aP36 = new byte[] {0};
      byte[] aP37 = new byte[] {0};
      int[] aP38 = new int[] {0};
      short[] aP39 = new short[] {0};
      String[] aP40 = new String[] {""};
      short[] aP41 = new short[] {0};
      java.util.Date[] aP42 = new java.util.Date[] {GXutil.nullDate()};
      byte[] aP43 = new byte[] {0};
      String[] aP44 = new String[] {""};
      String[] aP45 = new String[] {""};
      String[] aP46 = new String[] {""};
      String[] aP47 = new String[] {""};
      String[] aP48 = new String[] {""};
      String[] aP49 = new String[] {""};
      byte[] aP50 = new byte[] {0};
      int[] aP51 = new int[] {0};
      byte[] aP52 = new byte[] {0};
      String[] aP53 = new String[] {""};
      String[] aP54 = new String[] {""};
      byte[] aP55 = new byte[] {0};
      int[] aP56 = new int[] {0};
      byte[] aP57 = new byte[] {0};
      String[] aP58 = new String[] {""};
      String[] aP59 = new String[] {""};
      byte[] aP60 = new byte[] {0};
      String[] aP61 = new String[] {""};
      String[] aP62 = new String[] {""};
      byte[] aP63 = new byte[] {0};
      byte[] aP64 = new byte[] {0};
      String[] aP65 = new String[] {""};
      short[] aP66 = new short[] {0};
      byte[] aP67 = new byte[] {0};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (String) args[1];
         aP2[0] = (java.math.BigDecimal) DecimalUtil.stringToDec( args[2]);
         aP3[0] = (String) args[3];
         aP4[0] = (String) args[4];
         aP5[0] = (String) args[5];
         aP6[0] = (String) args[6];
         aP7[0] = (String) args[7];
         aP8[0] = (String) args[8];
         aP9[0] = (String) args[9];
         aP10[0] = (String) args[10];
         aP11[0] = (String) args[11];
         aP12[0] = (String) args[12];
         aP13[0] = (String) args[13];
         aP14[0] = (String) args[14];
         aP15[0] = (String) args[15];
         aP16[0] = (String) args[16];
         aP17[0] = (String) args[17];
         aP18[0] = (String) args[18];
         aP19[0] = (byte) GXutil.lval( args[19]);
         aP20[0] = (byte) GXutil.lval( args[20]);
         aP21[0] = (byte) GXutil.lval( args[21]);
         aP22[0] = (byte) GXutil.lval( args[22]);
         aP23[0] = (byte) GXutil.lval( args[23]);
         aP24[0] = (byte) GXutil.lval( args[24]);
         aP25[0] = (int) GXutil.lval( args[25]);
         aP26[0] = (int) GXutil.lval( args[26]);
         aP27[0] = (java.util.Date) localUtil.ctot( args[27], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP28[0] = (String) args[28];
         aP29[0] = (java.util.Date) localUtil.ctod( args[29], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP30[0] = (java.util.Date) localUtil.ctod( args[30], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP31[0] = (String) args[31];
         aP32[0] = (String) args[32];
         aP33[0] = (int) GXutil.lval( args[33]);
         aP34[0] = (byte) GXutil.lval( args[34]);
         aP35[0] = (String) args[35];
         aP36[0] = (byte) GXutil.lval( args[36]);
         aP37[0] = (byte) GXutil.lval( args[37]);
         aP38[0] = (int) GXutil.lval( args[38]);
         aP39[0] = (short) GXutil.lval( args[39]);
         aP40[0] = (String) args[40];
         aP41[0] = (short) GXutil.lval( args[41]);
         aP42[0] = (java.util.Date) localUtil.ctod( args[42], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP43[0] = (byte) GXutil.lval( args[43]);
         aP44[0] = (String) args[44];
         aP45[0] = (String) args[45];
         aP46[0] = (String) args[46];
         aP47[0] = (String) args[47];
         aP48[0] = (String) args[48];
         aP49[0] = (String) args[49];
         aP50[0] = (byte) GXutil.lval( args[50]);
         aP51[0] = (int) GXutil.lval( args[51]);
         aP52[0] = (byte) GXutil.lval( args[52]);
         aP53[0] = (String) args[53];
         aP54[0] = (String) args[54];
         aP55[0] = (byte) GXutil.lval( args[55]);
         aP56[0] = (int) GXutil.lval( args[56]);
         aP57[0] = (byte) GXutil.lval( args[57]);
         aP58[0] = (String) args[58];
         aP59[0] = (String) args[59];
         aP60[0] = (byte) GXutil.lval( args[60]);
         aP61[0] = (String) args[61];
         aP62[0] = (String) args[62];
         aP63[0] = (byte) GXutil.lval( args[63]);
         aP64[0] = (byte) GXutil.lval( args[64]);
         aP65[0] = (String) args[65];
         aP66[0] = (short) GXutil.lval( args[66]);
         aP67[0] = (byte) GXutil.lval( args[67]);
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
   }

   public aplecto2c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplecto2c.class ), "" );
   }

   public aplecto2c( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 ,
                           String[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 ,
                           String[] aP12 ,
                           String[] aP13 ,
                           String[] aP14 ,
                           String[] aP15 ,
                           String[] aP16 ,
                           String[] aP17 ,
                           String[] aP18 ,
                           byte[] aP19 ,
                           byte[] aP20 ,
                           byte[] aP21 ,
                           byte[] aP22 ,
                           byte[] aP23 ,
                           byte[] aP24 ,
                           int[] aP25 ,
                           int[] aP26 ,
                           java.util.Date[] aP27 ,
                           String[] aP28 ,
                           java.util.Date[] aP29 ,
                           java.util.Date[] aP30 ,
                           String[] aP31 ,
                           String[] aP32 ,
                           int[] aP33 ,
                           byte[] aP34 ,
                           String[] aP35 ,
                           byte[] aP36 ,
                           byte[] aP37 ,
                           int[] aP38 ,
                           short[] aP39 ,
                           String[] aP40 ,
                           short[] aP41 ,
                           java.util.Date[] aP42 ,
                           byte[] aP43 ,
                           String[] aP44 ,
                           String[] aP45 ,
                           String[] aP46 ,
                           String[] aP47 ,
                           String[] aP48 ,
                           String[] aP49 ,
                           byte[] aP50 ,
                           int[] aP51 ,
                           byte[] aP52 ,
                           String[] aP53 ,
                           String[] aP54 ,
                           byte[] aP55 ,
                           int[] aP56 ,
                           byte[] aP57 ,
                           String[] aP58 ,
                           String[] aP59 ,
                           byte[] aP60 ,
                           String[] aP61 ,
                           String[] aP62 ,
                           byte[] aP63 ,
                           byte[] aP64 ,
                           String[] aP65 ,
                           short[] aP66 )
   {
      aplecto2c.this.aP67 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
      return aP67[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        String[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        byte[] aP19 ,
                        byte[] aP20 ,
                        byte[] aP21 ,
                        byte[] aP22 ,
                        byte[] aP23 ,
                        byte[] aP24 ,
                        int[] aP25 ,
                        int[] aP26 ,
                        java.util.Date[] aP27 ,
                        String[] aP28 ,
                        java.util.Date[] aP29 ,
                        java.util.Date[] aP30 ,
                        String[] aP31 ,
                        String[] aP32 ,
                        int[] aP33 ,
                        byte[] aP34 ,
                        String[] aP35 ,
                        byte[] aP36 ,
                        byte[] aP37 ,
                        int[] aP38 ,
                        short[] aP39 ,
                        String[] aP40 ,
                        short[] aP41 ,
                        java.util.Date[] aP42 ,
                        byte[] aP43 ,
                        String[] aP44 ,
                        String[] aP45 ,
                        String[] aP46 ,
                        String[] aP47 ,
                        String[] aP48 ,
                        String[] aP49 ,
                        byte[] aP50 ,
                        int[] aP51 ,
                        byte[] aP52 ,
                        String[] aP53 ,
                        String[] aP54 ,
                        byte[] aP55 ,
                        int[] aP56 ,
                        byte[] aP57 ,
                        String[] aP58 ,
                        String[] aP59 ,
                        byte[] aP60 ,
                        String[] aP61 ,
                        String[] aP62 ,
                        byte[] aP63 ,
                        byte[] aP64 ,
                        String[] aP65 ,
                        short[] aP66 ,
                        byte[] aP67 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39, aP40, aP41, aP42, aP43, aP44, aP45, aP46, aP47, aP48, aP49, aP50, aP51, aP52, aP53, aP54, aP55, aP56, aP57, aP58, aP59, aP60, aP61, aP62, aP63, aP64, aP65, aP66, aP67);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             String[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             byte[] aP19 ,
                             byte[] aP20 ,
                             byte[] aP21 ,
                             byte[] aP22 ,
                             byte[] aP23 ,
                             byte[] aP24 ,
                             int[] aP25 ,
                             int[] aP26 ,
                             java.util.Date[] aP27 ,
                             String[] aP28 ,
                             java.util.Date[] aP29 ,
                             java.util.Date[] aP30 ,
                             String[] aP31 ,
                             String[] aP32 ,
                             int[] aP33 ,
                             byte[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             byte[] aP37 ,
                             int[] aP38 ,
                             short[] aP39 ,
                             String[] aP40 ,
                             short[] aP41 ,
                             java.util.Date[] aP42 ,
                             byte[] aP43 ,
                             String[] aP44 ,
                             String[] aP45 ,
                             String[] aP46 ,
                             String[] aP47 ,
                             String[] aP48 ,
                             String[] aP49 ,
                             byte[] aP50 ,
                             int[] aP51 ,
                             byte[] aP52 ,
                             String[] aP53 ,
                             String[] aP54 ,
                             byte[] aP55 ,
                             int[] aP56 ,
                             byte[] aP57 ,
                             String[] aP58 ,
                             String[] aP59 ,
                             byte[] aP60 ,
                             String[] aP61 ,
                             String[] aP62 ,
                             byte[] aP63 ,
                             byte[] aP64 ,
                             String[] aP65 ,
                             short[] aP66 ,
                             byte[] aP67 )
   {
      aplecto2c.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      aplecto2c.this.AV100Dirori = aP1[0];
      this.aP1 = aP1;
      aplecto2c.this.AV101Num_fic = aP2[0];
      this.aP2 = aP2;
      aplecto2c.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      aplecto2c.this.AV74Msg_1 = aP4[0];
      this.aP4 = aP4;
      aplecto2c.this.AV83Msg_10 = aP5[0];
      this.aP5 = aP5;
      aplecto2c.this.AV84Msg_11 = aP6[0];
      this.aP6 = aP6;
      aplecto2c.this.AV85Msg_12 = aP7[0];
      this.aP7 = aP7;
      aplecto2c.this.AV86Msg_13 = aP8[0];
      this.aP8 = aP8;
      aplecto2c.this.AV96Msg_14 = aP9[0];
      this.aP9 = aP9;
      aplecto2c.this.AV97Msg_15 = aP10[0];
      this.aP10 = aP10;
      aplecto2c.this.AV75Msg_2 = aP11[0];
      this.aP11 = aP11;
      aplecto2c.this.AV76Msg_3 = aP12[0];
      this.aP12 = aP12;
      aplecto2c.this.AV77Msg_4 = aP13[0];
      this.aP13 = aP13;
      aplecto2c.this.AV78Msg_5 = aP14[0];
      this.aP14 = aP14;
      aplecto2c.this.AV79Msg_6 = aP15[0];
      this.aP15 = aP15;
      aplecto2c.this.AV80Msg_7 = aP16[0];
      this.aP16 = aP16;
      aplecto2c.this.AV81Msg_8 = aP17[0];
      this.aP17 = aP17;
      aplecto2c.this.AV82Msg_9 = aP18[0];
      this.aP18 = aP18;
      aplecto2c.this.AV68FlagCC = aP19[0];
      this.aP19 = aP19;
      aplecto2c.this.AV89Jpf = aP20[0];
      this.aP20 = aP20;
      aplecto2c.this.AV90RQ = aP21[0];
      this.aP21 = aP21;
      aplecto2c.this.AV91Texfina = aP22[0];
      this.aP22 = aP22;
      aplecto2c.this.AV95FlagFin = aP23[0];
      this.aP23 = aP23;
      aplecto2c.this.AV29Turno = aP24[0];
      this.aP24 = aP24;
      aplecto2c.this.AV16OpeCod = aP25[0];
      this.aP25 = aP25;
      aplecto2c.this.AV46GruOpeCod = aP26[0];
      this.aP26 = aP26;
      aplecto2c.this.AV88HisProDti = aP27[0];
      this.aP27 = aP27;
      aplecto2c.this.AV92Horcar = aP28[0];
      this.aP28 = aP28;
      aplecto2c.this.AV93FecServ = aP29[0];
      this.aP29 = aP29;
      aplecto2c.this.AV52Hoy = aP30[0];
      this.aP30 = aP30;
      aplecto2c.this.AV55Tiempo = aP31[0];
      this.aP31 = aP31;
      aplecto2c.this.AV17MaqCod = aP32[0];
      this.aP32 = aP32;
      aplecto2c.this.AV35BarCodAnt = aP33[0];
      this.aP33 = aP33;
      aplecto2c.this.AV36BarReoAnt = aP34[0];
      this.aP34 = aP34;
      aplecto2c.this.AV37BarParAnt = aP35[0];
      this.aP35 = aP35;
      aplecto2c.this.AV60Cierre1 = aP36[0];
      this.aP36 = aP36;
      aplecto2c.this.AV30Maquin = aP37[0];
      this.aP37 = aP37;
      aplecto2c.this.AV38OpeCodAnt = aP38[0];
      this.aP38 = aP38;
      aplecto2c.this.AV39ParCodAnt = aP39[0];
      this.aP39 = aP39;
      aplecto2c.this.AV40FasCodAnt = aP40[0];
      this.aP40 = aP40;
      aplecto2c.this.AV41OrdLinAnt = aP41[0];
      this.aP41 = aP41;
      aplecto2c.this.AV31Fecha = aP42[0];
      this.aP42 = aP42;
      aplecto2c.this.AV30Maquin = aP43[0];
      this.aP43 = aP43;
      aplecto2c.this.AV45Hora = aP44[0];
      this.aP44 = aP44;
      aplecto2c.this.AV56LecTipEnt = aP45[0];
      this.aP45 = aP45;
      aplecto2c.this.AV64vEstParo = aP46[0];
      this.aP46 = aP46;
      aplecto2c.this.AV65EstFase = aP47[0];
      this.aP47 = aP47;
      aplecto2c.this.AV43BarAct = aP48[0];
      this.aP48 = aP48;
      aplecto2c.this.AV44BarAnt = aP49[0];
      this.aP49 = aP49;
      aplecto2c.this.AV22FlagPa = aP50[0];
      this.aP50 = aP50;
      aplecto2c.this.AV25BarCod = aP51[0];
      this.aP51 = aP51;
      aplecto2c.this.AV26BarReo = aP52[0];
      this.aP52 = aP52;
      aplecto2c.this.AV27BarPar = aP53[0];
      this.aP53 = aP53;
      aplecto2c.this.AV57TipoEnt = aP54[0];
      this.aP54 = aP54;
      aplecto2c.this.AV67EstadoAnt = aP55[0];
      this.aP55 = aP55;
      aplecto2c.this.AV18Barcada = aP56[0];
      this.aP56 = aP56;
      aplecto2c.this.AV19BarCodReo = aP57[0];
      this.aP57 = aP57;
      aplecto2c.this.AV20BarCodPar = aP58[0];
      this.aP58 = aP58;
      aplecto2c.this.AV23Tipo = aP59[0];
      this.aP59 = aP59;
      aplecto2c.this.AV47IniProd = aP60[0];
      this.aP60 = aP60;
      aplecto2c.this.AV24Mensa = aP61[0];
      this.aP61 = aP61;
      aplecto2c.this.AV62vMensaje = aP62[0];
      this.aP62 = aP62;
      aplecto2c.this.AV32FlagFA = aP63[0];
      this.aP63 = aP63;
      aplecto2c.this.AV28MaqFas = aP64[0];
      this.aP64 = aP64;
      aplecto2c.this.AV70FasCod = aP65[0];
      this.aP65 = aP65;
      aplecto2c.this.AV69BarOrdLin = aP66[0];
      this.aP66 = aP66;
      aplecto2c.this.AV105Traza = aP67[0];
      this.aP67 = aP67;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plecto2c.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aplecto2c.this.AV15EmprCod;
      this.aP1[0] = aplecto2c.this.AV100Dirori;
      this.aP2[0] = aplecto2c.this.AV101Num_fic;
      this.aP3[0] = aplecto2c.this.Gx_msg;
      this.aP4[0] = aplecto2c.this.AV74Msg_1;
      this.aP5[0] = aplecto2c.this.AV83Msg_10;
      this.aP6[0] = aplecto2c.this.AV84Msg_11;
      this.aP7[0] = aplecto2c.this.AV85Msg_12;
      this.aP8[0] = aplecto2c.this.AV86Msg_13;
      this.aP9[0] = aplecto2c.this.AV96Msg_14;
      this.aP10[0] = aplecto2c.this.AV97Msg_15;
      this.aP11[0] = aplecto2c.this.AV75Msg_2;
      this.aP12[0] = aplecto2c.this.AV76Msg_3;
      this.aP13[0] = aplecto2c.this.AV77Msg_4;
      this.aP14[0] = aplecto2c.this.AV78Msg_5;
      this.aP15[0] = aplecto2c.this.AV79Msg_6;
      this.aP16[0] = aplecto2c.this.AV80Msg_7;
      this.aP17[0] = aplecto2c.this.AV81Msg_8;
      this.aP18[0] = aplecto2c.this.AV82Msg_9;
      this.aP19[0] = aplecto2c.this.AV68FlagCC;
      this.aP20[0] = aplecto2c.this.AV89Jpf;
      this.aP21[0] = aplecto2c.this.AV90RQ;
      this.aP22[0] = aplecto2c.this.AV91Texfina;
      this.aP23[0] = aplecto2c.this.AV95FlagFin;
      this.aP24[0] = aplecto2c.this.AV29Turno;
      this.aP25[0] = aplecto2c.this.AV16OpeCod;
      this.aP26[0] = aplecto2c.this.AV46GruOpeCod;
      this.aP27[0] = aplecto2c.this.AV88HisProDti;
      this.aP28[0] = aplecto2c.this.AV92Horcar;
      this.aP29[0] = aplecto2c.this.AV93FecServ;
      this.aP30[0] = aplecto2c.this.AV52Hoy;
      this.aP31[0] = aplecto2c.this.AV55Tiempo;
      this.aP32[0] = aplecto2c.this.AV17MaqCod;
      this.aP33[0] = aplecto2c.this.AV35BarCodAnt;
      this.aP34[0] = aplecto2c.this.AV36BarReoAnt;
      this.aP35[0] = aplecto2c.this.AV37BarParAnt;
      this.aP36[0] = aplecto2c.this.AV60Cierre1;
      this.aP37[0] = aplecto2c.this.AV30Maquin;
      this.aP38[0] = aplecto2c.this.AV38OpeCodAnt;
      this.aP39[0] = aplecto2c.this.AV39ParCodAnt;
      this.aP40[0] = aplecto2c.this.AV40FasCodAnt;
      this.aP41[0] = aplecto2c.this.AV41OrdLinAnt;
      this.aP42[0] = aplecto2c.this.AV31Fecha;
      this.aP43[0] = aplecto2c.this.AV30Maquin;
      this.aP44[0] = aplecto2c.this.AV45Hora;
      this.aP45[0] = aplecto2c.this.AV56LecTipEnt;
      this.aP46[0] = aplecto2c.this.AV64vEstParo;
      this.aP47[0] = aplecto2c.this.AV65EstFase;
      this.aP48[0] = aplecto2c.this.AV43BarAct;
      this.aP49[0] = aplecto2c.this.AV44BarAnt;
      this.aP50[0] = aplecto2c.this.AV22FlagPa;
      this.aP51[0] = aplecto2c.this.AV25BarCod;
      this.aP52[0] = aplecto2c.this.AV26BarReo;
      this.aP53[0] = aplecto2c.this.AV27BarPar;
      this.aP54[0] = aplecto2c.this.AV57TipoEnt;
      this.aP55[0] = aplecto2c.this.AV67EstadoAnt;
      this.aP56[0] = aplecto2c.this.AV18Barcada;
      this.aP57[0] = aplecto2c.this.AV19BarCodReo;
      this.aP58[0] = aplecto2c.this.AV20BarCodPar;
      this.aP59[0] = aplecto2c.this.AV23Tipo;
      this.aP60[0] = aplecto2c.this.AV47IniProd;
      this.aP61[0] = aplecto2c.this.AV24Mensa;
      this.aP62[0] = aplecto2c.this.AV62vMensaje;
      this.aP63[0] = aplecto2c.this.AV32FlagFA;
      this.aP64[0] = aplecto2c.this.AV28MaqFas;
      this.aP65[0] = aplecto2c.this.AV70FasCod;
      this.aP66[0] = aplecto2c.this.AV69BarOrdLin;
      this.aP67[0] = aplecto2c.this.AV105Traza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV68FlagCC ;
   private byte AV89Jpf ;
   private byte AV90RQ ;
   private byte AV91Texfina ;
   private byte AV95FlagFin ;
   private byte AV29Turno ;
   private byte AV36BarReoAnt ;
   private byte AV60Cierre1 ;
   private byte AV30Maquin ;
   private byte AV22FlagPa ;
   private byte AV26BarReo ;
   private byte AV67EstadoAnt ;
   private byte AV19BarCodReo ;
   private byte AV47IniProd ;
   private byte AV32FlagFA ;
   private byte AV28MaqFas ;
   private byte AV105Traza ;
   private short AV39ParCodAnt ;
   private short AV41OrdLinAnt ;
   private short AV69BarOrdLin ;
   private short Gx_err ;
   private int AV16OpeCod ;
   private int AV46GruOpeCod ;
   private int AV35BarCodAnt ;
   private int AV38OpeCodAnt ;
   private int AV25BarCod ;
   private int AV18Barcada ;
   private java.math.BigDecimal AV101Num_fic ;
   private String AV15EmprCod ;
   private String AV100Dirori ;
   private String Gx_msg ;
   private String AV74Msg_1 ;
   private String AV83Msg_10 ;
   private String AV84Msg_11 ;
   private String AV85Msg_12 ;
   private String AV86Msg_13 ;
   private String AV96Msg_14 ;
   private String AV97Msg_15 ;
   private String AV75Msg_2 ;
   private String AV76Msg_3 ;
   private String AV77Msg_4 ;
   private String AV78Msg_5 ;
   private String AV79Msg_6 ;
   private String AV80Msg_7 ;
   private String AV81Msg_8 ;
   private String AV82Msg_9 ;
   private String AV92Horcar ;
   private String AV55Tiempo ;
   private String AV17MaqCod ;
   private String AV37BarParAnt ;
   private String AV40FasCodAnt ;
   private String AV45Hora ;
   private String AV56LecTipEnt ;
   private String AV64vEstParo ;
   private String AV65EstFase ;
   private String AV43BarAct ;
   private String AV44BarAnt ;
   private String AV27BarPar ;
   private String AV57TipoEnt ;
   private String AV20BarCodPar ;
   private String AV23Tipo ;
   private String AV24Mensa ;
   private String AV62vMensaje ;
   private String AV70FasCod ;
   private java.util.Date AV88HisProDti ;
   private java.util.Date AV93FecServ ;
   private java.util.Date AV52Hoy ;
   private java.util.Date AV31Fecha ;
   private byte[] aP67 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private String[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private byte[] aP19 ;
   private byte[] aP20 ;
   private byte[] aP21 ;
   private byte[] aP22 ;
   private byte[] aP23 ;
   private byte[] aP24 ;
   private int[] aP25 ;
   private int[] aP26 ;
   private java.util.Date[] aP27 ;
   private String[] aP28 ;
   private java.util.Date[] aP29 ;
   private java.util.Date[] aP30 ;
   private String[] aP31 ;
   private String[] aP32 ;
   private int[] aP33 ;
   private byte[] aP34 ;
   private String[] aP35 ;
   private byte[] aP36 ;
   private byte[] aP37 ;
   private int[] aP38 ;
   private short[] aP39 ;
   private String[] aP40 ;
   private short[] aP41 ;
   private java.util.Date[] aP42 ;
   private byte[] aP43 ;
   private String[] aP44 ;
   private String[] aP45 ;
   private String[] aP46 ;
   private String[] aP47 ;
   private String[] aP48 ;
   private String[] aP49 ;
   private byte[] aP50 ;
   private int[] aP51 ;
   private byte[] aP52 ;
   private String[] aP53 ;
   private String[] aP54 ;
   private byte[] aP55 ;
   private int[] aP56 ;
   private byte[] aP57 ;
   private String[] aP58 ;
   private String[] aP59 ;
   private byte[] aP60 ;
   private String[] aP61 ;
   private String[] aP62 ;
   private byte[] aP63 ;
   private byte[] aP64 ;
   private String[] aP65 ;
   private short[] aP66 ;
}

