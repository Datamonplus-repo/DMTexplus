package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdisreftpz extends GXProcedure
{
   public pdisreftpz( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdisreftpz.class ), "" );
   }

   public pdisreftpz( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      pdisreftpz.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      pdisreftpz.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdisreftpz.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pdisreftpz.this.AV8DisRefTPz = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9DetPie = (byte)(0) ;
      GXv_int1[0] = AV9DetPie ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DETPIE", ""), GXv_int1) ;
      pdisreftpz.this.AV9DetPie = GXv_int1[0] ;
      AV8DisRefTPz = (short)(0) ;
      /* Using cursor P00W92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3403DisRefPie = P00W92_A3403DisRefPie[0] ;
         n3403DisRefPie = P00W92_n3403DisRefPie[0] ;
         A3398DisRefBarC = P00W92_A3398DisRefBarC[0] ;
         A3399DisRefBCRe = P00W92_A3399DisRefBCRe[0] ;
         A3400DisRefBCPa = P00W92_A3400DisRefBCPa[0] ;
         A3607DisRefBPie = P00W92_A3607DisRefBPie[0] ;
         if ( AV9DetPie == 0 )
         {
            AV8DisRefTPz = (short)(AV8DisRefTPz+A3403DisRefPie) ;
         }
         else
         {
            AV8DisRefTPz = (short)(AV8DisRefTPz+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdisreftpz.this.A396EmprCod;
      this.aP1[0] = pdisreftpz.this.A361DisCod;
      this.aP2[0] = pdisreftpz.this.AV8DisRefTPz;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00W92_A396EmprCod = new String[] {""} ;
      P00W92_A361DisCod = new int[1] ;
      P00W92_A3403DisRefPie = new short[1] ;
      P00W92_n3403DisRefPie = new boolean[] {false} ;
      P00W92_A3398DisRefBarC = new int[1] ;
      P00W92_A3399DisRefBCRe = new byte[1] ;
      P00W92_A3400DisRefBCPa = new String[] {""} ;
      P00W92_A3607DisRefBPie = new String[] {""} ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdisreftpz__default(),
         new Object[] {
             new Object[] {
            P00W92_A396EmprCod, P00W92_A361DisCod, P00W92_A3403DisRefPie, P00W92_n3403DisRefPie, P00W92_A3398DisRefBarC, P00W92_A3399DisRefBCRe, P00W92_A3400DisRefBCPa, P00W92_A3607DisRefBPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9DetPie ;
   private byte GXv_int1[] ;
   private byte A3399DisRefBCRe ;
   private short AV8DisRefTPz ;
   private short A3403DisRefPie ;
   private short Gx_err ;
   private int A361DisCod ;
   private int A3398DisRefBarC ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private boolean n3403DisRefPie ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00W92_A396EmprCod ;
   private int[] P00W92_A361DisCod ;
   private short[] P00W92_A3403DisRefPie ;
   private boolean[] P00W92_n3403DisRefPie ;
   private int[] P00W92_A3398DisRefBarC ;
   private byte[] P00W92_A3399DisRefBCRe ;
   private String[] P00W92_A3400DisRefBCPa ;
   private String[] P00W92_A3607DisRefBPie ;
}

final  class pdisreftpz__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00W92", "SELECT EmprCod, DisCod, DisRefPie, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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
               return;
      }
   }

}

