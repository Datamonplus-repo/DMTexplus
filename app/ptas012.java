package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptas012 extends GXProcedure
{
   public ptas012( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptas012.class ), "" );
   }

   public ptas012( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      ptas012.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      ptas012.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptas012.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      ptas012.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      ptas012.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02O92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A118BarAcaQui = P02O92_A118BarAcaQui[0] ;
         AV11Baracaqui = A118BarAcaQui ;
         /* Using cursor P02O93 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6035Ac_Kilos = P02O93_A6035Ac_Kilos[0] ;
            n6035Ac_Kilos = P02O93_n6035Ac_Kilos[0] ;
            A6031Ac_Barcod = P02O93_A6031Ac_Barcod[0] ;
            A6032Ac_BarReo = P02O93_A6032Ac_BarReo[0] ;
            A6033Ac_BarPar = P02O93_A6033Ac_BarPar[0] ;
            AV12Emprcod = A396EmprCod ;
            AV8Barcod = A129BarCod ;
            AV9Barcodreo = A132BarCodReo ;
            AV10Barcodpar = A130BarCodPar ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A6031Ac_Barcod ;
            GXv_int3[0] = A6032Ac_BarReo ;
            GXv_char4[0] = A6033Ac_BarPar ;
            GXv_char5[0] = AV11Baracaqui ;
            new app.ptas006(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_char5) ;
            ptas012.this.A396EmprCod = GXv_char1[0] ;
            ptas012.this.A6031Ac_Barcod = GXv_int2[0] ;
            ptas012.this.A6032Ac_BarReo = GXv_int3[0] ;
            ptas012.this.A6033Ac_BarPar = GXv_char4[0] ;
            ptas012.this.AV11Baracaqui = GXv_char5[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptas012.this.A396EmprCod;
      this.aP1[0] = ptas012.this.A129BarCod;
      this.aP2[0] = ptas012.this.A132BarCodReo;
      this.aP3[0] = ptas012.this.A130BarCodPar;
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
      P02O92_A396EmprCod = new String[] {""} ;
      P02O92_A129BarCod = new int[1] ;
      P02O92_A132BarCodReo = new byte[1] ;
      P02O92_A130BarCodPar = new String[] {""} ;
      P02O92_A118BarAcaQui = new String[] {""} ;
      A118BarAcaQui = "" ;
      AV11Baracaqui = "" ;
      P02O93_A396EmprCod = new String[] {""} ;
      P02O93_A129BarCod = new int[1] ;
      P02O93_A132BarCodReo = new byte[1] ;
      P02O93_A130BarCodPar = new String[] {""} ;
      P02O93_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02O93_n6035Ac_Kilos = new boolean[] {false} ;
      P02O93_A6031Ac_Barcod = new int[1] ;
      P02O93_A6032Ac_BarReo = new byte[1] ;
      P02O93_A6033Ac_BarPar = new String[] {""} ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      AV12Emprcod = "" ;
      AV10Barcodpar = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptas012__default(),
         new Object[] {
             new Object[] {
            P02O92_A396EmprCod, P02O92_A129BarCod, P02O92_A132BarCodReo, P02O92_A130BarCodPar, P02O92_A118BarAcaQui
            }
            , new Object[] {
            P02O93_A396EmprCod, P02O93_A129BarCod, P02O93_A132BarCodReo, P02O93_A130BarCodPar, P02O93_A6035Ac_Kilos, P02O93_n6035Ac_Kilos, P02O93_A6031Ac_Barcod, P02O93_A6032Ac_BarReo, P02O93_A6033Ac_BarPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A6032Ac_BarReo ;
   private byte AV9Barcodreo ;
   private byte GXv_int3[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A6031Ac_Barcod ;
   private int AV8Barcod ;
   private int GXv_int2[] ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A118BarAcaQui ;
   private String AV11Baracaqui ;
   private String A6033Ac_BarPar ;
   private String AV12Emprcod ;
   private String AV10Barcodpar ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private boolean n6035Ac_Kilos ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02O92_A396EmprCod ;
   private int[] P02O92_A129BarCod ;
   private byte[] P02O92_A132BarCodReo ;
   private String[] P02O92_A130BarCodPar ;
   private String[] P02O92_A118BarAcaQui ;
   private String[] P02O93_A396EmprCod ;
   private int[] P02O93_A129BarCod ;
   private byte[] P02O93_A132BarCodReo ;
   private String[] P02O93_A130BarCodPar ;
   private java.math.BigDecimal[] P02O93_A6035Ac_Kilos ;
   private boolean[] P02O93_n6035Ac_Kilos ;
   private int[] P02O93_A6031Ac_Barcod ;
   private byte[] P02O93_A6032Ac_BarReo ;
   private String[] P02O93_A6033Ac_BarPar ;
}

final  class ptas012__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02O92", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02O93", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Kilos, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

