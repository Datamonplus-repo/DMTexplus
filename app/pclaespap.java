package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaespap extends GXProcedure
{
   public pclaespap( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaespap.class ), "" );
   }

   public pclaespap( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            int[] aP4 ,
                            byte[] aP5 ,
                            String[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            String[] aP8 ,
                            String[] aP9 )
   {
      pclaespap.this.aP10 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        short[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 )
   {
      pclaespap.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaespap.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaespap.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaespap.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaespap.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaespap.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaespap.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaespap.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaespap.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaespap.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaespap.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV130ClaveC ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int2) ;
      pclaespap.this.GXt_int1 = GXv_int2[0] ;
      AV130ClaveC = GXt_int1 ;
      AV24Opcion = GXutil.substring( AV16Clave, 1, 2) ;
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV121PrdNum = GXutil.substring( AV16Clave, 4, 6) ;
      /* Using cursor P03DX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P03DX2_A2804RecLinMaq[0] ;
         A130BarCodPar = P03DX2_A130BarCodPar[0] ;
         A132BarCodReo = P03DX2_A132BarCodReo[0] ;
         A129BarCod = P03DX2_A129BarCod[0] ;
         A252CliCod = P03DX2_A252CliCod[0] ;
         n252CliCod = P03DX2_n252CliCod[0] ;
         A212BarSer = P03DX2_A212BarSer[0] ;
         A135BarColNom = P03DX2_A135BarColNom[0] ;
         A136BarColNum = P03DX2_A136BarColNum[0] ;
         A218BarTipCol = P03DX2_A218BarTipCol[0] ;
         A719PrdNum = P03DX2_A719PrdNum[0] ;
         n719PrdNum = P03DX2_n719PrdNum[0] ;
         A811RecLin = P03DX2_A811RecLin[0] ;
         A1273RecLinPro = P03DX2_A1273RecLinPro[0] ;
         A252CliCod = P03DX2_A252CliCod[0] ;
         n252CliCod = P03DX2_n252CliCod[0] ;
         A212BarSer = P03DX2_A212BarSer[0] ;
         A135BarColNom = P03DX2_A135BarColNom[0] ;
         A136BarColNum = P03DX2_A136BarColNum[0] ;
         A218BarTipCol = P03DX2_A218BarTipCol[0] ;
         AV52CliCod = A252CliCod ;
         AV46ForSer = A212BarSer ;
         AV47ForColNom = A135BarColNom ;
         AV48ForColNum = A136BarColNum ;
         AV49TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(GXutil.substring( AV121PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( AV121PrdNum, 1, 1), "7") <= 0 ) )
         {
            /* Execute user subroutine: 'LDFORM' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV134Ok_p, httpContext.getMessage( "S", "")) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
            }
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( GXutil.strcmp(GXutil.substring( AV121PrdNum, 1, 1), "8") >= 0 ) && ( GXutil.strcmp(GXutil.substring( AV121PrdNum, 1, 1), "9") <= 0 ) )
         {
            /* Execute user subroutine: 'LPRFOR' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV134Ok_p, httpContext.getMessage( "S", "")) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A719PrdNum, AV121PrdNum) == 0 )
            {
               AV17PrdVal = (byte)(1) ;
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV94ForNumCol = 0 ;
      /* Using cursor P03DX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV46ForSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A831TipColCod = P03DX3_A831TipColCod[0] ;
         A483ForColNum = P03DX3_A483ForColNum[0] ;
         A482ForColNom = P03DX3_A482ForColNom[0] ;
         A494ForSer = P03DX3_A494ForSer[0] ;
         A252CliCod = P03DX3_A252CliCod[0] ;
         n252CliCod = P03DX3_n252CliCod[0] ;
         A486ForNumCol = P03DX3_A486ForNumCol[0] ;
         AV94ForNumCol = A486ForNumCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'LDFORM' Routine */
      returnInSub = false ;
      AV134Ok_p = httpContext.getMessage( "N", "") ;
      /* Using cursor P03DX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV94ForNumCol)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = P03DX4_A486ForNumCol[0] ;
         A719PrdNum = P03DX4_A719PrdNum[0] ;
         n719PrdNum = P03DX4_n719PrdNum[0] ;
         A309ColLin = P03DX4_A309ColLin[0] ;
         if ( GXutil.strcmp(A719PrdNum, AV121PrdNum) == 0 )
         {
            AV134Ok_p = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'LPRFOR' Routine */
      returnInSub = false ;
      AV134Ok_p = httpContext.getMessage( "N", "") ;
      /* Using cursor P03DX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV94ForNumCol)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A486ForNumCol = P03DX5_A486ForNumCol[0] ;
         A719PrdNum = P03DX5_A719PrdNum[0] ;
         n719PrdNum = P03DX5_n719PrdNum[0] ;
         A715PrdLin = P03DX5_A715PrdLin[0] ;
         if ( GXutil.strcmp(A719PrdNum, AV121PrdNum) == 0 )
         {
            AV134Ok_p = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaespap.this.A396EmprCod;
      this.aP1[0] = pclaespap.this.AV15Descrip;
      this.aP2[0] = pclaespap.this.AV16Clave;
      this.aP3[0] = pclaespap.this.AV17PrdVal;
      this.aP4[0] = pclaespap.this.AV18BarCod;
      this.aP5[0] = pclaespap.this.AV19BarCodReo;
      this.aP6[0] = pclaespap.this.AV20BarCodPar;
      this.aP7[0] = pclaespap.this.AV21TotKil;
      this.aP8[0] = pclaespap.this.AV22PrdDesc;
      this.aP9[0] = pclaespap.this.AV23Accion;
      this.aP10[0] = pclaespap.this.AV67BarLinMaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      AV24Opcion = "" ;
      AV121PrdNum = "" ;
      scmdbuf = "" ;
      P03DX2_A396EmprCod = new String[] {""} ;
      P03DX2_A2804RecLinMaq = new short[1] ;
      P03DX2_A130BarCodPar = new String[] {""} ;
      P03DX2_A132BarCodReo = new byte[1] ;
      P03DX2_A129BarCod = new int[1] ;
      P03DX2_A252CliCod = new int[1] ;
      P03DX2_n252CliCod = new boolean[] {false} ;
      P03DX2_A212BarSer = new String[] {""} ;
      P03DX2_A135BarColNom = new String[] {""} ;
      P03DX2_A136BarColNum = new int[1] ;
      P03DX2_A218BarTipCol = new byte[1] ;
      P03DX2_A719PrdNum = new String[] {""} ;
      P03DX2_n719PrdNum = new boolean[] {false} ;
      P03DX2_A811RecLin = new short[1] ;
      P03DX2_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A719PrdNum = "" ;
      AV46ForSer = "" ;
      AV47ForColNom = "" ;
      AV134Ok_p = "" ;
      P03DX3_A396EmprCod = new String[] {""} ;
      P03DX3_A831TipColCod = new byte[1] ;
      P03DX3_A483ForColNum = new int[1] ;
      P03DX3_A482ForColNom = new String[] {""} ;
      P03DX3_A494ForSer = new String[] {""} ;
      P03DX3_A252CliCod = new int[1] ;
      P03DX3_n252CliCod = new boolean[] {false} ;
      P03DX3_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      P03DX4_A396EmprCod = new String[] {""} ;
      P03DX4_A486ForNumCol = new int[1] ;
      P03DX4_A719PrdNum = new String[] {""} ;
      P03DX4_n719PrdNum = new boolean[] {false} ;
      P03DX4_A309ColLin = new short[1] ;
      P03DX5_A396EmprCod = new String[] {""} ;
      P03DX5_A486ForNumCol = new int[1] ;
      P03DX5_A719PrdNum = new String[] {""} ;
      P03DX5_n719PrdNum = new boolean[] {false} ;
      P03DX5_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaespap__default(),
         new Object[] {
             new Object[] {
            P03DX2_A396EmprCod, P03DX2_A2804RecLinMaq, P03DX2_A130BarCodPar, P03DX2_A132BarCodReo, P03DX2_A129BarCod, P03DX2_A252CliCod, P03DX2_n252CliCod, P03DX2_A212BarSer, P03DX2_A135BarColNom, P03DX2_A136BarColNum,
            P03DX2_A218BarTipCol, P03DX2_A719PrdNum, P03DX2_n719PrdNum, P03DX2_A811RecLin, P03DX2_A1273RecLinPro
            }
            , new Object[] {
            P03DX3_A396EmprCod, P03DX3_A831TipColCod, P03DX3_A483ForColNum, P03DX3_A482ForColNom, P03DX3_A494ForSer, P03DX3_A252CliCod, P03DX3_A486ForNumCol
            }
            , new Object[] {
            P03DX4_A396EmprCod, P03DX4_A486ForNumCol, P03DX4_A719PrdNum, P03DX4_A309ColLin
            }
            , new Object[] {
            P03DX5_A396EmprCod, P03DX5_A486ForNumCol, P03DX5_A719PrdNum, P03DX5_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV130ClaveC ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A1273RecLinPro ;
   private byte AV49TipColCod ;
   private byte A831TipColCod ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short A309ColLin ;
   private short A715PrdLin ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV52CliCod ;
   private int AV48ForColNum ;
   private int AV94ForNumCol ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV24Opcion ;
   private String AV121PrdNum ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A719PrdNum ;
   private String AV46ForSer ;
   private String AV47ForColNom ;
   private String AV134Ok_p ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n252CliCod ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private short[] aP10 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P03DX2_A396EmprCod ;
   private short[] P03DX2_A2804RecLinMaq ;
   private String[] P03DX2_A130BarCodPar ;
   private byte[] P03DX2_A132BarCodReo ;
   private int[] P03DX2_A129BarCod ;
   private int[] P03DX2_A252CliCod ;
   private boolean[] P03DX2_n252CliCod ;
   private String[] P03DX2_A212BarSer ;
   private String[] P03DX2_A135BarColNom ;
   private int[] P03DX2_A136BarColNum ;
   private byte[] P03DX2_A218BarTipCol ;
   private String[] P03DX2_A719PrdNum ;
   private boolean[] P03DX2_n719PrdNum ;
   private short[] P03DX2_A811RecLin ;
   private byte[] P03DX2_A1273RecLinPro ;
   private String[] P03DX3_A396EmprCod ;
   private byte[] P03DX3_A831TipColCod ;
   private int[] P03DX3_A483ForColNum ;
   private String[] P03DX3_A482ForColNom ;
   private String[] P03DX3_A494ForSer ;
   private int[] P03DX3_A252CliCod ;
   private boolean[] P03DX3_n252CliCod ;
   private int[] P03DX3_A486ForNumCol ;
   private String[] P03DX4_A396EmprCod ;
   private int[] P03DX4_A486ForNumCol ;
   private String[] P03DX4_A719PrdNum ;
   private boolean[] P03DX4_n719PrdNum ;
   private short[] P03DX4_A309ColLin ;
   private String[] P03DX5_A396EmprCod ;
   private int[] P03DX5_A486ForNumCol ;
   private String[] P03DX5_A719PrdNum ;
   private boolean[] P03DX5_n719PrdNum ;
   private short[] P03DX5_A715PrdLin ;
}

final  class pclaespap__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03DX2", "SELECT T1.EmprCod, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.CliCod, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T1.PrdNum, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DX3", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03DX4", "SELECT EmprCod, ForNumCol, PrdNum, ColLin FROM TXPLDFORM WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, ColLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03DX5", "SELECT EmprCod, ForNumCol, PrdNum, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol, PrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

