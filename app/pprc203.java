package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc203 extends GXProcedure
{
   public pprc203( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc203.class ), "" );
   }

   public pprc203( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 )
   {
      pprc203.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc203.this.AV14emprcod = aP0[0];
      this.aP0 = aP0;
      pprc203.this.AV13Lb_numero = aP1[0];
      this.aP1 = aP1;
      pprc203.this.AV8Lb_FechaE = aP2[0];
      this.aP2 = aP2;
      pprc203.this.AV9Lb_HoraE = aP3[0];
      this.aP3 = aP3;
      pprc203.this.AV10Usurcod = aP4[0];
      this.aP4 = aP4;
      pprc203.this.AV11station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05SA2 */
      pr_default.execute(0, new Object[] {AV14emprcod, Integer.valueOf(AV13Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5532Lb_numero = P05SA2_A5532Lb_numero[0] ;
         A396EmprCod = P05SA2_A396EmprCod[0] ;
         A10081Lb_hhent1 = P05SA2_A10081Lb_hhent1[0] ;
         A6460Lb_FecEnt1 = P05SA2_A6460Lb_FecEnt1[0] ;
         A5555Lb_opcion = P05SA2_A5555Lb_opcion[0] ;
         if ( !( GXutil.dateCompare(GXutil.resetTime(A6460Lb_FecEnt1), GXutil.resetTime(AV8Lb_FechaE)) ) || !( GXutil.dateCompare(A10081Lb_hhent1, AV9Lb_HoraE) ) )
         {
            AV12Inc_obs = httpContext.getMessage( "Cambio Fecha,Hora Entrada. Opcion ", "") + A5555Lb_opcion + GXutil.newLine( ) ;
            AV12Inc_obs += httpContext.getMessage( "Fecha Entrada =", "") + localUtil.dtoc( A6460Lb_FecEnt1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " se cambia por ", "") + localUtil.dtoc( AV8Lb_FechaE, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            AV12Inc_obs += httpContext.getMessage( "Hora  Entrada =", "") + localUtil.ttoc( A10081Lb_hhent1, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " se cambia por ", "") + localUtil.ttoc( AV9Lb_HoraE, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
            A6460Lb_FecEnt1 = AV8Lb_FechaE ;
            A10081Lb_hhent1 = AV9Lb_HoraE ;
         }
         /* Using cursor P05SA3 */
         pr_default.execute(1, new Object[] {A10081Lb_hhent1, A6460Lb_FecEnt1, A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ! (GXutil.strcmp("", AV12Inc_obs)==0) )
      {
         new app.pctrinc(remoteHandle, context).execute( AV14emprcod, AV18Pgmname, AV10Usurcod, AV11station, AV12Inc_obs, AV13Lb_numero, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc203.this.AV14emprcod;
      this.aP1[0] = pprc203.this.AV13Lb_numero;
      this.aP2[0] = pprc203.this.AV8Lb_FechaE;
      this.aP3[0] = pprc203.this.AV9Lb_HoraE;
      this.aP4[0] = pprc203.this.AV10Usurcod;
      this.aP5[0] = pprc203.this.AV11station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc203");
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
      P05SA2_A5532Lb_numero = new int[1] ;
      P05SA2_A396EmprCod = new String[] {""} ;
      P05SA2_A10081Lb_hhent1 = new java.util.Date[] {GXutil.nullDate()} ;
      P05SA2_A6460Lb_FecEnt1 = new java.util.Date[] {GXutil.nullDate()} ;
      P05SA2_A5555Lb_opcion = new String[] {""} ;
      A396EmprCod = "" ;
      A10081Lb_hhent1 = GXutil.resetTime( GXutil.nullDate() );
      A6460Lb_FecEnt1 = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV12Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc203__default(),
         new Object[] {
             new Object[] {
            P05SA2_A5532Lb_numero, P05SA2_A396EmprCod, P05SA2_A10081Lb_hhent1, P05SA2_A6460Lb_FecEnt1, P05SA2_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "PPrc203" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PPrc203" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV13Lb_numero ;
   private int A5532Lb_numero ;
   private String AV14emprcod ;
   private String AV10Usurcod ;
   private String AV11station ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private String AV18Pgmname ;
   private java.util.Date AV9Lb_HoraE ;
   private java.util.Date A10081Lb_hhent1 ;
   private java.util.Date AV8Lb_FechaE ;
   private java.util.Date A6460Lb_FecEnt1 ;
   private String AV12Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P05SA2_A5532Lb_numero ;
   private String[] P05SA2_A396EmprCod ;
   private java.util.Date[] P05SA2_A10081Lb_hhent1 ;
   private java.util.Date[] P05SA2_A6460Lb_FecEnt1 ;
   private String[] P05SA2_A5555Lb_opcion ;
}

final  class pprc203__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SA2", "SELECT Lb_numero, EmprCod, Lb_hhent1, Lb_FecEnt1, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05SA3", "UPDATE TXPENS002 SET Lb_hhent1=?, Lb_FecEnt1=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
            case 1 :
               stmt.setDateTime(1, (java.util.Date)parms[0], true);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

