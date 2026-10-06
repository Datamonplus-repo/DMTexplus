package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmasdat extends GXProcedure
{
   public pmasdat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmasdat.class ), "" );
   }

   public pmasdat( int remoteHandle ,
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
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pmasdat.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 )
   {
      pmasdat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmasdat.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmasdat.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmasdat.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pmasdat.this.AV19HisProLot = aP4[0];
      this.aP4 = aP4;
      pmasdat.this.AV20HisProTc = aP5[0];
      this.aP5 = aP5;
      pmasdat.this.AV21HisProReo = aP6[0];
      this.aP6 = aP6;
      pmasdat.this.AV22Fase = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23FasActTin = httpContext.getMessage( "N", "") ;
      /* Using cursor P00UT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV22Fase});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P00UT2_A457FasCod[0] ;
         A456FasActTin = P00UT2_A456FasActTin[0] ;
         n456FasActTin = P00UT2_n456FasActTin[0] ;
         AV23FasActTin = A456FasActTin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV19HisProLot = "" ;
      AV21HisProReo = (byte)(0) ;
      AV20HisProTc = (byte)(0) ;
      /* Using cursor P00UT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A148BarEstReo = P00UT3_A148BarEstReo[0] ;
         A218BarTipCol = P00UT3_A218BarTipCol[0] ;
         AV21HisProReo = A148BarEstReo ;
         AV20HisProTc = A218BarTipCol ;
         AV15EmprCod = A396EmprCod ;
         AV16BarCodA = A129BarCod ;
         AV17BarCodReoA = A132BarCodReo ;
         AV18BarCodParA = A130BarCodPar ;
         if ( GXutil.strcmp(AV23FasActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( AV15EmprCod, AV16BarCodA, AV17BarCodReoA, AV18BarCodParA) ;
         }
         AV19HisProLot = GXutil.str( AV16BarCodA, 8, 0) + GXutil.str( AV17BarCodReoA, 1, 0) + AV18BarCodParA ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmasdat.this.A396EmprCod;
      this.aP1[0] = pmasdat.this.A129BarCod;
      this.aP2[0] = pmasdat.this.A132BarCodReo;
      this.aP3[0] = pmasdat.this.A130BarCodPar;
      this.aP4[0] = pmasdat.this.AV19HisProLot;
      this.aP5[0] = pmasdat.this.AV20HisProTc;
      this.aP6[0] = pmasdat.this.AV21HisProReo;
      this.aP7[0] = pmasdat.this.AV22Fase;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23FasActTin = "" ;
      scmdbuf = "" ;
      P00UT2_A396EmprCod = new String[] {""} ;
      P00UT2_A457FasCod = new String[] {""} ;
      P00UT2_A456FasActTin = new String[] {""} ;
      P00UT2_n456FasActTin = new boolean[] {false} ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      P00UT3_A396EmprCod = new String[] {""} ;
      P00UT3_A129BarCod = new int[1] ;
      P00UT3_A132BarCodReo = new byte[1] ;
      P00UT3_A130BarCodPar = new String[] {""} ;
      P00UT3_A148BarEstReo = new byte[1] ;
      P00UT3_A218BarTipCol = new byte[1] ;
      AV15EmprCod = "" ;
      AV18BarCodParA = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmasdat__default(),
         new Object[] {
             new Object[] {
            P00UT2_A396EmprCod, P00UT2_A457FasCod, P00UT2_A456FasActTin, P00UT2_n456FasActTin
            }
            , new Object[] {
            P00UT3_A396EmprCod, P00UT3_A129BarCod, P00UT3_A132BarCodReo, P00UT3_A130BarCodPar, P00UT3_A148BarEstReo, P00UT3_A218BarTipCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV20HisProTc ;
   private byte AV21HisProReo ;
   private byte A148BarEstReo ;
   private byte A218BarTipCol ;
   private byte AV17BarCodReoA ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16BarCodA ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV19HisProLot ;
   private String AV22Fase ;
   private String AV23FasActTin ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String AV15EmprCod ;
   private String AV18BarCodParA ;
   private boolean n456FasActTin ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00UT2_A396EmprCod ;
   private String[] P00UT2_A457FasCod ;
   private String[] P00UT2_A456FasActTin ;
   private boolean[] P00UT2_n456FasActTin ;
   private String[] P00UT3_A396EmprCod ;
   private int[] P00UT3_A129BarCod ;
   private byte[] P00UT3_A132BarCodReo ;
   private String[] P00UT3_A130BarCodPar ;
   private byte[] P00UT3_A148BarEstReo ;
   private byte[] P00UT3_A218BarTipCol ;
}

final  class pmasdat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00UT2", "SELECT EmprCod, FasCod, FasActTin FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00UT3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarEstReo, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               stmt.setString(2, (String)parms[1], 8);
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

