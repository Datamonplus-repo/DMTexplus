package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlmerma extends GXProcedure
{
   public pctrlmerma( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlmerma.class ), "" );
   }

   public pctrlmerma( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     byte[] aP2 ,
                                     String[] aP3 ,
                                     String[] aP4 )
   {
      pctrlmerma.this.aP5 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pctrlmerma.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrlmerma.this.AV18Barcod = aP1[0];
      this.aP1 = aP1;
      pctrlmerma.this.AV21Barcodreo = aP2[0];
      this.aP2 = aP2;
      pctrlmerma.this.AV20Barcodpar = aP3[0];
      this.aP3 = aP3;
      pctrlmerma.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      pctrlmerma.this.AV27Fecsal = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pctrlmerma.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV23Emprnom ;
      GXv_char4[0] = AV19Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      pctrlmerma.this.A396EmprCod = GXv_char2[0] ;
      pctrlmerma.this.AV23Emprnom = GXv_char3[0] ;
      pctrlmerma.this.AV19Usurcod = GXv_char4[0] ;
      /*
         INSERT RECORD ON TABLE TXPHDRINO

      */
      A9611Lb_Hdr = AV18Barcod ;
      A9612Lb_Hdrr = AV21Barcodreo ;
      A9613Lb_Hdrp = AV20Barcodpar ;
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
      A9702Lb_FecPAc = AV27Fecsal ;
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
      A10148Lb_UbPzs = 0 ;
      n10148Lb_UbPzs = false ;
      A10135Lb_UbUb = "" ;
      n10135Lb_UbUb = false ;
      A10817Lb_IDMP = 0 ;
      n10817Lb_IDMP = false ;
      A10818Lb_IDMO = Gx_msg ;
      n10818Lb_IDMO = false ;
      A10819Lb_IDMS = (byte)(0) ;
      n10819Lb_IDMS = false ;
      A10820Lb_IDMF = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n10820Lb_IDMF = false ;
      A10821Lb_IDMFC = GXutil.resetTime( GXutil.nullDate() );
      n10821Lb_IDMFC = false ;
      A12603Lb_FecAcb = GXutil.nullDate() ;
      n12603Lb_FecAcb = false ;
      A12602Lb_FecFev = GXutil.nullDate() ;
      n12602Lb_FecFev = false ;
      A12604Lb_FecTef = GXutil.nullDate() ;
      n12604Lb_FecTef = false ;
      A12601Lb_FecVTf = GXutil.nullDate() ;
      n12601Lb_FecVTf = false ;
      A12611Lb_FecSf = GXutil.nullDate() ;
      n12611Lb_FecSf = false ;
      A12612Lb_FecRm = GXutil.nullDate() ;
      n12612Lb_FecRm = false ;
      A12639Lb_FecCd = GXutil.nullDate() ;
      n12639Lb_FecCd = false ;
      A12640Lb_FecEm = GXutil.nullDate() ;
      n12640Lb_FecEm = false ;
      /* Using cursor P04HE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp, Boolean.valueOf(n9614Lb_UsuIn), A9614Lb_UsuIn, Boolean.valueOf(n9615Lb_FecIn), A9615Lb_FecIn, Boolean.valueOf(n9616Lb_UsuOut), A9616Lb_UsuOut, Boolean.valueOf(n9617Lb_FecOut), A9617Lb_FecOut, Boolean.valueOf(n9618Lb_inout), Byte.valueOf(A9618Lb_inout), Boolean.valueOf(n9623Lb_FecTin), A9623Lb_FecTin, Boolean.valueOf(n9624Lb_UsuTin), A9624Lb_UsuTin, Boolean.valueOf(n9625Lb_obsin), A9625Lb_obsin, Boolean.valueOf(n9702Lb_FecPAc), A9702Lb_FecPAc, Boolean.valueOf(n9703Lb_FecAcF), A9703Lb_FecAcF, Boolean.valueOf(n9709Lb_obsout), A9709Lb_obsout, Boolean.valueOf(n9721Lb_obsprb), A9721Lb_obsprb, Boolean.valueOf(n9857Ex_Obs), A9857Ex_Obs, Boolean.valueOf(n10105Sedo1), A10105Sedo1, Boolean.valueOf(n10106Sedo2), A10106Sedo2, Boolean.valueOf(n10107Sedo3), Short.valueOf(A10107Sedo3), Boolean.valueOf(n10108Sedo4), A10108Sedo4, Boolean.valueOf(n10109Sedo5), Byte.valueOf(A10109Sedo5), Boolean.valueOf(n10110Sedo6), Byte.valueOf(A10110Sedo6), Boolean.valueOf(n10152Lb_HhIn), A10152Lb_HhIn, Boolean.valueOf(n10138Lb_HhOut), A10138Lb_HhOut, Boolean.valueOf(n10153Lb_HhTin), A10153Lb_HhTin, Boolean.valueOf(n10148Lb_UbPzs), Integer.valueOf(A10148Lb_UbPzs), Boolean.valueOf(n10135Lb_UbUb), A10135Lb_UbUb, Boolean.valueOf(n10817Lb_IDMP), Integer.valueOf(A10817Lb_IDMP), Boolean.valueOf(n10818Lb_IDMO), A10818Lb_IDMO, Boolean.valueOf(n10819Lb_IDMS), Byte.valueOf(A10819Lb_IDMS), Boolean.valueOf(n10820Lb_IDMF), A10820Lb_IDMF, Boolean.valueOf(n10821Lb_IDMFC), A10821Lb_IDMFC, Boolean.valueOf(n12601Lb_FecVTf), A12601Lb_FecVTf, Boolean.valueOf(n12602Lb_FecFev), A12602Lb_FecFev, Boolean.valueOf(n12603Lb_FecAcb), A12603Lb_FecAcb, Boolean.valueOf(n12604Lb_FecTef), A12604Lb_FecTef, Boolean.valueOf(n12611Lb_FecSf), A12611Lb_FecSf, Boolean.valueOf(n12612Lb_FecRm), A12612Lb_FecRm, Boolean.valueOf(n12639Lb_FecCd), A12639Lb_FecCd, Boolean.valueOf(n12640Lb_FecEm), A12640Lb_FecEm});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n9702Lb_FecPAc = false ;
         n10818Lb_IDMO = false ;
         n10820Lb_IDMF = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04HE3 */
         String Gx_msg10818Aux;
         Gx_msg10818Aux = Gx_msg ;
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9702Lb_FecPAc), AV27Fecsal, Boolean.valueOf(n10818Lb_IDMO), Gx_msg10818Aux, A396EmprCod, Integer.valueOf(A9611Lb_Hdr), Byte.valueOf(A9612Lb_Hdrr), A9613Lb_Hdrp});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRINO");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrlmerma.this.A396EmprCod;
      this.aP1[0] = pctrlmerma.this.AV18Barcod;
      this.aP2[0] = pctrlmerma.this.AV21Barcodreo;
      this.aP3[0] = pctrlmerma.this.AV20Barcodpar;
      this.aP4[0] = pctrlmerma.this.Gx_msg;
      this.aP5[0] = pctrlmerma.this.AV27Fecsal;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV23Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV19Usurcod = "" ;
      GXv_char4 = new String[1] ;
      A9613Lb_Hdrp = "" ;
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
      A10105Sedo1 = DecimalUtil.ZERO ;
      A10106Sedo2 = DecimalUtil.ZERO ;
      A10108Sedo4 = DecimalUtil.ZERO ;
      A10152Lb_HhIn = GXutil.resetTime( GXutil.nullDate() );
      A10138Lb_HhOut = GXutil.resetTime( GXutil.nullDate() );
      A10153Lb_HhTin = GXutil.resetTime( GXutil.nullDate() );
      A10135Lb_UbUb = "" ;
      A10818Lb_IDMO = "" ;
      A10820Lb_IDMF = GXutil.resetTime( GXutil.nullDate() );
      A10821Lb_IDMFC = GXutil.resetTime( GXutil.nullDate() );
      A12603Lb_FecAcb = GXutil.nullDate() ;
      A12602Lb_FecFev = GXutil.nullDate() ;
      A12604Lb_FecTef = GXutil.nullDate() ;
      A12601Lb_FecVTf = GXutil.nullDate() ;
      A12611Lb_FecSf = GXutil.nullDate() ;
      A12612Lb_FecRm = GXutil.nullDate() ;
      A12639Lb_FecCd = GXutil.nullDate() ;
      A12640Lb_FecEm = GXutil.nullDate() ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlmerma__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV21Barcodreo ;
   private byte A9612Lb_Hdrr ;
   private byte A9618Lb_inout ;
   private byte A10109Sedo5 ;
   private byte A10110Sedo6 ;
   private byte A10819Lb_IDMS ;
   private short A10107Sedo3 ;
   private short Gx_err ;
   private int AV18Barcod ;
   private int GX_INS1373 ;
   private int A9611Lb_Hdr ;
   private int A10148Lb_UbPzs ;
   private int A10817Lb_IDMP ;
   private java.math.BigDecimal A10105Sedo1 ;
   private java.math.BigDecimal A10106Sedo2 ;
   private java.math.BigDecimal A10108Sedo4 ;
   private String A396EmprCod ;
   private String AV20Barcodpar ;
   private String Gx_msg ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV23Emprnom ;
   private String GXv_char3[] ;
   private String AV19Usurcod ;
   private String GXv_char4[] ;
   private String A9613Lb_Hdrp ;
   private String A9614Lb_UsuIn ;
   private String A9616Lb_UsuOut ;
   private String A9624Lb_UsuTin ;
   private String A10135Lb_UbUb ;
   private String Gx_emsg ;
   private java.util.Date A10152Lb_HhIn ;
   private java.util.Date A10138Lb_HhOut ;
   private java.util.Date A10153Lb_HhTin ;
   private java.util.Date A10820Lb_IDMF ;
   private java.util.Date A10821Lb_IDMFC ;
   private java.util.Date AV27Fecsal ;
   private java.util.Date A9615Lb_FecIn ;
   private java.util.Date A9617Lb_FecOut ;
   private java.util.Date A9623Lb_FecTin ;
   private java.util.Date A9703Lb_FecAcF ;
   private java.util.Date A9702Lb_FecPAc ;
   private java.util.Date A12603Lb_FecAcb ;
   private java.util.Date A12602Lb_FecFev ;
   private java.util.Date A12604Lb_FecTef ;
   private java.util.Date A12601Lb_FecVTf ;
   private java.util.Date A12611Lb_FecSf ;
   private java.util.Date A12612Lb_FecRm ;
   private java.util.Date A12639Lb_FecCd ;
   private java.util.Date A12640Lb_FecEm ;
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
   private boolean n10105Sedo1 ;
   private boolean n10106Sedo2 ;
   private boolean n10107Sedo3 ;
   private boolean n10108Sedo4 ;
   private boolean n10109Sedo5 ;
   private boolean n10110Sedo6 ;
   private boolean n10152Lb_HhIn ;
   private boolean n10138Lb_HhOut ;
   private boolean n10153Lb_HhTin ;
   private boolean n10148Lb_UbPzs ;
   private boolean n10135Lb_UbUb ;
   private boolean n10817Lb_IDMP ;
   private boolean n10818Lb_IDMO ;
   private boolean n10819Lb_IDMS ;
   private boolean n10820Lb_IDMF ;
   private boolean n10821Lb_IDMFC ;
   private boolean n12603Lb_FecAcb ;
   private boolean n12602Lb_FecFev ;
   private boolean n12604Lb_FecTef ;
   private boolean n12601Lb_FecVTf ;
   private boolean n12611Lb_FecSf ;
   private boolean n12612Lb_FecRm ;
   private boolean n12639Lb_FecCd ;
   private boolean n12640Lb_FecEm ;
   private String A9625Lb_obsin ;
   private String A9709Lb_obsout ;
   private String A9721Lb_obsprb ;
   private String A9857Ex_Obs ;
   private String A10818Lb_IDMO ;
   private java.util.Date[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pctrlmerma__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04HE2", "INSERT INTO TXPHDRINO(EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_UsuIn, Lb_FecIn, Lb_UsuOut, Lb_FecOut, Lb_inout, Lb_FecTin, Lb_UsuTin, Lb_obsin, Lb_FecPAc, Lb_FecAcF, Lb_obsout, Lb_obsprb, Ex_Obs, Sedo1, Sedo2, Sedo3, Sedo4, Sedo5, Sedo6, Lb_HhIn, Lb_HhOut, Lb_HhTin, Lb_UbPzs, Lb_UbUb, Lb_IDMP, Lb_IDMO, Lb_IDMS, Lb_IDMF, Lb_IDMFC, Lb_FecVTf, Lb_FecFev, Lb_FecAcb, Lb_FecTef, Lb_FecSf, Lb_FecRm, Lb_FecCd, Lb_FecEm, Sedo7, Sedo8, Sedo9, Sedo10, Sedo11, Sedo12, Sedo13, Sedo14, BCSd001, BCSd002, BCSd003, BCSd004, BCSd005, BCSd006, BCSd007, BCSd008, BCSd009) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
         ,new UpdateCursor("P04HE3", "UPDATE TXPHDRINO SET Lb_FecPAc=?, Lb_IDMO=?, Lb_IDMF=(SYSDATE)  WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRINO")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[53]).intValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[55], 300);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(31, ((Number) parms[57]).byteValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(32, (java.util.Date)parms[59], false);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(33, (java.util.Date)parms[61], false);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DATE );
               }
               else
               {
                  stmt.setDate(34, (java.util.Date)parms[63]);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DATE );
               }
               else
               {
                  stmt.setDate(35, (java.util.Date)parms[65]);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DATE );
               }
               else
               {
                  stmt.setDate(36, (java.util.Date)parms[67]);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DATE );
               }
               else
               {
                  stmt.setDate(37, (java.util.Date)parms[69]);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DATE );
               }
               else
               {
                  stmt.setDate(38, (java.util.Date)parms[71]);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DATE );
               }
               else
               {
                  stmt.setDate(39, (java.util.Date)parms[73]);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DATE );
               }
               else
               {
                  stmt.setDate(40, (java.util.Date)parms[75]);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.DATE );
               }
               else
               {
                  stmt.setDate(41, (java.util.Date)parms[77]);
               }
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 300);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               return;
      }
   }

}

