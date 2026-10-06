package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtopda extends GXProcedure
{
   public pmtopda( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtopda.class ), "" );
   }

   public pmtopda( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pmtopda.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pmtopda.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtopda.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmtopda.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmtopda.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmtopda.this.AV8BarPart = aP4[0];
      this.aP4 = aP4;
      pmtopda.this.AV9usurcod = aP5[0];
      this.aP5 = aP5;
      pmtopda.this.AV10station = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P062C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1503BarPart = P062C2_A1503BarPart[0] ;
         AV11Inc_obs = httpContext.getMessage( "Cambio PARTIDA", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Partida ", "") + GXutil.str( A1503BarPart, 4, 0) + httpContext.getMessage( " por ", "") + GXutil.str( AV8BarPart, 4, 0) ;
         A1503BarPart = AV8BarPart ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9usurcod, AV10station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P062C3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A1503BarPart), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtopda.this.A396EmprCod;
      this.aP1[0] = pmtopda.this.A129BarCod;
      this.aP2[0] = pmtopda.this.A132BarCodReo;
      this.aP3[0] = pmtopda.this.A130BarCodPar;
      this.aP4[0] = pmtopda.this.AV8BarPart;
      this.aP5[0] = pmtopda.this.AV9usurcod;
      this.aP6[0] = pmtopda.this.AV10station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmtopda");
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
      P062C2_A396EmprCod = new String[] {""} ;
      P062C2_A129BarCod = new int[1] ;
      P062C2_A132BarCodReo = new byte[1] ;
      P062C2_A130BarCodPar = new String[] {""} ;
      P062C2_A1503BarPart = new short[1] ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtopda__default(),
         new Object[] {
             new Object[] {
            P062C2_A396EmprCod, P062C2_A129BarCod, P062C2_A132BarCodReo, P062C2_A130BarCodPar, P062C2_A1503BarPart
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PMtoPda" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PMtoPda" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV8BarPart ;
   private short A1503BarPart ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9usurcod ;
   private String AV10station ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private String AV11Inc_obs ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P062C2_A396EmprCod ;
   private int[] P062C2_A129BarCod ;
   private byte[] P062C2_A132BarCodReo ;
   private String[] P062C2_A130BarCodPar ;
   private short[] P062C2_A1503BarPart ;
}

final  class pmtopda__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P062C2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPart FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P062C3", "UPDATE TXPBARCAD SET BarPart=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

