package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_in_hdr_agrupada extends GXProcedure
{
   public recetadetinte_in_hdr_agrupada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_in_hdr_agrupada.class ), "" );
   }

   public recetadetinte_in_hdr_agrupada( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      recetadetinte_in_hdr_agrupada.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      recetadetinte_in_hdr_agrupada.this.AV8Emprcod = aP0;
      recetadetinte_in_hdr_agrupada.this.AV14Barcod = aP1;
      recetadetinte_in_hdr_agrupada.this.AV9Barcodreo = aP2;
      recetadetinte_in_hdr_agrupada.this.AV10Barcodpar = aP3;
      recetadetinte_in_hdr_agrupada.this.aP4 = aP4;
      recetadetinte_in_hdr_agrupada.this.aP5 = aP5;
      recetadetinte_in_hdr_agrupada.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Barcodm = 0 ;
      AV13Barcodparm = "" ;
      AV12Barcodreom = (byte)(0) ;
      /* Using cursor P0AI62 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV14Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0AI62_A130BarCodPar[0] ;
         A132BarCodReo = P0AI62_A132BarCodReo[0] ;
         A129BarCod = P0AI62_A129BarCod[0] ;
         A396EmprCod = P0AI62_A396EmprCod[0] ;
         A120BarAgrEst = P0AI62_A120BarAgrEst[0] ;
         AV11Barcodm = A129BarCod ;
         AV12Barcodreom = A132BarCodReo ;
         AV13Barcodparm = A130BarCodPar ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_int1[0] = AV11Barcodm ;
            GXv_int2[0] = AV12Barcodreom ;
            GXv_char3[0] = AV13Barcodparm ;
            new app.pedidosclientesindetalle.hdrminima(remoteHandle, context).execute( A396EmprCod, GXv_int1, GXv_int2, GXv_char3) ;
            recetadetinte_in_hdr_agrupada.this.AV11Barcodm = GXv_int1[0] ;
            recetadetinte_in_hdr_agrupada.this.AV12Barcodreom = GXv_int2[0] ;
            recetadetinte_in_hdr_agrupada.this.AV13Barcodparm = GXv_char3[0] ;
            if ( ( A129BarCod == AV11Barcodm ) && ( A132BarCodReo == AV12Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV13Barcodparm) == 0 ) )
            {
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "3.&barcodm=", "")+GXutil.str( AV11Barcodm, 8, 0)+httpContext.getMessage( "&barcodreom=", "")+GXutil.str( AV12Barcodreom, 1, 0)+httpContext.getMessage( "&barcodparm=", "")+AV13Barcodparm );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = recetadetinte_in_hdr_agrupada.this.AV11Barcodm;
      this.aP5[0] = recetadetinte_in_hdr_agrupada.this.AV12Barcodreom;
      this.aP6[0] = recetadetinte_in_hdr_agrupada.this.AV13Barcodparm;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Barcodparm = "" ;
      scmdbuf = "" ;
      P0AI62_A130BarCodPar = new String[] {""} ;
      P0AI62_A132BarCodReo = new byte[1] ;
      P0AI62_A129BarCod = new int[1] ;
      P0AI62_A396EmprCod = new String[] {""} ;
      P0AI62_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A120BarAgrEst = "" ;
      GXv_int1 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_in_hdr_agrupada__default(),
         new Object[] {
             new Object[] {
            P0AI62_A130BarCodPar, P0AI62_A132BarCodReo, P0AI62_A129BarCod, P0AI62_A396EmprCod, P0AI62_A120BarAgrEst
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV12Barcodreom ;
   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV14Barcod ;
   private int AV11Barcodm ;
   private int A129BarCod ;
   private int GXv_int1[] ;
   private String AV8Emprcod ;
   private String AV10Barcodpar ;
   private String AV13Barcodparm ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A120BarAgrEst ;
   private String GXv_char3[] ;
   private String[] aP6 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AI62_A130BarCodPar ;
   private byte[] P0AI62_A132BarCodReo ;
   private int[] P0AI62_A129BarCod ;
   private String[] P0AI62_A396EmprCod ;
   private String[] P0AI62_A120BarAgrEst ;
}

final  class recetadetinte_in_hdr_agrupada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AI62", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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

