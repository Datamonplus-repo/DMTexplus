package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens006 extends GXProcedure
{
   public pens006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens006.class ), "" );
   }

   public pens006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           java.util.Date[] aP3 ,
                           java.util.Date[] aP4 )
   {
      pens006.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             byte[] aP5 )
   {
      pens006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens006.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens006.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens006.this.AV8Lb_fechaen = aP3[0];
      this.aP3 = aP3;
      pens006.this.AV9Lb_Horaen = aP4[0];
      this.aP4 = aP4;
      pens006.this.AV10Lb_estado = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens006.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens006.this.A396EmprCod = GXv_char2[0] ;
      pens006.this.AV11EmprNom = GXv_char3[0] ;
      pens006.this.AV12UsurCod = GXv_char4[0] ;
      /* Using cursor P01T92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5566Lb_Estado = P01T92_A5566Lb_Estado[0] ;
         A5567Lb_FechaEn = P01T92_A5567Lb_FechaEn[0] ;
         A5568Lb_HoraEn = P01T92_A5568Lb_HoraEn[0] ;
         if ( AV10Lb_estado == 1 )
         {
            AV14Inc_obs = httpContext.getMessage( "Envio Ensayos.Envio", "") + GXutil.newLine( ) ;
         }
         else
         {
            AV14Inc_obs = httpContext.getMessage( "Envio Ensayos.Elimino", "") + GXutil.newLine( ) ;
         }
         AV14Inc_obs += httpContext.getMessage( "Estado actual ", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " Estado Nuevo ", "") + GXutil.str( AV10Lb_estado, 1, 0) + GXutil.newLine( ) ;
         AV14Inc_obs += httpContext.getMessage( "Fec Envio actual ", "") + localUtil.dtoc( A5567Lb_FechaEn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha Envio Nueva ", "") + localUtil.dtoc( AV8Lb_fechaen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         AV14Inc_obs += httpContext.getMessage( "Hhmm Envio actual ", "") + localUtil.ttoc( A5568Lb_HoraEn, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm Envio Nueva ", "") + localUtil.ttoc( AV9Lb_Horaen, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         A5566Lb_Estado = AV10Lb_estado ;
         A5567Lb_FechaEn = AV8Lb_fechaen ;
         A5568Lb_HoraEn = AV9Lb_Horaen ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV12UsurCod, AV13Station, AV14Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
         /* Using cursor P01T93 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A5566Lb_Estado), A5567Lb_FechaEn, A5568Lb_HoraEn, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens006.this.A396EmprCod;
      this.aP1[0] = pens006.this.A5532Lb_numero;
      this.aP2[0] = pens006.this.A5555Lb_opcion;
      this.aP3[0] = pens006.this.AV8Lb_fechaen;
      this.aP4[0] = pens006.this.AV9Lb_Horaen;
      this.aP5[0] = pens006.this.AV10Lb_estado;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens006");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P01T92_A396EmprCod = new String[] {""} ;
      P01T92_A5532Lb_numero = new int[1] ;
      P01T92_A5555Lb_opcion = new String[] {""} ;
      P01T92_A5566Lb_Estado = new byte[1] ;
      P01T92_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P01T92_A5568Lb_HoraEn = new java.util.Date[] {GXutil.nullDate()} ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5568Lb_HoraEn = GXutil.resetTime( GXutil.nullDate() );
      AV14Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens006__default(),
         new Object[] {
             new Object[] {
            P01T92_A396EmprCod, P01T92_A5532Lb_numero, P01T92_A5555Lb_opcion, P01T92_A5566Lb_Estado, P01T92_A5567Lb_FechaEn, P01T92_A5568Lb_HoraEn
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "GestionLaboratorio.PENS006" ;
      /* GeneXus formulas. */
      AV18Pgmname = "GestionLaboratorio.PENS006" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10Lb_estado ;
   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String AV13Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private java.util.Date AV9Lb_Horaen ;
   private java.util.Date A5568Lb_HoraEn ;
   private java.util.Date AV8Lb_fechaen ;
   private java.util.Date A5567Lb_FechaEn ;
   private String AV14Inc_obs ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01T92_A396EmprCod ;
   private int[] P01T92_A5532Lb_numero ;
   private String[] P01T92_A5555Lb_opcion ;
   private byte[] P01T92_A5566Lb_Estado ;
   private java.util.Date[] P01T92_A5567Lb_FechaEn ;
   private java.util.Date[] P01T92_A5568Lb_HoraEn ;
}

final  class pens006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01T92", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_Estado, Lb_FechaEn, Lb_HoraEn FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01T93", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FechaEn=?, Lb_HoraEn=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], true);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

