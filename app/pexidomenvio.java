package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexidomenvio extends GXProcedure
{
   public pexidomenvio( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexidomenvio.class ), "" );
   }

   public pexidomenvio( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 )
   {
      pexidomenvio.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             byte[] aP3 )
   {
      pexidomenvio.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexidomenvio.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pexidomenvio.this.A266CliEnvLin = aP2[0];
      this.aP2 = aP2;
      pexidomenvio.this.AV8Flag = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl2 = (byte)(0) ;
      /* Using cursor P05YZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV11GXLvl2 = (byte)(1) ;
         AV8Flag = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl2 == 0 )
      {
         AV8Flag = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexidomenvio.this.A396EmprCod;
      this.aP1[0] = pexidomenvio.this.A252CliCod;
      this.aP2[0] = pexidomenvio.this.A266CliEnvLin;
      this.aP3[0] = pexidomenvio.this.AV8Flag;
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
      P05YZ2_A396EmprCod = new String[] {""} ;
      P05YZ2_A252CliCod = new int[1] ;
      P05YZ2_A266CliEnvLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pexidomenvio__default(),
         new Object[] {
             new Object[] {
            P05YZ2_A396EmprCod, P05YZ2_A252CliCod, P05YZ2_A266CliEnvLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A266CliEnvLin ;
   private byte AV8Flag ;
   private byte AV11GXLvl2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P05YZ2_A396EmprCod ;
   private int[] P05YZ2_A252CliCod ;
   private byte[] P05YZ2_A266CliEnvLin ;
}

final  class pexidomenvio__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05YZ2", "SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? and CliEnvLin = ? ORDER BY EmprCod, CliCod, CliEnvLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

