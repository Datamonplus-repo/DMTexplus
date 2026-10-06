package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmetpiacopy1copy1 extends GXProcedure
{
   public pmetpiacopy1copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmetpiacopy1copy1.class ), "" );
   }

   public pmetpiacopy1copy1( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 )
   {
      pmetpiacopy1copy1.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int aP4 ,
                             String[] aP5 )
   {
      pmetpiacopy1copy1.this.A396EmprCod = aP0;
      pmetpiacopy1copy1.this.AV13Barcod = aP1;
      pmetpiacopy1copy1.this.AV14Barcodreo = aP2;
      pmetpiacopy1copy1.this.AV15Barcodpar = aP3;
      pmetpiacopy1copy1.this.AV10Pzs = aP4;
      pmetpiacopy1copy1.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV16NumR = 0 ;
      /* Using cursor P0ACA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV13Barcod), Byte.valueOf(AV14Barcodreo), AV15Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkACA2 = false ;
         A2809MetTerCod = P0ACA2_A2809MetTerCod[0] ;
         A129BarCod = P0ACA2_A129BarCod[0] ;
         A132BarCodReo = P0ACA2_A132BarCodReo[0] ;
         A130BarCodPar = P0ACA2_A130BarCodPar[0] ;
         A2813MetPieCod = P0ACA2_A2813MetPieCod[0] ;
         A10780MetPiectr = P0ACA2_A10780MetPiectr[0] ;
         AV16NumR = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ACA2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ACA2_A2809MetTerCod[0], A2809MetTerCod) == 0 ) && ( P0ACA2_A129BarCod[0] == A129BarCod ) && ( P0ACA2_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P0ACA2_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P0ACA2_A10780MetPiectr[0], A10780MetPiectr) == 0 ) ) )
            {
               if (true) break;
            }
            brkACA2 = false ;
            A2813MetPieCod = P0ACA2_A2813MetPieCod[0] ;
            AV16NumR = (int)(AV16NumR+1) ;
            brkACA2 = true ;
            pr_default.readNext(0);
         }
         if ( ! brkACA2 )
         {
            brkACA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( AV16NumR != AV10Pzs )
      {
         Gx_msg = httpContext.getMessage( "El Total Piezas en Guia es ", "") + GXutil.str( AV10Pzs, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "El Total Piezas introducidos es ", "") + GXutil.str( AV16NumR, 6, 0) + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "Aviso.NO Coinciden", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pmetpiacopy1copy1.this.Gx_msg;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P0ACA2_A396EmprCod = new String[] {""} ;
      P0ACA2_A2809MetTerCod = new String[] {""} ;
      P0ACA2_A129BarCod = new int[1] ;
      P0ACA2_A132BarCodReo = new byte[1] ;
      P0ACA2_A130BarCodPar = new String[] {""} ;
      P0ACA2_A2813MetPieCod = new String[] {""} ;
      P0ACA2_A10780MetPiectr = new String[] {""} ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      A10780MetPiectr = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmetpiacopy1copy1__default(),
         new Object[] {
             new Object[] {
            P0ACA2_A396EmprCod, P0ACA2_A2809MetTerCod, P0ACA2_A129BarCod, P0ACA2_A132BarCodReo, P0ACA2_A130BarCodPar, P0ACA2_A2813MetPieCod, P0ACA2_A10780MetPiectr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV13Barcod ;
   private int AV10Pzs ;
   private int AV16NumR ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV15Barcodpar ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String A10780MetPiectr ;
   private boolean brkACA2 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACA2_A396EmprCod ;
   private String[] P0ACA2_A2809MetTerCod ;
   private int[] P0ACA2_A129BarCod ;
   private byte[] P0ACA2_A132BarCodReo ;
   private String[] P0ACA2_A130BarCodPar ;
   private String[] P0ACA2_A2813MetPieCod ;
   private String[] P0ACA2_A10780MetPiectr ;
}

final  class pmetpiacopy1copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACA2", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPiectr FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = '9999999999' and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPiectr, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
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

