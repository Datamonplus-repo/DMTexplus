package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preciofase_get extends GXProcedure
{
   public preciofase_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preciofase_get.class ), "" );
   }

   public preciofase_get( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            byte[] aP6 ,
                            String[] aP7 ,
                            String[] aP8 ,
                            java.math.BigDecimal[] aP9 ,
                            java.util.Date[] aP10 ,
                            short[] aP11 ,
                            String[] aP12 )
   {
      preciofase_get.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.util.Date[] aP10 ,
                        short[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.util.Date[] aP10 ,
                             short[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 )
   {
      preciofase_get.this.A396EmprCod = aP0;
      preciofase_get.this.AV18clicod = aP1;
      preciofase_get.this.AV17FasCod = aP2;
      preciofase_get.this.aP3 = aP3;
      preciofase_get.this.aP4 = aP4;
      preciofase_get.this.aP5 = aP5;
      preciofase_get.this.aP6 = aP6;
      preciofase_get.this.aP7 = aP7;
      preciofase_get.this.aP8 = aP8;
      preciofase_get.this.aP9 = aP9;
      preciofase_get.this.aP10 = aP10;
      preciofase_get.this.aP11 = aP11;
      preciofase_get.this.aP12 = aP12;
      preciofase_get.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FasKgsEnt = "N" ;
      AV14FasKgsMn = DecimalUtil.ZERO ;
      AV12FasPreKgF = "N" ;
      AV9FasPreKgm = DecimalUtil.ZERO ;
      AV10FasPreMt2 = DecimalUtil.ZERO ;
      AV11FasPreU = (byte)(0) ;
      AV15PreFas = (short)(0) ;
      AV16FasPreFAc = GXutil.today( ) ;
      AV8FasPreMtr = DecimalUtil.ZERO ;
      AV19FasActiva = "N" ;
      AV20faspro = (short)(0) ;
      /* Using cursor P0AM02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18clicod), AV17FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P0AM02_A457FasCod[0] ;
         A252CliCod = P0AM02_A252CliCod[0] ;
         A13587FasKgsEnt = P0AM02_A13587FasKgsEnt[0] ;
         n13587FasKgsEnt = P0AM02_n13587FasKgsEnt[0] ;
         A12704FasKgsMn = P0AM02_A12704FasKgsMn[0] ;
         n12704FasKgsMn = P0AM02_n12704FasKgsMn[0] ;
         A12577FasPreKgF = P0AM02_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P0AM02_n12577FasPreKgF[0] ;
         A466FasPreKgm = P0AM02_A466FasPreKgm[0] ;
         n466FasPreKgm = P0AM02_n466FasPreKgm[0] ;
         A12576FasPreMt2 = P0AM02_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P0AM02_n12576FasPreMt2[0] ;
         A10882FasPreU = P0AM02_A10882FasPreU[0] ;
         n10882FasPreU = P0AM02_n10882FasPreU[0] ;
         A4385FasPreFAc = P0AM02_A4385FasPreFAc[0] ;
         n4385FasPreFAc = P0AM02_n4385FasPreFAc[0] ;
         A467FasPreMtr = P0AM02_A467FasPreMtr[0] ;
         n467FasPreMtr = P0AM02_n467FasPreMtr[0] ;
         AV13FasKgsEnt = A13587FasKgsEnt ;
         AV14FasKgsMn = A12704FasKgsMn ;
         AV12FasPreKgF = A12577FasPreKgF ;
         AV9FasPreKgm = A466FasPreKgm ;
         AV10FasPreMt2 = A12576FasPreMt2 ;
         AV11FasPreU = A10882FasPreU ;
         AV16FasPreFAc = A4385FasPreFAc ;
         AV8FasPreMtr = A467FasPreMtr ;
         AV15PreFas = (short)(1) ;
         AV20faspro = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15PreFas == 0 )
      {
         /* Using cursor P0AM03 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV17FasCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = P0AM03_A457FasCod[0] ;
            A14042FasActiva = P0AM03_A14042FasActiva[0] ;
            AV19FasActiva = A14042FasActiva ;
            AV20faspro = (short)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = preciofase_get.this.AV8FasPreMtr;
      this.aP4[0] = preciofase_get.this.AV9FasPreKgm;
      this.aP5[0] = preciofase_get.this.AV10FasPreMt2;
      this.aP6[0] = preciofase_get.this.AV11FasPreU;
      this.aP7[0] = preciofase_get.this.AV12FasPreKgF;
      this.aP8[0] = preciofase_get.this.AV13FasKgsEnt;
      this.aP9[0] = preciofase_get.this.AV14FasKgsMn;
      this.aP10[0] = preciofase_get.this.AV16FasPreFAc;
      this.aP11[0] = preciofase_get.this.AV15PreFas;
      this.aP12[0] = preciofase_get.this.AV19FasActiva;
      this.aP13[0] = preciofase_get.this.AV20faspro;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8FasPreMtr = DecimalUtil.ZERO ;
      AV9FasPreKgm = DecimalUtil.ZERO ;
      AV10FasPreMt2 = DecimalUtil.ZERO ;
      AV12FasPreKgF = "" ;
      AV13FasKgsEnt = "" ;
      AV14FasKgsMn = DecimalUtil.ZERO ;
      AV16FasPreFAc = GXutil.nullDate() ;
      AV19FasActiva = "" ;
      scmdbuf = "" ;
      P0AM02_A396EmprCod = new String[] {""} ;
      P0AM02_A457FasCod = new String[] {""} ;
      P0AM02_A252CliCod = new int[1] ;
      P0AM02_A13587FasKgsEnt = new String[] {""} ;
      P0AM02_n13587FasKgsEnt = new boolean[] {false} ;
      P0AM02_A12704FasKgsMn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM02_n12704FasKgsMn = new boolean[] {false} ;
      P0AM02_A12577FasPreKgF = new String[] {""} ;
      P0AM02_n12577FasPreKgF = new boolean[] {false} ;
      P0AM02_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM02_n466FasPreKgm = new boolean[] {false} ;
      P0AM02_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM02_n12576FasPreMt2 = new boolean[] {false} ;
      P0AM02_A10882FasPreU = new byte[1] ;
      P0AM02_n10882FasPreU = new boolean[] {false} ;
      P0AM02_A4385FasPreFAc = new java.util.Date[] {GXutil.nullDate()} ;
      P0AM02_n4385FasPreFAc = new boolean[] {false} ;
      P0AM02_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AM02_n467FasPreMtr = new boolean[] {false} ;
      A457FasCod = "" ;
      A13587FasKgsEnt = "" ;
      A12704FasKgsMn = DecimalUtil.ZERO ;
      A12577FasPreKgF = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      A4385FasPreFAc = GXutil.nullDate() ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      P0AM03_A396EmprCod = new String[] {""} ;
      P0AM03_A457FasCod = new String[] {""} ;
      P0AM03_A14042FasActiva = new String[] {""} ;
      A14042FasActiva = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.preciofase_get__default(),
         new Object[] {
             new Object[] {
            P0AM02_A396EmprCod, P0AM02_A457FasCod, P0AM02_A252CliCod, P0AM02_A13587FasKgsEnt, P0AM02_n13587FasKgsEnt, P0AM02_A12704FasKgsMn, P0AM02_n12704FasKgsMn, P0AM02_A12577FasPreKgF, P0AM02_n12577FasPreKgF, P0AM02_A466FasPreKgm,
            P0AM02_n466FasPreKgm, P0AM02_A12576FasPreMt2, P0AM02_n12576FasPreMt2, P0AM02_A10882FasPreU, P0AM02_n10882FasPreU, P0AM02_A4385FasPreFAc, P0AM02_n4385FasPreFAc, P0AM02_A467FasPreMtr, P0AM02_n467FasPreMtr
            }
            , new Object[] {
            P0AM03_A396EmprCod, P0AM03_A457FasCod, P0AM03_A14042FasActiva
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11FasPreU ;
   private byte A10882FasPreU ;
   private short AV15PreFas ;
   private short AV20faspro ;
   private short Gx_err ;
   private int AV18clicod ;
   private int A252CliCod ;
   private java.math.BigDecimal AV8FasPreMtr ;
   private java.math.BigDecimal AV9FasPreKgm ;
   private java.math.BigDecimal AV10FasPreMt2 ;
   private java.math.BigDecimal AV14FasKgsMn ;
   private java.math.BigDecimal A12704FasKgsMn ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal A467FasPreMtr ;
   private String A396EmprCod ;
   private String AV17FasCod ;
   private String AV12FasPreKgF ;
   private String AV13FasKgsEnt ;
   private String AV19FasActiva ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A13587FasKgsEnt ;
   private String A12577FasPreKgF ;
   private String A14042FasActiva ;
   private java.util.Date AV16FasPreFAc ;
   private java.util.Date A4385FasPreFAc ;
   private boolean n13587FasKgsEnt ;
   private boolean n12704FasKgsMn ;
   private boolean n12577FasPreKgF ;
   private boolean n466FasPreKgm ;
   private boolean n12576FasPreMt2 ;
   private boolean n10882FasPreU ;
   private boolean n4385FasPreFAc ;
   private boolean n467FasPreMtr ;
   private short[] aP13 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.util.Date[] aP10 ;
   private short[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AM02_A396EmprCod ;
   private String[] P0AM02_A457FasCod ;
   private int[] P0AM02_A252CliCod ;
   private String[] P0AM02_A13587FasKgsEnt ;
   private boolean[] P0AM02_n13587FasKgsEnt ;
   private java.math.BigDecimal[] P0AM02_A12704FasKgsMn ;
   private boolean[] P0AM02_n12704FasKgsMn ;
   private String[] P0AM02_A12577FasPreKgF ;
   private boolean[] P0AM02_n12577FasPreKgF ;
   private java.math.BigDecimal[] P0AM02_A466FasPreKgm ;
   private boolean[] P0AM02_n466FasPreKgm ;
   private java.math.BigDecimal[] P0AM02_A12576FasPreMt2 ;
   private boolean[] P0AM02_n12576FasPreMt2 ;
   private byte[] P0AM02_A10882FasPreU ;
   private boolean[] P0AM02_n10882FasPreU ;
   private java.util.Date[] P0AM02_A4385FasPreFAc ;
   private boolean[] P0AM02_n4385FasPreFAc ;
   private java.math.BigDecimal[] P0AM02_A467FasPreMtr ;
   private boolean[] P0AM02_n467FasPreMtr ;
   private String[] P0AM03_A396EmprCod ;
   private String[] P0AM03_A457FasCod ;
   private String[] P0AM03_A14042FasActiva ;
}

final  class preciofase_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AM02", "SELECT EmprCod, FasCod, CliCod, FasKgsEnt, FasKgsMn, FasPreKgF, FasPreKgm, FasPreMt2, FasPreU, FasPreFAc, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? and CliCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AM03", "SELECT EmprCod, FasCod, FasActiva FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

