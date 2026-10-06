package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preclva2 extends GXProcedure
{
   public preclva2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preclva2.class ), "" );
   }

   public preclva2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      preclva2.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      preclva2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preclva2.this.AV25BarCod = aP1[0];
      this.aP1 = aP1;
      preclva2.this.AV26BarCodReo = aP2[0];
      this.aP2 = aP2;
      preclva2.this.AV27BarCodPar = aP3[0];
      this.aP3 = aP3;
      preclva2.this.AV28RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = (byte)(DecimalUtil.decToDouble(AV18Flag2)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int1) ;
      preclva2.this.AV18Flag2 = DecimalUtil.doubleToDec(GXv_int1[0]) ;
      /* Using cursor P01DU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar, Short.valueOf(AV28RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01DU2_A2804RecLinMaq[0] ;
         A130BarCodPar = P01DU2_A130BarCodPar[0] ;
         A132BarCodReo = P01DU2_A132BarCodReo[0] ;
         A129BarCod = P01DU2_A129BarCod[0] ;
         /* Using cursor P01DU3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1273RecLinPro = P01DU3_A1273RecLinPro[0] ;
            A764ProForCod = P01DU3_A764ProForCod[0] ;
            if ( AV18Flag2.doubleValue() == 1 )
            {
               /* Using cursor P01DU4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A686PrdCant = P01DU4_A686PrdCant[0] ;
                  A719PrdNum = P01DU4_A719PrdNum[0] ;
                  n719PrdNum = P01DU4_n719PrdNum[0] ;
                  A4024RecMar = P01DU4_A4024RecMar[0] ;
                  A811RecLin = P01DU4_A811RecLin[0] ;
                  if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A686PrdCant)==0) )
                  {
                     if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") != 0 )
                     {
                        if ( A4024RecMar == 1 )
                        {
                        }
                        else
                        {
                           GXv_char2[0] = A396EmprCod ;
                           GXv_char3[0] = A719PrdNum ;
                           GXv_decimal4[0] = A686PrdCant ;
                           new app.pactres4(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_decimal4) ;
                           preclva2.this.A396EmprCod = GXv_char2[0] ;
                           preclva2.this.A719PrdNum = GXv_char3[0] ;
                           preclva2.this.A686PrdCant = GXv_decimal4[0] ;
                        }
                     }
                     else
                     {
                        AV19PrdNum = A719PrdNum ;
                        AV20PrdCant = A686PrdCant ;
                        /* Execute user subroutine: 'COMPUESTOS' */
                        S111 ();
                        if ( returnInSub )
                        {
                           pr_default.close(2);
                           pr_default.close(1);
                           pr_default.close(0);
                           returnInSub = true;
                           cleanup();
                           if (true) return;
                        }
                     }
                  }
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            /* Optimized DELETE. */
            /* Using cursor P01DU5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
            /* End optimized DELETE. */
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Optimized DELETE. */
      /* Using cursor P01DU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar, Short.valueOf(AV28RecLinMaq)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
      /* End optimized DELETE. */
      /* Using cursor P01DU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV25BarCod), Byte.valueOf(AV26BarCodReo), AV27BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A130BarCodPar = P01DU7_A130BarCodPar[0] ;
         A132BarCodReo = P01DU7_A132BarCodReo[0] ;
         A129BarCod = P01DU7_A129BarCod[0] ;
         A212BarSer = P01DU7_A212BarSer[0] ;
         A213BarSit = P01DU7_A213BarSit[0] ;
         A3870BarFecLRe = P01DU7_A3870BarFecLRe[0] ;
         if ( A213BarSit == 4 )
         {
            A213BarSit = (byte)(1) ;
            A3870BarFecLRe = GXutil.nullDate() ;
         }
         /* Using cursor P01DU8 */
         pr_default.execute(6, new Object[] {Byte.valueOf(A213BarSit), A3870BarFecLRe, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      GXv_char3[0] = A396EmprCod ;
      GXv_int5[0] = AV25BarCod ;
      GXv_int1[0] = AV26BarCodReo ;
      GXv_char2[0] = AV27BarCodPar ;
      new app.pultlim(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_int1, GXv_char2) ;
      preclva2.this.A396EmprCod = GXv_char3[0] ;
      preclva2.this.AV25BarCod = GXv_int5[0] ;
      preclva2.this.AV26BarCodReo = GXv_int1[0] ;
      preclva2.this.AV27BarCodPar = GXv_char2[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'COMPUESTOS' Routine */
      returnInSub = false ;
      /* Using cursor P01DU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV19PrdNum});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A688PrdComCod = P01DU9_A688PrdComCod[0] ;
         A719PrdNum = P01DU9_A719PrdNum[0] ;
         n719PrdNum = P01DU9_n719PrdNum[0] ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = AV19PrdNum ;
         GXv_decimal4[0] = AV20PrdCant ;
         new app.pactres4(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal4) ;
         preclva2.this.A396EmprCod = GXv_char3[0] ;
         preclva2.this.AV19PrdNum = GXv_char2[0] ;
         preclva2.this.AV20PrdCant = GXv_decimal4[0] ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = preclva2.this.A396EmprCod;
      this.aP1[0] = preclva2.this.AV25BarCod;
      this.aP2[0] = preclva2.this.AV26BarCodReo;
      this.aP3[0] = preclva2.this.AV27BarCodPar;
      this.aP4[0] = preclva2.this.AV28RecLinMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "preclva2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Flag2 = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01DU2_A396EmprCod = new String[] {""} ;
      P01DU2_A2804RecLinMaq = new short[1] ;
      P01DU2_A130BarCodPar = new String[] {""} ;
      P01DU2_A132BarCodReo = new byte[1] ;
      P01DU2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      P01DU3_A396EmprCod = new String[] {""} ;
      P01DU3_A129BarCod = new int[1] ;
      P01DU3_A132BarCodReo = new byte[1] ;
      P01DU3_A130BarCodPar = new String[] {""} ;
      P01DU3_A2804RecLinMaq = new short[1] ;
      P01DU3_A1273RecLinPro = new byte[1] ;
      P01DU3_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      P01DU4_A396EmprCod = new String[] {""} ;
      P01DU4_A129BarCod = new int[1] ;
      P01DU4_A132BarCodReo = new byte[1] ;
      P01DU4_A130BarCodPar = new String[] {""} ;
      P01DU4_A2804RecLinMaq = new short[1] ;
      P01DU4_A1273RecLinPro = new byte[1] ;
      P01DU4_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DU4_A719PrdNum = new String[] {""} ;
      P01DU4_n719PrdNum = new boolean[] {false} ;
      P01DU4_A4024RecMar = new byte[1] ;
      P01DU4_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV19PrdNum = "" ;
      AV20PrdCant = DecimalUtil.ZERO ;
      P01DU7_A396EmprCod = new String[] {""} ;
      P01DU7_A130BarCodPar = new String[] {""} ;
      P01DU7_A132BarCodReo = new byte[1] ;
      P01DU7_A129BarCod = new int[1] ;
      P01DU7_A212BarSer = new String[] {""} ;
      P01DU7_A213BarSit = new byte[1] ;
      P01DU7_A3870BarFecLRe = new java.util.Date[] {GXutil.nullDate()} ;
      A212BarSer = "" ;
      A3870BarFecLRe = GXutil.nullDate() ;
      GXv_int5 = new int[1] ;
      GXv_int1 = new byte[1] ;
      P01DU9_A396EmprCod = new String[] {""} ;
      P01DU9_A688PrdComCod = new String[] {""} ;
      P01DU9_A719PrdNum = new String[] {""} ;
      P01DU9_n719PrdNum = new boolean[] {false} ;
      A688PrdComCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preclva2__default(),
         new Object[] {
             new Object[] {
            P01DU2_A396EmprCod, P01DU2_A2804RecLinMaq, P01DU2_A130BarCodPar, P01DU2_A132BarCodReo, P01DU2_A129BarCod
            }
            , new Object[] {
            P01DU3_A396EmprCod, P01DU3_A129BarCod, P01DU3_A132BarCodReo, P01DU3_A130BarCodPar, P01DU3_A2804RecLinMaq, P01DU3_A1273RecLinPro, P01DU3_A764ProForCod
            }
            , new Object[] {
            P01DU4_A396EmprCod, P01DU4_A129BarCod, P01DU4_A132BarCodReo, P01DU4_A130BarCodPar, P01DU4_A2804RecLinMaq, P01DU4_A1273RecLinPro, P01DU4_A686PrdCant, P01DU4_A719PrdNum, P01DU4_n719PrdNum, P01DU4_A4024RecMar,
            P01DU4_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01DU7_A396EmprCod, P01DU7_A130BarCodPar, P01DU7_A132BarCodReo, P01DU7_A129BarCod, P01DU7_A212BarSer, P01DU7_A213BarSit, P01DU7_A3870BarFecLRe
            }
            , new Object[] {
            }
            , new Object[] {
            P01DU9_A396EmprCod, P01DU9_A688PrdComCod, P01DU9_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV26BarCodReo ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A4024RecMar ;
   private byte A213BarSit ;
   private byte GXv_int1[] ;
   private short AV28RecLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int AV25BarCod ;
   private int A129BarCod ;
   private int GXv_int5[] ;
   private java.math.BigDecimal AV18Flag2 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV20PrdCant ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private String A396EmprCod ;
   private String AV27BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A764ProForCod ;
   private String A719PrdNum ;
   private String AV19PrdNum ;
   private String A212BarSer ;
   private String A688PrdComCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date A3870BarFecLRe ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01DU2_A396EmprCod ;
   private short[] P01DU2_A2804RecLinMaq ;
   private String[] P01DU2_A130BarCodPar ;
   private byte[] P01DU2_A132BarCodReo ;
   private int[] P01DU2_A129BarCod ;
   private String[] P01DU3_A396EmprCod ;
   private int[] P01DU3_A129BarCod ;
   private byte[] P01DU3_A132BarCodReo ;
   private String[] P01DU3_A130BarCodPar ;
   private short[] P01DU3_A2804RecLinMaq ;
   private byte[] P01DU3_A1273RecLinPro ;
   private String[] P01DU3_A764ProForCod ;
   private String[] P01DU4_A396EmprCod ;
   private int[] P01DU4_A129BarCod ;
   private byte[] P01DU4_A132BarCodReo ;
   private String[] P01DU4_A130BarCodPar ;
   private short[] P01DU4_A2804RecLinMaq ;
   private byte[] P01DU4_A1273RecLinPro ;
   private java.math.BigDecimal[] P01DU4_A686PrdCant ;
   private String[] P01DU4_A719PrdNum ;
   private boolean[] P01DU4_n719PrdNum ;
   private byte[] P01DU4_A4024RecMar ;
   private short[] P01DU4_A811RecLin ;
   private String[] P01DU7_A396EmprCod ;
   private String[] P01DU7_A130BarCodPar ;
   private byte[] P01DU7_A132BarCodReo ;
   private int[] P01DU7_A129BarCod ;
   private String[] P01DU7_A212BarSer ;
   private byte[] P01DU7_A213BarSit ;
   private java.util.Date[] P01DU7_A3870BarFecLRe ;
   private String[] P01DU9_A396EmprCod ;
   private String[] P01DU9_A688PrdComCod ;
   private String[] P01DU9_A719PrdNum ;
   private boolean[] P01DU9_n719PrdNum ;
}

final  class preclva2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01DU2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01DU3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, ProForCod FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DU4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, PrdCant, PrdNum, RecMar, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01DU5", "DELETE FROM TXPLRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? and RecLinPro = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECET")
         ,new UpdateCursor("P01DU6", "DELETE FROM TXPCRECET  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECET")
         ,new ForEachCursor("P01DU7", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer, BarSit, BarFecLRe FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01DU8", "UPDATE TXPBARCAD SET BarSit=?, BarFecLRe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P01DU9", "SELECT EmprCod, PrdComCod, PrdNum FROM TXPLPRDCO WHERE (EmprCod = ?) AND (PrdComCod = ?) ORDER BY EmprCod, PrdNum, PrdComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

