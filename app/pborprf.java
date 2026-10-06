package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pborprf extends GXProcedure
{
   public pborprf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pborprf.class ), "" );
   }

   public pborprf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pborprf.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 )
   {
      pborprf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pborprf.this.A2792TermiCod = aP1[0];
      this.aP1 = aP1;
      pborprf.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pborprf.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pborprf.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pborprf.this.A2795BarMaqPrf = aP5[0];
      this.aP5 = aP5;
      pborprf.this.A1255BarPrfLin = aP6[0];
      this.aP6 = aP6;
      pborprf.this.A207BarPrfCod = aP7[0];
      this.aP7 = aP7;
      pborprf.this.AV15Usurcod = aP8[0];
      this.aP8 = aP8;
      pborprf.this.AV16station = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00GR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1255BarPrfLin), Boolean.valueOf(n207BarPrfCod), A207BarPrfCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2794BarLinMaq = P00GR2_A2794BarLinMaq[0] ;
         /* Using cursor P00GR3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A2792TermiCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2794BarLinMaq), Short.valueOf(A1255BarPrfLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPR2");
         AV17Inc_obs = httpContext.getMessage( "Creacion Receta en Continua", "") + GXutil.newLine( ) ;
         AV17Inc_obs += httpContext.getMessage( "HDR ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " # " + GXutil.str( A2794BarLinMaq, 4, 0) + GXutil.newLine( ) ;
         AV17Inc_obs += httpContext.getMessage( "DELETE Proceso,Tabla BARPR2 ", "") + A207BarPrfCod ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV21Pgmname, AV15Usurcod, AV16station, AV17Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pborprf.this.A396EmprCod;
      this.aP1[0] = pborprf.this.A2792TermiCod;
      this.aP2[0] = pborprf.this.A129BarCod;
      this.aP3[0] = pborprf.this.A132BarCodReo;
      this.aP4[0] = pborprf.this.A130BarCodPar;
      this.aP5[0] = pborprf.this.A2795BarMaqPrf;
      this.aP6[0] = pborprf.this.A1255BarPrfLin;
      this.aP7[0] = pborprf.this.A207BarPrfCod;
      this.aP8[0] = pborprf.this.AV15Usurcod;
      this.aP9[0] = pborprf.this.AV16station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pborprf");
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
      P00GR2_A396EmprCod = new String[] {""} ;
      P00GR2_A2792TermiCod = new String[] {""} ;
      P00GR2_A129BarCod = new int[1] ;
      P00GR2_A132BarCodReo = new byte[1] ;
      P00GR2_A130BarCodPar = new String[] {""} ;
      P00GR2_A1255BarPrfLin = new short[1] ;
      P00GR2_A207BarPrfCod = new String[] {""} ;
      P00GR2_n207BarPrfCod = new boolean[] {false} ;
      P00GR2_A2794BarLinMaq = new short[1] ;
      AV17Inc_obs = "" ;
      AV21Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pborprf__default(),
         new Object[] {
             new Object[] {
            P00GR2_A396EmprCod, P00GR2_A2792TermiCod, P00GR2_A129BarCod, P00GR2_A132BarCodReo, P00GR2_A130BarCodPar, P00GR2_A1255BarPrfLin, P00GR2_A207BarPrfCod, P00GR2_n207BarPrfCod, P00GR2_A2794BarLinMaq
            }
            , new Object[] {
            }
         }
      );
      AV21Pgmname = "Pborprf" ;
      /* GeneXus formulas. */
      AV21Pgmname = "Pborprf" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1255BarPrfLin ;
   private short A2794BarLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String A2795BarMaqPrf ;
   private String A207BarPrfCod ;
   private String AV15Usurcod ;
   private String AV16station ;
   private String scmdbuf ;
   private String AV21Pgmname ;
   private boolean n207BarPrfCod ;
   private String AV17Inc_obs ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00GR2_A396EmprCod ;
   private String[] P00GR2_A2792TermiCod ;
   private int[] P00GR2_A129BarCod ;
   private byte[] P00GR2_A132BarCodReo ;
   private String[] P00GR2_A130BarCodPar ;
   private short[] P00GR2_A1255BarPrfLin ;
   private String[] P00GR2_A207BarPrfCod ;
   private boolean[] P00GR2_n207BarPrfCod ;
   private short[] P00GR2_A2794BarLinMaq ;
}

final  class pborprf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00GR2", "SELECT EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarPrfLin, BarPrfCod, BarLinMaq FROM TXPBARPR2 WHERE (EmprCod = ? and TermiCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarPrfLin = ?) AND (BarPrfCod = ?) ORDER BY EmprCod, TermiCod, BarCod, BarCodReo, BarCodPar, BarLinMaq, BarPrfLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00GR3", "DELETE FROM TXPBARPR2  WHERE EmprCod = ? AND TermiCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarLinMaq = ? AND BarPrfLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPR2")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

