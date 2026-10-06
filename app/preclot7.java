package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclot7 extends GXProcedure
{
   public preclot7( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclot7.class ), "" );
   }

   public preclot7( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      preclot7.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      preclot7.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preclot7.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      preclot7.this.AV14RecLote = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04NJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A686PrdCant = P04NJ2_A686PrdCant[0] ;
         A129BarCod = P04NJ2_A129BarCod[0] ;
         A132BarCodReo = P04NJ2_A132BarCodReo[0] ;
         A130BarCodPar = P04NJ2_A130BarCodPar[0] ;
         A5058BarEnvLaw = P04NJ2_A5058BarEnvLaw[0] ;
         A5725RecLote = P04NJ2_A5725RecLote[0] ;
         A2804RecLinMaq = P04NJ2_A2804RecLinMaq[0] ;
         A1273RecLinPro = P04NJ2_A1273RecLinPro[0] ;
         A811RecLin = P04NJ2_A811RecLin[0] ;
         A5058BarEnvLaw = P04NJ2_A5058BarEnvLaw[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A129BarCod ;
         GXv_int3[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int5[0] = AV16Barfasest ;
         GXv_date6[0] = AV17Barfecrini ;
         GXv_char7[0] = AV18maqcodbis ;
         new app.pplat07(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_date6, GXv_char7) ;
         preclot7.this.A396EmprCod = GXv_char1[0] ;
         preclot7.this.A129BarCod = GXv_int2[0] ;
         preclot7.this.A132BarCodReo = GXv_int3[0] ;
         preclot7.this.A130BarCodPar = GXv_char4[0] ;
         preclot7.this.AV16Barfasest = GXv_int5[0] ;
         preclot7.this.AV17Barfecrini = GXv_date6[0] ;
         preclot7.this.AV18maqcodbis = GXv_char7[0] ;
         if ( AV16Barfasest == 0 )
         {
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) && ( GXutil.strcmp(A5058BarEnvLaw, httpContext.getMessage( "S", "")) == 0 ) )
            {
            }
            else
            {
               A5725RecLote = AV14RecLote ;
            }
            Gx_msg = httpContext.getMessage( "Procesando .. ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + " " + GXutil.trim( A719PrdNum) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P04NJ3 */
         pr_default.execute(1, new Object[] {A5725RecLote, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclot7.this.A396EmprCod;
      this.aP1[0] = preclot7.this.A719PrdNum;
      this.aP2[0] = preclot7.this.AV14RecLote;
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
      P04NJ2_A396EmprCod = new String[] {""} ;
      P04NJ2_A719PrdNum = new String[] {""} ;
      P04NJ2_n719PrdNum = new boolean[] {false} ;
      P04NJ2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04NJ2_A129BarCod = new int[1] ;
      P04NJ2_A132BarCodReo = new byte[1] ;
      P04NJ2_A130BarCodPar = new String[] {""} ;
      P04NJ2_A5058BarEnvLaw = new String[] {""} ;
      P04NJ2_A5725RecLote = new String[] {""} ;
      P04NJ2_A2804RecLinMaq = new short[1] ;
      P04NJ2_A1273RecLinPro = new byte[1] ;
      P04NJ2_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A5058BarEnvLaw = "" ;
      A5725RecLote = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      AV17Barfecrini = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV18maqcodbis = "" ;
      GXv_char7 = new String[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclot7__default(),
         new Object[] {
             new Object[] {
            P04NJ2_A396EmprCod, P04NJ2_A719PrdNum, P04NJ2_n719PrdNum, P04NJ2_A686PrdCant, P04NJ2_A129BarCod, P04NJ2_A132BarCodReo, P04NJ2_A130BarCodPar, P04NJ2_A5058BarEnvLaw, P04NJ2_A5725RecLote, P04NJ2_A2804RecLinMaq,
            P04NJ2_A1273RecLinPro, P04NJ2_A811RecLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte GXv_int3[] ;
   private byte AV16Barfasest ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A686PrdCant ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV14RecLote ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A5058BarEnvLaw ;
   private String A5725RecLote ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV18maqcodbis ;
   private String GXv_char7[] ;
   private String Gx_msg ;
   private java.util.Date AV17Barfecrini ;
   private java.util.Date GXv_date6[] ;
   private boolean n719PrdNum ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04NJ2_A396EmprCod ;
   private String[] P04NJ2_A719PrdNum ;
   private boolean[] P04NJ2_n719PrdNum ;
   private java.math.BigDecimal[] P04NJ2_A686PrdCant ;
   private int[] P04NJ2_A129BarCod ;
   private byte[] P04NJ2_A132BarCodReo ;
   private String[] P04NJ2_A130BarCodPar ;
   private String[] P04NJ2_A5058BarEnvLaw ;
   private String[] P04NJ2_A5725RecLote ;
   private short[] P04NJ2_A2804RecLinMaq ;
   private byte[] P04NJ2_A1273RecLinPro ;
   private short[] P04NJ2_A811RecLin ;
}

final  class preclot7__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04NJ2", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdCant, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarEnvLaw, T1.RecLote, T1.RecLinMaq, T1.RecLinPro, T1.RecLin FROM (TXPLRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04NJ3", "UPDATE TXPLRECET SET RecLote=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

