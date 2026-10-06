package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class get_reclinprofreclin extends GXProcedure
{
   public get_reclinprofreclin( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( get_reclinprofreclin.class ), "" );
   }

   public get_reclinprofreclin( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            byte aP2 ,
                            String aP3 ,
                            short aP4 ,
                            short aP5 ,
                            byte[] aP6 ,
                            short[] aP7 ,
                            short[] aP8 ,
                            short[] aP9 ,
                            short[] aP10 )
   {
      get_reclinprofreclin.this.aP11 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        short aP4 ,
                        short aP5 ,
                        byte[] aP6 ,
                        short[] aP7 ,
                        short[] aP8 ,
                        short[] aP9 ,
                        short[] aP10 ,
                        short[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             short aP4 ,
                             short aP5 ,
                             byte[] aP6 ,
                             short[] aP7 ,
                             short[] aP8 ,
                             short[] aP9 ,
                             short[] aP10 ,
                             short[] aP11 )
   {
      get_reclinprofreclin.this.A396EmprCod = aP0;
      get_reclinprofreclin.this.A129BarCod = aP1;
      get_reclinprofreclin.this.A132BarCodReo = aP2;
      get_reclinprofreclin.this.A130BarCodPar = aP3;
      get_reclinprofreclin.this.A2804RecLinMaq = aP4;
      get_reclinprofreclin.this.AV13Reclin = aP5;
      get_reclinprofreclin.this.aP6 = aP6;
      get_reclinprofreclin.this.aP7 = aP7;
      get_reclinprofreclin.this.aP8 = aP8;
      get_reclinprofreclin.this.aP9 = aP9;
      get_reclinprofreclin.this.aP10 = aP10;
      get_reclinprofreclin.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9crecet = (short)(0) ;
      AV10Reclinmax = (short)(0) ;
      AV11Reclinmin = (short)(0) ;
      AV12RecLinPro = (byte)(0) ;
      AV14NextReclinmax = (short)(0) ;
      AV15NextReclinmin = (short)(0) ;
      AV17numeroproceso = (short)(1) ;
      /* Using cursor P0ALH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1273RecLinPro = P0ALH2_A1273RecLinPro[0] ;
         A811RecLin = P0ALH2_A811RecLin[0] ;
         AV9crecet = (short)(1) ;
         GXv_int1[0] = AV10Reclinmax ;
         GXv_int2[0] = AV11Reclinmin ;
         GXv_int3[0] = AV14NextReclinmax ;
         GXv_int4[0] = AV15NextReclinmin ;
         GXv_int5[0] = AV19NextReclinpro ;
         new app.get_reclinprocopy1(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, GXv_int1, GXv_int2, GXv_int3, GXv_int4, GXv_int5) ;
         get_reclinprofreclin.this.AV10Reclinmax = GXv_int1[0] ;
         get_reclinprofreclin.this.AV11Reclinmin = GXv_int2[0] ;
         get_reclinprofreclin.this.AV14NextReclinmax = GXv_int3[0] ;
         get_reclinprofreclin.this.AV15NextReclinmin = GXv_int4[0] ;
         get_reclinprofreclin.this.AV19NextReclinpro = GXv_int5[0] ;
         AV12RecLinPro = A1273RecLinPro ;
         if ( AV17numeroproceso == 1 )
         {
            if ( AV13Reclin < AV11Reclinmin )
            {
               AV12RecLinPro = A1273RecLinPro ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( AV19NextReclinpro > 0 )
         {
            if ( ( AV13Reclin >= AV10Reclinmax ) && ( AV13Reclin <= AV15NextReclinmin ) )
            {
               AV16Valormaximo = (short)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec((AV15NextReclinmin-AV10Reclinmax)/ (double) (2)), 0))) ;
               AV18PuntoMedio = (short)(AV10Reclinmax+AV16Valormaximo) ;
               if ( AV13Reclin <= AV18PuntoMedio )
               {
                  AV12RecLinPro = A1273RecLinPro ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               else
               {
                  AV12RecLinPro = AV19NextReclinpro ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
            else
            {
               if ( ( AV13Reclin >= AV11Reclinmin ) && ( AV13Reclin <= AV10Reclinmax ) )
               {
                  AV12RecLinPro = A1273RecLinPro ;
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         else
         {
            AV12RecLinPro = A1273RecLinPro ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = get_reclinprofreclin.this.AV12RecLinPro;
      this.aP7[0] = get_reclinprofreclin.this.AV9crecet;
      this.aP8[0] = get_reclinprofreclin.this.AV10Reclinmax;
      this.aP9[0] = get_reclinprofreclin.this.AV11Reclinmin;
      this.aP10[0] = get_reclinprofreclin.this.AV14NextReclinmax;
      this.aP11[0] = get_reclinprofreclin.this.AV15NextReclinmin;
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
      P0ALH2_A396EmprCod = new String[] {""} ;
      P0ALH2_A129BarCod = new int[1] ;
      P0ALH2_A132BarCodReo = new byte[1] ;
      P0ALH2_A130BarCodPar = new String[] {""} ;
      P0ALH2_A2804RecLinMaq = new short[1] ;
      P0ALH2_A1273RecLinPro = new byte[1] ;
      P0ALH2_A811RecLin = new short[1] ;
      GXv_int1 = new short[1] ;
      GXv_int2 = new short[1] ;
      GXv_int3 = new short[1] ;
      GXv_int4 = new short[1] ;
      GXv_int5 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.get_reclinprofreclin__default(),
         new Object[] {
             new Object[] {
            P0ALH2_A396EmprCod, P0ALH2_A129BarCod, P0ALH2_A132BarCodReo, P0ALH2_A130BarCodPar, P0ALH2_A2804RecLinMaq, P0ALH2_A1273RecLinPro, P0ALH2_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12RecLinPro ;
   private byte A1273RecLinPro ;
   private byte AV19NextReclinpro ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short AV13Reclin ;
   private short AV9crecet ;
   private short AV10Reclinmax ;
   private short AV11Reclinmin ;
   private short AV14NextReclinmax ;
   private short AV15NextReclinmin ;
   private short AV17numeroproceso ;
   private short A811RecLin ;
   private short GXv_int1[] ;
   private short GXv_int2[] ;
   private short GXv_int3[] ;
   private short GXv_int4[] ;
   private short AV16Valormaximo ;
   private short AV18PuntoMedio ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private short[] aP11 ;
   private byte[] aP6 ;
   private short[] aP7 ;
   private short[] aP8 ;
   private short[] aP9 ;
   private short[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ALH2_A396EmprCod ;
   private int[] P0ALH2_A129BarCod ;
   private byte[] P0ALH2_A132BarCodReo ;
   private String[] P0ALH2_A130BarCodPar ;
   private short[] P0ALH2_A2804RecLinMaq ;
   private byte[] P0ALH2_A1273RecLinPro ;
   private short[] P0ALH2_A811RecLin ;
}

final  class get_reclinprofreclin__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ALH2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
      }
   }

}

