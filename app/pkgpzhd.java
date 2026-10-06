package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pkgpzhd extends GXProcedure
{
   public pkgpzhd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pkgpzhd.class ), "" );
   }

   public pkgpzhd( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 )
   {
      pkgpzhd.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      pkgpzhd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pkgpzhd.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pkgpzhd.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pkgpzhd.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pkgpzhd.this.AV15BarPieKil = aP4[0];
      this.aP4 = aP4;
      pkgpzhd.this.AV21BarPiepie = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15BarPieKil = DecimalUtil.doubleToDec(0) ;
      AV21BarPiepie = 0 ;
      /* Optimized group. */
      /* Using cursor P024E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      c203BarPieKil = P024E2_A203BarPieKil[0] ;
      c1501BarPiePie = P024E2_A1501BarPiePie[0] ;
      pr_default.close(0);
      AV15BarPieKil = AV15BarPieKil.add(c203BarPieKil) ;
      AV21BarPiepie = (int)(AV21BarPiepie+c1501BarPiePie) ;
      /* End optimized group. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pkgpzhd.this.A396EmprCod;
      this.aP1[0] = pkgpzhd.this.A129BarCod;
      this.aP2[0] = pkgpzhd.this.A132BarCodReo;
      this.aP3[0] = pkgpzhd.this.A130BarCodPar;
      this.aP4[0] = pkgpzhd.this.AV15BarPieKil;
      this.aP5[0] = pkgpzhd.this.AV21BarPiepie;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c203BarPieKil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P024E2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P024E2_A1501BarPiePie = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pkgpzhd__default(),
         new Object[] {
             new Object[] {
            P024E2_A203BarPieKil, P024E2_A1501BarPiePie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21BarPiepie ;
   private int c1501BarPiePie ;
   private java.math.BigDecimal AV15BarPieKil ;
   private java.math.BigDecimal c203BarPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P024E2_A203BarPieKil ;
   private int[] P024E2_A1501BarPiePie ;
}

final  class pkgpzhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P024E2", "SELECT SUM(BarPieKil), SUM(BarPiePie) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
      }
   }

}

