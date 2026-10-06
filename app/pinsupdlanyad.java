package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinsupdlanyad extends GXProcedure
{
   public pinsupdlanyad( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinsupdlanyad.class ), "" );
   }

   public pinsupdlanyad( int remoteHandle ,
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
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 )
   {
      pinsupdlanyad.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 )
   {
      pinsupdlanyad.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinsupdlanyad.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinsupdlanyad.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinsupdlanyad.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinsupdlanyad.this.AV16RecLinMal = aP4[0];
      this.aP4 = aP4;
      pinsupdlanyad.this.AV12RecNumAny = aP5[0];
      this.aP5 = aP5;
      pinsupdlanyad.this.AV14Prdnum = aP6[0];
      this.aP6 = aP6;
      pinsupdlanyad.this.AV15PrdNom = aP7[0];
      this.aP7 = aP7;
      pinsupdlanyad.this.AV11Prdcfin = aP8[0];
      this.aP8 = aP8;
      pinsupdlanyad.this.AV17LanyLote = aP9[0];
      this.aP9 = aP9;
      pinsupdlanyad.this.AV8usurcod = aP10[0];
      this.aP10 = aP10;
      pinsupdlanyad.this.AV9station = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13LastNumero = (byte)(0) ;
      AV20GXLvl2 = (byte)(0) ;
      /* Using cursor P056J2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV16RecLinMal), AV14Prdnum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2808RecLinMAL = P056J2_A2808RecLinMAL[0] ;
         A719PrdNum = P056J2_A719PrdNum[0] ;
         A1377RecNumAny = P056J2_A1377RecNumAny[0] ;
         AV20GXLvl2 = (byte)(1) ;
         AV13LastNumero = (byte)(A1377RecNumAny+1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl2 == 0 )
      {
         AV13LastNumero = (byte)(1) ;
      }
      if ( AV12RecNumAny == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPLANYAD

         */
         A2808RecLinMAL = AV16RecLinMal ;
         A1377RecNumAny = AV13LastNumero ;
         A719PrdNum = AV14Prdnum ;
         A1378PrdCFin = AV11Prdcfin ;
         n1378PrdCFin = false ;
         A3380LanyPrd = " " ;
         n3380LanyPrd = false ;
         A3381LanyCan = DecimalUtil.doubleToDec(0) ;
         n3381LanyCan = false ;
         A3382LanyNro = (byte)(0) ;
         n3382LanyNro = false ;
         A3383LanyTnq = (byte)(0) ;
         n3383LanyTnq = false ;
         A4578LanyUsr = AV8usurcod ;
         n4578LanyUsr = false ;
         A4579LanyFec = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n4579LanyFec = false ;
         A5807LanyLote = AV17LanyLote ;
         n5807LanyLote = false ;
         /* Using cursor P056J3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum, Boolean.valueOf(n1378PrdCFin), A1378PrdCFin, Boolean.valueOf(n3380LanyPrd), A3380LanyPrd, Boolean.valueOf(n3381LanyCan), A3381LanyCan, Boolean.valueOf(n3382LanyNro), Byte.valueOf(A3382LanyNro), Boolean.valueOf(n3383LanyTnq), Byte.valueOf(A3383LanyTnq), Boolean.valueOf(n4578LanyUsr), A4578LanyUsr, Boolean.valueOf(n4579LanyFec), A4579LanyFec, Boolean.valueOf(n5807LanyLote), A5807LanyLote});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
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
         AV10Inc_obs = httpContext.getMessage( "Alta tabla LANYAD", "") + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Hdr   =", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
         AV10Inc_obs += "#     =" + GXutil.str( A2808RecLinMAL, 4, 0) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( AV13LastNumero, 2, 0) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Producto =", "") + AV14Prdnum + " " + GXutil.trim( AV15PrdNom) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Cantidad =", "") + GXutil.str( AV11Prdcfin, 11, 3) + GXutil.newLine( ) ;
         AV10Inc_obs += httpContext.getMessage( "Lote     =", "") + AV17LanyLote + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV21Pgmname, 1, 10), AV8usurcod, AV9station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      else
      {
         /* Using cursor P056J4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV16RecLinMal), Byte.valueOf(AV12RecNumAny), AV14Prdnum});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A719PrdNum = P056J4_A719PrdNum[0] ;
            A1377RecNumAny = P056J4_A1377RecNumAny[0] ;
            A2808RecLinMAL = P056J4_A2808RecLinMAL[0] ;
            A718PrdNom = P056J4_A718PrdNom[0] ;
            A1378PrdCFin = P056J4_A1378PrdCFin[0] ;
            n1378PrdCFin = P056J4_n1378PrdCFin[0] ;
            A5807LanyLote = P056J4_A5807LanyLote[0] ;
            n5807LanyLote = P056J4_n5807LanyLote[0] ;
            A718PrdNom = P056J4_A718PrdNom[0] ;
            AV10Inc_obs = httpContext.getMessage( "Modificacion tabla LANYAD", "") + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Hdr   =", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) ;
            AV10Inc_obs += "#     =" + GXutil.str( A2808RecLinMAL, 4, 0) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Linea =", "") + GXutil.str( AV12RecNumAny, 2, 0) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Producto =", "") + A719PrdNum + " " + GXutil.trim( A718PrdNom) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Cantidad =", "") + GXutil.str( A1378PrdCFin, 11, 3) + httpContext.getMessage( " se cambia por ", "") + GXutil.str( AV11Prdcfin, 11, 3) + GXutil.newLine( ) ;
            AV10Inc_obs += httpContext.getMessage( "Lote     =", "") + A5807LanyLote + httpContext.getMessage( " se cambia por ", "") + AV17LanyLote + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV21Pgmname, 1, 10), AV8usurcod, AV9station, AV10Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            A5807LanyLote = AV17LanyLote ;
            n5807LanyLote = false ;
            A1378PrdCFin = AV11Prdcfin ;
            n1378PrdCFin = false ;
            /* Using cursor P056J5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n1378PrdCFin), A1378PrdCFin, Boolean.valueOf(n5807LanyLote), A5807LanyLote, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2808RecLinMAL), Byte.valueOf(A1377RecNumAny), A719PrdNum});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLANYAD");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinsupdlanyad.this.A396EmprCod;
      this.aP1[0] = pinsupdlanyad.this.A129BarCod;
      this.aP2[0] = pinsupdlanyad.this.A132BarCodReo;
      this.aP3[0] = pinsupdlanyad.this.A130BarCodPar;
      this.aP4[0] = pinsupdlanyad.this.AV16RecLinMal;
      this.aP5[0] = pinsupdlanyad.this.AV12RecNumAny;
      this.aP6[0] = pinsupdlanyad.this.AV14Prdnum;
      this.aP7[0] = pinsupdlanyad.this.AV15PrdNom;
      this.aP8[0] = pinsupdlanyad.this.AV11Prdcfin;
      this.aP9[0] = pinsupdlanyad.this.AV17LanyLote;
      this.aP10[0] = pinsupdlanyad.this.AV8usurcod;
      this.aP11[0] = pinsupdlanyad.this.AV9station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinsupdlanyad");
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
      P056J2_A396EmprCod = new String[] {""} ;
      P056J2_A129BarCod = new int[1] ;
      P056J2_A132BarCodReo = new byte[1] ;
      P056J2_A130BarCodPar = new String[] {""} ;
      P056J2_A2808RecLinMAL = new short[1] ;
      P056J2_A719PrdNum = new String[] {""} ;
      P056J2_A1377RecNumAny = new byte[1] ;
      A719PrdNum = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A3380LanyPrd = "" ;
      A3381LanyCan = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      Gx_emsg = "" ;
      AV10Inc_obs = "" ;
      AV21Pgmname = "" ;
      P056J4_A396EmprCod = new String[] {""} ;
      P056J4_A129BarCod = new int[1] ;
      P056J4_A132BarCodReo = new byte[1] ;
      P056J4_A130BarCodPar = new String[] {""} ;
      P056J4_A719PrdNum = new String[] {""} ;
      P056J4_A1377RecNumAny = new byte[1] ;
      P056J4_A2808RecLinMAL = new short[1] ;
      P056J4_A718PrdNom = new String[] {""} ;
      P056J4_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P056J4_n1378PrdCFin = new boolean[] {false} ;
      P056J4_A5807LanyLote = new String[] {""} ;
      P056J4_n5807LanyLote = new boolean[] {false} ;
      A718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinsupdlanyad__default(),
         new Object[] {
             new Object[] {
            P056J2_A396EmprCod, P056J2_A129BarCod, P056J2_A132BarCodReo, P056J2_A130BarCodPar, P056J2_A2808RecLinMAL, P056J2_A719PrdNum, P056J2_A1377RecNumAny
            }
            , new Object[] {
            }
            , new Object[] {
            P056J4_A396EmprCod, P056J4_A129BarCod, P056J4_A132BarCodReo, P056J4_A130BarCodPar, P056J4_A719PrdNum, P056J4_A1377RecNumAny, P056J4_A2808RecLinMAL, P056J4_A718PrdNom, P056J4_A1378PrdCFin, P056J4_n1378PrdCFin,
            P056J4_A5807LanyLote, P056J4_n5807LanyLote
            }
            , new Object[] {
            }
         }
      );
      AV21Pgmname = "PInsUpdLanyad" ;
      /* GeneXus formulas. */
      AV21Pgmname = "PInsUpdLanyad" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12RecNumAny ;
   private byte AV13LastNumero ;
   private byte AV20GXLvl2 ;
   private byte A1377RecNumAny ;
   private byte A3382LanyNro ;
   private byte A3383LanyTnq ;
   private short AV16RecLinMal ;
   private short A2808RecLinMAL ;
   private short Gx_err ;
   private int A129BarCod ;
   private int GX_INS411 ;
   private java.math.BigDecimal AV11Prdcfin ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal A3381LanyCan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14Prdnum ;
   private String AV15PrdNom ;
   private String AV17LanyLote ;
   private String AV8usurcod ;
   private String AV9station ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A3380LanyPrd ;
   private String A4578LanyUsr ;
   private String A5807LanyLote ;
   private String Gx_emsg ;
   private String AV21Pgmname ;
   private String A718PrdNom ;
   private java.util.Date A4579LanyFec ;
   private boolean n1378PrdCFin ;
   private boolean n3380LanyPrd ;
   private boolean n3381LanyCan ;
   private boolean n3382LanyNro ;
   private boolean n3383LanyTnq ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private String AV10Inc_obs ;
   private String[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P056J2_A396EmprCod ;
   private int[] P056J2_A129BarCod ;
   private byte[] P056J2_A132BarCodReo ;
   private String[] P056J2_A130BarCodPar ;
   private short[] P056J2_A2808RecLinMAL ;
   private String[] P056J2_A719PrdNum ;
   private byte[] P056J2_A1377RecNumAny ;
   private String[] P056J4_A396EmprCod ;
   private int[] P056J4_A129BarCod ;
   private byte[] P056J4_A132BarCodReo ;
   private String[] P056J4_A130BarCodPar ;
   private String[] P056J4_A719PrdNum ;
   private byte[] P056J4_A1377RecNumAny ;
   private short[] P056J4_A2808RecLinMAL ;
   private String[] P056J4_A718PrdNom ;
   private java.math.BigDecimal[] P056J4_A1378PrdCFin ;
   private boolean[] P056J4_n1378PrdCFin ;
   private String[] P056J4_A5807LanyLote ;
   private boolean[] P056J4_n5807LanyLote ;
}

final  class pinsupdlanyad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P056J2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, PrdNum, RecNumAny FROM TXPLANYAD WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMAL = ?) AND (PrdNum = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P056J3", "INSERT INTO TXPLANYAD(EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum, PrdCFin, LanyPrd, LanyCan, LanyNro, LanyTnq, LanyUsr, LanyFec, LanyLote, LanyCtd, LanyUnd, LanyLoteFc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
         ,new ForEachCursor("P056J4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.PrdNum, T1.RecNumAny, T1.RecLinMAL, T2.PrdNom, T1.PrdCFin, T1.LanyLote FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ? and T1.RecNumAny = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P056J5", "UPDATE TXPLANYAD SET PrdCFin=?, LanyLote=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMAL = ? AND RecNumAny = ? AND PrdNum = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLANYAD")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 3);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 8);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[22], 26);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setShort(7, ((Number) parms[8]).shortValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 6);
               return;
      }
   }

}

