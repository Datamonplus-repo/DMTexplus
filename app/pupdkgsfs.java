package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdkgsfs extends GXProcedure
{
   public pupdkgsfs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdkgsfs.class ), "" );
   }

   public pupdkgsfs( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pupdkgsfs.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pupdkgsfs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdkgsfs.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pupdkgsfs.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pupdkgsfs.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pupdkgsfs.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pupdkgsfs.this.AV9BarAlbKgmE = aP5[0];
      this.aP5 = aP5;
      pupdkgsfs.this.AV8BarAlbMtrE = aP6[0];
      this.aP6 = aP6;
      pupdkgsfs.this.AV12usurcod = aP7[0];
      this.aP7 = aP7;
      pupdkgsfs.this.AV13station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05Q52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A460FasDsc = P05Q52_A460FasDsc[0] ;
         A457FasCod = P05Q52_A457FasCod[0] ;
         A1275FasKgm = P05Q52_A1275FasKgm[0] ;
         A1276FasMtr = P05Q52_A1276FasMtr[0] ;
         A1242GuiFasPMt = P05Q52_A1242GuiFasPMt[0] ;
         A1241GuiFasPKg = P05Q52_A1241GuiFasPKg[0] ;
         A1240GuiFasLin = P05Q52_A1240GuiFasLin[0] ;
         A460FasDsc = P05Q52_A460FasDsc[0] ;
         AV14Inc_obs = httpContext.getMessage( "Fase ", "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + GXutil.newLine( ) ;
         AV14Inc_obs += httpContext.getMessage( "N Guia ", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
         if ( DecimalUtil.compareTo(AV9BarAlbKgmE, A1275FasKgm) != 0 )
         {
            AV14Inc_obs += httpContext.getMessage( "Kilos  ", "") + GXutil.str( A1275FasKgm, 9, 2) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV9BarAlbKgmE, 9, 2) + GXutil.newLine( ) ;
         }
         if ( DecimalUtil.compareTo(A1276FasMtr, AV8BarAlbMtrE) != 0 )
         {
            AV14Inc_obs += httpContext.getMessage( "Metros ", "") + GXutil.str( A1276FasMtr, 9, 2) + httpContext.getMessage( " se cambia por 0", "") + GXutil.str( AV8BarAlbMtrE, 9, 2) + GXutil.newLine( ) ;
         }
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV12usurcod, AV13station, AV14Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         A1276FasMtr = ((A1242GuiFasPMt.doubleValue()>0) ? AV8BarAlbMtrE : A1276FasMtr) ;
         A1275FasKgm = ((A1241GuiFasPKg.doubleValue()>0) ? AV9BarAlbKgmE : A1275FasKgm) ;
         /* Using cursor P05Q53 */
         pr_default.execute(1, new Object[] {A1275FasKgm, A1276FasMtr, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdkgsfs.this.A396EmprCod;
      this.aP1[0] = pupdkgsfs.this.A30AlbProCod;
      this.aP2[0] = pupdkgsfs.this.A129BarCod;
      this.aP3[0] = pupdkgsfs.this.A132BarCodReo;
      this.aP4[0] = pupdkgsfs.this.A130BarCodPar;
      this.aP5[0] = pupdkgsfs.this.AV9BarAlbKgmE;
      this.aP6[0] = pupdkgsfs.this.AV8BarAlbMtrE;
      this.aP7[0] = pupdkgsfs.this.AV12usurcod;
      this.aP8[0] = pupdkgsfs.this.AV13station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdkgsfs");
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
      P05Q52_A396EmprCod = new String[] {""} ;
      P05Q52_A30AlbProCod = new long[1] ;
      P05Q52_A129BarCod = new int[1] ;
      P05Q52_A132BarCodReo = new byte[1] ;
      P05Q52_A130BarCodPar = new String[] {""} ;
      P05Q52_A460FasDsc = new String[] {""} ;
      P05Q52_A457FasCod = new String[] {""} ;
      P05Q52_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Q52_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Q52_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Q52_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05Q52_A1240GuiFasLin = new short[1] ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV14Inc_obs = "" ;
      AV18Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdkgsfs__default(),
         new Object[] {
             new Object[] {
            P05Q52_A396EmprCod, P05Q52_A30AlbProCod, P05Q52_A129BarCod, P05Q52_A132BarCodReo, P05Q52_A130BarCodPar, P05Q52_A460FasDsc, P05Q52_A457FasCod, P05Q52_A1275FasKgm, P05Q52_A1276FasMtr, P05Q52_A1242GuiFasPMt,
            P05Q52_A1241GuiFasPKg, P05Q52_A1240GuiFasLin
            }
            , new Object[] {
            }
         }
      );
      AV18Pgmname = "PUpdkGSFs" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PUpdkGSFs" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9BarAlbKgmE ;
   private java.math.BigDecimal AV8BarAlbMtrE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12usurcod ;
   private String AV13station ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV18Pgmname ;
   private String AV14Inc_obs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P05Q52_A396EmprCod ;
   private long[] P05Q52_A30AlbProCod ;
   private int[] P05Q52_A129BarCod ;
   private byte[] P05Q52_A132BarCodReo ;
   private String[] P05Q52_A130BarCodPar ;
   private String[] P05Q52_A460FasDsc ;
   private String[] P05Q52_A457FasCod ;
   private java.math.BigDecimal[] P05Q52_A1275FasKgm ;
   private java.math.BigDecimal[] P05Q52_A1276FasMtr ;
   private java.math.BigDecimal[] P05Q52_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P05Q52_A1241GuiFasPKg ;
   private short[] P05Q52_A1240GuiFasLin ;
}

final  class pupdkgsfs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05Q52", "SELECT T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc, T1.FasCod, T1.FasKgm, T1.FasMtr, T1.GuiFasPMt, T1.GuiFasPKg, T1.GuiFasLin FROM (TXPALBFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05Q53", "UPDATE TXPALBFAS SET FasKgm=?, FasMtr=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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

