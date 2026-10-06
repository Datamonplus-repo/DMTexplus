package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens044 extends GXProcedure
{
   public pens044( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens044.class ), "" );
   }

   public pens044( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 )
   {
      pens044.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 )
   {
      pens044.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens044.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens044.this.A5555Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens044.this.AV8LB_FECNOA1 = aP3[0];
      this.aP3 = aP3;
      pens044.this.AV9Lb_hhnoa1 = aP4[0];
      this.aP4 = aP4;
      pens044.this.AV10Lb_obscr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pens044.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      pens044.this.A396EmprCod = GXv_char2[0] ;
      pens044.this.AV13EmprNom = GXv_char3[0] ;
      pens044.this.AV14UsurCod = GXv_char4[0] ;
      /* Using cursor P02HD2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5566Lb_Estado = P02HD2_A5566Lb_Estado[0] ;
         A6461Lb_FecNoa1 = P02HD2_A6461Lb_FecNoa1[0] ;
         A10082Lb_hhnoa1 = P02HD2_A10082Lb_hhnoa1[0] ;
         A5563Lb_FechaR = P02HD2_A5563Lb_FechaR[0] ;
         A5564Lb_HoraR = P02HD2_A5564Lb_HoraR[0] ;
         A10822Lb_ObsCR = P02HD2_A10822Lb_ObsCR[0] ;
         AV11Inc_obs = httpContext.getMessage( "Rechazo Ensayos.", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Opcion                ", "") + A5555Lb_opcion + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Estado actual         ", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " Estado Nuevo         ", "") + "2" + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Fec NoAcept   actual  ", "") + localUtil.dtoc( A6461Lb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha NoAcept Nueva  ", "") + localUtil.dtoc( AV8LB_FECNOA1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Hhmm Noacept  actual  ", "") + localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm NoAcept   Nueva ", "") + localUtil.ttoc( AV9Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Fec Recep actual      ", "") + localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " Fecha Recep Nueva    ", "") + localUtil.dtoc( AV8LB_FECNOA1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Hhmm Recep actual     ", "") + localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Hhmm Recep Nueva     ", "") + localUtil.ttoc( AV9Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV14UsurCod, AV12Station, AV11Inc_obs, A5532Lb_numero, (byte)(0), " ") ;
         A10822Lb_ObsCR = AV10Lb_obscr ;
         A6461Lb_FecNoa1 = AV8LB_FECNOA1 ;
         A10082Lb_hhnoa1 = AV9Lb_hhnoa1 ;
         A5563Lb_FechaR = AV8LB_FECNOA1 ;
         A5564Lb_HoraR = AV9Lb_hhnoa1 ;
         A5566Lb_Estado = (byte)(2) ;
         /* Using cursor P02HD3 */
         pr_default.execute(1, new Object[] {Byte.valueOf(A5566Lb_Estado), A6461Lb_FecNoa1, A10082Lb_hhnoa1, A5563Lb_FechaR, A5564Lb_HoraR, A10822Lb_ObsCR, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens044.this.A396EmprCod;
      this.aP1[0] = pens044.this.A5532Lb_numero;
      this.aP2[0] = pens044.this.A5555Lb_opcion;
      this.aP3[0] = pens044.this.AV8LB_FECNOA1;
      this.aP4[0] = pens044.this.AV9Lb_hhnoa1;
      this.aP5[0] = pens044.this.AV10Lb_obscr;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens044");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P02HD2_A396EmprCod = new String[] {""} ;
      P02HD2_A5532Lb_numero = new int[1] ;
      P02HD2_A5555Lb_opcion = new String[] {""} ;
      P02HD2_A5566Lb_Estado = new byte[1] ;
      P02HD2_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02HD2_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02HD2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P02HD2_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P02HD2_A10822Lb_ObsCR = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      A10822Lb_ObsCR = "" ;
      AV11Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens044__default(),
         new Object[] {
             new Object[] {
            P02HD2_A396EmprCod, P02HD2_A5532Lb_numero, P02HD2_A5555Lb_opcion, P02HD2_A5566Lb_Estado, P02HD2_A6461Lb_FecNoa1, P02HD2_A10082Lb_hhnoa1, P02HD2_A5563Lb_FechaR, P02HD2_A5564Lb_HoraR, P02HD2_A10822Lb_ObsCR
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "GestionLaboratorio.PENS044" ;
      /* GeneXus formulas. */
      AV18Pgmname = "GestionLaboratorio.PENS044" ;
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private java.util.Date AV9Lb_hhnoa1 ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date AV8LB_FECNOA1 ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5563Lb_FechaR ;
   private String AV10Lb_obscr ;
   private String A10822Lb_ObsCR ;
   private String AV11Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02HD2_A396EmprCod ;
   private int[] P02HD2_A5532Lb_numero ;
   private String[] P02HD2_A5555Lb_opcion ;
   private byte[] P02HD2_A5566Lb_Estado ;
   private java.util.Date[] P02HD2_A6461Lb_FecNoa1 ;
   private java.util.Date[] P02HD2_A10082Lb_hhnoa1 ;
   private java.util.Date[] P02HD2_A5563Lb_FechaR ;
   private java.util.Date[] P02HD2_A5564Lb_HoraR ;
   private String[] P02HD2_A10822Lb_ObsCR ;
}

final  class pens044__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02HD2", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_Estado, Lb_FecNoa1, Lb_hhnoa1, Lb_FechaR, Lb_HoraR, Lb_ObsCR FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02HD3", "UPDATE TXPENS002 SET Lb_Estado=?, Lb_FecNoa1=?, Lb_hhnoa1=?, Lb_FechaR=?, Lb_HoraR=?, Lb_ObsCR=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
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
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDateTime(5, (java.util.Date)parms[4], true);
               stmt.setVarchar(6, (String)parms[5], 300, false);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
      }
   }

}

