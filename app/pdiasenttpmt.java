package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdiasenttpmt extends GXProcedure
{
   public pdiasenttpmt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdiasenttpmt.class ), "" );
   }

   public pdiasenttpmt( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     String[] aP2 )
   {
      pdiasenttpmt.this.aP3 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 )
   {
      pdiasenttpmt.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdiasenttpmt.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pdiasenttpmt.this.A11467TpMtId = aP2[0];
      this.aP2 = aP2;
      pdiasenttpmt.this.AV12Disfecent = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Disfecent = GXutil.nullDate() ;
      /* Using cursor P04JO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A11467TpMtId});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11469TpMtDias = P04JO2_A11469TpMtDias[0] ;
         n11469TpMtDias = P04JO2_n11469TpMtDias[0] ;
         AV12Disfecent = GXutil.dadd(GXutil.today( ),+((int)(A11469TpMtDias))) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      Gx_msg = httpContext.getMessage( "&Disfecent=", "") + localUtil.dtoc( AV12Disfecent, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      System.out.println( Gx_msg );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdiasenttpmt.this.A396EmprCod;
      this.aP1[0] = pdiasenttpmt.this.A252CliCod;
      this.aP2[0] = pdiasenttpmt.this.A11467TpMtId;
      this.aP3[0] = pdiasenttpmt.this.AV12Disfecent;
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
      P04JO2_A396EmprCod = new String[] {""} ;
      P04JO2_A252CliCod = new int[1] ;
      P04JO2_A11467TpMtId = new String[] {""} ;
      P04JO2_A11469TpMtDias = new short[1] ;
      P04JO2_n11469TpMtDias = new boolean[] {false} ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdiasenttpmt__default(),
         new Object[] {
             new Object[] {
            P04JO2_A396EmprCod, P04JO2_A252CliCod, P04JO2_A11467TpMtId, P04JO2_A11469TpMtDias, P04JO2_n11469TpMtDias
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A11469TpMtDias ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A11467TpMtId ;
   private String scmdbuf ;
   private String Gx_msg ;
   private java.util.Date AV12Disfecent ;
   private boolean n11469TpMtDias ;
   private java.util.Date[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04JO2_A396EmprCod ;
   private int[] P04JO2_A252CliCod ;
   private String[] P04JO2_A11467TpMtId ;
   private short[] P04JO2_A11469TpMtDias ;
   private boolean[] P04JO2_n11469TpMtDias ;
}

final  class pdiasenttpmt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04JO2", "SELECT EmprCod, CliCod, TpMtId, TpMtDias FROM TXPCLTPMT WHERE EmprCod = ? and CliCod = ? and TpMtId = ? ORDER BY EmprCod, CliCod, TpMtId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 4);
               return;
      }
   }

}

