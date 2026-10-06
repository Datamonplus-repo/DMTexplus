package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclatmd extends GXProcedure
{
   public pclatmd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclatmd.class ), "" );
   }

   public pclatmd( int remoteHandle ,
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
      pclatmd.this.aP9 = new String[] {""};
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
      pclatmd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclatmd.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclatmd.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclatmd.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclatmd.this.AV116DisCod = aP4[0];
      this.aP4 = aP4;
      pclatmd.this.AV21TotKil = aP5[0];
      this.aP5 = aP5;
      pclatmd.this.AV22PrdDesc = aP6[0];
      this.aP6 = aP6;
      pclatmd.this.AV23Accion = aP7[0];
      this.aP7 = aP7;
      pclatmd.this.AV114Opi = aP8[0];
      this.aP8 = aP8;
      pclatmd.this.AV115Barfactin = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 14, 1) ;
      AV80Ini_5 = GXutil.substring( AV16Clave, 3, 5) ;
      GXv_char1[0] = AV80Ini_5 ;
      GXv_char2[0] = AV83Inip_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char1, GXv_char2) ;
      pclatmd.this.AV80Ini_5 = GXv_char1[0] ;
      pclatmd.this.AV83Inip_5 = GXv_char2[0] ;
      AV82ColIni_5 = CommonUtil.decimalVal( AV83Inip_5, ".") ;
      AV81Fin_5 = GXutil.substring( AV16Clave, 9, 5) ;
      GXv_char2[0] = AV81Fin_5 ;
      GXv_char1[0] = AV90Finp_5 ;
      new app.pcomtop(remoteHandle, context).execute( GXv_char2, GXv_char1) ;
      pclatmd.this.AV81Fin_5 = GXv_char2[0] ;
      pclatmd.this.AV90Finp_5 = GXv_char1[0] ;
      AV84ColFin_5 = CommonUtil.decimalVal( AV90Finp_5, ".") ;
      AV35Familia = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 15, 2))) ;
      AV36TotCol = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P02702 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV116DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P02702_A361DisCod[0] ;
         A335DisArtCod = P02702_A335DisArtCod[0] ;
         A252CliCod = P02702_A252CliCod[0] ;
         A362DisColNom = P02702_A362DisColNom[0] ;
         n362DisColNom = P02702_n362DisColNom[0] ;
         A363DisColNum = P02702_A363DisColNum[0] ;
         n363DisColNum = P02702_n363DisColNum[0] ;
         A390DisTipCol = P02702_A390DisTipCol[0] ;
         n390DisTipCol = P02702_n390DisTipCol[0] ;
         AV79BarSer = A335DisArtCod ;
         AV52CliCod = A252CliCod ;
         AV102BarColNom = A362DisColNom ;
         AV112BarColNum = A363DisColNum ;
         AV113BarTipCol = A390DisTipCol ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = AV52CliCod ;
      GXv_char1[0] = AV79BarSer ;
      GXv_char4[0] = AV102BarColNom ;
      GXv_int5[0] = AV112BarColNum ;
      GXv_int6[0] = AV113BarTipCol ;
      GXv_int7[0] = AV35Familia ;
      GXv_decimal8[0] = AV36TotCol ;
      GXv_int9[0] = AV50FlagCol ;
      new app.pclaesp3(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char1, GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9) ;
      pclatmd.this.A396EmprCod = GXv_char2[0] ;
      pclatmd.this.AV52CliCod = GXv_int3[0] ;
      pclatmd.this.AV79BarSer = GXv_char1[0] ;
      pclatmd.this.AV102BarColNom = GXv_char4[0] ;
      pclatmd.this.AV112BarColNum = GXv_int5[0] ;
      pclatmd.this.AV113BarTipCol = GXv_int6[0] ;
      pclatmd.this.AV35Familia = GXv_int7[0] ;
      pclatmd.this.AV36TotCol = GXv_decimal8[0] ;
      pclatmd.this.AV50FlagCol = GXv_int9[0] ;
      AV88F_ok_sb = httpContext.getMessage( "N", "") ;
      AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV79BarSer))) ;
      AV86Pos_u = GXutil.substring( AV79BarSer, AV85LenVar, 1) ;
      AV89Pos_pu_n = (byte)(AV85LenVar-1) ;
      if ( GXutil.strcmp(AV86Pos_u, httpContext.getMessage( "M", "")) == 0 )
      {
         AV87Pos_pu = GXutil.substring( AV79BarSer, AV89Pos_pu_n, 2) ;
         if ( GXutil.strcmp(AV87Pos_pu, httpContext.getMessage( "NM", "")) == 0 )
         {
            AV88F_ok_sb = httpContext.getMessage( "N", "") ;
         }
         else
         {
            AV88F_ok_sb = httpContext.getMessage( "S", "") ;
         }
      }
      AV75TotCol2 = GXutil.truncDecimal( AV36TotCol, 2) ;
      if ( ! (0==AV50FlagCol) && ( GXutil.strcmp(AV88F_ok_sb, httpContext.getMessage( "S", "")) == 0 ) )
      {
         if ( ( DecimalUtil.compareTo(AV75TotCol2, AV82ColIni_5) >= 0 ) && ( DecimalUtil.compareTo(AV75TotCol2, AV84ColFin_5) <= 0 ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclatmd.this.A396EmprCod;
      this.aP1[0] = pclatmd.this.AV15Descrip;
      this.aP2[0] = pclatmd.this.AV16Clave;
      this.aP3[0] = pclatmd.this.AV17PrdVal;
      this.aP4[0] = pclatmd.this.AV116DisCod;
      this.aP5[0] = pclatmd.this.AV21TotKil;
      this.aP6[0] = pclatmd.this.AV22PrdDesc;
      this.aP7[0] = pclatmd.this.AV23Accion;
      this.aP8[0] = pclatmd.this.AV114Opi;
      this.aP9[0] = pclatmd.this.AV115Barfactin;
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
      P02702_A396EmprCod = new String[] {""} ;
      P02702_A361DisCod = new int[1] ;
      P02702_A335DisArtCod = new String[] {""} ;
      P02702_A252CliCod = new int[1] ;
      P02702_A362DisColNom = new String[] {""} ;
      P02702_n362DisColNom = new boolean[] {false} ;
      P02702_A363DisColNum = new int[1] ;
      P02702_n363DisColNum = new boolean[] {false} ;
      P02702_A390DisTipCol = new byte[1] ;
      P02702_n390DisTipCol = new boolean[] {false} ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV79BarSer = "" ;
      AV102BarColNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new byte[1] ;
      AV88F_ok_sb = "" ;
      AV86Pos_u = "" ;
      AV87Pos_pu = "" ;
      AV75TotCol2 = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclatmd__default(),
         new Object[] {
             new Object[] {
            P02702_A396EmprCod, P02702_A361DisCod, P02702_A335DisArtCod, P02702_A252CliCod, P02702_A362DisColNom, P02702_n362DisColNom, P02702_A363DisColNum, P02702_n363DisColNum, P02702_A390DisTipCol, P02702_n390DisTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV114Opi ;
   private byte AV35Familia ;
   private byte A390DisTipCol ;
   private byte AV113BarTipCol ;
   private byte GXv_int6[] ;
   private byte GXv_int7[] ;
   private byte AV50FlagCol ;
   private byte GXv_int9[] ;
   private byte AV85LenVar ;
   private byte AV89Pos_pu_n ;
   private short Gx_err ;
   private int AV116DisCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int AV52CliCod ;
   private int AV112BarColNum ;
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
   private String AV115Barfactin ;
   private String AV80Ini_5 ;
   private String AV83Inip_5 ;
   private String AV81Fin_5 ;
   private String AV90Finp_5 ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV79BarSer ;
   private String AV102BarColNom ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String AV88F_ok_sb ;
   private String AV86Pos_u ;
   private String AV87Pos_pu ;
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
   private String[] P02702_A396EmprCod ;
   private int[] P02702_A361DisCod ;
   private String[] P02702_A335DisArtCod ;
   private int[] P02702_A252CliCod ;
   private String[] P02702_A362DisColNom ;
   private boolean[] P02702_n362DisColNom ;
   private int[] P02702_A363DisColNum ;
   private boolean[] P02702_n363DisColNum ;
   private byte[] P02702_A390DisTipCol ;
   private boolean[] P02702_n390DisTipCol ;
}

final  class pclatmd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02702", "SELECT EmprCod, DisCod, DisArtCod, CliCod, DisColNom, DisColNum, DisTipCol FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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

