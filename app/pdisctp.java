package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisctp extends GXProcedure
{
   public pdisctp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisctp.class ), "" );
   }

   public pdisctp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pdisctp.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pdisctp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisctp.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisctp.this.AV40DisPieCod = aP2[0];
      this.aP2 = aP2;
      pdisctp.this.AV26Flag1 = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Flag1 = (byte)(0) ;
      /* Using cursor P01WS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), AV40DisPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A380DisPieCod = P01WS2_A380DisPieCod[0] ;
         A44AlbRecCod = P01WS2_A44AlbRecCod[0] ;
         AV26Flag1 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisctp.this.A396EmprCod;
      this.aP1[0] = pdisctp.this.A361DisCod;
      this.aP2[0] = pdisctp.this.AV40DisPieCod;
      this.aP3[0] = pdisctp.this.AV26Flag1;
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
      P01WS2_A396EmprCod = new String[] {""} ;
      P01WS2_A361DisCod = new int[1] ;
      P01WS2_A380DisPieCod = new String[] {""} ;
      P01WS2_A44AlbRecCod = new int[1] ;
      A380DisPieCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisctp__default(),
         new Object[] {
             new Object[] {
            P01WS2_A396EmprCod, P01WS2_A361DisCod, P01WS2_A380DisPieCod, P01WS2_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26Flag1 ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String AV40DisPieCod ;
   private String scmdbuf ;
   private String A380DisPieCod ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WS2_A396EmprCod ;
   private int[] P01WS2_A361DisCod ;
   private String[] P01WS2_A380DisPieCod ;
   private int[] P01WS2_A44AlbRecCod ;
}

final  class pdisctp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WS2", "SELECT EmprCod, DisCod, DisPieCod, AlbRecCod FROM TXPDISALD WHERE (EmprCod = ? and DisCod = ?) AND (DisPieCod = ?) ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(3, (String)parms[2], 9);
               return;
      }
   }

}

