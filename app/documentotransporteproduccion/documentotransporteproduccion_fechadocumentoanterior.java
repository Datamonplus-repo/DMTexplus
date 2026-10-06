package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproduccion_fechadocumentoanterior extends GXProcedure
{
   public documentotransporteproduccion_fechadocumentoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproduccion_fechadocumentoanterior.class ), "" );
   }

   public documentotransporteproduccion_fechadocumentoanterior( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     long aP1 ,
                                     String aP2 )
   {
      documentotransporteproduccion_fechadocumentoanterior.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             java.util.Date[] aP3 )
   {
      documentotransporteproduccion_fechadocumentoanterior.this.AV13Emprcod = aP0;
      documentotransporteproduccion_fechadocumentoanterior.this.AV8AlbProcod = aP1;
      documentotransporteproduccion_fechadocumentoanterior.this.AV9AlbProPri = aP2;
      documentotransporteproduccion_fechadocumentoanterior.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10ContCod = ((GXutil.strcmp(AV9AlbProPri, "1")==0) ? "666666" : "555555") ;
      if ( (0==AV8AlbProcod) )
      {
         GXv_char1[0] = AV13Emprcod ;
         GXv_char2[0] = AV10ContCod ;
         GXv_int3[0] = (int)(AV11AlbProcodlast) ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         documentotransporteproduccion_fechadocumentoanterior.this.AV13Emprcod = GXv_char1[0] ;
         documentotransporteproduccion_fechadocumentoanterior.this.AV10ContCod = GXv_char2[0] ;
         documentotransporteproduccion_fechadocumentoanterior.this.AV11AlbProcodlast = GXv_int3[0] ;
         AV8AlbProcod = (long)(AV11AlbProcodlast+1) ;
      }
      AV12AlbProfch_Anterior = GXutil.nullDate() ;
      /* Using cursor P0AJF2 */
      pr_default.execute(0, new Object[] {AV13Emprcod, Long.valueOf(AV8AlbProcod), AV9AlbProPri});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AJF2_A396EmprCod[0] ;
         A39AlbProPri = P0AJF2_A39AlbProPri[0] ;
         A30AlbProCod = P0AJF2_A30AlbProCod[0] ;
         A34AlbProfch = P0AJF2_A34AlbProfch[0] ;
         AV12AlbProfch_Anterior = A34AlbProfch ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentotransporteproduccion_fechadocumentoanterior.this.AV12AlbProfch_Anterior;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12AlbProfch_Anterior = GXutil.nullDate() ;
      AV10ContCod = "" ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P0AJF2_A396EmprCod = new String[] {""} ;
      P0AJF2_A39AlbProPri = new String[] {""} ;
      P0AJF2_A30AlbProCod = new long[1] ;
      P0AJF2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentotransporteproduccion_fechadocumentoanterior__default(),
         new Object[] {
             new Object[] {
            P0AJF2_A396EmprCod, P0AJF2_A39AlbProPri, P0AJF2_A30AlbProCod, P0AJF2_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXv_int3[] ;
   private long AV8AlbProcod ;
   private long AV11AlbProcodlast ;
   private long A30AlbProCod ;
   private String AV13Emprcod ;
   private String AV9AlbProPri ;
   private String AV10ContCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private java.util.Date AV12AlbProfch_Anterior ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJF2_A396EmprCod ;
   private String[] P0AJF2_A39AlbProPri ;
   private long[] P0AJF2_A30AlbProCod ;
   private java.util.Date[] P0AJF2_A34AlbProfch ;
}

final  class documentotransporteproduccion_fechadocumentoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJF2", "SELECT * FROM (SELECT EmprCod, AlbProPri, AlbProCod, AlbProfch FROM TXPCALPRD WHERE (EmprCod = ? and AlbProCod < ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

