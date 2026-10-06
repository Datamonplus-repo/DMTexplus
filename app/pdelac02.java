package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelac02 extends GXProcedure
{
   public pdelac02( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelac02.class ), "" );
   }

   public pdelac02( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pdelac02.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pdelac02.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelac02.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdelac02.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdelac02.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdelac02.this.A6031Ac_Barcod = aP4[0];
      this.aP4 = aP4;
      pdelac02.this.A6032Ac_BarReo = aP5[0];
      this.aP5 = aP5;
      pdelac02.this.A6033Ac_BarPar = aP6[0];
      this.aP6 = aP6;
      pdelac02.this.AV9Usurcod = aP7[0];
      this.aP7 = aP7;
      pdelac02.this.AV10Station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04VV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6034Ac_Metros = P04VV2_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P04VV2_n6034Ac_Metros[0] ;
         AV11Inc_obs = httpContext.getMessage( "Eliminacion Agrupacion Acabados", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Hdr Agrupada ", "") + GXutil.str( A6031Ac_Barcod, 8, 0) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9Usurcod, AV10Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P04VV3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelac02.this.A396EmprCod;
      this.aP1[0] = pdelac02.this.A129BarCod;
      this.aP2[0] = pdelac02.this.A132BarCodReo;
      this.aP3[0] = pdelac02.this.A130BarCodPar;
      this.aP4[0] = pdelac02.this.A6031Ac_Barcod;
      this.aP5[0] = pdelac02.this.A6032Ac_BarReo;
      this.aP6[0] = pdelac02.this.A6033Ac_BarPar;
      this.aP7[0] = pdelac02.this.AV9Usurcod;
      this.aP8[0] = pdelac02.this.AV10Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelac02");
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
      P04VV2_A396EmprCod = new String[] {""} ;
      P04VV2_A129BarCod = new int[1] ;
      P04VV2_A132BarCodReo = new byte[1] ;
      P04VV2_A130BarCodPar = new String[] {""} ;
      P04VV2_A6031Ac_Barcod = new int[1] ;
      P04VV2_A6032Ac_BarReo = new byte[1] ;
      P04VV2_A6033Ac_BarPar = new String[] {""} ;
      P04VV2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04VV2_n6034Ac_Metros = new boolean[] {false} ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelac02__default(),
         new Object[] {
             new Object[] {
            P04VV2_A396EmprCod, P04VV2_A129BarCod, P04VV2_A132BarCodReo, P04VV2_A130BarCodPar, P04VV2_A6031Ac_Barcod, P04VV2_A6032Ac_BarReo, P04VV2_A6033Ac_BarPar, P04VV2_A6034Ac_Metros, P04VV2_n6034Ac_Metros
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PDelAc02" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PDelAc02" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A6032Ac_BarReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A6031Ac_Barcod ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A6033Ac_BarPar ;
   private String AV9Usurcod ;
   private String AV10Station ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private boolean n6034Ac_Metros ;
   private String AV11Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VV2_A396EmprCod ;
   private int[] P04VV2_A129BarCod ;
   private byte[] P04VV2_A132BarCodReo ;
   private String[] P04VV2_A130BarCodPar ;
   private int[] P04VV2_A6031Ac_Barcod ;
   private byte[] P04VV2_A6032Ac_BarReo ;
   private String[] P04VV2_A6033Ac_BarPar ;
   private java.math.BigDecimal[] P04VV2_A6034Ac_Metros ;
   private boolean[] P04VV2_n6034Ac_Metros ;
}

final  class pdelac02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VV2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar, Ac_Metros FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and Ac_Barcod = ? and Ac_BarReo = ? and Ac_BarPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04VV3", "DELETE FROM TXPHDRACA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRACA")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

