package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfamtaesid extends GXProcedure
{
   public pfamtaesid( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfamtaesid.class ), "" );
   }

   public pfamtaesid( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pfamtaesid.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      pfamtaesid.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfamtaesid.this.A499GrpFamCod = aP1[0];
      this.aP1 = aP1;
      pfamtaesid.this.AV8TaesId = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TaesId = " " ;
      /* Using cursor P04UQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11634TaesId = P04UQ2_A11634TaesId[0] ;
         n11634TaesId = P04UQ2_n11634TaesId[0] ;
         AV8TaesId = A11634TaesId ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfamtaesid.this.A396EmprCod;
      this.aP1[0] = pfamtaesid.this.A499GrpFamCod;
      this.aP2[0] = pfamtaesid.this.AV8TaesId;
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
      P04UQ2_A396EmprCod = new String[] {""} ;
      P04UQ2_A499GrpFamCod = new byte[1] ;
      P04UQ2_A11634TaesId = new String[] {""} ;
      P04UQ2_n11634TaesId = new boolean[] {false} ;
      A11634TaesId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfamtaesid__default(),
         new Object[] {
             new Object[] {
            P04UQ2_A396EmprCod, P04UQ2_A499GrpFamCod, P04UQ2_A11634TaesId, P04UQ2_n11634TaesId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A499GrpFamCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8TaesId ;
   private String scmdbuf ;
   private String A11634TaesId ;
   private boolean n11634TaesId ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04UQ2_A396EmprCod ;
   private byte[] P04UQ2_A499GrpFamCod ;
   private String[] P04UQ2_A11634TaesId ;
   private boolean[] P04UQ2_n11634TaesId ;
}

final  class pfamtaesid__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04UQ2", "SELECT EmprCod, GrpFamCod, TaesId FROM TXPGRUFAM WHERE EmprCod = ? and GrpFamCod = ? ORDER BY EmprCod, GrpFamCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

