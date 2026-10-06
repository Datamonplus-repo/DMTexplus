package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacagr extends GXProcedure
{
   public pmacagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacagr.class ), "" );
   }

   public pmacagr( int remoteHandle ,
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
      pmacagr.this.aP6 = new String[] {""};
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
      pmacagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacagr.this.AV12MacCod1 = aP1[0];
      this.aP1 = aP1;
      pmacagr.this.AV8BarCod = aP2[0];
      this.aP2 = aP2;
      pmacagr.this.AV9BarCodReo = aP3[0];
      this.aP3 = aP3;
      pmacagr.this.AV10BarCodPar = aP4[0];
      this.aP4 = aP4;
      pmacagr.this.AV14Err_l = aP5[0];
      this.aP5 = aP5;
      pmacagr.this.AV17MsgE = aP6[0];
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
      /* Using cursor P02G22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1203MacBarCod = P02G22_A1203MacBarCod[0] ;
         A1204MacBarReo = P02G22_A1204MacBarReo[0] ;
         A1205MacBarPar = P02G22_A1205MacBarPar[0] ;
         A1199MacCod = P02G22_A1199MacCod[0] ;
         A1201MacLin = P02G22_A1201MacLin[0] ;
         AV11MacCod2 = A1199MacCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( AV12MacCod1 != AV11MacCod2 ) && ( AV11MacCod2 > 0 ) )
      {
         AV17MsgE = httpContext.getMessage( "Atencion. Esta OS ya esta agrupada", "") + GXutil.newLine( ) + httpContext.getMessage( "Su Macro es ", "") + GXutil.str( AV11MacCod2, 8, 0) + GXutil.newLine( ) ;
         AV14Err_l = (byte)(1) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV12MacCod1 == AV11MacCod2 ) && ( AV11MacCod2 > 0 ) && ( AV12MacCod1 > 0 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15BarAgr = (byte)(0) ;
      AV16Hdrs = " " ;
      /* Using cursor P02G23 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P02G23_A130BarCodPar[0] ;
         A132BarCodReo = P02G23_A132BarCodReo[0] ;
         A129BarCod = P02G23_A129BarCod[0] ;
         A590KgmAgr = P02G23_A590KgmAgr[0] ;
         A122BarAgrPar = P02G23_A122BarAgrPar[0] ;
         A124BarAgrReo = P02G23_A124BarAgrReo[0] ;
         A119BarAgrCod = P02G23_A119BarAgrCod[0] ;
         AV15BarAgr = (byte)(1) ;
         if ( GXutil.strcmp(AV16Hdrs, " ") == 0 )
         {
            AV16Hdrs = GXutil.str( A119BarAgrCod, 8, 0) + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar + "/" ;
         }
         else
         {
            AV16Hdrs += GXutil.str( A119BarAgrCod, 8, 0) + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar + "/" ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV15BarAgr == 1 )
      {
         AV17MsgE = httpContext.getMessage( "Atencion. Esta OS ya esta agrupada con otras..", "") + GXutil.newLine( ) ;
         AV14Err_l = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacagr.this.A396EmprCod;
      this.aP1[0] = pmacagr.this.AV12MacCod1;
      this.aP2[0] = pmacagr.this.AV8BarCod;
      this.aP3[0] = pmacagr.this.AV9BarCodReo;
      this.aP4[0] = pmacagr.this.AV10BarCodPar;
      this.aP5[0] = pmacagr.this.AV14Err_l;
      this.aP6[0] = pmacagr.this.AV17MsgE;
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
      P02G22_A396EmprCod = new String[] {""} ;
      P02G22_A1203MacBarCod = new int[1] ;
      P02G22_A1204MacBarReo = new byte[1] ;
      P02G22_A1205MacBarPar = new String[] {""} ;
      P02G22_A1199MacCod = new int[1] ;
      P02G22_A1201MacLin = new short[1] ;
      A1205MacBarPar = "" ;
      AV16Hdrs = "" ;
      P02G23_A396EmprCod = new String[] {""} ;
      P02G23_A130BarCodPar = new String[] {""} ;
      P02G23_A132BarCodReo = new byte[1] ;
      P02G23_A129BarCod = new int[1] ;
      P02G23_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02G23_A122BarAgrPar = new String[] {""} ;
      P02G23_A124BarAgrReo = new byte[1] ;
      P02G23_A119BarAgrCod = new int[1] ;
      A130BarCodPar = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A122BarAgrPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacagr__default(),
         new Object[] {
             new Object[] {
            P02G22_A396EmprCod, P02G22_A1203MacBarCod, P02G22_A1204MacBarReo, P02G22_A1205MacBarPar, P02G22_A1199MacCod, P02G22_A1201MacLin
            }
            , new Object[] {
            P02G23_A396EmprCod, P02G23_A130BarCodPar, P02G23_A132BarCodReo, P02G23_A129BarCod, P02G23_A590KgmAgr, P02G23_A122BarAgrPar, P02G23_A124BarAgrReo, P02G23_A119BarAgrCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV14Err_l ;
   private byte A1204MacBarReo ;
   private byte AV15BarAgr ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private short A1201MacLin ;
   private short Gx_err ;
   private int AV12MacCod1 ;
   private int AV8BarCod ;
   private int A1203MacBarCod ;
   private int A1199MacCod ;
   private int AV11MacCod2 ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private java.math.BigDecimal A590KgmAgr ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV17MsgE ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1205MacBarPar ;
   private String AV16Hdrs ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private boolean returnInSub ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02G22_A396EmprCod ;
   private int[] P02G22_A1203MacBarCod ;
   private byte[] P02G22_A1204MacBarReo ;
   private String[] P02G22_A1205MacBarPar ;
   private int[] P02G22_A1199MacCod ;
   private short[] P02G22_A1201MacLin ;
   private String[] P02G23_A396EmprCod ;
   private String[] P02G23_A130BarCodPar ;
   private byte[] P02G23_A132BarCodReo ;
   private int[] P02G23_A129BarCod ;
   private java.math.BigDecimal[] P02G23_A590KgmAgr ;
   private String[] P02G23_A122BarAgrPar ;
   private byte[] P02G23_A124BarAgrReo ;
   private int[] P02G23_A119BarAgrCod ;
}

final  class pmacagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02G22", "SELECT EmprCod, MacBarCod, MacBarReo, MacBarPar, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacBarCod = ? and MacBarReo = ? and MacBarPar = ? ORDER BY EmprCod, MacBarCod, MacBarReo, MacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02G23", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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

