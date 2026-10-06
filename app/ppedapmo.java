package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedapmo extends GXProcedure
{
   public ppedapmo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedapmo.class ), "" );
   }

   public ppedapmo( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           int[] aP5 ,
                                           String[] aP6 )
   {
      ppedapmo.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppedapmo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedapmo.this.AV12PArtId = aP1[0];
      this.aP1 = aP1;
      ppedapmo.this.AV11PACBarCod = aP2[0];
      this.aP2 = aP2;
      ppedapmo.this.AV13PACBarReo = aP3[0];
      this.aP3 = aP3;
      ppedapmo.this.AV14PACBarPar = aP4[0];
      this.aP4 = aP4;
      ppedapmo.this.AV10PACAlbRec = aP5[0];
      this.aP5 = aP5;
      ppedapmo.this.AV15PACAlbPie = aP6[0];
      this.aP6 = aP6;
      ppedapmo.this.AV16PACMtr = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV11PACBarCod == 0 )
      {
         /* Using cursor P04M72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10PACAlbRec), AV15PACAlbPie});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2159AlbRecPie = P04M72_A2159AlbRecPie[0] ;
            A44AlbRecCod = P04M72_A44AlbRecCod[0] ;
            A2158AlbRecMtrU = P04M72_A2158AlbRecMtrU[0] ;
            A2157AlbRecMtr = P04M72_A2157AlbRecMtr[0] ;
            AV16PACMtr = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P04M73 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11PACBarCod), Byte.valueOf(AV13PACBarReo), AV14PACBarPar, Integer.valueOf(AV10PACAlbRec), AV15PACAlbPie});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P04M73_A200BarPieCod[0] ;
            A44AlbRecCod = P04M73_A44AlbRecCod[0] ;
            A130BarCodPar = P04M73_A130BarCodPar[0] ;
            A132BarCodReo = P04M73_A132BarCodReo[0] ;
            A129BarCod = P04M73_A129BarCod[0] ;
            A205BarPieMet = P04M73_A205BarPieMet[0] ;
            AV16PACMtr = A205BarPieMet ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedapmo.this.A396EmprCod;
      this.aP1[0] = ppedapmo.this.AV12PArtId;
      this.aP2[0] = ppedapmo.this.AV11PACBarCod;
      this.aP3[0] = ppedapmo.this.AV13PACBarReo;
      this.aP4[0] = ppedapmo.this.AV14PACBarPar;
      this.aP5[0] = ppedapmo.this.AV10PACAlbRec;
      this.aP6[0] = ppedapmo.this.AV15PACAlbPie;
      this.aP7[0] = ppedapmo.this.AV16PACMtr;
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
      P04M72_A396EmprCod = new String[] {""} ;
      P04M72_A2159AlbRecPie = new String[] {""} ;
      P04M72_A44AlbRecCod = new int[1] ;
      P04M72_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04M72_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2159AlbRecPie = "" ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      P04M73_A396EmprCod = new String[] {""} ;
      P04M73_A200BarPieCod = new String[] {""} ;
      P04M73_A44AlbRecCod = new int[1] ;
      P04M73_A130BarCodPar = new String[] {""} ;
      P04M73_A132BarCodReo = new byte[1] ;
      P04M73_A129BarCod = new int[1] ;
      P04M73_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      A205BarPieMet = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedapmo__default(),
         new Object[] {
             new Object[] {
            P04M72_A396EmprCod, P04M72_A2159AlbRecPie, P04M72_A44AlbRecCod, P04M72_A2158AlbRecMtrU, P04M72_A2157AlbRecMtr
            }
            , new Object[] {
            P04M73_A396EmprCod, P04M73_A200BarPieCod, P04M73_A44AlbRecCod, P04M73_A130BarCodPar, P04M73_A132BarCodReo, P04M73_A129BarCod, P04M73_A205BarPieMet
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13PACBarReo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV12PArtId ;
   private int AV11PACBarCod ;
   private int AV10PACAlbRec ;
   private int A44AlbRecCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV16PACMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A205BarPieMet ;
   private String A396EmprCod ;
   private String AV14PACBarPar ;
   private String AV15PACAlbPie ;
   private String scmdbuf ;
   private String A2159AlbRecPie ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P04M72_A396EmprCod ;
   private String[] P04M72_A2159AlbRecPie ;
   private int[] P04M72_A44AlbRecCod ;
   private java.math.BigDecimal[] P04M72_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] P04M72_A2157AlbRecMtr ;
   private String[] P04M73_A396EmprCod ;
   private String[] P04M73_A200BarPieCod ;
   private int[] P04M73_A44AlbRecCod ;
   private String[] P04M73_A130BarCodPar ;
   private byte[] P04M73_A132BarCodReo ;
   private int[] P04M73_A129BarCod ;
   private java.math.BigDecimal[] P04M73_A205BarPieMet ;
}

final  class ppedapmo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04M72", "SELECT EmprCod, AlbRecPie, AlbRecCod, AlbRecMtrU, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04M73", "SELECT EmprCod, BarPieCod, AlbRecCod, BarCodPar, BarCodReo, BarCod, BarPieMet FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and AlbRecCod = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, AlbRecCod, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

