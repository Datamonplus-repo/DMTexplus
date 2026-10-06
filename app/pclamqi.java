package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclamqi extends GXProcedure
{
   public pclamqi( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclamqi.class ), "" );
   }

   public pclamqi( int remoteHandle ,
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
      pclamqi.this.aP12 = new String[] {""};
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
      pclamqi.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclamqi.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclamqi.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclamqi.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclamqi.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclamqi.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclamqi.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclamqi.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclamqi.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclamqi.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclamqi.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclamqi.this.AV112Opi = aP11[0];
      this.aP11 = aP11;
      pclamqi.this.AV113BarFactin = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV111F_reccol = (byte)(0) ;
      AV114Fase_nt = (byte)(0) ;
      AV17PrdVal = (byte)(0) ;
      AV115FMaq = (byte)(0) ;
      AV116FCod = (byte)(0) ;
      AV30CodMaq = GXutil.rtrim( GXutil.substring( AV16Clave, 5, 6)) ;
      AV51IntCod = (byte)(GXutil.lval( GXutil.trim( GXutil.substring( AV16Clave, 12, 2)))) ;
      AV23Accion = GXutil.substring( AV16Clave, 15, 1) ;
      /* Using cursor P02IQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P02IQ2_A2804RecLinMaq[0] ;
         A130BarCodPar = P02IQ2_A130BarCodPar[0] ;
         A132BarCodReo = P02IQ2_A132BarCodReo[0] ;
         A129BarCod = P02IQ2_A129BarCod[0] ;
         A602MaqCod = P02IQ2_A602MaqCod[0] ;
         A5412RecIntCol = P02IQ2_A5412RecIntCol[0] ;
         n5412RecIntCol = P02IQ2_n5412RecIntCol[0] ;
         if ( ( ( AV51IntCod == A5412RecIntCol ) ) && ( GXutil.like( A602MaqCod , GXutil.padr( AV30CodMaq , 6 , "%"),  ' ' ) ) )
         {
            AV17PrdVal = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclamqi.this.A396EmprCod;
      this.aP1[0] = pclamqi.this.AV15Descrip;
      this.aP2[0] = pclamqi.this.AV16Clave;
      this.aP3[0] = pclamqi.this.AV17PrdVal;
      this.aP4[0] = pclamqi.this.AV18BarCod;
      this.aP5[0] = pclamqi.this.AV19BarCodReo;
      this.aP6[0] = pclamqi.this.AV20BarCodPar;
      this.aP7[0] = pclamqi.this.AV21TotKil;
      this.aP8[0] = pclamqi.this.AV22PrdDesc;
      this.aP9[0] = pclamqi.this.AV23Accion;
      this.aP10[0] = pclamqi.this.AV67BarLinMaq;
      this.aP11[0] = pclamqi.this.AV112Opi;
      this.aP12[0] = pclamqi.this.AV113BarFactin;
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
      P02IQ2_A396EmprCod = new String[] {""} ;
      P02IQ2_A2804RecLinMaq = new short[1] ;
      P02IQ2_A130BarCodPar = new String[] {""} ;
      P02IQ2_A132BarCodReo = new byte[1] ;
      P02IQ2_A129BarCod = new int[1] ;
      P02IQ2_A602MaqCod = new String[] {""} ;
      P02IQ2_A5412RecIntCol = new byte[1] ;
      P02IQ2_n5412RecIntCol = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclamqi__default(),
         new Object[] {
             new Object[] {
            P02IQ2_A396EmprCod, P02IQ2_A2804RecLinMaq, P02IQ2_A130BarCodPar, P02IQ2_A132BarCodReo, P02IQ2_A129BarCod, P02IQ2_A602MaqCod, P02IQ2_A5412RecIntCol, P02IQ2_n5412RecIntCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV112Opi ;
   private byte AV111F_reccol ;
   private byte AV114Fase_nt ;
   private byte AV115FMaq ;
   private byte AV116FCod ;
   private byte AV51IntCod ;
   private byte A132BarCodReo ;
   private byte A5412RecIntCol ;
   private short AV67BarLinMaq ;
   private short A2804RecLinMaq ;
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
   private String AV113BarFactin ;
   private String AV30CodMaq ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private boolean n5412RecIntCol ;
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
   private String[] P02IQ2_A396EmprCod ;
   private short[] P02IQ2_A2804RecLinMaq ;
   private String[] P02IQ2_A130BarCodPar ;
   private byte[] P02IQ2_A132BarCodReo ;
   private int[] P02IQ2_A129BarCod ;
   private String[] P02IQ2_A602MaqCod ;
   private byte[] P02IQ2_A5412RecIntCol ;
   private boolean[] P02IQ2_n5412RecIntCol ;
}

final  class pclamqi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IQ2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, MaqCod, RecIntCol FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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

