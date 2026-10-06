package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac5d extends GXProcedure
{
   public pclac5d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac5d.class ), "" );
   }

   public pclac5d( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 )
   {
      pclac5d.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      pclac5d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac5d.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac5d.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac5d.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac5d.this.AV114Discod = aP4[0];
      this.aP4 = aP4;
      pclac5d.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclac5d.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclac5d.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclac5d.this.AV112Opi = aP8[0];
      this.aP8 = aP8;
      pclac5d.this.AV113Barfactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 28, 1) ;
      AV31Matiz = (short)(GXutil.lval( GXutil.substring( AV16Clave, 4, 3))) ;
      AV29TipArt = (short)(GXutil.lval( GXutil.substring( AV16Clave, 8, 4))) ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 13, 2))) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 16, 5) ;
      GXv_char1[0] = AV80Ini_5 ;
      GXv_char2[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      pclac5d.this.AV80Ini_5 = GXv_char1[0] ;
      pclac5d.this.AV83Inip_5 = GXv_char2[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 12, 5) ;
      GXv_char2[0] = AV81Fin_5 ;
      GXv_char1[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
      pclac5d.this.AV81Fin_5 = GXv_char2[0] ;
      pclac5d.this.AV90Finp_5 = GXv_char1[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P026N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV114Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026N2_A361DisCod[0] ;
         A252CliCod = P026N2_A252CliCod[0] ;
         A335DisArtCod = P026N2_A335DisArtCod[0] ;
         A362DisColNom = P026N2_A362DisColNom[0] ;
         n362DisColNom = P026N2_n362DisColNom[0] ;
         A363DisColNum = P026N2_A363DisColNum[0] ;
         n363DisColNum = P026N2_n363DisColNum[0] ;
         A390DisTipCol = P026N2_A390DisTipCol[0] ;
         n390DisTipCol = P026N2_n390DisTipCol[0] ;
         A352DisArtTip = P026N2_A352DisArtTip[0] ;
         A5252DisAcc = P026N2_A5252DisAcc[0] ;
         AV52CliCod = A252CliCod ;
         AV79BarSer = A335DisArtCod ;
         AV47ForColNom = A362DisColNom ;
         AV48ForColNum = A363DisColNum ;
         AV49TipColCod = A390DisTipCol ;
         AV106BarTipArt = A352DisArtTip ;
         AV97BarAcc = A5252DisAcc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV52CliCod ;
      GXv_char1[0] = AV79BarSer ;
      GXv_char4[0] = AV47ForColNom ;
      GXv_int5[0] = AV48ForColNum ;
      GXv_int6[0] = AV49TipColCod ;
      GXv_int7[0] = AV35Familia ;
      GXv_decimal8[0] = AV36TotCol ;
      GXv_int9[0] = AV50FlagCol ;
      new app.pclaesp3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9) ;
      pclac5d.this.A396EmprCod = GXv_char2[0] ;
      pclac5d.this.AV52CliCod = GXv_int3[0] ;
      pclac5d.this.AV79BarSer = GXv_char1[0] ;
      pclac5d.this.AV47ForColNom = GXv_char4[0] ;
      pclac5d.this.AV48ForColNum = GXv_int5[0] ;
      pclac5d.this.AV49TipColCod = GXv_int6[0] ;
      pclac5d.this.AV35Familia = GXv_int7[0] ;
      pclac5d.this.AV36TotCol = GXv_decimal8[0] ;
      pclac5d.this.AV50FlagCol = GXv_int9[0] ;
      /* Execute user subroutine: 'MATIZ' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) && ( AV98Ok_matiz == 1 ) && ( AV29TipArt == AV106BarTipArt ) && ( GXutil.strcmp(AV97BarAcc, httpContext.getMessage( "S", "")) == 0 ) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'MATIZ' Routine */
      returnInSub = false ;
      AV98Ok_matiz = (byte)(0) ;
      /* Using cursor P026N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV52CliCod), AV79BarSer, AV47ForColNom, Integer.valueOf(AV48ForColNum), Byte.valueOf(AV49TipColCod), Short.valueOf(AV31Matiz)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A626MatCod = P026N3_A626MatCod[0] ;
         A831TipColCod = P026N3_A831TipColCod[0] ;
         A483ForColNum = P026N3_A483ForColNum[0] ;
         A482ForColNom = P026N3_A482ForColNom[0] ;
         A494ForSer = P026N3_A494ForSer[0] ;
         A252CliCod = P026N3_A252CliCod[0] ;
         AV98Ok_matiz = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac5d.this.A396EmprCod;
      this.aP1[0] = pclac5d.this.AV15Descrip;
      this.aP2[0] = pclac5d.this.AV16Clave;
      this.aP3[0] = pclac5d.this.AV17PrdVal;
      this.aP4[0] = pclac5d.this.AV114Discod;
      this.aP5[0] = pclac5d.this.AV21TotKil;
      this.aP6[0] = pclac5d.this.AV22PrdDesc;
      this.aP7[0] = pclac5d.this.AV23Accion;
      this.aP8[0] = pclac5d.this.AV112Opi;
      this.aP9[0] = pclac5d.this.AV113Barfactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV80Ini_5 = "" ;
      AV83Inip_5 = "" ;
      AV82ColIni_5 = DecimalUtil.ZERO ;
      AV81Fin_5 = "" ;
      AV90Finp_5 = "" ;
      AV84ColFin_5 = DecimalUtil.ZERO ;
      AV36TotCol = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P026N2_A396EmprCod = new String[] {""} ;
      P026N2_A361DisCod = new int[1] ;
      P026N2_A252CliCod = new int[1] ;
      P026N2_A335DisArtCod = new String[] {""} ;
      P026N2_A362DisColNom = new String[] {""} ;
      P026N2_n362DisColNom = new boolean[] {false} ;
      P026N2_A363DisColNum = new int[1] ;
      P026N2_n363DisColNum = new boolean[] {false} ;
      P026N2_A390DisTipCol = new byte[1] ;
      P026N2_n390DisTipCol = new boolean[] {false} ;
      P026N2_A352DisArtTip = new short[1] ;
      P026N2_A5252DisAcc = new String[] {""} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      A5252DisAcc = "" ;
      AV79BarSer = "" ;
      AV47ForColNom = "" ;
      AV97BarAcc = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new byte[1] ;
      AV75TotCol2 = DecimalUtil.ZERO ;
      P026N3_A396EmprCod = new String[] {""} ;
      P026N3_A626MatCod = new short[1] ;
      P026N3_A831TipColCod = new byte[1] ;
      P026N3_A483ForColNum = new int[1] ;
      P026N3_A482ForColNom = new String[] {""} ;
      P026N3_A494ForSer = new String[] {""} ;
      P026N3_A252CliCod = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac5d__default(),
         new Object[] {
             new Object[] {
            P026N2_A396EmprCod, P026N2_A361DisCod, P026N2_A252CliCod, P026N2_A335DisArtCod, P026N2_A362DisColNom, P026N2_n362DisColNom, P026N2_A363DisColNum, P026N2_n363DisColNum, P026N2_A390DisTipCol, P026N2_n390DisTipCol,
            P026N2_A352DisArtTip, P026N2_A5252DisAcc
            }
            , new Object[] {
            P026N3_A396EmprCod, P026N3_A626MatCod, P026N3_A831TipColCod, P026N3_A483ForColNum, P026N3_A482ForColNom, P026N3_A494ForSer, P026N3_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV112Opi ;
   private byte AV35Familia ;
   private byte A390DisTipCol ;
   private byte AV49TipColCod ;
   private byte GXv_int6[] ;
   private byte GXv_int7[] ;
   private byte AV50FlagCol ;
   private byte GXv_int9[] ;
   private byte AV98Ok_matiz ;
   private byte A831TipColCod ;
   private short AV31Matiz ;
   private short AV29TipArt ;
   private short A352DisArtTip ;
   private short AV106BarTipArt ;
   private short A626MatCod ;
   private short Gx_err ;
   private int AV114Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV52CliCod ;
   private int AV48ForColNum ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV21TotKil ;
   private java.math.BigDecimal AV82ColIni_5 ;
   private java.math.BigDecimal AV84ColFin_5 ;
   private java.math.BigDecimal AV36TotCol ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV75TotCol2 ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV113Barfactin ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String A5252DisAcc ;
   private String AV79BarSer ;
   private String AV47ForColNom ;
   private String AV97BarAcc ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean returnInSub ;
   private String[] aP9 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P026N2_A396EmprCod ;
   private int[] P026N2_A361DisCod ;
   private int[] P026N2_A252CliCod ;
   private String[] P026N2_A335DisArtCod ;
   private String[] P026N2_A362DisColNom ;
   private boolean[] P026N2_n362DisColNom ;
   private int[] P026N2_A363DisColNum ;
   private boolean[] P026N2_n363DisColNum ;
   private byte[] P026N2_A390DisTipCol ;
   private boolean[] P026N2_n390DisTipCol ;
   private short[] P026N2_A352DisArtTip ;
   private String[] P026N2_A5252DisAcc ;
   private String[] P026N3_A396EmprCod ;
   private short[] P026N3_A626MatCod ;
   private byte[] P026N3_A831TipColCod ;
   private int[] P026N3_A483ForColNum ;
   private String[] P026N3_A482ForColNom ;
   private String[] P026N3_A494ForSer ;
   private int[] P026N3_A252CliCod ;
}

final  class pclac5d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026N2", "SELECT EmprCod, DisCod, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol, DisArtTip, DisAcc FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P026N3", "SELECT EmprCod, MatCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (MatCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

