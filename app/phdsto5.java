package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdsto5 extends GXProcedure
{
   public phdsto5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdsto5.class ), "" );
   }

   public phdsto5( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      phdsto5.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      phdsto5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdsto5.this.AV9Barcod = aP1[0];
      this.aP1 = aP1;
      phdsto5.this.AV10Barcodreo = aP2[0];
      this.aP2 = aP2;
      phdsto5.this.AV11Barcodpar = aP3[0];
      this.aP3 = aP3;
      phdsto5.this.AV15Stp_est = aP4[0];
      this.aP4 = aP4;
      phdsto5.this.AV8Stp_mot = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Stp_mot = httpContext.getMessage( "Hdr Suspendida", "") + GXutil.chr( (short)(13)) ;
      /* Using cursor P04D32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV10Barcodreo), AV11Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10748Stp_p = P04D32_A10748Stp_p[0] ;
         A10747Stp_r = P04D32_A10747Stp_r[0] ;
         A10746Stp_hdr = P04D32_A10746Stp_hdr[0] ;
         A10755Stp_Est = P04D32_A10755Stp_Est[0] ;
         A10752Stp_Mot = P04D32_A10752Stp_Mot[0] ;
         A10750Stp_Lin = P04D32_A10750Stp_Lin[0] ;
         AV15Stp_est = A10755Stp_Est ;
         if ( AV15Stp_est == 1 )
         {
            AV8Stp_mot += GXutil.trim( A10752Stp_Mot) + GXutil.chr( (short)(13)) ;
         }
         else
         {
            AV8Stp_mot = " " ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdsto5.this.A396EmprCod;
      this.aP1[0] = phdsto5.this.AV9Barcod;
      this.aP2[0] = phdsto5.this.AV10Barcodreo;
      this.aP3[0] = phdsto5.this.AV11Barcodpar;
      this.aP4[0] = phdsto5.this.AV15Stp_est;
      this.aP5[0] = phdsto5.this.AV8Stp_mot;
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
      P04D32_A396EmprCod = new String[] {""} ;
      P04D32_A10748Stp_p = new String[] {""} ;
      P04D32_A10747Stp_r = new byte[1] ;
      P04D32_A10746Stp_hdr = new int[1] ;
      P04D32_A10755Stp_Est = new byte[1] ;
      P04D32_A10752Stp_Mot = new String[] {""} ;
      P04D32_A10750Stp_Lin = new short[1] ;
      A10748Stp_p = "" ;
      A10752Stp_Mot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdsto5__default(),
         new Object[] {
             new Object[] {
            P04D32_A396EmprCod, P04D32_A10748Stp_p, P04D32_A10747Stp_r, P04D32_A10746Stp_hdr, P04D32_A10755Stp_Est, P04D32_A10752Stp_Mot, P04D32_A10750Stp_Lin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10Barcodreo ;
   private byte AV15Stp_est ;
   private byte A10747Stp_r ;
   private byte A10755Stp_Est ;
   private short A10750Stp_Lin ;
   private short Gx_err ;
   private int AV9Barcod ;
   private int A10746Stp_hdr ;
   private String A396EmprCod ;
   private String AV11Barcodpar ;
   private String scmdbuf ;
   private String A10748Stp_p ;
   private String AV8Stp_mot ;
   private String A10752Stp_Mot ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04D32_A396EmprCod ;
   private String[] P04D32_A10748Stp_p ;
   private byte[] P04D32_A10747Stp_r ;
   private int[] P04D32_A10746Stp_hdr ;
   private byte[] P04D32_A10755Stp_Est ;
   private String[] P04D32_A10752Stp_Mot ;
   private short[] P04D32_A10750Stp_Lin ;
}

final  class phdsto5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04D32", "SELECT EmprCod, Stp_p, Stp_r, Stp_hdr, Stp_Est, Stp_Mot, Stp_Lin FROM TXPHDSTO1 WHERE EmprCod = ? and Stp_hdr = ? and Stp_r = ? and Stp_p = ? ORDER BY EmprCod, Stp_hdr, Stp_r, Stp_p ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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

