package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspdi extends GXProcedure
{
   public pbuspdi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspdi.class ), "" );
   }

   public pbuspdi( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 )
   {
      pbuspdi.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pbuspdi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspdi.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbuspdi.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbuspdi.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbuspdi.this.AV15PreDib = aP4[0];
      this.aP4 = aP4;
      pbuspdi.this.AV16MtsBar = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00YB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00YB2_A361DisCod[0] ;
         A1014DibInt = P00YB2_A1014DibInt[0] ;
         n1014DibInt = P00YB2_n1014DibInt[0] ;
         A1013DibCli = P00YB2_A1013DibCli[0] ;
         n1013DibCli = P00YB2_n1013DibCli[0] ;
         A212BarSer = P00YB2_A212BarSer[0] ;
         A252CliCod = P00YB2_A252CliCod[0] ;
         n252CliCod = P00YB2_n252CliCod[0] ;
         A1014DibInt = P00YB2_A1014DibInt[0] ;
         n1014DibInt = P00YB2_n1014DibInt[0] ;
         A1013DibCli = P00YB2_A1013DibCli[0] ;
         n1013DibCli = P00YB2_n1013DibCli[0] ;
         AV15PreDib = DecimalUtil.doubleToDec(0) ;
         AV20PreDibLim = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P00YB3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A65ArtCod = P00YB3_A65ArtCod[0] ;
            A1177Dibujo = P00YB3_A1177Dibujo[0] ;
            A1790DibIntCod = P00YB3_A1790DibIntCod[0] ;
            A1771PreDib = P00YB3_A1771PreDib[0] ;
            n1771PreDib = P00YB3_n1771PreDib[0] ;
            AV15PreDib = A1771PreDib ;
            /* Using cursor P00YB4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, A1177Dibujo, Integer.valueOf(A1790DibIntCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1756DibLimMax = P00YB4_A1756DibLimMax[0] ;
               n1756DibLimMax = P00YB4_n1756DibLimMax[0] ;
               A1757DibLimMin = P00YB4_A1757DibLimMin[0] ;
               n1757DibLimMin = P00YB4_n1757DibLimMin[0] ;
               A1758DibLinPre = P00YB4_A1758DibLinPre[0] ;
               n1758DibLinPre = P00YB4_n1758DibLinPre[0] ;
               A1770LinDib = P00YB4_A1770LinDib[0] ;
               if ( ( AV16MtsBar.doubleValue() >= A1757DibLimMin ) && ( AV16MtsBar.doubleValue() <= A1756DibLimMax ) )
               {
                  AV20PreDibLim = A1758DibLinPre ;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreDibLim)==0) )
            {
               AV15PreDib = AV20PreDibLim ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
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
      this.aP0[0] = pbuspdi.this.A396EmprCod;
      this.aP1[0] = pbuspdi.this.A129BarCod;
      this.aP2[0] = pbuspdi.this.A132BarCodReo;
      this.aP3[0] = pbuspdi.this.A130BarCodPar;
      this.aP4[0] = pbuspdi.this.AV15PreDib;
      this.aP5[0] = pbuspdi.this.AV16MtsBar;
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
      P00YB2_A361DisCod = new int[1] ;
      P00YB2_A396EmprCod = new String[] {""} ;
      P00YB2_A129BarCod = new int[1] ;
      P00YB2_A132BarCodReo = new byte[1] ;
      P00YB2_A130BarCodPar = new String[] {""} ;
      P00YB2_A1014DibInt = new int[1] ;
      P00YB2_n1014DibInt = new boolean[] {false} ;
      P00YB2_A1013DibCli = new String[] {""} ;
      P00YB2_n1013DibCli = new boolean[] {false} ;
      P00YB2_A212BarSer = new String[] {""} ;
      P00YB2_A252CliCod = new int[1] ;
      P00YB2_n252CliCod = new boolean[] {false} ;
      A1013DibCli = "" ;
      A212BarSer = "" ;
      AV20PreDibLim = DecimalUtil.ZERO ;
      P00YB3_A396EmprCod = new String[] {""} ;
      P00YB3_A252CliCod = new int[1] ;
      P00YB3_n252CliCod = new boolean[] {false} ;
      P00YB3_A65ArtCod = new String[] {""} ;
      P00YB3_A1177Dibujo = new String[] {""} ;
      P00YB3_A1790DibIntCod = new int[1] ;
      P00YB3_A1771PreDib = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YB3_n1771PreDib = new boolean[] {false} ;
      A65ArtCod = "" ;
      A1177Dibujo = "" ;
      A1771PreDib = DecimalUtil.ZERO ;
      P00YB4_A396EmprCod = new String[] {""} ;
      P00YB4_A252CliCod = new int[1] ;
      P00YB4_n252CliCod = new boolean[] {false} ;
      P00YB4_A65ArtCod = new String[] {""} ;
      P00YB4_A1177Dibujo = new String[] {""} ;
      P00YB4_A1790DibIntCod = new int[1] ;
      P00YB4_A1756DibLimMax = new int[1] ;
      P00YB4_n1756DibLimMax = new boolean[] {false} ;
      P00YB4_A1757DibLimMin = new int[1] ;
      P00YB4_n1757DibLimMin = new boolean[] {false} ;
      P00YB4_A1758DibLinPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00YB4_n1758DibLinPre = new boolean[] {false} ;
      P00YB4_A1770LinDib = new short[1] ;
      A1758DibLinPre = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspdi__default(),
         new Object[] {
             new Object[] {
            P00YB2_A361DisCod, P00YB2_A396EmprCod, P00YB2_A129BarCod, P00YB2_A132BarCodReo, P00YB2_A130BarCodPar, P00YB2_A1014DibInt, P00YB2_n1014DibInt, P00YB2_A1013DibCli, P00YB2_n1013DibCli, P00YB2_A212BarSer,
            P00YB2_A252CliCod, P00YB2_n252CliCod
            }
            , new Object[] {
            P00YB3_A396EmprCod, P00YB3_A252CliCod, P00YB3_A65ArtCod, P00YB3_A1177Dibujo, P00YB3_A1790DibIntCod, P00YB3_A1771PreDib, P00YB3_n1771PreDib
            }
            , new Object[] {
            P00YB4_A396EmprCod, P00YB4_A252CliCod, P00YB4_A65ArtCod, P00YB4_A1177Dibujo, P00YB4_A1790DibIntCod, P00YB4_A1756DibLimMax, P00YB4_n1756DibLimMax, P00YB4_A1757DibLimMin, P00YB4_n1757DibLimMin, P00YB4_A1758DibLinPre,
            P00YB4_n1758DibLinPre, P00YB4_A1770LinDib
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A1770LinDib ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int A1790DibIntCod ;
   private int A1756DibLimMax ;
   private int A1757DibLimMin ;
   private java.math.BigDecimal AV15PreDib ;
   private java.math.BigDecimal AV16MtsBar ;
   private java.math.BigDecimal AV20PreDibLim ;
   private java.math.BigDecimal A1771PreDib ;
   private java.math.BigDecimal A1758DibLinPre ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A1013DibCli ;
   private String A212BarSer ;
   private String A65ArtCod ;
   private String A1177Dibujo ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n252CliCod ;
   private boolean n1771PreDib ;
   private boolean n1756DibLimMax ;
   private boolean n1757DibLimMin ;
   private boolean n1758DibLinPre ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P00YB2_A361DisCod ;
   private String[] P00YB2_A396EmprCod ;
   private int[] P00YB2_A129BarCod ;
   private byte[] P00YB2_A132BarCodReo ;
   private String[] P00YB2_A130BarCodPar ;
   private int[] P00YB2_A1014DibInt ;
   private boolean[] P00YB2_n1014DibInt ;
   private String[] P00YB2_A1013DibCli ;
   private boolean[] P00YB2_n1013DibCli ;
   private String[] P00YB2_A212BarSer ;
   private int[] P00YB2_A252CliCod ;
   private boolean[] P00YB2_n252CliCod ;
   private String[] P00YB3_A396EmprCod ;
   private int[] P00YB3_A252CliCod ;
   private boolean[] P00YB3_n252CliCod ;
   private String[] P00YB3_A65ArtCod ;
   private String[] P00YB3_A1177Dibujo ;
   private int[] P00YB3_A1790DibIntCod ;
   private java.math.BigDecimal[] P00YB3_A1771PreDib ;
   private boolean[] P00YB3_n1771PreDib ;
   private String[] P00YB4_A396EmprCod ;
   private int[] P00YB4_A252CliCod ;
   private boolean[] P00YB4_n252CliCod ;
   private String[] P00YB4_A65ArtCod ;
   private String[] P00YB4_A1177Dibujo ;
   private int[] P00YB4_A1790DibIntCod ;
   private int[] P00YB4_A1756DibLimMax ;
   private boolean[] P00YB4_n1756DibLimMax ;
   private int[] P00YB4_A1757DibLimMin ;
   private boolean[] P00YB4_n1757DibLimMin ;
   private java.math.BigDecimal[] P00YB4_A1758DibLinPre ;
   private boolean[] P00YB4_n1758DibLinPre ;
   private short[] P00YB4_A1770LinDib ;
}

final  class pbuspdi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00YB2", "SELECT T1.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.DibInt, T2.DibCli, T1.BarSer, T1.CliCod FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YB3", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, PreDib FROM TXPCPRECO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00YB4", "SELECT EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, DibLimMax, DibLimMin, DibLinPre, LinDib FROM TXPLIMDIB WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and Dibujo = ? and DibIntCod = ? ORDER BY EmprCod, CliCod, ArtCod, Dibujo, DibIntCod, LinDib ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               stmt.setString(4, (String)parms[4], 16);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
      }
   }

}

