package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproduccion_get_atcud extends GXProcedure
{
   public documentotransporteproduccion_get_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproduccion_get_atcud.class ), "" );
   }

   public documentotransporteproduccion_get_atcud( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             long aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      documentotransporteproduccion_get_atcud.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      documentotransporteproduccion_get_atcud.this.A396EmprCod = aP0;
      documentotransporteproduccion_get_atcud.this.A30AlbProCod = aP1;
      documentotransporteproduccion_get_atcud.this.aP2 = aP2;
      documentotransporteproduccion_get_atcud.this.aP3 = aP3;
      documentotransporteproduccion_get_atcud.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11AlbPdATCUD = "" ;
      AV12AlbPdSerAT = "" ;
      AV13AlbPdTipAT = "" ;
      /* Using cursor P0AKO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14069AlbPdATCUD = P0AKO2_A14069AlbPdATCUD[0] ;
         A14073AlbPdSerAT = P0AKO2_A14073AlbPdSerAT[0] ;
         A14074AlbPdTipAT = P0AKO2_A14074AlbPdTipAT[0] ;
         AV11AlbPdATCUD = A14069AlbPdATCUD ;
         AV12AlbPdSerAT = A14073AlbPdSerAT ;
         AV13AlbPdTipAT = A14074AlbPdTipAT ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransporteproduccion_get_atcud.this.AV11AlbPdATCUD;
      this.aP3[0] = documentotransporteproduccion_get_atcud.this.AV12AlbPdSerAT;
      this.aP4[0] = documentotransporteproduccion_get_atcud.this.AV13AlbPdTipAT;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11AlbPdATCUD = "" ;
      AV12AlbPdSerAT = "" ;
      AV13AlbPdTipAT = "" ;
      scmdbuf = "" ;
      P0AKO2_A396EmprCod = new String[] {""} ;
      P0AKO2_A30AlbProCod = new long[1] ;
      P0AKO2_A14069AlbPdATCUD = new String[] {""} ;
      P0AKO2_A14073AlbPdSerAT = new String[] {""} ;
      P0AKO2_A14074AlbPdTipAT = new String[] {""} ;
      A14069AlbPdATCUD = "" ;
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentotransporteproduccion_get_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKO2_A396EmprCod, P0AKO2_A30AlbProCod, P0AKO2_A14069AlbPdATCUD, P0AKO2_A14073AlbPdSerAT, P0AKO2_A14074AlbPdTipAT
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String AV11AlbPdATCUD ;
   private String AV12AlbPdSerAT ;
   private String AV13AlbPdTipAT ;
   private String scmdbuf ;
   private String A14069AlbPdATCUD ;
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String[] aP4 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKO2_A396EmprCod ;
   private long[] P0AKO2_A30AlbProCod ;
   private String[] P0AKO2_A14069AlbPdATCUD ;
   private String[] P0AKO2_A14073AlbPdSerAT ;
   private String[] P0AKO2_A14074AlbPdTipAT ;
}

final  class documentotransporteproduccion_get_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKO2", "SELECT EmprCod, AlbProCod, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

