package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcibaex extends GXProcedure
{
   public pcibaex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcibaex.class ), "" );
   }

   public pcibaex( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     byte[] aP4 ,
                                     String[] aP5 ,
                                     String[] aP6 )
   {
      pcibaex.this.aP7 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        java.util.Date[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             java.util.Date[] aP7 )
   {
      pcibaex.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcibaex.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcibaex.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcibaex.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcibaex.this.AV15BarSitExt = aP4[0];
      this.aP4 = aP4;
      pcibaex.this.AV16Modo = aP5[0];
      this.aP5 = aP5;
      pcibaex.this.AV17AlbSec = aP6[0];
      this.aP6 = aP6;
      pcibaex.this.AV27BarFecSal = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00FS3 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00FS3_A252CliCod[0] ;
         n252CliCod = P00FS3_n252CliCod[0] ;
         A212BarSer = P00FS3_A212BarSer[0] ;
         A166BarKgm = P00FS3_A166BarKgm[0] ;
         A184BarMtr = P00FS3_A184BarMtr[0] ;
         A168BarKgmLan = P00FS3_A168BarKgmLan[0] ;
         A186BarMtrLan = P00FS3_A186BarMtrLan[0] ;
         A166BarKgm = P00FS3_A166BarKgm[0] ;
         A184BarMtr = P00FS3_A184BarMtr[0] ;
         A168BarKgmLan = P00FS3_A168BarKgmLan[0] ;
         A186BarMtrLan = P00FS3_A186BarMtrLan[0] ;
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A212BarSer ;
         GXv_decimal4[0] = AV20ArtMer ;
         new app.pbusmer(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_decimal4) ;
         pcibaex.this.A396EmprCod = GXv_char1[0] ;
         pcibaex.this.A252CliCod = GXv_int2[0] ;
         pcibaex.this.A212BarSer = GXv_char3[0] ;
         pcibaex.this.AV20ArtMer = GXv_decimal4[0] ;
         AV21BarKgm = A166BarKgm ;
         AV24BarMtr = A184BarMtr ;
         AV22BarKgmLan = A168BarKgmLan ;
         AV25BarMtrLan = A186BarMtrLan ;
         AV23DifKgm = AV21BarKgm.subtract(AV22BarKgmLan) ;
         AV26DifMtr = AV24BarMtr.subtract(AV25BarMtrLan) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV19OK = " " ;
      if ( AV15BarSitExt != 9 )
      {
         if ( GXutil.strcmp(AV16Modo, httpContext.getMessage( "DEL", "")) != 0 )
         {
            while ( ( GXutil.strcmp(AV19OK, httpContext.getMessage( "N", "")) != 0 ) && ( GXutil.strcmp(AV19OK, httpContext.getMessage( "S", "")) != 0 ) )
            {
            }
         }
         else
         {
            AV19OK = httpContext.getMessage( "N", "") ;
         }
      }
      /* Using cursor P00FS4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2754BarSitExt = P00FS4_A2754BarSitExt[0] ;
         A213BarSit = P00FS4_A213BarSit[0] ;
         A2010BarTipDis = P00FS4_A2010BarTipDis[0] ;
         A161BarFecSal = P00FS4_A161BarFecSal[0] ;
         if ( GXutil.strcmp(AV19OK, httpContext.getMessage( "S", "")) == 0 )
         {
            A2754BarSitExt = (byte)(9) ;
         }
         else
         {
            A2754BarSitExt = (byte)(1) ;
         }
         if ( GXutil.strcmp(AV17AlbSec, httpContext.getMessage( "A", "")) == 0 )
         {
            A213BarSit = (byte)(9) ;
         }
         if ( ( GXutil.strcmp(AV19OK, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A2010BarTipDis, httpContext.getMessage( "E", "")) == 0 ) )
         {
            A213BarSit = (byte)(9) ;
            A161BarFecSal = AV27BarFecSal ;
         }
         /* Using cursor P00FS5 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A2754BarSitExt), Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcibaex.this.A396EmprCod;
      this.aP1[0] = pcibaex.this.A129BarCod;
      this.aP2[0] = pcibaex.this.A132BarCodReo;
      this.aP3[0] = pcibaex.this.A130BarCodPar;
      this.aP4[0] = pcibaex.this.AV15BarSitExt;
      this.aP5[0] = pcibaex.this.AV16Modo;
      this.aP6[0] = pcibaex.this.AV17AlbSec;
      this.aP7[0] = pcibaex.this.AV27BarFecSal;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcibaex");
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
      P00FS3_A396EmprCod = new String[] {""} ;
      P00FS3_A129BarCod = new int[1] ;
      P00FS3_A132BarCodReo = new byte[1] ;
      P00FS3_A130BarCodPar = new String[] {""} ;
      P00FS3_A252CliCod = new int[1] ;
      P00FS3_n252CliCod = new boolean[] {false} ;
      P00FS3_A212BarSer = new String[] {""} ;
      P00FS3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FS3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FS3_A168BarKgmLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FS3_A186BarMtrLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A168BarKgmLan = DecimalUtil.ZERO ;
      A186BarMtrLan = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      AV20ArtMer = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV21BarKgm = DecimalUtil.ZERO ;
      AV24BarMtr = DecimalUtil.ZERO ;
      AV22BarKgmLan = DecimalUtil.ZERO ;
      AV25BarMtrLan = DecimalUtil.ZERO ;
      AV23DifKgm = DecimalUtil.ZERO ;
      AV26DifMtr = DecimalUtil.ZERO ;
      AV19OK = "" ;
      P00FS4_A396EmprCod = new String[] {""} ;
      P00FS4_A129BarCod = new int[1] ;
      P00FS4_A132BarCodReo = new byte[1] ;
      P00FS4_A130BarCodPar = new String[] {""} ;
      P00FS4_A2754BarSitExt = new byte[1] ;
      P00FS4_A213BarSit = new byte[1] ;
      P00FS4_A2010BarTipDis = new String[] {""} ;
      P00FS4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A2010BarTipDis = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcibaex__default(),
         new Object[] {
             new Object[] {
            P00FS3_A396EmprCod, P00FS3_A129BarCod, P00FS3_A132BarCodReo, P00FS3_A130BarCodPar, P00FS3_A252CliCod, P00FS3_n252CliCod, P00FS3_A212BarSer, P00FS3_A166BarKgm, P00FS3_A184BarMtr, P00FS3_A168BarKgmLan,
            P00FS3_A186BarMtrLan
            }
            , new Object[] {
            P00FS4_A396EmprCod, P00FS4_A129BarCod, P00FS4_A132BarCodReo, P00FS4_A130BarCodPar, P00FS4_A2754BarSitExt, P00FS4_A213BarSit, P00FS4_A2010BarTipDis, P00FS4_A161BarFecSal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15BarSitExt ;
   private byte A2754BarSitExt ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A168BarKgmLan ;
   private java.math.BigDecimal A186BarMtrLan ;
   private java.math.BigDecimal AV20ArtMer ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV21BarKgm ;
   private java.math.BigDecimal AV24BarMtr ;
   private java.math.BigDecimal AV22BarKgmLan ;
   private java.math.BigDecimal AV25BarMtrLan ;
   private java.math.BigDecimal AV23DifKgm ;
   private java.math.BigDecimal AV26DifMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16Modo ;
   private String AV17AlbSec ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String AV19OK ;
   private String A2010BarTipDis ;
   private java.util.Date AV27BarFecSal ;
   private java.util.Date A161BarFecSal ;
   private boolean n252CliCod ;
   private java.util.Date[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FS3_A396EmprCod ;
   private int[] P00FS3_A129BarCod ;
   private byte[] P00FS3_A132BarCodReo ;
   private String[] P00FS3_A130BarCodPar ;
   private int[] P00FS3_A252CliCod ;
   private boolean[] P00FS3_n252CliCod ;
   private String[] P00FS3_A212BarSer ;
   private java.math.BigDecimal[] P00FS3_A166BarKgm ;
   private java.math.BigDecimal[] P00FS3_A184BarMtr ;
   private java.math.BigDecimal[] P00FS3_A168BarKgmLan ;
   private java.math.BigDecimal[] P00FS3_A186BarMtrLan ;
   private String[] P00FS4_A396EmprCod ;
   private int[] P00FS4_A129BarCod ;
   private byte[] P00FS4_A132BarCodReo ;
   private String[] P00FS4_A130BarCodPar ;
   private byte[] P00FS4_A2754BarSitExt ;
   private byte[] P00FS4_A213BarSit ;
   private String[] P00FS4_A2010BarTipDis ;
   private java.util.Date[] P00FS4_A161BarFecSal ;
}

final  class pcibaex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FS3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.CliCod, T1.BarSer, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgmLan, 0) AS BarKgmLan, COALESCE( T2.BarMtrLan, 0) AS BarMtrLan FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarKilLan) AS BarKgmLan, SUM(BarMetLan) AS BarMtrLan FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FS4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSitExt, BarSit, BarTipDis, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00FS5", "UPDATE TXPBARCAD SET BarSitExt=?, BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
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
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
      }
   }

}

