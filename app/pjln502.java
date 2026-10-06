package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pjln502 extends GXProcedure
{
   public pjln502( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pjln502.class ), "" );
   }

   public pjln502( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 )
   {
      pjln502.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 )
   {
      pjln502.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pjln502.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pjln502.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pjln502.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pjln502.this.AV12Maqcod = aP4[0];
      this.aP4 = aP4;
      pjln502.this.AV13Linei = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13Linei = 0 ;
      AV12Maqcod = " " ;
      /* Using cursor P034G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A602MaqCod = P034G2_A602MaqCod[0] ;
         A2804RecLinMaq = P034G2_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(GXutil.substring( A602MaqCod, 1, 2), httpContext.getMessage( "TI", "")) == 0 )
         {
            AV12Maqcod = A602MaqCod ;
         }
         AV13Linei = (int)(AV13Linei+1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pjln502.this.A396EmprCod;
      this.aP1[0] = pjln502.this.A129BarCod;
      this.aP2[0] = pjln502.this.A132BarCodReo;
      this.aP3[0] = pjln502.this.A130BarCodPar;
      this.aP4[0] = pjln502.this.AV12Maqcod;
      this.aP5[0] = pjln502.this.AV13Linei;
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
      P034G2_A396EmprCod = new String[] {""} ;
      P034G2_A129BarCod = new int[1] ;
      P034G2_A132BarCodReo = new byte[1] ;
      P034G2_A130BarCodPar = new String[] {""} ;
      P034G2_A602MaqCod = new String[] {""} ;
      P034G2_A2804RecLinMaq = new short[1] ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pjln502__default(),
         new Object[] {
             new Object[] {
            P034G2_A396EmprCod, P034G2_A129BarCod, P034G2_A132BarCodReo, P034G2_A130BarCodPar, P034G2_A602MaqCod, P034G2_A2804RecLinMaq
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV13Linei ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV12Maqcod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P034G2_A396EmprCod ;
   private int[] P034G2_A129BarCod ;
   private byte[] P034G2_A132BarCodReo ;
   private String[] P034G2_A130BarCodPar ;
   private String[] P034G2_A602MaqCod ;
   private short[] P034G2_A2804RecLinMaq ;
}

final  class pjln502__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P034G2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MaqCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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

