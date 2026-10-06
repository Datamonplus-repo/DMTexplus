package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlacc extends GXProcedure
{
   public pctrlacc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlacc.class ), "" );
   }

   public pctrlacc( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pctrlacc.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pctrlacc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlacc.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      pctrlacc.this.AV11Barcodreo = aP2[0];
      this.aP2 = aP2;
      pctrlacc.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pctrlacc.this.AV13Msg_cc = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Msg_cc = " " ;
      AV12Maccod = 0 ;
      /* Using cursor P03UI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03UI2_A130BarCodPar[0] ;
         A132BarCodReo = P03UI2_A132BarCodReo[0] ;
         A129BarCod = P03UI2_A129BarCod[0] ;
         GXv_int1[0] = AV12Maccod ;
         new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int1) ;
         pctrlacc.this.AV12Maccod = GXv_int1[0] ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV12Maccod > 0 )
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlacc.this.A396EmprCod;
      this.aP1[0] = pctrlacc.this.AV9Barcod;
      this.aP2[0] = pctrlacc.this.AV11Barcodreo;
      this.aP3[0] = pctrlacc.this.AV10Barcodpar;
      this.aP4[0] = pctrlacc.this.AV13Msg_cc;
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
      P03UI2_A396EmprCod = new String[] {""} ;
      P03UI2_A130BarCodPar = new String[] {""} ;
      P03UI2_A132BarCodReo = new byte[1] ;
      P03UI2_A129BarCod = new int[1] ;
      A130BarCodPar = "" ;
      GXv_int1 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlacc__default(),
         new Object[] {
             new Object[] {
            P03UI2_A396EmprCod, P03UI2_A130BarCodPar, P03UI2_A132BarCodReo, P03UI2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11Barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int AV12Maccod ;
   private int A129BarCod ;
   private int GXv_int1[] ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV13Msg_cc ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03UI2_A396EmprCod ;
   private String[] P03UI2_A130BarCodPar ;
   private byte[] P03UI2_A132BarCodReo ;
   private int[] P03UI2_A129BarCod ;
}

final  class pctrlacc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03UI2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

