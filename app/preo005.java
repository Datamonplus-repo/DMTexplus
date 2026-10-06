package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo005 extends GXProcedure
{
   public preo005( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo005.class ), "" );
   }

   public preo005( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 )
   {
      preo005.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        int[] aP7 ,
                        byte[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             byte[] aP8 ,
                             String[] aP9 )
   {
      preo005.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      preo005.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      preo005.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      preo005.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      preo005.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      preo005.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      preo005.this.A1664ParFasCod = aP6[0];
      this.aP6 = aP6;
      preo005.this.AV12BarCod_d = aP7[0];
      this.aP7 = aP7;
      preo005.this.AV13CodReo_d = aP8[0];
      this.aP8 = aP8;
      preo005.this.AV14CodPar_d = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04R02 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14079BarParPLC = P04R02_A14079BarParPLC[0] ;
         A13992BarParVMx = P04R02_A13992BarParVMx[0] ;
         A13991BarParVMn = P04R02_A13991BarParVMn[0] ;
         A12671BarParVl2 = P04R02_A12671BarParVl2[0] ;
         A10257Itm_ord5 = P04R02_A10257Itm_ord5[0] ;
         A9737BarValPar = P04R02_A9737BarValPar[0] ;
         A3693BarParTxt = P04R02_A3693BarParTxt[0] ;
         n3693BarParTxt = P04R02_n3693BarParTxt[0] ;
         A3296BarParObs = P04R02_A3296BarParObs[0] ;
         A3295BarParVal = P04R02_A3295BarParVal[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W1664ParFasCod = A1664ParFasCod ;
         /*
            INSERT RECORD ON TABLE TXPBarPar

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W1664ParFasCod = A1664ParFasCod ;
         W3295BarParVal = A3295BarParVal ;
         W3296BarParObs = A3296BarParObs ;
         W3693BarParTxt = A3693BarParTxt ;
         n3693BarParTxt = false ;
         W9737BarValPar = A9737BarValPar ;
         A129BarCod = AV12BarCod_d ;
         A132BarCodReo = AV13CodReo_d ;
         A130BarCodPar = AV14CodPar_d ;
         n3693BarParTxt = false ;
         /* Using cursor P04R03 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar, Short.valueOf(A10257Itm_ord5), A12671BarParVl2, A13991BarParVMn, A13992BarParVMx, A14079BarParPLC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A1664ParFasCod = W1664ParFasCod ;
         A3295BarParVal = W3295BarParVal ;
         A3296BarParObs = W3296BarParObs ;
         A3693BarParTxt = W3693BarParTxt ;
         n3693BarParTxt = false ;
         A9737BarValPar = W9737BarValPar ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A1664ParFasCod = W1664ParFasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo005.this.A396EmprCod;
      this.aP1[0] = preo005.this.A129BarCod;
      this.aP2[0] = preo005.this.A132BarCodReo;
      this.aP3[0] = preo005.this.A130BarCodPar;
      this.aP4[0] = preo005.this.A758ProCod;
      this.aP5[0] = preo005.this.A194BarOrdLin;
      this.aP6[0] = preo005.this.A1664ParFasCod;
      this.aP7[0] = preo005.this.AV12BarCod_d;
      this.aP8[0] = preo005.this.AV13CodReo_d;
      this.aP9[0] = preo005.this.AV14CodPar_d;
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
      P04R02_A396EmprCod = new String[] {""} ;
      P04R02_A129BarCod = new int[1] ;
      P04R02_A132BarCodReo = new byte[1] ;
      P04R02_A130BarCodPar = new String[] {""} ;
      P04R02_A758ProCod = new String[] {""} ;
      P04R02_A194BarOrdLin = new short[1] ;
      P04R02_A1664ParFasCod = new short[1] ;
      P04R02_A14079BarParPLC = new String[] {""} ;
      P04R02_A13992BarParVMx = new String[] {""} ;
      P04R02_A13991BarParVMn = new String[] {""} ;
      P04R02_A12671BarParVl2 = new String[] {""} ;
      P04R02_A10257Itm_ord5 = new short[1] ;
      P04R02_A9737BarValPar = new String[] {""} ;
      P04R02_A3693BarParTxt = new String[] {""} ;
      P04R02_n3693BarParTxt = new boolean[] {false} ;
      P04R02_A3296BarParObs = new String[] {""} ;
      P04R02_A3295BarParVal = new String[] {""} ;
      A14079BarParPLC = "" ;
      A13992BarParVMx = "" ;
      A13991BarParVMn = "" ;
      A12671BarParVl2 = "" ;
      A9737BarValPar = "" ;
      A3693BarParTxt = "" ;
      A3296BarParObs = "" ;
      A3295BarParVal = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W3295BarParVal = "" ;
      W3296BarParObs = "" ;
      W3693BarParTxt = "" ;
      W9737BarValPar = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo005__default(),
         new Object[] {
             new Object[] {
            P04R02_A396EmprCod, P04R02_A129BarCod, P04R02_A132BarCodReo, P04R02_A130BarCodPar, P04R02_A758ProCod, P04R02_A194BarOrdLin, P04R02_A1664ParFasCod, P04R02_A14079BarParPLC, P04R02_A13992BarParVMx, P04R02_A13991BarParVMn,
            P04R02_A12671BarParVl2, P04R02_A10257Itm_ord5, P04R02_A9737BarValPar, P04R02_A3693BarParTxt, P04R02_n3693BarParTxt, P04R02_A3296BarParObs, P04R02_A3295BarParVal
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13CodReo_d ;
   private byte W132BarCodReo ;
   private short A194BarOrdLin ;
   private short A1664ParFasCod ;
   private short A10257Itm_ord5 ;
   private short W194BarOrdLin ;
   private short W1664ParFasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12BarCod_d ;
   private int W129BarCod ;
   private int GX_INS475 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV14CodPar_d ;
   private String scmdbuf ;
   private String A14079BarParPLC ;
   private String A13992BarParVMx ;
   private String A13991BarParVMn ;
   private String A12671BarParVl2 ;
   private String A9737BarValPar ;
   private String A3296BarParObs ;
   private String A3295BarParVal ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W3295BarParVal ;
   private String W3296BarParObs ;
   private String W9737BarValPar ;
   private String Gx_emsg ;
   private boolean n3693BarParTxt ;
   private String A3693BarParTxt ;
   private String W3693BarParTxt ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private int[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P04R02_A396EmprCod ;
   private int[] P04R02_A129BarCod ;
   private byte[] P04R02_A132BarCodReo ;
   private String[] P04R02_A130BarCodPar ;
   private String[] P04R02_A758ProCod ;
   private short[] P04R02_A194BarOrdLin ;
   private short[] P04R02_A1664ParFasCod ;
   private String[] P04R02_A14079BarParPLC ;
   private String[] P04R02_A13992BarParVMx ;
   private String[] P04R02_A13991BarParVMn ;
   private String[] P04R02_A12671BarParVl2 ;
   private short[] P04R02_A10257Itm_ord5 ;
   private String[] P04R02_A9737BarValPar ;
   private String[] P04R02_A3693BarParTxt ;
   private boolean[] P04R02_n3693BarParTxt ;
   private String[] P04R02_A3296BarParObs ;
   private String[] P04R02_A3295BarParVal ;
}

final  class preo005__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04R02", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParPLC, BarParVMx, BarParVMn, BarParVl2, Itm_ord5, BarValPar, BarParTxt, BarParObs, BarParVal FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and ParFasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04R03", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 60);
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 8);
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 12);
               stmt.setString(14, (String)parms[14], 12);
               stmt.setString(15, (String)parms[15], 12);
               stmt.setString(16, (String)parms[16], 100);
               return;
      }
   }

}

