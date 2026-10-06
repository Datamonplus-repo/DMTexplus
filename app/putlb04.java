package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class putlb04 extends GXProcedure
{
   public putlb04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( putlb04.class ), "" );
   }

   public putlb04( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      putlb04.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      putlb04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      putlb04.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      putlb04.this.AV17Lb_opcion = aP2[0];
      this.aP2 = aP2;
      putlb04.this.AV19Usurcod = aP3[0];
      this.aP3 = aP3;
      putlb04.this.AV20station = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05S92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), AV17Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P05S92_A5555Lb_opcion[0] ;
         A6461Lb_FecNoa1 = P05S92_A6461Lb_FecNoa1[0] ;
         A10082Lb_hhnoa1 = P05S92_A10082Lb_hhnoa1[0] ;
         A5563Lb_FechaR = P05S92_A5563Lb_FechaR[0] ;
         A5564Lb_HoraR = P05S92_A5564Lb_HoraR[0] ;
         A5566Lb_Estado = P05S92_A5566Lb_Estado[0] ;
         AV21Inc_obs = httpContext.getMessage( "Libero Rechazo,Opcion= ", "") + AV17Lb_opcion ;
         AV21Inc_obs += httpContext.getMessage( "Fecha Rechazo   =", "") + localUtil.dtoc( A6461Lb_FecNoa1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " se inicializa", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Hora  Rechazo   =", "") + localUtil.ttoc( A10082Lb_hhnoa1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " se inicializa", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Fecha Recepcion =", "") + localUtil.dtoc( A5563Lb_FechaR, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " se inicializa", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Hora  Recepcion =", "") + localUtil.ttoc( A5564Lb_HoraR, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " se inicializa", "") + GXutil.newLine( ) ;
         AV21Inc_obs += httpContext.getMessage( "Estado Opcion   =", "") + GXutil.str( A5566Lb_Estado, 1, 0) + httpContext.getMessage( " pasa a 1", "") + GXutil.newLine( ) ;
         A6461Lb_FecNoa1 = GXutil.nullDate() ;
         A5563Lb_FechaR = GXutil.nullDate() ;
         A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
         A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
         A5566Lb_Estado = (byte)(1) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV25Pgmname, AV19Usurcod, AV20station, AV21Inc_obs, A5532Lb_numero, (byte)(0), "") ;
         /* Using cursor P05S93 */
         pr_default.execute(1, new Object[] {A6461Lb_FecNoa1, A10082Lb_hhnoa1, A5563Lb_FechaR, A5564Lb_HoraR, Byte.valueOf(A5566Lb_Estado), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = putlb04.this.A396EmprCod;
      this.aP1[0] = putlb04.this.A5532Lb_numero;
      this.aP2[0] = putlb04.this.AV17Lb_opcion;
      this.aP3[0] = putlb04.this.AV19Usurcod;
      this.aP4[0] = putlb04.this.AV20station;
      Application.commitDataStores(context, remoteHandle, pr_default, "putlb04");
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
      P05S92_A396EmprCod = new String[] {""} ;
      P05S92_A5532Lb_numero = new int[1] ;
      P05S92_A5555Lb_opcion = new String[] {""} ;
      P05S92_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P05S92_A10082Lb_hhnoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P05S92_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P05S92_A5564Lb_HoraR = new java.util.Date[] {GXutil.nullDate()} ;
      P05S92_A5566Lb_Estado = new byte[1] ;
      A5555Lb_opcion = "" ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A10082Lb_hhnoa1 = GXutil.resetTime( GXutil.nullDate() );
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5564Lb_HoraR = GXutil.resetTime( GXutil.nullDate() );
      AV21Inc_obs = "" ;
      AV25Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.putlb04__default(),
         new Object[] {
             new Object[] {
            P05S92_A396EmprCod, P05S92_A5532Lb_numero, P05S92_A5555Lb_opcion, P05S92_A6461Lb_FecNoa1, P05S92_A10082Lb_hhnoa1, P05S92_A5563Lb_FechaR, P05S92_A5564Lb_HoraR, P05S92_A5566Lb_Estado
            }
            , new Object[] {
            }
         }
      );
      AV25Pgmname = "PUTLB04" ;
      /* GeneXus formulas. */
      AV25Pgmname = "PUTLB04" ;
      Gx_err = (short)(0) ;
   }

   private byte A5566Lb_Estado ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV17Lb_opcion ;
   private String AV19Usurcod ;
   private String AV20station ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV25Pgmname ;
   private java.util.Date A10082Lb_hhnoa1 ;
   private java.util.Date A5564Lb_HoraR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5563Lb_FechaR ;
   private String AV21Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05S92_A396EmprCod ;
   private int[] P05S92_A5532Lb_numero ;
   private String[] P05S92_A5555Lb_opcion ;
   private java.util.Date[] P05S92_A6461Lb_FecNoa1 ;
   private java.util.Date[] P05S92_A10082Lb_hhnoa1 ;
   private java.util.Date[] P05S92_A5563Lb_FechaR ;
   private java.util.Date[] P05S92_A5564Lb_HoraR ;
   private byte[] P05S92_A5566Lb_Estado ;
}

final  class putlb04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05S92", "SELECT EmprCod, Lb_numero, Lb_opcion, Lb_FecNoa1, Lb_hhnoa1, Lb_FechaR, Lb_HoraR, Lb_Estado FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05S93", "UPDATE TXPENS002 SET Lb_FecNoa1=?, Lb_hhnoa1=?, Lb_FechaR=?, Lb_HoraR=?, Lb_Estado=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], true);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDateTime(4, (java.util.Date)parms[3], true);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

