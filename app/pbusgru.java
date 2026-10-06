package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusgru extends GXProcedure
{
   public pbusgru( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusgru.class ), "" );
   }

   public pbusgru( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           byte[] aP1 )
   {
      pbusgru.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             byte[] aP2 )
   {
      pbusgru.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusgru.this.A499GrpFamCod = aP1[0];
      this.aP1 = aP1;
      pbusgru.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      /* Using cursor P000X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A499GrpFamCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV15Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusgru.this.A396EmprCod;
      this.aP1[0] = pbusgru.this.A499GrpFamCod;
      this.aP2[0] = pbusgru.this.AV15Flag;
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
      P000X2_A396EmprCod = new String[] {""} ;
      P000X2_A499GrpFamCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusgru__default(),
         new Object[] {
             new Object[] {
            P000X2_A396EmprCod, P000X2_A499GrpFamCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A499GrpFamCod ;
   private byte AV15Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P000X2_A396EmprCod ;
   private byte[] P000X2_A499GrpFamCod ;
}

final  class pbusgru__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000X2", "SELECT EmprCod, GrpFamCod FROM TXPGRUFAM WHERE EmprCod = ? and GrpFamCod = ? ORDER BY EmprCod, GrpFamCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

