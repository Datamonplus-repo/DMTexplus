package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrfis extends GXProcedure
{
   public pctrfis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrfis.class ), "" );
   }

   public pctrfis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pctrfis.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pctrfis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pctrfis.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pctrfis.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pctrfis.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pctrfis.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pctrfis.this.AV10Barloc = aP5[0];
      this.aP5 = aP5;
      pctrfis.this.AV11Maqcodbis = aP6[0];
      this.aP6 = aP6;
      pctrfis.this.AV13Usurcod = aP7[0];
      this.aP7 = aP7;
      pctrfis.this.AV14Station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Barfasdti = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor P034V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P034V2_A457FasCod[0] ;
         A5047BarFasFPl = P034V2_A5047BarFasFPl[0] ;
         n5047BarFasFPl = P034V2_n5047BarFasFPl[0] ;
         A7914BarfasRb = P034V2_A7914BarfasRb[0] ;
         n7914BarfasRb = P034V2_n7914BarfasRb[0] ;
         A4442BarFasDTI = P034V2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P034V2_n4442BarFasDTI[0] ;
         A603MaqCodBis = P034V2_A603MaqCodBis[0] ;
         A758ProCod = P034V2_A758ProCod[0] ;
         /* Using cursor P034V3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A1431BarLocDis = P034V3_A1431BarLocDis[0] ;
         A4610BarTam = P034V3_A4610BarTam[0] ;
         A8097BarFecHis = P034V3_A8097BarFecHis[0] ;
         A8568EntSecUlt = P034V3_A8568EntSecUlt[0] ;
         n8568EntSecUlt = P034V3_n8568EntSecUlt[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A5047BarFasFPl = GXutil.resetTime(AV9Barfasdti) ;
         n5047BarFasFPl = false ;
         A7914BarfasRb = DecimalUtil.doubleToDec(1) ;
         n7914BarfasRb = false ;
         A4442BarFasDTI = AV9Barfasdti ;
         n4442BarFasDTI = false ;
         A1431BarLocDis = AV10Barloc ;
         if ( ( GXutil.strcmp(GXutil.substring( AV11Maqcodbis, 1, 2), httpContext.getMessage( "LC", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( AV11Maqcodbis, 1, 2), httpContext.getMessage( "RV", "")) == 0 ) )
         {
            A603MaqCodBis = AV11Maqcodbis ;
         }
         A4610BarTam = GXutil.substring( AV11Maqcodbis, 1, 4) ;
         A8097BarFecHis = AV9Barfasdti ;
         AV12EntSecUlt = (int)(A8568EntSecUlt+1) ;
         A8568EntSecUlt = (int)(A8568EntSecUlt+1) ;
         n8568EntSecUlt = false ;
         /*
            INSERT RECORD ON TABLE TXPENTSEC

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A8569EntSecLn = AV12EntSecUlt ;
         A8570EntSecfec = AV9Barfasdti ;
         n8570EntSecfec = false ;
         A8571EntSecOd = A194BarOrdLin ;
         n8571EntSecOd = false ;
         A8572EntSecMq = AV11Maqcodbis ;
         n8572EntSecMq = false ;
         A8574EntSecLoc = AV10Barloc ;
         n8574EntSecLoc = false ;
         A8575EntSecUsu = AV13Usurcod ;
         n8575EntSecUsu = false ;
         A8576EntSecTerm = AV14Station ;
         n8576EntSecTerm = false ;
         A8573EntSecFs = A457FasCod ;
         n8573EntSecFs = false ;
         /* Using cursor P034V4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A8569EntSecLn), Boolean.valueOf(n8570EntSecfec), A8570EntSecfec, Boolean.valueOf(n8571EntSecOd), Short.valueOf(A8571EntSecOd), Boolean.valueOf(n8572EntSecMq), A8572EntSecMq, Boolean.valueOf(n8573EntSecFs), A8573EntSecFs, Boolean.valueOf(n8574EntSecLoc), A8574EntSecLoc, Boolean.valueOf(n8575EntSecUsu), A8575EntSecUsu, Boolean.valueOf(n8576EntSecTerm), A8576EntSecTerm});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENTSEC");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         /* Using cursor P034V5 */
         pr_default.execute(3, new Object[] {A1431BarLocDis, A4610BarTam, A8097BarFecHis, Boolean.valueOf(n8568EntSecUlt), Integer.valueOf(A8568EntSecUlt), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Using cursor P034V6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pctrfis.this.A396EmprCod;
      this.aP1[0] = pctrfis.this.A129BarCod;
      this.aP2[0] = pctrfis.this.A132BarCodReo;
      this.aP3[0] = pctrfis.this.A130BarCodPar;
      this.aP4[0] = pctrfis.this.A194BarOrdLin;
      this.aP5[0] = pctrfis.this.AV10Barloc;
      this.aP6[0] = pctrfis.this.AV11Maqcodbis;
      this.aP7[0] = pctrfis.this.AV13Usurcod;
      this.aP8[0] = pctrfis.this.AV14Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pctrfis");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P034V2_A396EmprCod = new String[] {""} ;
      P034V2_A129BarCod = new int[1] ;
      P034V2_A132BarCodReo = new byte[1] ;
      P034V2_A130BarCodPar = new String[] {""} ;
      P034V2_A194BarOrdLin = new short[1] ;
      P034V2_A457FasCod = new String[] {""} ;
      P034V2_A5047BarFasFPl = new java.util.Date[] {GXutil.nullDate()} ;
      P034V2_n5047BarFasFPl = new boolean[] {false} ;
      P034V2_A7914BarfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P034V2_n7914BarfasRb = new boolean[] {false} ;
      P034V2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P034V2_n4442BarFasDTI = new boolean[] {false} ;
      P034V2_A603MaqCodBis = new String[] {""} ;
      P034V2_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A7914BarfasRb = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A603MaqCodBis = "" ;
      A758ProCod = "" ;
      P034V3_A1431BarLocDis = new String[] {""} ;
      P034V3_A4610BarTam = new String[] {""} ;
      P034V3_A8097BarFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      P034V3_A8568EntSecUlt = new int[1] ;
      P034V3_n8568EntSecUlt = new boolean[] {false} ;
      A1431BarLocDis = "" ;
      A4610BarTam = "" ;
      A8097BarFecHis = GXutil.resetTime( GXutil.nullDate() );
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      A8570EntSecfec = GXutil.resetTime( GXutil.nullDate() );
      A8572EntSecMq = "" ;
      A8574EntSecLoc = "" ;
      A8575EntSecUsu = "" ;
      A8576EntSecTerm = "" ;
      A8573EntSecFs = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrfis__default(),
         new Object[] {
             new Object[] {
            P034V2_A396EmprCod, P034V2_A129BarCod, P034V2_A132BarCodReo, P034V2_A130BarCodPar, P034V2_A194BarOrdLin, P034V2_A457FasCod, P034V2_A5047BarFasFPl, P034V2_n5047BarFasFPl, P034V2_A7914BarfasRb, P034V2_n7914BarfasRb,
            P034V2_A4442BarFasDTI, P034V2_n4442BarFasDTI, P034V2_A603MaqCodBis, P034V2_A758ProCod
            }
            , new Object[] {
            P034V3_A1431BarLocDis, P034V3_A4610BarTam, P034V3_A8097BarFecHis, P034V3_A8568EntSecUlt, P034V3_n8568EntSecUlt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte W132BarCodReo ;
   private short A194BarOrdLin ;
   private short A8571EntSecOd ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A8568EntSecUlt ;
   private int W129BarCod ;
   private int AV12EntSecUlt ;
   private int GX_INS1176 ;
   private int A8569EntSecLn ;
   private java.math.BigDecimal A7914BarfasRb ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV10Barloc ;
   private String AV11Maqcodbis ;
   private String AV13Usurcod ;
   private String AV14Station ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A603MaqCodBis ;
   private String A758ProCod ;
   private String A1431BarLocDis ;
   private String A4610BarTam ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String A8572EntSecMq ;
   private String A8574EntSecLoc ;
   private String A8575EntSecUsu ;
   private String A8576EntSecTerm ;
   private String A8573EntSecFs ;
   private String Gx_emsg ;
   private java.util.Date AV9Barfasdti ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A8097BarFecHis ;
   private java.util.Date A8570EntSecfec ;
   private java.util.Date A5047BarFasFPl ;
   private boolean n5047BarFasFPl ;
   private boolean n7914BarfasRb ;
   private boolean n4442BarFasDTI ;
   private boolean n8568EntSecUlt ;
   private boolean n8570EntSecfec ;
   private boolean n8571EntSecOd ;
   private boolean n8572EntSecMq ;
   private boolean n8574EntSecLoc ;
   private boolean n8575EntSecUsu ;
   private boolean n8576EntSecTerm ;
   private boolean n8573EntSecFs ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P034V2_A396EmprCod ;
   private int[] P034V2_A129BarCod ;
   private byte[] P034V2_A132BarCodReo ;
   private String[] P034V2_A130BarCodPar ;
   private short[] P034V2_A194BarOrdLin ;
   private String[] P034V2_A457FasCod ;
   private java.util.Date[] P034V2_A5047BarFasFPl ;
   private boolean[] P034V2_n5047BarFasFPl ;
   private java.math.BigDecimal[] P034V2_A7914BarfasRb ;
   private boolean[] P034V2_n7914BarfasRb ;
   private java.util.Date[] P034V2_A4442BarFasDTI ;
   private boolean[] P034V2_n4442BarFasDTI ;
   private String[] P034V2_A603MaqCodBis ;
   private String[] P034V2_A758ProCod ;
   private String[] P034V3_A1431BarLocDis ;
   private String[] P034V3_A4610BarTam ;
   private java.util.Date[] P034V3_A8097BarFecHis ;
   private int[] P034V3_A8568EntSecUlt ;
   private boolean[] P034V3_n8568EntSecUlt ;
}

final  class pctrfis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P034V2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, FasCod, BarFasFPl, BarfasRb, BarFasDTI, MaqCodBis, ProCod FROM TXPBARFAS WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarOrdLin = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P034V3", "SELECT BarLocDis, BarTam, BarFecHis, EntSecUlt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P034V4", "INSERT INTO TXPENTSEC(EmprCod, BarCod, BarCodReo, BarCodPar, EntSecLn, EntSecfec, EntSecOd, EntSecMq, EntSecFs, EntSecLoc, EntSecUsu, EntSecTerm, EntSecEst) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENTSEC")
         ,new UpdateCursor("P034V5", "UPDATE TXPBARCAD SET BarLocDis=?, BarTam=?, BarFecHis=?, EntSecUlt=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P034V6", "UPDATE TXPBARFAS SET BarFasFPl=?, BarfasRb=?, BarFasDTI=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((String[]) buf[13])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 8);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[14], 10);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 8);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 8);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               return;
            case 4 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               stmt.setString(4, (String)parms[6], 6);
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setString(9, (String)parms[11], 8);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               return;
      }
   }

}

