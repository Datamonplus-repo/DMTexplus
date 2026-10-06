package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pconfas extends GXProcedure
{
   public pconfas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pconfas.class ), "" );
   }

   public pconfas( int remoteHandle ,
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
                             byte[] aP5 )
   {
      pconfas.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pconfas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pconfas.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pconfas.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pconfas.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pconfas.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pconfas.this.AV8Flag = aP5[0];
      this.aP5 = aP5;
      pconfas.this.AV9FasCod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag = (byte)(0) ;
      /* Using cursor P01AP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01AP2_A457FasCod[0] ;
         A758ProCod = P01AP2_A758ProCod[0] ;
         AV8Flag = (byte)(1) ;
         AV9FasCod = A457FasCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pconfas.this.A396EmprCod;
      this.aP1[0] = pconfas.this.A129BarCod;
      this.aP2[0] = pconfas.this.A132BarCodReo;
      this.aP3[0] = pconfas.this.A130BarCodPar;
      this.aP4[0] = pconfas.this.A194BarOrdLin;
      this.aP5[0] = pconfas.this.AV8Flag;
      this.aP6[0] = pconfas.this.AV9FasCod;
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
      P01AP2_A396EmprCod = new String[] {""} ;
      P01AP2_A129BarCod = new int[1] ;
      P01AP2_A132BarCodReo = new byte[1] ;
      P01AP2_A130BarCodPar = new String[] {""} ;
      P01AP2_A194BarOrdLin = new short[1] ;
      P01AP2_A457FasCod = new String[] {""} ;
      P01AP2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pconfas__default(),
         new Object[] {
             new Object[] {
            P01AP2_A396EmprCod, P01AP2_A129BarCod, P01AP2_A132BarCodReo, P01AP2_A130BarCodPar, P01AP2_A194BarOrdLin, P01AP2_A457FasCod, P01AP2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Flag ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9FasCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P01AP2_A396EmprCod ;
   private int[] P01AP2_A129BarCod ;
   private byte[] P01AP2_A132BarCodReo ;
   private String[] P01AP2_A130BarCodPar ;
   private short[] P01AP2_A194BarOrdLin ;
   private String[] P01AP2_A457FasCod ;
   private String[] P01AP2_A758ProCod ;
}

final  class pconfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01AP2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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

