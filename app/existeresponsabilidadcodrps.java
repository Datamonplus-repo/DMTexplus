package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class existeresponsabilidadcodrps extends GXProcedure
{
   public existeresponsabilidadcodrps( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( existeresponsabilidadcodrps.class ), "" );
   }

   public existeresponsabilidadcodrps( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      existeresponsabilidadcodrps.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      existeresponsabilidadcodrps.this.A396EmprCod = aP0;
      existeresponsabilidadcodrps.this.A7000Rps_Cod = aP1;
      existeresponsabilidadcodrps.this.aP2 = aP2;
      existeresponsabilidadcodrps.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Ok = httpContext.getMessage( "N", "") ;
      AV10Rps_Dsc = "" ;
      /* Using cursor P087P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A7000Rps_Cod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7001Rps_Dsc = P087P2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087P2_n7001Rps_Dsc[0] ;
         AV8Ok = httpContext.getMessage( "S", "") ;
         AV10Rps_Dsc = A7001Rps_Dsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = existeresponsabilidadcodrps.this.AV10Rps_Dsc;
      this.aP3[0] = existeresponsabilidadcodrps.this.AV8Ok;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10Rps_Dsc = "" ;
      AV8Ok = "" ;
      scmdbuf = "" ;
      P087P2_A396EmprCod = new String[] {""} ;
      P087P2_A7000Rps_Cod = new short[1] ;
      P087P2_A7001Rps_Dsc = new String[] {""} ;
      P087P2_n7001Rps_Dsc = new boolean[] {false} ;
      A7001Rps_Dsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.existeresponsabilidadcodrps__default(),
         new Object[] {
             new Object[] {
            P087P2_A396EmprCod, P087P2_A7000Rps_Cod, P087P2_A7001Rps_Dsc, P087P2_n7001Rps_Dsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A7000Rps_Cod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV10Rps_Dsc ;
   private String AV8Ok ;
   private String scmdbuf ;
   private String A7001Rps_Dsc ;
   private boolean n7001Rps_Dsc ;
   private String[] aP3 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P087P2_A396EmprCod ;
   private short[] P087P2_A7000Rps_Cod ;
   private String[] P087P2_A7001Rps_Dsc ;
   private boolean[] P087P2_n7001Rps_Dsc ;
}

final  class existeresponsabilidadcodrps__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087P2", "SELECT EmprCod, Rps_Cod, Rps_Dsc FROM TXPCODRPS WHERE EmprCod = ? and Rps_Cod = ? ORDER BY EmprCod, Rps_Cod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

