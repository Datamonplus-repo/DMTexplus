package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclait extends GXProcedure
{
   public pclait( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclait.class ), "" );
   }

   public pclait( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             short[] aP10 ,
                             byte[] aP11 )
   {
      pclait.this.aP12 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
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
                        short[] aP10 ,
                        byte[] aP11 ,
                        String[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
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
                             short[] aP10 ,
                             byte[] aP11 ,
                             String[] aP12 )
   {
      pclait.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclait.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclait.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclait.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclait.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclait.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclait.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclait.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclait.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclait.this.AV115Accion = aP9[0];
      this.aP9 = aP9;
      pclait.this.AV66BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclait.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      pclait.this.AV112BarFactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV110F_reccol = (byte)(0) ;
      GXv_int1[0] = AV110F_reccol ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pclait.this.AV110F_reccol = GXv_int1[0] ;
      AV113Fase_nt = (byte)(0) ;
      /* Using cursor P01Q52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV66BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P01Q52_A2804RecLinMaq[0] ;
         A130BarCodPar = P01Q52_A130BarCodPar[0] ;
         A132BarCodReo = P01Q52_A132BarCodReo[0] ;
         A129BarCod = P01Q52_A129BarCod[0] ;
         A5408RecLinCol = P01Q52_A5408RecLinCol[0] ;
         AV113Fase_nt = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV115Accion = GXutil.substring( AV16Clave, 7, 1) ;
      AV50IntCod = (byte)(GXutil.lval( GXutil.substring( AV16Clave, 4, 2))) ;
      AV114Colorteca = GXutil.substring( AV16Clave, 9, 1) ;
      if ( ( ( GXutil.strcmp(AV114Colorteca, httpContext.getMessage( "S", "")) != 0 ) ) && ( ( ( AV110F_reccol == 1 ) && ( AV111Opi == 0 ) ) || ( ( AV110F_reccol == 1 ) && ( AV113Fase_nt == 1 ) ) ) )
      {
         /* Using cursor P01Q53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV66BarLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2804RecLinMaq = P01Q53_A2804RecLinMaq[0] ;
            A130BarCodPar = P01Q53_A130BarCodPar[0] ;
            A132BarCodReo = P01Q53_A132BarCodReo[0] ;
            A129BarCod = P01Q53_A129BarCod[0] ;
            A5412RecIntCol = P01Q53_A5412RecIntCol[0] ;
            n5412RecIntCol = P01Q53_n5412RecIntCol[0] ;
            if ( AV50IntCod == A5412RecIntCol )
            {
               AV17PrdVal = (byte)(1) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P01Q54 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A130BarCodPar = P01Q54_A130BarCodPar[0] ;
            A132BarCodReo = P01Q54_A132BarCodReo[0] ;
            A129BarCod = P01Q54_A129BarCod[0] ;
            A252CliCod = P01Q54_A252CliCod[0] ;
            n252CliCod = P01Q54_n252CliCod[0] ;
            A212BarSer = P01Q54_A212BarSer[0] ;
            A135BarColNom = P01Q54_A135BarColNom[0] ;
            A136BarColNum = P01Q54_A136BarColNum[0] ;
            A218BarTipCol = P01Q54_A218BarTipCol[0] ;
            AV40BarCliCod = A252CliCod ;
            AV45ForSer = A212BarSer ;
            AV46ForColNom = A135BarColNom ;
            AV47ForColNum = A136BarColNum ;
            AV48TipColCod = A218BarTipCol ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Using cursor P01Q55 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV40BarCliCod), AV45ForSer, AV46ForColNom, Integer.valueOf(AV47ForColNum), Byte.valueOf(AV48TipColCod), Byte.valueOf(AV50IntCod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A583IntCod = P01Q55_A583IntCod[0] ;
            A831TipColCod = P01Q55_A831TipColCod[0] ;
            A483ForColNum = P01Q55_A483ForColNum[0] ;
            A482ForColNom = P01Q55_A482ForColNom[0] ;
            A494ForSer = P01Q55_A494ForSer[0] ;
            A252CliCod = P01Q55_A252CliCod[0] ;
            n252CliCod = P01Q55_n252CliCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclait.this.A396EmprCod;
      this.aP1[0] = pclait.this.AV15Descrip;
      this.aP2[0] = pclait.this.AV16Clave;
      this.aP3[0] = pclait.this.AV17PrdVal;
      this.aP4[0] = pclait.this.AV18BarCod;
      this.aP5[0] = pclait.this.AV19BarCodReo;
      this.aP6[0] = pclait.this.AV20BarCodPar;
      this.aP7[0] = pclait.this.AV21TotKil;
      this.aP8[0] = pclait.this.AV22PrdDesc;
      this.aP9[0] = pclait.this.AV115Accion;
      this.aP10[0] = pclait.this.AV66BarLinMaq;
      this.aP11[0] = pclait.this.AV111Opi;
      this.aP12[0] = pclait.this.AV112BarFactin;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P01Q52_A396EmprCod = new String[] {""} ;
      P01Q52_A2804RecLinMaq = new short[1] ;
      P01Q52_A130BarCodPar = new String[] {""} ;
      P01Q52_A132BarCodReo = new byte[1] ;
      P01Q52_A129BarCod = new int[1] ;
      P01Q52_A5408RecLinCol = new short[1] ;
      A130BarCodPar = "" ;
      AV114Colorteca = "" ;
      P01Q53_A396EmprCod = new String[] {""} ;
      P01Q53_A2804RecLinMaq = new short[1] ;
      P01Q53_A130BarCodPar = new String[] {""} ;
      P01Q53_A132BarCodReo = new byte[1] ;
      P01Q53_A129BarCod = new int[1] ;
      P01Q53_A5412RecIntCol = new byte[1] ;
      P01Q53_n5412RecIntCol = new boolean[] {false} ;
      P01Q54_A396EmprCod = new String[] {""} ;
      P01Q54_A130BarCodPar = new String[] {""} ;
      P01Q54_A132BarCodReo = new byte[1] ;
      P01Q54_A129BarCod = new int[1] ;
      P01Q54_A252CliCod = new int[1] ;
      P01Q54_n252CliCod = new boolean[] {false} ;
      P01Q54_A212BarSer = new String[] {""} ;
      P01Q54_A135BarColNom = new String[] {""} ;
      P01Q54_A136BarColNum = new int[1] ;
      P01Q54_A218BarTipCol = new byte[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      AV45ForSer = "" ;
      AV46ForColNom = "" ;
      P01Q55_A396EmprCod = new String[] {""} ;
      P01Q55_A583IntCod = new byte[1] ;
      P01Q55_A831TipColCod = new byte[1] ;
      P01Q55_A483ForColNum = new int[1] ;
      P01Q55_A482ForColNom = new String[] {""} ;
      P01Q55_A494ForSer = new String[] {""} ;
      P01Q55_A252CliCod = new int[1] ;
      P01Q55_n252CliCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclait__default(),
         new Object[] {
             new Object[] {
            P01Q52_A396EmprCod, P01Q52_A2804RecLinMaq, P01Q52_A130BarCodPar, P01Q52_A132BarCodReo, P01Q52_A129BarCod, P01Q52_A5408RecLinCol
            }
            , new Object[] {
            P01Q53_A396EmprCod, P01Q53_A2804RecLinMaq, P01Q53_A130BarCodPar, P01Q53_A132BarCodReo, P01Q53_A129BarCod, P01Q53_A5412RecIntCol, P01Q53_n5412RecIntCol
            }
            , new Object[] {
            P01Q54_A396EmprCod, P01Q54_A130BarCodPar, P01Q54_A132BarCodReo, P01Q54_A129BarCod, P01Q54_A252CliCod, P01Q54_n252CliCod, P01Q54_A212BarSer, P01Q54_A135BarColNom, P01Q54_A136BarColNum, P01Q54_A218BarTipCol
            }
            , new Object[] {
            P01Q55_A396EmprCod, P01Q55_A583IntCod, P01Q55_A831TipColCod, P01Q55_A483ForColNum, P01Q55_A482ForColNom, P01Q55_A494ForSer, P01Q55_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte AV110F_reccol ;
   private byte GXv_int1[] ;
   private byte AV113Fase_nt ;
   private byte A132BarCodReo ;
   private byte AV50IntCod ;
   private byte A5412RecIntCol ;
   private byte A218BarTipCol ;
   private byte AV48TipColCod ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private short AV66BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A5408RecLinCol ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV40BarCliCod ;
   private int AV47ForColNum ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV115Accion ;
   private String AV112BarFactin ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String AV114Colorteca ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String AV45ForSer ;
   private String AV46ForColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n5412RecIntCol ;
   private boolean n252CliCod ;
   private String[] aP12 ;
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
   private short[] aP10 ;
   private byte[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Q52_A396EmprCod ;
   private short[] P01Q52_A2804RecLinMaq ;
   private String[] P01Q52_A130BarCodPar ;
   private byte[] P01Q52_A132BarCodReo ;
   private int[] P01Q52_A129BarCod ;
   private short[] P01Q52_A5408RecLinCol ;
   private String[] P01Q53_A396EmprCod ;
   private short[] P01Q53_A2804RecLinMaq ;
   private String[] P01Q53_A130BarCodPar ;
   private byte[] P01Q53_A132BarCodReo ;
   private int[] P01Q53_A129BarCod ;
   private byte[] P01Q53_A5412RecIntCol ;
   private boolean[] P01Q53_n5412RecIntCol ;
   private String[] P01Q54_A396EmprCod ;
   private String[] P01Q54_A130BarCodPar ;
   private byte[] P01Q54_A132BarCodReo ;
   private int[] P01Q54_A129BarCod ;
   private int[] P01Q54_A252CliCod ;
   private boolean[] P01Q54_n252CliCod ;
   private String[] P01Q54_A212BarSer ;
   private String[] P01Q54_A135BarColNom ;
   private int[] P01Q54_A136BarColNum ;
   private byte[] P01Q54_A218BarTipCol ;
   private String[] P01Q55_A396EmprCod ;
   private byte[] P01Q55_A583IntCod ;
   private byte[] P01Q55_A831TipColCod ;
   private int[] P01Q55_A483ForColNum ;
   private String[] P01Q55_A482ForColNom ;
   private String[] P01Q55_A494ForSer ;
   private int[] P01Q55_A252CliCod ;
   private boolean[] P01Q55_n252CliCod ;
}

final  class pclait__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Q52", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecLinCol FROM TXPRECCOL WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01Q53", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, RecIntCol FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q54", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01Q55", "SELECT EmprCod, IntCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE (EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ?) AND (IntCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

