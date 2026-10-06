package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgcnpd extends GXProcedure
{
   public pkgcnpd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgcnpd.class ), "" );
   }

   public pkgcnpd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          java.math.BigDecimal[] aP3 )
   {
      pkgcnpd.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             int[] aP4 )
   {
      pkgcnpd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgcnpd.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pkgcnpd.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pkgcnpd.this.AV15KgsSal = aP3[0];
      this.aP3 = aP3;
      pkgcnpd.this.AV16ConSal = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16ConSal = 0 ;
      AV15KgsSal = DecimalUtil.ZERO ;
      /* Using cursor P00DN3 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1456ParArtCod = P00DN3_A1456ParArtCod[0] ;
         n1456ParArtCod = P00DN3_n1456ParArtCod[0] ;
         A976PartConUti = P00DN3_A976PartConUti[0] ;
         A974PartConEnt = P00DN3_A974PartConEnt[0] ;
         A975PartKilUti = P00DN3_A975PartKilUti[0] ;
         A973PartKilEnt = P00DN3_A973PartKilEnt[0] ;
         A976PartConUti = P00DN3_A976PartConUti[0] ;
         A974PartConEnt = P00DN3_A974PartConEnt[0] ;
         A975PartKilUti = P00DN3_A975PartKilUti[0] ;
         A973PartKilEnt = P00DN3_A973PartKilEnt[0] ;
         A977PartKilSal = A973PartKilEnt.subtract(A975PartKilUti) ;
         A978PartConSal = (int)(A974PartConEnt-A976PartConUti) ;
         AV15KgsSal = A977PartKilSal ;
         AV16ConSal = A978PartConSal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgcnpd.this.A396EmprCod;
      this.aP1[0] = pkgcnpd.this.A966PartCod;
      this.aP2[0] = pkgcnpd.this.A252CliCod;
      this.aP3[0] = pkgcnpd.this.AV15KgsSal;
      this.aP4[0] = pkgcnpd.this.AV16ConSal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00DN3_A396EmprCod = new String[] {""} ;
      P00DN3_A966PartCod = new String[] {""} ;
      P00DN3_A252CliCod = new int[1] ;
      P00DN3_A1456ParArtCod = new String[] {""} ;
      P00DN3_n1456ParArtCod = new boolean[] {false} ;
      P00DN3_A976PartConUti = new int[1] ;
      P00DN3_A974PartConEnt = new int[1] ;
      P00DN3_A975PartKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00DN3_A973PartKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1456ParArtCod = "" ;
      A975PartKilUti = DecimalUtil.ZERO ;
      A973PartKilEnt = DecimalUtil.ZERO ;
      A977PartKilSal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgcnpd__default(),
         new Object[] {
             new Object[] {
            P00DN3_A396EmprCod, P00DN3_A966PartCod, P00DN3_A252CliCod, P00DN3_A1456ParArtCod, P00DN3_n1456ParArtCod, P00DN3_A976PartConUti, P00DN3_A974PartConEnt, P00DN3_A975PartKilUti, P00DN3_A973PartKilEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV16ConSal ;
   private int A976PartConUti ;
   private int A974PartConEnt ;
   private int A978PartConSal ;
   private java.math.BigDecimal AV15KgsSal ;
   private java.math.BigDecimal A975PartKilUti ;
   private java.math.BigDecimal A973PartKilEnt ;
   private java.math.BigDecimal A977PartKilSal ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A1456ParArtCod ;
   private boolean n1456ParArtCod ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00DN3_A396EmprCod ;
   private String[] P00DN3_A966PartCod ;
   private int[] P00DN3_A252CliCod ;
   private String[] P00DN3_A1456ParArtCod ;
   private boolean[] P00DN3_n1456ParArtCod ;
   private int[] P00DN3_A976PartConUti ;
   private int[] P00DN3_A974PartConEnt ;
   private java.math.BigDecimal[] P00DN3_A975PartKilUti ;
   private java.math.BigDecimal[] P00DN3_A973PartKilEnt ;
}

final  class pkgcnpd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00DN3", "SELECT T1.EmprCod, T1.PartCod, T1.CliCod, T1.ParArtCod, COALESCE( T2.PartConUti, 0) AS PartConUti, COALESCE( T2.PartConEnt, 0) AS PartConEnt, COALESCE( T2.PartKilUti, 0) AS PartKilUti, COALESCE( T2.PartKilEnt, 0) AS PartKilEnt FROM (TXPCPARTI T1 LEFT JOIN (SELECT SUM(KilEnt) AS PartKilEnt, EmprCod, PartCod, CliCod, SUM(KilUti) AS PartKilUti, SUM(ConEnt) AS PartConEnt, SUM(ConUti) AS PartConUti FROM TXPLPARTI GROUP BY EmprCod, PartCod, CliCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

