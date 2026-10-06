package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplectol extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplectol pgm = new aplectol (-1);
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
      String[] aP34 = new String[] {""};
      String[] aP35 = new String[] {""};
      byte[] aP36 = new byte[] {0};
      java.util.Date[] aP37 = new java.util.Date[] {GXutil.nullDate()};
      String[] aP38 = new String[] {""};
      String[] aP39 = new String[] {""};

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
         aP34[0] = (String) args[34];
         aP35[0] = (String) args[35];
         aP36[0] = (byte) GXutil.lval( args[36]);
         aP37[0] = (java.util.Date) localUtil.ctod( args[37], localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")));
         aP38[0] = (String) args[38];
         aP39[0] = (String) args[39];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
   }

   public aplectol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplectol.class ), "" );
   }

   public aplectol( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
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
                             String[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             java.util.Date[] aP37 ,
                             String[] aP38 )
   {
      aplectol.this.aP39 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
      return aP39[0];
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
                        String[] aP34 ,
                        String[] aP35 ,
                        byte[] aP36 ,
                        java.util.Date[] aP37 ,
                        String[] aP38 ,
                        String[] aP39 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37, aP38, aP39);
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
                             String[] aP34 ,
                             String[] aP35 ,
                             byte[] aP36 ,
                             java.util.Date[] aP37 ,
                             String[] aP38 ,
                             String[] aP39 )
   {
      aplectol.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      aplectol.this.AV16OpeCod = aP1[0];
      this.aP1 = aP1;
      aplectol.this.AV17MaqCod = aP2[0];
      this.aP2 = aP2;
      aplectol.this.AV18Barcada = aP3[0];
      this.aP3 = aP3;
      aplectol.this.AV19BarCodReo = aP4[0];
      this.aP4 = aP4;
      aplectol.this.AV20BarCodPar = aP5[0];
      this.aP5 = aP5;
      aplectol.this.AV21ParCod = aP6[0];
      this.aP6 = aP6;
      aplectol.this.AV22FlagPa = aP7[0];
      this.aP7 = aP7;
      aplectol.this.AV23Tipo = aP8[0];
      this.aP8 = aP8;
      aplectol.this.AV24Mensa = aP9[0];
      this.aP9 = aP9;
      aplectol.this.AV66BarComLin = aP10[0];
      this.aP10 = aP10;
      aplectol.this.AV35BarCodAnt = aP11[0];
      this.aP11 = aP11;
      aplectol.this.AV36BarReoAnt = aP12[0];
      this.aP12 = aP12;
      aplectol.this.AV37BarParAnt = aP13[0];
      this.aP13 = aP13;
      aplectol.this.AV41OrdLinAnt = aP14[0];
      this.aP14 = aP14;
      aplectol.this.AV40FasCodAnt = aP15[0];
      this.aP15 = aP15;
      aplectol.this.AV39ParCodAnt = aP16[0];
      this.aP16 = aP16;
      aplectol.this.AV69BarOrdLin = aP17[0];
      this.aP17 = aP17;
      aplectol.this.AV70FasCod = aP18[0];
      this.aP18 = aP18;
      aplectol.this.AV56LecTipEnt = aP19[0];
      this.aP19 = aP19;
      aplectol.this.AV115BarFactin = aP20[0];
      this.aP20 = aP20;
      aplectol.this.AV29Turno = aP21[0];
      this.aP21 = aP21;
      aplectol.this.AV52Hoy = aP22[0];
      this.aP22 = aP22;
      aplectol.this.AV55Tiempo = aP23[0];
      this.aP23 = aP23;
      aplectol.this.AV107Eliot = aP24[0];
      this.aP24 = aP24;
      aplectol.this.AV108BarEncCli = aP25[0];
      this.aP25 = aP25;
      aplectol.this.AV109BarDibCli = aP26[0];
      this.aP26 = aP26;
      aplectol.this.AV110dti = aP27[0];
      this.aP27 = aP27;
      aplectol.this.AV111Dtf = aP28[0];
      this.aP28 = aP28;
      aplectol.this.AV112Num_oes = aP29[0];
      this.aP29 = aP29;
      aplectol.this.AV113Num_oesc = aP30[0];
      this.aP30 = aP30;
      aplectol.this.AV106BarTipDis = aP31[0];
      this.aP31 = aP31;
      aplectol.this.AV114Conbd1004 = aP32[0];
      this.aP32 = aP32;
      aplectol.this.AV85Msg_12 = aP33[0];
      this.aP33 = aP33;
      aplectol.this.AV75Msg_2 = aP34[0];
      this.aP34 = aP34;
      aplectol.this.AV79Msg_6 = aP35[0];
      this.aP35 = aP35;
      aplectol.this.AV90RQ = aP36[0];
      this.aP36 = aP36;
      aplectol.this.AV31Fecha = aP37[0];
      this.aP37 = aP37;
      aplectol.this.AV62vMensaje = aP38[0];
      this.aP38 = aP38;
      aplectol.this.AV64vEstParo = aP39[0];
      this.aP39 = aP39;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV62vMensaje = AV85Msg_12 ;
      if ( GXutil.strcmp(AV64vEstParo, httpContext.getMessage( "FECHADO", "")) == 0 )
      {
         AV62vMensaje = AV75Msg_2 ;
      }
      System.out.println( AV79Msg_6 );
      GXt_int1 = AV51Loop ;
      GXv_int2[0] = 10000 ;
      GXv_int3[0] = GXt_int1 ;
      new app.ploop(remoteHandle, context).execute( GXv_int2, GXv_int3) ;
      aplectol.this.GXt_int1 = GXv_int3[0] ;
      AV51Loop = GXt_int1 ;
      System.out.println( "              " );
      AV24Mensa = "" ;
      AV24Mensa = AV75Msg_2 ;
      if ( GXutil.strcmp(AV56LecTipEnt, httpContext.getMessage( "H", "")) == 0 )
      {
         GXv_char4[0] = AV15EmprCod ;
         GXv_char5[0] = AV17MaqCod ;
         GXv_date6[0] = AV31Fecha ;
         GXv_int2[0] = AV35BarCodAnt ;
         GXv_int3[0] = AV36BarReoAnt ;
         GXv_char7[0] = AV37BarParAnt ;
         GXv_int8[0] = AV41OrdLinAnt ;
         GXv_char9[0] = AV40FasCodAnt ;
         GXv_int10[0] = AV39ParCodAnt ;
         GXv_char11[0] = AV45Hora ;
         new app.pciepar(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_date6, GXv_int2, GXv_int3, GXv_char7, GXv_int8, GXv_char9, GXv_int10, GXv_char11) ;
         aplectol.this.AV15EmprCod = GXv_char4[0] ;
         aplectol.this.AV17MaqCod = GXv_char5[0] ;
         aplectol.this.AV31Fecha = GXv_date6[0] ;
         aplectol.this.AV35BarCodAnt = GXv_int2[0] ;
         aplectol.this.AV36BarReoAnt = GXv_int3[0] ;
         aplectol.this.AV37BarParAnt = GXv_char7[0] ;
         aplectol.this.AV41OrdLinAnt = GXv_int8[0] ;
         aplectol.this.AV40FasCodAnt = GXv_char9[0] ;
         aplectol.this.AV39ParCodAnt = GXv_int10[0] ;
         aplectol.this.AV45Hora = GXv_char11[0] ;
      }
      else
      {
         /* Using cursor P03ZE2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, AV17MaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1795GruOrd = P03ZE2_A1795GruOrd[0] ;
            A1794GruLecMaq = P03ZE2_A1794GruLecMaq[0] ;
            A396EmprCod = P03ZE2_A396EmprCod[0] ;
            A1792GruBarPar = P03ZE2_A1792GruBarPar[0] ;
            A1793GruBarReo = P03ZE2_A1793GruBarReo[0] ;
            A1791GruBarCod = P03ZE2_A1791GruBarCod[0] ;
            GXv_char11[0] = AV15EmprCod ;
            GXv_int2[0] = A1791GruBarCod ;
            GXv_int3[0] = A1793GruBarReo ;
            GXv_char9[0] = A1792GruBarPar ;
            GXv_char7[0] = AV17MaqCod ;
            GXv_int10[0] = AV53OrdLinA ;
            GXv_char5[0] = AV54FasCodA ;
            GXv_int12[0] = AV50Flag ;
            GXv_char4[0] = httpContext.getMessage( "S", "") ;
            new app.pbusag2(remoteHandle, context).execute( GXv_char11, GXv_int2, GXv_int3, GXv_char9, GXv_char7, GXv_int10, GXv_char5, GXv_int12, GXv_char4) ;
            aplectol.this.AV15EmprCod = GXv_char11[0] ;
            aplectol.this.A1791GruBarCod = GXv_int2[0] ;
            aplectol.this.A1793GruBarReo = GXv_int3[0] ;
            aplectol.this.A1792GruBarPar = GXv_char9[0] ;
            aplectol.this.AV17MaqCod = GXv_char7[0] ;
            aplectol.this.AV53OrdLinA = GXv_int10[0] ;
            aplectol.this.AV54FasCodA = GXv_char5[0] ;
            aplectol.this.AV50Flag = GXv_int12[0] ;
            if ( AV50Flag == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_char9[0] = AV17MaqCod ;
               GXv_date6[0] = AV31Fecha ;
               GXv_int2[0] = A1791GruBarCod ;
               GXv_int12[0] = A1793GruBarReo ;
               GXv_char7[0] = A1792GruBarPar ;
               GXv_int10[0] = AV53OrdLinA ;
               GXv_char5[0] = AV54FasCodA ;
               GXv_int8[0] = AV39ParCodAnt ;
               GXv_char4[0] = AV45Hora ;
               new app.pciepar(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_date6, GXv_int2, GXv_int12, GXv_char7, GXv_int10, GXv_char5, GXv_int8, GXv_char4) ;
               aplectol.this.AV15EmprCod = GXv_char11[0] ;
               aplectol.this.AV17MaqCod = GXv_char9[0] ;
               aplectol.this.AV31Fecha = GXv_date6[0] ;
               aplectol.this.A1791GruBarCod = GXv_int2[0] ;
               aplectol.this.A1793GruBarReo = GXv_int12[0] ;
               aplectol.this.A1792GruBarPar = GXv_char7[0] ;
               aplectol.this.AV53OrdLinA = GXv_int10[0] ;
               aplectol.this.AV54FasCodA = GXv_char5[0] ;
               aplectol.this.AV39ParCodAnt = GXv_int8[0] ;
               aplectol.this.AV45Hora = GXv_char4[0] ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( GXutil.strcmp(AV56LecTipEnt, httpContext.getMessage( "H", "")) == 0 )
      {
         GXv_char11[0] = AV15EmprCod ;
         GXv_char9[0] = AV17MaqCod ;
         GXv_int2[0] = AV25BarCod ;
         GXv_int12[0] = AV26BarReo ;
         GXv_char7[0] = AV27BarPar ;
         GXv_int13[0] = AV46GruOpeCod ;
         GXv_int10[0] = AV41OrdLinAnt ;
         GXv_char5[0] = AV40FasCodAnt ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int3[0] = AV29Turno ;
         GXv_int8[0] = (short)(0) ;
         GXv_date6[0] = AV52Hoy ;
         GXv_char4[0] = AV66BarComLin ;
         new app.pparpro(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_int2, GXv_int12, GXv_char7, GXv_int13, GXv_int10, GXv_char5, GXv_decimal14, GXv_int3, GXv_int8, GXv_date6, GXv_char4) ;
         aplectol.this.AV15EmprCod = GXv_char11[0] ;
         aplectol.this.AV17MaqCod = GXv_char9[0] ;
         aplectol.this.AV25BarCod = GXv_int2[0] ;
         aplectol.this.AV26BarReo = GXv_int12[0] ;
         aplectol.this.AV27BarPar = GXv_char7[0] ;
         aplectol.this.AV46GruOpeCod = GXv_int13[0] ;
         aplectol.this.AV41OrdLinAnt = GXv_int10[0] ;
         aplectol.this.AV40FasCodAnt = GXv_char5[0] ;
         aplectol.this.AV29Turno = GXv_int3[0] ;
         aplectol.this.AV52Hoy = GXv_date6[0] ;
         aplectol.this.AV66BarComLin = GXv_char4[0] ;
      }
      else
      {
         /* Using cursor P03ZE3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, AV17MaqCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1795GruOrd = P03ZE3_A1795GruOrd[0] ;
            A1794GruLecMaq = P03ZE3_A1794GruLecMaq[0] ;
            A396EmprCod = P03ZE3_A396EmprCod[0] ;
            A1792GruBarPar = P03ZE3_A1792GruBarPar[0] ;
            A1793GruBarReo = P03ZE3_A1793GruBarReo[0] ;
            A1791GruBarCod = P03ZE3_A1791GruBarCod[0] ;
            GXv_char11[0] = AV15EmprCod ;
            GXv_int13[0] = A1791GruBarCod ;
            GXv_int12[0] = A1793GruBarReo ;
            GXv_char9[0] = A1792GruBarPar ;
            GXv_char7[0] = AV17MaqCod ;
            GXv_int10[0] = AV53OrdLinA ;
            GXv_char5[0] = AV54FasCodA ;
            GXv_int3[0] = AV50Flag ;
            GXv_char4[0] = httpContext.getMessage( "S", "") ;
            new app.pbusag2(remoteHandle, context).execute( GXv_char11, GXv_int13, GXv_int12, GXv_char9, GXv_char7, GXv_int10, GXv_char5, GXv_int3, GXv_char4) ;
            aplectol.this.AV15EmprCod = GXv_char11[0] ;
            aplectol.this.A1791GruBarCod = GXv_int13[0] ;
            aplectol.this.A1793GruBarReo = GXv_int12[0] ;
            aplectol.this.A1792GruBarPar = GXv_char9[0] ;
            aplectol.this.AV17MaqCod = GXv_char7[0] ;
            aplectol.this.AV53OrdLinA = GXv_int10[0] ;
            aplectol.this.AV54FasCodA = GXv_char5[0] ;
            aplectol.this.AV50Flag = GXv_int3[0] ;
            if ( AV50Flag == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_char9[0] = AV17MaqCod ;
               GXv_int13[0] = A1791GruBarCod ;
               GXv_int12[0] = A1793GruBarReo ;
               GXv_char7[0] = A1792GruBarPar ;
               GXv_int2[0] = AV46GruOpeCod ;
               GXv_int10[0] = AV53OrdLinA ;
               GXv_char5[0] = AV54FasCodA ;
               GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int3[0] = AV29Turno ;
               GXv_int8[0] = (short)(0) ;
               GXv_date6[0] = AV52Hoy ;
               GXv_char4[0] = AV66BarComLin ;
               new app.pparpro(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_int13, GXv_int12, GXv_char7, GXv_int2, GXv_int10, GXv_char5, GXv_decimal14, GXv_int3, GXv_int8, GXv_date6, GXv_char4) ;
               aplectol.this.AV15EmprCod = GXv_char11[0] ;
               aplectol.this.AV17MaqCod = GXv_char9[0] ;
               aplectol.this.A1791GruBarCod = GXv_int13[0] ;
               aplectol.this.A1793GruBarReo = GXv_int12[0] ;
               aplectol.this.A1792GruBarPar = GXv_char7[0] ;
               aplectol.this.AV46GruOpeCod = GXv_int2[0] ;
               aplectol.this.AV53OrdLinA = GXv_int10[0] ;
               aplectol.this.AV54FasCodA = GXv_char5[0] ;
               aplectol.this.AV29Turno = GXv_int3[0] ;
               aplectol.this.AV52Hoy = GXv_date6[0] ;
               aplectol.this.AV66BarComLin = GXv_char4[0] ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( GXutil.strcmp(AV56LecTipEnt, httpContext.getMessage( "H", "")) == 0 )
      {
         /* Using cursor P03ZE4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV35BarCodAnt), Byte.valueOf(AV36BarReoAnt), AV37BarParAnt});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P03ZE4_A130BarCodPar[0] ;
            A132BarCodReo = P03ZE4_A132BarCodReo[0] ;
            A129BarCod = P03ZE4_A129BarCod[0] ;
            A396EmprCod = P03ZE4_A396EmprCod[0] ;
            A119BarAgrCod = P03ZE4_A119BarAgrCod[0] ;
            A124BarAgrReo = P03ZE4_A124BarAgrReo[0] ;
            A122BarAgrPar = P03ZE4_A122BarAgrPar[0] ;
            GXv_char11[0] = A396EmprCod ;
            GXv_int13[0] = A119BarAgrCod ;
            GXv_int12[0] = A124BarAgrReo ;
            GXv_char9[0] = A122BarAgrPar ;
            GXv_char7[0] = AV17MaqCod ;
            GXv_int10[0] = AV53OrdLinA ;
            GXv_char5[0] = AV54FasCodA ;
            GXv_int3[0] = AV50Flag ;
            GXv_char4[0] = httpContext.getMessage( "S", "") ;
            new app.pbusagr(remoteHandle, context).execute( GXv_char11, GXv_int13, GXv_int12, GXv_char9, GXv_char7, GXv_int10, GXv_char5, GXv_int3, GXv_char4) ;
            aplectol.this.A396EmprCod = GXv_char11[0] ;
            aplectol.this.A119BarAgrCod = GXv_int13[0] ;
            aplectol.this.A124BarAgrReo = GXv_int12[0] ;
            aplectol.this.A122BarAgrPar = GXv_char9[0] ;
            aplectol.this.AV17MaqCod = GXv_char7[0] ;
            aplectol.this.AV53OrdLinA = GXv_int10[0] ;
            aplectol.this.AV54FasCodA = GXv_char5[0] ;
            aplectol.this.AV50Flag = GXv_int3[0] ;
            if ( AV50Flag == 1 )
            {
               GXv_char11[0] = AV15EmprCod ;
               GXv_char9[0] = AV17MaqCod ;
               GXv_date6[0] = AV31Fecha ;
               GXv_int13[0] = A119BarAgrCod ;
               GXv_int12[0] = A124BarAgrReo ;
               GXv_char7[0] = A122BarAgrPar ;
               GXv_int10[0] = AV53OrdLinA ;
               GXv_char5[0] = AV54FasCodA ;
               GXv_int8[0] = AV39ParCodAnt ;
               GXv_char4[0] = AV45Hora ;
               new app.pciepar(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_date6, GXv_int13, GXv_int12, GXv_char7, GXv_int10, GXv_char5, GXv_int8, GXv_char4) ;
               aplectol.this.AV15EmprCod = GXv_char11[0] ;
               aplectol.this.AV17MaqCod = GXv_char9[0] ;
               aplectol.this.AV31Fecha = GXv_date6[0] ;
               aplectol.this.A119BarAgrCod = GXv_int13[0] ;
               aplectol.this.A124BarAgrReo = GXv_int12[0] ;
               aplectol.this.A122BarAgrPar = GXv_char7[0] ;
               aplectol.this.AV53OrdLinA = GXv_int10[0] ;
               aplectol.this.AV54FasCodA = GXv_char5[0] ;
               aplectol.this.AV39ParCodAnt = GXv_int8[0] ;
               aplectol.this.AV45Hora = GXv_char4[0] ;
               GXv_char11[0] = AV15EmprCod ;
               GXv_char9[0] = AV17MaqCod ;
               GXv_int13[0] = A119BarAgrCod ;
               GXv_int12[0] = A124BarAgrReo ;
               GXv_char7[0] = A122BarAgrPar ;
               GXv_int2[0] = AV46GruOpeCod ;
               GXv_int10[0] = AV53OrdLinA ;
               GXv_char5[0] = AV54FasCodA ;
               GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
               GXv_int3[0] = AV29Turno ;
               GXv_int8[0] = (short)(0) ;
               GXv_date6[0] = AV52Hoy ;
               GXv_char4[0] = AV66BarComLin ;
               new app.pparpro(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_int13, GXv_int12, GXv_char7, GXv_int2, GXv_int10, GXv_char5, GXv_decimal14, GXv_int3, GXv_int8, GXv_date6, GXv_char4) ;
               aplectol.this.AV15EmprCod = GXv_char11[0] ;
               aplectol.this.AV17MaqCod = GXv_char9[0] ;
               aplectol.this.A119BarAgrCod = GXv_int13[0] ;
               aplectol.this.A124BarAgrReo = GXv_int12[0] ;
               aplectol.this.A122BarAgrPar = GXv_char7[0] ;
               aplectol.this.AV46GruOpeCod = GXv_int2[0] ;
               aplectol.this.AV53OrdLinA = GXv_int10[0] ;
               aplectol.this.AV54FasCodA = GXv_char5[0] ;
               aplectol.this.AV29Turno = GXv_int3[0] ;
               aplectol.this.AV52Hoy = GXv_date6[0] ;
               aplectol.this.AV66BarComLin = GXv_char4[0] ;
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      GXv_char11[0] = AV15EmprCod ;
      GXv_char9[0] = AV17MaqCod ;
      GXv_int13[0] = AV25BarCod ;
      GXv_int12[0] = AV26BarReo ;
      GXv_char7[0] = AV27BarPar ;
      GXv_int2[0] = AV16OpeCod ;
      GXv_char5[0] = AV40FasCodAnt ;
      GXv_int10[0] = AV41OrdLinAnt ;
      GXv_int8[0] = AV21ParCod ;
      GXv_char4[0] = AV55Tiempo ;
      GXv_date6[0] = AV52Hoy ;
      GXv_char15[0] = AV57TipoEnt ;
      new app.pnueopt(remoteHandle, context).execute( GXv_char11, GXv_char9, GXv_int13, GXv_int12, GXv_char7, GXv_int2, GXv_char5, GXv_int10, GXv_int8, GXv_char4, GXv_date6, GXv_char15) ;
      aplectol.this.AV15EmprCod = GXv_char11[0] ;
      aplectol.this.AV17MaqCod = GXv_char9[0] ;
      aplectol.this.AV25BarCod = GXv_int13[0] ;
      aplectol.this.AV26BarReo = GXv_int12[0] ;
      aplectol.this.AV27BarPar = GXv_char7[0] ;
      aplectol.this.AV16OpeCod = GXv_int2[0] ;
      aplectol.this.AV40FasCodAnt = GXv_char5[0] ;
      aplectol.this.AV41OrdLinAnt = GXv_int10[0] ;
      aplectol.this.AV21ParCod = GXv_int8[0] ;
      aplectol.this.AV55Tiempo = GXv_char4[0] ;
      aplectol.this.AV52Hoy = GXv_date6[0] ;
      aplectol.this.AV57TipoEnt = GXv_char15[0] ;
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plectol.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = aplectol.this.AV15EmprCod;
      this.aP1[0] = aplectol.this.AV16OpeCod;
      this.aP2[0] = aplectol.this.AV17MaqCod;
      this.aP3[0] = aplectol.this.AV18Barcada;
      this.aP4[0] = aplectol.this.AV19BarCodReo;
      this.aP5[0] = aplectol.this.AV20BarCodPar;
      this.aP6[0] = aplectol.this.AV21ParCod;
      this.aP7[0] = aplectol.this.AV22FlagPa;
      this.aP8[0] = aplectol.this.AV23Tipo;
      this.aP9[0] = aplectol.this.AV24Mensa;
      this.aP10[0] = aplectol.this.AV66BarComLin;
      this.aP11[0] = aplectol.this.AV35BarCodAnt;
      this.aP12[0] = aplectol.this.AV36BarReoAnt;
      this.aP13[0] = aplectol.this.AV37BarParAnt;
      this.aP14[0] = aplectol.this.AV41OrdLinAnt;
      this.aP15[0] = aplectol.this.AV40FasCodAnt;
      this.aP16[0] = aplectol.this.AV39ParCodAnt;
      this.aP17[0] = aplectol.this.AV69BarOrdLin;
      this.aP18[0] = aplectol.this.AV70FasCod;
      this.aP19[0] = aplectol.this.AV56LecTipEnt;
      this.aP20[0] = aplectol.this.AV115BarFactin;
      this.aP21[0] = aplectol.this.AV29Turno;
      this.aP22[0] = aplectol.this.AV52Hoy;
      this.aP23[0] = aplectol.this.AV55Tiempo;
      this.aP24[0] = aplectol.this.AV107Eliot;
      this.aP25[0] = aplectol.this.AV108BarEncCli;
      this.aP26[0] = aplectol.this.AV109BarDibCli;
      this.aP27[0] = aplectol.this.AV110dti;
      this.aP28[0] = aplectol.this.AV111Dtf;
      this.aP29[0] = aplectol.this.AV112Num_oes;
      this.aP30[0] = aplectol.this.AV113Num_oesc;
      this.aP31[0] = aplectol.this.AV106BarTipDis;
      this.aP32[0] = aplectol.this.AV114Conbd1004;
      this.aP33[0] = aplectol.this.AV85Msg_12;
      this.aP34[0] = aplectol.this.AV75Msg_2;
      this.aP35[0] = aplectol.this.AV79Msg_6;
      this.aP36[0] = aplectol.this.AV90RQ;
      this.aP37[0] = aplectol.this.AV31Fecha;
      this.aP38[0] = aplectol.this.AV62vMensaje;
      this.aP39[0] = aplectol.this.AV64vEstParo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV45Hora = "" ;
      scmdbuf = "" ;
      P03ZE2_A1795GruOrd = new byte[1] ;
      P03ZE2_A1794GruLecMaq = new String[] {""} ;
      P03ZE2_A396EmprCod = new String[] {""} ;
      P03ZE2_A1792GruBarPar = new String[] {""} ;
      P03ZE2_A1793GruBarReo = new byte[1] ;
      P03ZE2_A1791GruBarCod = new int[1] ;
      A1794GruLecMaq = "" ;
      A396EmprCod = "" ;
      A1792GruBarPar = "" ;
      AV54FasCodA = "" ;
      AV27BarPar = "" ;
      P03ZE3_A1795GruOrd = new byte[1] ;
      P03ZE3_A1794GruLecMaq = new String[] {""} ;
      P03ZE3_A396EmprCod = new String[] {""} ;
      P03ZE3_A1792GruBarPar = new String[] {""} ;
      P03ZE3_A1793GruBarReo = new byte[1] ;
      P03ZE3_A1791GruBarCod = new int[1] ;
      P03ZE4_A130BarCodPar = new String[] {""} ;
      P03ZE4_A132BarCodReo = new byte[1] ;
      P03ZE4_A129BarCod = new int[1] ;
      P03ZE4_A396EmprCod = new String[] {""} ;
      P03ZE4_A119BarAgrCod = new int[1] ;
      P03ZE4_A124BarAgrReo = new byte[1] ;
      P03ZE4_A122BarAgrPar = new String[] {""} ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int8 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_date6 = new java.util.Date[1] ;
      AV57TipoEnt = "" ;
      GXv_char15 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplectol__default(),
         new Object[] {
             new Object[] {
            P03ZE2_A1795GruOrd, P03ZE2_A1794GruLecMaq, P03ZE2_A396EmprCod, P03ZE2_A1792GruBarPar, P03ZE2_A1793GruBarReo, P03ZE2_A1791GruBarCod
            }
            , new Object[] {
            P03ZE3_A1795GruOrd, P03ZE3_A1794GruLecMaq, P03ZE3_A396EmprCod, P03ZE3_A1792GruBarPar, P03ZE3_A1793GruBarReo, P03ZE3_A1791GruBarCod
            }
            , new Object[] {
            P03ZE4_A130BarCodPar, P03ZE4_A132BarCodReo, P03ZE4_A129BarCod, P03ZE4_A396EmprCod, P03ZE4_A119BarAgrCod, P03ZE4_A124BarAgrReo, P03ZE4_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19BarCodReo ;
   private byte AV22FlagPa ;
   private byte AV36BarReoAnt ;
   private byte AV29Turno ;
   private byte AV107Eliot ;
   private byte AV114Conbd1004 ;
   private byte AV90RQ ;
   private byte AV51Loop ;
   private byte GXt_int1 ;
   private byte A1795GruOrd ;
   private byte A1793GruBarReo ;
   private byte AV50Flag ;
   private byte AV26BarReo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int3[] ;
   private byte GXv_int12[] ;
   private short AV21ParCod ;
   private short AV41OrdLinAnt ;
   private short AV39ParCodAnt ;
   private short AV69BarOrdLin ;
   private short AV112Num_oes ;
   private short AV113Num_oesc ;
   private short AV53OrdLinA ;
   private short GXv_int10[] ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV16OpeCod ;
   private int AV18Barcada ;
   private int AV35BarCodAnt ;
   private int A1791GruBarCod ;
   private int AV25BarCod ;
   private int AV46GruOpeCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int13[] ;
   private int GXv_int2[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String AV15EmprCod ;
   private String AV17MaqCod ;
   private String AV20BarCodPar ;
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
   private String AV85Msg_12 ;
   private String AV75Msg_2 ;
   private String AV79Msg_6 ;
   private String AV62vMensaje ;
   private String AV64vEstParo ;
   private String AV45Hora ;
   private String scmdbuf ;
   private String A1794GruLecMaq ;
   private String A396EmprCod ;
   private String A1792GruBarPar ;
   private String AV54FasCodA ;
   private String AV27BarPar ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String GXv_char11[] ;
   private String GXv_char9[] ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV57TipoEnt ;
   private String GXv_char15[] ;
   private java.util.Date AV110dti ;
   private java.util.Date AV111Dtf ;
   private java.util.Date AV52Hoy ;
   private java.util.Date AV31Fecha ;
   private java.util.Date GXv_date6[] ;
   private String[] aP39 ;
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
   private String[] aP34 ;
   private String[] aP35 ;
   private byte[] aP36 ;
   private java.util.Date[] aP37 ;
   private String[] aP38 ;
   private IDataStoreProvider pr_default ;
   private byte[] P03ZE2_A1795GruOrd ;
   private String[] P03ZE2_A1794GruLecMaq ;
   private String[] P03ZE2_A396EmprCod ;
   private String[] P03ZE2_A1792GruBarPar ;
   private byte[] P03ZE2_A1793GruBarReo ;
   private int[] P03ZE2_A1791GruBarCod ;
   private byte[] P03ZE3_A1795GruOrd ;
   private String[] P03ZE3_A1794GruLecMaq ;
   private String[] P03ZE3_A396EmprCod ;
   private String[] P03ZE3_A1792GruBarPar ;
   private byte[] P03ZE3_A1793GruBarReo ;
   private int[] P03ZE3_A1791GruBarCod ;
   private String[] P03ZE4_A130BarCodPar ;
   private byte[] P03ZE4_A132BarCodReo ;
   private int[] P03ZE4_A129BarCod ;
   private String[] P03ZE4_A396EmprCod ;
   private int[] P03ZE4_A119BarAgrCod ;
   private byte[] P03ZE4_A124BarAgrReo ;
   private String[] P03ZE4_A122BarAgrPar ;
}

final  class aplectol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03ZE2", "SELECT GruOrd, GruLecMaq, EmprCod, GruBarPar, GruBarReo, GruBarCod FROM TXPGRULEC WHERE EmprCod = ? and GruLecMaq = ? and GruOrd = 0 ORDER BY EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZE3", "SELECT GruOrd, GruLecMaq, EmprCod, GruBarPar, GruBarReo, GruBarCod FROM TXPGRULEC WHERE EmprCod = ? and GruLecMaq = ? and GruOrd = 1 ORDER BY EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03ZE4", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

