package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recuperodatosalbbar extends GXProcedure
{
   public recuperodatosalbbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuperodatosalbbar.class ), "" );
   }

   public recuperodatosalbbar( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 )
   {
      recuperodatosalbbar.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      recuperodatosalbbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      recuperodatosalbbar.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      recuperodatosalbbar.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      recuperodatosalbbar.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      recuperodatosalbbar.this.aP4 = aP4;
      recuperodatosalbbar.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Albaranes = " " ;
      AV9Valor = DecimalUtil.ZERO ;
      /* Using cursor P093E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P093E2_A30AlbProCod[0] ;
         A32AlbProEsp = P093E2_A32AlbProEsp[0] ;
         A1263BarAlbMtrE = P093E2_A1263BarAlbMtrE[0] ;
         A1264BarPreMtr = P093E2_A1264BarPreMtr[0] ;
         A1261BarAlbKgmE = P093E2_A1261BarAlbKgmE[0] ;
         A1262BarPreKgm = P093E2_A1262BarPreKgm[0] ;
         if ( (GXutil.strcmp("", AV8Albaranes)==0) )
         {
            AV8Albaranes = GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         else
         {
            AV8Albaranes += "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         AV9Valor = GXutil.roundDecimal( A1262BarPreKgm.multiply(A1261BarAlbKgmE), 2).add(GXutil.roundDecimal( A1264BarPreMtr.multiply(A1263BarAlbMtrE), 2)) ;
         /* Using cursor P093E3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1242GuiFasPMt = P093E3_A1242GuiFasPMt[0] ;
            A1276FasMtr = P093E3_A1276FasMtr[0] ;
            A1241GuiFasPKg = P093E3_A1241GuiFasPKg[0] ;
            A1275FasKgm = P093E3_A1275FasKgm[0] ;
            A1240GuiFasLin = P093E3_A1240GuiFasLin[0] ;
            AV9Valor = AV9Valor.add((GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)))) ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = recuperodatosalbbar.this.A396EmprCod;
      this.aP1[0] = recuperodatosalbbar.this.A129BarCod;
      this.aP2[0] = recuperodatosalbbar.this.A132BarCodReo;
      this.aP3[0] = recuperodatosalbbar.this.A130BarCodPar;
      this.aP4[0] = recuperodatosalbbar.this.AV8Albaranes;
      this.aP5[0] = recuperodatosalbbar.this.AV9Valor;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Albaranes = "" ;
      AV9Valor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P093E2_A396EmprCod = new String[] {""} ;
      P093E2_A129BarCod = new int[1] ;
      P093E2_A132BarCodReo = new byte[1] ;
      P093E2_A130BarCodPar = new String[] {""} ;
      P093E2_A30AlbProCod = new long[1] ;
      P093E2_A32AlbProEsp = new byte[1] ;
      P093E2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      P093E3_A396EmprCod = new String[] {""} ;
      P093E3_A30AlbProCod = new long[1] ;
      P093E3_A129BarCod = new int[1] ;
      P093E3_A132BarCodReo = new byte[1] ;
      P093E3_A130BarCodPar = new String[] {""} ;
      P093E3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093E3_A1240GuiFasLin = new short[1] ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuperodatosalbbar__default(),
         new Object[] {
             new Object[] {
            P093E2_A396EmprCod, P093E2_A129BarCod, P093E2_A132BarCodReo, P093E2_A130BarCodPar, P093E2_A30AlbProCod, P093E2_A32AlbProEsp, P093E2_A1263BarAlbMtrE, P093E2_A1264BarPreMtr, P093E2_A1261BarAlbKgmE, P093E2_A1262BarPreKgm
            }
            , new Object[] {
            P093E3_A396EmprCod, P093E3_A30AlbProCod, P093E3_A129BarCod, P093E3_A132BarCodReo, P093E3_A130BarCodPar, P093E3_A1242GuiFasPMt, P093E3_A1276FasMtr, P093E3_A1241GuiFasPKg, P093E3_A1275FasKgm, P093E3_A1240GuiFasLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A32AlbProEsp ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV9Valor ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String AV8Albaranes ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P093E2_A396EmprCod ;
   private int[] P093E2_A129BarCod ;
   private byte[] P093E2_A132BarCodReo ;
   private String[] P093E2_A130BarCodPar ;
   private long[] P093E2_A30AlbProCod ;
   private byte[] P093E2_A32AlbProEsp ;
   private java.math.BigDecimal[] P093E2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P093E2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P093E2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P093E2_A1262BarPreKgm ;
   private String[] P093E3_A396EmprCod ;
   private long[] P093E3_A30AlbProCod ;
   private int[] P093E3_A129BarCod ;
   private byte[] P093E3_A132BarCodReo ;
   private String[] P093E3_A130BarCodPar ;
   private java.math.BigDecimal[] P093E3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P093E3_A1276FasMtr ;
   private java.math.BigDecimal[] P093E3_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P093E3_A1275FasKgm ;
   private short[] P093E3_A1240GuiFasLin ;
}

final  class recuperodatosalbbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093E2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, BarAlbMtrE, BarPreMtr, BarAlbKgmE, BarPreKgm FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093E3", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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

