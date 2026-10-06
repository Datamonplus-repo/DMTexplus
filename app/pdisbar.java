package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisbar extends GXProcedure
{
   public pdisbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisbar.class ), "" );
   }

   public pdisbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 )
   {
      pdisbar.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pdisbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisbar.this.A1146DisDisCod = aP1[0];
      this.aP1 = aP1;
      pdisbar.this.AV8Flag_hdr = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag_hdr = (byte)(0) ;
      /* Using cursor P01IV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1146DisDisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1139DisBarCod = P01IV2_A1139DisBarCod[0] ;
         A1140DisBarReo = P01IV2_A1140DisBarReo[0] ;
         A1141DisBarPar = P01IV2_A1141DisBarPar[0] ;
         AV8Flag_hdr = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisbar.this.A396EmprCod;
      this.aP1[0] = pdisbar.this.A1146DisDisCod;
      this.aP2[0] = pdisbar.this.AV8Flag_hdr;
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
      P01IV2_A396EmprCod = new String[] {""} ;
      P01IV2_A1146DisDisCod = new int[1] ;
      P01IV2_A1139DisBarCod = new int[1] ;
      P01IV2_A1140DisBarReo = new byte[1] ;
      P01IV2_A1141DisBarPar = new String[] {""} ;
      A1141DisBarPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisbar__default(),
         new Object[] {
             new Object[] {
            P01IV2_A396EmprCod, P01IV2_A1146DisDisCod, P01IV2_A1139DisBarCod, P01IV2_A1140DisBarReo, P01IV2_A1141DisBarPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV8Flag_hdr ;
   private byte A1140DisBarReo ;
   private short Gx_err ;
   private int A1146DisDisCod ;
   private int A1139DisBarCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A1141DisBarPar ;
   private byte[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01IV2_A396EmprCod ;
   private int[] P01IV2_A1146DisDisCod ;
   private int[] P01IV2_A1139DisBarCod ;
   private byte[] P01IV2_A1140DisBarReo ;
   private String[] P01IV2_A1141DisBarPar ;
}

final  class pdisbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01IV2", "SELECT EmprCod, DisDisCod, DisBarCod, DisBarReo, DisBarPar FROM TXPDISBAR WHERE EmprCod = ? and DisDisCod = ? ORDER BY EmprCod, DisDisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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

