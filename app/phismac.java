package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phismac extends GXProcedure
{
   public phismac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phismac.class ), "" );
   }

   public phismac( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 ,
                           int[] aP6 )
   {
      phismac.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        int[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             int[] aP6 ,
                             byte[] aP7 )
   {
      phismac.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      phismac.this.AV9CliCod = aP1[0];
      this.aP1 = aP1;
      phismac.this.AV13ForSer = aP2[0];
      this.aP2 = aP2;
      phismac.this.AV14ForColNom = aP3[0];
      this.aP3 = aP3;
      phismac.this.AV15ForColNum = aP4[0];
      this.aP4 = aP4;
      phismac.this.AV16TipColCod = aP5[0];
      this.aP5 = aP5;
      phismac.this.AV17ForNumCol = aP6[0];
      this.aP6 = aP6;
      phismac.this.AV18FlagMod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(AV21Leave2, httpContext.getMessage( "E", "")) == 0 )
      {
         if ( GXutil.strcmp(AV20LANZA2, httpContext.getMessage( "S", "")) == 0 )
         {
            AV19PrimeraVez = (byte)(0) ;
            /* Using cursor P00I72 */
            pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9CliCod), AV13ForSer, AV14ForColNom, Integer.valueOf(AV15ForColNum), Byte.valueOf(AV16TipColCod), Integer.valueOf(AV17ForNumCol), Gx_date});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A2896HMaFec = P00I72_A2896HMaFec[0] ;
               A2895HMaForNumC = P00I72_A2895HMaForNumC[0] ;
               A2894HMaTipCCod = P00I72_A2894HMaTipCCod[0] ;
               A2893HMaForCNum = P00I72_A2893HMaForCNum[0] ;
               A2892HMaForCNom = P00I72_A2892HMaForCNom[0] ;
               A2891HMaForSer = P00I72_A2891HMaForSer[0] ;
               A252CliCod = P00I72_A252CliCod[0] ;
               A396EmprCod = P00I72_A396EmprCod[0] ;
               A2907HmaLin = P00I72_A2907HmaLin[0] ;
               A2897HMaColLin = P00I72_A2897HMaColLin[0] ;
               AV22UltLin = A2907HmaLin ;
               pr_default.readNext(0);
            }
            pr_default.close(0);
            AV22UltLin = (short)(AV22UltLin+1) ;
            /* Using cursor P00I73 */
            pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV17ForNumCol)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A490ForPrdUMe = P00I73_A490ForPrdUMe[0] ;
               A486ForNumCol = P00I73_A486ForNumCol[0] ;
               A309ColLin = P00I73_A309ColLin[0] ;
               A488ForPrdDsc = P00I73_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P00I73_n488ForPrdDsc[0] ;
               A481ForCan = P00I73_A481ForCan[0] ;
               A838TotLinCol = P00I73_A838TotLinCol[0] ;
               A396EmprCod = P00I73_A396EmprCod[0] ;
               A719PrdNum = P00I73_A719PrdNum[0] ;
               n719PrdNum = P00I73_n719PrdNum[0] ;
               A488ForPrdDsc = P00I73_A488ForPrdDsc[0] ;
               n488ForPrdDsc = P00I73_n488ForPrdDsc[0] ;
               AV10PrdNum = A719PrdNum ;
               /*
                  INSERT RECORD ON TABLE TXPHISMAC

               */
               W719PrdNum = A719PrdNum ;
               n719PrdNum = false ;
               A252CliCod = AV9CliCod ;
               A2891HMaForSer = AV13ForSer ;
               A2892HMaForCNom = AV14ForColNom ;
               A2893HMaForCNum = AV15ForColNum ;
               A2894HMaTipCCod = AV16TipColCod ;
               A2895HMaForNumC = A486ForNumCol ;
               A2896HMaFec = Gx_date ;
               A2897HMaColLin = A309ColLin ;
               A2907HmaLin = AV22UltLin ;
               A2898HMaPrdUMe = A488ForPrdDsc ;
               n2898HMaPrdUMe = false ;
               A2899HMaForCan = A481ForCan ;
               n2899HMaForCan = false ;
               A2900HMaTotLCol = A838TotLinCol ;
               n2900HMaTotLCol = false ;
               A719PrdNum = AV10PrdNum ;
               n719PrdNum = false ;
               A2924HmaTipLin = httpContext.getMessage( "C", "") ;
               n2924HmaTipLin = false ;
               /* Using cursor P00I74 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2891HMaForSer, A2892HMaForCNom, Integer.valueOf(A2893HMaForCNum), Byte.valueOf(A2894HMaTipCCod), Integer.valueOf(A2895HMaForNumC), Short.valueOf(A2897HMaColLin), A2896HMaFec, Short.valueOf(A2907HmaLin), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2898HMaPrdUMe), A2898HMaPrdUMe, Boolean.valueOf(n2899HMaForCan), A2899HMaForCan, Boolean.valueOf(n2900HMaTotLCol), A2900HMaTotLCol, Boolean.valueOf(n2924HmaTipLin), A2924HmaTipLin});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISMAC");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A719PrdNum = W719PrdNum ;
               n719PrdNum = false ;
               /* End Insert */
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
      }
      AV18FlagMod = (byte)(0) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phismac.this.AV8EmprCod;
      this.aP1[0] = phismac.this.AV9CliCod;
      this.aP2[0] = phismac.this.AV13ForSer;
      this.aP3[0] = phismac.this.AV14ForColNom;
      this.aP4[0] = phismac.this.AV15ForColNum;
      this.aP5[0] = phismac.this.AV16TipColCod;
      this.aP6[0] = phismac.this.AV17ForNumCol;
      this.aP7[0] = phismac.this.AV18FlagMod;
      Application.commitDataStores(context, remoteHandle, pr_default, "phismac");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21Leave2 = "" ;
      AV20LANZA2 = "" ;
      scmdbuf = "" ;
      Gx_date = GXutil.nullDate() ;
      P00I72_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      P00I72_A2895HMaForNumC = new int[1] ;
      P00I72_A2894HMaTipCCod = new byte[1] ;
      P00I72_A2893HMaForCNum = new int[1] ;
      P00I72_A2892HMaForCNom = new String[] {""} ;
      P00I72_A2891HMaForSer = new String[] {""} ;
      P00I72_A252CliCod = new int[1] ;
      P00I72_A396EmprCod = new String[] {""} ;
      P00I72_A2907HmaLin = new short[1] ;
      P00I72_A2897HMaColLin = new short[1] ;
      A2896HMaFec = GXutil.nullDate() ;
      A2892HMaForCNom = "" ;
      A2891HMaForSer = "" ;
      A396EmprCod = "" ;
      P00I73_A490ForPrdUMe = new byte[1] ;
      P00I73_A486ForNumCol = new int[1] ;
      P00I73_A309ColLin = new short[1] ;
      P00I73_A488ForPrdDsc = new String[] {""} ;
      P00I73_n488ForPrdDsc = new boolean[] {false} ;
      P00I73_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00I73_A838TotLinCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00I73_A396EmprCod = new String[] {""} ;
      P00I73_A719PrdNum = new String[] {""} ;
      P00I73_n719PrdNum = new boolean[] {false} ;
      A488ForPrdDsc = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A838TotLinCol = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV10PrdNum = "" ;
      W719PrdNum = "" ;
      A2898HMaPrdUMe = "" ;
      A2899HMaForCan = DecimalUtil.ZERO ;
      A2900HMaTotLCol = DecimalUtil.ZERO ;
      A2924HmaTipLin = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phismac__default(),
         new Object[] {
             new Object[] {
            P00I72_A2896HMaFec, P00I72_A2895HMaForNumC, P00I72_A2894HMaTipCCod, P00I72_A2893HMaForCNum, P00I72_A2892HMaForCNom, P00I72_A2891HMaForSer, P00I72_A252CliCod, P00I72_A396EmprCod, P00I72_A2907HmaLin, P00I72_A2897HMaColLin
            }
            , new Object[] {
            P00I73_A490ForPrdUMe, P00I73_A486ForNumCol, P00I73_A309ColLin, P00I73_A488ForPrdDsc, P00I73_n488ForPrdDsc, P00I73_A481ForCan, P00I73_A838TotLinCol, P00I73_A396EmprCod, P00I73_A719PrdNum
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16TipColCod ;
   private byte AV18FlagMod ;
   private byte AV19PrimeraVez ;
   private byte A2894HMaTipCCod ;
   private byte A490ForPrdUMe ;
   private short A2907HmaLin ;
   private short A2897HMaColLin ;
   private short AV22UltLin ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV9CliCod ;
   private int AV15ForColNum ;
   private int AV17ForNumCol ;
   private int A2895HMaForNumC ;
   private int A2893HMaForCNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int GX_INS426 ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal A838TotLinCol ;
   private java.math.BigDecimal A2899HMaForCan ;
   private java.math.BigDecimal A2900HMaTotLCol ;
   private String AV8EmprCod ;
   private String AV13ForSer ;
   private String AV14ForColNom ;
   private String AV21Leave2 ;
   private String AV20LANZA2 ;
   private String scmdbuf ;
   private String A2892HMaForCNom ;
   private String A2891HMaForSer ;
   private String A396EmprCod ;
   private String A488ForPrdDsc ;
   private String A719PrdNum ;
   private String AV10PrdNum ;
   private String W719PrdNum ;
   private String A2898HMaPrdUMe ;
   private String A2924HmaTipLin ;
   private String Gx_emsg ;
   private java.util.Date Gx_date ;
   private java.util.Date A2896HMaFec ;
   private boolean n488ForPrdDsc ;
   private boolean n719PrdNum ;
   private boolean n2898HMaPrdUMe ;
   private boolean n2899HMaForCan ;
   private boolean n2900HMaTotLCol ;
   private boolean n2924HmaTipLin ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private int[] aP6 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P00I72_A2896HMaFec ;
   private int[] P00I72_A2895HMaForNumC ;
   private byte[] P00I72_A2894HMaTipCCod ;
   private int[] P00I72_A2893HMaForCNum ;
   private String[] P00I72_A2892HMaForCNom ;
   private String[] P00I72_A2891HMaForSer ;
   private int[] P00I72_A252CliCod ;
   private String[] P00I72_A396EmprCod ;
   private short[] P00I72_A2907HmaLin ;
   private short[] P00I72_A2897HMaColLin ;
   private byte[] P00I73_A490ForPrdUMe ;
   private int[] P00I73_A486ForNumCol ;
   private short[] P00I73_A309ColLin ;
   private String[] P00I73_A488ForPrdDsc ;
   private boolean[] P00I73_n488ForPrdDsc ;
   private java.math.BigDecimal[] P00I73_A481ForCan ;
   private java.math.BigDecimal[] P00I73_A838TotLinCol ;
   private String[] P00I73_A396EmprCod ;
   private String[] P00I73_A719PrdNum ;
   private boolean[] P00I73_n719PrdNum ;
}

final  class phismac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00I72", "SELECT HMaFec, HMaForNumC, HMaTipCCod, HMaForCNum, HMaForCNom, HMaForSer, CliCod, EmprCod, HmaLin, HMaColLin FROM TXPHISMAC WHERE (EmprCod = ? and CliCod = ? and HMaForSer = ? and HMaForCNom = ? and HMaForCNum = ? and HMaTipCCod = ? and HMaForNumC = ?) AND (HMaFec = ?) ORDER BY EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00I73", "SELECT T1.ForPrdUMe, T1.ForNumCol, T1.ColLin, T2.ForPrdDsc, T1.ForCan, T1.TotLinCol, T1.EmprCod, T1.PrdNum FROM (TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) WHERE T1.EmprCod = ? and T1.ForNumCol = ? ORDER BY T1.EmprCod, T1.ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00I74", "INSERT INTO TXPHISMAC(EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin, PrdNum, HMaPrdUMe, HMaForCan, HMaTotLCol, HmaTipLin, HMaPrdNor) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISMAC")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setDate(8, (java.util.Date)parms[7]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setDate(9, (java.util.Date)parms[8]);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[15], 5);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[19], 1);
               }
               return;
      }
   }

}

