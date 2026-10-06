package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpdefectos extends GXProcedure
{
   public dpdefectos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpdefectos.class ), "" );
   }

   public dpdefectos( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTDefectos> executeUdp( String aP0 ,
                                                           java.util.Date aP1 ,
                                                           java.util.Date aP2 ,
                                                           int aP3 ,
                                                           int aP4 ,
                                                           byte aP5 )
   {
      dpdefectos.this.aP6 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTDefectos>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        GXBaseCollection<app.SdtSDTDefectos>[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             GXBaseCollection<app.SdtSDTDefectos>[] aP6 )
   {
      dpdefectos.this.AV7Emprcod = aP0;
      dpdefectos.this.AV9FechaIni = aP1;
      dpdefectos.this.AV8FechaFin = aP2;
      dpdefectos.this.AV6ClicodIni = aP3;
      dpdefectos.this.AV5ClicodFin = aP4;
      dpdefectos.this.AV10HisEstReo = aP5;
      dpdefectos.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000S4 */
      pr_default.execute(0, new Object[] {AV7Emprcod, AV9FechaIni, Integer.valueOf(AV6ClicodIni), Byte.valueOf(AV10HisEstReo), AV8FechaFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = P000S4_A833TipDefCod[0] ;
         A396EmprCod = P000S4_A396EmprCod[0] ;
         A252CliCod = P000S4_A252CliCod[0] ;
         n252CliCod = P000S4_n252CliCod[0] ;
         A548HisEstReo = P000S4_A548HisEstReo[0] ;
         n548HisEstReo = P000S4_n548HisEstReo[0] ;
         A569HisReoFec = P000S4_A569HisReoFec[0] ;
         n569HisReoFec = P000S4_n569HisReoFec[0] ;
         A834TipDefDsc = P000S4_A834TipDefDsc[0] ;
         n834TipDefDsc = P000S4_n834TipDefDsc[0] ;
         A40000GXC1 = P000S4_A40000GXC1[0] ;
         n40000GXC1 = P000S4_n40000GXC1[0] ;
         A40001GXC2 = P000S4_A40001GXC2[0] ;
         n40001GXC2 = P000S4_n40001GXC2[0] ;
         A40002GXC3 = P000S4_A40002GXC3[0] ;
         n40002GXC3 = P000S4_n40002GXC3[0] ;
         A834TipDefDsc = P000S4_A834TipDefDsc[0] ;
         n834TipDefDsc = P000S4_n834TipDefDsc[0] ;
         A40000GXC1 = P000S4_A40000GXC1[0] ;
         n40000GXC1 = P000S4_n40000GXC1[0] ;
         A40001GXC2 = P000S4_A40001GXC2[0] ;
         n40001GXC2 = P000S4_n40001GXC2[0] ;
         A40002GXC3 = P000S4_A40002GXC3[0] ;
         n40002GXC3 = P000S4_n40002GXC3[0] ;
         Gxm1sdtdefectos = (app.SdtSDTDefectos)new app.SdtSDTDefectos(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtdefectos, 0);
         Gxm1sdtdefectos.setgxTv_SdtSDTDefectos_Tipdefdsc( A834TipDefDsc );
         Gxm1sdtdefectos.setgxTv_SdtSDTDefectos_Numerodefectos( (short)(A40000GXC1) );
         Gxm1sdtdefectos.setgxTv_SdtSDTDefectos_Kilosdefectos( A40001GXC2 );
         Gxm1sdtdefectos.setgxTv_SdtSDTDefectos_Metrosdefectos( A40002GXC3 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = dpdefectos.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTDefectos>(app.SdtSDTDefectos.class, "SDTDefectos", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000S4_A833TipDefCod = new short[1] ;
      P000S4_A396EmprCod = new String[] {""} ;
      P000S4_A252CliCod = new int[1] ;
      P000S4_n252CliCod = new boolean[] {false} ;
      P000S4_A548HisEstReo = new byte[1] ;
      P000S4_n548HisEstReo = new boolean[] {false} ;
      P000S4_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000S4_n569HisReoFec = new boolean[] {false} ;
      P000S4_A834TipDefDsc = new String[] {""} ;
      P000S4_n834TipDefDsc = new boolean[] {false} ;
      P000S4_A40000GXC1 = new int[1] ;
      P000S4_n40000GXC1 = new boolean[] {false} ;
      P000S4_A40001GXC2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000S4_n40001GXC2 = new boolean[] {false} ;
      P000S4_A40002GXC3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000S4_n40002GXC3 = new boolean[] {false} ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A834TipDefDsc = "" ;
      A40001GXC2 = DecimalUtil.ZERO ;
      A40002GXC3 = DecimalUtil.ZERO ;
      Gxm1sdtdefectos = new app.SdtSDTDefectos(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpdefectos__default(),
         new Object[] {
             new Object[] {
            P000S4_A833TipDefCod, P000S4_A396EmprCod, P000S4_A252CliCod, P000S4_n252CliCod, P000S4_A548HisEstReo, P000S4_n548HisEstReo, P000S4_A569HisReoFec, P000S4_n569HisReoFec, P000S4_A834TipDefDsc, P000S4_n834TipDefDsc,
            P000S4_A40000GXC1, P000S4_n40000GXC1, P000S4_A40001GXC2, P000S4_n40001GXC2, P000S4_A40002GXC3, P000S4_n40002GXC3
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10HisEstReo ;
   private byte A548HisEstReo ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private int AV6ClicodIni ;
   private int AV5ClicodFin ;
   private int A252CliCod ;
   private int A40000GXC1 ;
   private java.math.BigDecimal A40001GXC2 ;
   private java.math.BigDecimal A40002GXC3 ;
   private String AV7Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A834TipDefDsc ;
   private java.util.Date AV9FechaIni ;
   private java.util.Date AV8FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean n252CliCod ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private boolean n834TipDefDsc ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private boolean n40002GXC3 ;
   private GXBaseCollection<app.SdtSDTDefectos>[] aP6 ;
   private IDataStoreProvider pr_default ;
   private short[] P000S4_A833TipDefCod ;
   private String[] P000S4_A396EmprCod ;
   private int[] P000S4_A252CliCod ;
   private boolean[] P000S4_n252CliCod ;
   private byte[] P000S4_A548HisEstReo ;
   private boolean[] P000S4_n548HisEstReo ;
   private java.util.Date[] P000S4_A569HisReoFec ;
   private boolean[] P000S4_n569HisReoFec ;
   private String[] P000S4_A834TipDefDsc ;
   private boolean[] P000S4_n834TipDefDsc ;
   private int[] P000S4_A40000GXC1 ;
   private boolean[] P000S4_n40000GXC1 ;
   private java.math.BigDecimal[] P000S4_A40001GXC2 ;
   private boolean[] P000S4_n40001GXC2 ;
   private java.math.BigDecimal[] P000S4_A40002GXC3 ;
   private boolean[] P000S4_n40002GXC3 ;
   private GXBaseCollection<app.SdtSDTDefectos> Gxm2rootcol ;
   private app.SdtSDTDefectos Gxm1sdtdefectos ;
}

final  class dpdefectos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000S4", "SELECT DISTINCT NULL AS TipDefCod, NULL AS EmprCod, NULL AS CliCod, NULL AS HisEstReo, NULL AS HisReoFec, TipDefDsc, GXC1, GXC2, GXC3 FROM ( SELECT T1.TipDefCod, T1.EmprCod, T1.CliCod, T1.HisEstReo, T1.HisReoFec, T2.TipDefDsc, COALESCE( T3.GXC1, 0) AS GXC1, COALESCE( T3.GXC2, 0) AS GXC2, COALESCE( T3.GXC3, 0) AS GXC3 FROM ((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN (SELECT COUNT(*) AS GXC1, T5.TipDefDsc, SUM(T4.HisBarKgm) AS GXC2, SUM(T4.HisBarMtr) AS GXC3 FROM (TXPHISREO T4 INNER JOIN TXPTIPDEF T5 ON T5.EmprCod = T4.EmprCod AND T5.TipDefCod = T4.TipDefCod) GROUP BY T5.TipDefDsc ) T3 ON T3.TipDefDsc = T2.TipDefDsc) WHERE (T1.EmprCod = ? and T1.HisReoFec >= ?) AND (T1.CliCod = ?) AND (T1.HisEstReo = ?) AND (T1.HisReoFec <= ?) ORDER BY T1.EmprCod, T1.HisReoFec) DistinctT ORDER BY EmprCod, HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
      }
   }

}

