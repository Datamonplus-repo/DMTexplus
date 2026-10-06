package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrex9copy1 extends GXProcedure
{
   public phdrex9copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrex9copy1.class ), "" );
   }

   public phdrex9copy1( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 )
   {
      phdrex9copy1.this.aP9 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        byte[] aP6 ,
                        int[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             byte[] aP6 ,
                             int[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      phdrex9copy1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrex9copy1.this.AV17BarCod = aP1[0];
      this.aP1 = aP1;
      phdrex9copy1.this.AV18BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrex9copy1.this.AV19BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrex9copy1.this.AV8FasCod = aP4[0];
      this.aP4 = aP4;
      phdrex9copy1.this.AV9FechaE = aP5[0];
      this.aP5 = aP5;
      phdrex9copy1.this.AV10BarExt = aP6[0];
      this.aP6 = aP6;
      phdrex9copy1.this.AV12SalExtAlb = aP7[0];
      this.aP7 = aP7;
      phdrex9copy1.this.AV15SalExNln = aP8[0];
      this.aP8 = aP8;
      phdrex9copy1.this.AV16OpDel = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11Flag = httpContext.getMessage( "S", "") ;
      n2265BarExt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P0AC02 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n2265BarExt), Byte.valueOf(AV10BarExt), A396EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "In Phdrext.Read Tabla BARFAS", "") );
      /* Using cursor P0AC03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, AV8FasCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P0AC03_A457FasCod[0] ;
         A130BarCodPar = P0AC03_A130BarCodPar[0] ;
         A132BarCodReo = P0AC03_A132BarCodReo[0] ;
         A129BarCod = P0AC03_A129BarCod[0] ;
         A153BarFasEst = P0AC03_A153BarFasEst[0] ;
         A3298BarFecRIni = P0AC03_A3298BarFecRIni[0] ;
         A160BarFecRea = P0AC03_A160BarFecRea[0] ;
         A4442BarFasDTI = P0AC03_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P0AC03_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P0AC03_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P0AC03_n4443BarFasDTF[0] ;
         A758ProCod = P0AC03_A758ProCod[0] ;
         A194BarOrdLin = P0AC03_A194BarOrdLin[0] ;
         if ( AV10BarExt == 0 )
         {
            A153BarFasEst = (byte)(0) ;
            A3298BarFecRIni = GXutil.nullDate() ;
            A160BarFecRea = GXutil.nullDate() ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
         }
         if ( AV10BarExt == 1 )
         {
            A153BarFasEst = (byte)(1) ;
            A160BarFecRea = AV9FechaE ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) )
            {
               A3298BarFecRIni = AV9FechaE ;
            }
         }
         if ( AV10BarExt == 2 )
         {
            A153BarFasEst = (byte)(2) ;
            A160BarFecRea = AV9FechaE ;
            if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A3298BarFecRIni)) )
            {
               A3298BarFecRIni = AV9FechaE ;
            }
         }
         /* Using cursor P0AC04 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), A3298BarFecRIni, A160BarFecRea, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( GXutil.strcmp(AV16OpDel, httpContext.getMessage( "HDR", "")) == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P0AC05 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV12SalExtAlb), Short.valueOf(AV15SalExNln)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEXHDPZ");
         /* End optimized DELETE. */
      }
      System.out.println( httpContext.getMessage( "In Phdrext.End Tabla BARFAS", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrex9copy1.this.A396EmprCod;
      this.aP1[0] = phdrex9copy1.this.AV17BarCod;
      this.aP2[0] = phdrex9copy1.this.AV18BarCodReo;
      this.aP3[0] = phdrex9copy1.this.AV19BarCodPar;
      this.aP4[0] = phdrex9copy1.this.AV8FasCod;
      this.aP5[0] = phdrex9copy1.this.AV9FechaE;
      this.aP6[0] = phdrex9copy1.this.AV10BarExt;
      this.aP7[0] = phdrex9copy1.this.AV12SalExtAlb;
      this.aP8[0] = phdrex9copy1.this.AV15SalExNln;
      this.aP9[0] = phdrex9copy1.this.AV16OpDel;
      Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.phdrex9copy1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Flag = "" ;
      scmdbuf = "" ;
      P0AC03_A396EmprCod = new String[] {""} ;
      P0AC03_A457FasCod = new String[] {""} ;
      P0AC03_A130BarCodPar = new String[] {""} ;
      P0AC03_A132BarCodReo = new byte[1] ;
      P0AC03_A129BarCod = new int[1] ;
      P0AC03_A153BarFasEst = new byte[1] ;
      P0AC03_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC03_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC03_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC03_n4442BarFasDTI = new boolean[] {false} ;
      P0AC03_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AC03_n4443BarFasDTF = new boolean[] {false} ;
      P0AC03_A758ProCod = new String[] {""} ;
      P0AC03_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A130BarCodPar = "" ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.phdrex9copy1__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P0AC03_A396EmprCod, P0AC03_A457FasCod, P0AC03_A130BarCodPar, P0AC03_A132BarCodReo, P0AC03_A129BarCod, P0AC03_A153BarFasEst, P0AC03_A3298BarFecRIni, P0AC03_A160BarFecRea, P0AC03_A4442BarFasDTI, P0AC03_n4442BarFasDTI,
            P0AC03_A4443BarFasDTF, P0AC03_n4443BarFasDTF, P0AC03_A758ProCod, P0AC03_A194BarOrdLin
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

   private byte AV18BarCodReo ;
   private byte AV10BarExt ;
   private byte A2265BarExt ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private short AV15SalExNln ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV17BarCod ;
   private int AV12SalExtAlb ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV19BarCodPar ;
   private String AV8FasCod ;
   private String AV16OpDel ;
   private String AV11Flag ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV9FechaE ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A160BarFecRea ;
   private boolean n2265BarExt ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private String[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private byte[] aP6 ;
   private int[] aP7 ;
   private short[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AC03_A396EmprCod ;
   private String[] P0AC03_A457FasCod ;
   private String[] P0AC03_A130BarCodPar ;
   private byte[] P0AC03_A132BarCodReo ;
   private int[] P0AC03_A129BarCod ;
   private byte[] P0AC03_A153BarFasEst ;
   private java.util.Date[] P0AC03_A3298BarFecRIni ;
   private java.util.Date[] P0AC03_A160BarFecRea ;
   private java.util.Date[] P0AC03_A4442BarFasDTI ;
   private boolean[] P0AC03_n4442BarFasDTI ;
   private java.util.Date[] P0AC03_A4443BarFasDTF ;
   private boolean[] P0AC03_n4443BarFasDTF ;
   private String[] P0AC03_A758ProCod ;
   private short[] P0AC03_A194BarOrdLin ;
}

final  class phdrex9copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AC02", "UPDATE TXPBARCAD SET BarExt=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P0AC03", "SELECT EmprCod, FasCod, BarCodPar, BarCodReo, BarCod, BarFasEst, BarFecRIni, BarFecRea, BarFasDTI, BarFasDTF, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AC04", "UPDATE TXPBARFAS SET BarFasEst=?, BarFecRIni=?, BarFecRea=?, BarFasDTI=?, BarFasDTF=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P0AC05", "DELETE FROM TXPEXHDPZ  WHERE EmprCod = ? and SalExtAlb = ? and SalExNln = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPEXHDPZ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               ((short[]) buf[13])[0] = rslt.getShort(12);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[6], false);
               }
               stmt.setString(6, (String)parms[7], 3);
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setByte(8, ((Number) parms[9]).byteValue());
               stmt.setString(9, (String)parms[10], 1);
               stmt.setString(10, (String)parms[11], 8);
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

