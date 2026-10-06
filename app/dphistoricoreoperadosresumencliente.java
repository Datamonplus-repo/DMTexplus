package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dphistoricoreoperadosresumencliente extends GXProcedure
{
   public dphistoricoreoperadosresumencliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dphistoricoreoperadosresumencliente.class ), "" );
   }

   public dphistoricoreoperadosresumencliente( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente> executeUdp( String aP0 ,
                                                                                    int aP1 ,
                                                                                    int aP2 ,
                                                                                    java.util.Date aP3 ,
                                                                                    java.util.Date aP4 ,
                                                                                    short aP5 ,
                                                                                    short aP6 ,
                                                                                    String aP7 ,
                                                                                    String aP8 ,
                                                                                    short aP9 ,
                                                                                    short aP10 ,
                                                                                    byte aP11 )
   {
      dphistoricoreoperadosresumencliente.this.aP12 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        short aP5 ,
                        short aP6 ,
                        String aP7 ,
                        String aP8 ,
                        short aP9 ,
                        short aP10 ,
                        byte aP11 ,
                        GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             short aP5 ,
                             short aP6 ,
                             String aP7 ,
                             String aP8 ,
                             short aP9 ,
                             short aP10 ,
                             byte aP11 ,
                             GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>[] aP12 )
   {
      dphistoricoreoperadosresumencliente.this.AV7Emprcod = aP0;
      dphistoricoreoperadosresumencliente.this.AV5Cliente = aP1;
      dphistoricoreoperadosresumencliente.this.AV8Cliente_to = aP2;
      dphistoricoreoperadosresumencliente.this.AV9HisreoFec = aP3;
      dphistoricoreoperadosresumencliente.this.AV10HisreoFec_to = aP4;
      dphistoricoreoperadosresumencliente.this.AV15Tipdefcod = aP5;
      dphistoricoreoperadosresumencliente.this.AV16TipDefcod_to = aP6;
      dphistoricoreoperadosresumencliente.this.AV13Maqcod = aP7;
      dphistoricoreoperadosresumencliente.this.AV14MaqCod_to = aP8;
      dphistoricoreoperadosresumencliente.this.AV17TipArtcod = aP9;
      dphistoricoreoperadosresumencliente.this.AV18TipArtcod_to = aP10;
      dphistoricoreoperadosresumencliente.this.AV6Hisestreo = aP11;
      dphistoricoreoperadosresumencliente.this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001Q2 */
      pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV5Cliente), AV9HisreoFec, AV10HisreoFec_to, Short.valueOf(AV15Tipdefcod), Short.valueOf(AV16TipDefcod_to), AV13Maqcod, AV14MaqCod_to, Short.valueOf(AV17TipArtcod), Short.valueOf(AV18TipArtcod_to), Byte.valueOf(AV6Hisestreo), Integer.valueOf(AV8Cliente_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1Q2 = false ;
         A540HisBarKgm = P001Q2_A540HisBarKgm[0] ;
         n540HisBarKgm = P001Q2_n540HisBarKgm[0] ;
         A541HisBarMtr = P001Q2_A541HisBarMtr[0] ;
         n541HisBarMtr = P001Q2_n541HisBarMtr[0] ;
         A252CliCod = P001Q2_A252CliCod[0] ;
         n252CliCod = P001Q2_n252CliCod[0] ;
         A396EmprCod = P001Q2_A396EmprCod[0] ;
         A571HisTipArt = P001Q2_A571HisTipArt[0] ;
         n571HisTipArt = P001Q2_n571HisTipArt[0] ;
         A602MaqCod = P001Q2_A602MaqCod[0] ;
         n602MaqCod = P001Q2_n602MaqCod[0] ;
         A833TipDefCod = P001Q2_A833TipDefCod[0] ;
         A548HisEstReo = P001Q2_A548HisEstReo[0] ;
         n548HisEstReo = P001Q2_n548HisEstReo[0] ;
         A569HisReoFec = P001Q2_A569HisReoFec[0] ;
         n569HisReoFec = P001Q2_n569HisReoFec[0] ;
         A279CliNom = P001Q2_A279CliNom[0] ;
         A539HisBarCod = P001Q2_A539HisBarCod[0] ;
         A545HisCodReo = P001Q2_A545HisCodReo[0] ;
         A544HisCodPar = P001Q2_A544HisCodPar[0] ;
         A279CliNom = P001Q2_A279CliNom[0] ;
         Gxm1sdthistoricoreoperadosresumencliente = (app.SdtSDTHistoricoReoperadosResumenCliente)new app.SdtSDTHistoricoReoperadosResumenCliente(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdthistoricoreoperadosresumencliente, 0);
         Gxm1sdthistoricoreoperadosresumencliente.setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente( A252CliCod );
         Gxm1sdthistoricoreoperadosresumencliente.setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre( A279CliNom );
         AV11Kilos = DecimalUtil.doubleToDec(0) ;
         AV12Metros = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P001Q2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P001Q2_A252CliCod[0] == A252CliCod ) )
         {
            brk1Q2 = false ;
            A540HisBarKgm = P001Q2_A540HisBarKgm[0] ;
            n540HisBarKgm = P001Q2_n540HisBarKgm[0] ;
            A541HisBarMtr = P001Q2_A541HisBarMtr[0] ;
            n541HisBarMtr = P001Q2_n541HisBarMtr[0] ;
            A833TipDefCod = P001Q2_A833TipDefCod[0] ;
            A539HisBarCod = P001Q2_A539HisBarCod[0] ;
            A545HisCodReo = P001Q2_A545HisCodReo[0] ;
            A544HisCodPar = P001Q2_A544HisCodPar[0] ;
            AV11Kilos = AV11Kilos.add(A540HisBarKgm) ;
            AV12Metros = AV12Metros.add(A541HisBarMtr) ;
            brk1Q2 = true ;
            pr_default.readNext(0);
         }
         Gxm1sdthistoricoreoperadosresumencliente.getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total().setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos( AV11Kilos );
         Gxm1sdthistoricoreoperadosresumencliente.getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total().setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros( AV12Metros );
         if ( ! brk1Q2 )
         {
            brk1Q2 = true ;
            pr_default.readNext(0);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP12[0] = dphistoricoreoperadosresumencliente.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(0);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>(app.SdtSDTHistoricoReoperadosResumenCliente.class, "SDTHistoricoReoperadosResumenCliente", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001Q2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Q2_n540HisBarKgm = new boolean[] {false} ;
      P001Q2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001Q2_n541HisBarMtr = new boolean[] {false} ;
      P001Q2_A252CliCod = new int[1] ;
      P001Q2_n252CliCod = new boolean[] {false} ;
      P001Q2_A396EmprCod = new String[] {""} ;
      P001Q2_A571HisTipArt = new short[1] ;
      P001Q2_n571HisTipArt = new boolean[] {false} ;
      P001Q2_A602MaqCod = new String[] {""} ;
      P001Q2_n602MaqCod = new boolean[] {false} ;
      P001Q2_A833TipDefCod = new short[1] ;
      P001Q2_A548HisEstReo = new byte[1] ;
      P001Q2_n548HisEstReo = new boolean[] {false} ;
      P001Q2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P001Q2_n569HisReoFec = new boolean[] {false} ;
      P001Q2_A279CliNom = new String[] {""} ;
      P001Q2_A539HisBarCod = new int[1] ;
      P001Q2_A545HisCodReo = new byte[1] ;
      P001Q2_A544HisCodPar = new String[] {""} ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A544HisCodPar = "" ;
      Gxm1sdthistoricoreoperadosresumencliente = new app.SdtSDTHistoricoReoperadosResumenCliente(remoteHandle, context);
      AV11Kilos = DecimalUtil.ZERO ;
      AV12Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dphistoricoreoperadosresumencliente__default(),
         new Object[] {
             new Object[] {
            P001Q2_A540HisBarKgm, P001Q2_n540HisBarKgm, P001Q2_A541HisBarMtr, P001Q2_n541HisBarMtr, P001Q2_A252CliCod, P001Q2_n252CliCod, P001Q2_A396EmprCod, P001Q2_A571HisTipArt, P001Q2_n571HisTipArt, P001Q2_A602MaqCod,
            P001Q2_n602MaqCod, P001Q2_A833TipDefCod, P001Q2_A548HisEstReo, P001Q2_n548HisEstReo, P001Q2_A569HisReoFec, P001Q2_n569HisReoFec, P001Q2_A279CliNom, P001Q2_A539HisBarCod, P001Q2_A545HisCodReo, P001Q2_A544HisCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6Hisestreo ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private short AV15Tipdefcod ;
   private short AV16TipDefcod_to ;
   private short AV17TipArtcod ;
   private short AV18TipArtcod_to ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV5Cliente ;
   private int AV8Cliente_to ;
   private int A252CliCod ;
   private int A539HisBarCod ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal AV11Kilos ;
   private java.math.BigDecimal AV12Metros ;
   private String AV7Emprcod ;
   private String AV13Maqcod ;
   private String AV14MaqCod_to ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A279CliNom ;
   private String A544HisCodPar ;
   private java.util.Date AV9HisreoFec ;
   private java.util.Date AV10HisreoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean brk1Q2 ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private boolean n602MaqCod ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente>[] aP12 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P001Q2_A540HisBarKgm ;
   private boolean[] P001Q2_n540HisBarKgm ;
   private java.math.BigDecimal[] P001Q2_A541HisBarMtr ;
   private boolean[] P001Q2_n541HisBarMtr ;
   private int[] P001Q2_A252CliCod ;
   private boolean[] P001Q2_n252CliCod ;
   private String[] P001Q2_A396EmprCod ;
   private short[] P001Q2_A571HisTipArt ;
   private boolean[] P001Q2_n571HisTipArt ;
   private String[] P001Q2_A602MaqCod ;
   private boolean[] P001Q2_n602MaqCod ;
   private short[] P001Q2_A833TipDefCod ;
   private byte[] P001Q2_A548HisEstReo ;
   private boolean[] P001Q2_n548HisEstReo ;
   private java.util.Date[] P001Q2_A569HisReoFec ;
   private boolean[] P001Q2_n569HisReoFec ;
   private String[] P001Q2_A279CliNom ;
   private int[] P001Q2_A539HisBarCod ;
   private byte[] P001Q2_A545HisCodReo ;
   private String[] P001Q2_A544HisCodPar ;
   private GXBaseCollection<app.SdtSDTHistoricoReoperadosResumenCliente> Gxm2rootcol ;
   private app.SdtSDTHistoricoReoperadosResumenCliente Gxm1sdthistoricoreoperadosresumencliente ;
}

final  class dphistoricoreoperadosresumencliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001Q2", "SELECT T1.HisBarKgm, T1.HisBarMtr, T1.CliCod, T1.EmprCod, T1.HisTipArt, T1.MaqCod, T1.TipDefCod, T1.HisEstReo, T1.HisReoFec, T2.CliNom, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar FROM (TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.CliCod >= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.TipDefCod >= ?) AND (T1.TipDefCod <= ?) AND (T1.MaqCod >= ?) AND (T1.MaqCod <= ?) AND (T1.HisTipArt >= ?) AND (T1.HisTipArt <= ?) AND (T1.HisEstReo = ?) AND (T1.CliCod <= ?) ORDER BY T1.EmprCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 30);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
      }
   }

}

