package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewcor2 extends GXProcedure
{
   public pnewcor2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewcor2.class ), "" );
   }

   public pnewcor2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pnewcor2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pnewcor2.this.AV8EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewcor2.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      pnewcor2.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnewcor2.this.AV11BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01822 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P01822_A130BarCodPar[0] ;
         A132BarCodReo = P01822_A132BarCodReo[0] ;
         A129BarCod = P01822_A129BarCod[0] ;
         A396EmprCod = P01822_A396EmprCod[0] ;
         A135BarColNom = P01822_A135BarColNom[0] ;
         A136BarColNum = P01822_A136BarColNum[0] ;
         A218BarTipCol = P01822_A218BarTipCol[0] ;
         A252CliCod = P01822_A252CliCod[0] ;
         n252CliCod = P01822_n252CliCod[0] ;
         A212BarSer = P01822_A212BarSer[0] ;
         A120BarAgrEst = P01822_A120BarAgrEst[0] ;
         AV17Barcolnomp = A135BarColNom ;
         AV18Barcolnump = A136BarColNum ;
         AV19Bartipcolp = A218BarTipCol ;
         AV20Barclicodp = A252CliCod ;
         AV21Barserp = A212BarSer ;
         AV13BarAgrEst = A120BarAgrEst ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_int1[0] = AV12Flag ;
      new app.formulaciontinte.pbufori(remoteHandle, context).execute( AV8EmprCod, AV20Barclicodp, AV21Barserp, AV17Barcolnomp, AV18Barcolnump, AV19Bartipcolp, GXv_int1) ;
      pnewcor2.this.AV12Flag = GXv_int1[0] ;
      if ( AV12Flag == 1 )
      {
         if ( GXutil.strcmp(AV13BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P01823 */
            pr_default.execute(1, new Object[] {AV8EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A130BarCodPar = P01823_A130BarCodPar[0] ;
               A132BarCodReo = P01823_A132BarCodReo[0] ;
               A129BarCod = P01823_A129BarCod[0] ;
               A396EmprCod = P01823_A396EmprCod[0] ;
               A119BarAgrCod = P01823_A119BarAgrCod[0] ;
               A124BarAgrReo = P01823_A124BarAgrReo[0] ;
               A122BarAgrPar = P01823_A122BarAgrPar[0] ;
               GXv_char2[0] = A396EmprCod ;
               GXv_int3[0] = A119BarAgrCod ;
               GXv_int1[0] = A124BarAgrReo ;
               GXv_char4[0] = A122BarAgrPar ;
               GXv_char5[0] = AV21Barserp ;
               GXv_char6[0] = AV17Barcolnomp ;
               GXv_int7[0] = AV18Barcolnump ;
               GXv_int8[0] = AV19Bartipcolp ;
               new app.pnueco2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_char5, GXv_char6, GXv_int7, GXv_int8) ;
               pnewcor2.this.A396EmprCod = GXv_char2[0] ;
               pnewcor2.this.A119BarAgrCod = GXv_int3[0] ;
               pnewcor2.this.A124BarAgrReo = GXv_int1[0] ;
               pnewcor2.this.A122BarAgrPar = GXv_char4[0] ;
               pnewcor2.this.AV21Barserp = GXv_char5[0] ;
               pnewcor2.this.AV17Barcolnomp = GXv_char6[0] ;
               pnewcor2.this.AV18Barcolnump = GXv_int7[0] ;
               pnewcor2.this.AV19Bartipcolp = GXv_int8[0] ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A119BarAgrCod ;
               GXv_int8[0] = A124BarAgrReo ;
               GXv_char5[0] = A122BarAgrPar ;
               GXv_int3[0] = AV20Barclicodp ;
               GXv_char4[0] = AV21Barserp ;
               GXv_char2[0] = AV17Barcolnomp ;
               GXv_int9[0] = AV18Barcolnump ;
               GXv_int1[0] = AV19Bartipcolp ;
               new app.pnewcor(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int8, GXv_char5, GXv_int3, GXv_char4, GXv_char2, GXv_int9, GXv_int1) ;
               pnewcor2.this.A396EmprCod = GXv_char6[0] ;
               pnewcor2.this.A119BarAgrCod = GXv_int7[0] ;
               pnewcor2.this.A124BarAgrReo = GXv_int8[0] ;
               pnewcor2.this.A122BarAgrPar = GXv_char5[0] ;
               pnewcor2.this.AV20Barclicodp = GXv_int3[0] ;
               pnewcor2.this.AV21Barserp = GXv_char4[0] ;
               pnewcor2.this.AV17Barcolnomp = GXv_char2[0] ;
               pnewcor2.this.AV18Barcolnump = GXv_int9[0] ;
               pnewcor2.this.AV19Bartipcolp = GXv_int1[0] ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewcor2.this.AV8EmprCod;
      this.aP1[0] = pnewcor2.this.AV9Barcod;
      this.aP2[0] = pnewcor2.this.AV10BarCodReo;
      this.aP3[0] = pnewcor2.this.AV11BarCodPar;
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
      P01822_A130BarCodPar = new String[] {""} ;
      P01822_A132BarCodReo = new byte[1] ;
      P01822_A129BarCod = new int[1] ;
      P01822_A396EmprCod = new String[] {""} ;
      P01822_A135BarColNom = new String[] {""} ;
      P01822_A136BarColNum = new int[1] ;
      P01822_A218BarTipCol = new byte[1] ;
      P01822_A252CliCod = new int[1] ;
      P01822_n252CliCod = new boolean[] {false} ;
      P01822_A212BarSer = new String[] {""} ;
      P01822_A120BarAgrEst = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A120BarAgrEst = "" ;
      AV17Barcolnomp = "" ;
      AV21Barserp = "" ;
      AV13BarAgrEst = "" ;
      P01823_A130BarCodPar = new String[] {""} ;
      P01823_A132BarCodReo = new byte[1] ;
      P01823_A129BarCod = new int[1] ;
      P01823_A396EmprCod = new String[] {""} ;
      P01823_A119BarAgrCod = new int[1] ;
      P01823_A124BarAgrReo = new byte[1] ;
      P01823_A122BarAgrPar = new String[] {""} ;
      A122BarAgrPar = "" ;
      GXv_char6 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int1 = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewcor2__default(),
         new Object[] {
             new Object[] {
            P01822_A130BarCodPar, P01822_A132BarCodReo, P01822_A129BarCod, P01822_A396EmprCod, P01822_A135BarColNom, P01822_A136BarColNum, P01822_A218BarTipCol, P01822_A252CliCod, P01822_n252CliCod, P01822_A212BarSer,
            P01822_A120BarAgrEst
            }
            , new Object[] {
            P01823_A130BarCodPar, P01823_A132BarCodReo, P01823_A129BarCod, P01823_A396EmprCod, P01823_A119BarAgrCod, P01823_A124BarAgrReo, P01823_A122BarAgrPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV19Bartipcolp ;
   private byte AV12Flag ;
   private byte A124BarAgrReo ;
   private byte GXv_int8[] ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int AV18Barcolnump ;
   private int AV20Barclicodp ;
   private int A119BarAgrCod ;
   private int GXv_int7[] ;
   private int GXv_int3[] ;
   private int GXv_int9[] ;
   private String AV8EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A120BarAgrEst ;
   private String AV17Barcolnomp ;
   private String AV21Barserp ;
   private String AV13BarAgrEst ;
   private String A122BarAgrPar ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private boolean n252CliCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01822_A130BarCodPar ;
   private byte[] P01822_A132BarCodReo ;
   private int[] P01822_A129BarCod ;
   private String[] P01822_A396EmprCod ;
   private String[] P01822_A135BarColNom ;
   private int[] P01822_A136BarColNum ;
   private byte[] P01822_A218BarTipCol ;
   private int[] P01822_A252CliCod ;
   private boolean[] P01822_n252CliCod ;
   private String[] P01822_A212BarSer ;
   private String[] P01822_A120BarAgrEst ;
   private String[] P01823_A130BarCodPar ;
   private byte[] P01823_A132BarCodReo ;
   private int[] P01823_A129BarCod ;
   private String[] P01823_A396EmprCod ;
   private int[] P01823_A119BarAgrCod ;
   private byte[] P01823_A124BarAgrReo ;
   private String[] P01823_A122BarAgrPar ;
}

final  class pnewcor2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01822", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarColNom, BarColNum, BarTipCol, CliCod, BarSer, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01823", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               return;
      }
   }

}

