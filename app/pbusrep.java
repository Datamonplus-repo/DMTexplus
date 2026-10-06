package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusrep extends GXProcedure
{
   public pbusrep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusrep.class ), "" );
   }

   public pbusrep( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pbusrep.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pbusrep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusrep.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pbusrep.this.AV25RepCod = aP2[0];
      this.aP2 = aP2;
      pbusrep.this.AV26RepNom = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25RepCod = "" ;
      AV26RepNom = "" ;
      /* Using cursor P00PD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3074RepNom = P00PD2_A3074RepNom[0] ;
         n3074RepNom = P00PD2_n3074RepNom[0] ;
         A3073RepCod = P00PD2_A3073RepCod[0] ;
         A3074RepNom = P00PD2_A3074RepNom[0] ;
         n3074RepNom = P00PD2_n3074RepNom[0] ;
         AV25RepCod = A3073RepCod ;
         AV26RepNom = A3074RepNom ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusrep.this.A396EmprCod;
      this.aP1[0] = pbusrep.this.A252CliCod;
      this.aP2[0] = pbusrep.this.AV25RepCod;
      this.aP3[0] = pbusrep.this.AV26RepNom;
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
      P00PD2_A396EmprCod = new String[] {""} ;
      P00PD2_A252CliCod = new int[1] ;
      P00PD2_A3074RepNom = new String[] {""} ;
      P00PD2_n3074RepNom = new boolean[] {false} ;
      P00PD2_A3073RepCod = new String[] {""} ;
      A3074RepNom = "" ;
      A3073RepCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusrep__default(),
         new Object[] {
             new Object[] {
            P00PD2_A396EmprCod, P00PD2_A252CliCod, P00PD2_A3074RepNom, P00PD2_n3074RepNom, P00PD2_A3073RepCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String AV25RepCod ;
   private String AV26RepNom ;
   private String scmdbuf ;
   private String A3074RepNom ;
   private String A3073RepCod ;
   private boolean n3074RepNom ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00PD2_A396EmprCod ;
   private int[] P00PD2_A252CliCod ;
   private String[] P00PD2_A3074RepNom ;
   private boolean[] P00PD2_n3074RepNom ;
   private String[] P00PD2_A3073RepCod ;
}

final  class pbusrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PD2", "SELECT T1.EmprCod, T1.CliCod, T2.RepNom, T1.RepCod FROM (TXPCOMREP T1 INNER JOIN TXPREPRES T2 ON T2.EmprCod = T1.EmprCod AND T2.RepCod = T1.RepCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod = ?) ORDER BY T1.EmprCod, T1.RepCod, T1.CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 34);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
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
               return;
      }
   }

}

