package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchkintcc extends GXProcedure
{
   public pchkintcc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchkintcc.class ), "" );
   }

   public pchkintcc( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           byte aP1 )
   {
      pchkintcc.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             byte[] aP2 )
   {
      pchkintcc.this.A396EmprCod = aP0;
      pchkintcc.this.A583IntCod = aP1;
      pchkintcc.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Ok = (byte)(0) ;
      AV18GXLvl2 = (byte)(0) ;
      /* Using cursor P04U22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A583IntCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV18GXLvl2 = (byte)(1) ;
         AV15Ok = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV18GXLvl2 == 0 )
      {
         AV15Ok = (byte)(0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pchkintcc.this.AV15Ok;
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
      P04U22_A396EmprCod = new String[] {""} ;
      P04U22_A583IntCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchkintcc__default(),
         new Object[] {
             new Object[] {
            P04U22_A396EmprCod, P04U22_A583IntCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte AV15Ok ;
   private byte AV18GXLvl2 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04U22_A396EmprCod ;
   private byte[] P04U22_A583IntCod ;
}

final  class pchkintcc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04U22", "SELECT EmprCod, IntCod FROM TXPINTENS WHERE EmprCod = ? and IntCod = ? ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

