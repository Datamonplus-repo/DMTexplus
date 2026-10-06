package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgmtcontrol extends GXProcedure
{
   public pkgmtcontrol( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgmtcontrol.class ), "" );
   }

   public pkgmtcontrol( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pkgmtcontrol.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pkgmtcontrol.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgmtcontrol.this.AV20Albprocod = aP1[0];
      this.aP1 = aP1;
      pkgmtcontrol.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pkgmtcontrol.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pkgmtcontrol.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16AlbHdRKgR = DecimalUtil.doubleToDec(0) ;
      AV17AlbHdRPzR = (short)(0) ;
      AV21AlbHdRMtR = DecimalUtil.doubleToDec(0) ;
      /* Optimized group. */
      /* Using cursor P04YO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV20Albprocod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c6625AlbHdRKgR = P04YO2_A6625AlbHdRKgR[0] ;
      n6625AlbHdRKgR = P04YO2_n6625AlbHdRKgR[0] ;
      c6626AlbHdRPzR = P04YO2_A6626AlbHdRPzR[0] ;
      n6626AlbHdRPzR = P04YO2_n6626AlbHdRPzR[0] ;
      c11366AlbHdRMtR = P04YO2_A11366AlbHdRMtR[0] ;
      n11366AlbHdRMtR = P04YO2_n11366AlbHdRMtR[0] ;
      pr_default.close(0);
      AV16AlbHdRKgR = AV16AlbHdRKgR.add(c6625AlbHdRKgR) ;
      AV17AlbHdRPzR = (short)(AV17AlbHdRPzR+c6626AlbHdRPzR) ;
      AV21AlbHdRMtR = AV21AlbHdRMtR.add(c11366AlbHdRMtR) ;
      /* End optimized group. */
      AV18Baralbkgme = DecimalUtil.doubleToDec(0) ;
      AV22BarAlbMtrE = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P04YO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV20Albprocod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = P04YO3_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P04YO3_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P04YO3_A1263BarAlbMtrE[0] ;
         AV18Baralbkgme = A1261BarAlbKgmE ;
         AV22BarAlbMtrE = A1263BarAlbMtrE ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV23errk = (byte)(0) ;
      AV24errm = (byte)(0) ;
      Gx_msg = httpContext.getMessage( "Atenção..", "") + GXutil.newLine( ) ;
      if ( DecimalUtil.compareTo(AV16AlbHdRKgR, AV18Baralbkgme) != 0 )
      {
         Gx_msg += httpContext.getMessage( "Kilos introduzido = ", "") + GXutil.str( AV16AlbHdRKgR, 9, 2) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Eles são diferentes ", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Kilos Guia        = ", "") + GXutil.str( AV18Baralbkgme, 9, 2) + GXutil.newLine( ) ;
         AV23errk = (byte)(1) ;
      }
      if ( DecimalUtil.compareTo(AV21AlbHdRMtR, AV22BarAlbMtrE) != 0 )
      {
         Gx_msg += httpContext.getMessage( "Metros introduzido = ", "") + GXutil.str( AV21AlbHdRMtR, 9, 2) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Eles são diferentes ", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Metros Guia        = ", "") + GXutil.str( AV22BarAlbMtrE, 9, 2) + GXutil.newLine( ) ;
         AV24errm = (byte)(1) ;
      }
      if ( ( AV23errk == 1 ) || ( AV24errm == 1 ) )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgmtcontrol.this.A396EmprCod;
      this.aP1[0] = pkgmtcontrol.this.AV20Albprocod;
      this.aP2[0] = pkgmtcontrol.this.A129BarCod;
      this.aP3[0] = pkgmtcontrol.this.A132BarCodReo;
      this.aP4[0] = pkgmtcontrol.this.A130BarCodPar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16AlbHdRKgR = DecimalUtil.ZERO ;
      AV21AlbHdRMtR = DecimalUtil.ZERO ;
      c6625AlbHdRKgR = DecimalUtil.ZERO ;
      c11366AlbHdRMtR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P04YO2_A6625AlbHdRKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04YO2_n6625AlbHdRKgR = new boolean[] {false} ;
      P04YO2_A6626AlbHdRPzR = new short[1] ;
      P04YO2_n6626AlbHdRPzR = new boolean[] {false} ;
      P04YO2_A11366AlbHdRMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04YO2_n11366AlbHdRMtR = new boolean[] {false} ;
      AV18Baralbkgme = DecimalUtil.ZERO ;
      AV22BarAlbMtrE = DecimalUtil.ZERO ;
      P04YO3_A396EmprCod = new String[] {""} ;
      P04YO3_A129BarCod = new int[1] ;
      P04YO3_A132BarCodReo = new byte[1] ;
      P04YO3_A130BarCodPar = new String[] {""} ;
      P04YO3_A30AlbProCod = new long[1] ;
      P04YO3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04YO3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgmtcontrol__default(),
         new Object[] {
             new Object[] {
            P04YO2_A6625AlbHdRKgR, P04YO2_n6625AlbHdRKgR, P04YO2_A6626AlbHdRPzR, P04YO2_n6626AlbHdRPzR, P04YO2_A11366AlbHdRMtR, P04YO2_n11366AlbHdRMtR
            }
            , new Object[] {
            P04YO3_A396EmprCod, P04YO3_A129BarCod, P04YO3_A132BarCodReo, P04YO3_A130BarCodPar, P04YO3_A30AlbProCod, P04YO3_A1261BarAlbKgmE, P04YO3_A1263BarAlbMtrE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV23errk ;
   private byte AV24errm ;
   private short AV17AlbHdRPzR ;
   private short c6626AlbHdRPzR ;
   private short Gx_err ;
   private int A129BarCod ;
   private long AV20Albprocod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16AlbHdRKgR ;
   private java.math.BigDecimal AV21AlbHdRMtR ;
   private java.math.BigDecimal c6625AlbHdRKgR ;
   private java.math.BigDecimal c11366AlbHdRMtR ;
   private java.math.BigDecimal AV18Baralbkgme ;
   private java.math.BigDecimal AV22BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String Gx_msg ;
   private boolean n6625AlbHdRKgR ;
   private boolean n6626AlbHdRPzR ;
   private boolean n11366AlbHdRMtR ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P04YO2_A6625AlbHdRKgR ;
   private boolean[] P04YO2_n6625AlbHdRKgR ;
   private short[] P04YO2_A6626AlbHdRPzR ;
   private boolean[] P04YO2_n6626AlbHdRPzR ;
   private java.math.BigDecimal[] P04YO2_A11366AlbHdRMtR ;
   private boolean[] P04YO2_n11366AlbHdRMtR ;
   private String[] P04YO3_A396EmprCod ;
   private int[] P04YO3_A129BarCod ;
   private byte[] P04YO3_A132BarCodReo ;
   private String[] P04YO3_A130BarCodPar ;
   private long[] P04YO3_A30AlbProCod ;
   private java.math.BigDecimal[] P04YO3_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P04YO3_A1263BarAlbMtrE ;
}

final  class pkgmtcontrol__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04YO2", "SELECT SUM(AlbHdRKgR), SUM(AlbHdRPzR), SUM(AlbHdRMtR) FROM TXPALBREP WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04YO3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbKgmE, BarAlbMtrE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

