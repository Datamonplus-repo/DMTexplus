package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptotcon extends GXProcedure
{
   public ptotcon( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptotcon.class ), "" );
   }

   public ptotcon( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           short[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           byte[] aP8 )
   {
      ptotcon.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        byte[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             byte[] aP8 ,
                             byte[] aP9 )
   {
      ptotcon.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptotcon.this.A9611Lb_Hdr = aP1[0];
      this.aP1 = aP1;
      ptotcon.this.A9612Lb_Hdrr = aP2[0];
      this.aP2 = aP2;
      ptotcon.this.A9613Lb_Hdrp = aP3[0];
      this.aP3 = aP3;
      ptotcon.this.AV16Sedo1 = aP4[0];
      this.aP4 = aP4;
      ptotcon.this.AV17Sedo2 = aP5[0];
      this.aP5 = aP5;
      ptotcon.this.AV18Sedo3 = aP6[0];
      this.aP6 = aP6;
      ptotcon.this.AV19Sedo4 = aP7[0];
      this.aP7 = aP7;
      ptotcon.this.AV20Sedo5 = aP8[0];
      this.aP8 = aP8;
      ptotcon.this.AV21Sedo6 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Sedo1 = DecimalUtil.doubleToDec(0) ;
      AV17Sedo2 = DecimalUtil.doubleToDec(0) ;
      AV18Sedo3 = (short)(0) ;
      AV19Sedo4 = DecimalUtil.doubleToDec(0) ;
      AV20Sedo5 = (byte)(0) ;
      AV21Sedo6 = (byte)(0) ;
      AV24GXLvl8 = (byte)(0) ;
      /* Using cursor P00442 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10105Sedo1 = P00442_A10105Sedo1[0] ;
         n10105Sedo1 = P00442_n10105Sedo1[0] ;
         A10106Sedo2 = P00442_A10106Sedo2[0] ;
         n10106Sedo2 = P00442_n10106Sedo2[0] ;
         A10107Sedo3 = P00442_A10107Sedo3[0] ;
         n10107Sedo3 = P00442_n10107Sedo3[0] ;
         A10108Sedo4 = P00442_A10108Sedo4[0] ;
         n10108Sedo4 = P00442_n10108Sedo4[0] ;
         A10109Sedo5 = P00442_A10109Sedo5[0] ;
         n10109Sedo5 = P00442_n10109Sedo5[0] ;
         A10110Sedo6 = P00442_A10110Sedo6[0] ;
         n10110Sedo6 = P00442_n10110Sedo6[0] ;
         AV24GXLvl8 = (byte)(1) ;
         AV16Sedo1 = A10105Sedo1 ;
         AV17Sedo2 = A10106Sedo2 ;
         AV18Sedo3 = A10107Sedo3 ;
         AV19Sedo4 = A10108Sedo4 ;
         AV20Sedo5 = A10109Sedo5 ;
         AV21Sedo6 = A10110Sedo6 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV24GXLvl8 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPHDRINO

         */
         A9614Lb_UsuIn = " " ;
         n9614Lb_UsuIn = false ;
         A9615Lb_FecIn = GXutil.nullDate() ;
         n9615Lb_FecIn = false ;
         A9616Lb_UsuOut = " " ;
         n9616Lb_UsuOut = false ;
         A9617Lb_FecOut = GXutil.nullDate() ;
         n9617Lb_FecOut = false ;
         A9618Lb_inout = (byte)(0) ;
         n9618Lb_inout = false ;
         A9623Lb_FecTin = GXutil.nullDate() ;
         n9623Lb_FecTin = false ;
         A9624Lb_UsuTin = " " ;
         n9624Lb_UsuTin = false ;
         A9625Lb_obsin = " " ;
         n9625Lb_obsin = false ;
         A9703Lb_FecAcF = GXutil.nullDate() ;
         n9703Lb_FecAcF = false ;
         A9702Lb_FecPAc = GXutil.nullDate() ;
         n9702Lb_FecPAc = false ;
         A9709Lb_obsout = " " ;
         n9709Lb_obsout = false ;
         A9721Lb_obsprb = " " ;
         n9721Lb_obsprb = false ;
         A9857Ex_Obs = " " ;
         n9857Ex_Obs = false ;
         A10105Sedo1 = DecimalUtil.doubleToDec(0) ;
         n10105Sedo1 = false ;
         A10106Sedo2 = DecimalUtil.doubleToDec(0) ;
         n10106Sedo2 = false ;
         A10107Sedo3 = (short)(0) ;
         n10107Sedo3 = false ;
         A10108Sedo4 = DecimalUtil.doubleToDec(0) ;
         n10108Sedo4 = false ;
         A10109Sedo5 = (byte)(0) ;
         n10109Sedo5 = false ;
         A10110Sedo6 = (byte)(0) ;
         n10110Sedo6 = false ;
         A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
         n10152Lb_HhIn = false ;
         A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
         n10138Lb_HhOut = false ;
         A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
         n10153Lb_HhTin = false ;
         /* Using cursor P00443 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, Boolean.valueOf(n9614Lb_UsuIn), A9614Lb_UsuIn, Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9616Lb_UsuOut), A9616Lb_UsuOut, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9618Lb_inout), Byte.valueOf(A9618Lb_inout), Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9624Lb_UsuTin), A9624Lb_UsuTin, Boolean.valueOf(n9625Lb_obsin), A9625Lb_obsin, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9709Lb_obsout), A9709Lb_obsout, Boolean.valueOf(n9721Lb_obsprb), A9721Lb_obsprb, Boolean.valueOf(n9857Ex_Obs), A9857Ex_Obs, Boolean.valueOf(n10105Sedo1), A10105Sedo1, Boolean.valueOf(n10106Sedo2), A10106Sedo2, Boolean.valueOf(n10107Sedo3), Short.valueOf(A10107Sedo3), Boolean.valueOf(n10108Sedo4), A10108Sedo4, Boolean.valueOf(n10109Sedo5), Byte.valueOf(A10109Sedo5), Boolean.valueOf(n10110Sedo6), Byte.valueOf(A10110Sedo6), Boolean.valueOf(n10152Lb_HhIn), A10152Lb_HhIn, Boolean.valueOf(n10138Lb_HhOut), A10138Lb_HhOut, Boolean.valueOf(n10153Lb_HhTin), A10153Lb_HhTin});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptotcon.this.A396EmprCod;
      this.aP1[0] = ptotcon.this.A9611Lb_Hdr;
      this.aP2[0] = ptotcon.this.A9612Lb_Hdrr;
      this.aP3[0] = ptotcon.this.A9613Lb_Hdrp;
      this.aP4[0] = ptotcon.this.AV16Sedo1;
      this.aP5[0] = ptotcon.this.AV17Sedo2;
      this.aP6[0] = ptotcon.this.AV18Sedo3;
      this.aP7[0] = ptotcon.this.AV19Sedo4;
      this.aP8[0] = ptotcon.this.AV20Sedo5;
      this.aP9[0] = ptotcon.this.AV21Sedo6;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptotcon");
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
      P00442_A396EmprCod = new String[] {""} ;
      P00442_A9611Lb_Hdr = new int[1] ;
      P00442_A9612Lb_Hdrr = new byte[1] ;
      P00442_A9613Lb_Hdrp = new String[] {""} ;
      P00442_A10105Sedo1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00442_n10105Sedo1 = new boolean[] {false} ;
      P00442_A10106Sedo2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00442_n10106Sedo2 = new boolean[] {false} ;
      P00442_A10107Sedo3 = new short[1] ;
      P00442_n10107Sedo3 = new boolean[] {false} ;
      P00442_A10108Sedo4 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00442_n10108Sedo4 = new boolean[] {false} ;
      P00442_A10109Sedo5 = new byte[1] ;
      P00442_n10109Sedo5 = new boolean[] {false} ;
      P00442_A10110Sedo6 = new byte[1] ;
      P00442_n10110Sedo6 = new boolean[] {false} ;
      A10105Sedo1 = DecimalUtil.ZERO ;
      A10106Sedo2 = DecimalUtil.ZERO ;
      A10108Sedo4 = DecimalUtil.ZERO ;
      A9614Lb_UsuIn = "" ;
      A9615Lb_FecIn = GXutil.nullDate() ;
      A9616Lb_UsuOut = "" ;
      A9617Lb_FecOut = GXutil.nullDate() ;
      A9623Lb_FecTin = GXutil.nullDate() ;
      A9624Lb_UsuTin = "" ;
      A9625Lb_obsin = "" ;
      A9703Lb_FecAcF = GXutil.nullDate() ;
      A9702Lb_FecPAc = GXutil.nullDate() ;
      A9709Lb_obsout = "" ;
      A9721Lb_obsprb = "" ;
      A9857Ex_Obs = "" ;
      A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptotcon__default(),
         new Object[] {
             new Object[] {
            P00442_A396EmprCod, P00442_A9611Lb_Hdr, P00442_A9612Lb_Hdrr, P00442_A9613Lb_Hdrp, P00442_A10105Sedo1, P00442_n10105Sedo1, P00442_A10106Sedo2, P00442_n10106Sedo2, P00442_A10107Sedo3, P00442_n10107Sedo3,
            P00442_A10108Sedo4, P00442_n10108Sedo4, P00442_A10109Sedo5, P00442_n10109Sedo5, P00442_A10110Sedo6, P00442_n10110Sedo6
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A9612Lb_Hdrr ;
   private byte AV20Sedo5 ;
   private byte AV21Sedo6 ;
   private byte AV24GXLvl8 ;
   private byte A10109Sedo5 ;
   private byte A10110Sedo6 ;
   private byte A9618Lb_inout ;
   private short AV18Sedo3 ;
   private short A10107Sedo3 ;
   private short Gx_err ;
   private int A9611Lb_Hdr ;
   private int GX_INS1373 ;
   private java.math.BigDecimal AV16Sedo1 ;
   private java.math.BigDecimal AV17Sedo2 ;
   private java.math.BigDecimal AV19Sedo4 ;
   private java.math.BigDecimal A10105Sedo1 ;
   private java.math.BigDecimal A10106Sedo2 ;
   private java.math.BigDecimal A10108Sedo4 ;
   private String A396EmprCod ;
   private String A9613Lb_Hdrp ;
   private String scmdbuf ;
   private String A9614Lb_UsuIn ;
   private String A9616Lb_UsuOut ;
   private String A9624Lb_UsuTin ;
   private String Gx_emsg ;
   private java.util.Date A10152Lb_HhIn ;
   private java.util.Date A10138Lb_HhOut ;
   private java.util.Date A10153Lb_HhTin ;
   private java.util.Date A9615Lb_FecIn ;
   private java.util.Date A9617Lb_FecOut ;
   private java.util.Date A9623Lb_FecTin ;
   private java.util.Date A9703Lb_FecAcF ;
   private java.util.Date A9702Lb_FecPAc ;
   private boolean n10105Sedo1 ;
   private boolean n10106Sedo2 ;
   private boolean n10107Sedo3 ;
   private boolean n10108Sedo4 ;
   private boolean n10109Sedo5 ;
   private boolean n10110Sedo6 ;
   private boolean n9614Lb_UsuIn ;
   private boolean n9615Lb_FecIn ;
   private boolean n9616Lb_UsuOut ;
   private boolean n9617Lb_FecOut ;
   private boolean n9618Lb_inout ;
   private boolean n9623Lb_FecTin ;
   private boolean n9624Lb_UsuTin ;
   private boolean n9625Lb_obsin ;
   private boolean n9703Lb_FecAcF ;
   private boolean n9702Lb_FecPAc ;
   private boolean n9709Lb_obsout ;
   private boolean n9721Lb_obsprb ;
   private boolean n9857Ex_Obs ;
   private boolean n10152Lb_HhIn ;
   private boolean n10138Lb_HhOut ;
   private boolean n10153Lb_HhTin ;
   private String A9625Lb_obsin ;
   private String A9709Lb_obsout ;
   private String A9721Lb_obsprb ;
   private String A9857Ex_Obs ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private byte[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P00442_A396EmprCod ;
   private int[] P00442_A9611Lb_Hdr ;
   private byte[] P00442_A9612Lb_Hdrr ;
   private String[] P00442_A9613Lb_Hdrp ;
   private java.math.BigDecimal[] P00442_A10105Sedo1 ;
   private boolean[] P00442_n10105Sedo1 ;
   private java.math.BigDecimal[] P00442_A10106Sedo2 ;
   private boolean[] P00442_n10106Sedo2 ;
   private short[] P00442_A10107Sedo3 ;
   private boolean[] P00442_n10107Sedo3 ;
   private java.math.BigDecimal[] P00442_A10108Sedo4 ;
   private boolean[] P00442_n10108Sedo4 ;
   private byte[] P00442_A10109Sedo5 ;
   private boolean[] P00442_n10109Sedo5 ;
   private byte[] P00442_A10110Sedo6 ;
   private boolean[] P00442_n10110Sedo6 ;
}

final  class ptotcon__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00442", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6 FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00443", "INSERT INTO TXPHDRINO(EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, Lb_IDMP, Lb_IDMO, Lb_IDMS, Lb_IDMF, Lb_IDMFC, Sedo7, Sedo8, Sedo9, Sedo10, Sedo11, Lb_FecVTf, Lb_FecFev, Lb_FecAcb, Lb_FecTef, Lb_FecSf, Lb_FecRm, Lb_FecCd, Lb_FecEm, Sedo12, Sedo13, Sedo14, BCSd001, BCSd002, BCSd003, BCSd004, BCSd005, BCSd006, BCSd007, BCSd008, BCSd009) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 10);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[25], 200);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[27], 200);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[29], 300);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[39]).byteValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[43], true);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[45], true);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[47], true);
               }
               return;
      }
   }

}

