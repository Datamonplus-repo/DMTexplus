package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp018 extends GXProcedure
{
   public pdyrp018( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp018.class ), "" );
   }

   public pdyrp018( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pdyrp018.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pdyrp018.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp018.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp018.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp018.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV19FlagMagkgs ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MAGRKG", ""), GXv_int1) ;
      pdyrp018.this.AV19FlagMagkgs = GXv_int1[0] ;
      /* Using cursor P09983 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09983_A130BarCodPar[0] ;
         A132BarCodReo = P09983_A132BarCodReo[0] ;
         A129BarCod = P09983_A129BarCod[0] ;
         A166BarKgm = P09983_A166BarKgm[0] ;
         n166BarKgm = P09983_n166BarKgm[0] ;
         A166BarKgm = P09983_A166BarKgm[0] ;
         n166BarKgm = P09983_n166BarKgm[0] ;
         AV20Kilos = A166BarKgm ;
         /* Using cursor P09984 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A590KgmAgr = P09984_A590KgmAgr[0] ;
            A122BarAgrPar = P09984_A122BarAgrPar[0] ;
            A124BarAgrReo = P09984_A124BarAgrReo[0] ;
            A119BarAgrCod = P09984_A119BarAgrCod[0] ;
            if ( AV19FlagMagkgs == 1 )
            {
               if ( DecimalUtil.compareTo(AV20Kilos, A590KgmAgr) < 0 )
               {
                  AV18Resp = httpContext.getMessage( "F", "") ;
                  AV20Kilos = A590KgmAgr ;
               }
               else
               {
                  AV18Resp = httpContext.getMessage( "S", "") ;
               }
            }
            else
            {
               GXt_char2 = AV18Resp ;
               GXv_int3[0] = A119BarAgrCod ;
               GXv_int1[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_int5[0] = AV15BarCod ;
               GXv_int6[0] = AV16BarCodReo ;
               GXv_char7[0] = AV17BarCodPar ;
               GXv_char8[0] = GXt_char2 ;
               new app.pdyrp019(remoteHandle, context).execute( GXv_int3, GXv_int1, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_char8) ;
               pdyrp018.this.A119BarAgrCod = GXv_int3[0] ;
               pdyrp018.this.A124BarAgrReo = GXv_int1[0] ;
               pdyrp018.this.A122BarAgrPar = GXv_char4[0] ;
               pdyrp018.this.AV15BarCod = GXv_int5[0] ;
               pdyrp018.this.AV16BarCodReo = GXv_int6[0] ;
               pdyrp018.this.AV17BarCodPar = GXv_char7[0] ;
               pdyrp018.this.GXt_char2 = GXv_char8[0] ;
               AV18Resp = GXt_char2 ;
            }
            if ( GXutil.strcmp(AV18Resp, httpContext.getMessage( "F", "")) == 0 )
            {
               AV15BarCod = A119BarAgrCod ;
               AV16BarCodReo = A124BarAgrReo ;
               AV17BarCodPar = A122BarAgrPar ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp018.this.A396EmprCod;
      this.aP1[0] = pdyrp018.this.AV15BarCod;
      this.aP2[0] = pdyrp018.this.AV16BarCodReo;
      this.aP3[0] = pdyrp018.this.AV17BarCodPar;
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
      P09983_A396EmprCod = new String[] {""} ;
      P09983_A130BarCodPar = new String[] {""} ;
      P09983_A132BarCodReo = new byte[1] ;
      P09983_A129BarCod = new int[1] ;
      P09983_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09983_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV20Kilos = DecimalUtil.ZERO ;
      P09984_A396EmprCod = new String[] {""} ;
      P09984_A129BarCod = new int[1] ;
      P09984_A132BarCodReo = new byte[1] ;
      P09984_A130BarCodPar = new String[] {""} ;
      P09984_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09984_A122BarAgrPar = new String[] {""} ;
      P09984_A124BarAgrReo = new byte[1] ;
      P09984_A119BarAgrCod = new int[1] ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      AV18Resp = "" ;
      GXt_char2 = "" ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdyrp018__default(),
         new Object[] {
             new Object[] {
            P09983_A396EmprCod, P09983_A130BarCodPar, P09983_A132BarCodReo, P09983_A129BarCod, P09983_A166BarKgm, P09983_n166BarKgm
            }
            , new Object[] {
            P09984_A396EmprCod, P09984_A129BarCod, P09984_A132BarCodReo, P09984_A130BarCodPar, P09984_A590KgmAgr, P09984_A122BarAgrPar, P09984_A124BarAgrReo, P09984_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV19FlagMagkgs ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int1[] ;
   private byte GXv_int6[] ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV20Kilos ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String AV18Resp ;
   private String GXt_char2 ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private boolean n166BarKgm ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09983_A396EmprCod ;
   private String[] P09983_A130BarCodPar ;
   private byte[] P09983_A132BarCodReo ;
   private int[] P09983_A129BarCod ;
   private java.math.BigDecimal[] P09983_A166BarKgm ;
   private boolean[] P09983_n166BarKgm ;
   private String[] P09984_A396EmprCod ;
   private int[] P09984_A129BarCod ;
   private byte[] P09984_A132BarCodReo ;
   private String[] P09984_A130BarCodPar ;
   private java.math.BigDecimal[] P09984_A590KgmAgr ;
   private String[] P09984_A122BarAgrPar ;
   private byte[] P09984_A124BarAgrReo ;
   private int[] P09984_A119BarAgrCod ;
}

final  class pdyrp018__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09983", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09984", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               return;
      }
   }

}

