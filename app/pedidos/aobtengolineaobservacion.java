package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aobtengolineaobservacion extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aobtengolineaobservacion pgm = new aobtengolineaobservacion (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      int aP1 = 0;
      byte aP2 = 0;
      String[] aP3 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (int) GXutil.lval( args[1]);
         aP2 = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public aobtengolineaobservacion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aobtengolineaobservacion.class ), "" );
   }

   public aobtengolineaobservacion( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 )
   {
      aobtengolineaobservacion.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String[] aP3 )
   {
      aobtengolineaobservacion.this.A396EmprCod = aP0;
      aobtengolineaobservacion.this.A361DisCod = aP1;
      aobtengolineaobservacion.this.A376DisObsLin = aP2;
      aobtengolineaobservacion.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DisObsTxt = "" ;
      /* Using cursor P0AG62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A377DisObsTxt = P0AG62_A377DisObsTxt[0] ;
         AV8DisObsTxt = A377DisObsTxt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(obtengolineaobservacion.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP3[0] = aobtengolineaobservacion.this.AV8DisObsTxt;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DisObsTxt = "" ;
      scmdbuf = "" ;
      P0AG62_A396EmprCod = new String[] {""} ;
      P0AG62_A361DisCod = new int[1] ;
      P0AG62_A376DisObsLin = new byte[1] ;
      P0AG62_A377DisObsTxt = new String[] {""} ;
      A377DisObsTxt = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.aobtengolineaobservacion__default(),
         new Object[] {
             new Object[] {
            P0AG62_A396EmprCod, P0AG62_A361DisCod, P0AG62_A376DisObsLin, P0AG62_A377DisObsTxt
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
   private String AV8DisObsTxt ;
   private String scmdbuf ;
   private String A377DisObsTxt ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AG62_A396EmprCod ;
   private int[] P0AG62_A361DisCod ;
   private byte[] P0AG62_A376DisObsLin ;
   private String[] P0AG62_A377DisObsTxt ;
}

final  class aobtengolineaobservacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG62", "SELECT EmprCod, DisCod, DisObsLin, DisObsTxt FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
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

