package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdelac01 extends GXProcedure
{
   public pdelac01( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdelac01.class ), "" );
   }

   public pdelac01( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pdelac01.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pdelac01.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdelac01.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pdelac01.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdelac01.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdelac01.this.AV9Usurcod = aP4[0];
      this.aP4 = aP4;
      pdelac01.this.AV10Station = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04VU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6034Ac_Metros = P04VU2_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P04VU2_n6034Ac_Metros[0] ;
         A6033Ac_BarPar = P04VU2_A6033Ac_BarPar[0] ;
         A6032Ac_BarReo = P04VU2_A6032Ac_BarReo[0] ;
         A6031Ac_Barcod = P04VU2_A6031Ac_Barcod[0] ;
         AV11Inc_obs = httpContext.getMessage( "Eliminacion Agrupacion Acabados", "") + GXutil.newLine( ) ;
         AV11Inc_obs += httpContext.getMessage( "Hdr Agrupada ", "") + GXutil.str( A6031Ac_Barcod, 8, 0) + "-" + GXutil.str( A6032Ac_BarReo, 1, 0) + A6033Ac_BarPar + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV15Pgmname, AV9Usurcod, AV10Station, AV11Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P04VU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A6031Ac_Barcod), Byte.valueOf(A6032Ac_BarReo), A6033Ac_BarPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRACA");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdelac01.this.A396EmprCod;
      this.aP1[0] = pdelac01.this.A129BarCod;
      this.aP2[0] = pdelac01.this.A132BarCodReo;
      this.aP3[0] = pdelac01.this.A130BarCodPar;
      this.aP4[0] = pdelac01.this.AV9Usurcod;
      this.aP5[0] = pdelac01.this.AV10Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdelac01");
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
      P04VU2_A396EmprCod = new String[] {""} ;
      P04VU2_A129BarCod = new int[1] ;
      P04VU2_A132BarCodReo = new byte[1] ;
      P04VU2_A130BarCodPar = new String[] {""} ;
      P04VU2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04VU2_n6034Ac_Metros = new boolean[] {false} ;
      P04VU2_A6033Ac_BarPar = new String[] {""} ;
      P04VU2_A6032Ac_BarReo = new byte[1] ;
      P04VU2_A6031Ac_Barcod = new int[1] ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      AV11Inc_obs = "" ;
      AV15Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdelac01__default(),
         new Object[] {
             new Object[] {
            P04VU2_A396EmprCod, P04VU2_A129BarCod, P04VU2_A132BarCodReo, P04VU2_A130BarCodPar, P04VU2_A6034Ac_Metros, P04VU2_n6034Ac_Metros, P04VU2_A6033Ac_BarPar, P04VU2_A6032Ac_BarReo, P04VU2_A6031Ac_Barcod
            }
            , new Object[] {
            }
         }
      );
      AV15Pgmname = "PDelAc01" ;
      /* GeneXus formulas. */
      AV15Pgmname = "PDelAc01" ;
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
   private String AV9Usurcod ;
   private String AV10Station ;
   private String scmdbuf ;
   private String A6033Ac_BarPar ;
   private String AV15Pgmname ;
   private boolean n6034Ac_Metros ;
   private String AV11Inc_obs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VU2_A396EmprCod ;
   private int[] P04VU2_A129BarCod ;
   private byte[] P04VU2_A132BarCodReo ;
   private String[] P04VU2_A130BarCodPar ;
   private java.math.BigDecimal[] P04VU2_A6034Ac_Metros ;
   private boolean[] P04VU2_n6034Ac_Metros ;
   private String[] P04VU2_A6033Ac_BarPar ;
   private byte[] P04VU2_A6032Ac_BarReo ;
   private int[] P04VU2_A6031Ac_Barcod ;
}

final  class pdelac01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VU2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Metros, Ac_BarPar, Ac_BarReo, Ac_Barcod FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04VU3", "DELETE FROM TXPHDRACA  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND Ac_Barcod = ? AND Ac_BarReo = ? AND Ac_BarPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRACA")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
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

