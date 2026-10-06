package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclac1 extends GXProcedure
{
   public pclac1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclac1.class ), "" );
   }

   public pclac1( int remoteHandle ,
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
      pclac1.this.aP11 = new byte[] {0};
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
      pclac1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclac1.this.AV15Descrip = aP1[0];
      this.aP1 = aP1;
      pclac1.this.AV16Clave = aP2[0];
      this.aP2 = aP2;
      pclac1.this.AV17PrdVal = aP3[0];
      this.aP3 = aP3;
      pclac1.this.AV18BarCod = aP4[0];
      this.aP4 = aP4;
      pclac1.this.AV19BarCodReo = aP5[0];
      this.aP5 = aP5;
      pclac1.this.AV20BarCodPar = aP6[0];
      this.aP6 = aP6;
      pclac1.this.AV21TotKil = aP7[0];
      this.aP7 = aP7;
      pclac1.this.AV22PrdDesc = aP8[0];
      this.aP8 = aP8;
      pclac1.this.AV23Accion = aP9[0];
      this.aP9 = aP9;
      pclac1.this.AV67BarLinMaq = aP10[0];
      this.aP10 = aP10;
      pclac1.this.AV111Opi = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV101ArtCod_1 = GXutil.substring( AV16Clave, 4, 16) ;
      AV23Accion = GXutil.substring( AV16Clave, 21, 1) ;
      AV85LenVar = (byte)(GXutil.len( GXutil.trim( AV101ArtCod_1))) ;
      /* Using cursor P01QA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV18BarCod), Byte.valueOf(AV19BarCodReo), AV20BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01QA2_A130BarCodPar[0] ;
         A132BarCodReo = P01QA2_A132BarCodReo[0] ;
         A129BarCod = P01QA2_A129BarCod[0] ;
         A212BarSer = P01QA2_A212BarSer[0] ;
         if ( GXutil.like( A212BarSer , GXutil.padr( AV101ArtCod_1 , 16 , "%"),  ' ' ) )
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
      this.aP0[0] = pclac1.this.A396EmprCod;
      this.aP1[0] = pclac1.this.AV15Descrip;
      this.aP2[0] = pclac1.this.AV16Clave;
      this.aP3[0] = pclac1.this.AV17PrdVal;
      this.aP4[0] = pclac1.this.AV18BarCod;
      this.aP5[0] = pclac1.this.AV19BarCodReo;
      this.aP6[0] = pclac1.this.AV20BarCodPar;
      this.aP7[0] = pclac1.this.AV21TotKil;
      this.aP8[0] = pclac1.this.AV22PrdDesc;
      this.aP9[0] = pclac1.this.AV23Accion;
      this.aP10[0] = pclac1.this.AV67BarLinMaq;
      this.aP11[0] = pclac1.this.AV111Opi;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV101ArtCod_1 = "" ;
      scmdbuf = "" ;
      P01QA2_A396EmprCod = new String[] {""} ;
      P01QA2_A130BarCodPar = new String[] {""} ;
      P01QA2_A132BarCodReo = new byte[1] ;
      P01QA2_A129BarCod = new int[1] ;
      P01QA2_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclac1__default(),
         new Object[] {
             new Object[] {
            P01QA2_A396EmprCod, P01QA2_A130BarCodPar, P01QA2_A132BarCodReo, P01QA2_A129BarCod, P01QA2_A212BarSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17PrdVal ;
   private byte AV19BarCodReo ;
   private byte AV111Opi ;
   private byte AV85LenVar ;
   private byte A132BarCodReo ;
   private short AV67BarLinMaq ;
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
   private String AV101ArtCod_1 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A212BarSer ;
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
   private String[] P01QA2_A396EmprCod ;
   private String[] P01QA2_A130BarCodPar ;
   private byte[] P01QA2_A132BarCodReo ;
   private int[] P01QA2_A129BarCod ;
   private String[] P01QA2_A212BarSer ;
}

final  class pclac1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QA2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
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
      }
   }

}

