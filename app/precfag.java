package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class precfag extends GXProcedure
{
   public precfag( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precfag.class ), "" );
   }

   public precfag( int remoteHandle ,
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
      precfag.this.aP4 = new byte[] {0};
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
      precfag.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      precfag.this.AV9BarCod = aP1[0];
      this.aP1 = aP1;
      precfag.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      precfag.this.AV11BarCodPar = aP3[0];
      this.aP3 = aP3;
      precfag.this.AV8Flag = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Flag = (byte)(0) ;
      /* Using cursor P017P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4274RecBarCAg = P017P2_A4274RecBarCAg[0] ;
         A4275RecBarRAg = P017P2_A4275RecBarRAg[0] ;
         A4276RecBarPAg = P017P2_A4276RecBarPAg[0] ;
         A129BarCod = P017P2_A129BarCod[0] ;
         A132BarCodReo = P017P2_A132BarCodReo[0] ;
         A130BarCodPar = P017P2_A130BarCodPar[0] ;
         A2804RecLinMaq = P017P2_A2804RecLinMaq[0] ;
         A4698RecBarNPd = P017P2_A4698RecBarNPd[0] ;
         A4699RecBarOrd = P017P2_A4699RecBarOrd[0] ;
         AV8Flag = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = precfag.this.A396EmprCod;
      this.aP1[0] = precfag.this.AV9BarCod;
      this.aP2[0] = precfag.this.AV10BarCodReo;
      this.aP3[0] = precfag.this.AV11BarCodPar;
      this.aP4[0] = precfag.this.AV8Flag;
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
      P017P2_A396EmprCod = new String[] {""} ;
      P017P2_A4274RecBarCAg = new int[1] ;
      P017P2_A4275RecBarRAg = new byte[1] ;
      P017P2_A4276RecBarPAg = new String[] {""} ;
      P017P2_A129BarCod = new int[1] ;
      P017P2_A132BarCodReo = new byte[1] ;
      P017P2_A130BarCodPar = new String[] {""} ;
      P017P2_A2804RecLinMaq = new short[1] ;
      P017P2_A4698RecBarNPd = new int[1] ;
      P017P2_A4699RecBarOrd = new short[1] ;
      A4276RecBarPAg = "" ;
      A130BarCodPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.precfag__default(),
         new Object[] {
             new Object[] {
            P017P2_A396EmprCod, P017P2_A4274RecBarCAg, P017P2_A4275RecBarRAg, P017P2_A4276RecBarPAg, P017P2_A129BarCod, P017P2_A132BarCodReo, P017P2_A130BarCodPar, P017P2_A2804RecLinMaq, P017P2_A4698RecBarNPd, P017P2_A4699RecBarOrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV8Flag ;
   private byte A4275RecBarRAg ;
   private byte A132BarCodReo ;
   private short A2804RecLinMaq ;
   private short A4699RecBarOrd ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int A4274RecBarCAg ;
   private int A129BarCod ;
   private int A4698RecBarNPd ;
   private String A396EmprCod ;
   private String AV11BarCodPar ;
   private String scmdbuf ;
   private String A4276RecBarPAg ;
   private String A130BarCodPar ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P017P2_A396EmprCod ;
   private int[] P017P2_A4274RecBarCAg ;
   private byte[] P017P2_A4275RecBarRAg ;
   private String[] P017P2_A4276RecBarPAg ;
   private int[] P017P2_A129BarCod ;
   private byte[] P017P2_A132BarCodReo ;
   private String[] P017P2_A130BarCodPar ;
   private short[] P017P2_A2804RecLinMaq ;
   private int[] P017P2_A4698RecBarNPd ;
   private short[] P017P2_A4699RecBarOrd ;
}

final  class precfag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P017P2", "SELECT EmprCod, RecBarCAg, RecBarRAg, RecBarPAg, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecBarNPd, RecBarOrd FROM TXPRECFAG WHERE EmprCod = ? and RecBarCAg = ? and RecBarRAg = ? and RecBarPAg = ? ORDER BY EmprCod, RecBarCAg, RecBarRAg, RecBarPAg ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
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

