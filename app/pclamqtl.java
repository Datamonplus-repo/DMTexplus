package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamqtl extends GXProcedure
{
   public pclamqtl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamqtl.class ), "" );
   }

   public pclamqtl( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
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
      pclamqtl.this.aP11 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
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
                        byte[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
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
                             byte[] aP11 )
   {
      pclamqtl.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamqtl.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclamqtl.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclamqtl.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamqtl.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclamqtl.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamqtl.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamqtl.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclamqtl.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclamqtl.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclamqtl.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclamqtl.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV30CodMaq = GXutil.substring( AV16Clave, 4, 6) ;
      AV93Length = (byte)(GXutil.len( GXutil.trim( AV30CodMaq))) ;
      /* Using cursor P02712 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02712_A130BarCodPar[0] ;
         A132BarCodReo = P02712_A132BarCodReo[0] ;
         A129BarCod = P02712_A129BarCod[0] ;
         A2010BarTipDis = P02712_A2010BarTipDis[0] ;
         AV112TipDis = A2010BarTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV112TipDis, httpContext.getMessage( "T", "")) == 0 )
      {
         /* Using cursor P02713 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq), Byte.valueOf(AV93Length), AV30CodMaq});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A602MaqCod = P02713_A602MaqCod[0] ;
            A2804RecLinMaq = P02713_A2804RecLinMaq[0] ;
            A130BarCodPar = P02713_A130BarCodPar[0] ;
            A132BarCodReo = P02713_A132BarCodReo[0] ;
            A129BarCod = P02713_A129BarCod[0] ;
            AV17PrdVal = (byte)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P02714 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Byte.valueOf(AV93Length), AV30CodMaq});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A603MaqCodBis = P02714_A603MaqCodBis[0] ;
            A130BarCodPar = P02714_A130BarCodPar[0] ;
            A132BarCodReo = P02714_A132BarCodReo[0] ;
            A129BarCod = P02714_A129BarCod[0] ;
            A194BarOrdLin = P02714_A194BarOrdLin[0] ;
            A758ProCod = P02714_A758ProCod[0] ;
            AV17PrdVal = (byte)(1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamqtl.this.A396EmprCod;
      this.aP1[0] = pclamqtl.this.AV15Descrip;
      this.aP2[0] = pclamqtl.this.AV16Clave;
      this.aP3[0] = pclamqtl.this.AV17PrdVal;
      this.aP4[0] = pclamqtl.this.AV18BarCod;
      this.aP5[0] = pclamqtl.this.AV19BarCodReo;
      this.aP6[0] = pclamqtl.this.AV20BarCodPar;
      this.aP7[0] = pclamqtl.this.AV21TotKil;
      this.aP8[0] = pclamqtl.this.AV22PrdDesc;
      this.aP9[0] = pclamqtl.this.AV23Accion;
      this.aP10[0] = pclamqtl.this.AV67BarLinMaq;
      this.aP11[0] = pclamqtl.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30CodMaq = "" ;
      scmdbuf = "" ;
      P02712_A396EmprCod = new String[] {""} ;
      P02712_A130BarCodPar = new String[] {""} ;
      P02712_A132BarCodReo = new byte[1] ;
      P02712_A129BarCod = new int[1] ;
      P02712_A2010BarTipDis = new String[] {""} ;
      A130BarCodPar = "" ;
      A2010BarTipDis = "" ;
      AV112TipDis = "" ;
      P02713_A396EmprCod = new String[] {""} ;
      P02713_A602MaqCod = new String[] {""} ;
      P02713_A2804RecLinMaq = new short[1] ;
      P02713_A130BarCodPar = new String[] {""} ;
      P02713_A132BarCodReo = new byte[1] ;
      P02713_A129BarCod = new int[1] ;
      A602MaqCod = "" ;
      P02714_A396EmprCod = new String[] {""} ;
      P02714_A603MaqCodBis = new String[] {""} ;
      P02714_A130BarCodPar = new String[] {""} ;
      P02714_A132BarCodReo = new byte[1] ;
      P02714_A129BarCod = new int[1] ;
      P02714_A194BarOrdLin = new short[1] ;
      P02714_A758ProCod = new String[] {""} ;
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamqtl__default(),
         new Object[] {
             new Object[] {
            P02712_A396EmprCod, P02712_A130BarCodPar, P02712_A132BarCodReo, P02712_A129BarCod, P02712_A2010BarTipDis
            }
            , new Object[] {
            P02713_A396EmprCod, P02713_A602MaqCod, P02713_A2804RecLinMaq, P02713_A130BarCodPar, P02713_A132BarCodReo, P02713_A129BarCod
            }
            , new Object[] {
            P02714_A396EmprCod, P02714_A603MaqCodBis, P02714_A130BarCodPar, P02714_A132BarCodReo, P02714_A129BarCod, P02714_A194BarOrdLin, P02714_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte AV93Length ;
   private byte A132BarCodReo ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV18BarCod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV21TotKil ;
   private String A396EmprCod ;
   private String AV15Descrip ;
   private String AV16Clave ;
   private String AV20BarCodPar ;
   private String AV22PrdDesc ;
   private String AV23Accion ;
   private String AV30CodMaq ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A2010BarTipDis ;
   private String AV112TipDis ;
   private String A602MaqCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private byte[] aP11 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P02712_A396EmprCod ;
   private String[] P02712_A130BarCodPar ;
   private byte[] P02712_A132BarCodReo ;
   private int[] P02712_A129BarCod ;
   private String[] P02712_A2010BarTipDis ;
   private String[] P02713_A396EmprCod ;
   private String[] P02713_A602MaqCod ;
   private short[] P02713_A2804RecLinMaq ;
   private String[] P02713_A130BarCodPar ;
   private byte[] P02713_A132BarCodReo ;
   private int[] P02713_A129BarCod ;
   private String[] P02714_A396EmprCod ;
   private String[] P02714_A603MaqCodBis ;
   private String[] P02714_A130BarCodPar ;
   private byte[] P02714_A132BarCodReo ;
   private int[] P02714_A129BarCod ;
   private short[] P02714_A194BarOrdLin ;
   private String[] P02714_A758ProCod ;
}

final  class pclamqtl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02712", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTipDis FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02713", "SELECT EmprCod, MaqCod, RecLinMaq, BarCodPar, BarCodReo, BarCod FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (SUBSTR(MaqCod, 1, ?) = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02714", "SELECT EmprCod, MaqCodBis, BarCodPar, BarCodReo, BarCod, BarOrdLin, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (SUBSTR(MaqCodBis, 1, ?) = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 6);
               return;
      }
   }

}

