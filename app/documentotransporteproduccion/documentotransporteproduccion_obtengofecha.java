package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproduccion_obtengofecha extends GXProcedure
{
   public documentotransporteproduccion_obtengofecha( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproduccion_obtengofecha.class ), "" );
   }

   public documentotransporteproduccion_obtengofecha( int remoteHandle ,
                                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     long aP1 )
   {
      documentotransporteproduccion_obtengofecha.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             java.util.Date[] aP2 )
   {
      documentotransporteproduccion_obtengofecha.this.A396EmprCod = aP0;
      documentotransporteproduccion_obtengofecha.this.A30AlbProCod = aP1;
      documentotransporteproduccion_obtengofecha.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9AlbProfch = GXutil.nullDate() ;
      /* Using cursor P0AJH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A34AlbProfch = P0AJH2_A34AlbProfch[0] ;
         AV9AlbProfch = A34AlbProfch ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransporteproduccion_obtengofecha.this.AV9AlbProfch;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9AlbProfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      P0AJH2_A396EmprCod = new String[] {""} ;
      P0AJH2_A30AlbProCod = new long[1] ;
      P0AJH2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentotransporteproduccion_obtengofecha__default(),
         new Object[] {
             new Object[] {
            P0AJH2_A396EmprCod, P0AJH2_A30AlbProCod, P0AJH2_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A30AlbProCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.util.Date AV9AlbProfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJH2_A396EmprCod ;
   private long[] P0AJH2_A30AlbProCod ;
   private java.util.Date[] P0AJH2_A34AlbProfch ;
}

final  class documentotransporteproduccion_obtengofecha__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJH2", "SELECT EmprCod, AlbProCod, AlbProfch FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
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

