package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac9d extends GXProcedure
{
   public pclac9d( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac9d.class ), "" );
   }

   public pclac9d( int remoteHandle ,
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
      pclac9d.this.aP9 = new String[] {""};
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
      pclac9d.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac9d.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac9d.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac9d.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac9d.this.AV115Discod = aP4[0];
      this.aP4 = aP4;
      pclac9d.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclac9d.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclac9d.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclac9d.this.AV113Opi = aP8[0];
      this.aP8 = aP8;
      pclac9d.this.AV114Barfactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 21, 1) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 4, 5) ;
      GXv_char1[0] = AV80Ini_5 ;
      GXv_char2[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      pclac9d.this.AV80Ini_5 = GXv_char1[0] ;
      pclac9d.this.AV83Inip_5 = GXv_char2[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 10, 5) ;
      GXv_char2[0] = AV81Fin_5 ;
      GXv_char1[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
      pclac9d.this.AV81Fin_5 = GXv_char2[0] ;
      pclac9d.this.AV90Finp_5 = GXv_char1[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 22, 2))) ;
      AV112TipArtCod = (short)(GXutil.lval( GXutil.substring( AV16Clave, 16, 4))) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P026R2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV115Discod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P026R2_A361DisCod[0] ;
         A352DisArtTip = P026R2_A352DisArtTip[0] ;
         A252CliCod = P026R2_A252CliCod[0] ;
         A335DisArtCod = P026R2_A335DisArtCod[0] ;
         A362DisColNom = P026R2_A362DisColNom[0] ;
         n362DisColNom = P026R2_n362DisColNom[0] ;
         A363DisColNum = P026R2_A363DisColNum[0] ;
         n363DisColNum = P026R2_n363DisColNum[0] ;
         A390DisTipCol = P026R2_A390DisTipCol[0] ;
         n390DisTipCol = P026R2_n390DisTipCol[0] ;
         AV29TipArt = A352DisArtTip ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char1[0] = A335DisArtCod ;
         GXv_char4[0] = A362DisColNom ;
         GXv_int5[0] = A363DisColNum ;
         GXv_int6[0] = A390DisTipCol ;
         GXv_int7[0] = AV35Familia ;
         GXv_decimal8[0] = AV36TotCol ;
         GXv_int9[0] = AV50FlagCol ;
         new app.pclaesp3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9) ;
         pclac9d.this.A396EmprCod = GXv_char2[0] ;
         pclac9d.this.A252CliCod = GXv_int3[0] ;
         pclac9d.this.A335DisArtCod = GXv_char1[0] ;
         pclac9d.this.A362DisColNom = GXv_char4[0] ;
         pclac9d.this.A363DisColNum = GXv_int5[0] ;
         pclac9d.this.A390DisTipCol = GXv_int6[0] ;
         pclac9d.this.AV35Familia = GXv_int7[0] ;
         pclac9d.this.AV36TotCol = GXv_decimal8[0] ;
         pclac9d.this.AV50FlagCol = GXv_int9[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) && ( AV112TipArtCod == AV29TipArt ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclac9d.this.A396EmprCod;
      this.aP1[0] = pclac9d.this.AV15Descrip;
      this.aP2[0] = pclac9d.this.AV16Clave;
      this.aP3[0] = pclac9d.this.AV17PrdVal;
      this.aP4[0] = pclac9d.this.AV115Discod;
      this.aP5[0] = pclac9d.this.AV21TotKil;
      this.aP6[0] = pclac9d.this.AV22PrdDesc;
      this.aP7[0] = pclac9d.this.AV23Accion;
      this.aP8[0] = pclac9d.this.AV113Opi;
      this.aP9[0] = pclac9d.this.AV114Barfactin;
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
      P026R2_A396EmprCod = new String[] {""} ;
      P026R2_A361DisCod = new int[1] ;
      P026R2_A352DisArtTip = new short[1] ;
      P026R2_A252CliCod = new int[1] ;
      P026R2_A335DisArtCod = new String[] {""} ;
      P026R2_A362DisColNom = new String[] {""} ;
      P026R2_n362DisColNom = new boolean[] {false} ;
      P026R2_A363DisColNum = new int[1] ;
      P026R2_n363DisColNum = new boolean[] {false} ;
      P026R2_A390DisTipCol = new byte[1] ;
      P026R2_n390DisTipCol = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac9d__default(),
         new Object[] {
             new Object[] {
            P026R2_A396EmprCod, P026R2_A361DisCod, P026R2_A352DisArtTip, P026R2_A252CliCod, P026R2_A335DisArtCod, P026R2_A362DisColNom, P026R2_n362DisColNom, P026R2_A363DisColNum, P026R2_n363DisColNum, P026R2_A390DisTipCol,
            P026R2_n390DisTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV113Opi ;
   private byte AV35Familia ;
   private byte A390DisTipCol ;
   private byte GXv_int6[] ;
   private byte GXv_int7[] ;
   private byte AV50FlagCol ;
   private byte GXv_int9[] ;
   private short AV112TipArtCod ;
   private short A352DisArtTip ;
   private short AV29TipArt ;
   private short Gx_err ;
   private int AV115Discod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int GXv_int3[] ;
   private int GXv_int5[] ;
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
   private String AV114Barfactin ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
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
   private String[] P026R2_A396EmprCod ;
   private int[] P026R2_A361DisCod ;
   private short[] P026R2_A352DisArtTip ;
   private int[] P026R2_A252CliCod ;
   private String[] P026R2_A335DisArtCod ;
   private String[] P026R2_A362DisColNom ;
   private boolean[] P026R2_n362DisColNom ;
   private int[] P026R2_A363DisColNum ;
   private boolean[] P026R2_n363DisColNum ;
   private byte[] P026R2_A390DisTipCol ;
   private boolean[] P026R2_n390DisTipCol ;
}

final  class pclac9d__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P026R2", "SELECT EmprCod, DisCod, DisArtTip, CliCod, DisArtCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
      }
   }

}

