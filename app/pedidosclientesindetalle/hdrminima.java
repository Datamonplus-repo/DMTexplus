package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hdrminima extends GXProcedure
{
   public hdrminima( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hdrminima.class ), "" );
   }

   public hdrminima( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      hdrminima.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      hdrminima.this.AV11Emprcod = aP0;
      hdrminima.this.AV8barcod = aP1[0];
      this.aP1 = aP1;
      hdrminima.this.AV9barcodreo = aP2[0];
      this.aP2 = aP2;
      hdrminima.this.AV10barcodpar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV13FlagMagkgs) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV11Emprcod, httpContext.getMessage( "MAGRKG", ""), GXv_int2) ;
      hdrminima.this.GXt_int1 = GXv_int2[0] ;
      AV13FlagMagkgs = GXt_int1 ;
      /* Using cursor P0AQD3 */
      pr_default.execute(0, new Object[] {AV11Emprcod, Integer.valueOf(AV8barcod), Byte.valueOf(AV9barcodreo), AV10barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AQD3_A130BarCodPar[0] ;
         A132BarCodReo = P0AQD3_A132BarCodReo[0] ;
         A129BarCod = P0AQD3_A129BarCod[0] ;
         A396EmprCod = P0AQD3_A396EmprCod[0] ;
         A166BarKgm = P0AQD3_A166BarKgm[0] ;
         n166BarKgm = P0AQD3_n166BarKgm[0] ;
         A166BarKgm = P0AQD3_A166BarKgm[0] ;
         n166BarKgm = P0AQD3_n166BarKgm[0] ;
         AV12Kilos = A166BarKgm ;
         /* Using cursor P0AQD4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A590KgmAgr = P0AQD4_A590KgmAgr[0] ;
            A119BarAgrCod = P0AQD4_A119BarAgrCod[0] ;
            A124BarAgrReo = P0AQD4_A124BarAgrReo[0] ;
            A122BarAgrPar = P0AQD4_A122BarAgrPar[0] ;
            if ( AV13FlagMagkgs == 1 )
            {
               if ( DecimalUtil.compareTo(AV12Kilos, A590KgmAgr) < 0 )
               {
                  AV14Resp = "F" ;
                  AV12Kilos = A590KgmAgr ;
               }
               else
               {
                  AV14Resp = "S" ;
               }
            }
            else
            {
               GXv_int3[0] = A119BarAgrCod ;
               GXv_int2[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_int5[0] = AV8barcod ;
               GXv_int6[0] = AV9barcodreo ;
               GXv_char7[0] = AV10barcodpar ;
               GXv_char8[0] = AV14Resp ;
               new app.plimbar(remoteHandle, context).execute( GXv_int3, GXv_int2, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_char8) ;
               hdrminima.this.A119BarAgrCod = GXv_int3[0] ;
               hdrminima.this.A124BarAgrReo = GXv_int2[0] ;
               hdrminima.this.A122BarAgrPar = GXv_char4[0] ;
               hdrminima.this.AV8barcod = GXv_int5[0] ;
               hdrminima.this.AV9barcodreo = GXv_int6[0] ;
               hdrminima.this.AV10barcodpar = GXv_char7[0] ;
               hdrminima.this.AV14Resp = GXv_char8[0] ;
            }
            if ( GXutil.strcmp(AV14Resp, "F") == 0 )
            {
               AV8barcod = A119BarAgrCod ;
               AV9barcodreo = A124BarAgrReo ;
               AV10barcodpar = A122BarAgrPar ;
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
      this.aP1[0] = hdrminima.this.AV8barcod;
      this.aP2[0] = hdrminima.this.AV9barcodreo;
      this.aP3[0] = hdrminima.this.AV10barcodpar;
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
      P0AQD3_A130BarCodPar = new String[] {""} ;
      P0AQD3_A132BarCodReo = new byte[1] ;
      P0AQD3_A129BarCod = new int[1] ;
      P0AQD3_A396EmprCod = new String[] {""} ;
      P0AQD3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQD3_n166BarKgm = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV12Kilos = DecimalUtil.ZERO ;
      P0AQD4_A396EmprCod = new String[] {""} ;
      P0AQD4_A129BarCod = new int[1] ;
      P0AQD4_A132BarCodReo = new byte[1] ;
      P0AQD4_A130BarCodPar = new String[] {""} ;
      P0AQD4_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQD4_A119BarAgrCod = new int[1] ;
      P0AQD4_A124BarAgrReo = new byte[1] ;
      P0AQD4_A122BarAgrPar = new String[] {""} ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      AV14Resp = "" ;
      GXv_int3 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hdrminima__default(),
         new Object[] {
             new Object[] {
            P0AQD3_A130BarCodPar, P0AQD3_A132BarCodReo, P0AQD3_A129BarCod, P0AQD3_A396EmprCod, P0AQD3_A166BarKgm, P0AQD3_n166BarKgm
            }
            , new Object[] {
            P0AQD4_A396EmprCod, P0AQD4_A129BarCod, P0AQD4_A132BarCodReo, P0AQD4_A130BarCodPar, P0AQD4_A590KgmAgr, P0AQD4_A119BarAgrCod, P0AQD4_A124BarAgrReo, P0AQD4_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9barcodreo ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte GXv_int2[] ;
   private byte GXv_int6[] ;
   private short AV13FlagMagkgs ;
   private short Gx_err ;
   private int AV8barcod ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV12Kilos ;
   private java.math.BigDecimal A590KgmAgr ;
   private String AV11Emprcod ;
   private String AV10barcodpar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String AV14Resp ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private boolean n166BarKgm ;
   private String[] aP3 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQD3_A130BarCodPar ;
   private byte[] P0AQD3_A132BarCodReo ;
   private int[] P0AQD3_A129BarCod ;
   private String[] P0AQD3_A396EmprCod ;
   private java.math.BigDecimal[] P0AQD3_A166BarKgm ;
   private boolean[] P0AQD3_n166BarKgm ;
   private String[] P0AQD4_A396EmprCod ;
   private int[] P0AQD4_A129BarCod ;
   private byte[] P0AQD4_A132BarCodReo ;
   private String[] P0AQD4_A130BarCodPar ;
   private java.math.BigDecimal[] P0AQD4_A590KgmAgr ;
   private int[] P0AQD4_A119BarAgrCod ;
   private byte[] P0AQD4_A124BarAgrReo ;
   private String[] P0AQD4_A122BarAgrPar ;
}

final  class hdrminima__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQD3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQD4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, KgmAgr, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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

