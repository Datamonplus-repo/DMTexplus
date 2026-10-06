package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pexistobserva extends GXProcedure
{
   public pexistobserva( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pexistobserva.class ), "" );
   }

   public pexistobserva( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pexistobserva.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pexistobserva.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pexistobserva.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pexistobserva.this.A376DisObsLin = aP2[0];
      this.aP2 = aP2;
      pexistobserva.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P0A892 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = httpContext.getMessage( "Esta linea ya Existe ¡¡¡", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pexistobserva.this.A396EmprCod;
      this.aP1[0] = pexistobserva.this.A361DisCod;
      this.aP2[0] = pexistobserva.this.A376DisObsLin;
      this.aP3[0] = pexistobserva.this.Gx_msg;
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
      P0A892_A396EmprCod = new String[] {""} ;
      P0A892_A361DisCod = new int[1] ;
      P0A892_A376DisObsLin = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.pexistobserva__default(),
         new Object[] {
             new Object[] {
            P0A892_A396EmprCod, P0A892_A361DisCod, P0A892_A376DisObsLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A376DisObsLin ;
   private short Gx_err ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A892_A396EmprCod ;
   private int[] P0A892_A361DisCod ;
   private byte[] P0A892_A376DisObsLin ;
}

final  class pexistobserva__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A892", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

