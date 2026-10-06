package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfastin extends GXProcedure
{
   public pfastin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfastin.class ), "" );
   }

   public pfastin( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pfastin.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pfastin.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfastin.this.A457FasCod = aP1[0];
      this.aP1 = aP1;
      pfastin.this.AV16FasActTin = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00KC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A456FasActTin = P00KC2_A456FasActTin[0] ;
         n456FasActTin = P00KC2_n456FasActTin[0] ;
         AV16FasActTin = A456FasActTin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfastin.this.A396EmprCod;
      this.aP1[0] = pfastin.this.A457FasCod;
      this.aP2[0] = pfastin.this.AV16FasActTin;
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
      P00KC2_A396EmprCod = new String[] {""} ;
      P00KC2_A457FasCod = new String[] {""} ;
      P00KC2_A456FasActTin = new String[] {""} ;
      P00KC2_n456FasActTin = new boolean[] {false} ;
      A456FasActTin = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfastin__default(),
         new Object[] {
             new Object[] {
            P00KC2_A396EmprCod, P00KC2_A457FasCod, P00KC2_A456FasActTin, P00KC2_n456FasActTin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV16FasActTin ;
   private String scmdbuf ;
   private String A456FasActTin ;
   private boolean n456FasActTin ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00KC2_A396EmprCod ;
   private String[] P00KC2_A457FasCod ;
   private String[] P00KC2_A456FasActTin ;
   private boolean[] P00KC2_n456FasActTin ;
}

final  class pfastin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00KC2", "SELECT EmprCod, FasCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

