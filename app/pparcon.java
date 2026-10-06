package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparcon extends GXProcedure
{
   public pparcon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparcon.class ), "" );
   }

   public pparcon( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          int[] aP3 ,
                          int[] aP4 )
   {
      pparcon.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        int[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             int[] aP4 ,
                             int[] aP5 )
   {
      pparcon.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparcon.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pparcon.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pparcon.this.AV8PartConEnt = aP3[0];
      this.aP3 = aP3;
      pparcon.this.AV9PartConUti = aP4[0];
      this.aP4 = aP4;
      pparcon.this.AV10PartConSal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01363 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A976PartConUti = P01363_A976PartConUti[0] ;
         A974PartConEnt = P01363_A974PartConEnt[0] ;
         A976PartConUti = P01363_A976PartConUti[0] ;
         A974PartConEnt = P01363_A974PartConEnt[0] ;
         A978PartConSal = (int)(A974PartConEnt-A976PartConUti) ;
         AV8PartConEnt = A974PartConEnt ;
         AV9PartConUti = A976PartConUti ;
         AV10PartConSal = A978PartConSal ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparcon.this.A396EmprCod;
      this.aP1[0] = pparcon.this.A966PartCod;
      this.aP2[0] = pparcon.this.A252CliCod;
      this.aP3[0] = pparcon.this.AV8PartConEnt;
      this.aP4[0] = pparcon.this.AV9PartConUti;
      this.aP5[0] = pparcon.this.AV10PartConSal;
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
      P01363_A396EmprCod = new String[] {""} ;
      P01363_A966PartCod = new String[] {""} ;
      P01363_A252CliCod = new int[1] ;
      P01363_A976PartConUti = new int[1] ;
      P01363_A974PartConEnt = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparcon__default(),
         new Object[] {
             new Object[] {
            P01363_A396EmprCod, P01363_A966PartCod, P01363_A252CliCod, P01363_A976PartConUti, P01363_A974PartConEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int AV8PartConEnt ;
   private int AV9PartConUti ;
   private int AV10PartConSal ;
   private int A976PartConUti ;
   private int A974PartConEnt ;
   private int A978PartConSal ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private int[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01363_A396EmprCod ;
   private String[] P01363_A966PartCod ;
   private int[] P01363_A252CliCod ;
   private int[] P01363_A976PartConUti ;
   private int[] P01363_A974PartConEnt ;
}

final  class pparcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01363", "SELECT T1.EmprCod, T1.PartCod, T1.CliCod, COALESCE( T2.PartConUti, 0) AS PartConUti, COALESCE( T2.PartConEnt, 0) AS PartConEnt FROM (TXPCPARTI T1 LEFT JOIN (SELECT EmprCod, PartCod, CliCod, SUM(ConEnt) AS PartConEnt, SUM(ConUti) AS PartConUti FROM TXPLPARTI GROUP BY EmprCod, PartCod, CliCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.PartCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.PartCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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

