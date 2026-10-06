package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_atcud extends GXProcedure
{
   public documentodetransporteproduccion_atcud( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_atcud.class ), "" );
   }

   public documentodetransporteproduccion_atcud( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             long aP1 )
   {
      documentodetransporteproduccion_atcud.this.A396EmprCod = aP0;
      documentodetransporteproduccion_atcud.this.A30AlbProCod = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AKP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A39AlbProPri = P0AKP2_A39AlbProPri[0] ;
         A14069AlbPdATCUD = P0AKP2_A14069AlbPdATCUD[0] ;
         A14073AlbPdSerAT = P0AKP2_A14073AlbPdSerAT[0] ;
         A14074AlbPdTipAT = P0AKP2_A14074AlbPdTipAT[0] ;
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV11ContCod = "666666" ;
         }
         else if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
         {
            AV11ContCod = "555555" ;
         }
         GXv_char1[0] = AV12AlbPdATCUD ;
         GXv_char2[0] = AV13AlbPdSerAT ;
         GXv_char3[0] = AV14AlbPdTipAT ;
         new app.patcud(remoteHandle, context).execute( A396EmprCod, AV11ContCod, GXv_char1, GXv_char2, GXv_char3, GXutil.trim( AV18Pgmname)+"."+GXutil.trim( AV19Pgmdesc)) ;
         documentodetransporteproduccion_atcud.this.AV12AlbPdATCUD = GXv_char1[0] ;
         documentodetransporteproduccion_atcud.this.AV13AlbPdSerAT = GXv_char2[0] ;
         documentodetransporteproduccion_atcud.this.AV14AlbPdTipAT = GXv_char3[0] ;
         A14069AlbPdATCUD = AV12AlbPdATCUD ;
         A14073AlbPdSerAT = AV13AlbPdSerAT ;
         A14074AlbPdTipAT = AV14AlbPdTipAT ;
         /* Using cursor P0AKP3 */
         pr_default.execute(1, new Object[] {A14069AlbPdATCUD, A14073AlbPdSerAT, A14074AlbPdTipAT, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_atcud");
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
      P0AKP2_A396EmprCod = new String[] {""} ;
      P0AKP2_A30AlbProCod = new long[1] ;
      P0AKP2_A39AlbProPri = new String[] {""} ;
      P0AKP2_A14069AlbPdATCUD = new String[] {""} ;
      P0AKP2_A14073AlbPdSerAT = new String[] {""} ;
      P0AKP2_A14074AlbPdTipAT = new String[] {""} ;
      A39AlbProPri = "" ;
      A14069AlbPdATCUD = "" ;
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      AV11ContCod = "" ;
      AV12AlbPdATCUD = "" ;
      GXv_char1 = new String[1] ;
      AV13AlbPdSerAT = "" ;
      GXv_char2 = new String[1] ;
      AV14AlbPdTipAT = "" ;
      GXv_char3 = new String[1] ;
      AV18Pgmname = "" ;
      AV19Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_atcud__default(),
         new Object[] {
             new Object[] {
            P0AKP2_A396EmprCod, P0AKP2_A30AlbProCod, P0AKP2_A39AlbProPri, P0AKP2_A14069AlbPdATCUD, P0AKP2_A14073AlbPdSerAT, P0AKP2_A14074AlbPdTipAT
            }
            , new Object[] {
            }
         }
      );
      AV19Pgmdesc = httpContext.getMessage( "Documentode Transporte Produccion_ATCUD", "") ;
      AV18Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_ATCUD" ;
      /* GeneXus formulas. */
      AV19Pgmdesc = httpContext.getMessage( "Documentode Transporte Produccion_ATCUD", "") ;
      AV18Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_ATCUD" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A14069AlbPdATCUD ;
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String AV11ContCod ;
   private String AV12AlbPdATCUD ;
   private String GXv_char1[] ;
   private String AV13AlbPdSerAT ;
   private String GXv_char2[] ;
   private String AV14AlbPdTipAT ;
   private String GXv_char3[] ;
   private String AV18Pgmname ;
   private String AV19Pgmdesc ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKP2_A396EmprCod ;
   private long[] P0AKP2_A30AlbProCod ;
   private String[] P0AKP2_A39AlbProPri ;
   private String[] P0AKP2_A14069AlbPdATCUD ;
   private String[] P0AKP2_A14073AlbPdSerAT ;
   private String[] P0AKP2_A14074AlbPdTipAT ;
}

final  class documentodetransporteproduccion_atcud__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKP2", "SELECT EmprCod, AlbProCod, AlbProPri, AlbPdATCUD, AlbPdSerAT, AlbPdTipAT FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P0AKP3", "UPDATE TXPCALPRD SET AlbPdATCUD=?, AlbPdSerAT=?, AlbPdTipAT=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
      }
   }

}

