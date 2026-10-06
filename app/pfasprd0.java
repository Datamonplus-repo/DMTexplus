package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasprd0 extends GXProcedure
{
   public pfasprd0( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasprd0.class ), "" );
   }

   public pfasprd0( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      pfasprd0.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      pfasprd0.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasprd0.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfasprd0.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfasprd0.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfasprd0.this.AV12BarCtrFas = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Num_fases = 0 ;
      AV9Fases_p = 0 ;
      AV10Fases_noi = 0 ;
      AV11Fases_t = 0 ;
      /* Using cursor P01L12 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4022BarNumBot = P01L12_A4022BarNumBot[0] ;
         A153BarFasEst = P01L12_A153BarFasEst[0] ;
         A758ProCod = P01L12_A758ProCod[0] ;
         A194BarOrdLin = P01L12_A194BarOrdLin[0] ;
         if ( A4022BarNumBot == 0 )
         {
            AV10Fases_noi = (int)(AV10Fases_noi+1) ;
         }
         else if ( A4022BarNumBot == 1 )
         {
            AV9Fases_p = (int)(AV9Fases_p+1) ;
         }
         else if ( A4022BarNumBot == 2 )
         {
            AV11Fases_t = (int)(AV11Fases_t+1) ;
         }
         else
         {
         }
         AV8Num_fases = (int)(AV8Num_fases+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV8Num_fases == AV10Fases_noi )
      {
         AV12BarCtrFas = (byte)(0) ;
      }
      if ( AV11Fases_t == AV8Num_fases )
      {
         AV12BarCtrFas = (byte)(2) ;
      }
      if ( ( AV9Fases_p > 0 ) || ( ( AV11Fases_t > 0 ) && ( AV11Fases_t != AV8Num_fases ) ) )
      {
         AV12BarCtrFas = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasprd0.this.A396EmprCod;
      this.aP1[0] = pfasprd0.this.A129BarCod;
      this.aP2[0] = pfasprd0.this.A132BarCodReo;
      this.aP3[0] = pfasprd0.this.A130BarCodPar;
      this.aP4[0] = pfasprd0.this.AV12BarCtrFas;
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
      P01L12_A396EmprCod = new String[] {""} ;
      P01L12_A129BarCod = new int[1] ;
      P01L12_A132BarCodReo = new byte[1] ;
      P01L12_A130BarCodPar = new String[] {""} ;
      P01L12_A4022BarNumBot = new int[1] ;
      P01L12_A153BarFasEst = new byte[1] ;
      P01L12_A758ProCod = new String[] {""} ;
      P01L12_A194BarOrdLin = new short[1] ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasprd0__default(),
         new Object[] {
             new Object[] {
            P01L12_A396EmprCod, P01L12_A129BarCod, P01L12_A132BarCodReo, P01L12_A130BarCodPar, P01L12_A4022BarNumBot, P01L12_A153BarFasEst, P01L12_A758ProCod, P01L12_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12BarCtrFas ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV8Num_fases ;
   private int AV9Fases_p ;
   private int AV10Fases_noi ;
   private int AV11Fases_t ;
   private int A4022BarNumBot ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A758ProCod ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01L12_A396EmprCod ;
   private int[] P01L12_A129BarCod ;
   private byte[] P01L12_A132BarCodReo ;
   private String[] P01L12_A130BarCodPar ;
   private int[] P01L12_A4022BarNumBot ;
   private byte[] P01L12_A153BarFasEst ;
   private String[] P01L12_A758ProCod ;
   private short[] P01L12_A194BarOrdLin ;
}

final  class pfasprd0__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01L12", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNumBot, BarFasEst, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarNumBot <= 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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

