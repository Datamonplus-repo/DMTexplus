package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdummcp extends GXProcedure
{
   public pdummcp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdummcp.class ), "" );
   }

   public pdummcp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pdummcp.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pdummcp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdummcp.this.A1514MacProCod = aP1[0];
      this.aP1 = aP1;
      pdummcp.this.AV16MacProDes = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P021C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1514MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1516MacProULin = P021C2_A1516MacProULin[0] ;
         A13464MacProPrg3 = P021C2_A13464MacProPrg3[0] ;
         A13463MacProPrg2 = P021C2_A13463MacProPrg2[0] ;
         A12534MacKgTTin = P021C2_A12534MacKgTTin[0] ;
         A6231MacProDsc2 = P021C2_A6231MacProDsc2[0] ;
         A6096MacNumPrg = P021C2_A6096MacNumPrg[0] ;
         A5425MacProMat = P021C2_A5425MacProMat[0] ;
         n5425MacProMat = P021C2_n5425MacProMat[0] ;
         A5424MacProTmx = P021C2_A5424MacProTmx[0] ;
         n5424MacProTmx = P021C2_n5424MacProTmx[0] ;
         A1515MacProDsc = P021C2_A1515MacProDsc[0] ;
         W396EmprCod = A396EmprCod ;
         W1514MacProCod = A1514MacProCod ;
         AV17Linea = (short)(A1516MacProULin+5) ;
         /* Using cursor P021C3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1514MacProCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1517MacProLin = P021C3_A1517MacProLin[0] ;
            A10550MacNH2O = P021C3_A10550MacNH2O[0] ;
            A10549MacRb = P021C3_A10549MacRb[0] ;
            A8011MacPrdTt = P021C3_A8011MacPrdTt[0] ;
            A7787MacPrgNum = P021C3_A7787MacPrgNum[0] ;
            A4685MacProTPau = P021C3_A4685MacProTPau[0] ;
            n4685MacProTPau = P021C3_n4685MacProTPau[0] ;
            A4684MacProNPro = P021C3_A4684MacProNPro[0] ;
            n4684MacProNPro = P021C3_n4684MacProNPro[0] ;
            A764ProForCod = P021C3_A764ProForCod[0] ;
            W396EmprCod = A396EmprCod ;
            W1514MacProCod = A1514MacProCod ;
            /*
               INSERT RECORD ON TABLE TXPLMACPR

            */
            W396EmprCod = A396EmprCod ;
            W1514MacProCod = A1514MacProCod ;
            W1517MacProLin = A1517MacProLin ;
            A1514MacProCod = AV16MacProDes ;
            A1517MacProLin = AV17Linea ;
            /* Using cursor P021C4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1514MacProCod, Short.valueOf(A1517MacProLin), A764ProForCod, Boolean.valueOf(n4684MacProNPro), Short.valueOf(A4684MacProNPro), Boolean.valueOf(n4685MacProTPau), Short.valueOf(A4685MacProTPau), Short.valueOf(A7787MacPrgNum), Short.valueOf(A8011MacPrdTt), A10549MacRb, Short.valueOf(A10550MacNH2O)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
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
            A396EmprCod = W396EmprCod ;
            A1514MacProCod = W1514MacProCod ;
            A1517MacProLin = W1517MacProLin ;
            /* End Insert */
            AV17Linea = (short)(AV17Linea+5) ;
            A396EmprCod = W396EmprCod ;
            A1514MacProCod = W1514MacProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /*
            INSERT RECORD ON TABLE TXPCMACPR

         */
         W396EmprCod = A396EmprCod ;
         W1514MacProCod = A1514MacProCod ;
         W1516MacProULin = A1516MacProULin ;
         A1514MacProCod = AV16MacProDes ;
         A1516MacProULin = AV17Linea ;
         /* Using cursor P021C5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A1514MacProCod, A1515MacProDsc, Short.valueOf(A1516MacProULin), Boolean.valueOf(n5424MacProTmx), Short.valueOf(A5424MacProTmx), Boolean.valueOf(n5425MacProMat), A5425MacProMat, Integer.valueOf(A6096MacNumPrg), A6231MacProDsc2, A12534MacKgTTin, A13463MacProPrg2, A13464MacProPrg3});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A1514MacProCod = W1514MacProCod ;
         A1516MacProULin = W1516MacProULin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A1514MacProCod = W1514MacProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdummcp.this.A396EmprCod;
      this.aP1[0] = pdummcp.this.A1514MacProCod;
      this.aP2[0] = pdummcp.this.AV16MacProDes;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pdummcp");
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
      P021C2_A396EmprCod = new String[] {""} ;
      P021C2_A1514MacProCod = new String[] {""} ;
      P021C2_A1516MacProULin = new short[1] ;
      P021C2_A13464MacProPrg3 = new String[] {""} ;
      P021C2_A13463MacProPrg2 = new String[] {""} ;
      P021C2_A12534MacKgTTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P021C2_A6231MacProDsc2 = new String[] {""} ;
      P021C2_A6096MacNumPrg = new int[1] ;
      P021C2_A5425MacProMat = new String[] {""} ;
      P021C2_n5425MacProMat = new boolean[] {false} ;
      P021C2_A5424MacProTmx = new short[1] ;
      P021C2_n5424MacProTmx = new boolean[] {false} ;
      P021C2_A1515MacProDsc = new String[] {""} ;
      A13464MacProPrg3 = "" ;
      A13463MacProPrg2 = "" ;
      A12534MacKgTTin = DecimalUtil.ZERO ;
      A6231MacProDsc2 = "" ;
      A5425MacProMat = "" ;
      A1515MacProDsc = "" ;
      W396EmprCod = "" ;
      W1514MacProCod = "" ;
      P021C3_A396EmprCod = new String[] {""} ;
      P021C3_A1514MacProCod = new String[] {""} ;
      P021C3_A1517MacProLin = new short[1] ;
      P021C3_A10550MacNH2O = new short[1] ;
      P021C3_A10549MacRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P021C3_A8011MacPrdTt = new short[1] ;
      P021C3_A7787MacPrgNum = new short[1] ;
      P021C3_A4685MacProTPau = new short[1] ;
      P021C3_n4685MacProTPau = new boolean[] {false} ;
      P021C3_A4684MacProNPro = new short[1] ;
      P021C3_n4684MacProNPro = new boolean[] {false} ;
      P021C3_A764ProForCod = new String[] {""} ;
      A10549MacRb = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pdummcp__default(),
         new Object[] {
             new Object[] {
            P021C2_A396EmprCod, P021C2_A1514MacProCod, P021C2_A1516MacProULin, P021C2_A13464MacProPrg3, P021C2_A13463MacProPrg2, P021C2_A12534MacKgTTin, P021C2_A6231MacProDsc2, P021C2_A6096MacNumPrg, P021C2_A5425MacProMat, P021C2_n5425MacProMat,
            P021C2_A5424MacProTmx, P021C2_n5424MacProTmx, P021C2_A1515MacProDsc
            }
            , new Object[] {
            P021C3_A396EmprCod, P021C3_A1514MacProCod, P021C3_A1517MacProLin, P021C3_A10550MacNH2O, P021C3_A10549MacRb, P021C3_A8011MacPrdTt, P021C3_A7787MacPrgNum, P021C3_A4685MacProTPau, P021C3_n4685MacProTPau, P021C3_A4684MacProNPro,
            P021C3_n4684MacProNPro, P021C3_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A1516MacProULin ;
   private short A5424MacProTmx ;
   private short AV17Linea ;
   private short A1517MacProLin ;
   private short A10550MacNH2O ;
   private short A8011MacPrdTt ;
   private short A7787MacPrgNum ;
   private short A4685MacProTPau ;
   private short A4684MacProNPro ;
   private short W1517MacProLin ;
   private short Gx_err ;
   private short W1516MacProULin ;
   private int A6096MacNumPrg ;
   private int GX_INS215 ;
   private int GX_INS214 ;
   private java.math.BigDecimal A12534MacKgTTin ;
   private java.math.BigDecimal A10549MacRb ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String AV16MacProDes ;
   private String scmdbuf ;
   private String A13464MacProPrg3 ;
   private String A13463MacProPrg2 ;
   private String A6231MacProDsc2 ;
   private String A5425MacProMat ;
   private String A1515MacProDsc ;
   private String W396EmprCod ;
   private String W1514MacProCod ;
   private String A764ProForCod ;
   private String Gx_emsg ;
   private boolean n5425MacProMat ;
   private boolean n5424MacProTmx ;
   private boolean n4685MacProTPau ;
   private boolean n4684MacProNPro ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P021C2_A396EmprCod ;
   private String[] P021C2_A1514MacProCod ;
   private short[] P021C2_A1516MacProULin ;
   private String[] P021C2_A13464MacProPrg3 ;
   private String[] P021C2_A13463MacProPrg2 ;
   private java.math.BigDecimal[] P021C2_A12534MacKgTTin ;
   private String[] P021C2_A6231MacProDsc2 ;
   private int[] P021C2_A6096MacNumPrg ;
   private String[] P021C2_A5425MacProMat ;
   private boolean[] P021C2_n5425MacProMat ;
   private short[] P021C2_A5424MacProTmx ;
   private boolean[] P021C2_n5424MacProTmx ;
   private String[] P021C2_A1515MacProDsc ;
   private String[] P021C3_A396EmprCod ;
   private String[] P021C3_A1514MacProCod ;
   private short[] P021C3_A1517MacProLin ;
   private short[] P021C3_A10550MacNH2O ;
   private java.math.BigDecimal[] P021C3_A10549MacRb ;
   private short[] P021C3_A8011MacPrdTt ;
   private short[] P021C3_A7787MacPrgNum ;
   private short[] P021C3_A4685MacProTPau ;
   private boolean[] P021C3_n4685MacProTPau ;
   private short[] P021C3_A4684MacProNPro ;
   private boolean[] P021C3_n4684MacProNPro ;
   private String[] P021C3_A764ProForCod ;
}

final  class pdummcp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021C2", "SELECT EmprCod, MacProCod, MacProULin, MacProPrg3, MacProPrg2, MacKgTTin, MacProDsc2, MacNumPrg, MacProMat, MacProTmx, MacProDsc FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P021C3", "SELECT EmprCod, MacProCod, MacProLin, MacNH2O, MacRb, MacPrdTt, MacPrgNum, MacProTPau, MacProNPro, ProForCod FROM TXPLMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod, MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021C4", "INSERT INTO TXPLMACPR(EmprCod, MacProCod, MacProLin, ProForCod, MacProNPro, MacProTPau, MacPrgNum, MacPrdTt, MacRb, MacNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACPR")
         ,new UpdateCursor("P021C5", "INSERT INTO TXPCMACPR(EmprCod, MacProCod, MacProDsc, MacProULin, MacProTmx, MacProMat, MacNumPrg, MacProDsc2, MacKgTTin, MacProPrg2, MacProPrg3) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACPR")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 20);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 16);
               }
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setString(8, (String)parms[9], 60);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               stmt.setString(10, (String)parms[11], 6);
               stmt.setString(11, (String)parms[12], 6);
               return;
      }
   }

}

