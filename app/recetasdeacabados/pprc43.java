package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc43 extends GXProcedure
{
   public pprc43( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc43.class ), "" );
   }

   public pprc43( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 )
   {
      pprc43.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 ,
                             String[] aP6 )
   {
      pprc43.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc43.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc43.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc43.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc43.this.A2804RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pprc43.this.AV14j = aP5[0];
      this.aP5 = aP5;
      pprc43.this.AV30productosConsumos = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05DF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk5DF2 = false ;
         A686PrdCant = P05DF2_A686PrdCant[0] ;
         A872RecPrdNum = P05DF2_A872RecPrdNum[0] ;
         A1273RecLinPro = P05DF2_A1273RecLinPro[0] ;
         A811RecLin = P05DF2_A811RecLin[0] ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P05DF2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P05DF2_A129BarCod[0] == A129BarCod ) && ( P05DF2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(P05DF2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( P05DF2_A2804RecLinMaq[0] == A2804RecLinMaq ) ) )
            {
               if (true) break;
            }
            brk5DF2 = false ;
            A686PrdCant = P05DF2_A686PrdCant[0] ;
            A872RecPrdNum = P05DF2_A872RecPrdNum[0] ;
            A1273RecLinPro = P05DF2_A1273RecLinPro[0] ;
            A811RecLin = P05DF2_A811RecLin[0] ;
            AV10Prdcant = A686PrdCant ;
            AV34Prdnum = A872RecPrdNum ;
            /* Execute user subroutine: 'REVISARCOLECCION' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            brk5DF2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk5DF2 )
         {
            brk5DF2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV30productosConsumos = AV32SDTProductosConsumosCollection.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'REVISARCOLECCION' Routine */
      returnInSub = false ;
      AV35Encontrado = false ;
      AV40GXV1 = 1 ;
      while ( AV40GXV1 <= AV32SDTProductosConsumosCollection.size() )
      {
         AV33RevisarSDTProductosconsumos = (app.SdtSDTProductosConsumos)((app.SdtSDTProductosConsumos)AV32SDTProductosConsumosCollection.elementAt(-1+AV40GXV1));
         if ( GXutil.strcmp(AV34Prdnum, AV33RevisarSDTProductosconsumos.getgxTv_SdtSDTProductosConsumos_Producto()) == 0 )
         {
            AV33RevisarSDTProductosconsumos.setgxTv_SdtSDTProductosConsumos_Cantidad( AV33RevisarSDTProductosconsumos.getgxTv_SdtSDTProductosConsumos_Cantidad().add(AV10Prdcant) );
            ((app.SdtSDTProductosConsumos)(AV32SDTProductosConsumosCollection.currentItem())).fromJSonString(AV33RevisarSDTProductosconsumos.toJSonString(false, true), null);
            AV35Encontrado = true ;
            if (true) break;
         }
         AV40GXV1 = (int)(AV40GXV1+1) ;
      }
      if ( ! AV35Encontrado )
      {
         AV31SDTProductosConsumos = (app.SdtSDTProductosConsumos)new app.SdtSDTProductosConsumos(remoteHandle, context);
         AV31SDTProductosConsumos.setgxTv_SdtSDTProductosConsumos_Producto( AV34Prdnum );
         AV31SDTProductosConsumos.setgxTv_SdtSDTProductosConsumos_Cantidad( AV10Prdcant );
         AV32SDTProductosConsumosCollection.add(AV31SDTProductosConsumos, 0);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc43.this.A396EmprCod;
      this.aP1[0] = pprc43.this.A129BarCod;
      this.aP2[0] = pprc43.this.A132BarCodReo;
      this.aP3[0] = pprc43.this.A130BarCodPar;
      this.aP4[0] = pprc43.this.A2804RecLinMaq;
      this.aP5[0] = pprc43.this.AV14j;
      this.aP6[0] = pprc43.this.AV30productosConsumos;
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
      P05DF2_A396EmprCod = new String[] {""} ;
      P05DF2_A129BarCod = new int[1] ;
      P05DF2_A132BarCodReo = new byte[1] ;
      P05DF2_A130BarCodPar = new String[] {""} ;
      P05DF2_A2804RecLinMaq = new short[1] ;
      P05DF2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05DF2_A872RecPrdNum = new String[] {""} ;
      P05DF2_A1273RecLinPro = new byte[1] ;
      P05DF2_A811RecLin = new short[1] ;
      A686PrdCant = DecimalUtil.ZERO ;
      A872RecPrdNum = "" ;
      AV10Prdcant = DecimalUtil.ZERO ;
      AV34Prdnum = "" ;
      AV32SDTProductosConsumosCollection = new GXBaseCollection<app.SdtSDTProductosConsumos>(app.SdtSDTProductosConsumos.class, "SDTProductosConsumos", "TexplusNET", remoteHandle);
      AV33RevisarSDTProductosconsumos = new app.SdtSDTProductosConsumos(remoteHandle, context);
      AV31SDTProductosConsumos = new app.SdtSDTProductosConsumos(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.pprc43__default(),
         new Object[] {
             new Object[] {
            P05DF2_A396EmprCod, P05DF2_A129BarCod, P05DF2_A132BarCodReo, P05DF2_A130BarCodPar, P05DF2_A2804RecLinMaq, P05DF2_A686PrdCant, P05DF2_A872RecPrdNum, P05DF2_A1273RecLinPro, P05DF2_A811RecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV14j ;
   private int AV40GXV1 ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal AV10Prdcant ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A872RecPrdNum ;
   private String AV34Prdnum ;
   private boolean brk5DF2 ;
   private boolean returnInSub ;
   private boolean AV35Encontrado ;
   private String AV30productosConsumos ;
   private GXBaseCollection<app.SdtSDTProductosConsumos> AV32SDTProductosConsumosCollection ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private int[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P05DF2_A396EmprCod ;
   private int[] P05DF2_A129BarCod ;
   private byte[] P05DF2_A132BarCodReo ;
   private String[] P05DF2_A130BarCodPar ;
   private short[] P05DF2_A2804RecLinMaq ;
   private java.math.BigDecimal[] P05DF2_A686PrdCant ;
   private String[] P05DF2_A872RecPrdNum ;
   private byte[] P05DF2_A1273RecLinPro ;
   private short[] P05DF2_A811RecLin ;
   private app.SdtSDTProductosConsumos AV33RevisarSDTProductosconsumos ;
   private app.SdtSDTProductosConsumos AV31SDTProductosConsumos ;
}

final  class pprc43__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05DF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, PrdCant, RecPrdNum, RecLinPro, RecLin FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (PrdCant > 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecPrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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

