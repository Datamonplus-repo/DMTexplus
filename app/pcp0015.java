package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcp0015 extends GXProcedure
{
   public pcp0015( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcp0015.class ), "" );
   }

   public pcp0015( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 )
   {
      pcp0015.this.aP4 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      pcp0015.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcp0015.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pcp0015.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pcp0015.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pcp0015.this.AV13BarKgm = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12Tab_hdr[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P02GO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02GO2_A130BarCodPar[0] ;
         A132BarCodReo = P02GO2_A132BarCodReo[0] ;
         A129BarCod = P02GO2_A129BarCod[0] ;
         A122BarAgrPar = P02GO2_A122BarAgrPar[0] ;
         A124BarAgrReo = P02GO2_A124BarAgrReo[0] ;
         A119BarAgrCod = P02GO2_A119BarAgrCod[0] ;
         AV12Tab_hdr[AV11i-1] = GXutil.str( A119BarAgrCod, 8, 0) + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV11i = (short)(AV11i+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV11i > 1 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcp0015.this.A396EmprCod;
      this.aP1[0] = pcp0015.this.AV8BarCod;
      this.aP2[0] = pcp0015.this.AV9Barcodreo;
      this.aP3[0] = pcp0015.this.AV10Barcodpar;
      this.aP4[0] = pcp0015.this.AV13BarKgm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12Tab_hdr = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV12Tab_hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P02GO2_A396EmprCod = new String[] {""} ;
      P02GO2_A130BarCodPar = new String[] {""} ;
      P02GO2_A132BarCodReo = new byte[1] ;
      P02GO2_A129BarCod = new int[1] ;
      P02GO2_A122BarAgrPar = new String[] {""} ;
      P02GO2_A124BarAgrReo = new byte[1] ;
      P02GO2_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcp0015__default(),
         new Object[] {
             new Object[] {
            P02GO2_A396EmprCod, P02GO2_A130BarCodPar, P02GO2_A132BarCodReo, P02GO2_A129BarCod, P02GO2_A122BarAgrPar, P02GO2_A124BarAgrReo, P02GO2_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short AV11i ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int GX_I ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal AV13BarKgm ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV12Tab_hdr[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private java.math.BigDecimal[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02GO2_A396EmprCod ;
   private String[] P02GO2_A130BarCodPar ;
   private byte[] P02GO2_A132BarCodReo ;
   private int[] P02GO2_A129BarCod ;
   private String[] P02GO2_A122BarAgrPar ;
   private byte[] P02GO2_A124BarAgrReo ;
   private int[] P02GO2_A119BarAgrCod ;
}

final  class pcp0015__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02GO2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               return;
      }
   }

}

