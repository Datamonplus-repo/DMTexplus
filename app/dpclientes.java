package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpclientes extends GXProcedure
{
   public dpclientes( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpclientes.class ), "" );
   }

   public dpclientes( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTClientes> executeUdp( String aP0 ,
                                                           java.util.Date aP1 ,
                                                           java.util.Date aP2 ,
                                                           int aP3 ,
                                                           byte aP4 )
   {
      dpclientes.this.aP5 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTClientes>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        GXBaseCollection<app.SdtSDTClientes>[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             GXBaseCollection<app.SdtSDTClientes>[] aP5 )
   {
      dpclientes.this.AV5Emprcod = aP0;
      dpclientes.this.AV11FechaIni = aP1;
      dpclientes.this.AV10FechaFin = aP2;
      dpclientes.this.AV8ClicodIni = aP3;
      dpclientes.this.AV6HisEstReo = aP4;
      dpclientes.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P000U4 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV11FechaIni, Integer.valueOf(AV8ClicodIni), Integer.valueOf(AV8ClicodIni), Byte.valueOf(AV6HisEstReo), AV10FechaFin});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P000U4_A396EmprCod[0] ;
         A548HisEstReo = P000U4_A548HisEstReo[0] ;
         n548HisEstReo = P000U4_n548HisEstReo[0] ;
         A252CliCod = P000U4_A252CliCod[0] ;
         n252CliCod = P000U4_n252CliCod[0] ;
         A569HisReoFec = P000U4_A569HisReoFec[0] ;
         n569HisReoFec = P000U4_n569HisReoFec[0] ;
         A279CliNom = P000U4_A279CliNom[0] ;
         A40000GXC1 = P000U4_A40000GXC1[0] ;
         n40000GXC1 = P000U4_n40000GXC1[0] ;
         A40001GXC2 = P000U4_A40001GXC2[0] ;
         n40001GXC2 = P000U4_n40001GXC2[0] ;
         A279CliNom = P000U4_A279CliNom[0] ;
         A40000GXC1 = P000U4_A40000GXC1[0] ;
         n40000GXC1 = P000U4_n40000GXC1[0] ;
         A40001GXC2 = P000U4_A40001GXC2[0] ;
         n40001GXC2 = P000U4_n40001GXC2[0] ;
         Gxm1sdtclientes = (app.SdtSDTClientes)new app.SdtSDTClientes(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtclientes, 0);
         Gxm1sdtclientes.setgxTv_SdtSDTClientes_Clinom( A279CliNom );
         Gxm1sdtclientes.setgxTv_SdtSDTClientes_Kilosreoperados( A40000GXC1 );
         Gxm1sdtclientes.setgxTv_SdtSDTClientes_Metrosreoperados( A40001GXC2 );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = dpclientes.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTClientes>(app.SdtSDTClientes.class, "SDTClientes", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P000U4_A396EmprCod = new String[] {""} ;
      P000U4_A548HisEstReo = new byte[1] ;
      P000U4_n548HisEstReo = new boolean[] {false} ;
      P000U4_A252CliCod = new int[1] ;
      P000U4_n252CliCod = new boolean[] {false} ;
      P000U4_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P000U4_n569HisReoFec = new boolean[] {false} ;
      P000U4_A279CliNom = new String[] {""} ;
      P000U4_A40000GXC1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000U4_n40000GXC1 = new boolean[] {false} ;
      P000U4_A40001GXC2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000U4_n40001GXC2 = new boolean[] {false} ;
      A396EmprCod = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A40000GXC1 = DecimalUtil.ZERO ;
      A40001GXC2 = DecimalUtil.ZERO ;
      Gxm1sdtclientes = new app.SdtSDTClientes(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpclientes__default(),
         new Object[] {
             new Object[] {
            P000U4_A396EmprCod, P000U4_A548HisEstReo, P000U4_n548HisEstReo, P000U4_A252CliCod, P000U4_n252CliCod, P000U4_A569HisReoFec, P000U4_n569HisReoFec, P000U4_A279CliNom, P000U4_A40000GXC1, P000U4_n40000GXC1,
            P000U4_A40001GXC2, P000U4_n40001GXC2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV6HisEstReo ;
   private byte A548HisEstReo ;
   private short Gx_err ;
   private int AV8ClicodIni ;
   private int A252CliCod ;
   private java.math.BigDecimal A40000GXC1 ;
   private java.math.BigDecimal A40001GXC2 ;
   private String AV5Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private java.util.Date AV11FechaIni ;
   private java.util.Date AV10FechaFin ;
   private java.util.Date A569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n252CliCod ;
   private boolean n569HisReoFec ;
   private boolean n40000GXC1 ;
   private boolean n40001GXC2 ;
   private GXBaseCollection<app.SdtSDTClientes>[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P000U4_A396EmprCod ;
   private byte[] P000U4_A548HisEstReo ;
   private boolean[] P000U4_n548HisEstReo ;
   private int[] P000U4_A252CliCod ;
   private boolean[] P000U4_n252CliCod ;
   private java.util.Date[] P000U4_A569HisReoFec ;
   private boolean[] P000U4_n569HisReoFec ;
   private String[] P000U4_A279CliNom ;
   private java.math.BigDecimal[] P000U4_A40000GXC1 ;
   private boolean[] P000U4_n40000GXC1 ;
   private java.math.BigDecimal[] P000U4_A40001GXC2 ;
   private boolean[] P000U4_n40001GXC2 ;
   private GXBaseCollection<app.SdtSDTClientes> Gxm2rootcol ;
   private app.SdtSDTClientes Gxm1sdtclientes ;
}

final  class dpclientes__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000U4", "SELECT DISTINCT NULL AS EmprCod, NULL AS HisEstReo, NULL AS CliCod, NULL AS HisReoFec, CliNom, GXC1, GXC2 FROM ( SELECT T1.EmprCod, T1.HisEstReo, T1.CliCod, T1.HisReoFec, T2.CliNom, COALESCE( T3.GXC1, 0) AS GXC1, COALESCE( T3.GXC2, 0) AS GXC2 FROM ((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(T4.HisBarKgm) AS GXC1, T5.CliNom, SUM(T4.HisBarMtr) AS GXC2 FROM (TXPHISREO T4 LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T4.EmprCod AND T5.CliCod = T4.CliCod) GROUP BY T5.CliNom ) T3 ON T3.CliNom = T2.CliNom) WHERE (T1.EmprCod = ? and T1.HisReoFec >= ?) AND (T1.CliCod = ? or (? = 0)) AND (T1.HisEstReo = ?) AND (T1.HisReoFec <= ?) ORDER BY T1.EmprCod, T1.HisReoFec) DistinctT ORDER BY EmprCod, HisReoFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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

