package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpmaquinasr extends GXProcedure
{
   public dpmaquinasr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpmaquinasr.class ), "" );
   }

   public dpmaquinasr( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTMaquinasR> executeUdp( String aP0 ,
                                                            java.util.Date aP1 ,
                                                            java.util.Date aP2 ,
                                                            int aP3 ,
                                                            byte aP4 )
   {
      dpmaquinasr.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTMaquinasR>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        GXBaseCollection<app.SdtSDTMaquinasR>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             GXBaseCollection<app.SdtSDTMaquinasR>[] aP5 )
   {
      dpmaquinasr.this.AV5Emprcod = aP0;
      dpmaquinasr.this.AV9FechaIni = aP1;
      dpmaquinasr.this.AV8FechaFin = aP2;
      dpmaquinasr.this.AV7ClicodIni = aP3;
      dpmaquinasr.this.AV11HisEstReo = aP4;
      dpmaquinasr.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000V4 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV9FechaIni, Integer.valueOf(AV7ClicodIni), Integer.valueOf(AV7ClicodIni), Byte.valueOf(AV11HisEstReo), AV8FechaFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P000V4_A602MaqCod[0] ;
         n602MaqCod = P000V4_n602MaqCod[0] ;
         A396EmprCod = P000V4_A396EmprCod[0] ;
         A548HisEstReo = P000V4_A548HisEstReo[0] ;
         n548HisEstReo = P000V4_n548HisEstReo[0] ;
         A252CliCod = P000V4_A252CliCod[0] ;
         n252CliCod = P000V4_n252CliCod[0] ;
         A569HisReoFec = P000V4_A569HisReoFec[0] ;
         n569HisReoFec = P000V4_n569HisReoFec[0] ;
         A606MaqDsc = P000V4_A606MaqDsc[0] ;
         n606MaqDsc = P000V4_n606MaqDsc[0] ;
         A40000GXC1 = P000V4_A40000GXC1[0] ;
         n40000GXC1 = P000V4_n40000GXC1[0] ;
         A40001GXC2 = P000V4_A40001GXC2[0] ;
         n40001GXC2 = P000V4_n40001GXC2[0] ;
         A606MaqDsc = P000V4_A606MaqDsc[0] ;
         n606MaqDsc = P000V4_n606MaqDsc[0] ;
         A40000GXC1 = P000V4_A40000GXC1[0] ;
         n40000GXC1 = P000V4_n40000GXC1[0] ;
         A40001GXC2 = P000V4_A40001GXC2[0] ;
         n40001GXC2 = P000V4_n40001GXC2[0] ;
         Gxm1sdtmaquinasr = (app.SdtSDTMaquinasR)new app.SdtSDTMaquinasR(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmaquinasr, 0);
         Gxm1sdtmaquinasr.setgxTv_SdtSDTMaquinasR_Maqdsc( A606MaqDsc );
         Gxm1sdtmaquinasr.setgxTv_SdtSDTMaquinasR_Kilosreoperados( A40000GXC1 );
         Gxm1sdtmaquinasr.setgxTv_SdtSDTMaquinasR_Metrosreoperados( A40001GXC2 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpmaquinasr.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTMaquinasR>(app.SdtSDTMaquinasR.class, "SDTMaquinasR", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000V4_A602MaqCod = new String[] {""} ;
      P000V4_n602MaqCod = new boolean[] {false} ;
      P000V4_A396EmprCod = new String[] {""} ;
      P000V4_A548HisEstReo = new byte[1] ;
      P000V4_n548HisEstReo = new boolean[] {false} ;
      P000V4_A252CliCod = new int[1] ;
      P000V4_n252CliCod = new boolean[] {false} ;
      P000V4_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000V4_n569HisReoFec = new boolean[] {false} ;
      P000V4_A606MaqDsc = new String[] {""} ;
      P000V4_n606MaqDsc = new boolean[] {false} ;
      P000V4_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000V4_n40000GXC1 = new boolean[] {false} ;
      P000V4_A40001GXC2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000V4_n40001GXC2 = new boolean[] {false} ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A606MaqDsc = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      A40001GXC2 = DecimalUtil.ZERO ;
      Gxm1sdtmaquinasr = new app.SdtSDTMaquinasR(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpmaquinasr__default(),
         new Object[] {
             new Object[] {
            P000V4_A602MaqCod, P000V4_n602MaqCod, P000V4_A396EmprCod, P000V4_A548HisEstReo, P000V4_n548HisEstReo, P000V4_A252CliCod, P000V4_n252CliCod, P000V4_A569HisReoFec, P000V4_n569HisReoFec, P000V4_A606MaqDsc,
            P000V4_n606MaqDsc, P000V4_A40000GXC1, P000V4_n40000GXC1, P000V4_A40001GXC2, P000V4_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11HisEstReo ;
   private byte A548HisEstReo ;
   private short Gx_err ;
   private int AV7ClicodIni ;
   private int A252CliCod ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal A40001GXC2 ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String A606MaqDsc ;
   private java.util.Date AV9FechaIni ;
   private java.util.Date AV8FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean n602MaqCod ;
   private boolean n548HisEstReo ;
   private boolean n252CliCod ;
   private boolean n569HisReoFec ;
   private boolean n606MaqDsc ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private GXBaseCollection<app.SdtSDTMaquinasR>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P000V4_A602MaqCod ;
   private boolean[] P000V4_n602MaqCod ;
   private String[] P000V4_A396EmprCod ;
   private byte[] P000V4_A548HisEstReo ;
   private boolean[] P000V4_n548HisEstReo ;
   private int[] P000V4_A252CliCod ;
   private boolean[] P000V4_n252CliCod ;
   private java.util.Date[] P000V4_A569HisReoFec ;
   private boolean[] P000V4_n569HisReoFec ;
   private String[] P000V4_A606MaqDsc ;
   private boolean[] P000V4_n606MaqDsc ;
   private java.math.BigDecimal[] P000V4_A40000GXC1 ;
   private boolean[] P000V4_n40000GXC1 ;
   private java.math.BigDecimal[] P000V4_A40001GXC2 ;
   private boolean[] P000V4_n40001GXC2 ;
   private GXBaseCollection<app.SdtSDTMaquinasR> Gxm2rootcol ;
   private app.SdtSDTMaquinasR Gxm1sdtmaquinasr ;
}

final  class dpmaquinasr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000V4", "SELECT DISTINCT NULL AS MaqCod, NULL AS EmprCod, NULL AS HisEstReo, NULL AS CliCod, NULL AS HisReoFec, MaqDsc, GXC1, GXC2 FROM ( SELECT T1.MaqCod, T1.EmprCod, T1.HisEstReo, T1.CliCod, T1.HisReoFec, T2.MaqDsc, COALESCE( T3.GXC1, 0) AS GXC1, COALESCE( T3.GXC2, 0) AS GXC2 FROM ((TXPHISREO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) LEFT JOIN (SELECT SUM(T4.HisBarKgm) AS GXC1, T5.MaqDsc, SUM(T4.HisBarMtr) AS GXC2 FROM (TXPHISREO T4 LEFT JOIN TXPMAQUIN T5 ON T5.EmprCod = T4.EmprCod AND T5.MaqCod = T4.MaqCod) GROUP BY T5.MaqDsc ) T3 ON T3.MaqDsc = T2.MaqDsc) WHERE (T1.EmprCod = ? and T1.HisReoFec >= ?) AND (T1.CliCod = ? or (? = 0)) AND (T1.HisEstReo = ?) AND (T1.HisReoFec <= ?) ORDER BY T1.EmprCod, T1.HisReoFec) DistinctT ORDER BY EmprCod, HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
      }
   }

}

