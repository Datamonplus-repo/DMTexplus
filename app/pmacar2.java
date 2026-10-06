package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacar2 extends GXProcedure
{
   public pmacar2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacar2.class ), "" );
   }

   public pmacar2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pmacar2.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pmacar2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacar2.this.AV12MacCod1 = aP1[0];
      this.aP1 = aP1;
      pmacar2.this.AV8BarCod = aP2[0];
      this.aP2 = aP2;
      pmacar2.this.AV9BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmacar2.this.AV10BarCodPar = aP4[0];
      this.aP4 = aP4;
      pmacar2.this.AV14Err_l = aP5[0];
      this.aP5 = aP5;
      pmacar2.this.AV17MsgE = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14Err_l = (byte)(0) ;
      Gx_msg = " " ;
      /* Using cursor P04ZG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12134MacArtHd = P04ZG2_A12134MacArtHd[0] ;
         n12134MacArtHd = P04ZG2_n12134MacArtHd[0] ;
         A12135MacArtR = P04ZG2_A12135MacArtR[0] ;
         n12135MacArtR = P04ZG2_n12135MacArtR[0] ;
         A12136MacArtP = P04ZG2_A12136MacArtP[0] ;
         n12136MacArtP = P04ZG2_n12136MacArtP[0] ;
         A12139MacCodId = P04ZG2_A12139MacCodId[0] ;
         A12140MacLinId = P04ZG2_A12140MacLinId[0] ;
         AV11MacCod2 = A12139MacCodId ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV12MacCod1 != AV11MacCod2 ) && ( AV11MacCod2 > 0 ) )
      {
         AV17MsgE = httpContext.getMessage( "Atencion. Esta HDR esta en el N Macro ", "") + GXutil.str( AV11MacCod2, 8, 0) ;
         AV14Err_l = (byte)(1) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacar2.this.A396EmprCod;
      this.aP1[0] = pmacar2.this.AV12MacCod1;
      this.aP2[0] = pmacar2.this.AV8BarCod;
      this.aP3[0] = pmacar2.this.AV9BarCodReo;
      this.aP4[0] = pmacar2.this.AV10BarCodPar;
      this.aP5[0] = pmacar2.this.AV14Err_l;
      this.aP6[0] = pmacar2.this.AV17MsgE;
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
      P04ZG2_A396EmprCod = new String[] {""} ;
      P04ZG2_A12134MacArtHd = new int[1] ;
      P04ZG2_n12134MacArtHd = new boolean[] {false} ;
      P04ZG2_A12135MacArtR = new byte[1] ;
      P04ZG2_n12135MacArtR = new boolean[] {false} ;
      P04ZG2_A12136MacArtP = new String[] {""} ;
      P04ZG2_n12136MacArtP = new boolean[] {false} ;
      P04ZG2_A12139MacCodId = new int[1] ;
      P04ZG2_A12140MacLinId = new short[1] ;
      A12136MacArtP = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacar2__default(),
         new Object[] {
             new Object[] {
            P04ZG2_A396EmprCod, P04ZG2_A12134MacArtHd, P04ZG2_n12134MacArtHd, P04ZG2_A12135MacArtR, P04ZG2_n12135MacArtR, P04ZG2_A12136MacArtP, P04ZG2_n12136MacArtP, P04ZG2_A12139MacCodId, P04ZG2_A12140MacLinId
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV14Err_l ;
   private byte A12135MacArtR ;
   private short A12140MacLinId ;
   private short Gx_err ;
   private int AV12MacCod1 ;
   private int AV8BarCod ;
   private int A12134MacArtHd ;
   private int A12139MacCodId ;
   private int AV11MacCod2 ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV17MsgE ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A12136MacArtP ;
   private boolean n12134MacArtHd ;
   private boolean n12135MacArtR ;
   private boolean n12136MacArtP ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04ZG2_A396EmprCod ;
   private int[] P04ZG2_A12134MacArtHd ;
   private boolean[] P04ZG2_n12134MacArtHd ;
   private byte[] P04ZG2_A12135MacArtR ;
   private boolean[] P04ZG2_n12135MacArtR ;
   private String[] P04ZG2_A12136MacArtP ;
   private boolean[] P04ZG2_n12136MacArtP ;
   private int[] P04ZG2_A12139MacCodId ;
   private short[] P04ZG2_A12140MacLinId ;
}

final  class pmacar2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04ZG2", "SELECT EmprCod, MacArtHd, MacArtR, MacArtP, MacCodId, MacLinId FROM TXPMACAR1 WHERE EmprCod = ? and MacArtHd = ? and MacArtR = ? and MacArtP = ? ORDER BY EmprCod, MacArtHd, MacArtR, MacArtP ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((short[]) buf[8])[0] = rslt.getShort(6);
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

