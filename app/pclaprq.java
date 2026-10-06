package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclaprq extends GXProcedure
{
   public pclaprq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclaprq.class ), "" );
   }

   public pclaprq( int remoteHandle ,
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
      pclaprq.this.aP12 = new String[] {""};
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
      pclaprq.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclaprq.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclaprq.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclaprq.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclaprq.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclaprq.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclaprq.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclaprq.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclaprq.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclaprq.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclaprq.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclaprq.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      pclaprq.this.AV120Clave_PQ = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Accion = GXutil.substring( AV16Clave, 11, 1) ;
      AV39Proceso = GXutil.substring( AV16Clave, 4, 6) ;
      AV40FlagPro = (byte)(0) ;
      AV66Station = context.getWorkstationId( remoteHandle) ;
      /* Using cursor P027M2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar, Short.valueOf(AV67BarLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P027M2_A2804RecLinMaq[0] ;
         A130BarCodPar = P027M2_A130BarCodPar[0] ;
         A132BarCodReo = P027M2_A132BarCodReo[0] ;
         A129BarCod = P027M2_A129BarCod[0] ;
         A764ProForCod = P027M2_A764ProForCod[0] ;
         A1273RecLinPro = P027M2_A1273RecLinPro[0] ;
         AV40FlagPro = (byte)(1) ;
         if ( GXutil.strcmp(A764ProForCod, AV39Proceso) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV17PrdVal == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         if ( GXutil.strcmp(AV120Clave_PQ, httpContext.getMessage( "S", "")) == 0 )
         {
            AV17PrdVal = (byte)(1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclaprq.this.A396EmprCod;
      this.aP1[0] = pclaprq.this.AV15Descrip;
      this.aP2[0] = pclaprq.this.AV16Clave;
      this.aP3[0] = pclaprq.this.AV17PrdVal;
      this.aP4[0] = pclaprq.this.AV18BarCod;
      this.aP5[0] = pclaprq.this.AV19BarCodReo;
      this.aP6[0] = pclaprq.this.AV20BarCodPar;
      this.aP7[0] = pclaprq.this.AV21TotKil;
      this.aP8[0] = pclaprq.this.AV22PrdDesc;
      this.aP9[0] = pclaprq.this.AV23Accion;
      this.aP10[0] = pclaprq.this.AV67BarLinMaq;
      this.aP11[0] = pclaprq.this.AV111Opi;
      this.aP12[0] = pclaprq.this.AV120Clave_PQ;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39Proceso = "" ;
      AV66Station = "" ;
      scmdbuf = "" ;
      P027M2_A396EmprCod = new String[] {""} ;
      P027M2_A2804RecLinMaq = new short[1] ;
      P027M2_A130BarCodPar = new String[] {""} ;
      P027M2_A132BarCodReo = new byte[1] ;
      P027M2_A129BarCod = new int[1] ;
      P027M2_A764ProForCod = new String[] {""} ;
      P027M2_A1273RecLinPro = new byte[1] ;
      A130BarCodPar = "" ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclaprq__default(),
         new Object[] {
             new Object[] {
            P027M2_A396EmprCod, P027M2_A2804RecLinMaq, P027M2_A130BarCodPar, P027M2_A132BarCodReo, P027M2_A129BarCod, P027M2_A764ProForCod, P027M2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte AV40FlagPro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
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
   private String AV120Clave_PQ ;
   private String AV39Proceso ;
   private String AV66Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A764ProForCod ;
   private boolean returnInSub ;
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
   private String[] P027M2_A396EmprCod ;
   private short[] P027M2_A2804RecLinMaq ;
   private String[] P027M2_A130BarCodPar ;
   private byte[] P027M2_A132BarCodReo ;
   private int[] P027M2_A129BarCod ;
   private String[] P027M2_A764ProForCod ;
   private byte[] P027M2_A1273RecLinPro ;
}

final  class pclaprq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027M2", "SELECT EmprCod, RecLinMaq, BarCodPar, BarCodReo, BarCod, ProForCod, RecLinPro FROM TXPCRECET WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

