package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpdo extends GXProcedure
{
   public pactpdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpdo.class ), "" );
   }

   public pactpdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          int[] aP3 ,
                          java.math.BigDecimal[] aP4 )
   {
      pactpdo.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 )
   {
      pactpdo.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpdo.this.AV16PartCod = aP1[0];
      this.aP1 = aP1;
      pactpdo.this.AV17CliCod = aP2[0];
      this.aP2 = aP2;
      pactpdo.this.AV18PartAlbDis = aP3[0];
      this.aP3 = aP3;
      pactpdo.this.AV19Kilos = aP4[0];
      this.aP4 = aP4;
      pactpdo.this.AV20Conos = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00CY2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, AV16PartCod, Integer.valueOf(AV17CliCod), Integer.valueOf(AV18PartAlbDis)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A980PartLinTip = P00CY2_A980PartLinTip[0] ;
         n980PartLinTip = P00CY2_n980PartLinTip[0] ;
         A981PartAlbDis = P00CY2_A981PartAlbDis[0] ;
         n981PartAlbDis = P00CY2_n981PartAlbDis[0] ;
         A252CliCod = P00CY2_A252CliCod[0] ;
         A966PartCod = P00CY2_A966PartCod[0] ;
         A396EmprCod = P00CY2_A396EmprCod[0] ;
         A986KilUti = P00CY2_A986KilUti[0] ;
         n986KilUti = P00CY2_n986KilUti[0] ;
         A987ConUti = P00CY2_A987ConUti[0] ;
         n987ConUti = P00CY2_n987ConUti[0] ;
         A1966KilRes = P00CY2_A1966KilRes[0] ;
         n1966KilRes = P00CY2_n1966KilRes[0] ;
         A1967ConRes = P00CY2_A1967ConRes[0] ;
         n1967ConRes = P00CY2_n1967ConRes[0] ;
         A979PartLin = P00CY2_A979PartLin[0] ;
         if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A986KilUti = A986KilUti.subtract(AV19Kilos) ;
            n986KilUti = false ;
            A987ConUti = (short)(A987ConUti-AV20Conos) ;
            n987ConUti = false ;
            A1966KilRes = A1966KilRes.add(AV19Kilos) ;
            n1966KilRes = false ;
            A1967ConRes = (short)(A1967ConRes+AV20Conos) ;
            n1967ConRes = false ;
            /* Using cursor P00CY3 */
            pr_default.execute(1, new Object[] {Boolean.valueOf(n986KilUti), A986KilUti, Boolean.valueOf(n987ConUti), Short.valueOf(A987ConUti), Boolean.valueOf(n1966KilRes), A1966KilRes, Boolean.valueOf(n1967ConRes), Short.valueOf(A1967ConRes), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpdo.this.AV15EmprCod;
      this.aP1[0] = pactpdo.this.AV16PartCod;
      this.aP2[0] = pactpdo.this.AV17CliCod;
      this.aP3[0] = pactpdo.this.AV18PartAlbDis;
      this.aP4[0] = pactpdo.this.AV19Kilos;
      this.aP5[0] = pactpdo.this.AV20Conos;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactpdo");
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
      P00CY2_A980PartLinTip = new String[] {""} ;
      P00CY2_n980PartLinTip = new boolean[] {false} ;
      P00CY2_A981PartAlbDis = new int[1] ;
      P00CY2_n981PartAlbDis = new boolean[] {false} ;
      P00CY2_A252CliCod = new int[1] ;
      P00CY2_A966PartCod = new String[] {""} ;
      P00CY2_A396EmprCod = new String[] {""} ;
      P00CY2_A986KilUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CY2_n986KilUti = new boolean[] {false} ;
      P00CY2_A987ConUti = new short[1] ;
      P00CY2_n987ConUti = new boolean[] {false} ;
      P00CY2_A1966KilRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CY2_n1966KilRes = new boolean[] {false} ;
      P00CY2_A1967ConRes = new short[1] ;
      P00CY2_n1967ConRes = new boolean[] {false} ;
      P00CY2_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      A966PartCod = "" ;
      A396EmprCod = "" ;
      A986KilUti = DecimalUtil.ZERO ;
      A1966KilRes = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpdo__default(),
         new Object[] {
             new Object[] {
            P00CY2_A980PartLinTip, P00CY2_n980PartLinTip, P00CY2_A981PartAlbDis, P00CY2_n981PartAlbDis, P00CY2_A252CliCod, P00CY2_A966PartCod, P00CY2_A396EmprCod, P00CY2_A986KilUti, P00CY2_n986KilUti, P00CY2_A987ConUti,
            P00CY2_n987ConUti, P00CY2_A1966KilRes, P00CY2_n1966KilRes, P00CY2_A1967ConRes, P00CY2_n1967ConRes, P00CY2_A979PartLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A987ConUti ;
   private short A1967ConRes ;
   private short Gx_err ;
   private int AV17CliCod ;
   private int AV18PartAlbDis ;
   private int AV20Conos ;
   private int A981PartAlbDis ;
   private int A252CliCod ;
   private int A979PartLin ;
   private java.math.BigDecimal AV19Kilos ;
   private java.math.BigDecimal A986KilUti ;
   private java.math.BigDecimal A1966KilRes ;
   private String AV15EmprCod ;
   private String AV16PartCod ;
   private String scmdbuf ;
   private String A980PartLinTip ;
   private String A966PartCod ;
   private String A396EmprCod ;
   private boolean n980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n986KilUti ;
   private boolean n987ConUti ;
   private boolean n1966KilRes ;
   private boolean n1967ConRes ;
   private int[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CY2_A980PartLinTip ;
   private boolean[] P00CY2_n980PartLinTip ;
   private int[] P00CY2_A981PartAlbDis ;
   private boolean[] P00CY2_n981PartAlbDis ;
   private int[] P00CY2_A252CliCod ;
   private String[] P00CY2_A966PartCod ;
   private String[] P00CY2_A396EmprCod ;
   private java.math.BigDecimal[] P00CY2_A986KilUti ;
   private boolean[] P00CY2_n986KilUti ;
   private short[] P00CY2_A987ConUti ;
   private boolean[] P00CY2_n987ConUti ;
   private java.math.BigDecimal[] P00CY2_A1966KilRes ;
   private boolean[] P00CY2_n1966KilRes ;
   private short[] P00CY2_A1967ConRes ;
   private boolean[] P00CY2_n1967ConRes ;
   private int[] P00CY2_A979PartLin ;
}

final  class pactpdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CY2", "SELECT PartLinTip, PartAlbDis, CliCod, PartCod, EmprCod, KilUti, ConUti, KilRes, ConRes, PartLin FROM TXPLPARTI WHERE (EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CY3", "UPDATE TXPLPARTI SET KilUti=?, ConUti=?, KilRes=?, ConRes=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 16);
               stmt.setInt(7, ((Number) parms[10]).intValue());
               stmt.setInt(8, ((Number) parms[11]).intValue());
               return;
      }
   }

}

