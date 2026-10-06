package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_fechadocumentoanterior extends GXProcedure
{
   public documentotransporteproveedor_fechadocumentoanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_fechadocumentoanterior.class ), "" );
   }

   public documentotransporteproveedor_fechadocumentoanterior( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 )
   {
      documentotransporteproveedor_fechadocumentoanterior.this.aP2 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date[] aP2 )
   {
      documentotransporteproveedor_fechadocumentoanterior.this.AV8Emprcod = aP0;
      documentotransporteproveedor_fechadocumentoanterior.this.AV11AlbProID = aP1;
      documentotransporteproveedor_fechadocumentoanterior.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( (0==AV11AlbProID) )
      {
         GXv_char1[0] = AV8Emprcod ;
         GXv_char2[0] = httpContext.getMessage( "REMTRA", "") ;
         GXv_int3[0] = AV13AlbProIDlast ;
         new app.pvalcon(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3) ;
         documentotransporteproveedor_fechadocumentoanterior.this.AV8Emprcod = GXv_char1[0] ;
         documentotransporteproveedor_fechadocumentoanterior.this.AV13AlbProIDlast = GXv_int3[0] ;
         AV11AlbProID = (int)(AV13AlbProIDlast+1) ;
      }
      AV12AlbProDate_Anterior = GXutil.nullDate() ;
      /* Using cursor P0AK22 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV11AlbProID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AK22_A396EmprCod[0] ;
         A13418AlbProID = P0AK22_A13418AlbProID[0] ;
         A13430AlbProDate = P0AK22_A13430AlbProDate[0] ;
         AV12AlbProDate_Anterior = A13430AlbProDate ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = documentotransporteproveedor_fechadocumentoanterior.this.AV12AlbProDate_Anterior;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12AlbProDate_Anterior = GXutil.nullDate() ;
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      scmdbuf = "" ;
      P0AK22_A396EmprCod = new String[] {""} ;
      P0AK22_A13418AlbProID = new int[1] ;
      P0AK22_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_fechadocumentoanterior__default(),
         new Object[] {
             new Object[] {
            P0AK22_A396EmprCod, P0AK22_A13418AlbProID, P0AK22_A13430AlbProDate
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11AlbProID ;
   private int AV13AlbProIDlast ;
   private int GXv_int3[] ;
   private int A13418AlbProID ;
   private String AV8Emprcod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private java.util.Date AV12AlbProDate_Anterior ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AK22_A396EmprCod ;
   private int[] P0AK22_A13418AlbProID ;
   private java.util.Date[] P0AK22_A13430AlbProDate ;
}

final  class documentotransporteproveedor_fechadocumentoanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AK22", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProDate FROM TXPCALPRO WHERE EmprCod = ? and AlbProID < ? ORDER BY EmprCod, AlbProID DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

