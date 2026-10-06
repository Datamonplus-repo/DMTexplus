package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdeldisqui extends GXProcedure
{
   public pdeldisqui( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdeldisqui.class ), "" );
   }

   public pdeldisqui( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pdeldisqui.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pdeldisqui.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdeldisqui.this.AV42DisCod = aP1[0];
      this.aP1 = aP1;
      pdeldisqui.this.AV50Pgmnamein = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV48Emprnom ;
      GXv_char3[0] = AV49Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV47station, GXv_char1, GXv_char2, GXv_char3) ;
      pdeldisqui.this.A396EmprCod = GXv_char1[0] ;
      pdeldisqui.this.AV48Emprnom = GXv_char2[0] ;
      pdeldisqui.this.AV49Usurcod = GXv_char3[0] ;
      AV34Count = 0 ;
      AV41Fasquilin = (short)(1) ;
      /* Using cursor P05EL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV42DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P05EL2_A361DisCod[0] ;
         A5377DisQuiLin = P05EL2_A5377DisQuiLin[0] ;
         A368DisFasLin = P05EL2_A368DisFasLin[0] ;
         A758ProCod = P05EL2_A758ProCod[0] ;
         AV46Inc_obs = httpContext.getMessage( "DELETE DisQui.", "") + GXutil.newLine( ) ;
         AV46Inc_obs += httpContext.getMessage( "Discod ", "") + GXutil.str( A361DisCod, 8, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV54Pgmname, AV49Usurcod, AV47station, AV46Inc_obs, A361DisCod, (byte)(0), " ") ;
         /* Using cursor P05EL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A5377DisQuiLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISQUI");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdeldisqui.this.A396EmprCod;
      this.aP1[0] = pdeldisqui.this.AV42DisCod;
      this.aP2[0] = pdeldisqui.this.AV50Pgmnamein;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdeldisqui");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47station = "" ;
      GXv_char1 = new String[1] ;
      AV48Emprnom = "" ;
      GXv_char2 = new String[1] ;
      AV49Usurcod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P05EL2_A396EmprCod = new String[] {""} ;
      P05EL2_A361DisCod = new int[1] ;
      P05EL2_A5377DisQuiLin = new short[1] ;
      P05EL2_A368DisFasLin = new short[1] ;
      P05EL2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV46Inc_obs = "" ;
      AV54Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdeldisqui__default(),
         new Object[] {
             new Object[] {
            P05EL2_A396EmprCod, P05EL2_A361DisCod, P05EL2_A5377DisQuiLin, P05EL2_A368DisFasLin, P05EL2_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      AV54Pgmname = "PDelDisQui" ;
      /* GeneXus formulas. */
      AV54Pgmname = "PDelDisQui" ;
      Gx_err = (short)(0) ;
   }

   private short AV41Fasquilin ;
   private short A5377DisQuiLin ;
   private short A368DisFasLin ;
   private short Gx_err ;
   private int AV42DisCod ;
   private int AV34Count ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String AV50Pgmnamein ;
   private String AV47station ;
   private String GXv_char1[] ;
   private String AV48Emprnom ;
   private String GXv_char2[] ;
   private String AV49Usurcod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV54Pgmname ;
   private String AV46Inc_obs ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05EL2_A396EmprCod ;
   private int[] P05EL2_A361DisCod ;
   private short[] P05EL2_A5377DisQuiLin ;
   private short[] P05EL2_A368DisFasLin ;
   private String[] P05EL2_A758ProCod ;
}

final  class pdeldisqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05EL2", "SELECT EmprCod, DisCod, DisQuiLin, DisFasLin, ProCod FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05EL3", "DELETE FROM TXPDISQUI  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? AND DisQuiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISQUI")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

