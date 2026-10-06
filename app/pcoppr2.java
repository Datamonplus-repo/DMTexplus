package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcoppr2 extends GXProcedure
{
   public pcoppr2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcoppr2.class ), "" );
   }

   public pcoppr2( int remoteHandle ,
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
      pcoppr2.this.aP4 = new String[] {""};
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
      pcoppr2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcoppr2.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pcoppr2.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pcoppr2.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pcoppr2.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV8FlagPre ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ALBPRE", ""), GXv_int1) ;
      pcoppr2.this.AV8FlagPre = GXv_int1[0] ;
      GXv_int1[0] = AV9TExknit ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int1) ;
      pcoppr2.this.AV9TExknit = GXv_int1[0] ;
      GXv_int1[0] = AV11Martex ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MARTEX", ""), GXv_int1) ;
      pcoppr2.this.AV11Martex = GXv_int1[0] ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A30AlbProCod ;
      GXv_int4[0] = A129BarCod ;
      GXv_int1[0] = A132BarCodReo ;
      GXv_char5[0] = A130BarCodPar ;
      new app.pcopprd(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_int1, GXv_char5) ;
      pcoppr2.this.A396EmprCod = GXv_char2[0] ;
      pcoppr2.this.A30AlbProCod = GXv_int3[0] ;
      pcoppr2.this.A129BarCod = GXv_int4[0] ;
      pcoppr2.this.A132BarCodReo = GXv_int1[0] ;
      pcoppr2.this.A130BarCodPar = GXv_char5[0] ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int3[0] = A30AlbProCod ;
      GXv_int4[0] = A129BarCod ;
      GXv_int1[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      new app.pkgmtpr(remoteHandle, context).execute( GXv_char5, GXv_int3, GXv_int4, GXv_int1, GXv_char2) ;
      pcoppr2.this.A396EmprCod = GXv_char5[0] ;
      pcoppr2.this.A30AlbProCod = GXv_int3[0] ;
      pcoppr2.this.A129BarCod = GXv_int4[0] ;
      pcoppr2.this.A132BarCodReo = GXv_int1[0] ;
      pcoppr2.this.A130BarCodPar = GXv_char2[0] ;
      if ( AV8FlagPre == 1 )
      {
         httpContext.wjLoc = formatLink("app.talbppr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
      }
      else
      {
         httpContext.wjLoc = formatLink("app.talbprd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
      }
      if ( ( AV11Martex == 1 ) || ( AV9TExknit == 1 ) )
      {
         AV10HayReg = httpContext.getMessage( "N", "") ;
         /* Using cursor P019X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1261BarAlbKgmE = P019X2_A1261BarAlbKgmE[0] ;
            A1275FasKgm = P019X2_A1275FasKgm[0] ;
            A1263BarAlbMtrE = P019X2_A1263BarAlbMtrE[0] ;
            A1276FasMtr = P019X2_A1276FasMtr[0] ;
            A1240GuiFasLin = P019X2_A1240GuiFasLin[0] ;
            A1261BarAlbKgmE = P019X2_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P019X2_A1263BarAlbMtrE[0] ;
            A1275FasKgm = A1261BarAlbKgmE ;
            A1276FasMtr = A1263BarAlbMtrE ;
            AV10HayReg = httpContext.getMessage( "S", "") ;
            /* Using cursor P019X3 */
            pr_default.execute(1, new Object[] {A1275FasKgm, A1276FasMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            pr_default.readNext(0);
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV10HayReg, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.wjLoc = formatLink("app.talbfan", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcoppr2.this.A396EmprCod;
      this.aP1[0] = pcoppr2.this.A30AlbProCod;
      this.aP2[0] = pcoppr2.this.A129BarCod;
      this.aP3[0] = pcoppr2.this.A132BarCodReo;
      this.aP4[0] = pcoppr2.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcoppr2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char5 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV10HayReg = "" ;
      scmdbuf = "" ;
      P019X2_A396EmprCod = new String[] {""} ;
      P019X2_A30AlbProCod = new long[1] ;
      P019X2_A129BarCod = new int[1] ;
      P019X2_A132BarCodReo = new byte[1] ;
      P019X2_A130BarCodPar = new String[] {""} ;
      P019X2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019X2_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019X2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019X2_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019X2_A1240GuiFasLin = new short[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcoppr2__default(),
         new Object[] {
             new Object[] {
            P019X2_A396EmprCod, P019X2_A30AlbProCod, P019X2_A129BarCod, P019X2_A132BarCodReo, P019X2_A130BarCodPar, P019X2_A1261BarAlbKgmE, P019X2_A1275FasKgm, P019X2_A1263BarAlbMtrE, P019X2_A1276FasMtr, P019X2_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8FlagPre ;
   private byte AV9TExknit ;
   private byte AV11Martex ;
   private byte GXv_int1[] ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1276FasMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String AV10HayReg ;
   private String scmdbuf ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P019X2_A396EmprCod ;
   private long[] P019X2_A30AlbProCod ;
   private int[] P019X2_A129BarCod ;
   private byte[] P019X2_A132BarCodReo ;
   private String[] P019X2_A130BarCodPar ;
   private java.math.BigDecimal[] P019X2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P019X2_A1275FasKgm ;
   private java.math.BigDecimal[] P019X2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P019X2_A1276FasMtr ;
   private short[] P019X2_A1240GuiFasLin ;
}

final  class pcoppr2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P019X2", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarAlbKgmE, T1.FasKgm, T2.BarAlbMtrE, T1.FasMtr, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPALBBAR T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019X3", "UPDATE TXPALBFAS SET FasKgm=?, FasMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

