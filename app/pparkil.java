package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparkil extends GXProcedure
{
   public pparkil( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparkil.class ), "" );
   }

   public pparkil( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           int[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pparkil.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pparkil.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparkil.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pparkil.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pparkil.this.AV8PartKilEnt = aP3[0];
      this.aP3 = aP3;
      pparkil.this.AV9PartKilUti = aP4[0];
      this.aP4 = aP4;
      pparkil.this.AV10PartKilSal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01243 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A975PartKilUti = P01243_A975PartKilUti[0] ;
         A973PartKilEnt = P01243_A973PartKilEnt[0] ;
         A975PartKilUti = P01243_A975PartKilUti[0] ;
         A973PartKilEnt = P01243_A973PartKilEnt[0] ;
         A977PartKilSal = A973PartKilEnt.subtract(A975PartKilUti) ;
         AV8PartKilEnt = A973PartKilEnt ;
         AV9PartKilUti = A975PartKilUti ;
         AV10PartKilSal = A977PartKilSal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparkil.this.A396EmprCod;
      this.aP1[0] = pparkil.this.A966PartCod;
      this.aP2[0] = pparkil.this.A252CliCod;
      this.aP3[0] = pparkil.this.AV8PartKilEnt;
      this.aP4[0] = pparkil.this.AV9PartKilUti;
      this.aP5[0] = pparkil.this.AV10PartKilSal;
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
      P01243_A396EmprCod = new String[] {""} ;
      P01243_A966PartCod = new String[] {""} ;
      P01243_A252CliCod = new int[1] ;
      P01243_A975PartKilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01243_A973PartKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A975PartKilUti = DecimalUtil.ZERO ;
      A973PartKilEnt = DecimalUtil.ZERO ;
      A977PartKilSal = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparkil__default(),
         new Object[] {
             new Object[] {
            P01243_A396EmprCod, P01243_A966PartCod, P01243_A252CliCod, P01243_A975PartKilUti, P01243_A973PartKilEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8PartKilEnt ;
   private java.math.BigDecimal AV9PartKilUti ;
   private java.math.BigDecimal AV10PartKilSal ;
   private java.math.BigDecimal A975PartKilUti ;
   private java.math.BigDecimal A973PartKilEnt ;
   private java.math.BigDecimal A977PartKilSal ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01243_A396EmprCod ;
   private String[] P01243_A966PartCod ;
   private int[] P01243_A252CliCod ;
   private java.math.BigDecimal[] P01243_A975PartKilUti ;
   private java.math.BigDecimal[] P01243_A973PartKilEnt ;
}

final  class pparkil__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01243", "SELECT T1.EmprCod, T1.PartCod, T1.CliCod, COALESCE( T2.PartKilUti, 0) AS PartKilUti, COALESCE( T2.PartKilEnt, 0) AS PartKilEnt FROM (TXPCPARTI T1 LEFT JOIN (SELECT EmprCod, PartCod, CliCod, SUM(KilEnt) AS PartKilEnt, SUM(KilUti) AS PartKilUti FROM TXPLPARTI GROUP BY EmprCod, PartCod, CliCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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

