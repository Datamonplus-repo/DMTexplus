package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamqta extends GXProcedure
{
   public pclamqta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamqta.class ), "" );
   }

   public pclamqta( int remoteHandle ,
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
                             short[] aP7 )
   {
      pclamqta.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 )
   {
      pclamqta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamqta.this.AV11Descrip = aP1[0];
      this.aP1 = aP1;
      pclamqta.this.AV12Clave = aP2[0];
      this.aP2 = aP2;
      pclamqta.this.AV27PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamqta.this.AV13BarCod = aP4[0];
      this.aP4 = aP4;
      pclamqta.this.AV14BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamqta.this.AV15BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamqta.this.AV21BarLinMaq = aP7[0];
      this.aP7 = aP7;
      pclamqta.this.AV16Accion = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27PrdVal = (byte)(0) ;
      AV25FMaq = (byte)(0) ;
      AV26FArt = (byte)(0) ;
      AV17CodMaq = GXutil.rtrim( GXutil.substring( AV12Clave, 5, 6)) ;
      AV23TipArt = (short)(GXutil.lval( GXutil.trim( GXutil.substring( AV12Clave, 12, 4)))) ;
      AV16Accion = GXutil.substring( AV12Clave, 17, 1) ;
      /* Using cursor P02IS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar, Short.valueOf(AV21BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02IS2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02IS2_A130BarCodPar[0] ;
         A132BarCodReo = P02IS2_A132BarCodReo[0] ;
         A129BarCod = P02IS2_A129BarCod[0] ;
         A602MaqCod = P02IS2_A602MaqCod[0] ;
         if ( GXutil.like( A602MaqCod , GXutil.padr( AV17CodMaq , 6 , "%"),  ' ' ) )
         {
            AV25FMaq = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02IS3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02IS3_A130BarCodPar[0] ;
         A132BarCodReo = P02IS3_A132BarCodReo[0] ;
         A129BarCod = P02IS3_A129BarCod[0] ;
         A217BarTipArt = P02IS3_A217BarTipArt[0] ;
         n217BarTipArt = P02IS3_n217BarTipArt[0] ;
         if ( AV23TipArt == A217BarTipArt )
         {
            AV26FArt = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( ( AV25FMaq == 1 ) && ( AV26FArt == 1 ) )
      {
         AV27PrdVal = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamqta.this.A396EmprCod;
      this.aP1[0] = pclamqta.this.AV11Descrip;
      this.aP2[0] = pclamqta.this.AV12Clave;
      this.aP3[0] = pclamqta.this.AV27PrdVal;
      this.aP4[0] = pclamqta.this.AV13BarCod;
      this.aP5[0] = pclamqta.this.AV14BarCodReo;
      this.aP6[0] = pclamqta.this.AV15BarCodPar;
      this.aP7[0] = pclamqta.this.AV21BarLinMaq;
      this.aP8[0] = pclamqta.this.AV16Accion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17CodMaq = "" ;
      scmdbuf = "" ;
      P02IS2_A396EmprCod = new String[] {""} ;
      P02IS2_A2804RecLinMaq = new short[1] ;
      P02IS2_A130BarCodPar = new String[] {""} ;
      P02IS2_A132BarCodReo = new byte[1] ;
      P02IS2_A129BarCod = new int[1] ;
      P02IS2_A602MaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      P02IS3_A396EmprCod = new String[] {""} ;
      P02IS3_A130BarCodPar = new String[] {""} ;
      P02IS3_A132BarCodReo = new byte[1] ;
      P02IS3_A129BarCod = new int[1] ;
      P02IS3_A217BarTipArt = new short[1] ;
      P02IS3_n217BarTipArt = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamqta__default(),
         new Object[] {
             new Object[] {
            P02IS2_A396EmprCod, P02IS2_A2804RecLinMaq, P02IS2_A130BarCodPar, P02IS2_A132BarCodReo, P02IS2_A129BarCod, P02IS2_A602MaqCod
            }
            , new Object[] {
            P02IS3_A396EmprCod, P02IS3_A130BarCodPar, P02IS3_A132BarCodReo, P02IS3_A129BarCod, P02IS3_A217BarTipArt, P02IS3_n217BarTipArt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27PrdVal ;
   private byte AV14BarCodReo ;
   private byte AV25FMaq ;
   private byte AV26FArt ;
   private byte A132BarCodReo ;
   private short AV21BarLinMaq ;
   private short AV23TipArt ;
   private short A2804RecLinMaq ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV13BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV11Descrip ;
   private String AV12Clave ;
   private String AV15BarCodPar ;
   private String AV16Accion ;
   private String AV17CodMaq ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private boolean n217BarTipArt ;
   private String[] aP8 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private short[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IS2_A396EmprCod ;
   private short[] P02IS2_A2804RecLinMaq ;
   private String[] P02IS2_A130BarCodPar ;
   private byte[] P02IS2_A132BarCodReo ;
   private int[] P02IS2_A129BarCod ;
   private String[] P02IS2_A602MaqCod ;
   private String[] P02IS3_A396EmprCod ;
   private String[] P02IS3_A130BarCodPar ;
   private byte[] P02IS3_A132BarCodReo ;
   private int[] P02IS3_A129BarCod ;
   private short[] P02IS3_A217BarTipArt ;
   private boolean[] P02IS3_n217BarTipArt ;
}

final  class pclamqta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IS2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02IS3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               return;
      }
   }

}

